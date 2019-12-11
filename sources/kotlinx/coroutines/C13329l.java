package kotlinx.coroutines;

import kotlin.C13145v;

/* renamed from: kotlinx.coroutines.l */
/* compiled from: JobSupport.kt */
public final class C13329l extends C13344m1<C13324k1> {

    /* renamed from: X */
    public final C13249i<?> f29763X;

    public C13329l(C13324k1 k1Var, C13249i<?> iVar) {
        super(k1Var);
        this.f29763X = iVar;
    }

    /* renamed from: b */
    public void mo34401b(Throwable th) {
        C13249i<?> iVar = this.f29763X;
        iVar.mo34392b(iVar.mo34390a((C13324k1) this.f29878W));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo34401b((Throwable) obj);
        return C13145v.f29587a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildContinuation[");
        sb.append(this.f29763X);
        sb.append(']');
        return sb.toString();
    }
}
