package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new C0988a();

    /* renamed from: c */
    private final C0992d f3900c;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0988a implements Creator<ParcelImpl> {
        C0988a() {
        }

        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(C0992d dVar) {
        this.f3900c = dVar;
    }

    /* renamed from: X */
    public <T extends C0992d> T mo5445X() {
        return this.f3900c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0991c(parcel).mo5458a(this.f3900c);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f3900c = new C0991c(parcel).mo5485j();
    }
}
