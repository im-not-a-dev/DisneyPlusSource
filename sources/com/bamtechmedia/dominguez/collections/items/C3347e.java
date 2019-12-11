package com.bamtechmedia.dominguez.collections.items;

import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0016J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016Jh\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/CollectionItemsFactory;", "", "createItems", "", "Lcom/xwray/groupie/Group;", "collection", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "container", "Lcom/bamtechmedia/dominguez/core/content/containers/Container;", "trackExtraMap", "", "", "analyticsValues", "Lcom/bamtechmedia/dominguez/collections/items/CollectionAnalyticsValues;", "containerType", "Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;", "set", "id", "title", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.e */
/* compiled from: CollectionItemsFactory.kt */
public interface C3347e {

    /* renamed from: com.bamtechmedia.dominguez.collections.items.e$a */
    /* compiled from: CollectionItemsFactory.kt */
    public static final class C3348a {
        /* renamed from: a */
        public static /* synthetic */ List m11520a(C3347e eVar, C3658a aVar, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = C13173j0.m40350a();
                }
                return eVar.mo12440a(aVar, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createItems");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
            if (((com.bamtechmedia.dominguez.core.content.sets.ReferenceSet) r4).mo13635j() != com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint.NO_CONTENT) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
            if (r4.isEmpty() == false) goto L_0x0043;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<p163g.p509o.p510a.C11847b> m11519a(com.bamtechmedia.dominguez.collections.items.C3347e r12, com.bamtechmedia.dominguez.core.content.collections.C3658a r13, java.util.Map<java.lang.String, java.lang.String> r14) {
            /*
                java.util.List r0 = r13.mo13343O()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x000d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x004f
                java.lang.Object r2 = r0.next()
                r3 = r2
                com.bamtechmedia.dominguez.core.content.containers.Container r3 = (com.bamtechmedia.dominguez.core.content.containers.Container) r3
                com.bamtechmedia.dominguez.core.content.sets.h r4 = r3.mo13400a()
                boolean r5 = r4 instanceof com.bamtechmedia.dominguez.core.content.sets.ContentSet
                r6 = 1
                r7 = 0
                if (r5 == 0) goto L_0x002d
                boolean r3 = r4.isEmpty()
                if (r3 != 0) goto L_0x002b
                goto L_0x0043
            L_0x002b:
                r6 = 0
                goto L_0x0043
            L_0x002d:
                boolean r5 = r4 instanceof com.bamtechmedia.dominguez.core.content.sets.ReferenceSet
                if (r5 == 0) goto L_0x0049
                com.bamtechmedia.dominguez.core.content.containers.ContainerType r3 = r3.mo13401b()
                com.bamtechmedia.dominguez.core.content.containers.ContainerType r5 = com.bamtechmedia.dominguez.core.content.containers.ContainerType.GridContainer
                if (r3 == r5) goto L_0x002b
                com.bamtechmedia.dominguez.core.content.sets.ReferenceSet r4 = (com.bamtechmedia.dominguez.core.content.sets.ReferenceSet) r4
                com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint r3 = r4.mo13635j()
                com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint r4 = com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint.NO_CONTENT
                if (r3 == r4) goto L_0x002b
            L_0x0043:
                if (r6 == 0) goto L_0x000d
                r1.add(r2)
                goto L_0x000d
            L_0x0049:
                kotlin.l r12 = new kotlin.l
                r12.<init>()
                throw r12
            L_0x004f:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0058:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00a2
                java.lang.Object r2 = r1.next()
                com.bamtechmedia.dominguez.core.content.containers.Container r2 = (com.bamtechmedia.dominguez.core.content.containers.Container) r2
                com.bamtechmedia.dominguez.collections.items.b r11 = new com.bamtechmedia.dominguez.collections.items.b
                java.util.List r3 = r13.mo13343O()
                int r4 = r3.indexOf(r2)
                java.lang.String r5 = r13.mo13347S()
                com.bamtechmedia.dominguez.core.content.sets.h r3 = r2.mo13400a()
                com.bamtechmedia.dominguez.core.content.sets.ContentSetType r6 = r3.mo13604b()
                java.lang.String r7 = r13.mo13344P()
                com.bamtechmedia.dominguez.core.content.sets.h r3 = r2.mo13400a()
                java.lang.String r8 = r3.mo13608e()
                com.bamtechmedia.dominguez.core.content.sets.h r3 = r2.mo13400a()
                java.lang.String r9 = r3.mo13606c()
                com.bamtechmedia.dominguez.core.content.sets.h r3 = r2.mo13400a()
                java.lang.String r10 = r3.mo13601a()
                r3 = r11
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                java.util.List r2 = r12.mo12439a(r13, r2, r14, r11)
                kotlin.p590y.C13196t.m40545a(r0, r2)
                goto L_0x0058
            L_0x00a2:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3347e.C3348a.m11519a(com.bamtechmedia.dominguez.collections.items.e, com.bamtechmedia.dominguez.core.content.collections.a, java.util.Map):java.util.List");
        }

        /* renamed from: a */
        public static List<C11847b> m11518a(C3347e eVar, C3658a aVar, Container container, Map<String, String> map, C3343b bVar) {
            return eVar.mo12441a(aVar.mo13344P(), container.mo13401b(), container.mo13400a().mo13606c(), container.mo13400a().mo13608e(), container.mo13400a().mo13611g(), container.mo13400a(), bVar, map);
        }

        /* renamed from: a */
        public static /* synthetic */ List m11521a(C3347e eVar, String str, ContainerType containerType, String str2, String str3, String str4, C3700c cVar, C3343b bVar, Map map, int i, Object obj) {
            C3343b bVar2;
            int i2 = i;
            if (obj == null) {
                String str5 = (i2 & 16) != 0 ? null : str4;
                if ((i2 & 64) != 0) {
                    C3343b bVar3 = new C3343b(0, null, null, null, null, null, null, 127, null);
                    bVar2 = bVar3;
                } else {
                    bVar2 = bVar;
                }
                return eVar.mo12441a(str, containerType, str2, str3, str5, cVar, bVar2, (i2 & 128) != 0 ? C13173j0.m40350a() : map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createItems");
        }
    }

    /* renamed from: a */
    List<C11847b> mo12439a(C3658a aVar, Container container, Map<String, String> map, C3343b bVar);

    /* renamed from: a */
    List<C11847b> mo12440a(C3658a aVar, Map<String, String> map);

    /* renamed from: a */
    List<C11847b> mo12441a(String str, ContainerType containerType, String str2, String str3, String str4, C3700c<? extends C3626b> cVar, C3343b bVar, Map<String, String> map);
}
