package com.google.android.exoplayer2.p381t0;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9566t;

/* renamed from: com.google.android.exoplayer2.t0.a */
/* compiled from: MediaCodecInfo */
public final class C9270a {

    /* renamed from: a */
    public final String f21082a;

    /* renamed from: b */
    public final String f21083b;

    /* renamed from: c */
    public final String f21084c;

    /* renamed from: d */
    public final CodecCapabilities f21085d;

    /* renamed from: e */
    public final boolean f21086e;

    /* renamed from: f */
    public final boolean f21087f;

    /* renamed from: g */
    public final boolean f21088g;

    /* renamed from: h */
    private final boolean f21089h;

    private C9270a(String str, String str2, String str3, CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        Assertions.checkNotNull(str);
        this.f21082a = str;
        this.f21083b = str2;
        this.f21084c = str3;
        this.f21085d = codecCapabilities;
        this.f21088g = z;
        boolean z4 = true;
        this.f21086e = !z2 && codecCapabilities != null && m28029a(codecCapabilities);
        if (codecCapabilities != null) {
            boolean e = m28037e(codecCapabilities);
        }
        if (!z3 && (codecCapabilities == null || !m28034c(codecCapabilities))) {
            z4 = false;
        }
        this.f21087f = z4;
        this.f21089h = C9566t.m29519l(str2);
    }

    /* renamed from: a */
    public static C9270a m28028a(String str, String str2, String str3, CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        C9270a aVar = new C9270a(str, str2, str3, codecCapabilities, false, z, z2);
        return aVar;
    }

    /* renamed from: c */
    private void m28033c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        String str2 = "] [";
        sb.append(str2);
        sb.append(this.f21082a);
        sb.append(", ");
        sb.append(this.f21083b);
        sb.append(str2);
        sb.append(Util.DEVICE_DEBUG_INFO);
        sb.append("]");
        Log.m29495a("MediaCodecInfo", sb.toString());
    }

    /* renamed from: d */
    public static C9270a m28035d(String str) {
        C9270a aVar = new C9270a(str, null, null, null, true, false, false);
        return aVar;
    }

    /* renamed from: e */
    private static boolean m28037e(CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 21 && m28038f(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: f */
    private static boolean m28038f(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: b */
    public boolean mo24015b(Format format) {
        if (this.f21089h) {
            return this.f21086e;
        }
        Pair b = C9275d.m28137b(format.f18346Y);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    public String toString() {
        return this.f21082a;
    }

    /* renamed from: c */
    private static boolean m28034c(CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 21 && m28036d(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: d */
    private static boolean m28036d(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: a */
    public CodecProfileLevel[] mo24013a() {
        CodecCapabilities codecCapabilities = this.f21085d;
        if (codecCapabilities != null) {
            CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
            if (codecProfileLevelArr != null) {
                return codecProfileLevelArr;
            }
        }
        return new CodecProfileLevel[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (mo24008a(r7) == false) goto L_0x006d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24010a(com.google.android.exoplayer2.Format r7) throws com.google.android.exoplayer2.p381t0.C9275d.C9278c {
        /*
            r6 = this;
            java.lang.String r0 = r7.f18346Y
            boolean r0 = r6.mo24012a(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r0 = r6.f21089h
            r2 = 21
            r3 = 1
            if (r0 == 0) goto L_0x0053
            int r0 = r7.f18355g0
            if (r0 <= 0) goto L_0x0052
            int r4 = r7.f18356h0
            if (r4 > 0) goto L_0x001a
            goto L_0x0052
        L_0x001a:
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r5 < r2) goto L_0x0026
            float r7 = r7.f18357i0
            double r1 = (double) r7
            boolean r7 = r6.mo24009a(r0, r4, r1)
            return r7
        L_0x0026:
            int r0 = r0 * r4
            int r2 = com.google.android.exoplayer2.p381t0.C9275d.m28136b()
            if (r0 > r2) goto L_0x002f
            r1 = 1
        L_0x002f:
            if (r1 != 0) goto L_0x0051
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "legacyFrameSize, "
            r0.append(r2)
            int r2 = r7.f18355g0
            r0.append(r2)
            java.lang.String r2 = "x"
            r0.append(r2)
            int r7 = r7.f18356h0
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.m28033c(r7)
        L_0x0051:
            return r1
        L_0x0052:
            return r3
        L_0x0053:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            if (r0 < r2) goto L_0x006c
            int r0 = r7.f18364p0
            r2 = -1
            if (r0 == r2) goto L_0x0062
            boolean r0 = r6.mo24014b(r0)
            if (r0 == 0) goto L_0x006d
        L_0x0062:
            int r7 = r7.f18363o0
            if (r7 == r2) goto L_0x006c
            boolean r7 = r6.mo24008a(r7)
            if (r7 == 0) goto L_0x006d
        L_0x006c:
            r1 = 1
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9270a.mo24010a(com.google.android.exoplayer2.Format):boolean");
    }

    @TargetApi(21)
    /* renamed from: b */
    public boolean mo24014b(int i) {
        CodecCapabilities codecCapabilities = this.f21085d;
        if (codecCapabilities == null) {
            m28033c("sampleRate.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m28033c("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("sampleRate.support, ");
            sb.append(i);
            m28033c(sb.toString());
            return false;
        }
    }

    /* renamed from: b */
    private void m28031b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedSupport [");
        sb.append(str);
        String str2 = "] [";
        sb.append(str2);
        sb.append(this.f21082a);
        sb.append(", ");
        sb.append(this.f21083b);
        sb.append(str2);
        sb.append(Util.DEVICE_DEBUG_INFO);
        sb.append("]");
        Log.m29495a("MediaCodecInfo", sb.toString());
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m28032b(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: a */
    public boolean mo24012a(String str) {
        CodecProfileLevel[] a;
        if (str == null || this.f21083b == null) {
            return true;
        }
        String d = C9566t.m29511d(str);
        if (d == null) {
            return true;
        }
        String str2 = ", ";
        if (!this.f21083b.equals(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(str2);
            sb.append(d);
            m28033c(sb.toString());
            return false;
        }
        Pair b = C9275d.m28137b(str);
        if (b == null) {
            return true;
        }
        int intValue = ((Integer) b.first).intValue();
        int intValue2 = ((Integer) b.second).intValue();
        if (!this.f21089h && intValue != 42) {
            return true;
        }
        for (CodecProfileLevel codecProfileLevel : mo24013a()) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(str2);
        sb2.append(d);
        m28033c(sb2.toString());
        return false;
    }

    /* renamed from: a */
    public boolean mo24011a(Format format, Format format2, boolean z) {
        boolean z2 = true;
        if (this.f21089h) {
            if (!format.f18349b0.equals(format2.f18349b0) || format.f18358j0 != format2.f18358j0 || ((!this.f21086e && !(format.f18355g0 == format2.f18355g0 && format.f18356h0 == format2.f18356h0)) || ((z || format2.f18362n0 != null) && !Util.m29414a((Object) format.f18362n0, (Object) format2.f18362n0)))) {
                z2 = false;
            }
            return z2;
        }
        if ("audio/mp4a-latm".equals(this.f21083b) && format.f18349b0.equals(format2.f18349b0) && format.f18363o0 == format2.f18363o0 && format.f18364p0 == format2.f18364p0) {
            Pair b = C9275d.m28137b(format.f18346Y);
            Pair b2 = C9275d.m28137b(format2.f18346Y);
            if (!(b == null || b2 == null)) {
                int intValue = ((Integer) b.first).intValue();
                int intValue2 = ((Integer) b2.first).intValue();
                if (!(intValue == 42 && intValue2 == 42)) {
                    z2 = false;
                }
                return z2;
            }
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean mo24009a(int i, int i2, double d) {
        CodecCapabilities codecCapabilities = this.f21085d;
        if (codecCapabilities == null) {
            m28033c("sizeAndRate.caps");
            return false;
        }
        VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m28033c("sizeAndRate.vCaps");
            return false;
        }
        if (!m28030a(videoCapabilities, i, i2, d)) {
            String str = "x";
            if (i >= i2 || !m28030a(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder();
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append(str);
                sb.append(i2);
                sb.append(str);
                sb.append(d);
                m28033c(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append(str);
            sb2.append(i2);
            sb2.append(str);
            sb2.append(d);
            m28031b(sb2.toString());
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: a */
    public Point mo24007a(int i, int i2) {
        CodecCapabilities codecCapabilities = this.f21085d;
        if (codecCapabilities == null) {
            m28033c("align.caps");
            return null;
        }
        VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m28033c("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.m29381a(i, widthAlignment) * widthAlignment, Util.m29381a(i2, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean mo24008a(int i) {
        CodecCapabilities codecCapabilities = this.f21085d;
        if (codecCapabilities == null) {
            m28033c("channelCount.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m28033c("channelCount.aCaps");
            return false;
        } else if (m28027a(this.f21082a, this.f21083b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("channelCount.support, ");
            sb.append(i);
            m28033c(sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    private static int m28027a(String str, String str2, int i) {
        if (i > 1 || ((Util.SDK_INT >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append("]");
        Log.m29500d("MediaCodecInfo", sb.toString());
        return i2;
    }

    /* renamed from: a */
    private static boolean m28029a(CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 19 && m28032b(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static boolean m28030a(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, Math.floor(d));
    }
}
