package com.disneystreaming.companion;

import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p352m.C8484g;
import com.disneystreaming.companion.p352m.C8489l;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12702b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u001b\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ+\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001fR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, mo31007d2 = {"Lcom/disneystreaming/companion/ProviderCoordinator;", "Lcom/disneystreaming/companion/Coordinator;", "providers", "", "Lcom/disneystreaming/companion/service/ServiceType;", "Lcom/disneystreaming/companion/service/ProviderService;", "(Ljava/util/Map;)V", "broadcastPairingMessage", "", "via", "broadcastPairingMessage$companion_release", "schedulePairingBroadcast", "interval", "", "schedulePairingBroadcast$companion_release", "send", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "to", "", "send$companion_release", "(Lcom/disneystreaming/companion/messaging/Payload;Ljava/lang/String;Lcom/disneystreaming/companion/service/ServiceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startMessageListeners", "startMessageListeners$companion_release", "startUp", "startUp$companion_release", "stopMessageListeners", "stopMessageListeners$companion_release", "stopScheduledPairingBroadcast", "stopScheduledPairingBroadcast$companion_release", "tearDown", "tearDown$companion_release", "Factory", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.h */
/* compiled from: ProviderCoordinator.kt */
public final class C8451h extends C8443b {

    /* renamed from: d */
    public static final C8452a f17982d = new C8452a(null);

    /* renamed from: c */
    private final Map<C8489l, C8484g> f17983c;

    /* renamed from: com.disneystreaming.companion.h$a */
    /* compiled from: ProviderCoordinator.kt */
    public static final class C8452a {
        private C8452a() {
        }

        /* renamed from: a */
        public final C8451h mo21706a(Map<C8489l, ? extends C8484g> map) {
            return new C8451h(map, null);
        }

        public /* synthetic */ C8452a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C8451h(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: a */
    public final void mo21700a(C8489l lVar, long j) {
        Object obj = this.f17983c.get(lVar);
        if (!(((C8484g) obj) != null)) {
            obj = null;
        }
        C8484g gVar = (C8484g) obj;
        if (gVar != null) {
            gVar.mo21765a(j);
        }
    }

    /* renamed from: b */
    public final void mo21701b() {
        mo21676a(this.f17983c.values());
    }

    /* renamed from: c */
    public final void mo21703c() {
        for (C8484g d : this.f17983c.values()) {
            d.mo21775d();
        }
    }

    /* renamed from: d */
    public final void mo21704d() {
        mo21677b(this.f17983c.values());
    }

    /* renamed from: e */
    public final void mo21705e() {
        for (C8484g b : this.f17983c.values()) {
            b.mo21774b();
        }
    }

    private C8451h(Map<C8489l, ? extends C8484g> map) {
        this.f17983c = map;
        for (C8484g a : this.f17983c.values()) {
            a.mo21773a(mo21675a());
        }
    }

    /* renamed from: b */
    public final void mo21702b(C8489l lVar) {
        Object obj = this.f17983c.get(lVar);
        if (!(((C8484g) obj) != null)) {
            obj = null;
        }
        C8484g gVar = (C8484g) obj;
        if (gVar != null) {
            gVar.mo21766h();
        }
    }

    /* renamed from: a */
    public final void mo21699a(C8489l lVar) {
        Object obj = this.f17983c.get(lVar);
        if (!(((C8484g) obj) != null)) {
            obj = null;
        }
        C8484g gVar = (C8484g) obj;
        if (gVar != null) {
            gVar.mo21767g();
        }
    }

    /* renamed from: a */
    public final Object mo21698a(Payload payload, String str, C8489l lVar, C12683c<? super C13145v> cVar) {
        Object obj = this.f17983c.get(lVar);
        if (!C12702b.m39828a(((C8484g) obj) != null).booleanValue()) {
            obj = null;
        }
        C8484g gVar = (C8484g) obj;
        if (gVar != null) {
            return gVar.mo21772a(payload, str, cVar);
        }
        return C13145v.f29587a;
    }
}
