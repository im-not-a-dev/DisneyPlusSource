package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.internal.AbstractMultiSelectListPreference;
import java.util.HashSet;
import p096e.p121h.p122j.p124d.C4044h;

public class MultiSelectListPreference extends AbstractMultiSelectListPreference {
    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.MultiSelectListPreference, i, i2);
        C4044h.m13878d(obtainStyledAttributes, C0778f.MultiSelectListPreference_entries, C0778f.MultiSelectListPreference_android_entries);
        C4044h.m13878d(obtainStyledAttributes, C0778f.MultiSelectListPreference_entryValues, C0778f.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo4216a(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4044h.m13860a(context, C0775c.dialogPreferenceStyle, 16842897));
    }
}
