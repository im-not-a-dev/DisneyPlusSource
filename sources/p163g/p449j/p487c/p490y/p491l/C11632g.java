package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11559l;
import p163g.p449j.p487c.C11564q;
import p163g.p449j.p487c.C11567t;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.C11580b;
import p163g.p449j.p487c.p490y.C11584c;
import p163g.p449j.p487c.p490y.C11601e;
import p163g.p449j.p487c.p490y.C11611h;
import p163g.p449j.p487c.p490y.C11613j;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.g */
/* compiled from: MapTypeAdapterFactory */
public final class C11632g implements C11573w {

    /* renamed from: U */
    final boolean f27113U;

    /* renamed from: c */
    private final C11584c f27114c;

    /* renamed from: g.j.c.y.l.g$a */
    /* compiled from: MapTypeAdapterFactory */
    private final class C11633a<K, V> extends C11571v<Map<K, V>> {

        /* renamed from: a */
        private final C11571v<K> f27115a;

        /* renamed from: b */
        private final C11571v<V> f27116b;

        /* renamed from: c */
        private final C11611h<? extends Map<K, V>> f27117c;

        public C11633a(C11547f fVar, Type type, C11571v<K> vVar, Type type2, C11571v<V> vVar2, C11611h<? extends Map<K, V>> hVar) {
            this.f27115a = new C11648m(fVar, vVar, type);
            this.f27116b = new C11648m(fVar, vVar2, type2);
            this.f27117c = hVar;
        }

        /* renamed from: a */
        public Map<K, V> m37464a(C11533a aVar) throws IOException {
            C11535b peek = aVar.peek();
            if (peek == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            Map<K, V> map = (Map) this.f27117c.mo29593a();
            String str = "duplicate key: ";
            if (peek == C11535b.BEGIN_ARRAY) {
                aVar.mo29462a();
                while (aVar.mo29469f()) {
                    aVar.mo29462a();
                    Object a = this.f27115a.mo29458a(aVar);
                    if (map.put(a, this.f27116b.mo29458a(aVar)) == null) {
                        aVar.mo29467d();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(a);
                        throw new C11567t(sb.toString());
                    }
                }
                aVar.mo29467d();
            } else {
                aVar.mo29464b();
                while (aVar.mo29469f()) {
                    C11601e.f27060a.mo29483a(aVar);
                    Object a2 = this.f27115a.mo29458a(aVar);
                    if (map.put(a2, this.f27116b.mo29458a(aVar)) != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(a2);
                        throw new C11567t(sb2.toString());
                    }
                }
                aVar.mo29468e();
            }
            return map;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.mo29503h();
            } else if (!C11632g.this.f27113U) {
                cVar.mo29489b();
                for (Entry entry : map.entrySet()) {
                    cVar.mo29496e(String.valueOf(entry.getKey()));
                    this.f27116b.mo29459a(cVar, entry.getValue());
                }
                cVar.mo29494d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Entry entry2 : map.entrySet()) {
                    C11559l a = this.f27115a.mo29566a(entry2.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry2.getValue());
                    z |= a.mo29541e() || a.mo29543g();
                }
                if (z) {
                    cVar.mo29484a();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo29484a();
                        C11613j.m37403a((C11559l) arrayList.get(i), cVar);
                        this.f27116b.mo29459a(cVar, arrayList2.get(i));
                        cVar.mo29491c();
                        i++;
                    }
                    cVar.mo29491c();
                } else {
                    cVar.mo29489b();
                    int size2 = arrayList.size();
                    while (i < size2) {
                        cVar.mo29496e(m37462a((C11559l) arrayList.get(i)));
                        this.f27116b.mo29459a(cVar, arrayList2.get(i));
                        i++;
                    }
                    cVar.mo29494d();
                }
            }
        }

        /* renamed from: a */
        private String m37462a(C11559l lVar) {
            if (lVar.mo29544h()) {
                C11564q d = lVar.mo29540d();
                if (d.mo29563q()) {
                    return String.valueOf(d.mo29560n());
                }
                if (d.mo29562p()) {
                    return Boolean.toString(d.mo29555i());
                }
                if (d.mo29564r()) {
                    return d.mo29561o();
                }
                throw new AssertionError();
            } else if (lVar.mo29542f()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }
    }

    public C11632g(C11584c cVar, boolean z) {
        this.f27114c = cVar;
        this.f27113U = z;
    }

    /* renamed from: a */
    public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
        Type b = aVar.mo29702b();
        if (!Map.class.isAssignableFrom(aVar.mo29701a())) {
            return null;
        }
        Type[] b2 = C11580b.m37345b(b, C11580b.m37348e(b));
        C11547f fVar2 = fVar;
        C11633a aVar2 = new C11633a(fVar2, b2[0], m37460a(fVar, b2[0]), b2[1], fVar.mo29510a(C11689a.m37637a(b2[1])), this.f27114c.mo29591a(aVar));
        return aVar2;
    }

    /* renamed from: a */
    private C11571v<?> m37460a(C11547f fVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C11649n.f27182f;
        }
        return fVar.mo29510a(C11689a.m37637a(type));
    }
}
