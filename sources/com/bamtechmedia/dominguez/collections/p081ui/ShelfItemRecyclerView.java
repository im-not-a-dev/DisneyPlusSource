package com.bamtechmedia.dominguez.collections.p081ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import com.bamtechmedia.dominguez.collections.p078m0.C3424c;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\b\u0010\u000f\u001a\u00020\u0007H\u0014J\b\u0010\u0010\u001a\u00020\u0007H\u0014J\b\u0010\u0011\u001a\u00020\u0007H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/ui/ShelfItemRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lastPosition", "focusSearch", "Landroid/view/View;", "focused", "direction", "getBottomPaddingOffset", "getLeftPaddingOffset", "getRightPaddingOffset", "getTopPaddingOffset", "isPaddingOffsetRequired", "", "scrollOnFixItem", "", "position", "tiles", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.ui.ShelfItemRecyclerView */
/* compiled from: ShelfItemRecyclerView.kt */
public final class ShelfItemRecyclerView extends RecyclerView {

    /* renamed from: C1 */
    private int f8767C1;

    public ShelfItemRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ShelfItemRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ShelfItemRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public View focusSearch(View view, int i) {
        Integer num = null;
        View c = view != null ? mo4407c(view) : null;
        if (c != null) {
            C0808o layoutManager = getLayoutManager();
            if (layoutManager != null) {
                num = Integer.valueOf(layoutManager.mo4749l(c));
            }
        }
        if (num != null && num.intValue() == 0 && i == 17) {
            return getRootView().findViewById(C3424c.globalNavAccessibilityFocusWorkaround);
        }
        return super.focusSearch(view, i);
    }

    /* access modifiers changed from: protected */
    public int getBottomPaddingOffset() {
        return getPaddingBottom();
    }

    /* access modifiers changed from: protected */
    public int getLeftPaddingOffset() {
        return -getPaddingStart();
    }

    /* access modifiers changed from: protected */
    public int getRightPaddingOffset() {
        return getPaddingEnd();
    }

    /* access modifiers changed from: protected */
    public int getTopPaddingOffset() {
        return -getPaddingTop();
    }

    /* access modifiers changed from: protected */
    public boolean isPaddingOffsetRequired() {
        return isHorizontalFadingEdgeEnabled();
    }

    /* renamed from: k */
    public final void mo12695k(int i, int i2) {
        int i3 = (this.f8767C1 < i ? i2 - 1 : 0) + i;
        if (i3 >= 0) {
            mo3685j(i3);
            this.f8767C1 = i;
        }
    }

    public ShelfItemRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipToPadding(false);
        setClipChildren(false);
    }
}
