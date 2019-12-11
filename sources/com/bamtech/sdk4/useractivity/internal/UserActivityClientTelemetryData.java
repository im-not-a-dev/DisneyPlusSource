package com.bamtech.sdk4.useractivity.internal;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.telemetry.TelemetryClientPayload;
import kotlin.Metadata;
import org.joda.time.DateTime;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/internal/UserActivityClientTelemetryData;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "category", "", "event", "eventId", "timestamp", "Lorg/joda/time/DateTime;", "data", "Lcom/bamtech/sdk4/useractivity/internal/ClientData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lcom/bamtech/sdk4/useractivity/internal/ClientData;)V", "getCategory", "()Ljava/lang/String;", "getData", "()Lcom/bamtech/sdk4/useractivity/internal/ClientData;", "getEvent", "getEventId", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserActivityDustEvent.kt */
public final class UserActivityClientTelemetryData implements TelemetryClientPayload {
    private final String category;
    private final ClientData data;
    private final String event;
    private final String eventId;
    private final DateTime timestamp;

    public UserActivityClientTelemetryData(String str, String str2, String str3, DateTime dateTime, ClientData clientData) {
        this.category = str;
        this.event = str2;
        this.eventId = str3;
        this.timestamp = dateTime;
        this.data = clientData;
    }

    public static /* synthetic */ UserActivityClientTelemetryData copy$default(UserActivityClientTelemetryData userActivityClientTelemetryData, String str, String str2, String str3, DateTime dateTime, ClientData clientData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userActivityClientTelemetryData.category;
        }
        if ((i & 2) != 0) {
            str2 = userActivityClientTelemetryData.getEvent();
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = userActivityClientTelemetryData.eventId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            dateTime = userActivityClientTelemetryData.timestamp;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != 0) {
            clientData = userActivityClientTelemetryData.data;
        }
        return userActivityClientTelemetryData.copy(str, str4, str5, dateTime2, clientData);
    }

    public final String component1() {
        return this.category;
    }

    public final String component2() {
        return getEvent();
    }

    public final String component3() {
        return this.eventId;
    }

    public final DateTime component4() {
        return this.timestamp;
    }

    public final ClientData component5() {
        return this.data;
    }

    public final UserActivityClientTelemetryData copy(String str, String str2, String str3, DateTime dateTime, ClientData clientData) {
        UserActivityClientTelemetryData userActivityClientTelemetryData = new UserActivityClientTelemetryData(str, str2, str3, dateTime, clientData);
        return userActivityClientTelemetryData;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.data, (java.lang.Object) r3.data) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0041
            boolean r0 = r3 instanceof com.bamtech.sdk4.useractivity.internal.UserActivityClientTelemetryData
            if (r0 == 0) goto L_0x003f
            com.bamtech.sdk4.useractivity.internal.UserActivityClientTelemetryData r3 = (com.bamtech.sdk4.useractivity.internal.UserActivityClientTelemetryData) r3
            java.lang.String r0 = r2.category
            java.lang.String r1 = r3.category
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.getEvent()
            java.lang.String r1 = r3.getEvent()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.eventId
            java.lang.String r1 = r3.eventId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003f
            org.joda.time.DateTime r0 = r2.timestamp
            org.joda.time.DateTime r1 = r3.timestamp
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003f
            com.bamtech.sdk4.useractivity.internal.ClientData r0 = r2.data
            com.bamtech.sdk4.useractivity.internal.ClientData r3 = r3.data
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = 0
            return r3
        L_0x0041:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.useractivity.internal.UserActivityClientTelemetryData.equals(java.lang.Object):boolean");
    }

    public final String getCategory() {
        return this.category;
    }

    public final ClientData getData() {
        return this.data;
    }

    public String getEvent() {
        return this.event;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.category;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String event2 = getEvent();
        int hashCode2 = (hashCode + (event2 != null ? event2.hashCode() : 0)) * 31;
        String str2 = this.eventId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        DateTime dateTime = this.timestamp;
        int hashCode4 = (hashCode3 + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        ClientData clientData = this.data;
        if (clientData != null) {
            i = clientData.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserActivityClientTelemetryData(category=");
        sb.append(this.category);
        sb.append(", event=");
        sb.append(getEvent());
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }
}
