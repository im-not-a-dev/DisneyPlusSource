package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0509e;
import p096e.p097a.C3867j;
import p096e.p097a.p098k.p099a.C3868a;

/* renamed from: androidx.appcompat.widget.l */
/* compiled from: AppCompatImageHelper */
public class C0251l {

    /* renamed from: a */
    private final ImageView f1126a;

    /* renamed from: b */
    private C0269r0 f1127b;

    /* renamed from: c */
    private C0269r0 f1128c;

    /* renamed from: d */
    private C0269r0 f1129d;

    public C0251l(ImageView imageView) {
        this.f1126a = imageView;
    }

    /* renamed from: e */
    private boolean m1378e() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1127b == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo1758a(AttributeSet attributeSet, int i) {
        C0284t0 a = C0284t0.m1486a(this.f1126a.getContext(), attributeSet, C3867j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1126a.getDrawable();
            if (drawable == null) {
                int g = a.mo1921g(C3867j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C3868a.m12946c(this.f1126a.getContext(), g);
                    if (drawable != null) {
                        this.f1126a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C0204b0.m1173b(drawable);
            }
            if (a.mo1922g(C3867j.AppCompatImageView_tint)) {
                C0509e.m2751a(this.f1126a, a.mo1906a(C3867j.AppCompatImageView_tint));
            }
            if (a.mo1922g(C3867j.AppCompatImageView_tintMode)) {
                C0509e.m2752a(this.f1126a, C0204b0.m1171a(a.mo1915d(C3867j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.mo1908a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1759b() {
        C0269r0 r0Var = this.f1128c;
        if (r0Var != null) {
            return r0Var.f1200a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1760c() {
        C0269r0 r0Var = this.f1128c;
        if (r0Var != null) {
            return r0Var.f1201b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1761d() {
        return VERSION.SDK_INT < 21 || !(this.f1126a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: a */
    public void mo1755a(int i) {
        if (i != 0) {
            Drawable c = C3868a.m12946c(this.f1126a.getContext(), i);
            if (c != null) {
                C0204b0.m1173b(c);
            }
            this.f1126a.setImageDrawable(c);
        } else {
            this.f1126a.setImageDrawable(null);
        }
        mo1754a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1756a(ColorStateList colorStateList) {
        if (this.f1128c == null) {
            this.f1128c = new C0269r0();
        }
        C0269r0 r0Var = this.f1128c;
        r0Var.f1200a = colorStateList;
        r0Var.f1203d = true;
        mo1754a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1757a(Mode mode) {
        if (this.f1128c == null) {
            this.f1128c = new C0269r0();
        }
        C0269r0 r0Var = this.f1128c;
        r0Var.f1201b = mode;
        r0Var.f1202c = true;
        mo1754a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1754a() {
        Drawable drawable = this.f1126a.getDrawable();
        if (drawable != null) {
            C0204b0.m1173b(drawable);
        }
        if (drawable != null && (!m1378e() || !m1377a(drawable))) {
            C0269r0 r0Var = this.f1128c;
            if (r0Var != null) {
                C0235h.m1312a(drawable, r0Var, this.f1126a.getDrawableState());
            } else {
                C0269r0 r0Var2 = this.f1127b;
                if (r0Var2 != null) {
                    C0235h.m1312a(drawable, r0Var2, this.f1126a.getDrawableState());
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m1377a(Drawable drawable) {
        if (this.f1129d == null) {
            this.f1129d = new C0269r0();
        }
        C0269r0 r0Var = this.f1129d;
        r0Var.mo1836a();
        ColorStateList a = C0509e.m2750a(this.f1126a);
        if (a != null) {
            r0Var.f1203d = true;
            r0Var.f1200a = a;
        }
        Mode b = C0509e.m2753b(this.f1126a);
        if (b != null) {
            r0Var.f1202c = true;
            r0Var.f1201b = b;
        }
        if (!r0Var.f1203d && !r0Var.f1202c) {
            return false;
        }
        C0235h.m1312a(drawable, r0Var, this.f1126a.getDrawableState());
        return true;
    }
}
