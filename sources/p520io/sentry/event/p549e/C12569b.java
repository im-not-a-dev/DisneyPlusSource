package p520io.sentry.event.p549e;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p520io.sentry.event.C12562b;
import p520io.sentry.event.C12567d;
import p520io.sentry.event.p550f.C12582h;
import p520io.sentry.event.p550f.C12585k;
import p551j.p552a.C12590c;
import p551j.p552a.p561k.C12647a;

/* renamed from: io.sentry.event.e.b */
/* compiled from: ContextBuilderHelper */
public class C12569b implements C12570c {

    /* renamed from: a */
    private C12590c f29133a;

    public C12569b(C12590c cVar) {
        this.f29133a = cVar;
    }

    /* renamed from: a */
    public void mo30761a(C12562b bVar) {
        C12647a a = this.f29133a.mo30885a();
        List a2 = a.mo30955a();
        if (!a2.isEmpty()) {
            bVar.mo30744a(a2);
        }
        if (a.mo30958c() != null) {
            bVar.mo30739a((C12582h) a.mo30958c());
        }
        if (a.mo30960e() == null) {
            Map d = a.mo30959d();
            if (!d.isEmpty()) {
                for (Entry entry : d.entrySet()) {
                    bVar.mo30743a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            Map b = a.mo30957b();
            if (!b.isEmpty()) {
                for (Entry entry2 : b.entrySet()) {
                    bVar.mo30742a((String) entry2.getKey(), entry2.getValue());
                }
                return;
            }
            return;
        }
        m39417a(a.mo30960e());
        throw null;
    }

    /* renamed from: a */
    private C12585k m39417a(C12567d dVar) {
        dVar.mo30759a();
        throw null;
    }
}
