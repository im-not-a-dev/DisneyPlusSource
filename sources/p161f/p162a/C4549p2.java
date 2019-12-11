package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a.p2 */
public class C4549p2 {

    /* renamed from: e */
    private static final String f11328e = C1557c.m7461a(C4549p2.class);

    /* renamed from: a */
    private final Random f11329a;

    /* renamed from: b */
    private final int f11330b;

    /* renamed from: c */
    private final int f11331c;

    /* renamed from: d */
    private int f11332d;

    public C4549p2(int i) {
        this(i, (int) TimeUnit.SECONDS.toMillis(1));
    }

    /* renamed from: a */
    public void mo15786a() {
        this.f11332d = 0;
    }

    /* renamed from: b */
    public boolean mo15787b() {
        return this.f11332d != 0;
    }

    /* renamed from: c */
    public int mo15788c() {
        return mo15785a(this.f11331c);
    }

    public C4549p2(int i, int i2) {
        this.f11329a = new Random();
        this.f11332d = 0;
        this.f11330b = i;
        this.f11331c = i2;
    }

    /* renamed from: a */
    public int mo15785a(int i) {
        String str = f11328e;
        StringBuilder sb = new StringBuilder();
        sb.append("Computing new sleep delay. Previous sleep delay: ");
        sb.append(this.f11332d);
        C1557c.m7458a(str, sb.toString());
        this.f11332d = Math.min(this.f11330b, m15809a(this.f11329a, i, this.f11332d * 3));
        String str2 = f11328e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("New sleep duration: ");
        sb2.append(this.f11332d);
        sb2.append(" ms. Default sleep duration: ");
        sb2.append(i);
        sb2.append(" ms. Max sleep: ");
        sb2.append(this.f11330b);
        sb2.append(" ms.");
        C1557c.m7458a(str2, sb2.toString());
        return this.f11332d;
    }

    /* renamed from: a */
    static int m15809a(Random random, int i, int i2) {
        return random.nextInt(Math.abs(i - i2)) + Math.min(i, i2);
    }
}
