package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.widget.e */
/* compiled from: AppCompatBackgroundHelper */
class C0219e {

    /* renamed from: a */
    private final View f1012a;

    /* renamed from: b */
    private final C0235h f1013b;

    /* renamed from: c */
    private int f1014c = -1;

    /* renamed from: d */
    private C0269r0 f1015d;

    /* renamed from: e */
    private C0269r0 f1016e;

    /* renamed from: f */
    private C0269r0 f1017f;

    C0219e(View view) {
        this.f1012a = view;
        this.f1013b = C0235h.m1313b();
    }

    /* renamed from: d */
    private boolean m1231d() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1015d == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1568a(AttributeSet attributeSet, int i) {
        C0284t0 a = C0284t0.m1486a(this.f1012a.getContext(), attributeSet, C3867j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo1922g(C3867j.ViewBackgroundHelper_android_background)) {
                this.f1014c = a.mo1921g(C3867j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f1013b.mo1670b(this.f1012a.getContext(), this.f1014c);
                if (b != null) {
                    mo1565a(b);
                }
            }
            if (a.mo1922g(C3867j.ViewBackgroundHelper_backgroundTint)) {
                C4187x.m14355a(this.f1012a, a.mo1906a(C3867j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo1922g(C3867j.ViewBackgroundHelper_backgroundTintMode)) {
                C4187x.m14356a(this.f1012a, C0204b0.m1171a(a.mo1915d(C3867j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.mo1908a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1570b(ColorStateList colorStateList) {
        if (this.f1016e == null) {
            this.f1016e = new C0269r0();
        }
        C0269r0 r0Var = this.f1016e;
        r0Var.f1200a = colorStateList;
        r0Var.f1203d = true;
        mo1563a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1571c() {
        C0269r0 r0Var = this.f1016e;
        if (r0Var != null) {
            return r0Var.f1201b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1569b() {
        C0269r0 r0Var = this.f1016e;
        if (r0Var != null) {
            return r0Var.f1200a;
        }
        return null;
    }

    /* renamed from: b */
    private boolean m1230b(Drawable drawable) {
        if (this.f1017f == null) {
            this.f1017f = new C0269r0();
        }
        C0269r0 r0Var = this.f1017f;
        r0Var.mo1836a();
        ColorStateList f = C4187x.m14387f(this.f1012a);
        if (f != null) {
            r0Var.f1203d = true;
            r0Var.f1200a = f;
        }
        Mode g = C4187x.m14389g(this.f1012a);
        if (g != null) {
            r0Var.f1202c = true;
            r0Var.f1201b = g;
        }
        if (!r0Var.f1203d && !r0Var.f1202c) {
            return false;
        }
        C0235h.m1312a(drawable, r0Var, this.f1012a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1564a(int i) {
        this.f1014c = i;
        C0235h hVar = this.f1013b;
        mo1565a(hVar != null ? hVar.mo1670b(this.f1012a.getContext(), i) : null);
        mo1563a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1567a(Drawable drawable) {
        this.f1014c = -1;
        mo1565a((ColorStateList) null);
        mo1563a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1566a(Mode mode) {
        if (this.f1016e == null) {
            this.f1016e = new C0269r0();
        }
        C0269r0 r0Var = this.f1016e;
        r0Var.f1201b = mode;
        r0Var.f1202c = true;
        mo1563a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1563a() {
        Drawable background = this.f1012a.getBackground();
        if (background != null && (!m1231d() || !m1230b(background))) {
            C0269r0 r0Var = this.f1016e;
            if (r0Var != null) {
                C0235h.m1312a(background, r0Var, this.f1012a.getDrawableState());
            } else {
                C0269r0 r0Var2 = this.f1015d;
                if (r0Var2 != null) {
                    C0235h.m1312a(background, r0Var2, this.f1012a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1565a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1015d == null) {
                this.f1015d = new C0269r0();
            }
            C0269r0 r0Var = this.f1015d;
            r0Var.f1200a = colorStateList;
            r0Var.f1203d = true;
        } else {
            this.f1015d = null;
        }
        mo1563a();
    }
}
