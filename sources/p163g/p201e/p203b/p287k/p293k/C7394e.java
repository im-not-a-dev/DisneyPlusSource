package p163g.p201e.p203b.p287k.p293k;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3791v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010#\u001a\u00020\fHÖ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\fHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\fHÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006."}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailArguments;", "Landroid/os/Parcelable;", "encodedSeriesId", "", "initialSeries", "Lcom/bamtechmedia/dominguez/core/content/Series;", "initialTab", "Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "download", "", "addToWatchlist", "seasonNumber", "", "episodeNumber", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/Series;Lcom/bamtechmedia/dominguez/core/content/InitialTab;ZZII)V", "getAddToWatchlist", "()Z", "getDownload", "getEncodedSeriesId", "()Ljava/lang/String;", "getEpisodeNumber", "()I", "getInitialSeries", "()Lcom/bamtechmedia/dominguez/core/content/Series;", "getInitialTab", "()Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "getSeasonNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetailApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.k.e */
/* compiled from: SeriesDetailArguments.kt */
public final class C7394e implements Parcelable {
    public static final Creator CREATOR = new C7395a();

    /* renamed from: U */
    private final C3791v f16247U;

    /* renamed from: V */
    private final C3690l f16248V;

    /* renamed from: W */
    private final boolean f16249W;

    /* renamed from: X */
    private final boolean f16250X;

    /* renamed from: Y */
    private final int f16251Y;

    /* renamed from: Z */
    private final int f16252Z;

    /* renamed from: c */
    private final String f16253c;

    /* renamed from: g.e.b.k.k.e$a */
    public static class C7395a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            C3791v vVar = (C3791v) parcel.readParcelable(C7394e.class.getClassLoader());
            C3690l lVar = (C3690l) Enum.valueOf(C3690l.class, parcel.readString());
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            C7394e eVar = new C7394e(readString, vVar, lVar, z2, z, parcel.readInt(), parcel.readInt());
            return eVar;
        }

        public final Object[] newArray(int i) {
            return new C7394e[i];
        }
    }

    public C7394e(String str, C3791v vVar, C3690l lVar, boolean z, boolean z2, int i, int i2) {
        this.f16253c = str;
        this.f16247U = vVar;
        this.f16248V = lVar;
        this.f16249W = z;
        this.f16250X = z2;
        this.f16251Y = i;
        this.f16252Z = i2;
    }

    /* renamed from: C */
    public final String mo20226C() {
        return this.f16253c;
    }

    /* renamed from: F */
    public final int mo20227F() {
        return this.f16251Y;
    }

    /* renamed from: I */
    public final int mo20228I() {
        return this.f16252Z;
    }

    /* renamed from: X */
    public final boolean mo20229X() {
        return this.f16250X;
    }

    /* renamed from: Y */
    public final boolean mo20230Y() {
        return this.f16249W;
    }

    /* renamed from: Z */
    public final C3791v mo20231Z() {
        return this.f16247U;
    }

    /* renamed from: a0 */
    public final C3690l mo20232a0() {
        return this.f16248V;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7394e) {
                C7394e eVar = (C7394e) obj;
                if (Intrinsics.areEqual((Object) this.f16253c, (Object) eVar.f16253c) && Intrinsics.areEqual((Object) this.f16247U, (Object) eVar.f16247U) && Intrinsics.areEqual((Object) this.f16248V, (Object) eVar.f16248V)) {
                    if (this.f16249W == eVar.f16249W) {
                        if (this.f16250X == eVar.f16250X) {
                            if (this.f16251Y == eVar.f16251Y) {
                                if (this.f16252Z == eVar.f16252Z) {
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
        String str = this.f16253c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C3791v vVar = this.f16247U;
        int hashCode2 = (hashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        C3690l lVar = this.f16248V;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f16249W;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f16250X;
        if (z2) {
            z2 = true;
        }
        return ((((i3 + (z2 ? 1 : 0)) * 31) + this.f16251Y) * 31) + this.f16252Z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeriesDetailArguments(encodedSeriesId=");
        sb.append(this.f16253c);
        sb.append(", initialSeries=");
        sb.append(this.f16247U);
        sb.append(", initialTab=");
        sb.append(this.f16248V);
        sb.append(", download=");
        sb.append(this.f16249W);
        sb.append(", addToWatchlist=");
        sb.append(this.f16250X);
        sb.append(", seasonNumber=");
        sb.append(this.f16251Y);
        sb.append(", episodeNumber=");
        sb.append(this.f16252Z);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16253c);
        parcel.writeParcelable(this.f16247U, i);
        parcel.writeString(this.f16248V.name());
        parcel.writeInt(this.f16249W ? 1 : 0);
        parcel.writeInt(this.f16250X ? 1 : 0);
        parcel.writeInt(this.f16251Y);
        parcel.writeInt(this.f16252Z);
    }

    public /* synthetic */ C7394e(String str, C3791v vVar, C3690l lVar, boolean z, boolean z2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, vVar, lVar, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
    }
}
