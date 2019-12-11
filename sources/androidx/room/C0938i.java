package androidx.room;

import androidx.room.InvalidationTracker.C0911c;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p520io.reactivex.C11907a;
import p520io.reactivex.C11943f;
import p520io.reactivex.C11953g;
import p520io.reactivex.C11969r;
import p520io.reactivex.Flowable;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

/* renamed from: androidx.room.i */
/* compiled from: RxRoom */
public class C0938i {

    /* renamed from: a */
    public static final Object f3748a = new Object();

    /* renamed from: androidx.room.i$a */
    /* compiled from: RxRoom */
    static class C0939a implements C11953g<Object> {

        /* renamed from: a */
        final /* synthetic */ String[] f3749a;

        /* renamed from: b */
        final /* synthetic */ RoomDatabase f3750b;

        /* renamed from: androidx.room.i$a$a */
        /* compiled from: RxRoom */
        class C0940a extends C0911c {

            /* renamed from: b */
            final /* synthetic */ C11943f f3751b;

            C0940a(C0939a aVar, String[] strArr, C11943f fVar) {
                this.f3751b = fVar;
                super(strArr);
            }

            /* renamed from: a */
            public void mo5195a(Set<String> set) {
                if (!this.f3751b.isCancelled()) {
                    this.f3751b.onNext(C0938i.f3748a);
                }
            }
        }

        /* renamed from: androidx.room.i$a$b */
        /* compiled from: RxRoom */
        class C0941b implements C11945a {

            /* renamed from: a */
            final /* synthetic */ C0911c f3752a;

            C0941b(C0911c cVar) {
                this.f3752a = cVar;
            }

            public void run() throws Exception {
                C0939a.this.f3750b.getInvalidationTracker().mo5187b(this.f3752a);
            }
        }

        C0939a(String[] strArr, RoomDatabase roomDatabase) {
            this.f3749a = strArr;
            this.f3750b = roomDatabase;
        }

        /* renamed from: a */
        public void mo5273a(C11943f<Object> fVar) throws Exception {
            C0940a aVar = new C0940a(this, this.f3749a, fVar);
            if (!fVar.isCancelled()) {
                this.f3750b.getInvalidationTracker().mo5182a((C0911c) aVar);
                fVar.mo30260a(C11929b.m38491a((C11945a) new C0941b(aVar)));
            }
            if (!fVar.isCancelled()) {
                fVar.onNext(C0938i.f3748a);
            }
        }
    }

    /* renamed from: androidx.room.i$b */
    /* compiled from: RxRoom */
    static class C0942b implements Function<Object, MaybeSource<T>> {

        /* renamed from: c */
        final /* synthetic */ Maybe f3754c;

        C0942b(Maybe maybe) {
            this.f3754c = maybe;
        }

        public MaybeSource<T> apply(Object obj) throws Exception {
            return this.f3754c;
        }
    }

    /* renamed from: a */
    public static Flowable<Object> m5150a(RoomDatabase roomDatabase, String... strArr) {
        return Flowable.m38201a((C11953g<T>) new C0939a<T>(strArr, roomDatabase), C11907a.LATEST);
    }

    /* renamed from: a */
    public static <T> Flowable<T> m5149a(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<T> callable) {
        C11969r a = C11934b.m38499a(m5151a(roomDatabase, z));
        return m5150a(roomDatabase, strArr).mo30086b(a).mo30092c(a).mo30071a(a).mo30090c((Function<? super T, ? extends MaybeSource<? extends R>>) new C0942b<Object,Object>(Maybe.m38257b(callable)));
    }

    /* renamed from: a */
    private static Executor m5151a(RoomDatabase roomDatabase, boolean z) {
        if (z) {
            return roomDatabase.getTransactionExecutor();
        }
        return roomDatabase.getQueryExecutor();
    }
}
