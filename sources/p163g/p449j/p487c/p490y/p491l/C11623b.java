package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.C11580b;
import p163g.p449j.p487c.p490y.C11584c;
import p163g.p449j.p487c.p490y.C11611h;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.b */
/* compiled from: CollectionTypeAdapterFactory */
public final class C11623b implements C11573w {

    /* renamed from: c */
    private final C11584c f27096c;

    /* renamed from: g.j.c.y.l.b$a */
    /* compiled from: CollectionTypeAdapterFactory */
    private static final class C11624a<E> extends C11571v<Collection<E>> {

        /* renamed from: a */
        private final C11571v<E> f27097a;

        /* renamed from: b */
        private final C11611h<? extends Collection<E>> f27098b;

        public C11624a(C11547f fVar, Type type, C11571v<E> vVar, C11611h<? extends Collection<E>> hVar) {
            this.f27097a = new C11648m(fVar, vVar, type);
            this.f27098b = hVar;
        }

        /* renamed from: a */
        public Collection<E> m37416a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            Collection<E> collection = (Collection) this.f27098b.mo29593a();
            aVar.mo29462a();
            while (aVar.mo29469f()) {
                collection.add(this.f27097a.mo29458a(aVar));
            }
            aVar.mo29467d();
            return collection;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.mo29503h();
                return;
            }
            cVar.mo29484a();
            for (E a : collection) {
                this.f27097a.mo29459a(cVar, a);
            }
            cVar.mo29491c();
        }
    }

    public C11623b(C11584c cVar) {
        this.f27096c = cVar;
    }

    /* renamed from: a */
    public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
        Type b = aVar.mo29702b();
        Class a = aVar.mo29701a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type a2 = C11580b.m37336a(b, a);
        return new C11624a(fVar, a2, fVar.mo29510a(C11689a.m37637a(a2)), this.f27096c.mo29591a(aVar));
    }
}
