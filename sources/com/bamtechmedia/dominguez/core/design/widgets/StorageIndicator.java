package com.bamtechmedia.dominguez.core.design.widgets;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bamtechmedia.dominguez.core.p088i.C3832b;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ<\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0016\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u0010¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/StorageIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Landroid/animation/Animator;", "appColor", "value", "", "appPercentage", "setAppPercentage", "(F)V", "freeColor", "freePercentage", "getFreePercentage", "()F", "paint", "Landroid/graphics/Paint;", "radiusInPx", "usedColor", "usedPercentage", "setUsedPercentage", "drawPart", "", "color", "percentage", "canvas", "Landroid/graphics/Canvas;", "bottom", "roundedCornersAtStart", "", "roundedCornersAtEnd", "onDraw", "update", "newUsedPercentage", "newAppPercentage", "Companion", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: StorageIndicator.kt */
public final class StorageIndicator extends View {

    /* renamed from: U */
    private final float f13284U;

    /* renamed from: V */
    private final int f13285V;

    /* renamed from: W */
    private final int f13286W;

    /* renamed from: a0 */
    private final int f13287a0;

    /* renamed from: b0 */
    private Animator f13288b0;

    /* renamed from: c */
    private final Paint f13289c;

    /* renamed from: c0 */
    private float f13290c0;

    /* renamed from: d0 */
    private float f13291d0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.StorageIndicator$a */
    /* compiled from: StorageIndicator.kt */
    public static final class C5656a {
        private C5656a() {
        }

        public /* synthetic */ C5656a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.StorageIndicator$b */
    /* compiled from: StorageIndicator.kt */
    static final class C5657b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StorageIndicator f13292a;

        C5657b(StorageIndicator storageIndicator) {
            this.f13292a = storageIndicator;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StorageIndicator storageIndicator = this.f13292a;
            C12880j.m40222a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                storageIndicator.setUsedPercentage(((Float) animatedValue).floatValue());
                return;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.StorageIndicator$c */
    /* compiled from: StorageIndicator.kt */
    static final class C5658c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StorageIndicator f13293a;

        C5658c(StorageIndicator storageIndicator) {
            this.f13293a = storageIndicator;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StorageIndicator storageIndicator = this.f13293a;
            C12880j.m40222a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                storageIndicator.setAppPercentage(((Float) animatedValue).floatValue());
                return;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        new C5656a(null);
    }

    public StorageIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public StorageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StorageIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final float getFreePercentage() {
        return (1.0f - this.f13290c0) - this.f13291d0;
    }

    /* access modifiers changed from: private */
    public final void setAppPercentage(float f) {
        this.f13291d0 = f;
        invalidate();
    }

    /* access modifiers changed from: private */
    public final void setUsedPercentage(float f) {
        this.f13290c0 = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredHeight = (float) getMeasuredHeight();
        canvas.save();
        m18508a(this.f13285V, this.f13290c0, canvas, measuredHeight, true, this.f13291d0 == 0.0f && getFreePercentage() == 0.0f);
        Canvas canvas2 = canvas;
        float f = measuredHeight;
        m18510a(this, this.f13286W, this.f13291d0, canvas2, f, false, getFreePercentage() == 0.0f, 16, null);
        m18510a(this, this.f13287a0, getFreePercentage(), canvas2, f, false, true, 16, null);
        canvas.restore();
    }

    public StorageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setStyle(Style.FILL);
        this.f13289c = paint;
        Resources resources = context.getResources();
        C12880j.m40222a((Object) resources, "resources");
        this.f13284U = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        Context context2 = context;
        this.f13285V = C5837i.m18835a(context2, C3832b.settingsStorageUsed, null, false, 6, null);
        this.f13286W = C5837i.m18835a(context2, C3832b.settingsStorageUsedByApp, null, false, 6, null);
        this.f13287a0 = C5837i.m18835a(context2, C3832b.settingsStorageFree, null, false, 6, null);
        float f = 0.3f;
        this.f13290c0 = isInEditMode() ? 0.3f : -1.0f;
        if (!isInEditMode()) {
            f = -1.0f;
        }
        this.f13291d0 = f;
    }

    /* renamed from: a */
    public final void mo17469a(float f, float f2) {
        if (this.f13290c0 == -1.0f || this.f13291d0 == -1.0f) {
            setUsedPercentage(f);
            setAppPercentage(f2);
            return;
        }
        Animator animator = this.f13288b0;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f13290c0, f});
        ofFloat.addUpdateListener(new C5657b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.f13291d0, f2});
        ofFloat2.addUpdateListener(new C5658c(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
        this.f13288b0 = animatorSet;
    }

    /* renamed from: a */
    static /* synthetic */ void m18510a(StorageIndicator storageIndicator, int i, float f, Canvas canvas, float f2, boolean z, boolean z2, int i2, Object obj) {
        storageIndicator.m18508a(i, f, canvas, f2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    /* renamed from: a */
    private final void m18508a(int i, float f, Canvas canvas, float f2, boolean z, boolean z2) {
        if (f != 0.0f) {
            float measuredWidth = ((float) getMeasuredWidth()) * f;
            int i2 = i;
            this.f13289c.setColor(i);
            float f3 = this.f13284U;
            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, f2, f3, f3, this.f13289c);
            if (!z) {
                canvas.drawRect(0.0f, 0.0f, this.f13284U, f2, this.f13289c);
            }
            if (!z2) {
                canvas.drawRect(measuredWidth - this.f13284U, 0.0f, measuredWidth, f2, this.f13289c);
            } else {
                Canvas canvas2 = canvas;
            }
            canvas.translate(measuredWidth, 0.0f);
        }
    }
}
