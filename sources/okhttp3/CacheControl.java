package okhttp3;

import java.util.concurrent.TimeUnit;

public final class CacheControl {

    /* renamed from: n */
    public static final CacheControl f31159n;

    /* renamed from: a */
    private final boolean f31160a;

    /* renamed from: b */
    private final boolean f31161b;

    /* renamed from: c */
    private final int f31162c;

    /* renamed from: d */
    private final int f31163d;

    /* renamed from: e */
    private final boolean f31164e;

    /* renamed from: f */
    private final boolean f31165f;

    /* renamed from: g */
    private final boolean f31166g;

    /* renamed from: h */
    private final int f31167h;

    /* renamed from: i */
    private final int f31168i;

    /* renamed from: j */
    private final boolean f31169j;

    /* renamed from: k */
    private final boolean f31170k;

    /* renamed from: l */
    private final boolean f31171l;

    /* renamed from: m */
    String f31172m;

    /* renamed from: okhttp3.CacheControl$a */
    public static final class C14110a {

        /* renamed from: a */
        boolean f31173a;

        /* renamed from: b */
        boolean f31174b;

        /* renamed from: c */
        int f31175c = -1;

        /* renamed from: d */
        int f31176d = -1;

        /* renamed from: e */
        int f31177e = -1;

        /* renamed from: f */
        boolean f31178f;

        /* renamed from: g */
        boolean f31179g;

        /* renamed from: h */
        boolean f31180h;

        /* renamed from: a */
        public C14110a mo35718a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f31176d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public C14110a mo35720b() {
            this.f31173a = true;
            return this;
        }

        /* renamed from: c */
        public C14110a mo35721c() {
            this.f31178f = true;
            return this;
        }

        /* renamed from: a */
        public CacheControl mo35719a() {
            return new CacheControl(this);
        }
    }

    static {
        C14110a aVar = new C14110a();
        aVar.mo35720b();
        f31159n = aVar.mo35719a();
        C14110a aVar2 = new C14110a();
        aVar2.mo35721c();
        aVar2.mo35718a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        aVar2.mo35719a();
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f31160a = z;
        this.f31161b = z2;
        this.f31162c = i;
        this.f31163d = i2;
        this.f31164e = z3;
        this.f31165f = z4;
        this.f31166g = z5;
        this.f31167h = i3;
        this.f31168i = i4;
        this.f31169j = z6;
        this.f31170k = z7;
        this.f31171l = z8;
        this.f31172m = str;
    }

    /* renamed from: j */
    private String m44587j() {
        StringBuilder sb = new StringBuilder();
        if (this.f31160a) {
            sb.append("no-cache, ");
        }
        if (this.f31161b) {
            sb.append("no-store, ");
        }
        String str = ", ";
        if (this.f31162c != -1) {
            sb.append("max-age=");
            sb.append(this.f31162c);
            sb.append(str);
        }
        if (this.f31163d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f31163d);
            sb.append(str);
        }
        if (this.f31164e) {
            sb.append("private, ");
        }
        if (this.f31165f) {
            sb.append("public, ");
        }
        if (this.f31166g) {
            sb.append("must-revalidate, ");
        }
        if (this.f31167h != -1) {
            sb.append("max-stale=");
            sb.append(this.f31167h);
            sb.append(str);
        }
        if (this.f31168i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f31168i);
            sb.append(str);
        }
        if (this.f31169j) {
            sb.append("only-if-cached, ");
        }
        if (this.f31170k) {
            sb.append("no-transform, ");
        }
        if (this.f31171l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo35708a() {
        return this.f31164e;
    }

    /* renamed from: b */
    public boolean mo35709b() {
        return this.f31165f;
    }

    /* renamed from: c */
    public int mo35710c() {
        return this.f31162c;
    }

    /* renamed from: d */
    public int mo35711d() {
        return this.f31167h;
    }

    /* renamed from: e */
    public int mo35712e() {
        return this.f31168i;
    }

    /* renamed from: f */
    public boolean mo35713f() {
        return this.f31166g;
    }

    /* renamed from: g */
    public boolean mo35714g() {
        return this.f31160a;
    }

    /* renamed from: h */
    public boolean mo35715h() {
        return this.f31161b;
    }

    /* renamed from: i */
    public boolean mo35716i() {
        return this.f31169j;
    }

    public String toString() {
        String str = this.f31172m;
        if (str != null) {
            return str;
        }
        String j = m44587j();
        this.f31172m = j;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.CacheControl m44586a(okhttp3.C14256t r22) {
        /*
            r0 = r22
            int r1 = r22.mo36246b()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0146
            java.lang.String r2 = r0.mo36243a(r6)
            java.lang.String r4 = r0.mo36247b(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x013f
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x013f
            java.lang.String r3 = "=,;"
            int r3 = okhttp3.p688d0.p691i.C14163e.m45011a(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = okhttp3.p688d0.p691i.C14163e.m45018b(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = okhttp3.p688d0.p691i.C14163e.m45011a(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = okhttp3.p688d0.p691i.C14163e.m45011a(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x013a
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x013a
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c5
            r5 = -1
            int r0 = okhttp3.p688d0.p691i.C14163e.m45010a(r0, r5)
            r11 = r0
            goto L_0x013a
        L_0x00c5:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d5
            r5 = -1
            int r0 = okhttp3.p688d0.p691i.C14163e.m45010a(r0, r5)
            r12 = r0
            goto L_0x013a
        L_0x00d5:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e0
            r5 = -1
            r13 = 1
            goto L_0x013a
        L_0x00e0:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00eb
            r5 = -1
            r14 = 1
            goto L_0x013a
        L_0x00eb:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f6
            r5 = -1
            r15 = 1
            goto L_0x013a
        L_0x00f6:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0109
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = okhttp3.p688d0.p691i.C14163e.m45010a(r0, r2)
            r16 = r0
            r5 = -1
            goto L_0x013a
        L_0x0109:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0119
            r5 = -1
            int r0 = okhttp3.p688d0.p691i.C14163e.m45010a(r0, r5)
            r17 = r0
            goto L_0x013a
        L_0x0119:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r18 = 1
            goto L_0x013a
        L_0x0125:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0130
            r19 = 1
            goto L_0x013a
        L_0x0130:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x013a
            r20 = 1
        L_0x013a:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x013f:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0146:
            if (r7 != 0) goto L_0x014b
            r21 = 0
            goto L_0x014d
        L_0x014b:
            r21 = r8
        L_0x014d:
            okhttp3.CacheControl r0 = new okhttp3.CacheControl
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.m44586a(okhttp3.t):okhttp3.CacheControl");
    }

    CacheControl(C14110a aVar) {
        this.f31160a = aVar.f31173a;
        this.f31161b = aVar.f31174b;
        this.f31162c = aVar.f31175c;
        this.f31163d = -1;
        this.f31164e = false;
        this.f31165f = false;
        this.f31166g = false;
        this.f31167h = aVar.f31176d;
        this.f31168i = aVar.f31177e;
        this.f31169j = aVar.f31178f;
        this.f31170k = aVar.f31179g;
        this.f31171l = aVar.f31180h;
    }
}
