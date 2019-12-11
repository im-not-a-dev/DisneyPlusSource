package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.k */
/* compiled from: FragmentManagerState */
final class C0557k implements Parcelable {
    public static final Creator<C0557k> CREATOR = new C0558a();

    /* renamed from: U */
    ArrayList<String> f2411U;

    /* renamed from: V */
    C0528b[] f2412V;

    /* renamed from: W */
    String f2413W = null;

    /* renamed from: X */
    int f2414X;

    /* renamed from: c */
    ArrayList<C0562n> f2415c;

    /* renamed from: androidx.fragment.app.k$a */
    /* compiled from: FragmentManagerState */
    static class C0558a implements Creator<C0557k> {
        C0558a() {
        }

        public C0557k createFromParcel(Parcel parcel) {
            return new C0557k(parcel);
        }

        public C0557k[] newArray(int i) {
            return new C0557k[i];
        }
    }

    public C0557k() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2415c);
        parcel.writeStringList(this.f2411U);
        parcel.writeTypedArray(this.f2412V, i);
        parcel.writeString(this.f2413W);
        parcel.writeInt(this.f2414X);
    }

    public C0557k(Parcel parcel) {
        this.f2415c = parcel.createTypedArrayList(C0562n.CREATOR);
        this.f2411U = parcel.createStringArrayList();
        this.f2412V = (C0528b[]) parcel.createTypedArray(C0528b.CREATOR);
        this.f2413W = parcel.readString();
        this.f2414X = parcel.readInt();
    }
}
