package p551j.p552a.p557i.p559g;

import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.i.g.c */
/* compiled from: EnvironmentConfigurationProvider */
public class C12616c implements C12615b {

    /* renamed from: b */
    private static final C13459b f29255b = C13460c.m41415a(C12616c.class);

    /* renamed from: a */
    private final String f29256a;

    public C12616c() {
        this("SENTRY_");
    }

    /* renamed from: a */
    public String mo30922a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29256a);
        sb.append(str.replace(".", "_").toUpperCase());
        String str2 = System.getenv(sb.toString());
        if (str2 != null) {
            f29255b.mo34722a("Found {}={} in System Environment Variables.", str, str2);
        }
        return str2;
    }

    public C12616c(String str) {
        this.f29256a = str;
    }
}
