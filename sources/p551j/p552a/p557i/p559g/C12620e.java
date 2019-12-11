package p551j.p552a.p557i.p559g;

import p551j.p552a.p562l.C12652a;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.i.g.e */
/* compiled from: JndiSupport */
public final class C12620e {

    /* renamed from: a */
    private static final C13459b f29260a = C13460c.m41415a(C12620e.class);

    private C12620e() {
    }

    /* renamed from: a */
    public static boolean m39623a() {
        try {
            Class.forName("javax.naming.InitialContext", false, C12652a.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
            C13459b bVar = f29260a;
            StringBuilder sb = new StringBuilder();
            sb.append("JNDI is not available: ");
            sb.append(e.getMessage());
            bVar.mo34728c(sb.toString());
            return false;
        }
    }
}
