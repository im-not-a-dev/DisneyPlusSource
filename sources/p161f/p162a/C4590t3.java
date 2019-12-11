package p161f.p162a;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: f.a.t3 */
public final class C4590t3 {
    static {
        new BigDecimal("100");
    }

    /* renamed from: a */
    public static BigDecimal m15943a(BigDecimal bigDecimal) {
        return bigDecimal.setScale(2, RoundingMode.HALF_UP);
    }
}
