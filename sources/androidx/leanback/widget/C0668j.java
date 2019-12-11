package androidx.leanback.widget;

/* renamed from: androidx.leanback.widget.j */
/* compiled from: ItemAlignmentFacet */
public final class C0668j {

    /* renamed from: a */
    private C0669a[] f2873a = {new C0669a()};

    /* renamed from: androidx.leanback.widget.j$a */
    /* compiled from: ItemAlignmentFacet */
    public static class C0669a {

        /* renamed from: a */
        int f2874a = -1;

        /* renamed from: b */
        int f2875b = -1;

        /* renamed from: c */
        int f2876c = 0;

        /* renamed from: d */
        float f2877d = 50.0f;

        /* renamed from: e */
        boolean f2878e = false;

        /* renamed from: f */
        private boolean f2879f;

        /* renamed from: a */
        public final void mo3973a(int i) {
            this.f2876c = i;
        }

        /* renamed from: b */
        public final int mo3975b() {
            return this.f2876c;
        }

        /* renamed from: c */
        public final float mo3977c() {
            return this.f2877d;
        }

        /* renamed from: d */
        public final int mo3978d() {
            return this.f2874a;
        }

        /* renamed from: e */
        public boolean mo3979e() {
            return this.f2879f;
        }

        /* renamed from: a */
        public final void mo3974a(boolean z) {
            this.f2878e = z;
        }

        /* renamed from: b */
        public final void mo3976b(int i) {
            this.f2874a = i;
        }

        /* renamed from: a */
        public final void mo3972a(float f) {
            if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f2877d = f;
        }

        /* renamed from: a */
        public final int mo3971a() {
            int i = this.f2875b;
            return i != -1 ? i : this.f2874a;
        }
    }

    /* renamed from: a */
    public C0669a[] mo3970a() {
        return this.f2873a;
    }
}
