package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import p096e.p146l.C4234l;

public class HorizontalGridView extends C0638a {

    /* renamed from: M1 */
    private boolean f2585M1;

    /* renamed from: N1 */
    private boolean f2586N1;

    /* renamed from: O1 */
    private Paint f2587O1;

    /* renamed from: P1 */
    private Bitmap f2588P1;

    /* renamed from: Q1 */
    private LinearGradient f2589Q1;

    /* renamed from: R1 */
    private int f2590R1;

    /* renamed from: S1 */
    private int f2591S1;

    /* renamed from: T1 */
    private Bitmap f2592T1;

    /* renamed from: U1 */
    private LinearGradient f2593U1;

    /* renamed from: V1 */
    private int f2594V1;

    /* renamed from: W1 */
    private int f2595W1;

    /* renamed from: X1 */
    private Rect f2596X1;

    public HorizontalGridView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private boolean m3201A() {
        if (!this.f2586N1) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.f2765C1.mo3919t(getChildAt(childCount)) > (getWidth() - getPaddingRight()) + this.f2595W1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    private boolean m3202B() {
        if (!this.f2585M1) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.f2765C1.mo3917s(getChildAt(i)) < getPaddingLeft() - this.f2591S1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private void m3203C() {
        if (this.f2585M1 || this.f2586N1) {
            setLayerType(2, null);
            setWillNotDraw(false);
            return;
        }
        setLayerType(0, null);
        setWillNotDraw(true);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f2592T1;
        if (!(bitmap != null && bitmap.getWidth() == this.f2594V1 && this.f2592T1.getHeight() == getHeight())) {
            this.f2592T1 = Bitmap.createBitmap(this.f2594V1, getHeight(), Config.ARGB_8888);
        }
        return this.f2592T1;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f2588P1;
        if (!(bitmap != null && bitmap.getWidth() == this.f2590R1 && this.f2588P1.getHeight() == getHeight())) {
            this.f2588P1 = Bitmap.createBitmap(this.f2590R1, getHeight(), Config.ARGB_8888);
        }
        return this.f2588P1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3451b(Context context, AttributeSet attributeSet) {
        mo3659a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.lbHorizontalGridView);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(C4234l.lbHorizontalGridView_numberOfRows, 1));
        obtainStyledAttributes.recycle();
        m3203C();
        this.f2587O1 = new Paint();
        this.f2587O1.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
    }

    public void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        boolean B = m3202B();
        boolean A = m3201A();
        if (!B) {
            this.f2588P1 = null;
        }
        if (!A) {
            this.f2592T1 = null;
        }
        if (B || A) {
            int paddingLeft = this.f2585M1 ? (getPaddingLeft() - this.f2591S1) - this.f2590R1 : 0;
            if (this.f2586N1) {
                i = (getWidth() - getPaddingRight()) + this.f2595W1 + this.f2594V1;
            } else {
                i = getWidth();
            }
            int save = canvas.save();
            canvas2.clipRect((this.f2585M1 ? this.f2590R1 : 0) + paddingLeft, 0, i - (this.f2586N1 ? this.f2594V1 : 0), getHeight());
            super.draw(canvas);
            canvas2.restoreToCount(save);
            Canvas canvas3 = new Canvas();
            Rect rect = this.f2596X1;
            rect.top = 0;
            rect.bottom = getHeight();
            if (B && this.f2590R1 > 0) {
                Bitmap tempBitmapLow = getTempBitmapLow();
                tempBitmapLow.eraseColor(0);
                canvas3.setBitmap(tempBitmapLow);
                int save2 = canvas3.save();
                canvas3.clipRect(0, 0, this.f2590R1, getHeight());
                float f = (float) (-paddingLeft);
                canvas3.translate(f, 0.0f);
                super.draw(canvas3);
                canvas3.restoreToCount(save2);
                this.f2587O1.setShader(this.f2589Q1);
                canvas3.drawRect(0.0f, 0.0f, (float) this.f2590R1, (float) getHeight(), this.f2587O1);
                Rect rect2 = this.f2596X1;
                rect2.left = 0;
                rect2.right = this.f2590R1;
                canvas2.translate((float) paddingLeft, 0.0f);
                Rect rect3 = this.f2596X1;
                canvas2.drawBitmap(tempBitmapLow, rect3, rect3, null);
                canvas2.translate(f, 0.0f);
            }
            if (A && this.f2594V1 > 0) {
                Bitmap tempBitmapHigh = getTempBitmapHigh();
                tempBitmapHigh.eraseColor(0);
                canvas3.setBitmap(tempBitmapHigh);
                int save3 = canvas3.save();
                canvas3.clipRect(0, 0, this.f2594V1, getHeight());
                canvas3.translate((float) (-(i - this.f2594V1)), 0.0f);
                super.draw(canvas3);
                canvas3.restoreToCount(save3);
                this.f2587O1.setShader(this.f2593U1);
                canvas3.drawRect(0.0f, 0.0f, (float) this.f2594V1, (float) getHeight(), this.f2587O1);
                Rect rect4 = this.f2596X1;
                rect4.left = 0;
                int i2 = this.f2594V1;
                rect4.right = i2;
                canvas2.translate((float) (i - i2), 0.0f);
                Rect rect5 = this.f2596X1;
                canvas2.drawBitmap(tempBitmapHigh, rect5, rect5, null);
                canvas2.translate((float) (-(i - this.f2594V1)), 0.0f);
            }
            return;
        }
        super.draw(canvas);
    }

    public final boolean getFadingLeftEdge() {
        return this.f2585M1;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f2590R1;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f2591S1;
    }

    public final boolean getFadingRightEdge() {
        return this.f2586N1;
    }

    public final int getFadingRightEdgeLength() {
        return this.f2594V1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f2595W1;
    }

    public final void setFadingLeftEdge(boolean z) {
        if (this.f2585M1 != z) {
            this.f2585M1 = z;
            if (!this.f2585M1) {
                this.f2588P1 = null;
            }
            invalidate();
            m3203C();
        }
    }

    public final void setFadingLeftEdgeLength(int i) {
        if (this.f2590R1 != i) {
            this.f2590R1 = i;
            int i2 = this.f2590R1;
            if (i2 != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) i2, 0.0f, 0, -16777216, TileMode.CLAMP);
                this.f2589Q1 = linearGradient;
            } else {
                this.f2589Q1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i) {
        if (this.f2591S1 != i) {
            this.f2591S1 = i;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z) {
        if (this.f2586N1 != z) {
            this.f2586N1 = z;
            if (!this.f2586N1) {
                this.f2592T1 = null;
            }
            invalidate();
            m3203C();
        }
    }

    public final void setFadingRightEdgeLength(int i) {
        if (this.f2594V1 != i) {
            this.f2594V1 = i;
            int i2 = this.f2594V1;
            if (i2 != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) i2, 0.0f, -16777216, 0, TileMode.CLAMP);
                this.f2593U1 = linearGradient;
            } else {
                this.f2593U1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i) {
        if (this.f2595W1 != i) {
            this.f2595W1 = i;
            invalidate();
        }
    }

    public void setNumRows(int i) {
        this.f2765C1.mo3924v(i);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(C4234l.lbHorizontalGridView_rowHeight) != null) {
            setRowHeight(typedArray.getLayoutDimension(C4234l.lbHorizontalGridView_rowHeight, 0));
        }
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2587O1 = new Paint();
        this.f2596X1 = new Rect();
        this.f2765C1.mo3926w(0);
        mo3451b(context, attributeSet);
    }

    public void setRowHeight(int i) {
        this.f2765C1.mo3927x(i);
        requestLayout();
    }
}
