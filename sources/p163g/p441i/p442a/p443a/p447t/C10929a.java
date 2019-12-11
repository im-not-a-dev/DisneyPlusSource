package p163g.p441i.p442a.p443a.p447t;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g.i.a.a.t.a */
/* compiled from: ByteQuadsCanonicalizer */
public final class C10929a {

    /* renamed from: a */
    private int[] f25972a;

    /* renamed from: b */
    private int f25973b;

    /* renamed from: c */
    private int f25974c;

    /* renamed from: d */
    private int f25975d;

    /* renamed from: e */
    private int f25976e;

    /* renamed from: f */
    private int f25977f;

    /* renamed from: g.i.a.a.t.a$a */
    /* compiled from: ByteQuadsCanonicalizer */
    private static final class C10930a {
        public C10930a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
        }

        /* renamed from: a */
        public static C10930a m34607a(int i) {
            int i2 = i << 3;
            C10930a aVar = new C10930a(i, 0, C10929a.m34598a(i), new int[i2], new String[(i << 1)], i2 - i, i2);
            return aVar;
        }
    }

    private C10929a(int i, boolean z, int i2, boolean z2) {
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            } else {
                i3 = i;
            }
        }
        new AtomicReference(C10930a.m34607a(i3));
    }

    /* renamed from: a */
    static int m34598a(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    /* renamed from: b */
    protected static C10929a m34599b(int i) {
        return new C10929a(64, true, i, true);
    }

    /* renamed from: f */
    private final int m34600f() {
        int i = this.f25973b;
        return (i << 3) - i;
    }

    /* renamed from: g */
    public static C10929a m34601g() {
        long currentTimeMillis = System.currentTimeMillis();
        return m34599b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: a */
    public int mo28163a() {
        int i = this.f25974c;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f25972a[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public int mo28165c() {
        return (this.f25977f - m34600f()) >> 2;
    }

    /* renamed from: d */
    public int mo28166d() {
        int i = this.f25975d + 3;
        int i2 = this.f25973b + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f25972a[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    /* renamed from: e */
    public int mo28167e() {
        int i = this.f25973b << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f25972a[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public String toString() {
        int a = mo28163a();
        int b = mo28164b();
        int d = mo28166d();
        int c = mo28165c();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{C10929a.class.getName(), Integer.valueOf(this.f25976e), Integer.valueOf(this.f25973b), Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(d), Integer.valueOf(c), Integer.valueOf(a + b + d + c), Integer.valueOf(mo28167e())});
    }

    /* renamed from: b */
    public int mo28164b() {
        int i = this.f25975d;
        int i2 = 0;
        for (int i3 = this.f25974c + 3; i3 < i; i3 += 4) {
            if (this.f25972a[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }
}
