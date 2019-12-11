package com.disneystreaming.companion;

import com.disneystreaming.companion.configuration.CompanionConfiguration;
import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p351l.C8476c;
import com.disneystreaming.companion.p352m.C8489l;
import com.disneystreaming.companion.p352m.p353m.C8504d;
import java.util.ArrayList;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001&B\u0017\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J)\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010%\u001a\u00020\u0016H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, mo31007d2 = {"Lcom/disneystreaming/companion/ProviderCompanion;", "Lcom/disneystreaming/companion/DefaultCompanion;", "Lcom/disneystreaming/companion/CoroutineCompanion;", "Lcom/disneystreaming/companion/Listener;", "Lcom/disneystreaming/companion/Sender;", "Lcom/disneystreaming/companion/PairingBroadcastScheduler;", "config", "Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "coordinator", "Lcom/disneystreaming/companion/ProviderCoordinator;", "(Lcom/disneystreaming/companion/configuration/CompanionConfiguration;Lcom/disneystreaming/companion/ProviderCoordinator;)V", "broadcasters", "", "Lcom/disneystreaming/companion/service/ServiceType;", "events", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "getEvents", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "events$delegate", "Lkotlin/Lazy;", "broadcastPairingMessage", "", "via", "schedulePairingBroadcast", "interval", "", "send", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "to", "", "(Lcom/disneystreaming/companion/messaging/Payload;Ljava/lang/String;Lcom/disneystreaming/companion/service/ServiceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startListener", "startUp", "stopListener", "stopScheduledPairingBroadcast", "tearDown", "Factory", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ProviderCompanion.kt */
public final class ProviderCompanion implements C8447d, C8445c, C8449f, C8455j, C8450g {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(ProviderCompanion.class), "events", "getEvents()Lkotlinx/coroutines/channels/BroadcastChannel;"))};
    public static final C8438a Factory = new C8438a(null);
    public static final String TAG = "ProviderCompanion";
    private List<C8489l> broadcasters;
    /* access modifiers changed from: private */
    public final C8451h coordinator;
    private final Lazy events$delegate;

    /* renamed from: com.disneystreaming.companion.ProviderCompanion$a */
    /* compiled from: ProviderCompanion.kt */
    public static final class C8438a {
        private C8438a() {
        }

        /* renamed from: a */
        public final ProviderCompanion mo21662a(CompanionConfiguration companionConfiguration) {
            return new ProviderCompanion(companionConfiguration, C8451h.f17982d.mo21706a(C13170i0.m40332a(C12907r.m40244a(C8489l.SOCKET, new C8504d(companionConfiguration)))), null);
        }

        public /* synthetic */ C8438a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.disneystreaming.companion.ProviderCompanion$b */
    /* compiled from: ProviderCompanion.kt */
    static final class C8439b extends C12881k implements Function0<C13303d<MessagingEvent>> {

        /* renamed from: c */
        final /* synthetic */ ProviderCompanion f17977c;

        C8439b(ProviderCompanion providerCompanion) {
            this.f17977c = providerCompanion;
            super(0);
        }

        public final C13303d<MessagingEvent> invoke() {
            return this.f17977c.coordinator.mo21675a();
        }
    }

    private ProviderCompanion(CompanionConfiguration companionConfiguration, C8451h hVar) {
        this.coordinator = hVar;
        this.broadcasters = new ArrayList();
        this.events$delegate = C12763i.m39921a(new C8439b(this));
        C8476c.f18029a.mo21761b(companionConfiguration.getLogLevel());
    }

    private final void broadcastPairingMessage(C8489l lVar) {
        this.coordinator.mo21699a(lVar);
    }

    public C13303d<MessagingEvent> getEvents() {
        Lazy lazy = this.events$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C13303d) lazy.getValue();
    }

    public void schedulePairingBroadcast(C8489l lVar, long j) {
        if (!this.broadcasters.contains(lVar)) {
            C8476c cVar = C8476c.f18029a;
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcast scheduled for ");
            sb.append(lVar);
            sb.append(", with interval: ");
            sb.append(j);
            cVar.mo21760a(sb.toString(), (Throwable) null, TAG);
            this.coordinator.mo21700a(lVar, j);
            this.broadcasters.add(lVar);
        }
    }

    public Object send(Payload payload, String str, C8489l lVar, C12683c<? super C13145v> cVar) {
        return this.coordinator.mo21698a(payload, str, lVar, cVar);
    }

    public void startListener() {
        this.coordinator.mo21701b();
    }

    public void startUp() {
        this.coordinator.mo21703c();
    }

    public void stopListener() {
        this.coordinator.mo21704d();
    }

    public void stopScheduledPairingBroadcast(C8489l lVar) {
        if (this.broadcasters.contains(lVar)) {
            C8476c cVar = C8476c.f18029a;
            StringBuilder sb = new StringBuilder();
            sb.append("Stopping pairing broadcast on: ");
            sb.append(lVar);
            cVar.mo21760a(sb.toString(), (Throwable) null, TAG);
            this.coordinator.mo21702b(lVar);
            this.broadcasters.remove(lVar);
        }
    }

    public void tearDown() {
        stopScheduledPairingBroadcast();
        this.coordinator.mo21705e();
    }

    public /* synthetic */ ProviderCompanion(CompanionConfiguration companionConfiguration, C8451h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(companionConfiguration, hVar);
    }

    public void stopScheduledPairingBroadcast() {
        C8476c cVar = C8476c.f18029a;
        StringBuilder sb = new StringBuilder();
        sb.append("Stopping pairing broadcast on ");
        sb.append(this.broadcasters.size());
        sb.append(" services");
        cVar.mo21760a(sb.toString(), (Throwable) null, TAG);
        for (C8489l stopScheduledPairingBroadcast : this.broadcasters) {
            stopScheduledPairingBroadcast(stopScheduledPairingBroadcast);
        }
    }
}
