package com.bamtechmedia.dominguez.core.utils.p224u0;

import android.view.View;
import androidx.recyclerview.widget.C0892p;
import androidx.recyclerview.widget.C0895q;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.utils.u0.a */
/* compiled from: CenterPagerSnapHelper.kt */
public final class C5881a extends C0895q {

    /* renamed from: e */
    private C0892p f13661e;

    /* renamed from: d */
    private final C0892p m18943d(C0808o oVar) {
        if (this.f13661e == null) {
            this.f13661e = C0892p.m4932a(oVar);
        }
        C0892p pVar = this.f13661e;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: a */
    public int[] mo5126a(C0808o oVar, View view) {
        return new int[]{m18942a(view, m18943d(oVar)), 0};
    }

    /* renamed from: a */
    private final int m18942a(View view, C0892p pVar) {
        return (pVar.mo5117d(view) + (pVar.mo5113b(view) / 2)) - (pVar.mo5120f() + (pVar.mo5122g() / 2));
    }
}
