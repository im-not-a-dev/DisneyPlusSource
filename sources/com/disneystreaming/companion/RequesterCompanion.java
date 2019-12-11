package com.disneystreaming.companion;

import com.disneystreaming.companion.configuration.CompanionConfiguration;
import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p351l.C8476c;
import com.disneystreaming.companion.p352m.C8489l;
import com.disneystreaming.companion.p352m.p353m.C8517e;
import java.util.List;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p573a0.C12683c;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.p592j2.C13303d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001(B\u0017\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J)\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo31007d2 = {"Lcom/disneystreaming/companion/RequesterCompanion;", "Lcom/disneystreaming/companion/DefaultCompanion;", "Lcom/disneystreaming/companion/DefaultRequesterCompanion;", "Lcom/disneystreaming/companion/CoroutineCompanion;", "Lcom/disneystreaming/companion/Listener;", "Lcom/disneystreaming/companion/Sender;", "Lcom/disneystreaming/companion/BroadcastListener;", "config", "Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "coordinator", "Lcom/disneystreaming/companion/RequesterCoordinator;", "(Lcom/disneystreaming/companion/configuration/CompanionConfiguration;Lcom/disneystreaming/companion/RequesterCoordinator;)V", "events", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "getEvents", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "events$delegate", "Lkotlin/Lazy;", "getPaired", "", "", "type", "Lcom/disneystreaming/companion/service/ServiceType;", "send", "", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "to", "via", "(Lcom/disneystreaming/companion/messaging/Payload;Ljava/lang/String;Lcom/disneystreaming/companion/service/ServiceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setup", "startBroadcastListener", "startListener", "startUp", "stopBroadcastListener", "stopListener", "tearDown", "unpair", "host", "Factory", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RequesterCompanion.kt */
public final class RequesterCompanion implements C8447d, C8448e, C8445c, C8449f, C8455j, C8442a {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(RequesterCompanion.class), "events", "getEvents()Lkotlinx/coroutines/channels/BroadcastChannel;"))};
    public static final C8440a Factory = new C8440a(null);
    public static final String TAG = "RequesterCompanion";
    /* access modifiers changed from: private */
    public final C8453i coordinator;
    private final Lazy events$delegate;

    /* renamed from: com.disneystreaming.companion.RequesterCompanion$a */
    /* compiled from: RequesterCompanion.kt */
    public static final class C8440a {
        private C8440a() {
        }

        /* renamed from: a */
        public final RequesterCompanion mo21674a(CompanionConfiguration companionConfiguration) {
            return new RequesterCompanion(companionConfiguration, C8453i.f17984d.mo21717a(C13170i0.m40332a(C12907r.m40244a(C8489l.SOCKET, new C8517e(companionConfiguration)))), null);
        }

        public /* synthetic */ C8440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.disneystreaming.companion.RequesterCompanion$b */
    /* compiled from: RequesterCompanion.kt */
    static final class C8441b extends C12881k implements Function0<C13303d<MessagingEvent>> {

        /* renamed from: c */
        final /* synthetic */ RequesterCompanion f17978c;

        C8441b(RequesterCompanion requesterCompanion) {
            this.f17978c = requesterCompanion;
            super(0);
        }

        public final C13303d<MessagingEvent> invoke() {
            return this.f17978c.coordinator.mo21675a();
        }
    }

    private RequesterCompanion(CompanionConfiguration companionConfiguration, C8453i iVar) {
        this.coordinator = iVar;
        this.events$delegate = C12763i.m39921a(new C8441b(this));
        C8476c.f18029a.mo21761b(companionConfiguration.getLogLevel());
    }

    public C13303d<MessagingEvent> getEvents() {
        Lazy lazy = this.events$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C13303d) lazy.getValue();
    }

    public List<String> getPaired(C8489l lVar) {
        return this.coordinator.mo21708a(lVar);
    }

    public Object send(Payload payload, String str, C8489l lVar, C12683c<? super C13145v> cVar) {
        return this.coordinator.mo21707a(payload, str, lVar, cVar);
    }

    public void setup() {
        this.coordinator.mo21710b();
    }

    public void startBroadcastListener() {
        this.coordinator.mo21711c();
    }

    public void startListener() {
        this.coordinator.mo21712d();
    }

    public void startUp() {
        this.coordinator.mo21713e();
    }

    public void stopBroadcastListener() {
        this.coordinator.mo21714f();
    }

    public void stopListener() {
        this.coordinator.mo21715g();
    }

    public void tearDown() {
        this.coordinator.mo21716h();
    }

    public void unpair(String str, C8489l lVar) {
        this.coordinator.mo21709a(str, lVar);
    }

    public /* synthetic */ RequesterCompanion(CompanionConfiguration companionConfiguration, C8453i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(companionConfiguration, iVar);
    }
}
