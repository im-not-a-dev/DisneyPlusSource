package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p163g.p449j.p487c.C11546e;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11567t;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p489x.C11575b;
import p163g.p449j.p487c.p489x.C11576c;
import p163g.p449j.p487c.p490y.C11580b;
import p163g.p449j.p487c.p490y.C11584c;
import p163g.p449j.p487c.p490y.C11599d;
import p163g.p449j.p487c.p490y.C11611h;
import p163g.p449j.p487c.p490y.C11612i;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.i */
/* compiled from: ReflectiveTypeAdapterFactory */
public final class C11637i implements C11573w {

    /* renamed from: U */
    private final C11546e f27122U;

    /* renamed from: V */
    private final C11599d f27123V;

    /* renamed from: W */
    private final C11627d f27124W;

    /* renamed from: c */
    private final C11584c f27125c;

    /* renamed from: g.j.c.y.l.i$a */
    /* compiled from: ReflectiveTypeAdapterFactory */
    class C11638a extends C11640c {

        /* renamed from: d */
        final /* synthetic */ Field f27126d;

        /* renamed from: e */
        final /* synthetic */ boolean f27127e;

        /* renamed from: f */
        final /* synthetic */ C11571v f27128f;

        /* renamed from: g */
        final /* synthetic */ C11547f f27129g;

        /* renamed from: h */
        final /* synthetic */ C11689a f27130h;

        /* renamed from: i */
        final /* synthetic */ boolean f27131i;

        C11638a(C11637i iVar, String str, boolean z, boolean z2, Field field, boolean z3, C11571v vVar, C11547f fVar, C11689a aVar, boolean z4) {
            this.f27126d = field;
            this.f27127e = z3;
            this.f27128f = vVar;
            this.f27129g = fVar;
            this.f27130h = aVar;
            this.f27131i = z4;
            super(str, z, z2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29663a(C11536c cVar, Object obj) throws IOException, IllegalAccessException {
            C11571v vVar;
            Object obj2 = this.f27126d.get(obj);
            if (this.f27127e) {
                vVar = this.f27128f;
            } else {
                vVar = new C11648m(this.f27129g, this.f27128f, this.f27130h.mo29702b());
            }
            vVar.mo29459a(cVar, obj2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29662a(C11533a aVar, Object obj) throws IOException, IllegalAccessException {
            Object a = this.f27128f.mo29458a(aVar);
            if (a != null || !this.f27131i) {
                this.f27126d.set(obj, a);
            }
        }

        /* renamed from: a */
        public boolean mo29664a(Object obj) throws IOException, IllegalAccessException {
            boolean z = false;
            if (!this.f27135b) {
                return false;
            }
            if (this.f27126d.get(obj) != obj) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: g.j.c.y.l.i$b */
    /* compiled from: ReflectiveTypeAdapterFactory */
    public static final class C11639b<T> extends C11571v<T> {

        /* renamed from: a */
        private final C11611h<T> f27132a;

        /* renamed from: b */
        private final Map<String, C11640c> f27133b;

        C11639b(C11611h<T> hVar, Map<String, C11640c> map) {
            this.f27132a = hVar;
            this.f27133b = map;
        }

        /* renamed from: a */
        public T mo29458a(C11533a aVar) throws IOException {
            if (aVar.peek() == C11535b.NULL) {
                aVar.mo29478n();
                return null;
            }
            T a = this.f27132a.mo29593a();
            try {
                aVar.mo29464b();
                while (aVar.mo29469f()) {
                    C11640c cVar = (C11640c) this.f27133b.get(aVar.mo29477m());
                    if (cVar != null) {
                        if (cVar.f27136c) {
                            cVar.mo29662a(aVar, (Object) a);
                        }
                    }
                    aVar.mo29480p();
                }
                aVar.mo29468e();
                return a;
            } catch (IllegalStateException e) {
                throw new C11567t((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo29503h();
                return;
            }
            cVar.mo29489b();
            try {
                for (C11640c cVar2 : this.f27133b.values()) {
                    if (cVar2.mo29664a(t)) {
                        cVar.mo29496e(cVar2.f27134a);
                        cVar2.mo29663a(cVar, (Object) t);
                    }
                }
                cVar.mo29494d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: g.j.c.y.l.i$c */
    /* compiled from: ReflectiveTypeAdapterFactory */
    static abstract class C11640c {

        /* renamed from: a */
        final String f27134a;

        /* renamed from: b */
        final boolean f27135b;

        /* renamed from: c */
        final boolean f27136c;

        protected C11640c(String str, boolean z, boolean z2) {
            this.f27134a = str;
            this.f27135b = z;
            this.f27136c = z2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo29662a(C11533a aVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo29663a(C11536c cVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo29664a(Object obj) throws IOException, IllegalAccessException;
    }

    public C11637i(C11584c cVar, C11546e eVar, C11599d dVar, C11627d dVar2) {
        this.f27125c = cVar;
        this.f27122U = eVar;
        this.f27123V = dVar;
        this.f27124W = dVar2;
    }

    /* renamed from: a */
    public boolean mo29661a(Field field, boolean z) {
        return m37473a(field, z, this.f27123V);
    }

    /* renamed from: a */
    static boolean m37473a(Field field, boolean z, C11599d dVar) {
        return !dVar.mo29594a(field.getType(), z) && !dVar.mo29595a(field, z);
    }

    /* renamed from: a */
    private List<String> m37471a(Field field) {
        C11576c cVar = (C11576c) field.getAnnotation(C11576c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f27122U.mo29506a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
        Class a = aVar.mo29701a();
        if (!Object.class.isAssignableFrom(a)) {
            return null;
        }
        return new C11639b(this.f27125c.mo29591a(aVar), m37472a(fVar, aVar, a));
    }

    /* renamed from: a */
    private C11640c m37470a(C11547f fVar, Field field, String str, C11689a<?> aVar, boolean z, boolean z2) {
        C11547f fVar2 = fVar;
        C11689a<?> aVar2 = aVar;
        boolean a = C11612i.m37400a((Type) aVar.mo29701a());
        Field field2 = field;
        C11575b bVar = (C11575b) field.getAnnotation(C11575b.class);
        C11571v a2 = bVar != null ? this.f27124W.mo29652a(this.f27125c, fVar, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = fVar.mo29510a(aVar2);
        }
        C11638a aVar3 = new C11638a(this, str, z, z2, field, z3, a2, fVar, aVar, a);
        return aVar3;
    }

    /* renamed from: a */
    private Map<String, C11640c> m37472a(C11547f fVar, C11689a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = aVar.mo29702b();
        C11689a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo29661a(field, true);
                boolean a2 = mo29661a(field, z);
                if (a || a2) {
                    field.setAccessible(true);
                    Type a3 = C11580b.m37338a(aVar2.mo29702b(), cls2, field.getGenericType());
                    List a4 = m37471a(field);
                    int size = a4.size();
                    C11640c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        C11640c cVar2 = cVar;
                        int i3 = i2;
                        int i4 = size;
                        List list = a4;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C11640c) linkedHashMap.put(str2, m37470a(fVar, field, str2, C11689a.m37637a(a3), z2, a2)) : cVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    C11640c cVar3 = cVar;
                    if (cVar3 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(b);
                        sb.append(" declares multiple JSON fields named ");
                        sb.append(cVar3.f27134a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C11689a.m37637a(C11580b.m37338a(aVar2.mo29702b(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo29701a();
        }
        return linkedHashMap;
    }
}
