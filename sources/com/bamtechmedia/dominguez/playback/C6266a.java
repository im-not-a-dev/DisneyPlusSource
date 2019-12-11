package com.bamtechmedia.dominguez.playback;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.config.p082t0.C3577a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.BuildInfo.Market;
import com.bamtechmedia.dominguez.core.utils.C5860p0;
import com.bamtechmedia.dominguez.core.utils.C5862q0;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 K2\u00020\u0001:\u0001KB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\r\u0010A\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010BJ\b\u0010C\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010D\u001a\u00020:J\r\u0010E\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010BJ\u000e\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u00020HJ\b\u0010I\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010J\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0 8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0 8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0011\u0010'\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0011\u0010+\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b,\u0010\u0016R\u001d\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0 8F¢\u0006\u0006\u001a\u0004\b0\u0010\"R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0012R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0012R\u0014\u00105\u001a\u0002068BX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020:8BX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0019\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b>\u0010\"R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;", "", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "widevineUtils", "Lcom/bamtechmedia/dominguez/core/utils/WidevineUtils;", "activityManager", "Landroid/app/ActivityManager;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "tunneledPlaybackValuePref", "Lcom/bamtechmedia/dominguez/config/preferences/DoublePreference;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;Lcom/bamtechmedia/dominguez/core/utils/WidevineUtils;Landroid/app/ActivityManager;Lcom/bamtechmedia/dominguez/core/BuildInfo;Lcom/bamtechmedia/dominguez/config/preferences/DoublePreference;)V", "byteBufferLimits", "", "", "", "getByteBufferLimits", "()Ljava/util/Map;", "cellularInitialMaxBitrate", "", "getCellularInitialMaxBitrate", "()I", "cellularMaxBitrate", "getCellularMaxBitrate", "dataSaverMaxBitrate", "getDataSaverMaxBitrate", "dataSaverMaxHeight", "getDataSaverMaxHeight", "dataSaverMaxWidth", "getDataSaverMaxWidth", "enableTunneledPlayback", "", "getEnableTunneledPlayback", "()Ljava/util/List;", "errorDialogWhitelist", "getErrorDialogWhitelist", "ignoreTunneledPlayback", "getIgnoreTunneledPlayback", "initialMaxBitrate", "getInitialMaxBitrate", "maxBitrate", "getMaxBitrate", "maxConsecutivePlayDurationHours", "getMaxConsecutivePlayDurationHours", "maxStartupBitrateMap", "getMaxStartupBitrateMap", "playReadyDevices", "getPlayReadyDevices", "remoteDeviceOverrides", "getRemoteDeviceOverrides", "remoteMaxAudioChannelsMap", "getRemoteMaxAudioChannelsMap", "rolloutPercentageTunneledPlayback", "", "getRolloutPercentageTunneledPlayback", "()D", "showDialogForAllErrors", "", "getShowDialogForAllErrors", "()Z", "supportedHDCPLevels", "getSupportedHDCPLevels", "systemIdPlaybackScenarioMap", "getSystemIdPlaybackScenarioMap", "byteBufferLimitKb", "()Ljava/lang/Integer;", "deviceScenarioOverride", "isTunneledVideoPlaybackEnabled", "maxAudioChannels", "shouldDisplayErrorDialog", "throwable", "", "systemIdScenarioOverride", "widevineDowngradeOverride", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.a */
/* compiled from: PlaybackConfig.kt */
public final class C6266a {

    /* renamed from: f */
    private static final Map<String, Number> f14308f;

    /* renamed from: g */
    private static final Map<String, String> f14309g;

    /* renamed from: a */
    private final C3524e f14310a;

    /* renamed from: b */
    private final C5862q0 f14311b;

    /* renamed from: c */
    private final ActivityManager f14312c;

    /* renamed from: d */
    private final BuildInfo f14313d;

    /* renamed from: e */
    private final C3577a f14314e;

    /* renamed from: com.bamtechmedia.dominguez.playback.a$a */
    /* compiled from: PlaybackConfig.kt */
    private static final class C6267a {
        private C6267a() {
        }

        public /* synthetic */ C6267a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.a$b */
    /* compiled from: Comparisons.kt */
    public static final class C6268b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C13206b.m40622a(Integer.valueOf(((Number) ((Pair) t).mo31015c()).intValue()), Integer.valueOf(((Number) ((Pair) t2).mo31015c()).intValue()));
        }
    }

    static {
        new C6267a(null);
        StringBuilder sb = new StringBuilder();
        String str = "market_";
        sb.append(str);
        sb.append(Market.AMAZON.name());
        String str2 = "_sdk_21";
        sb.append(str2);
        String sb2 = sb.toString();
        Integer valueOf = Integer.valueOf(2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(Market.AMAZON.name());
        String str3 = "_sdk_22";
        sb3.append(str3);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(Market.GOOGLE.name());
        sb4.append(str2);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(Market.GOOGLE.name());
        sb5.append(str3);
        f14308f = C13173j0.m40356a(C12907r.m40244a(sb2, valueOf), C12907r.m40244a(sb3.toString(), valueOf), C12907r.m40244a(sb4.toString(), valueOf), C12907r.m40244a(sb5.toString(), valueOf));
        String str4 = "restricted-drm-ctr-sw";
        f14309g = C13173j0.m40356a(C12907r.m40244a("samsung_SM-T375", str4), C12907r.m40244a("samsung_SAMSUNG-SM-T375", str4), C12907r.m40244a("samsung_SM-T377", str4), C12907r.m40244a("samsung_SAMSUNG-SM-T377", str4), C12907r.m40244a("samsung_SM-T377A", str4), C12907r.m40244a("samsung_SAMSUNG-SM-T377A", str4), C12907r.m40244a("samsung_SM-T377P", str4), C12907r.m40244a("samsung_SAMSUNG-SM-T377P", str4), C12907r.m40244a("samsung_SM-T377R", str4), C12907r.m40244a("samsung_SAMSUNG-SM-T377R", str4), C12907r.m40244a("samsung_SM-T377T", str4), C12907r.m40244a("samsung_SAMSUNG-SM-T377T", str4), C12907r.m40244a("samsung_SM-T377W", str4), C12907r.m40244a("samsung_SAMSUNG-SM-T377W", str4), C12907r.m40244a("samsung_SM-T530", str4), C12907r.m40244a("samsung_SM-T535", str4));
    }

    public C6266a(C3524e eVar, C5862q0 q0Var, ActivityManager activityManager, BuildInfo buildInfo, C3577a aVar) {
        this.f14310a = eVar;
        this.f14311b = q0Var;
        this.f14312c = activityManager;
        this.f14313d = buildInfo;
        this.f14314e = aVar;
    }

    /* renamed from: r */
    private final Map<String, Number> m19753r() {
        Map<String, Number> map = (Map) this.f14310a.mo12720d("player", "byteBufferLimits");
        if (map != null) {
            return map;
        }
        return C13170i0.m40332a(C12907r.m40244a("1024", Integer.valueOf(ContentServiceClientExtras.URL_SIZE_LIMIT)));
    }

    /* renamed from: s */
    private final List<String> m19754s() {
        List<String> list = (List) this.f14310a.mo12720d("experimental", "enableTunneledPlayback");
        return list != null ? list : C13185o.m40513a();
    }

    /* renamed from: t */
    private final List<String> m19755t() {
        List<String> list = (List) this.f14310a.mo12720d("playback", "errorDialogWhitelist");
        return list != null ? list : C13183n.m40498a("output protections");
    }

    /* renamed from: u */
    private final List<String> m19756u() {
        List<String> list = (List) this.f14310a.mo12720d("experimental", "ignoreTunneledPlayback");
        return list != null ? list : C13185o.m40513a();
    }

    /* renamed from: v */
    private final Map<String, String> m19757v() {
        Map<String, String> map = (Map) this.f14310a.mo12720d("playback", "deviceScenarioOverrides");
        return map != null ? map : C13173j0.m40350a();
    }

    /* renamed from: w */
    private final Map<String, Number> m19758w() {
        Map<String, Number> map = (Map) this.f14310a.mo12720d("playback", "maxAudioChannels");
        return map != null ? map : C13173j0.m40350a();
    }

    /* renamed from: x */
    private final double m19759x() {
        Double b = this.f14310a.mo12718b("experimental", "rolloutPercentageTunneledPlayback");
        if (b != null) {
            return b.doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: y */
    private final boolean m19760y() {
        Boolean bool = (Boolean) this.f14310a.mo12720d("playback", "showDialogForAllErrors");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: z */
    private final Map<String, String> m19761z() {
        Map<String, String> map = (Map) this.f14310a.mo12720d("playback", "systemIdPlaybackScenarios");
        if (map != null) {
            return map;
        }
        String str = "restricted-drm-ctr-sw";
        return C13173j0.m40356a(C12907r.m40244a("5568", str), C12907r.m40244a("5730", str), C12907r.m40244a("6047", str), C12907r.m40244a("6202", str), C12907r.m40244a("5485", str), C12907r.m40244a("6563", str));
    }

    /* renamed from: a */
    public final Integer mo18849a() {
        Object obj;
        boolean z;
        MemoryInfo memoryInfo = new MemoryInfo();
        this.f14312c.getMemoryInfo(memoryInfo);
        Map r = m19753r();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(r.size()));
        for (Entry entry : r.entrySet()) {
            linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) entry.getKey())), entry.getValue());
        }
        List a = C13199w.m40562a((Iterable) C13177k0.m40416f(linkedHashMap), (Comparator) new C6268b());
        ListIterator listIterator = a.listIterator(a.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((Number) ((Pair) obj).mo31015c()).longValue() <= memoryInfo.availMem / ((long) 1024)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return null;
        }
        Number number = (Number) pair.mo31016d();
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    /* renamed from: b */
    public final String mo18851b() {
        Map a = C13173j0.m40353a((Map) f14309g, m19757v());
        StringBuilder sb = new StringBuilder();
        sb.append(Build.BRAND);
        sb.append('_');
        sb.append(Build.MODEL);
        String str = (String) a.get(sb.toString());
        if (str == null || !(!C12832w.m40118a(str))) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public final int mo18852c() {
        Integer c = this.f14310a.mo12719c("playback", "cellular", "initialMaxBitrate");
        return c != null ? c.intValue() : mo18853d();
    }

    /* renamed from: d */
    public final int mo18853d() {
        Integer c = this.f14310a.mo12719c("playback", "cellular", "maxBitrate");
        if (c != null) {
            return c.intValue();
        }
        return 4000000;
    }

    /* renamed from: e */
    public final int mo18854e() {
        Integer c = this.f14310a.mo12719c("playback", "dataSaver", "maxBitrate");
        if (c != null) {
            return c.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: f */
    public final int mo18855f() {
        Integer c = this.f14310a.mo12719c("playback", "dataSaver", "maxHeight");
        if (c != null) {
            return c.intValue();
        }
        return 480;
    }

    /* renamed from: g */
    public final int mo18856g() {
        Integer c = this.f14310a.mo12719c("playback", "dataSaver", "maxWidth");
        if (c != null) {
            return c.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: h */
    public final int mo18857h() {
        Integer c = this.f14310a.mo12719c("playback", "initialMaxBitrate");
        if (c != null) {
            return c.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: i */
    public final int mo18858i() {
        Integer c = this.f14310a.mo12719c("playback", "maxBitrate");
        if (c != null) {
            return c.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: j */
    public final int mo18859j() {
        Integer c = this.f14310a.mo12719c("maxConsecutivePlayDurationHours", new String[0]);
        if (c != null) {
            return c.intValue();
        }
        return 3;
    }

    /* renamed from: k */
    public final Map<Integer, Integer> mo18860k() {
        Map map = (Map) this.f14310a.mo12720d("playback", "maxStartupBitrateMap");
        if (map == null) {
            return C13173j0.m40350a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) entry.getKey())), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13173j0.m40349a(linkedHashMap.size()));
        for (Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Integer.valueOf(Integer.parseInt((String) entry2.getValue())));
        }
        return linkedHashMap2;
    }

    /* renamed from: l */
    public final List<String> mo18861l() {
        List<String> list = (List) this.f14310a.mo12720d("playback", "playReadyDevices");
        return list != null ? list : C13185o.m40520c("AFTB", "AFTM");
    }

    /* renamed from: m */
    public final List<String> mo18862m() {
        return (List) this.f14310a.mo12720d("playback", "supportedHDCPLevels");
    }

    /* renamed from: n */
    public final boolean mo18863n() {
        return m19754s().contains(Build.MODEL) || (!m19756u().contains(Build.MODEL) && this.f14314e.mo12776a() <= m19759x());
    }

    /* renamed from: o */
    public final Integer mo18864o() {
        Map a = C13173j0.m40353a((Map) f14308f, m19758w());
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(a.size()));
        for (Entry entry : a.entrySet()) {
            linkedHashMap.put(entry.getKey(), Integer.valueOf(((Number) entry.getValue()).intValue()));
        }
        Integer num = (Integer) linkedHashMap.get("all");
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("market_");
            sb.append(this.f14313d.mo12779b().name());
            sb.append("_sdk_");
            sb.append(VERSION.SDK_INT);
            num = (Integer) linkedHashMap.get(sb.toString());
        }
        if (num == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("model_");
            sb2.append(Build.MODEL);
            num = (Integer) linkedHashMap.get(sb2.toString());
        }
        if (num != null) {
            return num;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("manufacturer_");
        sb3.append(Build.MANUFACTURER);
        return (Integer) linkedHashMap.get(sb3.toString());
    }

    /* renamed from: p */
    public final String mo18865p() {
        C5860p0 a = this.f14311b.mo17767a();
        if (a != null) {
            return (String) m19761z().get(a.mo17763c());
        }
        return null;
    }

    /* renamed from: q */
    public final String mo18866q() {
        String str = (String) this.f14310a.mo12720d("playback", "widevineDowngradeOverride");
        return str != null ? str : "restricted-drm-ctr-sw";
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18850a(java.lang.Throwable r8) {
        /*
            r7 = this;
            boolean r0 = r7.m19760y()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0040
            java.util.List r0 = r7.m19755t()
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0018
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0018
        L_0x0016:
            r8 = 0
            goto L_0x003c
        L_0x0018:
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0016
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r8.getMessage()
            if (r4 == 0) goto L_0x0038
            r5 = 2
            r6 = 0
            boolean r3 = kotlin.p588j0.C12833x.m40154a(r4, r3, r2, r5, r6)
            if (r3 != r1) goto L_0x0038
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x001c
            r8 = 1
        L_0x003c:
            if (r8 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.C6266a.mo18850a(java.lang.Throwable):boolean");
    }
}
