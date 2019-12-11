package com.bamtechmedia.dominguez.collections.items;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0807n;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ScalingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "scaleCalculator", "Lcom/bamtechmedia/dominguez/collections/items/ScalingItemDecoration$ScaleCalculator;", "onDraw", "", "c", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "ScaleCalculator", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.n */
/* compiled from: ScalingItemDecoration.kt */
public final class C3371n extends C0807n {

    /* renamed from: a */
    private final C3372a f8507a = new C3372a();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ScalingItemDecoration$ScaleCalculator;", "", "()V", "calculateScale", "", "childLeft", "", "childWidth", "parentLeft", "parentWidth", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.collections.items.n$a */
    /* compiled from: ScalingItemDecoration.kt */
    public static final class C3372a {

        /* renamed from: com.bamtechmedia.dominguez.collections.items.n$a$a */
        /* compiled from: ScalingItemDecoration.kt */
        public static final class C3373a {
            private C3373a() {
            }

            public /* synthetic */ C3373a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C3373a(null);
        }

        /* renamed from: a */
        public final float mo12478a(int i, int i2, int i3, int i4) {
            float f;
            int i5 = i3 - i;
            int i6 = (i + i2) - (i3 + i4);
            float f2 = 1.0f;
            if (i5 > 0) {
                f = (float) i5;
            } else {
                if (i6 > 0) {
                    f = (float) i6;
                }
                return (f2 * 0.13333333f) + 0.8666667f;
            }
            f2 = 1.0f - (f / ((float) i2));
            return (f2 * 0.13333333f) + 0.8666667f;
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C0788a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                float a = this.f8507a.mo12478a(childAt.getLeft(), childAt.getMeasuredWidth(), recyclerView.getLeft(), recyclerView.getMeasuredWidth());
                C5852n0.m18878a(childAt, a);
                float measuredWidth = ((float) childAt.getMeasuredWidth()) - (((float) childAt.getMeasuredWidth()) * a);
                if (childAt.getLeft() + (childAt.getMeasuredWidth() / 2) < recyclerView.getLeft() + (recyclerView.getMeasuredWidth() / 2)) {
                    childAt.setTranslationX(measuredWidth / ((float) 2));
                } else {
                    childAt.setTranslationX((-measuredWidth) / ((float) 2));
                }
            }
        }
    }
}
