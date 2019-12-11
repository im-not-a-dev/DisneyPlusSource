package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import p096e.p121h.p122j.p124d.C4044h;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: r0 */
    private final C0769a f3103r0;

    /* renamed from: s0 */
    private CharSequence f3104s0;

    /* renamed from: t0 */
    private CharSequence f3105t0;

    /* renamed from: androidx.preference.SwitchPreference$a */
    private class C0769a implements OnCheckedChangeListener {
        C0769a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo4230a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.mo4274d(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3103r0 = new C0769a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.SwitchPreference, i, i2);
        mo4273b((CharSequence) C4044h.m13875b(obtainStyledAttributes, C0778f.SwitchPreference_summaryOn, C0778f.SwitchPreference_android_summaryOn));
        mo4271a(C4044h.m13875b(obtainStyledAttributes, C0778f.SwitchPreference_summaryOff, C0778f.SwitchPreference_android_summaryOff));
        mo4266d((CharSequence) C4044h.m13875b(obtainStyledAttributes, C0778f.SwitchPreference_switchTextOn, C0778f.SwitchPreference_android_switchTextOn));
        mo4265c((CharSequence) C4044h.m13875b(obtainStyledAttributes, C0778f.SwitchPreference_switchTextOff, C0778f.SwitchPreference_android_switchTextOff));
        mo4275e(C4044h.m13869a(obtainStyledAttributes, C0778f.SwitchPreference_disableDependentsState, C0778f.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4209a(View view) {
        super.mo4209a(view);
        m3902d(view);
    }

    /* renamed from: c */
    public void mo4265c(CharSequence charSequence) {
        this.f3105t0 = charSequence;
        mo4212l();
    }

    /* renamed from: d */
    public void mo4266d(CharSequence charSequence) {
        this.f3104s0 = charSequence;
        mo4212l();
    }

    /* renamed from: c */
    private void m3901c(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3113o0);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f3104s0);
            switchR.setTextOff(this.f3105t0);
            switchR.setOnCheckedChangeListener(this.f3103r0);
        }
    }

    /* renamed from: d */
    private void m3902d(View view) {
        if (((AccessibilityManager) mo4227a().getSystemService("accessibility")).isEnabled()) {
            m3901c(view.findViewById(16908352));
            mo4272b(view.findViewById(16908304));
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4044h.m13860a(context, C0775c.switchPreferenceStyle, 16843629));
    }
}
