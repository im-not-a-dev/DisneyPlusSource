package kotlin.p587i0;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.i0.r */
/* compiled from: Sequences.kt */
public final class C12795r<T, R> implements C12775h<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12775h<T> f29469a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Function1<T, R> f29470b;

    /* renamed from: kotlin.i0.r$a */
    /* compiled from: Sequences.kt */
    public static final class C12796a implements Iterator<R>, C12872a {

        /* renamed from: U */
        final /* synthetic */ C12795r f29471U;

        /* renamed from: c */
        private final Iterator<T> f29472c;

        C12796a(C12795r rVar) {
            this.f29471U = rVar;
            this.f29472c = rVar.f29469a.iterator();
        }

        public boolean hasNext() {
            return this.f29472c.hasNext();
        }

        public R next() {
            return this.f29471U.f29470b.invoke(this.f29472c.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12795r(C12775h<? extends T> hVar, Function1<? super T, ? extends R> function1) {
        this.f29469a = hVar;
        this.f29470b = function1;
    }

    public Iterator<R> iterator() {
        return new C12796a(this);
    }

    /* renamed from: a */
    public final <E> C12775h<E> mo31109a(Function1<? super R, ? extends Iterator<? extends E>> function1) {
        return new C12771f(this.f29469a, this.f29470b, function1);
    }
}
