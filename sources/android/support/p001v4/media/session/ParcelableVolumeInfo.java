package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C0044a();

    /* renamed from: U */
    public int f118U;

    /* renamed from: V */
    public int f119V;

    /* renamed from: W */
    public int f120W;

    /* renamed from: X */
    public int f121X;

    /* renamed from: c */
    public int f122c;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0044a implements Creator<ParcelableVolumeInfo> {
        C0044a() {
        }

        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f122c = i;
        this.f118U = i2;
        this.f119V = i3;
        this.f120W = i4;
        this.f121X = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f122c);
        parcel.writeInt(this.f119V);
        parcel.writeInt(this.f120W);
        parcel.writeInt(this.f121X);
        parcel.writeInt(this.f118U);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f122c = parcel.readInt();
        this.f119V = parcel.readInt();
        this.f120W = parcel.readInt();
        this.f121X = parcel.readInt();
        this.f118U = parcel.readInt();
    }
}
