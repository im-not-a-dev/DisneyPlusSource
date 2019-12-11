package p163g.p201e.p203b.p278h.p280l;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import kotlin.Metadata;
import p163g.p201e.p203b.p278h.C7236b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\bH\u0002R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ctvactivation/config/CtvActivationConfigImpl;", "Lcom/bamtechmedia/dominguez/ctvactivation/CtvActivationConfig;", "map", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "(Lcom/bamtechmedia/dominguez/config/AppConfigMap;Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "appId", "", "getAppId", "()Ljava/lang/String;", "broadcastInterval", "", "getBroadcastInterval", "()J", "deviceFrameMasterID", "getDeviceFrameMasterID", "enabled", "", "getEnabled", "()Z", "tcpPort", "", "getTcpPort", "()I", "udpPort", "getUdpPort", "getDefaultMasterID", "Companion", "ctvActivation_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.h.l.a */
/* compiled from: CtvActivationConfigImpl.kt */
public final class C7252a implements C7236b {

    /* renamed from: a */
    private final C3524e f15977a;

    /* renamed from: g.e.b.h.l.a$a */
    /* compiled from: CtvActivationConfigImpl.kt */
    public static final class C7253a {
        private C7253a() {
        }

        public /* synthetic */ C7253a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7253a(null);
    }

    public C7252a(C3524e eVar, BuildInfo buildInfo) {
        this.f15977a = eVar;
    }

    /* renamed from: a */
    public boolean mo20060a() {
        Boolean bool = (Boolean) this.f15977a.mo12720d("ctvActivation", "enabled");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: b */
    public String mo20072b() {
        String str = (String) this.f15977a.mo12720d("ctvActivation", "appId");
        return str != null ? str : "com.disney.disneyplus";
    }

    /* renamed from: c */
    public int mo20073c() {
        Integer c = this.f15977a.mo12719c("ctvActivation", "tcpPort");
        if (c != null) {
            return c.intValue();
        }
        return 40777;
    }

    /* renamed from: d */
    public int mo20074d() {
        Integer c = this.f15977a.mo12719c("ctvActivation", "udpPort");
        if (c != null) {
            return c.intValue();
        }
        return 40777;
    }
}
