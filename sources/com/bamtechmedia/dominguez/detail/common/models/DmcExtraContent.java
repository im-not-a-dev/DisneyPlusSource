package com.bamtechmedia.dominguez.detail.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3686h;
import com.bamtechmedia.dominguez.core.content.assets.DmcExtra;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import com.bamtechmedia.dominguez.detail.common.C5982j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.p589f0.C12872a;
import p163g.p500m.p501a.C11733i;

@C11733i(generateAdapter = true)
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0003J\u0017\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0001J#\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u001b\u001a\u00020\rHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\u0011\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\rH\u0003J\t\u0010!\u001a\u00020\rHÖ\u0001J\u0011\u0010\"\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0003H\u0001J\t\u0010#\u001a\u00020\u0015H\u0001J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0003J\u0011\u0010&\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0003H\u0001J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030(H\u0001J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u0006\u0010 \u001a\u00020\rH\u0001J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0001J\t\u0010,\u001a\u00020-HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u00063"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "", "Lcom/bamtechmedia/dominguez/core/content/Extra;", "Landroid/os/Parcelable;", "videos", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcExtra;", "meta", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "(Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;)V", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "size", "", "getSize", "()I", "getVideos", "()Ljava/util/List;", "component1", "component2", "contains", "", "element", "containsAll", "elements", "", "copy", "describeContents", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcExtraContent.kt */
public final class DmcExtraContent implements C5982j, List<C3686h>, Parcelable, C12872a {
    public static final Creator CREATOR = new C5986a();

    /* renamed from: U */
    private final DefaultPagingMetaData f13817U;

    /* renamed from: c */
    private final List<DmcExtra> f13818c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent$a */
    public static class C5986a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((DmcExtra) parcel.readParcelable(DmcExtraContent.class.getClassLoader()));
                readInt--;
            }
            return new DmcExtraContent(arrayList, (DefaultPagingMetaData) parcel.readParcelable(DmcExtraContent.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new DmcExtraContent[i];
        }
    }

    public DmcExtraContent(List<DmcExtra> list, DefaultPagingMetaData defaultPagingMetaData) {
        this.f13818c = list;
        this.f13817U = defaultPagingMetaData;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcExtra>, for r1v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent m19159a(com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r0, java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcExtra> r1, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcExtra> r1 = r0.f13818c
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000e
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r2 = r0.m19167f0()
        L_0x000e:
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r0 = r0.mo17939a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent.m19159a(com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent, java.util.List, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData, int, java.lang.Object):com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent");
    }

    /* renamed from: X */
    public int mo17937X() {
        return this.f13818c.size();
    }

    /* renamed from: Y */
    public final List<DmcExtra> mo17938Y() {
        return this.f13818c;
    }

    /* renamed from: a */
    public final DmcExtraContent mo17939a(List<DmcExtra> list, DefaultPagingMetaData defaultPagingMetaData) {
        return new DmcExtraContent(list, defaultPagingMetaData);
    }

    /* renamed from: a */
    public boolean mo17940a(C3686h hVar) {
        return this.f13818c.contains(hVar);
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C3686h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C3686h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo17945b(C3686h hVar) {
        return this.f13818c.indexOf(hVar);
    }

    /* renamed from: c */
    public int mo17946c(C3686h hVar) {
        return this.f13818c.lastIndexOf(hVar);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3686h) {
            return mo17940a((C3686h) obj);
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f13818c.containsAll(collection);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) mo13457f0(), (java.lang.Object) r3.mo13457f0()) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0023
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r3 = (com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent) r3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcExtra> r0 = r2.f13818c
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcExtra> r1 = r3.f13818c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r0 = r2.m19167f0()
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r3 = r3.m19167f0()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            return r3
        L_0x0023:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent.equals(java.lang.Object):boolean");
    }

    public C3686h get(int i) {
        Object obj = this.f13818c.get(i);
        C12880j.m40222a(obj, "get(...)");
        return (C3686h) obj;
    }

    public int hashCode() {
        List<DmcExtra> list = this.f13818c;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        DefaultPagingMetaData f0 = m19167f0();
        if (f0 != null) {
            i = f0.hashCode();
        }
        return hashCode + i;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3686h) {
            return mo17945b((C3686h) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f13818c.isEmpty();
    }

    public Iterator<C3686h> iterator() {
        return this.f13818c.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3686h) {
            return mo17946c((C3686h) obj);
        }
        return -1;
    }

    public ListIterator<C3686h> listIterator() {
        return this.f13818c.listIterator();
    }

    public ListIterator<C3686h> listIterator(int i) {
        return this.f13818c.listIterator(i);
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C3686h> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo17937X();
    }

    public void sort(Comparator<? super C3686h> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C3686h> subList(int i, int i2) {
        return this.f13818c.subList(i, i2);
    }

    public Object[] toArray() {
        return C12871f.m40215a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12871f.m40216a(this, tArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcExtraContent(videos=");
        sb.append(this.f13818c);
        sb.append(", meta=");
        sb.append(m19167f0());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        List<DmcExtra> list = this.f13818c;
        parcel.writeInt(list.size());
        for (DmcExtra writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeParcelable(this.f13817U, i);
    }

    /* renamed from: f0 */
    public DefaultPagingMetaData m19167f0() {
        return this.f13817U;
    }
}
