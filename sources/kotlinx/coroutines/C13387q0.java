package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.internal.C13278p;
import kotlinx.coroutines.internal.C13283u;
import kotlinx.coroutines.p595m2.C13356i;
import kotlinx.coroutines.p595m2.C13357j;

/* renamed from: kotlinx.coroutines.q0 */
/* compiled from: Dispatched.kt */
public abstract class C13387q0<T> extends C13356i {

    /* renamed from: V */
    public int f29877V;

    public C13387q0(int i) {
        this.f29877V = i;
    }

    /* renamed from: a */
    public final Throwable mo34578a(Object obj) {
        if (!(obj instanceof C13389r)) {
            obj = null;
        }
        C13389r rVar = (C13389r) obj;
        if (rVar != null) {
            return rVar.f29880a;
        }
        return null;
    }

    /* renamed from: a */
    public void mo34391a(Object obj, Throwable th) {
    }

    /* renamed from: c */
    public abstract C12683c<T> mo34393c();

    /* renamed from: d */
    public abstract Object mo34394d();

    /* renamed from: d */
    public <T> T mo34395d(Object obj) {
        return obj;
    }

    public final void run() {
        Object obj;
        C12688f b;
        Object b2;
        Object obj2;
        C13357j jVar = this.f29834U;
        try {
            C12683c c = mo34393c();
            if (c != null) {
                C13364n0 n0Var = (C13364n0) c;
                C12683c<T> cVar = n0Var.f29855a0;
                b = cVar.mo31038b();
                Object d = mo34394d();
                b2 = C13283u.m40837b(b, n0Var.f29853Y);
                Throwable a = mo34578a(d);
                C13324k1 k1Var = C13213a2.m40643a(this.f29877V) ? (C13324k1) b.get(C13324k1.f29761e) : null;
                if (a == null && k1Var != null && !k1Var.mo34330a()) {
                    CancellationException c2 = k1Var.mo34507c();
                    mo34391a(d, (Throwable) c2);
                    C12901a aVar = C12900n.f29540c;
                    Object a2 = C12903o.m40240a(C13278p.m40811a(c2, cVar));
                    C12900n.m40236a(a2);
                    cVar.mo31039b(a2);
                } else if (a != null) {
                    C12901a aVar2 = C12900n.f29540c;
                    Object a3 = C12903o.m40240a(C13278p.m40811a(a, cVar));
                    C12900n.m40236a(a3);
                    cVar.mo31039b(a3);
                } else {
                    Object d2 = mo34395d(d);
                    C12901a aVar3 = C12900n.f29540c;
                    C12900n.m40236a(d2);
                    cVar.mo31039b(d2);
                }
                C13145v vVar = C13145v.f29587a;
                C13283u.m40836a(b, b2);
                try {
                    C12901a aVar4 = C12900n.f29540c;
                    jVar.mo34546b();
                    obj2 = C13145v.f29587a;
                    C12900n.m40236a(obj2);
                } catch (Throwable th) {
                    C12901a aVar5 = C12900n.f29540c;
                    obj2 = C12903o.m40240a(th);
                    C12900n.m40236a(obj2);
                }
                mo34579a((Throwable) null, C12900n.m40237b(obj2));
                return;
            }
            throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                C12901a aVar6 = C12900n.f29540c;
                jVar.mo34546b();
                obj = C13145v.f29587a;
                C12900n.m40236a(obj);
            } catch (Throwable th3) {
                C12901a aVar7 = C12900n.f29540c;
                obj = C12903o.m40240a(th3);
                C12900n.m40236a(obj);
            }
            mo34579a(th2, C12900n.m40237b(obj));
        }
    }

    /* renamed from: a */
    public final void mo34579a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C12722c.m39860a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fatal exception in coroutines machinery for ");
            sb.append(this);
            sb.append(". ");
            sb.append("Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
            String sb2 = sb.toString();
            if (th != null) {
                C13218b0.m40651a(mo34393c().mo31038b(), (Throwable) new C13250i0(sb2, th));
                return;
            }
            Intrinsics.throwNpe();
            throw null;
        }
    }
}
