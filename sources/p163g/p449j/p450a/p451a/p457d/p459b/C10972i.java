package p163g.p449j.p450a.p451a.p457d.p459b;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Status;

/* renamed from: g.j.a.a.d.b.i */
final class C10972i extends C10975l<Status> {

    /* renamed from: s */
    private final /* synthetic */ Credential f26017s;

    C10972i(C10969f fVar, C9698f fVar2, Credential credential) {
        this.f26017s = credential;
        super(fVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ C9810l mo24966a(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28205a(Context context, C10981r rVar) throws RemoteException {
        rVar.mo28212a((C10979p) new C10974k(this), new C10983t(this.f26017s));
    }
}
