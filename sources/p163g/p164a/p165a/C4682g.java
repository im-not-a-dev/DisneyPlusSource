package p163g.p164a.p165a;

import java.math.BigDecimal;

/* renamed from: g.a.a.g */
/* compiled from: AnalyticsTrackLifetimeValueIncrease */
final class C4682g {

    /* renamed from: a */
    private static final Object f11684a = new Object();

    /* renamed from: a */
    protected static BigDecimal m16301a() {
        BigDecimal bigDecimal;
        synchronized (f11684a) {
            try {
                bigDecimal = new BigDecimal(C4783y0.m16604B().getString("ADB_LIFETIME_VALUE", "0"));
            } catch (NumberFormatException unused) {
                bigDecimal = new BigDecimal("0");
            } catch (C4785b e) {
                C4783y0.m16636b("Analytics - Error getting current lifetime value:(%s).", e.getMessage());
                bigDecimal = null;
            }
        }
        return bigDecimal;
    }
}
