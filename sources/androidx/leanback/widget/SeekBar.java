package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import p096e.p146l.C4225c;

public final class SeekBar extends View {

    /* renamed from: U */
    private final RectF f2732U = new RectF();

    /* renamed from: V */
    private final RectF f2733V = new RectF();

    /* renamed from: W */
    private final Paint f2734W = new Paint(1);

    /* renamed from: a0 */
    private final Paint f2735a0 = new Paint(1);

    /* renamed from: b0 */
    private final Paint f2736b0 = new Paint(1);

    /* renamed from: c */
    private final RectF f2737c = new RectF();

    /* renamed from: c0 */
    private final Paint f2738c0 = new Paint(1);

    /* renamed from: d0 */
    private int f2739d0;

    /* renamed from: e0 */
    private int f2740e0;

    /* renamed from: f0 */
    private int f2741f0;

    /* renamed from: g0 */
    private int f2742g0;

    /* renamed from: h0 */
    private int f2743h0;

    /* renamed from: i0 */
    private int f2744i0;

    /* renamed from: j0 */
    private int f2745j0;

    /* renamed from: k0 */
    private C0636a f2746k0;

    /* renamed from: androidx.leanback.widget.SeekBar$a */
    public static abstract class C0636a {
        /* renamed from: a */
        public abstract boolean mo3632a();

        /* renamed from: b */
        public abstract boolean mo3633b();
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f2736b0.setColor(-7829368);
        this.f2734W.setColor(-3355444);
        this.f2735a0.setColor(-65536);
        this.f2738c0.setColor(-1);
        this.f2744i0 = context.getResources().getDimensionPixelSize(C4225c.lb_playback_transport_progressbar_bar_height);
        this.f2745j0 = context.getResources().getDimensionPixelSize(C4225c.lb_playback_transport_progressbar_active_bar_height);
        this.f2743h0 = context.getResources().getDimensionPixelSize(C4225c.lb_playback_transport_progressbar_active_radius);
    }

    /* renamed from: a */
    private void m3265a() {
        int i = isFocused() ? this.f2745j0 : this.f2744i0;
        int width = getWidth();
        int height = getHeight();
        int i2 = (height - i) / 2;
        RectF rectF = this.f2733V;
        int i3 = this.f2744i0;
        float f = (float) i2;
        float f2 = (float) (height - i2);
        rectF.set((float) (i3 / 2), f, (float) (width - (i3 / 2)), f2);
        int i4 = isFocused() ? this.f2743h0 : this.f2744i0 / 2;
        float f3 = (float) (width - (i4 * 2));
        float f4 = (((float) this.f2739d0) / ((float) this.f2741f0)) * f3;
        RectF rectF2 = this.f2737c;
        int i5 = this.f2744i0;
        rectF2.set((float) (i5 / 2), f, ((float) (i5 / 2)) + f4, f2);
        this.f2732U.set(this.f2737c.right, f, ((float) (this.f2744i0 / 2)) + ((((float) this.f2740e0) / ((float) this.f2741f0)) * f3), f2);
        this.f2742g0 = i4 + ((int) f4);
        invalidate();
    }

    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f2741f0;
    }

    public int getProgress() {
        return this.f2739d0;
    }

    public int getSecondProgress() {
        return this.f2740e0;
    }

    public int getSecondaryProgressColor() {
        return this.f2734W.getColor();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (float) (isFocused() ? this.f2743h0 : this.f2744i0 / 2);
        canvas.drawRoundRect(this.f2733V, f, f, this.f2736b0);
        RectF rectF = this.f2732U;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.f2734W);
        }
        canvas.drawRoundRect(this.f2737c, f, f, this.f2735a0);
        canvas.drawCircle((float) this.f2742g0, (float) (getHeight() / 2), f, this.f2738c0);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        m3265a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m3265a();
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        C0636a aVar = this.f2746k0;
        if (aVar != null) {
            if (i == 4096) {
                return aVar.mo3633b();
            }
            if (i == 8192) {
                return aVar.mo3632a();
            }
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAccessibilitySeekListener(C0636a aVar) {
        this.f2746k0 = aVar;
    }

    public void setActiveBarHeight(int i) {
        this.f2745j0 = i;
        m3265a();
    }

    public void setActiveRadius(int i) {
        this.f2743h0 = i;
        m3265a();
    }

    public void setBarHeight(int i) {
        this.f2744i0 = i;
        m3265a();
    }

    public void setMax(int i) {
        this.f2741f0 = i;
        m3265a();
    }

    public void setProgress(int i) {
        int i2 = this.f2741f0;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f2739d0 = i;
        m3265a();
    }

    public void setProgressColor(int i) {
        this.f2735a0.setColor(i);
    }

    public void setSecondaryProgress(int i) {
        int i2 = this.f2741f0;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f2740e0 = i;
        m3265a();
    }

    public void setSecondaryProgressColor(int i) {
        this.f2734W.setColor(i);
    }
}
