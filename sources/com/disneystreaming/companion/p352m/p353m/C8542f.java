package com.disneystreaming.companion.p352m.p353m;

import com.disneystreaming.companion.configuration.CompanionConfiguration;
import com.disneystreaming.companion.p352m.C8489l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p573a0.C12694g;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.C13233e0;
import kotlinx.coroutines.C13237f0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0010¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0010¢\u0006\u0002\b!J%\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0010¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0010¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\u001bH\u0010¢\u0006\u0002\b)J\u001d\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0007H\u0010¢\u0006\u0002\b.R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158@X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, mo31007d2 = {"Lcom/disneystreaming/companion/service/socket/SocketService;", "", "config", "Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "(Lcom/disneystreaming/companion/configuration/CompanionConfiguration;)V", "blocked", "", "", "getBlocked", "()Ljava/util/List;", "getConfig", "()Lcom/disneystreaming/companion/configuration/CompanionConfiguration;", "context", "Lkotlin/coroutines/EmptyCoroutineContext;", "getContext", "()Lkotlin/coroutines/EmptyCoroutineContext;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "socketConfig", "Lcom/disneystreaming/companion/service/socket/SocketConfiguration;", "getSocketConfig$companion_release", "()Lcom/disneystreaming/companion/service/socket/SocketConfiguration;", "socketConfig$delegate", "Lkotlin/Lazy;", "notifyErrorConnect", "", "to", "error", "", "notifyErrorConnect$companion_release", "notifyErrorReceive", "notifyErrorReceive$companion_release", "notifyErrorSend", "payload", "Lcom/disneystreaming/companion/messaging/Payload;", "notifyErrorSend$companion_release", "notifyErrorStartUp", "notifyErrorStartUp$companion_release", "notifyMessageListenerStarted", "notifyMessageListenerStarted$companion_release", "processMessage", "message", "Lcom/disneystreaming/companion/messaging/Message;", "from", "processMessage$companion_release", "companion_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.disneystreaming.companion.m.m.f */
/* compiled from: SocketService.kt */
public class C8542f {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f18225f = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C8542f.class), "socketConfig", "getSocketConfig$companion_release()Lcom/disneystreaming/companion/service/socket/SocketConfiguration;"))};

    /* renamed from: a */
    private final C12694g f18226a = C12694g.f29383c;

    /* renamed from: b */
    private final C13233e0 f18227b = C13237f0.m40689a(this.f18226a);

    /* renamed from: c */
    private final Lazy f18228c = C12763i.m39921a(new C8543a(this));

    /* renamed from: d */
    private final List<String> f18229d = new ArrayList();

    /* renamed from: e */
    private final CompanionConfiguration f18230e;

    /* renamed from: com.disneystreaming.companion.m.m.f$a */
    /* compiled from: SocketService.kt */
    static final class C8543a extends C12881k implements Function0<C8503c> {

        /* renamed from: c */
        final /* synthetic */ C8542f f18231c;

        C8543a(C8542f fVar) {
            this.f18231c = fVar;
            super(0);
        }

        public final C8503c invoke() {
            Object obj = this.f18231c.mo21825l().getServices().get(C8489l.SOCKET);
            if (!(obj instanceof C8503c)) {
                obj = null;
            }
            C8503c cVar = (C8503c) obj;
            if (cVar != null) {
                return cVar;
            }
            C8503c cVar2 = new C8503c(0, 0, 0, 0, 15, null);
            return cVar2;
        }
    }

    public C8542f(CompanionConfiguration companionConfiguration) {
        this.f18230e = companionConfiguration;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final List<String> mo21824k() {
        return this.f18229d;
    }

    /* renamed from: l */
    public final CompanionConfiguration mo21825l() {
        return this.f18230e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C13233e0 mo21826m() {
        return this.f18227b;
    }

    /* renamed from: n */
    public final C8503c mo21827n() {
        Lazy lazy = this.f18228c;
        KProperty kProperty = f18225f[0];
        return (C8503c) lazy.getValue();
    }
}
