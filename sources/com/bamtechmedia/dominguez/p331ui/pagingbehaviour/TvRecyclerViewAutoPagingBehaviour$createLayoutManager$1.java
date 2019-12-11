package com.bamtechmedia.dominguez.p331ui.pagingbehaviour;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u000f"}, mo31007d2 = {"com/bamtechmedia/dominguez/ui/pagingbehaviour/TvRecyclerViewAutoPagingBehaviour$createLayoutManager$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onInterceptFocusSearch", "Landroid/view/View;", "focused", "direction", "", "onRequestChildFocus", "", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "child", "shouldStopAutoPaging", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ui.pagingbehaviour.TvRecyclerViewAutoPagingBehaviour$createLayoutManager$1 */
/* compiled from: TvRecyclerViewAutoPagingBehaviour.kt */
public final class TvRecyclerViewAutoPagingBehaviour$createLayoutManager$1 extends LinearLayoutManager {

    /* renamed from: H */
    final /* synthetic */ TvRecyclerViewAutoPagingBehaviour f17316H;

    TvRecyclerViewAutoPagingBehaviour$createLayoutManager$1(TvRecyclerViewAutoPagingBehaviour tvRecyclerViewAutoPagingBehaviour, Context context, int i, boolean z) {
        this.f17316H = tvRecyclerViewAutoPagingBehaviour;
        super(context, i, z);
    }

    /* renamed from: p */
    private final boolean m23462p(View view) {
        boolean z = this.f17316H.f17313b0.mo12378t() == null;
        boolean w = this.f17316H.f17313b0.mo12380w();
        if (view == null || !z || !w) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo4712a(RecyclerView recyclerView, C0788a0 a0Var, View view, View view2) {
        view.setOnKeyListener(this.f17316H);
        view.setFocusableInTouchMode(true);
        if (m23462p(view2)) {
            this.f17316H.mo12600a();
        }
        return super.mo4712a(recyclerView, a0Var, view, view2);
    }

    /* renamed from: d */
    public View mo3889d(View view, int i) {
        if ((this.f17316H.m23455a(view) && i == 17) || i == 66) {
            int e = this.f17316H.f17310Y.mo4430e(view);
            int i2 = i == 17 ? e - 1 : e + 1;
            if (i2 >= 0) {
                mo3858a(this.f17316H.f17310Y, (C0788a0) null, i2);
                this.f17316H.mo21088a(false, Boolean.valueOf(true));
                this.f17316H.m23452a(i2);
                return mo4337c(i2);
            }
        }
        return super.mo3889d(view, i);
    }
}
