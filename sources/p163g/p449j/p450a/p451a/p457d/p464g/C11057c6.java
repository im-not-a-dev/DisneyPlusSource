package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: g.j.a.a.d.g.c6 */
final class C11057c6<E> extends C11256p2<E> {

    /* renamed from: V */
    private static final C11057c6<Object> f26101V;

    /* renamed from: U */
    private final List<E> f26102U;

    static {
        C11057c6<Object> c6Var = new C11057c6<>(new ArrayList(0));
        f26101V = c6Var;
        c6Var.mo28708g0();
    }

    private C11057c6(List<E> list) {
        this.f26102U = list;
    }

    /* renamed from: c */
    public static <E> C11057c6<E> m34841c() {
        return f26101V;
    }

    /* renamed from: a */
    public final /* synthetic */ C11216m4 mo28257a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f26102U);
            return new C11057c6(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        mo28823b();
        this.f26102U.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f26102U.get(i);
    }

    public final E remove(int i) {
        mo28823b();
        E remove = this.f26102U.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo28823b();
        E e2 = this.f26102U.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f26102U.size();
    }
}
