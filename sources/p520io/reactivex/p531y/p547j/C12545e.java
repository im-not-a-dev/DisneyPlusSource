package p520io.reactivex.p531y.p547j;

import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p544g.C12512i;

/* renamed from: io.reactivex.y.j.e */
/* compiled from: BlockingHelper */
public final class C12545e {
    /* renamed from: a */
    public static void m39345a() {
        if (!C11915a.m38462a()) {
            return;
        }
        if ((Thread.currentThread() instanceof C12512i) || C11915a.m38467b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt to block on a Scheduler ");
            sb.append(Thread.currentThread().getName());
            sb.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(sb.toString());
        }
    }
}
