package com.google.android.exoplayer2.p391ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
public final class AspectRatioFrameLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C9392b f21674U;

    /* renamed from: V */
    private float f21675V;

    /* renamed from: W */
    private int f21676W;

    /* renamed from: c */
    private final C9393c f21677c;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public interface C9392b {
        /* renamed from: a */
        void mo24266a(float f, float f2, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    private final class C9393c implements Runnable {

        /* renamed from: U */
        private float f21678U;

        /* renamed from: V */
        private boolean f21679V;

        /* renamed from: W */
        private boolean f21680W;

        /* renamed from: c */
        private float f21682c;

        private C9393c() {
        }

        /* renamed from: a */
        public void mo24267a(float f, float f2, boolean z) {
            this.f21682c = f;
            this.f21678U = f2;
            this.f21679V = z;
            if (!this.f21680W) {
                this.f21680W = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f21680W = false;
            if (AspectRatioFrameLayout.this.f21674U != null) {
                AspectRatioFrameLayout.this.f21674U.mo24266a(this.f21682c, this.f21678U, this.f21679V);
            }
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f21676W;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f21675V > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f3 = (float) measuredWidth;
            float f4 = (float) measuredHeight;
            float f5 = f3 / f4;
            float f6 = (this.f21675V / f5) - 1.0f;
            if (Math.abs(f6) <= 0.01f) {
                this.f21677c.mo24267a(this.f21675V, f5, false);
                return;
            }
            int i3 = this.f21676W;
            if (i3 != 0) {
                if (i3 == 1) {
                    f2 = this.f21675V;
                } else if (i3 != 2) {
                    if (i3 == 4) {
                        if (f6 > 0.0f) {
                            f = this.f21675V;
                        } else {
                            f2 = this.f21675V;
                        }
                    }
                    this.f21677c.mo24267a(this.f21675V, f5, true);
                    super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                } else {
                    f = this.f21675V;
                }
                measuredHeight = (int) (f3 / f2);
                this.f21677c.mo24267a(this.f21675V, f5, true);
                super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else if (f6 > 0.0f) {
                f2 = this.f21675V;
                measuredHeight = (int) (f3 / f2);
                this.f21677c.mo24267a(this.f21675V, f5, true);
                super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else {
                f = this.f21675V;
            }
            measuredWidth = (int) (f4 * f);
            this.f21677c.mo24267a(this.f21675V, f5, true);
            super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f) {
        if (this.f21675V != f) {
            this.f21675V = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(C9392b bVar) {
        this.f21674U = bVar;
    }

    public void setResizeMode(int i) {
        if (this.f21676W != i) {
            this.f21676W = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21676W = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9416n.AspectRatioFrameLayout, 0, 0);
            try {
                this.f21676W = obtainStyledAttributes.getInt(C9416n.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f21677c = new C9393c();
    }
}
