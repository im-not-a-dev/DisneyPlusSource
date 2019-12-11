package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0506b;
import androidx.core.widget.C0513i;
import androidx.core.widget.C0516k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p125k.C4049c;
import p096e.p121h.p132q.C4092d;
import p096e.p121h.p132q.C4092d.C4093a;
import p096e.p121h.p135s.C4186w;

/* renamed from: androidx.appcompat.widget.w */
/* compiled from: AppCompatTextView */
public class C0293w extends TextView implements C4186w, C0516k, C0506b {

    /* renamed from: U */
    private final C0289v f1284U;

    /* renamed from: V */
    private final C0285u f1285V;

    /* renamed from: W */
    private Future<C4092d> f1286W;

    /* renamed from: c */
    private final C0219e f1287c;

    public C0293w(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void mo616d() {
        Future<C4092d> future = this.f1286W;
        if (future != null) {
            try {
                this.f1286W = null;
                C0513i.m2771a((TextView) this, (C4092d) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0219e eVar = this.f1287c;
        if (eVar != null) {
            eVar.mo1563a();
        }
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1933a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0506b.f2275a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            return vVar.mo1947c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0506b.f2275a) {
            return super.getAutoSizeMinTextSize();
        }
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            return vVar.mo1948d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0506b.f2275a) {
            return super.getAutoSizeStepGranularity();
        }
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            return vVar.mo1949e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0506b.f2275a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0289v vVar = this.f1284U;
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
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            return vVar.mo1951g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C0513i.m2773b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0513i.m2775c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0219e eVar = this.f1287c;
        if (eVar != null) {
            return eVar.mo1569b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0219e eVar = this.f1287c;
        if (eVar != null) {
            return eVar.mo1571c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1284U.mo1952h();
    }

    public Mode getSupportCompoundDrawablesTintMode() {
        return this.f1284U.mo1953i();
    }

    public CharSequence getText() {
        mo616d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C0285u uVar = this.f1285V;
            if (uVar != null) {
                return uVar.mo1923a();
            }
        }
        return super.getTextClassifier();
    }

    public C4093a getTextMetricsParamsCompat() {
        return C0513i.m2780f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0241j.m1340a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1944a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo616d();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0289v vVar = this.f1284U;
        if (vVar != null && !C0506b.f2275a && vVar.mo1954j()) {
            this.f1284U.mo1946b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0506b.f2275a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1936a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0506b.f2275a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1945a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0506b.f2275a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1934a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0219e eVar = this.f1287c;
        if (eVar != null) {
            eVar.mo1567a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0219e eVar = this.f1287c;
        if (eVar != null) {
            eVar.mo1564a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1955k();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1955k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1955k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1955k();
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0513i.m2766a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0513i.m2774b(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0513i.m2776c(this, i);
    }

    public void setPrecomputedText(C4092d dVar) {
        C0513i.m2771a((TextView) this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0219e eVar = this.f1287c;
        if (eVar != null) {
            eVar.mo1570b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0219e eVar = this.f1287c;
        if (eVar != null) {
            eVar.mo1566a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1284U.mo1938a(colorStateList);
        this.f1284U.mo1933a();
    }

    public void setSupportCompoundDrawablesTintMode(Mode mode) {
        this.f1284U.mo1939a(mode);
        this.f1284U.mo1933a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1937a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C0285u uVar = this.f1285V;
            if (uVar != null) {
                uVar.mo1924a(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<C4092d> future) {
        this.f1286W = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C4093a aVar) {
        C0513i.m2770a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0506b.f2275a) {
            super.setTextSize(i, f);
            return;
        }
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1935a(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C4049c.m13899a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }

    public C0293w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0293w(Context context, AttributeSet attributeSet, int i) {
        super(C0267q0.m1439b(context), attributeSet, i);
        this.f1287c = new C0219e(this);
        this.f1287c.mo1568a(attributeSet, i);
        this.f1284U = new C0289v(this);
        this.f1284U.mo1941a(attributeSet, i);
        this.f1284U.mo1933a();
        this.f1285V = new C0285u(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C3868a.m12946c(context, i) : null;
        Drawable c2 = i2 != 0 ? C3868a.m12946c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C3868a.m12946c(context, i3) : null;
        if (i4 != 0) {
            drawable = C3868a.m12946c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1955k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C3868a.m12946c(context, i) : null;
        Drawable c2 = i2 != 0 ? C3868a.m12946c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C3868a.m12946c(context, i3) : null;
        if (i4 != 0) {
            drawable = C3868a.m12946c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        C0289v vVar = this.f1284U;
        if (vVar != null) {
            vVar.mo1955k();
        }
    }
}
