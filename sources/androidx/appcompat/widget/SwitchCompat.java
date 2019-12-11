package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.C0513i;
import p096e.p097a.C3858a;
import p096e.p097a.C3867j;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p097a.p103n.C3887a;
import p096e.p121h.p135s.C4187x;

public class SwitchCompat extends CompoundButton {

    /* renamed from: J0 */
    private static final Property<SwitchCompat, Float> f853J0 = new C0189a(Float.class, "thumbPos");

    /* renamed from: K0 */
    private static final int[] f854K0 = {16842912};

    /* renamed from: A0 */
    private int f855A0;

    /* renamed from: B0 */
    private final TextPaint f856B0;

    /* renamed from: C0 */
    private ColorStateList f857C0;

    /* renamed from: D0 */
    private Layout f858D0;

    /* renamed from: E0 */
    private Layout f859E0;

    /* renamed from: F0 */
    private TransformationMethod f860F0;

    /* renamed from: G0 */
    ObjectAnimator f861G0;

    /* renamed from: H0 */
    private final C0289v f862H0;

    /* renamed from: I0 */
    private final Rect f863I0;

    /* renamed from: U */
    private ColorStateList f864U;

    /* renamed from: V */
    private Mode f865V;

    /* renamed from: W */
    private boolean f866W;

    /* renamed from: a0 */
    private boolean f867a0;

    /* renamed from: b0 */
    private Drawable f868b0;

    /* renamed from: c */
    private Drawable f869c;

    /* renamed from: c0 */
    private ColorStateList f870c0;

    /* renamed from: d0 */
    private Mode f871d0;

    /* renamed from: e0 */
    private boolean f872e0;

    /* renamed from: f0 */
    private boolean f873f0;

    /* renamed from: g0 */
    private int f874g0;

    /* renamed from: h0 */
    private int f875h0;

    /* renamed from: i0 */
    private int f876i0;

    /* renamed from: j0 */
    private boolean f877j0;

    /* renamed from: k0 */
    private CharSequence f878k0;

    /* renamed from: l0 */
    private CharSequence f879l0;

    /* renamed from: m0 */
    private boolean f880m0;

    /* renamed from: n0 */
    private int f881n0;

    /* renamed from: o0 */
    private int f882o0;

    /* renamed from: p0 */
    private float f883p0;

    /* renamed from: q0 */
    private float f884q0;

    /* renamed from: r0 */
    private VelocityTracker f885r0;

    /* renamed from: s0 */
    private int f886s0;

    /* renamed from: t0 */
    float f887t0;

    /* renamed from: u0 */
    private int f888u0;

    /* renamed from: v0 */
    private int f889v0;

    /* renamed from: w0 */
    private int f890w0;

    /* renamed from: x0 */
    private int f891x0;

    /* renamed from: y0 */
    private int f892y0;

    /* renamed from: z0 */
    private int f893z0;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    static class C0189a extends Property<SwitchCompat, Float> {
        C0189a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f887t0);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static float m1077a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: b */
    private void m1084b() {
        if (this.f868b0 == null) {
            return;
        }
        if (this.f872e0 || this.f873f0) {
            this.f868b0 = C0492a.m2652i(this.f868b0).mutate();
            if (this.f872e0) {
                C0492a.m2637a(this.f868b0, this.f870c0);
            }
            if (this.f873f0) {
                C0492a.m2640a(this.f868b0, this.f871d0);
            }
            if (this.f868b0.isStateful()) {
                this.f868b0.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m1086c() {
        ObjectAnimator objectAnimator = this.f861G0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f887t0 > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0302z0.m1635a(this)) {
            f = 1.0f - this.f887t0;
        } else {
            f = this.f887t0;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f868b0;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f863I0;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f869c;
        if (drawable2 != null) {
            rect = C0204b0.m1175d(drawable2);
        } else {
            rect = C0204b0.f963c;
        }
        return ((((this.f888u0 - this.f890w0) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* renamed from: a */
    public void mo1313a(Context context, int i) {
        C0284t0 a = C0284t0.m1484a(context, i, C3867j.TextAppearance);
        ColorStateList a2 = a.mo1906a(C3867j.TextAppearance_android_textColor);
        if (a2 != null) {
            this.f857C0 = a2;
        } else {
            this.f857C0 = getTextColors();
        }
        int c = a.mo1913c(C3867j.TextAppearance_android_textSize, 0);
        if (c != 0) {
            float f = (float) c;
            if (f != this.f856B0.getTextSize()) {
                this.f856B0.setTextSize(f);
                requestLayout();
            }
        }
        m1080a(a.mo1915d(C3867j.TextAppearance_android_typeface, -1), a.mo1915d(C3867j.TextAppearance_android_textStyle, -1));
        if (a.mo1909a(C3867j.TextAppearance_textAllCaps, false)) {
            this.f860F0 = new C3887a(getContext());
        } else {
            this.f860F0 = null;
        }
        a.mo1908a();
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f863I0;
        int i3 = this.f891x0;
        int i4 = this.f892y0;
        int i5 = this.f893z0;
        int i6 = this.f855A0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f869c;
        if (drawable != null) {
            rect = C0204b0.m1175d(drawable);
        } else {
            rect = C0204b0.f963c;
        }
        Drawable drawable2 = this.f868b0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f868b0.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f868b0.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f869c;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f890w0 + rect2.right;
            this.f869c.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0492a.m2636a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f869c;
        if (drawable != null) {
            C0492a.m2635a(drawable, f, f2);
        }
        Drawable drawable2 = this.f868b0;
        if (drawable2 != null) {
            C0492a.m2635a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f869c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f868b0;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0302z0.m1635a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f888u0;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f876i0;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0302z0.m1635a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f888u0;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f876i0;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f880m0;
    }

    public boolean getSplitTrack() {
        return this.f877j0;
    }

    public int getSwitchMinWidth() {
        return this.f875h0;
    }

    public int getSwitchPadding() {
        return this.f876i0;
    }

    public CharSequence getTextOff() {
        return this.f879l0;
    }

    public CharSequence getTextOn() {
        return this.f878k0;
    }

    public Drawable getThumbDrawable() {
        return this.f869c;
    }

    public int getThumbTextPadding() {
        return this.f874g0;
    }

    public ColorStateList getThumbTintList() {
        return this.f864U;
    }

    public Mode getThumbTintMode() {
        return this.f865V;
    }

    public Drawable getTrackDrawable() {
        return this.f868b0;
    }

    public ColorStateList getTrackTintList() {
        return this.f870c0;
    }

    public Mode getTrackTintMode() {
        return this.f871d0;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f869c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f868b0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f861G0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f861G0.end();
            this.f861G0 = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f854K0);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f863I0;
        Drawable drawable = this.f868b0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f892y0 + rect.top;
        int i3 = this.f855A0 - rect.bottom;
        Drawable drawable2 = this.f869c;
        if (drawable != null) {
            if (!this.f877j0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0204b0.m1175d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f858D0 : this.f859E0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f857C0;
            if (colorStateList != null) {
                this.f856B0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f856B0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i2 + i3) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f878k0 : this.f879l0;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f869c != null) {
            Rect rect = this.f863I0;
            Drawable drawable = this.f868b0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0204b0.m1175d(this.f869c);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0302z0.m1635a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f888u0 + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f888u0) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i10 = this.f889v0;
            i9 = paddingTop - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f889v0;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f889v0;
            this.f891x0 = i7;
            this.f892y0 = i9;
            this.f855A0 = i8;
            this.f893z0 = i6;
        }
        i8 = i10 + i9;
        this.f891x0 = i7;
        this.f892y0 = i9;
        this.f855A0 = i8;
        this.f893z0 = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f880m0) {
            if (this.f858D0 == null) {
                this.f858D0 = m1078a(this.f878k0);
            }
            if (this.f859E0 == null) {
                this.f859E0 = m1078a(this.f879l0);
            }
        }
        Rect rect = this.f863I0;
        Drawable drawable = this.f869c;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f869c.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f869c.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f890w0 = Math.max(this.f880m0 ? Math.max(this.f858D0.getWidth(), this.f859E0.getWidth()) + (this.f874g0 * 2) : 0, i4);
        Drawable drawable2 = this.f868b0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f868b0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f869c;
        if (drawable3 != null) {
            Rect d = C0204b0.m1175d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f875h0, (this.f890w0 * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f888u0 = max;
        this.f889v0 = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f878k0 : this.f879l0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f885r0
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x00a1
            r2 = 2
            if (r0 == r1) goto L_0x008d
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008d
            goto L_0x00bb
        L_0x0016:
            int r0 = r6.f881n0
            if (r0 == 0) goto L_0x00bb
            if (r0 == r1) goto L_0x0059
            if (r0 == r2) goto L_0x0020
            goto L_0x00bb
        L_0x0020:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f883p0
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003f
        L_0x0034:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003f:
            boolean r0 = androidx.appcompat.widget.C0302z0.m1635a(r6)
            if (r0 == 0) goto L_0x0046
            float r2 = -r2
        L_0x0046:
            float r0 = r6.f887t0
            float r0 = r0 + r2
            float r0 = m1077a(r0, r4, r3)
            float r2 = r6.f887t0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            r6.f883p0 = r7
            r6.setThumbPosition(r0)
        L_0x0058:
            return r1
        L_0x0059:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f883p0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f882o0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007f
            float r4 = r6.f884q0
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f882o0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bb
        L_0x007f:
            r6.f881n0 = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f883p0 = r0
            r6.f884q0 = r3
            return r1
        L_0x008d:
            int r0 = r6.f881n0
            if (r0 != r2) goto L_0x0098
            r6.m1085b(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0098:
            r0 = 0
            r6.f881n0 = r0
            android.view.VelocityTracker r0 = r6.f885r0
            r0.clear()
            goto L_0x00bb
        L_0x00a1:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r6.m1083a(r0, r2)
            if (r3 == 0) goto L_0x00bb
            r6.f881n0 = r1
            r6.f883p0 = r0
            r6.f884q0 = r2
        L_0x00bb:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C4187x.m14340E(this)) {
            m1086c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m1082a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f880m0 != z) {
            this.f880m0 = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f877j0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f875h0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f876i0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f856B0.getTypeface() != null && !this.f856B0.getTypeface().equals(typeface)) || (this.f856B0.getTypeface() == null && typeface != null)) {
            this.f856B0.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f879l0 = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f878k0 = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f869c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f869c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f887t0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C3868a.m12946c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f874g0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f864U = colorStateList;
        this.f866W = true;
        m1079a();
    }

    public void setThumbTintMode(Mode mode) {
        this.f865V = mode;
        this.f867a0 = true;
        m1079a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f868b0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f868b0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C3868a.m12946c(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f870c0 = colorStateList;
        this.f872e0 = true;
        m1084b();
    }

    public void setTrackTintMode(Mode mode) {
        this.f871d0 = mode;
        this.f873f0 = true;
        m1084b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f869c || drawable == this.f868b0;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f864U = null;
        this.f865V = null;
        this.f866W = false;
        this.f867a0 = false;
        this.f870c0 = null;
        this.f871d0 = null;
        this.f872e0 = false;
        this.f873f0 = false;
        this.f885r0 = VelocityTracker.obtain();
        this.f863I0 = new Rect();
        this.f856B0 = new TextPaint(1);
        Resources resources = getResources();
        this.f856B0.density = resources.getDisplayMetrics().density;
        C0284t0 a = C0284t0.m1486a(context, attributeSet, C3867j.SwitchCompat, i, 0);
        this.f869c = a.mo1912b(C3867j.SwitchCompat_android_thumb);
        Drawable drawable = this.f869c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f868b0 = a.mo1912b(C3867j.SwitchCompat_track);
        Drawable drawable2 = this.f868b0;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.f878k0 = a.mo1918e(C3867j.SwitchCompat_android_textOn);
        this.f879l0 = a.mo1918e(C3867j.SwitchCompat_android_textOff);
        this.f880m0 = a.mo1909a(C3867j.SwitchCompat_showText, true);
        this.f874g0 = a.mo1913c(C3867j.SwitchCompat_thumbTextPadding, 0);
        this.f875h0 = a.mo1913c(C3867j.SwitchCompat_switchMinWidth, 0);
        this.f876i0 = a.mo1913c(C3867j.SwitchCompat_switchPadding, 0);
        this.f877j0 = a.mo1909a(C3867j.SwitchCompat_splitTrack, false);
        ColorStateList a2 = a.mo1906a(C3867j.SwitchCompat_thumbTint);
        if (a2 != null) {
            this.f864U = a2;
            this.f866W = true;
        }
        Mode a3 = C0204b0.m1171a(a.mo1915d(C3867j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f865V != a3) {
            this.f865V = a3;
            this.f867a0 = true;
        }
        if (this.f866W || this.f867a0) {
            m1079a();
        }
        ColorStateList a4 = a.mo1906a(C3867j.SwitchCompat_trackTint);
        if (a4 != null) {
            this.f870c0 = a4;
            this.f872e0 = true;
        }
        Mode a5 = C0204b0.m1171a(a.mo1915d(C3867j.SwitchCompat_trackTintMode, -1), null);
        if (this.f871d0 != a5) {
            this.f871d0 = a5;
            this.f873f0 = true;
        }
        if (this.f872e0 || this.f873f0) {
            m1084b();
        }
        int g = a.mo1921g(C3867j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo1313a(context, g);
        }
        this.f862H0 = new C0289v(this);
        this.f862H0.mo1941a(attributeSet, i);
        a.mo1908a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f882o0 = viewConfiguration.getScaledTouchSlop();
        this.f886s0 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: b */
    private void m1085b(MotionEvent motionEvent) {
        boolean z;
        this.f881n0 = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f885r0.computeCurrentVelocity(1000);
            float xVelocity = this.f885r0.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f886s0)) {
                if (!C0302z0.m1635a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m1081a(motionEvent);
    }

    /* renamed from: a */
    private void m1080a(int i, int i2) {
        Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
        mo1314a(typeface, i2);
    }

    /* renamed from: a */
    public void mo1314a(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.f856B0;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f856B0;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f856B0.setFakeBoldText(false);
        this.f856B0.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    /* renamed from: a */
    private void m1079a() {
        if (this.f869c == null) {
            return;
        }
        if (this.f866W || this.f867a0) {
            this.f869c = C0492a.m2652i(this.f869c).mutate();
            if (this.f866W) {
                C0492a.m2637a(this.f869c, this.f864U);
            }
            if (this.f867a0) {
                C0492a.m2640a(this.f869c, this.f865V);
            }
            if (this.f869c.isStateful()) {
                this.f869c.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private Layout m1078a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f860F0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f856B0;
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    /* renamed from: a */
    private boolean m1083a(float f, float f2) {
        boolean z = false;
        if (this.f869c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f869c.getPadding(this.f863I0);
        int i = this.f892y0;
        int i2 = this.f882o0;
        int i3 = i - i2;
        int i4 = (this.f891x0 + thumbOffset) - i2;
        int i5 = this.f890w0 + i4;
        Rect rect = this.f863I0;
        int i6 = i5 + rect.left + rect.right + i2;
        int i7 = this.f855A0 + i2;
        if (f > ((float) i4) && f < ((float) i6) && f2 > ((float) i3) && f2 < ((float) i7)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private void m1081a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m1082a(boolean z) {
        this.f861G0 = ObjectAnimator.ofFloat(this, f853J0, new float[]{z ? 1.0f : 0.0f});
        this.f861G0.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f861G0.setAutoCancel(true);
        }
        this.f861G0.start();
    }
}
