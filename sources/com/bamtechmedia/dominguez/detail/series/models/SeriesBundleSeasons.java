package com.bamtechmedia.dominguez.detail.series.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3789t;
import com.bamtechmedia.dominguez.core.content.assets.DmcSeason;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
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
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0003J\u0017\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0001J#\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u001b\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\u0011\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000fH\u0003J\t\u0010!\u001a\u00020\u000fHÖ\u0001J\u0011\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0004H\u0001J\t\u0010#\u001a\u00020\u0015H\u0001J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0003J\u0011\u0010&\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0004H\u0001J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(H\u0001J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(2\u0006\u0010 \u001a\u00020\u000fH\u0001J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000fH\u0001J\t\u0010,\u001a\u00020-HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00063"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleSeasons;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/detail/series/models/PagedSeasons;", "", "Lcom/bamtechmedia/dominguez/core/content/Season;", "seasons", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeason;", "meta", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "(Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;)V", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "getSeasons", "()Ljava/util/List;", "size", "", "getSize", "()I", "component1", "component2", "contains", "", "element", "containsAll", "elements", "", "copy", "describeContents", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SeriesDetailModels.kt */
public final class SeriesBundleSeasons implements Parcelable, C6045c, List<C3789t>, C12872a {
    public static final Creator CREATOR = new C6041a();

    /* renamed from: U */
    private final DefaultPagingMetaData f13923U;

    /* renamed from: c */
    private final List<DmcSeason> f13924c;

    /* renamed from: com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons$a */
    public static class C6041a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((DmcSeason) parcel.readParcelable(SeriesBundleSeasons.class.getClassLoader()));
                readInt--;
            }
            return new SeriesBundleSeasons(arrayList, (DefaultPagingMetaData) parcel.readParcelable(SeriesBundleSeasons.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new SeriesBundleSeasons[i];
        }
    }

    public SeriesBundleSeasons(List<DmcSeason> list, DefaultPagingMetaData defaultPagingMetaData) {
        this.f13924c = list;
        this.f13923U = defaultPagingMetaData;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcSeason>, for r1v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons m19350a(com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons r0, java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcSeason> r1, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcSeason> r1 = r0.f13924c
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000e
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r2 = r0.m19358f0()
        L_0x000e:
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons r0 = r0.mo18243a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons.m19350a(com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons, java.util.List, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData, int, java.lang.Object):com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons");
    }

    /* renamed from: X */
    public final List<DmcSeason> mo18241X() {
        return this.f13924c;
    }

    /* renamed from: Y */
    public int mo18242Y() {
        return this.f13924c.size();
    }

    /* renamed from: a */
    public final SeriesBundleSeasons mo18243a(List<DmcSeason> list, DefaultPagingMetaData defaultPagingMetaData) {
        return new SeriesBundleSeasons(list, defaultPagingMetaData);
    }

    /* renamed from: a */
    public boolean mo18244a(C3789t tVar) {
        return this.f13924c.contains(tVar);
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C3789t> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C3789t> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo18249b(C3789t tVar) {
        return this.f13924c.indexOf(tVar);
    }

    /* renamed from: c */
    public int mo18250c(C3789t tVar) {
        return this.f13924c.lastIndexOf(tVar);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3789t) {
            return mo18244a((C3789t) obj);
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f13924c.containsAll(collection);
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
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons r3 = (com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons) r3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcSeason> r0 = r2.f13924c
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcSeason> r1 = r3.f13924c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r0 = r2.m19358f0()
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r3 = r3.m19358f0()
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons.equals(java.lang.Object):boolean");
    }

    public C3789t get(int i) {
        Object obj = this.f13924c.get(i);
        C12880j.m40222a(obj, "get(...)");
        return (C3789t) obj;
    }

    public int hashCode() {
        List<DmcSeason> list = this.f13924c;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        DefaultPagingMetaData f0 = m19358f0();
        if (f0 != null) {
            i = f0.hashCode();
        }
        return hashCode + i;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3789t) {
            return mo18249b((C3789t) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f13924c.isEmpty();
    }

    public Iterator<C3789t> iterator() {
        return this.f13924c.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3789t) {
            return mo18250c((C3789t) obj);
        }
        return -1;
    }

    public ListIterator<C3789t> listIterator() {
        return this.f13924c.listIterator();
    }

    public ListIterator<C3789t> listIterator(int i) {
        return this.f13924c.listIterator(i);
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

    public void replaceAll(UnaryOperator<C3789t> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo18242Y();
    }

    public void sort(Comparator<? super C3789t> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C3789t> subList(int i, int i2) {
        return this.f13924c.subList(i, i2);
    }

    public Object[] toArray() {
        return C12871f.m40215a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12871f.m40216a(this, tArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeriesBundleSeasons(seasons=");
        sb.append(this.f13924c);
        sb.append(", meta=");
        sb.append(m19358f0());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        List<DmcSeason> list = this.f13924c;
        parcel.writeInt(list.size());
        for (DmcSeason writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeParcelable(this.f13923U, i);
    }

    /* renamed from: f0 */
    public DefaultPagingMetaData m19358f0() {
        return this.f13923U;
    }
}
