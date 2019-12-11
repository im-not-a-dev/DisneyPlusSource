package com.bamtechmedia.dominguez.detail.common.p230g0;

import android.content.Context;
import android.view.View;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p287k.C7310d;

/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.d */
/* compiled from: ContentDetailTvKeyDownHandler.kt */
public final class C5950d {
    /* renamed from: a */
    public final boolean mo17884a(int i, View view, View view2) {
        boolean z = i == 19;
        boolean z2 = i == 20;
        boolean a = Intrinsics.areEqual(view.getTag(C7310d.focusHelperTabView), (Object) Boolean.valueOf(true));
        if (a && z2) {
            View focusSearch = view.focusSearch(130);
            if (focusSearch != null && focusSearch.getId() == C7310d.contentDetailRecyclerView) {
                return true;
            }
        }
        if (!a || !z || view2 == null) {
            return false;
        }
        return view2.requestFocus();
    }

    /* renamed from: a */
    public final void mo17883a(int i, View view, boolean z, boolean z2, Function1<? super Integer, C13145v> function1) {
        int a = m19091a(view, i);
        boolean z3 = false;
        boolean z4 = a == 19;
        if (a == 20) {
            z3 = true;
        }
        Integer num = (!z3 || !z2 || !z) ? (!z3 || !z2) ? (!z4 || !Intrinsics.areEqual(view.getTag(C7310d.focusHelperTabView), (Object) Boolean.valueOf(true))) ? null : Integer.valueOf(C7310d.headerExpanded) : Integer.valueOf(C7310d.headerCollapsed) : Integer.valueOf(C7310d.headerCollapsedNoBlur);
        if (num != null) {
            function1.invoke(Integer.valueOf(num.intValue()));
        }
    }

    /* renamed from: a */
    private final int m19091a(View view, int i) {
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "currentFocus.context");
        if (!C5837i.m18836a(context)) {
            return i;
        }
        if (i != 33) {
            return i != 130 ? 0 : 20;
        }
        return 19;
    }
}
