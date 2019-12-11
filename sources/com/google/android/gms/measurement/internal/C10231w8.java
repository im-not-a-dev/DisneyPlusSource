package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
public final class C10231w8 implements Creator<C10201t8> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C9919b.m30894b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            switch (C9919b.m30888a(a)) {
                case 1:
                    i = C9919b.m30906k(parcel2, a);
                    break;
                case 2:
                    str = C9919b.m30895b(parcel2, a);
                    break;
                case 3:
                    j = C9919b.m30907l(parcel2, a);
                    break;
                case 4:
                    l = C9919b.m30908m(parcel2, a);
                    break;
                case 5:
                    f = C9919b.m30904i(parcel2, a);
                    break;
                case 6:
                    str2 = C9919b.m30895b(parcel2, a);
                    break;
                case 7:
                    str3 = C9919b.m30895b(parcel2, a);
                    break;
                case 8:
                    d = C9919b.m30903h(parcel2, a);
                    break;
                default:
                    C9919b.m30910o(parcel2, a);
                    break;
            }
        }
        C9919b.m30900e(parcel2, b);
        C10201t8 t8Var = new C10201t8(i, str, j, l, f, str2, str3, d);
        return t8Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C10201t8[i];
    }
}
