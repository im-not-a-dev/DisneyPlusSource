package com.bamtech.player.exo.scaling;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import java.util.List;
import p163g.p174d.p178b.p197x.p198a.C5329c;

public final class ActiveAspectRatioFrameLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C1746b f6041U;

    /* renamed from: V */
    private float f6042V;

    /* renamed from: W */
    private float f6043W;

    /* renamed from: a0 */
    private float f6044a0;

    /* renamed from: b0 */
    private int f6045b0;

    /* renamed from: c */
    private final C1747c f6046c;

    /* renamed from: c0 */
    private final C1748a f6047c0;

    /* renamed from: d0 */
    private boolean f6048d0;

    /* renamed from: com.bamtech.player.exo.scaling.ActiveAspectRatioFrameLayout$b */
    public interface C1746b {
        /* renamed from: a */
        void mo7809a(float f, float f2, boolean z);
    }

    /* renamed from: com.bamtech.player.exo.scaling.ActiveAspectRatioFrameLayout$c */
    private final class C1747c implements Runnable {

        /* renamed from: U */
        private float f6049U;

        /* renamed from: V */
        private boolean f6050V;

        /* renamed from: W */
        private boolean f6051W;

        /* renamed from: c */
        private float f6053c;

        private C1747c() {
        }

        /* renamed from: a */
        public void mo7810a(float f, float f2, boolean z) {
            this.f6053c = f;
            this.f6049U = f2;
            this.f6050V = z;
            if (!this.f6051W) {
                this.f6051W = true;
                ActiveAspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f6051W = false;
            if (ActiveAspectRatioFrameLayout.this.f6041U != null) {
                ActiveAspectRatioFrameLayout.this.f6041U.mo7809a(this.f6053c, this.f6049U, this.f6050V);
            }
        }
    }

    public ActiveAspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getCutoutWidth() {
        if (VERSION.SDK_INT >= 28) {
            DisplayCutout displayCutout = getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                List boundingRects = displayCutout.getBoundingRects();
                if (!boundingRects.isEmpty()) {
                    return ((Rect) boundingRects.get(0)).width();
                }
            }
        }
        return 0;
    }

    public int getResizeMode() {
        return this.f6045b0;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.f6042V > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f2 = (float) measuredWidth;
            float f3 = (float) measuredHeight;
            float f4 = f2 / f3;
            float f5 = (this.f6042V / f4) - 1.0f;
            if (Math.abs(f5) > 0.01f || this.f6043W > 0.0f) {
                int i3 = this.f6045b0;
                if (i3 != 0) {
                    if (i3 == 1) {
                        measuredHeight = (int) (f2 / this.f6042V);
                    } else if (i3 == 2) {
                        measuredWidth = (int) (f3 * this.f6042V);
                    } else if (i3 == 4) {
                        if (f5 > 0.0f) {
                            measuredWidth = (int) (f3 * this.f6042V);
                        } else {
                            measuredHeight = (int) (f2 / this.f6042V);
                        }
                        float f6 = this.f6043W;
                        if (f6 > 0.0f) {
                            float f7 = this.f6044a0;
                            if (f7 <= 0.0f) {
                                f7 = this.f6047c0.mo7812a(this.f6042V, f4, f6);
                            }
                            measuredWidth = (int) (((float) measuredWidth) * f7);
                            f = ((float) measuredHeight) * f7;
                        }
                    }
                    this.f6046c.mo7810a(this.f6042V, f4, true);
                    super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                    return;
                }
                if (this.f6048d0) {
                    measuredWidth -= getCutoutWidth() * 2;
                    f4 = ((float) measuredWidth) / f3;
                    f5 = (this.f6042V / f4) - 1.0f;
                }
                float f8 = (float) measuredWidth;
                if (f5 > 0.0f) {
                    measuredHeight = (int) (f8 / this.f6042V);
                } else {
                    measuredWidth = (int) (f3 * this.f6042V);
                }
                if (this.f6048d0) {
                    float f9 = this.f6043W;
                    if (f9 > 0.0f) {
                        float f10 = this.f6044a0;
                        if (f10 <= 0.0f) {
                            float f11 = (float) measuredWidth;
                            f4 = f11 / ((float) measuredHeight);
                            f10 = Math.min(f8 / f11, this.f6047c0.mo7812a(this.f6042V, f4, f9));
                        }
                        measuredWidth = (int) (((float) measuredWidth) * f10);
                        f = ((float) measuredHeight) * f10;
                    }
                }
                this.f6046c.mo7810a(this.f6042V, f4, true);
                super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                return;
                measuredHeight = (int) f;
                this.f6046c.mo7810a(this.f6042V, f4, true);
                super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                return;
            }
            this.f6046c.mo7810a(this.f6042V, f4, false);
        }
    }

    public void setActiveAspectRatio(float f) {
        if (this.f6043W != f) {
            this.f6043W = f;
            requestLayout();
        }
    }

    public void setAspectRatio(float f) {
        if (this.f6042V != f) {
            this.f6042V = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(C1746b bVar) {
        this.f6041U = bVar;
    }

    public void setEnableWidescreenDefaultDisplay(boolean z) {
        this.f6048d0 = z;
    }

    public void setResizeMode(int i) {
        if (this.f6045b0 != i) {
            this.f6045b0 = i;
            requestLayout();
        }
    }

    public void setScaleOverride(float f) {
        this.f6044a0 = f;
        requestLayout();
    }

    public ActiveAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6047c0 = new C1748a();
        this.f6048d0 = false;
        this.f6045b0 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C5329c.AspectRatioFrameLayout, 0, 0);
            try {
                this.f6045b0 = obtainStyledAttributes.getInt(C5329c.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6046c = new C1747c();
    }
}
