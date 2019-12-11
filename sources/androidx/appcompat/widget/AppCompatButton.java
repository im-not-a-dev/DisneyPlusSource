package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.C0506b;
import androidx.core.widget.C0513i;
import p096e.p097a.C3858a;
import p096e.p121h.p135s.C4186w;

public class AppCompatButton extends Button implements C4186w, C0506b {

    /* renamed from: U */
    private final C0289v f757U;

    /* renamed from: c */
    private final C0219e f758c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0219e eVar = this.f758c;
        if (eVar != null) {
            eVar.mo1563a();
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            vVar.mo1933a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0506b.f2275a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            return vVar.mo1947c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0506b.f2275a) {
            return super.getAutoSizeMinTextSize();
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            return vVar.mo1948d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0506b.f2275a) {
            return super.getAutoSizeStepGranularity();
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            return vVar.mo1949e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0506b.f2275a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0289v vVar = this.f757U;
        return vVar != null ? vVar.mo1950f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i = 0;
        if (C0506b.f2275a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            return vVar.mo1951g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0219e eVar = this.f758c;
        if (eVar != null) {
            return eVar.mo1569b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0219e eVar = this.f758c;
        if (eVar != null) {
            return eVar.mo1571c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0289v vVar = this.f757U;
        if (vVar != null) {
            vVar.mo1944a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0289v vVar = this.f757U;
        if (vVar != null && !C0506b.f2275a && vVar.mo1954j()) {
            this.f757U.mo1946b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0506b.f2275a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            vVar.mo1936a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0506b.f2275a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            vVar.mo1945a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0506b.f2275a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            vVar.mo1934a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0219e eVar = this.f758c;
        if (eVar != null) {
            eVar.mo1567a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0219e eVar = this.f758c;
        if (eVar != null) {
            eVar.mo1564a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0289v vVar = this.f757U;
        if (vVar != null) {
            vVar.mo1943a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0219e eVar = this.f758c;
        if (eVar != null) {
            eVar.mo1570b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0219e eVar = this.f758c;
        if (eVar != null) {
            eVar.mo1566a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0289v vVar = this.f757U;
        if (vVar != null) {
            vVar.mo1937a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0506b.f2275a) {
            super.setTextSize(i, f);
            return;
        }
        C0289v vVar = this.f757U;
        if (vVar != null) {
            vVar.mo1935a(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0267q0.m1439b(context), attributeSet, i);
        this.f758c = new C0219e(this);
        this.f758c.mo1568a(attributeSet, i);
        this.f757U = new C0289v(this);
        this.f757U.mo1941a(attributeSet, i);
        this.f757U.mo1933a();
    }
}
