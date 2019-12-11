package kotlin.p587i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.i0.q */
/* compiled from: Sequences.kt */
public final class C12793q<T> implements C12775h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12775h<T> f29463a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Function1<T, Boolean> f29464b;

    /* renamed from: kotlin.i0.q$a */
    /* compiled from: Sequences.kt */
    public static final class C12794a implements Iterator<T>, C12872a {

        /* renamed from: U */
        private int f29465U = -1;

        /* renamed from: V */
        private T f29466V;

        /* renamed from: W */
        final /* synthetic */ C12793q f29467W;

        /* renamed from: c */
        private final Iterator<T> f29468c;

        C12794a(C12793q qVar) {
            this.f29467W = qVar;
            this.f29468c = qVar.f29463a.iterator();
        }

        /* renamed from: b */
        private final void m40005b() {
            if (this.f29468c.hasNext()) {
                T next = this.f29468c.next();
                if (((Boolean) this.f29467W.f29464b.invoke(next)).booleanValue()) {
                    this.f29465U = 1;
                    this.f29466V = next;
                    return;
                }
            }
            this.f29465U = 0;
        }

        public boolean hasNext() {
            if (this.f29465U == -1) {
                m40005b();
            }
            return this.f29465U == 1;
        }

        public T next() {
            if (this.f29465U == -1) {
                m40005b();
            }
            if (this.f29465U != 0) {
                T t = this.f29466V;
                this.f29466V = null;
                this.f29465U = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12793q(C12775h<? extends T> hVar, Function1<? super T, Boolean> function1) {
        this.f29463a = hVar;
        this.f29464b = function1;
    }

    public Iterator<T> iterator() {
        return new C12794a(this);
    }
}
