package com.bamtech.sdk4.useractivity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/EventSchemata;", "", "schemata", "", "Lcom/bamtech/sdk4/useractivity/EventSchema;", "passthrough", "", "(Ljava/util/List;Z)V", "getPassthrough", "()Z", "getSchemata", "()Ljava/util/List;", "generateEventPayload", "", "", "trackingParameters", "", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EventSchemata.kt */
public final class EventSchemata {
    private final boolean passthrough;
    private final List<EventSchema> schemata;

    public EventSchemata(List<EventSchema> list, boolean z) {
        this.schemata = list;
        this.passthrough = z;
    }

    public final Map<String, Object> generateEventPayload(Map<String, ? extends Object> map) {
        Map<String, Object> map2;
        if (this.passthrough) {
            map2 = C13173j0.m40365e(map);
        } else {
            map2 = new LinkedHashMap<>();
        }
        ListIterator listIterator = this.schemata.listIterator();
        while (listIterator.hasNext()) {
            map2.putAll(((EventSchema) listIterator.next()).generateEventData$plugin_user_activity_release(map));
        }
        return map2;
    }
}
