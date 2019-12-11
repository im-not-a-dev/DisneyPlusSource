package p551j.p552a.p565o.p566b;

import java.io.IOException;
import java.util.Map.Entry;
import p163g.p441i.p442a.p443a.C10903f;
import p520io.sentry.event.p550f.C12585k;

/* renamed from: j.a.o.b.i */
/* compiled from: UserInterfaceBinding */
public class C12672i implements C12665d<C12585k> {
    /* renamed from: a */
    public void mo30988a(C10903f fVar, C12585k kVar) throws IOException {
        fVar.mo28060f();
        fVar.mo28045a("id", kVar.mo30835c());
        fVar.mo28045a("username", kVar.mo30837e());
        fVar.mo28045a("email", kVar.mo30834b());
        fVar.mo28045a("ip_address", kVar.mo30836d());
        if (kVar.mo30833a() != null && !kVar.mo30833a().isEmpty()) {
            fVar.mo28065i("data");
            for (Entry entry : kVar.mo30833a().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    fVar.mo28064h(str);
                } else {
                    fVar.mo28044a(str, value);
                }
            }
            fVar.mo28055c();
        }
        fVar.mo28055c();
    }
}
