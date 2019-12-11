package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import p096e.p097a.p098k.p099a.C3868a;

/* renamed from: androidx.appcompat.widget.f */
/* compiled from: AppCompatCheckedTextView */
public class C0223f extends CheckedTextView {

    /* renamed from: U */
    private static final int[] f1029U = {16843016};

    /* renamed from: c */
    private final C0289v f1030c;

    public C0223f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0289v vVar = this.f1030c;
        if (vVar != null) {
            vVar.mo1933a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0241j.m1340a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C3868a.m12946c(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0289v vVar = this.f1030c;
        if (vVar != null) {
            vVar.mo1937a(context, i);
        }
    }

    public C0223f(Context context, AttributeSet attributeSet, int i) {
        super(C0267q0.m1439b(context), attributeSet, i);
        this.f1030c = new C0289v(this);
        this.f1030c.mo1941a(attributeSet, i);
        this.f1030c.mo1933a();
        C0284t0 a = C0284t0.m1486a(getContext(), attributeSet, f1029U, i, 0);
        setCheckMarkDrawable(a.mo1912b(0));
        a.mo1908a();
    }
}
