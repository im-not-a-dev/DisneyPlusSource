package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "Landroid/os/Parcelable;", "downloadBlocked", "", "(Z)V", "getDownloadBlocked", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: MediaRights.kt */
public final class MediaRights implements Parcelable {
    public static final Creator CREATOR = new C3611a();

    /* renamed from: c */
    private final boolean f9089c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.MediaRights$a */
    public static class C3611a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new MediaRights(parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new MediaRights[i];
        }
    }

    public MediaRights(boolean z) {
        this.f9089c = z;
    }

    /* renamed from: X */
    public final boolean mo13118X() {
        return this.f9089c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaRights) {
                if (this.f9089c == ((MediaRights) obj).f9089c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f9089c;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRights(downloadBlocked=");
        sb.append(this.f9089c);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9089c ? 1 : 0);
    }
}
