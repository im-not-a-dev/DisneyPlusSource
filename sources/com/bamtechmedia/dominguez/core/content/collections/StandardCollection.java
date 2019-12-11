package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3647r;
import com.bamtechmedia.dominguez.core.content.assets.C3648s;
import com.bamtechmedia.dominguez.core.content.assets.C3650u;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.assets.TextEntry;
import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import com.bamtechmedia.dominguez.core.content.sets.ContentSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003J_\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0001J\u0016\u0010.\u001a\u00020\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016J\u0018\u00102\u001a\u00020\u00012\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0016J\u0010\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0003H\u0016J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\u0010\u0010<\u001a\u0002072\u0006\u00108\u001a\u00020\u001eH\u0016J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0014\u0010$\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u0006>"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/StandardCollection;", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "collectionId", "", "collectionGroup", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionGroup;", "texts", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "containers", "Lcom/bamtechmedia/dominguez/core/content/containers/Container;", "images", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/collections/CollectionGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCollectionGroup", "()Lcom/bamtechmedia/dominguez/core/content/collections/CollectionGroup;", "getCollectionId", "()Ljava/lang/String;", "collectionKey", "getCollectionKey", "getContainers", "()Ljava/util/List;", "contentClass", "getContentClass", "heroCollectionVideo", "getHeroCollectionVideo", "()Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "hiddenAssets", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "getHiddenAssets", "id", "getId", "getImages", "getTexts", "title", "getTitle", "getVideoArt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "copyWithContentSets", "contentSets", "", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "copyWithFilteredAssets", "filterableIds", "copyWithFilteredSet", "setId", "equals", "", "other", "", "hashCode", "", "isSameAs", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Collection.kt */
public final class StandardCollection extends C3658a {

    /* renamed from: U */
    private final CollectionGroup f9187U;

    /* renamed from: V */
    private final List<TextEntry> f9188V;

    /* renamed from: W */
    private final List<Container> f9189W;

    /* renamed from: X */
    private final List<Image> f9190X;

    /* renamed from: Y */
    private final List<C3680n> f9191Y;

    /* renamed from: c */
    private final String f9192c;

    public /* synthetic */ StandardCollection(String str, CollectionGroup collectionGroup, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            list2 = C13185o.m40513a();
        }
        this(str, collectionGroup, list, list2, list3, list4);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry>, for r7v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.core.content.collections.StandardCollection m12444a(com.bamtechmedia.dominguez.core.content.collections.StandardCollection r4, java.lang.String r5, com.bamtechmedia.dominguez.core.content.collections.CollectionGroup r6, java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r7, java.util.List r8, java.util.List r9, java.util.List r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = r4.f9192c
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            com.bamtechmedia.dominguez.core.content.collections.CollectionGroup r6 = r4.f9187U
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r7 = r4.f9188V
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001c
            java.util.List r8 = r4.mo13343O()
        L_0x001c:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0025
            java.util.List r9 = r4.mo12847a()
        L_0x0025:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002e
            java.util.List r10 = r4.mo12839H()
        L_0x002e:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.bamtechmedia.dominguez.core.content.collections.StandardCollection r4 = r6.mo13351a(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.collections.StandardCollection.m12444a(com.bamtechmedia.dominguez.core.content.collections.StandardCollection, java.lang.String, com.bamtechmedia.dominguez.core.content.collections.CollectionGroup, java.util.List, java.util.List, java.util.List, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.core.content.collections.StandardCollection");
    }

    /* renamed from: H */
    public List<C3680n> mo12839H() {
        return this.f9191Y;
    }

    /* renamed from: K */
    public String mo13342K() {
        return this.f9187U.mo13297c();
    }

    /* renamed from: O */
    public List<Container> mo13343O() {
        return this.f9189W;
    }

    /* renamed from: P */
    public String mo13344P() {
        return this.f9187U.mo13296b();
    }

    /* renamed from: Q */
    public C3680n mo13345Q() {
        Object obj;
        List H = mo12839H();
        Object obj2 = null;
        if (H != null) {
            Iterator it = H.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((C3680n) obj).mo13319W(), (Object) "hero_collection")) {
                    break;
                }
            }
            C3680n nVar = (C3680n) obj;
            if (nVar != null) {
                return nVar;
            }
        }
        List H2 = mo12839H();
        if (H2 == null) {
            return null;
        }
        Iterator it2 = H2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.areEqual((Object) ((C3680n) next).mo13319W(), (Object) "full_bleed")) {
                obj2 = next;
                break;
            }
        }
        return (C3680n) obj2;
    }

    /* renamed from: R */
    public List<C3626b> mo13346R() {
        List O = mo13343O();
        ArrayList<Container> arrayList = new ArrayList<>();
        for (Object next : O) {
            Container container = (Container) next;
            if ((container.mo13400a() instanceof ContentSet) && container.mo13400a().mo13674h()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Container a : arrayList) {
            C3778h a2 = a.mo13400a();
            if (a2 != null) {
                C13196t.m40545a((Collection) arrayList2, (Iterable) ((ContentSet) a2).mo13614i());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.sets.ContentSet");
            }
        }
        return arrayList2;
    }

    /* renamed from: S */
    public String mo13347S() {
        return this.f9192c;
    }

    /* renamed from: T */
    public final CollectionGroup mo13348T() {
        return this.f9187U;
    }

    /* renamed from: U */
    public final String mo13349U() {
        return this.f9192c;
    }

    /* renamed from: V */
    public final List<TextEntry> mo13350V() {
        return this.f9188V;
    }

    /* renamed from: a */
    public final StandardCollection mo13351a(String str, CollectionGroup collectionGroup, List<TextEntry> list, List<Container> list2, List<Image> list3, List<? extends C3680n> list4) {
        StandardCollection standardCollection = new StandardCollection(str, collectionGroup, list, list2, list3, list4);
        return standardCollection;
    }

    /* renamed from: a */
    public List<Image> mo12847a() {
        return this.f9190X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo12839H(), (java.lang.Object) r3.mo12839H()) != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0053
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.collections.StandardCollection
            if (r0 == 0) goto L_0x0051
            com.bamtechmedia.dominguez.core.content.collections.StandardCollection r3 = (com.bamtechmedia.dominguez.core.content.collections.StandardCollection) r3
            java.lang.String r0 = r2.f9192c
            java.lang.String r1 = r3.f9192c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0051
            com.bamtechmedia.dominguez.core.content.collections.CollectionGroup r0 = r2.f9187U
            com.bamtechmedia.dominguez.core.content.collections.CollectionGroup r1 = r3.f9187U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0051
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r0 = r2.f9188V
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r1 = r3.f9188V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r2.mo13343O()
            java.util.List r1 = r3.mo13343O()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r2.mo12847a()
            java.util.List r1 = r3.mo12847a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r2.mo12839H()
            java.util.List r3 = r3.mo12839H()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r3 = 0
            return r3
        L_0x0053:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.collections.StandardCollection.equals(java.lang.Object):boolean");
    }

    public String getTitle() {
        return C3650u.m12406a(this.f9188V, C3648s.TITLE, null, C3647r.COLLECTION, 2, null);
    }

    public int hashCode() {
        String str = this.f9192c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        CollectionGroup collectionGroup = this.f9187U;
        int hashCode2 = (hashCode + (collectionGroup != null ? collectionGroup.hashCode() : 0)) * 31;
        List<TextEntry> list = this.f9188V;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List O = mo13343O();
        int hashCode4 = (hashCode3 + (O != null ? O.hashCode() : 0)) * 31;
        List a = mo12847a();
        int hashCode5 = (hashCode4 + (a != null ? a.hashCode() : 0)) * 31;
        List H = mo12839H();
        if (H != null) {
            i = H.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardCollection(collectionId=");
        sb.append(this.f9192c);
        sb.append(", collectionGroup=");
        sb.append(this.f9187U);
        sb.append(", texts=");
        sb.append(this.f9188V);
        sb.append(", containers=");
        sb.append(mo13343O());
        sb.append(", images=");
        sb.append(mo12847a());
        sb.append(", videoArt=");
        sb.append(mo12839H());
        sb.append(")");
        return sb.toString();
    }

    public StandardCollection(String str, CollectionGroup collectionGroup, List<TextEntry> list, List<Container> list2, List<Image> list3, List<? extends C3680n> list4) {
        super(null);
        this.f9192c = str;
        this.f9187U = collectionGroup;
        this.f9188V = list;
        this.f9189W = list2;
        this.f9190X = list3;
        this.f9191Y = list4;
    }

    /* renamed from: a */
    public boolean mo12848a(C3626b bVar) {
        return (bVar instanceof StandardCollection) && Intrinsics.areEqual((Object) ((StandardCollection) bVar).f9192c, (Object) this.f9192c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r17.contains(((com.bamtechmedia.dominguez.core.content.C3687i) r11).mo13175b()) != false) goto L_0x005e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtechmedia.dominguez.core.content.collections.C3658a mo13353a(java.util.List<java.lang.String> r17) {
        /*
            r16 = this;
            java.util.List r0 = r16.mo13343O()
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.p590y.C13187p.m40525a(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r0.next()
            com.bamtechmedia.dominguez.core.content.containers.Container r1 = (com.bamtechmedia.dominguez.core.content.containers.Container) r1
            com.bamtechmedia.dominguez.core.content.sets.h r2 = r1.mo13400a()
            boolean r3 = r2 instanceof com.bamtechmedia.dominguez.core.content.sets.ContentSet
            if (r3 == 0) goto L_0x0076
            r6 = r2
            com.bamtechmedia.dominguez.core.content.sets.ContentSet r6 = (com.bamtechmedia.dominguez.core.content.sets.ContentSet) r6
            r7 = 0
            r8 = 0
            r9 = 0
            java.util.List r2 = r6.mo13614i()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x003a:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()
            r11 = r3
            com.bamtechmedia.dominguez.core.content.assets.b r11 = (com.bamtechmedia.dominguez.core.content.assets.C3626b) r11
            boolean r12 = r11 instanceof com.bamtechmedia.dominguez.core.content.C3687i
            if (r12 == 0) goto L_0x005b
            com.bamtechmedia.dominguez.core.content.i r11 = (com.bamtechmedia.dominguez.core.content.C3687i) r11
            java.lang.String r11 = r11.mo13175b()
            r15 = r17
            boolean r11 = r15.contains(r11)
            if (r11 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005b:
            r15 = r17
        L_0x005d:
            r4 = 0
        L_0x005e:
            if (r4 != 0) goto L_0x003a
            r10.add(r3)
            goto L_0x003a
        L_0x0064:
            r15 = r17
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 119(0x77, float:1.67E-43)
            r2 = 0
            r15 = r2
            com.bamtechmedia.dominguez.core.content.sets.ContentSet r2 = com.bamtechmedia.dominguez.core.content.sets.ContentSet.m12706a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = 0
            com.bamtechmedia.dominguez.core.content.containers.Container r1 = com.bamtechmedia.dominguez.core.content.containers.Container.m12527a(r1, r3, r2, r4, r3)
        L_0x0076:
            r5.add(r1)
            goto L_0x0013
        L_0x007a:
            r6 = 0
            r7 = 0
            r8 = 55
            r9 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r16
            com.bamtechmedia.dominguez.core.content.collections.StandardCollection r0 = m12444a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.collections.StandardCollection.mo13353a(java.util.List):com.bamtechmedia.dominguez.core.content.collections.a");
    }

    /* renamed from: a */
    public C3658a mo13352a(String str) {
        List O = mo13343O();
        ArrayList arrayList = new ArrayList();
        for (Object next : O) {
            if (Intrinsics.areEqual((Object) ((Container) next).mo13400a().mo13608e(), (Object) str)) {
                arrayList.add(next);
            }
        }
        return m12444a(this, null, null, null, arrayList, null, null, 55, null);
    }

    /* renamed from: a */
    public C3658a mo13354a(Set<ContentSet> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) set, 10)), 16));
        for (Object next : set) {
            linkedHashMap.put(((ContentSet) next).mo13608e(), next);
        }
        List<Container> O = mo13343O();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) O, 10));
        for (Container container : O) {
            if (linkedHashMap.containsKey(container.mo13400a().mo13608e())) {
                container = Container.m12527a(container, null, (C3778h) C13173j0.m40359b((Map) linkedHashMap, (Object) container.mo13400a().mo13608e()), 1, null);
            }
            arrayList.add(container);
        }
        return m12444a(this, null, null, null, arrayList, null, null, 55, null);
    }
}
