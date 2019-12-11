package p163g.p201e.p203b.p210g;

import com.bamtechmedia.dominguez.core.utils.C5855o;
import java.io.IOException;
import java.util.concurrent.Callable;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request.C14113a;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\n0\n0\fR\u0014\u0010\u0006\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/connectivity/NetworkConnectivityCheck;", "", "clientProvider", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "(Ljavax/inject/Provider;)V", "client", "getClient", "()Lokhttp3/OkHttpClient;", "canConnect", "", "isConnected", "Lio/reactivex/Single;", "kotlin.jvm.PlatformType", "Companion", "connectivity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.g.f */
/* compiled from: NetworkConnectivityCheck.kt */
public final class C5562f {

    /* renamed from: a */
    private final Provider<OkHttpClient> f13121a;

    /* renamed from: g.e.b.g.f$a */
    /* compiled from: NetworkConnectivityCheck.kt */
    public static final class C5563a {
        private C5563a() {
        }

        public /* synthetic */ C5563a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.g.f$b */
    /* compiled from: NetworkConnectivityCheck.kt */
    static final class C5564b<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C5562f f13122c;

        C5564b(C5562f fVar) {
            this.f13122c = fVar;
        }

        public final boolean call() {
            C5855o oVar = C5855o.f13640a;
            boolean z = false;
            for (int i = 0; i <= 4 && !z; i++) {
                z = this.f13122c.m18366b();
            }
            return z;
        }
    }

    static {
        new C5563a(null);
    }

    public C5562f(Provider<OkHttpClient> provider) {
        this.f13121a = provider;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m18366b() {
        C14113a aVar = new C14113a();
        aVar.mo35851c();
        aVar.mo35848b("https://appconfigs.disney-plus.net");
        aVar.mo35842a(CacheControl.f31159n);
        try {
            m18367c().mo35727a(aVar.mo35846a()).mo35726n0();
            C5855o oVar = C5855o.f13640a;
            return true;
        } catch (IOException unused) {
            C5855o oVar2 = C5855o.f13640a;
            return false;
        }
    }

    /* renamed from: c */
    private final OkHttpClient m18367c() {
        Object obj = this.f13121a.get();
        C12880j.m40222a(obj, "clientProvider.get()");
        return (OkHttpClient) obj;
    }

    /* renamed from: a */
    public final Single<Boolean> mo17320a() {
        Single<Boolean> c = Single.m38401c((Callable<? extends T>) new C5564b<Object>(this));
        C12880j.m40222a((Object) c, "Single.fromCallable {\n  …      connected\n        }");
        return c;
    }
}
