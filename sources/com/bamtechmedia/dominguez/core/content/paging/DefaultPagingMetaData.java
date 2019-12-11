package com.bamtechmedia.dominguez.core.content.paging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingMetaData;", "Landroid/os/Parcelable;", "hits", "", "pageSize", "offset", "(III)V", "getHits", "()I", "getOffset", "getPageSize", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "getNextPage", "hasMorePages", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: PagingMetaData.kt */
public final class DefaultPagingMetaData implements C3703f, Parcelable {
    public static final Creator CREATOR = new C3696a();

    /* renamed from: U */
    private final int f9248U;

    /* renamed from: V */
    private final int f9249V;

    /* renamed from: c */
    private final int f9250c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData$a */
    public static class C3696a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DefaultPagingMetaData(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new DefaultPagingMetaData[i];
        }
    }

    public DefaultPagingMetaData(int i, @C11724g(name = "page_size") int i2, int i3) {
        this.f9250c = i;
        this.f9248U = i2;
        this.f9249V = i3;
    }

    /* renamed from: X */
    public int mo13409X() {
        return this.f9249V;
    }

    /* renamed from: Y */
    public int mo13410Y() {
        return (mo13409X() / mo13411Z()) + 2;
    }

    /* renamed from: Z */
    public int mo13411Z() {
        return this.f9248U;
    }

    /* renamed from: a0 */
    public boolean mo13412a0() {
        return mo13413b0() > mo13411Z() + mo13409X();
    }

    /* renamed from: b0 */
    public int mo13413b0() {
        return this.f9250c;
    }

    public final DefaultPagingMetaData copy(int i, @C11724g(name = "page_size") int i2, int i3) {
        return new DefaultPagingMetaData(i, i2, i3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DefaultPagingMetaData) {
                DefaultPagingMetaData defaultPagingMetaData = (DefaultPagingMetaData) obj;
                if (mo13413b0() == defaultPagingMetaData.mo13413b0()) {
                    if (mo13411Z() == defaultPagingMetaData.mo13411Z()) {
                        if (mo13409X() == defaultPagingMetaData.mo13409X()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((mo13413b0() * 31) + mo13411Z()) * 31) + mo13409X();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultPagingMetaData(hits=");
        sb.append(mo13413b0());
        sb.append(", pageSize=");
        sb.append(mo13411Z());
        sb.append(", offset=");
        sb.append(mo13409X());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9250c);
        parcel.writeInt(this.f9248U);
        parcel.writeInt(this.f9249V);
    }
}
