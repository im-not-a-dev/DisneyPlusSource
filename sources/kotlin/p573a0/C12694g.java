package kotlin.p573a0;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12693c;

/* renamed from: kotlin.a0.g */
/* compiled from: CoroutineContextImpl.kt */
public final class C12694g implements C12688f, Serializable {

    /* renamed from: c */
    public static final C12694g f29383c = new C12694g();

    private C12694g() {
    }

    public <R> R fold(R r, Function2<? super R, ? super C12691b, ? extends R> function2) {
        return r;
    }

    public <E extends C12691b> E get(C12693c<E> cVar) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C12688f minusKey(C12693c<?> cVar) {
        return this;
    }

    public C12688f plus(C12688f fVar) {
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
