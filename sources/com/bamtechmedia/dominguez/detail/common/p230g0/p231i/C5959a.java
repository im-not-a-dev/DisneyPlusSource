package com.bamtechmedia.dominguez.detail.common.p230g0.p231i;

import android.widget.TextView;
import com.bamtechmedia.dominguez.collections.items.C3384s;
import com.bamtechmedia.dominguez.collections.items.C3392v;
import com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView;
import com.bamtechmedia.dominguez.core.content.sets.C3788m;
import com.bamtechmedia.dominguez.core.utils.C5844l0;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.i.a */
/* compiled from: ContentDetailShelfItem.kt */
public final class C5959a extends C3384s implements C5960b {

    /* renamed from: Y */
    private TextView f13783Y;

    /* renamed from: Z */
    private final C3392v f13784Z;

    public C5959a(C3392v vVar) {
        super(vVar);
        this.f13784Z = vVar;
    }

    /* renamed from: a */
    public void unbind(C11867b bVar) {
        super.unbind(bVar);
        this.f13783Y = null;
    }

    /* renamed from: b */
    public boolean mo12492b() {
        return !mo12514g().mo12620a(C3788m.DISABLE_FIRST_GRID_ROW_TOP_PADDING);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f13784Z, (java.lang.Object) ((com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5959a) r2).f13784Z) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5959a
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.detail.common.g0.i.a r2 = (com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5959a) r2
            com.bamtechmedia.dominguez.collections.items.v r0 = r1.f13784Z
            com.bamtechmedia.dominguez.collections.items.v r2 = r2.f13784Z
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5959a.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C7312f.content_detail_shelf_item;
    }

    public int hashCode() {
        C3392v vVar = this.f13784Z;
        if (vVar != null) {
            return vVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentDetailShelfItem(parameters=");
        sb.append(this.f13784Z);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        super.bind(bVar, i);
        this.f13783Y = (TextView) bVar.mo20994a().findViewById(C7310d.episodeDescription);
        bVar.itemView.setTag(C7310d.viewHelperIgnoreOffset, Boolean.valueOf(true));
        ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) bVar.itemView.findViewById(C7310d.shelfRecyclerView);
        C12880j.m40222a((Object) shelfItemRecyclerView, "recyclerView");
        shelfItemRecyclerView.setVisibility(mo12515i().isEmpty() ^ true ? 0 : 8);
    }

    /* renamed from: a */
    public void mo17893a(String str) {
        TextView textView = this.f13783Y;
        if (textView != null) {
            C5844l0.m18864a(textView, str, true);
        }
    }
}
