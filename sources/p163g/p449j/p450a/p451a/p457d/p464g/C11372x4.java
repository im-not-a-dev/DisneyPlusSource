package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.j.a.a.d.g.x4 */
public final class C11372x4 extends C11256p2<String> implements C11358w4, RandomAccess {

    /* renamed from: V */
    private static final C11372x4 f26604V;

    /* renamed from: U */
    private final List<Object> f26605U;

    static {
        C11372x4 x4Var = new C11372x4();
        f26604V = x4Var;
        x4Var.mo28708g0();
    }

    public C11372x4() {
        this(10);
    }

    /* renamed from: a */
    public final void mo28321a(C11342v2 v2Var) {
        mo28823b();
        this.f26605U.add(v2Var);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo28823b();
        this.f26605U.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        mo28823b();
        this.f26605U.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final Object mo28322e(int i) {
        return this.f26605U.get(i);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f26605U.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C11342v2) {
            C11342v2 v2Var = (C11342v2) obj;
            String b = v2Var.mo29070b();
            if (v2Var.mo28514c()) {
                this.f26605U.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        String c = C11111f4.m35156c(bArr);
        if (C11111f4.m35155b(bArr)) {
            this.f26605U.set(i, c);
        }
        return c;
    }

    /* renamed from: i0 */
    public final C11358w4 mo28324i0() {
        return mo28709h0() ? new C11043b7(this) : this;
    }

    /* renamed from: o0 */
    public final List<?> mo28327o0() {
        return Collections.unmodifiableList(this.f26605U);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo28823b();
        return m36705a(this.f26605U.set(i, str));
    }

    public final int size() {
        return this.f26605U.size();
    }

    public C11372x4(int i) {
        this(new ArrayList<>(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo28823b();
        if (collection instanceof C11358w4) {
            collection = ((C11358w4) collection).mo28327o0();
        }
        boolean addAll = this.f26605U.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        mo28823b();
        Object remove = this.f26605U.remove(i);
        this.modCount++;
        return m36705a(remove);
    }

    private C11372x4(ArrayList<Object> arrayList) {
        this.f26605U = arrayList;
    }

    /* renamed from: a */
    private static String m36705a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C11342v2) {
            return ((C11342v2) obj).mo29070b();
        }
        return C11111f4.m35156c((byte[]) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C11216m4 mo28257a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f26605U);
            return new C11372x4(arrayList);
        }
        throw new IllegalArgumentException();
    }
}
