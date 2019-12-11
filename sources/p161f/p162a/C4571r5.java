package p161f.p162a;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: f.a.r5 */
public class C4571r5 {

    /* renamed from: a */
    private final PriorityQueue<C4631y3> f11373a = new PriorityQueue<>(16, m15875b());

    /* renamed from: f.a.r5$a */
    static class C4572a implements Comparator<C4631y3> {
        C4572a() {
        }

        /* renamed from: a */
        public int compare(C4631y3 y3Var, C4631y3 y3Var2) {
            int c = y3Var.mo15472c().mo15855c();
            int c2 = y3Var2.mo15472c().mo15855c();
            if (c > c2) {
                return -1;
            }
            if (c < c2) {
                return 1;
            }
            return y3Var.mo15473d().compareTo(y3Var2.mo15473d());
        }
    }

    public C4571r5(List<C4631y3> list) {
        this.f11373a.addAll(list);
    }

    /* renamed from: b */
    private static Comparator<C4631y3> m15875b() {
        return new C4572a();
    }

    /* renamed from: a */
    public C4631y3 mo15812a() {
        return (C4631y3) this.f11373a.poll();
    }
}
