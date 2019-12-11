package com.bamtechmedia.dominguez.collections.items;

import p163g.p201e.p202a.C5364g;

/* renamed from: com.bamtechmedia.dominguez.collections.items.a0 */
/* compiled from: ShelfNoSnapItem.kt */
public final class C3342a0 extends C3384s {

    /* renamed from: Y */
    private final C3392v f8408Y;

    public C3342a0(C3392v vVar) {
        super(vVar);
        this.f8408Y = vVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f8408Y, (java.lang.Object) ((com.bamtechmedia.dominguez.collections.items.C3342a0) r2).f8408Y) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.collections.items.C3342a0
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.collections.items.a0 r2 = (com.bamtechmedia.dominguez.collections.items.C3342a0) r2
            com.bamtechmedia.dominguez.collections.items.v r0 = r1.f8408Y
            com.bamtechmedia.dominguez.collections.items.v r2 = r2.f8408Y
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3342a0.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C5364g.shelf_item_no_snap;
    }

    public int hashCode() {
        C3392v vVar = this.f8408Y;
        if (vVar != null) {
            return vVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShelfNoSnapItem(parameters=");
        sb.append(this.f8408Y);
        sb.append(")");
        return sb.toString();
    }
}
