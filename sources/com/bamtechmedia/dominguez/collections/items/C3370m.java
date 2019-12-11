package com.bamtechmedia.dominguez.collections.items;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0817t;

/* renamed from: com.bamtechmedia.dominguez.collections.items.m */
/* compiled from: FullBleedRecyclerScrollListener.kt */
public final class C3370m extends C0817t {

    /* renamed from: a */
    private final View f8506a;

    public C3370m(View view) {
        this.f8506a = view;
    }

    /* renamed from: a */
    public void mo4784a(RecyclerView recyclerView, int i, int i2) {
        super.mo4784a(recyclerView, i, i2);
        this.f8506a.animate().alpha(recyclerView.computeVerticalScrollOffset() == 0 ? 1.0f : 0.0f);
    }
}
