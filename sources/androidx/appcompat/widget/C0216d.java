package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import p096e.p097a.C3858a;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p135s.C4186w;

/* renamed from: androidx.appcompat.widget.d */
/* compiled from: AppCompatAutoCompleteTextView */
public class C0216d extends AutoCompleteTextView implements C4186w {

    /* renamed from: V */
    private static final int[] f1009V = {16843126};

    /* renamed from: U */
    private final C0289v f1010U;

    /* renamed from: c */
    private final C0219e f1011c;

    public C0216d(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0219e eVar = this.f1011c;
        if (eVar != null) {
            eVar.mo1563a();
        }
        C0289v vVar = this.f1010U;
        if (vVar != null) {
            vVar.mo1933a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0219e eVar = this.f1011c;
        if (eVar != null) {
            return eVar.mo1569b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0219e eVar = this.f1011c;
        if (eVar != null) {
            return eVar.mo1571c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0241j.m1340a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0219e eVar = this.f1011c;
        if (eVar != null) {
            eVar.mo1567a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0219e eVar = this.f1011c;
        if (eVar != null) {
            eVar.mo1564a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C3868a.m12946c(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0219e eVar = this.f1011c;
        if (eVar != null) {
            eVar.mo1570b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0219e eVar = this.f1011c;
        if (eVar != null) {
            eVar.mo1566a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0289v vVar = this.f1010U;
        if (vVar != null) {
            vVar.mo1937a(context, i);
        }
    }

    public C0216d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.autoCompleteTextViewStyle);
    }

    public C0216d(Context context, AttributeSet attributeSet, int i) {
        super(C0267q0.m1439b(context), attributeSet, i);
        C0284t0 a = C0284t0.m1486a(getContext(), attributeSet, f1009V, i, 0);
        if (a.mo1922g(0)) {
            setDropDownBackgroundDrawable(a.mo1912b(0));
        }
        a.mo1908a();
        this.f1011c = new C0219e(this);
        this.f1011c.mo1568a(attributeSet, i);
        this.f1010U = new C0289v(this);
        this.f1010U.mo1941a(attributeSet, i);
        this.f1010U.mo1933a();
    }
}
