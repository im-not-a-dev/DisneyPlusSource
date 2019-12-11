package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0224f0;
import p163g.p449j.p450a.p468b.C11467k;

/* renamed from: com.google.android.material.internal.e */
/* compiled from: ForegroundLinearLayout */
public class C10316e extends C0224f0 {

    /* renamed from: l0 */
    private Drawable f24436l0;

    /* renamed from: m0 */
    private final Rect f24437m0;

    /* renamed from: n0 */
    private final Rect f24438n0;

    /* renamed from: o0 */
    private int f24439o0;

    /* renamed from: p0 */
    protected boolean f24440p0;

    /* renamed from: q0 */
    boolean f24441q0;

    public C10316e(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f24436l0;
        if (drawable != null) {
            if (this.f24441q0) {
                this.f24441q0 = false;
                Rect rect = this.f24437m0;
                Rect rect2 = this.f24438n0;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f24440p0) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f24439o0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f24436l0;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24436l0;
        if (drawable != null && drawable.isStateful()) {
            this.f24436l0.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f24436l0;
    }

    public int getForegroundGravity() {
        return this.f24439o0;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24436l0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f24441q0 = z | this.f24441q0;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f24441q0 = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f24436l0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f24436l0);
            }
            this.f24436l0 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f24439o0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f24439o0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f24439o0 = i;
            if (this.f24439o0 == 119 && this.f24436l0 != null) {
                this.f24436l0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24436l0;
    }

    public C10316e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10316e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24437m0 = new Rect();
        this.f24438n0 = new Rect();
        this.f24439o0 = 119;
        this.f24440p0 = true;
        this.f24441q0 = false;
        TypedArray c = C10320g.m32558c(context, attributeSet, C11467k.ForegroundLinearLayout, i, 0, new int[0]);
        this.f24439o0 = c.getInt(C11467k.ForegroundLinearLayout_android_foregroundGravity, this.f24439o0);
        Drawable drawable = c.getDrawable(C11467k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f24440p0 = c.getBoolean(C11467k.ForegroundLinearLayout_foregroundInsidePadding, true);
        c.recycle();
    }
}
