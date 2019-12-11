package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.List;

/* renamed from: g.j.a.a.d.g.a5 */
final class C11026a5 extends C11398z4 {
    private C11026a5() {
        super();
    }

    /* renamed from: c */
    private static <E> C11216m4<E> m34743c(Object obj, long j) {
        return (C11216m4) C11058c7.m34877f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo28269a(Object obj, long j) {
        C11216m4 c = m34743c(obj, j);
        if (c.mo28709h0()) {
            return c;
        }
        int size = c.size();
        C11216m4 a = c.mo28257a(size == 0 ? 10 : size << 1);
        C11058c7.m34854a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo28271b(Object obj, long j) {
        m34743c(obj, j).mo28708g0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo28270a(Object obj, Object obj2, long j) {
        C11216m4 c = m34743c(obj, j);
        C11216m4 c2 = m34743c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo28709h0()) {
                c = c.mo28257a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C11058c7.m34854a(obj, j, (Object) c2);
    }
}
