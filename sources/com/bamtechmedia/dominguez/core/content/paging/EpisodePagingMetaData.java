package com.bamtechmedia.dominguez.core.content.paging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006'"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/paging/EpisodePagingMetaData;", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingMetaData;", "Landroid/os/Parcelable;", "hits", "", "offset", "episodePage", "episodePageSize", "maxHitsPerSeason", "(IIIII)V", "getEpisodePage", "()I", "getEpisodePageSize", "getHits", "getMaxHitsPerSeason", "getOffset", "pageSize", "getPageSize", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "getNextPage", "hasMorePages", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: PagingMetaData.kt */
public final class EpisodePagingMetaData implements C3703f, Parcelable {
    public static final Creator CREATOR = new C3697a();

    /* renamed from: U */
    private final int f9251U;

    /* renamed from: V */
    private final int f9252V;

    /* renamed from: W */
    private final int f9253W;

    /* renamed from: X */
    private final int f9254X;

    /* renamed from: c */
    private final int f9255c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.paging.EpisodePagingMetaData$a */
    public static class C3697a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            EpisodePagingMetaData episodePagingMetaData = new EpisodePagingMetaData(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            return episodePagingMetaData;
        }

        public final Object[] newArray(int i) {
            return new EpisodePagingMetaData[i];
        }
    }

    public EpisodePagingMetaData(int i, int i2, @C11724g(name = "episode_page") int i3, @C11724g(name = "episode_page_size") int i4, @C11724g(name = "max_hits_per_season") int i5) {
        this.f9255c = i;
        this.f9251U = i2;
        this.f9252V = i3;
        this.f9253W = i4;
        this.f9254X = i5;
    }

    /* renamed from: a */
    public static /* synthetic */ EpisodePagingMetaData m12572a(EpisodePagingMetaData episodePagingMetaData, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = episodePagingMetaData.mo13413b0();
        }
        if ((i6 & 2) != 0) {
            i2 = episodePagingMetaData.mo13409X();
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = episodePagingMetaData.f9252V;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = episodePagingMetaData.f9253W;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = episodePagingMetaData.f9254X;
        }
        return episodePagingMetaData.copy(i, i7, i8, i9, i5);
    }

    /* renamed from: X */
    public int mo13409X() {
        return this.f9251U;
    }

    /* renamed from: Y */
    public int mo13410Y() {
        return this.f9252V + 1;
    }

    /* renamed from: Z */
    public int mo13411Z() {
        return this.f9253W;
    }

    /* renamed from: a0 */
    public boolean mo13412a0() {
        return this.f9252V * this.f9253W < this.f9254X;
    }

    /* renamed from: b0 */
    public int mo13413b0() {
        return this.f9255c;
    }

    /* renamed from: c0 */
    public final int mo13424c0() {
        return this.f9252V;
    }

    public final EpisodePagingMetaData copy(int i, int i2, @C11724g(name = "episode_page") int i3, @C11724g(name = "episode_page_size") int i4, @C11724g(name = "max_hits_per_season") int i5) {
        EpisodePagingMetaData episodePagingMetaData = new EpisodePagingMetaData(i, i2, i3, i4, i5);
        return episodePagingMetaData;
    }

    /* renamed from: d0 */
    public final int mo13426d0() {
        return this.f9253W;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public final int mo13428e0() {
        return this.f9254X;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EpisodePagingMetaData) {
                EpisodePagingMetaData episodePagingMetaData = (EpisodePagingMetaData) obj;
                if (mo13413b0() == episodePagingMetaData.mo13413b0()) {
                    if (mo13409X() == episodePagingMetaData.mo13409X()) {
                        if (this.f9252V == episodePagingMetaData.f9252V) {
                            if (this.f9253W == episodePagingMetaData.f9253W) {
                                if (this.f9254X == episodePagingMetaData.f9254X) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((mo13413b0() * 31) + mo13409X()) * 31) + this.f9252V) * 31) + this.f9253W) * 31) + this.f9254X;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpisodePagingMetaData(hits=");
        sb.append(mo13413b0());
        sb.append(", offset=");
        sb.append(mo13409X());
        sb.append(", episodePage=");
        sb.append(this.f9252V);
        sb.append(", episodePageSize=");
        sb.append(this.f9253W);
        sb.append(", maxHitsPerSeason=");
        sb.append(this.f9254X);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9255c);
        parcel.writeInt(this.f9251U);
        parcel.writeInt(this.f9252V);
        parcel.writeInt(this.f9253W);
        parcel.writeInt(this.f9254X);
    }

    public /* synthetic */ EpisodePagingMetaData(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
