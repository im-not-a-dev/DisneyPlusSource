package com.bamtechmedia.dominguez.p331ui.pagingbehaviour.pageindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.C8092b.C8093a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p122j.C4025a;
import p163g.p201e.p202a.C5358a;
import p163g.p201e.p202a.C5360c;
import p163g.p201e.p202a.C5362e;
import p163g.p201e.p202a.C5367j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J(\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0007J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\bH\u0007J\b\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bH\u0007J\b\u0010&\u001a\u00020\bH\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010%\u001a\u00020\bH\u0007J\b\u0010)\u001a\u00020\bH\u0007J\b\u0010*\u001a\u00020\u0019H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\"H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.H\u0002J\u000e\u00102\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\bH\u0007J\u000e\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020\bJ\f\u00106\u001a\u00020\u0019*\u00020\u0006H\u0002R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00068"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/pageindicator/PageIndicatorView;", "Landroid/widget/LinearLayout;", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/FullBleedAutoPagingBehaviour$Listener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorNormal", "colorSelected", "indicatorDistance", "", "indicatorShape", "indicatorSize", "indicatorsArray", "", "Landroid/view/View;", "[Landroid/view/View;", "pageCount", "pagingIndicatorCallback", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/pageindicator/PagingIndicatorCallback;", "selectedIndicatorSize", "addDefaultShapeView", "", "indicatorItem", "isCurrent", "", "addDrawableView", "calculateMarginIndicatorDistance", "createIndicatorViews", "selectedPosition", "createItem", "Landroid/widget/ImageView;", "createOvalShapeDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "color", "getCurrentPosition", "getIndicatorDrawable", "Landroid/graphics/drawable/Drawable;", "getPageCount", "selectNextItem", "selectPreviousItem", "setIndicatorDistance", "typedArray", "Landroid/content/res/TypedArray;", "setIndicatorDrawable", "indicator", "setIndicatorSize", "setPageIndicatorCallback", "updateIndicatorViews", "position", "updatePageIndicators", "setConfiguredStyleAttributes", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.pageindicator.PageIndicatorView */
/* compiled from: PageIndicatorView.kt */
public final class PageIndicatorView extends LinearLayout implements C8093a {

    /* renamed from: U */
    private int f17330U;

    /* renamed from: V */
    private C8097a f17331V;

    /* renamed from: W */
    private float f17332W;

    /* renamed from: a0 */
    private float f17333a0;

    /* renamed from: b0 */
    private float f17334b0;

    /* renamed from: c */
    private final View[] f17335c;

    /* renamed from: c0 */
    private int f17336c0;

    /* renamed from: d0 */
    private int f17337d0;

    /* renamed from: e0 */
    private int f17338e0;

    /* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.pageindicator.PageIndicatorView$a */
    /* compiled from: PageIndicatorView.kt */
    public static final class C8096a {
        private C8096a() {
        }

        public /* synthetic */ C8096a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C8096a(null);
    }

    public PageIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PageIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final void setConfiguredStyleAttributes(AttributeSet attributeSet) {
        Context context = getContext();
        if (context != null) {
            int[] iArr = C5367j.PageIndicatorView;
            Intrinsics.checkReturnedValueIsNotNull((Object) iArr, "R.styleable.PageIndicatorView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C5358a.pageIndicatorViewStyle, 0);
            setIndicatorDistance(obtainStyledAttributes);
            this.f17336c0 = obtainStyledAttributes.getInt(C5367j.PageIndicatorView_indicatorShape, 0);
            setIndicatorSize(obtainStyledAttributes);
            this.f17337d0 = obtainStyledAttributes.getColor(C5367j.PageIndicatorView_indicatorColorSelected, C4025a.m13788a(getContext(), C5360c.vader_white));
            this.f17338e0 = obtainStyledAttributes.getColor(C5367j.PageIndicatorView_indicatorColor, C4025a.m13788a(getContext(), C5360c.grey8));
            obtainStyledAttributes.recycle();
        }
    }

    private final void setIndicatorDistance(TypedArray typedArray) {
        Resources resources = getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
        this.f17334b0 = typedArray.getDimension(C5367j.PageIndicatorView_indicatorDistanceBetween, resources.getDisplayMetrics().density * 4.0f);
    }

    private final void setIndicatorDrawable(ImageView imageView) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, mo21101c(this.f17337d0));
        stateListDrawable.addState(new int[]{-16842913}, mo21101c(this.f17338e0));
        imageView.setBackground(stateListDrawable);
    }

    private final void setIndicatorSize(TypedArray typedArray) {
        if (this.f17336c0 == 0) {
            Resources resources = getResources();
            Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
            float dimension = typedArray.getDimension(C5367j.PageIndicatorView_indicatorSize, resources.getDisplayMetrics().density * 4.0f);
            this.f17332W = dimension;
            this.f17333a0 = typedArray.getDimension(C5367j.PageIndicatorView_indicatorSelectedItemSize, dimension);
        }
    }

    /* renamed from: a */
    public final int mo21097a(boolean z, float f, float f2, float f3) {
        if (z) {
            f -= f3 - f2;
        }
        return (int) (f / ((float) 2));
    }

    /* renamed from: a */
    public final void mo21098a(int i) {
        this.f17330U = getPageCount();
        removeAllViews();
        int i2 = this.f17330U;
        int i3 = 0;
        while (i3 < i2) {
            boolean z = true;
            boolean z2 = i3 == getCurrentPosition();
            ImageView c = mo21102c();
            if (i3 != i) {
                z = false;
            }
            c.setSelected(z);
            c.setTag(Integer.valueOf(i3));
            setIndicatorDrawable(c);
            if (this.f17336c0 == 0) {
                mo21099a(c, z2);
            } else {
                m23483a((View) c);
            }
            i3++;
        }
        requestLayout();
    }

    /* renamed from: b */
    public final ShapeDrawable mo21100b(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        Intrinsics.checkReturnedValueIsNotNull((Object) paint, "paint");
        paint.setColor(i);
        return shapeDrawable;
    }

    /* renamed from: c */
    public final ImageView mo21102c() {
        ImageView imageView = new ImageView(getContext());
        C13171j.m40341a((Object[]) this.f17335c, (Object) this);
        return imageView;
    }

    /* renamed from: d */
    public final void mo21103d(int i) {
        if (this.f17330U == getPageCount()) {
            if (!(this.f17335c.length == 0)) {
                int i2 = this.f17330U;
                if (i2 == this.f17335c.length) {
                    int i3 = 0;
                    while (i3 < i2) {
                        this.f17335c[i3].setSelected(i3 == i);
                        i3++;
                    }
                    return;
                }
            }
        }
        mo21098a(i);
    }

    /* renamed from: e */
    public final void mo21104e(int i) {
        int i2 = this.f17330U;
        if (i >= 0 && i2 > i) {
            mo21103d(i);
            invalidate();
        }
    }

    public final int getCurrentPosition() {
        C8097a aVar = this.f17331V;
        if (aVar != null) {
            return aVar.mo12504c();
        }
        return 0;
    }

    public final int getPageCount() {
        C8097a aVar = this.f17331V;
        if (aVar != null) {
            return aVar.mo12505d();
        }
        return 0;
    }

    public final void setPageIndicatorCallback(C8097a aVar) {
        this.f17331V = aVar;
        mo21103d(getCurrentPosition());
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17335c = new View[0];
        this.f17330U = getPageCount();
        setGravity(17);
        if (attributeSet != null) {
            setConfiguredStyleAttributes(attributeSet);
        }
    }

    /* renamed from: c */
    public final Drawable mo21101c(int i) {
        if (this.f17336c0 != 1) {
            return mo21100b(i);
        }
        Drawable c = C4025a.m13798c(getContext(), C5362e.fullbleed_carousel_items_indicator);
        if (c != null) {
            c.setColorFilter(i, Mode.SRC);
            if (c != null) {
                return c;
            }
        }
        return mo21100b(i);
    }

    /* renamed from: b */
    public void mo21067b() {
        mo21104e(getCurrentPosition());
    }

    /* renamed from: a */
    public final void mo21099a(View view, boolean z) {
        LayoutParams layoutParams;
        if (z) {
            float f = this.f17333a0;
            layoutParams = new LayoutParams((int) f, (int) f);
        } else {
            float f2 = this.f17332W;
            layoutParams = new LayoutParams((int) f2, (int) f2);
        }
        int a = mo21097a(z, this.f17334b0, this.f17332W, this.f17333a0);
        if (getOrientation() == 0) {
            layoutParams.setMarginStart(a);
            layoutParams.setMarginEnd(a);
        } else {
            layoutParams.topMargin = a;
            layoutParams.bottomMargin = a;
        }
        addView(view, layoutParams);
    }

    /* renamed from: a */
    private final void m23483a(View view) {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        Resources resources = getResources();
        String str = "resources";
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, str);
        float applyDimension = TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        Resources resources2 = getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources2, str);
        float applyDimension2 = TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics());
        Resources resources3 = getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources3, str);
        int applyDimension3 = (int) TypedValue.applyDimension(1, 3.0f, resources3.getDisplayMetrics());
        layoutParams.setMargins(applyDimension3, applyDimension3, applyDimension3, applyDimension3);
        layoutParams.width = (int) applyDimension;
        layoutParams.height = (int) applyDimension2;
        addView(view, layoutParams);
    }

    /* renamed from: a */
    public void mo21065a() {
        mo21104e(getCurrentPosition());
    }
}
