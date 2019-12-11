package com.bamtechmedia.dominguez.detail.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3632f;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import com.bamtechmedia.dominguez.detail.common.C6003u;
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
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0003J\u0017\u0010\u001c\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0001J/\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010 \u001a\u00020\u0013HÖ\u0001J\u0013\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\u0011\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0013H\u0003J\t\u0010&\u001a\u00020\u0013HÖ\u0001J\u0011\u0010'\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0003H\u0001J\t\u0010(\u001a\u00020\u001aH\u0001J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*H\u0003J\u0011\u0010+\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0003H\u0001J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-H\u0001J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-2\u0006\u0010%\u001a\u00020\u0013H\u0001J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0013H\u0001J\t\u00101\u001a\u00020\nHÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00067"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "Lcom/bamtechmedia/dominguez/detail/common/RelatedContent;", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "Landroid/os/Parcelable;", "items", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAsset;", "meta", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "experimentToken", "", "(Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;Ljava/lang/String;)V", "getExperimentToken", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "size", "", "getSize", "()I", "component1", "component2", "component3", "contains", "", "element", "containsAll", "elements", "", "copy", "describeContents", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcRelatedContent.kt */
public final class DmcRelatedContent implements C6003u, List<C3626b>, Parcelable, C12872a {
    public static final Creator CREATOR = new C5987a();

    /* renamed from: U */
    private final DefaultPagingMetaData f13820U;

    /* renamed from: V */
    private final String f13821V;

    /* renamed from: c */
    private final List<C3632f> f13822c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent$a */
    public static class C5987a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((C3632f) parcel.readParcelable(DmcRelatedContent.class.getClassLoader()));
                readInt--;
            }
            return new DmcRelatedContent(arrayList, (DefaultPagingMetaData) parcel.readParcelable(DmcRelatedContent.class.getClassLoader()), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new DmcRelatedContent[i];
        }
    }

    public DmcRelatedContent(List<? extends C3632f> list, DefaultPagingMetaData defaultPagingMetaData, String str) {
        this.f13822c = list;
        this.f13820U = defaultPagingMetaData;
        this.f13821V = str;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.f>, for r1v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent m19171a(com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r0, java.util.List<com.bamtechmedia.dominguez.core.content.assets.C3632f> r1, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r2, java.lang.String r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.f> r1 = r0.f13822c
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000e
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r2 = r0.m19180f0()
        L_0x000e:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0016
            java.lang.String r3 = r0.mo17987a()
        L_0x0016:
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r0 = r0.mo17986a(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent.m19171a(com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent, java.util.List, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData, java.lang.String, int, java.lang.Object):com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent");
    }

    /* renamed from: X */
    public final List<C3632f> mo17984X() {
        return this.f13822c;
    }

    /* renamed from: Y */
    public int mo17985Y() {
        return this.f13822c.size();
    }

    /* renamed from: a */
    public final DmcRelatedContent mo17986a(List<? extends C3632f> list, DefaultPagingMetaData defaultPagingMetaData, String str) {
        return new DmcRelatedContent(list, defaultPagingMetaData, str);
    }

    /* renamed from: a */
    public String mo17987a() {
        return this.f13821V;
    }

    /* renamed from: a */
    public boolean mo17988a(C3626b bVar) {
        return this.f13822c.contains(bVar);
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C3626b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C3626b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo17993b(C3626b bVar) {
        return this.f13822c.indexOf(bVar);
    }

    /* renamed from: c */
    public int mo17994c(C3626b bVar) {
        return this.f13822c.lastIndexOf(bVar);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3626b) {
            return mo17988a((C3626b) obj);
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f13822c.containsAll(collection);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) mo17987a(), (java.lang.Object) r3.mo17987a()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0031
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent
            if (r0 == 0) goto L_0x002f
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r3 = (com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent) r3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.f> r0 = r2.f13822c
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.f> r1 = r3.f13822c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x002f
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r0 = r2.m19180f0()
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r1 = r3.m19180f0()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r2.mo17987a()
            java.lang.String r3 = r3.mo17987a()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            return r3
        L_0x0031:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent.equals(java.lang.Object):boolean");
    }

    public C3626b get(int i) {
        Object obj = this.f13822c.get(i);
        C12880j.m40222a(obj, "get(...)");
        return (C3626b) obj;
    }

    public int hashCode() {
        List<C3632f> list = this.f13822c;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        DefaultPagingMetaData f0 = m19180f0();
        int hashCode2 = (hashCode + (f0 != null ? f0.hashCode() : 0)) * 31;
        String a = mo17987a();
        if (a != null) {
            i = a.hashCode();
        }
        return hashCode2 + i;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3626b) {
            return mo17993b((C3626b) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f13822c.isEmpty();
    }

    public Iterator<C3626b> iterator() {
        return this.f13822c.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3626b) {
            return mo17994c((C3626b) obj);
        }
        return -1;
    }

    public ListIterator<C3626b> listIterator() {
        return this.f13822c.listIterator();
    }

    public ListIterator<C3626b> listIterator(int i) {
        return this.f13822c.listIterator(i);
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

    public void replaceAll(UnaryOperator<C3626b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo17985Y();
    }

    public void sort(Comparator<? super C3626b> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C3626b> subList(int i, int i2) {
        return this.f13822c.subList(i, i2);
    }

    public Object[] toArray() {
        return C12871f.m40215a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12871f.m40216a(this, tArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcRelatedContent(items=");
        sb.append(this.f13822c);
        sb.append(", meta=");
        sb.append(m19180f0());
        sb.append(", experimentToken=");
        sb.append(mo17987a());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        List<C3632f> list = this.f13822c;
        parcel.writeInt(list.size());
        for (C3632f writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeParcelable(this.f13820U, i);
        parcel.writeString(this.f13821V);
    }

    public /* synthetic */ DmcRelatedContent(List list, DefaultPagingMetaData defaultPagingMetaData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            str = null;
        }
        this(list, defaultPagingMetaData, str);
    }

    /* renamed from: f0 */
    public DefaultPagingMetaData m19180f0() {
        return this.f13820U;
    }
}
