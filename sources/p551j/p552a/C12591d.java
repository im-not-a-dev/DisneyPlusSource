package p551j.p552a;

import p551j.p552a.p557i.C12607d;
import p551j.p552a.p562l.C12652a;
import p551j.p552a.p569r.C12677b;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.d */
/* compiled from: SentryClientFactory */
public abstract class C12591d {

    /* renamed from: a */
    private static final C13459b f29213a = C13460c.m41415a(C12591d.class);

    /* renamed from: a */
    public static C12590c m39550a(String str, C12591d dVar) {
        C12652a a = m39551a(str);
        if (dVar == null) {
            String b = C12607d.m39605b("factory", a);
            if (C12677b.m39771a(b)) {
                dVar = new C12586a();
            } else {
                try {
                    dVar = (C12591d) Class.forName(b).newInstance();
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    C13459b bVar = f29213a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error creating SentryClient using factory class: '");
                    sb.append(b);
                    sb.append("'.");
                    bVar.mo34723a(sb.toString(), e);
                    return null;
                }
            }
        }
        return dVar.mo30855a(a);
    }

    /* renamed from: a */
    public abstract C12590c mo30855a(C12652a aVar);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SentryClientFactory{name='");
        sb.append(getClass().getName());
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private static C12652a m39551a(String str) {
        try {
            if (C12677b.m39771a(str)) {
                str = C12652a.m39679h();
            }
            return new C12652a(str);
        } catch (Exception e) {
            f29213a.mo34730c("Error creating valid DSN from: '{}'.", str, e);
            throw e;
        }
    }
}
