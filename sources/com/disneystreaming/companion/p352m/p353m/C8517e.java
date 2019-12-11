package com.disneystreaming.companion.p352m.p353m;

import com.disneystreaming.companion.configuration.CompanionConfiguration;
import com.disneystreaming.companion.messaging.C8569d;
import com.disneystreaming.companion.messaging.Message;
import com.disneystreaming.companion.messaging.MessageType;
import com.disneystreaming.companion.messaging.MessageType.C8545a;
import com.disneystreaming.companion.messaging.MessageType.C8546b;
import com.disneystreaming.companion.messaging.MessageType.C8547c;
import com.disneystreaming.companion.messaging.MessageType.C8548d;
import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.messaging.MessagingEvent.C8553d;
import com.disneystreaming.companion.messaging.MessagingEvent.C8554e;
import com.disneystreaming.companion.messaging.MessagingEvent.C8555f;
import com.disneystreaming.companion.messaging.MessagingEvent.C8557h;
import com.disneystreaming.companion.messaging.MessagingEvent.C8559j;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p351l.C8476c;
import com.disneystreaming.companion.p352m.C8486i;
import java.io.Closeable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C12903o;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12702b;
import kotlin.p573a0.p575i.p576a.C12704d;
import kotlin.p573a0.p575i.p576a.C12706f;
import kotlin.p573a0.p575i.p576a.C12714m;
import kotlinx.coroutines.C13227d;
import kotlinx.coroutines.C13233e0;
import kotlinx.coroutines.C13324k1;
import kotlinx.coroutines.C13324k1.C13325a;
import kotlinx.coroutines.C13419z0;
import kotlinx.coroutines.p592j2.C13303d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010!\u001a\u00020\u0007H\u0016J\r\u0010\"\u001a\u00020\u001bH\u0010¢\u0006\u0002\b#J\u001d\u0010$\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0010¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0016\u0010(\u001a\u00020\u001b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\b\u0010,\u001a\u00020\u001bH\u0016J\u0019\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\nH\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\b\u00103\u001a\u00020\u0007H\u0002J\b\u00104\u001a\u00020\u001bH\u0002J\b\u00105\u001a\u00020\u0007H\u0016J\b\u00106\u001a\u00020\u0007H\u0016J\b\u00107\u001a\u00020\u001bH\u0016J\b\u00108\u001a\u00020\u001bH\u0002J\b\u00109\u001a\u00020\u0007H\u0016J\u0010\u0010:\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\nH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, mo31007d2 = {"Lcom/disneystreaming/companion/service/socket/SocketRequesterService;", "Lcom/disneystreaming/companion/service/RequesterService;", "Lcom/disneystreaming/companion/service/socket/NetSocketService;", "config", "Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "(Lcom/disneystreaming/companion/configuration/CompanionConfiguration;)V", "broadcastJob", "Lkotlinx/coroutines/Job;", "connected", "", "", "getConnected", "()Ljava/util/List;", "isPairing", "", "pairingSocket", "Ljava/net/DatagramSocket;", "pingScheduledTask", "Ljava/util/concurrent/ScheduledFuture;", "pingScheduler", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "pinged", "", "Lcom/disneystreaming/companion/service/socket/SocketRequesterService$Companion$Pinged;", "timeoutScheduledTask", "timeoutScheduler", "checkTimeout", "", "handleCustomMessage", "message", "Lcom/disneystreaming/companion/messaging/Message;", "from", "handlePairingMessage", "listenForBroadcasts", "notifyMessageListenerStarted", "notifyMessageListenerStarted$companion_release", "processMessage", "processMessage$companion_release", "receiveOnDatagramSocket", "socket", "register", "channel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "schedulePing", "sendPairAcknowledge", "to", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPing", "host", "setup", "startBroadcastListener", "startTimeoutTask", "startUp", "stopListeningForBroadcasts", "stopScheduledPing", "stopTimeoutTask", "tearDown", "unpair", "Companion", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.m.m.e */
/* compiled from: SocketRequesterService.kt */
public final class C8517e extends C8491b implements C8486i {

    /* renamed from: n */
    private final List<String> f18133n = new ArrayList();

    /* renamed from: o */
    private ScheduledThreadPoolExecutor f18134o;

    /* renamed from: p */
    private ScheduledFuture<?> f18135p;

    /* renamed from: q */
    private ScheduledThreadPoolExecutor f18136q;

    /* renamed from: r */
    private ScheduledFuture<?> f18137r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Map<String, C8519a> f18138s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public DatagramSocket f18139t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f18140u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C13324k1 f18141v;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo31007d2 = {"Lcom/disneystreaming/companion/service/socket/SocketRequesterService$Companion;", "", "()V", "TAG", "", "Pinged", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.e$a */
    /* compiled from: SocketRequesterService.kt */
    public static final class C8518a {

        /* renamed from: com.disneystreaming.companion.m.m.e$a$a */
        /* compiled from: SocketRequesterService.kt */
        public static final class C8519a {

            /* renamed from: a */
            private Date f18142a;

            /* renamed from: b */
            private Date f18143b;

            public C8519a(Date date, Date date2) {
                this.f18142a = date;
                this.f18143b = date2;
            }

            /* renamed from: a */
            public final Date mo21812a() {
                return this.f18142a;
            }

            /* renamed from: b */
            public final Date mo21813b() {
                return this.f18143b;
            }

            /* renamed from: c */
            public final long mo21814c() {
                Date date = this.f18143b;
                if (!(date != null)) {
                    date = null;
                }
                if (date == null) {
                    date = this.f18142a;
                }
                return TimeUnit.MILLISECONDS.toSeconds(new Date().getTime() - date.getTime());
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f18143b, (java.lang.Object) r3.f18143b) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.disneystreaming.companion.p352m.p353m.C8517e.C8518a.C8519a
                    if (r0 == 0) goto L_0x001d
                    com.disneystreaming.companion.m.m.e$a$a r3 = (com.disneystreaming.companion.p352m.p353m.C8517e.C8518a.C8519a) r3
                    java.util.Date r0 = r2.f18142a
                    java.util.Date r1 = r3.f18142a
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.util.Date r0 = r2.f18143b
                    java.util.Date r3 = r3.f18143b
                    boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.p352m.p353m.C8517e.C8518a.C8519a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                Date date = this.f18142a;
                int i = 0;
                int hashCode = (date != null ? date.hashCode() : 0) * 31;
                Date date2 = this.f18143b;
                if (date2 != null) {
                    i = date2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Pinged(lastCheck=");
                sb.append(this.f18142a);
                sb.append(", lastUpdated=");
                sb.append(this.f18143b);
                sb.append(")");
                return sb.toString();
            }
        }

        private C8518a() {
        }

        public /* synthetic */ C8518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$handleCustomMessage$1", mo31053f = "SocketRequesterService.kt", mo31054l = {269}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.e$b */
    /* compiled from: SocketRequesterService.kt */
    static final class C8520b extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18144X;

        /* renamed from: Y */
        Object f18145Y;

        /* renamed from: Z */
        int f18146Z;

        /* renamed from: a0 */
        final /* synthetic */ C8517e f18147a0;

        /* renamed from: b0 */
        final /* synthetic */ String f18148b0;

        @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$handleCustomMessage$1$1", mo31053f = "SocketRequesterService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
        /* renamed from: com.disneystreaming.companion.m.m.e$b$a */
        /* compiled from: SocketRequesterService.kt */
        static final class C8521a extends C12714m implements Function2<C13233e0, C12683c<? super Boolean>, Object> {

            /* renamed from: X */
            private C13233e0 f18149X;

            /* renamed from: Y */
            int f18150Y;

            /* renamed from: Z */
            final /* synthetic */ C8520b f18151Z;

            C8521a(C8520b bVar, C12683c cVar) {
                this.f18151Z = bVar;
                super(2, cVar);
            }

            /* renamed from: a */
            public final Object mo5580a(Object obj) {
                C12700d.m39820a();
                if (this.f18150Y == 0) {
                    C12903o.m40241a(obj);
                    this.f18151Z.f18147a0.mo21786o().mo21721a(this.f18151Z.f18148b0);
                    this.f18151Z.f18147a0.mo21824k().add(this.f18151Z.f18148b0);
                    return C12702b.m39828a(this.f18151Z.f18147a0.mo21770a().remove(this.f18151Z.f18148b0));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: a */
            public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
                C8521a aVar = new C8521a(this.f18151Z, cVar);
                aVar.f18149X = (C13233e0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C8521a) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
            }
        }

        C8520b(C8517e eVar, String str, C12683c cVar) {
            this.f18147a0 = eVar;
            this.f18148b0 = str;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18146Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18144X;
                C8476c.f18029a.mo21760a("Signature is invalid", (Throwable) null, "SocketRequesterService");
                C13419z0 r = this.f18147a0.mo21789r();
                C8521a aVar = new C8521a(this, null);
                this.f18145Y = e0Var;
                this.f18146Z = 1;
                if (C13227d.m40667a(r, aVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18145Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8520b bVar = new C8520b(this.f18147a0, this.f18148b0, cVar);
            bVar.f18144X = (C13233e0) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8520b) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$handlePairingMessage$1", mo31053f = "SocketRequesterService.kt", mo31054l = {245}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.e$c */
    /* compiled from: SocketRequesterService.kt */
    static final class C8522c extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18152X;

        /* renamed from: Y */
        Object f18153Y;

        /* renamed from: Z */
        int f18154Z;

        /* renamed from: a0 */
        final /* synthetic */ C8517e f18155a0;

        /* renamed from: b0 */
        final /* synthetic */ String f18156b0;

        @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$handlePairingMessage$1$1", mo31053f = "SocketRequesterService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
        /* renamed from: com.disneystreaming.companion.m.m.e$c$a */
        /* compiled from: SocketRequesterService.kt */
        static final class C8523a extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

            /* renamed from: X */
            private C13233e0 f18157X;

            /* renamed from: Y */
            int f18158Y;

            /* renamed from: Z */
            final /* synthetic */ C8522c f18159Z;

            C8523a(C8522c cVar, C12683c cVar2) {
                this.f18159Z = cVar;
                super(2, cVar2);
            }

            /* renamed from: a */
            public final Object mo5580a(Object obj) {
                C12700d.m39820a();
                if (this.f18158Y == 0) {
                    C12903o.m40241a(obj);
                    if (!this.f18159Z.f18155a0.mo21770a().contains(this.f18159Z.f18156b0)) {
                        this.f18159Z.f18155a0.mo21770a().add(this.f18159Z.f18156b0);
                    }
                    return C13145v.f29587a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: a */
            public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
                C8523a aVar = new C8523a(this.f18159Z, cVar);
                aVar.f18157X = (C13233e0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C8523a) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
            }
        }

        C8522c(C8517e eVar, String str, C12683c cVar) {
            this.f18155a0 = eVar;
            this.f18156b0 = str;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18154Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18152X;
                C13419z0 r = this.f18155a0.mo21789r();
                C8523a aVar = new C8523a(this, null);
                this.f18153Y = e0Var;
                this.f18154Z = 1;
                if (C13227d.m40667a(r, aVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18153Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8522c cVar2 = new C8522c(this.f18155a0, this.f18156b0, cVar);
            cVar2.f18152X = (C13233e0) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8522c) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$handlePairingMessage$2", mo31053f = "SocketRequesterService.kt", mo31054l = {250}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.e$d */
    /* compiled from: SocketRequesterService.kt */
    static final class C8524d extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18160X;

        /* renamed from: Y */
        Object f18161Y;

        /* renamed from: Z */
        int f18162Z;

        /* renamed from: a0 */
        final /* synthetic */ C8517e f18163a0;

        /* renamed from: b0 */
        final /* synthetic */ String f18164b0;

        /* renamed from: c0 */
        final /* synthetic */ Message f18165c0;

        C8524d(C8517e eVar, String str, Message message, C12683c cVar) {
            this.f18163a0 = eVar;
            this.f18164b0 = str;
            this.f18165c0 = message;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18162Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18160X;
                C8517e eVar = this.f18163a0;
                String str = this.f18164b0;
                this.f18161Y = e0Var;
                this.f18162Z = 1;
                if (eVar.mo21808a(str, (C12683c<? super C13145v>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18161Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13303d p = this.f18163a0.mo21787p();
            if (p != null) {
                C12702b.m39828a(p.offer(new C8557h(this.f18164b0, this.f18165c0.getPayload(), this.f18163a0.mo21790s())));
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8524d dVar = new C8524d(this.f18163a0, this.f18164b0, this.f18165c0, cVar);
            dVar.f18160X = (C13233e0) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8524d) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$listenForBroadcasts$1", mo31053f = "SocketRequesterService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.e$e */
    /* compiled from: SocketRequesterService.kt */
    static final class C8525e extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18166X;

        /* renamed from: Y */
        int f18167Y;

        /* renamed from: Z */
        final /* synthetic */ C8517e f18168Z;

        C8525e(C8517e eVar, C12683c cVar) {
            this.f18168Z = eVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18167Y == 0) {
                C12903o.m40241a(obj);
                C8517e eVar = this.f18168Z;
                eVar.f18141v = eVar.m24727x();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8525e eVar = new C8525e(this.f18168Z, cVar);
            eVar.f18166X = (C13233e0) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8525e) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$processMessage$1", mo31053f = "SocketRequesterService.kt", mo31054l = {226}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.e$f */
    /* compiled from: SocketRequesterService.kt */
    static final class C8526f extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18169X;

        /* renamed from: Y */
        Object f18170Y;

        /* renamed from: Z */
        int f18171Z;

        /* renamed from: a0 */
        final /* synthetic */ C8517e f18172a0;

        /* renamed from: b0 */
        final /* synthetic */ String f18173b0;

        @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$processMessage$1$1", mo31053f = "SocketRequesterService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
        /* renamed from: com.disneystreaming.companion.m.m.e$f$a */
        /* compiled from: SocketRequesterService.kt */
        static final class C8527a extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

            /* renamed from: X */
            private C13233e0 f18174X;

            /* renamed from: Y */
            int f18175Y;

            /* renamed from: Z */
            final /* synthetic */ C8526f f18176Z;

            C8527a(C8526f fVar, C12683c cVar) {
                this.f18176Z = fVar;
                super(2, cVar);
            }

            /* renamed from: a */
            public final Object mo5580a(Object obj) {
                C12700d.m39820a();
                if (this.f18175Y == 0) {
                    C12903o.m40241a(obj);
                    C8476c cVar = C8476c.f18029a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received a pong from ");
                    sb.append(this.f18176Z.f18173b0);
                    cVar.mo21760a(sb.toString(), (Throwable) null, "SocketRequesterService");
                    Object obj2 = this.f18176Z.f18172a0.f18138s.get(this.f18176Z.f18173b0);
                    if (!C12702b.m39828a(((C8519a) obj2) != null).booleanValue()) {
                        obj2 = null;
                    }
                    C8519a aVar = (C8519a) obj2;
                    if (aVar == null) {
                        return C13145v.f29587a;
                    }
                    this.f18176Z.f18172a0.f18138s.put(this.f18176Z.f18173b0, new C8519a(aVar.mo21812a(), new Date()));
                    return C13145v.f29587a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: a */
            public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
                C8527a aVar = new C8527a(this.f18176Z, cVar);
                aVar.f18174X = (C13233e0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C8527a) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
            }
        }

        C8526f(C8517e eVar, String str, C12683c cVar) {
            this.f18172a0 = eVar;
            this.f18173b0 = str;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18171Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18169X;
                C13419z0 r = this.f18172a0.mo21789r();
                C8527a aVar = new C8527a(this, null);
                this.f18170Y = e0Var;
                this.f18171Z = 1;
                if (C13227d.m40667a(r, aVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18170Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8526f fVar = new C8526f(this.f18172a0, this.f18173b0, cVar);
            fVar.f18169X = (C13233e0) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8526f) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    /* renamed from: com.disneystreaming.companion.m.m.e$g */
    /* compiled from: SocketRequesterService.kt */
    static final class C8528g implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C8517e f18177c;

        C8528g(C8517e eVar) {
            this.f18177c = eVar;
        }

        public final void run() {
            for (String b : this.f18177c.mo21770a()) {
                this.f18177c.mo21809b(b);
            }
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService", mo31053f = "SocketRequesterService.kt", mo31054l = {380}, mo31055m = "sendPairAcknowledge")
    /* renamed from: com.disneystreaming.companion.m.m.e$h */
    /* compiled from: SocketRequesterService.kt */
    static final class C8529h extends C12704d {

        /* renamed from: W */
        /* synthetic */ Object f18178W;

        /* renamed from: X */
        int f18179X;

        /* renamed from: Y */
        final /* synthetic */ C8517e f18180Y;

        /* renamed from: Z */
        Object f18181Z;

        /* renamed from: a0 */
        Object f18182a0;

        /* renamed from: b0 */
        Object f18183b0;

        C8529h(C8517e eVar, C12683c cVar) {
            this.f18180Y = eVar;
            super(cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            this.f18178W = obj;
            this.f18179X |= Integer.MIN_VALUE;
            return this.f18180Y.mo21808a((String) null, (C12683c<? super C13145v>) this);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$sendPing$1", mo31053f = "SocketRequesterService.kt", mo31054l = {338}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.e$i */
    /* compiled from: SocketRequesterService.kt */
    static final class C8530i extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18184X;

        /* renamed from: Y */
        Object f18185Y;

        /* renamed from: Z */
        Object f18186Z;

        /* renamed from: a0 */
        int f18187a0;

        /* renamed from: b0 */
        final /* synthetic */ C8517e f18188b0;

        /* renamed from: c0 */
        final /* synthetic */ String f18189c0;

        C8530i(C8517e eVar, String str, C12683c cVar) {
            this.f18188b0 = eVar;
            this.f18189c0 = str;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18187a0;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18184X;
                Payload payload = new Payload(C8547c.f18237a, null, null, null, null, null, 62, null);
                C8517e eVar = this.f18188b0;
                String str = this.f18189c0;
                this.f18185Y = e0Var;
                this.f18186Z = payload;
                this.f18187a0 = 1;
                if (eVar.mo21772a(payload, str, (C12683c<? super C13145v>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                Payload payload2 = (Payload) this.f18186Z;
                C13233e0 e0Var2 = (C13233e0) this.f18185Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8530i iVar = new C8530i(this.f18188b0, this.f18189c0, cVar);
            iVar.f18184X = (C13233e0) obj;
            return iVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8530i) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$startBroadcastListener$1", mo31053f = "SocketRequesterService.kt", mo31054l = {414}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.e$j */
    /* compiled from: SocketRequesterService.kt */
    static final class C8531j extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18190X;

        /* renamed from: Y */
        Object f18191Y;

        /* renamed from: Z */
        Object f18192Z;

        /* renamed from: a0 */
        Object f18193a0;

        /* renamed from: b0 */
        Object f18194b0;

        /* renamed from: c0 */
        Object f18195c0;

        /* renamed from: d0 */
        int f18196d0;

        /* renamed from: e0 */
        final /* synthetic */ C8517e f18197e0;

        /* renamed from: com.disneystreaming.companion.m.m.e$j$a */
        /* compiled from: SocketRequesterService.kt */
        static final class C8532a extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C8531j f18198c;

            C8532a(C8531j jVar) {
                this.f18198c = jVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                if (this.f18198c.f18197e0.f18140u) {
                    this.f18198c.f18197e0.mo21780a(th);
                }
            }
        }

        /* renamed from: com.disneystreaming.companion.m.m.e$j$b */
        /* compiled from: UseCancellable.kt */
        public static final class C8533b extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ Closeable f18199c;

            public C8533b(Closeable closeable, Function1 function1, C8531j jVar) {
                this.f18199c = closeable;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                Closeable closeable = this.f18199c;
                if (closeable != null) {
                    closeable.close();
                }
            }
        }

        C8531j(C8517e eVar, C12683c cVar) {
            this.f18197e0 = eVar;
            super(2, cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            kotlin.p580c0.C12724b.m39863a(r1, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0118, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo5580a(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.p573a0.p574h.C12700d.m39820a()
                int r1 = r7.f18196d0
                r2 = 1
                if (r1 == 0) goto L_0x002c
                if (r1 != r2) goto L_0x0024
                java.lang.Object r0 = r7.f18195c0
                com.disneystreaming.companion.m.m.e$j r0 = (com.disneystreaming.companion.p352m.p353m.C8517e.C8531j) r0
                java.lang.Object r0 = r7.f18194b0
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                java.lang.Object r0 = r7.f18193a0
                java.io.Closeable r0 = (java.io.Closeable) r0
                java.lang.Object r0 = r7.f18192Z
                java.net.DatagramSocket r0 = (java.net.DatagramSocket) r0
                java.lang.Object r0 = r7.f18191Y
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C13233e0) r0
                kotlin.C12903o.m40241a(r8)     // Catch:{ Exception -> 0x011c }
                goto L_0x012a
            L_0x0024:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x002c:
                kotlin.C12903o.m40241a(r8)
                kotlinx.coroutines.e0 r8 = r7.f18190X
                com.disneystreaming.companion.l.c r1 = com.disneystreaming.companion.p351l.C8476c.f18029a
                r3 = 0
                java.lang.String r4 = "listenForBroadcasts called"
                java.lang.String r5 = "SocketRequesterService"
                r1.mo21760a(r4, r3, r5)
                com.disneystreaming.companion.m.m.e r1 = r7.f18197e0
                r1.f18140u = r2
                com.disneystreaming.companion.m.m.e r1 = r7.f18197e0     // Catch:{ Exception -> 0x011c }
                java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x011c }
                r4.<init>(r3)     // Catch:{ Exception -> 0x011c }
                r1.f18139t = r4     // Catch:{ Exception -> 0x011c }
                com.disneystreaming.companion.m.m.e r1 = r7.f18197e0     // Catch:{ Exception -> 0x011c }
                java.net.DatagramSocket r1 = r1.f18139t     // Catch:{ Exception -> 0x011c }
                if (r1 == 0) goto L_0x0054
                r4 = 1
                goto L_0x0055
            L_0x0054:
                r4 = 0
            L_0x0055:
                java.lang.Boolean r4 = kotlin.p573a0.p575i.p576a.C12702b.m39828a(r4)     // Catch:{ Exception -> 0x011c }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x011c }
                if (r4 == 0) goto L_0x0060
                goto L_0x0061
            L_0x0060:
                r1 = r3
            L_0x0061:
                if (r1 == 0) goto L_0x0119
                com.disneystreaming.companion.m.m.e$j$a r4 = new com.disneystreaming.companion.m.m.e$j$a     // Catch:{ Exception -> 0x011c }
                r4.<init>(r7)     // Catch:{ Exception -> 0x011c }
                r7.f18191Y = r8     // Catch:{ Exception -> 0x011c }
                r7.f18192Z = r1     // Catch:{ Exception -> 0x011c }
                r7.f18193a0 = r1     // Catch:{ Exception -> 0x011c }
                r7.f18194b0 = r4     // Catch:{ Exception -> 0x011c }
                r7.f18195c0 = r7     // Catch:{ Exception -> 0x011c }
                r7.f18196d0 = r2     // Catch:{ Exception -> 0x011c }
                kotlinx.coroutines.i r8 = new kotlinx.coroutines.i     // Catch:{ Exception -> 0x011c }
                kotlin.a0.c r5 = kotlin.p573a0.p574h.C12697c.m39816a(r7)     // Catch:{ Exception -> 0x011c }
                r8.<init>(r5, r2)     // Catch:{ Exception -> 0x011c }
                com.disneystreaming.companion.m.m.e$j$b r5 = new com.disneystreaming.companion.m.m.e$j$b     // Catch:{ Exception -> 0x011c }
                r5.<init>(r1, r4, r7)     // Catch:{ Exception -> 0x011c }
                r8.mo34385a(r5)     // Catch:{ Exception -> 0x011c }
                r1.setReuseAddress(r2)     // Catch:{ all -> 0x0112 }
                java.net.InetSocketAddress r5 = new java.net.InetSocketAddress     // Catch:{ all -> 0x0112 }
                com.disneystreaming.companion.m.m.e r6 = r7.f18197e0     // Catch:{ all -> 0x0112 }
                com.disneystreaming.companion.m.m.c r6 = r6.mo21827n()     // Catch:{ all -> 0x0112 }
                int r6 = r6.mo21799b()     // Catch:{ all -> 0x0112 }
                r5.<init>(r6)     // Catch:{ all -> 0x0112 }
                r1.bind(r5)     // Catch:{ all -> 0x0112 }
                r1.setBroadcast(r2)     // Catch:{ all -> 0x0112 }
            L_0x009d:
                boolean r2 = r1.isBound()     // Catch:{ all -> 0x0112 }
                if (r2 != 0) goto L_0x00a4
                goto L_0x009d
            L_0x00a4:
                com.disneystreaming.companion.m.m.e r2 = r7.f18197e0     // Catch:{ all -> 0x0112 }
                kotlinx.coroutines.j2.d r2 = r2.mo21787p()     // Catch:{ all -> 0x0112 }
                if (r2 == 0) goto L_0x00be
                com.disneystreaming.companion.messaging.MessagingEvent$a r5 = new com.disneystreaming.companion.messaging.MessagingEvent$a     // Catch:{ all -> 0x0112 }
                com.disneystreaming.companion.m.m.e r6 = r7.f18197e0     // Catch:{ all -> 0x0112 }
                com.disneystreaming.companion.m.l r6 = r6.mo21790s()     // Catch:{ all -> 0x0112 }
                r5.<init>(r6)     // Catch:{ all -> 0x0112 }
                boolean r2 = r2.offer(r5)     // Catch:{ all -> 0x0112 }
                kotlin.p573a0.p575i.p576a.C12702b.m39828a(r2)     // Catch:{ all -> 0x0112 }
            L_0x00be:
                com.disneystreaming.companion.m.m.e r2 = r7.f18197e0     // Catch:{ all -> 0x0112 }
                kotlinx.coroutines.j2.d r2 = r2.mo21787p()     // Catch:{ all -> 0x0112 }
                if (r2 == 0) goto L_0x00d8
                com.disneystreaming.companion.messaging.MessagingEvent$i r5 = new com.disneystreaming.companion.messaging.MessagingEvent$i     // Catch:{ all -> 0x0112 }
                com.disneystreaming.companion.m.m.e r6 = r7.f18197e0     // Catch:{ all -> 0x0112 }
                com.disneystreaming.companion.m.l r6 = r6.mo21790s()     // Catch:{ all -> 0x0112 }
                r5.<init>(r6)     // Catch:{ all -> 0x0112 }
                boolean r2 = r2.offer(r5)     // Catch:{ all -> 0x0112 }
                kotlin.p573a0.p575i.p576a.C12702b.m39828a(r2)     // Catch:{ all -> 0x0112 }
            L_0x00d8:
                com.disneystreaming.companion.m.m.e r2 = r7.f18197e0     // Catch:{ Exception -> 0x00ec }
                boolean r2 = r2.f18140u     // Catch:{ Exception -> 0x00ec }
                if (r2 == 0) goto L_0x00fa
                boolean r2 = r1.isClosed()     // Catch:{ Exception -> 0x00ec }
                if (r2 != 0) goto L_0x00fa
                com.disneystreaming.companion.m.m.e r2 = r7.f18197e0     // Catch:{ Exception -> 0x00ec }
                r2.m24716a(r1)     // Catch:{ Exception -> 0x00ec }
                goto L_0x00d8
            L_0x00ec:
                r2 = move-exception
                com.disneystreaming.companion.m.m.e r5 = r7.f18197e0     // Catch:{ all -> 0x0112 }
                boolean r5 = r5.f18140u     // Catch:{ all -> 0x0112 }
                if (r5 == 0) goto L_0x00fa
                com.disneystreaming.companion.m.m.e r5 = r7.f18197e0     // Catch:{ all -> 0x0112 }
                r5.mo21780a(r2)     // Catch:{ all -> 0x0112 }
            L_0x00fa:
                kotlin.v r2 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x0112 }
                kotlin.p580c0.C12724b.m39863a(r1, r3)     // Catch:{ Exception -> 0x011c }
                r8.mo34384a(r2, r4)     // Catch:{ Exception -> 0x011c }
                java.lang.Object r8 = r8.mo34396e()     // Catch:{ Exception -> 0x011c }
                java.lang.Object r1 = kotlin.p573a0.p574h.C12700d.m39820a()     // Catch:{ Exception -> 0x011c }
                if (r8 != r1) goto L_0x010f
                kotlin.p573a0.p575i.p576a.C12708h.m39847c(r7)     // Catch:{ Exception -> 0x011c }
            L_0x010f:
                if (r8 != r0) goto L_0x012a
                return r0
            L_0x0112:
                r8 = move-exception
                throw r8     // Catch:{ all -> 0x0114 }
            L_0x0114:
                r0 = move-exception
                kotlin.p580c0.C12724b.m39863a(r1, r8)     // Catch:{ Exception -> 0x011c }
                throw r0     // Catch:{ Exception -> 0x011c }
            L_0x0119:
                kotlin.v r8 = kotlin.C13145v.f29587a     // Catch:{ Exception -> 0x011c }
                return r8
            L_0x011c:
                r8 = move-exception
                com.disneystreaming.companion.m.m.e r0 = r7.f18197e0
                boolean r0 = r0.f18140u
                if (r0 == 0) goto L_0x012a
                com.disneystreaming.companion.m.m.e r0 = r7.f18197e0
                r0.mo21782b(r8)
            L_0x012a:
                kotlin.v r8 = kotlin.C13145v.f29587a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.p352m.p353m.C8517e.C8531j.mo5580a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8531j jVar = new C8531j(this.f18197e0, cVar);
            jVar.f18190X = (C13233e0) obj;
            return jVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8531j) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    /* renamed from: com.disneystreaming.companion.m.m.e$k */
    /* compiled from: SocketRequesterService.kt */
    static final class C8534k implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C8517e f18200c;

        C8534k(C8517e eVar) {
            this.f18200c = eVar;
        }

        public final void run() {
            this.f18200c.m24726w();
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$startUp$1", mo31053f = "SocketRequesterService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.e$l */
    /* compiled from: SocketRequesterService.kt */
    static final class C8535l extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18201X;

        /* renamed from: Y */
        int f18202Y;

        /* renamed from: Z */
        final /* synthetic */ C8517e f18203Z;

        C8535l(C8517e eVar, C12683c cVar) {
            this.f18203Z = eVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18202Y == 0) {
                C12903o.m40241a(obj);
                this.f18203Z.mo21771c();
                this.f18203Z.mo21763i();
                this.f18203Z.mo21768e();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8535l lVar = new C8535l(this.f18203Z, cVar);
            lVar.f18201X = (C13233e0) obj;
            return lVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8535l) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$stopListeningForBroadcasts$1", mo31053f = "SocketRequesterService.kt", mo31054l = {414}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.e$m */
    /* compiled from: SocketRequesterService.kt */
    static final class C8536m extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18204X;

        /* renamed from: Y */
        Object f18205Y;

        /* renamed from: Z */
        Object f18206Z;

        /* renamed from: a0 */
        Object f18207a0;

        /* renamed from: b0 */
        Object f18208b0;

        /* renamed from: c0 */
        Object f18209c0;

        /* renamed from: d0 */
        int f18210d0;

        /* renamed from: e0 */
        final /* synthetic */ C8517e f18211e0;

        /* renamed from: com.disneystreaming.companion.m.m.e$m$a */
        /* compiled from: SocketRequesterService.kt */
        static final class C8537a extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            public static final C8537a f18212c = new C8537a();

            C8537a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                C8476c cVar = C8476c.f18029a;
                StringBuilder sb = new StringBuilder();
                sb.append("Error stopping listening on UDP socket: ");
                sb.append(th.getLocalizedMessage());
                cVar.mo21760a(sb.toString(), (Throwable) null, "SocketRequesterService");
            }
        }

        /* renamed from: com.disneystreaming.companion.m.m.e$m$b */
        /* compiled from: UseCancellable.kt */
        public static final class C8538b extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ Closeable f18213c;

            public C8538b(Closeable closeable, Function1 function1) {
                this.f18213c = closeable;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                Closeable closeable = this.f18213c;
                if (closeable != null) {
                    closeable.close();
                }
            }
        }

        C8536m(C8517e eVar, C12683c cVar) {
            this.f18211e0 = eVar;
            super(2, cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            kotlin.p580c0.C12724b.m39863a(r1, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo5580a(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.p573a0.p574h.C12700d.m39820a()
                int r1 = r7.f18210d0
                java.lang.String r2 = "SocketRequesterService"
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x002e
                if (r1 != r3) goto L_0x0026
                java.lang.Object r0 = r7.f18209c0
                com.disneystreaming.companion.m.m.e$m r0 = (com.disneystreaming.companion.p352m.p353m.C8517e.C8536m) r0
                java.lang.Object r0 = r7.f18208b0
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                java.lang.Object r0 = r7.f18207a0
                java.io.Closeable r0 = (java.io.Closeable) r0
                java.lang.Object r0 = r7.f18206Z
                java.net.DatagramSocket r0 = (java.net.DatagramSocket) r0
                java.lang.Object r0 = r7.f18205Y
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C13233e0) r0
                kotlin.C12903o.m40241a(r8)     // Catch:{ Exception -> 0x00af }
                goto L_0x0094
            L_0x0026:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x002e:
                kotlin.C12903o.m40241a(r8)
                kotlinx.coroutines.e0 r8 = r7.f18204X
                com.disneystreaming.companion.l.c r1 = com.disneystreaming.companion.p351l.C8476c.f18029a
                java.lang.String r5 = "stopListeningForBroadcasts called"
                r1.mo21760a(r5, r4, r2)
                com.disneystreaming.companion.m.m.e r1 = r7.f18211e0     // Catch:{ Exception -> 0x00af }
                r5 = 0
                r1.f18140u = r5     // Catch:{ Exception -> 0x00af }
                com.disneystreaming.companion.m.m.e r1 = r7.f18211e0     // Catch:{ Exception -> 0x00af }
                java.net.DatagramSocket r1 = r1.f18139t     // Catch:{ Exception -> 0x00af }
                if (r1 == 0) goto L_0x0049
                r5 = 1
            L_0x0049:
                java.lang.Boolean r5 = kotlin.p573a0.p575i.p576a.C12702b.m39828a(r5)     // Catch:{ Exception -> 0x00af }
                boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x00af }
                if (r5 == 0) goto L_0x0054
                goto L_0x0055
            L_0x0054:
                r1 = r4
            L_0x0055:
                if (r1 == 0) goto L_0x00ac
                com.disneystreaming.companion.m.m.e$m$a r5 = com.disneystreaming.companion.p352m.p353m.C8517e.C8536m.C8537a.f18212c     // Catch:{ Exception -> 0x00af }
                r7.f18205Y = r8     // Catch:{ Exception -> 0x00af }
                r7.f18206Z = r1     // Catch:{ Exception -> 0x00af }
                r7.f18207a0 = r1     // Catch:{ Exception -> 0x00af }
                r7.f18208b0 = r5     // Catch:{ Exception -> 0x00af }
                r7.f18209c0 = r7     // Catch:{ Exception -> 0x00af }
                r7.f18210d0 = r3     // Catch:{ Exception -> 0x00af }
                kotlinx.coroutines.i r8 = new kotlinx.coroutines.i     // Catch:{ Exception -> 0x00af }
                kotlin.a0.c r6 = kotlin.p573a0.p574h.C12697c.m39816a(r7)     // Catch:{ Exception -> 0x00af }
                r8.<init>(r6, r3)     // Catch:{ Exception -> 0x00af }
                com.disneystreaming.companion.m.m.e$m$b r6 = new com.disneystreaming.companion.m.m.e$m$b     // Catch:{ Exception -> 0x00af }
                r6.<init>(r1, r5)     // Catch:{ Exception -> 0x00af }
                r8.mo34385a(r6)     // Catch:{ Exception -> 0x00af }
                r1.disconnect()     // Catch:{ all -> 0x00a5 }
                r1.close()     // Catch:{ all -> 0x00a5 }
                kotlin.v r6 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x00a5 }
                kotlin.p580c0.C12724b.m39863a(r1, r4)     // Catch:{ Exception -> 0x00af }
                r8.mo34384a(r6, r5)     // Catch:{ Exception -> 0x00af }
                java.lang.Object r8 = r8.mo34396e()     // Catch:{ Exception -> 0x00af }
                java.lang.Object r1 = kotlin.p573a0.p574h.C12700d.m39820a()     // Catch:{ Exception -> 0x00af }
                if (r8 != r1) goto L_0x0091
                kotlin.p573a0.p575i.p576a.C12708h.m39847c(r7)     // Catch:{ Exception -> 0x00af }
            L_0x0091:
                if (r8 != r0) goto L_0x0094
                return r0
            L_0x0094:
                com.disneystreaming.companion.m.m.e r8 = r7.f18211e0     // Catch:{ Exception -> 0x00af }
                kotlinx.coroutines.k1 r8 = r8.f18141v     // Catch:{ Exception -> 0x00af }
                if (r8 == 0) goto L_0x009f
                kotlinx.coroutines.C13324k1.C13325a.m40950a(r8, r4, r3, r4)     // Catch:{ Exception -> 0x00af }
            L_0x009f:
                com.disneystreaming.companion.m.m.e r8 = r7.f18211e0     // Catch:{ Exception -> 0x00af }
                r8.f18139t = r4     // Catch:{ Exception -> 0x00af }
                goto L_0x00c6
            L_0x00a5:
                r8 = move-exception
                throw r8     // Catch:{ all -> 0x00a7 }
            L_0x00a7:
                r0 = move-exception
                kotlin.p580c0.C12724b.m39863a(r1, r8)     // Catch:{ Exception -> 0x00af }
                throw r0     // Catch:{ Exception -> 0x00af }
            L_0x00ac:
                kotlin.v r8 = kotlin.C13145v.f29587a     // Catch:{ Exception -> 0x00af }
                return r8
            L_0x00af:
                r8 = move-exception
                com.disneystreaming.companion.l.c r0 = com.disneystreaming.companion.p351l.C8476c.f18029a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Error stopping listening on UDP socket: "
                r1.append(r3)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.mo21760a(r8, r4, r2)
            L_0x00c6:
                kotlin.v r8 = kotlin.C13145v.f29587a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.p352m.p353m.C8517e.C8536m.mo5580a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8536m mVar = new C8536m(this.f18211e0, cVar);
            mVar.f18204X = (C13233e0) obj;
            return mVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8536m) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$tearDown$1", mo31053f = "SocketRequesterService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.e$n */
    /* compiled from: SocketRequesterService.kt */
    static final class C8539n extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18214X;

        /* renamed from: Y */
        int f18215Y;

        /* renamed from: Z */
        final /* synthetic */ C8517e f18216Z;

        C8539n(C8517e eVar, C12683c cVar) {
            this.f18216Z = eVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18215Y == 0) {
                C12903o.m40241a(obj);
                this.f18216Z.mo21764j();
                this.f18216Z.mo21769f();
                this.f18216Z.m24729z();
                this.f18216Z.mo21811v();
                this.f18216Z.mo21786o().mo21724b();
                this.f18216Z.mo21770a().clear();
                this.f18216Z.mo21824k().clear();
                this.f18216Z.mo21789r().close();
                C13324k1 b = this.f18216Z.f18141v;
                if (b != null) {
                    C13325a.m40950a(b, null, 1, null);
                }
                C13324k1 q = this.f18216Z.mo21788q();
                if (q != null) {
                    C13325a.m40950a(q, null, 1, null);
                }
                C13303d p = this.f18216Z.mo21787p();
                if (p != null) {
                    C12702b.m39828a(p.offer(new C8559j(this.f18216Z.mo21790s())));
                }
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8539n nVar = new C8539n(this.f18216Z, cVar);
            nVar.f18214X = (C13233e0) obj;
            return nVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8539n) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$unpair$1", mo31053f = "SocketRequesterService.kt", mo31054l = {357}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.e$o */
    /* compiled from: SocketRequesterService.kt */
    static final class C8540o extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18217X;

        /* renamed from: Y */
        Object f18218Y;

        /* renamed from: Z */
        int f18219Z;

        /* renamed from: a0 */
        final /* synthetic */ C8517e f18220a0;

        /* renamed from: b0 */
        final /* synthetic */ String f18221b0;

        @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketRequesterService$unpair$1$1", mo31053f = "SocketRequesterService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
        /* renamed from: com.disneystreaming.companion.m.m.e$o$a */
        /* compiled from: SocketRequesterService.kt */
        static final class C8541a extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

            /* renamed from: X */
            private C13233e0 f18222X;

            /* renamed from: Y */
            int f18223Y;

            /* renamed from: Z */
            final /* synthetic */ C8540o f18224Z;

            C8541a(C8540o oVar, C12683c cVar) {
                this.f18224Z = oVar;
                super(2, cVar);
            }

            /* renamed from: a */
            public final Object mo5580a(Object obj) {
                C12700d.m39820a();
                if (this.f18223Y == 0) {
                    C12903o.m40241a(obj);
                    this.f18224Z.f18220a0.mo21770a().remove(this.f18224Z.f18221b0);
                    this.f18224Z.f18220a0.f18138s.remove(this.f18224Z.f18221b0);
                    this.f18224Z.f18220a0.mo21786o().mo21721a(this.f18224Z.f18221b0);
                    return C13145v.f29587a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: a */
            public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
                C8541a aVar = new C8541a(this.f18224Z, cVar);
                aVar.f18222X = (C13233e0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C8541a) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
            }
        }

        C8540o(C8517e eVar, String str, C12683c cVar) {
            this.f18220a0 = eVar;
            this.f18221b0 = str;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18219Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18217X;
                C13419z0 r = this.f18220a0.mo21789r();
                C8541a aVar = new C8541a(this, null);
                this.f18218Y = e0Var;
                this.f18219Z = 1;
                if (C13227d.m40667a(r, aVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18218Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8540o oVar = new C8540o(this.f18220a0, this.f18221b0, cVar);
            oVar.f18217X = (C13233e0) obj;
            return oVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8540o) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    static {
        new C8518a(null);
    }

    public C8517e(CompanionConfiguration companionConfiguration) {
        super(companionConfiguration);
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        String str = "null cannot be cast to non-null type java.util.concurrent.ScheduledThreadPoolExecutor";
        if (newScheduledThreadPool != null) {
            this.f18134o = (ScheduledThreadPoolExecutor) newScheduledThreadPool;
            ScheduledExecutorService newScheduledThreadPool2 = Executors.newScheduledThreadPool(1);
            if (newScheduledThreadPool2 != null) {
                this.f18136q = (ScheduledThreadPoolExecutor) newScheduledThreadPool2;
                this.f18138s = new LinkedHashMap();
                return;
            }
            throw new C13142s(str);
        }
        throw new C13142s(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m24726w() {
        for (String str : mo21770a()) {
            C8476c cVar = C8476c.f18029a;
            StringBuilder sb = new StringBuilder();
            sb.append("Checking timeout for ");
            sb.append(str);
            String str2 = "SocketRequesterService";
            cVar.mo21760a(sb.toString(), (Throwable) null, str2);
            if (this.f18138s.get(str) == null) {
                C8476c cVar2 = C8476c.f18029a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("This is the first check for ");
                sb2.append(str);
                C8476c.m24621a(cVar2, sb2.toString(), null, null, 6, null);
                this.f18138s.put(str, new C8519a(new Date(), null));
            } else {
                Object obj = this.f18138s.get(str);
                boolean z = true;
                if (!(((C8519a) obj) != null)) {
                    obj = null;
                }
                C8519a aVar = (C8519a) obj;
                if (aVar != null) {
                    C8476c cVar3 = C8476c.f18029a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Time since last update for ");
                    sb3.append(str);
                    sb3.append(" is ");
                    sb3.append(aVar.mo21814c());
                    cVar3.mo21760a(sb3.toString(), (Throwable) null, str2);
                    if (aVar.mo21814c() > mo21825l().getPingTimeout()) {
                        mo21762a(str);
                    } else {
                        Object obj2 = this.f18138s.get(str);
                        if (((C8519a) obj2) == null) {
                            z = false;
                        }
                        if (!z) {
                            obj2 = null;
                        }
                        C8519a aVar2 = (C8519a) obj2;
                        if (aVar2 != null) {
                            this.f18138s.put(str, new C8519a(new Date(), aVar2.mo21813b()));
                        } else {
                            return;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final C13324k1 m24727x() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8531j(this, null), 2, null);
    }

    /* renamed from: y */
    private final void m24728y() {
        ScheduledFuture<?> scheduledFuture = this.f18137r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f18137r = this.f18136q.scheduleAtFixedRate(new C8534k(this), mo21825l().getPingInterval(), mo21825l().getPingInterval(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m24729z() {
        ScheduledFuture<?> scheduledFuture = this.f18137r;
        if (!(scheduledFuture != null)) {
            scheduledFuture = null;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: i */
    public C13324k1 mo21763i() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8525e(this, null), 2, null);
    }

    /* renamed from: j */
    public C13324k1 mo21764j() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8536m(this, null), 2, null);
    }

    /* renamed from: t */
    public void mo21791t() {
        C13303d p = mo21787p();
        if (p != null) {
            p.offer(new C8554e(mo21790s()));
        }
    }

    /* renamed from: u */
    public void mo21810u() {
        ScheduledFuture<?> scheduledFuture = this.f18135p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f18135p = this.f18134o.scheduleAtFixedRate(new C8528g(this), mo21825l().getPingInterval(), mo21825l().getPingInterval(), TimeUnit.SECONDS);
    }

    /* renamed from: v */
    public void mo21811v() {
        ScheduledFuture<?> scheduledFuture = this.f18135p;
        if (!(scheduledFuture != null)) {
            scheduledFuture = null;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: e */
    private final void m24722e(Message message, String str) {
        mo21777a(message.getPayload(), str);
        C13232e.m40677a(mo21826m(), null, null, new C8522c(this, str, null), 3, null);
        C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8524d(this, str, message, null), 2, null);
        mo21810u();
        m24728y();
    }

    /* renamed from: c */
    public void mo21771c() {
        mo21824k().clear();
        mo21786o().mo21725c();
        mo21770a().clear();
    }

    /* renamed from: d */
    public C13324k1 mo21775d() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8535l(this, null), 2, null);
    }

    /* renamed from: d */
    private final void m24721d(Message message, String str) {
        boolean c = mo21785c(message, str);
        if (c) {
            C13303d p = mo21787p();
            if (p != null) {
                p.offer(new C8555f(message, str, mo21790s()));
            }
        } else if (!c) {
            C13232e.m40677a(mo21826m(), null, null, new C8520b(this, str, null), 3, null);
        }
    }

    /* renamed from: b */
    public C13324k1 mo21774b() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8539n(this, null), 2, null);
    }

    /* renamed from: b */
    public C13324k1 mo21809b(String str) {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8530i(this, str, null), 2, null);
    }

    /* renamed from: a */
    public List<String> mo21770a() {
        return this.f18133n;
    }

    /* renamed from: a */
    public void mo21773a(C13303d<MessagingEvent> dVar) {
        mo21783b(dVar);
    }

    /* renamed from: a */
    public void mo21776a(Message message, String str) {
        if (message.getVersion() == 1 && !(!Intrinsics.areEqual((Object) message.getPayload().getAppId(), (Object) mo21825l().getAppId())) && !mo21824k().contains(str)) {
            C8476c cVar = C8476c.f18029a;
            StringBuilder sb = new StringBuilder();
            sb.append("Message of type ");
            sb.append(message.getPayload().getMessageType());
            sb.append(" received");
            String str2 = "SocketRequesterService";
            cVar.mo21760a(sb.toString(), (Throwable) null, str2);
            MessageType messageType = message.getPayload().getMessageType();
            if (messageType instanceof C8546b) {
                if (mo21825l().getAllowRePairing() || !mo21770a().contains(str)) {
                    m24722e(message, str);
                }
            } else if (messageType instanceof C8545a) {
                C8476c cVar2 = C8476c.f18029a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Custom Message ");
                sb2.append(message);
                sb2.append(" received from: ");
                sb2.append(str);
                cVar2.mo21760a(sb2.toString(), (Throwable) null, str2);
                m24721d(message, str);
            } else if (messageType instanceof C8548d) {
                C13232e.m40677a(mo21826m(), null, null, new C8526f(this, str, null), 3, null);
            }
        }
    }

    /* renamed from: a */
    public void mo21762a(String str) {
        C8476c cVar = C8476c.f18029a;
        StringBuilder sb = new StringBuilder();
        sb.append("Unpairing host ");
        sb.append(str);
        cVar.mo21760a(sb.toString(), (Throwable) null, "SocketRequesterService");
        C13232e.m40677a(mo21826m(), null, null, new C8540o(this, str, null), 3, null);
        C13303d p = mo21787p();
        if (p != null) {
            p.offer(new C8553d(str, mo21790s()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo21808a(java.lang.String r19, kotlin.p573a0.C12683c<? super kotlin.C13145v> r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            boolean r3 = r0 instanceof com.disneystreaming.companion.p352m.p353m.C8517e.C8529h
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.disneystreaming.companion.m.m.e$h r3 = (com.disneystreaming.companion.p352m.p353m.C8517e.C8529h) r3
            int r4 = r3.f18179X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f18179X = r4
            goto L_0x001e
        L_0x0019:
            com.disneystreaming.companion.m.m.e$h r3 = new com.disneystreaming.companion.m.m.e$h
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.f18178W
            java.lang.Object r4 = kotlin.p573a0.p574h.C12700d.m39820a()
            int r5 = r3.f18179X
            r6 = 1
            if (r5 == 0) goto L_0x0048
            if (r5 != r6) goto L_0x0040
            java.lang.Object r2 = r3.f18183b0
            com.disneystreaming.companion.messaging.Payload r2 = (com.disneystreaming.companion.messaging.Payload) r2
            java.lang.Object r4 = r3.f18182a0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.f18181Z
            com.disneystreaming.companion.m.m.e r3 = (com.disneystreaming.companion.p352m.p353m.C8517e) r3
            kotlin.C12903o.m40241a(r0)     // Catch:{ Exception -> 0x003c }
            goto L_0x00c1
        L_0x003c:
            r0 = move-exception
            r5 = r2
            r2 = r4
            goto L_0x00a6
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0048:
            kotlin.C12903o.m40241a(r0)
            com.disneystreaming.companion.l.c r0 = com.disneystreaming.companion.p351l.C8476c.f18029a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Sending Pair Acknowledge to "
            r5.append(r7)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r7 = 0
            java.lang.String r8 = "SocketRequesterService"
            r0.mo21760a(r5, r7, r8)
            com.disneystreaming.companion.messaging.Payload r5 = new com.disneystreaming.companion.messaging.Payload
            com.disneystreaming.companion.messaging.MessageType$b r10 = com.disneystreaming.companion.messaging.MessageType.C8546b.f18236a
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 62
            r17 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            com.disneystreaming.companion.configuration.CompanionConfiguration r0 = r18.mo21825l()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r0.getDeviceName()     // Catch:{ Exception -> 0x00a4 }
            r5.setDeviceName(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = "publicKey"
            com.disneystreaming.companion.k.a r7 = r18.mo21786o()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r7 = r7.mo21720a()     // Catch:{ Exception -> 0x00a4 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r0, r7)     // Catch:{ Exception -> 0x00a4 }
            java.util.Map r0 = kotlin.p590y.C13170i0.m40332a(r0)     // Catch:{ Exception -> 0x00a4 }
            r5.setContext(r0)     // Catch:{ Exception -> 0x00a4 }
            r3.f18181Z = r1     // Catch:{ Exception -> 0x00a4 }
            r3.f18182a0 = r2     // Catch:{ Exception -> 0x00a4 }
            r3.f18183b0 = r5     // Catch:{ Exception -> 0x00a4 }
            r3.f18179X = r6     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r0 = r1.mo21772a(r5, r2, r3)     // Catch:{ Exception -> 0x00a4 }
            if (r0 != r4) goto L_0x00c1
            return r4
        L_0x00a4:
            r0 = move-exception
            r3 = r1
        L_0x00a6:
            kotlinx.coroutines.j2.d r4 = r3.mo21787p()
            if (r4 == 0) goto L_0x00c1
            com.disneystreaming.companion.messaging.MessagingEvent$c r6 = new com.disneystreaming.companion.messaging.MessagingEvent$c
            com.disneystreaming.companion.messaging.MessagingEventError$e r7 = new com.disneystreaming.companion.messaging.MessagingEventError$e
            r7.<init>(r5, r2, r0)
            com.disneystreaming.companion.m.l r0 = r3.mo21790s()
            r6.<init>(r7, r0)
            boolean r0 = r4.offer(r6)
            kotlin.p573a0.p575i.p576a.C12702b.m39828a(r0)
        L_0x00c1:
            kotlin.v r0 = kotlin.C13145v.f29587a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.p352m.p353m.C8517e.mo21808a(java.lang.String, kotlin.a0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m24716a(DatagramSocket datagramSocket) {
        if (!datagramSocket.isClosed()) {
            byte[] bArr = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            datagramSocket.receive(datagramPacket);
            if (datagramPacket.getLength() > 0) {
                Charset charset = StandardCharsets.UTF_8;
                Intrinsics.checkReturnedValueIsNotNull((Object) charset, "StandardCharsets.UTF_8");
                String str = new String(bArr, charset);
                boolean z = false;
                String a = C12832w.m40117a(str, String.valueOf((char) 0), "", false, 4, (Object) null);
                if (a != null) {
                    Object a2 = C8569d.f18269a.mo21940a(Message.class, C12833x.m40181f(a).toString());
                    if (((Message) a2) != null) {
                        z = true;
                    }
                    if (!z) {
                        a2 = null;
                    }
                    Message message = (Message) a2;
                    if (message != null) {
                        InetAddress address = datagramPacket.getAddress();
                        Intrinsics.checkReturnedValueIsNotNull((Object) address, "packet.address");
                        String hostAddress = address.getHostAddress();
                        Intrinsics.checkReturnedValueIsNotNull((Object) hostAddress, "packet.address.hostAddress");
                        mo21776a(message, hostAddress);
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
    }
}
