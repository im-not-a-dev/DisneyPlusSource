package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: androidx.leanback.widget.l */
/* compiled from: NonOverlappingLinearLayoutWithForeground */
class C0671l extends LinearLayout {

    /* renamed from: U */
    private boolean f2881U;

    /* renamed from: V */
    private final Rect f2882V;

    /* renamed from: c */
    private Drawable f2883c;

    public C0671l(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo3980a(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            C0648d.m3320a(this, drawable);
        } else if (this.f2883c != drawable) {
            this.f2883c = drawable;
            this.f2881U = true;
            setWillNotDraw(false);
            this.f2883c.setCallback(this);
            if (this.f2883c.isStateful()) {
                this.f2883c.setState(getDrawableState());
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2883c;
        if (drawable != null) {
            if (this.f2881U) {
                this.f2881U = false;
                Rect rect = this.f2882V;
                rect.set(0, 0, getRight() - getLeft(), getBottom() - getTop());
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2883c;
        if (drawable != null && drawable.isStateful()) {
            this.f2883c.setState(getDrawableState());
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2883c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2881U = z | this.f2881U;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2883c;
    }

    public C0671l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0671l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2882V = new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23 || VERSION.SDK_INT < 23) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                mo3980a(drawable);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
