package com.bamtechmedia.dominguez.auth;

import com.bamtechmedia.dominguez.config.C3572r0;
import kotlin.C12907r;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p408f0.C10608b;
import p163g.p201e.p203b.p408f0.C10611d;

/* renamed from: com.bamtechmedia.dominguez.auth.m0 */
/* compiled from: SignUpFallback.kt */
public final class C2727m0 {

    /* renamed from: a */
    private final C7547h f7476a;

    /* renamed from: b */
    private final C2702b f7477b;

    /* renamed from: c */
    private final C3572r0 f7478c;

    /* renamed from: d */
    private final C10611d f7479d;

    /* renamed from: e */
    private final boolean f7480e;

    public C2727m0(C7547h hVar, C2702b bVar, C3572r0 r0Var, C10611d dVar, boolean z) {
        this.f7476a = hVar;
        this.f7477b = bVar;
        this.f7478c = r0Var;
        this.f7479d = dVar;
        this.f7480e = z;
    }

    /* renamed from: a */
    public final boolean mo11744a() {
        String c = this.f7477b.mo11738c();
        if (c == null) {
            return false;
        }
        if (this.f7480e) {
            C7547h hVar = this.f7476a;
            C7544a aVar = new C7544a();
            String str = "url";
            String a = this.f7478c.mo12773a("sign_up_disabled_title", C13170i0.m40332a(C12907r.m40244a(str, c)));
            if (a == null) {
                a = "Start Free Trial";
            }
            aVar.mo20485i(a);
            String a2 = this.f7478c.mo12773a("sign_up_disabled_message", C13170i0.m40332a(C12907r.m40244a(str, c)));
            if (a2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Go to the url below to register ");
                sb.append(c);
                sb.append(' ');
                a2 = sb.toString();
            }
            aVar.mo20475d(a2);
            aVar.mo20480g(Integer.valueOf(C2721j0.btn_ok));
            hVar.mo20488a(aVar.mo20465a());
        } else {
            C10608b.m33333a(this.f7479d, c);
        }
        return true;
    }
}
