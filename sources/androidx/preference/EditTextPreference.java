package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p096e.p121h.p122j.p124d.C4044h;

public class EditTextPreference extends DialogPreference {

    /* renamed from: n0 */
    private String f3064n0;

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo4216a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: o */
    public boolean mo4217o() {
        return TextUtils.isEmpty(this.f3064n0) || super.mo4217o();
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4044h.m13860a(context, C0775c.editTextPreferenceStyle, 16842898));
    }
}
