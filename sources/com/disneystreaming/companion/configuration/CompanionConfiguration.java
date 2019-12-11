package com.disneystreaming.companion.configuration;

import com.disneystreaming.companion.p351l.C8477d;
import com.disneystreaming.companion.p352m.C8489l;
import com.disneystreaming.companion.p352m.p353m.C8503c;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, mo31007d2 = {"Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "", "appId", "", "peerId", "deviceName", "logLevel", "Lcom/disneystreaming/companion/logger/LoggerLevel;", "services", "", "Lcom/disneystreaming/companion/service/ServiceType;", "Lcom/disneystreaming/companion/configuration/ServiceConfiguration;", "pingInterval", "", "pingTimeout", "allowRePairing", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/disneystreaming/companion/logger/LoggerLevel;Ljava/util/Map;JJZ)V", "getAllowRePairing", "()Z", "getAppId", "()Ljava/lang/String;", "getDeviceName", "getLogLevel", "()Lcom/disneystreaming/companion/logger/LoggerLevel;", "getPeerId", "getPingInterval", "()J", "getPingTimeout", "getServices", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CompanionConfiguration.kt */
public final class CompanionConfiguration {
    private final boolean allowRePairing;
    private final String appId;
    private final String deviceName;
    private final C8477d logLevel;
    private final String peerId;
    private final long pingInterval;
    private final long pingTimeout;
    private final Map<C8489l, C8446a> services;

    public CompanionConfiguration(String str, String str2, String str3, C8477d dVar, Map<C8489l, ? extends C8446a> map, long j, long j2, boolean z) {
        this.appId = str;
        this.peerId = str2;
        this.deviceName = str3;
        this.logLevel = dVar;
        this.services = map;
        this.pingInterval = j;
        this.pingTimeout = j2;
        this.allowRePairing = z;
    }

    public static /* synthetic */ CompanionConfiguration copy$default(CompanionConfiguration companionConfiguration, String str, String str2, String str3, C8477d dVar, Map map, long j, long j2, boolean z, int i, Object obj) {
        CompanionConfiguration companionConfiguration2 = companionConfiguration;
        int i2 = i;
        return companionConfiguration.copy((i2 & 1) != 0 ? companionConfiguration2.appId : str, (i2 & 2) != 0 ? companionConfiguration2.peerId : str2, (i2 & 4) != 0 ? companionConfiguration2.deviceName : str3, (i2 & 8) != 0 ? companionConfiguration2.logLevel : dVar, (i2 & 16) != 0 ? companionConfiguration2.services : map, (i2 & 32) != 0 ? companionConfiguration2.pingInterval : j, (i2 & 64) != 0 ? companionConfiguration2.pingTimeout : j2, (i2 & 128) != 0 ? companionConfiguration2.allowRePairing : z);
    }

    public final String component1() {
        return this.appId;
    }

    public final String component2() {
        return this.peerId;
    }

    public final String component3() {
        return this.deviceName;
    }

    public final C8477d component4() {
        return this.logLevel;
    }

    public final Map<C8489l, C8446a> component5() {
        return this.services;
    }

    public final long component6() {
        return this.pingInterval;
    }

    public final long component7() {
        return this.pingTimeout;
    }

    public final boolean component8() {
        return this.allowRePairing;
    }

    public final CompanionConfiguration copy(String str, String str2, String str3, C8477d dVar, Map<C8489l, ? extends C8446a> map, long j, long j2, boolean z) {
        CompanionConfiguration companionConfiguration = new CompanionConfiguration(str, str2, str3, dVar, map, j, j2, z);
        return companionConfiguration;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CompanionConfiguration) {
                CompanionConfiguration companionConfiguration = (CompanionConfiguration) obj;
                if (C12880j.m40224a((Object) this.appId, (Object) companionConfiguration.appId) && C12880j.m40224a((Object) this.peerId, (Object) companionConfiguration.peerId) && C12880j.m40224a((Object) this.deviceName, (Object) companionConfiguration.deviceName) && C12880j.m40224a((Object) this.logLevel, (Object) companionConfiguration.logLevel) && C12880j.m40224a((Object) this.services, (Object) companionConfiguration.services)) {
                    if (this.pingInterval == companionConfiguration.pingInterval) {
                        if (this.pingTimeout == companionConfiguration.pingTimeout) {
                            if (this.allowRePairing == companionConfiguration.allowRePairing) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getAllowRePairing() {
        return this.allowRePairing;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final C8477d getLogLevel() {
        return this.logLevel;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final long getPingInterval() {
        return this.pingInterval;
    }

    public final long getPingTimeout() {
        return this.pingTimeout;
    }

    public final Map<C8489l, C8446a> getServices() {
        return this.services;
    }

    public int hashCode() {
        String str = this.appId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.peerId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.deviceName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C8477d dVar = this.logLevel;
        int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Map<C8489l, C8446a> map = this.services;
        if (map != null) {
            i = map.hashCode();
        }
        int a = (((((hashCode4 + i) * 31) + Long.valueOf(this.pingInterval).hashCode()) * 31) + Long.valueOf(this.pingTimeout).hashCode()) * 31;
        boolean z = this.allowRePairing;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompanionConfiguration(appId=");
        sb.append(this.appId);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", deviceName=");
        sb.append(this.deviceName);
        sb.append(", logLevel=");
        sb.append(this.logLevel);
        sb.append(", services=");
        sb.append(this.services);
        sb.append(", pingInterval=");
        sb.append(this.pingInterval);
        sb.append(", pingTimeout=");
        sb.append(this.pingTimeout);
        sb.append(", allowRePairing=");
        sb.append(this.allowRePairing);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ CompanionConfiguration(String str, String str2, String str3, C8477d dVar, Map map, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        C8477d dVar2 = (i2 & 8) != 0 ? C8477d.WARN : dVar;
        Map a = (i2 & 16) != 0 ? C13170i0.m40332a(C12907r.m40244a(C8489l.SOCKET, new C8503c(1, 4077, 4078, 3))) : map;
        this(str, str2, str3, dVar2, a, (i2 & 32) != 0 ? 10 : j, (i2 & 64) != 0 ? 30 : j2, (i2 & 128) != 0 ? false : z);
    }
}
