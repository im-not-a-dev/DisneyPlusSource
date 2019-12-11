package com.bamtech.sdk4.session;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.shadow.gson.p050r.C2246c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionInfo;", "", "id", "", "account", "Lcom/bamtech/sdk4/session/SessionAccountInfo;", "device", "Lcom/bamtech/sdk4/session/SessionDeviceInfo;", "location", "Lcom/bamtech/sdk4/session/SessionLocation;", "profile", "Lcom/bamtech/sdk4/session/SessionProfileInfo;", "entitlements", "", "Lcom/bamtech/sdk4/session/SessionEntitlement;", "inSupportedLocation", "", "isSubscriber", "(Ljava/lang/String;Lcom/bamtech/sdk4/session/SessionAccountInfo;Lcom/bamtech/sdk4/session/SessionDeviceInfo;Lcom/bamtech/sdk4/session/SessionLocation;Lcom/bamtech/sdk4/session/SessionProfileInfo;Ljava/util/List;ZZ)V", "getAccount", "()Lcom/bamtech/sdk4/session/SessionAccountInfo;", "getDevice", "()Lcom/bamtech/sdk4/session/SessionDeviceInfo;", "getEntitlements", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getInSupportedLocation", "()Z", "getLocation", "()Lcom/bamtech/sdk4/session/SessionLocation;", "getProfile", "()Lcom/bamtech/sdk4/session/SessionProfileInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionInfo.kt */
public final class SessionInfo {
    private final SessionAccountInfo account;
    private final SessionDeviceInfo device;
    private final List<SessionEntitlement> entitlements;
    @C2246c("session_id")

    /* renamed from: id */
    private final String f6084id;
    private final boolean inSupportedLocation;
    private final boolean isSubscriber;
    private final SessionLocation location;
    private final SessionProfileInfo profile;

    public SessionInfo(String str, SessionAccountInfo sessionAccountInfo, SessionDeviceInfo sessionDeviceInfo, SessionLocation sessionLocation, SessionProfileInfo sessionProfileInfo, List<SessionEntitlement> list, boolean z, boolean z2) {
        this.f6084id = str;
        this.account = sessionAccountInfo;
        this.device = sessionDeviceInfo;
        this.location = sessionLocation;
        this.profile = sessionProfileInfo;
        this.entitlements = list;
        this.inSupportedLocation = z;
        this.isSubscriber = z2;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, SessionAccountInfo sessionAccountInfo, SessionDeviceInfo sessionDeviceInfo, SessionLocation sessionLocation, SessionProfileInfo sessionProfileInfo, List list, boolean z, boolean z2, int i, Object obj) {
        SessionInfo sessionInfo2 = sessionInfo;
        int i2 = i;
        return sessionInfo.copy((i2 & 1) != 0 ? sessionInfo2.f6084id : str, (i2 & 2) != 0 ? sessionInfo2.account : sessionAccountInfo, (i2 & 4) != 0 ? sessionInfo2.device : sessionDeviceInfo, (i2 & 8) != 0 ? sessionInfo2.location : sessionLocation, (i2 & 16) != 0 ? sessionInfo2.profile : sessionProfileInfo, (i2 & 32) != 0 ? sessionInfo2.entitlements : list, (i2 & 64) != 0 ? sessionInfo2.inSupportedLocation : z, (i2 & 128) != 0 ? sessionInfo2.isSubscriber : z2);
    }

    public final String component1() {
        return this.f6084id;
    }

    public final SessionAccountInfo component2() {
        return this.account;
    }

    public final SessionDeviceInfo component3() {
        return this.device;
    }

    public final SessionLocation component4() {
        return this.location;
    }

    public final SessionProfileInfo component5() {
        return this.profile;
    }

    public final List<SessionEntitlement> component6() {
        return this.entitlements;
    }

    public final boolean component7() {
        return this.inSupportedLocation;
    }

    public final boolean component8() {
        return this.isSubscriber;
    }

    public final SessionInfo copy(String str, SessionAccountInfo sessionAccountInfo, SessionDeviceInfo sessionDeviceInfo, SessionLocation sessionLocation, SessionProfileInfo sessionProfileInfo, List<SessionEntitlement> list, boolean z, boolean z2) {
        SessionInfo sessionInfo = new SessionInfo(str, sessionAccountInfo, sessionDeviceInfo, sessionLocation, sessionProfileInfo, list, z, z2);
        return sessionInfo;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionInfo) {
                SessionInfo sessionInfo = (SessionInfo) obj;
                if (C12880j.m40224a((Object) this.f6084id, (Object) sessionInfo.f6084id) && C12880j.m40224a((Object) this.account, (Object) sessionInfo.account) && C12880j.m40224a((Object) this.device, (Object) sessionInfo.device) && C12880j.m40224a((Object) this.location, (Object) sessionInfo.location) && C12880j.m40224a((Object) this.profile, (Object) sessionInfo.profile) && C12880j.m40224a((Object) this.entitlements, (Object) sessionInfo.entitlements)) {
                    if (this.inSupportedLocation == sessionInfo.inSupportedLocation) {
                        if (this.isSubscriber == sessionInfo.isSubscriber) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final SessionAccountInfo getAccount() {
        return this.account;
    }

    public final SessionDeviceInfo getDevice() {
        return this.device;
    }

    public final List<SessionEntitlement> getEntitlements() {
        return this.entitlements;
    }

    public final String getId() {
        return this.f6084id;
    }

    public final boolean getInSupportedLocation() {
        return this.inSupportedLocation;
    }

    public final SessionLocation getLocation() {
        return this.location;
    }

    public final SessionProfileInfo getProfile() {
        return this.profile;
    }

    public int hashCode() {
        String str = this.f6084id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SessionAccountInfo sessionAccountInfo = this.account;
        int hashCode2 = (hashCode + (sessionAccountInfo != null ? sessionAccountInfo.hashCode() : 0)) * 31;
        SessionDeviceInfo sessionDeviceInfo = this.device;
        int hashCode3 = (hashCode2 + (sessionDeviceInfo != null ? sessionDeviceInfo.hashCode() : 0)) * 31;
        SessionLocation sessionLocation = this.location;
        int hashCode4 = (hashCode3 + (sessionLocation != null ? sessionLocation.hashCode() : 0)) * 31;
        SessionProfileInfo sessionProfileInfo = this.profile;
        int hashCode5 = (hashCode4 + (sessionProfileInfo != null ? sessionProfileInfo.hashCode() : 0)) * 31;
        List<SessionEntitlement> list = this.entitlements;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.inSupportedLocation;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.isSubscriber;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final boolean isSubscriber() {
        return this.isSubscriber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SessionInfo(id=");
        sb.append(this.f6084id);
        sb.append(", account=");
        sb.append(this.account);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", entitlements=");
        sb.append(this.entitlements);
        sb.append(", inSupportedLocation=");
        sb.append(this.inSupportedLocation);
        sb.append(", isSubscriber=");
        sb.append(this.isSubscriber);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ SessionInfo(String str, SessionAccountInfo sessionAccountInfo, SessionDeviceInfo sessionDeviceInfo, SessionLocation sessionLocation, SessionProfileInfo sessionProfileInfo, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : sessionAccountInfo, sessionDeviceInfo, sessionLocation, (i & 16) != 0 ? null : sessionProfileInfo, list, z, z2);
    }
}
