package kotlinx.coroutines;

import kotlin.C13145v;

/* renamed from: kotlinx.coroutines.n */
/* compiled from: JobSupport.kt */
public final class C13363n extends C13344m1<C13391r1> implements C13342m {

    /* renamed from: X */
    public final C13368o f29850X;

    public C13363n(C13391r1 r1Var, C13368o oVar) {
        super(r1Var);
        this.f29850X = oVar;
    }

    /* renamed from: a */
    public boolean mo34519a(Throwable th) {
        return ((C13391r1) this.f29878W).mo34592d(th);
    }

    /* renamed from: b */
    public void mo34401b(Throwable th) {
        this.f29850X.mo34563a((C13417y1) this.f29878W);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo34401b((Throwable) obj);
        return C13145v.f29587a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildHandle[");
        sb.append(this.f29850X);
        sb.append(']');
        return sb.toString();
    }
}
