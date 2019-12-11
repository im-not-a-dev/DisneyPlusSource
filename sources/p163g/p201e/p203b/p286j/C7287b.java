package p163g.p201e.p203b.p286j;

import com.bamtechmedia.dominguez.config.C3524e;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.C12907r;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/deeplink/DeepLinkConfig;", "", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;)V", "remoteHandleInWeb", "", "", "", "getRemoteHandleInWeb", "()Ljava/util/Map;", "handleInWeb", "url", "Lokhttp3/HttpUrl;", "Companion", "deeplink_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.j.b */
/* compiled from: DeepLinkConfig.kt */
public final class C7287b {

    /* renamed from: b */
    private static final Map<String, Boolean> f16027b;

    /* renamed from: a */
    private final C3524e f16028a;

    /* renamed from: g.e.b.j.b$a */
    /* compiled from: DeepLinkConfig.kt */
    public static final class C7288a {
        private C7288a() {
        }

        public /* synthetic */ C7288a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7288a(null);
        Set<String> b = C13188p0.m40533b("/redeem", "/account/cancel-subscription", "/account/billing-details");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) b, 10));
        for (String a : b) {
            arrayList.add(C12907r.m40244a(a, Boolean.valueOf(true)));
        }
        f16027b = C13173j0.m40351a((Iterable) arrayList);
    }

    public C7287b(C3524e eVar) {
        this.f16028a = eVar;
    }

    /* renamed from: a */
    public final boolean mo20098a(HttpUrl httpUrl) {
        Boolean bool = (Boolean) C13173j0.m40353a((Map) f16027b, m21906a()).get(httpUrl.mo35750c());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    private final Map<String, Boolean> m21906a() {
        Map<String, Boolean> map = (Map) this.f16028a.mo12720d("deepLinks", "handleInWeb");
        return map != null ? map : C13173j0.m40350a();
    }
}
