package p551j.p552a.p565o.p566b;

import java.io.IOException;
import java.util.Deque;
import java.util.Iterator;
import p163g.p441i.p442a.p443a.C10903f;
import p520io.sentry.event.p550f.C12576b;
import p520io.sentry.event.p550f.C12577c;
import p520io.sentry.event.p550f.C12581g;
import p520io.sentry.event.p550f.C12584j;

/* renamed from: j.a.o.b.b */
/* compiled from: ExceptionInterfaceBinding */
public class C12663b implements C12665d<C12576b> {

    /* renamed from: a */
    private final C12665d<C12584j> f29349a;

    public C12663b(C12665d<C12584j> dVar) {
        this.f29349a = dVar;
    }

    /* renamed from: a */
    public void mo30988a(C10903f fVar, C12576b bVar) throws IOException {
        Deque a = bVar.mo30771a();
        fVar.mo28058e();
        Iterator descendingIterator = a.descendingIterator();
        while (descendingIterator.hasNext()) {
            m39703a(fVar, (C12581g) descendingIterator.next());
        }
        fVar.mo28052b();
    }

    /* renamed from: a */
    private void m39703a(C10903f fVar, C12581g gVar) throws IOException {
        fVar.mo28060f();
        String str = "type";
        fVar.mo28045a(str, gVar.mo30809a());
        fVar.mo28045a("value", gVar.mo30811c());
        fVar.mo28045a("module", gVar.mo30812d());
        C12577c b = gVar.mo30810b();
        if (b != null) {
            fVar.mo28063g("mechanism");
            fVar.mo28060f();
            fVar.mo28045a(str, b.mo30775a());
            fVar.mo28046a("handled", b.mo30776b());
            fVar.mo28055c();
        }
        fVar.mo28063g("stacktrace");
        this.f29349a.mo30988a(fVar, gVar.mo30813e());
        fVar.mo28055c();
    }
}
