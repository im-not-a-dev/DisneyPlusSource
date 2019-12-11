package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewOutlineProvider;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.material.chip.C10293a.C10295b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p096e.p121h.p122j.p124d.C4039f.C4040a;
import p096e.p121h.p132q.C4087a;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4154d.C4155a;
import p096e.p140j.p142b.C4207a;
import p163g.p449j.p450a.p468b.C11458b;
import p163g.p449j.p450a.p468b.C11465i;
import p163g.p449j.p450a.p468b.C11466j;
import p163g.p449j.p450a.p468b.p469l.C11475h;
import p163g.p449j.p450a.p468b.p477s.C11500b;
import p163g.p449j.p450a.p468b.p478t.C11503a;

public class Chip extends AppCompatCheckBox implements C10295b {
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public static final Rect f24220m0 = new Rect();

    /* renamed from: n0 */
    private static final int[] f24221n0 = {16842913};
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C10293a f24222W;

    /* renamed from: a0 */
    private RippleDrawable f24223a0;

    /* renamed from: b0 */
    private OnClickListener f24224b0;

    /* renamed from: c0 */
    private OnCheckedChangeListener f24225c0;

    /* renamed from: d0 */
    private boolean f24226d0;

    /* renamed from: e0 */
    private int f24227e0;

    /* renamed from: f0 */
    private boolean f24228f0;

    /* renamed from: g0 */
    private boolean f24229g0;

    /* renamed from: h0 */
    private boolean f24230h0;

    /* renamed from: i0 */
    private final C10292c f24231i0;

    /* renamed from: j0 */
    private final Rect f24232j0;

    /* renamed from: k0 */
    private final RectF f24233k0;

    /* renamed from: l0 */
    private final C4040a f24234l0;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C10290a extends C4040a {
        C10290a() {
        }

        /* renamed from: a */
        public void mo1956a(int i) {
        }

        /* renamed from: a */
        public void mo1957a(Typeface typeface) {
            Chip chip = Chip.this;
            chip.setText(chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C10291b extends ViewOutlineProvider {
        C10291b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f24222W != null) {
                Chip.this.f24222W.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C10292c extends C4207a {
        C10292c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo14862a(float f, float f2) {
            return (!Chip.this.m32247f() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? -1 : 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14868a(List<Integer> list) {
            if (Chip.this.m32247f()) {
                list.add(Integer.valueOf(0));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14864a(int i, C4154d dVar) {
            CharSequence charSequence = "";
            if (Chip.this.m32247f()) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    dVar.mo14747b(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C11465i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(text)) {
                        text = charSequence;
                    }
                    objArr[0] = text;
                    dVar.mo14747b((CharSequence) context.getString(i2, objArr).trim());
                }
                dVar.mo14751c(Chip.this.getCloseIconTouchBoundsInt());
                dVar.mo14738a(C4155a.f10456d);
                dVar.mo14761e(Chip.this.isEnabled());
                return;
            }
            dVar.mo14747b(charSequence);
            dVar.mo14751c(Chip.f24220m0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14867a(C4154d dVar) {
            dVar.mo14749b(Chip.this.f24222W != null && Chip.this.f24222W.mo26575D());
            dVar.mo14739a((CharSequence) Chip.class.getName());
            CharSequence text = Chip.this.getText();
            if (VERSION.SDK_INT >= 23) {
                dVar.mo14767g(text);
            } else {
                dVar.mo14747b(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo14872a(int i, int i2, Bundle bundle) {
            if (i2 == 16 && i == 0) {
                return Chip.this.mo26440b();
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m32246e() {
        if (this.f24227e0 == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m32247f() {
        C10293a aVar = this.f24222W;
        return (aVar == null || aVar.mo26651m() == null) ? false : true;
    }

    /* renamed from: g */
    private void m32248g() {
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C10291b());
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f24233k0.setEmpty();
        if (m32247f()) {
            this.f24222W.mo26587a(this.f24233k0);
        }
        return this.f24233k0;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f24232j0.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f24232j0;
    }

    private C11500b getTextAppearance() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26569A();
        }
        return null;
    }

    /* renamed from: h */
    private void m32249h() {
        if (!TextUtils.isEmpty(getText())) {
            C10293a aVar = this.f24222W;
            if (aVar != null) {
                float j = aVar.mo26642j() + this.f24222W.mo26616e() + this.f24222W.mo26573C() + this.f24222W.mo26571B();
                if ((this.f24222W.mo26577F() && this.f24222W.mo26621f() != null) || (this.f24222W.mo26596b() != null && this.f24222W.mo26576E() && isChecked())) {
                    j += this.f24222W.mo26680w() + this.f24222W.mo26678v() + this.f24222W.mo26625g();
                }
                if (this.f24222W.mo26579H() && this.f24222W.mo26651m() != null) {
                    j += this.f24222W.mo26663q() + this.f24222W.mo26656o() + this.f24222W.mo26661p();
                }
                if (((float) C4187x.m14402q(this)) != j) {
                    C4187x.m14354a(this, C4187x.m14403r(this), getPaddingTop(), (int) j, getPaddingBottom());
                }
            }
        }
    }

    private void setCloseIconFocused(boolean z) {
        if (this.f24230h0 != z) {
            this.f24230h0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f24229g0 != z) {
            this.f24229g0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f24228f0 != z) {
            this.f24228f0 = z;
            refreshDrawableState();
        }
    }

    private void setFocusedVirtualView(int i) {
        int i2 = this.f24227e0;
        if (i2 != i) {
            if (i2 == 0) {
                setCloseIconFocused(false);
            }
            this.f24227e0 = i;
            if (i == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m32237a(motionEvent) || this.f24231i0.mo14874a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f24231i0.mo14873a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10293a aVar = this.f24222W;
        if ((aVar == null || !aVar.mo26578G()) ? false : this.f24222W.mo26595a(m32245d())) {
            invalidate();
        }
    }

    public Drawable getCheckedIcon() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26596b();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26604c();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26610d();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f24222W;
    }

    public float getChipEndPadding() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26616e();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26621f();
        }
        return null;
    }

    public float getChipIconSize() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26625g();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26634h();
        }
        return null;
    }

    public float getChipMinHeight() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26637i();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26642j();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26645k();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26648l();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26651m();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26654n();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26656o();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26661p();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26663q();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26667s();
        }
        return null;
    }

    public TruncateAt getEllipsize() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26673t();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f24227e0 == 0) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C11475h getHideMotionSpec() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26675u();
        }
        return null;
    }

    public float getIconEndPadding() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26678v();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26680w();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26682x();
        }
        return null;
    }

    public C11475h getShowMotionSpec() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26684y();
        }
        return null;
    }

    public CharSequence getText() {
        C10293a aVar = this.f24222W;
        return aVar != null ? aVar.mo26686z() : "";
    }

    public float getTextEndPadding() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26571B();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            return aVar.mo26573C();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f24221n0);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!TextUtils.isEmpty(getText())) {
            C10293a aVar = this.f24222W;
            if (aVar != null && !aVar.mo26581J()) {
                int save = canvas.save();
                canvas.translate(m32239b(this.f24222W), 0.0f);
                super.onDraw(canvas);
                canvas.restoreToCount(save);
                return;
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i, rect);
        this.f24231i0.mo14869a(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getKeyCode()
            r1 = 61
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0041
            r1 = 66
            if (r0 == r1) goto L_0x0031
            switch(r0) {
                case 21: goto L_0x0022;
                case 22: goto L_0x0012;
                case 23: goto L_0x0031;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x006d
        L_0x0012:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006d
            boolean r0 = com.google.android.material.internal.C10321h.m32561a(r6)
            r0 = r0 ^ r3
            boolean r2 = r6.m32238a(r0)
            goto L_0x006d
        L_0x0022:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x006d
            boolean r0 = com.google.android.material.internal.C10321h.m32561a(r6)
            boolean r2 = r6.m32238a(r0)
            goto L_0x006d
        L_0x0031:
            int r0 = r6.f24227e0
            r1 = -1
            if (r0 == r1) goto L_0x003d
            if (r0 == 0) goto L_0x0039
            goto L_0x006d
        L_0x0039:
            r6.mo26440b()
            return r3
        L_0x003d:
            r6.performClick()
            return r3
        L_0x0041:
            boolean r0 = r8.hasNoModifiers()
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x0052
        L_0x0049:
            boolean r0 = r8.hasModifiers(r3)
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x006d
            android.view.ViewParent r1 = r6.getParent()
            r4 = r6
        L_0x0059:
            android.view.View r4 = r4.focusSearch(r0)
            if (r4 == 0) goto L_0x0067
            if (r4 == r6) goto L_0x0067
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == r1) goto L_0x0059
        L_0x0067:
            if (r4 == 0) goto L_0x006d
            r4.requestFocus()
            return r3
        L_0x006d:
            if (r2 == 0) goto L_0x0073
            r6.invalidate()
            return r3
        L_0x0073:
            boolean r7 = super.onKeyDown(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), CloseCodes.PROTOCOL_ERROR);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f24228f0
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f24228f0
            if (r0 == 0) goto L_0x0034
            r5.mo26440b()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.f24222W || drawable == this.f24223a0) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.f24222W || drawable == this.f24223a0) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26594a(z);
        }
    }

    public void setCheckableResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26585a(i);
        }
    }

    public void setChecked(boolean z) {
        C10293a aVar = this.f24222W;
        if (aVar == null) {
            this.f24226d0 = z;
        } else if (aVar.mo26575D()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z) {
                OnCheckedChangeListener onCheckedChangeListener = this.f24225c0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(this, z);
                }
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26588a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26598b(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26606c(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26586a(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26612d(i);
        }
    }

    public void setChipCornerRadius(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26584a(f);
        }
    }

    public void setChipCornerRadiusResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26618e(i);
        }
    }

    public void setChipDrawable(C10293a aVar) {
        C10293a aVar2 = this.f24222W;
        if (aVar2 != aVar) {
            m32243c(aVar2);
            this.f24222W = aVar;
            m32235a(this.f24222W);
            if (C11503a.f26895a) {
                this.f24223a0 = new RippleDrawable(C11503a.m37104a(this.f24222W.mo26682x()), this.f24222W, null);
                this.f24222W.mo26624f(false);
                C4187x.m14358a((View) this, (Drawable) this.f24223a0);
                return;
            }
            this.f24222W.mo26624f(true);
            C4187x.m14358a((View) this, (Drawable) this.f24222W);
        }
    }

    public void setChipEndPadding(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26597b(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26623f(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26600b(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26627g(i);
        }
    }

    public void setChipIconSize(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26605c(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26636h(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26599b(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26639i(i);
        }
    }

    public void setChipIconVisible(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26644j(i);
        }
    }

    public void setChipMinHeight(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26611d(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26647k(i);
        }
    }

    public void setChipStartPadding(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26617e(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26650l(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26607c(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26653m(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26622f(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26655n(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26608c(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26593a(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26626g(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26657o(i);
        }
    }

    public void setCloseIconResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26662p(i);
        }
    }

    public void setCloseIconSize(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26635h(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26664q(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26638i(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26665r(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26613d(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26668s(i);
        }
    }

    public void setCloseIconVisible(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26674t(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.f24222W != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C10293a aVar = this.f24222W;
                if (aVar != null) {
                    aVar.mo26589a(truncateAt);
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C11475h hVar) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26591a(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26676u(i);
        }
    }

    public void setIconEndPadding(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26643j(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26679v(i);
        }
    }

    public void setIconStartPadding(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26646k(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26681w(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26683x(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: 0000 */
    public void setOnCheckedChangeListenerInternal(OnCheckedChangeListener onCheckedChangeListener) {
        this.f24225c0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(OnClickListener onClickListener) {
        this.f24224b0 = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26619e(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26685y(i);
        }
    }

    public void setShowMotionSpec(C11475h hVar) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26601b(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26687z(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.f24222W != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            CharSequence a = C4087a.m14021b().mo14622a(charSequence);
            if (this.f24222W.mo26581J()) {
                a = null;
            }
            super.setText(a, bufferType);
            C10293a aVar = this.f24222W;
            if (aVar != null) {
                aVar.mo26602b(charSequence);
            }
        }
    }

    public void setTextAppearance(C11500b bVar) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26592a(bVar);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo29418c(getContext(), getPaint(), this.f24234l0);
            m32236a(bVar);
        }
    }

    public void setTextAppearanceResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26570A(i);
        }
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26649l(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26572B(i);
        }
    }

    public void setTextStartPadding(float f) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26652m(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26574C(i);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11458b.chipStyle);
    }

    /* renamed from: a */
    private void m32234a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            String str = "http://schemas.android.com/apk/res/android";
            if (attributeSet.getAttributeValue(str, "background") != null) {
                throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            } else if (attributeSet.getAttributeValue(str, "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue(str, "drawableStart") == null) {
                String str2 = "Please set end drawable using R.attr#closeIcon.";
                if (attributeSet.getAttributeValue(str, "drawableEnd") != null) {
                    throw new UnsupportedOperationException(str2);
                } else if (attributeSet.getAttributeValue(str, "drawableRight") != null) {
                    throw new UnsupportedOperationException(str2);
                } else if (attributeSet.getAttributeBooleanValue(str, "singleLine", true) && attributeSet.getAttributeIntValue(str, "lines", 1) == 1 && attributeSet.getAttributeIntValue(str, "minLines", 1) == 1 && attributeSet.getAttributeIntValue(str, "maxLines", 1) == 1) {
                    if (attributeSet.getAttributeIntValue(str, "gravity", 8388627) != 8388627) {
                        Log.w("Chip", "Chip text must be vertically center and start aligned");
                    }
                } else {
                    throw new UnsupportedOperationException("Chip does not support multi-line text");
                }
            } else {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
        }
    }

    /* renamed from: b */
    private float m32239b(C10293a aVar) {
        float chipStartPadding = getChipStartPadding() + aVar.mo26582a() + getTextStartPadding();
        return C4187x.m14399n(this) == 0 ? chipStartPadding : -chipStartPadding;
    }

    /* renamed from: d */
    private int[] m32245d() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f24230h0) {
            i2++;
        }
        if (this.f24229g0) {
            i2++;
        }
        if (this.f24228f0) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f24230h0) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f24229g0) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f24228f0) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24227e0 = Integer.MIN_VALUE;
        this.f24232j0 = new Rect();
        this.f24233k0 = new RectF();
        this.f24234l0 = new C10290a();
        m32234a(attributeSet);
        C10293a a = C10293a.m32268a(context, attributeSet, i, C11466j.Widget_MaterialComponents_Chip_Action);
        setChipDrawable(a);
        this.f24231i0 = new C10292c(this);
        C4187x.m14359a((View) this, (C4119a) this.f24231i0);
        m32248g();
        setChecked(this.f24226d0);
        a.mo26620e(false);
        setText(a.mo26686z());
        setEllipsize(a.mo26673t());
        setIncludeFontPadding(false);
        if (getTextAppearance() != null) {
            m32236a(getTextAppearance());
        }
        setSingleLine();
        setGravity(8388627);
        m32249h();
    }

    /* renamed from: c */
    private void m32243c(C10293a aVar) {
        if (aVar != null) {
            aVar.mo26590a((C10295b) null);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26603b(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26609c(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26614d(z);
        }
    }

    /* renamed from: b */
    public boolean mo26440b() {
        boolean z;
        playSoundEffect(0);
        OnClickListener onClickListener = this.f24224b0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.f24231i0.mo14871a(0, 1);
        return z;
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26570A(i);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo29418c(context, getPaint(), this.f24234l0);
            m32236a(getTextAppearance());
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C10293a aVar = this.f24222W;
        if (aVar != null) {
            aVar.mo26570A(i);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().mo29418c(getContext(), getPaint(), this.f24234l0);
            m32236a(getTextAppearance());
        }
    }

    /* renamed from: a */
    private void m32235a(C10293a aVar) {
        aVar.mo26590a((C10295b) this);
    }

    /* renamed from: a */
    public void mo26439a() {
        m32249h();
        requestLayout();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private boolean m32237a(MotionEvent motionEvent) {
        Class<C4207a> cls = C4207a.class;
        String str = "Unable to send Accessibility Exit event";
        String str2 = "Chip";
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f24231i0)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("i", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f24231i0, new Object[]{Integer.valueOf(Integer.MIN_VALUE)});
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e(str2, str, e);
            } catch (IllegalAccessException e2) {
                Log.e(str2, str, e2);
            } catch (InvocationTargetException e3) {
                Log.e(str2, str, e3);
            } catch (NoSuchFieldException e4) {
                Log.e(str2, str, e4);
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m32238a(boolean z) {
        m32246e();
        if (z) {
            if (this.f24227e0 == -1) {
                setFocusedVirtualView(0);
                return true;
            }
        } else if (this.f24227e0 == 0) {
            setFocusedVirtualView(-1);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m32236a(C11500b bVar) {
        TextPaint paint = getPaint();
        paint.drawableState = this.f24222W.getState();
        bVar.mo29417b(getContext(), paint, this.f24234l0);
    }
}
