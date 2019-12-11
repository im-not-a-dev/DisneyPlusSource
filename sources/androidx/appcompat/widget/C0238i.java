package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import p096e.p097a.C3858a;
import p096e.p121h.p135s.C4186w;

/* renamed from: androidx.appcompat.widget.i */
/* compiled from: AppCompatEditText */
public class C0238i extends EditText implements C4186w {

    /* renamed from: U */
    private final C0289v f1104U;

    /* renamed from: V */
    private final C0285u f1105V;

    /* renamed from: c */
    private final C0219e f1106c;

    public C0238i(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0219e eVar = this.f1106c;
        if (eVar != null) {
            eVar.mo1563a();
        }
        C0289v vVar = this.f1104U;
        if (vVar != null) {
            vVar.mo1933a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0219e eVar = this.f1106c;
        if (eVar != null) {
            return eVar.mo1569b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0219e eVar = this.f1106c;
        if (eVar != null) {
            return eVar.mo1571c();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C0285u uVar = this.f1105V;
            if (uVar != null) {
                return uVar.mo1923a();
            }
        }
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0241j.m1340a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0219e eVar = this.f1106c;
        if (eVar != null) {
            eVar.mo1567a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0219e eVar = this.f1106c;
        if (eVar != null) {
            eVar.mo1564a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0219e eVar = this.f1106c;
        if (eVar != null) {
            eVar.mo1570b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0219e eVar = this.f1106c;
        if (eVar != null) {
            eVar.mo1566a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0289v vVar = this.f1104U;
        if (vVar != null) {
            vVar.mo1937a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C0285u uVar = this.f1105V;
            if (uVar != null) {
                uVar.mo1924a(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public C0238i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.editTextStyle);
    }

    public Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public C0238i(Context context, AttributeSet attributeSet, int i) {
        super(C0267q0.m1439b(context), attributeSet, i);
        this.f1106c = new C0219e(this);
        this.f1106c.mo1568a(attributeSet, i);
        this.f1104U = new C0289v(this);
        this.f1104U.mo1941a(attributeSet, i);
        this.f1104U.mo1933a();
        this.f1105V = new C0285u(this);
    }
}
