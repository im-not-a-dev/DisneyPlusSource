package kotlinx.coroutines.p592j2;

import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12702b;
import kotlin.p573a0.p575i.p576a.C12708h;
import kotlinx.coroutines.C13236f;
import kotlinx.coroutines.C13244h;
import kotlinx.coroutines.C13244h.C13245a;
import kotlinx.coroutines.C13249i;
import kotlinx.coroutines.internal.C13267h;
import kotlinx.coroutines.internal.C13268i;
import kotlinx.coroutines.internal.C13268i.C13269a;
import kotlinx.coroutines.internal.C13278p;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007IJKLMNOB\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0016\u0010\u0016\u001a\u00020\u00192\u000e\u0010\u0017\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u0019H\u0014J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0004J\u0016\u0010!\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0002JR\u0010$\u001a\u00020\u0006\"\u0004\b\u0001\u0010%2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H%0'2$\u0010(\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\n\u0012\b\u0012\u0004\u0012\u0002H%0+\u0012\u0006\u0012\u0004\u0018\u00010*0)2\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0002\u0010.J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0002J\b\u00101\u001a\u00020\u0019H\u0014J\b\u00102\u001a\u00020\u0019H\u0014J\r\u00103\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u00104J\n\u00105\u001a\u0004\u0018\u00010*H\u0014J\u0016\u00106\u001a\u0004\u0018\u00010*2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030'H\u0014J\u0011\u0010\"\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u00107J\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00107J\u0013\u00109\u001a\u0004\u0018\u00018\u0000H@ø\u0001\u0000¢\u0006\u0002\u00107J\u0019\u0010:\u001a\u0004\u0018\u00018\u00002\b\u0010;\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0002\u0010<J\u0017\u0010=\u001a\u00028\u00002\b\u0010;\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0002\u0010<J\u001f\u0010>\u001a\u0002H%\"\u0004\b\u0001\u0010%2\u0006\u0010,\u001a\u00020-H@ø\u0001\u0000¢\u0006\u0002\u0010?JH\u0010@\u001a\u00020\u0019\"\u0004\b\u0001\u0010%2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H%0'2\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H%0+\u0012\u0006\u0012\u0004\u0018\u00010*0)H\u0002ø\u0001\u0000¢\u0006\u0002\u0010AJQ\u0010B\u001a\u00020\u0019\"\u0004\b\u0001\u0010%2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H%0'2(\u0010(\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H%0+\u0012\u0006\u0012\u0004\u0018\u00010*0)H\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010AJJ\u0010C\u001a\u00020\u0019\"\u0004\b\u0001\u0010%2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H%0'2$\u0010(\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H%0+\u0012\u0006\u0012\u0004\u0018\u00010*0)H\u0002ø\u0001\u0000¢\u0006\u0002\u0010AJ \u0010D\u001a\u00020\u00192\n\u0010E\u001a\u0006\u0012\u0002\b\u00030F2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0002J\u0010\u0010G\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010HH\u0014R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u000e8VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, mo31007d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "()V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveOrClosed", "Lkotlinx/coroutines/channels/ValueOrClosed;", "getOnReceiveOrClosed", "onReceiveOrNull", "getOnReceiveOrNull", "cancel", "cause", "", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "cleanupSendQueueOnCancel", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onReceiveDequeued", "onReceiveEnqueued", "poll", "()Ljava/lang/Object;", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOrClosed", "receiveOrNull", "receiveOrNullResult", "result", "(Ljava/lang/Object;)Ljava/lang/Object;", "receiveResult", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceive", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectReceiveOrClosed", "registerSelectReceiveOrNull", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "IdempotentTokenValue", "Itr", "ReceiveElement", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.j2.a */
/* compiled from: AbstractChannel.kt */
public abstract class C13294a<E> extends C13301c<E> implements C13304e<E> {

    /* renamed from: kotlinx.coroutines.j2.a$a */
    /* compiled from: AbstractChannel.kt */
    private static final class C13295a<E> {

        /* renamed from: a */
        public final Object f29733a;

        /* renamed from: b */
        public final E f29734b;

        public C13295a(Object obj, E e) {
            this.f29733a = obj;
            this.f29734b = e;
        }
    }

    /* renamed from: kotlinx.coroutines.j2.a$b */
    /* compiled from: AbstractChannel.kt */
    private static final class C13296b<E> implements C13306f<E> {

        /* renamed from: a */
        private Object f29735a = C13300b.f29744c;

        /* renamed from: b */
        private final C13294a<E> f29736b;

        public C13296b(C13294a<E> aVar) {
            this.f29736b = aVar;
        }

        /* renamed from: b */
        private final boolean m40878b(Object obj) {
            if (!(obj instanceof C13307g)) {
                return true;
            }
            C13307g gVar = (C13307g) obj;
            if (gVar.f29752W == null) {
                return false;
            }
            throw C13278p.m40818b(gVar.mo34499n());
        }

        /* renamed from: a */
        public final C13294a<E> mo34477a() {
            return this.f29736b;
        }

        public E next() {
            E e = this.f29735a;
            if (!(e instanceof C13307g)) {
                E e2 = C13300b.f29744c;
                if (e != e2) {
                    this.f29735a = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw C13278p.m40818b(((C13307g) e).mo34499n());
        }

        /* renamed from: a */
        public final void mo34478a(Object obj) {
            this.f29735a = obj;
        }

        /* renamed from: a */
        public Object mo34476a(C12683c<? super Boolean> cVar) {
            Object obj = this.f29735a;
            if (obj != C13300b.f29744c) {
                return C12702b.m39828a(m40878b(obj));
            }
            this.f29735a = this.f29736b.mo34475k();
            Object obj2 = this.f29735a;
            if (obj2 != C13300b.f29744c) {
                return C12702b.m39828a(m40878b(obj2));
            }
            return mo34479b(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo34479b(C12683c<? super Boolean> cVar) {
            C13249i iVar = new C13249i(C12697c.m39816a(cVar), 0);
            C13297c cVar2 = new C13297c(this, iVar);
            while (true) {
                if (!mo34477a().m40871a(cVar2)) {
                    Object k = mo34477a().mo34475k();
                    mo34478a(k);
                    if (!(k instanceof C13307g)) {
                        if (k != C13300b.f29744c) {
                            Boolean a = C12702b.m39828a(true);
                            C12901a aVar = C12900n.f29540c;
                            C12900n.m40236a(a);
                            iVar.mo31039b(a);
                            break;
                        }
                    } else {
                        C13307g gVar = (C13307g) k;
                        if (gVar.f29752W == null) {
                            Boolean a2 = C12702b.m39828a(false);
                            C12901a aVar2 = C12900n.f29540c;
                            C12900n.m40236a(a2);
                            iVar.mo31039b(a2);
                        } else {
                            Throwable n = gVar.mo34499n();
                            C12901a aVar3 = C12900n.f29540c;
                            Object a3 = C12903o.m40240a(n);
                            C12900n.m40236a(a3);
                            iVar.mo31039b(a3);
                        }
                    }
                } else {
                    mo34477a().m40868a((C13244h<?>) iVar, (C13317m<?>) cVar2);
                    break;
                }
            }
            Object e = iVar.mo34396e();
            if (e == C12700d.m39820a()) {
                C12708h.m39847c(cVar);
            }
            return e;
        }
    }

    /* renamed from: kotlinx.coroutines.j2.a$c */
    /* compiled from: AbstractChannel.kt */
    private static final class C13297c<E> extends C13317m<E> {

        /* renamed from: W */
        public final C13296b<E> f29737W;

        /* renamed from: X */
        public final C13244h<Boolean> f29738X;

        public C13297c(C13296b<E> bVar, C13244h<? super Boolean> hVar) {
            this.f29737W = bVar;
            this.f29738X = hVar;
        }

        /* renamed from: a */
        public Object mo34481a(E e, Object obj) {
            Object a = this.f29738X.mo34382a(Boolean.valueOf(true), obj);
            if (a != null) {
                if (obj != null) {
                    return new C13295a(a, e);
                }
                this.f29737W.mo34478a((Object) e);
            }
            return a;
        }

        public String toString() {
            return "ReceiveHasNext";
        }

        /* renamed from: a */
        public void mo34482a(Object obj) {
            if (obj instanceof C13295a) {
                C13295a aVar = (C13295a) obj;
                this.f29737W.mo34478a((Object) aVar.f29734b);
                this.f29738X.mo34386c(aVar.f29733a);
                return;
            }
            this.f29738X.mo34386c(obj);
        }

        /* renamed from: a */
        public void mo34483a(C13307g<?> gVar) {
            Object obj;
            if (gVar.f29752W == null) {
                obj = C13245a.m40701a(this.f29738X, Boolean.valueOf(false), null, 2, null);
            } else {
                obj = this.f29738X.mo34383a(C13278p.m40811a(gVar.mo34499n(), (C12683c<?>) this.f29738X));
            }
            if (obj != null) {
                this.f29737W.mo34478a((Object) gVar);
                this.f29738X.mo34386c(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.j2.a$d */
    /* compiled from: AbstractChannel.kt */
    private final class C13298d extends C13236f {

        /* renamed from: c */
        private final C13317m<?> f29740c;

        public C13298d(C13317m<?> mVar) {
            this.f29740c = mVar;
        }

        /* renamed from: a */
        public void mo34381a(Throwable th) {
            if (this.f29740c.mo34417k()) {
                C13294a.this.mo34472i();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34381a((Throwable) obj);
            return C13145v.f29587a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RemoveReceiveOnCancel[");
            sb.append(this.f29740c);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.j2.a$e */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C13299e extends C13269a {

        /* renamed from: d */
        final /* synthetic */ C13294a f29741d;

        public C13299e(C13268i iVar, C13268i iVar2, C13294a aVar) {
            this.f29741d = aVar;
            super(iVar2);
        }

        /* renamed from: a */
        public Object mo34408b(C13268i iVar) {
            if (this.f29741d.mo34471h()) {
                return null;
            }
            return C13267h.m40756a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C13319o<E> mo34469e() {
        C13319o<E> e = super.mo34469e();
        if (e != null && !(e instanceof C13307g)) {
            mo34472i();
        }
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo34470g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo34471h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo34472i() {
    }

    public final C13306f<E> iterator() {
        return new C13296b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo34474j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Object mo34475k() {
        C13320p f;
        Object c;
        do {
            f = mo34492f();
            if (f == null) {
                return C13300b.f29744c;
            }
            c = f.mo34496c(null);
        } while (c == null);
        f.mo34495b(c);
        return f.mo34418m();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m40871a(kotlinx.coroutines.p592j2.C13317m<? super E> r8) {
        /*
            r7 = this;
            boolean r0 = r7.mo34470g()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0029
            kotlinx.coroutines.internal.g r0 = r7.mo34491d()
        L_0x000e:
            java.lang.Object r4 = r0.mo34424f()
            if (r4 == 0) goto L_0x0023
            kotlinx.coroutines.internal.i r4 = (kotlinx.coroutines.internal.C13268i) r4
            boolean r5 = r4 instanceof kotlinx.coroutines.p592j2.C13320p
            r5 = r5 ^ r3
            if (r5 != 0) goto L_0x001c
            goto L_0x004b
        L_0x001c:
            boolean r4 = r4.mo34421a(r8, r0)
            if (r4 == 0) goto L_0x000e
            goto L_0x004a
        L_0x0023:
            kotlin.s r8 = new kotlin.s
            r8.<init>(r1)
            throw r8
        L_0x0029:
            kotlinx.coroutines.internal.g r0 = r7.mo34491d()
            kotlinx.coroutines.j2.a$e r4 = new kotlinx.coroutines.j2.a$e
            r4.<init>(r8, r8, r7)
        L_0x0032:
            java.lang.Object r5 = r0.mo34424f()
            if (r5 == 0) goto L_0x0051
            kotlinx.coroutines.internal.i r5 = (kotlinx.coroutines.internal.C13268i) r5
            boolean r6 = r5 instanceof kotlinx.coroutines.p592j2.C13320p
            r6 = r6 ^ r3
            if (r6 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            int r5 = r5.mo34419a(r8, r0, r4)
            if (r5 == r3) goto L_0x004a
            r6 = 2
            if (r5 == r6) goto L_0x004b
            goto L_0x0032
        L_0x004a:
            r2 = 1
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r7.mo34474j()
        L_0x0050:
            return r2
        L_0x0051:
            kotlin.s r8 = new kotlin.s
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p592j2.C13294a.m40871a(kotlinx.coroutines.j2.m):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m40868a(C13244h<?> hVar, C13317m<?> mVar) {
        hVar.mo34385a((Function1<? super Throwable, C13145v>) new C13298d<Object,C13145v>(mVar));
    }
}
