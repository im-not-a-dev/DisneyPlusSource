package p551j.p552a.p557i.p559g;

import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.i.g.h */
/* compiled from: SystemPropertiesConfigurationProvider */
public class C12623h implements C12615b {

    /* renamed from: b */
    private static final C13459b f29262b = C13460c.m41415a(C12623h.class);

    /* renamed from: a */
    private final String f29263a;

    public C12623h() {
        this("sentry.");
    }

    /* renamed from: a */
    public String mo30922a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29263a);
        sb.append(str.toLowerCase());
        String property = System.getProperty(sb.toString());
        if (property != null) {
            f29262b.mo34722a("Found {}={} in Java System Properties.", str, property);
        }
        return property;
    }

    public C12623h(String str) {
        this.f29263a = str;
    }
}
