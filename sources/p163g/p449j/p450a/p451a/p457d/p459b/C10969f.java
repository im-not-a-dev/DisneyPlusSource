package p163g.p449j.p450a.p451a.p457d.p459b;

import com.google.android.gms.auth.api.credentials.C9628a;
import com.google.android.gms.auth.api.credentials.C9631c;
import com.google.android.gms.auth.api.credentials.C9633e;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9702g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: g.j.a.a.d.b.f */
public final class C10969f implements C9633e {
    /* renamed from: a */
    public final C9702g<C9631c> mo24879a(C9698f fVar, C9628a aVar) {
        C9908u.m30854a(fVar, (Object) "client must not be null");
        C9908u.m30854a(aVar, (Object) "request must not be null");
        return fVar.mo25058a(new C10970g(this, fVar, aVar));
    }

    /* renamed from: b */
    public final C9702g<Status> mo24880b(C9698f fVar, Credential credential) {
        C9908u.m30854a(fVar, (Object) "client must not be null");
        C9908u.m30854a(credential, (Object) "credential must not be null");
        return fVar.mo25063b(new C10972i(this, fVar, credential));
    }

    /* renamed from: a */
    public final C9702g<Status> mo24878a(C9698f fVar, Credential credential) {
        C9908u.m30854a(fVar, (Object) "client must not be null");
        C9908u.m30854a(credential, (Object) "credential must not be null");
        return fVar.mo25063b(new C10973j(this, fVar, credential));
    }
}
