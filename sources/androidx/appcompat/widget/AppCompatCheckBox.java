package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.C0515j;
import p096e.p097a.C3858a;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p135s.C4186w;

public class AppCompatCheckBox extends CheckBox implements C0515j, C4186w {

    /* renamed from: U */
    private final C0219e f759U;

    /* renamed from: V */
    private final C0289v f760V;

    /* renamed from: c */
    private final C0226g f761c;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0219e eVar = this.f759U;
        if (eVar != null) {
            eVar.mo1563a();
        }
        C0289v vVar = this.f760V;
        if (vVar != null) {
            vVar.mo1933a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0226g gVar = this.f761c;
        return gVar != null ? gVar.mo1623a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0219e eVar = this.f759U;
        if (eVar != null) {
            return eVar.mo1569b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0219e eVar = this.f759U;
        if (eVar != null) {
            return eVar.mo1571c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0226g gVar = this.f761c;
        if (gVar != null) {
            return gVar.mo1628b();
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        C0226g gVar = this.f761c;
        if (gVar != null) {
            return gVar.mo1629c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0219e eVar = this.f759U;
        if (eVar != null) {
            eVar.mo1567a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0219e eVar = this.f759U;
        if (eVar != null) {
            eVar.mo1564a(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0226g gVar = this.f761c;
        if (gVar != null) {
            gVar.mo1630d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0219e eVar = this.f759U;
        if (eVar != null) {
            eVar.mo1570b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0219e eVar = this.f759U;
        if (eVar != null) {
            eVar.mo1566a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0226g gVar = this.f761c;
        if (gVar != null) {
            gVar.mo1625a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        C0226g gVar = this.f761c;
        if (gVar != null) {
            gVar.mo1626a(mode);
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0267q0.m1439b(context), attributeSet, i);
        this.f761c = new C0226g(this);
        this.f761c.mo1627a(attributeSet, i);
        this.f759U = new C0219e(this);
        this.f759U.mo1568a(attributeSet, i);
        this.f760V = new C0289v(this);
        this.f760V.mo1941a(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C3868a.m12946c(getContext(), i));
    }
}
