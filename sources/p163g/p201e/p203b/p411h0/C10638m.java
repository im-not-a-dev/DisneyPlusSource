package p163g.p201e.p203b.p411h0;

import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import org.joda.time.Days;
import org.joda.time.Period;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.p320a0.C7823d;
import p163g.p201e.p203b.p411h0.C10640n.C10641a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ0\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/welcome/WelcomePresenter;", "", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "paywallConfig", "Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;)V", "paywallLoginOnlyText", "", "hash", "paywallText", "key", "replacements", "", "subCtaCopyText", "state", "Lcom/bamtechmedia/dominguez/welcome/WelcomeViewModel$State;", "timeUnitText", "sku", "trialPeriodText", "", "freeTrialPeriod", "Lorg/joda/time/Period;", "welcome_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.h0.m */
/* compiled from: WelcomePresenter.kt */
public final class C10638m {

    /* renamed from: a */
    private final C3572r0 f25102a;

    /* renamed from: b */
    private final C7873f f25103b;

    /* renamed from: g.e.b.h0.m$a */
    /* compiled from: WelcomePresenter.kt */
    static final class C10639a extends C12881k implements Function2<C7823d, Period, String> {

        /* renamed from: U */
        final /* synthetic */ C10641a f25104U;

        /* renamed from: c */
        final /* synthetic */ C10638m f25105c;

        C10639a(C10638m mVar, C10641a aVar) {
            this.f25105c = mVar;
            this.f25104U = aVar;
            super(2);
        }

        /* renamed from: a */
        public final String invoke(C7823d dVar, Period period) {
            int a = this.f25105c.m33384a(period);
            String a2 = this.f25105c.m33387a(dVar.mo20732d(), this.f25104U.mo27503b());
            if (a2 == null) {
                return null;
            }
            Pair[] pairArr = {C12907r.m40244a("TRIAL_DURATION", Integer.valueOf(a)), C12907r.m40244a("PRICE", dVar.mo20730b()), C12907r.m40244a("TIME_UNIT", a2)};
            return this.f25105c.mo27497a("welcome_subcta_copy", this.f25104U.mo27503b(), C13173j0.m40356a(pairArr));
        }
    }

    public C10638m(C3572r0 r0Var, C7873f fVar) {
        this.f25102a = r0Var;
        this.f25103b = fVar;
    }

    /* renamed from: a */
    public final String mo27495a(C10641a aVar) {
        C7823d c = aVar.mo27504c();
        C7823d c2 = aVar.mo27504c();
        return (String) C5884x.m18949a(c, c2 != null ? c2.mo20733e() : null, new C10639a(this, aVar));
    }

    /* renamed from: a */
    public final String mo27496a(String str) {
        return mo27497a("welcome_subcta_loginonly_copy", str, C13170i0.m40332a(C12907r.m40244a("platform", "android")));
    }

    /* renamed from: a */
    public static /* synthetic */ String m33386a(C10638m mVar, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C13173j0.m40350a();
        }
        return mVar.mo27497a(str, str2, map);
    }

    /* renamed from: a */
    public final String mo27497a(String str, String str2, Map<String, ? extends Object> map) {
        String str3 = "ns_paywall_";
        if (str2 != null) {
            C3572r0 r0Var = this.f25102a;
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append('_');
            sb.append(str2);
            String a = r0Var.mo12773a(sb.toString(), map);
            if (a != null) {
                return a;
            }
        }
        C3572r0 r0Var2 = this.f25102a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        return r0Var2.mo12775b(sb2.toString(), map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m33384a(Period period) {
        Days standardDays = period.toStandardDays();
        Intrinsics.checkReturnedValueIsNotNull((Object) standardDays, "freeTrialPeriod.toStandardDays()");
        return standardDays.getDays();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m33387a(String str, String str2) {
        String b = this.f25103b.mo20797b(str);
        if (b != null) {
            return m33386a(this, b, str2, null, 4, null);
        }
        return null;
    }
}
