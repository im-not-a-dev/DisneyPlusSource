package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
public final class C10017c9 implements Creator<C10028d9> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C9919b.m30894b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        List list = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            switch (C9919b.m30888a(a)) {
                case 2:
                    str = C9919b.m30895b(parcel2, a);
                    break;
                case 3:
                    str2 = C9919b.m30895b(parcel2, a);
                    break;
                case 4:
                    str3 = C9919b.m30895b(parcel2, a);
                    break;
                case 5:
                    str4 = C9919b.m30895b(parcel2, a);
                    break;
                case 6:
                    j = C9919b.m30907l(parcel2, a);
                    break;
                case 7:
                    j2 = C9919b.m30907l(parcel2, a);
                    break;
                case 8:
                    str5 = C9919b.m30895b(parcel2, a);
                    break;
                case 9:
                    z = C9919b.m30901f(parcel2, a);
                    break;
                case 10:
                    z2 = C9919b.m30901f(parcel2, a);
                    break;
                case 11:
                    j6 = C9919b.m30907l(parcel2, a);
                    break;
                case 12:
                    str6 = C9919b.m30895b(parcel2, a);
                    break;
                case 13:
                    j3 = C9919b.m30907l(parcel2, a);
                    break;
                case 14:
                    j4 = C9919b.m30907l(parcel2, a);
                    break;
                case 15:
                    i = C9919b.m30906k(parcel2, a);
                    break;
                case 16:
                    z3 = C9919b.m30901f(parcel2, a);
                    break;
                case 17:
                    z4 = C9919b.m30901f(parcel2, a);
                    break;
                case 18:
                    z5 = C9919b.m30901f(parcel2, a);
                    break;
                case 19:
                    str7 = C9919b.m30895b(parcel2, a);
                    break;
                case 21:
                    bool = C9919b.m30902g(parcel2, a);
                    break;
                case 22:
                    j5 = C9919b.m30907l(parcel2, a);
                    break;
                case 23:
                    list = C9919b.m30899d(parcel2, a);
                    break;
                default:
                    C9919b.m30910o(parcel2, a);
                    break;
            }
        }
        C9919b.m30900e(parcel2, b);
        C10028d9 d9Var = new C10028d9(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, list);
        return d9Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C10028d9[i];
    }
}
