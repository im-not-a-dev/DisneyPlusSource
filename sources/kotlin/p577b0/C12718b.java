package kotlin.p577b0;

import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.DateUtils;

/* renamed from: kotlin.b0.b */
/* compiled from: PlatformImplementations.kt */
public final class C12718b {

    /* renamed from: a */
    public static final C12716a f29405a;

    static {
        C12716a aVar;
        Object newInstance;
        Object newInstance2;
        Class<C12716a> cls = C12716a.class;
        int a = m39854a();
        String str = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)";
        String str2 = ", base type classloader: ";
        String str3 = "Instance classloader: ";
        String str4 = "null cannot be cast to non-null type kotlin.internal.PlatformImplementations";
        String str5 = "Class.forName(\"kotlin.in…entations\").newInstance()";
        if (a >= 65544) {
            try {
                newInstance2 = Class.forName("kotlin.b0.e.a").newInstance();
                C12880j.m40222a(newInstance2, str5);
                if (newInstance2 != null) {
                    aVar = (C12716a) newInstance2;
                    f29405a = aVar;
                }
                throw new C13142s(str4);
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(classLoader);
                sb.append(str2);
                sb.append(classLoader2);
                Throwable initCause = new ClassCastException(sb.toString()).initCause(e);
                C12880j.m40222a((Object) initCause, str);
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C12880j.m40222a(newInstance3, str5);
                    if (newInstance3 != null) {
                        try {
                            aVar = (C12716a) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            sb2.append(classLoader3);
                            sb2.append(str2);
                            sb2.append(classLoader4);
                            Throwable initCause2 = new ClassCastException(sb2.toString()).initCause(e2);
                            C12880j.m40222a((Object) initCause2, str);
                            throw initCause2;
                        }
                    } else {
                        throw new C13142s(str4);
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543) {
            try {
                newInstance = Class.forName("kotlin.b0.d.a").newInstance();
                C12880j.m40222a(newInstance, str5);
                if (newInstance != null) {
                    aVar = (C12716a) newInstance;
                    f29405a = aVar;
                }
                throw new C13142s(str4);
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(classLoader5);
                sb3.append(str2);
                sb3.append(classLoader6);
                Throwable initCause3 = new ClassCastException(sb3.toString()).initCause(e3);
                C12880j.m40222a((Object) initCause3, str);
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C12880j.m40222a(newInstance4, str5);
                    if (newInstance4 != null) {
                        try {
                            aVar = (C12716a) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append(classLoader7);
                            sb4.append(str2);
                            sb4.append(classLoader8);
                            Throwable initCause4 = new ClassCastException(sb4.toString()).initCause(e4);
                            C12880j.m40222a((Object) initCause4, str);
                            throw initCause4;
                        }
                    } else {
                        throw new C13142s(str4);
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new C12716a();
        f29405a = aVar;
    }

    /* renamed from: a */
    private static final int m39854a() {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property == null) {
            return 65542;
        }
        int a = C12833x.m40128a((CharSequence) property, '.', 0, false, 6, (Object) null);
        if (a < 0) {
            try {
                i = Integer.parseInt(property) * DateUtils.FORMAT_ABBREV_MONTH;
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        int i2 = a + 1;
        int a2 = C12833x.m40128a((CharSequence) property, '.', i2, false, 4, (Object) null);
        if (a2 < 0) {
            a2 = property.length();
        }
        String str = "null cannot be cast to non-null type java.lang.String";
        if (property != null) {
            String substring = property.substring(0, a);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            C12880j.m40222a((Object) substring, str2);
            if (property != null) {
                String substring2 = property.substring(i2, a2);
                C12880j.m40222a((Object) substring2, str2);
                try {
                    i = (Integer.parseInt(substring) * DateUtils.FORMAT_ABBREV_MONTH) + Integer.parseInt(substring2);
                } catch (NumberFormatException unused2) {
                }
                return i;
            }
            throw new C13142s(str);
        }
        throw new C13142s(str);
    }
}
