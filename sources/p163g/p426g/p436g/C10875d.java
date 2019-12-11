package p163g.p426g.p436g;

import java.util.concurrent.Callable;
import p163g.p426g.p427a.C10815f;
import p163g.p426g.p427a.C10817h;

/* renamed from: g.g.g.d */
/* compiled from: ExceptionCatcher */
public class C10875d {

    /* renamed from: a */
    private C10880i f25771a;

    /* renamed from: b */
    private C10882j f25772b;

    /* renamed from: c */
    private C10817h f25773c;

    public C10875d(C10880i iVar, C10882j jVar, C10817h hVar) {
        this.f25771a = iVar;
        this.f25771a.mo27989b("ExceptionCatcher");
        this.f25772b = jVar;
        this.f25773c = hVar;
    }

    /* renamed from: a */
    public <V> void mo27986a(Callable<V> callable, String str) throws C10815f {
        try {
            callable.call();
        } catch (Exception e) {
            if (!this.f25773c.f25585b) {
                m34311a(str, e);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Conviva Internal Failure ");
            sb.append(str);
            throw new C10815f(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private void m34311a(String str, Exception exc) {
        try {
            C10882j jVar = this.f25772b;
            StringBuilder sb = new StringBuilder();
            sb.append("Uncaught exception: ");
            sb.append(str);
            sb.append(": ");
            sb.append(exc.toString());
            jVar.mo27997a(sb.toString());
        } catch (Exception e) {
            C10880i iVar = this.f25771a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Caught exception while sending ping: ");
            sb2.append(e.toString());
            iVar.mo27988a(sb2.toString());
        }
    }
}
