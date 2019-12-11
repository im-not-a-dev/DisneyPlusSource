package p163g.p413f.p414a.p419t;

import com.bumptech.glide.load.C8108d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g.f.a.t.a */
/* compiled from: EncoderRegistry */
public class C10714a {

    /* renamed from: a */
    private final List<C10715a<?>> f25328a = new ArrayList();

    /* renamed from: g.f.a.t.a$a */
    /* compiled from: EncoderRegistry */
    private static final class C10715a<T> {

        /* renamed from: a */
        private final Class<T> f25329a;

        /* renamed from: b */
        final C8108d<T> f25330b;

        C10715a(Class<T> cls, C8108d<T> dVar) {
            this.f25329a = cls;
            this.f25330b = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo27670a(Class<?> cls) {
            return this.f25329a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> C8108d<T> mo27668a(Class<T> cls) {
        for (C10715a aVar : this.f25328a) {
            if (aVar.mo27670a(cls)) {
                return aVar.f25330b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <T> void mo27669a(Class<T> cls, C8108d<T> dVar) {
        this.f25328a.add(new C10715a(cls, dVar));
    }
}
