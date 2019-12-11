package com.bamtech.sdk4.useractivity;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H&J&\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/EventSchemataProvider;", "", "schemata", "", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent;", "Lcom/bamtech/sdk4/useractivity/EventSchemata;", "getSchemata", "()Ljava/util/Map;", "event", "setSchemata", "", "", "Lcom/bamtech/sdk4/useractivity/EventSchema;", "passthrough", "", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EventSchemataProvider.kt */
public interface EventSchemataProvider {
    EventSchemata getSchemata(GlimpseEvent glimpseEvent);
}
