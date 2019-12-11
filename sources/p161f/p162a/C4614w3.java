package p161f.p162a;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: f.a.w3 */
public class C4614w3 {

    /* renamed from: a */
    private static final int f11495a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final int f11496b = Math.max(2, f11495a - 1);

    /* renamed from: a */
    public static int m16025a() {
        return 2;
    }

    /* renamed from: b */
    public static int m16026b() {
        return f11496b;
    }

    /* renamed from: c */
    public static long m16027c() {
        return 1;
    }

    /* renamed from: d */
    public static BlockingQueue<Runnable> m16028d() {
        return new LinkedBlockingQueue(64);
    }

    /* renamed from: e */
    public static int m16029e() {
        return f11495a;
    }
}
