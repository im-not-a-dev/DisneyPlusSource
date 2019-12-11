package p551j.p552a.p565o.p566b;

import java.io.IOException;
import p163g.p441i.p442a.p443a.C10903f;
import p520io.sentry.event.p550f.C12580f;
import p551j.p552a.p569r.C12677b;

/* renamed from: j.a.o.b.f */
/* compiled from: MessageInterfaceBinding */
public class C12669f implements C12665d<C12580f> {

    /* renamed from: a */
    private final int f29357a;

    public C12669f(int i) {
        this.f29357a = i;
    }

    /* renamed from: a */
    public void mo30988a(C10903f fVar, C12580f fVar2) throws IOException {
        fVar.mo28060f();
        fVar.mo28045a("message", C12677b.m39768a(fVar2.mo30804b(), this.f29357a));
        fVar.mo28061f("params");
        for (String j : fVar2.mo30805c()) {
            fVar.mo28066j(j);
        }
        fVar.mo28052b();
        if (fVar2.mo30803a() != null) {
            fVar.mo28045a("formatted", C12677b.m39768a(fVar2.mo30803a(), this.f29357a));
        }
        fVar.mo28055c();
    }
}
