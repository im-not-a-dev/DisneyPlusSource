package com.google.android.exoplayer2.p393v0;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.v0.t */
/* compiled from: MimeTypes */
public final class C9566t {

    /* renamed from: a */
    private static final ArrayList<C9567a> f22305a = new ArrayList<>();

    /* renamed from: com.google.android.exoplayer2.v0.t$a */
    /* compiled from: MimeTypes */
    private static final class C9567a {

        /* renamed from: a */
        public final String f22306a;

        /* renamed from: b */
        public final String f22307b;

        /* renamed from: c */
        public final int f22308c;
    }

    /* renamed from: a */
    public static String m29507a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i != 64) {
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return "audio/mp4a-latm";
    }

    /* renamed from: a */
    public static String m29508a(String str) {
        if (str == null) {
            return null;
        }
        for (String d : C9554k0.m29456j(str)) {
            String d2 = m29511d(d);
            if (d2 != null && m29517j(d2)) {
                return d2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m29509b(String str) {
        int size = f22305a.size();
        for (int i = 0; i < size; i++) {
            C9567a aVar = (C9567a) f22305a.get(i);
            if (str.startsWith(aVar.f22307b)) {
                return aVar.f22306a;
            }
        }
        return null;
    }

    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29510c(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 6
            r2 = 5
            r3 = 0
            switch(r0) {
                case -2123537834: goto L_0x0047;
                case -1095064472: goto L_0x003d;
                case 187078296: goto L_0x0033;
                case 187078297: goto L_0x0029;
                case 1504578661: goto L_0x001f;
                case 1505942594: goto L_0x0015;
                case 1556697186: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0051
        L_0x000b:
            java.lang.String r0 = "audio/true-hd"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0051
            r4 = 6
            goto L_0x0052
        L_0x0015:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x001f:
            java.lang.String r0 = "audio/eac3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0029:
            java.lang.String r0 = "audio/ac4"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0033:
            java.lang.String r0 = "audio/ac3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x003d:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0047:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            switch(r4) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0064;
                case 2: goto L_0x0061;
                case 3: goto L_0x005e;
                case 4: goto L_0x005c;
                case 5: goto L_0x0059;
                case 6: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            return r3
        L_0x0056:
            r4 = 14
            return r4
        L_0x0059:
            r4 = 8
            return r4
        L_0x005c:
            r4 = 7
            return r4
        L_0x005e:
            r4 = 17
            return r4
        L_0x0061:
            r4 = 18
            return r4
        L_0x0064:
            return r1
        L_0x0065:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p393v0.C9566t.m29510c(java.lang.String):int");
    }

    /* renamed from: d */
    public static String m29511d(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String k = C9554k0.m29457k(str.trim());
        if (k.startsWith("avc1") || k.startsWith("avc3")) {
            return "video/avc";
        }
        if (k.startsWith("hev1") || k.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (k.startsWith("dvav") || k.startsWith("dva1") || k.startsWith("dvhe") || k.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (k.startsWith("av01")) {
            return "video/av01";
        }
        if (k.startsWith("vp9") || k.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (k.startsWith("vp8") || k.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (k.startsWith("mp4a")) {
            if (k.startsWith("mp4a.")) {
                String substring = k.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = m29507a(Integer.parseInt(C9554k0.m29458l(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if (str2 == null) {
                str2 = "audio/mp4a-latm";
            }
            return str2;
        } else if (k.startsWith("ac-3") || k.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (k.startsWith("ec-3") || k.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (k.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (k.startsWith("ac-4") || k.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (k.startsWith("dtsc") || k.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (k.startsWith("dtsh") || k.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (k.startsWith("opus")) {
                return "audio/opus";
            }
            if (k.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (k.startsWith("flac")) {
                return "audio/flac";
            }
            return m29509b(k);
        }
    }

    /* renamed from: e */
    private static String m29512e(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: f */
    public static int m29513f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m29517j(str)) {
            return 1;
        }
        if (m29519l(str)) {
            return 2;
        }
        if (m29518k(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        return m29514g(str);
    }

    /* renamed from: g */
    private static int m29514g(String str) {
        int size = f22305a.size();
        for (int i = 0; i < size; i++) {
            C9567a aVar = (C9567a) f22305a.get(i);
            if (str.equals(aVar.f22306a)) {
                return aVar.f22308c;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static int m29515h(String str) {
        return m29513f(m29511d(str));
    }

    /* renamed from: i */
    public static String m29516i(String str) {
        if (str == null) {
            return null;
        }
        for (String d : C9554k0.m29456j(str)) {
            String d2 = m29511d(d);
            if (d2 != null && m29519l(d2)) {
                return d2;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m29517j(String str) {
        return "audio".equals(m29512e(str));
    }

    /* renamed from: k */
    public static boolean m29518k(String str) {
        return "text".equals(m29512e(str));
    }

    /* renamed from: l */
    public static boolean m29519l(String str) {
        return "video".equals(m29512e(str));
    }
}
