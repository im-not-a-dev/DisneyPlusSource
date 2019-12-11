package p163g.p449j.p450a.p451a.p467f;

import java.util.concurrent.Executor;

/* renamed from: g.j.a.a.f.l */
final class C11442l<TResult, TContinuationResult> implements C11456z<TResult> {

    /* renamed from: a */
    private final Executor f26778a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11424a<TResult, TContinuationResult> f26779b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11429c0<TContinuationResult> f26780c;

    public C11442l(Executor executor, C11424a<TResult, TContinuationResult> aVar, C11429c0<TContinuationResult> c0Var) {
        this.f26778a = executor;
        this.f26779b = aVar;
        this.f26780c = c0Var;
    }

    /* renamed from: a */
    public final void mo29279a(C11435h<TResult> hVar) {
        this.f26778a.execute(new C11443m(this, hVar));
    }
}
