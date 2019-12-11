package kotlinx.coroutines.p592j2;

import kotlin.C13142s;
import kotlinx.coroutines.internal.C13266g;
import kotlinx.coroutines.internal.C13268i;
import kotlinx.coroutines.p592j2.C13301c.C13302a;

/* renamed from: kotlinx.coroutines.j2.k */
/* compiled from: ConflatedChannel.kt */
public class C13315k<E> extends C13294a<E> {
    /* renamed from: b */
    private final C13319o<?> m40922b(E e) {
        C13268i iVar;
        C13302a aVar = new C13302a(e);
        C13266g d = mo34491d();
        do {
            Object f = d.mo34424f();
            if (f != null) {
                iVar = (C13268i) f;
                if (iVar instanceof C13319o) {
                    return (C13319o) iVar;
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!iVar.mo34421a((C13268i) aVar, (C13268i) d));
        m40921a(aVar);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34487a(C13268i iVar) {
        C13268i g = iVar.mo34425g();
        if (!(g instanceof C13302a)) {
            g = null;
        }
        C13302a aVar = (C13302a) g;
        if (aVar != null) {
            m40921a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo34470g() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo34471h() {
        return true;
    }

    /* renamed from: a */
    private final void m40921a(C13302a<? extends E> aVar) {
        for (C13268i g = aVar.mo34425g(); g instanceof C13302a; g = g.mo34425g()) {
            if (!g.mo34417k()) {
                g.mo34427i();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo34486a(E e) {
        C13319o b;
        do {
            Object a = super.mo34486a(e);
            Object obj = C13300b.f29742a;
            if (a == obj) {
                return obj;
            }
            if (a == C13300b.f29743b) {
                b = m40922b(e);
                if (b == null) {
                    return C13300b.f29742a;
                }
            } else if (a instanceof C13307g) {
                return a;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid offerInternal result ");
                sb.append(a);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!(b instanceof C13307g));
        return b;
    }
}
