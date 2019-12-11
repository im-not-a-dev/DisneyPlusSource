package kotlinx.coroutines.p597o2;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.p573a0.C12683c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H&J\u001d\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H&J\u0014\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R \u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo31007d2 = {"Lkotlinx/coroutines/sync/Mutex;", "", "isLocked", "", "()Z", "onLock", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "holdsLock", "owner", "lock", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "unlock", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.o2.b */
/* compiled from: Mutex.kt */
public interface C13372b {

    /* renamed from: kotlinx.coroutines.o2.b$a */
    /* compiled from: Mutex.kt */
    public static final class C13373a {
        /* renamed from: a */
        public static /* synthetic */ boolean m41098a(C13372b bVar, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return bVar.mo34568a(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        /* renamed from: b */
        public static /* synthetic */ void m41099b(C13372b bVar, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                bVar.mo34569b(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }

        /* renamed from: a */
        public static /* synthetic */ Object m41097a(C13372b bVar, Object obj, C12683c cVar, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return bVar.mo34566a(obj, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }
    }

    /* renamed from: a */
    Object mo34566a(Object obj, C12683c<? super C13145v> cVar);

    /* renamed from: a */
    boolean mo34567a();

    /* renamed from: a */
    boolean mo34568a(Object obj);

    /* renamed from: b */
    void mo34569b(Object obj);
}
