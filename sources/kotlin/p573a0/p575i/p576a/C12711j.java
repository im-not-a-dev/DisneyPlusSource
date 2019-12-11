package kotlin.p573a0.p575i.p576a;

import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12694g;

/* renamed from: kotlin.a0.i.a.j */
/* compiled from: ContinuationImpl.kt */
public abstract class C12711j extends C12701a {
    public C12711j(C12683c<Object> cVar) {
        super(cVar);
        if (cVar != null) {
            if (!(cVar.mo31038b() == C12694g.f29383c)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    /* renamed from: b */
    public C12688f mo31038b() {
        return C12694g.f29383c;
    }
}
