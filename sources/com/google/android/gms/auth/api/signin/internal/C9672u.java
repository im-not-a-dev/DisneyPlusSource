package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9698f.C9699a;
import p163g.p449j.p450a.p451a.p452a.p453a.C10943a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class C9672u extends C9667p {

    /* renamed from: a */
    private final Context f22684a;

    public C9672u(Context context) {
        this.f22684a = context;
    }

    /* renamed from: j */
    private final void m30028j() {
        if (!C9832i.m30631b(this.f22684a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: f */
    public final void mo24971f() {
        m30028j();
        C9654c a = C9654c.m29983a(this.f22684a);
        GoogleSignInAccount b = a.mo24949b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f22633g0;
        if (b != null) {
            googleSignInOptions = a.mo24950c();
        }
        C9699a aVar = new C9699a(this.f22684a);
        aVar.mo25071a(C10943a.f25999f, googleSignInOptions);
        C9698f a2 = aVar.mo25074a();
        try {
            if (a2.mo25059a().mo25275g()) {
                if (b != null) {
                    C10943a.f26001h.mo24928a(a2);
                } else {
                    a2.mo25062b();
                }
            }
        } finally {
            a2.mo25065d();
        }
    }

    /* renamed from: i */
    public final void mo24972i() {
        m30028j();
        C9665n.m30015a(this.f22684a).mo24969a();
    }
}
