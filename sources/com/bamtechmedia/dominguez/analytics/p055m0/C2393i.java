package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.p057o0.C2435d;
import com.bamtechmedia.dominguez.legal.BuildConfig;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b0\u0007H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/InstallationDataContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/ConvivaMetaDataContributor;", "()V", "data", "", "", "createMetaData", "Lio/reactivex/Single;", "", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.i */
/* compiled from: InstallationDataContributor.kt */
public final class C2393i implements C2435d {

    /* renamed from: a */
    private final Map<String, String> f6632a = C13173j0.m40360b(C12907r.m40244a("appVersion", BuildConfig.VERSION_NAME));

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.i$a */
    /* compiled from: InstallationDataContributor.kt */
    public static final class C2394a {
        private C2394a() {
        }

        public /* synthetic */ C2394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2394a(null);
    }

    /* renamed from: b */
    public Single<Map<String, String>> mo11526b() {
        Single<Map<String, String>> b = Single.m38399b(this.f6632a);
        C12880j.m40222a((Object) b, "Single.just(data)");
        return b;
    }
}
