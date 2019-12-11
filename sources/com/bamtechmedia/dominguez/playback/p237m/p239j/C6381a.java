package com.bamtechmedia.dominguez.playback.p237m.p239j;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaConfig;", "", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "convivaAppName", "", "getConvivaAppName", "()Ljava/lang/String;", "convivaAppNames", "", "getConvivaAppNames", "()Ljava/util/Map;", "convivaCustomerKey", "getConvivaCustomerKey", "convivaGatewayUrl", "getConvivaGatewayUrl", "convivaPlayerName", "getConvivaPlayerName", "convivaPlayerNames", "getConvivaPlayerNames", "platformSpecificValue", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.j.a */
/* compiled from: ConvivaConfig.kt */
public final class C6381a {

    /* renamed from: a */
    private final C3524e f14493a;

    /* renamed from: b */
    private final BuildInfo f14494b;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.a$a */
    /* compiled from: ConvivaConfig.kt */
    private static final class C6382a {
        private C6382a() {
        }

        public /* synthetic */ C6382a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6382a(null);
    }

    public C6381a(C3524e eVar, BuildInfo buildInfo) {
        this.f14493a = eVar;
        this.f14494b = buildInfo;
    }

    /* renamed from: e */
    private final Map<String, String> m19998e() {
        Map<String, String> map = (Map) this.f14493a.mo12720d("conviva", "applicationNames");
        if (map != null) {
            return map;
        }
        return C13173j0.m40356a(C12907r.m40244a("MOBILE_GOOGLE", "Disney+ Android"), C12907r.m40244a("TV_GOOGLE", "Disney+ AndroidTV"), C12907r.m40244a("MOBILE_AMAZON", "Disney+ AmazonTablet"), C12907r.m40244a("TV_AMAZON", "Disney+ AFTV"));
    }

    /* renamed from: f */
    private final Map<String, String> m19999f() {
        Map<String, String> map = (Map) this.f14493a.mo12720d("conviva", "playerName");
        if (map != null) {
            return map;
        }
        return C13173j0.m40356a(C12907r.m40244a("MOBILE", "Disney+ android"), C12907r.m40244a("TV", "Disney+ android-tv"));
    }

    /* renamed from: a */
    public final String mo19023a() {
        String a = m19997a(m19998e());
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: b */
    public final String mo19024b() {
        String str = (String) this.f14493a.mo12720d("conviva", "customerKey");
        return str != null ? str : "7ba3f64df98de730df38846b54ecfbdf7f61f80f";
    }

    /* renamed from: c */
    public final String mo19025c() {
        String str = (String) this.f14493a.mo12720d("conviva", "gatewayUrl");
        if (str != null) {
            return str;
        }
        return null;
    }

    /* renamed from: d */
    public final String mo19026d() {
        String a = m19997a(m19999f());
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    private final String m19997a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14494b.mo12780c().name());
        sb.append('_');
        sb.append(this.f14494b.mo12779b().name());
        sb.append('_');
        sb.append(this.f14494b.mo12778a().name());
        String str = (String) map.get(sb.toString());
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f14494b.mo12780c().name());
            sb2.append('_');
            sb2.append(this.f14494b.mo12779b().name());
            str = (String) map.get(sb2.toString());
        }
        if (str == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f14494b.mo12780c().name());
            sb3.append('_');
            sb3.append(this.f14494b.mo12778a().name());
            str = (String) map.get(sb3.toString());
        }
        if (str == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f14494b.mo12779b().name());
            sb4.append('_');
            sb4.append(this.f14494b.mo12778a().name());
            str = (String) map.get(sb4.toString());
        }
        if (str == null) {
            str = (String) map.get(this.f14494b.mo12780c().name());
        }
        if (str == null) {
            str = (String) map.get(this.f14494b.mo12779b().name());
        }
        return str != null ? str : (String) map.get(this.f14494b.mo12778a().name());
    }
}
