package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/EdgeRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getBottomPaddingOffset", "getTopPaddingOffset", "isPaddingOffsetRequired", "", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EdgeRecyclerView.kt */
public final class EdgeRecyclerView extends RecyclerView {
    public EdgeRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EdgeRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EdgeRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public int getBottomPaddingOffset() {
        return getPaddingBottom();
    }

    /* access modifiers changed from: protected */
    public int getTopPaddingOffset() {
        return -getPaddingTop();
    }

    /* access modifiers changed from: protected */
    public boolean isPaddingOffsetRequired() {
        return true;
    }

    public EdgeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
