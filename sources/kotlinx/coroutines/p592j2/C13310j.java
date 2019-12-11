package kotlinx.coroutines.p592j2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C13279q;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004CBDEB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0006J?\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\u00142\u000e\u0010\u000e\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0010\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00140\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b'\u0010(JX\u00101\u001a\u00020\u0014\"\u0004\b\u0001\u0010)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010 \u001a\u00028\u00002(\u00100\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010.\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102J?\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b3\u0010\fJ\u001b\u00104\u001a\u00020\u00142\u0006\u0010 \u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u000f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u000f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b8\u00107R(\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-098V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0019\u0010\u0003\u001a\u00028\u00008F@\u0006¢\u0006\f\u0012\u0004\b?\u0010\u0006\u001a\u0004\b=\u0010>R\u0015\u0010A\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b@\u0010>\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, mo31007d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "value", "<init>", "(Ljava/lang/Object;)V", "()V", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "list", "subscriber", "addSubscriber", "([Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", "close", "closeSubscriber", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "element", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "offerInternal", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeSubscriber", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isClosedForSend", "()Z", "isFull", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "getValue", "()Ljava/lang/Object;", "value$annotations", "getValueOrNull", "valueOrNull", "Companion", "Closed", "State", "Subscriber", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.j2.j */
/* compiled from: ConflatedBroadcastChannel.kt */
public final class C13310j<E> implements C13303d<E> {

    /* renamed from: U */
    private static final AtomicIntegerFieldUpdater f29753U;

    /* renamed from: V */
    private static final C13279q f29754V = new C13279q("UNDEFINED");

    /* renamed from: W */
    private static final C13313c<Object> f29755W = new C13313c<>(f29754V, null);

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f29756c;
    private volatile Object _state = f29755W;
    private volatile int _updating = 0;
    private volatile Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.j2.j$a */
    /* compiled from: ConflatedBroadcastChannel.kt */
    private static final class C13311a {

        /* renamed from: a */
        public final Throwable f29757a;

        public C13311a(Throwable th) {
            this.f29757a = th;
        }

        /* renamed from: a */
        public final Throwable mo34501a() {
            Throwable th = this.f29757a;
            return th != null ? th : new C13309i("Channel was closed");
        }
    }

    /* renamed from: kotlinx.coroutines.j2.j$b */
    /* compiled from: ConflatedBroadcastChannel.kt */
    private static final class C13312b {
        private C13312b() {
        }

        public /* synthetic */ C13312b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.j2.j$c */
    /* compiled from: ConflatedBroadcastChannel.kt */
    private static final class C13313c<E> {

        /* renamed from: a */
        public final Object f29758a;

        /* renamed from: b */
        public final C13314d<E>[] f29759b;

        public C13313c(Object obj, C13314d<E>[] dVarArr) {
            this.f29758a = obj;
            this.f29759b = dVarArr;
        }
    }

    /* renamed from: kotlinx.coroutines.j2.j$d */
    /* compiled from: ConflatedBroadcastChannel.kt */
    private static final class C13314d<E> extends C13315k<E> implements C13318n<E> {
        public C13314d(C13310j<E> jVar) {
        }

        /* renamed from: a */
        public Object mo34486a(E e) {
            return super.mo34486a(e);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C13310j> cls2 = C13310j.class;
        new C13312b(null);
        new C13311a(null);
        f29756c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f29753U = AtomicIntegerFieldUpdater.newUpdater(cls2, "_updating");
        AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "onCloseHandler");
    }

    /* renamed from: a */
    public C13318n<E> mo34497a() {
        Object obj;
        C13313c cVar;
        Object obj2;
        C13314d dVar = new C13314d(this);
        do {
            obj = this._state;
            if (obj instanceof C13311a) {
                dVar.mo34488a(((C13311a) obj).f29757a);
                return dVar;
            } else if (obj instanceof C13313c) {
                cVar = (C13313c) obj;
                Object obj3 = cVar.f29758a;
                if (obj3 != f29754V) {
                    dVar.mo34486a(obj3);
                }
                obj2 = cVar.f29758a;
                if (obj != null) {
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!f29756c.compareAndSet(this, obj, new C13313c(obj2, m40917a(cVar.f29759b, dVar))));
        return dVar;
    }

    public boolean offer(E e) {
        C13311a a = m40916a(e);
        if (a == null) {
            return true;
        }
        throw a.mo34501a();
    }

    /* renamed from: a */
    private final C13314d<E>[] m40917a(C13314d<E>[] dVarArr, C13314d<E> dVar) {
        if (dVarArr != null) {
            return (C13314d[]) C13171j.m40341a((T[]) dVarArr, dVar);
        }
        C13314d<E>[] dVarArr2 = new C13314d[1];
        for (int i = 0; i < 1; i++) {
            dVarArr2[i] = dVar;
        }
        return dVarArr2;
    }

    /* renamed from: a */
    private final C13311a m40916a(E e) {
        Object obj;
        if (!f29753U.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof C13311a) {
                    C13311a aVar = (C13311a) obj;
                    this._updating = 0;
                    return aVar;
                } else if (!(obj instanceof C13313c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                } else if (obj != null) {
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                }
            } finally {
                this._updating = 0;
            }
        } while (!f29756c.compareAndSet(this, obj, new C13313c(e, ((C13313c) obj).f29759b)));
        C13314d<E>[] dVarArr = ((C13313c) obj).f29759b;
        if (dVarArr != null) {
            for (C13314d<E> a : dVarArr) {
                a.mo34486a(e);
            }
        }
        return null;
    }
}
