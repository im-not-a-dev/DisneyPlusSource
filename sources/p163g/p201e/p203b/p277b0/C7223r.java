package p163g.p201e.p203b.p277b0;

import android.os.Build;
import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.utils.C5860p0;
import com.bamtechmedia.dominguez.core.utils.C5862q0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001f\u001a\u00020\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R(\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/MediaCapabilitiesConfig;", "", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "widevineUtils", "Lcom/bamtechmedia/dominguez/core/utils/WidevineUtils;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;Lcom/bamtechmedia/dominguez/core/utils/WidevineUtils;)V", "globalSupportedHdrTypes", "", "", "getGlobalSupportedHdrTypes", "()Ljava/util/List;", "remoteAtmosSupported", "", "", "getRemoteAtmosSupported", "()Ljava/util/Map;", "requireHdrOnAllDisplays", "getRequireHdrOnAllDisplays", "()Z", "supportedDolbyProfiles", "", "getSupportedDolbyProfiles", "supportedHdr10Profiles", "getSupportedHdr10Profiles", "supportedHdrTypes", "getSupportedHdrTypes", "supportedHdrTypesByDevice", "getSupportedHdrTypesByDevice", "supportedHdrTypesBySystemId", "getSupportedHdrTypesBySystemId", "atmosEnabled", "Companion", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.b0.r */
/* compiled from: MediaCapabilitiesConfig.kt */
public final class C7223r {

    /* renamed from: c */
    private static final Map<String, Boolean> f15947c = C13170i0.m40332a(C12907r.m40244a("all", Boolean.valueOf(false)));

    /* renamed from: a */
    private final C3524e f15948a;

    /* renamed from: b */
    private final C5862q0 f15949b;

    /* renamed from: g.e.b.b0.r$a */
    /* compiled from: MediaCapabilitiesConfig.kt */
    public static final class C7224a {
        private C7224a() {
        }

        public /* synthetic */ C7224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: used method not loaded: kotlin.y.i0.a(kotlin.Pair):null, types can be incorrect */
    static {
        new C7224a(null);
    }

    public C7223r(C3524e eVar, C5862q0 q0Var) {
        this.f15948a = eVar;
        this.f15949b = q0Var;
    }

    /* renamed from: f */
    private final List<String> m21830f() {
        List<String> list = (List) this.f15948a.mo12720d("playbackCapabilities", "globalSupportedHdrTypes");
        return list != null ? list : C13185o.m40520c("dolbyVision", "hdr10");
    }

    /* renamed from: g */
    private final Map<String, Boolean> m21831g() {
        Map<String, Boolean> map = (Map) this.f15948a.mo12720d("playbackCapabilities", "atmos");
        return map != null ? map : C13173j0.m40350a();
    }

    /* renamed from: h */
    private final Map<String, List<String>> m21832h() {
        Map<String, List<String>> map = (Map) this.f15948a.mo12720d("playbackCapabilities", "supportedHdrTypesByDevice");
        if (map != null) {
            return map;
        }
        return C13170i0.m40332a(C12907r.m40244a("BRAVIA_UR2_4K", C13183n.m40498a("hdr10")));
    }

    /* renamed from: i */
    private final Map<String, List<String>> m21833i() {
        return (Map) this.f15948a.mo12720d("playbackCapabilities", "supportedHdrTypes");
    }

    /* renamed from: a */
    public final boolean mo20053a() {
        Map a = C13173j0.m40353a((Map) f15947c, m21831g());
        Boolean bool = (Boolean) a.get("all");
        if (bool == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("model_");
            sb.append(Build.MODEL);
            bool = (Boolean) a.get(sb.toString());
        }
        if (bool == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("manufacturer_");
            sb2.append(Build.MANUFACTURER);
            bool = (Boolean) a.get(sb2.toString());
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo20054b() {
        Boolean bool = (Boolean) this.f15948a.mo12720d("playbackCapabilities", "requireHdrOnAllDisplays");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: c */
    public final Map<Integer, Integer> mo20055c() {
        Map map = (Map) this.f15948a.mo12720d("playbackCapabilities", "supportedDolbyProfiles");
        if (map == null) {
            return C13170i0.m40332a(C12907r.m40244a(Integer.valueOf(32), Integer.valueOf(32)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) entry.getKey())), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13173j0.m40349a(linkedHashMap.size()));
        for (Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Integer.valueOf(((Number) entry2.getValue()).intValue()));
        }
        return linkedHashMap2;
    }

    /* renamed from: d */
    public final Map<Integer, Integer> mo20056d() {
        Map map = (Map) this.f15948a.mo12720d("playbackCapabilities", "supportedHdr10Profiles");
        if (map == null) {
            return C13170i0.m40332a(C12907r.m40244a(Integer.valueOf(4096), Integer.valueOf(1)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) entry.getKey())), entry.getValue());
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public final List<String> mo20057e() {
        List<String> list = (List) m21832h().get(Build.DEVICE);
        if (list == null) {
            C5860p0 a = this.f15949b.mo17767a();
            if (a != null) {
                String c = a.mo17763c();
                if (c != null) {
                    Map i = m21833i();
                    if (i != null) {
                        list = (List) i.get(c);
                    }
                }
            }
            list = null;
        }
        return list != null ? list : m21830f();
    }
}
