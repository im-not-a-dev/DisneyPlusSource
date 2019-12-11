package kotlinx.coroutines.p597o2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.p575i.p576a.C12708h;
import kotlinx.coroutines.C13244h;
import kotlinx.coroutines.C13244h.C13245a;
import kotlinx.coroutines.C13249i;
import kotlinx.coroutines.C13291j;
import kotlinx.coroutines.C13396s0;
import kotlinx.coroutines.internal.C13266g;
import kotlinx.coroutines.internal.C13267h;
import kotlinx.coroutines.internal.C13268i;
import kotlinx.coroutines.internal.C13268i.C13269a;
import kotlinx.coroutines.internal.C13274l;
import kotlinx.coroutines.p596n2.C13367b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006$%&'()B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJT\u0010\u0015\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00032\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u0019\u0010\u001b\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR$\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, mo31007d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/selects/SelectClause2;", "", "", "locked", "<init>", "(Z)V", "owner", "holdsLock", "(Ljava/lang/Object;)Z", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "isLocked", "()Z", "isLockedEmptyQueueState$kotlinx_coroutines_core", "isLockedEmptyQueueState", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.o2.c */
/* compiled from: Mutex.kt */
public final class C13374c implements C13372b, C13367b<Object, C13372b> {

    /* renamed from: c */
    static final AtomicReferenceFieldUpdater f29859c = AtomicReferenceFieldUpdater.newUpdater(C13374c.class, Object.class, "_state");
    volatile Object _state;

    /* renamed from: kotlinx.coroutines.o2.c$a */
    /* compiled from: Mutex.kt */
    private static final class C13375a extends C13376b {

        /* renamed from: X */
        public final C13244h<C13145v> f29860X;

        public C13375a(Object obj, C13244h<? super C13145v> hVar) {
            super(obj);
            this.f29860X = hVar;
        }

        /* renamed from: b */
        public void mo34572b(Object obj) {
            this.f29860X.mo34386c(obj);
        }

        /* renamed from: m */
        public Object mo34418m() {
            return C13245a.m40701a(this.f29860X, C13145v.f29587a, null, 2, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LockCont[");
            sb.append(this.f29861W);
            sb.append(", ");
            sb.append(this.f29860X);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.o2.c$b */
    /* compiled from: Mutex.kt */
    private static abstract class C13376b extends C13268i implements C13396s0 {

        /* renamed from: W */
        public final Object f29861W;

        public C13376b(Object obj) {
            this.f29861W = obj;
        }

        /* renamed from: b */
        public abstract void mo34572b(Object obj);

        public final void dispose() {
            mo34417k();
        }

        /* renamed from: m */
        public abstract Object mo34418m();
    }

    /* renamed from: kotlinx.coroutines.o2.c$c */
    /* compiled from: Mutex.kt */
    private static final class C13377c extends C13266g {

        /* renamed from: W */
        public Object f29862W;

        public C13377c(Object obj) {
            this.f29862W = obj;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LockedQueue[");
            sb.append(this.f29862W);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.o2.c$d */
    /* compiled from: Mutex.kt */
    private static final class C13378d extends C13274l {

        /* renamed from: a */
        public final C13377c f29863a;

        public C13378d(C13377c cVar) {
            this.f29863a = cVar;
        }

        /* renamed from: a */
        public Object mo34406a(Object obj) {
            Object b = this.f29863a.mo34418m() ? C13380d.f29870e : this.f29863a;
            if (obj != null) {
                C13374c cVar = (C13374c) obj;
                C13374c.f29859c.compareAndSet(cVar, this, b);
                if (cVar._state == this.f29863a) {
                    return C13380d.f29866a;
                }
                return null;
            }
            throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
        }
    }

    /* renamed from: kotlinx.coroutines.o2.c$e */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C13379e extends C13269a {

        /* renamed from: d */
        final /* synthetic */ Object f29864d;

        /* renamed from: e */
        final /* synthetic */ C13374c f29865e;

        public C13379e(C13268i iVar, C13268i iVar2, Object obj, C13244h hVar, C13375a aVar, C13374c cVar, Object obj2) {
            this.f29864d = obj;
            this.f29865e = cVar;
            super(iVar2);
        }

        /* renamed from: a */
        public Object mo34408b(C13268i iVar) {
            if (this.f29865e._state == this.f29864d) {
                return null;
            }
            return C13267h.m40756a();
        }
    }

    public C13374c(boolean z) {
        this._state = z ? C13380d.f29869d : C13380d.f29870e;
    }

    /* renamed from: a */
    public Object mo34566a(Object obj, C12683c<? super C13145v> cVar) {
        if (mo34568a(obj)) {
            return C13145v.f29587a;
        }
        return mo34570b(obj, cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo34570b(Object obj, C12683c<? super C13145v> cVar) {
        Object obj2 = obj;
        C13249i iVar = new C13249i(C12697c.m39816a(cVar), 0);
        C13375a aVar = new C13375a(obj2, iVar);
        while (true) {
            Object obj3 = this._state;
            if (obj3 instanceof C13371a) {
                C13371a aVar2 = (C13371a) obj3;
                if (aVar2.f29858a != C13380d.f29868c) {
                    f29859c.compareAndSet(this, obj3, new C13377c(aVar2.f29858a));
                } else {
                    if (f29859c.compareAndSet(this, obj3, obj2 == null ? C13380d.f29869d : new C13371a(obj2))) {
                        C13145v vVar = C13145v.f29587a;
                        C12901a aVar3 = C12900n.f29540c;
                        C12900n.m40236a(vVar);
                        iVar.mo31039b(vVar);
                        break;
                    }
                }
            } else if (obj3 instanceof C13377c) {
                C13377c cVar2 = (C13377c) obj3;
                boolean z = true;
                if (cVar2.f29862W != obj2) {
                    C13379e eVar = new C13379e(aVar, aVar, obj3, iVar, aVar, this, obj);
                    while (true) {
                        Object f = cVar2.mo34424f();
                        if (f != null) {
                            int a = ((C13268i) f).mo34419a(aVar, cVar2, eVar);
                            if (a != 1) {
                                if (a == 2) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    }
                    if (z) {
                        C13291j.m40862a(iVar, aVar);
                        break;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Already locked by ");
                    sb.append(obj2);
                    throw new IllegalStateException(sb.toString().toString());
                }
            } else if (obj3 instanceof C13274l) {
                ((C13274l) obj3).mo34406a(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Illegal state ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        Object e = iVar.mo34396e();
        if (e == C12700d.m39820a()) {
            C12708h.m39847c(cVar);
        }
        return e;
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            String str = "Mutex[";
            if (obj instanceof C13371a) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(((C13371a) obj).f29858a);
                sb.append(']');
                return sb.toString();
            } else if (obj instanceof C13274l) {
                ((C13274l) obj).mo34406a(this);
            } else if (obj instanceof C13377c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(((C13377c) obj).f29862W);
                sb2.append(']');
                return sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Illegal state ");
                sb3.append(obj);
                throw new IllegalStateException(sb3.toString().toString());
            }
        }
    }

    /* renamed from: a */
    public boolean mo34567a() {
        while (true) {
            Object obj = this._state;
            boolean z = true;
            if (obj instanceof C13371a) {
                if (((C13371a) obj).f29858a == C13380d.f29868c) {
                    z = false;
                }
                return z;
            } else if (obj instanceof C13377c) {
                return true;
            } else {
                if (obj instanceof C13274l) {
                    ((C13274l) obj).mo34406a(this);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Illegal state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo34568a(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C13371a) {
                if (((C13371a) obj2).f29858a != C13380d.f29868c) {
                    return false;
                }
                if (f29859c.compareAndSet(this, obj2, obj == null ? C13380d.f29869d : new C13371a(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C13377c) {
                if (((C13377c) obj2).f29862W == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Already locked by ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            } else if (obj2 instanceof C13274l) {
                ((C13274l) obj2).mo34406a(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Illegal state ");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
    }

    /* renamed from: b */
    public void mo34569b(Object obj) {
        while (true) {
            Object obj2 = this._state;
            String str = " but expected ";
            String str2 = "Mutex is locked by ";
            boolean z = true;
            if (obj2 instanceof C13371a) {
                if (obj == null) {
                    if (((C13371a) obj2).f29858a == C13380d.f29868c) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    C13371a aVar = (C13371a) obj2;
                    if (aVar.f29858a != obj) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(aVar.f29858a);
                        sb.append(str);
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                if (f29859c.compareAndSet(this, obj2, C13380d.f29870e)) {
                    return;
                }
            } else if (obj2 instanceof C13274l) {
                ((C13274l) obj2).mo34406a(this);
            } else if (obj2 instanceof C13377c) {
                if (obj != null) {
                    C13377c cVar = (C13377c) obj2;
                    if (cVar.f29862W != obj) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(cVar.f29862W);
                        sb2.append(str);
                        sb2.append(obj);
                        throw new IllegalStateException(sb2.toString().toString());
                    }
                }
                C13377c cVar2 = (C13377c) obj2;
                C13268i l = cVar2.mo34429l();
                if (l == null) {
                    C13378d dVar = new C13378d(cVar2);
                    if (f29859c.compareAndSet(this, obj2, dVar) && dVar.mo34406a(this) == null) {
                        return;
                    }
                } else {
                    C13376b bVar = (C13376b) l;
                    Object m = bVar.mo34418m();
                    if (m != null) {
                        Object obj3 = bVar.f29861W;
                        if (obj3 == null) {
                            obj3 = C13380d.f29867b;
                        }
                        cVar2.f29862W = obj3;
                        bVar.mo34572b(m);
                        return;
                    }
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Illegal state ");
                sb3.append(obj2);
                throw new IllegalStateException(sb3.toString().toString());
            }
        }
    }
}
