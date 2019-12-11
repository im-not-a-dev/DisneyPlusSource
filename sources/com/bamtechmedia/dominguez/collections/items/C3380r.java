package com.bamtechmedia.dominguez.collections.items;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0807n;
import com.bamtechmedia.dominguez.collections.p079n0.C3431b;
import com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView;
import com.bamtechmedia.dominguez.core.content.sets.C3788m;
import com.bamtechmedia.dominguez.core.p083f.C3798a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.p224u0.C5881a;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.C8087a;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.C8094c;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.TvRecyclerViewAutoPagingBehaviour;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.pageindicator.C8097a;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.pageindicator.PageIndicatorView;
import com.google.common.base.Optional;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!H\u0014J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\rH\u0016J\t\u0010$\u001a\u00020%HÖ\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfHeroItem;", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItem;", "parameters", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItemParameters;", "autoPagingLifecycleHelper", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingLifecycleHelper;", "(Lcom/bamtechmedia/dominguez/collections/items/ShelfItemParameters;Lcom/google/common/base/Optional;)V", "infiniteLoopGroupAdapter", "Lcom/bamtechmedia/dominguez/core/adapter/InfiniteLoopGroupAdapter;", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "updatePageIndicator", "Lkotlin/Function1;", "", "", "component1", "component2", "containerTopPaddingEnabled", "", "copy", "createViewHolder", "itemView", "Landroid/view/View;", "equals", "other", "", "getFirstItem", "getLayout", "hashCode", "initAutoPagingBehaviour", "recyclerView", "Lcom/bamtechmedia/dominguez/collections/ui/ShelfItemRecyclerView;", "onCreateAdapter", "Lcom/xwray/groupie/GroupAdapter;", "restoreIndicator", "position", "toString", "", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.r */
/* compiled from: ShelfHeroItem.kt */
public final class C3380r extends C3384s {

    /* renamed from: Y */
    private Function1<? super Integer, C13145v> f8522Y = C3383c.f8530c;

    /* renamed from: Z */
    private final C3798a<C11867b> f8523Z = new C3798a<>(mo12514g().mo12620a(C3788m.LOOP), mo12515i().size());

    /* renamed from: a0 */
    private final C3392v f8524a0;

    /* renamed from: b0 */
    private final Optional<C3431b> f8525b0;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.r$a */
    /* compiled from: ShelfHeroItem.kt */
    static final class C3381a extends C12881k implements Function1<Integer, C13145v> {

        /* renamed from: U */
        final /* synthetic */ View f8526U;

        /* renamed from: c */
        final /* synthetic */ C3380r f8527c;

        C3381a(C3380r rVar, View view) {
            this.f8527c = rVar;
            this.f8526U = view;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return C13145v.f29587a;
        }

        public final void invoke(int i) {
            ((PageIndicatorView) this.f8526U.findViewById(C5363f.pageIndicatorView)).mo21104e(i % this.f8527c.mo12511d().mo13457f0().mo13413b0());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.r$b */
    /* compiled from: ShelfHeroItem.kt */
    public static final class C3382b implements C8097a {

        /* renamed from: U */
        final /* synthetic */ C8087a f8528U;

        /* renamed from: c */
        final /* synthetic */ C3380r f8529c;

        C3382b(C3380r rVar, C8087a aVar) {
            this.f8529c = rVar;
            this.f8528U = aVar;
        }

        /* renamed from: c */
        public int mo12504c() {
            return ((TvRecyclerViewAutoPagingBehaviour) this.f8528U).mo21085d();
        }

        /* renamed from: d */
        public int mo12505d() {
            return this.f8529c.mo12511d().mo13457f0().mo13413b0();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.r$c */
    /* compiled from: ShelfHeroItem.kt */
    static final class C3383c extends C12881k implements Function1<Integer, C13145v> {

        /* renamed from: c */
        public static final C3383c f8530c = new C3383c();

        C3383c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return C13145v.f29587a;
        }

        public final void invoke(int i) {
        }
    }

    public C3380r(C3392v vVar, Optional<C3431b> optional) {
        super(vVar);
        this.f8524a0 = vVar;
        this.f8525b0 = optional;
    }

    /* renamed from: a */
    private final void m11573a(View view, ShelfItemRecyclerView shelfItemRecyclerView) {
        C8094c cVar;
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "itemView.context");
        if (C5837i.m18843e(context)) {
            TvRecyclerViewAutoPagingBehaviour tvRecyclerViewAutoPagingBehaviour = new TvRecyclerViewAutoPagingBehaviour(shelfItemRecyclerView, view, this.f8522Y, mo12518l(), mo12513f(), null, 32, null);
            PageIndicatorView pageIndicatorView = (PageIndicatorView) view.findViewById(C5363f.pageIndicatorView);
            if (pageIndicatorView != null) {
                pageIndicatorView.setPageIndicatorCallback(new C3382b(this, tvRecyclerViewAutoPagingBehaviour));
            }
            cVar = tvRecyclerViewAutoPagingBehaviour;
        } else {
            C8094c cVar2 = new C8094c(shelfItemRecyclerView, mo12518l(), mo12513f(), null, 8, null);
            cVar = cVar2;
        }
        shelfItemRecyclerView.addOnAttachStateChangeListener(cVar);
        shelfItemRecyclerView.setItemAnimator(null);
        C3431b bVar = (C3431b) this.f8525b0.mo27107c();
        if (bVar != null) {
            bVar.mo12602a(cVar);
        }
    }

    /* renamed from: b */
    public boolean mo12492b() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f8525b0, (java.lang.Object) r3.f8525b0) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.collections.items.C3380r
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.collections.items.r r3 = (com.bamtechmedia.dominguez.collections.items.C3380r) r3
            com.bamtechmedia.dominguez.collections.items.v r0 = r2.f8524a0
            com.bamtechmedia.dominguez.collections.items.v r1 = r3.f8524a0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.google.common.base.Optional<com.bamtechmedia.dominguez.collections.n0.b> r0 = r2.f8525b0
            com.google.common.base.Optional<com.bamtechmedia.dominguez.collections.n0.b> r3 = r3.f8525b0
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3380r.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C5364g.shelf_item_hero_snap;
    }

    /* renamed from: h */
    public int mo12499h() {
        return this.f8523Z.mo13701d();
    }

    public int hashCode() {
        C3392v vVar = this.f8524a0;
        int i = 0;
        int hashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        Optional<C3431b> optional = this.f8525b0;
        if (optional != null) {
            i = optional.hashCode();
        }
        return hashCode + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C11848c<C11867b> mo12501n() {
        return this.f8523Z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShelfHeroItem(parameters=");
        sb.append(this.f8524a0);
        sb.append(", autoPagingLifecycleHelper=");
        sb.append(this.f8525b0);
        sb.append(")");
        return sb.toString();
    }

    public C11867b createViewHolder(View view) {
        C11867b createViewHolder = super.createViewHolder(view);
        this.f8522Y = new C3381a(this, view);
        ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) createViewHolder.mo20994a().findViewById(C5363f.shelfRecyclerView);
        String str = "it.shelfRecyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView, str);
        shelfItemRecyclerView.setImportantForAccessibility(2);
        new C5881a().mo5150a((RecyclerView) (ShelfItemRecyclerView) createViewHolder.mo20994a().findViewById(C5363f.shelfRecyclerView));
        ShelfItemRecyclerView shelfItemRecyclerView2 = (ShelfItemRecyclerView) createViewHolder.mo20994a().findViewById(C5363f.shelfRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView2, str);
        m11573a(view, shelfItemRecyclerView2);
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "itemView.context");
        if (!C5837i.m18843e(context)) {
            ((ShelfItemRecyclerView) createViewHolder.mo20994a().findViewById(C5363f.shelfRecyclerView)).mo4381a((C0807n) new C3371n());
        }
        return createViewHolder;
    }

    /* renamed from: a */
    public void mo12497a(int i) {
        this.f8522Y.invoke(Integer.valueOf(i));
    }
}
