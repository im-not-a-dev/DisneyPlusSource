package com.bamtechmedia.dominguez.detail.series.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.assets.DmcEpisode;
import com.bamtechmedia.dominguez.core.content.paging.C3703f;
import com.bamtechmedia.dominguez.core.content.paging.EpisodePagingMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p589f0.C12872a;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@C11733i(generateAdapter = true)
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0003J\u0017\u0010\u001b\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0001J%\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u001f\u001a\u00020\u0011HÖ\u0001J\u0013\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\u0011\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0011H\u0003J\t\u0010%\u001a\u00020\u0011HÖ\u0001J\u0011\u0010&\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0004H\u0001J\t\u0010'\u001a\u00020\u0019H\u0001J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)H\u0003J\u0011\u0010*\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0004H\u0001J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040,H\u0001J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040,2\u0006\u0010$\u001a\u00020\u0011H\u0001J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0011H\u0001J\t\u00100\u001a\u000201HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00067"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/detail/series/models/PagedEpisodes;", "", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "videos", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcEpisode;", "episodePagingMeta", "Lcom/bamtechmedia/dominguez/core/content/paging/EpisodePagingMetaData;", "(Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/paging/EpisodePagingMetaData;)V", "getEpisodePagingMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/EpisodePagingMetaData;", "meta", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingMetaData;", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/PagingMetaData;", "size", "", "getSize", "()I", "getVideos", "()Ljava/util/List;", "component1", "component2", "contains", "", "element", "containsAll", "elements", "", "copy", "describeContents", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SeriesDetailModels.kt */
public final class SeriesBundleEpisodes implements Parcelable, C6044b, List<C3685g>, C12872a {
    public static final Creator CREATOR = new C6040a();

    /* renamed from: U */
    private final EpisodePagingMetaData f13921U;

    /* renamed from: c */
    private final List<DmcEpisode> f13922c;

    /* renamed from: com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes$a */
    public static class C6040a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((DmcEpisode) parcel.readParcelable(SeriesBundleEpisodes.class.getClassLoader()));
                readInt--;
            }
            return new SeriesBundleEpisodes(arrayList, (EpisodePagingMetaData) parcel.readParcelable(SeriesBundleEpisodes.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new SeriesBundleEpisodes[i];
        }
    }

    public SeriesBundleEpisodes(List<DmcEpisode> list, @C11724g(name = "meta") EpisodePagingMetaData episodePagingMetaData) {
        this.f13922c = list;
        this.f13921U = episodePagingMetaData;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcEpisode>, for r1v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes m19341a(com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r0, java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcEpisode> r1, com.bamtechmedia.dominguez.core.content.paging.EpisodePagingMetaData r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcEpisode> r1 = r0.f13922c
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            com.bamtechmedia.dominguez.core.content.paging.EpisodePagingMetaData r2 = r0.f13921U
        L_0x000c:
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes.m19341a(com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes, java.util.List, com.bamtechmedia.dominguez.core.content.paging.EpisodePagingMetaData, int, java.lang.Object):com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes");
    }

    /* renamed from: X */
    public final EpisodePagingMetaData mo18200X() {
        return this.f13921U;
    }

    /* renamed from: Y */
    public int mo18201Y() {
        return this.f13922c.size();
    }

    /* renamed from: Z */
    public final List<DmcEpisode> mo18202Z() {
        return this.f13922c;
    }

    /* renamed from: a */
    public boolean mo18203a(C3685g gVar) {
        return this.f13922c.contains(gVar);
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C3685g> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C3685g> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo18208b(C3685g gVar) {
        return this.f13922c.indexOf(gVar);
    }

    /* renamed from: c */
    public int mo18209c(C3685g gVar) {
        return this.f13922c.lastIndexOf(gVar);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3685g) {
            return mo18203a((C3685g) obj);
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f13922c.containsAll(collection);
    }

    public final SeriesBundleEpisodes copy(List<DmcEpisode> list, @C11724g(name = "meta") EpisodePagingMetaData episodePagingMetaData) {
        return new SeriesBundleEpisodes(list, episodePagingMetaData);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13921U, (java.lang.Object) r3.f13921U) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r3 = (com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes) r3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcEpisode> r0 = r2.f13922c
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcEpisode> r1 = r3.f13922c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.paging.EpisodePagingMetaData r0 = r2.f13921U
            com.bamtechmedia.dominguez.core.content.paging.EpisodePagingMetaData r3 = r3.f13921U
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes.equals(java.lang.Object):boolean");
    }

    /* renamed from: f0 */
    public C3703f mo13457f0() {
        EpisodePagingMetaData episodePagingMetaData = this.f13921U;
        return episodePagingMetaData != null ? episodePagingMetaData : C6047e.f13933b;
    }

    public C3685g get(int i) {
        Object obj = this.f13922c.get(i);
        Intrinsics.checkReturnedValueIsNotNull(obj, "get(...)");
        return (C3685g) obj;
    }

    public int hashCode() {
        List<DmcEpisode> list = this.f13922c;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        EpisodePagingMetaData episodePagingMetaData = this.f13921U;
        if (episodePagingMetaData != null) {
            i = episodePagingMetaData.hashCode();
        }
        return hashCode + i;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3685g) {
            return mo18208b((C3685g) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f13922c.isEmpty();
    }

    public Iterator<C3685g> iterator() {
        return this.f13922c.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3685g) {
            return mo18209c((C3685g) obj);
        }
        return -1;
    }

    public ListIterator<C3685g> listIterator() {
        return this.f13922c.listIterator();
    }

    public ListIterator<C3685g> listIterator(int i) {
        return this.f13922c.listIterator(i);
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

    public void replaceAll(UnaryOperator<C3685g> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo18201Y();
    }

    public void sort(Comparator<? super C3685g> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C3685g> subList(int i, int i2) {
        return this.f13922c.subList(i, i2);
    }

    public Object[] toArray() {
        return C12871f.m40215a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12871f.m40216a(this, tArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeriesBundleEpisodes(videos=");
        sb.append(this.f13922c);
        sb.append(", episodePagingMeta=");
        sb.append(this.f13921U);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        List<DmcEpisode> list = this.f13922c;
        parcel.writeInt(list.size());
        for (DmcEpisode writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeParcelable(this.f13921U, i);
    }

    public /* synthetic */ SeriesBundleEpisodes(List list, EpisodePagingMetaData episodePagingMetaData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            episodePagingMetaData = null;
        }
        this(list, episodePagingMetaData);
    }
}
