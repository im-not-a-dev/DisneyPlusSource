package kotlinx.coroutines;

import kotlin.C13145v;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.p575i.p576a.C12705e;
import kotlinx.coroutines.internal.C13283u;

/* renamed from: kotlinx.coroutines.n0 */
/* compiled from: Dispatched.kt */
public final class C13364n0<T> extends C13387q0<T> implements C12705e, C12683c<T> {

    /* renamed from: W */
    public Object f29851W = C13384p0.f29876a;

    /* renamed from: X */
    private final C12705e f29852X;

    /* renamed from: Y */
    public final Object f29853Y;

    /* renamed from: Z */
    public final C13418z f29854Z;

    /* renamed from: a0 */
    public final C12683c<T> f29855a0;

    public C13364n0(C13418z zVar, C12683c<? super T> cVar) {
        super(0);
        this.f29854Z = zVar;
        this.f29855a0 = cVar;
        C12683c<T> cVar2 = this.f29855a0;
        if (!(cVar2 instanceof C12705e)) {
            cVar2 = null;
        }
        this.f29852X = (C12705e) cVar2;
        this.f29853Y = C13283u.m40835a(mo31038b());
    }

    /* renamed from: b */
    public C12688f mo31038b() {
        return this.f29855a0.mo31038b();
    }

    /* renamed from: b */
    public void mo31039b(Object obj) {
        C12688f b;
        Object b2;
        C12688f b3 = this.f29855a0.mo31038b();
        Object a = C13395s.m41218a(obj);
        if (this.f29854Z.mo34349b(b3)) {
            this.f29851W = a;
            this.f29877V = 0;
            this.f29854Z.mo34340a(b3, this);
            return;
        }
        C13402u0 a2 = C13231d2.f29660b.mo34367a();
        if (a2.mo34613g()) {
            this.f29851W = a;
            this.f29877V = 0;
            a2.mo34609a((C13387q0<?>) this);
            return;
        }
        a2.mo34611b(true);
        try {
            b = mo31038b();
            b2 = C13283u.m40837b(b, this.f29853Y);
            this.f29855a0.mo31039b(obj);
            C13145v vVar = C13145v.f29587a;
            C13283u.m40836a(b, b2);
            do {
            } while (a2.mo34615i());
        } catch (Throwable th) {
            try {
                mo34579a(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.mo34610a(true);
                throw th2;
            }
        }
        a2.mo34610a(true);
    }

    /* renamed from: c */
    public C12683c<T> mo34393c() {
        return this;
    }

    /* renamed from: d */
    public Object mo34394d() {
        Object obj = this.f29851W;
        if (C13292j0.m40863a()) {
            if (!(obj != C13384p0.f29876a)) {
                throw new AssertionError();
            }
        }
        this.f29851W = C13384p0.f29876a;
        return obj;
    }

    /* renamed from: f */
    public C12705e mo31047f() {
        return this.f29852X;
    }

    /* renamed from: g */
    public StackTraceElement mo31048g() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.f29854Z);
        sb.append(", ");
        sb.append(C13323k0.m40938a(this.f29855a0));
        sb.append(']');
        return sb.toString();
    }
}
