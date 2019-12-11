package com.bamtechmedia.dominguez.core.recycler;

import java.util.List;

/* renamed from: com.bamtechmedia.dominguez.core.recycler.a */
/* compiled from: ChangePayload.kt */
public final class C5811a<T> {

    /* renamed from: a */
    private final List<T> f13603a;

    public C5811a(List<? extends T> list) {
        this.f13603a = list;
    }

    /* renamed from: a */
    public final List<T> mo17723a() {
        return this.f13603a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f13603a, (java.lang.Object) ((com.bamtechmedia.dominguez.core.recycler.C5811a) r2).f13603a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.recycler.C5811a
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.recycler.a r2 = (com.bamtechmedia.dominguez.core.recycler.C5811a) r2
            java.util.List<T> r0 = r1.f13603a
            java.util.List<T> r2 = r2.f13603a
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.recycler.C5811a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<T> list = this.f13603a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangePayload(changedElements=");
        sb.append(this.f13603a);
        sb.append(")");
        return sb.toString();
    }
}
