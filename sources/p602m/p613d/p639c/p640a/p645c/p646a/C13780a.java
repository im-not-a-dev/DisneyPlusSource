package p602m.p613d.p639c.p640a.p645c.p646a;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: m.d.c.a.c.a.a */
/* compiled from: ClassUtil */
public class C13780a {

    /* renamed from: m.d.c.a.c.a.a$a */
    /* compiled from: ClassUtil */
    static class C13781a implements PrivilegedAction {

        /* renamed from: a */
        final /* synthetic */ String f30597a;

        C13781a(String str) {
            this.f30597a = str;
        }

        public Object run() {
            try {
                return Class.forName(this.f30597a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Class m42298a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return (Class) AccessController.doPrivileged(new C13781a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
