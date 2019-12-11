package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.f */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10470f {

    /* renamed from: a */
    private final Messenger f24819a;

    /* renamed from: b */
    private final C10471f0 f24820b;

    C10470f(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f24819a = new Messenger(iBinder);
            this.f24820b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f24820b = new C10471f0(iBinder);
            this.f24819a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27301a(Message message) throws RemoteException {
        Messenger messenger = this.f24819a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C10471f0 f0Var = this.f24820b;
        if (f0Var != null) {
            f0Var.mo27302a(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
