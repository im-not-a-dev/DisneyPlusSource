package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import androidx.leanback.widget.C0662g.C0663a;
import androidx.leanback.widget.C0664h.C0665a;

public class GuidedActionEditText extends EditText implements C0664h, C0662g {

    /* renamed from: U */
    private C0663a f2577U;

    /* renamed from: V */
    private final Drawable f2578V;

    /* renamed from: W */
    private final Drawable f2579W;

    /* renamed from: c */
    private C0665a f2580c;

    /* renamed from: androidx.leanback.widget.GuidedActionEditText$a */
    static final class C0609a extends Drawable {
        C0609a() {
        }

        public void draw(Canvas canvas) {
        }

        public int getOpacity() {
            return -2;
        }

        public boolean getPadding(Rect rect) {
            rect.set(0, 0, 0, 0);
            return true;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public GuidedActionEditText(Context context) {
        this(context, null);
    }

    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        C0663a aVar = this.f2577U;
        if (aVar != null) {
            aVar.mo3965a(this);
        }
    }

    public int getAutofillType() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setBackground(this.f2578V);
        } else {
            setBackground(this.f2579W);
        }
        if (!z) {
            setFocusable(false);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C0665a aVar = this.f2580c;
        boolean a = aVar != null ? aVar.mo3966a(this, i, keyEvent) : false;
        return !a ? super.onKeyPreIme(i, keyEvent) : a;
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public void setImeKeyListener(C0665a aVar) {
        this.f2580c = aVar;
    }

    public void setOnAutofillListener(C0663a aVar) {
        this.f2577U = aVar;
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842862);
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2578V = getBackground();
        this.f2579W = new C0609a();
        setBackground(this.f2579W);
    }
}
