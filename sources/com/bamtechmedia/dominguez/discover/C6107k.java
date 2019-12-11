package com.bamtechmedia.dominguez.discover;

import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0817t;
import com.bamtechmedia.dominguez.collections.items.C3370m;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.core.recycler.C5812b.C5813a;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5807b;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5363f;

/* renamed from: com.bamtechmedia.dominguez.discover.k */
/* compiled from: DiscoverTvScrollBehaviour.kt */
public final class C6107k implements C5813a {

    /* renamed from: a */
    private final C6099e f14044a;

    public C6107k(C6099e eVar) {
        this.f14044a = eVar;
    }

    /* renamed from: a */
    public void mo17727a() {
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) this.f14044a._$_findCachedViewById(C5363f.discoverFullBleedImage);
        if (aspectRatioImageView != null) {
            RecyclerView recyclerView = (RecyclerView) this.f14044a._$_findCachedViewById(C5363f.discoverRecyclerView);
            if (recyclerView != null) {
                recyclerView.mo4385a((C0817t) new C3370m(aspectRatioImageView));
            }
        }
        RecyclerViewSnapScrollHelper r = this.f14044a.mo12327r();
        C0722m viewLifecycleOwner = this.f14044a.getViewLifecycleOwner();
        Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "fragment.viewLifecycleOwner");
        RecyclerView recyclerView2 = (RecyclerView) this.f14044a._$_findCachedViewById(C5363f.discoverRecyclerView);
        String str = "fragment.discoverRecyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, str);
        RecyclerView recyclerView3 = (RecyclerView) this.f14044a._$_findCachedViewById(C5363f.discoverRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView3, str);
        int paddingTop = recyclerView3.getPaddingTop();
        RecyclerView recyclerView4 = (RecyclerView) this.f14044a._$_findCachedViewById(C5363f.discoverRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView4, str);
        r.mo17710a(viewLifecycleOwner, recyclerView2, (C5805c) new C5807b(paddingTop, recyclerView4.getPaddingBottom()));
    }
}
