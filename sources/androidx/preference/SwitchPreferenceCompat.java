package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import p096e.p121h.p122j.p124d.C4044h;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: r0 */
    private final C0770a f3107r0;

    /* renamed from: s0 */
    private CharSequence f3108s0;

    /* renamed from: t0 */
    private CharSequence f3109t0;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C0770a implements OnCheckedChangeListener {
        C0770a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo4230a((Object) Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.mo4274d(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3107r0 = new C0770a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0778f.SwitchPreferenceCompat, i, i2);
        mo4273b((CharSequence) C4044h.m13875b(obtainStyledAttributes, C0778f.SwitchPreferenceCompat_summaryOn, C0778f.SwitchPreferenceCompat_android_summaryOn));
        mo4271a(C4044h.m13875b(obtainStyledAttributes, C0778f.SwitchPreferenceCompat_summaryOff, C0778f.SwitchPreferenceCompat_android_summaryOff));
        mo4269d((CharSequence) C4044h.m13875b(obtainStyledAttributes, C0778f.SwitchPreferenceCompat_switchTextOn, C0778f.SwitchPreferenceCompat_android_switchTextOn));
        mo4268c((CharSequence) C4044h.m13875b(obtainStyledAttributes, C0778f.SwitchPreferenceCompat_switchTextOff, C0778f.SwitchPreferenceCompat_android_switchTextOff));
        mo4275e(C4044h.m13869a(obtainStyledAttributes, C0778f.SwitchPreferenceCompat_disableDependentsState, C0778f.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4209a(View view) {
        super.mo4209a(view);
        m3907d(view);
    }

    /* renamed from: c */
    public void mo4268c(CharSequence charSequence) {
        this.f3109t0 = charSequence;
        mo4212l();
    }

    /* renamed from: d */
    public void mo4269d(CharSequence charSequence) {
        this.f3108s0 = charSequence;
        mo4212l();
    }

    /* renamed from: c */
    private void m3906c(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3113o0);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f3108s0);
            switchCompat.setTextOff(this.f3109t0);
            switchCompat.setOnCheckedChangeListener(this.f3107r0);
        }
    }

    /* renamed from: d */
    private void m3907d(View view) {
        if (((AccessibilityManager) mo4227a().getSystemService("accessibility")).isEnabled()) {
            m3906c(view.findViewById(C0776d.switchWidget));
            mo4272b(view.findViewById(16908304));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0775c.switchPreferenceCompatStyle);
    }
}
