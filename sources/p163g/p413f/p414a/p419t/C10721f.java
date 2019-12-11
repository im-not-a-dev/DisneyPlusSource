package p163g.p413f.p414a.p419t;

import com.bumptech.glide.load.C8117k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g.f.a.t.f */
/* compiled from: ResourceEncoderRegistry */
public class C10721f {

    /* renamed from: a */
    private final List<C10722a<?>> f25342a = new ArrayList();

    /* renamed from: g.f.a.t.f$a */
    /* compiled from: ResourceEncoderRegistry */
    private static final class C10722a<T> {

        /* renamed from: a */
        private final Class<T> f25343a;

        /* renamed from: b */
        final C8117k<T> f25344b;

        C10722a(Class<T> cls, C8117k<T> kVar) {
            this.f25343a = cls;
            this.f25344b = kVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo27685a(Class<?> cls) {
            return this.f25343a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo27684a(Class<Z> cls, C8117k<Z> kVar) {
        this.f25342a.add(new C10722a(cls, kVar));
    }

    /* renamed from: a */
    public synchronized <Z> C8117k<Z> mo27683a(Class<Z> cls) {
        int size = this.f25342a.size();
        for (int i = 0; i < size; i++) {
            C10722a aVar = (C10722a) this.f25342a.get(i);
            if (aVar.mo27685a(cls)) {
                return aVar.f25344b;
            }
        }
        return null;
    }
}
