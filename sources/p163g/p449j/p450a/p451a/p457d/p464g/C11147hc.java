package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: g.j.a.a.d.g.hc */
public final class C11147hc implements Creator<C11161ic> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C9919b.m30894b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            switch (C9919b.m30888a(a)) {
                case 1:
                    j = C9919b.m30907l(parcel2, a);
                    break;
                case 2:
                    j2 = C9919b.m30907l(parcel2, a);
                    break;
                case 3:
                    z = C9919b.m30901f(parcel2, a);
                    break;
                case 4:
                    str = C9919b.m30895b(parcel2, a);
                    break;
                case 5:
                    str2 = C9919b.m30895b(parcel2, a);
                    break;
                case 6:
                    str3 = C9919b.m30895b(parcel2, a);
                    break;
                case 7:
                    bundle = C9919b.m30890a(parcel2, a);
                    break;
                default:
                    C9919b.m30910o(parcel2, a);
                    break;
            }
        }
        C9919b.m30900e(parcel2, b);
        C11161ic icVar = new C11161ic(j, j2, z, str, str2, str3, bundle);
        return icVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11161ic[i];
    }
}
