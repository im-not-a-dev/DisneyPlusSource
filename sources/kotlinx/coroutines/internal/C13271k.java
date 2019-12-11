package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.C13292j0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0019\b\u0000\u0018\u0000 2*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0013J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J&\u0010%\u001a\u0004\u0018\u00010\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0019H\b¢\u0006\u0004\b%\u0010&J3\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0013\u0010,\u001a\u00020\u00058F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010\u0013R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0013\u00101\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, mo31007d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "element", "addLast", "(Ljava/lang/Object;)I", "", "state", "Lkotlinx/coroutines/internal/Core;", "allocateNextCopy", "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateOrGetNextCopy", "close", "()Z", "index", "fillPlaceholder", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "markFrozen", "()J", "next", "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "removeFirstOrNull", "()Ljava/lang/Object;", "predicate", "removeFirstOrNullIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "oldHead", "newHead", "removeSlowPath", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "I", "isEmpty", "mask", "Z", "getSize", "()I", "size", "Companion", "Placeholder", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.internal.k */
/* compiled from: LockFreeTaskQueue.kt */
public final class C13271k<E> {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f29700e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f29701f;

    /* renamed from: g */
    public static final C13279q f29702g = new C13279q("REMOVE_FROZEN");

    /* renamed from: h */
    public static final C13272a f29703h = new C13272a(null);
    private volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f29704a;

    /* renamed from: b */
    public /* synthetic */ AtomicReferenceArray f29705b;

    /* renamed from: c */
    private final int f29706c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f29707d;

    /* renamed from: kotlinx.coroutines.internal.k$a */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C13272a {
        private C13272a() {
        }

        /* renamed from: a */
        public final int mo34441a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: a */
        public final long mo34442a(long j, int i) {
            return mo34443a(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: a */
        public final long mo34443a(long j, long j2) {
            return j & (~j2);
        }

        /* renamed from: b */
        public final long mo34444b(long j, int i) {
            return mo34443a(j, 1152921503533105152L) | (((long) i) << 30);
        }

        public /* synthetic */ C13272a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.internal.k$b */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C13273b {

        /* renamed from: a */
        public final int f29708a;

        public C13273b(int i) {
            this.f29708a = i;
        }
    }

    static {
        Class<C13271k> cls = C13271k.class;
        f29700e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f29701f = AtomicLongFieldUpdater.newUpdater(cls, "_state$internal");
    }

    public C13271k(int i, boolean z) {
        this.f29706c = i;
        this.f29707d = z;
        int i2 = this.f29706c;
        this.f29704a = i2 - 1;
        this.f29705b = new AtomicReferenceArray(i2);
        boolean z2 = false;
        String str = "Check failed.";
        if (this.f29704a <= 1073741823) {
            if ((this.f29706c & this.f29704a) == 0) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalStateException(str.toString());
            }
            return;
        }
        throw new IllegalStateException(str.toString());
    }

    /* renamed from: f */
    private final long m40790f() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f29701f.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: c */
    public final boolean mo34438c() {
        long j = this._state$internal;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: d */
    public final C13271k<E> mo34439d() {
        return m40788b(m40790f());
    }

    /* renamed from: e */
    public final Object mo34440e() {
        Object obj;
        while (true) {
            long j = this._state$internal;
            if ((1152921504606846976L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                if ((this.f29704a & ((int) ((1152921503533105152L & j) >> 30))) != (this.f29704a & i)) {
                    obj = this.f29705b.get(this.f29704a & i);
                    if (obj != null) {
                        if (!(obj instanceof C13273b)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!f29701f.compareAndSet(this, j, f29703h.mo34442a(j, i2))) {
                                if (this.f29707d) {
                                    C13271k kVar = this;
                                    do {
                                        kVar = kVar.m40784a(i, i2);
                                    } while (kVar != null);
                                    break;
                                }
                            } else {
                                this.f29705b.set(this.f29704a & i, null);
                                break;
                            }
                        } else {
                            return null;
                        }
                    } else if (this.f29707d) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return f29702g;
            }
        }
        return obj;
    }

    /* renamed from: b */
    public final int mo34437b() {
        long j = this._state$internal;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: a */
    private final C13271k<E> m40785a(int i, E e) {
        Object obj = this.f29705b.get(this.f29704a & i);
        if (!(obj instanceof C13273b) || ((C13273b) obj).f29708a != i) {
            return null;
        }
        this.f29705b.set(i & this.f29704a, e);
        return this;
    }

    /* renamed from: b */
    private final C13271k<E> m40788b(long j) {
        while (true) {
            C13271k<E> kVar = (C13271k) this._next;
            if (kVar != null) {
                return kVar;
            }
            f29700e.compareAndSet(this, null, m40786a(j));
        }
    }

    /* renamed from: a */
    private final C13271k<E> m40786a(long j) {
        C13271k<E> kVar = new C13271k<>(this.f29706c * 2, this.f29707d);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f29704a;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f29705b.get(i3 & i);
                if (obj == null) {
                    obj = new C13273b(i);
                }
                kVar.f29705b.set(kVar.f29704a & i, obj);
                i++;
            } else {
                kVar._state$internal = f29703h.mo34443a(j, 1152921504606846976L);
                return kVar;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo34436a() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f29701f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: a */
    public final int mo34435a(E e) {
        while (true) {
            long j = this._state$internal;
            if ((3458764513820540928L & j) != 0) {
                return f29703h.mo34441a(j);
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f29704a;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f29707d || this.f29705b.get(i2 & i3) == null) {
                int i4 = (i2 + 1) & 1073741823;
                if (f29701f.compareAndSet(this, j, f29703h.mo34444b(j, i4))) {
                    this.f29705b.set(i2 & i3, e);
                    C13271k kVar = this;
                    while ((kVar._state$internal & 1152921504606846976L) != 0) {
                        kVar = kVar.mo34439d().m40785a(i2, e);
                        if (kVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f29706c;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C13271k<E> m40784a(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C13292j0.m40863a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo34439d();
            }
        } while (!f29701f.compareAndSet(this, j, f29703h.mo34442a(j, i2)));
        this.f29705b.set(this.f29704a & i3, null);
        return null;
    }
}
