package p163g.p500m.p501a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p163g.p500m.p501a.C11725h.C11732g;
import p163g.p500m.p501a.C11737m.C11740c;
import p163g.p500m.p501a.p502z.C11781a;

/* renamed from: g.m.a.a */
/* compiled from: AdapterMethodsFactory */
final class C11702a implements C11732g {

    /* renamed from: a */
    private final List<C11708f> f27245a;

    /* renamed from: b */
    private final List<C11708f> f27246b;

    /* renamed from: g.m.a.a$a */
    /* compiled from: AdapterMethodsFactory */
    class C11703a extends C11725h<Object> {

        /* renamed from: a */
        final /* synthetic */ C11708f f27247a;

        /* renamed from: b */
        final /* synthetic */ C11725h f27248b;

        /* renamed from: c */
        final /* synthetic */ C11760v f27249c;

        /* renamed from: d */
        final /* synthetic */ C11708f f27250d;

        /* renamed from: e */
        final /* synthetic */ Set f27251e;

        /* renamed from: f */
        final /* synthetic */ Type f27252f;

        C11703a(C11702a aVar, C11708f fVar, C11725h hVar, C11760v vVar, C11708f fVar2, Set set, Type type) {
            this.f27247a = fVar;
            this.f27248b = hVar;
            this.f27249c = vVar;
            this.f27250d = fVar2;
            this.f27251e = set;
            this.f27252f = type;
        }

        public Object fromJson(C11737m mVar) throws IOException {
            C11708f fVar = this.f27250d;
            if (fVar == null) {
                return this.f27248b.fromJson(mVar);
            }
            if (fVar.f27269g || mVar.peek() != C11740c.NULL) {
                try {
                    return this.f27250d.mo29722a(this.f27249c, mVar);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(cause);
                    sb.append(" at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString(), cause);
                }
            } else {
                mVar.mo29778m();
                return null;
            }
        }

        public void toJson(C11747s sVar, Object obj) throws IOException {
            C11708f fVar = this.f27247a;
            if (fVar == null) {
                this.f27248b.toJson(sVar, obj);
            } else if (fVar.f27269g || obj != null) {
                try {
                    this.f27247a.mo29720a(this.f27249c, sVar, obj);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(cause);
                    sb.append(" at ");
                    sb.append(sVar.mo29818j0());
                    throw new C11734j(sb.toString(), cause);
                }
            } else {
                sVar.mo29800i();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("JsonAdapter");
            sb.append(this.f27251e);
            sb.append("(");
            sb.append(this.f27252f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.a$b */
    /* compiled from: AdapterMethodsFactory */
    class C11704b extends C11708f {
        C11704b(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
            super(type, set, obj, method, i, i2, z);
        }

        /* renamed from: a */
        public void mo29720a(C11760v vVar, C11747s sVar, Object obj) throws IOException, InvocationTargetException {
            mo29724a((Object) sVar, obj);
        }
    }

    /* renamed from: g.m.a.a$c */
    /* compiled from: AdapterMethodsFactory */
    class C11705c extends C11708f {

        /* renamed from: h */
        private C11725h<Object> f27253h;

        /* renamed from: i */
        final /* synthetic */ Type[] f27254i;

        /* renamed from: j */
        final /* synthetic */ Type f27255j;

        /* renamed from: k */
        final /* synthetic */ Set f27256k;

        /* renamed from: l */
        final /* synthetic */ Set f27257l;

        C11705c(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
            this.f27254i = typeArr;
            this.f27255j = type2;
            this.f27256k = set2;
            this.f27257l = set3;
            super(type, set, obj, method, i, i2, z);
        }

        /* renamed from: a */
        public void mo29721a(C11760v vVar, C11732g gVar) {
            C11725h<Object> hVar;
            super.mo29721a(vVar, gVar);
            if (!C11780y.m37898a(this.f27254i[0], this.f27255j) || !this.f27256k.equals(this.f27257l)) {
                hVar = vVar.mo29868a(this.f27255j, this.f27257l);
            } else {
                hVar = vVar.mo29865a(gVar, this.f27255j, this.f27257l);
            }
            this.f27253h = hVar;
        }

        /* renamed from: a */
        public void mo29720a(C11760v vVar, C11747s sVar, Object obj) throws IOException, InvocationTargetException {
            this.f27253h.toJson(sVar, mo29723a(obj));
        }
    }

    /* renamed from: g.m.a.a$d */
    /* compiled from: AdapterMethodsFactory */
    class C11706d extends C11708f {
        C11706d(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
            super(type, set, obj, method, i, i2, z);
        }

        /* renamed from: a */
        public Object mo29722a(C11760v vVar, C11737m mVar) throws IOException, InvocationTargetException {
            return mo29723a(mVar);
        }
    }

    /* renamed from: g.m.a.a$e */
    /* compiled from: AdapterMethodsFactory */
    class C11707e extends C11708f {

        /* renamed from: h */
        C11725h<Object> f27258h;

        /* renamed from: i */
        final /* synthetic */ Type[] f27259i;

        /* renamed from: j */
        final /* synthetic */ Type f27260j;

        /* renamed from: k */
        final /* synthetic */ Set f27261k;

        /* renamed from: l */
        final /* synthetic */ Set f27262l;

        C11707e(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
            this.f27259i = typeArr;
            this.f27260j = type2;
            this.f27261k = set2;
            this.f27262l = set3;
            super(type, set, obj, method, i, i2, z);
        }

        /* renamed from: a */
        public void mo29721a(C11760v vVar, C11732g gVar) {
            C11725h<Object> hVar;
            super.mo29721a(vVar, gVar);
            if (!C11780y.m37898a(this.f27259i[0], this.f27260j) || !this.f27261k.equals(this.f27262l)) {
                hVar = vVar.mo29868a(this.f27259i[0], this.f27261k);
            } else {
                hVar = vVar.mo29865a(gVar, this.f27259i[0], this.f27261k);
            }
            this.f27258h = hVar;
        }

        /* renamed from: a */
        public Object mo29722a(C11760v vVar, C11737m mVar) throws IOException, InvocationTargetException {
            return mo29723a(this.f27258h.fromJson(mVar));
        }
    }

    /* renamed from: g.m.a.a$f */
    /* compiled from: AdapterMethodsFactory */
    static abstract class C11708f {

        /* renamed from: a */
        final Type f27263a;

        /* renamed from: b */
        final Set<? extends Annotation> f27264b;

        /* renamed from: c */
        final Object f27265c;

        /* renamed from: d */
        final Method f27266d;

        /* renamed from: e */
        final int f27267e;

        /* renamed from: f */
        final C11725h<?>[] f27268f;

        /* renamed from: g */
        final boolean f27269g;

        C11708f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
            this.f27263a = C11781a.m37912a(type);
            this.f27264b = set;
            this.f27265c = obj;
            this.f27266d = method;
            this.f27267e = i2;
            this.f27268f = new C11725h[(i - i2)];
            this.f27269g = z;
        }

        /* renamed from: a */
        public void mo29721a(C11760v vVar, C11732g gVar) {
            C11725h<?> hVar;
            if (this.f27268f.length > 0) {
                Type[] genericParameterTypes = this.f27266d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f27266d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.f27267e; i < length; i++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    Set b = C11781a.m37920b(parameterAnnotations[i]);
                    C11725h<?>[] hVarArr = this.f27268f;
                    int i2 = i - this.f27267e;
                    if (!C11780y.m37898a(this.f27263a, type) || !this.f27264b.equals(b)) {
                        hVar = vVar.mo29868a(type, b);
                    } else {
                        hVar = vVar.mo29865a(gVar, type, b);
                    }
                    hVarArr[i2] = hVar;
                }
            }
        }

        /* renamed from: a */
        public void mo29720a(C11760v vVar, C11747s sVar, Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        /* renamed from: a */
        public Object mo29722a(C11760v vVar, C11737m mVar) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo29723a(Object obj) throws InvocationTargetException {
            C11725h<?>[] hVarArr = this.f27268f;
            Object[] objArr = new Object[(hVarArr.length + 1)];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f27266d.invoke(this.f27265c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo29724a(Object obj, Object obj2) throws InvocationTargetException {
            C11725h<?>[] hVarArr = this.f27268f;
            Object[] objArr = new Object[(hVarArr.length + 2)];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f27266d.invoke(this.f27265c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
    }

    C11702a(List<C11708f> list, List<C11708f> list2) {
        this.f27245a = list;
        this.f27246b = list2;
    }

    /* renamed from: b */
    static C11708f m37668b(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == C11747s.class && genericReturnType == Void.TYPE && m37667a(2, genericParameterTypes)) {
            C11704b bVar = new C11704b(genericParameterTypes[1], C11781a.m37920b(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
            return bVar;
        } else if (genericParameterTypes.length != 1 || genericReturnType == Void.TYPE) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected signature for ");
            sb.append(method);
            sb.append(".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
            throw new IllegalArgumentException(sb.toString());
        } else {
            Set a = C11781a.m37916a((AnnotatedElement) method);
            Set b = C11781a.m37920b(parameterAnnotations[0]);
            Set set = b;
            Object obj2 = obj;
            Method method2 = method;
            C11705c cVar = new C11705c(genericParameterTypes[0], set, obj2, method2, genericParameterTypes.length, 1, C11781a.m37919a(parameterAnnotations[0]), genericParameterTypes, genericReturnType, b, a);
            return cVar;
        }
    }

    /* renamed from: a */
    public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
        C11708f a = m37665a(this.f27245a, type, set);
        C11708f a2 = m37665a(this.f27246b, type, set);
        C11725h hVar = null;
        if (a == null && a2 == null) {
            return null;
        }
        if (a == null || a2 == null) {
            try {
                hVar = vVar.mo29865a((C11732g) this, type, set);
            } catch (IllegalArgumentException e) {
                String str = a == null ? "@ToJson" : "@FromJson";
                StringBuilder sb = new StringBuilder();
                sb.append("No ");
                sb.append(str);
                sb.append(" adapter for ");
                sb.append(C11781a.m37911a(type, set));
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }
        C11725h hVar2 = hVar;
        if (a != null) {
            a.mo29721a(vVar, (C11732g) this);
        }
        if (a2 != null) {
            a2.mo29721a(vVar, (C11732g) this);
        }
        C11703a aVar = new C11703a(this, a, hVar2, vVar, a2, set, type);
        return aVar;
    }

    /* renamed from: a */
    public static C11702a m37666a(Object obj) {
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<Object> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                String str = "\n    ";
                if (method.isAnnotationPresent(C11779x.class)) {
                    C11708f b = m37668b(obj, method);
                    C11708f a = m37665a((List<C11708f>) arrayList, b.f27263a, b.f27264b);
                    if (a == null) {
                        arrayList.add(b);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Conflicting @ToJson methods:\n    ");
                        sb.append(a.f27266d);
                        sb.append(str);
                        sb.append(b.f27266d);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (method.isAnnotationPresent(C11723f.class)) {
                    C11708f a2 = m37664a(obj, method);
                    C11708f a3 = m37665a((List<C11708f>) arrayList2, a2.f27263a, a2.f27264b);
                    if (a3 == null) {
                        arrayList2.add(a2);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Conflicting @FromJson methods:\n    ");
                        sb2.append(a3.f27266d);
                        sb2.append(str);
                        sb2.append(a2.f27266d);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new C11702a(arrayList, arrayList2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Expected at least one @ToJson or @FromJson method on ");
        sb3.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    private static boolean m37667a(int i, Type[] typeArr) {
        int length = typeArr.length;
        while (i < length) {
            if (!(typeArr[i] instanceof ParameterizedType) || typeArr[i].getRawType() != C11725h.class) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: a */
    static C11708f m37664a(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set a = C11781a.m37916a((AnnotatedElement) method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == C11737m.class && genericReturnType != Void.TYPE && m37667a(1, genericParameterTypes)) {
            C11706d dVar = new C11706d(genericReturnType, a, obj, method, genericParameterTypes.length, 1, true);
            return dVar;
        } else if (genericParameterTypes.length != 1 || genericReturnType == Void.TYPE) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected signature for ");
            sb.append(method);
            sb.append(".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
            throw new IllegalArgumentException(sb.toString());
        } else {
            Set b = C11781a.m37920b(parameterAnnotations[0]);
            Type type = genericReturnType;
            Set set = a;
            Object obj2 = obj;
            Method method2 = method;
            C11707e eVar = new C11707e(type, set, obj2, method2, genericParameterTypes.length, 1, C11781a.m37919a(parameterAnnotations[0]), genericParameterTypes, genericReturnType, b, a);
            return eVar;
        }
    }

    /* renamed from: a */
    private static C11708f m37665a(List<C11708f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C11708f fVar = (C11708f) list.get(i);
            if (C11780y.m37898a(fVar.f27263a, type) && fVar.f27264b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }
}
