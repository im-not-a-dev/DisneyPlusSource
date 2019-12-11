package p520io.reactivex.p531y.p536e.p542f;

import org.reactivestreams.C14313b;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

/* renamed from: io.reactivex.y.e.f.v */
/* compiled from: SingleInternalHelper */
public final class C12480v {

    /* renamed from: io.reactivex.y.e.f.v$a */
    /* compiled from: SingleInternalHelper */
    enum C12481a implements Function<SingleSource, C14313b> {
        INSTANCE;

        /* renamed from: a */
        public C14313b apply(SingleSource singleSource) {
            return new C12441f0(singleSource);
        }
    }

    /* renamed from: a */
    public static <T> Function<SingleSource<? extends T>, C14313b<? extends T>> m39198a() {
        return C12481a.INSTANCE;
    }
}
