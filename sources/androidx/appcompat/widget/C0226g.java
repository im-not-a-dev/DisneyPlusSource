package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.C0507c;

/* renamed from: androidx.appcompat.widget.g */
/* compiled from: AppCompatCompoundButtonHelper */
class C0226g {

    /* renamed from: a */
    private final CompoundButton f1048a;

    /* renamed from: b */
    private ColorStateList f1049b = null;

    /* renamed from: c */
    private Mode f1050c = null;

    /* renamed from: d */
    private boolean f1051d = false;

    /* renamed from: e */
    private boolean f1052e = false;

    /* renamed from: f */
    private boolean f1053f;

    C0226g(CompoundButton compoundButton) {
        this.f1048a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1627a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f1048a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p096e.p097a.C3867j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = p096e.p097a.C3867j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = p096e.p097a.C3867j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.f1048a     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.f1048a     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = p096e.p097a.p098k.p099a.C3868a.m12946c(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = p096e.p097a.C3867j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = p096e.p097a.C3867j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.f1048a     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.f1048a     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = p096e.p097a.p098k.p099a.C3868a.m12946c(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = p096e.p097a.C3867j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.f1048a     // Catch:{ all -> 0x0080 }
            int r0 = p096e.p097a.C3867j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C0507c.m2747a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = p096e.p097a.C3867j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.f1048a     // Catch:{ all -> 0x0080 }
            int r0 = p096e.p097a.C3867j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0204b0.m1171a(r0, r1)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C0507c.m2748a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0226g.mo1627a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1628b() {
        return this.f1049b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1629c() {
        return this.f1050c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1630d() {
        if (this.f1053f) {
            this.f1053f = false;
            return;
        }
        this.f1053f = true;
        mo1624a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1625a(ColorStateList colorStateList) {
        this.f1049b = colorStateList;
        this.f1051d = true;
        mo1624a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1626a(Mode mode) {
        this.f1050c = mode;
        this.f1052e = true;
        mo1624a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1624a() {
        Drawable a = C0507c.m2746a(this.f1048a);
        if (a == null) {
            return;
        }
        if (this.f1051d || this.f1052e) {
            Drawable mutate = C0492a.m2652i(a).mutate();
            if (this.f1051d) {
                C0492a.m2637a(mutate, this.f1049b);
            }
            if (this.f1052e) {
                C0492a.m2640a(mutate, this.f1050c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1048a.getDrawableState());
            }
            this.f1048a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1623a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0507c.m2746a(this.f1048a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }
}
