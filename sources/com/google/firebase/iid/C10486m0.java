package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C9899r;
import java.io.IOException;
import java.util.concurrent.Executor;
import p163g.p449j.p450a.p451a.p467f.C11424a;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p449j.p450a.p451a.p467f.C11436i;
import p163g.p449j.p482b.C11512c;
import p163g.p449j.p482b.p486h.C11531g;

/* renamed from: com.google.firebase.iid.m0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10486m0 {

    /* renamed from: a */
    private final C11512c f24850a;

    /* renamed from: b */
    private final C10477i f24851b;

    /* renamed from: c */
    private final C10489o f24852c;

    /* renamed from: d */
    private final Executor f24853d;

    /* renamed from: e */
    private final C11531g f24854e;

    C10486m0(C11512c cVar, C10477i iVar, Executor executor, C11531g gVar) {
        this(cVar, iVar, executor, new C10489o(cVar.mo29428a(), iVar), gVar);
    }

    /* renamed from: a */
    public final C11435h<String> mo27322a(String str, String str2, String str3) {
        return m33076b(m33073a(str, str2, str3, new Bundle()));
    }

    /* renamed from: b */
    public final C11435h<Void> mo27324b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m33072a(m33076b(m33073a(str, str2, str3, bundle)));
    }

    /* renamed from: c */
    public final C11435h<Void> mo27325c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        String valueOf2 = String.valueOf(str3);
        return m33072a(m33076b(m33073a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    /* renamed from: d */
    public final C11435h<Void> mo27326d(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m33072a(m33076b(m33073a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    private C10486m0(C11512c cVar, C10477i iVar, Executor executor, C10489o oVar, C11531g gVar) {
        this.f24850a = cVar;
        this.f24851b = iVar;
        this.f24852c = oVar;
        this.f24853d = executor;
        this.f24854e = gVar;
    }

    /* renamed from: a */
    public final C11435h<Void> mo27321a(String str) {
        Bundle bundle = new Bundle();
        String str2 = "delete";
        bundle.putString("iid-operation", str2);
        bundle.putString(str2, "1");
        String str3 = "*";
        return m33072a(m33076b(m33073a(str, str3, str3, bundle)));
    }

    /* renamed from: b */
    private final C11435h<String> m33076b(C11435h<Bundle> hVar) {
        return hVar.mo29252a(this.f24853d, (C11424a<TResult, TContinuationResult>) new C10494q0<TResult,TContinuationResult>(this));
    }

    /* renamed from: a */
    private final C11435h<Bundle> m33073a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f24850a.mo29431c().mo29442a());
        bundle.putString("gmsv", Integer.toString(this.f24851b.mo27318d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f24851b.mo27316b());
        bundle.putString("app_ver_name", this.f24851b.mo27317c());
        String valueOf = String.valueOf(C9899r.m30835a().mo25432a("firebase-iid"));
        String str4 = "fiid-";
        bundle.putString("cliv", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("Firebase-Client", this.f24854e.getUserAgent());
        C11436i iVar = new C11436i();
        this.f24853d.execute(new C10490o0(this, bundle, iVar));
        return iVar.mo29271a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m33074a(Bundle bundle) throws IOException {
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException(str);
            }
        } else {
            throw new IOException(str);
        }
    }

    /* renamed from: a */
    private final <T> C11435h<Void> m33072a(C11435h<T> hVar) {
        return hVar.mo29252a(C10469e0.m33044a(), (C11424a<TResult, TContinuationResult>) new C10488n0<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo27323a(Bundle bundle, C11436i iVar) {
        try {
            iVar.mo29273a(this.f24852c.mo27329a(bundle));
        } catch (IOException e) {
            iVar.mo29272a((Exception) e);
        }
    }
}
