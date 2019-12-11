package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Comparator;

/* renamed from: g.j.a.a.d.g.x2 */
final class C11370x2 implements Comparator<C11342v2> {
    C11370x2() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C11342v2 v2Var = (C11342v2) obj;
        C11342v2 v2Var2 = (C11342v2) obj2;
        C11024a3 a3Var = (C11024a3) v2Var.iterator();
        C11024a3 a3Var2 = (C11024a3) v2Var2.iterator();
        while (a3Var.hasNext() && a3Var2.hasNext()) {
            int compare = Integer.compare(C11342v2.m36525a(a3Var.nextByte()), C11342v2.m36525a(a3Var2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(v2Var.size(), v2Var2.size());
    }
}
