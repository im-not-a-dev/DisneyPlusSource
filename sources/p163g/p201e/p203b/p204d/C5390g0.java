package p163g.p201e.p203b.p204d;

import com.bamtechmedia.dominguez.analytics.p057o0.C2435d;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/ConvivaCountryCodeContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/ConvivaMetaDataContributor;", "countryCodeProvider", "Lcom/bamtechmedia/dominguez/account/CountryCodeProvider;", "(Lcom/bamtechmedia/dominguez/account/CountryCodeProvider;)V", "createMetaData", "Lio/reactivex/Single;", "", "", "Companion", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.g0 */
/* compiled from: ConvivaCountryCodeContributor.kt */
public final class C5390g0 implements C2435d {

    /* renamed from: a */
    private final C5398i0 f12897a;

    /* renamed from: g.e.b.d.g0$a */
    /* compiled from: ConvivaCountryCodeContributor.kt */
    public static final class C5391a {
        private C5391a() {
        }

        public /* synthetic */ C5391a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.d.g0$b */
    /* compiled from: ConvivaCountryCodeContributor.kt */
    static final class C5392b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C5392b f12898c = new C5392b();

        C5392b() {
        }

        /* renamed from: a */
        public final Map<String, String> apply(String str) {
            return C13170i0.m40332a(C12907r.m40244a("countryCode", str));
        }
    }

    static {
        new C5391a(null);
    }

    public C5390g0(C5398i0 i0Var) {
        this.f12897a = i0Var;
    }

    /* renamed from: b */
    public Single<Map<String, String>> mo11526b() {
        Single<Map<String, String>> g = this.f12897a.mo17142a().mo30233g(C5392b.f12898c);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "countryCodeProvider.coun…COUNTRY_CODE_KEY to it) }");
        return g;
    }
}
