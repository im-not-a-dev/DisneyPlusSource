package com.bamtech.sdk4.useractivity;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0002\b\fR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/EventSchema;", "", "()V", "values", "", "", "Lcom/bamtech/sdk4/useractivity/EventValue;", "getValues", "()Ljava/util/Map;", "generateEventData", "", "trackingParameters", "generateEventData$plugin_user_activity_release", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EventSchema.kt */
public final class EventSchema {
    private final Map<String, EventValue> values = new LinkedHashMap();

    public final Map<String, Object> generateEventData$plugin_user_activity_release(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : this.values.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((EventValue) entry.getValue()).generateValue(map));
        }
        return linkedHashMap;
    }
}
