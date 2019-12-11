package com.disneystreaming.companion.messaging;

import java.util.Map;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11760v.C11761a;

/* renamed from: com.disneystreaming.companion.messaging.d */
/* compiled from: MessageTypes.kt */
public final class C8569d {

    /* renamed from: a */
    public static final C8569d f18269a = new C8569d();

    private C8569d() {
    }

    /* renamed from: b */
    private final C11760v m24793b() {
        C11761a aVar = new C11761a();
        aVar.mo29872a(MessageType.class, new MessageTypeJsonAdapter());
        C11760v a = aVar.mo29873a();
        C12880j.m40222a((Object) a, "Moshi.Builder()\n        …r())\n            .build()");
        return a;
    }

    /* renamed from: a */
    public final C11760v mo21939a() {
        return m24793b();
    }

    /* renamed from: a */
    public final String mo21941a(Message message) {
        C11725h a = mo21939a().mo29866a(Message.class);
        Payload payload = message.getPayload();
        Map context = message.getPayload().getContext();
        payload.setContext(context != null ? C13170i0.m40334b(context) : null);
        String json = a.toJson(message);
        C12880j.m40222a((Object) json, "moshi.adapter<Message>(M…context?.toSortedMap() })");
        return json;
    }

    /* renamed from: a */
    public final String mo21942a(Payload payload) {
        C11725h a = mo21939a().mo29866a(Payload.class);
        Map context = payload.getContext();
        payload.setContext(context != null ? C13170i0.m40334b(context) : null);
        String json = a.toJson(payload);
        C12880j.m40222a((Object) json, "moshi.adapter<Payload>(P…context?.toSortedMap() })");
        return json;
    }

    /* renamed from: a */
    public final <T> T mo21940a(Class<T> cls, String str) {
        return mo21939a().mo29866a(cls).fromJson(str);
    }
}
