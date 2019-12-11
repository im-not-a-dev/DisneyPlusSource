package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.l0 */
/* compiled from: RtlSpacingHelper */
class C0252l0 {

    /* renamed from: a */
    private int f1130a = 0;

    /* renamed from: b */
    private int f1131b = 0;

    /* renamed from: c */
    private int f1132c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1133d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1134e = 0;

    /* renamed from: f */
    private int f1135f = 0;

    /* renamed from: g */
    private boolean f1136g = false;

    /* renamed from: h */
    private boolean f1137h = false;

    C0252l0() {
    }

    /* renamed from: a */
    public int mo1762a() {
        return this.f1136g ? this.f1130a : this.f1131b;
    }

    /* renamed from: b */
    public int mo1765b() {
        return this.f1130a;
    }

    /* renamed from: c */
    public int mo1767c() {
        return this.f1131b;
    }

    /* renamed from: d */
    public int mo1768d() {
        return this.f1136g ? this.f1131b : this.f1130a;
    }

    /* renamed from: a */
    public void mo1763a(int i, int i2) {
        this.f1137h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1134e = i;
            this.f1130a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1135f = i2;
            this.f1131b = i2;
        }
    }

    /* renamed from: b */
    public void mo1766b(int i, int i2) {
        this.f1132c = i;
        this.f1133d = i2;
        this.f1137h = true;
        if (this.f1136g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1130a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1131b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1130a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1131b = i2;
        }
    }

    /* renamed from: a */
    public void mo1764a(boolean z) {
        if (z != this.f1136g) {
            this.f1136g = z;
            if (!this.f1137h) {
                this.f1130a = this.f1134e;
                this.f1131b = this.f1135f;
            } else if (z) {
                int i = this.f1133d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1134e;
                }
                this.f1130a = i;
                int i2 = this.f1132c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1135f;
                }
                this.f1131b = i2;
            } else {
                int i3 = this.f1132c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1134e;
                }
                this.f1130a = i3;
                int i4 = this.f1133d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1135f;
                }
                this.f1131b = i4;
            }
        }
    }
}
