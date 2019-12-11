package com.bamtechmedia.dominguez.collections.p080o0;

import android.content.Context;
import com.bamtechmedia.dominguez.config.C3532h;
import com.bamtechmedia.dominguez.config.C3532h.C3533a;
import com.bamtechmedia.dominguez.config.C3532h.C3534b;
import com.bamtechmedia.dominguez.config.C3566o0;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.BuildInfo.C3584a;
import com.bamtechmedia.dominguez.core.BuildInfo.Environment;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11780y;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u00030\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u00030\n0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0013*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/config/CollectionConfigRepositoryImpl;", "Lcom/bamtechmedia/dominguez/collections/config/CollectionConfigRepository;", "context", "Landroid/content/Context;", "configLoaderFactory", "Lcom/bamtechmedia/dominguez/config/ConfigLoader$Factory;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/config/ConfigLoader$Factory;Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "allConfigs", "", "", "getAllConfigs", "()Ljava/util/Map;", "configLoader", "Lcom/bamtechmedia/dominguez/config/ConfigLoader;", "envPath", "platformPath", "versionPath", "kotlin.jvm.PlatformType", "initialize", "Lio/reactivex/Completable;", "Companion", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.o0.c */
/* compiled from: CollectionConfigRepositoryImpl.kt */
public final class C3436c implements C3435b {

    /* renamed from: a */
    private final String f8663a;

    /* renamed from: b */
    private final String f8664b;

    /* renamed from: c */
    private final String f8665c;

    /* renamed from: d */
    private final C3532h<Map<String, ?>> f8666d;

    /* renamed from: com.bamtechmedia.dominguez.collections.o0.c$a */
    /* compiled from: CollectionConfigRepositoryImpl.kt */
    public static final class C3437a {
        private C3437a() {
        }

        public /* synthetic */ C3437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3437a(null);
    }

    public C3436c(Context context, C3533a aVar, BuildInfo buildInfo) {
        this.f8663a = buildInfo.mo12778a() == Environment.QA ? "qa" : "prod";
        this.f8664b = buildInfo.mo12780c() == C3584a.TV ? "android-tv" : "android";
        this.f8665c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        StringBuilder sb = new StringBuilder();
        sb.append("https://appconfigs.disney-plus.net/dmgz/");
        sb.append(this.f8663a);
        sb.append('/');
        sb.append(this.f8664b);
        sb.append('/');
        sb.append(this.f8665c);
        sb.append("/collections.json");
        String sb2 = sb.toString();
        ParameterizedType a = C11780y.m37894a((Type) Map.class, String.class, Object.class);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Types.newParameterizedTy…ss.java, Any::class.java)");
        C3534b bVar = new C3534b(sb2, a, "collections_config.json", "dplus-collections", null, Integer.valueOf(C3566o0.collections_config), null, 80, null);
        this.f8666d = aVar.mo12736a(bVar);
    }

    /* renamed from: a */
    public Map<String, ?> mo12612a() {
        Object c = C3532h.m11948a(this.f8666d, false, 1, null).mo30224c();
        Intrinsics.checkReturnedValueIsNotNull(c, "configLoader.fetchConfig().blockingGet()");
        return (Map) c;
    }

    public Completable initialize() {
        Completable e = this.f8666d.mo12735a(true).mo30228e();
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "configLoader.fetchConfig(true).ignoreElement()");
        return e;
    }
}
