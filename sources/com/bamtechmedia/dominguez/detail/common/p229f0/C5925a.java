package com.bamtechmedia.dominguez.detail.common.p229f0;

import android.content.Context;
import android.view.View;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptTabLayout;
import com.bamtechmedia.dominguez.core.design.widgets.p213e.C5681a;
import com.bamtechmedia.dominguez.core.utils.C5842k0;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.p227d0.C5917a;
import com.google.android.material.tabs.TabLayout.C10341g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p590y.C13180m;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001/B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H\u0016J\u000e\u0010\u001a\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÀ\u0003¢\u0006\u0002\b\u001dJ\t\u0010\u001e\u001a\u00020\u0007HÂ\u0003J\u000e\u0010\u001f\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b J7\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J \u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\u0018\u0010'\u001a\u0004\u0018\u00010\u00192\f\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0016H\u0016J\t\u0010+\u001a\u00020\u0016HÖ\u0001J\u0016\u0010,\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010)H\u0016J\t\u0010-\u001a\u00020.HÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u00060"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/mobile/TabsItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "selectedTab", "Lcom/bamtechmedia/dominguez/detail/common/Tab;", "tabs", "", "onTabSelectedListener", "Lcom/bamtechmedia/dominguez/detail/common/listeners/OnTabSelectedListener;", "tabLayoutHelper", "Lcom/bamtechmedia/dominguez/core/design/widgets/tablayout/TabLayoutHelper;", "(Lcom/bamtechmedia/dominguez/detail/common/Tab;Ljava/util/List;Lcom/bamtechmedia/dominguez/detail/common/listeners/OnTabSelectedListener;Lcom/bamtechmedia/dominguez/core/design/widgets/tablayout/TabLayoutHelper;)V", "getSelectedTab$contentDetail_release", "()Lcom/bamtechmedia/dominguez/detail/common/Tab;", "getTabLayoutHelper$contentDetail_release", "()Lcom/bamtechmedia/dominguez/core/design/widgets/tablayout/TabLayoutHelper;", "getTabs$contentDetail_release", "()Ljava/util/List;", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "holder", "payloads", "", "component1", "component1$contentDetail_release", "component2", "component2$contentDetail_release", "component3", "component4", "component4$contentDetail_release", "copy", "createTab", "tab", "equals", "", "other", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getLayout", "hashCode", "isSameAs", "toString", "", "ChangePayload", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.f0.a */
/* compiled from: TabsItem.kt */
public final class C5925a extends C11866a {

    /* renamed from: U */
    private final List<C6008x> f13716U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C5917a f13717V;

    /* renamed from: W */
    private final C5681a f13718W;

    /* renamed from: c */
    private final C6008x f13719c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.f0.a$a */
    /* compiled from: TabsItem.kt */
    public static final class C5926a {

        /* renamed from: a */
        private final boolean f13720a;

        public C5926a(boolean z) {
            this.f13720a = z;
        }

        /* renamed from: a */
        public final boolean mo17843a() {
            return this.f13720a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5926a) {
                    if (this.f13720a == ((C5926a) obj).f13720a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f13720a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangePayload(tabsChange=");
            sb.append(this.f13720a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.f0.a$b */
    /* compiled from: TabsItem.kt */
    static final class C5927b extends C12881k implements Function1<C10341g, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5925a f13721c;

        C5927b(C5925a aVar, List list) {
            this.f13721c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17847a(C10341g gVar) {
            this.f13721c.f13717V.mo17819a((C6008x) this.f13721c.mo17837a().get(gVar.mo26965c()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17847a((C10341g) obj);
            return C13145v.f29587a;
        }
    }

    public /* synthetic */ C5925a(C6008x xVar, List list, C5917a aVar, C5681a aVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            aVar2 = new C5681a();
        }
        this(xVar, list, aVar, aVar2);
    }

    public void bind(C11867b bVar, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13718W, (java.lang.Object) r3.f13718W) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.common.p229f0.C5925a
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.detail.common.f0.a r3 = (com.bamtechmedia.dominguez.detail.common.p229f0.C5925a) r3
            com.bamtechmedia.dominguez.detail.common.x r0 = r2.f13719c
            com.bamtechmedia.dominguez.detail.common.x r1 = r3.f13719c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<com.bamtechmedia.dominguez.detail.common.x> r0 = r2.f13716U
            java.util.List<com.bamtechmedia.dominguez.detail.common.x> r1 = r3.f13716U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.detail.common.d0.a r0 = r2.f13717V
            com.bamtechmedia.dominguez.detail.common.d0.a r1 = r3.f13717V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.core.design.widgets.e.a r0 = r2.f13718W
            com.bamtechmedia.dominguez.core.design.widgets.e.a r3 = r3.f13718W
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.p229f0.C5925a.equals(java.lang.Object):boolean");
    }

    public Object getChangePayload(C11853e<?> eVar) {
        if (eVar != null) {
            C5925a aVar = (C5925a) eVar;
            boolean z = true;
            if (!(!Intrinsics.areEqual((Object) aVar.f13719c, (Object) this.f13719c)) && !(!Intrinsics.areEqual((Object) aVar.f13716U, (Object) this.f13716U))) {
                z = false;
            }
            return new C5926a(z);
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.detail.common.mobile.TabsItem");
    }

    public int getLayout() {
        return C7312f.tabs_item;
    }

    public int hashCode() {
        C6008x xVar = this.f13719c;
        int i = 0;
        int hashCode = (xVar != null ? xVar.hashCode() : 0) * 31;
        List<C6008x> list = this.f13716U;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C5917a aVar = this.f13717V;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C5681a aVar2 = this.f13718W;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode3 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C5925a) && Intrinsics.areEqual((Object) ((C5925a) eVar).f13716U, (Object) this.f13716U);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TabsItem(selectedTab=");
        sb.append(this.f13719c);
        sb.append(", tabs=");
        sb.append(this.f13716U);
        sb.append(", onTabSelectedListener=");
        sb.append(this.f13717V);
        sb.append(", tabLayoutHelper=");
        sb.append(this.f13718W);
        sb.append(")");
        return sb.toString();
    }

    public C5925a(C6008x xVar, List<? extends C6008x> list, C5917a aVar, C5681a aVar2) {
        this.f13719c = xVar;
        this.f13716U = list;
        this.f13717V = aVar;
        this.f13718W = aVar2;
    }

    /* renamed from: a */
    public final List<C6008x> mo17837a() {
        return this.f13716U;
    }

    /* renamed from: a */
    private final void m19024a(C11867b bVar, C6008x xVar, int i) {
        View view = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "viewHolder.itemView");
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "viewHolder.itemView.context");
        String a = C5880u.m18938a(context, xVar.mo18028d());
        FocusSearchInterceptTabLayout focusSearchInterceptTabLayout = (FocusSearchInterceptTabLayout) bVar.mo20994a().findViewById(C7310d.detailTabLayout);
        if (focusSearchInterceptTabLayout.mo26895b(i) == null) {
            Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptTabLayout, "it");
            focusSearchInterceptTabLayout.mo26886a(C5842k0.m18858a(focusSearchInterceptTabLayout, C7312f.detail_tabs_tab, a), i);
        }
    }

    public void bind(C11867b bVar, int i, List<? extends Object> list) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(next instanceof C5926a) || !((C5926a) next).mo17843a()) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                z3 = false;
            }
        }
        if (z3) {
            int i2 = 0;
            for (Object next2 : this.f13716U) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    m19024a(bVar, (C6008x) next2, i2);
                    i2 = i3;
                } else {
                    C13180m.m40455c();
                    throw null;
                }
            }
            View findViewById = bVar.mo20994a().findViewById(C7310d.tab_separator);
            Intrinsics.checkReturnedValueIsNotNull((Object) findViewById, "tab_separator");
            findViewById.setVisibility(0);
            C5681a aVar = this.f13718W;
            FocusSearchInterceptTabLayout focusSearchInterceptTabLayout = (FocusSearchInterceptTabLayout) bVar.mo20994a().findViewById(C7310d.detailTabLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptTabLayout, "detailTabLayout");
            C5681a.m18553a(aVar, focusSearchInterceptTabLayout, this.f13716U.indexOf(this.f13719c), null, null, null, new C5927b(this, list), 28, null);
        }
    }
}
