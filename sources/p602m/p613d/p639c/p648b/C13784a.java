package p602m.p613d.p639c.p648b;

import java.security.Provider;
import java.security.Security;
import p602m.p613d.p649d.p651b.C13792a;

/* renamed from: m.d.c.b.a */
/* compiled from: BCJcaJceHelper */
public class C13784a extends C13786c {

    /* renamed from: b */
    private static volatile Provider f30598b;

    public C13784a() {
        super(m42302a());
    }

    /* renamed from: a */
    private static Provider m42302a() {
        String str = "SC";
        if (Security.getProvider(str) != null) {
            return Security.getProvider(str);
        }
        if (f30598b != null) {
            return f30598b;
        }
        f30598b = new C13792a();
        return f30598b;
    }
}
