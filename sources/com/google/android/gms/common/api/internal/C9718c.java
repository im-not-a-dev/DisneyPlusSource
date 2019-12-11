package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9681c;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.C9914x;

/* renamed from: com.google.android.gms.common.api.internal.c */
public abstract class C9718c<R extends C9810l, A extends C9680b> extends BasePendingResult<R> implements C9722d<R> {

    /* renamed from: q */
    private final C9681c<A> f22775q;

    /* renamed from: r */
    private final C9678a<?> f22776r;

    protected C9718c(C9678a<?> aVar, C9698f fVar) {
        C9908u.m30854a(fVar, (Object) "GoogleApiClient must not be null");
        super(fVar);
        C9908u.m30854a(aVar, (Object) "Api must not be null");
        this.f22775q = aVar.mo25016a();
        this.f22776r = aVar;
    }

    /* renamed from: a */
    private void m30173a(RemoteException remoteException) {
        mo25124c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24967a(A a) throws RemoteException;

    /* renamed from: b */
    public final void mo25122b(A a) throws DeadObjectException {
        if (a instanceof C9914x) {
            a = ((C9914x) a).mo24959D();
        }
        try {
            mo24967a(a);
        } catch (DeadObjectException e) {
            m30173a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            m30173a(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25123b(R r) {
    }

    /* renamed from: c */
    public final void mo25124c(Status status) {
        C9908u.m30861a(!status.mo25010f(), (Object) "Failed result must not be success");
        C9810l a = mo24966a(status);
        mo25086a(a);
        mo25123b((R) a);
    }

    /* renamed from: g */
    public final C9678a<?> mo25125g() {
        return this.f22776r;
    }

    /* renamed from: h */
    public final C9681c<A> mo25126h() {
        return this.f22775q;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo25121a(Object obj) {
        super.mo25086a((C9810l) obj);
    }
}
