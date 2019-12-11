package p163g.p201e.p203b.p319v;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import java.util.List;
import java.util.Map;
import kotlin.C12898l;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020\rH\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\rH\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\rH\u0016R\u0014\u0010\u0007\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\nR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\n¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/PaywallConfigImpl;", "Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;", "appConfigMap", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "amazonSubscribeAvailable", "", "getAmazonSubscribeAvailable", "()Z", "currencyMap", "", "", "getCurrencyMap", "()Ljava/util/Map;", "googleSubscribeAvailable", "getGoogleSubscribeAvailable", "promos", "getPromos", "skuOverrides", "", "getSkuOverrides", "()Ljava/util/List;", "skuPeriodMap", "getSkuPeriodMap", "subscribeAvailable", "getSubscribeAvailable", "timeoutSeconds", "", "getTimeoutSeconds", "()Ljava/lang/Long;", "usePaywallV2", "getUsePaywallV2", "currencySymbolForCode", "currencyCode", "dictionaryKeyForSku", "sku", "periodForSku", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.g */
/* compiled from: PaywallConfigImpl.kt */
public final class C7874g implements C7873f {

    /* renamed from: a */
    private final C3524e f17003a;

    /* renamed from: b */
    private final BuildInfo f17004b;

    /* renamed from: g.e.b.v.g$a */
    /* compiled from: PaywallConfigImpl.kt */
    private static final class C7875a {
        private C7875a() {
        }

        public /* synthetic */ C7875a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7875a(null);
    }

    public C7874g(C3524e eVar, BuildInfo buildInfo) {
        this.f17003a = eVar;
        this.f17004b = buildInfo;
    }

    /* renamed from: f */
    private final boolean m23075f() {
        Boolean bool = (Boolean) this.f17003a.mo12720d("paywall", "amazonSubscribeAvailable");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: g */
    private final Map<String, String> m23076g() {
        Map<String, String> map = (Map) this.f17003a.mo12720d("paywall", "currencyMap");
        if (map != null) {
            return map;
        }
        String str = "$";
        return C13173j0.m40356a(C12907r.m40244a("CAD", str), C12907r.m40244a("USD", str), C12907r.m40244a("EUR", "€"), C12907r.m40244a("NZD", str), C12907r.m40244a("AUD", str));
    }

    /* renamed from: h */
    private final boolean m23077h() {
        Boolean bool = (Boolean) this.f17003a.mo12720d("paywall", "googleSubscribeAvailable");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: i */
    private final Map<String, List<String>> m23078i() {
        Map<String, List<String>> map = (Map) this.f17003a.mo12720d("paywall", "skuPeriodMap");
        if (map != null) {
            return map;
        }
        String str = "btn_yearly_price";
        String str2 = "year";
        String str3 = "btn_monthly_price";
        String str4 = "month";
        return C13173j0.m40356a(C12907r.m40244a("com.disney.yearly.disneyplus7dft.google", C13185o.m40520c(str2, str)), C12907r.m40244a("com.disney.monthly.disneyplus7dft.google", C13185o.m40520c(str4, str3)), C12907r.m40244a("com.disney.yearly.disneyplus30dft.google", C13185o.m40520c(str2, str)), C12907r.m40244a("com.disney.monthly.disneyplus30dft.google", C13185o.m40520c(str4, str3)), C12907r.m40244a("com.disney.yearly.disneyplus60dft.google", C13185o.m40520c(str2, str)), C12907r.m40244a("com.disney.monthly.disneyplus60dft.google", C13185o.m40520c(str4, str3)), C12907r.m40244a("com.disney.yearly.disneyplus.google", C13185o.m40520c(str2, str)), C12907r.m40244a("com.disney.monthly.disneyplus.google", C13185o.m40520c(str4, str3)), C12907r.m40244a("com.disney.yearly.disneyplus7dft.amazon", C13185o.m40520c(str2, str)), C12907r.m40244a("com.disney.monthly.disneyplus7dft.amazon", C13185o.m40520c(str4, str3)), C12907r.m40244a("com.disney.yearly.disneyplus60dft.amazon", C13185o.m40520c(str2, str)), C12907r.m40244a("com.disney.monthly.disneyplus60dft.amazon", C13185o.m40520c(str4, str3)), C12907r.m40244a("com.disney.yearly.disneyplus.amazon", C13185o.m40520c(str2, str)), C12907r.m40244a("com.disney.monthly.disneyplus.amazon", C13185o.m40520c(str4, str3)));
    }

    /* renamed from: a */
    public List<String> mo20795a() {
        return (List) this.f17003a.mo12720d("paywall", "skuOverrides");
    }

    /* renamed from: b */
    public Long mo20796b() {
        Long a = this.f17003a.mo12716a("paywall", "timeoutSeconds");
        return Long.valueOf(a != null ? a.longValue() : 5);
    }

    /* renamed from: c */
    public boolean mo20799c() {
        int i = C7876h.$EnumSwitchMapping$0[this.f17004b.mo12779b().ordinal()];
        if (i == 1) {
            return m23077h();
        }
        if (i == 2) {
            return m23075f();
        }
        throw new C12898l();
    }

    /* renamed from: d */
    public Map<String, String> mo20800d() {
        Map<String, String> map = (Map) this.f17003a.mo12720d("paywall", "promos");
        return map != null ? map : C13170i0.m40332a(C12907r.m40244a("GOOGLE_US", "starz"));
    }

    /* renamed from: e */
    public boolean mo20801e() {
        Boolean bool = (Boolean) this.f17003a.mo12720d("paywall", "usePaywallV2");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: a */
    public String mo20794a(String str) {
        List list = (List) m23078i().get(str);
        if (list != null) {
            return (String) list.get(1);
        }
        return null;
    }

    /* renamed from: b */
    public String mo20797b(String str) {
        List list = (List) m23078i().get(str);
        if (list != null) {
            return (String) list.get(0);
        }
        return null;
    }

    /* renamed from: c */
    public String mo20798c(String str) {
        return (String) m23076g().get(str);
    }
}
