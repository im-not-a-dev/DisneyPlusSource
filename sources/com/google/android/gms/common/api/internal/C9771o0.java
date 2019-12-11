package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C9726e.C9727a;
import com.google.android.gms.common.util.C9948l;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
public abstract class C9771o0 {
    public C9771o0(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Status m30447a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C9948l.m30989b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo25223a(Status status);

    /* renamed from: a */
    public abstract void mo25224a(C9727a<?> aVar) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo25098a(C9778q qVar, boolean z);

    /* renamed from: a */
    public abstract void mo25225a(RuntimeException runtimeException);
}
