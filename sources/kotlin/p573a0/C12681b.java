package kotlin.p573a0;

import java.io.Serializable;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.p573a0.C12688f.C12689a;
import kotlin.p573a0.C12688f.C12691b;
import kotlin.p573a0.C12688f.C12693c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo31007d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.a0.b */
/* compiled from: CoroutineContextImpl.kt */
public final class C12681b implements C12688f, Serializable {

    /* renamed from: U */
    private final C12691b f29377U;

    /* renamed from: c */
    private final C12688f f29378c;

    /* renamed from: kotlin.a0.b$a */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C12682a extends C12881k implements Function2<String, C12691b, String> {

        /* renamed from: c */
        public static final C12682a f29379c = new C12682a();

        C12682a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, C12691b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(bVar);
            return sb.toString();
        }
    }

    public C12681b(C12688f fVar, C12691b bVar) {
        this.f29378c = fVar;
        this.f29377U = bVar;
    }

    /* renamed from: a */
    private final boolean m39796a(C12691b bVar) {
        return C12880j.m40224a((Object) get(bVar.getKey()), (Object) bVar);
    }

    /* renamed from: b */
    private final int m39797b() {
        int i = 2;
        C12681b bVar = this;
        while (true) {
            C12688f fVar = bVar.f29378c;
            if (!(fVar instanceof C12681b)) {
                fVar = null;
            }
            bVar = (C12681b) fVar;
            if (bVar == null) {
                return i;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r3.m39795a(r2) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001b
            boolean r0 = r3 instanceof kotlin.p573a0.C12681b
            if (r0 == 0) goto L_0x0019
            kotlin.a0.b r3 = (kotlin.p573a0.C12681b) r3
            int r0 = r3.m39797b()
            int r1 = r2.m39797b()
            if (r0 != r1) goto L_0x0019
            boolean r3 = r3.m39795a(r2)
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p573a0.C12681b.equals(java.lang.Object):boolean");
    }

    public <R> R fold(R r, Function2<? super R, ? super C12691b, ? extends R> function2) {
        return function2.invoke(this.f29378c.fold(r, function2), this.f29377U);
    }

    public <E extends C12691b> E get(C12693c<E> cVar) {
        C12681b bVar = this;
        while (true) {
            E e = bVar.f29377U.get(cVar);
            if (e != null) {
                return e;
            }
            C12688f fVar = bVar.f29378c;
            if (!(fVar instanceof C12681b)) {
                return fVar.get(cVar);
            }
            bVar = (C12681b) fVar;
        }
    }

    public int hashCode() {
        return this.f29378c.hashCode() + this.f29377U.hashCode();
    }

    public C12688f minusKey(C12693c<?> cVar) {
        C12688f fVar;
        if (this.f29377U.get(cVar) != null) {
            return this.f29378c;
        }
        C12688f minusKey = this.f29378c.minusKey(cVar);
        if (minusKey == this.f29378c) {
            fVar = this;
        } else if (minusKey == C12694g.f29383c) {
            fVar = this.f29377U;
        } else {
            fVar = new C12681b(minusKey, this.f29377U);
        }
        return fVar;
    }

    public C12688f plus(C12688f fVar) {
        return C12689a.m39807a(this, fVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append((String) fold("", C12682a.f29379c));
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    private final boolean m39795a(C12681b bVar) {
        while (m39796a(bVar.f29377U)) {
            C12688f fVar = bVar.f29378c;
            if (fVar instanceof C12681b) {
                bVar = (C12681b) fVar;
            } else if (fVar != null) {
                return m39796a((C12691b) fVar);
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }
}
