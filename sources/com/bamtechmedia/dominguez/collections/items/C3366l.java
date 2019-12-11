package com.bamtechmedia.dominguez.collections.items;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import com.bamtechmedia.dominguez.collections.C3323f0;
import com.bamtechmedia.dominguez.collections.p079n0.C3431b;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.p331ui.fullbleed.FullBleedItemView;
import com.bamtechmedia.dominguez.p331ui.fullbleed.FullBleedItemView.C8077a;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.C8092b;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.pageindicator.PageIndicatorView;
import com.google.common.base.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u00013BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÂ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÂ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÂ\u0003J\t\u0010\u001f\u001a\u00020\rHÂ\u0003J\t\u0010 \u001a\u00020\u000fHÂ\u0003J\t\u0010!\u001a\u00020\u0011HÂ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\nHÂ\u0003Jk\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nHÆ\u0001J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\b\u0010+\u001a\u00020\u001aH\u0016J\t\u0010,\u001a\u00020\u001aHÖ\u0001J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010%\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/FullBleedItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "shelfId", "", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "backgroundViewProvider", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemView$BackgroundViewProvider;", "clickHandler", "Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;", "autoPagingSession", "Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;", "collectionsAppConfig", "Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "autoPagingLifecycleHelper", "Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingLifecycleHelper;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;Lcom/google/common/base/Optional;Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;Lcom/google/common/base/Optional;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "createViewHolder", "itemView", "Landroid/view/View;", "equals", "", "other", "", "getLayout", "hashCode", "initAutoPagingBehaviour", "Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemView;", "isSameAs", "Lcom/xwray/groupie/Item;", "setSeeDetailsClickListener", "toString", "Factory", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.l */
/* compiled from: FullBleedItem.kt */
public final class C3366l extends C11866a {

    /* renamed from: U */
    private final C3444j f8490U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C3700c<C3626b> f8491V;

    /* renamed from: W */
    private final Optional<C8077a> f8492W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C3345c f8493X;

    /* renamed from: Y */
    private final C3323f0 f8494Y;

    /* renamed from: Z */
    private final C3441g f8495Z;

    /* renamed from: a0 */
    private final Optional<C3431b> f8496a0;

    /* renamed from: c */
    private final String f8497c;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.l$a */
    /* compiled from: FullBleedItem.kt */
    public static final class C3367a {

        /* renamed from: a */
        private final Optional<C8077a> f8498a;

        /* renamed from: b */
        private final C3345c f8499b;

        /* renamed from: c */
        private final C3323f0 f8500c;

        /* renamed from: d */
        private final C3441g f8501d;

        /* renamed from: e */
        private final Optional<C3431b> f8502e;

        public C3367a(Optional<C8077a> optional, C3345c cVar, C3323f0 f0Var, C3441g gVar, Optional<C3431b> optional2) {
            this.f8498a = optional;
            this.f8499b = cVar;
            this.f8500c = f0Var;
            this.f8501d = gVar;
            this.f8502e = optional2;
        }

        /* renamed from: a */
        public final C3366l mo12475a(C3444j jVar, String str, C3700c<? extends C3626b> cVar) {
            C3366l lVar = new C3366l(str, jVar, cVar, this.f8498a, this.f8499b, this.f8500c, this.f8501d, this.f8502e);
            return lVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.l$b */
    /* compiled from: FullBleedItem.kt */
    static final class C3368b implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C8092b f8503c;

        C3368b(C8092b bVar) {
            this.f8503c = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f8503c.mo21096b(z);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.l$c */
    /* compiled from: FullBleedItem.kt */
    static final class C3369c implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C11867b f8504U;

        /* renamed from: c */
        final /* synthetic */ C3366l f8505c;

        C3369c(C3366l lVar, C11867b bVar) {
            this.f8505c = lVar;
            this.f8504U = bVar;
        }

        public final void onClick(View view) {
            View view2 = this.f8504U.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view2, "viewHolder.itemView");
            PageIndicatorView carouselPositionIndicator = ((FullBleedItemView) view2.findViewById(C5363f.full_bleed_item)).getCarouselPositionIndicator();
            if (carouselPositionIndicator != null) {
                this.f8505c.f8493X.mo12436a((C3626b) this.f8505c.f8491V.get(carouselPositionIndicator.getCurrentPosition()));
            }
        }
    }

    public C3366l(String str, C3444j jVar, C3700c<? extends C3626b> cVar, Optional<C8077a> optional, C3345c cVar2, C3323f0 f0Var, C3441g gVar, Optional<C3431b> optional2) {
        this.f8497c = str;
        this.f8490U = jVar;
        this.f8491V = cVar;
        this.f8492W = optional;
        this.f8493X = cVar2;
        this.f8494Y = f0Var;
        this.f8495Z = gVar;
        this.f8496a0 = optional2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f8496a0, (java.lang.Object) r3.f8496a0) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.collections.items.C3366l
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.collections.items.l r3 = (com.bamtechmedia.dominguez.collections.items.C3366l) r3
            java.lang.String r0 = r2.f8497c
            java.lang.String r1 = r3.f8497c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.collections.o0.j r0 = r2.f8490U
            com.bamtechmedia.dominguez.collections.o0.j r1 = r3.f8490U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.core.content.paging.c<com.bamtechmedia.dominguez.core.content.assets.b> r0 = r2.f8491V
            com.bamtechmedia.dominguez.core.content.paging.c<com.bamtechmedia.dominguez.core.content.assets.b> r1 = r3.f8491V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.google.common.base.Optional<com.bamtechmedia.dominguez.ui.fullbleed.FullBleedItemView$a> r0 = r2.f8492W
            com.google.common.base.Optional<com.bamtechmedia.dominguez.ui.fullbleed.FullBleedItemView$a> r1 = r3.f8492W
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.collections.items.c r0 = r2.f8493X
            com.bamtechmedia.dominguez.collections.items.c r1 = r3.f8493X
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.collections.f0 r0 = r2.f8494Y
            com.bamtechmedia.dominguez.collections.f0 r1 = r3.f8494Y
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.collections.o0.g r0 = r2.f8495Z
            com.bamtechmedia.dominguez.collections.o0.g r1 = r3.f8495Z
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.google.common.base.Optional<com.bamtechmedia.dominguez.collections.n0.b> r0 = r2.f8496a0
            com.google.common.base.Optional<com.bamtechmedia.dominguez.collections.n0.b> r3 = r3.f8496a0
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3366l.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C5364g.full_bleed_item;
    }

    public int hashCode() {
        String str = this.f8497c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C3444j jVar = this.f8490U;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        C3700c<C3626b> cVar = this.f8491V;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Optional<C8077a> optional = this.f8492W;
        int hashCode4 = (hashCode3 + (optional != null ? optional.hashCode() : 0)) * 31;
        C3345c cVar2 = this.f8493X;
        int hashCode5 = (hashCode4 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C3323f0 f0Var = this.f8494Y;
        int hashCode6 = (hashCode5 + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
        C3441g gVar = this.f8495Z;
        int hashCode7 = (hashCode6 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        Optional<C3431b> optional2 = this.f8496a0;
        if (optional2 != null) {
            i = optional2.hashCode();
        }
        return hashCode7 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C3366l) && Intrinsics.areEqual((Object) ((C3366l) eVar).f8497c, (Object) this.f8497c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FullBleedItem(shelfId=");
        sb.append(this.f8497c);
        sb.append(", config=");
        sb.append(this.f8490U);
        sb.append(", assets=");
        sb.append(this.f8491V);
        sb.append(", backgroundViewProvider=");
        sb.append(this.f8492W);
        sb.append(", clickHandler=");
        sb.append(this.f8493X);
        sb.append(", autoPagingSession=");
        sb.append(this.f8494Y);
        sb.append(", collectionsAppConfig=");
        sb.append(this.f8495Z);
        sb.append(", autoPagingLifecycleHelper=");
        sb.append(this.f8496a0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m11558a(C11867b bVar) {
        bVar.itemView.setOnClickListener(new C3369c(this, bVar));
    }

    public void bind(C11867b bVar, int i) {
        View view = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "itemView");
        ((FullBleedItemView) view.findViewById(C5363f.full_bleed_item)).mo21066a(this.f8491V, this.f8490U.mo12621b(), (C8077a) this.f8492W.mo27107c());
        m11558a(bVar);
    }

    public C11867b createViewHolder(View view) {
        C11867b createViewHolder = super.createViewHolder(view);
        FullBleedItemView fullBleedItemView = (FullBleedItemView) createViewHolder.mo20994a().findViewById(C5363f.full_bleed_item);
        Intrinsics.checkReturnedValueIsNotNull((Object) fullBleedItemView, "it.full_bleed_item");
        m11557a(fullBleedItemView);
        return createViewHolder;
    }

    /* renamed from: a */
    private final void m11557a(FullBleedItemView fullBleedItemView) {
        C8092b bVar = new C8092b(fullBleedItemView, null, fullBleedItemView, this.f8494Y, this.f8495Z, 2, null);
        fullBleedItemView.addOnAttachStateChangeListener(bVar);
        fullBleedItemView.setOnFocusChangeListener(new C3368b(bVar));
        C3431b bVar2 = (C3431b) this.f8496a0.mo27107c();
        if (bVar2 != null) {
            bVar2.mo12602a(bVar);
        }
    }
}
