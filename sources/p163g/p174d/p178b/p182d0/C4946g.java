package p163g.p174d.p178b.p182d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: g.d.b.d0.g */
/* compiled from: PlaybackRange */
public class C4946g<T> implements Parcelable {
    public static final Creator<C4946g> CREATOR = new C4947a();

    /* renamed from: U */
    public final long f12105U;

    /* renamed from: c */
    public final long f12106c;

    /* renamed from: g.d.b.d0.g$a */
    /* compiled from: PlaybackRange */
    static class C4947a implements Creator<C4946g> {
        C4947a() {
        }

        public C4946g createFromParcel(Parcel parcel) {
            return new C4946g(parcel);
        }

        public C4946g[] newArray(int i) {
            return new C4946g[i];
        }
    }

    protected C4946g(Parcel parcel) {
        this.f12106c = parcel.readLong();
        this.f12105U = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4946g.class != obj.getClass()) {
            return false;
        }
        C4946g gVar = (C4946g) obj;
        if (this.f12106c != gVar.f12106c) {
            return false;
        }
        if (this.f12105U != gVar.f12105U) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f12106c;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f12105U;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackRange(");
        sb.append(this.f12106c);
        sb.append(", ");
        sb.append(this.f12105U);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12106c);
        parcel.writeLong(this.f12105U);
    }
}
