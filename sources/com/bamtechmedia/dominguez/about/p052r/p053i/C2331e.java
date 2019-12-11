package com.bamtechmedia.dominguez.about.p052r.p053i;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bamtechmedia.dominguez.about.C2283n;
import com.bamtechmedia.dominguez.about.C2284o;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\b\u0010\u0016\u001a\u00020\rH\u0016J\t\u0010\u0017\u001a\u00020\rHÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/items/core/AboutViewItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "title", "", "value", "clickFunction", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "bind", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getLayout", "hashCode", "isSameAs", "Lcom/xwray/groupie/Item;", "toString", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.r.i.e */
/* compiled from: AboutViewItem.kt */
public final class C2331e extends C11866a {

    /* renamed from: U */
    private final String f6497U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final Function0<C13145v> f6498V;

    /* renamed from: c */
    private final String f6499c;

    /* renamed from: com.bamtechmedia.dominguez.about.r.i.e$a */
    /* compiled from: AboutViewItem.kt */
    static final class C2332a implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C2331e f6500c;

        C2332a(C2331e eVar) {
            this.f6500c = eVar;
        }

        public final void onClick(View view) {
            this.f6500c.f6498V.invoke();
        }
    }

    public /* synthetic */ C2331e(String str, String str2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        this(str, str2, function0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f6498V, (java.lang.Object) r3.f6498V) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.about.p052r.p053i.C2331e
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.about.r.i.e r3 = (com.bamtechmedia.dominguez.about.p052r.p053i.C2331e) r3
            java.lang.String r0 = r2.f6499c
            java.lang.String r1 = r3.f6499c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f6497U
            java.lang.String r1 = r3.f6497U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            kotlin.jvm.functions.Function0<kotlin.v> r0 = r2.f6498V
            kotlin.jvm.functions.Function0<kotlin.v> r3 = r3.f6498V
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.about.p052r.p053i.C2331e.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C2284o.item_about;
    }

    public int hashCode() {
        String str = this.f6499c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6497U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0<C13145v> function0 = this.f6498V;
        if (function0 != null) {
            i = function0.hashCode();
        }
        return hashCode2 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return eVar == this || ((eVar instanceof C2331e) && Intrinsics.areEqual((Object) ((C2331e) eVar).f6499c, (Object) this.f6499c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AboutViewItem(title=");
        sb.append(this.f6499c);
        sb.append(", value=");
        sb.append(this.f6497U);
        sb.append(", clickFunction=");
        sb.append(this.f6498V);
        sb.append(")");
        return sb.toString();
    }

    public C2331e(String str, String str2, Function0<C13145v> function0) {
        this.f6499c = str;
        this.f6497U = str2;
        this.f6498V = function0;
    }

    public void bind(C11867b bVar, int i) {
        TextView textView = (TextView) bVar.mo20994a().findViewById(C2283n.titleAboutTextView);
        String str = "titleAboutTextView";
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, str);
        textView.setText(this.f6499c);
        TextView textView2 = (TextView) bVar.mo20994a().findViewById(C2283n.valueAboutTextView);
        String str2 = "valueAboutTextView";
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, str2);
        textView2.setText(this.f6497U);
        TextView textView3 = (TextView) bVar.mo20994a().findViewById(C2283n.valueAboutTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView3, str2);
        textView3.setVisibility(this.f6497U.length() > 0 ? 0 : 8);
        String str3 = "root";
        if (this.f6498V != null) {
            bVar.mo30014c().setOnClickListener(new C2332a(this));
            TextView textView4 = (TextView) bVar.mo20994a().findViewById(C2283n.titleAboutTextView);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView4, str);
            TextView textView5 = (TextView) bVar.mo20994a().findViewById(C2283n.titleAboutTextView);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView5, str);
            textView4.setPaintFlags(textView5.getPaintFlags() | 8);
        } else {
            bVar.mo30014c().setOnClickListener(null);
            View c = bVar.mo30014c();
            Intrinsics.checkReturnedValueIsNotNull((Object) c, str3);
            c.setClickable(false);
            TextView textView6 = (TextView) bVar.mo20994a().findViewById(C2283n.titleAboutTextView);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView6, str);
            TextView textView7 = (TextView) bVar.mo20994a().findViewById(C2283n.titleAboutTextView);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView7, str);
            textView6.setPaintFlags(textView7.getPaintFlags() & -9);
        }
        View c2 = bVar.mo30014c();
        Intrinsics.checkReturnedValueIsNotNull((Object) c2, str3);
        c2.setFocusable(true);
    }
}
