package p163g.p201e.p203b.p204d;

import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.session.SessionEntitlement;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11844z;
import p520io.reactivex.C11957k;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p551j.p552a.C12589b;
import p551j.p552a.C12590c;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/AccountLoginAction;", "Lcom/bamtechmedia/dominguez/auth/login/LogInAction;", "sessionOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "(Lio/reactivex/Single;Lcom/bamtech/sdk4/account/AccountApi;)V", "onLogin", "Lio/reactivex/Completable;", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.d */
/* compiled from: AccountLoginAction.kt */
public final class C5377d implements C2783b {

    /* renamed from: a */
    private final Single<Session> f12887a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AccountApi f12888b;

    /* renamed from: g.e.b.d.d$a */
    /* compiled from: AccountLoginAction.kt */
    static final class C5378a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        public static final C5378a f12889c = new C5378a();

        C5378a() {
        }

        /* renamed from: a */
        public final Single<SessionInfo> apply(Session session) {
            return session.getSessionInfo();
        }
    }

    /* renamed from: g.e.b.d.d$b */
    /* compiled from: AccountLoginAction.kt */
    static final class C5379b<T> implements C11952h<SessionInfo> {

        /* renamed from: c */
        public static final C5379b f12890c = new C5379b();

        C5379b() {
        }

        /* renamed from: a */
        public final boolean test(SessionInfo sessionInfo) {
            List<SessionEntitlement> entitlements = sessionInfo.getEntitlements();
            if ((entitlements instanceof Collection) && entitlements.isEmpty()) {
                return false;
            }
            for (SessionEntitlement name : entitlements) {
                if (C12832w.m40122b(name.getName(), "DISNEY_EXEC", true)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g.e.b.d.d$c */
    /* compiled from: AccountLoginAction.kt */
    static final class C5380c<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C5377d f12891c;

        C5380c(C5377d dVar) {
            this.f12891c = dVar;
        }

        /* renamed from: a */
        public final Maybe<DefaultAccount> apply(SessionInfo sessionInfo) {
            return this.f12891c.f12888b.getAccount();
        }
    }

    /* renamed from: g.e.b.d.d$d */
    /* compiled from: AccountLoginAction.kt */
    static final class C5381d<T> implements Consumer<DefaultAccount> {

        /* renamed from: c */
        public static final C5381d f12892c = new C5381d();

        C5381d() {
        }

        /* renamed from: a */
        public final void accept(DefaultAccount defaultAccount) {
            C12590c b = C12589b.m39533b();
            C12880j.m40222a((Object) defaultAccount, "it");
            b.mo30890a("email", C5407l0.m18171a(defaultAccount));
        }
    }

    /* renamed from: g.e.b.d.d$e */
    /* compiled from: AccountLoginAction.kt */
    static final class C5382e<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C5382e f12893c = new C5382e();

        C5382e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44523a(th);
        }
    }

    public C5377d(Single<Session> single, AccountApi accountApi) {
        this.f12887a = single;
        this.f12888b = accountApi;
    }

    /* renamed from: a */
    public Completable mo11569a() {
        Maybe a = this.f12887a.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) C5378a.f12889c).mo30202a((C11952h<? super T>) C5379b.f12890c).mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new C5380c<Object,Object>(this));
        C12880j.m40222a((Object) a, "sessionOnce.flatMap { it…accountApi.getAccount() }");
        Completable i = Completable.m38170i();
        C12880j.m40222a((Object) i, "Completable.never()");
        Object a2 = a.mo30112a((C11957k<T, ? extends R>) C11793e.m37931a((CompletableSource) i));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(scope))");
        ((C11844z) a2).mo29929a(C5381d.f12892c, C5382e.f12893c);
        Completable h = Completable.m38169h();
        C12880j.m40222a((Object) h, "Completable.complete()");
        return h;
    }
}
