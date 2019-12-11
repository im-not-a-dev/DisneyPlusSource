package p163g.p500m.p501a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p163g.p500m.p501a.C11725h.C11732g;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.p502z.C11781a;

/* renamed from: g.m.a.d */
/* compiled from: ClassJsonAdapter */
final class C11716d<T> extends C11725h<T> {

    /* renamed from: d */
    public static final C11732g f27283d = new C11717a();

    /* renamed from: a */
    private final C11711c<T> f27284a;

    /* renamed from: b */
    private final C11718b<?>[] f27285b;

    /* renamed from: c */
    private final C11739b f27286c;

    /* renamed from: g.m.a.d$a */
    /* compiled from: ClassJsonAdapter */
    class C11717a implements C11732g {
        C11717a() {
        }

        /* renamed from: a */
        public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class d = C11780y.m37902d(type);
            if (d.isInterface() || d.isEnum()) {
                return null;
            }
            if (C11781a.m37917a(d) && !C11780y.m37903e(d)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Platform ");
                sb.append(C11781a.m37911a(type, set));
                sb.append(" requires explicit JsonAdapter to be registered");
                throw new IllegalArgumentException(sb.toString());
            } else if (!set.isEmpty()) {
                return null;
            } else {
                if (d.isAnonymousClass()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cannot serialize anonymous class ");
                    sb2.append(d.getName());
                    throw new IllegalArgumentException(sb2.toString());
                } else if (d.isLocalClass()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Cannot serialize local class ");
                    sb3.append(d.getName());
                    throw new IllegalArgumentException(sb3.toString());
                } else if (d.getEnclosingClass() != null && !Modifier.isStatic(d.getModifiers())) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Cannot serialize non-static nested class ");
                    sb4.append(d.getName());
                    throw new IllegalArgumentException(sb4.toString());
                } else if (!Modifier.isAbstract(d.getModifiers())) {
                    C11711c a = C11711c.m37682a(d);
                    TreeMap treeMap = new TreeMap();
                    while (type != Object.class) {
                        m37688a(vVar, type, (Map<String, C11718b<?>>) treeMap);
                        type = C11780y.m37901c(type);
                    }
                    return new C11716d(a, treeMap).nullSafe();
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Cannot serialize abstract class ");
                    sb5.append(d.getName());
                    throw new IllegalArgumentException(sb5.toString());
                }
            }
        }

        /* renamed from: a */
        private void m37688a(C11760v vVar, Type type, Map<String, C11718b<?>> map) {
            Field[] declaredFields;
            Class d = C11780y.m37902d(type);
            boolean a = C11781a.m37917a(d);
            for (Field field : d.getDeclaredFields()) {
                if (m37689a(a, field.getModifiers())) {
                    Type a2 = C11781a.m37914a(type, d, field.getGenericType());
                    Set a3 = C11781a.m37916a((AnnotatedElement) field);
                    String name = field.getName();
                    C11725h a4 = vVar.mo29869a(a2, a3, name);
                    field.setAccessible(true);
                    C11724g gVar = (C11724g) field.getAnnotation(C11724g.class);
                    if (gVar != null) {
                        name = gVar.name();
                    }
                    C11718b bVar = new C11718b(name, field, a4);
                    C11718b bVar2 = (C11718b) map.put(name, bVar);
                    if (bVar2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Conflicting fields:\n    ");
                        sb.append(bVar2.f27288b);
                        sb.append("\n    ");
                        sb.append(bVar.f27288b);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m37689a(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            if (Modifier.isPublic(i) || Modifier.isProtected(i) || !z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: g.m.a.d$b */
    /* compiled from: ClassJsonAdapter */
    static class C11718b<T> {

        /* renamed from: a */
        final String f27287a;

        /* renamed from: b */
        final Field f27288b;

        /* renamed from: c */
        final C11725h<T> f27289c;

        C11718b(String str, Field field, C11725h<T> hVar) {
            this.f27287a = str;
            this.f27288b = field;
            this.f27289c = hVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29732a(C11737m mVar, Object obj) throws IOException, IllegalAccessException {
            this.f27288b.set(obj, this.f27289c.fromJson(mVar));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29733a(C11747s sVar, Object obj) throws IllegalAccessException, IOException {
            this.f27289c.toJson(sVar, this.f27288b.get(obj));
        }
    }

    C11716d(C11711c<T> cVar, Map<String, C11718b<?>> map) {
        this.f27284a = cVar;
        this.f27285b = (C11718b[]) map.values().toArray(new C11718b[map.size()]);
        this.f27286c = C11739b.m37729a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    public T fromJson(C11737m mVar) throws IOException {
        try {
            T a = this.f27284a.mo29726a();
            try {
                mVar.mo29763b();
                while (mVar.mo29770f()) {
                    int a2 = mVar.mo29758a(this.f27286c);
                    if (a2 == -1) {
                        mVar.mo29783q();
                        mVar.mo29784r();
                    } else {
                        this.f27285b[a2].mo29732a(mVar, (Object) a);
                    }
                }
                mVar.mo29767d();
                return a;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            C11781a.m37910a(e2);
            throw null;
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public void toJson(C11747s sVar, T t) throws IOException {
        C11718b<?>[] bVarArr;
        try {
            sVar.mo29791b();
            for (C11718b<?> bVar : this.f27285b) {
                sVar.mo29796e(bVar.f27287a);
                bVar.mo29733a(sVar, (Object) t);
            }
            sVar.mo29795e();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonAdapter(");
        sb.append(this.f27284a);
        sb.append(")");
        return sb.toString();
    }
}
