package kotlin.p587i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.i0.f */
/* compiled from: Sequences.kt */
public final class C12771f<T, R, E> implements C12775h<E> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12775h<T> f29439a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Function1<T, R> f29440b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function1<R, Iterator<E>> f29441c;

    /* renamed from: kotlin.i0.f$a */
    /* compiled from: Sequences.kt */
    public static final class C12772a implements Iterator<E>, C12872a {

        /* renamed from: U */
        private Iterator<? extends E> f29442U;

        /* renamed from: V */
        final /* synthetic */ C12771f f29443V;

        /* renamed from: c */
        private final Iterator<T> f29444c;

        C12772a(C12771f fVar) {
            this.f29443V = fVar;
            this.f29444c = fVar.f29439a.iterator();
        }

        /* renamed from: b */
        private final boolean m39937b() {
            Iterator<? extends E> it = this.f29442U;
            if (it != null && !it.hasNext()) {
                this.f29442U = null;
            }
            while (true) {
                if (this.f29442U == null) {
                    if (this.f29444c.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.f29443V.f29441c.invoke(this.f29443V.f29440b.invoke(this.f29444c.next()));
                        if (it2.hasNext()) {
                            this.f29442U = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return m39937b();
        }

        public E next() {
            if (m39937b()) {
                Iterator<? extends E> it = this.f29442U;
                if (it != null) {
                    return it.next();
                }
                Intrinsics.throwNpe();
                throw null;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12771f(C12775h<? extends T> hVar, Function1<? super T, ? extends R> function1, Function1<? super R, ? extends Iterator<? extends E>> function12) {
        this.f29439a = hVar;
        this.f29440b = function1;
        this.f29441c = function12;
    }

    public Iterator<E> iterator() {
        return new C12772a(this);
    }
}
