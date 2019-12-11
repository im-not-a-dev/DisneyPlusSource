package p163g.p174d.p178b.p182d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: g.d.b.d0.i */
/* compiled from: PlaybackRangeList */
public class C4949i extends ArrayList<C4946g> implements Parcelable {
    public static final Creator<C4949i> CREATOR = new C4950a();

    /* renamed from: g.d.b.d0.i$a */
    /* compiled from: PlaybackRangeList */
    static class C4950a implements Creator<C4949i> {
        C4950a() {
        }

        public C4949i createFromParcel(Parcel parcel) {
            return new C4949i(parcel);
        }

        public C4949i[] newArray(int i) {
            return new C4949i[i];
        }
    }

    protected C4949i(Parcel parcel) {
        addAll(parcel.createTypedArrayList(C4946g.CREATOR));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this);
    }
}
