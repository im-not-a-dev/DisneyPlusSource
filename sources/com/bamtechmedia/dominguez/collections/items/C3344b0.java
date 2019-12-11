package com.bamtechmedia.dominguez.collections.items;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView;
import com.bamtechmedia.dominguez.core.utils.p224u0.C5881a;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: com.bamtechmedia.dominguez.collections.items.b0 */
/* compiled from: ShelfPagerSnapItem.kt */
public final class C3344b0 extends C3384s {

    /* renamed from: Y */
    private final C3392v f8416Y;

    public C3344b0(C3392v vVar) {
        super(vVar);
        this.f8416Y = vVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f8416Y, (java.lang.Object) ((com.bamtechmedia.dominguez.collections.items.C3344b0) r2).f8416Y) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.collections.items.C3344b0
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.collections.items.b0 r2 = (com.bamtechmedia.dominguez.collections.items.C3344b0) r2
            com.bamtechmedia.dominguez.collections.items.v r0 = r1.f8416Y
            com.bamtechmedia.dominguez.collections.items.v r2 = r2.f8416Y
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3344b0.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C5364g.shelf_item_with_snap;
    }

    public int hashCode() {
        C3392v vVar = this.f8416Y;
        if (vVar != null) {
            return vVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShelfPagerSnapItem(parameters=");
        sb.append(this.f8416Y);
        sb.append(")");
        return sb.toString();
    }

    public C11867b createViewHolder(View view) {
        C11867b createViewHolder = super.createViewHolder(view);
        new C5881a().mo5150a((RecyclerView) (ShelfItemRecyclerView) createViewHolder.mo20994a().findViewById(C5363f.shelfRecyclerView));
        return createViewHolder;
    }
}
