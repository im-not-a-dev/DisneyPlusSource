package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3795y;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcWatchlistLabel;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/core/content/WatchlistLabel;", "onWatchlist", "", "(Z)V", "getOnWatchlist", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcWatchlistLabel.kt */
public final class DmcWatchlistLabel implements Parcelable, C3795y {
    public static final Creator CREATOR = new C3607a();

    /* renamed from: c */
    private final boolean f9074c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcWatchlistLabel$a */
    public static class C3607a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DmcWatchlistLabel(parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new DmcWatchlistLabel[i];
        }
    }

    public DmcWatchlistLabel(boolean z) {
        this.f9074c = z;
    }

    /* renamed from: X */
    public boolean mo13075X() {
        return this.f9074c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DmcWatchlistLabel) {
                if (mo13075X() == ((DmcWatchlistLabel) obj).mo13075X()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean X = mo13075X();
        if (X) {
            return 1;
        }
        return X ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcWatchlistLabel(onWatchlist=");
        sb.append(mo13075X());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9074c ? 1 : 0);
    }
}
