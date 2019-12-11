package com.bamtechmedia.dominguez.collections;

import androidx.lifecycle.C0741y;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/ShelfItemSession;", "Landroidx/lifecycle/ViewModel;", "Lcom/bamtechmedia/dominguez/collections/HeroAutoPagingSession;", "()V", "collectionFocusItem", "Lcom/bamtechmedia/dominguez/collections/ShelfItemSession$CollectionFocusItem;", "getCollectionFocusItem", "()Lcom/bamtechmedia/dominguez/collections/ShelfItemSession$CollectionFocusItem;", "setCollectionFocusItem", "(Lcom/bamtechmedia/dominguez/collections/ShelfItemSession$CollectionFocusItem;)V", "heroAutoPagingEnabled", "", "getHeroAutoPagingEnabled", "()Z", "setHeroAutoPagingEnabled", "(Z)V", "heroAutoPagingStoppedByUser", "getHeroAutoPagingStoppedByUser", "setHeroAutoPagingStoppedByUser", "idGenerator", "", "shelfItemPositions", "", "", "Lcom/bamtechmedia/dominguez/collections/ShelfItemSession$ShelfPosition;", "getShelfItemPositions", "()Ljava/util/Map;", "stableIds", "stableId", "shelfId", "CollectionFocusItem", "ShelfPosition", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.k0 */
/* compiled from: ShelfItemSession.kt */
public final class C3416k0 extends C0741y implements C3323f0 {

    /* renamed from: U */
    private C3417a f8637U;

    /* renamed from: V */
    private final Map<String, Long> f8638V = new LinkedHashMap();

    /* renamed from: W */
    private long f8639W = 1;

    /* renamed from: X */
    private boolean f8640X = true;

    /* renamed from: Y */
    private boolean f8641Y;

    /* renamed from: c */
    private final Map<String, C3418b> f8642c = new LinkedHashMap();

    /* renamed from: com.bamtechmedia.dominguez.collections.k0$a */
    /* compiled from: ShelfItemSession.kt */
    public static final class C3417a {

        /* renamed from: a */
        private final String f8643a;

        /* renamed from: b */
        private final C3626b f8644b;

        public C3417a(String str, C3626b bVar) {
            this.f8643a = str;
            this.f8644b = bVar;
        }

        /* renamed from: a */
        public final C3626b mo12583a() {
            return this.f8644b;
        }

        /* renamed from: b */
        public final String mo12584b() {
            return this.f8643a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f8644b, (java.lang.Object) r3.f8644b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.collections.C3416k0.C3417a
                if (r0 == 0) goto L_0x001d
                com.bamtechmedia.dominguez.collections.k0$a r3 = (com.bamtechmedia.dominguez.collections.C3416k0.C3417a) r3
                java.lang.String r0 = r2.f8643a
                java.lang.String r1 = r3.f8643a
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.bamtechmedia.dominguez.core.content.assets.b r0 = r2.f8644b
                com.bamtechmedia.dominguez.core.content.assets.b r3 = r3.f8644b
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3416k0.C3417a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f8643a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C3626b bVar = this.f8644b;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollectionFocusItem(shelfId=");
            sb.append(this.f8643a);
            sb.append(", asset=");
            sb.append(this.f8644b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.k0$b */
    /* compiled from: ShelfItemSession.kt */
    public static final class C3418b {

        /* renamed from: a */
        private final int f8645a;

        /* renamed from: b */
        private final Integer f8646b;

        public C3418b(int i, Integer num) {
            this.f8645a = i;
            this.f8646b = num;
        }

        /* renamed from: a */
        public final Integer mo12588a() {
            return this.f8646b;
        }

        /* renamed from: b */
        public final int mo12589b() {
            return this.f8645a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3418b) {
                    C3418b bVar = (C3418b) obj;
                    if (!(this.f8645a == bVar.f8645a) || !Intrinsics.areEqual((Object) this.f8646b, (Object) bVar.f8646b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f8645a * 31;
            Integer num = this.f8646b;
            return i + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShelfPosition(position=");
            sb.append(this.f8645a);
            sb.append(", offset=");
            sb.append(this.f8646b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public void mo12580a(C3417a aVar) {
        this.f8637U = aVar;
    }

    /* renamed from: b */
    public final long mo12581b(String str) {
        Map<String, Long> map = this.f8638V;
        Object obj = map.get(str);
        if (obj == null) {
            long j = this.f8639W;
            this.f8639W = 1 + j;
            obj = Long.valueOf(j);
            map.put(str, obj);
        }
        return ((Number) obj).longValue();
    }

    /* renamed from: c */
    public void mo12377c(boolean z) {
        this.f8640X = z;
    }

    /* renamed from: t */
    public C3417a mo12378t() {
        return this.f8637U;
    }

    /* renamed from: v */
    public boolean mo12379v() {
        return this.f8640X;
    }

    /* renamed from: w */
    public boolean mo12380w() {
        return this.f8641Y;
    }

    /* renamed from: y */
    public final Map<String, C3418b> mo12582y() {
        return this.f8642c;
    }

    /* renamed from: a */
    public void mo12376a(boolean z) {
        this.f8641Y = z;
    }
}
