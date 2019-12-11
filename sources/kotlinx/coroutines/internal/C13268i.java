package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C13292j0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001:\u0004KLMNB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\f\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\b¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0010\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0004\u0012\u0004\u0012\u00020\n0\u000eH\b¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0012\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0004\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\b¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0014\u001a\u00060\u0000j\u0002`\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001c\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00042\n\u0010\u0019\u001a\u00060\u0000j\u0002`\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\f\b\u0000\u0010\u001e*\u00060\u0000j\u0002`\u00042\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00040\"¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u00062\n\u0010\u0014\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b'\u0010\bJ\u001b\u0010(\u001a\u00020\u00062\n\u0010\u0014\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0001¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u0003J,\u0010,\u001a\u00020+2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\b¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b.\u0010&J\u000f\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001e\u0018\u0001H\b¢\u0006\u0004\b1\u00102J.\u00103\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001e\u0018\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u000eH\b¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004¢\u0006\u0004\b5\u0010&J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J/\u0010>\u001a\u00020=2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0014\u001a\u00060\u0000j\u0002`\u00042\u0006\u0010<\u001a\u00020+H\u0001¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020\u00062\n\u0010@\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0014\u001a\u00060\u0000j\u0002`\u0004H\u0000¢\u0006\u0004\bA\u0010BR\u0013\u0010D\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bD\u00100R\u0013\u0010\u0014\u001a\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\bE\u00102R\u0017\u0010G\u001a\u00060\u0000j\u0002`\u00048F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010&R\u0013\u0010@\u001a\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\bH\u00102R\u0017\u0010J\u001a\u00060\u0000j\u0002`\u00048F@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010&¨\u0006O"}, mo31007d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlin/Function0;", "", "condition", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "next", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "_prev", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "correctPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "findHead", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "finishAdd", "finishRemove", "helpDelete", "helpRemove", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "markPrev", "remove", "()Z", "removeFirstIfIsInstanceOf", "()Ljava/lang/Object;", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "", "toString", "()Ljava/lang/String;", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "isRemoved", "getNext", "getNextNode", "nextNode", "getPrev", "getPrevNode", "prevNode", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.internal.i */
/* compiled from: LockFreeLinkedList.kt */
public class C13268i {

    /* renamed from: U */
    static final AtomicReferenceFieldUpdater f29694U;

    /* renamed from: V */
    private static final AtomicReferenceFieldUpdater f29695V;

    /* renamed from: c */
    static final AtomicReferenceFieldUpdater f29696c;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.i$a */
    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class C13269a extends C13255c<C13268i> {

        /* renamed from: b */
        public C13268i f29697b;

        /* renamed from: c */
        public final C13268i f29698c;

        public C13269a(C13268i iVar) {
            this.f29698c = iVar;
        }

        /* renamed from: a */
        public void mo34407a(C13268i iVar, Object obj) {
            boolean z = obj == null;
            C13268i iVar2 = z ? this.f29698c : this.f29697b;
            if (iVar2 != null && C13268i.f29696c.compareAndSet(iVar, this, iVar2) && z) {
                C13268i iVar3 = this.f29698c;
                C13268i iVar4 = this.f29697b;
                if (iVar4 != null) {
                    iVar3.m40759b(iVar4);
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C13268i> cls2 = C13268i.class;
        f29696c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f29694U = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f29695V = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: c */
    private final void m40761c(C13268i iVar) {
        mo34426h();
        iVar.m40758a(C13267h.m40757a(this._prev), (C13274l) null);
    }

    /* renamed from: m */
    private final C13268i mo34418m() {
        C13268i iVar = this;
        while (!(iVar instanceof C13266g)) {
            iVar = iVar.mo34423e();
            if (C13292j0.m40863a()) {
                if (!(iVar != this)) {
                    throw new AssertionError();
                }
            }
        }
        return iVar;
    }

    /* renamed from: n */
    private final C13268i mo34499n() {
        Object obj;
        C13268i iVar;
        do {
            obj = this._prev;
            if (obj instanceof C13275m) {
                return ((C13275m) obj).f29709a;
            }
            if (obj == this) {
                iVar = mo34418m();
            } else if (obj != null) {
                iVar = (C13268i) obj;
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f29694U.compareAndSet(this, obj, iVar.mo34500o()));
        return (C13268i) obj;
    }

    /* renamed from: o */
    private final C13275m mo34500o() {
        C13275m mVar = (C13275m) this._removedRef;
        if (mVar != null) {
            return mVar;
        }
        C13275m mVar2 = new C13275m(this);
        f29695V.lazySet(this, mVar2);
        return mVar2;
    }

    /* renamed from: a */
    public final boolean mo34420a(C13268i iVar) {
        f29694U.lazySet(iVar, this);
        f29696c.lazySet(iVar, this);
        while (mo34422d() == this) {
            if (f29696c.compareAndSet(this, this, iVar)) {
                iVar.m40759b(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Object mo34422d() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C13274l)) {
                return obj;
            }
            ((C13274l) obj).mo34406a(this);
        }
    }

    /* renamed from: e */
    public final C13268i mo34423e() {
        return C13267h.m40757a(mo34422d());
    }

    /* renamed from: f */
    public final Object mo34424f() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C13275m) {
                return obj;
            }
            if (obj != null) {
                C13268i iVar = (C13268i) obj;
                if (iVar.mo34422d() == this) {
                    return obj;
                }
                m40758a(iVar, (C13274l) null);
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* renamed from: g */
    public final C13268i mo34425g() {
        return C13267h.m40757a(mo34424f());
    }

    /* renamed from: h */
    public final void mo34426h() {
        Object d;
        C13268i n = mo34499n();
        Object obj = this._next;
        if (obj != null) {
            C13268i iVar = ((C13275m) obj).f29709a;
            while (true) {
                C13268i iVar2 = null;
                while (true) {
                    Object d2 = iVar.mo34422d();
                    if (d2 instanceof C13275m) {
                        iVar.mo34499n();
                        iVar = ((C13275m) d2).f29709a;
                    } else {
                        d = n.mo34422d();
                        if (d instanceof C13275m) {
                            if (iVar2 != null) {
                                break;
                            }
                            n = C13267h.m40757a(n._prev);
                        } else if (d != this) {
                            if (d != null) {
                                C13268i iVar3 = (C13268i) d;
                                if (iVar3 != iVar) {
                                    C13268i iVar4 = iVar3;
                                    iVar2 = n;
                                    n = iVar4;
                                } else {
                                    return;
                                }
                            } else {
                                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (f29696c.compareAndSet(n, this, iVar)) {
                            return;
                        }
                    }
                }
                n.mo34499n();
                f29696c.compareAndSet(iVar2, n, ((C13275m) d).f29709a);
                n = iVar2;
            }
        } else {
            throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    /* renamed from: i */
    public final void mo34427i() {
        Object d = mo34422d();
        if (!(d instanceof C13275m)) {
            d = null;
        }
        C13275m mVar = (C13275m) d;
        if (mVar != null) {
            m40761c(mVar.f29709a);
            return;
        }
        throw new IllegalStateException("Must be invoked on a removed node".toString());
    }

    /* renamed from: j */
    public final boolean mo34428j() {
        return mo34422d() instanceof C13275m;
    }

    /* renamed from: k */
    public boolean mo34417k() {
        Object d;
        C13268i iVar;
        do {
            d = mo34422d();
            if ((d instanceof C13275m) || d == this) {
                return false;
            }
            if (d != null) {
                iVar = (C13268i) d;
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f29696c.compareAndSet(this, d, iVar.mo34500o()));
        m40761c(iVar);
        return true;
    }

    /* renamed from: l */
    public final C13268i mo34429l() {
        while (true) {
            Object d = mo34422d();
            if (d != null) {
                C13268i iVar = (C13268i) d;
                if (iVar == this) {
                    return null;
                }
                if (iVar.mo34417k()) {
                    return iVar;
                }
                iVar.mo34426h();
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m40759b(C13268i iVar) {
        Object obj;
        do {
            obj = iVar._prev;
            if ((obj instanceof C13275m) || mo34422d() != iVar) {
                return;
            }
        } while (!f29694U.compareAndSet(iVar, obj, this));
        if (!(mo34422d() instanceof C13275m)) {
            return;
        }
        if (obj != null) {
            iVar.m40758a((C13268i) obj, (C13274l) null);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    public final boolean mo34421a(C13268i iVar, C13268i iVar2) {
        f29694U.lazySet(iVar, this);
        f29696c.lazySet(iVar, iVar2);
        if (!f29696c.compareAndSet(this, iVar2, iVar)) {
            return false;
        }
        iVar.m40759b(iVar2);
        return true;
    }

    /* renamed from: a */
    public final int mo34419a(C13268i iVar, C13268i iVar2, C13269a aVar) {
        f29694U.lazySet(iVar, this);
        f29696c.lazySet(iVar, iVar2);
        aVar.f29697b = iVar2;
        if (!f29696c.compareAndSet(this, iVar2, aVar)) {
            return 0;
        }
        return aVar.mo34406a(this) == null ? 1 : 2;
    }

    /* renamed from: a */
    private final C13268i m40758a(C13268i iVar, C13274l lVar) {
        Object obj;
        while (true) {
            C13268i iVar2 = null;
            while (true) {
                obj = iVar._next;
                if (obj == lVar) {
                    return iVar;
                }
                if (obj instanceof C13274l) {
                    ((C13274l) obj).mo34406a(iVar);
                } else if (!(obj instanceof C13275m)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C13275m) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            iVar2 = iVar;
                            iVar = (C13268i) obj;
                        } else {
                            throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == iVar) {
                        return null;
                    } else {
                        if (f29694U.compareAndSet(this, obj2, iVar) && !(iVar._prev instanceof C13275m)) {
                            return null;
                        }
                    }
                } else if (iVar2 != null) {
                    break;
                } else {
                    iVar = C13267h.m40757a(iVar._prev);
                }
            }
            iVar.mo34499n();
            f29696c.compareAndSet(iVar2, iVar, ((C13275m) obj).f29709a);
            iVar = iVar2;
        }
    }
}
