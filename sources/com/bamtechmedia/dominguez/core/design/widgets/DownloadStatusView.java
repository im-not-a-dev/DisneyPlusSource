package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.bamtechmedia.dominguez.core.p088i.C3832b;
import com.bamtechmedia.dominguez.core.p088i.C3836f;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0002%&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0006\u0010\u001a\u001a\u00020\u0017J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J$\u0010\"\u001a\u00020\u0017*\u00020\u00192\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/DownloadStatusView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundPaint", "Landroid/graphics/Paint;", "displayProgressOnStart", "", "drawBackground", "formFactor", "paint", "value", "", "progress", "setProgress", "(F)V", "shouldDraw", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setChevron", "setImageLevel", "level", "setupAttributes", "shouldDrawBackground", "update", "state", "Lcom/bamtechmedia/dominguez/core/design/widgets/DownloadStatusView$State;", "drawArc", "startAngle", "sweepAngle", "Companion", "State", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadStatusView.kt */
public final class DownloadStatusView extends AppCompatImageView {

    /* renamed from: V */
    private final Paint f13231V;

    /* renamed from: W */
    private final Paint f13232W;

    /* renamed from: a0 */
    private boolean f13233a0;

    /* renamed from: b0 */
    private boolean f13234b0;

    /* renamed from: c0 */
    private boolean f13235c0;

    /* renamed from: d0 */
    private int f13236d0;

    /* renamed from: e0 */
    private float f13237e0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView$a */
    /* compiled from: DownloadStatusView.kt */
    public static final class C5634a {
        private C5634a() {
        }

        public /* synthetic */ C5634a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView$b */
    /* compiled from: DownloadStatusView.kt */
    public interface C5635b {
        /* renamed from: a */
        float mo17402a();

        /* renamed from: b */
        int mo17403b();

        /* renamed from: c */
        boolean mo17404c();
    }

    static {
        new C5634a(null);
    }

    public DownloadStatusView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DownloadStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DownloadStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final boolean m18466a(int i) {
        boolean z = true;
        if (!this.f13234b0 || i != 0) {
            if (1 > i || 5 <= i) {
                z = false;
            }
            return z;
        }
        setProgress(100.0f);
        return true;
    }

    private final void setProgress(float f) {
        this.f13237e0 = f;
        invalidate();
    }

    private final void setupAttributes(AttributeSet attributeSet) {
        int i;
        Context context = getContext();
        String str = "context";
        Intrinsics.checkReturnedValueIsNotNull((Object) context, str);
        int[] iArr = C3843m.DownloadStatusView;
        Intrinsics.checkReturnedValueIsNotNull((Object) iArr, "R.styleable.DownloadStatusView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f13234b0 = obtainStyledAttributes.getBoolean(C3843m.DownloadStatusView_displayProgressAtStart, false);
        this.f13236d0 = obtainStyledAttributes.getInt(C3843m.DownloadStatusView_formFactor, 0);
        int i2 = this.f13236d0;
        if (i2 == 1) {
            i = C3836f.ic_download_status_small;
        } else if (i2 != 2) {
            i = C3836f.ic_download_status_large;
        } else {
            TypedValue typedValue = new TypedValue();
            Context context2 = getContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) context2, str);
            context2.getTheme().resolveAttribute(C3832b.detail_download_icons, typedValue, true);
            i = typedValue.resourceId;
        }
        setImageResource(i);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f13235c0) {
            float f = this.f13237e0 * 360.0f;
            if (canvas != null) {
                m18465a(canvas, -90.0f, f, this.f13231V);
            }
            if (this.f13233a0 && canvas != null) {
                m18465a(canvas, f - 90.0f, 360.0f - f, this.f13232W);
            }
        }
    }

    public void setImageLevel(int i) {
        this.f13233a0 = m18466a(i) && this.f13236d0 != 2;
        Drawable drawable = getDrawable();
        String str = "drawable";
        Intrinsics.checkReturnedValueIsNotNull((Object) drawable, str);
        int level = drawable.getLevel();
        super.setImageLevel(i);
        if (i == 3 && level != i) {
            Drawable drawable2 = getDrawable();
            Intrinsics.checkReturnedValueIsNotNull((Object) drawable2, str);
            Drawable current = drawable2.getCurrent();
            if (!(current instanceof Animatable)) {
                current = null;
            }
            Animatable animatable = (Animatable) current;
            if (animatable != null && !animatable.isRunning()) {
                Drawable drawable3 = getDrawable();
                Intrinsics.checkReturnedValueIsNotNull((Object) drawable3, str);
                Drawable current2 = drawable3.getCurrent();
                if (!(current2 instanceof Animatable)) {
                    current2 = null;
                }
                Animatable animatable2 = (Animatable) current2;
                if (animatable2 != null) {
                    animatable2.start();
                }
            }
        }
    }

    public DownloadStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setColor(C5837i.m18835a(context, C3832b.circleButtonProgressColor, null, false, 6, null));
        paint.setStyle(Style.STROKE);
        paint.setStrokeCap(Cap.BUTT);
        Resources resources = context.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
        paint.setStrokeWidth(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        this.f13231V = paint;
        Paint paint2 = new Paint(this.f13231V);
        paint2.setColor(C5837i.m18835a(context, C3832b.circleButtonTrackColor, null, false, 6, null));
        this.f13232W = paint2;
        this.f13233a0 = true;
        this.f13237e0 = isInEditMode() ? 0.75f : 0.0f;
        setupAttributes(attributeSet);
        setImageLevel(0);
    }

    /* renamed from: a */
    public final void mo17399a(C5635b bVar) {
        this.f13235c0 = bVar.mo17404c();
        setProgress(bVar.mo17402a());
        setImageLevel(bVar.mo17403b());
    }

    /* renamed from: a */
    private final void m18465a(Canvas canvas, float f, float f2, Paint paint) {
        float strokeWidth = paint.getStrokeWidth() / ((float) 2);
        canvas.drawArc(strokeWidth + ((float) getPaddingStart()), strokeWidth + ((float) getPaddingTop()), (((float) getMeasuredWidth()) - strokeWidth) - ((float) getPaddingEnd()), (((float) getMeasuredHeight()) - strokeWidth) - ((float) getPaddingBottom()), f, f2, false, paint);
    }
}
