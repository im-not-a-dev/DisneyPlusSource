package p163g.p500m.p501a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import p163g.p500m.p501a.C11725h.C11732g;

/* renamed from: g.m.a.b */
/* compiled from: ArrayJsonAdapter */
final class C11709b extends C11725h<Object> {

    /* renamed from: c */
    public static final C11732g f27270c = new C11710a();

    /* renamed from: a */
    private final Class<?> f27271a;

    /* renamed from: b */
    private final C11725h<Object> f27272b;

    /* renamed from: g.m.a.b$a */
    /* compiled from: ArrayJsonAdapter */
    class C11710a implements C11732g {
        C11710a() {
        }

        /* renamed from: a */
        public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
            Type a = C11780y.m37895a(type);
            if (a != null && set.isEmpty()) {
                return new C11709b(C11780y.m37902d(a), vVar.mo29867a(a)).nullSafe();
            }
            return null;
        }
    }

    C11709b(Class<?> cls, C11725h<Object> hVar) {
        this.f27271a = cls;
        this.f27272b = hVar;
    }

    public Object fromJson(C11737m mVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        mVar.mo29760a();
        while (mVar.mo29770f()) {
            arrayList.add(this.f27272b.fromJson(mVar));
        }
        mVar.mo29766c();
        Object newInstance = Array.newInstance(this.f27271a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public void toJson(C11747s sVar, Object obj) throws IOException {
        sVar.mo29787a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f27272b.toJson(sVar, Array.get(obj, i));
        }
        sVar.mo29794d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27272b);
        sb.append(".array()");
        return sb.toString();
    }
}
