package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0004a();

    /* renamed from: U */
    private final MediaDescriptionCompat f6U;

    /* renamed from: c */
    private final int f7c;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0004a implements Creator<MediaBrowserCompat$MediaItem> {
        C0004a() {
        }

        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f7c = parcel.readInt();
        this.f6U = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaItem{");
        sb.append("mFlags=");
        sb.append(this.f7c);
        sb.append(", mDescription=");
        sb.append(this.f6U);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7c);
        this.f6U.writeToParcel(parcel, i);
    }
}
