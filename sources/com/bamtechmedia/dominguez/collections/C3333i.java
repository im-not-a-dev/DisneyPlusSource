package com.bamtechmedia.dominguez.collections;

import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/CollectionFilter;", "", "apply", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "collection", "ContentIdsFilter", "ContentSetFilter", "NoOpFilter", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.i */
/* compiled from: CollectionFilter.kt */
public interface C3333i {

    /* renamed from: com.bamtechmedia.dominguez.collections.i$a */
    /* compiled from: CollectionFilter.kt */
    public static final class C3334a implements C3333i {

        /* renamed from: a */
        private final List<String> f8387a;

        public C3334a(List<String> list) {
            this.f8387a = list;
        }

        /* renamed from: a */
        public C3658a mo12387a(C3658a aVar) {
            if (aVar != null) {
                return aVar.mo13353a(this.f8387a);
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f8387a, (java.lang.Object) ((com.bamtechmedia.dominguez.collections.C3333i.C3334a) r2).f8387a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.collections.C3333i.C3334a
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.collections.i$a r2 = (com.bamtechmedia.dominguez.collections.C3333i.C3334a) r2
                java.util.List<java.lang.String> r0 = r1.f8387a
                java.util.List<java.lang.String> r2 = r2.f8387a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3333i.C3334a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List<String> list = this.f8387a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContentIdsFilter(assetContentIds=");
            sb.append(this.f8387a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.i$b */
    /* compiled from: CollectionFilter.kt */
    public static final class C3335b implements C3333i {

        /* renamed from: a */
        private final String f8388a;

        public C3335b(String str) {
            this.f8388a = str;
        }

        /* renamed from: a */
        public C3658a mo12387a(C3658a aVar) {
            if (aVar != null) {
                return aVar.mo13352a(this.f8388a);
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f8388a, (java.lang.Object) ((com.bamtechmedia.dominguez.collections.C3333i.C3335b) r2).f8388a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.collections.C3333i.C3335b
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.collections.i$b r2 = (com.bamtechmedia.dominguez.collections.C3333i.C3335b) r2
                java.lang.String r0 = r1.f8388a
                java.lang.String r2 = r2.f8388a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3333i.C3335b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f8388a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContentSetFilter(setId=");
            sb.append(this.f8388a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.i$c */
    /* compiled from: CollectionFilter.kt */
    public static final class C3336c implements C3333i {

        /* renamed from: a */
        public static final C3336c f8389a = new C3336c();

        private C3336c() {
        }

        /* renamed from: a */
        public C3658a mo12387a(C3658a aVar) {
            return aVar;
        }
    }

    /* renamed from: a */
    C3658a mo12387a(C3658a aVar);
}
