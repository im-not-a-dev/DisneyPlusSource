package com.bamtechmedia.dominguez.core.p215k;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.bamtechmedia.dominguez.core.k.b */
/* compiled from: FocusFinderWrapper.kt */
public final class C5759b {
    /* renamed from: a */
    public final View mo17644a(ViewGroup viewGroup, View view, int i) {
        return FocusFinder.getInstance().findNextFocus(viewGroup, view, i);
    }

    /* renamed from: a */
    public final View mo17643a(ViewGroup viewGroup, Rect rect, int i) {
        return FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, i);
    }

    /* renamed from: a */
    public final View mo17645a(RecyclerView recyclerView) {
        return mo17643a((ViewGroup) recyclerView, new Rect(0, 0, 0, 0), 130);
    }
}
