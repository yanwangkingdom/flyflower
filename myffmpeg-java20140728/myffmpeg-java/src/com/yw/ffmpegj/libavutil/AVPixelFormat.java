package com.yw.ffmpegj.libavutil;


import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
/**
 * JNA Wrapper for library <b>AVUtil</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */

	/**
	 * Pixel format.<br>
	 * * @note<br>
	 * AV_PIX_FMT_RGB32 is handled in an endian-specific manner. An RGBA<br>
	 * color is put together as:<br>
	 *  (A << 24) | (R << 16) | (G << 8) | B<br>
	 * This is stored as BGRA on little-endian CPU architectures and ARGB on<br>
	 * big-endian CPUs.<br>
	 * * @par<br>
	 * When the pixel format is palettized RGB (AV_PIX_FMT_PAL8), the palettized<br>
	 * image data is stored in AVFrame.data[0]. The palette is transported in<br>
	 * AVFrame.data[1], is 1024 bytes long (256 4-byte entries) and is<br>
	 * formatted the same as in AV_PIX_FMT_RGB32 described above (i.e., it is<br>
	 * also endian-specific). Note also that the individual RGB palette<br>
	 * components stored in AVFrame.data[1] should be in the range 0..255.<br>
	 * This is important as many custom PAL8 video codecs that were designed<br>
	 * to run on the IBM VGA graphics adapter use 6-bit palette components.<br>
	 * * @par<br>
	 * For all the 8bit per pixel formats, an RGB32 palette is in data[1] like<br>
	 * for pal8. This palette is filled in automatically by the function<br>
	 * allocating the picture.<br>
	 * * @note<br>
	 * Make sure that all newly added big-endian formats have (pix_fmt & 1) == 1<br>
	 * and that all newly added little-endian formats have (pix_fmt & 1) == 0.<br>
	 * This allows simpler detection of big vs little-endian.<br>
	 * <i>native declaration : line 65</i><br>
	 * enum values
	 */
	/**
	 * ????????????avutil????pixfmt.h
	 * @author wang
	 *
	 */
	public  interface AVPixelFormat {
		/** <i>native declaration : line 66</i> */
		public static final int AV_PIX_FMT_NONE = -1;
		/**
		 * < planar YUV 4:2:0, 12bpp, (1 Cr & Cb sample per 2x2 Y samples)<br>
		 * <i>native declaration : line 67</i>
		 */
		public static final int AV_PIX_FMT_YUV420P = 0;
		/**
		 * < packed YUV 4:2:2, 16bpp, Y0 Cb Y1 Cr<br>
		 * <i>native declaration : line 68</i>
		 */
		public static final int AV_PIX_FMT_YUYV422 = 1;
		/**
		 * < packed RGB 8:8:8, 24bpp, RGBRGB...<br>
		 * <i>native declaration : line 69</i>
		 */
		public static final int AV_PIX_FMT_RGB24 = 2;
		/**
		 * < packed RGB 8:8:8, 24bpp, BGRBGR...<br>
		 * <i>native declaration : line 70</i>
		 */
		public static final int AV_PIX_FMT_BGR24 = 3;
		/**
		 * < planar YUV 4:2:2, 16bpp, (1 Cr & Cb sample per 2x1 Y samples)<br>
		 * <i>native declaration : line 71</i>
		 */
		public static final int AV_PIX_FMT_YUV422P = 4;
		/**
		 * < planar YUV 4:4:4, 24bpp, (1 Cr & Cb sample per 1x1 Y samples)<br>
		 * <i>native declaration : line 72</i>
		 */
		public static final int AV_PIX_FMT_YUV444P = 5;
		/**
		 * < planar YUV 4:1:0,  9bpp, (1 Cr & Cb sample per 4x4 Y samples)<br>
		 * <i>native declaration : line 73</i>
		 */
		public static final int AV_PIX_FMT_YUV410P = 6;
		/**
		 * < planar YUV 4:1:1, 12bpp, (1 Cr & Cb sample per 4x1 Y samples)<br>
		 * <i>native declaration : line 74</i>
		 */
		public static final int AV_PIX_FMT_YUV411P = 7;
		/**
		 * <        Y        ,  8bpp<br>
		 * <i>native declaration : line 75</i>
		 */
		public static final int AV_PIX_FMT_GRAY8 = 8;
		/**
		 * <        Y        ,  1bpp, 0 is white, 1 is black, in each byte pixels are ordered from the msb to the lsb<br>
		 * <i>native declaration : line 76</i>
		 */
		public static final int AV_PIX_FMT_MONOWHITE = 9;
		/**
		 * <        Y        ,  1bpp, 0 is black, 1 is white, in each byte pixels are ordered from the msb to the lsb<br>
		 * <i>native declaration : line 77</i>
		 */
		public static final int AV_PIX_FMT_MONOBLACK = 10;
		/**
		 * < 8 bit with PIX_FMT_RGB32 palette<br>
		 * <i>native declaration : line 78</i>
		 */
		public static final int AV_PIX_FMT_PAL8 = 11;
		/**
		 * < planar YUV 4:2:0, 12bpp, full scale (JPEG), deprecated in favor of PIX_FMT_YUV420P and setting color_range<br>
		 * <i>native declaration : line 79</i>
		 */
		public static final int AV_PIX_FMT_YUVJ420P = 12;
		/**
		 * < planar YUV 4:2:2, 16bpp, full scale (JPEG), deprecated in favor of PIX_FMT_YUV422P and setting color_range<br>
		 * <i>native declaration : line 80</i>
		 */
		public static final int AV_PIX_FMT_YUVJ422P = 13;
		/**
		 * < planar YUV 4:4:4, 24bpp, full scale (JPEG), deprecated in favor of PIX_FMT_YUV444P and setting color_range<br>
		 * <i>native declaration : line 81</i>
		 */
		public static final int AV_PIX_FMT_YUVJ444P = 14;
		/**
		 * < packed YUV 4:2:2, 16bpp, Cb Y0 Cr Y1<br>
		 * <i>native declaration : line 87</i>
		 */
		public static final int AV_PIX_FMT_UYVY422 = 15;
		/**
		 * < packed YUV 4:1:1, 12bpp, Cb Y0 Y1 Cr Y2 Y3<br>
		 * <i>native declaration : line 88</i>
		 */
		public static final int AV_PIX_FMT_UYYVYY411 = 16;
		/**
		 * < packed RGB 3:3:2,  8bpp, (msb)2B 3G 3R(lsb)<br>
		 * <i>native declaration : line 89</i>
		 */
		public static final int AV_PIX_FMT_BGR8 = 17;
		/**
		 * < packed RGB 1:2:1 bitstream,  4bpp, (msb)1B 2G 1R(lsb), a byte contains two pixels, the first pixel in the byte is the one composed by the 4 msb bits<br>
		 * <i>native declaration : line 90</i>
		 */
		public static final int AV_PIX_FMT_BGR4 = 18;
		/**
		 * < packed RGB 1:2:1,  8bpp, (msb)1B 2G 1R(lsb)<br>
		 * <i>native declaration : line 91</i>
		 */
		public static final int AV_PIX_FMT_BGR4_BYTE = 19;
		/**
		 * < packed RGB 3:3:2,  8bpp, (msb)2R 3G 3B(lsb)<br>
		 * <i>native declaration : line 92</i>
		 */
		public static final int AV_PIX_FMT_RGB8 = 20;
		/**
		 * < packed RGB 1:2:1 bitstream,  4bpp, (msb)1R 2G 1B(lsb), a byte contains two pixels, the first pixel in the byte is the one composed by the 4 msb bits<br>
		 * <i>native declaration : line 93</i>
		 */
		public static final int AV_PIX_FMT_RGB4 = 21;
		/**
		 * < packed RGB 1:2:1,  8bpp, (msb)1R 2G 1B(lsb)<br>
		 * <i>native declaration : line 94</i>
		 */
		public static final int AV_PIX_FMT_RGB4_BYTE = 22;
		/**
		 * < planar YUV 4:2:0, 12bpp, 1 plane for Y and 1 plane for the UV components, which are interleaved (first byte U and the following byte V)<br>
		 * <i>native declaration : line 95</i>
		 */
		public static final int AV_PIX_FMT_NV12 = 23;
		/**
		 * < as above, but U and V bytes are swapped<br>
		 * <i>native declaration : line 96</i>
		 */
		public static final int AV_PIX_FMT_NV21 = 24;
		/**
		 * < packed ARGB 8:8:8:8, 32bpp, ARGBARGB...<br>
		 * <i>native declaration : line 98</i>
		 */
		public static final int AV_PIX_FMT_ARGB = 25;
		/**
		 * < packed RGBA 8:8:8:8, 32bpp, RGBARGBA...<br>
		 * <i>native declaration : line 99</i>
		 */
		public static final int AV_PIX_FMT_RGBA = 26;
		/**
		 * < packed ABGR 8:8:8:8, 32bpp, ABGRABGR...<br>
		 * <i>native declaration : line 100</i>
		 */
		public static final int AV_PIX_FMT_ABGR = 27;
		/**
		 * < packed BGRA 8:8:8:8, 32bpp, BGRABGRA...<br>
		 * <i>native declaration : line 101</i>
		 */
		public static final int AV_PIX_FMT_BGRA = 28;
		/**
		 * <        Y        , 16bpp, big-endian<br>
		 * <i>native declaration : line 103</i>
		 */
		public static final int AV_PIX_FMT_GRAY16BE = 29;
		/**
		 * <        Y        , 16bpp, little-endian<br>
		 * <i>native declaration : line 104</i>
		 */
		public static final int AV_PIX_FMT_GRAY16LE = 30;
		/**
		 * < planar YUV 4:4:0 (1 Cr & Cb sample per 1x2 Y samples)<br>
		 * <i>native declaration : line 105</i>
		 */
		public static final int AV_PIX_FMT_YUV440P = 31;
		/**
		 * < planar YUV 4:4:0 full scale (JPEG), deprecated in favor of PIX_FMT_YUV440P and setting color_range<br>
		 * <i>native declaration : line 106</i>
		 */
		public static final int AV_PIX_FMT_YUVJ440P = 32;
		/**
		 * < planar YUV 4:2:0, 20bpp, (1 Cr & Cb sample per 2x2 Y & A samples)<br>
		 * <i>native declaration : line 107</i>
		 */
		public static final int AV_PIX_FMT_YUVA420P = 33;
		/**
		 * < packed RGB 16:16:16, 48bpp, 16R, 16G, 16B, the 2-byte value for each R/G/B component is stored as big-endian<br>
		 * <i>native declaration : line 115</i>
		 */
		public static final int AV_PIX_FMT_RGB48BE = 34;
		/**
		 * < packed RGB 16:16:16, 48bpp, 16R, 16G, 16B, the 2-byte value for each R/G/B component is stored as little-endian<br>
		 * <i>native declaration : line 116</i>
		 */
		public static final int AV_PIX_FMT_RGB48LE = 35;
		/**
		 * < packed RGB 5:6:5, 16bpp, (msb)   5R 6G 5B(lsb), big-endian<br>
		 * <i>native declaration : line 118</i>
		 */
		public static final int AV_PIX_FMT_RGB565BE = 36;
		/**
		 * < packed RGB 5:6:5, 16bpp, (msb)   5R 6G 5B(lsb), little-endian<br>
		 * <i>native declaration : line 119</i>
		 */
		public static final int AV_PIX_FMT_RGB565LE = 37;
		/**
		 * < packed RGB 5:5:5, 16bpp, (msb)1A 5R 5G 5B(lsb), big-endian, most significant bit to 0<br>
		 * <i>native declaration : line 120</i>
		 */
		public static final int AV_PIX_FMT_RGB555BE = 38;
		/**
		 * < packed RGB 5:5:5, 16bpp, (msb)1A 5R 5G 5B(lsb), little-endian, most significant bit to 0<br>
		 * <i>native declaration : line 121</i>
		 */
		public static final int AV_PIX_FMT_RGB555LE = 39;
		/**
		 * < packed BGR 5:6:5, 16bpp, (msb)   5B 6G 5R(lsb), big-endian<br>
		 * <i>native declaration : line 123</i>
		 */
		public static final int AV_PIX_FMT_BGR565BE = 40;
		/**
		 * < packed BGR 5:6:5, 16bpp, (msb)   5B 6G 5R(lsb), little-endian<br>
		 * <i>native declaration : line 124</i>
		 */
		public static final int AV_PIX_FMT_BGR565LE = 41;
		/**
		 * < packed BGR 5:5:5, 16bpp, (msb)1A 5B 5G 5R(lsb), big-endian, most significant bit to 1<br>
		 * <i>native declaration : line 125</i>
		 */
		public static final int AV_PIX_FMT_BGR555BE = 42;
		/**
		 * < packed BGR 5:5:5, 16bpp, (msb)1A 5B 5G 5R(lsb), little-endian, most significant bit to 1<br>
		 * <i>native declaration : line 126</i>
		 */
		public static final int AV_PIX_FMT_BGR555LE = 43;
		/**
		 * < HW acceleration through VA API at motion compensation entry-point, Picture.data[3] contains a vaapi_render_state struct which contains macroblocks as well as various fields extracted from headers<br>
		 * <i>native declaration : line 128</i>
		 */
		public static final int AV_PIX_FMT_VAAPI_MOCO = 44;
		/**
		 * < HW acceleration through VA API at IDCT entry-point, Picture.data[3] contains a vaapi_render_state struct which contains fields extracted from headers<br>
		 * <i>native declaration : line 129</i>
		 */
		public static final int AV_PIX_FMT_VAAPI_IDCT = 45;
		/**
		 * < HW decoding through VA API, Picture.data[3] contains a vaapi_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers<br>
		 * <i>native declaration : line 130</i>
		 */
		public static final int AV_PIX_FMT_VAAPI_VLD = 46;
		/**
		 * < planar YUV 4:2:0, 24bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian<br>
		 * <i>native declaration : line 132</i>
		 */
		public static final int AV_PIX_FMT_YUV420P16LE = 47;
		/**
		 * < planar YUV 4:2:0, 24bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian<br>
		 * <i>native declaration : line 133</i>
		 */
		public static final int AV_PIX_FMT_YUV420P16BE = 48;
		/**
		 * < planar YUV 4:2:2, 32bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian<br>
		 * <i>native declaration : line 134</i>
		 */
		public static final int AV_PIX_FMT_YUV422P16LE = 49;
		/**
		 * < planar YUV 4:2:2, 32bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian<br>
		 * <i>native declaration : line 135</i>
		 */
		public static final int AV_PIX_FMT_YUV422P16BE = 50;
		/**
		 * < planar YUV 4:4:4, 48bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian<br>
		 * <i>native declaration : line 136</i>
		 */
		public static final int AV_PIX_FMT_YUV444P16LE = 51;
		/**
		 * < planar YUV 4:4:4, 48bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian<br>
		 * <i>native declaration : line 137</i>
		 */
		public static final int AV_PIX_FMT_YUV444P16BE = 52;
		/**
		 * < HW decoding through DXVA2, Picture.data[3] contains a LPDIRECT3DSURFACE9 pointer<br>
		 * <i>native declaration : line 141</i>
		 */
		public static final int AV_PIX_FMT_DXVA2_VLD = 53;
		/**
		 * < packed RGB 4:4:4, 16bpp, (msb)4A 4R 4G 4B(lsb), little-endian, most significant bits to 0<br>
		 * <i>native declaration : line 143</i>
		 */
		public static final int AV_PIX_FMT_RGB444LE = 54;
		/**
		 * < packed RGB 4:4:4, 16bpp, (msb)4A 4R 4G 4B(lsb), big-endian, most significant bits to 0<br>
		 * <i>native declaration : line 144</i>
		 */
		public static final int AV_PIX_FMT_RGB444BE = 55;
		/**
		 * < packed BGR 4:4:4, 16bpp, (msb)4A 4B 4G 4R(lsb), little-endian, most significant bits to 1<br>
		 * <i>native declaration : line 145</i>
		 */
		public static final int AV_PIX_FMT_BGR444LE = 56;
		/**
		 * < packed BGR 4:4:4, 16bpp, (msb)4A 4B 4G 4R(lsb), big-endian, most significant bits to 1<br>
		 * <i>native declaration : line 146</i>
		 */
		public static final int AV_PIX_FMT_BGR444BE = 57;
		/**
		 * < 8bit gray, 8bit alpha<br>
		 * <i>native declaration : line 147</i>
		 */
		public static final int AV_PIX_FMT_GRAY8A = 58;
		/**
		 * < packed RGB 16:16:16, 48bpp, 16B, 16G, 16R, the 2-byte value for each R/G/B component is stored as big-endian<br>
		 * <i>native declaration : line 148</i>
		 */
		public static final int AV_PIX_FMT_BGR48BE = 59;
		/**
		 * < packed RGB 16:16:16, 48bpp, 16B, 16G, 16R, the 2-byte value for each R/G/B component is stored as little-endian<br>
		 * <i>native declaration : line 149</i>
		 */
		public static final int AV_PIX_FMT_BGR48LE = 60;
		/**
		 * The following 12 formats have the disadvantage of needing 1 format for each bit depth.<br>
		 * Notice that each 9/10 bits sample is stored in 16 bits with extra padding.<br>
		 * If you want to support multiple bit depths, then using AV_PIX_FMT_YUV420P16* with the bpp stored separately is better.<br>
		 * < planar YUV 4:2:0, 13.5bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian<br>
		 * <i>native declaration : line 156</i>
		 */
		public static final int AV_PIX_FMT_YUV420P9BE = 61;
		/**
		 * < planar YUV 4:2:0, 13.5bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian<br>
		 * <i>native declaration : line 157</i>
		 */
		public static final int AV_PIX_FMT_YUV420P9LE = 62;
		/**
		 * < planar YUV 4:2:0, 15bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian<br>
		 * <i>native declaration : line 158</i>
		 */
		public static final int AV_PIX_FMT_YUV420P10BE = 63;
		/**
		 * < planar YUV 4:2:0, 15bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian<br>
		 * <i>native declaration : line 159</i>
		 */
		public static final int AV_PIX_FMT_YUV420P10LE = 64;
		/**
		 * < planar YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian<br>
		 * <i>native declaration : line 160</i>
		 */
		public static final int AV_PIX_FMT_YUV422P10BE = 65;
		/**
		 * < planar YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian<br>
		 * <i>native declaration : line 161</i>
		 */
		public static final int AV_PIX_FMT_YUV422P10LE = 66;
		/**
		 * < planar YUV 4:4:4, 27bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian<br>
		 * <i>native declaration : line 162</i>
		 */
		public static final int AV_PIX_FMT_YUV444P9BE = 67;
		/**
		 * < planar YUV 4:4:4, 27bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian<br>
		 * <i>native declaration : line 163</i>
		 */
		public static final int AV_PIX_FMT_YUV444P9LE = 68;
		/**
		 * < planar YUV 4:4:4, 30bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian<br>
		 * <i>native declaration : line 164</i>
		 */
		public static final int AV_PIX_FMT_YUV444P10BE = 69;
		/**
		 * < planar YUV 4:4:4, 30bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian<br>
		 * <i>native declaration : line 165</i>
		 */
		public static final int AV_PIX_FMT_YUV444P10LE = 70;
		/**
		 * < planar YUV 4:2:2, 18bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian<br>
		 * <i>native declaration : line 166</i>
		 */
		public static final int AV_PIX_FMT_YUV422P9BE = 71;
		/**
		 * < planar YUV 4:2:2, 18bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian<br>
		 * <i>native declaration : line 167</i>
		 */
		public static final int AV_PIX_FMT_YUV422P9LE = 72;
		/**
		 * < hardware decoding through VDA<br>
		 * <i>native declaration : line 168</i>
		 */
		public static final int AV_PIX_FMT_VDA_VLD = 73;
		/**
		 * < planar GBR 4:4:4 24bpp<br>
		 * <i>native declaration : line 176</i>
		 */
		public static final int AV_PIX_FMT_GBRP = 74;
		/**
		 * < planar GBR 4:4:4 27bpp, big-endian<br>
		 * <i>native declaration : line 177</i>
		 */
		public static final int AV_PIX_FMT_GBRP9BE = 75;
		/**
		 * < planar GBR 4:4:4 27bpp, little-endian<br>
		 * <i>native declaration : line 178</i>
		 */
		public static final int AV_PIX_FMT_GBRP9LE = 76;
		/**
		 * < planar GBR 4:4:4 30bpp, big-endian<br>
		 * <i>native declaration : line 179</i>
		 */
		public static final int AV_PIX_FMT_GBRP10BE = 77;
		/**
		 * < planar GBR 4:4:4 30bpp, little-endian<br>
		 * <i>native declaration : line 180</i>
		 */
		public static final int AV_PIX_FMT_GBRP10LE = 78;
		/**
		 * < planar GBR 4:4:4 48bpp, big-endian<br>
		 * <i>native declaration : line 181</i>
		 */
		public static final int AV_PIX_FMT_GBRP16BE = 79;
		/**
		 * < planar GBR 4:4:4 48bpp, little-endian<br>
		 * <i>native declaration : line 182</i>
		 */
		public static final int AV_PIX_FMT_GBRP16LE = 80;
		/**
		 * duplicated pixel formats for compatibility with libav.<br>
		 * FFmpeg supports these formats since May 8 2012 and Jan 28 2012 (commits f9ca1ac7 and 143a5c55)<br>
		 * Libav added them Oct 12 2012 with incompatible values (commit 6d5600e85)<br>
		 * < planar YUV 4:2:2 24bpp, (1 Cr & Cb sample per 2x1 Y & A samples)<br>
		 * <i>native declaration : line 189</i>
		 */
		public static final int AV_PIX_FMT_YUVA422P_LIBAV = 81;
		/**
		 * < planar YUV 4:4:4 32bpp, (1 Cr & Cb sample per 1x1 Y & A samples)<br>
		 * <i>native declaration : line 190</i>
		 */
		public static final int AV_PIX_FMT_YUVA444P_LIBAV = 82;
		/**
		 * < planar YUV 4:2:0 22.5bpp, (1 Cr & Cb sample per 2x2 Y & A samples), big-endian<br>
		 * <i>native declaration : line 192</i>
		 */
		public static final int AV_PIX_FMT_YUVA420P9BE = 83;
		/**
		 * < planar YUV 4:2:0 22.5bpp, (1 Cr & Cb sample per 2x2 Y & A samples), little-endian<br>
		 * <i>native declaration : line 193</i>
		 */
		public static final int AV_PIX_FMT_YUVA420P9LE = 84;
		/**
		 * < planar YUV 4:2:2 27bpp, (1 Cr & Cb sample per 2x1 Y & A samples), big-endian<br>
		 * <i>native declaration : line 194</i>
		 */
		public static final int AV_PIX_FMT_YUVA422P9BE = 85;
		/**
		 * < planar YUV 4:2:2 27bpp, (1 Cr & Cb sample per 2x1 Y & A samples), little-endian<br>
		 * <i>native declaration : line 195</i>
		 */
		public static final int AV_PIX_FMT_YUVA422P9LE = 86;
		/**
		 * < planar YUV 4:4:4 36bpp, (1 Cr & Cb sample per 1x1 Y & A samples), big-endian<br>
		 * <i>native declaration : line 196</i>
		 */
		public static final int AV_PIX_FMT_YUVA444P9BE = 87;
		/**
		 * < planar YUV 4:4:4 36bpp, (1 Cr & Cb sample per 1x1 Y & A samples), little-endian<br>
		 * <i>native declaration : line 197</i>
		 */
		public static final int AV_PIX_FMT_YUVA444P9LE = 88;
		/**
		 * < planar YUV 4:2:0 25bpp, (1 Cr & Cb sample per 2x2 Y & A samples, big-endian)<br>
		 * <i>native declaration : line 198</i>
		 */
		public static final int AV_PIX_FMT_YUVA420P10BE = 89;
		/**
		 * < planar YUV 4:2:0 25bpp, (1 Cr & Cb sample per 2x2 Y & A samples, little-endian)<br>
		 * <i>native declaration : line 199</i>
		 */
		public static final int AV_PIX_FMT_YUVA420P10LE = 90;
		/**
		 * < planar YUV 4:2:2 30bpp, (1 Cr & Cb sample per 2x1 Y & A samples, big-endian)<br>
		 * <i>native declaration : line 200</i>
		 */
		public static final int AV_PIX_FMT_YUVA422P10BE = 91;
		/**
		 * < planar YUV 4:2:2 30bpp, (1 Cr & Cb sample per 2x1 Y & A samples, little-endian)<br>
		 * <i>native declaration : line 201</i>
		 */
		public static final int AV_PIX_FMT_YUVA422P10LE = 92;
		/**
		 * < planar YUV 4:4:4 40bpp, (1 Cr & Cb sample per 1x1 Y & A samples, big-endian)<br>
		 * <i>native declaration : line 202</i>
		 */
		public static final int AV_PIX_FMT_YUVA444P10BE = 93;
		/**
		 * < planar YUV 4:4:4 40bpp, (1 Cr & Cb sample per 1x1 Y & A samples, little-endian)<br>
		 * <i>native declaration : line 203</i>
		 */
		public static final int AV_PIX_FMT_YUVA444P10LE = 94;
		/**
		 * < planar YUV 4:2:0 40bpp, (1 Cr & Cb sample per 2x2 Y & A samples, big-endian)<br>
		 * <i>native declaration : line 204</i>
		 */
		public static final int AV_PIX_FMT_YUVA420P16BE = 95;
		/**
		 * < planar YUV 4:2:0 40bpp, (1 Cr & Cb sample per 2x2 Y & A samples, little-endian)<br>
		 * <i>native declaration : line 205</i>
		 */
		public static final int AV_PIX_FMT_YUVA420P16LE = 96;
		/**
		 * < planar YUV 4:2:2 48bpp, (1 Cr & Cb sample per 2x1 Y & A samples, big-endian)<br>
		 * <i>native declaration : line 206</i>
		 */
		public static final int AV_PIX_FMT_YUVA422P16BE = 97;
		/**
		 * < planar YUV 4:2:2 48bpp, (1 Cr & Cb sample per 2x1 Y & A samples, little-endian)<br>
		 * <i>native declaration : line 207</i>
		 */
		public static final int AV_PIX_FMT_YUVA422P16LE = 98;
		/**
		 * < planar YUV 4:4:4 64bpp, (1 Cr & Cb sample per 1x1 Y & A samples, big-endian)<br>
		 * <i>native declaration : line 208</i>
		 */
		public static final int AV_PIX_FMT_YUVA444P16BE = 99;
		/**
		 * < planar YUV 4:4:4 64bpp, (1 Cr & Cb sample per 1x1 Y & A samples, little-endian)<br>
		 * <i>native declaration : line 209</i>
		 */
		public static final int AV_PIX_FMT_YUVA444P16LE = 100;
		/**
		 * < HW acceleration through VDPAU, Picture.data[3] contains a VdpVideoSurface<br>
		 * <i>native declaration : line 211</i>
		 */
		public static final int AV_PIX_FMT_VDPAU = 101;
		/**
		 * < packed XYZ 4:4:4, 36 bpp, (msb) 12X, 12Y, 12Z (lsb), the 2-byte value for each X/Y/Z is stored as little-endian, the 4 lower bits are set to 0<br>
		 * <i>native declaration : line 213</i>
		 */
		public static final int AV_PIX_FMT_XYZ12LE = 102;
		/**
		 * < packed XYZ 4:4:4, 36 bpp, (msb) 12X, 12Y, 12Z (lsb), the 2-byte value for each X/Y/Z is stored as big-endian, the 4 lower bits are set to 0<br>
		 * <i>native declaration : line 214</i>
		 */
		public static final int AV_PIX_FMT_XYZ12BE = 103;
		/**
		 * < interleaved chroma YUV 4:2:2, 16bpp, (1 Cr & Cb sample per 2x1 Y samples)<br>
		 * <i>native declaration : line 215</i>
		 */
		public static final int AV_PIX_FMT_NV16 = 104;
		/**
		 * < interleaved chroma YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian<br>
		 * <i>native declaration : line 216</i>
		 */
		public static final int AV_PIX_FMT_NV20LE = 105;
		/**
		 * < interleaved chroma YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian<br>
		 * <i>native declaration : line 217</i>
		 */
		public static final int AV_PIX_FMT_NV20BE = 106;
		/**
		 * < packed RGBA 16:16:16:16, 64bpp, 16R, 16G, 16B, 16A, the 2-byte value for each R/G/B/A component is stored as big-endian<br>
		 * <i>native declaration : line 220</i>
		 */
		public static final int AV_PIX_FMT_RGBA64BE = 0x123;
		/**
		 * < packed RGBA 16:16:16:16, 64bpp, 16R, 16G, 16B, 16A, the 2-byte value for each R/G/B/A component is stored as little-endian<br>
		 * <i>native declaration : line 221</i>
		 */
		public static final int AV_PIX_FMT_RGBA64LE = (0x123 + 1);
		/**
		 * < packed RGBA 16:16:16:16, 64bpp, 16B, 16G, 16R, 16A, the 2-byte value for each R/G/B/A component is stored as big-endian<br>
		 * <i>native declaration : line 222</i>
		 */
		public static final int AV_PIX_FMT_BGRA64BE = (0x123 + 2);
		/**
		 * < packed RGBA 16:16:16:16, 64bpp, 16B, 16G, 16R, 16A, the 2-byte value for each R/G/B/A component is stored as little-endian<br>
		 * <i>native declaration : line 223</i>
		 */
		public static final int AV_PIX_FMT_BGRA64LE = (0x123 + 3);
		/**
		 * < packed RGB 8:8:8, 32bpp, 0RGB0RGB...<br>
		 * <i>native declaration : line 225</i>
		 */
		public static final int AV_PIX_FMT_0RGB = 0x123 + 4;
		/**
		 * < packed RGB 8:8:8, 32bpp, RGB0RGB0...<br>
		 * <i>native declaration : line 226</i>
		 */
		public static final int AV_PIX_FMT_RGB0 = (0x123 + 4 + 1);
		/**
		 * < packed BGR 8:8:8, 32bpp, 0BGR0BGR...<br>
		 * <i>native declaration : line 227</i>
		 */
		public static final int AV_PIX_FMT_0BGR = (0x123 + 4 + 2);
		/**
		 * < packed BGR 8:8:8, 32bpp, BGR0BGR0...<br>
		 * <i>native declaration : line 228</i>
		 */
		public static final int AV_PIX_FMT_BGR0 = (0x123 + 4 + 3);
		/**
		 * < planar YUV 4:4:4 32bpp, (1 Cr & Cb sample per 1x1 Y & A samples)<br>
		 * <i>native declaration : line 229</i>
		 */
		public static final int AV_PIX_FMT_YUVA444P = (0x123 + 4 + 4);
		/**
		 * < planar YUV 4:2:2 24bpp, (1 Cr & Cb sample per 2x1 Y & A samples)<br>
		 * <i>native declaration : line 230</i>
		 */
		public static final int AV_PIX_FMT_YUVA422P = (0x123 + 4 + 5);
		/**
		 * < planar YUV 4:2:0,18bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian<br>
		 * <i>native declaration : line 232</i>
		 */
		public static final int AV_PIX_FMT_YUV420P12BE = (0x123 + 4 + 6);
		/**
		 * < planar YUV 4:2:0,18bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian<br>
		 * <i>native declaration : line 233</i>
		 */
		public static final int AV_PIX_FMT_YUV420P12LE = (0x123 + 4 + 7);
		/**
		 * < planar YUV 4:2:0,21bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian<br>
		 * <i>native declaration : line 234</i>
		 */
		public static final int AV_PIX_FMT_YUV420P14BE = (0x123 + 4 + 8);
		/**
		 * < planar YUV 4:2:0,21bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian<br>
		 * <i>native declaration : line 235</i>
		 */
		public static final int AV_PIX_FMT_YUV420P14LE = (0x123 + 4 + 9);
		/**
		 * < planar YUV 4:2:2,24bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian<br>
		 * <i>native declaration : line 236</i>
		 */
		public static final int AV_PIX_FMT_YUV422P12BE = (0x123 + 4 + 10);
		/**
		 * < planar YUV 4:2:2,24bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian<br>
		 * <i>native declaration : line 237</i>
		 */
		public static final int AV_PIX_FMT_YUV422P12LE = (0x123 + 4 + 11);
		/**
		 * < planar YUV 4:2:2,28bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian<br>
		 * <i>native declaration : line 238</i>
		 */
		public static final int AV_PIX_FMT_YUV422P14BE = (0x123 + 4 + 12);
		/**
		 * < planar YUV 4:2:2,28bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian<br>
		 * <i>native declaration : line 239</i>
		 */
		public static final int AV_PIX_FMT_YUV422P14LE = (0x123 + 4 + 13);
		/**
		 * < planar YUV 4:4:4,36bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian<br>
		 * <i>native declaration : line 240</i>
		 */
		public static final int AV_PIX_FMT_YUV444P12BE = (0x123 + 4 + 14);
		/**
		 * < planar YUV 4:4:4,36bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian<br>
		 * <i>native declaration : line 241</i>
		 */
		public static final int AV_PIX_FMT_YUV444P12LE = (0x123 + 4 + 15);
		/**
		 * < planar YUV 4:4:4,42bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian<br>
		 * <i>native declaration : line 242</i>
		 */
		public static final int AV_PIX_FMT_YUV444P14BE = (0x123 + 4 + 16);
		/**
		 * < planar YUV 4:4:4,42bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian<br>
		 * <i>native declaration : line 243</i>
		 */
		public static final int AV_PIX_FMT_YUV444P14LE = (0x123 + 4 + 17);
		/**
		 * < planar GBR 4:4:4 36bpp, big-endian<br>
		 * <i>native declaration : line 244</i>
		 */
		public static final int AV_PIX_FMT_GBRP12BE = (0x123 + 4 + 18);
		/**
		 * < planar GBR 4:4:4 36bpp, little-endian<br>
		 * <i>native declaration : line 245</i>
		 */
		public static final int AV_PIX_FMT_GBRP12LE = (0x123 + 4 + 19);
		/**
		 * < planar GBR 4:4:4 42bpp, big-endian<br>
		 * <i>native declaration : line 246</i>
		 */
		public static final int AV_PIX_FMT_GBRP14BE = (0x123 + 4 + 20);
		/**
		 * < planar GBR 4:4:4 42bpp, little-endian<br>
		 * <i>native declaration : line 247</i>
		 */
		public static final int AV_PIX_FMT_GBRP14LE = (0x123 + 4 + 21);
		/**
		 * < planar GBRA 4:4:4:4 32bpp<br>
		 * <i>native declaration : line 248</i>
		 */
		public static final int AV_PIX_FMT_GBRAP = (0x123 + 4 + 22);
		/**
		 * < planar GBRA 4:4:4:4 64bpp, big-endian<br>
		 * <i>native declaration : line 249</i>
		 */
		public static final int AV_PIX_FMT_GBRAP16BE = (0x123 + 4 + 23);
		/**
		 * < planar GBRA 4:4:4:4 64bpp, little-endian<br>
		 * <i>native declaration : line 250</i>
		 */
		public static final int AV_PIX_FMT_GBRAP16LE = (0x123 + 4 + 24);
		/**
		 * < planar YUV 4:1:1, 12bpp, (1 Cr & Cb sample per 4x1 Y samples) full scale (JPEG), deprecated in favor of PIX_FMT_YUV411P and setting color_range<br>
		 * <i>native declaration : line 251</i>
		 */
		public static final int AV_PIX_FMT_YUVJ411P = (0x123 + 4 + 25);
		/**
		 * < bayer, BGBG..(odd line), GRGR..(even line), 8-bit samples * /<br>
		 * <i>native declaration : line 253</i>
		 */
		public static final int AV_PIX_FMT_BAYER_BGGR8 = (0x123 + 4 + 26);
		/**
		 * < bayer, RGRG..(odd line), GBGB..(even line), 8-bit samples * /<br>
		 * <i>native declaration : line 254</i>
		 */
		public static final int AV_PIX_FMT_BAYER_RGGB8 = (0x123 + 4 + 27);
		/**
		 * < bayer, GBGB..(odd line), RGRG..(even line), 8-bit samples * /<br>
		 * <i>native declaration : line 255</i>
		 */
		public static final int AV_PIX_FMT_BAYER_GBRG8 = (0x123 + 4 + 28);
		/**
		 * < bayer, GRGR..(odd line), BGBG..(even line), 8-bit samples * /<br>
		 * <i>native declaration : line 256</i>
		 */
		public static final int AV_PIX_FMT_BAYER_GRBG8 = (0x123 + 4 + 29);
		/**
		 * < bayer, BGBG..(odd line), GRGR..(even line), 16-bit samples, little-endian * /<br>
		 * <i>native declaration : line 257</i>
		 */
		public static final int AV_PIX_FMT_BAYER_BGGR16LE = (0x123 + 4 + 30);
		/**
		 * < bayer, BGBG..(odd line), GRGR..(even line), 16-bit samples, big-endian * /<br>
		 * <i>native declaration : line 258</i>
		 */
		public static final int AV_PIX_FMT_BAYER_BGGR16BE = (0x123 + 4 + 31);
		/**
		 * < bayer, RGRG..(odd line), GBGB..(even line), 16-bit samples, little-endian * /<br>
		 * <i>native declaration : line 259</i>
		 */
		public static final int AV_PIX_FMT_BAYER_RGGB16LE = (0x123 + 4 + 32);
		/**
		 * < bayer, RGRG..(odd line), GBGB..(even line), 16-bit samples, big-endian * /<br>
		 * <i>native declaration : line 260</i>
		 */
		public static final int AV_PIX_FMT_BAYER_RGGB16BE = (0x123 + 4 + 33);
		/**
		 * < bayer, GBGB..(odd line), RGRG..(even line), 16-bit samples, little-endian * /<br>
		 * <i>native declaration : line 261</i>
		 */
		public static final int AV_PIX_FMT_BAYER_GBRG16LE = (0x123 + 4 + 34);
		/**
		 * < bayer, GBGB..(odd line), RGRG..(even line), 16-bit samples, big-endian * /<br>
		 * <i>native declaration : line 262</i>
		 */
		public static final int AV_PIX_FMT_BAYER_GBRG16BE = (0x123 + 4 + 35);
		/**
		 * < bayer, GRGR..(odd line), BGBG..(even line), 16-bit samples, little-endian * /<br>
		 * <i>native declaration : line 263</i>
		 */
		public static final int AV_PIX_FMT_BAYER_GRBG16LE = (0x123 + 4 + 36);
		/**
		 * < bayer, GRGR..(odd line), BGBG..(even line), 16-bit samples, big-endian * /<br>
		 * <i>native declaration : line 264</i>
		 */
		public static final int AV_PIX_FMT_BAYER_GRBG16BE = (0x123 + 4 + 37);
		/**
		 * < XVideo Motion Acceleration via common packet passing<br>
		 * <i>native declaration : line 266</i>
		 */
		public static final int AV_PIX_FMT_XVMC = (0x123 + 4 + 38);
		/**
		 * < number of pixel formats, DO NOT USE THIS if you want to link with shared libav* because the number of formats might differ between versions<br>
		 * <i>native declaration : line 269</i>
		 */
		public static final int AV_PIX_FMT_NB = (0x123 + 4 + 39);
		public static final int AVPALETTE_SIZE = 1024;
		public static final int AVPALETTE_COUNT = 256;
	};
	
	

