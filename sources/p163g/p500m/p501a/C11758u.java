package p163g.p500m.p501a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p163g.p500m.p501a.C11725h.C11732g;

/* renamed from: g.m.a.u */
/* compiled from: MapJsonAdapter */
final class C11758u<K, V> extends C11725h<Map<K, V>> {

    /* renamed from: c */
    public static final C11732g f27379c = new C11759a();

    /* renamed from: a */
    private final C11725h<K> f27380a;

    /* renamed from: b */
    private final C11725h<V> f27381b;

    /* renamed from: g.m.a.u$a */
    /* compiled from: MapJsonAdapter */
    class C11759a implements C11732g {
        C11759a() {
        }

        /* renamed from: a */
        public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
            if (!set.isEmpty()) {
                return null;
            }
            Class<Map> d = C11780y.m37902d(type);
            if (d != Map.class) {
                return null;
            }
            Type[] b = C11780y.m37900b(type, d);
            return new C11758u(vVar, b[0], b[1]).nullSafe();
        }
    }

    C11758u(C11760v vVar, Type type, Type type2) {
        this.f27380a = vVar.mo29867a(type);
        this.f27381b = vVar.mo29867a(type2);
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Map<K, V> map) throws IOException {
        sVar.mo29791b();
        for (Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                sVar.mo29819k();
                this.f27380a.toJson(sVar, entry.getKey());
                this.f27381b.toJson(sVar, entry.getValue());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Map key is null at ");
                sb.append(sVar.mo29818j0());
                throw new C11734j(sb.toString());
            }
        }
        sVar.mo29795e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonAdapter(");
        sb.append(this.f27380a);
        sb.append("=");
        sb.append(this.f27381b);
        sb.append(")");
        return sb.toString();
    }

    public Map<K, V> fromJson(C11737m mVar) throws IOException {
        C11748t tVar = new C11748t();
        mVar.mo29763b();
        while (mVar.mo29770f()) {
            mVar.mo29780o();
            Object fromJson = this.f27380a.fromJson(mVar);
            Object fromJson2 = this.f27381b.fromJson(mVar);
            Object put = tVar.put(fromJson, fromJson2);
            if (put != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Map key '");
                sb.append(fromJson);
                sb.append("' has multiple values at path ");
                sb.append(mVar.mo29775j0());
                sb.append(": ");
                sb.append(put);
                sb.append(" and ");
                sb.append(fromJson2);
                throw new C11734j(sb.toString());
            }
        }
        mVar.mo29767d();
        return tVar;
    }
}
