package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.firebase.iid.h0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10476h0 implements Creator<C10471f0> {
    C10476h0() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new C10471f0(readStrongBinder);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C10471f0[i];
    }
}
