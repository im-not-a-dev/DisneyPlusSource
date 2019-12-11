package p551j.p552a.p565o.p566b;

import java.io.IOException;
import java.util.Iterator;
import p163g.p441i.p442a.p443a.C10903f;
import p520io.sentry.event.p550f.C12574a;
import p520io.sentry.event.p550f.C12574a.C12575a;

/* renamed from: j.a.o.b.a */
/* compiled from: DebugMetaInterfaceBinding */
public class C12662a implements C12665d<C12574a> {
    /* renamed from: b */
    private void m39700b(C10903f fVar, C12574a aVar) throws IOException {
        fVar.mo28061f("images");
        Iterator it = aVar.mo30764a().iterator();
        while (it.hasNext()) {
            C12575a aVar2 = (C12575a) it.next();
            fVar.mo28060f();
            fVar.mo28045a("uuid", aVar2.mo30769b());
            fVar.mo28045a("type", aVar2.mo30768a());
            fVar.mo28055c();
        }
        fVar.mo28052b();
    }

    /* renamed from: a */
    public void mo30988a(C10903f fVar, C12574a aVar) throws IOException {
        fVar.mo28060f();
        m39700b(fVar, aVar);
        fVar.mo28055c();
    }
}
