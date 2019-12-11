package kotlin.p587i0;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.i0.b */
/* compiled from: Sequences.kt */
public final class C12765b<T> implements C12775h<T>, C12767c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12775h<T> f29427a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f29428b;

    /* renamed from: kotlin.i0.b$a */
    /* compiled from: Sequences.kt */
    public static final class C12766a implements Iterator<T>, C12872a {

        /* renamed from: U */
        private int f29429U;

        /* renamed from: c */
        private final Iterator<T> f29430c;

        C12766a(C12765b bVar) {
            this.f29430c = bVar.f29427a.iterator();
            this.f29429U = bVar.f29428b;
        }

        /* renamed from: b */
        private final void m39926b() {
            while (this.f29429U > 0 && this.f29430c.hasNext()) {
                this.f29430c.next();
                this.f29429U--;
            }
        }

        public boolean hasNext() {
            m39926b();
            return this.f29430c.hasNext();
        }

        public T next() {
            m39926b();
            return this.f29430c.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12765b(C12775h<? extends T> hVar, int i) {
        this.f29427a = hVar;
        this.f29428b = i;
        if (!(this.f29428b >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("count must be non-negative, but was ");
            sb.append(this.f29428b);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public Iterator<T> iterator() {
        return new C12766a(this);
    }

    /* renamed from: a */
    public C12775h<T> mo31085a(int i) {
        int i2 = this.f29428b + i;
        return i2 < 0 ? new C12765b(this, i) : new C12765b(this.f29427a, i2);
    }
}
