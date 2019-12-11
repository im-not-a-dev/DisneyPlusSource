package androidx.work.impl.p008l.p009e;

import androidx.work.impl.p008l.C1075a;
import androidx.work.impl.p008l.p010f.C1092d;
import androidx.work.impl.p011m.C1111j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.l.e.c */
/* compiled from: ConstraintController */
public abstract class C1081c<T> implements C1075a<T> {

    /* renamed from: a */
    private final List<String> f4237a = new ArrayList();

    /* renamed from: b */
    private T f4238b;

    /* renamed from: c */
    private C1092d<T> f4239c;

    /* renamed from: d */
    private C1082a f4240d;

    /* renamed from: androidx.work.impl.l.e.c$a */
    /* compiled from: ConstraintController */
    public interface C1082a {
        /* renamed from: a */
        void mo5802a(List<String> list);

        /* renamed from: b */
        void mo5804b(List<String> list);
    }

    C1081c(C1092d<T> dVar) {
        this.f4239c = dVar;
    }

    /* renamed from: b */
    private void m5744b() {
        if (!this.f4237a.isEmpty() && this.f4240d != null) {
            T t = this.f4238b;
            if (t == null || mo5808b(t)) {
                this.f4240d.mo5804b(this.f4237a);
            } else {
                this.f4240d.mo5802a(this.f4237a);
            }
        }
    }

    /* renamed from: a */
    public void mo5811a(C1082a aVar) {
        if (this.f4240d != aVar) {
            this.f4240d = aVar;
            m5744b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo5806a(C1111j jVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo5808b(T t);

    /* renamed from: a */
    public void mo5812a(List<C1111j> list) {
        this.f4237a.clear();
        for (C1111j jVar : list) {
            if (mo5806a(jVar)) {
                this.f4237a.add(jVar.f4280a);
            }
        }
        if (this.f4237a.isEmpty()) {
            this.f4239c.mo5827b(this);
        } else {
            this.f4239c.mo5825a((C1075a<T>) this);
        }
        m5744b();
    }

    /* renamed from: a */
    public void mo5810a() {
        if (!this.f4237a.isEmpty()) {
            this.f4237a.clear();
            this.f4239c.mo5827b(this);
        }
    }

    /* renamed from: a */
    public boolean mo5813a(String str) {
        T t = this.f4238b;
        return t != null && mo5808b(t) && this.f4237a.contains(str);
    }

    /* renamed from: a */
    public void mo5793a(T t) {
        this.f4238b = t;
        m5744b();
    }
}
