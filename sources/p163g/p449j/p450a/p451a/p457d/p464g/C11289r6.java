package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: g.j.a.a.d.g.r6 */
final class C11289r6 implements Iterator<Entry<K, V>> {

    /* renamed from: U */
    private boolean f26478U;

    /* renamed from: V */
    private Iterator<Entry<K, V>> f26479V;

    /* renamed from: W */
    private final /* synthetic */ C11169j6 f26480W;

    /* renamed from: c */
    private int f26481c;

    private C11289r6(C11169j6 j6Var) {
        this.f26480W = j6Var;
        this.f26481c = -1;
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m36048a() {
        if (this.f26479V == null) {
            this.f26479V = this.f26480W.f26272V.entrySet().iterator();
        }
        return this.f26479V;
    }

    public final boolean hasNext() {
        if (this.f26481c + 1 < this.f26480W.f26271U.size() || (!this.f26480W.f26272V.isEmpty() && m36048a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f26478U = true;
        int i = this.f26481c + 1;
        this.f26481c = i;
        if (i < this.f26480W.f26271U.size()) {
            return (Entry) this.f26480W.f26271U.get(this.f26481c);
        }
        return (Entry) m36048a().next();
    }

    public final void remove() {
        if (this.f26478U) {
            this.f26478U = false;
            this.f26480W.m35414f();
            if (this.f26481c < this.f26480W.f26271U.size()) {
                C11169j6 j6Var = this.f26480W;
                int i = this.f26481c;
                this.f26481c = i - 1;
                j6Var.m35411c(i);
                return;
            }
            m36048a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ C11289r6(C11169j6 j6Var, C11155i6 i6Var) {
        this(j6Var);
    }
}
