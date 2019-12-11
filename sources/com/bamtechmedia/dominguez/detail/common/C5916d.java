package com.bamtechmedia.dominguez.detail.common;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0807n;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p287k.C7310d;

/* renamed from: com.bamtechmedia.dominguez.detail.common.d */
/* compiled from: ContentDetailOffsetItemDecorator.kt */
public final class C5916d extends C0807n {

    /* renamed from: a */
    private final int f13697a;

    public C5916d(int i) {
        this.f13697a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0788a0 a0Var) {
        if (C12880j.m40224a(view.getTag(C7310d.viewHelperIgnoreOffset), (Object) Boolean.valueOf(true))) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int i = this.f13697a;
        rect.set(i, 0, i, 0);
    }
}
