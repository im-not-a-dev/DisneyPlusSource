package com.disneystreaming.companion.messaging;

import com.disneystreaming.companion.messaging.MessageType.C8545a;
import com.disneystreaming.companion.messaging.MessageType.C8546b;
import com.disneystreaming.companion.messaging.MessageType.C8547c;
import com.disneystreaming.companion.messaging.MessageType.C8548d;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11723f;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11779x;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, mo31007d2 = {"Lcom/disneystreaming/companion/messaging/MessageTypeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/disneystreaming/companion/messaging/MessageType;", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "ReservedTypes", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MessageTypeJsonAdapter.kt */
public final class MessageTypeJsonAdapter extends C11725h<MessageType> {

    /* renamed from: com.disneystreaming.companion.messaging.MessageTypeJsonAdapter$a */
    /* compiled from: MessageTypeJsonAdapter.kt */
    public static final class C8549a {
        private C8549a() {
        }

        public /* synthetic */ C8549a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C8549a(null);
    }

    @C11723f
    public MessageType fromJson(C11737m mVar) {
        String n = mVar.mo29779n();
        if (C12880j.m40224a((Object) n, (Object) "pair")) {
            return C8546b.f18236a;
        }
        if (C12880j.m40224a((Object) n, (Object) "ping")) {
            return C8547c.f18237a;
        }
        if (C12880j.m40224a((Object) n, (Object) "pong")) {
            return C8548d.f18238a;
        }
        C12880j.m40222a((Object) n, "value");
        return new C8545a(n);
    }

    @C11779x
    public void toJson(C11747s sVar, MessageType messageType) {
        if (messageType instanceof C8546b) {
            sVar.mo29799g("pair");
        } else if (messageType instanceof C8547c) {
            sVar.mo29799g("ping");
        } else if (messageType instanceof C8548d) {
            sVar.mo29799g("pong");
        } else if (messageType instanceof C8545a) {
            sVar.mo29799g(((C8545a) messageType).mo21856a());
        }
    }
}
