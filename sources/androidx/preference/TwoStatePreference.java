package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: m0 */
    private CharSequence f3111m0;

    /* renamed from: n0 */
    private CharSequence f3112n0;

    /* renamed from: o0 */
    protected boolean f3113o0;

    /* renamed from: p0 */
    private boolean f3114p0;

    /* renamed from: q0 */
    private boolean f3115q0;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public void mo4271a(CharSequence charSequence) {
        this.f3112n0 = charSequence;
        if (!mo4276q()) {
            mo4212l();
        }
    }

    /* renamed from: b */
    public void mo4273b(CharSequence charSequence) {
        this.f3111m0 = charSequence;
        if (mo4276q()) {
            mo4212l();
        }
    }

    /* renamed from: d */
    public void mo4274d(boolean z) {
        boolean z2 = this.f3113o0 != z;
        if (z2 || !this.f3114p0) {
            this.f3113o0 = z;
            this.f3114p0 = true;
            mo4238c(z);
            if (z2) {
                mo4234b(mo4217o());
                mo4212l();
            }
        }
    }

    /* renamed from: e */
    public void mo4275e(boolean z) {
        this.f3115q0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4211m() {
        super.mo4211m();
        boolean z = !mo4276q();
        if (mo4230a((Object) Boolean.valueOf(z))) {
            mo4274d(z);
        }
    }

    /* renamed from: o */
    public boolean mo4217o() {
        boolean z = this.f3115q0 ? this.f3113o0 : !this.f3113o0;
        if (z || super.mo4217o()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo4276q() {
        return this.f3113o0;
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo4216a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4272b(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f3113o0
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.f3111m0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.f3111m0
            r5.setText(r0)
        L_0x001a:
            r0 = 0
            goto L_0x002e
        L_0x001c:
            boolean r1 = r4.f3113o0
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r1 = r4.f3112n0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r0 = r4.f3112n0
            r5.setText(r0)
            goto L_0x001a
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r1 = r4.mo4220g()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003e
            r5.setText(r1)
            r0 = 0
        L_0x003e:
            r1 = 8
            if (r0 != 0) goto L_0x0043
            r1 = 0
        L_0x0043:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L_0x004c
            r5.setVisibility(r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo4272b(android.view.View):void");
    }
}
