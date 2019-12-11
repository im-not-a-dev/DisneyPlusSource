package com.bamtechmedia.dominguez.purchase;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.p320a0.C7823d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/purchase/PaywallCurrencyFormatter;", "", "paywallConfig", "Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;", "(Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;)V", "computePricePerMonth", "", "productList", "", "Lcom/bamtechmedia/dominguez/paywall/model/PaywallProduct;", "product", "round", "", "decimals", "", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.purchase.o */
/* compiled from: PaywallCurrencyFormatter.kt */
public final class C7059o {

    /* renamed from: a */
    private final C7873f f15659a;

    /* renamed from: com.bamtechmedia.dominguez.purchase.o$a */
    /* compiled from: PaywallCurrencyFormatter.kt */
    private static final class C7060a {
        private C7060a() {
        }

        public /* synthetic */ C7060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7060a(null);
    }

    public C7059o(C7873f fVar) {
        this.f15659a = fVar;
    }

    /* renamed from: a */
    public final String mo19835a(List<? extends C7823d> list, C7823d dVar) {
        String str;
        Object obj;
        String str2 = "year";
        if (dVar == null || !C12880j.m40224a((Object) this.f15659a.mo20797b(dVar.mo20732d()), (Object) str2)) {
            if (dVar != null) {
                dVar = null;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C12880j.m40224a((Object) this.f15659a.mo20797b(((C7823d) obj).mo20732d()), (Object) str2)) {
                        break;
                    }
                }
                dVar = (C7823d) obj;
            }
        }
        Long a = dVar != null ? dVar.mo20729a() : null;
        if (dVar != null) {
            String c = dVar.mo20731c();
            if (c != null) {
                str = this.f15659a.mo20798c(c);
                if (dVar != null || a == null || str == null) {
                    return null;
                }
                String format = NumberFormat.getInstance().format(m21404a((((double) a.longValue()) / 12.0d) / 1000000.0d, 2));
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(format);
                return sb.toString();
            }
        }
        str = null;
        if (dVar != null) {
        }
        return null;
    }

    /* renamed from: a */
    private final double m21404a(double d, int i) {
        return new BigDecimal(d).setScale(i, RoundingMode.HALF_EVEN).doubleValue();
    }
}
