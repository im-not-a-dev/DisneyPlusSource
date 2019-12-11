package com.bumptech.glide.load.p341p.p342c;

import com.bumptech.glide.load.C8112h;

/* renamed from: com.bumptech.glide.load.p.c.j */
/* compiled from: DownsampleStrategy */
public abstract class C8363j {

    /* renamed from: a */
    public static final C8363j f17844a = new C8368e();

    /* renamed from: b */
    public static final C8363j f17845b = new C8367d();

    /* renamed from: c */
    public static final C8363j f17846c = new C8366c();

    /* renamed from: d */
    public static final C8363j f17847d = new C8369f();

    /* renamed from: e */
    public static final C8363j f17848e = f17845b;

    /* renamed from: f */
    public static final C8112h<C8363j> f17849f = C8112h.m23532a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", f17848e);

    /* renamed from: com.bumptech.glide.load.p.c.j$a */
    /* compiled from: DownsampleStrategy */
    private static class C8364a extends C8363j {
        C8364a() {
        }

        /* renamed from: a */
        public C8370g mo21536a(int i, int i2, int i3, int i4) {
            return C8370g.QUALITY;
        }

        /* renamed from: b */
        public float mo21537b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.j$b */
    /* compiled from: DownsampleStrategy */
    private static class C8365b extends C8363j {
        C8365b() {
        }

        /* renamed from: a */
        public C8370g mo21536a(int i, int i2, int i3, int i4) {
            return C8370g.MEMORY;
        }

        /* renamed from: b */
        public float mo21537b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.j$c */
    /* compiled from: DownsampleStrategy */
    private static class C8366c extends C8363j {
        C8366c() {
        }

        /* renamed from: a */
        public C8370g mo21536a(int i, int i2, int i3, int i4) {
            return C8370g.QUALITY;
        }

        /* renamed from: b */
        public float mo21537b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C8363j.f17844a.mo21537b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.j$d */
    /* compiled from: DownsampleStrategy */
    private static class C8367d extends C8363j {
        C8367d() {
        }

        /* renamed from: a */
        public C8370g mo21536a(int i, int i2, int i3, int i4) {
            return C8370g.QUALITY;
        }

        /* renamed from: b */
        public float mo21537b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.j$e */
    /* compiled from: DownsampleStrategy */
    private static class C8368e extends C8363j {
        C8368e() {
        }

        /* renamed from: a */
        public C8370g mo21536a(int i, int i2, int i3, int i4) {
            return C8370g.QUALITY;
        }

        /* renamed from: b */
        public float mo21537b(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.j$f */
    /* compiled from: DownsampleStrategy */
    private static class C8369f extends C8363j {
        C8369f() {
        }

        /* renamed from: a */
        public C8370g mo21536a(int i, int i2, int i3, int i4) {
            return C8370g.QUALITY;
        }

        /* renamed from: b */
        public float mo21537b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.j$g */
    /* compiled from: DownsampleStrategy */
    public enum C8370g {
        MEMORY,
        QUALITY
    }

    static {
        new C8364a();
        new C8365b();
    }

    /* renamed from: a */
    public abstract C8370g mo21536a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo21537b(int i, int i2, int i3, int i4);
}
