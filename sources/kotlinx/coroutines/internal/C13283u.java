package kotlinx.coroutines.internal;

import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12688f.C12691b;
import kotlinx.coroutines.C13225c2;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"ZERO", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "restoreState", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.internal.u */
/* compiled from: ThreadContext.kt */
public final class C13283u {

    /* renamed from: a */
    private static final C13279q f29715a = new C13279q("ZERO");

    /* renamed from: b */
    private static final Function2<Object, C12691b, Object> f29716b = C13284a.f29720c;

    /* renamed from: c */
    private static final Function2<C13225c2<?>, C12691b, C13225c2<?>> f29717c = C13285b.f29721c;

    /* renamed from: d */
    private static final Function2<C13290x, C12691b, C13290x> f29718d = C13287d.f29723c;

    /* renamed from: e */
    private static final Function2<C13290x, C12691b, C13290x> f29719e = C13286c.f29722c;

    /* renamed from: kotlinx.coroutines.internal.u$a */
    /* compiled from: ThreadContext.kt */
    static final class C13284a extends C12881k implements Function2<Object, C12691b, Object> {

        /* renamed from: c */
        public static final C13284a f29720c = new C13284a();

        C13284a() {
            super(2);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.a0.f$b, code=java.lang.Object, for r3v0, types: [java.lang.Object, kotlin.a0.f$b] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            /*
                r1 = this;
                boolean r0 = r3 instanceof kotlinx.coroutines.C13225c2
                if (r0 == 0) goto L_0x001d
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 != 0) goto L_0x0009
                r2 = 0
            L_0x0009:
                java.lang.Integer r2 = (java.lang.Integer) r2
                r0 = 1
                if (r2 == 0) goto L_0x0013
                int r2 = r2.intValue()
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                if (r2 != 0) goto L_0x0017
                goto L_0x001c
            L_0x0017:
                int r2 = r2 + r0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            L_0x001c:
                return r3
            L_0x001d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C13283u.C13284a.invoke(java.lang.Object, kotlin.a0.f$b):java.lang.Object");
        }
    }

    /* renamed from: kotlinx.coroutines.internal.u$b */
    /* compiled from: ThreadContext.kt */
    static final class C13285b extends C12881k implements Function2<C13225c2<?>, C12691b, C13225c2<?>> {

        /* renamed from: c */
        public static final C13285b f29721c = new C13285b();

        C13285b() {
            super(2);
        }

        /* renamed from: a */
        public final C13225c2<?> invoke(C13225c2<?> c2Var, C12691b bVar) {
            if (c2Var != null) {
                return c2Var;
            }
            if (!(bVar instanceof C13225c2)) {
                bVar = null;
            }
            return (C13225c2) bVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.u$c */
    /* compiled from: ThreadContext.kt */
    static final class C13286c extends C12881k implements Function2<C13290x, C12691b, C13290x> {

        /* renamed from: c */
        public static final C13286c f29722c = new C13286c();

        C13286c() {
            super(2);
        }

        /* renamed from: a */
        public final C13290x mo34451a(C13290x xVar, C12691b bVar) {
            if (bVar instanceof C13225c2) {
                ((C13225c2) bVar).mo34357a(xVar.mo34465a(), xVar.mo34468c());
            }
            return xVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            C13290x xVar = (C13290x) obj;
            mo34451a(xVar, (C12691b) obj2);
            return xVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.u$d */
    /* compiled from: ThreadContext.kt */
    static final class C13287d extends C12881k implements Function2<C13290x, C12691b, C13290x> {

        /* renamed from: c */
        public static final C13287d f29723c = new C13287d();

        C13287d() {
            super(2);
        }

        /* renamed from: a */
        public final C13290x mo34452a(C13290x xVar, C12691b bVar) {
            if (bVar instanceof C13225c2) {
                xVar.mo34466a(((C13225c2) bVar).mo34356a(xVar.mo34465a()));
            }
            return xVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            C13290x xVar = (C13290x) obj;
            mo34452a(xVar, (C12691b) obj2);
            return xVar;
        }
    }

    /* renamed from: a */
    public static final Object m40835a(C12688f fVar) {
        Object fold = fVar.fold(Integer.valueOf(0), f29716b);
        if (fold != null) {
            return fold;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: b */
    public static final Object m40837b(C12688f fVar, Object obj) {
        if (obj == null) {
            obj = m40835a(fVar);
        }
        if (obj == Integer.valueOf(0)) {
            return f29715a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new C13290x(fVar, ((Number) obj).intValue()), f29718d);
        }
        if (obj != null) {
            return ((C13225c2) obj).mo34356a(fVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: a */
    public static final void m40836a(C12688f fVar, Object obj) {
        if (obj != f29715a) {
            if (obj instanceof C13290x) {
                ((C13290x) obj).mo34467b();
                fVar.fold(obj, f29719e);
            } else {
                Object fold = fVar.fold(null, f29717c);
                if (fold != null) {
                    ((C13225c2) fold).mo34357a(fVar, obj);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                }
            }
        }
    }
}
