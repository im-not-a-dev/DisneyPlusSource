package com.bamtech.sdk4.useractivity.internal;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.telemetry.TelemetryClientPayload;
import com.bamtech.sdk4.internal.telemetry.TelemetryEvent;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Application;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Device;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Sdk;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \n*\b\b\u0000\u0010\u0001*\u00020\u00022\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\nB%\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\t¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/internal/UserActivityDustEvent;", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "", "", "", "server", "client", "(Ljava/util/Map;Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;)V", "Companion", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserActivityDustEvent.kt */
public final class UserActivityDustEvent<T extends TelemetryClientPayload> extends TelemetryEvent<Map<String, ? extends Object>, T> {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rJ6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/internal/UserActivityDustEvent$Companion;", "", "()V", "generateEvent", "Lcom/bamtech/sdk4/useractivity/internal/UserActivityDustEvent;", "Lcom/bamtech/sdk4/useractivity/internal/UserActivityClientTelemetryData;", "transactionId", "Ljava/util/UUID;", "rewardToken", "", "contentId", "action", "recommendedContentIds", "", "Lcom/bamtech/sdk4/useractivity/internal/UserActivityData;", "event", "category", "dustClientConstants", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "data", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: UserActivityDustEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final UserActivityDustEvent<UserActivityData> generateEvent(String str, String str2, DustClientConstants dustClientConstants, UUID uuid, Object obj) {
            Application application = dustClientConstants.getApplication();
            Device device = dustClientConstants.getDevice();
            Sdk sdk = dustClientConstants.getSdk();
            DateTime withZone = DateTime.now().withZone(DateTimeZone.UTC);
            C12880j.m40222a((Object) withZone, "DateTime.now().withZone(DateTimeZone.UTC)");
            String uuid2 = uuid.toString();
            C12880j.m40222a((Object) uuid2, "transactionId.toString()");
            UserActivityData userActivityData = new UserActivityData(application, device, sdk, withZone, str, str2, uuid2, dustClientConstants.getCorrelationIds(), obj);
            return new UserActivityDustEvent<>(null, userActivityData);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserActivityDustEvent(Map<String, ? extends Object> map, T t) {
        super(map, t);
    }
}
