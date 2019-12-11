package p163g.p449j.p450a.p451a.p465e.p466b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C9910v;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: g.j.a.a.e.b.j */
public final class C11417j implements Creator<C11416i> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        int i = 0;
        C9910v vVar = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                i = C9919b.m30906k(parcel, a);
            } else if (a2 != 2) {
                C9919b.m30910o(parcel, a);
            } else {
                vVar = (C9910v) C9919b.m30891a(parcel, a, C9910v.CREATOR);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C11416i(i, vVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11416i[i];
    }
}
