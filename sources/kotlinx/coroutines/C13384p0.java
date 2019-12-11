package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C13145v;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.internal.C13278p;
import kotlinx.coroutines.internal.C13279q;
import kotlinx.coroutines.internal.C13283u;

/* renamed from: kotlinx.coroutines.p0 */
/* compiled from: Dispatched.kt */
public final class C13384p0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C13279q f29876a = new C13279q("UNDEFINED");

    /* renamed from: b */
    public static final <T> void m41131b(C12683c<? super T> cVar, T t) {
        if (cVar instanceof C13364n0) {
            C12683c<T> cVar2 = ((C13364n0) cVar).f29855a0;
            C12901a aVar = C12900n.f29540c;
            C12900n.m40236a(t);
            cVar2.mo31039b(t);
            return;
        }
        C12901a aVar2 = C12900n.f29540c;
        C12900n.m40236a(t);
        cVar.mo31039b(t);
    }

    /* renamed from: a */
    private static final void m41128a(C13387q0<?> q0Var) {
        C13402u0 a = C13231d2.f29660b.mo34367a();
        if (a.mo34613g()) {
            a.mo34609a(q0Var);
            return;
        }
        a.mo34611b(true);
        try {
            m41130a(q0Var, q0Var.mo34393c(), 3);
            do {
            } while (a.mo34615i());
        } catch (Throwable th) {
            a.mo34610a(true);
            throw th;
        }
        a.mo34610a(true);
    }

    /* renamed from: b */
    public static final <T> void m41132b(C12683c<? super T> cVar, Throwable th) {
        if (cVar instanceof C13364n0) {
            C12683c<T> cVar2 = ((C13364n0) cVar).f29855a0;
            C12901a aVar = C12900n.f29540c;
            Object a = C12903o.m40240a(C13278p.m40811a(th, cVar2));
            C12900n.m40236a(a);
            cVar2.mo31039b(a);
            return;
        }
        C12901a aVar2 = C12900n.f29540c;
        Object a2 = C12903o.m40240a(C13278p.m40811a(th, cVar));
        C12900n.m40236a(a2);
        cVar.mo31039b(a2);
    }

    /* renamed from: a */
    public static final <T> void m41126a(C12683c<? super T> cVar, T t) {
        boolean z;
        C12688f b;
        Object b2;
        if (cVar instanceof C13364n0) {
            C13364n0 n0Var = (C13364n0) cVar;
            if (n0Var.f29854Z.mo34349b(n0Var.mo31038b())) {
                n0Var.f29851W = t;
                n0Var.f29877V = 1;
                n0Var.f29854Z.mo34340a(n0Var.mo31038b(), n0Var);
                return;
            }
            C13402u0 a = C13231d2.f29660b.mo34367a();
            if (a.mo34613g()) {
                n0Var.f29851W = t;
                n0Var.f29877V = 1;
                a.mo34609a((C13387q0<?>) n0Var);
                return;
            }
            a.mo34611b(true);
            try {
                C13324k1 k1Var = (C13324k1) n0Var.mo31038b().get(C13324k1.f29761e);
                if (k1Var == null || k1Var.mo34330a()) {
                    z = false;
                } else {
                    CancellationException c = k1Var.mo34507c();
                    C12901a aVar = C12900n.f29540c;
                    Object a2 = C12903o.m40240a((Throwable) c);
                    C12900n.m40236a(a2);
                    n0Var.mo31039b(a2);
                    z = true;
                }
                if (!z) {
                    b = n0Var.mo31038b();
                    b2 = C13283u.m40837b(b, n0Var.f29853Y);
                    C12683c<T> cVar2 = n0Var.f29855a0;
                    C12901a aVar2 = C12900n.f29540c;
                    C12900n.m40236a(t);
                    cVar2.mo31039b(t);
                    C13145v vVar = C13145v.f29587a;
                    C13283u.m40836a(b, b2);
                }
                do {
                } while (a.mo34615i());
            } catch (Throwable th) {
                try {
                    n0Var.mo34579a(th, (Throwable) null);
                } catch (Throwable th2) {
                    a.mo34610a(true);
                    throw th2;
                }
            }
            a.mo34610a(true);
            return;
        }
        C12901a aVar3 = C12900n.f29540c;
        C12900n.m40236a(t);
        cVar.mo31039b(t);
    }

    /* renamed from: a */
    public static final <T> void m41127a(C12683c<? super T> cVar, Throwable th) {
        C12688f b;
        Object b2;
        if (cVar instanceof C13364n0) {
            C13364n0 n0Var = (C13364n0) cVar;
            C12688f b3 = n0Var.f29855a0.mo31038b();
            boolean z = false;
            C13389r rVar = new C13389r(th, false, 2, null);
            if (n0Var.f29854Z.mo34349b(b3)) {
                n0Var.f29851W = new C13389r(th, false, 2, null);
                n0Var.f29877V = 1;
                n0Var.f29854Z.mo34340a(b3, n0Var);
                return;
            }
            C13402u0 a = C13231d2.f29660b.mo34367a();
            if (a.mo34613g()) {
                n0Var.f29851W = rVar;
                n0Var.f29877V = 1;
                a.mo34609a((C13387q0<?>) n0Var);
                return;
            }
            a.mo34611b(true);
            try {
                C13324k1 k1Var = (C13324k1) n0Var.mo31038b().get(C13324k1.f29761e);
                if (k1Var != null && !k1Var.mo34330a()) {
                    CancellationException c = k1Var.mo34507c();
                    C12901a aVar = C12900n.f29540c;
                    Object a2 = C12903o.m40240a((Throwable) c);
                    C12900n.m40236a(a2);
                    n0Var.mo31039b(a2);
                    z = true;
                }
                if (!z) {
                    b = n0Var.mo31038b();
                    b2 = C13283u.m40837b(b, n0Var.f29853Y);
                    C12683c<T> cVar2 = n0Var.f29855a0;
                    C12901a aVar2 = C12900n.f29540c;
                    Object a3 = C12903o.m40240a(C13278p.m40811a(th, cVar2));
                    C12900n.m40236a(a3);
                    cVar2.mo31039b(a3);
                    C13145v vVar = C13145v.f29587a;
                    C13283u.m40836a(b, b2);
                }
                do {
                } while (a.mo34615i());
            } catch (Throwable th2) {
                try {
                    n0Var.mo34579a(th2, (Throwable) null);
                } catch (Throwable th3) {
                    a.mo34610a(true);
                    throw th3;
                }
            }
            a.mo34610a(true);
            return;
        }
        C12901a aVar3 = C12900n.f29540c;
        Object a4 = C12903o.m40240a(C13278p.m40811a(th, cVar));
        C12900n.m40236a(a4);
        cVar.mo31039b(a4);
    }

    /* renamed from: a */
    public static final <T> void m41129a(C13387q0<? super T> q0Var, int i) {
        C12683c c = q0Var.mo34393c();
        if (!C13213a2.m40646b(i) || !(c instanceof C13364n0) || C13213a2.m40643a(i) != C13213a2.m40643a(q0Var.f29877V)) {
            m41130a(q0Var, c, i);
            return;
        }
        C13418z zVar = ((C13364n0) c).f29854Z;
        C12688f b = c.mo31038b();
        if (zVar.mo34349b(b)) {
            zVar.mo34340a(b, q0Var);
        } else {
            m41128a(q0Var);
        }
    }

    /* renamed from: a */
    public static final <T> void m41130a(C13387q0<? super T> q0Var, C12683c<? super T> cVar, int i) {
        Object d = q0Var.mo34394d();
        Throwable a = q0Var.mo34578a(d);
        if (a != null) {
            if (!(cVar instanceof C13387q0)) {
                a = C13278p.m40811a(a, cVar);
            }
            C13213a2.m40645b(cVar, a, i);
            return;
        }
        C13213a2.m40641a(cVar, q0Var.mo34395d(d), i);
    }
}
