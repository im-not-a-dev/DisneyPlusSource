package com.google.android.exoplayer2.p381t0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9563q;
import com.google.android.exoplayer2.p393v0.C9566t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.danlew.android.joda.DateUtils;

@SuppressLint({"InlinedApi"})
/* renamed from: com.google.android.exoplayer2.t0.d */
/* compiled from: MediaCodecUtil */
public final class C9275d {

    /* renamed from: a */
    private static final Pattern f21153a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<C9277b, List<C9270a>> f21154b = new HashMap<>();

    /* renamed from: c */
    private static final SparseIntArray f21155c = new SparseIntArray();

    /* renamed from: d */
    private static final SparseIntArray f21156d = new SparseIntArray();

    /* renamed from: e */
    private static final Map<String, Integer> f21157e = new HashMap();

    /* renamed from: f */
    private static final Map<String, Integer> f21158f = new HashMap();

    /* renamed from: g */
    private static final Map<String, Integer> f21159g = new HashMap();

    /* renamed from: h */
    private static final SparseIntArray f21160h = new SparseIntArray();

    /* renamed from: i */
    private static int f21161i = -1;

    /* renamed from: com.google.android.exoplayer2.t0.d$b */
    /* compiled from: MediaCodecUtil */
    private static final class C9277b {

        /* renamed from: a */
        public final String f21162a;

        /* renamed from: b */
        public final boolean f21163b;

        /* renamed from: c */
        public final boolean f21164c;

        public C9277b(String str, boolean z, boolean z2) {
            this.f21162a = str;
            this.f21163b = z;
            this.f21164c = z2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C9277b.class) {
                return false;
            }
            C9277b bVar = (C9277b) obj;
            if (!(TextUtils.equals(this.f21162a, bVar.f21162a) && this.f21163b == bVar.f21163b && this.f21164c == bVar.f21164c)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            String str = this.f21162a;
            int i = 1231;
            int hashCode = ((((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f21163b ? 1231 : 1237)) * 31;
            if (!this.f21164c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.t0.d$c */
    /* compiled from: MediaCodecUtil */
    public static class C9278c extends Exception {
        private C9278c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.t0.d$d */
    /* compiled from: MediaCodecUtil */
    private interface C9279d {
        /* renamed from: a */
        int mo24031a();

        /* renamed from: a */
        MediaCodecInfo mo24032a(int i);

        /* renamed from: a */
        boolean mo24033a(String str, String str2, CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo24034b();

        /* renamed from: b */
        boolean mo24035b(String str, String str2, CodecCapabilities codecCapabilities);
    }

    /* renamed from: com.google.android.exoplayer2.t0.d$e */
    /* compiled from: MediaCodecUtil */
    private static final class C9280e implements C9279d {
        private C9280e() {
        }

        /* renamed from: a */
        public int mo24031a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: b */
        public boolean mo24034b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo24035b(String str, String str2, CodecCapabilities codecCapabilities) {
            return false;
        }

        /* renamed from: a */
        public MediaCodecInfo mo24032a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: a */
        public boolean mo24033a(String str, String str2, CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    @TargetApi(21)
    /* renamed from: com.google.android.exoplayer2.t0.d$f */
    /* compiled from: MediaCodecUtil */
    private static final class C9281f implements C9279d {

        /* renamed from: a */
        private final int f21165a;

        /* renamed from: b */
        private MediaCodecInfo[] f21166b;

        public C9281f(boolean z, boolean z2) {
            this.f21165a = (z || z2) ? 1 : 0;
        }

        /* renamed from: c */
        private void m28153c() {
            if (this.f21166b == null) {
                this.f21166b = new MediaCodecList(this.f21165a).getCodecInfos();
            }
        }

        /* renamed from: a */
        public int mo24031a() {
            m28153c();
            return this.f21166b.length;
        }

        /* renamed from: b */
        public boolean mo24034b() {
            return true;
        }

        /* renamed from: b */
        public boolean mo24035b(String str, String str2, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        /* renamed from: a */
        public MediaCodecInfo mo24032a(int i) {
            m28153c();
            return this.f21166b[i];
        }

        /* renamed from: a */
        public boolean mo24033a(String str, String str2, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.t0.d$g */
    /* compiled from: MediaCodecUtil */
    private static final class C9282g implements Comparator<C9270a> {
        private C9282g() {
        }

        /* renamed from: a */
        public int compare(C9270a aVar, C9270a aVar2) {
            return m28159a(aVar) - m28159a(aVar2);
        }

        /* renamed from: a */
        private static int m28159a(C9270a aVar) {
            return aVar.f21082a.startsWith("OMX.google") ? -1 : 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.t0.d$h */
    /* compiled from: MediaCodecUtil */
    private static final class C9283h implements Comparator<C9270a> {
        private C9283h() {
        }

        /* renamed from: a */
        public int compare(C9270a aVar, C9270a aVar2) {
            return m28161a(aVar) - m28161a(aVar2);
        }

        /* renamed from: a */
        private static int m28161a(C9270a aVar) {
            String str = aVar.f21082a;
            if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                return -1;
            }
            return (C9554k0.f22281a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
        }
    }

    static {
        SparseIntArray sparseIntArray = f21155c;
        Integer valueOf = Integer.valueOf(1);
        sparseIntArray.put(66, 1);
        SparseIntArray sparseIntArray2 = f21155c;
        Integer valueOf2 = Integer.valueOf(2);
        sparseIntArray2.put(77, 2);
        SparseIntArray sparseIntArray3 = f21155c;
        Integer valueOf3 = Integer.valueOf(4);
        sparseIntArray3.put(88, 4);
        SparseIntArray sparseIntArray4 = f21155c;
        Integer valueOf4 = Integer.valueOf(8);
        sparseIntArray4.put(100, 8);
        SparseIntArray sparseIntArray5 = f21155c;
        Integer valueOf5 = Integer.valueOf(16);
        sparseIntArray5.put(110, 16);
        f21155c.put(122, 32);
        SparseIntArray sparseIntArray6 = f21155c;
        Integer valueOf6 = Integer.valueOf(64);
        sparseIntArray6.put(244, 64);
        f21156d.put(10, 1);
        f21156d.put(11, 4);
        f21156d.put(12, 8);
        f21156d.put(13, 16);
        f21156d.put(20, 32);
        f21156d.put(21, 64);
        f21156d.put(22, 128);
        SparseIntArray sparseIntArray7 = f21156d;
        Integer valueOf7 = Integer.valueOf(256);
        sparseIntArray7.put(30, 256);
        f21156d.put(31, DateUtils.FORMAT_NO_NOON);
        f21156d.put(32, 1024);
        f21156d.put(40, DateUtils.FORMAT_NO_MIDNIGHT);
        f21156d.put(41, 4096);
        f21156d.put(42, ContentServiceClientExtras.URL_SIZE_LIMIT);
        f21156d.put(50, DateUtils.FORMAT_ABBREV_TIME);
        f21156d.put(51, DateUtils.FORMAT_ABBREV_WEEKDAY);
        f21156d.put(52, DateUtils.FORMAT_ABBREV_MONTH);
        f21157e.put("L30", valueOf);
        f21157e.put("L60", valueOf3);
        f21157e.put("L63", valueOf5);
        f21157e.put("L90", valueOf6);
        f21157e.put("L93", valueOf7);
        f21157e.put("L120", Integer.valueOf(1024));
        f21157e.put("L123", Integer.valueOf(4096));
        f21157e.put("L150", Integer.valueOf(DateUtils.FORMAT_ABBREV_TIME));
        f21157e.put("L153", Integer.valueOf(DateUtils.FORMAT_ABBREV_MONTH));
        f21157e.put("L156", Integer.valueOf(DateUtils.FORMAT_ABBREV_RELATIVE));
        f21157e.put("L180", Integer.valueOf(1048576));
        f21157e.put("L183", Integer.valueOf(4194304));
        f21157e.put("L186", Integer.valueOf(16777216));
        f21157e.put("H30", valueOf2);
        f21157e.put("H60", valueOf4);
        f21157e.put("H63", Integer.valueOf(32));
        f21157e.put("H90", Integer.valueOf(128));
        f21157e.put("H93", Integer.valueOf(DateUtils.FORMAT_NO_NOON));
        f21157e.put("H120", Integer.valueOf(DateUtils.FORMAT_NO_MIDNIGHT));
        f21157e.put("H123", Integer.valueOf(ContentServiceClientExtras.URL_SIZE_LIMIT));
        f21157e.put("H150", Integer.valueOf(DateUtils.FORMAT_ABBREV_WEEKDAY));
        f21157e.put("H153", Integer.valueOf(DateUtils.FORMAT_NUMERIC_DATE));
        f21157e.put("H156", Integer.valueOf(DateUtils.FORMAT_ABBREV_ALL));
        f21157e.put("H180", Integer.valueOf(2097152));
        f21157e.put("H183", Integer.valueOf(8388608));
        f21157e.put("H186", Integer.valueOf(33554432));
        f21158f.put("00", valueOf);
        f21158f.put("01", valueOf2);
        f21158f.put("02", valueOf3);
        f21158f.put("03", valueOf4);
        f21158f.put("04", valueOf5);
        f21158f.put("05", Integer.valueOf(32));
        f21158f.put("06", valueOf6);
        f21158f.put("07", Integer.valueOf(128));
        f21158f.put("08", valueOf7);
        f21158f.put("09", Integer.valueOf(DateUtils.FORMAT_NO_NOON));
        f21159g.put("01", valueOf);
        f21159g.put("02", valueOf2);
        f21159g.put("03", valueOf3);
        f21159g.put("04", valueOf4);
        f21159g.put("05", valueOf5);
        f21159g.put("06", Integer.valueOf(32));
        f21159g.put("07", valueOf6);
        f21159g.put("08", Integer.valueOf(128));
        f21159g.put("09", valueOf7);
        f21160h.put(1, 1);
        f21160h.put(2, 2);
        f21160h.put(3, 3);
        f21160h.put(4, 4);
        f21160h.put(5, 5);
        f21160h.put(6, 6);
        f21160h.put(17, 17);
        f21160h.put(20, 20);
        f21160h.put(23, 23);
        f21160h.put(29, 29);
        f21160h.put(39, 39);
        f21160h.put(42, 42);
    }

    /* renamed from: a */
    private static int m28128a(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case DateUtils.FORMAT_NO_NOON /*512*/:
                return 921600;
            case 1024:
                return 1310720;
            case DateUtils.FORMAT_NO_MIDNIGHT /*2048*/:
            case 4096:
                return 2097152;
            case ContentServiceClientExtras.URL_SIZE_LIMIT /*8192*/:
                return 2228224;
            case DateUtils.FORMAT_ABBREV_TIME /*16384*/:
                return 5652480;
            case DateUtils.FORMAT_ABBREV_WEEKDAY /*32768*/:
            case DateUtils.FORMAT_ABBREV_MONTH /*65536*/:
                return 9437184;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public static C9270a m28130a() throws C9278c {
        C9270a a = m28131a("audio/raw", false, false);
        if (a == null) {
            return null;
        }
        return C9270a.m28035d(a.f21082a);
    }

    /* renamed from: b */
    public static synchronized List<C9270a> m28139b(String str, boolean z, boolean z2) throws C9278c {
        synchronized (C9275d.class) {
            C9277b bVar = new C9277b(str, z, z2);
            List<C9270a> list = (List) f21154b.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList a = m28133a(bVar, C9554k0.f22281a >= 21 ? new C9281f(z, z2) : new C9280e());
            if (z && a.isEmpty() && 21 <= C9554k0.f22281a && C9554k0.f22281a <= 23) {
                a = m28133a(bVar, (C9279d) new C9280e());
                if (!a.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(((C9270a) a.get(0)).f21082a);
                    C9563q.m29500d("MediaCodecUtil", sb.toString());
                }
            }
            m28134a(str, (List<C9270a>) a);
            List<C9270a> unmodifiableList = Collections.unmodifiableList(a);
            f21154b.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: c */
    private static Pair<Integer, Integer> m28141c(String str, String[] strArr) {
        String str2 = "Ignoring malformed Dolby Vision codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            C9563q.m29500d(str3, sb.toString());
            return null;
        }
        Matcher matcher = f21153a.matcher(strArr[1]);
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            C9563q.m29500d(str3, sb2.toString());
            return null;
        }
        String group = matcher.group(1);
        Integer num = (Integer) f21158f.get(group);
        if (num == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown Dolby Vision profile string: ");
            sb3.append(group);
            C9563q.m29500d(str3, sb3.toString());
            return null;
        }
        String str4 = strArr[2];
        Integer num2 = (Integer) f21159g.get(str4);
        if (num2 != null) {
            return new Pair<>(num, num2);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown Dolby Vision level string: ");
        sb4.append(str4);
        C9563q.m29500d(str3, sb4.toString());
        return null;
    }

    /* renamed from: d */
    private static Pair<Integer, Integer> m28142d(String str, String[] strArr) {
        String str2 = "Ignoring malformed HEVC codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            C9563q.m29500d(str3, sb.toString());
            return null;
        }
        int i = 1;
        Matcher matcher = f21153a.matcher(strArr[1]);
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            C9563q.m29500d(str3, sb2.toString());
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if ("2".equals(group)) {
                i = 2;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown HEVC profile string: ");
                sb3.append(group);
                C9563q.m29500d(str3, sb3.toString());
                return null;
            }
        }
        String str4 = strArr[3];
        Integer num = (Integer) f21157e.get(str4);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown HEVC level string: ");
        sb4.append(str4);
        C9563q.m29500d(str3, sb4.toString());
        return null;
    }

    /* renamed from: a */
    public static C9270a m28131a(String str, boolean z, boolean z2) throws C9278c {
        List b = m28139b(str, z, z2);
        if (b.isEmpty()) {
            return null;
        }
        return (C9270a) b.get(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1 A[SYNTHETIC, Splitter:B:44:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.google.android.exoplayer2.p381t0.C9270a> m28133a(com.google.android.exoplayer2.p381t0.C9275d.C9277b r18, com.google.android.exoplayer2.p381t0.C9275d.C9279d r19) throws com.google.android.exoplayer2.p381t0.C9275d.C9278c {
        /*
            r1 = r18
            r2 = r19
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00fb }
            r5.<init>()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r12 = r1.f21162a     // Catch:{ Exception -> 0x00fb }
            int r13 = r19.mo24031a()     // Catch:{ Exception -> 0x00fb }
            boolean r14 = r19.mo24034b()     // Catch:{ Exception -> 0x00fb }
            r0 = 0
            r15 = 0
        L_0x0019:
            if (r15 >= r13) goto L_0x00fa
            android.media.MediaCodecInfo r0 = r2.mo24032a(r15)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r10 = m28132a(r0, r11, r14, r12)     // Catch:{ Exception -> 0x00fb }
            if (r10 != 0) goto L_0x002b
            goto L_0x00d0
        L_0x002b:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00a5 }
            boolean r0 = r2.mo24033a(r4, r10, r9)     // Catch:{ Exception -> 0x00a5 }
            boolean r6 = r2.mo24035b(r4, r10, r9)     // Catch:{ Exception -> 0x00a5 }
            boolean r7 = r1.f21164c     // Catch:{ Exception -> 0x00a5 }
            if (r7 != 0) goto L_0x003d
            if (r6 != 0) goto L_0x00d0
        L_0x003d:
            boolean r6 = r1.f21164c     // Catch:{ Exception -> 0x00a5 }
            if (r6 == 0) goto L_0x0045
            if (r0 != 0) goto L_0x0045
            goto L_0x00d0
        L_0x0045:
            boolean r0 = r2.mo24033a(r3, r10, r9)     // Catch:{ Exception -> 0x00a5 }
            boolean r6 = r2.mo24035b(r3, r10, r9)     // Catch:{ Exception -> 0x00a5 }
            boolean r7 = r1.f21163b     // Catch:{ Exception -> 0x00a5 }
            if (r7 != 0) goto L_0x0053
            if (r6 != 0) goto L_0x00d0
        L_0x0053:
            boolean r6 = r1.f21163b     // Catch:{ Exception -> 0x00a5 }
            if (r6 == 0) goto L_0x005b
            if (r0 != 0) goto L_0x005b
            goto L_0x00d0
        L_0x005b:
            boolean r16 = m28135a(r11)     // Catch:{ Exception -> 0x00a5 }
            if (r14 == 0) goto L_0x0065
            boolean r6 = r1.f21163b     // Catch:{ Exception -> 0x00a5 }
            if (r6 == r0) goto L_0x006b
        L_0x0065:
            if (r14 != 0) goto L_0x007f
            boolean r6 = r1.f21163b     // Catch:{ Exception -> 0x00a5 }
            if (r6 != 0) goto L_0x007f
        L_0x006b:
            r0 = 0
            r6 = r11
            r7 = r12
            r8 = r10
            r17 = r10
            r10 = r16
            r1 = r11
            r11 = r0
            com.google.android.exoplayer2.t0.a r0 = com.google.android.exoplayer2.p381t0.C9270a.m28028a(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x007d }
            r5.add(r0)     // Catch:{ Exception -> 0x007d }
            goto L_0x00d0
        L_0x007d:
            r0 = move-exception
            goto L_0x00a9
        L_0x007f:
            r17 = r10
            r1 = r11
            if (r14 != 0) goto L_0x00d0
            if (r0 == 0) goto L_0x00d0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r0.<init>()     // Catch:{ Exception -> 0x007d }
            r0.append(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r6 = ".secure"
            r0.append(r6)     // Catch:{ Exception -> 0x007d }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x007d }
            r11 = 1
            r7 = r12
            r8 = r17
            r10 = r16
            com.google.android.exoplayer2.t0.a r0 = com.google.android.exoplayer2.p381t0.C9270a.m28028a(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x007d }
            r5.add(r0)     // Catch:{ Exception -> 0x007d }
            return r5
        L_0x00a5:
            r0 = move-exception
            r17 = r10
            r1 = r11
        L_0x00a9:
            int r6 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a     // Catch:{ Exception -> 0x00fb }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x00d6
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x00fb }
            if (r6 != 0) goto L_0x00d6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fb }
            r0.<init>()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x00fb }
            r0.append(r1)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00fb }
            com.google.android.exoplayer2.p393v0.C9563q.m29497b(r8, r0)     // Catch:{ Exception -> 0x00fb }
        L_0x00d0:
            int r15 = r15 + 1
            r1 = r18
            goto L_0x0019
        L_0x00d6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fb }
            r2.<init>()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x00fb }
            r2.append(r1)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x00fb }
            r1 = r17
            r2.append(r1)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00fb }
            com.google.android.exoplayer2.p393v0.C9563q.m29497b(r8, r1)     // Catch:{ Exception -> 0x00fb }
            throw r0     // Catch:{ Exception -> 0x00fb }
        L_0x00fa:
            return r5
        L_0x00fb:
            r0 = move-exception
            com.google.android.exoplayer2.t0.d$c r1 = new com.google.android.exoplayer2.t0.d$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9275d.m28133a(com.google.android.exoplayer2.t0.d$b, com.google.android.exoplayer2.t0.d$d):java.util.ArrayList");
    }

    /* renamed from: b */
    public static int m28136b() throws C9278c {
        if (f21161i == -1) {
            int i = 0;
            C9270a a = m28131a("video/avc", false, false);
            if (a != null) {
                CodecProfileLevel[] a2 = a.mo24013a();
                int length = a2.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m28128a(a2[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C9554k0.f22281a >= 21 ? 345600 : 172800);
            }
            f21161i = i;
        }
        return f21161i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r3.equals("avc1") != false) goto L_0x005c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m28137b(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3006243: goto L_0x0052;
                case 3006244: goto L_0x0048;
                case 3095771: goto L_0x003e;
                case 3095823: goto L_0x0034;
                case 3199032: goto L_0x002a;
                case 3214780: goto L_0x0020;
                case 3356560: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x005b
        L_0x0016:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005b
            r2 = 6
            goto L_0x005c
        L_0x0020:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005b
            r2 = 3
            goto L_0x005c
        L_0x002a:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005b
            r2 = 2
            goto L_0x005c
        L_0x0034:
            java.lang.String r2 = "dvhe"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005b
            r2 = 4
            goto L_0x005c
        L_0x003e:
            java.lang.String r2 = "dvh1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005b
            r2 = 5
            goto L_0x005c
        L_0x0048:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005b
            r2 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = -1
        L_0x005c:
            switch(r2) {
                case 0: goto L_0x006f;
                case 1: goto L_0x006f;
                case 2: goto L_0x006a;
                case 3: goto L_0x006a;
                case 4: goto L_0x0065;
                case 5: goto L_0x0065;
                case 6: goto L_0x0060;
                default: goto L_0x005f;
            }
        L_0x005f:
            return r0
        L_0x0060:
            android.util.Pair r6 = m28129a(r6, r1)
            return r6
        L_0x0065:
            android.util.Pair r6 = m28141c(r6, r1)
            return r6
        L_0x006a:
            android.util.Pair r6 = m28142d(r6, r1)
            return r6
        L_0x006f:
            android.util.Pair r6 = m28138b(r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9275d.m28137b(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (com.google.android.exoplayer2.p393v0.C9554k0.f22282b.startsWith("HM") != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fb, code lost:
        if ("SO-02E".equals(com.google.android.exoplayer2.p393v0.C9554k0.f22282b) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0130, code lost:
        if ("C1605".equals(com.google.android.exoplayer2.p393v0.C9554k0.f22282b) != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a1, code lost:
        if ("SCV31".equals(com.google.android.exoplayer2.p393v0.C9554k0.f22282b) != false) goto L_0x01a3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m28140b(android.media.MediaCodecInfo r3, java.lang.String r4, boolean r5, java.lang.String r6) {
        /*
            boolean r3 = r3.isEncoder()
            r0 = 0
            if (r3 != 0) goto L_0x0215
            if (r5 != 0) goto L_0x0013
            java.lang.String r3 = ".secure"
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L_0x0013
            goto L_0x0215
        L_0x0013:
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            r5 = 21
            if (r3 >= r5) goto L_0x004a
            java.lang.String r3 = "CIPAACDecoder"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = "CIPMP3Decoder"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = "CIPVorbisDecoder"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = "CIPAMRNBDecoder"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = "AACDecoder"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = "MP3Decoder"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x004a
        L_0x0049:
            return r0
        L_0x004a:
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            r5 = 18
            if (r3 >= r5) goto L_0x0077
            java.lang.String r3 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0077
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "a70"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22283c
            java.lang.String r5 = "Xiaomi"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0077
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "HM"
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x0077
        L_0x0076:
            return r0
        L_0x0077:
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            r5 = 16
            if (r3 != r5) goto L_0x00fe
            java.lang.String r3 = "OMX.qcom.audio.decoder.mp3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00fe
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "dlxu"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "protou"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "ville"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "villeplus"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "villec2"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "gee"
            boolean r3 = r3.startsWith(r1)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "C6602"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "C6603"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "C6606"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "C6616"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "L36h"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "SO-02E"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00fe
        L_0x00fd:
            return r0
        L_0x00fe:
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            if (r3 != r5) goto L_0x0133
            java.lang.String r3 = "OMX.qcom.audio.decoder.aac"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0133
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "C1504"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0132
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "C1505"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0132
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "C1604"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0132
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "C1605"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0133
        L_0x0132:
            return r0
        L_0x0133:
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            r5 = 24
            java.lang.String r1 = "samsung"
            if (r3 >= r5) goto L_0x01a4
            java.lang.String r3 = "OMX.SEC.aac.dec"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x014b
            java.lang.String r3 = "OMX.Exynos.AAC.Decoder"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01a4
        L_0x014b:
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22283c
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x01a4
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "zeroflte"
            boolean r3 = r3.startsWith(r5)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "zerolte"
            boolean r3 = r3.startsWith(r5)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "zenlte"
            boolean r3 = r3.startsWith(r5)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "SC-05G"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "marinelteatt"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "404SC"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "SC-04G"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x01a3
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r5 = "SCV31"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x01a4
        L_0x01a3:
            return r0
        L_0x01a4:
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            java.lang.String r5 = "jflte"
            r2 = 19
            if (r3 > r2) goto L_0x01ed
            java.lang.String r3 = "OMX.SEC.vp8.dec"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01ed
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22283c
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x01ed
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "d2"
            boolean r3 = r3.startsWith(r1)
            if (r3 != 0) goto L_0x01ec
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "serrano"
            boolean r3 = r3.startsWith(r1)
            if (r3 != 0) goto L_0x01ec
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            boolean r3 = r3.startsWith(r5)
            if (r3 != 0) goto L_0x01ec
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "santos"
            boolean r3 = r3.startsWith(r1)
            if (r3 != 0) goto L_0x01ec
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            java.lang.String r1 = "t0"
            boolean r3 = r3.startsWith(r1)
            if (r3 == 0) goto L_0x01ed
        L_0x01ec:
            return r0
        L_0x01ed:
            int r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            if (r3 > r2) goto L_0x0202
            java.lang.String r3 = com.google.android.exoplayer2.p393v0.C9554k0.f22282b
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x0202
            java.lang.String r3 = "OMX.qcom.video.decoder.vp8"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0202
            return r0
        L_0x0202:
            java.lang.String r3 = "audio/eac3-joc"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0213
            java.lang.String r3 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0213
            return r0
        L_0x0213:
            r3 = 1
            return r3
        L_0x0215:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9275d.m28140b(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static String m28132a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        String[] supportedTypes;
        if (!m28140b(mediaCodecInfo, str, z, str2)) {
            return null;
        }
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m28134a(String str, List<C9270a> list) {
        if ("audio/raw".equals(str)) {
            Collections.sort(list, new C9283h());
        } else if (C9554k0.f22281a < 21 && list.size() > 1) {
            String str2 = ((C9270a) list.get(0)).f21082a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(list, new C9282g());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ("Nexus 10".equals(com.google.android.exoplayer2.p393v0.C9554k0.f22284d) != false) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m28135a(java.lang.String r2) {
        /*
            int r0 = com.google.android.exoplayer2.p393v0.C9554k0.f22281a
            r1 = 22
            if (r0 > r1) goto L_0x002c
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.C9554k0.f22284d
            java.lang.String r1 = "ODROID-XU3"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.C9554k0.f22284d
            java.lang.String r1 = "Nexus 10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002c
        L_0x001a:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x002c
        L_0x002a:
            r2 = 1
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p381t0.C9275d.m28135a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m28129a(String str, String[] strArr) {
        String str2 = "Ignoring malformed MP4A codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length != 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            C9563q.m29500d(str3, sb.toString());
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C9566t.m29507a(Integer.parseInt(strArr[1], 16)))) {
                int i = f21160h.get(Integer.parseInt(strArr[2]), -1);
                if (i != -1) {
                    return new Pair<>(Integer.valueOf(i), Integer.valueOf(0));
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            C9563q.m29500d(str3, sb2.toString());
        }
        return null;
    }

    /* renamed from: b */
    private static Pair<Integer, Integer> m28138b(String str, String[] strArr) {
        int i;
        int i2;
        String str2 = "Ignoring malformed AVC codec string: ";
        String str3 = "MediaCodecUtil";
        if (strArr.length < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            C9563q.m29500d(str3, sb.toString());
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                int parseInt = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
                i2 = parseInt;
            } else if (strArr.length >= 3) {
                i2 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                C9563q.m29500d(str3, sb2.toString());
                return null;
            }
            int i3 = f21155c.get(i2, -1);
            if (i3 == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown AVC profile: ");
                sb3.append(i2);
                C9563q.m29500d(str3, sb3.toString());
                return null;
            }
            int i4 = f21156d.get(i, -1);
            if (i4 != -1) {
                return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i4));
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown AVC level: ");
            sb4.append(i);
            C9563q.m29500d(str3, sb4.toString());
            return null;
        } catch (NumberFormatException unused) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(str);
            C9563q.m29500d(str3, sb5.toString());
            return null;
        }
    }
}
