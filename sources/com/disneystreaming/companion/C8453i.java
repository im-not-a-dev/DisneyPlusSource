package com.disneystreaming.companion;

import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p352m.C8486i;
import com.disneystreaming.companion.p352m.C8489l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12702b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\u001b\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u000bJ+\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\rJ\r\u0010\u0015\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0018J\u0006\u0010\u0019\u001a\u00020\rJ\r\u0010\u001a\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001fJ\u001d\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\"R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, mo31007d2 = {"Lcom/disneystreaming/companion/RequesterCoordinator;", "Lcom/disneystreaming/companion/Coordinator;", "requesters", "", "Lcom/disneystreaming/companion/service/ServiceType;", "Lcom/disneystreaming/companion/service/RequesterService;", "(Ljava/util/Map;)V", "getPaired", "", "", "type", "getPaired$companion_release", "send", "", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "to", "via", "send$companion_release", "(Lcom/disneystreaming/companion/messaging/Payload;Ljava/lang/String;Lcom/disneystreaming/companion/service/ServiceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setup", "startBroadcastListeners", "startBroadcastListeners$companion_release", "startMessageListeners", "startMessageListeners$companion_release", "startUp", "stopBroadcastListeners", "stopBroadcastListeners$companion_release", "stopMessageListeners", "stopMessageListeners$companion_release", "tearDown", "tearDown$companion_release", "unpair", "host", "unpair$companion_release", "Factory", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.i */
/* compiled from: RequesterCoordinator.kt */
public final class C8453i extends C8443b {

    /* renamed from: d */
    public static final C8454a f17984d = new C8454a(null);

    /* renamed from: c */
    private Map<C8489l, ? extends C8486i> f17985c;

    /* renamed from: com.disneystreaming.companion.i$a */
    /* compiled from: RequesterCoordinator.kt */
    public static final class C8454a {
        private C8454a() {
        }

        /* renamed from: a */
        public final C8453i mo21717a(Map<C8489l, ? extends C8486i> map) {
            return new C8453i(map, null);
        }

        public /* synthetic */ C8454a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C8453i(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: a */
    public final Object mo21707a(Payload payload, String str, C8489l lVar, C12683c<? super C13145v> cVar) {
        Object obj = this.f17985c.get(lVar);
        if (!C12702b.m39828a(((C8486i) obj) != null).booleanValue()) {
            obj = null;
        }
        C8486i iVar = (C8486i) obj;
        if (iVar != null) {
            return iVar.mo21772a(payload, str, cVar);
        }
        return C13145v.f29587a;
    }

    /* renamed from: b */
    public final void mo21710b() {
        for (C8486i c : this.f17985c.values()) {
            c.mo21771c();
        }
    }

    /* renamed from: c */
    public final void mo21711c() {
        for (C8486i i : this.f17985c.values()) {
            i.mo21763i();
        }
    }

    /* renamed from: d */
    public final void mo21712d() {
        mo21676a(this.f17985c.values());
    }

    /* renamed from: e */
    public final void mo21713e() {
        for (C8486i d : this.f17985c.values()) {
            d.mo21775d();
        }
    }

    /* renamed from: f */
    public final void mo21714f() {
        for (C8486i j : this.f17985c.values()) {
            j.mo21764j();
        }
    }

    /* renamed from: g */
    public final void mo21715g() {
        mo21677b(this.f17985c.values());
    }

    /* renamed from: h */
    public final void mo21716h() {
        for (C8486i b : this.f17985c.values()) {
            b.mo21774b();
        }
    }

    private C8453i(Map<C8489l, ? extends C8486i> map) {
        this.f17985c = map;
        for (C8486i a : this.f17985c.values()) {
            a.mo21773a(mo21675a());
        }
    }

    /* renamed from: a */
    public final List<String> mo21708a(C8489l lVar) {
        ArrayList arrayList = new ArrayList();
        if (lVar == null) {
            for (C8486i a : this.f17985c.values()) {
                for (String add : a.mo21770a()) {
                    arrayList.add(add);
                }
            }
            return C13199w.m40606q(arrayList);
        }
        Object obj = this.f17985c.get(lVar);
        if (!(((C8486i) obj) != null)) {
            obj = null;
        }
        C8486i iVar = (C8486i) obj;
        if (iVar != null) {
            return C13199w.m40606q(iVar.mo21770a());
        }
        return C13199w.m40606q(arrayList);
    }

    /* renamed from: a */
    public final void mo21709a(String str, C8489l lVar) {
        Object obj = this.f17985c.get(lVar);
        if (!(((C8486i) obj) != null)) {
            obj = null;
        }
        C8486i iVar = (C8486i) obj;
        if (iVar != null) {
            iVar.mo21762a(str);
        }
    }
}
