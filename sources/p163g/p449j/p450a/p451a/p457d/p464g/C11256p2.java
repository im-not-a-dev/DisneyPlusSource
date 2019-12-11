package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.p2 */
abstract class C11256p2<E> extends AbstractList<E> implements C11216m4<E> {

    /* renamed from: c */
    private boolean f26431c = true;

    C11256p2() {
    }

    public boolean add(E e) {
        mo28823b();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo28823b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28823b() {
        if (!this.f26431c) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo28823b();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g0 */
    public final void mo28708g0() {
        this.f26431c = false;
    }

    /* renamed from: h0 */
    public boolean mo28709h0() {
        return this.f26431c;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo28823b();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo28823b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo28823b();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo28823b();
        return super.addAll(i, collection);
    }
}
