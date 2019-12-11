package com.bamtechmedia.dominguez.core.content.containers;

import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/containers/Container;", "", "type", "Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;", "set", "Lcom/bamtechmedia/dominguez/core/content/sets/DmcSet;", "(Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;Lcom/bamtechmedia/dominguez/core/content/sets/DmcSet;)V", "getSet", "()Lcom/bamtechmedia/dominguez/core/content/sets/DmcSet;", "getType", "()Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: ContainerModels.kt */
public final class Container {

    /* renamed from: a */
    private final ContainerType f9224a;

    /* renamed from: b */
    private final C3778h f9225b;

    public Container(ContainerType containerType, C3778h hVar) {
        this.f9224a = containerType;
        this.f9225b = hVar;
    }

    /* renamed from: a */
    public static /* synthetic */ Container m12527a(Container container, ContainerType containerType, C3778h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            containerType = container.f9224a;
        }
        if ((i & 2) != 0) {
            hVar = container.f9225b;
        }
        return container.mo13399a(containerType, hVar);
    }

    /* renamed from: a */
    public final Container mo13399a(ContainerType containerType, C3778h hVar) {
        return new Container(containerType, hVar);
    }

    /* renamed from: a */
    public final C3778h mo13400a() {
        return this.f9225b;
    }

    /* renamed from: b */
    public final ContainerType mo13401b() {
        return this.f9224a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9225b, (java.lang.Object) r3.f9225b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.containers.Container
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.containers.Container r3 = (com.bamtechmedia.dominguez.core.content.containers.Container) r3
            com.bamtechmedia.dominguez.core.content.containers.ContainerType r0 = r2.f9224a
            com.bamtechmedia.dominguez.core.content.containers.ContainerType r1 = r3.f9224a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.sets.h r0 = r2.f9225b
            com.bamtechmedia.dominguez.core.content.sets.h r3 = r3.f9225b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.containers.Container.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ContainerType containerType = this.f9224a;
        int i = 0;
        int hashCode = (containerType != null ? containerType.hashCode() : 0) * 31;
        C3778h hVar = this.f9225b;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Container(type=");
        sb.append(this.f9224a);
        sb.append(", set=");
        sb.append(this.f9225b);
        sb.append(")");
        return sb.toString();
    }
}
