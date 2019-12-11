package kotlinx.coroutines;

import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;

/* renamed from: kotlinx.coroutines.a */
/* compiled from: AbstractCoroutine.kt */
public abstract class C13210a<T> extends C13391r1 implements C13324k1, C12683c<T>, C13233e0 {

    /* renamed from: U */
    private final C12688f f29645U = this.f29646V.plus(this);

    /* renamed from: V */
    protected final C12688f f29646V;

    public C13210a(C12688f fVar, boolean z) {
        super(z);
        this.f29646V = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34328a(Throwable th, boolean z) {
    }

    /* renamed from: a */
    public boolean mo34330a() {
        return super.mo34330a();
    }

    /* renamed from: b */
    public final C12688f mo31038b() {
        return this.f29645U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo34331d(Object obj) {
        if (obj instanceof C13389r) {
            C13389r rVar = (C13389r) obj;
            mo34328a(rVar.f29880a, rVar.mo34581a());
            return;
        }
        mo34333e(obj);
    }

    /* renamed from: e */
    public C12688f mo34332e() {
        return this.f29645U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo34333e(T t) {
    }

    /* renamed from: f */
    public final void mo34334f(Throwable th) {
        C13218b0.m40651a(this.f29645U, th);
    }

    /* renamed from: o */
    public String mo34335o() {
        String a = C13415y.m41266a(this.f29645U);
        if (a == null) {
            return super.mo34335o();
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(a);
        sb.append("\":");
        sb.append(super.mo34335o());
        return sb.toString();
    }

    /* renamed from: p */
    public final void mo34336p() {
        mo34339t();
    }

    /* renamed from: r */
    public int mo34337r() {
        return 0;
    }

    /* renamed from: s */
    public final void mo34338s() {
        mo34585a((C13324k1) this.f29646V.get(C13324k1.f29761e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo34339t() {
    }

    /* renamed from: a */
    public final <R> void mo34329a(C13246h0 h0Var, R r, Function2<? super R, ? super C12683c<? super T>, ? extends Object> function2) {
        mo34338s();
        h0Var.mo34387a(function2, r, this);
    }

    /* renamed from: b */
    public final void mo31039b(Object obj) {
        mo34588b(C13395s.m41218a(obj), mo34337r());
    }
}
