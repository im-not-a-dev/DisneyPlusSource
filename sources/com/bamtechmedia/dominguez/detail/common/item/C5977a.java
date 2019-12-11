package com.bamtechmedia.dominguez.detail.common.item;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.detail.common.p228e0.C5923c;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4127b0;
import p096e.p121h.p135s.C4187x;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÂ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\t\u0010\u001e\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u001f\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010 H\u0016J\t\u0010!\u001a\u00020\"HÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/item/AssetDetailsViewItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "metadata", "Lcom/bamtechmedia/dominguez/detail/common/metadata/PlayableMetadata;", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "config", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "(Lcom/bamtechmedia/dominguez/detail/common/metadata/PlayableMetadata;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;)V", "addSection", "", "detailSection", "Lcom/bamtechmedia/dominguez/detail/common/item/DetailSection;", "desiredTitle", "", "desiredDescription", "bind", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getLayout", "hashCode", "isSameAs", "Lcom/xwray/groupie/Item;", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.item.a */
/* compiled from: AssetDetailsViewItem.kt */
public final class C5977a extends C11866a {

    /* renamed from: U */
    private final C3572r0 f13813U;

    /* renamed from: V */
    private final C5948c f13814V;

    /* renamed from: c */
    private final C5923c f13815c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.item.a$a */
    /* compiled from: View.kt */
    public static final class C5978a implements OnLayoutChangeListener {
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            boolean z = true;
            if (!view.canScrollVertically(-1) && !view.canScrollVertically(1)) {
                z = false;
            }
            view.setFocusable(z);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.item.a$b */
    /* compiled from: AssetDetailsViewItem.kt */
    static final class C5979b extends C12881k implements C12853n<DetailSection, CharSequence, CharSequence, C13145v> {

        /* renamed from: c */
        public static final C5979b f13816c = new C5979b();

        C5979b() {
            super(3);
        }

        /* renamed from: a */
        public final void mo17935a(DetailSection detailSection, CharSequence charSequence, CharSequence charSequence2) {
            detailSection.mo17929a(charSequence, charSequence2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo17935a((DetailSection) obj, (CharSequence) obj2, (CharSequence) obj3);
            return C13145v.f29587a;
        }
    }

    public C5977a(C5923c cVar, C3572r0 r0Var, C5948c cVar2) {
        this.f13815c = cVar;
        this.f13813U = r0Var;
        this.f13814V = cVar2;
    }

    /* renamed from: a */
    private final void m19154a(DetailSection detailSection, CharSequence charSequence, CharSequence charSequence2) {
        if (detailSection != null) {
            C4127b0.m14131b(detailSection, true ^ (charSequence2 == null || charSequence2.length() == 0));
        }
        C5884x.m18948a(detailSection, charSequence, charSequence2, (C12853n<? super T1, ? super T2, ? super T3, ? extends R>) C5979b.f13816c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f13814V, (java.lang.Object) r3.f13814V) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.common.item.C5977a
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.detail.common.item.a r3 = (com.bamtechmedia.dominguez.detail.common.item.C5977a) r3
            com.bamtechmedia.dominguez.detail.common.e0.c r0 = r2.f13815c
            com.bamtechmedia.dominguez.detail.common.e0.c r1 = r3.f13815c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.config.r0 r0 = r2.f13813U
            com.bamtechmedia.dominguez.config.r0 r1 = r3.f13813U
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.detail.common.g0.c r0 = r2.f13814V
            com.bamtechmedia.dominguez.detail.common.g0.c r3 = r3.f13814V
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.item.C5977a.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C7312f.browsable_details_item;
    }

    public int hashCode() {
        C5923c cVar = this.f13815c;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C3572r0 r0Var = this.f13813U;
        int hashCode2 = (hashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31;
        C5948c cVar2 = this.f13814V;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return eVar instanceof C5977a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssetDetailsViewItem(metadata=");
        sb.append(this.f13815c);
        sb.append(", dictionary=");
        sb.append(this.f13813U);
        sb.append(", config=");
        sb.append(this.f13814V);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        TextView textView = (TextView) bVar.mo20994a().findViewById(C7310d.browsable_details_item_title);
        C12880j.m40222a((Object) textView, "browsable_details_item_title");
        textView.setText(this.f13815c.mo17835k());
        TextView textView2 = (TextView) bVar.mo20994a().findViewById(C7310d.browsable_details_item_description);
        C12880j.m40222a((Object) textView2, "browsable_details_item_description");
        textView2.setText(this.f13815c.mo17826d());
        m19154a((DetailSection) bVar.mo20994a().findViewById(C7310d.browsable_details_section_duration), C3573a.m12035a(this.f13813U, C7313g.detail_duration, (Map) null, 2, (Object) null), this.f13815c.mo17829f());
        m19154a((DetailSection) bVar.mo20994a().findViewById(C7310d.browsable_details_section_release_date), C3573a.m12035a(this.f13813U, C7313g.detail_release_date, (Map) null, 2, (Object) null), this.f13815c.mo17834j());
        m19154a((DetailSection) bVar.mo20994a().findViewById(C7310d.browsable_details_section_genre), C3573a.m12035a(this.f13813U, C7313g.detail_genre, (Map) null, 2, (Object) null), this.f13815c.mo17831h());
        m19154a((DetailSection) bVar.mo20994a().findViewById(C7310d.browsable_details_section_rating), C3573a.m12035a(this.f13813U, C7313g.detail_rating, (Map) null, 2, (Object) null), this.f13815c.mo17833i());
        m19154a((DetailSection) bVar.mo20994a().findViewById(C7310d.browsable_details_section_formats), C3573a.m12035a(this.f13813U, C7313g.detail_formats, (Map) null, 2, (Object) null), this.f13814V.mo17876e() ? this.f13815c.mo17823a() : null);
        m19154a((DetailSection) bVar.mo20994a().findViewById(C7310d.browsable_details_section_director), C3573a.m12035a(this.f13813U, C7313g.detail_director, (Map) null, 2, (Object) null), this.f13815c.mo17827e());
        m19154a((DetailSection) bVar.mo20994a().findViewById(C7310d.browsable_details_section_creators), C3573a.m12035a(this.f13813U, C7313g.detail_creator, (Map) null, 2, (Object) null), this.f13815c.mo17825c());
        m19154a((DetailSection) bVar.mo20994a().findViewById(C7310d.browsable_details_section_cast), C3573a.m12035a(this.f13813U, C7313g.detail_starring, (Map) null, 2, (Object) null), C13199w.m40559a(this.f13815c.mo17824b(), "\n", null, null, 0, null, null, 62, null));
        ScrollView scrollView = (ScrollView) bVar.mo20994a().findViewById(C7310d.browsable_details_item_scroll_container);
        if (scrollView == null) {
            return;
        }
        if (!C4187x.m14340E(scrollView) || scrollView.isLayoutRequested()) {
            scrollView.addOnLayoutChangeListener(new C5978a());
            return;
        }
        boolean z = true;
        if (!scrollView.canScrollVertically(-1) && !scrollView.canScrollVertically(1)) {
            z = false;
        }
        scrollView.setFocusable(z);
    }
}
