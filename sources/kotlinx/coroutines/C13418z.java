package kotlinx.coroutines;

import kotlin.p573a0.C12680a;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12684d;
import kotlin.p573a0.C12684d.C12685a;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12693c;

/* renamed from: kotlinx.coroutines.z */
/* compiled from: CoroutineDispatcher.kt */
public abstract class C13418z extends C12680a implements C12684d {
    public C13418z() {
        super(C12684d.f29380b);
    }

    /* renamed from: a */
    public void mo31040a(C12683c<?> cVar) {
        C12685a.m39804a((C12684d) this, cVar);
    }

    /* renamed from: a */
    public abstract void mo34340a(C12688f fVar, Runnable runnable);

    /* renamed from: b */
    public final <T> C12683c<T> mo31041b(C12683c<? super T> cVar) {
        return new C13364n0(this, cVar);
    }

    /* renamed from: b */
    public boolean mo34349b(C12688f fVar) {
        return true;
    }

    public <E extends C12691b> E get(C12693c<E> cVar) {
        return C12685a.m39803a((C12684d) this, cVar);
    }

    public C12688f minusKey(C12693c<?> cVar) {
        return C12685a.m39805b(this, cVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C13323k0.m40937a((Object) this));
        sb.append('@');
        sb.append(C13323k0.m40939b(this));
        return sb.toString();
    }
}
