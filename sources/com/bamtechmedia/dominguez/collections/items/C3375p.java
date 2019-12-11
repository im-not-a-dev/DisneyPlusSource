package com.bamtechmedia.dominguez.collections.items;

import android.view.View;
import android.view.View.OnClickListener;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3320f.C3322b;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import java.util.Map;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p202a.C5362e;
import p163g.p201e.p202a.C5364g;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0002)*B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÂ\u0003J\t\u0010\u001c\u001a\u00020\tHÂ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bHÂ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\u0018\u0010\"\u001a\u0004\u0018\u00010\u00182\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\t\u0010&\u001a\u00020\u000fHÖ\u0001J\u0016\u0010'\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010$H\u0016J\t\u0010(\u001a\u00020\fHÖ\u0001R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfCategoryItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "clickHandler", "Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;", "analytics", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "trackExtraMap", "", "", "(Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;Lcom/bamtechmedia/dominguez/core/content/assets/Asset;Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;Ljava/util/Map;)V", "assetsIcons", "", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "holder", "payloads", "", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getLayout", "hashCode", "isSameAs", "toString", "Factory", "Payload", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.p */
/* compiled from: ShelfCategoryItem.kt */
public final class C3375p extends C11866a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C3444j f8508U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C3626b f8509V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C3345c f8510W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C3320f f8511X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final Map<String, String> f8512Y;

    /* renamed from: c */
    private final Map<String, Integer> f8513c = C13173j0.m40356a(C12907r.m40244a("originals", Integer.valueOf(C5362e.ic_star_originals_36)), C12907r.m40244a("movies", Integer.valueOf(C5362e.ic_movies_36)), C12907r.m40244a("series", Integer.valueOf(C5362e.ic_series_36)));

    /* renamed from: com.bamtechmedia.dominguez.collections.items.p$a */
    /* compiled from: ShelfCategoryItem.kt */
    public static final class C3376a {

        /* renamed from: a */
        private final C3345c f8514a;

        /* renamed from: b */
        private final C3320f f8515b;

        public C3376a(C3345c cVar, C3320f fVar) {
            this.f8514a = cVar;
            this.f8515b = fVar;
        }

        /* renamed from: a */
        public final C3375p mo12485a(C3444j jVar, C3626b bVar, Map<String, String> map) {
            C3375p pVar = new C3375p(jVar, bVar, this.f8514a, this.f8515b, map);
            return pVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.p$b */
    /* compiled from: ShelfCategoryItem.kt */
    private static final class C3377b {

        /* renamed from: a */
        private final boolean f8516a;

        /* renamed from: b */
        private final boolean f8517b;

        public C3377b(boolean z, boolean z2) {
            this.f8516a = z;
            this.f8517b = z2;
        }

        /* renamed from: a */
        public final boolean mo12486a() {
            return this.f8516a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3377b) {
                    C3377b bVar = (C3377b) obj;
                    if (this.f8516a == bVar.f8516a) {
                        if (this.f8517b == bVar.f8517b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f8516a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f8517b;
            if (!z2) {
                i = z2;
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Payload(assetChanged=");
            sb.append(this.f8516a);
            sb.append(", configChanged=");
            sb.append(this.f8517b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.p$c */
    /* compiled from: ShelfCategoryItem.kt */
    static final class C3378c implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ int f8518U;

        /* renamed from: c */
        final /* synthetic */ C3375p f8519c;

        C3378c(C3375p pVar, int i) {
            this.f8519c = pVar;
            this.f8518U = i;
        }

        public final void onClick(View view) {
            this.f8519c.f8510W.mo12436a(this.f8519c.f8509V);
            C3322b.m11431a(this.f8519c.f8511X, this.f8519c.f8508U, this.f8518U, this.f8519c.f8509V, this.f8519c.f8512Y, false, 16, null);
        }
    }

    /* JADX INFO: used method not loaded: kotlin.y.j0.a(kotlin.Pair[]):null, types can be incorrect */
    public C3375p(C3444j jVar, C3626b bVar, C3345c cVar, C3320f fVar, Map<String, String> map) {
        this.f8508U = jVar;
        this.f8509V = bVar;
        this.f8510W = cVar;
        this.f8511X = fVar;
        this.f8512Y = map;
    }

    public void bind(C11867b bVar, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f8512Y, (java.lang.Object) r3.f8512Y) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.collections.items.C3375p
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.collections.items.p r3 = (com.bamtechmedia.dominguez.collections.items.C3375p) r3
            com.bamtechmedia.dominguez.collections.o0.j r0 = r2.f8508U
            com.bamtechmedia.dominguez.collections.o0.j r1 = r3.f8508U
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.core.content.assets.b r0 = r2.f8509V
            com.bamtechmedia.dominguez.core.content.assets.b r1 = r3.f8509V
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.collections.items.c r0 = r2.f8510W
            com.bamtechmedia.dominguez.collections.items.c r1 = r3.f8510W
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.collections.f r0 = r2.f8511X
            com.bamtechmedia.dominguez.collections.f r1 = r3.f8511X
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f8512Y
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f8512Y
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3375p.equals(java.lang.Object):boolean");
    }

    public Object getChangePayload(C11853e<?> eVar) {
        if (eVar != null) {
            C3375p pVar = (C3375p) eVar;
            return new C3377b(!C12880j.m40224a((Object) pVar.f8509V, (Object) this.f8509V), !C12880j.m40224a((Object) pVar.f8508U, (Object) this.f8508U));
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.collections.items.ShelfCategoryItem");
    }

    public int getLayout() {
        return C5364g.shelf_category_item;
    }

    public int hashCode() {
        C3444j jVar = this.f8508U;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        C3626b bVar = this.f8509V;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C3345c cVar = this.f8510W;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C3320f fVar = this.f8511X;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        Map<String, String> map = this.f8512Y;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C3375p) && C12880j.m40224a((Object) ((C3375p) eVar).f8509V.getTitle(), (Object) this.f8509V.getTitle());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShelfCategoryItem(config=");
        sb.append(this.f8508U);
        sb.append(", asset=");
        sb.append(this.f8509V);
        sb.append(", clickHandler=");
        sb.append(this.f8510W);
        sb.append(", analytics=");
        sb.append(this.f8511X);
        sb.append(", trackExtraMap=");
        sb.append(this.f8512Y);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p163g.p509o.p510a.p511l.C11867b r4, int r5, java.util.List<java.lang.Object> r6) {
        /*
            r3 = this;
            android.view.View r0 = r4.itemView
            com.bamtechmedia.dominguez.collections.items.p$c r1 = new com.bamtechmedia.dominguez.collections.items.p$c
            r1.<init>(r3, r5)
            r0.setOnClickListener(r1)
            boolean r5 = r6.isEmpty()
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0042
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L_0x001e
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x001e
        L_0x001c:
            r5 = 0
            goto L_0x003e
        L_0x001e:
            java.util.Iterator r5 = r6.iterator()
        L_0x0022:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x001c
            java.lang.Object r6 = r5.next()
            boolean r2 = r6 instanceof com.bamtechmedia.dominguez.collections.items.C3375p.C3377b
            if (r2 == 0) goto L_0x003a
            com.bamtechmedia.dominguez.collections.items.p$b r6 = (com.bamtechmedia.dominguez.collections.items.C3375p.C3377b) r6
            boolean r6 = r6.mo12486a()
            if (r6 == 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            if (r6 == 0) goto L_0x0022
            r5 = 1
        L_0x003e:
            if (r5 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x00b0
            com.bamtechmedia.dominguez.core.content.assets.b r5 = r3.f8509V
            if (r5 == 0) goto L_0x00a8
            com.bamtechmedia.dominguez.core.content.assets.CollectionAsset r5 = (com.bamtechmedia.dominguez.core.content.assets.CollectionAsset) r5
            java.lang.String r5 = r5.mo12841O()
            java.util.Map<java.lang.String, java.lang.Integer> r6 = r3.f8513c
            java.lang.Object r5 = r6.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x006c
            android.view.View r6 = r4.mo20994a()
            int r0 = p163g.p201e.p202a.C5363f.icon_view
            android.view.View r6 = r6.findViewById(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            int r5 = r5.intValue()
            r6.setImageResource(r5)
            goto L_0x007c
        L_0x006c:
            android.view.View r5 = r4.mo20994a()
            int r6 = p163g.p201e.p202a.C5363f.icon_view
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 0
            r5.setImageDrawable(r6)
        L_0x007c:
            android.view.View r5 = r4.mo20994a()
            int r6 = p163g.p201e.p202a.C5363f.title_view
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "holder.title_view"
            kotlin.jvm.internal.C12880j.m40222a(r5, r6)
            com.bamtechmedia.dominguez.core.content.assets.b r6 = r3.f8509V
            java.lang.String r6 = r6.getTitle()
            r5.setText(r6)
            android.view.View r4 = r4.mo20994a()
            int r5 = p163g.p201e.p202a.C5363f.shelf_item_layout
            android.view.View r4 = r4.findViewById(r5)
            com.bamtechmedia.dominguez.collections.items.ShelfItemLayout r4 = (com.bamtechmedia.dominguez.collections.items.ShelfItemLayout) r4
            com.bamtechmedia.dominguez.collections.o0.j r5 = r3.f8508U
            r4.setConfig(r5)
            goto L_0x00b0
        L_0x00a8:
            kotlin.s r4 = new kotlin.s
            java.lang.String r5 = "null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.assets.CollectionAsset"
            r4.<init>(r5)
            throw r4
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3375p.bind(g.o.a.l.b, int, java.util.List):void");
    }
}
