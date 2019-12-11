package com.disneystreaming.companion.p355rx;

import com.disneystreaming.companion.ProviderCompanion;
import com.disneystreaming.companion.configuration.CompanionConfiguration;
import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p352m.C8489l;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001$B\u000f\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, mo31007d2 = {"Lcom/disneystreaming/companion/rx/RxProviderCompanion;", "Lcom/disneystreaming/companion/rx/RxCoroutineCompanion;", "Lcom/disneystreaming/companion/rx/RxCompanion;", "Lcom/disneystreaming/companion/rx/RxSender;", "Lcom/disneystreaming/companion/rx/RxListener;", "Lcom/disneystreaming/companion/rx/RxPairingBroadcastScheduler;", "config", "Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "(Lcom/disneystreaming/companion/configuration/CompanionConfiguration;)V", "events", "Lio/reactivex/Observable;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "events$annotations", "()V", "getEvents", "()Lio/reactivex/Observable;", "events$delegate", "Lkotlin/Lazy;", "providerCompanion", "Lcom/disneystreaming/companion/ProviderCompanion;", "schedulePairingBroadcast", "Lio/reactivex/Completable;", "via", "Lcom/disneystreaming/companion/service/ServiceType;", "interval", "", "send", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "to", "", "startListener", "startUp", "stopListener", "stopScheduledPairingBroadcast", "tearDown", "Factory", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion */
/* compiled from: RxProviderCompanion.kt */
public final class RxProviderCompanion extends C8592d implements C8591c, C8595g, C8593e, C8594f {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(RxProviderCompanion.class), "events", "getEvents()Lio/reactivex/Observable;"))};
    public static final C8570a Factory = new C8570a(null);
    private final CompanionConfiguration config;
    private final Lazy events$delegate;
    /* access modifiers changed from: private */
    public final ProviderCompanion providerCompanion;

    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$a */
    /* compiled from: RxProviderCompanion.kt */
    public static final class C8570a {
        private C8570a() {
        }

        public /* synthetic */ C8570a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$b */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8571b extends C12881k implements Function0<Observable<MessagingEvent>> {

        /* renamed from: c */
        final /* synthetic */ RxProviderCompanion f18270c;

        C8571b(RxProviderCompanion rxProviderCompanion) {
            this.f18270c = rxProviderCompanion;
            super(0);
        }

        public final Observable<MessagingEvent> invoke() {
            return C13336d.m40968a(this.f18270c.providerCompanion.getEvents().mo34497a(), this.f18270c.getContext$companion_release());
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxProviderCompanion$schedulePairingBroadcast$1", mo31053f = "RxProviderCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$c */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8572c extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18271X;

        /* renamed from: Y */
        int f18272Y;

        /* renamed from: Z */
        final /* synthetic */ RxProviderCompanion f18273Z;

        /* renamed from: a0 */
        final /* synthetic */ C8489l f18274a0;

        /* renamed from: b0 */
        final /* synthetic */ long f18275b0;

        C8572c(RxProviderCompanion rxProviderCompanion, C8489l lVar, long j, C12683c cVar) {
            this.f18273Z = rxProviderCompanion;
            this.f18274a0 = lVar;
            this.f18275b0 = j;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18272Y == 0) {
                C12903o.m40241a(obj);
                this.f18273Z.providerCompanion.schedulePairingBroadcast(this.f18274a0, this.f18275b0);
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8572c cVar2 = new C8572c(this.f18273Z, this.f18274a0, this.f18275b0, cVar);
            cVar2.f18271X = (C13233e0) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8572c) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxProviderCompanion$send$1", mo31053f = "RxProviderCompanion.kt", mo31054l = {80}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$d */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8573d extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18276X;

        /* renamed from: Y */
        Object f18277Y;

        /* renamed from: Z */
        int f18278Z;

        /* renamed from: a0 */
        final /* synthetic */ RxProviderCompanion f18279a0;

        /* renamed from: b0 */
        final /* synthetic */ Payload f18280b0;

        /* renamed from: c0 */
        final /* synthetic */ String f18281c0;

        /* renamed from: d0 */
        final /* synthetic */ C8489l f18282d0;

        C8573d(RxProviderCompanion rxProviderCompanion, Payload payload, String str, C8489l lVar, C12683c cVar) {
            this.f18279a0 = rxProviderCompanion;
            this.f18280b0 = payload;
            this.f18281c0 = str;
            this.f18282d0 = lVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18278Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18276X;
                ProviderCompanion access$getProviderCompanion$p = this.f18279a0.providerCompanion;
                Payload payload = this.f18280b0;
                String str = this.f18281c0;
                C8489l lVar = this.f18282d0;
                this.f18277Y = e0Var;
                this.f18278Z = 1;
                if (access$getProviderCompanion$p.send(payload, str, lVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18277Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8573d dVar = new C8573d(this.f18279a0, this.f18280b0, this.f18281c0, this.f18282d0, cVar);
            dVar.f18276X = (C13233e0) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8573d) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxProviderCompanion$startListener$1", mo31053f = "RxProviderCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$e */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8574e extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18283X;

        /* renamed from: Y */
        int f18284Y;

        /* renamed from: Z */
        final /* synthetic */ RxProviderCompanion f18285Z;

        C8574e(RxProviderCompanion rxProviderCompanion, C12683c cVar) {
            this.f18285Z = rxProviderCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18284Y == 0) {
                C12903o.m40241a(obj);
                this.f18285Z.providerCompanion.startListener();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8574e eVar = new C8574e(this.f18285Z, cVar);
            eVar.f18283X = (C13233e0) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8574e) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxProviderCompanion$startUp$1", mo31053f = "RxProviderCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$f */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8575f extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18286X;

        /* renamed from: Y */
        int f18287Y;

        /* renamed from: Z */
        final /* synthetic */ RxProviderCompanion f18288Z;

        C8575f(RxProviderCompanion rxProviderCompanion, C12683c cVar) {
            this.f18288Z = rxProviderCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18287Y == 0) {
                C12903o.m40241a(obj);
                this.f18288Z.providerCompanion.startUp();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8575f fVar = new C8575f(this.f18288Z, cVar);
            fVar.f18286X = (C13233e0) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8575f) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxProviderCompanion$stopListener$1", mo31053f = "RxProviderCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$g */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8576g extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18289X;

        /* renamed from: Y */
        int f18290Y;

        /* renamed from: Z */
        final /* synthetic */ RxProviderCompanion f18291Z;

        C8576g(RxProviderCompanion rxProviderCompanion, C12683c cVar) {
            this.f18291Z = rxProviderCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18290Y == 0) {
                C12903o.m40241a(obj);
                this.f18291Z.providerCompanion.stopListener();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8576g gVar = new C8576g(this.f18291Z, cVar);
            gVar.f18289X = (C13233e0) obj;
            return gVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8576g) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxProviderCompanion$stopScheduledPairingBroadcast$1", mo31053f = "RxProviderCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$h */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8577h extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18292X;

        /* renamed from: Y */
        int f18293Y;

        /* renamed from: Z */
        final /* synthetic */ RxProviderCompanion f18294Z;

        /* renamed from: a0 */
        final /* synthetic */ C8489l f18295a0;

        C8577h(RxProviderCompanion rxProviderCompanion, C8489l lVar, C12683c cVar) {
            this.f18294Z = rxProviderCompanion;
            this.f18295a0 = lVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18293Y == 0) {
                C12903o.m40241a(obj);
                this.f18294Z.providerCompanion.stopScheduledPairingBroadcast(this.f18295a0);
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8577h hVar = new C8577h(this.f18294Z, this.f18295a0, cVar);
            hVar.f18292X = (C13233e0) obj;
            return hVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8577h) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxProviderCompanion$stopScheduledPairingBroadcast$2", mo31053f = "RxProviderCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$i */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8578i extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18296X;

        /* renamed from: Y */
        int f18297Y;

        /* renamed from: Z */
        final /* synthetic */ RxProviderCompanion f18298Z;

        C8578i(RxProviderCompanion rxProviderCompanion, C12683c cVar) {
            this.f18298Z = rxProviderCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18297Y == 0) {
                C12903o.m40241a(obj);
                this.f18298Z.providerCompanion.stopScheduledPairingBroadcast();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8578i iVar = new C8578i(this.f18298Z, cVar);
            iVar.f18296X = (C13233e0) obj;
            return iVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8578i) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.rx.RxProviderCompanion$tearDown$1", mo31053f = "RxProviderCompanion.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.rx.RxProviderCompanion$j */
    /* compiled from: RxProviderCompanion.kt */
    static final class C8579j extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18299X;

        /* renamed from: Y */
        int f18300Y;

        /* renamed from: Z */
        final /* synthetic */ RxProviderCompanion f18301Z;

        C8579j(RxProviderCompanion rxProviderCompanion, C12683c cVar) {
            this.f18301Z = rxProviderCompanion;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18300Y == 0) {
                C12903o.m40241a(obj);
                this.f18301Z.providerCompanion.tearDown();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8579j jVar = new C8579j(this.f18301Z, cVar);
            jVar.f18299X = (C13233e0) obj;
            return jVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8579j) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    public /* synthetic */ RxProviderCompanion(CompanionConfiguration companionConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(companionConfiguration);
    }

    public static /* synthetic */ void events$annotations() {
    }

    public Observable<MessagingEvent> getEvents() {
        Lazy lazy = this.events$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Observable) lazy.getValue();
    }

    public Completable schedulePairingBroadcast(C8489l lVar, long j) {
        C12694g context$companion_release = getContext$companion_release();
        C8572c cVar = new C8572c(this, lVar, j, null);
        return C13334c.m40966a(context$companion_release, cVar);
    }

    public Completable send(Payload payload, String str, C8489l lVar) {
        C12694g context$companion_release = getContext$companion_release();
        C8573d dVar = new C8573d(this, payload, str, lVar, null);
        return C13334c.m40966a(context$companion_release, dVar);
    }

    public Completable startListener() {
        return C13334c.m40966a(getContext$companion_release(), new C8574e(this, null));
    }

    public Completable startUp() {
        return C13334c.m40966a(getContext$companion_release(), new C8575f(this, null));
    }

    public Completable stopListener() {
        return C13334c.m40966a(getContext$companion_release(), new C8576g(this, null));
    }

    public Completable stopScheduledPairingBroadcast(C8489l lVar) {
        return C13334c.m40966a(getContext$companion_release(), new C8577h(this, lVar, null));
    }

    public Completable tearDown() {
        return C13334c.m40966a(getContext$companion_release(), new C8579j(this, null));
    }

    private RxProviderCompanion(CompanionConfiguration companionConfiguration) {
        this.config = companionConfiguration;
        this.providerCompanion = ProviderCompanion.Factory.mo21662a(this.config);
        this.events$delegate = C12763i.m39921a(new C8571b(this));
    }

    public Completable stopScheduledPairingBroadcast() {
        return C13334c.m40966a(getContext$companion_release(), new C8578i(this, null));
    }
}
