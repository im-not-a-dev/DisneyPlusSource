package com.google.android.exoplayer2.p391ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.p382u0.C9321a;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9332k;
import com.google.android.exoplayer2.p393v0.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
public final class SubtitleView extends View implements C9332k {

    /* renamed from: U */
    private List<C9322b> f21709U;

    /* renamed from: V */
    private int f21710V;

    /* renamed from: W */
    private float f21711W;

    /* renamed from: a0 */
    private boolean f21712a0;

    /* renamed from: b0 */
    private boolean f21713b0;

    /* renamed from: c */
    private final List<C9417o> f21714c;

    /* renamed from: c0 */
    private C9321a f21715c0;

    /* renamed from: d0 */
    private float f21716d0;

    public SubtitleView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private float m28770a(int i, float f, int i2, int i3) {
        float f2;
        if (i == 0) {
            f2 = (float) i3;
        } else if (i == 1) {
            f2 = (float) i2;
        } else if (i != 2) {
            return Float.MIN_VALUE;
        } else {
            return f;
        }
        return f * f2;
    }

    @TargetApi(19)
    /* renamed from: c */
    private boolean m28773c() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).isEnabled();
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private C9321a getUserCaptionStyleV19() {
        return C9321a.m28344a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    /* renamed from: a */
    public void mo7574a(List<C9322b> list) {
        setCues(list);
    }

    /* renamed from: b */
    public void mo24322b() {
        setFractionalTextSize(((Util.SDK_INT < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    public void dispatchDraw(Canvas canvas) {
        List<C9322b> list = this.f21709U;
        if (list != null && !list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float a = m28770a(this.f21710V, this.f21711W, height, i);
                if (a > 0.0f) {
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        C9322b bVar = (C9322b) list.get(i2);
                        float a2 = m28771a(bVar, height, i);
                        C9417o oVar = (C9417o) this.f21714c.get(i2);
                        boolean z = this.f21712a0;
                        boolean z2 = this.f21713b0;
                        C9321a aVar = this.f21715c0;
                        int i3 = i2;
                        float f = a2;
                        int i4 = size;
                        float f2 = this.f21716d0;
                        int i5 = i;
                        int i6 = paddingBottom;
                        int i7 = width;
                        int i8 = paddingTop;
                        int i9 = paddingLeft;
                        oVar.mo24410a(bVar, z, z2, aVar, a, f, f2, canvas, paddingLeft, paddingTop, i7, i6);
                        i2 = i3 + 1;
                        size = i4;
                        i = i5;
                        paddingBottom = i6;
                        width = i7;
                        paddingTop = i8;
                        paddingLeft = i9;
                    }
                }
            }
        }
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.f21713b0 != z) {
            this.f21713b0 = z;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.f21712a0 != z || this.f21713b0 != z) {
            this.f21712a0 = z;
            this.f21713b0 = z;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f) {
        if (this.f21716d0 != f) {
            this.f21716d0 = f;
            invalidate();
        }
    }

    public void setCues(List<C9322b> list) {
        int i;
        if (this.f21709U != list) {
            this.f21709U = list;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            while (this.f21714c.size() < i) {
                this.f21714c.add(new C9417o(getContext()));
            }
            invalidate();
        }
    }

    public void setFractionalTextSize(float f) {
        mo24321a(f, false);
    }

    public void setStyle(C9321a aVar) {
        if (this.f21715c0 != aVar) {
            this.f21715c0 = aVar;
            invalidate();
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21714c = new ArrayList();
        this.f21710V = 0;
        this.f21711W = 0.0533f;
        this.f21712a0 = true;
        this.f21713b0 = true;
        this.f21715c0 = C9321a.f21338g;
        this.f21716d0 = 0.08f;
    }

    /* renamed from: a */
    public void mo24321a(float f, boolean z) {
        m28772a(z ? 1 : 0, f);
    }

    /* renamed from: a */
    private void m28772a(int i, float f) {
        if (this.f21710V != i || this.f21711W != f) {
            this.f21710V = i;
            this.f21711W = f;
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo24320a() {
        setStyle((Util.SDK_INT < 19 || !m28773c() || isInEditMode()) ? C9321a.f21338g : getUserCaptionStyleV19());
    }

    /* renamed from: a */
    private float m28771a(C9322b bVar, int i, int i2) {
        int i3 = bVar.f21358f0;
        if (i3 != Integer.MIN_VALUE) {
            float f = bVar.f21359g0;
            if (f != Float.MIN_VALUE) {
                return Math.max(m28770a(i3, f, i, i2), 0.0f);
            }
        }
        return 0.0f;
    }
}
