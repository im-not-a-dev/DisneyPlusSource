package com.bamtech.sdk4.useractivity;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0016J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/DefaultEventSchemataProvider;", "Lcom/bamtech/sdk4/useractivity/EventSchemataProvider;", "()V", "schemata", "", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent;", "Lcom/bamtech/sdk4/useractivity/EventSchemata;", "getSchemata", "()Ljava/util/Map;", "event", "setSchemata", "", "", "Lcom/bamtech/sdk4/useractivity/EventSchema;", "passthrough", "", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EventSchemataProvider.kt */
public final class DefaultEventSchemataProvider implements EventSchemataProvider {
    private final Map<GlimpseEvent, EventSchemata> schemata = new LinkedHashMap();

    public Map<GlimpseEvent, EventSchemata> getSchemata() {
        return this.schemata;
    }

    public EventSchemata getSchemata(GlimpseEvent glimpseEvent) {
        EventSchemata eventSchemata = (EventSchemata) getSchemata().get(glimpseEvent);
        return eventSchemata != null ? eventSchemata : new EventSchemata(C13185o.m40513a(), true);
    }
}
