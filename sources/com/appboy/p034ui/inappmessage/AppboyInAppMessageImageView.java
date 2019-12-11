package com.appboy.p034ui.inappmessage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.appboy.p025o.p026k.C1507b;
import com.appboy.p033s.C1557c;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.appboy.ui.inappmessage.AppboyInAppMessageImageView */
public class AppboyInAppMessageImageView extends ImageView implements IInAppMessageImageView {
    private static final String TAG = C1557c.m7461a(AppboyInAppMessageImageView.class);
    private float mAspectRatio = -1.0f;
    private Path mClipPath = new Path();
    private float[] mInAppRadii;
    private RectF mRect = new RectF();
    private boolean mSetToHalfParentHeight = false;

    public AppboyInAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAdjustViewBounds(true);
    }

    /* access modifiers changed from: 0000 */
    public boolean clipCanvasToPath(Canvas canvas, int i, int i2) {
        if (this.mInAppRadii != null) {
            try {
                this.mClipPath.reset();
                this.mRect.set(0.0f, 0.0f, (float) i, (float) i2);
                this.mClipPath.addRoundRect(this.mRect, this.mInAppRadii, Direction.CW);
                canvas.clipPath(this.mClipPath);
                return true;
            } catch (Exception e) {
                C1557c.m7470c(TAG, "Encountered exception while trying to clip in-app message image", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Path getClipPath() {
        return this.mClipPath;
    }

    /* access modifiers changed from: 0000 */
    public float[] getInAppRadii() {
        return this.mInAppRadii;
    }

    /* access modifiers changed from: 0000 */
    public RectF getRectf() {
        return this.mRect;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mAspectRatio == -1.0f || getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (((float) measuredWidth) / this.mAspectRatio)) + 1);
        }
        if (this.mSetToHalfParentHeight) {
            setMeasuredDimension(getMeasuredWidth(), (int) (((double) ((View) getParent()).getHeight()) * 0.5d));
        }
    }

    public void setAspectRatio(float f) {
        this.mAspectRatio = f;
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setClipPath(Path path) {
        this.mClipPath = path;
    }

    public void setCornersRadiiPx(float f, float f2, float f3, float f4) {
        this.mInAppRadii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public void setCornersRadiusPx(float f) {
        setCornersRadiiPx(f, f, f, f);
    }

    public void setInAppMessageImageCropType(C1507b bVar) {
        if (bVar.equals(C1507b.FIT_CENTER)) {
            setScaleType(ScaleType.FIT_CENTER);
        } else if (bVar.equals(C1507b.CENTER_CROP)) {
            setScaleType(ScaleType.CENTER_CROP);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setRectf(RectF rectF) {
        this.mRect = rectF;
    }

    public void setToHalfParentHeight(boolean z) {
        this.mSetToHalfParentHeight = z;
        requestLayout();
    }
}
