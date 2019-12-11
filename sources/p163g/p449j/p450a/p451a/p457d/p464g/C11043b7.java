package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.b7 */
public final class C11043b7 extends AbstractList<String> implements C11358w4, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11358w4 f26084c;

    public C11043b7(C11358w4 w4Var) {
        this.f26084c = w4Var;
    }

    /* renamed from: a */
    public final void mo28321a(C11342v2 v2Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final Object mo28322e(int i) {
        return this.f26084c.mo28322e(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f26084c.get(i);
    }

    /* renamed from: i0 */
    public final C11358w4 mo28324i0() {
        return this;
    }

    public final Iterator<String> iterator() {
        return new C11078d7(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C11028a7(this, i);
    }

    /* renamed from: o0 */
    public final List<?> mo28327o0() {
        return this.f26084c.mo28327o0();
    }

    public final int size() {
        return this.f26084c.size();
    }
}
