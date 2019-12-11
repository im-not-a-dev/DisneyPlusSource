package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Collections;
import java.util.List;

/* renamed from: g.j.a.a.d.g.b5 */
final class C11041b5 extends C11398z4 {

    /* renamed from: c */
    private static final Class<?> f26079c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C11041b5() {
        super();
    }

    /* renamed from: c */
    private static <E> List<E> m34796c(Object obj, long j) {
        return (List) C11058c7.m34877f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo28269a(Object obj, long j) {
        return m34795a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo28271b(Object obj, long j) {
        Object obj2;
        List list = (List) C11058c7.m34877f(obj, j);
        if (list instanceof C11358w4) {
            obj2 = ((C11358w4) list).mo28324i0();
        } else if (!f26079c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C11027a6) || !(list instanceof C11216m4)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C11216m4 m4Var = (C11216m4) list;
                if (m4Var.mo28709h0()) {
                    m4Var.mo28708g0();
                }
                return;
            }
        } else {
            return;
        }
        C11058c7.m34854a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m34795a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m34796c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11358w4
            if (r1 == 0) goto L_0x0014
            g.j.a.a.d.g.x4 r0 = new g.j.a.a.d.g.x4
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11027a6
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11216m4
            if (r1 == 0) goto L_0x0024
            g.j.a.a.d.g.m4 r0 = (p163g.p449j.p450a.p451a.p457d.p464g.C11216m4) r0
            g.j.a.a.d.g.m4 r6 = r0.mo28257a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f26079c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11043b7
            if (r1 == 0) goto L_0x0062
            g.j.a.a.d.g.x4 r1 = new g.j.a.a.d.g.x4
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            g.j.a.a.d.g.b7 r0 = (p163g.p449j.p450a.p451a.p457d.p464g.C11043b7) r0
            r1.addAll(r0)
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11027a6
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11216m4
            if (r1 == 0) goto L_0x007f
            r1 = r0
            g.j.a.a.d.g.m4 r1 = (p163g.p449j.p450a.p451a.p457d.p464g.C11216m4) r1
            boolean r2 = r1.mo28709h0()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            g.j.a.a.d.g.m4 r0 = r1.mo28257a(r0)
            p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.m34854a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11041b5.m34795a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo28270a(Object obj, Object obj2, long j) {
        List c = m34796c(obj2, j);
        List a = m34795a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C11058c7.m34854a(obj, j, (Object) c);
    }
}
