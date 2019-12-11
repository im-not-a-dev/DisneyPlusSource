package p163g.p500m.p501a.p502z;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11733i;
import p163g.p500m.p501a.C11736l;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

/* renamed from: g.m.a.z.a */
/* compiled from: Util */
public final class C11781a {

    /* renamed from: a */
    public static final Set<Annotation> f27418a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f27419b = new Type[0];

    /* renamed from: g.m.a.z.a$a */
    /* compiled from: Util */
    public static final class C11782a implements GenericArrayType {

        /* renamed from: c */
        private final Type f27420c;

        public C11782a(Type type) {
            this.f27420c = C11781a.m37912a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C11780y.m37898a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f27420c;
        }

        public int hashCode() {
            return this.f27420c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C11781a.m37922c(this.f27420c));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.z.a$b */
    /* compiled from: Util */
    public static final class C11783b implements ParameterizedType {

        /* renamed from: U */
        private final Type f27421U;

        /* renamed from: V */
        public final Type[] f27422V;

        /* renamed from: c */
        private final Type f27423c;

        public C11783b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class enclosingClass = ((Class) type2).getEnclosingClass();
                String str = "unexpected owner type for ";
                if (type != null) {
                    if (enclosingClass == null || C11780y.m37902d(type) != enclosingClass) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(type2);
                        sb.append(": ");
                        sb.append(type);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (enclosingClass != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(type2);
                    sb2.append(": null");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C11781a.m37912a(type);
            }
            this.f27423c = type3;
            this.f27421U = C11781a.m37912a(type2);
            this.f27422V = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f27422V;
                if (i >= typeArr2.length) {
                    return;
                }
                if (typeArr2[i] != null) {
                    C11781a.m37921b(typeArr2[i]);
                    Type[] typeArr3 = this.f27422V;
                    typeArr3[i] = C11781a.m37912a(typeArr3[i]);
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C11780y.m37898a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f27422V.clone();
        }

        public Type getOwnerType() {
            return this.f27423c;
        }

        public Type getRawType() {
            return this.f27421U;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f27422V) ^ this.f27421U.hashCode()) ^ C11781a.m37906a((Object) this.f27423c);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f27422V.length + 1) * 30);
            sb.append(C11781a.m37922c(this.f27421U));
            if (this.f27422V.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C11781a.m37922c(this.f27422V[0]));
            for (int i = 1; i < this.f27422V.length; i++) {
                sb.append(", ");
                sb.append(C11781a.m37922c(this.f27422V[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: g.m.a.z.a$c */
    /* compiled from: Util */
    public static final class C11784c implements WildcardType {

        /* renamed from: U */
        private final Type f27424U;

        /* renamed from: c */
        private final Type f27425c;

        public C11784c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    C11781a.m37921b(typeArr2[0]);
                    if (typeArr[0] == cls) {
                        this.f27424U = C11781a.m37912a(typeArr2[0]);
                        this.f27425c = cls;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                C11781a.m37921b(typeArr[0]);
                this.f27424U = null;
                this.f27425c = C11781a.m37912a(typeArr[0]);
            } else {
                throw new NullPointerException();
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C11780y.m37898a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f27424U;
            if (type == null) {
                return C11781a.f27419b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f27425c};
        }

        public int hashCode() {
            Type type = this.f27424U;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f27425c.hashCode() + 31);
        }

        public String toString() {
            if (this.f27424U != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("? super ");
                sb.append(C11781a.m37922c(this.f27424U));
                return sb.toString();
            } else if (this.f27425c == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("? extends ");
                sb2.append(C11781a.m37922c(this.f27425c));
                return sb2.toString();
            }
        }
    }

    /* renamed from: a */
    public static boolean m37918a(Type type, Type type2) {
        return C11780y.m37898a(type, type2);
    }

    /* renamed from: b */
    public static Set<? extends Annotation> m37920b(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C11736l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f27418a;
    }

    /* renamed from: c */
    static String m37922c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    public static Set<? extends Annotation> m37916a(AnnotatedElement annotatedElement) {
        return m37920b(annotatedElement.getAnnotations());
    }

    /* renamed from: a */
    public static boolean m37919a(Annotation[] annotationArr) {
        for (Annotation annotationType : annotationArr) {
            if (annotationType.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m37917a(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("scala.");
    }

    /* renamed from: b */
    static void m37921b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected primitive ");
            sb.append(type);
            sb.append(". Use the boxed type.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static RuntimeException m37910a(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [g.m.a.z.a$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m37912a(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            g.m.a.z.a$a r0 = new g.m.a.z.a$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m37912a(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            return r3
        L_0x001b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0038
            boolean r0 = r3 instanceof p163g.p500m.p501a.p502z.C11781a.C11783b
            if (r0 == 0) goto L_0x0024
            return r3
        L_0x0024:
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            g.m.a.z.a$b r0 = new g.m.a.z.a$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004d
            boolean r0 = r3 instanceof p163g.p500m.p501a.p502z.C11781a.C11782a
            if (r0 == 0) goto L_0x0041
            return r3
        L_0x0041:
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            g.m.a.z.a$a r0 = new g.m.a.z.a$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x004d:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0066
            boolean r0 = r3 instanceof p163g.p500m.p501a.p502z.C11781a.C11784c
            if (r0 == 0) goto L_0x0056
            return r3
        L_0x0056:
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            g.m.a.z.a$c r0 = new g.m.a.z.a$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0066:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.p502z.C11781a.m37912a(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m37914a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m37915a(r8, r9, r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m37914a(r8, r9, r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.lang.reflect.GenericArrayType r0 = p163g.p500m.p501a.C11780y.m37899b(r8)
        L_0x002b:
            return r0
        L_0x002c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0042
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m37914a(r8, r9, r0)
            if (r0 != r8) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            java.lang.reflect.GenericArrayType r10 = p163g.p500m.p501a.C11780y.m37899b(r8)
        L_0x0041:
            return r10
        L_0x0042:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0085
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m37914a(r8, r9, r0)
            if (r3 == r0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005c:
            if (r2 >= r5) goto L_0x0077
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m37914a(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0074
            if (r0 != 0) goto L_0x0072
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x0072:
            r4[r2] = r6
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x005c
        L_0x0077:
            if (r0 == 0) goto L_0x0083
            g.m.a.z.a$b r8 = new g.m.a.z.a$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            goto L_0x0084
        L_0x0083:
            r8 = r10
        L_0x0084:
            return r8
        L_0x0085:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00b7
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00a5
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m37914a(r8, r9, r1)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00b7
            java.lang.reflect.WildcardType r8 = p163g.p500m.p501a.C11780y.m37905g(r8)
            return r8
        L_0x00a5:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00b7
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m37914a(r8, r9, r0)     // Catch:{ all -> 0x00b8 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00b7
            java.lang.reflect.WildcardType r8 = p163g.p500m.p501a.C11780y.m37904f(r8)
            return r8
        L_0x00b7:
            return r10
        L_0x00b8:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.p502z.C11781a.m37914a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: a */
    static Type m37915a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = m37909a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m37913a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m37907a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    public static Type m37913a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m37913a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m37913a(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    static int m37906a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    static int m37907a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    static Class<?> m37909a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    public static String m37911a(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" annotated ");
            sb2.append(set);
            str = sb2.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static C11725h<?> m37908a(C11760v vVar, Type type, Class<?> cls) {
        Class<C11760v> cls2 = C11760v.class;
        C11733i iVar = (C11733i) cls.getAnnotation(C11733i.class);
        if (iVar == null || !iVar.generateAdapter()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName().replace("$", "_"));
        sb.append("JsonAdapter");
        try {
            Class cls3 = Class.forName(sb.toString(), true, cls.getClassLoader());
            if (type instanceof ParameterizedType) {
                Constructor declaredConstructor = cls3.getDeclaredConstructor(new Class[]{cls2, Type[].class});
                declaredConstructor.setAccessible(true);
                return ((C11725h) declaredConstructor.newInstance(new Object[]{vVar, ((ParameterizedType) type).getActualTypeArguments()})).nullSafe();
            }
            Constructor declaredConstructor2 = cls3.getDeclaredConstructor(new Class[]{cls2});
            declaredConstructor2.setAccessible(true);
            return ((C11725h) declaredConstructor2.newInstance(new Object[]{vVar})).nullSafe();
        } catch (ClassNotFoundException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to find the generated JsonAdapter class for ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e);
        } catch (NoSuchMethodException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to find the generated JsonAdapter constructor for ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to access the generated JsonAdapter for ");
            sb4.append(cls);
            throw new RuntimeException(sb4.toString(), e3);
        } catch (InstantiationException e4) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Failed to instantiate the generated JsonAdapter for ");
            sb5.append(cls);
            throw new RuntimeException(sb5.toString(), e4);
        } catch (InvocationTargetException e5) {
            m37910a(e5);
            throw null;
        }
    }
}
