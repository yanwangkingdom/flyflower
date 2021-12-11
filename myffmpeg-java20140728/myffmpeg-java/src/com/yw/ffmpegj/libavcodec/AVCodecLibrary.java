// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst 
// Source File Name:   AVCodecLibrary.java

package com.yw.ffmpegj.libavcodec;


import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import com.yw.ffmpegj.libavutil.*;

// Referenced classes of package avcodec:
//            AVCodecContext, AVCodecDescriptor, AVCodec, AVSubtitle, 
//            AVPacket, AVCodecParser, AVCodecParserContext, AVPicture, 
//            AVBitStreamFilter, AVBitStreamFilterContext, AVHWAccel

public interface AVCodecLibrary
    extends Library
{
    public static interface AVAudioServiceType
    {

        public static final int AV_AUDIO_SERVICE_TYPE_MAIN = 0;
        public static final int AV_AUDIO_SERVICE_TYPE_EFFECTS = 1;
        public static final int AV_AUDIO_SERVICE_TYPE_VISUALLY_IMPAIRED = 2;
        public static final int AV_AUDIO_SERVICE_TYPE_HEARING_IMPAIRED = 3;
        public static final int AV_AUDIO_SERVICE_TYPE_DIALOGUE = 4;
        public static final int AV_AUDIO_SERVICE_TYPE_COMMENTARY = 5;
        public static final int AV_AUDIO_SERVICE_TYPE_EMERGENCY = 6;
        public static final int AV_AUDIO_SERVICE_TYPE_VOICE_OVER = 7;
        public static final int AV_AUDIO_SERVICE_TYPE_KARAOKE = 8;
        public static final int AV_AUDIO_SERVICE_TYPE_NB = 9;
    }

    public static class AVBufferRef extends PointerType
    {

        public AVBufferRef(Pointer pointer)
        {
            super(pointer);
        }

        public AVBufferRef()
        {
        }
    }

    public static interface AVChromaLocation
    {

        public static final int AVCHROMA_LOC_UNSPECIFIED = 0;
        public static final int AVCHROMA_LOC_LEFT = 1;
        public static final int AVCHROMA_LOC_CENTER = 2;
        public static final int AVCHROMA_LOC_TOPLEFT = 3;
        public static final int AVCHROMA_LOC_TOP = 4;
        public static final int AVCHROMA_LOC_BOTTOMLEFT = 5;
        public static final int AVCHROMA_LOC_BOTTOM = 6;
        public static final int AVCHROMA_LOC_NB = 7;
    }

    public static class AVClass extends PointerType
    {

        public AVClass(Pointer pointer)
        {
            super(pointer);
        }

        public AVClass()
        {
        }
    }

    public static class AVCodecDefault extends PointerType
    {

        public AVCodecDefault(Pointer pointer)
        {
            super(pointer);
        }

        public AVCodecDefault()
        {
        }
    }

    public static interface AVCodecID
    {

        public static final int AV_CODEC_ID_NONE = 0;
        public static final int AV_CODEC_ID_MPEG1VIDEO = 1;
        public static final int AV_CODEC_ID_MPEG2VIDEO = 2;
        public static final int AV_CODEC_ID_H261 = 3;
        public static final int AV_CODEC_ID_H263 = 4;
        public static final int AV_CODEC_ID_RV10 = 5;
        public static final int AV_CODEC_ID_RV20 = 6;
        public static final int AV_CODEC_ID_MJPEG = 7;
        public static final int AV_CODEC_ID_MJPEGB = 8;
        public static final int AV_CODEC_ID_LJPEG = 9;
        public static final int AV_CODEC_ID_SP5X = 10;
        public static final int AV_CODEC_ID_JPEGLS = 11;
        public static final int AV_CODEC_ID_MPEG4 = 12;
        public static final int AV_CODEC_ID_RAWVIDEO = 13;
        public static final int AV_CODEC_ID_MSMPEG4V1 = 14;
        public static final int AV_CODEC_ID_MSMPEG4V2 = 15;
        public static final int AV_CODEC_ID_MSMPEG4V3 = 16;
        public static final int AV_CODEC_ID_WMV1 = 17;
        public static final int AV_CODEC_ID_WMV2 = 18;
        public static final int AV_CODEC_ID_H263P = 19;
        public static final int AV_CODEC_ID_H263I = 20;
        public static final int AV_CODEC_ID_FLV1 = 21;
        public static final int AV_CODEC_ID_SVQ1 = 22;
        public static final int AV_CODEC_ID_SVQ3 = 23;
        public static final int AV_CODEC_ID_DVVIDEO = 24;
        public static final int AV_CODEC_ID_HUFFYUV = 25;
        public static final int AV_CODEC_ID_CYUV = 26;
        public static final int AV_CODEC_ID_H264 = 27;
        public static final int AV_CODEC_ID_INDEO3 = 28;
        public static final int AV_CODEC_ID_VP3 = 29;
        public static final int AV_CODEC_ID_THEORA = 30;
        public static final int AV_CODEC_ID_ASV1 = 31;
        public static final int AV_CODEC_ID_ASV2 = 32;
        public static final int AV_CODEC_ID_FFV1 = 33;
        public static final int AV_CODEC_ID_4XM = 34;
        public static final int AV_CODEC_ID_VCR1 = 35;
        public static final int AV_CODEC_ID_CLJR = 36;
        public static final int AV_CODEC_ID_MDEC = 37;
        public static final int AV_CODEC_ID_ROQ = 38;
        public static final int AV_CODEC_ID_INTERPLAY_VIDEO = 39;
        public static final int AV_CODEC_ID_XAN_WC3 = 40;
        public static final int AV_CODEC_ID_XAN_WC4 = 41;
        public static final int AV_CODEC_ID_RPZA = 42;
        public static final int AV_CODEC_ID_CINEPAK = 43;
        public static final int AV_CODEC_ID_WS_VQA = 44;
        public static final int AV_CODEC_ID_MSRLE = 45;
        public static final int AV_CODEC_ID_MSVIDEO1 = 46;
        public static final int AV_CODEC_ID_IDCIN = 47;
        public static final int AV_CODEC_ID_8BPS = 48;
        public static final int AV_CODEC_ID_SMC = 49;
        public static final int AV_CODEC_ID_FLIC = 50;
        public static final int AV_CODEC_ID_TRUEMOTION1 = 51;
        public static final int AV_CODEC_ID_VMDVIDEO = 52;
        public static final int AV_CODEC_ID_MSZH = 53;
        public static final int AV_CODEC_ID_ZLIB = 54;
        public static final int AV_CODEC_ID_QTRLE = 55;
        public static final int AV_CODEC_ID_TSCC = 56;
        public static final int AV_CODEC_ID_ULTI = 57;
        public static final int AV_CODEC_ID_QDRAW = 58;
        public static final int AV_CODEC_ID_VIXL = 59;
        public static final int AV_CODEC_ID_QPEG = 60;
        public static final int AV_CODEC_ID_PNG = 61;
        public static final int AV_CODEC_ID_PPM = 62;
        public static final int AV_CODEC_ID_PBM = 63;
        public static final int AV_CODEC_ID_PGM = 64;
        public static final int AV_CODEC_ID_PGMYUV = 65;
        public static final int AV_CODEC_ID_PAM = 66;
        public static final int AV_CODEC_ID_FFVHUFF = 67;
        public static final int AV_CODEC_ID_RV30 = 68;
        public static final int AV_CODEC_ID_RV40 = 69;
        public static final int AV_CODEC_ID_VC1 = 70;
        public static final int AV_CODEC_ID_WMV3 = 71;
        public static final int AV_CODEC_ID_LOCO = 72;
        public static final int AV_CODEC_ID_WNV1 = 73;
        public static final int AV_CODEC_ID_AASC = 74;
        public static final int AV_CODEC_ID_INDEO2 = 75;
        public static final int AV_CODEC_ID_FRAPS = 76;
        public static final int AV_CODEC_ID_TRUEMOTION2 = 77;
        public static final int AV_CODEC_ID_BMP = 78;
        public static final int AV_CODEC_ID_CSCD = 79;
        public static final int AV_CODEC_ID_MMVIDEO = 80;
        public static final int AV_CODEC_ID_ZMBV = 81;
        public static final int AV_CODEC_ID_AVS = 82;
        public static final int AV_CODEC_ID_SMACKVIDEO = 83;
        public static final int AV_CODEC_ID_NUV = 84;
        public static final int AV_CODEC_ID_KMVC = 85;
        public static final int AV_CODEC_ID_FLASHSV = 86;
        public static final int AV_CODEC_ID_CAVS = 87;
        public static final int AV_CODEC_ID_JPEG2000 = 88;
        public static final int AV_CODEC_ID_VMNC = 89;
        public static final int AV_CODEC_ID_VP5 = 90;
        public static final int AV_CODEC_ID_VP6 = 91;
        public static final int AV_CODEC_ID_VP6F = 92;
        public static final int AV_CODEC_ID_TARGA = 93;
        public static final int AV_CODEC_ID_DSICINVIDEO = 94;
        public static final int AV_CODEC_ID_TIERTEXSEQVIDEO = 95;
        public static final int AV_CODEC_ID_TIFF = 96;
        public static final int AV_CODEC_ID_GIF = 97;
        public static final int AV_CODEC_ID_DXA = 98;
        public static final int AV_CODEC_ID_DNXHD = 99;
        public static final int AV_CODEC_ID_THP = 100;
        public static final int AV_CODEC_ID_SGI = 101;
        public static final int AV_CODEC_ID_C93 = 102;
        public static final int AV_CODEC_ID_BETHSOFTVID = 103;
        public static final int AV_CODEC_ID_PTX = 104;
        public static final int AV_CODEC_ID_TXD = 105;
        public static final int AV_CODEC_ID_VP6A = 106;
        public static final int AV_CODEC_ID_AMV = 107;
        public static final int AV_CODEC_ID_VB = 108;
        public static final int AV_CODEC_ID_PCX = 109;
        public static final int AV_CODEC_ID_SUNRAST = 110;
        public static final int AV_CODEC_ID_INDEO4 = 111;
        public static final int AV_CODEC_ID_INDEO5 = 112;
        public static final int AV_CODEC_ID_MIMIC = 113;
        public static final int AV_CODEC_ID_RL2 = 114;
        public static final int AV_CODEC_ID_ESCAPE124 = 115;
        public static final int AV_CODEC_ID_DIRAC = 116;
        public static final int AV_CODEC_ID_BFI = 117;
        public static final int AV_CODEC_ID_CMV = 118;
        public static final int AV_CODEC_ID_MOTIONPIXELS = 119;
        public static final int AV_CODEC_ID_TGV = 120;
        public static final int AV_CODEC_ID_TGQ = 121;
        public static final int AV_CODEC_ID_TQI = 122;
        public static final int AV_CODEC_ID_AURA = 123;
        public static final int AV_CODEC_ID_AURA2 = 124;
        public static final int AV_CODEC_ID_V210X = 125;
        public static final int AV_CODEC_ID_TMV = 126;
        public static final int AV_CODEC_ID_V210 = 127;
        public static final int AV_CODEC_ID_DPX = 128;
        public static final int AV_CODEC_ID_MAD = 129;
        public static final int AV_CODEC_ID_FRWU = 130;
        public static final int AV_CODEC_ID_FLASHSV2 = 131;
        public static final int AV_CODEC_ID_CDGRAPHICS = 132;
        public static final int AV_CODEC_ID_R210 = 133;
        public static final int AV_CODEC_ID_ANM = 134;
        public static final int AV_CODEC_ID_BINKVIDEO = 135;
        public static final int AV_CODEC_ID_IFF_ILBM = 136;
        public static final int AV_CODEC_ID_IFF_BYTERUN1 = 137;
        public static final int AV_CODEC_ID_KGV1 = 138;
        public static final int AV_CODEC_ID_YOP = 139;
        public static final int AV_CODEC_ID_VP8 = 140;
        public static final int AV_CODEC_ID_PICTOR = 141;
        public static final int AV_CODEC_ID_ANSI = 142;
        public static final int AV_CODEC_ID_A64_MULTI = 143;
        public static final int AV_CODEC_ID_A64_MULTI5 = 144;
        public static final int AV_CODEC_ID_R10K = 145;
        public static final int AV_CODEC_ID_MXPEG = 146;
        public static final int AV_CODEC_ID_LAGARITH = 147;
        public static final int AV_CODEC_ID_PRORES = 148;
        public static final int AV_CODEC_ID_JV = 149;
        public static final int AV_CODEC_ID_DFA = 150;
        public static final int AV_CODEC_ID_WMV3IMAGE = 151;
        public static final int AV_CODEC_ID_VC1IMAGE = 152;
        public static final int AV_CODEC_ID_UTVIDEO = 153;
        public static final int AV_CODEC_ID_BMV_VIDEO = 154;
        public static final int AV_CODEC_ID_VBLE = 155;
        public static final int AV_CODEC_ID_DXTORY = 156;
        public static final int AV_CODEC_ID_V410 = 157;
        public static final int AV_CODEC_ID_XWD = 158;
        public static final int AV_CODEC_ID_CDXL = 159;
        public static final int AV_CODEC_ID_XBM = 160;
        public static final int AV_CODEC_ID_ZEROCODEC = 161;
        public static final int AV_CODEC_ID_MSS1 = 162;
        public static final int AV_CODEC_ID_MSA1 = 163;
        public static final int AV_CODEC_ID_TSCC2 = 164;
        public static final int AV_CODEC_ID_MTS2 = 165;
        public static final int AV_CODEC_ID_CLLC = 166;
        public static final int AV_CODEC_ID_MSS2 = 167;
        public static final int AV_CODEC_ID_VP9 = 168;
        public static final int AV_CODEC_ID_AIC = 169;
        public static final int AV_CODEC_ID_ESCAPE130_DEPRECATED = 170;
        public static final int AV_CODEC_ID_G2M_DEPRECATED = 171;
        public static final int AV_CODEC_ID_WEBP_DEPRECATED = 172;
        public static final int AV_CODEC_ID_HNM4_VIDEO = 173;
        public static final int AV_CODEC_ID_HEVC_DEPRECATED = 174;
        public static final int AV_CODEC_ID_FIRST_AUDIO = 0x10000;
        public static final int AV_CODEC_ID_PCM_S16LE = 0x10000;
        public static final int AV_CODEC_ID_PCM_S16BE = 0x10001;
        public static final int AV_CODEC_ID_PCM_U16LE = 0x10002;
        public static final int AV_CODEC_ID_PCM_U16BE = 0x10003;
        public static final int AV_CODEC_ID_PCM_S8 = 0x10004;
        public static final int AV_CODEC_ID_PCM_U8 = 0x10005;
        public static final int AV_CODEC_ID_PCM_MULAW = 0x10006;
        public static final int AV_CODEC_ID_PCM_ALAW = 0x10007;
        public static final int AV_CODEC_ID_PCM_S32LE = 0x10008;
        public static final int AV_CODEC_ID_PCM_S32BE = 0x10009;
        public static final int AV_CODEC_ID_PCM_U32LE = 0x1000a;
        public static final int AV_CODEC_ID_PCM_U32BE = 0x1000b;
        public static final int AV_CODEC_ID_PCM_S24LE = 0x1000c;
        public static final int AV_CODEC_ID_PCM_S24BE = 0x1000d;
        public static final int AV_CODEC_ID_PCM_U24LE = 0x1000e;
        public static final int AV_CODEC_ID_PCM_U24BE = 0x1000f;
        public static final int AV_CODEC_ID_PCM_S24DAUD = 0x10010;
        public static final int AV_CODEC_ID_PCM_ZORK = 0x10011;
        public static final int AV_CODEC_ID_PCM_S16LE_PLANAR = 0x10012;
        public static final int AV_CODEC_ID_PCM_DVD = 0x10013;
        public static final int AV_CODEC_ID_PCM_F32BE = 0x10014;
        public static final int AV_CODEC_ID_PCM_F32LE = 0x10015;
        public static final int AV_CODEC_ID_PCM_F64BE = 0x10016;
        public static final int AV_CODEC_ID_PCM_F64LE = 0x10017;
        public static final int AV_CODEC_ID_PCM_BLURAY = 0x10018;
        public static final int AV_CODEC_ID_PCM_LXF = 0x10019;
        public static final int AV_CODEC_ID_S302M = 0x1001a;
        public static final int AV_CODEC_ID_PCM_S8_PLANAR = 0x1001b;
        public static final int AV_CODEC_ID_PCM_S24LE_PLANAR_DEPRECATED = 0x1001c;
        public static final int AV_CODEC_ID_PCM_S32LE_PLANAR_DEPRECATED = 0x1001d;
        public static final int AV_CODEC_ID_ADPCM_IMA_QT = 0x11000;
        public static final int AV_CODEC_ID_ADPCM_IMA_WAV = 0x11001;
        public static final int AV_CODEC_ID_ADPCM_IMA_DK3 = 0x11002;
        public static final int AV_CODEC_ID_ADPCM_IMA_DK4 = 0x11003;
        public static final int AV_CODEC_ID_ADPCM_IMA_WS = 0x11004;
        public static final int AV_CODEC_ID_ADPCM_IMA_SMJPEG = 0x11005;
        public static final int AV_CODEC_ID_ADPCM_MS = 0x11006;
        public static final int AV_CODEC_ID_ADPCM_4XM = 0x11007;
        public static final int AV_CODEC_ID_ADPCM_XA = 0x11008;
        public static final int AV_CODEC_ID_ADPCM_ADX = 0x11009;
        public static final int AV_CODEC_ID_ADPCM_EA = 0x1100a;
        public static final int AV_CODEC_ID_ADPCM_G726 = 0x1100b;
        public static final int AV_CODEC_ID_ADPCM_CT = 0x1100c;
        public static final int AV_CODEC_ID_ADPCM_SWF = 0x1100d;
        public static final int AV_CODEC_ID_ADPCM_YAMAHA = 0x1100e;
        public static final int AV_CODEC_ID_ADPCM_SBPRO_4 = 0x1100f;
        public static final int AV_CODEC_ID_ADPCM_SBPRO_3 = 0x11010;
        public static final int AV_CODEC_ID_ADPCM_SBPRO_2 = 0x11011;
        public static final int AV_CODEC_ID_ADPCM_THP = 0x11012;
        public static final int AV_CODEC_ID_ADPCM_IMA_AMV = 0x11013;
        public static final int AV_CODEC_ID_ADPCM_EA_R1 = 0x11014;
        public static final int AV_CODEC_ID_ADPCM_EA_R3 = 0x11015;
        public static final int AV_CODEC_ID_ADPCM_EA_R2 = 0x11016;
        public static final int AV_CODEC_ID_ADPCM_IMA_EA_SEAD = 0x11017;
        public static final int AV_CODEC_ID_ADPCM_IMA_EA_EACS = 0x11018;
        public static final int AV_CODEC_ID_ADPCM_EA_XAS = 0x11019;
        public static final int AV_CODEC_ID_ADPCM_EA_MAXIS_XA = 0x1101a;
        public static final int AV_CODEC_ID_ADPCM_IMA_ISS = 0x1101b;
        public static final int AV_CODEC_ID_ADPCM_G722 = 0x1101c;
        public static final int AV_CODEC_ID_ADPCM_IMA_APC = 0x1101d;
        public static final int AV_CODEC_ID_AMR_NB = 0x12000;
        public static final int AV_CODEC_ID_AMR_WB = 0x12001;
        public static final int AV_CODEC_ID_RA_144 = 0x13000;
        public static final int AV_CODEC_ID_RA_288 = 0x13001;
        public static final int AV_CODEC_ID_ROQ_DPCM = 0x14000;
        public static final int AV_CODEC_ID_INTERPLAY_DPCM = 0x14001;
        public static final int AV_CODEC_ID_XAN_DPCM = 0x14002;
        public static final int AV_CODEC_ID_SOL_DPCM = 0x14003;
        public static final int AV_CODEC_ID_MP2 = 0x15000;
        public static final int AV_CODEC_ID_MP3 = 0x15001;
        public static final int AV_CODEC_ID_AAC = 0x15002;
        public static final int AV_CODEC_ID_AC3 = 0x15003;
        public static final int AV_CODEC_ID_DTS = 0x15004;
        public static final int AV_CODEC_ID_VORBIS = 0x15005;
        public static final int AV_CODEC_ID_DVAUDIO = 0x15006;
        public static final int AV_CODEC_ID_WMAV1 = 0x15007;
        public static final int AV_CODEC_ID_WMAV2 = 0x15008;
        public static final int AV_CODEC_ID_MACE3 = 0x15009;
        public static final int AV_CODEC_ID_MACE6 = 0x1500a;
        public static final int AV_CODEC_ID_VMDAUDIO = 0x1500b;
        public static final int AV_CODEC_ID_FLAC = 0x1500c;
        public static final int AV_CODEC_ID_MP3ADU = 0x1500d;
        public static final int AV_CODEC_ID_MP3ON4 = 0x1500e;
        public static final int AV_CODEC_ID_SHORTEN = 0x1500f;
        public static final int AV_CODEC_ID_ALAC = 0x15010;
        public static final int AV_CODEC_ID_WESTWOOD_SND1 = 0x15011;
        public static final int AV_CODEC_ID_GSM = 0x15012;
        public static final int AV_CODEC_ID_QDM2 = 0x15013;
        public static final int AV_CODEC_ID_COOK = 0x15014;
        public static final int AV_CODEC_ID_TRUESPEECH = 0x15015;
        public static final int AV_CODEC_ID_TTA = 0x15016;
        public static final int AV_CODEC_ID_SMACKAUDIO = 0x15017;
        public static final int AV_CODEC_ID_QCELP = 0x15018;
        public static final int AV_CODEC_ID_WAVPACK = 0x15019;
        public static final int AV_CODEC_ID_DSICINAUDIO = 0x1501a;
        public static final int AV_CODEC_ID_IMC = 0x1501b;
        public static final int AV_CODEC_ID_MUSEPACK7 = 0x1501c;
        public static final int AV_CODEC_ID_MLP = 0x1501d;
        public static final int AV_CODEC_ID_GSM_MS = 0x1501e;
        public static final int AV_CODEC_ID_ATRAC3 = 0x1501f;
        public static final int AV_CODEC_ID_APE = 0x15020;
        public static final int AV_CODEC_ID_NELLYMOSER = 0x15021;
        public static final int AV_CODEC_ID_MUSEPACK8 = 0x15022;
        public static final int AV_CODEC_ID_SPEEX = 0x15023;
        public static final int AV_CODEC_ID_WMAVOICE = 0x15024;
        public static final int AV_CODEC_ID_WMAPRO = 0x15025;
        public static final int AV_CODEC_ID_WMALOSSLESS = 0x15026;
        public static final int AV_CODEC_ID_ATRAC3P = 0x15027;
        public static final int AV_CODEC_ID_EAC3 = 0x15028;
        public static final int AV_CODEC_ID_SIPR = 0x15029;
        public static final int AV_CODEC_ID_MP1 = 0x1502a;
        public static final int AV_CODEC_ID_TWINVQ = 0x1502b;
        public static final int AV_CODEC_ID_TRUEHD = 0x1502c;
        public static final int AV_CODEC_ID_MP4ALS = 0x1502d;
        public static final int AV_CODEC_ID_ATRAC1 = 0x1502e;
        public static final int AV_CODEC_ID_BINKAUDIO_RDFT = 0x1502f;
        public static final int AV_CODEC_ID_BINKAUDIO_DCT = 0x15030;
        public static final int AV_CODEC_ID_AAC_LATM = 0x15031;
        public static final int AV_CODEC_ID_QDMC = 0x15032;
        public static final int AV_CODEC_ID_CELT = 0x15033;
        public static final int AV_CODEC_ID_G723_1 = 0x15034;
        public static final int AV_CODEC_ID_G729 = 0x15035;
        public static final int AV_CODEC_ID_8SVX_EXP = 0x15036;
        public static final int AV_CODEC_ID_8SVX_FIB = 0x15037;
        public static final int AV_CODEC_ID_BMV_AUDIO = 0x15038;
        public static final int AV_CODEC_ID_RALF = 0x15039;
        public static final int AV_CODEC_ID_IAC = 0x1503a;
        public static final int AV_CODEC_ID_ILBC = 0x1503b;
        public static final int AV_CODEC_ID_OPUS_DEPRECATED = 0x1503c;
        public static final int AV_CODEC_ID_COMFORT_NOISE = 0x1503d;
        public static final int AV_CODEC_ID_TAK_DEPRECATED = 0x1503e;
        public static final int AV_CODEC_ID_METASOUND = 0x1503f;
        public static final int AV_CODEC_ID_FIRST_SUBTITLE = 0x17000;
        public static final int AV_CODEC_ID_DVD_SUBTITLE = 0x17000;
        public static final int AV_CODEC_ID_DVB_SUBTITLE = 0x17001;
        public static final int AV_CODEC_ID_TEXT = 0x17002;
        public static final int AV_CODEC_ID_XSUB = 0x17003;
        public static final int AV_CODEC_ID_SSA = 0x17004;
        public static final int AV_CODEC_ID_MOV_TEXT = 0x17005;
        public static final int AV_CODEC_ID_HDMV_PGS_SUBTITLE = 0x17006;
        public static final int AV_CODEC_ID_DVB_TELETEXT = 0x17007;
        public static final int AV_CODEC_ID_SRT = 0x17008;
        public static final int AV_CODEC_ID_FIRST_UNKNOWN = 0x18000;
        public static final int AV_CODEC_ID_TTF = 0x18000;
        public static final int AV_CODEC_ID_PROBE = 0x19000;
        public static final int AV_CODEC_ID_MPEG2TS = 0x20000;
        public static final int AV_CODEC_ID_MPEG4SYSTEMS = 0x20001;
        public static final int AV_CODEC_ID_FFMETADATA = 0x21000;
    }

    public static class AVCodecInternal extends PointerType
    {

        public AVCodecInternal(Pointer pointer)
        {
            super(pointer);
        }

        public AVCodecInternal()
        {
        }
    }

    public static interface AVColorPrimaries
    {

        public static final int AVCOL_PRI_BT709 = 1;
        public static final int AVCOL_PRI_UNSPECIFIED = 2;
        public static final int AVCOL_PRI_BT470M = 4;
        public static final int AVCOL_PRI_BT470BG = 5;
        public static final int AVCOL_PRI_SMPTE170M = 6;
        public static final int AVCOL_PRI_SMPTE240M = 7;
        public static final int AVCOL_PRI_FILM = 8;
        public static final int AVCOL_PRI_BT2020 = 9;
        public static final int AVCOL_PRI_NB = 10;
    }

    public static interface AVColorTransferCharacteristic
    {

        public static final int AVCOL_TRC_BT709 = 1;
        public static final int AVCOL_TRC_UNSPECIFIED = 2;
        public static final int AVCOL_TRC_GAMMA22 = 4;
        public static final int AVCOL_TRC_GAMMA28 = 5;
        public static final int AVCOL_TRC_SMPTE170M = 6;
        public static final int AVCOL_TRC_SMPTE240M = 7;
        public static final int AVCOL_TRC_LINEAR = 8;
        public static final int AVCOL_TRC_LOG = 9;
        public static final int AVCOL_TRC_LOG_SQRT = 10;
        public static final int AVCOL_TRC_IEC61966_2_4 = 11;
        public static final int AVCOL_TRC_BT1361_ECG = 12;
        public static final int AVCOL_TRC_IEC61966_2_1 = 13;
        public static final int AVCOL_TRC_BT2020_10 = 14;
        public static final int AVCOL_TRC_BT2020_12 = 15;
        public static final int AVCOL_TRC_NB = 16;
    }

    public static class AVDictionary extends PointerType
    {

        public AVDictionary(Pointer pointer)
        {
            super(pointer);
        }

        public AVDictionary()
        {
        }
    }

    public static interface AVDiscard
    {

        public static final int AVDISCARD_NONE = -16;
        public static final int AVDISCARD_DEFAULT = 0;
        public static final int AVDISCARD_NONREF = 8;
        public static final int AVDISCARD_BIDIR = 16;
        public static final int AVDISCARD_NONKEY = 32;
        public static final int AVDISCARD_ALL = 48;
    }

    public static interface AVFieldOrder
    {

        public static final int AV_FIELD_UNKNOWN = 0;
        public static final int AV_FIELD_PROGRESSIVE = 1;
        public static final int AV_FIELD_TT = 2;
        public static final int AV_FIELD_BB = 3;
        public static final int AV_FIELD_TB = 4;
        public static final int AV_FIELD_BT = 5;
    }

    /*public static class AVFrame extends PointerType
    {

        public AVFrame(Pointer pointer)
        {
            super(pointer);
        }

        public AVFrame()
        {
        }
    }*/

    public static interface AVLockOp
    {

        public static final int AV_LOCK_CREATE = 0;
        public static final int AV_LOCK_OBTAIN = 1;
        public static final int AV_LOCK_RELEASE = 2;
        public static final int AV_LOCK_DESTROY = 3;
    }

    public static interface AVPacketSideDataType
    {

        public static final int AV_PKT_DATA_PALETTE = 0;
        public static final int AV_PKT_DATA_NEW_EXTRADATA = 1;
        public static final int AV_PKT_DATA_PARAM_CHANGE = 2;
        public static final int AV_PKT_DATA_H263_MB_INFO = 3;
        public static final int AV_PKT_DATA_SKIP_SAMPLES = 70;
        public static final int AV_PKT_DATA_JP_DUALMONO = 71;
        public static final int AV_PKT_DATA_STRINGS_METADATA = 72;
        public static final int AV_PKT_DATA_SUBTITLE_POSITION = 73;
        public static final int AV_PKT_DATA_MATROSKA_BLOCKADDITIONAL = 74;
        public static final int AV_PKT_DATA_WEBVTT_IDENTIFIER = 75;
        public static final int AV_PKT_DATA_WEBVTT_SETTINGS = 76;
        public static final int AV_PKT_DATA_METADATA_UPDATE = 77;
    }

    public static interface AVPictureStructure
    {

        public static final int AV_PICTURE_STRUCTURE_UNKNOWN = 0;
        public static final int AV_PICTURE_STRUCTURE_TOP_FIELD = 1;
        public static final int AV_PICTURE_STRUCTURE_BOTTOM_FIELD = 2;
        public static final int AV_PICTURE_STRUCTURE_FRAME = 3;
    }

    /*public static class AVRational extends PointerType
    {

        public AVRational(Pointer pointer)
        {
            super(pointer);
        }

        public AVRational()
        {
        }
    }*/

    public static interface AVSideDataParamChangeFlags
    {

        public static final int AV_SIDE_DATA_PARAM_CHANGE_CHANNEL_COUNT = 1;
        public static final int AV_SIDE_DATA_PARAM_CHANGE_CHANNEL_LAYOUT = 2;
        public static final int AV_SIDE_DATA_PARAM_CHANGE_SAMPLE_RATE = 4;
        public static final int AV_SIDE_DATA_PARAM_CHANGE_DIMENSIONS = 8;
    }

    public static interface AVSubtitleType
    {

        public static final int SUBTITLE_NONE = 0;
        public static final int SUBTITLE_BITMAP = 1;
        public static final int SUBTITLE_TEXT = 2;
        public static final int SUBTITLE_ASS = 3;
    }

    public static interface Motion_Est_ID
    {

        public static final int ME_ZERO = 1;
        public static final int ME_FULL = 2;
        public static final int ME_LOG = 3;
        public static final int ME_PHODS = 4;
        public static final int ME_EPZS = 5;
        public static final int ME_X1 = 6;
        public static final int ME_HEX = 7;
        public static final int ME_UMH = 8;
        public static final int ME_TESA = 9;
        public static final int ME_ITER = 50;
    }

    public static interface av_lockmgr_register_cb_callback
        extends Callback
    {

        public abstract int apply(PointerByReference pointerbyreference, int i);
    }

    public static interface avcodec_default_execute2_func_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, Pointer pointer, int i, int j);
    }

    public static interface avcodec_default_execute_func_callback
        extends Callback
    {

        public abstract int apply(AVCodecContext avcodeccontext, Pointer pointer);
    }


   public static final String JNA_LIBRARY_NAME = "avcodec-55";
   // public static final String JNA_LIBRARY_NAME = "avcodec.a";
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(JNA_LIBRARY_NAME);
    public static final AVCodecLibrary INSTANCE = (AVCodecLibrary)Native.loadLibrary(JNA_LIBRARY_NAME, AVCodecLibrary.class);
    public static final int FF_IDCT_SIMPLENEON = 22;
    public static final int FF_PROFILE_JPEG2000_CSTREAM_NO_RESTRICTION = 2;
    public static final int FF_DEBUG_VIS_MV_B_BACK = 4;
    public static final int FF_PROFILE_MPEG2_422 = 0;
    public static final int CODEC_FLAG_CLOSED_GOP = 0x80000000;
    public static final int FF_PROFILE_H264_EXTENDED = 88;
    public static final int CODEC_FLAG_QPEL = 16;
    public static final int CODEC_FLAG_NORMALIZE_AQP = 0x20000;
    public static final int FF_COMPLIANCE_NORMAL = 0;
    public static final int FF_PROFILE_MPEG2_SIMPLE = 5;
    public static final int FF_IDCT_XVIDMMX = 14;
    public static final int FF_IDCT_ALTIVEC = 8;
    public static final int FF_CMP_CHROMA = 256;
    public static final int FF_PROFILE_VC1_MAIN = 1;
    public static final int FF_PROFILE_MPEG2_SS = 2;
    public static final int FF_PROFILE_MPEG4_ADVANCED_REAL_TIME = 9;
    public static final int FF_PROFILE_MPEG2_AAC_HE = 131;
    public static final int FF_DEBUG_BUFFERS = 32768;
    public static final int AV_EF_BITSTREAM = 2;
    public static final int FF_PROFILE_H264_MAIN = 77;
    public static final int FF_CMP_SATD = 2;
    public static final int FF_PROFILE_MPEG4_SIMPLE_FACE_ANIMATION = 6;
    public static final int FF_DEBUG_BUGS = 4096;
    public static final int CODEC_CAP_DELAY = 32;
    public static final int FF_PROFILE_MPEG4_SCALABLE_TEXTURE = 5;
    public static final int FF_BUG_AMV = 32;
    public static final int FF_MIN_BUFFER_SIZE = 16384;
    public static final int AV_EF_EXPLODE = 8;
    public static final int FF_CMP_RD = 6;
    public static final int FF_BUG_AUTODETECT = 1;
    public static final int FF_PROFILE_MPEG2_SNR_SCALABLE = 3;
    public static final int FF_DEBUG_ER = 1024;
    public static final int FF_SUB_CHARENC_MODE_PRE_DECODER = 1;
    public static final int CODEC_FLAG_GRAY = 8192;
    public static final int FF_CODER_TYPE_RLE = 3;
    public static final int FF_MB_DECISION_BITS = 1;
    public static final int FF_CODER_TYPE_VLC = 0;
    public static final int FF_MB_DECISION_RD = 2;
    public static final int FF_BUG_DC_CLIP = 4096;
    public static final int FF_PROFILE_VC1_COMPLEX = 2;
    public static final int FF_BUG_QPEL_CHROMA2 = 256;
    public static final int CODEC_FLAG_EMU_EDGE = 16384;
    public static final int FF_CMP_W97 = 12;
    public static final int FF_PROFILE_AAC_LD = 22;
    public static final int CODEC_CAP_DRAW_HORIZ_BAND = 1;
    public static final int FF_IDCT_SIMPLEARMV6 = 17;
    public static final int FF_DEBUG_DCT_COEFF = 64;
    public static final int FF_COMPLIANCE_EXPERIMENTAL = -2;
    public static final int FF_DEBUG_VIS_MV_P_FOR = 1;
    public static final int FF_CMP_DCT = 3;
    public static final int FF_MB_DECISION_SIMPLE = 0;
    public static final int FF_PROFILE_HEVC_MAIN = 1;
    public static final int FF_IDCT_SIMPLEARM = 10;
    public static final int FF_PROFILE_MPEG4_SIMPLE = 0;
    public static final int FF_PROFILE_MPEG4_CORE_SCALABLE = 10;
    public static final int FF_CODER_TYPE_AC = 1;
    public static final int FF_SUB_CHARENC_MODE_DO_NOTHING = -1;
    public static final int FF_PROFILE_H264_CAVLC_444 = 44;
    public static final int FF_CMP_SAD = 0;
    public static final int FF_PROFILE_MPEG4_CORE = 2;
    public static final int FF_BUG_TRUNCATED = 16384;
    public static final int FF_PROFILE_MPEG4_MAIN = 3;
    public static final int SLICE_FLAG_CODED_ORDER = 1;
    public static final int FF_PROFILE_AAC_SSR = 2;
    public static final int FF_PROFILE_JPEG2000_DCINEMA_4K = 4;
    public static final int CODEC_FLAG_GLOBAL_HEADER = 0x400000;
    public static final int CODEC_FLAG_UNALIGNED = 1;
    public static final int AV_EF_COMPLIANT = 0x20000;
    public static final int CODEC_FLAG2_IGNORE_CROP = 0x10000;
    public static final int FF_PROFILE_VC1_SIMPLE = 0;
    public static final int AV_CODEC_PROP_TEXT_SUB = 0x20000;
    public static final int FF_PROFILE_VC1_ADVANCED = 3;
    public static final int CODEC_FLAG_PSNR = 32768;
    public static final int FF_COMPLIANCE_VERY_STRICT = 2;
    public static final int CODEC_CAP_DR1 = 2;
    public static final int FF_BUG_XVID_ILACE = 4;
    public static final int FF_LOSS_COLORQUANT = 16;
    public static final int AV_NUM_DATA_POINTERS = 8;
    public static final int CODEC_CAP_SMALL_LAST_FRAME = 64;
    public static final int AV_SUBTITLE_FLAG_FORCED = 1;
    public static final int FF_PROFILE_H264_HIGH_10 = 110;
    public static final int FF_DTG_AFD_16_9_SP_14_9 = 14;
    public static final int FF_PROFILE_H264_HIGH_10_INTRA = 2158;
    public static final int CODEC_FLAG_MV0 = 64;
    public static final int FF_PROFILE_H264_HIGH_444 = 144;
    public static final int FF_CODER_TYPE_RAW = 2;
    public static final int FF_PROFILE_H264_HIGH = 100;
    public static final int SLICE_FLAG_ALLOW_FIELD = 2;
    public static final int FF_DEBUG_THREADS = 0x10000;
    public static final int FF_PROFILE_MPEG4_ADVANCED_CODING = 11;
    public static final int FF_BUG_QPEL_CHROMA = 64;
    public static final int FF_PROFILE_HEVC_MAIN_10 = 2;
    public static final int FF_COMPLIANCE_UNOFFICIAL = -1;
    public static final int FF_PROFILE_JPEG2000_DCINEMA_2K = 3;
    public static final int FF_LOSS_COLORSPACE = 4;
    public static final int CODEC_FLAG2_SHOW_ALL = 0x400000;
    public static final int SLICE_FLAG_ALLOW_PLANE = 4;
    public static final int AV_EF_CRCCHECK = 1;
    public static final int FF_PROFILE_DTS_HD_HRA = 50;
    public static final int FF_LOSS_RESOLUTION = 1;
    public static final int FF_DEBUG_VIS_MV_B_FOR = 2;
    public static final int PARSER_FLAG_FETCHED_OFFSET = 4;
    public static final int FF_CMP_W53 = 11;
    public static final int FF_PROFILE_AAC_HE = 4;
    public static final int FF_PROFILE_H264_HIGH_444_PREDICTIVE = 244;
    public static final int FF_CMP_SSE = 1;
    public static final int CODEC_FLAG_TRUNCATED = 0x10000;
    public static final int FF_DEBUG_MB_TYPE = 8;
    public static final int FF_DEBUG_STARTCODE = 256;
    public static final int FF_DCT_FAAN = 6;
    public static final int FF_CMP_PSNR = 4;
    public static final int FF_DCT_AUTO = 0;
    public static final int FF_SUB_CHARENC_MODE_AUTOMATIC = 0;
    public static final int FF_PROFILE_MPEG4_HYBRID = 8;
    public static final int FF_RC_STRATEGY_XVID = 1;
    public static final int FF_PROFILE_DTS = 20;
    public static final int FF_PROFILE_H264_HIGH_422_INTRA = 2170;
    public static final int FF_PROFILE_H264_HIGH_444_INTRA = 2292;
    public static final int AV_CODEC_PROP_LOSSY = 2;
    public static final int FF_PROFILE_H264_HIGH_422 = 122;
    public static final int FF_CODER_TYPE_DEFLATE = 4;
    public static final int FF_PROFILE_AAC_LTP = 3;
    public static final int FF_PROFILE_MPEG4_SIMPLE_STUDIO = 14;
    public static final int CODEC_CAP_INTRA_ONLY = 0x40000000;
    public static final int FF_LEVEL_UNKNOWN = -99;
    public static final int FF_IDCT_SIMPLEVIS = 18;
    public static final int CODEC_CAP_LOSSLESS = 0x80000000;
    public static final int AV_PKT_FLAG_KEY = 1;
    public static final int CODEC_CAP_FRAME_THREADS = 4096;
    public static final int FF_DTG_AFD_14_9 = 11;
    public static final int CODEC_FLAG2_NO_OUTPUT = 4;
    public static final int CODEC_FLAG_BITEXACT = 0x800000;
    public static final int FF_PROFILE_MPEG2_AAC_LOW = 128;
    public static final int FF_IDCT_SH4 = 9;
    public static final int FF_BUG_STD_QPEL = 128;
    public static final int AV_EF_BUFFER = 4;
    public static final int FF_LOSS_CHROMA = 32;
    public static final int FF_PROFILE_DTS_ES = 30;
    public static final int FF_IDCT_INT = 1;
    public static final int FF_INPUT_BUFFER_PADDING_SIZE = 16;
    public static final int FF_THREAD_FRAME = 1;
    public static final int FF_DTG_AFD_16_9 = 10;
    public static final int FF_DTG_AFD_SP_4_3 = 15;
    public static final int CODEC_CAP_VARIABLE_FRAME_SIZE = 0x10000;
    public static final int FF_DEBUG_SKIP = 128;
    public static final int FF_PROFILE_H264_CONSTRAINED_BASELINE = 578;
    public static final int CODEC_CAP_TRUNCATED = 8;
    public static final int FF_DEBUG_MMCO = 2048;
    public static final int FF_IDCT_AUTO = 0;
    public static final int FF_PROFILE_MPEG4_BASIC_ANIMATED_TEXTURE = 7;
    public static final int CODEC_FLAG_INTERLACED_DCT = 0x40000;
    public static final int FF_PROFILE_MPEG4_ADVANCED_SIMPLE = 15;
    public static final int FF_DTG_AFD_4_3_SP_14_9 = 13;
    public static final int FF_DCT_ALTIVEC = 5;
    public static final int CODEC_CAP_CHANNEL_CONF = 1024;
    public static final int AV_CODEC_PROP_INTRA_ONLY = 1;
    public static final int FF_COMPLIANCE_STRICT = 1;
    public static final int FF_CMP_BIT = 5;
    public static final int CODEC_FLAG_LOW_DELAY = 0x80000;
    public static final int AV_PARSER_PTS_NB = 4;
    public static final int FF_DEBUG_PTS = 512;
    public static final int AV_CODEC_PROP_BITMAP_SUB = 0x10000;
    public static final int FF_BUG_HPEL_CHROMA = 2048;
    public static final int FF_LOSS_ALPHA = 8;
    public static final int FF_PROFILE_MPEG4_N_BIT = 4;
    public static final int FF_DTG_AFD_4_3 = 9;
    public static final int AV_EF_AGGRESSIVE = 0x40000;
    public static final int FF_DEBUG_BITSTREAM = 4;
    public static final int FF_PROFILE_DTS_96_24 = 40;
    public static final int FF_CMP_DCT264 = 14;
    public static final int FF_BUG_NO_PADDING = 16;
    public static final int FF_DEFAULT_QUANT_BIAS = 0xf423f;
    public static final int FF_EC_DEBLOCK = 2;
    public static final int CODEC_FLAG_LOOP_FILTER = 2048;
    public static final int FF_PROFILE_MPEG2_MAIN = 4;
    public static final int FF_CMP_DCTMAX = 13;
    public static final int CODEC_FLAG_INTERLACED_ME = 0x20000000;
    public static final int FF_PROFILE_RESERVED = -100;
    public static final int AV_CODEC_PROP_LOSSLESS = 4;
    public static final int FF_PROFILE_JPEG2000_CSTREAM_RESTRICTION_0 = 0;
    public static final int FF_PROFILE_JPEG2000_CSTREAM_RESTRICTION_1 = 1;
    public static final int FF_PROFILE_AAC_LOW = 1;
    public static final int CODEC_FLAG_PASS2 = 1024;
    public static final int FF_IDCT_SIMPLE = 2;
    public static final int FF_PROFILE_HEVC_MAIN_STILL_PICTURE = 3;
    public static final int CODEC_FLAG_PASS1 = 512;
    public static final int AV_EF_CAREFUL = 0x10000;
    public static final int FF_PROFILE_DTS_HD_MA = 60;
    public static final int FF_THREAD_SLICE = 2;
    public static final int FF_LOSS_DEPTH = 2;
    public static final int FF_PROFILE_UNKNOWN = -99;
    public static final int FF_PROFILE_AAC_MAIN = 0;
    public static final int FF_CMP_VSAD = 8;
    public static final int CODEC_CAP_PARAM_CHANGE = 16384;
    public static final int CODEC_CAP_SLICE_THREADS = 8192;
    public static final int FF_BUG_EDGE = 1024;
    public static final int FF_PROFILE_H264_BASELINE = 66;
    public static final int FF_IDCT_SIMPLEMMX = 3;
    public static final int FF_PROFILE_MPEG4_ADVANCED_SCALABLE_TEXTURE = 13;
    public static final int AV_GET_BUFFER_FLAG_REF = 1;
    public static final int CODEC_CAP_AUTO_THREADS = 32768;
    public static final int CODEC_CAP_SUBFRAMES = 256;
    public static final int FF_PROFILE_MPEG4_ADVANCED_CORE = 12;
    public static final int FF_PRED_PLANE = 1;
    public static final int FF_DTG_AFD_SAME = 8;
    public static final int CODEC_FLAG2_FAST = 1;
    public static final int CODEC_FLAG2_CHUNKS = 32768;
    public static final int CODEC_FLAG2_DROP_FRAME_TIMECODE = 8192;
    public static final int AV_PKT_FLAG_CORRUPT = 2;
    public static final int FF_DCT_FASTINT = 1;
    public static final int FF_BUG_MS = 8192;
    public static final int PARSER_FLAG_ONCE = 2;
    public static final int CODEC_FLAG_AC_PRED = 0x1000000;
    public static final int CODEC_FLAG_4MV = 4;
    public static final int FF_PROFILE_AAC_HE_V2 = 28;
    public static final int CODEC_FLAG_QSCALE = 2;
    public static final int FF_PROFILE_MPEG4_SIMPLE_SCALABLE = 1;
    public static final int FF_BUG_UMP4 = 8;
    public static final int FF_CMP_ZERO = 7;
    public static final int FF_CMP_VSSE = 9;
    public static final int FF_IDCT_SIMPLEARMV5TE = 16;
    public static final int FF_IDCT_FAAN = 20;
    public static final int FF_PRED_MEDIAN = 2;
    public static final int FF_CMP_NSSE = 10;
    public static final int FF_PROFILE_H264_INTRA = 2048;
    public static final int FF_PROFILE_H264_CONSTRAINED = 512;
    public static final int CODEC_FLAG2_LOCAL_HEADER = 8;
    public static final int CODEC_CAP_EXPERIMENTAL = 512;
    public static final int FF_DEBUG_QP = 16;
    public static final int CODEC_FLAG_GMC = 32;
    public static final int FF_BUG_DIRECT_BLOCKSIZE = 512;
    public static final int PARSER_FLAG_USE_CODEC_TS = 4096;
    public static final int FF_IDCT_ARM = 7;
    public static final int FF_DEBUG_RC = 2;
    public static final int FF_PRED_LEFT = 0;
    public static final int CODEC_FLAG_INPUT_PRESERVED = 256;
    public static final int FF_IDCT_IPP = 13;
    public static final int FF_EC_GUESS_MVS = 1;
    public static final int FF_DCT_MMX = 3;
    public static final int FF_PROFILE_AAC_ELD = 38;
    public static final int FF_DEBUG_PICT_INFO = 1;
    public static final int FF_COMPRESSION_DEFAULT = -1;
    public static final int CODEC_FLAG_OUTPUT_CORRUPT = 8;
    public static final int PARSER_FLAG_COMPLETE_FRAMES = 1;
    public static final int FF_PROFILE_MPEG2_HIGH = 1;
    public static final int FF_DCT_INT = 2;

    public abstract AVRational av_codec_get_pkt_timebase(AVCodecContext avcodeccontext);

    public abstract void av_codec_set_pkt_timebase(AVCodecContext avcodeccontext, AVRational avrational);

    public abstract AVCodecDescriptor av_codec_get_codec_descriptor(AVCodecContext avcodeccontext);

    public abstract void av_codec_set_codec_descriptor(AVCodecContext avcodeccontext, AVCodecDescriptor avcodecdescriptor);

    public abstract int av_codec_get_lowres(AVCodecContext avcodeccontext);

    public abstract void av_codec_set_lowres(AVCodecContext avcodeccontext, int i);

    public abstract int av_codec_get_seek_preroll(AVCodecContext avcodeccontext);

    public abstract void av_codec_set_seek_preroll(AVCodecContext avcodeccontext, int i);

    public abstract int av_codec_get_max_lowres(AVCodec avcodec);

    public abstract AVCodec av_codec_next(AVCodec avcodec);

    public abstract int avcodec_version();

    public abstract Pointer avcodec_configuration();

    public abstract Pointer avcodec_license();

    public abstract void avcodec_register(AVCodec avcodec);

    public abstract void avcodec_register_all();

    public abstract AVCodecContext avcodec_alloc_context3(AVCodec avcodec);

    public abstract int avcodec_get_context_defaults3(AVCodecContext avcodeccontext, AVCodec avcodec);

    public abstract AVClass avcodec_get_class();

    public abstract AVClass avcodec_get_frame_class();

    public abstract AVClass avcodec_get_subtitle_rect_class();

    public abstract int avcodec_copy_context(AVCodecContext avcodeccontext, AVCodecContext avcodeccontext1);
    
    public abstract Pointer avcodec_alloc_frame();
    
    //public abstract AVFrame avcodec_alloc_frame();
    
   // public abstract AVFrame.ByReference avcodec_alloc_frame();

   // public abstract void avcodec_get_frame_defaults(AVFrame avframe);
    public abstract void avcodec_get_frame_defaults(Pointer avframe);

    /**
     * @deprecated Method avcodec_free_frame is deprecated
     */

    public abstract void avcodec_free_frame(PointerByReference pointerbyreference);

    public abstract void avcodec_free_frame(AVFrame aavframe[]);

    //public abstract int avcodec_open2(AVCodecContext avcodeccontext, AVCodec avcodec, PointerByReference pointerbyreference);
    
   public abstract int avcodec_open2(Pointer avcodeccontext, Pointer avcodec, PointerByReference pointerbyreference);

    //public abstract int avcodec_open2(AVCodecContext avcodeccontext, AVCodec avcodec, AVDictionary aavdictionary[]);

    public abstract int avcodec_close(AVCodecContext avcodeccontext);

    public abstract void avsubtitle_free(AVSubtitle avsubtitle);

    public abstract void av_init_packet(AVPacket avpacket);

    public abstract int av_new_packet(AVPacket avpacket, int i);

    public abstract void av_shrink_packet(AVPacket avpacket, int i);

    public abstract int av_grow_packet(AVPacket avpacket, int i);

    /**
     * @deprecated Method av_packet_from_data is deprecated
     */

    public abstract int av_packet_from_data(AVPacket avpacket, Pointer pointer, int i);

    public abstract int av_packet_from_data(AVPacket avpacket, ByteBuffer bytebuffer, int i);

    public abstract int av_dup_packet(AVPacket avpacket);

    public abstract int av_copy_packet(AVPacket avpacket, AVPacket avpacket1);

    public abstract int av_copy_packet_side_data(AVPacket avpacket, AVPacket avpacket1);

   // public abstract void av_free_packet(AVPacket avpacket);
    public abstract void av_free_packet(Pointer avpacket);

    public abstract Pointer av_packet_new_side_data(AVPacket avpacket, int i, int j);

    public abstract int av_packet_shrink_side_data(AVPacket avpacket, int i, int j);

    /**
     * @deprecated Method av_packet_get_side_data is deprecated
     */

    public abstract Pointer av_packet_get_side_data(AVPacket avpacket, int i, IntByReference intbyreference);

    public abstract Pointer av_packet_get_side_data(AVPacket avpacket, int i, IntBuffer intbuffer);

    public abstract int av_packet_merge_side_data(AVPacket avpacket);

    public abstract int av_packet_split_side_data(AVPacket avpacket);

    /**
     * @deprecated Method av_packet_pack_dictionary is deprecated
     */

    public abstract Pointer av_packet_pack_dictionary(AVDictionary avdictionary, IntByReference intbyreference);

    public abstract Pointer av_packet_pack_dictionary(AVDictionary avdictionary, IntBuffer intbuffer);

    /**
     * @deprecated Method av_packet_unpack_dictionary is deprecated
     */

    public abstract int av_packet_unpack_dictionary(Pointer pointer, int i, PointerByReference pointerbyreference);

    public abstract int av_packet_unpack_dictionary(byte abyte0[], int i, AVDictionary aavdictionary[]);

    public abstract int av_packet_unpack_dictionary(Pointer pointer, int i, AVDictionary aavdictionary[]);

    public abstract void av_packet_free_side_data(AVPacket avpacket);

    public abstract int av_packet_ref(AVPacket avpacket, AVPacket avpacket1);

    public abstract void av_packet_unref(AVPacket avpacket);

    public abstract void av_packet_move_ref(AVPacket avpacket, AVPacket avpacket1);

    public abstract int av_packet_copy_props(AVPacket avpacket, AVPacket avpacket1);

    //public abstract AVCodec avcodec_find_decoder(int i);
    //public abstract AVCodec.ByReference avcodec_find_decoder(int i);
    
    public abstract Pointer avcodec_find_decoder(int i);

    /**
     * @deprecated Method avcodec_find_decoder_by_name is deprecated
     */

    public abstract AVCodec avcodec_find_decoder_by_name(Pointer pointer);

    public abstract AVCodec avcodec_find_decoder_by_name(String s);

    public abstract int avcodec_default_get_buffer2(AVCodecContext avcodeccontext, AVFrame avframe, int i);

    public abstract int avcodec_get_edge_width();

    /**
     * @deprecated Method avcodec_align_dimensions is deprecated
     */

    public abstract void avcodec_align_dimensions(AVCodecContext avcodeccontext, IntByReference intbyreference, IntByReference intbyreference1);

    public abstract void avcodec_align_dimensions(AVCodecContext avcodeccontext, IntBuffer intbuffer, IntBuffer intbuffer1);

    /**
     * @deprecated Method avcodec_align_dimensions2 is deprecated
     */

    public abstract void avcodec_align_dimensions2(AVCodecContext avcodeccontext, IntByReference intbyreference, IntByReference intbyreference1, IntByReference intbyreference2);

    public abstract void avcodec_align_dimensions2(AVCodecContext avcodeccontext, IntBuffer intbuffer, IntBuffer intbuffer1, IntBuffer intbuffer2);

    /**
     * @deprecated Method avcodec_enum_to_chroma_pos is deprecated
     */

    public abstract int avcodec_enum_to_chroma_pos(IntByReference intbyreference, IntByReference intbyreference1, int i);

    public abstract int avcodec_enum_to_chroma_pos(IntBuffer intbuffer, IntBuffer intbuffer1, int i);

    public abstract int avcodec_chroma_pos_to_enum(int i, int j);

    /**
     * @deprecated Method avcodec_decode_audio4 is deprecated
     */

    //public abstract int avcodec_decode_audio4(AVCodecContext avcodeccontext, AVFrame avframe, IntByReference intbyreference, AVPacket avpacket);
    public abstract int avcodec_decode_audio4(Pointer avcodeccontext, Pointer avframe, IntByReference intbyreference, AVPacket avpacket);

    public abstract int avcodec_decode_audio4(AVCodecContext avcodeccontext, AVFrame avframe, IntBuffer intbuffer, AVPacket avpacket);

   

    public abstract int avcodec_decode_video2(AVCodecContext avcodeccontext, Pointer avframe, IntByReference intbyreference, AVPacket avpacket);

    //public abstract int avcodec_decode_video2(AVCodecContext avcodeccontext, AVFrame avframe, IntBuffer intbuffer, AVPacket avpacket);

    /**
     * @deprecated Method avcodec_decode_subtitle2 is deprecated
     */

    public abstract int avcodec_decode_subtitle2(AVCodecContext avcodeccontext, AVSubtitle avsubtitle, IntByReference intbyreference, AVPacket avpacket);

    public abstract int avcodec_decode_subtitle2(AVCodecContext avcodeccontext, AVSubtitle avsubtitle, IntBuffer intbuffer, AVPacket avpacket);

    public abstract AVCodecParser av_parser_next(AVCodecParser avcodecparser);

    public abstract void av_register_codec_parser(AVCodecParser avcodecparser);

    public abstract AVCodecParserContext av_parser_init(int i);

    /**
     * @deprecated Method av_parser_parse2 is deprecated
     */

    public abstract int av_parser_parse2(AVCodecParserContext avcodecparsercontext, AVCodecContext avcodeccontext, PointerByReference pointerbyreference, IntByReference intbyreference, Pointer pointer, int i, long l, long l1, long l2);

    public abstract int av_parser_parse2(AVCodecParserContext avcodecparsercontext, AVCodecContext avcodeccontext, PointerByReference pointerbyreference, IntBuffer intbuffer, byte abyte0[], int i, long l, long l1, long l2);

    /**
     * @deprecated Method av_parser_change is deprecated
     */

    public abstract int av_parser_change(AVCodecParserContext avcodecparsercontext, AVCodecContext avcodeccontext, PointerByReference pointerbyreference, IntByReference intbyreference, Pointer pointer, int i, int j);

    /**
     * @deprecated Method av_parser_change is deprecated
     */

    public abstract int av_parser_change(AVCodecParserContext avcodecparsercontext, AVCodecContext avcodeccontext, PointerByReference pointerbyreference, IntBuffer intbuffer, byte abyte0[], int i, int j);

    public abstract void av_parser_close(AVCodecParserContext avcodecparsercontext);

    public abstract AVCodec avcodec_find_encoder(int i);

    /**
     * @deprecated Method avcodec_find_encoder_by_name is deprecated
     */

    public abstract AVCodec avcodec_find_encoder_by_name(Pointer pointer);

    public abstract AVCodec avcodec_find_encoder_by_name(String s);

    /**
     * @deprecated Method avcodec_encode_audio2 is deprecated
     */

    public abstract int avcodec_encode_audio2(AVCodecContext avcodeccontext, AVPacket avpacket, AVFrame avframe, IntByReference intbyreference);

    public abstract int avcodec_encode_audio2(AVCodecContext avcodeccontext, AVPacket avpacket, AVFrame aavframe[], IntBuffer intbuffer);

    /**
     * @deprecated Method avcodec_encode_video2 is deprecated
     */

    public abstract int avcodec_encode_video2(AVCodecContext avcodeccontext, AVPacket avpacket, AVFrame avframe, IntByReference intbyreference);

    public abstract int avcodec_encode_video2(AVCodecContext avcodeccontext, AVPacket avpacket, AVFrame aavframe[], IntBuffer intbuffer);

    /**
     * @deprecated Method avcodec_encode_subtitle is deprecated
     */

    public abstract int avcodec_encode_subtitle(AVCodecContext avcodeccontext, Pointer pointer, int i, AVSubtitle avsubtitle);

    public abstract int avcodec_encode_subtitle(AVCodecContext avcodeccontext, ByteBuffer bytebuffer, int i, AVSubtitle avsubtitle);

    public abstract int avpicture_alloc(AVPicture avpicture, int i, int j, int k);

    public abstract void avpicture_free(AVPicture avpicture);

    /**
     * @deprecated Method avpicture_fill is deprecated
     */

    //public abstract int avpicture_fill(AVPicture avpicture, Pointer pointer, int i, int j, int k);

    public abstract int avpicture_fill(AVPicture avpicture, byte abyte0[], int i, int j, int k);
    //public abstract int avpicture_fill(AVPicture avpicture, Pointer pointer, int i, int j, int k);
    //public abstract int avpicture_fill(AVFrame avpicture, Pointer pointer, int i, int j, int k);
    
    public abstract int avpicture_fill(Pointer avpicture, Pointer pointer, int i, int j, int k);

    /**
     * @deprecated Method avpicture_layout is deprecated
     */

    public abstract int avpicture_layout(AVPicture avpicture, int i, int j, int k, Pointer pointer, int l);

    public abstract int avpicture_layout(AVPicture avpicture, int i, int j, int k, ByteBuffer bytebuffer, int l);

    public abstract int avpicture_get_size(int i, int j, int k);

    public abstract void av_picture_copy(AVPicture avpicture, AVPicture avpicture1, int i, int j, int k);

    public abstract int av_picture_crop(AVPicture avpicture, AVPicture avpicture1, int i, int j, int k);

    /**
     * @deprecated Method av_picture_pad is deprecated
     */

    public abstract int av_picture_pad(AVPicture avpicture, AVPicture avpicture1, int i, int j, int k, int l, int i1, 
            int j1, int k1, IntByReference intbyreference);

    public abstract int av_picture_pad(AVPicture avpicture, AVPicture avpicture1, int i, int j, int k, int l, int i1, 
            int j1, int k1, IntBuffer intbuffer);

    /**
     * @deprecated Method avcodec_get_chroma_sub_sample is deprecated
     */

    public abstract void avcodec_get_chroma_sub_sample(int i, IntByReference intbyreference, IntByReference intbyreference1);

    public abstract void avcodec_get_chroma_sub_sample(int i, IntBuffer intbuffer, IntBuffer intbuffer1);

    public abstract int avcodec_pix_fmt_to_codec_tag(int i);

    public abstract int avcodec_get_pix_fmt_loss(int i, int j, int k);

    /**
     * @deprecated Method avcodec_find_best_pix_fmt_of_list is deprecated
     */

    public abstract int avcodec_find_best_pix_fmt_of_list(IntByReference intbyreference, int i, int j, IntByReference intbyreference1);

    public abstract int avcodec_find_best_pix_fmt_of_list(IntBuffer intbuffer, int i, int j, IntBuffer intbuffer1);

    /**
     * @deprecated Method avcodec_find_best_pix_fmt_of_2 is deprecated
     */

    public abstract int avcodec_find_best_pix_fmt_of_2(int i, int j, int k, int l, IntByReference intbyreference);

    public abstract int avcodec_find_best_pix_fmt_of_2(int i, int j, int k, int l, IntBuffer intbuffer);

    /**
     * @deprecated Method avcodec_find_best_pix_fmt2 is deprecated
     */

    public abstract int avcodec_find_best_pix_fmt2(int i, int j, int k, int l, IntByReference intbyreference);

    public abstract int avcodec_find_best_pix_fmt2(int i, int j, int k, int l, IntBuffer intbuffer);

    /**
     * @deprecated Method avcodec_default_get_format is deprecated
     */

    public abstract int avcodec_default_get_format(AVCodecContext avcodeccontext, IntByReference intbyreference);

    public abstract int avcodec_default_get_format(AVCodecContext avcodeccontext, IntBuffer intbuffer);

    /**
     * @deprecated Method av_get_codec_tag_string is deprecated
     */

  // public abstract NativeSize av_get_codec_tag_string(Pointer pointer, NativeSize nativesize, int i);

   // public abstract NativeSize av_get_codec_tag_string(ByteBuffer bytebuffer, NativeSize nativesize, int i);

    /**
     * @deprecated Method avcodec_string is deprecated
     */

    public abstract void avcodec_string(Pointer pointer, int i, AVCodecContext avcodeccontext, int j);

    public abstract void avcodec_string(ByteBuffer bytebuffer, int i, AVCodecContext avcodeccontext, int j);

    public abstract Pointer av_get_profile_name(AVCodec avcodec, int i);

    /**
     * @deprecated Method avcodec_default_execute is deprecated
     */

    public abstract int avcodec_default_execute(AVCodecContext avcodeccontext, avcodec_default_execute_func_callback avcodec_default_execute_func_callback1, Pointer pointer, IntByReference intbyreference, int i, int j);

    public abstract int avcodec_default_execute(AVCodecContext avcodeccontext, avcodec_default_execute_func_callback avcodec_default_execute_func_callback1, Pointer pointer, IntBuffer intbuffer, int i, int j);

    /**
     * @deprecated Method avcodec_default_execute2 is deprecated
     */

    public abstract int avcodec_default_execute2(AVCodecContext avcodeccontext, avcodec_default_execute2_func_callback avcodec_default_execute2_func_callback1, Pointer pointer, IntByReference intbyreference, int i);

    public abstract int avcodec_default_execute2(AVCodecContext avcodeccontext, avcodec_default_execute2_func_callback avcodec_default_execute2_func_callback1, Pointer pointer, IntBuffer intbuffer, int i);

    /**
     * @deprecated Method avcodec_fill_audio_frame is deprecated
     */

    public abstract int avcodec_fill_audio_frame(AVFrame avframe, int i, int j, Pointer pointer, int k, int l);

    public abstract int avcodec_fill_audio_frame(AVFrame avframe, int i, int j, byte abyte0[], int k, int l);

  

    public abstract int av_get_bits_per_sample(int i);

    public abstract int av_get_pcm_codec(int i, int j);

    public abstract int av_get_exact_bits_per_sample(int i);

    public abstract int av_get_audio_frame_duration(AVCodecContext avcodeccontext, int i);

    public abstract void av_register_bitstream_filter(AVBitStreamFilter avbitstreamfilter);

    /**
     * @deprecated Method av_bitstream_filter_init is deprecated
     */

    public abstract AVBitStreamFilterContext av_bitstream_filter_init(Pointer pointer);

    public abstract AVBitStreamFilterContext av_bitstream_filter_init(String s);

    /**
     * @deprecated Method av_bitstream_filter_filter is deprecated
     */

    public abstract int av_bitstream_filter_filter(AVBitStreamFilterContext avbitstreamfiltercontext, AVCodecContext avcodeccontext, Pointer pointer, PointerByReference pointerbyreference, IntByReference intbyreference, Pointer pointer1, int i, 
            int j);

    public abstract int av_bitstream_filter_filter(AVBitStreamFilterContext avbitstreamfiltercontext, AVCodecContext avcodeccontext, String s, PointerByReference pointerbyreference, IntBuffer intbuffer, byte abyte0[], int i, 
            int j);

    public abstract void av_bitstream_filter_close(AVBitStreamFilterContext avbitstreamfiltercontext);

    public abstract AVBitStreamFilter av_bitstream_filter_next(AVBitStreamFilter avbitstreamfilter);

    /**
     * @deprecated Method av_fast_padded_malloc is deprecated
     */

    //public abstract void av_fast_padded_malloc(Pointer pointer, IntByReference intbyreference, NativeSize nativesize);

    //public abstract void av_fast_padded_malloc(Pointer pointer, IntBuffer intbuffer, NativeSize nativesize);

    /**
     * @deprecated Method av_fast_padded_mallocz is deprecated
     */

    //public abstract void av_fast_padded_mallocz(Pointer pointer, IntByReference intbyreference, NativeSize nativesize);

    //public abstract void av_fast_padded_mallocz(Pointer pointer, IntBuffer intbuffer, NativeSize nativesize);

    /**
     * @deprecated Method av_xiphlacing is deprecated
     */

    public abstract int av_xiphlacing(Pointer pointer, int i);

    public abstract int av_xiphlacing(ByteBuffer bytebuffer, int i);

    public abstract void av_register_hwaccel(AVHWAccel avhwaccel);

    public abstract AVHWAccel av_hwaccel_next(AVHWAccel avhwaccel);

    public abstract int av_lockmgr_register(av_lockmgr_register_cb_callback av_lockmgr_register_cb_callback1);

    public abstract int avcodec_get_type(int i);

    public abstract Pointer avcodec_get_name(int i);

    public abstract int avcodec_is_open(AVCodecContext avcodeccontext);

    public abstract int av_codec_is_encoder(AVCodec avcodec);

    public abstract int av_codec_is_decoder(AVCodec avcodec);

    public abstract AVCodecDescriptor avcodec_descriptor_get(int i);

    public abstract AVCodecDescriptor avcodec_descriptor_next(AVCodecDescriptor avcodecdescriptor);

    /**
     * @deprecated Method avcodec_descriptor_get_by_name is deprecated
     */

    public abstract AVCodecDescriptor avcodec_descriptor_get_by_name(Pointer pointer);

    public abstract AVCodecDescriptor avcodec_descriptor_get_by_name(String s);
    
    
    /**
     * 此方法来自avcodec.h
     * @param avcodecctx
     */
    public abstract void avcodec_flush_buffers(Pointer avcodecctx);
    
   

}
