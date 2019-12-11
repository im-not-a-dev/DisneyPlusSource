package androidx.leanback.widget;

import androidx.leanback.widget.C0649e.C0650a;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0811c;
import p096e.p113e.C3931d;

/* renamed from: androidx.leanback.widget.s */
/* compiled from: SingleRow */
class C0687s extends C0649e {

    /* renamed from: j */
    private final C0650a f2939j = new C0650a(0);

    C0687s() {
        mo3798h(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo3778a(int i, boolean z) {
        int i2;
        if (this.f2794b.getCount() == 0) {
            return false;
        }
        if (!z && mo3784b(i)) {
            return false;
        }
        int i3 = mo4054i();
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            if (i3 >= this.f2794b.getCount()) {
                z2 = z3;
                break;
            }
            int a = this.f2794b.mo3803a(i3, true, this.f2793a, false);
            if (this.f2798f < 0 || this.f2799g < 0) {
                i2 = this.f2795c ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f2798f = i3;
                this.f2799g = i3;
            } else {
                if (this.f2795c) {
                    int i4 = i3 - 1;
                    i2 = (this.f2794b.mo3805b(i4) - this.f2794b.mo3802a(i4)) - this.f2796d;
                } else {
                    int i5 = i3 - 1;
                    i2 = this.f2794b.mo3805b(i5) + this.f2794b.mo3802a(i5) + this.f2796d;
                }
                this.f2799g = i3;
            }
            this.f2794b.mo3804a(this.f2793a[0], i3, a, 0, i2);
            if (z || mo3784b(i)) {
                break;
            }
            i3++;
            z3 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo3785b(int i, boolean z) {
        int i2;
        if (this.f2794b.getCount() == 0) {
            return false;
        }
        if (!z && mo3787c(i)) {
            return false;
        }
        int a = this.f2794b.mo3801a();
        int j = mo4055j();
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            if (j < a) {
                z2 = z3;
                break;
            }
            int a2 = this.f2794b.mo3803a(j, false, this.f2793a, false);
            if (this.f2798f < 0 || this.f2799g < 0) {
                i2 = this.f2795c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f2798f = j;
                this.f2799g = j;
            } else {
                if (this.f2795c) {
                    i2 = this.f2794b.mo3805b(j + 1) + this.f2796d + a2;
                } else {
                    i2 = (this.f2794b.mo3805b(j + 1) - this.f2796d) - a2;
                }
                this.f2798f = j;
            }
            this.f2794b.mo3804a(this.f2793a[0], j, a2, 0, i2);
            if (z || mo3787c(i)) {
                break;
            }
            j--;
            z3 = true;
        }
        return z2;
    }

    /* renamed from: d */
    public final C0650a mo3790d(int i) {
        return this.f2939j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo4054i() {
        int i = this.f2799g;
        if (i >= 0) {
            return i + 1;
        }
        int i2 = this.f2801i;
        if (i2 != -1) {
            return Math.min(i2, this.f2794b.getCount() - 1);
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo4055j() {
        int i = this.f2798f;
        if (i >= 0) {
            return i - 1;
        }
        int i2 = this.f2801i;
        if (i2 != -1) {
            return Math.min(i2, this.f2794b.getCount() - 1);
        }
        return this.f2794b.getCount() - 1;
    }

    /* renamed from: a */
    public void mo3773a(int i, int i2, C0811c cVar) {
        int i3;
        int i4;
        if (!this.f2795c ? i2 >= 0 : i2 <= 0) {
            if (mo3789d() != this.f2794b.getCount() - 1) {
                i3 = mo4054i();
                int a = this.f2794b.mo3802a(this.f2799g) + this.f2796d;
                int b = this.f2794b.mo3805b(this.f2799g);
                if (this.f2795c) {
                    a = -a;
                }
                i4 = a + b;
            } else {
                return;
            }
        } else if (mo3780b() != 0) {
            i3 = mo4055j();
            i4 = this.f2794b.mo3805b(this.f2798f) + (this.f2795c ? this.f2796d : -this.f2796d);
        } else {
            return;
        }
        cVar.mo4770a(i3, Math.abs(i4 - i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo3781b(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (this.f2795c) {
            return this.f2794b.mo3805b(i) - this.f2794b.mo3802a(i);
        }
        return this.f2794b.mo3805b(i);
    }

    /* renamed from: a */
    public final C3931d[] mo3779a(int i, int i2) {
        this.f2800h[0].mo14051a();
        this.f2800h[0].mo14052a(i);
        this.f2800h[0].mo14052a(i2);
        return this.f2800h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo3770a(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (this.f2795c) {
            return this.f2794b.mo3805b(i);
        }
        return this.f2794b.mo3805b(i) + this.f2794b.mo3802a(i);
    }
}
