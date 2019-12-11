package kotlin.p573a0.p575i.p576a;

import java.io.Serializable;
import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C13145v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12683c;

/* renamed from: kotlin.a0.i.a.a */
/* compiled from: ContinuationImpl.kt */
public abstract class C12701a implements C12683c<Object>, C12705e, Serializable {

    /* renamed from: c */
    private final C12683c<Object> f29392c;

    public C12701a(C12683c<Object> cVar) {
        this.f29392c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo5580a(Object obj);

    /* renamed from: a */
    public final C12683c<Object> mo31045a() {
        return this.f29392c;
    }

    /* renamed from: b */
    public final void mo31039b(Object obj) {
        Object obj2 = obj;
        C12701a aVar = this;
        while (true) {
            C12708h.m39846b(aVar);
            C12683c<Object> cVar = aVar.f29392c;
            if (cVar != null) {
                try {
                    obj2 = aVar.mo5580a(obj2);
                    if (obj2 != C12700d.m39820a()) {
                        C12901a aVar2 = C12900n.f29540c;
                        C12900n.m40236a(obj2);
                        aVar.mo31046c();
                        if (cVar instanceof C12701a) {
                            aVar = (C12701a) cVar;
                        } else {
                            cVar.mo31039b(obj2);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    C12901a aVar3 = C12900n.f29540c;
                    obj2 = C12903o.m40240a(th);
                    C12900n.m40236a(obj2);
                }
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo31046c() {
    }

    /* renamed from: f */
    public C12705e mo31047f() {
        C12683c<Object> cVar = this.f29392c;
        if (!(cVar instanceof C12705e)) {
            cVar = null;
        }
        return (C12705e) cVar;
    }

    /* renamed from: g */
    public StackTraceElement mo31048g() {
        return C12707g.m39844c(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object g = mo31048g();
        if (g == null) {
            g = getClass().getName();
        }
        sb.append(g);
        return sb.toString();
    }

    /* renamed from: a */
    public C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
