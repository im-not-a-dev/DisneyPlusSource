package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.p575i.p576a.C12705e;
import kotlinx.coroutines.C13324k1.C13325a;
import kotlinx.coroutines.internal.C13278p;

/* renamed from: kotlinx.coroutines.i */
/* compiled from: CancellableContinuationImpl.kt */
public class C13249i<T> extends C13387q0<T> implements C13244h<T>, C12705e {

    /* renamed from: Y */
    private static final AtomicIntegerFieldUpdater f29671Y = AtomicIntegerFieldUpdater.newUpdater(C13249i.class, "_decision");

    /* renamed from: Z */
    private static final AtomicReferenceFieldUpdater f29672Z = AtomicReferenceFieldUpdater.newUpdater(C13249i.class, Object.class, "_state");

    /* renamed from: W */
    private final C12688f f29673W = this.f29674X.mo31038b();

    /* renamed from: X */
    private final C12683c<T> f29674X;
    private volatile int _decision = 0;
    private volatile Object _state = C13217b.f29651c;
    private volatile C13396s0 parentHandle;

    public C13249i(C12683c<? super T> cVar, int i) {
        super(i);
        this.f29674X = cVar;
    }

    /* renamed from: k */
    private final void m40711k() {
        C13396s0 s0Var = this.parentHandle;
        if (s0Var != null) {
            s0Var.dispose();
            this.parentHandle = C13411w1.f29910c;
        }
    }

    /* renamed from: l */
    private final void m40712l() {
        if (!mo34398i()) {
            C13324k1 k1Var = (C13324k1) this.f29674X.mo31038b().get(C13324k1.f29761e);
            if (k1Var != null) {
                k1Var.start();
                C13396s0 a = C13325a.m40948a(k1Var, true, false, new C13329l(k1Var, this), 2, null);
                this.parentHandle = a;
                if (mo34398i()) {
                    a.dispose();
                    this.parentHandle = C13411w1.f29910c;
                }
            }
        }
    }

    /* renamed from: m */
    private final boolean m40713m() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f29671Y.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: n */
    private final boolean m40714n() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f29671Y.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: a */
    public void mo34391a(Object obj, Throwable th) {
        if (obj instanceof C13401u) {
            try {
                ((C13401u) obj).f29900b.invoke(th);
            } catch (Throwable th2) {
                C12688f b = mo31038b();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C13218b0.m40651a(b, (Throwable) new C13409w(sb.toString(), th2));
            }
        }
    }

    /* renamed from: b */
    public C12688f mo31038b() {
        return this.f29673W;
    }

    /* renamed from: c */
    public final C12683c<T> mo34393c() {
        return this.f29674X;
    }

    /* renamed from: d */
    public Object mo34394d() {
        return mo34397h();
    }

    /* renamed from: e */
    public final Object mo34396e() {
        m40712l();
        if (m40714n()) {
            return C12700d.m39820a();
        }
        Object h = mo34397h();
        if (!(h instanceof C13389r)) {
            if (this.f29877V == 1) {
                C13324k1 k1Var = (C13324k1) mo31038b().get(C13324k1.f29761e);
                if (k1Var != null && !k1Var.mo34330a()) {
                    CancellationException c = k1Var.mo34507c();
                    mo34391a(h, (Throwable) c);
                    throw C13278p.m40811a(c, (C12683c<?>) this);
                }
            }
            return mo34395d(h);
        }
        throw C13278p.m40811a(((C13389r) h).f29880a, (C12683c<?>) this);
    }

    /* renamed from: f */
    public C12705e mo31047f() {
        C12683c<T> cVar = this.f29674X;
        if (!(cVar instanceof C12705e)) {
            cVar = null;
        }
        return (C12705e) cVar;
    }

    /* renamed from: g */
    public StackTraceElement mo31048g() {
        return null;
    }

    /* renamed from: h */
    public final Object mo34397h() {
        return this._state;
    }

    /* renamed from: i */
    public boolean mo34398i() {
        return !(mo34397h() instanceof C13414x1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo34399j() {
        return "CancellableContinuation";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo34399j());
        sb.append('(');
        sb.append(C13323k0.m40938a(this.f29674X));
        sb.append("){");
        sb.append(mo34397h());
        sb.append("}@");
        sb.append(C13323k0.m40939b(this));
        return sb.toString();
    }

    /* renamed from: b */
    public void mo31039b(Object obj) {
        m40706a(C13395s.m41218a(obj), this.f29877V);
    }

    /* renamed from: c */
    public void mo34386c(Object obj) {
        m40707a(this.f29877V);
    }

    /* renamed from: d */
    public <T> T mo34395d(Object obj) {
        if (obj instanceof C13398t) {
            return ((C13398t) obj).f29895b;
        }
        return obj instanceof C13401u ? ((C13401u) obj).f29899a : obj;
    }

    /* renamed from: b */
    private final C13236f m40709b(Function1<? super Throwable, C13145v> function1) {
        return function1 instanceof C13236f ? (C13236f) function1 : new C13247h1(function1);
    }

    /* renamed from: b */
    public boolean mo34392b(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C13414x1)) {
                return false;
            }
            z = obj instanceof C13236f;
        } while (!f29672Z.compareAndSet(this, obj, new C13322k(this, th, z)));
        if (z) {
            try {
                ((C13236f) obj).mo34381a(th);
            } catch (Throwable th2) {
                C12688f b = mo31038b();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C13218b0.m40651a(b, (Throwable) new C13409w(sb.toString(), th2));
            }
        }
        m40711k();
        m40707a(0);
        return true;
    }

    /* renamed from: a */
    public Throwable mo34390a(C13324k1 k1Var) {
        return k1Var.mo34507c();
    }

    /* renamed from: a */
    public void mo34384a(T t, Function1<? super Throwable, C13145v> function1) {
        C13322k a = m40706a((Object) new C13401u(t, function1), this.f29877V);
        if (a != null) {
            try {
                function1.invoke(a.f29880a);
            } catch (Throwable th) {
                C12688f b = mo31038b();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C13218b0.m40651a(b, (Throwable) new C13409w(sb.toString(), th));
            }
        }
    }

    /* renamed from: a */
    private final void m40708a(Function1<? super Throwable, C13145v> function1, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(function1);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    private final void m40707a(int i) {
        if (!m40713m()) {
            C13384p0.m41129a((C13387q0<? super T>) this, i);
        }
    }

    /* renamed from: e */
    private final void m40710e(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Already resumed, but proposed with update ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public void mo34385a(Function1<? super Throwable, C13145v> function1) {
        Object obj;
        Throwable th = null;
        Object obj2 = null;
        do {
            obj = this._state;
            if (obj instanceof C13217b) {
                if (obj2 == null) {
                    obj2 = m40709b(function1);
                }
            } else if (obj instanceof C13236f) {
                m40708a(function1, obj);
                throw null;
            } else if (!(obj instanceof C13322k)) {
                return;
            } else {
                if (((C13322k) obj).mo34582b()) {
                    try {
                        if (!(obj instanceof C13389r)) {
                            obj = null;
                        }
                        C13389r rVar = (C13389r) obj;
                        if (rVar != null) {
                            th = rVar.f29880a;
                        }
                        function1.invoke(th);
                    } catch (Throwable th2) {
                        C12688f b = mo31038b();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in cancellation handler for ");
                        sb.append(this);
                        C13218b0.m40651a(b, (Throwable) new C13409w(sb.toString(), th2));
                    }
                    return;
                }
                m40708a(function1, obj);
                throw null;
            }
        } while (!f29672Z.compareAndSet(this, obj, obj2));
    }

    /* renamed from: a */
    private final C13322k m40706a(Object obj, int i) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof C13414x1)) {
                if (obj2 instanceof C13322k) {
                    C13322k kVar = (C13322k) obj2;
                    if (kVar.mo34503c()) {
                        return kVar;
                    }
                }
                m40710e(obj);
                throw null;
            }
        } while (!f29672Z.compareAndSet(this, obj2, obj));
        m40711k();
        m40707a(i);
        return null;
    }

    /* renamed from: a */
    public Object mo34382a(T t, Object obj) {
        Object obj2;
        T t2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof C13414x1)) {
                C13414x1 x1Var = null;
                if (obj2 instanceof C13398t) {
                    C13398t tVar = (C13398t) obj2;
                    if (tVar.f29894a == obj) {
                        if (C13292j0.m40863a()) {
                            if (!(tVar.f29895b == t)) {
                                throw new AssertionError();
                            }
                        }
                        x1Var = tVar.f29896c;
                    }
                }
                return x1Var;
            } else if (obj == null) {
                t2 = t;
            } else {
                t2 = new C13398t(obj, t, (C13414x1) obj2);
            }
        } while (!f29672Z.compareAndSet(this, obj2, t2));
        m40711k();
        return obj2;
    }

    /* renamed from: a */
    public Object mo34383a(Throwable th) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof C13414x1)) {
                return null;
            }
        } while (!f29672Z.compareAndSet(this, obj, new C13389r(th, false, 2, null)));
        m40711k();
        return obj;
    }
}
