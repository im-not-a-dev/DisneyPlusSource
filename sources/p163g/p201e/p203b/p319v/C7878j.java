package p163g.p201e.p203b.p319v;

import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/PaywallFeatureLoginAction;", "Lcom/bamtechmedia/dominguez/auth/login/LogInAction;", "paywallServicesInteractor", "Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "(Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;)V", "onLogin", "Lio/reactivex/Completable;", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.j */
/* compiled from: PaywallFeatureLoginAction.kt */
public final class C7878j implements C2783b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7900q f17007a;

    /* renamed from: g.e.b.v.j$a */
    /* compiled from: PaywallFeatureLoginAction.kt */
    static final class C7879a<V> implements Callable<Object> {

        /* renamed from: c */
        final /* synthetic */ C7878j f17008c;

        C7879a(C7878j jVar) {
            this.f17008c = jVar;
        }

        public final void call() {
            this.f17008c.f17007a.mo20745c();
        }
    }

    public C7878j(C7900q qVar) {
        this.f17007a = qVar;
    }

    /* renamed from: a */
    public Completable mo11569a() {
        Completable c = Completable.m38168c((Callable<?>) new C7879a<Object>(this));
        C12880j.m40222a((Object) c, "Completable.fromCallable…or.resetServiceEvents() }");
        return c;
    }
}
