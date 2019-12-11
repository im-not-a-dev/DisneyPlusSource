package com.bamtechmedia.dominguez.collections.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bamtechmedia.dominguez.collections.p078m0.C3424c;
import com.bamtechmedia.dominguez.collections.p078m0.C3425d;
import com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0002J0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0014J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014J&\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfContainerLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "calculateRecyclerViewTop", "onLayout", "", "changed", "", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "toggleTopPadding", "enable", "itemMargin", "topMargin", "position", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ShelfContainerLayout.kt */
public final class ShelfContainerLayout extends FrameLayout {

    /* renamed from: c */
    private HashMap f8392c;

    public ShelfContainerLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public ShelfContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ShelfContainerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final int m11472a() {
        TextView textView = (TextView) mo12394a(C3424c.shelfTitle);
        String str = "shelfTitle";
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, str);
        if (!(textView.getVisibility() == 0)) {
            return getPaddingTop();
        }
        TextView textView2 = (TextView) mo12394a(C3424c.shelfTitle);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, str);
        return Math.max(0, textView2.getMeasuredHeight()) + getPaddingTop();
    }

    /* renamed from: a */
    public View mo12394a(int i) {
        if (this.f8392c == null) {
            this.f8392c = new HashMap();
        }
        View view = (View) this.f8392c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f8392c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int a = m11472a();
        ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) mo12394a(C3424c.shelfRecyclerView);
        ShelfItemRecyclerView shelfItemRecyclerView2 = (ShelfItemRecyclerView) mo12394a(C3424c.shelfRecyclerView);
        String str = "shelfRecyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView2, str);
        int measuredWidth = shelfItemRecyclerView2.getMeasuredWidth();
        ShelfItemRecyclerView shelfItemRecyclerView3 = (ShelfItemRecyclerView) mo12394a(C3424c.shelfRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView3, str);
        shelfItemRecyclerView.layout(0, a, measuredWidth, shelfItemRecyclerView3.getMeasuredHeight() + a);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        int a = m11472a();
        ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) mo12394a(C3424c.shelfRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView, "shelfRecyclerView");
        setMeasuredDimension(MeasureSpec.getSize(i), a + shelfItemRecyclerView.getMeasuredHeight());
    }

    public ShelfContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C3425d.shelf_container_layout, this, true);
        setImportantForAccessibility(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* renamed from: a */
    public final void mo12395a(boolean z, int i, int i2, int i3) {
        if (i3 == 0) {
            i = 0;
        } else {
            TextView textView = (TextView) mo12394a(C3424c.shelfTitle);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "shelfTitle");
            if (textView.getVisibility() == 0) {
                i /= 2;
            }
        }
        int i4 = i2 - i;
        if (!z) {
            i4 = 0;
        }
        setPadding(getPaddingLeft(), i4, getPaddingRight(), getPaddingBottom());
    }
}
