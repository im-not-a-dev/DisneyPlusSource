package p163g.p201e.p203b.p316t;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5364g;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÂ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/options/OptionsViewItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "menuItem", "Lcom/bamtechmedia/dominguez/options/OptionMenuItem;", "router", "Lcom/bamtechmedia/dominguez/options/OptionsRouter;", "showBadge", "", "(Lcom/bamtechmedia/dominguez/options/OptionMenuItem;Lcom/bamtechmedia/dominguez/options/OptionsRouter;Z)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "component1", "component2", "component3", "copy", "equals", "other", "", "getLayout", "hashCode", "isSameAs", "Lcom/xwray/groupie/Item;", "toString", "", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.t.r */
/* compiled from: OptionsViewItem.kt */
public final class C7791r extends C11866a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C7777f f16872U;

    /* renamed from: V */
    private final boolean f16873V;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7774c f16874c;

    /* renamed from: g.e.b.t.r$a */
    /* compiled from: OptionsViewItem.kt */
    static final class C7792a implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7791r f16875c;

        C7792a(C7791r rVar) {
            this.f16875c = rVar;
        }

        public final void onClick(View view) {
            this.f16875c.f16872U.mo20689a(this.f16875c.f16874c);
        }
    }

    public C7791r(C7774c cVar, C7777f fVar, boolean z) {
        this.f16874c = cVar;
        this.f16872U = fVar;
        this.f16873V = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7791r) {
                C7791r rVar = (C7791r) obj;
                if (Intrinsics.areEqual((Object) this.f16874c, (Object) rVar.f16874c) && Intrinsics.areEqual((Object) this.f16872U, (Object) rVar.f16872U)) {
                    if (this.f16873V == rVar.f16873V) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int getLayout() {
        return C5364g.options_list_item;
    }

    public int hashCode() {
        C7774c cVar = this.f16874c;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C7777f fVar = this.f16872U;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f16873V;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C7791r) && ((C7791r) eVar).f16874c == this.f16874c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OptionsViewItem(menuItem=");
        sb.append(this.f16874c);
        sb.append(", router=");
        sb.append(this.f16872U);
        sb.append(", showBadge=");
        sb.append(this.f16873V);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003d, code lost:
        if (r0 != null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p163g.p509o.p510a.p511l.C11867b r2, int r3) {
        /*
            r1 = this;
            android.view.View r3 = r2.mo20994a()
            int r0 = p163g.p201e.p202a.C5363f.title
            android.view.View r3 = r3.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r0)
            g.e.b.t.c r0 = r1.f16874c
            int r0 = r0.mo20686b()
            java.lang.String r0 = com.bamtechmedia.dominguez.core.utils.C5880u.m18936a(r0)
            r3.setText(r0)
            android.view.View r3 = r2.mo20994a()
            int r0 = p163g.p201e.p202a.C5363f.optionsListRowRoot
            android.view.View r3 = r3.findViewById(r0)
            java.lang.String r0 = "optionsListRowRoot"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r0)
            g.e.b.t.c r0 = r1.f16874c
            java.lang.Integer r0 = r0.mo20685a()
            if (r0 == 0) goto L_0x0040
            int r0 = r0.intValue()
            java.lang.String r0 = com.bamtechmedia.dominguez.core.utils.C5880u.m18936a(r0)
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            java.lang.String r0 = ""
        L_0x0042:
            r3.setContentDescription(r0)
            android.view.View r3 = r2.mo20994a()
            int r0 = p163g.p201e.p202a.C5363f.badgeIcon
            android.view.View r3 = r3.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x0058
            boolean r0 = r1.f16873V
            p096e.p121h.p135s.C4127b0.m14131b(r3, r0)
        L_0x0058:
            android.view.View r2 = r2.itemView
            g.e.b.t.r$a r3 = new g.e.b.t.r$a
            r3.<init>(r1)
            r2.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p316t.C7791r.bind(g.o.a.l.b, int):void");
    }
}
