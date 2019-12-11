package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.f0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public class C10471f0 implements Parcelable {
    public static final Creator<C10471f0> CREATOR = new C10476h0();

    /* renamed from: U */
    private C10492p0 f24821U;

    /* renamed from: c */
    private Messenger f24822c;

    /* renamed from: com.google.firebase.iid.f0$a */
    /* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
    public static final class C10472a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.zzd()) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return C10471f0.class;
        }
    }

    public C10471f0(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f24822c = new Messenger(iBinder);
        } else {
            this.f24821U = new C10498s0(iBinder);
        }
    }

    /* renamed from: X */
    private final IBinder m33048X() {
        Messenger messenger = this.f24822c;
        return messenger != null ? messenger.getBinder() : this.f24821U.asBinder();
    }

    /* renamed from: a */
    public final void mo27302a(Message message) throws RemoteException {
        Messenger messenger = this.f24822c;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f24821U.mo27331a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m33048X().equals(((C10471f0) obj).m33048X());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m33048X().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f24822c;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f24821U.asBinder());
        }
    }
}
