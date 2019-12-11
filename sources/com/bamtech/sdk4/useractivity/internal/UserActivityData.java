package com.bamtech.sdk4.useractivity.internal;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.telemetry.TelemetryClientPayload;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Application;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Device;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Sdk;
import java.util.Map;
import kotlin.Metadata;
import org.joda.time.DateTime;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/internal/UserActivityData;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "application", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "device", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "sdk", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "timestamp", "Lorg/joda/time/DateTime;", "event", "", "category", "eventId", "correlationIds", "", "data", "", "(Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)V", "getApplication", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "getCategory", "()Ljava/lang/String;", "getCorrelationIds", "()Ljava/util/Map;", "getData", "()Ljava/lang/Object;", "getDevice", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "getEvent", "getEventId", "getSdk", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserActivityDustEvent.kt */
public final class UserActivityData implements TelemetryClientPayload {
    private final Application application;
    private final String category;
    private final Map<String, String> correlationIds;
    private final Object data;
    private final Device device;
    private final String event;
    private final String eventId;
    private final Sdk sdk;
    private final DateTime timestamp;

    public UserActivityData(Application application2, Device device2, Sdk sdk2, DateTime dateTime, String str, String str2, String str3, Map<String, String> map, Object obj) {
        this.application = application2;
        this.device = device2;
        this.sdk = sdk2;
        this.timestamp = dateTime;
        this.event = str;
        this.category = str2;
        this.eventId = str3;
        this.correlationIds = map;
        this.data = obj;
    }

    public static /* synthetic */ UserActivityData copy$default(UserActivityData userActivityData, Application application2, Device device2, Sdk sdk2, DateTime dateTime, String str, String str2, String str3, Map map, Object obj, int i, Object obj2) {
        UserActivityData userActivityData2 = userActivityData;
        int i2 = i;
        return userActivityData.copy((i2 & 1) != 0 ? userActivityData2.application : application2, (i2 & 2) != 0 ? userActivityData2.device : device2, (i2 & 4) != 0 ? userActivityData2.sdk : sdk2, (i2 & 8) != 0 ? userActivityData2.timestamp : dateTime, (i2 & 16) != 0 ? userActivityData.getEvent() : str, (i2 & 32) != 0 ? userActivityData2.category : str2, (i2 & 64) != 0 ? userActivityData2.eventId : str3, (i2 & 128) != 0 ? userActivityData2.correlationIds : map, (i2 & 256) != 0 ? userActivityData2.data : obj);
    }

    public final Application component1() {
        return this.application;
    }

    public final Device component2() {
        return this.device;
    }

    public final Sdk component3() {
        return this.sdk;
    }

    public final DateTime component4() {
        return this.timestamp;
    }

    public final String component5() {
        return getEvent();
    }

    public final String component6() {
        return this.category;
    }

    public final String component7() {
        return this.eventId;
    }

    public final Map<String, String> component8() {
        return this.correlationIds;
    }

    public final Object component9() {
        return this.data;
    }

    public final UserActivityData copy(Application application2, Device device2, Sdk sdk2, DateTime dateTime, String str, String str2, String str3, Map<String, String> map, Object obj) {
        UserActivityData userActivityData = new UserActivityData(application2, device2, sdk2, dateTime, str, str2, str3, map, obj);
        return userActivityData;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2.data, r3.data) != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0069
            boolean r0 = r3 instanceof com.bamtech.sdk4.useractivity.internal.UserActivityData
            if (r0 == 0) goto L_0x0067
            com.bamtech.sdk4.useractivity.internal.UserActivityData r3 = (com.bamtech.sdk4.useractivity.internal.UserActivityData) r3
            com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Application r0 = r2.application
            com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Application r1 = r3.application
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0067
            com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Device r0 = r2.device
            com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Device r1 = r3.device
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0067
            com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Sdk r0 = r2.sdk
            com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants$Sdk r1 = r3.sdk
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0067
            org.joda.time.DateTime r0 = r2.timestamp
            org.joda.time.DateTime r1 = r3.timestamp
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r2.getEvent()
            java.lang.String r1 = r3.getEvent()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r2.category
            java.lang.String r1 = r3.category
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r2.eventId
            java.lang.String r1 = r3.eventId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.correlationIds
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.correlationIds
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r2.data
            java.lang.Object r3 = r3.data
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r3 = 0
            return r3
        L_0x0069:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.useractivity.internal.UserActivityData.equals(java.lang.Object):boolean");
    }

    public final Application getApplication() {
        return this.application;
    }

    public final String getCategory() {
        return this.category;
    }

    public final Map<String, String> getCorrelationIds() {
        return this.correlationIds;
    }

    public final Object getData() {
        return this.data;
    }

    public final Device getDevice() {
        return this.device;
    }

    public String getEvent() {
        return this.event;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Sdk getSdk() {
        return this.sdk;
    }

    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Application application2 = this.application;
        int i = 0;
        int hashCode = (application2 != null ? application2.hashCode() : 0) * 31;
        Device device2 = this.device;
        int hashCode2 = (hashCode + (device2 != null ? device2.hashCode() : 0)) * 31;
        Sdk sdk2 = this.sdk;
        int hashCode3 = (hashCode2 + (sdk2 != null ? sdk2.hashCode() : 0)) * 31;
        DateTime dateTime = this.timestamp;
        int hashCode4 = (hashCode3 + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        String event2 = getEvent();
        int hashCode5 = (hashCode4 + (event2 != null ? event2.hashCode() : 0)) * 31;
        String str = this.category;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.eventId;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.correlationIds;
        int hashCode8 = (hashCode7 + (map != null ? map.hashCode() : 0)) * 31;
        Object obj = this.data;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserActivityData(application=");
        sb.append(this.application);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", sdk=");
        sb.append(this.sdk);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", event=");
        sb.append(getEvent());
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", correlationIds=");
        sb.append(this.correlationIds);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }
}
