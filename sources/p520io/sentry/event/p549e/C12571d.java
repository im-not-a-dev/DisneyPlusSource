package p520io.sentry.event.p549e;

import javax.servlet.http.HttpServletRequest;
import p520io.sentry.event.C12562b;
import p520io.sentry.event.p550f.C12579e;
import p520io.sentry.event.p550f.C12582h;
import p520io.sentry.event.p550f.C12585k;
import p551j.p552a.p567p.C12673a;

/* renamed from: io.sentry.event.e.d */
/* compiled from: HttpEventBuilderHelper */
public class C12571d implements C12570c {

    /* renamed from: a */
    private final C12572e f29134a = new C12568a();

    /* renamed from: b */
    private void m39421b(C12562b bVar, HttpServletRequest httpServletRequest) {
        bVar.mo30740a((C12582h) new C12585k(null, httpServletRequest.getUserPrincipal() != null ? httpServletRequest.getUserPrincipal().getName() : null, this.f29134a.mo30760a(httpServletRequest), null), false);
    }

    /* renamed from: a */
    public void mo30761a(C12562b bVar) {
        HttpServletRequest a = C12673a.m39760a();
        if (a != null) {
            m39420a(bVar, a);
            m39421b(bVar, a);
        }
    }

    /* renamed from: a */
    private void m39420a(C12562b bVar, HttpServletRequest httpServletRequest) {
        bVar.mo30740a((C12582h) new C12579e(httpServletRequest, this.f29134a), false);
    }
}
