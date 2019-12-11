package com.disneystreaming.companion.p352m.p353m;

import com.disneystreaming.companion.configuration.CompanionConfiguration;
import com.disneystreaming.companion.messaging.C8566a;
import com.disneystreaming.companion.messaging.EncryptedMessage;
import com.disneystreaming.companion.messaging.Message;
import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.messaging.MessagingEvent.C8552c;
import com.disneystreaming.companion.messaging.MessagingEvent.C8554e;
import com.disneystreaming.companion.messaging.MessagingEvent.C8558i;
import com.disneystreaming.companion.messaging.MessagingEventError.C8561b;
import com.disneystreaming.companion.messaging.MessagingEventError.C8562c;
import com.disneystreaming.companion.messaging.MessagingEventError.C8563d;
import com.disneystreaming.companion.messaging.MessagingEventError.C8564e;
import com.disneystreaming.companion.messaging.MessagingEventError.C8565f;
import com.disneystreaming.companion.messaging.Payload;
import com.disneystreaming.companion.p348k.C8456a;
import com.disneystreaming.companion.p348k.p349b.C8457a;
import com.disneystreaming.companion.p351l.C8476c;
import com.disneystreaming.companion.p352m.C8485h;
import com.disneystreaming.companion.p352m.C8487j;
import com.disneystreaming.companion.p352m.C8489l;
import com.disneystreaming.companion.p352m.p353m.p354g.C8544a;
import java.io.Closeable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C12903o;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12706f;
import kotlin.p573a0.p575i.p576a.C12714m;
import kotlinx.coroutines.C13224c1;
import kotlinx.coroutines.C13227d;
import kotlinx.coroutines.C13233e0;
import kotlinx.coroutines.C13324k1;
import kotlinx.coroutines.C13419z0;
import kotlinx.coroutines.p592j2.C13303d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001OB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010(\u001a\u00020\u0019H\u0016J\u001d\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0010¢\u0006\u0002\b/J\u0015\u00100\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0010¢\u0006\u0002\b1J%\u00102\u001a\u00020*2\u0006\u00103\u001a\u0002042\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0010¢\u0006\u0002\b5J\u0015\u00106\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0010¢\u0006\u0002\b7J\r\u00108\u001a\u00020*H\u0010¢\u0006\u0002\b9J\u0018\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020,H\u0002J\u001d\u0010>\u001a\u00020*2\u0006\u0010;\u001a\u00020?2\u0006\u0010@\u001a\u00020,H\u0010¢\u0006\u0002\bAJ\u001d\u0010B\u001a\u00020*2\u0006\u00103\u001a\u0002042\u0006\u0010=\u001a\u00020,H\u0000¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020FH\u0002J!\u0010G\u001a\u00020*2\u0006\u00103\u001a\u0002042\u0006\u0010+\u001a\u00020,H@ø\u0001\u0000¢\u0006\u0002\u0010HJ\b\u0010I\u001a\u00020\u0019H\u0002J\b\u0010J\u001a\u00020\u0019H\u0016J\u001d\u0010K\u001a\u00020\u00152\u0006\u0010;\u001a\u00020?2\u0006\u0010=\u001a\u00020,H\u0000¢\u0006\u0002\bLJ\u001d\u0010M\u001a\u00020\u00152\u0006\u0010;\u001a\u00020?2\u0006\u0010=\u001a\u00020,H\u0000¢\u0006\u0002\bNR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, mo31007d2 = {"Lcom/disneystreaming/companion/service/socket/NetSocketService;", "Lcom/disneystreaming/companion/service/socket/SocketService;", "Lcom/disneystreaming/companion/service/ReceiverService;", "Lcom/disneystreaming/companion/service/SenderService;", "config", "Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "(Lcom/disneystreaming/companion/configuration/CompanionConfiguration;)V", "encryptionProvider", "Lcom/disneystreaming/companion/encryption/EncryptionProvider;", "getEncryptionProvider", "()Lcom/disneystreaming/companion/encryption/EncryptionProvider;", "setEncryptionProvider", "(Lcom/disneystreaming/companion/encryption/EncryptionProvider;)V", "events", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "getEvents$companion_release", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "setEvents$companion_release", "(Lkotlinx/coroutines/channels/BroadcastChannel;)V", "isListening", "", "listenerSocket", "Ljava/net/ServerSocket;", "messageJob", "Lkotlinx/coroutines/Job;", "getMessageJob$companion_release", "()Lkotlinx/coroutines/Job;", "setMessageJob$companion_release", "(Lkotlinx/coroutines/Job;)V", "propertyContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getPropertyContext$companion_release", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "type", "Lcom/disneystreaming/companion/service/ServiceType;", "getType", "()Lcom/disneystreaming/companion/service/ServiceType;", "setType", "(Lcom/disneystreaming/companion/service/ServiceType;)V", "listenForMessages", "notifyErrorConnect", "", "to", "", "error", "", "notifyErrorConnect$companion_release", "notifyErrorReceive", "notifyErrorReceive$companion_release", "notifyErrorSend", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "notifyErrorSend$companion_release", "notifyErrorStartUp", "notifyErrorStartUp$companion_release", "notifyMessageListenerStarted", "notifyMessageListenerStarted$companion_release", "processEncryptedMessage", "message", "Lcom/disneystreaming/companion/messaging/EncryptedMessage;", "host", "processMessage", "Lcom/disneystreaming/companion/messaging/Message;", "from", "processMessage$companion_release", "processPairingPayload", "processPairingPayload$companion_release", "receiveOnSocket", "socket", "Ljava/net/Socket;", "send", "(Lcom/disneystreaming/companion/messaging/Payload;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startMessageListener", "stopListeningForMessages", "verify", "verify$companion_release", "verifyMessage", "verifyMessage$companion_release", "Companion", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.m.m.b */
/* compiled from: NetSocketService.kt */
public class C8491b extends C8542f implements C8485h, C8487j {

    /* renamed from: g */
    private C8489l f18041g = C8489l.SOCKET;

    /* renamed from: h */
    private C8456a f18042h = C8457a.f17988i.mo21728a();

    /* renamed from: i */
    private C13303d<MessagingEvent> f18043i;

    /* renamed from: j */
    private C13324k1 f18044j;

    /* renamed from: k */
    private final C13419z0 f18045k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f18046l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ServerSocket f18047m;

    /* renamed from: com.disneystreaming.companion.m.m.b$a */
    /* compiled from: NetSocketService.kt */
    public static final class C8492a {
        private C8492a() {
        }

        public /* synthetic */ C8492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.NetSocketService$listenForMessages$1", mo31053f = "NetSocketService.kt", mo31054l = {}, mo31055m = "invokeSuspend")
    /* renamed from: com.disneystreaming.companion.m.m.b$b */
    /* compiled from: NetSocketService.kt */
    static final class C8493b extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18048X;

        /* renamed from: Y */
        int f18049Y;

        /* renamed from: Z */
        final /* synthetic */ C8491b f18050Z;

        C8493b(C8491b bVar, C12683c cVar) {
            this.f18050Z = bVar;
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            C12700d.m39820a();
            if (this.f18049Y == 0) {
                C12903o.m40241a(obj);
                C8491b bVar = this.f18050Z;
                bVar.mo21781a(bVar.mo21810u());
                return C13145v.f29587a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8493b bVar = new C8493b(this.f18050Z, cVar);
            bVar.f18048X = (C13233e0) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8493b) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.NetSocketService$send$2", mo31053f = "NetSocketService.kt", mo31054l = {281}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.b$c */
    /* compiled from: NetSocketService.kt */
    static final class C8494c extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18051X;

        /* renamed from: Y */
        Object f18052Y;

        /* renamed from: Z */
        Object f18053Z;

        /* renamed from: a0 */
        Object f18054a0;

        /* renamed from: b0 */
        Object f18055b0;

        /* renamed from: c0 */
        int f18056c0;

        /* renamed from: d0 */
        final /* synthetic */ C8491b f18057d0;

        /* renamed from: e0 */
        final /* synthetic */ String f18058e0;

        /* renamed from: f0 */
        final /* synthetic */ Payload f18059f0;

        /* renamed from: com.disneystreaming.companion.m.m.b$c$a */
        /* compiled from: NetSocketService.kt */
        static final class C8495a extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C8494c f18060c;

            C8495a(C8494c cVar) {
                this.f18060c = cVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                C8494c cVar = this.f18060c;
                cVar.f18057d0.mo21778a(cVar.f18059f0, cVar.f18058e0, th);
            }
        }

        /* renamed from: com.disneystreaming.companion.m.m.b$c$b */
        /* compiled from: UseCancellable.kt */
        public static final class C8496b extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ Closeable f18061c;

            public C8496b(Closeable closeable, Function1 function1, C8494c cVar) {
                this.f18061c = closeable;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                Closeable closeable = this.f18061c;
                if (closeable != null) {
                    closeable.close();
                }
            }
        }

        C8494c(C8491b bVar, String str, Payload payload, C12683c cVar) {
            this.f18057d0 = bVar;
            this.f18058e0 = str;
            this.f18059f0 = payload;
            super(2, cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fb, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            kotlin.p580c0.C12724b.m39863a(r1, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo5580a(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.p573a0.p574h.C12700d.m39820a()
                int r1 = r9.f18056c0
                r2 = 1
                if (r1 == 0) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                java.lang.Object r0 = r9.f18055b0
                com.disneystreaming.companion.m.m.b$c r0 = (com.disneystreaming.companion.p352m.p353m.C8491b.C8494c) r0
                java.lang.Object r0 = r9.f18054a0
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                java.lang.Object r0 = r9.f18053Z
                java.io.Closeable r0 = (java.io.Closeable) r0
                java.lang.Object r0 = r9.f18052Y
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C13233e0) r0
                kotlin.C12903o.m40241a(r10)     // Catch:{ Exception -> 0x0100 }
                goto L_0x0108
            L_0x0020:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0028:
                kotlin.C12903o.m40241a(r10)
                kotlinx.coroutines.e0 r10 = r9.f18051X
                com.disneystreaming.companion.m.m.b r1 = r9.f18057d0
                java.util.List r1 = r1.mo21824k()
                java.lang.String r3 = r9.f18058e0
                boolean r1 = r1.contains(r3)
                if (r1 != 0) goto L_0x0108
                java.net.Socket r1 = new java.net.Socket     // Catch:{ Exception -> 0x0100 }
                r1.<init>()     // Catch:{ Exception -> 0x0100 }
                com.disneystreaming.companion.m.m.b$c$a r3 = new com.disneystreaming.companion.m.m.b$c$a     // Catch:{ Exception -> 0x0100 }
                r3.<init>(r9)     // Catch:{ Exception -> 0x0100 }
                r9.f18052Y = r10     // Catch:{ Exception -> 0x0100 }
                r9.f18053Z = r1     // Catch:{ Exception -> 0x0100 }
                r9.f18054a0 = r3     // Catch:{ Exception -> 0x0100 }
                r9.f18055b0 = r9     // Catch:{ Exception -> 0x0100 }
                r9.f18056c0 = r2     // Catch:{ Exception -> 0x0100 }
                kotlinx.coroutines.i r10 = new kotlinx.coroutines.i     // Catch:{ Exception -> 0x0100 }
                kotlin.a0.c r4 = kotlin.p573a0.p574h.C12697c.m39816a(r9)     // Catch:{ Exception -> 0x0100 }
                r10.<init>(r4, r2)     // Catch:{ Exception -> 0x0100 }
                com.disneystreaming.companion.m.m.b$c$b r2 = new com.disneystreaming.companion.m.m.b$c$b     // Catch:{ Exception -> 0x0100 }
                r2.<init>(r1, r3, r9)     // Catch:{ Exception -> 0x0100 }
                r10.mo34385a(r2)     // Catch:{ Exception -> 0x0100 }
                r2 = 0
                java.net.InetSocketAddress r4 = new java.net.InetSocketAddress     // Catch:{ all -> 0x00f9 }
                java.lang.String r5 = r9.f18058e0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.b r6 = r9.f18057d0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.c r6 = r6.mo21827n()     // Catch:{ all -> 0x00f9 }
                int r6 = r6.mo21798a()     // Catch:{ all -> 0x00f9 }
                r4.<init>(r5, r6)     // Catch:{ all -> 0x00f9 }
                r1.connect(r4)     // Catch:{ all -> 0x00f9 }
            L_0x0075:
                boolean r4 = r1.isConnected()     // Catch:{ all -> 0x00f9 }
                if (r4 != 0) goto L_0x007c
                goto L_0x0075
            L_0x007c:
                boolean r4 = r1.isConnected()     // Catch:{ all -> 0x00f9 }
                if (r4 == 0) goto L_0x00e1
                com.disneystreaming.companion.messaging.Payload r4 = r9.f18059f0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.b r5 = r9.f18057d0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.configuration.CompanionConfiguration r5 = r5.mo21825l()     // Catch:{ all -> 0x00f9 }
                java.lang.String r5 = r5.getAppId()     // Catch:{ all -> 0x00f9 }
                r4.setAppId(r5)     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.b r5 = r9.f18057d0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.configuration.CompanionConfiguration r5 = r5.mo21825l()     // Catch:{ all -> 0x00f9 }
                java.lang.String r5 = r5.getPeerId()     // Catch:{ all -> 0x00f9 }
                r4.setPeerId(r5)     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.b r5 = r9.f18057d0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.configuration.CompanionConfiguration r5 = r5.mo21825l()     // Catch:{ all -> 0x00f9 }
                java.lang.String r5 = r5.getDeviceName()     // Catch:{ all -> 0x00f9 }
                r4.setDeviceName(r5)     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.b r4 = r9.f18057d0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.k.a r4 = r4.mo21786o()     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.messaging.Payload r5 = r9.f18059f0     // Catch:{ all -> 0x00f9 }
                java.lang.String r6 = r9.f18058e0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.messaging.EncryptedMessage r4 = r4.mo21718a(r5, r6)     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.g.a r5 = new com.disneystreaming.companion.m.m.g.a     // Catch:{ all -> 0x00f9 }
                r5.<init>(r1)     // Catch:{ all -> 0x00f9 }
                java.lang.Class<com.disneystreaming.companion.messaging.EncryptedMessage> r6 = com.disneystreaming.companion.messaging.EncryptedMessage.class
                r5.mo21829a(r6, r4)     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.b r4 = r9.f18057d0     // Catch:{ all -> 0x00f9 }
                kotlinx.coroutines.j2.d r4 = r4.mo21787p()     // Catch:{ all -> 0x00f9 }
                if (r4 == 0) goto L_0x00e1
                com.disneystreaming.companion.messaging.MessagingEvent$g r5 = new com.disneystreaming.companion.messaging.MessagingEvent$g     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.messaging.Payload r6 = r9.f18059f0     // Catch:{ all -> 0x00f9 }
                java.lang.String r7 = r9.f18058e0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.m.b r8 = r9.f18057d0     // Catch:{ all -> 0x00f9 }
                com.disneystreaming.companion.m.l r8 = r8.mo21790s()     // Catch:{ all -> 0x00f9 }
                r5.<init>(r6, r7, r8)     // Catch:{ all -> 0x00f9 }
                boolean r4 = r4.offer(r5)     // Catch:{ all -> 0x00f9 }
                kotlin.p573a0.p575i.p576a.C12702b.m39828a(r4)     // Catch:{ all -> 0x00f9 }
            L_0x00e1:
                kotlin.v r4 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x00f9 }
                kotlin.p580c0.C12724b.m39863a(r1, r2)     // Catch:{ Exception -> 0x0100 }
                r10.mo34384a(r4, r3)     // Catch:{ Exception -> 0x0100 }
                java.lang.Object r10 = r10.mo34396e()     // Catch:{ Exception -> 0x0100 }
                java.lang.Object r1 = kotlin.p573a0.p574h.C12700d.m39820a()     // Catch:{ Exception -> 0x0100 }
                if (r10 != r1) goto L_0x00f6
                kotlin.p573a0.p575i.p576a.C12708h.m39847c(r9)     // Catch:{ Exception -> 0x0100 }
            L_0x00f6:
                if (r10 != r0) goto L_0x0108
                return r0
            L_0x00f9:
                r10 = move-exception
                throw r10     // Catch:{ all -> 0x00fb }
            L_0x00fb:
                r0 = move-exception
                kotlin.p580c0.C12724b.m39863a(r1, r10)     // Catch:{ Exception -> 0x0100 }
                throw r0     // Catch:{ Exception -> 0x0100 }
            L_0x0100:
                r10 = move-exception
                com.disneystreaming.companion.m.m.b r0 = r9.f18057d0
                java.lang.String r1 = r9.f18058e0
                r0.mo21779a(r1, r10)
            L_0x0108:
                kotlin.v r10 = kotlin.C13145v.f29587a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.p352m.p353m.C8491b.C8494c.mo5580a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8494c cVar2 = new C8494c(this.f18057d0, this.f18058e0, this.f18059f0, cVar);
            cVar2.f18051X = (C13233e0) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8494c) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.NetSocketService$startMessageListener$1", mo31053f = "NetSocketService.kt", mo31054l = {281}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.b$d */
    /* compiled from: NetSocketService.kt */
    static final class C8497d extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18062X;

        /* renamed from: Y */
        Object f18063Y;

        /* renamed from: Z */
        Object f18064Z;

        /* renamed from: a0 */
        Object f18065a0;

        /* renamed from: b0 */
        Object f18066b0;

        /* renamed from: c0 */
        Object f18067c0;

        /* renamed from: d0 */
        int f18068d0;

        /* renamed from: e0 */
        final /* synthetic */ C8491b f18069e0;

        /* renamed from: com.disneystreaming.companion.m.m.b$d$a */
        /* compiled from: NetSocketService.kt */
        static final class C8498a extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C8497d f18070c;

            C8498a(C8497d dVar) {
                this.f18070c = dVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                if (this.f18070c.f18069e0.f18046l) {
                    this.f18070c.f18069e0.mo21780a(th);
                }
            }
        }

        /* renamed from: com.disneystreaming.companion.m.m.b$d$b */
        /* compiled from: UseCancellable.kt */
        public static final class C8499b extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ Closeable f18071c;

            public C8499b(Closeable closeable, Function1 function1, C8497d dVar) {
                this.f18071c = closeable;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                Closeable closeable = this.f18071c;
                if (closeable != null) {
                    closeable.close();
                }
            }
        }

        C8497d(C8491b bVar, C12683c cVar) {
            this.f18069e0 = bVar;
            super(2, cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            kotlin.p580c0.C12724b.m39863a(r1, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo5580a(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.p573a0.p574h.C12700d.m39820a()
                int r1 = r7.f18068d0
                r2 = 1
                if (r1 == 0) goto L_0x002c
                if (r1 != r2) goto L_0x0024
                java.lang.Object r0 = r7.f18067c0
                com.disneystreaming.companion.m.m.b$d r0 = (com.disneystreaming.companion.p352m.p353m.C8491b.C8497d) r0
                java.lang.Object r0 = r7.f18066b0
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                java.lang.Object r0 = r7.f18065a0
                java.io.Closeable r0 = (java.io.Closeable) r0
                java.lang.Object r0 = r7.f18064Z
                java.net.ServerSocket r0 = (java.net.ServerSocket) r0
                java.lang.Object r0 = r7.f18063Y
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C13233e0) r0
                kotlin.C12903o.m40241a(r8)     // Catch:{ Exception -> 0x00ed }
                goto L_0x00fb
            L_0x0024:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x002c:
                kotlin.C12903o.m40241a(r8)
                kotlinx.coroutines.e0 r8 = r7.f18062X
                com.disneystreaming.companion.l.c r1 = com.disneystreaming.companion.p351l.C8476c.f18029a
                r3 = 0
                java.lang.String r4 = "listenForMessages called"
                java.lang.String r5 = "NetSocketService"
                r1.mo21760a(r4, r3, r5)
                com.disneystreaming.companion.m.m.b r1 = r7.f18069e0
                r1.f18046l = r2
                com.disneystreaming.companion.m.m.b r1 = r7.f18069e0     // Catch:{ Exception -> 0x00ed }
                java.net.ServerSocket r4 = new java.net.ServerSocket     // Catch:{ Exception -> 0x00ed }
                r4.<init>()     // Catch:{ Exception -> 0x00ed }
                r1.f18047m = r4     // Catch:{ Exception -> 0x00ed }
                com.disneystreaming.companion.m.m.b r1 = r7.f18069e0     // Catch:{ Exception -> 0x00ed }
                java.net.ServerSocket r1 = r1.f18047m     // Catch:{ Exception -> 0x00ed }
                if (r1 == 0) goto L_0x0054
                r4 = 1
                goto L_0x0055
            L_0x0054:
                r4 = 0
            L_0x0055:
                java.lang.Boolean r4 = kotlin.p573a0.p575i.p576a.C12702b.m39828a(r4)     // Catch:{ Exception -> 0x00ed }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x00ed }
                if (r4 == 0) goto L_0x0060
                goto L_0x0061
            L_0x0060:
                r1 = r3
            L_0x0061:
                if (r1 == 0) goto L_0x00ea
                com.disneystreaming.companion.m.m.b$d$a r4 = new com.disneystreaming.companion.m.m.b$d$a     // Catch:{ Exception -> 0x00ed }
                r4.<init>(r7)     // Catch:{ Exception -> 0x00ed }
                r7.f18063Y = r8     // Catch:{ Exception -> 0x00ed }
                r7.f18064Z = r1     // Catch:{ Exception -> 0x00ed }
                r7.f18065a0 = r1     // Catch:{ Exception -> 0x00ed }
                r7.f18066b0 = r4     // Catch:{ Exception -> 0x00ed }
                r7.f18067c0 = r7     // Catch:{ Exception -> 0x00ed }
                r7.f18068d0 = r2     // Catch:{ Exception -> 0x00ed }
                kotlinx.coroutines.i r8 = new kotlinx.coroutines.i     // Catch:{ Exception -> 0x00ed }
                kotlin.a0.c r5 = kotlin.p573a0.p574h.C12697c.m39816a(r7)     // Catch:{ Exception -> 0x00ed }
                r8.<init>(r5, r2)     // Catch:{ Exception -> 0x00ed }
                com.disneystreaming.companion.m.m.b$d$b r5 = new com.disneystreaming.companion.m.m.b$d$b     // Catch:{ Exception -> 0x00ed }
                r5.<init>(r1, r4, r7)     // Catch:{ Exception -> 0x00ed }
                r8.mo34385a(r5)     // Catch:{ Exception -> 0x00ed }
                r1.setReuseAddress(r2)     // Catch:{ all -> 0x00e3 }
                java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch:{ all -> 0x00e3 }
                com.disneystreaming.companion.m.m.b r5 = r7.f18069e0     // Catch:{ all -> 0x00e3 }
                com.disneystreaming.companion.m.m.c r5 = r5.mo21827n()     // Catch:{ all -> 0x00e3 }
                int r5 = r5.mo21798a()     // Catch:{ all -> 0x00e3 }
                r2.<init>(r5)     // Catch:{ all -> 0x00e3 }
                r1.bind(r2)     // Catch:{ all -> 0x00e3 }
            L_0x009a:
                boolean r2 = r1.isBound()     // Catch:{ all -> 0x00e3 }
                if (r2 != 0) goto L_0x00a1
                goto L_0x009a
            L_0x00a1:
                com.disneystreaming.companion.m.m.b r2 = r7.f18069e0     // Catch:{ all -> 0x00e3 }
                r2.mo21791t()     // Catch:{ all -> 0x00e3 }
            L_0x00a6:
                com.disneystreaming.companion.m.m.b r2 = r7.f18069e0     // Catch:{ Exception -> 0x00bd }
                boolean r2 = r2.f18046l     // Catch:{ Exception -> 0x00bd }
                if (r2 == 0) goto L_0x00cb
                java.net.Socket r2 = r1.accept()     // Catch:{ Exception -> 0x00bd }
                com.disneystreaming.companion.m.m.b r5 = r7.f18069e0     // Catch:{ Exception -> 0x00bd }
                java.lang.String r6 = "newSocket"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r6)     // Catch:{ Exception -> 0x00bd }
                r5.m24648a(r2)     // Catch:{ Exception -> 0x00bd }
                goto L_0x00a6
            L_0x00bd:
                r2 = move-exception
                com.disneystreaming.companion.m.m.b r5 = r7.f18069e0     // Catch:{ all -> 0x00e3 }
                boolean r5 = r5.f18046l     // Catch:{ all -> 0x00e3 }
                if (r5 == 0) goto L_0x00cb
                com.disneystreaming.companion.m.m.b r5 = r7.f18069e0     // Catch:{ all -> 0x00e3 }
                r5.mo21780a(r2)     // Catch:{ all -> 0x00e3 }
            L_0x00cb:
                kotlin.v r2 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x00e3 }
                kotlin.p580c0.C12724b.m39863a(r1, r3)     // Catch:{ Exception -> 0x00ed }
                r8.mo34384a(r2, r4)     // Catch:{ Exception -> 0x00ed }
                java.lang.Object r8 = r8.mo34396e()     // Catch:{ Exception -> 0x00ed }
                java.lang.Object r1 = kotlin.p573a0.p574h.C12700d.m39820a()     // Catch:{ Exception -> 0x00ed }
                if (r8 != r1) goto L_0x00e0
                kotlin.p573a0.p575i.p576a.C12708h.m39847c(r7)     // Catch:{ Exception -> 0x00ed }
            L_0x00e0:
                if (r8 != r0) goto L_0x00fb
                return r0
            L_0x00e3:
                r8 = move-exception
                throw r8     // Catch:{ all -> 0x00e5 }
            L_0x00e5:
                r0 = move-exception
                kotlin.p580c0.C12724b.m39863a(r1, r8)     // Catch:{ Exception -> 0x00ed }
                throw r0     // Catch:{ Exception -> 0x00ed }
            L_0x00ea:
                kotlin.v r8 = kotlin.C13145v.f29587a     // Catch:{ Exception -> 0x00ed }
                return r8
            L_0x00ed:
                r8 = move-exception
                com.disneystreaming.companion.m.m.b r0 = r7.f18069e0
                boolean r0 = r0.f18046l
                if (r0 == 0) goto L_0x00fb
                com.disneystreaming.companion.m.m.b r0 = r7.f18069e0
                r0.mo21782b(r8)
            L_0x00fb:
                kotlin.v r8 = kotlin.C13145v.f29587a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.p352m.p353m.C8491b.C8497d.mo5580a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8497d dVar = new C8497d(this.f18069e0, cVar);
            dVar.f18062X = (C13233e0) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8497d) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    @C12706f(mo31052c = "com.disneystreaming.companion.service.socket.NetSocketService$stopListeningForMessages$1", mo31053f = "NetSocketService.kt", mo31054l = {281}, mo31055m = "invokeSuspend")
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.disneystreaming.companion.m.m.b$e */
    /* compiled from: NetSocketService.kt */
    static final class C8500e extends C12714m implements Function2<C13233e0, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13233e0 f18072X;

        /* renamed from: Y */
        Object f18073Y;

        /* renamed from: Z */
        Object f18074Z;

        /* renamed from: a0 */
        Object f18075a0;

        /* renamed from: b0 */
        Object f18076b0;

        /* renamed from: c0 */
        Object f18077c0;

        /* renamed from: d0 */
        int f18078d0;

        /* renamed from: e0 */
        final /* synthetic */ C8491b f18079e0;

        /* renamed from: com.disneystreaming.companion.m.m.b$e$a */
        /* compiled from: NetSocketService.kt */
        static final class C8501a extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            public static final C8501a f18080c = new C8501a();

            C8501a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                C8476c cVar = C8476c.f18029a;
                StringBuilder sb = new StringBuilder();
                sb.append("Error stopping listening on TCP socket: ");
                sb.append(th.getLocalizedMessage());
                cVar.mo21760a(sb.toString(), (Throwable) null, "NetSocketService");
            }
        }

        /* renamed from: com.disneystreaming.companion.m.m.b$e$b */
        /* compiled from: UseCancellable.kt */
        public static final class C8502b extends C12881k implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            final /* synthetic */ Closeable f18081c;

            public C8502b(Closeable closeable, Function1 function1) {
                this.f18081c = closeable;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Throwable th) {
                Closeable closeable = this.f18081c;
                if (closeable != null) {
                    closeable.close();
                }
            }
        }

        C8500e(C8491b bVar, C12683c cVar) {
            this.f18079e0 = bVar;
            super(2, cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            kotlin.p580c0.C12724b.m39863a(r1, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x009f, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo5580a(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.p573a0.p574h.C12700d.m39820a()
                int r1 = r6.f18078d0
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x002c
                if (r1 != r2) goto L_0x0024
                java.lang.Object r0 = r6.f18077c0
                com.disneystreaming.companion.m.m.b$e r0 = (com.disneystreaming.companion.p352m.p353m.C8491b.C8500e) r0
                java.lang.Object r0 = r6.f18076b0
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                java.lang.Object r0 = r6.f18075a0
                java.io.Closeable r0 = (java.io.Closeable) r0
                java.lang.Object r0 = r6.f18074Z
                java.net.ServerSocket r0 = (java.net.ServerSocket) r0
                java.lang.Object r0 = r6.f18073Y
                kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C13233e0) r0
                kotlin.C12903o.m40241a(r7)     // Catch:{ Exception -> 0x00a3 }
                goto L_0x0088
            L_0x0024:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x002c:
                kotlin.C12903o.m40241a(r7)
                kotlinx.coroutines.e0 r7 = r6.f18072X
                com.disneystreaming.companion.m.m.b r1 = r6.f18079e0     // Catch:{ Exception -> 0x00a3 }
                r4 = 0
                r1.f18046l = r4     // Catch:{ Exception -> 0x00a3 }
                com.disneystreaming.companion.m.m.b r1 = r6.f18079e0     // Catch:{ Exception -> 0x00a3 }
                java.net.ServerSocket r1 = r1.f18047m     // Catch:{ Exception -> 0x00a3 }
                if (r1 == 0) goto L_0x0040
                r4 = 1
            L_0x0040:
                java.lang.Boolean r4 = kotlin.p573a0.p575i.p576a.C12702b.m39828a(r4)     // Catch:{ Exception -> 0x00a3 }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x00a3 }
                if (r4 == 0) goto L_0x004b
                goto L_0x004c
            L_0x004b:
                r1 = r3
            L_0x004c:
                if (r1 == 0) goto L_0x00a0
                com.disneystreaming.companion.m.m.b$e$a r4 = com.disneystreaming.companion.p352m.p353m.C8491b.C8500e.C8501a.f18080c     // Catch:{ Exception -> 0x00a3 }
                r6.f18073Y = r7     // Catch:{ Exception -> 0x00a3 }
                r6.f18074Z = r1     // Catch:{ Exception -> 0x00a3 }
                r6.f18075a0 = r1     // Catch:{ Exception -> 0x00a3 }
                r6.f18076b0 = r4     // Catch:{ Exception -> 0x00a3 }
                r6.f18077c0 = r6     // Catch:{ Exception -> 0x00a3 }
                r6.f18078d0 = r2     // Catch:{ Exception -> 0x00a3 }
                kotlinx.coroutines.i r7 = new kotlinx.coroutines.i     // Catch:{ Exception -> 0x00a3 }
                kotlin.a0.c r5 = kotlin.p573a0.p574h.C12697c.m39816a(r6)     // Catch:{ Exception -> 0x00a3 }
                r7.<init>(r5, r2)     // Catch:{ Exception -> 0x00a3 }
                com.disneystreaming.companion.m.m.b$e$b r5 = new com.disneystreaming.companion.m.m.b$e$b     // Catch:{ Exception -> 0x00a3 }
                r5.<init>(r1, r4)     // Catch:{ Exception -> 0x00a3 }
                r7.mo34385a(r5)     // Catch:{ Exception -> 0x00a3 }
                r1.close()     // Catch:{ all -> 0x0099 }
                kotlin.v r5 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x0099 }
                kotlin.p580c0.C12724b.m39863a(r1, r3)     // Catch:{ Exception -> 0x00a3 }
                r7.mo34384a(r5, r4)     // Catch:{ Exception -> 0x00a3 }
                java.lang.Object r7 = r7.mo34396e()     // Catch:{ Exception -> 0x00a3 }
                java.lang.Object r1 = kotlin.p573a0.p574h.C12700d.m39820a()     // Catch:{ Exception -> 0x00a3 }
                if (r7 != r1) goto L_0x0085
                kotlin.p573a0.p575i.p576a.C12708h.m39847c(r6)     // Catch:{ Exception -> 0x00a3 }
            L_0x0085:
                if (r7 != r0) goto L_0x0088
                return r0
            L_0x0088:
                com.disneystreaming.companion.m.m.b r7 = r6.f18079e0     // Catch:{ Exception -> 0x00a3 }
                kotlinx.coroutines.k1 r7 = r7.mo21788q()     // Catch:{ Exception -> 0x00a3 }
                if (r7 == 0) goto L_0x0093
                kotlinx.coroutines.C13324k1.C13325a.m40950a(r7, r3, r2, r3)     // Catch:{ Exception -> 0x00a3 }
            L_0x0093:
                com.disneystreaming.companion.m.m.b r7 = r6.f18079e0     // Catch:{ Exception -> 0x00a3 }
                r7.f18047m = r3     // Catch:{ Exception -> 0x00a3 }
                goto L_0x00bc
            L_0x0099:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x009b }
            L_0x009b:
                r0 = move-exception
                kotlin.p580c0.C12724b.m39863a(r1, r7)     // Catch:{ Exception -> 0x00a3 }
                throw r0     // Catch:{ Exception -> 0x00a3 }
            L_0x00a0:
                kotlin.v r7 = kotlin.C13145v.f29587a     // Catch:{ Exception -> 0x00a3 }
                return r7
            L_0x00a3:
                r7 = move-exception
                com.disneystreaming.companion.l.c r0 = com.disneystreaming.companion.p351l.C8476c.f18029a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Error stopping listening on TCP socket: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                java.lang.String r1 = "NetSocketService"
                r0.mo21760a(r7, r3, r1)
            L_0x00bc:
                kotlin.v r7 = kotlin.C13145v.f29587a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disneystreaming.companion.p352m.p353m.C8491b.C8500e.mo5580a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C8500e eVar = new C8500e(this.f18079e0, cVar);
            eVar.f18072X = (C13233e0) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C8500e) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    static {
        new C8492a(null);
    }

    public C8491b(CompanionConfiguration companionConfiguration) {
        super(companionConfiguration);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkReturnedValueIsNotNull((Object) newSingleThreadExecutor, "Executors.newSingleThreadExecutor()");
        this.f18045k = C13224c1.m40660a(newSingleThreadExecutor);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final C13324k1 mo21810u() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8497d(this, null), 2, null);
    }

    /* renamed from: a */
    public Object mo21772a(Payload payload, String str, C12683c<? super C13145v> cVar) {
        return C13227d.m40667a(C8490a.m24641a(), new C8494c(this, str, payload, null), cVar);
    }

    /* renamed from: a */
    public void mo21776a(Message message, String str) {
        throw null;
    }

    /* renamed from: e */
    public C13324k1 mo21768e() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8493b(this, null), 2, null);
    }

    /* renamed from: f */
    public C13324k1 mo21769f() {
        return C13232e.m40677a(mo21826m(), C8490a.m24641a(), null, new C8500e(this, null), 2, null);
    }

    /* renamed from: o */
    public final C8456a mo21786o() {
        return this.f18042h;
    }

    /* renamed from: p */
    public final C13303d<MessagingEvent> mo21787p() {
        return this.f18043i;
    }

    /* renamed from: q */
    public final C13324k1 mo21788q() {
        return this.f18044j;
    }

    /* renamed from: r */
    public final C13419z0 mo21789r() {
        return this.f18045k;
    }

    /* renamed from: s */
    public final C8489l mo21790s() {
        return this.f18041g;
    }

    /* renamed from: t */
    public void mo21791t() {
        C13303d<MessagingEvent> dVar = this.f18043i;
        if (dVar != null) {
            dVar.offer(new C8554e(this.f18041g));
        }
        C13303d<MessagingEvent> dVar2 = this.f18043i;
        if (dVar2 != null) {
            dVar2.offer(new C8558i(this.f18041g));
        }
    }

    /* renamed from: b */
    public final void mo21783b(C13303d<MessagingEvent> dVar) {
        this.f18043i = dVar;
    }

    /* renamed from: c */
    public final boolean mo21785c(Message message, String str) {
        try {
            return mo21784b(message, str);
        } catch (Exception e) {
            C13303d<MessagingEvent> dVar = this.f18043i;
            if (dVar != null) {
                dVar.offer(new C8552c(new C8562c(e), this.f18041g));
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo21784b(Message message, String str) {
        return this.f18042h.mo21723a(message, str);
    }

    /* renamed from: b */
    public void mo21782b(Throwable th) {
        C13303d<MessagingEvent> dVar = this.f18043i;
        if (dVar != null) {
            dVar.offer(new C8552c(new C8565f(th), this.f18041g));
        }
    }

    /* renamed from: a */
    public final void mo21781a(C13324k1 k1Var) {
        this.f18044j = k1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m24648a(Socket socket) {
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress != null) {
            InetAddress address = ((InetSocketAddress) remoteSocketAddress).getAddress();
            Intrinsics.checkReturnedValueIsNotNull((Object) address, "(socket.remoteSocketAddr…netSocketAddress).address");
            String hostAddress = address.getHostAddress();
            C8476c cVar = C8476c.f18029a;
            StringBuilder sb = new StringBuilder();
            sb.append("Accepted a new connection from ");
            sb.append(hostAddress);
            sb.append(" on the listener socket");
            cVar.mo21760a(sb.toString(), (Throwable) null, "NetSocketService");
            C8566a a = new C8544a(socket).mo21828a(EncryptedMessage.class);
            if (!(((EncryptedMessage) a) != null)) {
                a = null;
            }
            EncryptedMessage encryptedMessage = (EncryptedMessage) a;
            if (encryptedMessage != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) hostAddress, "address");
                m24647a(encryptedMessage, hostAddress);
                return;
            }
            return;
        }
        throw new C13142s("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    /* renamed from: a */
    private final void m24647a(EncryptedMessage encryptedMessage, String str) {
        try {
            mo21776a(this.f18042h.mo21719a(encryptedMessage, str), str);
        } catch (Exception e) {
            C13303d<MessagingEvent> dVar = this.f18043i;
            if (dVar != null) {
                dVar.offer(new C8552c(new C8562c(e), this.f18041g));
            }
        }
    }

    /* renamed from: a */
    public final void mo21777a(Payload payload, String str) throws SecurityException {
        Map context = payload.getContext();
        String str2 = context != null ? (String) context.get("publicKey") : null;
        if (!(str2 != null)) {
            str2 = null;
        }
        if (str2 != null) {
            this.f18042h.mo21722a(str, str2);
            return;
        }
        throw new SecurityException("Public key not present in payload context");
    }

    /* renamed from: a */
    public void mo21779a(String str, Throwable th) {
        C13303d<MessagingEvent> dVar = this.f18043i;
        if (dVar != null) {
            dVar.offer(new C8552c(new C8561b(str, th), this.f18041g));
        }
    }

    /* renamed from: a */
    public void mo21778a(Payload payload, String str, Throwable th) {
        C13303d<MessagingEvent> dVar = this.f18043i;
        if (dVar != null) {
            dVar.offer(new C8552c(new C8564e(payload, str, th), this.f18041g));
        }
    }

    /* renamed from: a */
    public void mo21780a(Throwable th) {
        C13303d<MessagingEvent> dVar = this.f18043i;
        if (dVar != null) {
            dVar.offer(new C8552c(new C8563d(th), this.f18041g));
        }
    }
}
