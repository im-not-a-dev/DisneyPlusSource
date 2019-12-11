package p163g.p201e.p203b.p319v;

import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c.C2794a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p319v.C7885o.C7886a;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/PaywallFeatureLogoutAction;", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "paywallRepository", "Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;", "(Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;)V", "logOutActionId", "", "getLogOutActionId", "()Ljava/lang/String;", "onLogout", "Lio/reactivex/Completable;", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.l */
/* compiled from: PaywallFeatureLogoutAction.kt */
public final class C7881l implements C2793c {

    /* renamed from: a */
    private final String f17010a = "paywall";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7885o f17011b;

    /* renamed from: g.e.b.v.l$a */
    /* compiled from: PaywallFeatureLogoutAction.kt */
    static final class C7882a<V> implements Callable<Object> {

        /* renamed from: c */
        final /* synthetic */ C7881l f17012c;

        C7882a(C7881l lVar) {
            this.f17012c = lVar;
        }

        public final void call() {
            C7886a.m23100a(this.f17012c.f17011b, false, 1, null);
        }
    }

    public C7881l(C7885o oVar) {
        this.f17011b = oVar;
    }

    /* renamed from: b */
    public String mo11571b() {
        return this.f17010a;
    }

    /* renamed from: c */
    public Completable mo11572c() {
        return C2794a.m10466a(this);
    }

    /* renamed from: a */
    public Completable mo11570a() {
        Completable c = Completable.m38168c((Callable<?>) new C7882a<Object>(this));
        C12880j.m40222a((Object) c, "Completable.fromCallable…pository.clearPaywall() }");
        return c;
    }
}
