package kotlinx.coroutines.p592j2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12865c0;
import kotlin.jvm.internal.C12880j;
import kotlinx.coroutines.C13292j0;
import kotlinx.coroutines.C13323k0;
import kotlinx.coroutines.internal.C13266g;
import kotlinx.coroutines.internal.C13268i;
import kotlinx.coroutines.internal.C13278p;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0005_`abcB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u001d2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u00020\u001d2\u0018\u0010\"\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u001d0 j\u0002`!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u001d2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\u00182\u0006\u0010\r\u001a\u00028\u00002\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101JX\u00106\u001a\u00020\u001d\"\u0004\b\u0001\u001022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010+2\u0006\u0010\r\u001a\u00028\u00002(\u00105\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000104\u0012\u0006\u0012\u0004\u0018\u00010\u001803H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001b\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u00108J\u001d\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u0001092\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b<\u00108J\u001b\u0010>\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b>\u00108J\u0017\u0010?\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000109H\u0014¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010\u0016H\u0004¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020C8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\bF\u0010ER\u001c\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001c\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0016\u0010O\u001a\u00020\u00078B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020\u00078$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0016\u0010Q\u001a\u00020\u00078$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010NR\u0013\u0010R\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\bR\u0010NR\u0013\u0010S\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\bS\u0010NR%\u0010W\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020T8F@\u0006¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010Y\u001a\u00020X8\u0004@\u0004X\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020C8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b]\u0010E\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, mo31007d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "<init>", "()V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "", "countQueueSize", "()I", "element", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "describeSendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeSendConflated", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "describeTryOffer", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "closed", "", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendFair$kotlinx_coroutines_core", "sendFair", "sendSuspend", "takeFirstReceiveOrPeekClosed", "()Lkotlinx/coroutines/channels/ReceiveOrClosed;", "takeFirstSendOrPeekClosed", "()Lkotlinx/coroutines/channels/Send;", "", "toString", "()Ljava/lang/String;", "getBufferDebugString", "bufferDebugString", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForReceive", "getClosedForSend", "closedForSend", "getFull", "()Z", "full", "isBufferAlwaysFull", "isBufferFull", "isClosedForSend", "isFull", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueueDebugStateString", "queueDebugStateString", "SendBuffered", "SendBufferedDesc", "SendConflatedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.j2.c */
/* compiled from: AbstractChannel.kt */
public abstract class C13301c<E> implements C13321q<E> {

    /* renamed from: U */
    private static final AtomicReferenceFieldUpdater f29748U = AtomicReferenceFieldUpdater.newUpdater(C13301c.class, Object.class, "onCloseHandler");

    /* renamed from: c */
    private final C13266g f29749c = new C13266g();
    private volatile Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.j2.c$a */
    /* compiled from: AbstractChannel.kt */
    public static final class C13302a<E> extends C13320p {

        /* renamed from: W */
        public final E f29750W;

        public C13302a(E e) {
            this.f29750W = e;
        }

        /* renamed from: b */
        public void mo34495b(Object obj) {
            if (C13292j0.m40863a()) {
                if (!(obj == C13300b.f29746e)) {
                    throw new AssertionError();
                }
            }
        }

        /* renamed from: c */
        public Object mo34496c(Object obj) {
            return C13300b.f29746e;
        }

        /* renamed from: m */
        public Object mo34418m() {
            return this.f29750W;
        }
    }

    /* renamed from: b */
    private final void m40890b(Throwable th) {
        Object obj = this.onCloseHandler;
        if (obj != null) {
            Object obj2 = C13300b.f29747f;
            if (obj != obj2 && f29748U.compareAndSet(this, obj, obj2)) {
                C12865c0.m40197a(obj, 1);
                ((Function1) obj).invoke(th);
            }
        }
    }

    /* renamed from: g */
    private final int mo34470g() {
        C13266g gVar = this.f29749c;
        Object d = gVar.mo34422d();
        if (d != null) {
            int i = 0;
            for (C13268i iVar = (C13268i) d; !C12880j.m40224a((Object) iVar, (Object) gVar); iVar = iVar.mo34423e()) {
                if (iVar instanceof C13268i) {
                    i++;
                }
            }
            return i;
        }
        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: h */
    private final String mo34471h() {
        String str;
        C13268i e = this.f29749c.mo34423e();
        if (e == this.f29749c) {
            return "EmptyQueue";
        }
        if (e instanceof C13307g) {
            str = e.toString();
        } else if (e instanceof C13317m) {
            str = "ReceiveQueued";
        } else if (e instanceof C13320p) {
            str = "SendQueued";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("UNEXPECTED:");
            sb.append(e);
            str = sb.toString();
        }
        C13268i g = this.f29749c.mo34425g();
        if (g != e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(",queueSize=");
            sb2.append(mo34470g());
            str = sb2.toString();
            if (g instanceof C13307g) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(",closedForSend=");
                sb3.append(g);
                str = sb3.toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo34486a(E e) {
        C13319o e2;
        Object a;
        do {
            e2 = mo34469e();
            if (e2 == null) {
                return C13300b.f29743b;
            }
            a = e2.mo34481a(e, null);
        } while (a == null);
        e2.mo34482a(a);
        return e2.mo34498c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34487a(C13268i iVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo34489b() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C13307g<?> mo34490c() {
        C13268i g = this.f29749c.mo34425g();
        if (!(g instanceof C13307g)) {
            g = null;
        }
        C13307g<?> gVar = (C13307g) g;
        if (gVar == null) {
            return null;
        }
        m40889a(gVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C13266g mo34491d() {
        return this.f29749c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C13319o<E> mo34469e() {
        C13268i iVar;
        C13319o<E> oVar;
        C13266g gVar = this.f29749c;
        while (true) {
            Object d = gVar.mo34422d();
            if (d != null) {
                iVar = (C13268i) d;
                oVar = null;
                if (iVar == gVar || !(iVar instanceof C13319o)) {
                    break;
                } else if (!(((C13319o) iVar) instanceof C13307g) && !iVar.mo34417k()) {
                    iVar.mo34426h();
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        oVar = iVar;
        return oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C13320p mo34492f() {
        C13268i iVar;
        C13320p pVar;
        C13266g gVar = this.f29749c;
        while (true) {
            Object d = gVar.mo34422d();
            if (d != null) {
                iVar = (C13268i) d;
                pVar = null;
                if (iVar == gVar || !(iVar instanceof C13320p)) {
                    break;
                } else if (!(((C13320p) iVar) instanceof C13307g) && !iVar.mo34417k()) {
                    iVar.mo34426h();
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        pVar = iVar;
        return pVar;
    }

    public final boolean offer(E e) {
        Object a = mo34486a(e);
        if (a == C13300b.f29742a) {
            return true;
        }
        if (a == C13300b.f29743b) {
            C13307g c = mo34490c();
            if (c != null) {
                Throwable o = c.mo34500o();
                if (o != null) {
                    Throwable b = C13278p.m40818b(o);
                    if (b != null) {
                        throw b;
                    }
                }
            }
            return false;
        } else if (a instanceof C13307g) {
            throw C13278p.m40818b(((C13307g) a).mo34500o());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("offerInternal returned ");
            sb.append(a);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C13323k0.m40937a((Object) this));
        sb.append('@');
        sb.append(C13323k0.m40939b(this));
        sb.append('{');
        sb.append(mo34471h());
        sb.append('}');
        sb.append(mo34489b());
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo34488a(Throwable th) {
        boolean z;
        C13307g gVar = new C13307g(th);
        C13266g gVar2 = this.f29749c;
        while (true) {
            Object f = gVar2.mo34424f();
            if (f != null) {
                C13268i iVar = (C13268i) f;
                if (!(iVar instanceof C13307g)) {
                    if (iVar.mo34421a((C13268i) gVar, (C13268i) gVar2)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        if (!z) {
            C13268i g = this.f29749c.mo34425g();
            if (g != null) {
                m40889a((C13307g) g);
                return false;
            }
            throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
        }
        m40889a(gVar);
        m40890b(th);
        return true;
    }

    /* renamed from: a */
    private final void m40889a(C13307g<?> gVar) {
        while (true) {
            C13268i g = gVar.mo34425g();
            if ((g instanceof C13266g) || !(g instanceof C13317m)) {
                mo34487a((C13268i) gVar);
            } else if (!g.mo34417k()) {
                g.mo34427i();
            } else {
                ((C13317m) g).mo34483a(gVar);
            }
        }
        mo34487a((C13268i) gVar);
    }
}
