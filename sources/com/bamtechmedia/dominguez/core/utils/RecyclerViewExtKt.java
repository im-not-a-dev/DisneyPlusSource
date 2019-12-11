package com.bamtechmedia.dominguez.core.utils;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000e\u001a\n\u0010\u000f\u001a\u00020\f*\u00020\u0002\u001a\u0012\u0010\u0010\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0013"}, mo31007d2 = {"focusedChildPosition", "", "Landroidx/recyclerview/widget/RecyclerView;", "getFocusedChildPosition", "(Landroidx/recyclerview/widget/RecyclerView;)I", "bindAdapter", "", "Landroidx/fragment/app/Fragment;", "recyclerView", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "doWhenAllItemsVisible", "", "action", "Lkotlin/Function1;", "isFirstItemCompletelyVisible", "isPositionCompletelyVisible", "Landroidx/recyclerview/widget/LinearLayoutManager;", "position", "core-utils_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: RecyclerViewExt.kt */
public final class RecyclerViewExtKt {
    /* renamed from: a */
    public static final void m18800a(Fragment fragment, RecyclerView recyclerView, C0797g<?> gVar) {
        recyclerView.setAdapter(gVar);
        C0722m viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
        viewLifecycleOwner.getLifecycle().mo4134a(new RecyclerViewExtKt$bindAdapter$1(recyclerView));
    }

    /* renamed from: a */
    public static final boolean m18801a(LinearLayoutManager linearLayoutManager, int i) {
        return linearLayoutManager.mo4318H() <= i && linearLayoutManager.mo4320J() >= i;
    }
}
