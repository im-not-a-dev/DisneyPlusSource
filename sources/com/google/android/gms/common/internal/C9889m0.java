package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C9824d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.android.gms.common.internal.m0 */
public final class C9889m0 implements Creator<C9872g> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C9919b.m30894b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C9824d[] dVarArr = null;
        C9824d[] dVarArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            switch (C9919b.m30888a(a)) {
                case 1:
                    i = C9919b.m30906k(parcel2, a);
                    break;
                case 2:
                    i2 = C9919b.m30906k(parcel2, a);
                    break;
                case 3:
                    i3 = C9919b.m30906k(parcel2, a);
                    break;
                case 4:
                    str = C9919b.m30895b(parcel2, a);
                    break;
                case 5:
                    iBinder = C9919b.m30905j(parcel2, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) C9919b.m30896b(parcel2, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C9919b.m30890a(parcel2, a);
                    break;
                case 8:
                    account = (Account) C9919b.m30891a(parcel2, a, Account.CREATOR);
                    break;
                case 10:
                    dVarArr = (C9824d[]) C9919b.m30896b(parcel2, a, C9824d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (C9824d[]) C9919b.m30896b(parcel2, a, C9824d.CREATOR);
                    break;
                case 12:
                    z = C9919b.m30901f(parcel2, a);
                    break;
                default:
                    C9919b.m30910o(parcel2, a);
                    break;
            }
        }
        C9919b.m30900e(parcel2, b);
        C9872g gVar = new C9872g(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z);
        return gVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9872g[i];
    }
}
