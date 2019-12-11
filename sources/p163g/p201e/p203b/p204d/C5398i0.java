package p163g.p201e.p203b.p204d;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionState;
import com.bamtech.sdk4.session.SessionState.LoggedIn;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/CountryCodeProvider;", "Lcom/bamtechmedia/dominguez/account/CountryCodeProviderApi;", "sessionStateOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionState;", "sessionInfoOnce", "Lcom/bamtech/sdk4/session/SessionInfo;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "(Lio/reactivex/Single;Lio/reactivex/Single;Lcom/bamtech/sdk4/account/AccountApi;)V", "countryCodeOnce", "", "getCountryCodeOnce", "()Lio/reactivex/Single;", "countryCodeLoggedIn", "countryCodeLoggedOut", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.i0 */
/* compiled from: CountryCodeProvider.kt */
public final class C5398i0 implements C5403j0 {

    /* renamed from: a */
    private final Single<SessionState> f12910a;

    /* renamed from: b */
    private final Single<SessionInfo> f12911b;

    /* renamed from: c */
    private final AccountApi f12912c;

    /* renamed from: g.e.b.d.i0$a */
    /* compiled from: CountryCodeProvider.kt */
    static final class C5399a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        public static final C5399a f12913c = new C5399a();

        C5399a() {
        }

        /* renamed from: a */
        public final Single<String> apply(DefaultAccount defaultAccount) {
            Object obj = defaultAccount.getAttributes().get("locations");
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            Object obj2 = map != null ? map.get("registration") : null;
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            Map map2 = (Map) obj2;
            Object obj3 = map2 != null ? map2.get("geoIp") : null;
            if (!(obj3 instanceof Map)) {
                obj3 = null;
            }
            Map map3 = (Map) obj3;
            Object obj4 = map3 != null ? map3.get("country") : null;
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            String str = (String) obj4;
            if (str != null) {
                return Single.m38399b(str);
            }
            return Single.m38395a((Throwable) new IllegalStateException("Unable to access Account.attributes[location]"));
        }
    }

    /* renamed from: g.e.b.d.i0$b */
    /* compiled from: CountryCodeProvider.kt */
    static final class C5400b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C5400b f12914c = new C5400b();

        C5400b() {
        }

        /* renamed from: a */
        public final String apply(SessionInfo sessionInfo) {
            String countryCode = sessionInfo.getLocation().getCountryCode();
            if (countryCode != null) {
                return countryCode;
            }
            throw new IllegalArgumentException("No countryCode available from SessionInfo.location".toString());
        }
    }

    /* renamed from: g.e.b.d.i0$c */
    /* compiled from: CountryCodeProvider.kt */
    static final class C5401c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C5398i0 f12915c;

        C5401c(C5398i0 i0Var) {
            this.f12915c = i0Var;
        }

        /* renamed from: a */
        public final Single<String> apply(SessionState sessionState) {
            if (sessionState instanceof LoggedIn) {
                return this.f12915c.m18151b();
            }
            return this.f12915c.m18153c();
        }
    }

    public C5398i0(Single<SessionState> single, Single<SessionInfo> single2, AccountApi accountApi) {
        this.f12910a = single;
        this.f12911b = single2;
        this.f12912c = accountApi;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Single<String> m18153c() {
        Single<String> g = this.f12911b.mo30233g(C5400b.f12914c);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "sessionInfoOnce.map {\n  …fo.location\" })\n        }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Single<String> m18151b() {
        Single<String> d = this.f12912c.getAccount().mo30128d(C5399a.f12913c);
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "accountApi.getAccount()\n…          }\n            }");
        return d;
    }

    /* renamed from: a */
    public Single<String> mo17142a() {
        Single<String> a = this.f12910a.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C5401c<Object,Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "sessionStateOnce\n       …          }\n            }");
        return a;
    }
}
