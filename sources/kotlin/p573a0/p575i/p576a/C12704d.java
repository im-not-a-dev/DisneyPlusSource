package kotlin.p573a0.p575i.p576a;

import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12684d;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12688f.C12691b;

/* renamed from: kotlin.a0.i.a.d */
/* compiled from: ContinuationImpl.kt */
public abstract class C12704d extends C12701a {

    /* renamed from: U */
    private transient C12683c<Object> f29394U;

    /* renamed from: V */
    private final C12688f f29395V;

    public C12704d(C12683c<Object> cVar, C12688f fVar) {
        super(cVar);
        this.f29395V = fVar;
    }

    /* renamed from: b */
    public C12688f mo31038b() {
        C12688f fVar = this.f29395V;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo31046c() {
        C12683c<Object> cVar = this.f29394U;
        if (!(cVar == null || cVar == this)) {
            C12691b bVar = mo31038b().get(C12684d.f29380b);
            if (bVar != null) {
                ((C12684d) bVar).mo31040a(cVar);
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        }
        this.f29394U = C12703c.f29393c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 != 0) goto L_0x001b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.p573a0.C12683c<java.lang.Object> mo31051d() {
        /*
            r2 = this;
            kotlin.a0.c<java.lang.Object> r0 = r2.f29394U
            if (r0 == 0) goto L_0x0005
            goto L_0x001d
        L_0x0005:
            kotlin.a0.f r0 = r2.mo31038b()
            kotlin.a0.d$b r1 = kotlin.p573a0.C12684d.f29380b
            kotlin.a0.f$b r0 = r0.get(r1)
            kotlin.a0.d r0 = (kotlin.p573a0.C12684d) r0
            if (r0 == 0) goto L_0x001a
            kotlin.a0.c r0 = r0.mo31041b(r2)
            if (r0 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            r2.f29394U = r0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p573a0.p575i.p576a.C12704d.mo31051d():kotlin.a0.c");
    }

    public C12704d(C12683c<Object> cVar) {
        this(cVar, cVar != null ? cVar.mo31038b() : null);
    }
}
