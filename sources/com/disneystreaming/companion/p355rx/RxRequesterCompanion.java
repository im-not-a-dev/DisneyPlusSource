package com.disneystreaming.companion.p355rx;

import com.disneystreaming.companion.RequesterCompanion;
import com.disneystreaming.companion.configuration.CompanionConfiguration;
import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p352m.C8489l;
import java.util.List;
import kotlin.C12903o;
import kotlin.C13145v;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12694g;
import kotlin.p573a0.p575i.p576a.C12706f;
import kotlin.p573a0.p575i.p576a.C12714m;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.C13233e0;
import kotlinx.coroutines.p594l2.C13334c;
import kotlinx.coroutines.p594l2.C13336d;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001*B\u000f\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\b\u0010&\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u001bH\u0016J\u0018\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, mo31007d2 = {"Lcom/disneystreaming/companion/rx/RxRequesterCompanion;", "Lcom/disneystreaming/companion/rx/RxCoroutineCompanion;", "Lcom/disneystreaming/companion/rx/RxCompanion;", "Lcom/disneystreaming/companion/rx/DefaultRxRequesterCompanion;", "Lcom/disneystreaming/companion/rx/RxSender;", "Lcom/disneystreaming/companion/rx/RxListener;", "Lcom/disneystreaming/companion/rx/RxBroadcastListener;", "config", "Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "(Lcom/disneystreaming/companion/configuration/CompanionConfiguration;)V", "events", "Lio/reactivex/Observable;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "events$annotations", "()V", "getEvents", "()Lio/reactivex/Observable;", "events$delegate", "Lkotlin/Lazy;", "requesterCompanion", "Lcom/disneystreaming/companion/RequesterCompanion;", "getPaired", "", "", "type", "Lcom/disneystreaming/companion/service/ServiceType;", "send", "Lio/reactivex/Completable;", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "to", "via", "setup", "", "startBroadcastListener", "startListener", "startUp", "stopBroadcastListener", "stopListener", "tearDown", "unpair", "host", "Factory", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion */
/* compiled from: RxRequesterCompanion.kt */
public final class RxRequesterCompanion extends C8592d implements C8591c, C8589a, C8595g, C8593e, C8590b {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(RxRequesterCompanion.class), "events", "getEvents()Lio/reactivex/Observable;"))};
    public static final C8580a Factory = new C8580a(null);
    private final CompanionConfiguration config;
    private final Lazy events$delegate;
    /* access modifiers changed from: private */
    public final RequesterCompanion requesterCompanion;

    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$a */
    /* compiled from: RxRequesterCompanion.kt */
    public static final class C8580a {
        private C8580a() {
        }

        /* renamed from: a */
        public final RxRequesterCompanion mo21963a(CompanionConfiguration companionConfiguration) {
            return new RxRequesterCompanion(companionConfiguration, null);
        }

        public /* synthetic */ C8580a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$b */
    /* compiled from: RxRequesterCompanion.kt */
    static final class C8581b extends C12881k implements Function0<Observable<MessagingEvent>> {

        /* renamed from: c */
        final /* synthetic */ RxRequesterCompanion f18302c;

        C8581b(RxRequesterCompanion rxRequesterCompanion) {
            this.f18302c = rxRequesterCompanion;
            super(0);
        }

        public final Observable<MessagingEvent> invoke() {
            return C13336d.m40968a(this.f18302c.requesterCompanion.getEvents().mo34497a(), this.f18302c.getContext$companion_release());
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxRequesterCompanion$send$1", mo31053f = "RxRequesterCompanion.kt", mo31054l = {115}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$c */
    /* compiled from: RxRequesterCompanion.kt */
    static final class C8582c extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18303X;

        /* renamed from: Y */
        Object f18304Y;

        /* renamed from: Z */
        int f18305Z;

        /* renamed from: a0 */
        final /* synthetic */ RxRequesterCompanion f18306a0;

        /* renamed from: b0 */
        final /* synthetic */ Payload f18307b0;

        /* renamed from: c0 */
        final /* synthetic */ String f18308c0;

        /* renamed from: d0 */
        final /* synthetic */ C8489l f18309d0;

        C8582c(RxRequesterCompanion rxRequesterCompanion, Payload payload, String str, C8489l lVar, C12683c cVar) {
            this.f18306a0 = rxRequesterCompanion;
            this.f18307b0 = payload;
            this.f18308c0 = str;
            this.f18309d0 = lVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18305Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18303X;
                RequesterCompanion access$getRequesterCompanion$p = this.f18306a0.requesterCompanion;
                Payload payload = this.f18307b0;
                String str = this.f18308c0;
                C8489l lVar = this.f18309d0;
                this.f18304Y = e0Var;
                this.f18305Z = 1;
                if (access$getRequesterCompanion$p.send(payload, str, lVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18304Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8582c cVar2 = new C8582c(this.f18306a0, this.f18307b0, this.f18308c0, this.f18309d0, cVar);
            cVar2.f18303X = (C13233e0) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8582c) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxRequesterCompanion$startBroadcastListener$1", mo31053f = "RxRequesterCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$d */
    /* compiled from: RxRequesterCompanion.kt */
    static final class C8583d extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18310X;

        /* renamed from: Y */
        int f18311Y;

        /* renamed from: Z */
        final /* synthetic */ RxRequesterCompanion f18312Z;

        C8583d(RxRequesterCompanion rxRequesterCompanion, C12683c cVar) {
            this.f18312Z = rxRequesterCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18311Y == 0) {
                C12903o.m40241a(obj);
                this.f18312Z.requesterCompanion.startBroadcastListener();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8583d dVar = new C8583d(this.f18312Z, cVar);
            dVar.f18310X = (C13233e0) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8583d) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxRequesterCompanion$startListener$1", mo31053f = "RxRequesterCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$e */
    /* compiled from: RxRequesterCompanion.kt */
    static final class C8584e extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18313X;

        /* renamed from: Y */
        int f18314Y;

        /* renamed from: Z */
        final /* synthetic */ RxRequesterCompanion f18315Z;

        C8584e(RxRequesterCompanion rxRequesterCompanion, C12683c cVar) {
            this.f18315Z = rxRequesterCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18314Y == 0) {
                C12903o.m40241a(obj);
                this.f18315Z.requesterCompanion.startListener();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8584e eVar = new C8584e(this.f18315Z, cVar);
            eVar.f18313X = (C13233e0) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8584e) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxRequesterCompanion$startUp$1", mo31053f = "RxRequesterCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$f */
    /* compiled from: RxRequesterCompanion.kt */
    static final class C8585f extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18316X;

        /* renamed from: Y */
        int f18317Y;

        /* renamed from: Z */
        final /* synthetic */ RxRequesterCompanion f18318Z;

        C8585f(RxRequesterCompanion rxRequesterCompanion, C12683c cVar) {
            this.f18318Z = rxRequesterCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18317Y == 0) {
                C12903o.m40241a(obj);
                this.f18318Z.requesterCompanion.startUp();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8585f fVar = new C8585f(this.f18318Z, cVar);
            fVar.f18316X = (C13233e0) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8585f) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxRequesterCompanion$stopBroadcastListener$1", mo31053f = "RxRequesterCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$g */
    /* compiled from: RxRequesterCompanion.kt */
    static final class C8586g extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18319X;

        /* renamed from: Y */
        int f18320Y;

        /* renamed from: Z */
        final /* synthetic */ RxRequesterCompanion f18321Z;

        C8586g(RxRequesterCompanion rxRequesterCompanion, C12683c cVar) {
            this.f18321Z = rxRequesterCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18320Y == 0) {
                C12903o.m40241a(obj);
                this.f18321Z.requesterCompanion.stopBroadcastListener();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8586g gVar = new C8586g(this.f18321Z, cVar);
            gVar.f18319X = (C13233e0) obj;
            return gVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8586g) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxRequesterCompanion$stopListener$1", mo31053f = "RxRequesterCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$h */
    /* compiled from: RxRequesterCompanion.kt */
    static final class C8587h extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18322X;

        /* renamed from: Y */
        int f18323Y;

        /* renamed from: Z */
        final /* synthetic */ RxRequesterCompanion f18324Z;

        C8587h(RxRequesterCompanion rxRequesterCompanion, C12683c cVar) {
            this.f18324Z = rxRequesterCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18323Y == 0) {
                C12903o.m40241a(obj);
                this.f18324Z.requesterCompanion.stopListener();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8587h hVar = new C8587h(this.f18324Z, cVar);
            hVar.f18322X = (C13233e0) obj;
            return hVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8587h) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxRequesterCompanion$tearDown$1", mo31053f = "RxRequesterCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxRequesterCompanion$i */
    /* compiled from: RxRequesterCompanion.kt */
    static final class C8588i extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18325X;

        /* renamed from: Y */
        int f18326Y;

        /* renamed from: Z */
        final /* synthetic */ RxRequesterCompanion f18327Z;

        C8588i(RxRequesterCompanion rxRequesterCompanion, C12683c cVar) {
            this.f18327Z = rxRequesterCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18326Y == 0) {
                C12903o.m40241a(obj);
                this.f18327Z.requesterCompanion.tearDown();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8588i iVar = new C8588i(this.f18327Z, cVar);
            iVar.f18325X = (C13233e0) obj;
            return iVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8588i) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    public /* synthetic */ RxRequesterCompanion(CompanionConfiguration companionConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(companionConfiguration);
    }

    public static /* synthetic */ void events$annotations() {
    }

    public Observable<MessagingEvent> getEvents() {
        Lazy lazy = this.events$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Observable) lazy.getValue();
    }

    public List<String> getPaired(C8489l lVar) {
        return this.requesterCompanion.getPaired(lVar);
    }

    public Completable send(Payload payload, String str, C8489l lVar) {
        C12694g context$companion_release = getContext$companion_release();
        C8582c cVar = new C8582c(this, payload, str, lVar, null);
        return C13334c.m40966a(context$companion_release, cVar);
    }

    public void setup() {
        this.requesterCompanion.setup();
    }

    public Completable startBroadcastListener() {
        return C13334c.m40966a(getContext$companion_release(), new C8583d(this, null));
    }

    public Completable startListener() {
        return C13334c.m40966a(getContext$companion_release(), new C8584e(this, null));
    }

    public Completable startUp() {
        return C13334c.m40966a(getContext$companion_release(), new C8585f(this, null));
    }

    public Completable stopBroadcastListener() {
        return C13334c.m40966a(getContext$companion_release(), new C8586g(this, null));
    }

    public Completable stopListener() {
        return C13334c.m40966a(getContext$companion_release(), new C8587h(this, null));
    }

    public Completable tearDown() {
        return C13334c.m40966a(getContext$companion_release(), new C8588i(this, null));
    }

    public void unpair(String str, C8489l lVar) {
        this.requesterCompanion.unpair(str, lVar);
    }

    private RxRequesterCompanion(CompanionConfiguration companionConfiguration) {
        this.config = companionConfiguration;
        this.requesterCompanion = RequesterCompanion.Factory.mo21674a(this.config);
        this.events$delegate = C12763i.m39921a(new C8581b(this));
    }
}
