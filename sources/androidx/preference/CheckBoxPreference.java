package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import p096e.p121h.p122j.p124d.C4044h;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: r0 */
    private final C0760a f3057r0;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    private class C0760a implements OnCheckedChangeListener {
        C0760a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo4230a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.mo4274d(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: c */
    private void m3837c(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3113o0);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f3057r0);
        }
    }

    /* renamed from: d */
    private void m3838d(View view) {
        if (((AccessibilityManager) mo4227a().getSystemService("accessibility")).isEnabled()) {
            m3837c(view.findViewById(16908289));
            mo4272b(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4209a(View view) {
        super.mo4209a(view);
        m3838d(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3057r0 = new C0760a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.CheckBoxPreference, i, i2);
        mo4273b((CharSequence) C4044h.m13875b(obtainStyledAttributes, C0778f.CheckBoxPreference_summaryOn, C0778f.CheckBoxPreference_android_summaryOn));
        mo4271a(C4044h.m13875b(obtainStyledAttributes, C0778f.CheckBoxPreference_summaryOff, C0778f.CheckBoxPreference_android_summaryOff));
        mo4275e(C4044h.m13869a(obtainStyledAttributes, C0778f.CheckBoxPreference_disableDependentsState, C0778f.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4044h.m13860a(context, C0775c.checkBoxPreferenceStyle, 16842895));
    }
}
