package kotlin.p573a0;

import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12691b.C12692a;
import kotlin.p573a0.C12688f.C12693c;

/* renamed from: kotlin.a0.a */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C12680a implements C12691b {
    private final C12693c<?> key;

    public C12680a(C12693c<?> cVar) {
        this.key = cVar;
    }

    public <R> R fold(R r, Function2<? super R, ? super C12691b, ? extends R> function2) {
        return C12692a.m39809a(this, r, function2);
    }

    public <E extends C12691b> E get(C12693c<E> cVar) {
        return C12692a.m39810a((C12691b) this, cVar);
    }

    public C12693c<?> getKey() {
        return this.key;
    }

    public C12688f minusKey(C12693c<?> cVar) {
        return C12692a.m39812b(this, cVar);
    }

    public C12688f plus(C12688f fVar) {
        return C12692a.m39811a((C12691b) this, fVar);
    }
}
