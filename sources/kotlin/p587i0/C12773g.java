package kotlin.p587i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.i0.g */
/* compiled from: Sequences.kt */
final class C12773g<T> implements C12775h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Function0<T> f29445a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Function1<T, T> f29446b;

    /* renamed from: kotlin.i0.g$a */
    /* compiled from: Sequences.kt */
    public static final class C12774a implements Iterator<T>, C12872a {

        /* renamed from: U */
        private int f29447U = -2;

        /* renamed from: V */
        final /* synthetic */ C12773g f29448V;

        /* renamed from: c */
        private T f29449c;

        C12774a(C12773g gVar) {
            this.f29448V = gVar;
        }

        /* renamed from: b */
        private final void m39940b() {
            T t;
            if (this.f29447U == -2) {
                t = this.f29448V.f29445a.invoke();
            } else {
                Function1 b = this.f29448V.f29446b;
                T t2 = this.f29449c;
                if (t2 != null) {
                    t = b.invoke(t2);
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            }
            this.f29449c = t;
            this.f29447U = this.f29449c == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f29447U < 0) {
                m39940b();
            }
            return this.f29447U == 1;
        }

        public T next() {
            if (this.f29447U < 0) {
                m39940b();
            }
            if (this.f29447U != 0) {
                T t = this.f29449c;
                if (t != null) {
                    this.f29447U = -1;
                    return t;
                }
                throw new C13142s("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12773g(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        this.f29445a = function0;
        this.f29446b = function1;
    }

    public Iterator<T> iterator() {
        return new C12774a(this);
    }
}
