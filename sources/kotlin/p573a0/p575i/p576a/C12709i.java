package kotlin.p573a0.p575i.p576a;

import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "()V", "cache", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "notOnJava9", "buildCache", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getModuleName", "", "Cache", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.a0.i.a.i */
/* compiled from: DebugMetadata.kt */
final class C12709i {

    /* renamed from: a */
    private static final C12710a f29396a = new C12710a(null, null, null);

    /* renamed from: b */
    public static C12710a f29397b;

    /* renamed from: c */
    public static final C12709i f29398c = new C12709i();

    /* renamed from: kotlin.a0.i.a.i$a */
    /* compiled from: DebugMetadata.kt */
    private static final class C12710a {

        /* renamed from: a */
        public final Method f29399a;

        /* renamed from: b */
        public final Method f29400b;

        /* renamed from: c */
        public final Method f29401c;

        public C12710a(Method method, Method method2, Method method3) {
            this.f29399a = method;
            this.f29400b = method2;
            this.f29401c = method3;
        }
    }

    private C12709i() {
    }

    /* renamed from: b */
    private final C12710a m39848b(C12701a aVar) {
        try {
            C12710a aVar2 = new C12710a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f29397b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C12710a aVar3 = f29396a;
            f29397b = aVar3;
            return aVar3;
        }
    }

    /* renamed from: a */
    public final String mo31057a(C12701a aVar) {
        C12710a aVar2 = f29397b;
        if (aVar2 == null) {
            aVar2 = m39848b(aVar);
        }
        if (aVar2 == f29396a) {
            return null;
        }
        Method method = aVar2.f29399a;
        if (method != null) {
            Object invoke = method.invoke(aVar.getClass(), new Object[0]);
            if (invoke != null) {
                Method method2 = aVar2.f29400b;
                if (method2 != null) {
                    Object invoke2 = method2.invoke(invoke, new Object[0]);
                    if (invoke2 != null) {
                        Method method3 = aVar2.f29401c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (!(invoke3 instanceof String)) {
                            invoke3 = null;
                        }
                        return (String) invoke3;
                    }
                }
            }
        }
        return null;
    }
}
