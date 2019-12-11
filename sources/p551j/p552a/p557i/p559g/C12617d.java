package p551j.p552a.p557i.p559g;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.NoInitialContextException;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.i.g.d */
/* compiled from: JndiConfigurationProvider */
public class C12617d implements C12615b {

    /* renamed from: c */
    private static final C13459b f29257c = C13460c.m41415a(C12617d.class);

    /* renamed from: a */
    private final String f29258a;

    /* renamed from: b */
    private final C12619b f29259b;

    /* renamed from: j.a.i.g.d$a */
    /* compiled from: JndiConfigurationProvider */
    class C12618a implements C12619b {
        C12618a() {
        }

        /* renamed from: b */
        public Context mo30923b() throws NamingException {
            return new InitialContext();
        }
    }

    /* renamed from: j.a.i.g.d$b */
    /* compiled from: JndiConfigurationProvider */
    public interface C12619b {
        /* renamed from: b */
        Context mo30923b() throws NamingException;
    }

    public C12617d() {
        this("java:comp/env/sentry/", new C12618a());
    }

    /* renamed from: a */
    public String mo30922a(String str) {
        try {
            Context b = this.f29259b.mo30923b();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29258a);
            sb.append(str);
            return (String) b.lookup(sb.toString());
        } catch (NoInitialContextException unused) {
            f29257c.mo34728c("JNDI not configured for Sentry (NoInitialContextEx)");
        } catch (NamingException unused2) {
            C13459b bVar = f29257c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No ");
            sb2.append(this.f29258a);
            sb2.append(str);
            sb2.append(" in JNDI");
            bVar.mo34728c(sb2.toString());
        } catch (RuntimeException e) {
            f29257c.mo34727b("Odd RuntimeException while testing for JNDI", (Throwable) e);
        }
        return null;
    }

    public C12617d(String str, C12619b bVar) {
        this.f29258a = str;
        this.f29259b = bVar;
    }
}
