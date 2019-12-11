package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.ListIterator;

/* renamed from: g.j.a.a.d.g.a7 */
final class C11028a7 implements ListIterator<String> {

    /* renamed from: U */
    private final /* synthetic */ int f26050U;

    /* renamed from: V */
    private final /* synthetic */ C11043b7 f26051V;

    /* renamed from: c */
    private ListIterator<String> f26052c = this.f26051V.f26084c.listIterator(this.f26050U);

    C11028a7(C11043b7 b7Var, int i) {
        this.f26051V = b7Var;
        this.f26050U = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f26052c.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f26052c.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f26052c.next();
    }

    public final int nextIndex() {
        return this.f26052c.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f26052c.previous();
    }

    public final int previousIndex() {
        return this.f26052c.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
