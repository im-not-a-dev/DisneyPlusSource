package p163g.p201e.p203b.p307o.p308p;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/error/api/ErrorRouter;", "", "showErrorDialog", "", "throwable", "", "showGlobalError", "errorMessage", "", "showGlobalErrorDialog", "errorApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.o.p.a */
/* compiled from: ErrorRouter.kt */
public interface C7626a {

    /* renamed from: g.e.b.o.p.a$a */
    /* compiled from: ErrorRouter.kt */
    public static final class C7627a {
        /* renamed from: a */
        public static /* synthetic */ void m22614a(C7626a aVar, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                aVar.mo20539a(str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showGlobalError");
        }
    }

    /* renamed from: a */
    void mo20539a(String str);

    /* renamed from: a */
    void mo20540a(Throwable th);
}
