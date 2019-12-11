package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C9692b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C9726e.C9727a;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.android.gms.common.api.internal.y1 */
abstract class C9804y1<T> extends C9760l1 {

    /* renamed from: a */
    protected final C11436i<T> f23013a;

    public C9804y1(int i, C11436i<T> iVar) {
        super(i);
        this.f23013a = iVar;
    }

    /* renamed from: a */
    public void mo25223a(Status status) {
        this.f23013a.mo29274b((Exception) new C9692b(status));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo25101d(C9727a<?> aVar) throws RemoteException;

    /* renamed from: a */
    public void mo25225a(RuntimeException runtimeException) {
        this.f23013a.mo29274b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo25224a(C9727a<?> aVar) throws DeadObjectException {
        try {
            mo25101d(aVar);
        } catch (DeadObjectException e) {
            mo25223a(C9771o0.m30447a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            mo25223a(C9771o0.m30447a(e2));
        } catch (RuntimeException e3) {
            mo25225a(e3);
        }
    }
}
