package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: com.google.firebase.messaging.o */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
public final class C10527o implements Creator<C10515c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            if (C9919b.m30888a(a) != 2) {
                C9919b.m30910o(parcel, a);
            } else {
                bundle = C9919b.m30890a(parcel, a);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C10515c(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C10515c[i];
    }
}
