package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;

/* renamed from: g.j.a.a.d.g.f2 */
public class C11109f2 {

    /* renamed from: a */
    private static final ClassLoader f26196a = C11109f2.class.getClassLoader();

    private C11109f2() {
    }

    /* renamed from: a */
    public static boolean m35136a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: b */
    public static HashMap m35137b(Parcel parcel) {
        return parcel.readHashMap(f26196a);
    }

    /* renamed from: a */
    public static void m35135a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m35132a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m35134a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m35133a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
