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
import com.disneystreaming.companion.messaging.MessagingEvent.C8552c;
import com.disneystreaming.companion.messaging.MessagingEvent.C8553d;
import com.disneystreaming.companion.messaging.MessagingEvent.C8555f;
import com.disneystreaming.companion.messaging.MessagingEvent.C8557h;
import com.disneystreaming.companion.messaging.MessagingEvent.C8559j;
import com.disneystreaming.companion.messaging.MessagingEventError.C8560a;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p351l.C8476c;
import com.disneystreaming.companion.p352m.C8484g;
import java.io.Closeable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C12903o;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12702b;
import kotlin.p573a0.p575i.p576a.C12706f;
import kotlin.p573a0.p575i.p576a.C12714m;
import kotlin.p588j0.C12801c;
import kotlinx.coroutines.C13227d;
import kotlinx.coroutines.C13233e0;
import kotlinx.coroutines.C13324k1;
import kotlinx.coroutines.C13324k1.C13325a;
import kotlinx.coroutines.C13419z0;
import kotlinx.coroutines.p592j2.C13303d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001d\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0010¢\u0006\u0002\b\u001eJ\u0016\u0010\u001f\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\b\u0010)\u001a\u00020\rH\u0016J\b\u0010*\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, mo31007d2 = {"Lcom/disneystreaming/companion/service/socket/SocketProviderService;", "Lcom/disneystreaming/companion/service/ProviderService;", "Lcom/disneystreaming/companion/service/socket/NetSocketService;", "config", "Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "(Lcom/disneystreaming/companion/configuration/CompanionConfiguration;)V", "scheduledTask", "Ljava/util/concurrent/ScheduledFuture;", "scheduler", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "broadcastPairingMessage", "Lkotlinx/coroutines/Job;", "broadcastPayloadOnSocket", "", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "address", "Ljava/net/InetSocketAddress;", "socket", "Ljava/net/DatagramSocket;", "getLocalBroadcastAddresses", "", "Ljava/net/InetAddress;", "handleCustomMessage", "message", "Lcom/disneystreaming/companion/messaging/Message;", "from", "", "handlePairingMessage", "processMessage", "processMessage$companion_release", "register", "channel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "schedulePairingBroadcast", "interval", "", "sendPong", "host", "startUp", "stopScheduledPairingBroadcast", "tearDown", "Companion", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.m.m.d */
/* compiled from: SocketProviderService.kt */
public final class C8504d extends C8491b implements C8484g {

    /* renamed from: n */
    private ScheduledThreadPoolExecutor f18086n;

    /* renamed from: o */
    private ScheduledFuture<?> f18087o;

    /* renamed from: com.disneystreaming.companion.m.m.d$a */
    /* compiled from: SocketProviderService.kt */
    public static final class C8505a {
        private C8505a() {
        }

        public /* synthetic */ C8505a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketProviderService$broadcastPairingMessage$1", mo31053f = "SocketProviderService.kt", mo31054l = {222}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.d$b */
    /* compiled from: SocketProviderService.kt */
    static final class C8506b extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18088X;

        /* renamed from: Y */
        Object f18089Y;

        /* renamed from: Z */
        Object f18090Z;

        /* renamed from: a0 */
        Object f18091a0;

        /* renamed from: b0 */
        Object f18092b0;

        /* renamed from: c0 */
        Object f18093c0;

        /* renamed from: d0 */
        Object f18094d0;

        /* renamed from: e0 */
        Object f18095e0;

        /* renamed from: f0 */
        Object f18096f0;

        /* renamed from: g0 */
        Object f18097g0;

        /* renamed from: h0 */
        Object f18098h0;

        /* renamed from: i0 */
        int f18099i0;

        /* renamed from: j0 */
        final /* synthetic */ C8504d f18100j0;

        /* renamed from: com.disneystreaming.companion.m.m.d$b$a */
        /* compiled from: SocketProviderService.kt */
        static final class C8507a extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: U */
            final /* synthetic */ C8506b f18101U;

            /* renamed from: c */
            final /* synthetic */ Payload f18102c;

            C8507a(Payload payload, C8506b bVar) {
                this.f18102c = payload;
                this.f18101U = bVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                C13303d p = this.f18101U.f18100j0.mo21787p();
                if (p != null) {
                    p.offer(new C8552c(new C8560a(this.f18102c, th), this.f18101U.f18100j0.mo21790s()));
                }
            }
        }

        /* renamed from: com.disneystreaming.companion.m.m.d$b$b */
        /* compiled from: UseCancellable.kt */
        public static final class C8508b extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ Closeable f18103c;

            public C8508b(Closeable closeable, Function1 function1, Payload payload, InetSocketAddress inetSocketAddress, C8506b bVar) {
                this.f18103c = closeable;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                Closeable closeable = this.f18103c;
                if (closeable != null) {
                    closeable.close();
                }
            }
        }

        C8506b(C8504d dVar, C12683c cVar) {
            this.f18100j0 = dVar;
            super(2, cVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(11:14|17|18|20|21|(1:23)(1:24)|25|26|(1:28)|(1:30)(5:31|32|49|12|(1:50)(0))|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0156, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x015f, code lost:
            r0 = e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x016d  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x018b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo5580a(java.lang.Object r24) {
            /*
                r23 = this;
                r1 = r23
                java.lang.Object r2 = kotlin.p573a0.p574h.C12700d.m39820a()
                int r0 = r1.f18099i0
                r3 = 1
                if (r0 == 0) goto L_0x004c
                if (r0 != r3) goto L_0x0044
                java.lang.Object r0 = r1.f18098h0
                com.disneystreaming.companion.m.m.d$b r0 = (com.disneystreaming.companion.p352m.p353m.C8504d.C8506b) r0
                java.lang.Object r0 = r1.f18097g0
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                java.lang.Object r0 = r1.f18096f0
                java.io.Closeable r0 = (java.io.Closeable) r0
                java.lang.Object r0 = r1.f18095e0
                java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
                java.lang.Object r0 = r1.f18094d0
                r4 = r0
                com.disneystreaming.companion.messaging.Payload r4 = (com.disneystreaming.companion.messaging.Payload) r4
                java.lang.Object r0 = r1.f18093c0
                java.net.InetAddress r0 = (java.net.InetAddress) r0
                java.lang.Object r0 = r1.f18091a0
                r5 = r0
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r0 = r1.f18090Z
                r6 = r0
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.lang.Object r0 = r1.f18089Y
                r7 = r0
                kotlinx.coroutines.e0 r7 = (kotlinx.coroutines.C13233e0) r7
                kotlin.C12903o.m40241a(r24)     // Catch:{ Exception -> 0x003c }
                r17 = r7
                goto L_0x0150
            L_0x003c:
                r0 = move-exception
                r13 = r2
                r12 = r6
                r17 = r7
                r2 = r1
                goto L_0x0165
            L_0x0044:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x004c:
                kotlin.C12903o.m40241a(r24)
                kotlinx.coroutines.e0 r0 = r1.f18088X
                com.disneystreaming.companion.m.m.d r4 = r1.f18100j0
                java.util.List r4 = r4.m24687u()
                java.util.Iterator r5 = r4.iterator()
                r13 = r2
                r12 = r4
                r4 = r0
                r2 = r1
            L_0x005f:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x018b
                java.lang.Object r0 = r5.next()
                r6 = r0
                java.net.InetAddress r6 = (java.net.InetAddress) r6
                com.disneystreaming.companion.messaging.Payload r11 = new com.disneystreaming.companion.messaging.Payload
                com.disneystreaming.companion.messaging.MessageType$b r15 = com.disneystreaming.companion.messaging.MessageType.C8546b.f18236a
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 62
                r22 = 0
                r14 = r11
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
                com.disneystreaming.companion.m.m.d r7 = r2.f18100j0     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.configuration.CompanionConfiguration r7 = r7.mo21825l()     // Catch:{ Exception -> 0x0161 }
                java.lang.String r7 = r7.getPeerId()     // Catch:{ Exception -> 0x0161 }
                r11.setPeerId(r7)     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.m.m.d r7 = r2.f18100j0     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.configuration.CompanionConfiguration r7 = r7.mo21825l()     // Catch:{ Exception -> 0x0161 }
                java.lang.String r7 = r7.getAppId()     // Catch:{ Exception -> 0x0161 }
                r11.setAppId(r7)     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.m.m.d r7 = r2.f18100j0     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.configuration.CompanionConfiguration r7 = r7.mo21825l()     // Catch:{ Exception -> 0x0161 }
                java.lang.String r7 = r7.getDeviceName()     // Catch:{ Exception -> 0x0161 }
                r11.setDeviceName(r7)     // Catch:{ Exception -> 0x0161 }
                java.lang.String r7 = "publicKey"
                com.disneystreaming.companion.m.m.d r8 = r2.f18100j0     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.k.a r8 = r8.mo21786o()     // Catch:{ Exception -> 0x0161 }
                java.lang.String r8 = r8.mo21720a()     // Catch:{ Exception -> 0x0161 }
                kotlin.Pair r7 = kotlin.C12907r.m40244a(r7, r8)     // Catch:{ Exception -> 0x0161 }
                java.util.Map r7 = kotlin.p590y.C13170i0.m40332a(r7)     // Catch:{ Exception -> 0x0161 }
                r11.setContext(r7)     // Catch:{ Exception -> 0x0161 }
                java.net.InetSocketAddress r14 = new java.net.InetSocketAddress     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.m.m.d r7 = r2.f18100j0     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.m.m.c r7 = r7.mo21827n()     // Catch:{ Exception -> 0x0161 }
                int r7 = r7.mo21799b()     // Catch:{ Exception -> 0x0161 }
                r14.<init>(r6, r7)     // Catch:{ Exception -> 0x0161 }
                java.net.DatagramSocket r15 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x0161 }
                r15.<init>()     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.m.m.d$b$a r10 = new com.disneystreaming.companion.m.m.d$b$a     // Catch:{ Exception -> 0x0161 }
                r10.<init>(r11, r2)     // Catch:{ Exception -> 0x0161 }
                r2.f18089Y = r4     // Catch:{ Exception -> 0x0161 }
                r2.f18090Z = r12     // Catch:{ Exception -> 0x0161 }
                r2.f18091a0 = r5     // Catch:{ Exception -> 0x0161 }
                r2.f18092b0 = r0     // Catch:{ Exception -> 0x0161 }
                r2.f18093c0 = r6     // Catch:{ Exception -> 0x0161 }
                r2.f18094d0 = r11     // Catch:{ Exception -> 0x0161 }
                r2.f18095e0 = r14     // Catch:{ Exception -> 0x0161 }
                r2.f18096f0 = r15     // Catch:{ Exception -> 0x0161 }
                r2.f18097g0 = r10     // Catch:{ Exception -> 0x0161 }
                r2.f18098h0 = r2     // Catch:{ Exception -> 0x0161 }
                r2.f18099i0 = r3     // Catch:{ Exception -> 0x0161 }
                kotlinx.coroutines.i r0 = new kotlinx.coroutines.i     // Catch:{ Exception -> 0x0161 }
                kotlin.a0.c r6 = kotlin.p573a0.p574h.C12697c.m39816a(r2)     // Catch:{ Exception -> 0x0161 }
                r0.<init>(r6, r3)     // Catch:{ Exception -> 0x0161 }
                com.disneystreaming.companion.m.m.d$b$b r9 = new com.disneystreaming.companion.m.m.d$b$b     // Catch:{ Exception -> 0x0161 }
                r6 = r9
                r7 = r15
                r8 = r10
                r3 = r9
                r9 = r11
                r1 = r10
                r10 = r14
                r17 = r4
                r4 = r11
                r11 = r2
                r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x015f }
                r0.mo34385a(r3)     // Catch:{ Exception -> 0x015f }
                com.disneystreaming.companion.m.m.d r3 = r2.f18100j0     // Catch:{ all -> 0x0156 }
                r3.m24684a(r4, r14, r15)     // Catch:{ all -> 0x0156 }
                com.disneystreaming.companion.m.m.d r3 = r2.f18100j0     // Catch:{ all -> 0x0156 }
                kotlinx.coroutines.j2.d r3 = r3.mo21787p()     // Catch:{ all -> 0x0156 }
                r6 = 0
                if (r3 == 0) goto L_0x0136
                com.disneystreaming.companion.messaging.MessagingEvent$b r7 = new com.disneystreaming.companion.messaging.MessagingEvent$b     // Catch:{ all -> 0x0156 }
                java.lang.String r8 = r14.getHostName()     // Catch:{ all -> 0x0156 }
                java.lang.String r9 = "address.hostName"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r9)     // Catch:{ all -> 0x0156 }
                com.disneystreaming.companion.m.m.d r9 = r2.f18100j0     // Catch:{ all -> 0x0156 }
                com.disneystreaming.companion.m.l r9 = r9.mo21790s()     // Catch:{ all -> 0x0156 }
                r7.<init>(r4, r8, r9)     // Catch:{ all -> 0x0156 }
                boolean r3 = r3.offer(r7)     // Catch:{ all -> 0x0156 }
                java.lang.Boolean r3 = kotlin.p573a0.p575i.p576a.C12702b.m39828a(r3)     // Catch:{ all -> 0x0156 }
                goto L_0x0137
            L_0x0136:
                r3 = r6
            L_0x0137:
                kotlin.p580c0.C12724b.m39863a(r15, r6)     // Catch:{ Exception -> 0x015f }
                r0.mo34384a(r3, r1)     // Catch:{ Exception -> 0x015f }
                java.lang.Object r0 = r0.mo34396e()     // Catch:{ Exception -> 0x015f }
                java.lang.Object r1 = kotlin.p573a0.p574h.C12700d.m39820a()     // Catch:{ Exception -> 0x015f }
                if (r0 != r1) goto L_0x014a
                kotlin.p573a0.p575i.p576a.C12708h.m39847c(r2)     // Catch:{ Exception -> 0x015f }
            L_0x014a:
                if (r0 != r13) goto L_0x014d
                return r13
            L_0x014d:
                r1 = r2
                r6 = r12
                r2 = r13
            L_0x0150:
                r13 = r2
                r12 = r6
                r4 = r17
                r2 = r1
                goto L_0x0186
            L_0x0156:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x0159 }
            L_0x0159:
                r0 = move-exception
                r3 = r0
                kotlin.p580c0.C12724b.m39863a(r15, r1)     // Catch:{ Exception -> 0x015f }
                throw r3     // Catch:{ Exception -> 0x015f }
            L_0x015f:
                r0 = move-exception
                goto L_0x0165
            L_0x0161:
                r0 = move-exception
                r17 = r4
                r4 = r11
            L_0x0165:
                com.disneystreaming.companion.m.m.d r1 = r2.f18100j0
                kotlinx.coroutines.j2.d r1 = r1.mo21787p()
                if (r1 == 0) goto L_0x0184
                com.disneystreaming.companion.messaging.MessagingEvent$c r3 = new com.disneystreaming.companion.messaging.MessagingEvent$c
                com.disneystreaming.companion.messaging.MessagingEventError$a r6 = new com.disneystreaming.companion.messaging.MessagingEventError$a
                r6.<init>(r4, r0)
                com.disneystreaming.companion.m.m.d r0 = r2.f18100j0
                com.disneystreaming.companion.m.l r0 = r0.mo21790s()
                r3.<init>(r6, r0)
                boolean r0 = r1.offer(r3)
                kotlin.p573a0.p575i.p576a.C12702b.m39828a(r0)
            L_0x0184:
                r4 = r17
            L_0x0186:
                r3 = 1
                r1 = r23
                goto L_0x005f
            L_0x018b:
                kotlin.v r0 = kotlin.C13145v.f29587a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.p352m.p353m.C8504d.C8506b.mo5580a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8506b bVar = new C8506b(this.f18100j0, cVar);
            bVar.f18088X = (C13233e0) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8506b) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketProviderService$handleCustomMessage$1", mo31053f = "SocketProviderService.kt", mo31054l = {120}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.d$c */
    /* compiled from: SocketProviderService.kt */
    static final class C8509c extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18104X;

        /* renamed from: Y */
        Object f18105Y;

        /* renamed from: Z */
        int f18106Z;

        /* renamed from: a0 */
        final /* synthetic */ C8504d f18107a0;

        /* renamed from: b0 */
        final /* synthetic */ String f18108b0;

        @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketProviderService$handleCustomMessage$1$1", mo31053f = "SocketProviderService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
        /* renamed from: com.disneystreaming.companion.m.m.d$c$a */
        /* compiled from: SocketProviderService.kt */
        static final class C8510a extends C12714m implements Function2<C13233e0, C12683c<? super Boolean>, Object> {

            /* renamed from: X */
            private C13233e0 f18109X;

            /* renamed from: Y */
            int f18110Y;

            /* renamed from: Z */
            final /* synthetic */ C8509c f18111Z;

            C8510a(C8509c cVar, C12683c cVar2) {
                this.f18111Z = cVar;
                super(2, cVar2);
            }

            /* renamed from: a */
            public final Object mo5580a(Object obj) {
                C12700d.m39820a();
                if (this.f18110Y == 0) {
                    C12903o.m40241a(obj);
                    this.f18111Z.f18107a0.mo21786o().mo21721a(this.f18111Z.f18108b0);
                    return C12702b.m39828a(this.f18111Z.f18107a0.mo21824k().add(this.f18111Z.f18108b0));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: a */
            public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
                C8510a aVar = new C8510a(this.f18111Z, cVar);
                aVar.f18109X = (C13233e0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C8510a) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
            }
        }

        C8509c(C8504d dVar, String str, C12683c cVar) {
            this.f18107a0 = dVar;
            this.f18108b0 = str;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18106Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18104X;
                C13419z0 r = this.f18107a0.mo21789r();
                C8510a aVar = new C8510a(this, null);
                this.f18105Y = e0Var;
                this.f18106Z = 1;
                if (C13227d.m40667a(r, aVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18105Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8509c cVar2 = new C8509c(this.f18107a0, this.f18108b0, cVar);
            cVar2.f18104X = (C13233e0) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8509c) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketProviderService$handlePairingMessage$1", mo31053f = "SocketProviderService.kt", mo31054l = {99}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.d$d */
    /* compiled from: SocketProviderService.kt */
    static final class C8511d extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18112X;

        /* renamed from: Y */
        Object f18113Y;

        /* renamed from: Z */
        int f18114Z;

        /* renamed from: a0 */
        final /* synthetic */ C8504d f18115a0;

        /* renamed from: b0 */
        final /* synthetic */ String f18116b0;

        @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketProviderService$handlePairingMessage$1$1", mo31053f = "SocketProviderService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
        /* renamed from: com.disneystreaming.companion.m.m.d$d$a */
        /* compiled from: SocketProviderService.kt */
        static final class C8512a extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

            /* renamed from: X */
            private C13233e0 f18117X;

            /* renamed from: Y */
            int f18118Y;

            /* renamed from: Z */
            final /* synthetic */ C8511d f18119Z;

            C8512a(C8511d dVar, C12683c cVar) {
                this.f18119Z = dVar;
                super(2, cVar);
            }

            /* renamed from: a */
            public final Object mo5580a(Object obj) {
                C12700d.m39820a();
                if (this.f18118Y == 0) {
                    C12903o.m40241a(obj);
                    this.f18119Z.f18115a0.mo21786o().mo21721a(this.f18119Z.f18116b0);
                    return C13145v.f29587a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: a */
            public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
                C8512a aVar = new C8512a(this.f18119Z, cVar);
                aVar.f18117X = (C13233e0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C8512a) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
            }
        }

        C8511d(C8504d dVar, String str, C12683c cVar) {
            this.f18115a0 = dVar;
            this.f18116b0 = str;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18114Z;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18112X;
                C13419z0 r = this.f18115a0.mo21789r();
                C8512a aVar = new C8512a(this, null);
                this.f18113Y = e0Var;
                this.f18114Z = 1;
                if (C13227d.m40667a(r, aVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C13233e0 e0Var2 = (C13233e0) this.f18113Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8511d dVar = new C8511d(this.f18115a0, this.f18116b0, cVar);
            dVar.f18112X = (C13233e0) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8511d) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    /* renamed from: com.disneystreaming.companion.m.m.d$e */
    /* compiled from: SocketProviderService.kt */
    static final class C8513e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C8504d f18120c;

        C8513e(C8504d dVar) {
            this.f18120c = dVar;
        }

        public final void run() {
            this.f18120c.mo21767g();
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketProviderService$sendPong$1", mo31053f = "SocketProviderService.kt", mo31054l = {162}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.d$f */
    /* compiled from: SocketProviderService.kt */
    static final class C8514f extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18121X;

        /* renamed from: Y */
        Object f18122Y;

        /* renamed from: Z */
        Object f18123Z;

        /* renamed from: a0 */
        int f18124a0;

        /* renamed from: b0 */
        final /* synthetic */ C8504d f18125b0;

        /* renamed from: c0 */
        final /* synthetic */ String f18126c0;

        C8514f(C8504d dVar, String str, C12683c cVar) {
            this.f18125b0 = dVar;
            this.f18126c0 = str;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            Object a = C12700d.m39820a();
            int i = this.f18124a0;
            if (i == 0) {
                C12903o.m40241a(obj);
                C13233e0 e0Var = this.f18121X;
                Payload payload = new Payload(C8548d.f18238a, null, null, null, null, null, 62, null);
                C8504d dVar = this.f18125b0;
                String str = this.f18126c0;
                this.f18122Y = e0Var;
                this.f18123Z = payload;
                this.f18124a0 = 1;
                if (dVar.mo21772a(payload, str, (C12683c<? super C13145v>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                Payload payload2 = (Payload) this.f18123Z;
                C13233e0 e0Var2 = (C13233e0) this.f18122Y;
                C12903o.m40241a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8514f fVar = new C8514f(this.f18125b0, this.f18126c0, cVar);
            fVar.f18121X = (C13233e0) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8514f) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketProviderService$startUp$1", mo31053f = "SocketProviderService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.d$g */
    /* compiled from: SocketProviderService.kt */
    static final class C8515g extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18127X;

        /* renamed from: Y */
        int f18128Y;

        /* renamed from: Z */
        final /* synthetic */ C8504d f18129Z;

        C8515g(C8504d dVar, C12683c cVar) {
            this.f18129Z = dVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18128Y == 0) {
                C12903o.m40241a(obj);
                this.f18129Z.mo21824k().clear();
                this.f18129Z.mo21786o().mo21725c();
                this.f18129Z.mo21768e();
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8515g gVar = new C8515g(this.f18129Z, cVar);
            gVar.f18127X = (C13233e0) obj;
            return gVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8515g) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.SocketProviderService$tearDown$1", mo31053f = "SocketProviderService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.d$h */
    /* compiled from: SocketProviderService.kt */
    static final class C8516h extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18130X;

        /* renamed from: Y */
        int f18131Y;

        /* renamed from: Z */
        final /* synthetic */ C8504d f18132Z;

        C8516h(C8504d dVar, C12683c cVar) {
            this.f18132Z = dVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18131Y == 0) {
                C12903o.m40241a(obj);
                this.f18132Z.mo21769f();
                this.f18132Z.mo21786o().mo21724b();
                this.f18132Z.mo21824k().clear();
                this.f18132Z.mo21789r().close();
                C13324k1 q = this.f18132Z.mo21788q();
                if (q != null) {
                    C13325a.m40950a(q, null, 1, null);
                }
                C13303d p = this.f18132Z.mo21787p();
                if (p != null) {
                    C12702b.m39828a(p.offer(new C8559j(this.f18132Z.mo21790s())));
                }
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8516h hVar = new C8516h(this.f18132Z, cVar);
            hVar.f18130X = (C13233e0) obj;
            return hVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8516h) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    static {
        new C8505a(null);
    }

    public C8504d(CompanionConfiguration companionConfiguration) {
        super(companionConfiguration);
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        if (newScheduledThreadPool != null) {
            this.f18086n = (ScheduledThreadPoolExecutor) newScheduledThreadPool;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.concurrent.ScheduledThreadPoolExecutor");
    }

    /* renamed from: e */
    private final void m24686e(Message message, String str) {
        mo21777a(message.getPayload(), str);
        boolean b = mo21784b(message, str);
        if (b) {
            C13303d p = mo21787p();
            if (p != null) {
                p.offer(new C8557h(str, message.getPayload(), mo21790s()));
            }
        } else if (!b) {
            C13232e.m40677a(mo21826m(), null, null, new C8511d(this, str, null), 3, null);
            C13303d p2 = mo21787p();
            if (p2 != null) {
                p2.offer(new C8553d(str, mo21790s()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final List<InetAddress> m24687u() {
        String str;
        ArrayList arrayList = new ArrayList();
        Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
        Intrinsics.checkReturnedValueIsNotNull((Object) networkInterfaces, "NetworkInterface.getNetworkInterfaces()");
        ArrayList list = Collections.list(networkInterfaces);
        Intrinsics.checkReturnedValueIsNotNull((Object) list, "java.util.Collections.list(this)");
        ArrayList<NetworkInterface> arrayList2 = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            NetworkInterface networkInterface = (NetworkInterface) next;
            Intrinsics.checkReturnedValueIsNotNull((Object) networkInterface, str);
            if (!networkInterface.isLoopback() || networkInterface.isUp()) {
                arrayList2.add(next);
            }
        }
        for (NetworkInterface networkInterface2 : arrayList2) {
            Intrinsics.checkReturnedValueIsNotNull((Object) networkInterface2, "iface");
            List<InterfaceAddress> interfaceAddresses = networkInterface2.getInterfaceAddresses();
            Intrinsics.checkReturnedValueIsNotNull((Object) interfaceAddresses, "iface.interfaceAddresses");
            ArrayList<InetAddress> arrayList3 = new ArrayList<>();
            for (InterfaceAddress interfaceAddress : interfaceAddresses) {
                Intrinsics.checkReturnedValueIsNotNull((Object) interfaceAddress, str);
                InetAddress broadcast = interfaceAddress.getBroadcast();
                if (broadcast != null) {
                    arrayList3.add(broadcast);
                }
            }
            for (InetAddress add : arrayList3) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public C13324k1 mo21774b() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8516h(this, null), 2, null);
    }

    /* renamed from: d */
    public C13324k1 mo21775d() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8515g(this, null), 2, null);
    }

    /* renamed from: g */
    public C13324k1 mo21767g() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8506b(this, null), 2, null);
    }

    /* renamed from: h */
    public void mo21766h() {
        ScheduledFuture<?> scheduledFuture = this.f18087o;
        if (!(scheduledFuture != null)) {
            scheduledFuture = null;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: d */
    private final void m24685d(Message message, String str) {
        boolean c = mo21785c(message, str);
        if (c) {
            C13303d p = mo21787p();
            if (p != null) {
                p.offer(new C8555f(message, str, mo21790s()));
            }
        } else if (!c) {
            C8476c.f18029a.mo21760a("Signature is invalid", (Throwable) null, "SocketProviderService");
            C13232e.m40677a(mo21826m(), null, null, new C8509c(this, str, null), 3, null);
        }
    }

    /* renamed from: b */
    public C13324k1 mo21804b(String str) {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8514f(this, str, null), 2, null);
    }

    /* renamed from: a */
    public void mo21773a(C13303d<MessagingEvent> dVar) {
        mo21783b(dVar);
    }

    /* renamed from: a */
    public void mo21776a(Message message, String str) {
        if (message.getVersion() == 1 && !(!Intrinsics.areEqual((Object) message.getPayload().getAppId(), (Object) mo21825l().getAppId()))) {
            MessageType messageType = message.getPayload().getMessageType();
            if (messageType instanceof C8546b) {
                m24686e(message, str);
            } else if (messageType instanceof C8545a) {
                m24685d(message, str);
            } else if (messageType instanceof C8547c) {
                mo21804b(str);
            }
        }
    }

    /* renamed from: a */
    public void mo21765a(long j) {
        this.f18087o = this.f18086n.scheduleAtFixedRate(new C8513e(this), j, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m24684a(Payload payload, InetSocketAddress inetSocketAddress, DatagramSocket datagramSocket) {
        String a = C8569d.f18269a.mo21941a(new Message(mo21827n().mo21800c(), null, payload));
        Charset charset = C12801c.f29474a;
        if (a != null) {
            byte[] bytes = a.getBytes(charset);
            Intrinsics.checkReturnedValueIsNotNull((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetSocketAddress);
            datagramSocket.setBroadcast(true);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
