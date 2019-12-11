package androidx.leanback.widget;

/* renamed from: androidx.leanback.widget.a0 */
/* compiled from: WindowAlignment */
class C0644a0 {

    /* renamed from: a */
    private int f2776a = 0;

    /* renamed from: b */
    public final C0645a f2777b = new C0645a("vertical");

    /* renamed from: c */
    public final C0645a f2778c = new C0645a("horizontal");

    /* renamed from: d */
    private C0645a f2779d = this.f2778c;

    /* renamed from: e */
    private C0645a f2780e = this.f2777b;

    /* renamed from: androidx.leanback.widget.a0$a */
    /* compiled from: WindowAlignment */
    public static class C0645a {

        /* renamed from: a */
        private int f2781a;

        /* renamed from: b */
        private int f2782b;

        /* renamed from: c */
        private int f2783c;

        /* renamed from: d */
        private int f2784d;

        /* renamed from: e */
        private int f2785e = 2;

        /* renamed from: f */
        private int f2786f = 3;

        /* renamed from: g */
        private int f2787g = 0;

        /* renamed from: h */
        private float f2788h = 50.0f;

        /* renamed from: i */
        private int f2789i;

        /* renamed from: j */
        private int f2790j;

        /* renamed from: k */
        private int f2791k;

        /* renamed from: l */
        private boolean f2792l;

        public C0645a(String str) {
            mo3766q();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3741a(int i, int i2) {
            return i - i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3744a(boolean z) {
            this.f2785e = z ? this.f2785e | 2 : this.f2785e & -3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3748b(boolean z) {
            this.f2785e = z ? this.f2785e | 1 : this.f2785e & -2;
        }

        /* renamed from: c */
        public final void mo3750c(int i) {
            this.f2786f = i;
        }

        /* renamed from: d */
        public final void mo3753d(int i) {
            this.f2787g = i;
        }

        /* renamed from: e */
        public final int mo3754e() {
            return this.f2791k;
        }

        /* renamed from: f */
        public final int mo3755f() {
            return this.f2790j;
        }

        /* renamed from: g */
        public final int mo3756g() {
            return this.f2789i;
        }

        /* renamed from: h */
        public final int mo3757h() {
            return this.f2786f;
        }

        /* renamed from: i */
        public final int mo3758i() {
            return this.f2787g;
        }

        /* renamed from: j */
        public final float mo3759j() {
            return this.f2788h;
        }

        /* renamed from: k */
        public final void mo3760k() {
            this.f2781a = Integer.MAX_VALUE;
            this.f2783c = Integer.MAX_VALUE;
        }

        /* renamed from: l */
        public final void mo3761l() {
            this.f2782b = Integer.MIN_VALUE;
            this.f2784d = Integer.MIN_VALUE;
        }

        /* renamed from: m */
        public final boolean mo3762m() {
            return this.f2781a == Integer.MAX_VALUE;
        }

        /* renamed from: n */
        public final boolean mo3763n() {
            return this.f2782b == Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public final boolean mo3764o() {
            return (this.f2785e & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public final boolean mo3765p() {
            return (this.f2785e & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo3766q() {
            this.f2782b = Integer.MIN_VALUE;
            this.f2781a = Integer.MAX_VALUE;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(" min:");
            sb.append(this.f2782b);
            String str = " ";
            sb.append(str);
            sb.append(this.f2784d);
            sb.append(" max:");
            sb.append(this.f2781a);
            sb.append(str);
            sb.append(this.f2783c);
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo3742a(float f) {
            if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f2788h = f;
        }

        /* renamed from: b */
        public final void mo3746b(int i) {
            this.f2789i = i;
        }

        /* renamed from: c */
        public final int mo3749c() {
            return this.f2783c;
        }

        /* renamed from: d */
        public final int mo3752d() {
            return this.f2784d;
        }

        /* renamed from: b */
        public final void mo3747b(int i, int i2) {
            this.f2790j = i;
            this.f2791k = i2;
        }

        /* renamed from: c */
        public final void mo3751c(boolean z) {
            this.f2792l = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3739a() {
            if (!this.f2792l) {
                int i = this.f2787g;
                if (i < 0) {
                    i += this.f2789i;
                }
                float f = this.f2788h;
                if (f != -1.0f) {
                    return i + ((int) ((((float) this.f2789i) * f) / 100.0f));
                }
                return i;
            }
            int i2 = this.f2787g;
            int i3 = i2 >= 0 ? this.f2789i - i2 : -i2;
            float f2 = this.f2788h;
            return f2 != -1.0f ? i3 - ((int) ((((float) this.f2789i) * f2) / 100.0f)) : i3;
        }

        /* renamed from: b */
        public final int mo3745b() {
            return (this.f2789i - this.f2790j) - this.f2791k;
        }

        /* renamed from: a */
        public final void mo3743a(int i, int i2, int i3, int i4) {
            this.f2782b = i;
            this.f2781a = i2;
            int b = mo3745b();
            int a = mo3739a();
            boolean n = mo3763n();
            boolean m = mo3762m();
            if (!n) {
                if (!this.f2792l) {
                    this.f2784d = mo3741a(i3, a);
                } else {
                    this.f2784d = mo3741a(i3, a);
                }
                this.f2784d = this.f2782b - this.f2790j;
            }
            if (!m) {
                if (!this.f2792l) {
                    this.f2783c = mo3741a(i4, a);
                } else {
                    this.f2783c = mo3741a(i4, a);
                }
                this.f2783c = (this.f2781a - this.f2790j) - b;
            }
            if (!m && !n) {
                if (!this.f2792l) {
                    int i5 = this.f2786f;
                    if ((i5 & 1) != 0) {
                        if (mo3765p()) {
                            this.f2784d = Math.min(this.f2784d, mo3741a(i4, a));
                        }
                        this.f2783c = Math.max(this.f2784d, this.f2783c);
                    } else if ((i5 & 2) != 0) {
                        if (mo3764o()) {
                            this.f2783c = Math.max(this.f2783c, mo3741a(i3, a));
                        }
                        this.f2784d = Math.min(this.f2784d, this.f2783c);
                    }
                } else {
                    int i6 = this.f2786f;
                    if ((i6 & 1) != 0) {
                        if (mo3765p()) {
                            this.f2783c = Math.max(this.f2783c, mo3741a(i3, a));
                        }
                        this.f2784d = Math.min(this.f2784d, this.f2783c);
                    } else if ((i6 & 2) != 0) {
                        if (mo3764o()) {
                            this.f2784d = Math.min(this.f2784d, mo3741a(i4, a));
                        }
                        this.f2783c = Math.max(this.f2784d, this.f2783c);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
            if (r5 > r8) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
            if (r4 < r8) goto L_0x0063;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo3740a(int r8) {
            /*
                r7 = this;
                int r0 = r7.mo3756g()
                int r1 = r7.mo3739a()
                boolean r2 = r7.mo3763n()
                boolean r3 = r7.mo3762m()
                if (r2 != 0) goto L_0x0039
                int r4 = r7.f2790j
                int r4 = r1 - r4
                boolean r5 = r7.f2792l
                if (r5 != 0) goto L_0x0021
                int r5 = r7.f2786f
                r5 = r5 & 1
                if (r5 == 0) goto L_0x0039
                goto L_0x0027
            L_0x0021:
                int r5 = r7.f2786f
                r5 = r5 & 2
                if (r5 == 0) goto L_0x0039
            L_0x0027:
                int r5 = r7.f2782b
                int r6 = r8 - r5
                if (r6 > r4) goto L_0x0039
                int r8 = r7.f2790j
                int r5 = r5 - r8
                if (r3 != 0) goto L_0x0037
                int r8 = r7.f2783c
                if (r5 <= r8) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r8 = r5
            L_0x0038:
                return r8
            L_0x0039:
                if (r3 != 0) goto L_0x0064
                int r3 = r0 - r1
                int r4 = r7.f2791k
                int r3 = r3 - r4
                boolean r4 = r7.f2792l
                if (r4 != 0) goto L_0x004b
                int r4 = r7.f2786f
                r4 = r4 & 2
                if (r4 == 0) goto L_0x0064
                goto L_0x0051
            L_0x004b:
                int r4 = r7.f2786f
                r4 = r4 & 1
                if (r4 == 0) goto L_0x0064
            L_0x0051:
                int r4 = r7.f2781a
                int r5 = r4 - r8
                if (r5 > r3) goto L_0x0064
                int r8 = r7.f2791k
                int r0 = r0 - r8
                int r4 = r4 - r0
                if (r2 != 0) goto L_0x0062
                int r8 = r7.f2784d
                if (r4 >= r8) goto L_0x0062
                goto L_0x0063
            L_0x0062:
                r8 = r4
            L_0x0063:
                return r8
            L_0x0064:
                int r8 = r7.mo3741a(r8, r1)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0644a0.C0645a.mo3740a(int):int");
        }
    }

    C0644a0() {
    }

    /* renamed from: a */
    public final C0645a mo3734a() {
        return this.f2779d;
    }

    /* renamed from: b */
    public final void mo3736b() {
        mo3734a().mo3766q();
    }

    /* renamed from: c */
    public final C0645a mo3737c() {
        return this.f2780e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("horizontal=");
        sb.append(this.f2778c);
        sb.append("; vertical=");
        sb.append(this.f2777b);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo3735a(int i) {
        this.f2776a = i;
        if (this.f2776a == 0) {
            this.f2779d = this.f2778c;
            this.f2780e = this.f2777b;
            return;
        }
        this.f2779d = this.f2777b;
        this.f2780e = this.f2778c;
    }
}
