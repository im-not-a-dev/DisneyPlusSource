package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
public final class C10094j9 implements Creator<C10061g9> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C9919b.m30894b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        C10201t8 t8Var = null;
        String str3 = null;
        C10084j jVar = null;
        C10084j jVar2 = null;
        C10084j jVar3 = null;
        boolean z = false;
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
                    t8Var = (C10201t8) C9919b.m30891a(parcel2, a, C10201t8.CREATOR);
                    break;
                case 5:
                    j = C9919b.m30907l(parcel2, a);
                    break;
                case 6:
                    z = C9919b.m30901f(parcel2, a);
                    break;
                case 7:
                    str3 = C9919b.m30895b(parcel2, a);
                    break;
                case 8:
                    jVar = (C10084j) C9919b.m30891a(parcel2, a, C10084j.CREATOR);
                    break;
                case 9:
                    j2 = C9919b.m30907l(parcel2, a);
                    break;
                case 10:
                    jVar2 = (C10084j) C9919b.m30891a(parcel2, a, C10084j.CREATOR);
                    break;
                case 11:
                    j3 = C9919b.m30907l(parcel2, a);
                    break;
                case 12:
                    jVar3 = (C10084j) C9919b.m30891a(parcel2, a, C10084j.CREATOR);
                    break;
                default:
                    C9919b.m30910o(parcel2, a);
                    break;
            }
        }
        C9919b.m30900e(parcel2, b);
        C10061g9 g9Var = new C10061g9(str, str2, t8Var, j, z, str3, jVar, j2, jVar2, j3, jVar3);
        return g9Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C10061g9[i];
    }
}
