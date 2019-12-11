package androidx.leanback.widget;

import androidx.leanback.widget.C0649e.C0650a;
import p096e.p113e.C3930c;
import p096e.p113e.C3931d;

/* renamed from: androidx.leanback.widget.u */
/* compiled from: StaggeredGrid */
abstract class C0689u extends C0649e {

    /* renamed from: j */
    protected C3930c<C0690a> f2940j = new C3930c<>(64);

    /* renamed from: k */
    protected int f2941k = -1;

    /* renamed from: l */
    protected Object f2942l;

    /* renamed from: m */
    protected int f2943m;

    /* renamed from: androidx.leanback.widget.u$a */
    /* compiled from: StaggeredGrid */
    public static class C0690a extends C0650a {

        /* renamed from: b */
        public int f2944b;

        /* renamed from: c */
        public int f2945c;

        public C0690a(int i, int i2, int i3) {
            super(i);
            this.f2944b = i2;
            this.f2945c = i3;
        }
    }

    C0689u() {
    }

    /* renamed from: l */
    private int mo4064l(int i) {
        boolean z;
        int i2;
        int j = mo4063j();
        while (true) {
            if (j < this.f2941k) {
                z = false;
                break;
            } else if (mo3790d(j).f2802a == i) {
                z = true;
                break;
            } else {
                j--;
            }
        }
        if (!z) {
            j = mo4063j();
        }
        if (mo3794f()) {
            i2 = (-mo3790d(j).f2945c) - this.f2796d;
        } else {
            i2 = mo3790d(j).f2945c + this.f2796d;
        }
        for (int i3 = j + 1; i3 <= mo4063j(); i3++) {
            i2 -= mo3790d(i3).f2944b;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo3778a(int i, boolean z) {
        boolean d;
        if (this.f2794b.getCount() == 0) {
            return false;
        }
        if (!z && mo3784b(i)) {
            return false;
        }
        try {
            if (mo4059c(i, z)) {
                d = true;
                this.f2793a[0] = null;
            } else {
                d = mo4060d(i, z);
                this.f2793a[0] = null;
            }
            this.f2942l = null;
            return d;
        } catch (Throwable th) {
            this.f2793a[0] = null;
            this.f2942l = null;
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo3785b(int i, boolean z) {
        boolean f;
        if (this.f2794b.getCount() == 0) {
            return false;
        }
        if (!z && mo3787c(i)) {
            return false;
        }
        try {
            if (mo4061e(i, z)) {
                f = true;
                this.f2793a[0] = null;
            } else {
                f = mo4062f(i, z);
                this.f2793a[0] = null;
            }
            this.f2942l = null;
            return f;
        } catch (Throwable th) {
            this.f2793a[0] = null;
            this.f2942l = null;
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo4059c(int i, boolean z) {
        int i2;
        int i3;
        if (this.f2940j.mo14047b() == 0) {
            return false;
        }
        int count = this.f2794b.getCount();
        int i4 = this.f2799g;
        if (i4 >= 0) {
            i2 = i4 + 1;
            i3 = this.f2794b.mo3805b(i4);
        } else {
            int i5 = this.f2801i;
            i2 = i5 != -1 ? i5 : 0;
            if (i2 > mo4063j() + 1 || i2 < mo4054i()) {
                this.f2940j.mo14045a();
                return false;
            } else if (i2 > mo4063j()) {
                return false;
            } else {
                i3 = Integer.MAX_VALUE;
            }
        }
        int j = mo4063j();
        while (i2 < count && i2 <= j) {
            C0690a d = mo3790d(i2);
            if (i3 != Integer.MAX_VALUE) {
                i3 += d.f2944b;
            }
            int i6 = d.f2802a;
            int a = this.f2794b.mo3803a(i2, true, this.f2793a, false);
            if (a != d.f2945c) {
                d.f2945c = a;
                this.f2940j.mo14048b(j - i2);
                j = i2;
            }
            this.f2799g = i2;
            if (this.f2798f < 0) {
                this.f2798f = i2;
            }
            this.f2794b.mo3804a(this.f2793a[0], i2, a, i6, i3);
            if (!z && mo3784b(i)) {
                return true;
            }
            if (i3 == Integer.MAX_VALUE) {
                i3 = this.f2794b.mo3805b(i2);
            }
            if (i6 == this.f2797e - 1 && z) {
                return true;
            }
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo4060d(int i, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo4061e(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (this.f2940j.mo14047b() == 0) {
            return false;
        }
        int i5 = this.f2798f;
        if (i5 >= 0) {
            i4 = this.f2794b.mo3805b(i5);
            i3 = mo3790d(this.f2798f).f2944b;
            i2 = this.f2798f - 1;
        } else {
            i4 = Integer.MAX_VALUE;
            int i6 = this.f2801i;
            i2 = i6 != -1 ? i6 : 0;
            if (i2 > mo4063j() || i2 < mo4054i() - 1) {
                this.f2940j.mo14045a();
                return false;
            } else if (i2 < mo4054i()) {
                return false;
            } else {
                i3 = 0;
            }
        }
        int max = Math.max(this.f2794b.mo3801a(), this.f2941k);
        while (i2 >= max) {
            C0690a d = mo3790d(i2);
            int i7 = d.f2802a;
            int a = this.f2794b.mo3803a(i2, false, this.f2793a, false);
            if (a != d.f2945c) {
                this.f2940j.mo14050c((i2 + 1) - this.f2941k);
                this.f2941k = this.f2798f;
                this.f2942l = this.f2793a[0];
                this.f2943m = a;
                return false;
            }
            this.f2798f = i2;
            if (this.f2799g < 0) {
                this.f2799g = i2;
            }
            this.f2794b.mo3804a(this.f2793a[0], i2, a, i7, i4 - i3);
            if (!z && mo3787c(i)) {
                return true;
            }
            i4 = this.f2794b.mo3805b(i2);
            i3 = d.f2944b;
            if (i7 == 0 && z) {
                return true;
            }
            i2--;
        }
        return false;
    }

    /* renamed from: f */
    public void mo3793f(int i) {
        super.mo3793f(i);
        this.f2940j.mo14048b((mo4063j() - i) + 1);
        if (this.f2940j.mo14047b() == 0) {
            this.f2941k = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo4062f(int i, boolean z);

    /* renamed from: i */
    public final int mo4054i() {
        return this.f2941k;
    }

    /* renamed from: j */
    public final int mo4063j() {
        return (this.f2941k + this.f2940j.mo14047b()) - 1;
    }

    /* renamed from: d */
    public final C0690a m3651d(int i) {
        int i2 = i - this.f2941k;
        if (i2 < 0 || i2 >= this.f2940j.mo14047b()) {
            return null;
        }
        return (C0690a) this.f2940j.mo14044a(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo4057a(int i, int i2, int i3) {
        int i4 = this.f2799g;
        if (i4 < 0 || (i4 == mo4063j() && this.f2799g == i - 1)) {
            int i5 = this.f2799g;
            int i6 = i5 < 0 ? (this.f2940j.mo14047b() <= 0 || i != mo4063j() + 1) ? 0 : mo4064l(i2) : i3 - this.f2794b.mo3805b(i5);
            C0690a aVar = new C0690a(i2, i6, 0);
            this.f2940j.mo14049b(aVar);
            Object obj = this.f2942l;
            if (obj != null) {
                aVar.f2945c = this.f2943m;
                this.f2942l = null;
            } else {
                aVar.f2945c = this.f2794b.mo3803a(i, true, this.f2793a, false);
                obj = this.f2793a[0];
            }
            Object obj2 = obj;
            if (this.f2940j.mo14047b() == 1) {
                this.f2799g = i;
                this.f2798f = i;
                this.f2941k = i;
            } else {
                int i7 = this.f2799g;
                if (i7 < 0) {
                    this.f2799g = i;
                    this.f2798f = i;
                } else {
                    this.f2799g = i7 + 1;
                }
            }
            this.f2794b.mo3804a(obj2, i, aVar.f2945c, i2, i3);
            return aVar.f2945c;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo4058b(int i, int i2, int i3) {
        int i4 = this.f2798f;
        if (i4 < 0 || (i4 == mo4054i() && this.f2798f == i + 1)) {
            int i5 = this.f2941k;
            C0690a d = i5 >= 0 ? mo3790d(i5) : null;
            int b = this.f2794b.mo3805b(this.f2941k);
            C0690a aVar = new C0690a(i2, 0, 0);
            this.f2940j.mo14046a(aVar);
            Object obj = this.f2942l;
            if (obj != null) {
                aVar.f2945c = this.f2943m;
                this.f2942l = null;
            } else {
                aVar.f2945c = this.f2794b.mo3803a(i, false, this.f2793a, false);
                obj = this.f2793a[0];
            }
            Object obj2 = obj;
            this.f2798f = i;
            this.f2941k = i;
            if (this.f2799g < 0) {
                this.f2799g = i;
            }
            int i6 = !this.f2795c ? i3 - aVar.f2945c : i3 + aVar.f2945c;
            if (d != null) {
                d.f2944b = b - i6;
            }
            this.f2794b.mo3804a(obj2, i, aVar.f2945c, i2, i6);
            return aVar.f2945c;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final C3931d[] mo3779a(int i, int i2) {
        for (int i3 = 0; i3 < this.f2797e; i3++) {
            this.f2800h[i3].mo14051a();
        }
        if (i >= 0) {
            while (i <= i2) {
                C3931d dVar = this.f2800h[mo3790d(i).f2802a];
                if (dVar.mo14056d() <= 0 || dVar.mo14053b() != i - 1) {
                    dVar.mo14052a(i);
                    dVar.mo14052a(i);
                } else {
                    dVar.mo14055c();
                    dVar.mo14052a(i);
                }
                i++;
            }
        }
        return this.f2800h;
    }
}
