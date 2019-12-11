package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.p491l.C11637i.C11639b;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.m */
/* compiled from: TypeAdapterRuntimeTypeWrapper */
final class C11648m<T> extends C11571v<T> {

    /* renamed from: a */
    private final C11547f f27148a;

    /* renamed from: b */
    private final C11571v<T> f27149b;

    /* renamed from: c */
    private final Type f27150c;

    C11648m(C11547f fVar, C11571v<T> vVar, Type type) {
        this.f27148a = fVar;
        this.f27149b = vVar;
        this.f27150c = type;
    }

    /* renamed from: a */
    public T mo29458a(C11533a aVar) throws IOException {
        return this.f27149b.mo29458a(aVar);
    }

    /* renamed from: a */
    public void mo29459a(C11536c cVar, T t) throws IOException {
        C11571v<T> vVar = this.f27149b;
        Type a = m37497a(this.f27150c, (Object) t);
        if (a != this.f27150c) {
            vVar = this.f27148a.mo29510a(C11689a.m37637a(a));
            if (vVar instanceof C11639b) {
                C11571v<T> vVar2 = this.f27149b;
                if (!(vVar2 instanceof C11639b)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.mo29459a(cVar, t);
    }

    /* renamed from: a */
    private Type m37497a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }
}
