package kotlin.p581d0;

import java.lang.annotation.Annotation;
import kotlin.C13142s;
import kotlin.jvm.internal.C12866d;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KClass;

/* renamed from: kotlin.d0.a */
/* compiled from: JvmClassMapping.kt */
public final class C12731a {
    /* renamed from: a */
    public static final <T> Class<T> m39866a(KClass<T> kClass) {
        Class<T> jClass = ((C12866d) kClass).getJClass();
        if (jClass != null) {
            return jClass;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: b */
    public static final <T> Class<T> m39869b(KClass<T> kClass) {
        Class jClass = ((C12866d) kClass).getJClass();
        String str = "null cannot be cast to non-null type java.lang.Class<T>";
        if (jClass.isPrimitive()) {
            String name = jClass.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            jClass = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            jClass = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            jClass = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            jClass = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            jClass = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            jClass = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            jClass = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            jClass = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            jClass = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (jClass != null) {
                return jClass;
            }
            throw new C13142s(str);
        } else if (jClass != null) {
            return jClass;
        } else {
            throw new C13142s(str);
        }
    }

    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Class<T> m39870c(kotlin.reflect.KClass<T> r1) {
        /*
            kotlin.jvm.internal.d r1 = (kotlin.jvm.internal.C12866d) r1
            java.lang.Class r1 = r1.getJClass()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x000f
            return r1
        L_0x000f:
            kotlin.s r1 = new kotlin.s
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T>"
            r1.<init>(r0)
            throw r1
        L_0x0017:
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L_0x001f
            goto L_0x008b
        L_0x001f:
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L_0x0080;
                case -527879800: goto L_0x0075;
                case -515992664: goto L_0x006a;
                case 155276373: goto L_0x005f;
                case 344809556: goto L_0x0054;
                case 398507100: goto L_0x0049;
                case 398795216: goto L_0x003e;
                case 399092968: goto L_0x0033;
                case 761287205: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x008b
        L_0x0028:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Double.TYPE
            goto L_0x008c
        L_0x0033:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Void.TYPE
            goto L_0x008c
        L_0x003e:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Long.TYPE
            goto L_0x008c
        L_0x0049:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Byte.TYPE
            goto L_0x008c
        L_0x0054:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Boolean.TYPE
            goto L_0x008c
        L_0x005f:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Character.TYPE
            goto L_0x008c
        L_0x006a:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Short.TYPE
            goto L_0x008c
        L_0x0075:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Float.TYPE
            goto L_0x008c
        L_0x0080:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.Class r1 = java.lang.Integer.TYPE
            goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p581d0.C12731a.m39870c(kotlin.reflect.KClass):java.lang.Class");
    }

    /* renamed from: a */
    public static final <T> KClass<T> m39867a(Class<T> cls) {
        return C12895y.m40230a((Class) cls);
    }

    /* renamed from: a */
    public static final <T extends Annotation> KClass<? extends T> m39868a(T t) {
        Class annotationType = t.annotationType();
        C12880j.m40222a((Object) annotationType, "(this as java.lang.annot…otation).annotationType()");
        KClass<? extends T> a = m39867a(annotationType);
        if (a != null) {
            return a;
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
    }
}
