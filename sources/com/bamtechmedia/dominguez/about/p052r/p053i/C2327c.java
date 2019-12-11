package com.bamtechmedia.dominguez.about.p052r.p053i;

import android.widget.TextView;
import com.bamtechmedia.dominguez.about.C2283n;
import com.bamtechmedia.dominguez.about.C2284o;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: com.bamtechmedia.dominguez.about.r.i.c */
/* compiled from: AboutSectionTitleItem.kt */
public final class C2327c extends C11866a {

    /* renamed from: c */
    private final String f6488c;

    public C2327c(String str) {
        this.f6488c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f6488c, (java.lang.Object) ((com.bamtechmedia.dominguez.about.p052r.p053i.C2327c) r2).f6488c) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.about.p052r.p053i.C2327c
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.about.r.i.c r2 = (com.bamtechmedia.dominguez.about.p052r.p053i.C2327c) r2
            java.lang.String r0 = r1.f6488c
            java.lang.String r2 = r2.f6488c
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.about.p052r.p053i.C2327c.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C2284o.item_about_section;
    }

    public int hashCode() {
        String str = this.f6488c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C2327c) && Intrinsics.areEqual((Object) ((C2327c) eVar).f6488c, (Object) this.f6488c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AboutSectionTitleItem(title=");
        sb.append(this.f6488c);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        TextView textView = (TextView) bVar.mo20994a().findViewById(C2283n.about_section_title);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "viewHolder.about_section_title");
        textView.setText(this.f6488c);
    }
}
