package com.yw.test;

import java.lang.ref.WeakReference;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;

public class testjnamemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final boolean[] flag = { false };
	        Memory core = new Memory(10) {
	            protected void finalize() {
	                super.finalize();
	                flag[0] = true;
	                System.out.println("gc后 执行了finalize方法");
	            }
	        };
	        
	        System.out.println(core.hashCode());
	        Pointer shared = core.share(0, 5);
	        WeakReference ref = new WeakReference(core);
	        WeakReference sharedref = new WeakReference(shared);
	        
	        core = null;
	        System.gc();
	        
	        
	        long start = System.currentTimeMillis();
	        assert flag[0]==false :"Memory prematurely GC'd";
	        if(!flag[0]){
	        	System.out.println("还没有执行finalize方法");
	        }
	        
	        assert ref.get()!=null :"Base memory GC'd while shared memory extant";
	        if(ref.get()!=null){
	        	System.out.println("memory 没有被清理了");
	        }
	        // Avoid having IBM J9 prematurely nullify "shared"
	        shared.setInt(0, 0);

	        shared = null;
	        System.gc();
	        if(sharedref.get()==null){
	        	System.out.println("sharedref被清空");
	        }
	       int i=0;
	       try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	      
	        while (!flag[0]) {
	            i++;
	            System.out.println("循环内的时间 "+(System.currentTimeMillis() - start));
	            /*try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
	        }
	        
	        System.out.println(System.currentTimeMillis() - start);
	        /*if(flag[0]){
	        	System.out.println("执行了finalize方法");
	        }*/
	        
	        assert ref.get()==null :"Memory not GC'd";
	        if(ref.get()==null){
	        	System.out.println("memory 被清理了"+i);
	        }
	    
	}
	
	
       


}
