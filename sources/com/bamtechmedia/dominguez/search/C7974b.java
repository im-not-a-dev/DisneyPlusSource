package com.bamtechmedia.dominguez.search;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: com.bamtechmedia.dominguez.search.b */
/* compiled from: CollectionTitleItem.kt */
public final class C7974b extends C11866a {

    /* renamed from: c */
    private final String f17139c;

    public C7974b(String str) {
        super(1);
        this.f17139c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17139c, (java.lang.Object) ((com.bamtechmedia.dominguez.search.C7974b) r2).f17139c) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.search.C7974b
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.search.b r2 = (com.bamtechmedia.dominguez.search.C7974b) r2
            java.lang.String r0 = r1.f17139c
            java.lang.String r2 = r2.f17139c
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.C7974b.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C8050p.collection_title_item;
    }

    public int hashCode() {
        String str = this.f17139c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionTitleItem(title=");
        sb.append(this.f17139c);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        TextView textView = (TextView) bVar.mo20994a().findViewById(C8048n.collectionTitle);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "viewHolder.collectionTitle");
        textView.setText(this.f17139c);
    }
}
