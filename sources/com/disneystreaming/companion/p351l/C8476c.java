package com.disneystreaming.companion.p351l;

import com.disneystreaming.companion.p351l.C8473a.C8474a;
import java.io.PrintWriter;
import java.io.StringWriter;
import p163g.p498l.p499a.C11697c;
import p163g.p498l.p499a.C11697c.C11698a;
import p163g.p498l.p499a.C11697c.C11699b;

/* renamed from: com.disneystreaming.companion.l.c */
/* compiled from: Logger.kt */
public final class C8476c implements C8473a {

    /* renamed from: a */
    public static final C8476c f18029a = new C8476c();

    private C8476c() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m24621a(C8476c cVar, String str, Throwable th, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        cVar.mo21760a(str, th, str2);
    }

    /* renamed from: a */
    public C11699b mo21759a(C8477d dVar) {
        return C8474a.m24618a(this, dVar);
    }

    /* renamed from: b */
    public void mo21761b(C8477d dVar) {
        C8474a.m24619b(this, dVar);
    }

    /* renamed from: a */
    public final void mo21760a(String str, Throwable th, String str2) {
        m24622a(m24620a(str2), C8477d.DEBUG, str, th);
    }

    /* renamed from: a */
    private final C11697c m24620a(String str) {
        C11698a aVar = C11697c.f27229b;
        if (str == null) {
            str = "Companion";
        }
        return aVar.mo29715a(str);
    }

    /* renamed from: a */
    private final void m24622a(C11697c cVar, C8477d dVar, String str, Throwable th) {
        C11699b a = mo21759a(dVar);
        if (cVar.mo29711a(a)) {
            cVar.mo29710a(a, str);
        }
        if (!(th != null)) {
            th = null;
        }
        if (th != null) {
            m24623a(th, cVar, dVar);
        }
    }

    /* renamed from: a */
    private final void m24623a(Throwable th, C11697c cVar, C8477d dVar) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        C11699b bVar = C11699b.DEBUG;
        String str = "Trace: ";
        if (cVar.mo29711a(bVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(stringWriter);
            cVar.mo29710a(bVar, sb.toString());
        }
        C11699b a = mo21759a(dVar);
        if (cVar.mo29711a(a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(stringWriter);
            cVar.mo29710a(a, sb2.toString());
        }
    }
}
