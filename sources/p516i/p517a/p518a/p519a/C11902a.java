package p516i.p517a.p518a.p519a;

import org.reactivestreams.C14313b;
import p520io.reactivex.C11956j;
import p520io.reactivex.Flowable;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: i.a.a.a.a */
/* compiled from: FlowableTransformers */
public final class C11902a {
    /* renamed from: a */
    public static <T> C11956j<T, T> m38137a(C14313b<Boolean> bVar, boolean z) {
        return m38138a(bVar, z, Flowable.m38208h());
    }

    /* renamed from: a */
    public static <T> C11956j<T, T> m38138a(C14313b<Boolean> bVar, boolean z, int i) {
        C12036b.m38663a(bVar, "other is null");
        C12036b.m38660a(i, "bufferSize");
        return new C11903b(null, bVar, z, i);
    }
}
