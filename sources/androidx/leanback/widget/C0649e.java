package androidx.leanback.widget;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0811c;
import java.util.Arrays;
import p096e.p113e.C3931d;

/* renamed from: androidx.leanback.widget.e */
/* compiled from: Grid */
abstract class C0649e {

    /* renamed from: a */
    Object[] f2793a = new Object[1];

    /* renamed from: b */
    protected C0651b f2794b;

    /* renamed from: c */
    protected boolean f2795c;

    /* renamed from: d */
    protected int f2796d;

    /* renamed from: e */
    protected int f2797e;

    /* renamed from: f */
    protected int f2798f = -1;

    /* renamed from: g */
    protected int f2799g = -1;

    /* renamed from: h */
    protected C3931d[] f2800h;

    /* renamed from: i */
    protected int f2801i = -1;

    /* renamed from: androidx.leanback.widget.e$a */
    /* compiled from: Grid */
    public static class C0650a {

        /* renamed from: a */
        public int f2802a;

        public C0650a(int i) {
            this.f2802a = i;
        }
    }

    /* renamed from: androidx.leanback.widget.e$b */
    /* compiled from: Grid */
    public interface C0651b {
        /* renamed from: a */
        int mo3801a();

        /* renamed from: a */
        int mo3802a(int i);

        /* renamed from: a */
        int mo3803a(int i, boolean z, Object[] objArr, boolean z2);

        /* renamed from: a */
        void mo3804a(Object obj, int i, int i2, int i3, int i4);

        /* renamed from: b */
        int mo3805b(int i);

        int getCount();

        void removeItem(int i);
    }

    C0649e() {
    }

    /* renamed from: k */
    public static C0649e m3322k(int i) {
        if (i == 1) {
            return new C0687s();
        }
        C0691v vVar = new C0691v();
        vVar.mo3798h(i);
        return vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo3770a(boolean z, int i, int[] iArr);

    /* renamed from: a */
    public void mo3773a(int i, int i2, C0811c cVar) {
    }

    /* renamed from: a */
    public final void mo3775a(boolean z) {
        this.f2795c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3778a(int i, boolean z);

    /* renamed from: a */
    public abstract C3931d[] mo3779a(int i, int i2);

    /* renamed from: b */
    public final int mo3780b() {
        return this.f2798f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo3781b(boolean z, int i, int[] iArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo3785b(int i, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo3787c(int i) {
        boolean z = false;
        if (this.f2799g < 0) {
            return false;
        }
        if (!this.f2795c ? mo3782b(true, (int[]) null) <= i + this.f2796d : mo3771a(false, (int[]) null) >= i - this.f2796d) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public final int mo3789d() {
        return this.f2799g;
    }

    /* renamed from: d */
    public abstract C0650a mo3790d(int i);

    /* renamed from: e */
    public int mo3791e() {
        return this.f2797e;
    }

    /* renamed from: f */
    public boolean mo3794f() {
        return this.f2795c;
    }

    /* renamed from: g */
    public final boolean mo3796g() {
        return mo3785b(this.f2795c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo3798h(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        } else if (this.f2797e != i) {
            this.f2797e = i;
            this.f2800h = new C3931d[this.f2797e];
            for (int i2 = 0; i2 < this.f2797e; i2++) {
                this.f2800h[i2] = new C3931d();
            }
        }
    }

    /* renamed from: i */
    public final void mo3799i(int i) {
        this.f2796d = i;
    }

    /* renamed from: j */
    public void mo3800j(int i) {
        this.f2801i = i;
    }

    /* renamed from: i */
    private void mo4054i() {
        if (this.f2799g < this.f2798f) {
            mo3797h();
        }
    }

    /* renamed from: a */
    public void mo3774a(C0651b bVar) {
        this.f2794b = bVar;
    }

    /* renamed from: b */
    public final int mo3782b(boolean z, int[] iArr) {
        return mo3781b(z, this.f2795c ? this.f2799g : this.f2798f, iArr);
    }

    /* renamed from: e */
    public final int mo3792e(int i) {
        C0650a d = mo3790d(i);
        if (d == null) {
            return -1;
        }
        return d.f2802a;
    }

    /* renamed from: f */
    public void mo3793f(int i) {
        if (i >= 0) {
            int i2 = this.f2799g;
            if (i2 >= 0) {
                if (i2 >= i) {
                    this.f2799g = i - 1;
                }
                mo4054i();
                if (mo3780b() < 0) {
                    mo3800j(i);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo3795g(int i) {
        mo3785b(i, false);
    }

    /* renamed from: a */
    public final int mo3771a(boolean z, int[] iArr) {
        return mo3770a(z, this.f2795c ? this.f2798f : this.f2799g, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo3784b(int i) {
        boolean z = false;
        if (this.f2799g < 0) {
            return false;
        }
        if (!this.f2795c ? mo3771a(false, (int[]) null) >= i - this.f2796d : mo3782b(true, (int[]) null) <= i + this.f2796d) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo3777a() {
        return mo3778a(this.f2795c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    /* renamed from: c */
    public final C3931d[] mo3788c() {
        return mo3779a(mo3780b(), mo3789d());
    }

    /* renamed from: a */
    public final void mo3772a(int i) {
        mo3778a(i, false);
    }

    /* renamed from: c */
    public void mo3786c(int i, int i2) {
        while (true) {
            int i3 = this.f2799g;
            int i4 = this.f2798f;
            if (i3 < i4 || i4 >= i) {
                break;
            }
            int a = this.f2794b.mo3802a(i4);
            boolean z = false;
            if (this.f2795c ? this.f2794b.mo3805b(this.f2798f) - a >= i2 : this.f2794b.mo3805b(this.f2798f) + a <= i2) {
                z = true;
            }
            if (!z) {
                break;
            }
            this.f2794b.removeItem(this.f2798f);
            this.f2798f++;
        }
        mo4054i();
    }

    /* renamed from: a */
    public void mo3776a(int[] iArr, int i, SparseIntArray sparseIntArray) {
        int i2;
        int i3;
        int i4;
        int d = mo3789d();
        int binarySearch = d >= 0 ? Arrays.binarySearch(iArr, 0, i, d) : 0;
        if (binarySearch < 0) {
            if (this.f2795c) {
                i4 = (this.f2794b.mo3805b(d) - this.f2794b.mo3802a(d)) - this.f2796d;
            } else {
                i4 = this.f2794b.mo3805b(d) + this.f2794b.mo3802a(d) + this.f2796d;
            }
            int i5 = i4;
            for (int i6 = (-binarySearch) - 1; i6 < i; i6++) {
                int i7 = iArr[i6];
                int i8 = sparseIntArray.get(i7);
                int i9 = i8 < 0 ? 0 : i8;
                int a = this.f2794b.mo3803a(i7, true, this.f2793a, true);
                this.f2794b.mo3804a(this.f2793a[0], i7, a, i9, i5);
                if (this.f2795c) {
                    i5 = (i5 - a) - this.f2796d;
                } else {
                    i5 = i5 + a + this.f2796d;
                }
            }
        }
        int b = mo3780b();
        int binarySearch2 = b >= 0 ? Arrays.binarySearch(iArr, 0, i, b) : 0;
        if (binarySearch2 < 0) {
            if (this.f2795c) {
                i2 = this.f2794b.mo3805b(b);
            } else {
                i2 = this.f2794b.mo3805b(b);
            }
            for (int i10 = (-binarySearch2) - 2; i10 >= 0; i10--) {
                int i11 = iArr[i10];
                int i12 = sparseIntArray.get(i11);
                int i13 = i12 < 0 ? 0 : i12;
                int a2 = this.f2794b.mo3803a(i11, false, this.f2793a, true);
                if (this.f2795c) {
                    i3 = i2 + this.f2796d + a2;
                } else {
                    i3 = (i2 - this.f2796d) - a2;
                }
                this.f2794b.mo3804a(this.f2793a[0], i11, a2, i13, i2);
            }
        }
    }

    /* renamed from: b */
    public void mo3783b(int i, int i2) {
        while (true) {
            int i3 = this.f2799g;
            if (i3 < this.f2798f || i3 <= i) {
                break;
            }
            boolean z = false;
            if (this.f2795c ? this.f2794b.mo3805b(i3) <= i2 : this.f2794b.mo3805b(i3) >= i2) {
                z = true;
            }
            if (!z) {
                break;
            }
            this.f2794b.removeItem(this.f2799g);
            this.f2799g--;
        }
        mo4054i();
    }

    /* renamed from: h */
    public void mo3797h() {
        this.f2799g = -1;
        this.f2798f = -1;
    }
}
