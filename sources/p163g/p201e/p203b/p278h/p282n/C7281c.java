package p163g.p201e.p203b.p278h.p282n;

import com.bamtechmedia.dominguez.ctvactivation.api.C5892c;
import com.disneystreaming.companion.configuration.CompanionConfiguration;
import com.disneystreaming.companion.messaging.MessageType.C8545a;
import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p352m.C8489l;
import com.disneystreaming.companion.p352m.p353m.C8503c;
import com.disneystreaming.companion.p355rx.RxRequesterCompanion;
import com.disneystreaming.companion.p355rx.RxRequesterCompanion.C8580a;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.Map;
import java.util.UUID;
import kotlin.C12907r;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p278h.p279k.C7251e;
import p163g.p201e.p203b.p278h.p280l.C7252a;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ctvactivation/tv/TvCtvActivatorImpl;", "Lcom/bamtechmedia/dominguez/ctvactivation/api/TvCtvActivator;", "ctvActivationConfig", "Lcom/bamtechmedia/dominguez/ctvactivation/config/CtvActivationConfigImpl;", "(Lcom/bamtechmedia/dominguez/ctvactivation/config/CtvActivationConfigImpl;)V", "companion", "Lcom/disneystreaming/companion/rx/RxRequesterCompanion;", "getCompanion", "()Lcom/disneystreaming/companion/rx/RxRequesterCompanion;", "companion$delegate", "Lkotlin/Lazy;", "deviceInfo", "Lcom/bamtechmedia/dominguez/ctvactivation/common/DeviceData;", "sendMessage", "Lio/reactivex/Completable;", "to", "", "messageType", "map", "", "startListeningForBroadcasts", "startListeningForMessages", "startUp", "stopListeningForBroadcasts", "streamUpdates", "Lio/reactivex/Observable;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "tearDown", "unPair", "", "host", "type", "Lcom/disneystreaming/companion/service/ServiceType;", "ctvActivation_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.h.n.c */
/* compiled from: TvCtvActivatorImpl.kt */
public final class C7281c implements C5892c {

    /* renamed from: d */
    static final /* synthetic */ KProperty[] f16019d = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7281c.class), "companion", "getCompanion()Lcom/disneystreaming/companion/rx/RxRequesterCompanion;"))};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7251e f16020a = new C7251e(null, 1, null);

    /* renamed from: b */
    private final Lazy f16021b = C12763i.m39921a(new C7282a(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7252a f16022c;

    /* renamed from: g.e.b.h.n.c$a */
    /* compiled from: TvCtvActivatorImpl.kt */
    static final class C7282a extends C12881k implements Function0<RxRequesterCompanion> {

        /* renamed from: c */
        final /* synthetic */ C7281c f16023c;

        C7282a(C7281c cVar) {
            this.f16023c = cVar;
            super(0);
        }

        public final RxRequesterCompanion invoke() {
            C8580a aVar = RxRequesterCompanion.Factory;
            String b = this.f16023c.f16022c.mo20072b();
            String b2 = this.f16023c.f16020a.mo20068b();
            String a = this.f16023c.f16020a.mo20067a();
            C8489l lVar = C8489l.SOCKET;
            C8503c cVar = new C8503c(0, this.f16023c.f16022c.mo20074d(), this.f16023c.f16022c.mo20073c(), 0, 9, null);
            CompanionConfiguration companionConfiguration = new CompanionConfiguration(b, b2, a, null, C13170i0.m40332a(C12907r.m40244a(lVar, cVar)), 5, 0, false, HttpStatus.HTTP_OK, null);
            return aVar.mo21963a(companionConfiguration);
        }
    }

    public C7281c(C7252a aVar) {
        this.f16022c = aVar;
    }

    /* renamed from: c */
    public RxRequesterCompanion mo20097c() {
        Lazy lazy = this.f16021b;
        KProperty kProperty = f16019d[0];
        return (RxRequesterCompanion) lazy.getValue();
    }

    /* renamed from: d */
    public Completable mo20066d() {
        return mo20097c().startUp();
    }

    /* renamed from: a */
    public Observable<MessagingEvent> mo20064a() {
        return mo20097c().getEvents();
    }

    /* renamed from: b */
    public Completable mo20065b() {
        return mo20097c().tearDown();
    }

    /* renamed from: a */
    public Completable mo20063a(String str, String str2, Map<String, String> map) {
        RxRequesterCompanion c = mo20097c();
        C8545a aVar = new C8545a(str2);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) uuid, "UUID.randomUUID().toString()");
        Payload payload = new Payload(aVar, uuid, null, null, null, map, 28, null);
        return c.send(payload, str, C8489l.SOCKET);
    }

    /* renamed from: a */
    public void mo17779a(String str, C8489l lVar) {
        mo20097c().unpair(str, lVar);
    }
}
