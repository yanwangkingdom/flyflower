package com.yw.ffmpegj;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jme3.util.BufferUtils;

public final class Buffertool {
	 private static final AtomicBoolean loadedMethods = new AtomicBoolean(false);
	 private static Method cleanerMethod = null;
	 private static Method cleanMethod = null;
	
	 private static Method freeMethod = null;
	 private static Method viewedBufferMethod=null;
	 
	 private static class BufferInfo extends PhantomReference<Buffer> {

	        private Class type;
	        private int size;

	        public BufferInfo(Class type, int size, Buffer referent, ReferenceQueue<? super Buffer> q) {
	            super(referent, q);
	            this.type = type;
	            this.size = size;
	        }
	    }
	 private static boolean isDirect(Buffer buf) {
	        if (buf instanceof FloatBuffer) {
	            return ((FloatBuffer) buf).isDirect();
	        }
	        if (buf instanceof IntBuffer) {
	            return ((IntBuffer) buf).isDirect();
	        }
	        if (buf instanceof ShortBuffer) {
	            return ((ShortBuffer) buf).isDirect();
	        }
	        if (buf instanceof ByteBuffer) {
	            return ((ByteBuffer) buf).isDirect();
	        }
	        if (buf instanceof DoubleBuffer) {
	            return ((DoubleBuffer) buf).isDirect();
	        }
	        if (buf instanceof LongBuffer) {
	            return ((LongBuffer) buf).isDirect();
	        }
	        throw new UnsupportedOperationException(" BufferUtils.isDirect was called on " + buf.getClass().getName());
	    }
	 
	 public static ByteBuffer createByteBuffer(int size) {
	        ByteBuffer buf = ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder());
	        buf.clear();
	        onBufferAllocated(buf);
	        return buf;
	    }
	
	private static Method loadMethod(String className, String methodName) {
        try {
            Method method = Class.forName(className).getMethod(methodName);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException ex) {
            return null; // the method was not found
        } catch (SecurityException ex) {
            return null; // setAccessible not allowed by security policy
        } catch (ClassNotFoundException ex) {
            return null; // the direct buffer implementation was not found
        }
    }
	
	private static void loadCleanerMethods() {
        // If its already true, exit, if not, set it to true.
        if (loadedMethods.getAndSet(true)) {
            return;
        }
        // This could potentially be called many times if used from multiple
        // threads
        synchronized (loadedMethods) {
            // Oracle JRE / OpenJDK
            cleanerMethod = loadMethod("sun.nio.ch.DirectBuffer", "cleaner");
            cleanMethod = loadMethod("sun.misc.Cleaner", "clean");
            viewedBufferMethod = loadMethod("sun.nio.ch.DirectBuffer", "viewedBuffer");
            if (viewedBufferMethod == null) {
                // They changed the name in Java 7 (???)
                viewedBufferMethod = loadMethod("sun.nio.ch.DirectBuffer", "attachment");
            }

            ByteBuffer bb = BufferUtils.createByteBuffer(1);
            Class<?> clazz = bb.getClass();
            try {
                freeMethod = clazz.getMethod("free");
            } catch (NoSuchMethodException ex) {
            } catch (SecurityException ex) {
            }
        }
    }
	
	
	public static void destroyDirectBuffer(Buffer toBeDestroyed) {
        if (!isDirect(toBeDestroyed)) {
            return;
        }

        loadCleanerMethods();

        try {
            if (freeMethod != null) {
                freeMethod.invoke(toBeDestroyed);
            } else {
                Object cleaner = cleanerMethod.invoke(toBeDestroyed);
                if (cleaner != null) {
                    cleanMethod.invoke(cleaner);
                } else {
                    // Try the alternate approach of getting the viewed buffer first
                    Object viewedBuffer = viewedBufferMethod.invoke(toBeDestroyed);
                    if (viewedBuffer != null) {
                        destroyDirectBuffer((Buffer) viewedBuffer);
                    } else {
                        Logger.getLogger(BufferUtils.class.getName()).log(Level.SEVERE, "Buffer cannot be destroyed: {0}", toBeDestroyed);
                    }
                }
            }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BufferUtils.class.getName()).log(Level.SEVERE, "{0}", ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(BufferUtils.class.getName()).log(Level.SEVERE, "{0}", ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(BufferUtils.class.getName()).log(Level.SEVERE, "{0}", ex);
        } catch (SecurityException ex) {
            Logger.getLogger(BufferUtils.class.getName()).log(Level.SEVERE, "{0}", ex);
        }
    }
    


}
