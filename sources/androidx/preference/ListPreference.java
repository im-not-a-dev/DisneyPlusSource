package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p096e.p121h.p122j.p124d.C4044h;

public class ListPreference extends DialogPreference {

    /* renamed from: n0 */
    private CharSequence[] f3065n0;

    /* renamed from: o0 */
    private CharSequence[] f3066o0;

    /* renamed from: p0 */
    private String f3067p0;

    /* renamed from: q0 */
    private String f3068q0;

    /* renamed from: r0 */
    private boolean f3069r0;

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.ListPreference, i, i2);
        this.f3065n0 = C4044h.m13878d(obtainStyledAttributes, C0778f.ListPreference_entries, C0778f.ListPreference_android_entries);
        this.f3066o0 = C4044h.m13878d(obtainStyledAttributes, C0778f.ListPreference_entryValues, C0778f.ListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0778f.Preference, i, i2);
        this.f3068q0 = C4044h.m13875b(obtainStyledAttributes2, C0778f.Preference_summary, C0778f.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: u */
    private int mo4213u() {
        return mo4218c(this.f3067p0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo4216a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: c */
    public int mo4218c(String str) {
        if (str != null) {
            CharSequence[] charSequenceArr = this.f3066o0;
            if (charSequenceArr != null) {
                for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                    if (this.f3066o0[length].equals(str)) {
                        return length;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: d */
    public void mo4219d(String str) {
        boolean z = !TextUtils.equals(this.f3067p0, str);
        if (z || !this.f3069r0) {
            this.f3067p0 = str;
            this.f3069r0 = true;
            mo4236b(str);
            if (z) {
                mo4212l();
            }
        }
    }

    /* renamed from: g */
    public CharSequence mo4220g() {
        Object r = mo4222r();
        String str = this.f3068q0;
        if (str == null) {
            return super.mo4220g();
        }
        Object[] objArr = new Object[1];
        if (r == null) {
            r = "";
        }
        objArr[0] = r;
        return String.format(str, objArr);
    }

    /* renamed from: q */
    public CharSequence[] mo4221q() {
        return this.f3065n0;
    }

    /* renamed from: r */
    public CharSequence mo4222r() {
        int u = mo4213u();
        if (u >= 0) {
            CharSequence[] charSequenceArr = this.f3065n0;
            if (charSequenceArr != null) {
                return charSequenceArr[u];
            }
        }
        return null;
    }

    /* renamed from: s */
    public CharSequence[] mo4223s() {
        return this.f3066o0;
    }

    /* renamed from: t */
    public String mo4224t() {
        return this.f3067p0;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4044h.m13860a(context, C0775c.dialogPreferenceStyle, 16842897));
    }
}
