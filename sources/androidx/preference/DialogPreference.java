package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p096e.p121h.p122j.p124d.C4044h;

public abstract class DialogPreference extends Preference {

    /* renamed from: m0 */
    private CharSequence f3059m0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.DialogPreference, i, i2);
        this.f3059m0 = C4044h.m13875b(obtainStyledAttributes, C0778f.DialogPreference_dialogTitle, C0778f.DialogPreference_android_dialogTitle);
        if (this.f3059m0 == null) {
            this.f3059m0 = mo4243h();
        }
        C4044h.m13875b(obtainStyledAttributes, C0778f.DialogPreference_dialogMessage, C0778f.DialogPreference_android_dialogMessage);
        C4044h.m13866a(obtainStyledAttributes, C0778f.DialogPreference_dialogIcon, C0778f.DialogPreference_android_dialogIcon);
        C4044h.m13875b(obtainStyledAttributes, C0778f.DialogPreference_positiveButtonText, C0778f.DialogPreference_android_positiveButtonText);
        C4044h.m13875b(obtainStyledAttributes, C0778f.DialogPreference_negativeButtonText, C0778f.DialogPreference_android_negativeButtonText);
        C4044h.m13872b(obtainStyledAttributes, C0778f.DialogPreference_dialogLayout, C0778f.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4211m() {
        mo4242f().mo4285a(this);
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4044h.m13860a(context, C0775c.dialogPreferenceStyle, 16842897));
    }
}
