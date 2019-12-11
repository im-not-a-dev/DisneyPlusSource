package p163g.p449j.p450a.p451a.p457d.p464g;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p163g.p449j.p450a.p451a.p457d.p464g.C11285r3;

/* renamed from: g.j.a.a.d.g.d4 */
abstract class C11075d4<T extends C11285r3> {

    /* renamed from: a */
    private static final Logger f26135a = Logger.getLogger(C11197l3.class.getName());

    /* renamed from: b */
    private static String f26136b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C11075d4() {
    }

    /* renamed from: a */
    static <T extends C11285r3> T m34962a(Class<T> cls) {
        String str;
        Class<C11075d4> cls2 = C11075d4.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C11285r3.class)) {
            str = f26136b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C11285r3) cls.cast(((C11075d4) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo28387a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C11075d4) it.next()).mo28387a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f26135a;
                    Level level = Level.SEVERE;
                    String str2 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C11285r3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C11285r3) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo28387a();
}
