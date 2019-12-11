package p096e.p121h.p135s;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: e.h.s.h0 */
/* compiled from: WindowInsetsCompat */
public class C4147h0 {

    /* renamed from: a */
    private final Object f10447a;

    private C4147h0(Object obj) {
        this.f10447a = obj;
    }

    /* renamed from: a */
    public C4147h0 mo14720a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C4147h0(((WindowInsets) this.f10447a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int mo14721b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f10447a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo14722c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f10447a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo14723d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f10447a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: e */
    public int mo14724e() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f10447a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4147h0.class != obj.getClass()) {
            return false;
        }
        C4147h0 h0Var = (C4147h0) obj;
        Object obj2 = this.f10447a;
        Object obj3 = h0Var.f10447a;
        if (obj2 != null) {
            z = obj2.equals(obj3);
        } else if (obj3 != null) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo14726f() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f10447a).isConsumed();
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f10447a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: a */
    public C4128c mo14719a() {
        if (VERSION.SDK_INT >= 28) {
            return C4128c.m14132a(((WindowInsets) this.f10447a).getDisplayCutout());
        }
        return null;
    }

    /* renamed from: a */
    static C4147h0 m14192a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C4147h0(obj);
    }

    /* renamed from: a */
    static Object m14193a(C4147h0 h0Var) {
        if (h0Var == null) {
            return null;
        }
        return h0Var.f10447a;
    }
}
