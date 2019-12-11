package p096e.p121h.p135s;

import android.view.View;
import android.view.ViewParent;

/* renamed from: e.h.s.n */
/* compiled from: NestedScrollingChildHelper */
public class C4177n {

    /* renamed from: a */
    private ViewParent f10470a;

    /* renamed from: b */
    private ViewParent f10471b;

    /* renamed from: c */
    private final View f10472c;

    /* renamed from: d */
    private boolean f10473d;

    /* renamed from: e */
    private int[] f10474e;

    public C4177n(View view) {
        this.f10472c = view;
    }

    /* renamed from: d */
    private ViewParent m14304d(int i) {
        if (i == 0) {
            return this.f10470a;
        }
        if (i != 1) {
            return null;
        }
        return this.f10471b;
    }

    /* renamed from: a */
    public void mo14808a(boolean z) {
        if (this.f10473d) {
            C4187x.m14346K(this.f10472c);
        }
        this.f10473d = z;
    }

    /* renamed from: b */
    public boolean mo14818b() {
        return this.f10473d;
    }

    /* renamed from: c */
    public void mo14820c() {
        mo14821c(0);
    }

    /* renamed from: b */
    public boolean mo14819b(int i) {
        return mo14813a(i, 0);
    }

    /* renamed from: c */
    public void mo14821c(int i) {
        ViewParent d = m14304d(i);
        if (d != null) {
            C4129c0.m14137a(d, this.f10472c, i);
            m14302a(i, (ViewParent) null);
        }
    }

    /* renamed from: b */
    private boolean m14303b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (mo14818b()) {
            ViewParent d = m14304d(i5);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr4 != null) {
                    this.f10472c.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    int[] d2 = m14305d();
                    d2[0] = 0;
                    d2[1] = 0;
                    iArr3 = d2;
                } else {
                    iArr3 = iArr2;
                }
                C4129c0.m14138a(d, this.f10472c, i, i2, i3, i4, i5, iArr3);
                if (iArr4 != null) {
                    this.f10472c.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: d */
    private int[] m14305d() {
        if (this.f10474e == null) {
            this.f10474e = new int[2];
        }
        return this.f10474e;
    }

    /* renamed from: a */
    public boolean mo14809a() {
        return mo14812a(0);
    }

    /* renamed from: a */
    public boolean mo14812a(int i) {
        return m14304d(i) != null;
    }

    /* renamed from: a */
    public boolean mo14813a(int i, int i2) {
        if (mo14812a(i2)) {
            return true;
        }
        if (mo14818b()) {
            View view = this.f10472c;
            for (ViewParent parent = this.f10472c.getParent(); parent != null; parent = parent.getParent()) {
                if (C4129c0.m14144b(parent, view, this.f10472c, i, i2)) {
                    m14302a(i2, parent);
                    C4129c0.m14140a(parent, view, this.f10472c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo14814a(int i, int i2, int i3, int i4, int[] iArr) {
        return m14303b(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public boolean mo14815a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m14303b(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: a */
    public void mo14807a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m14303b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public boolean mo14816a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo14817a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo14817a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (mo14818b()) {
            ViewParent d = m14304d(i3);
            if (d == null) {
                return false;
            }
            boolean z = true;
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f10472c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    iArr = m14305d();
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C4129c0.m14139a(d, this.f10472c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f10472c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    z = false;
                }
                return z;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo14811a(float f, float f2, boolean z) {
        if (mo14818b()) {
            ViewParent d = m14304d(0);
            if (d != null) {
                return C4129c0.m14142a(d, this.f10472c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo14810a(float f, float f2) {
        if (mo14818b()) {
            ViewParent d = m14304d(0);
            if (d != null) {
                return C4129c0.m14141a(d, this.f10472c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m14302a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f10470a = viewParent;
        } else if (i == 1) {
            this.f10471b = viewParent;
        }
    }
}
