package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.z */
/* compiled from: ViewModelProvider */
public class C0742z {

    /* renamed from: a */
    private final C0744b f3034a;

    /* renamed from: b */
    private final C0707b0 f3035b;

    /* renamed from: androidx.lifecycle.z$a */
    /* compiled from: ViewModelProvider */
    public static class C0743a extends C0746d {

        /* renamed from: b */
        private static C0743a f3036b;

        /* renamed from: a */
        private Application f3037a;

        public C0743a(Application application) {
            this.f3037a = application;
        }

        /* renamed from: a */
        public static C0743a m3811a(Application application) {
            if (f3036b == null) {
                f3036b = new C0743a(application);
            }
            return f3036b;
        }

        /* renamed from: a */
        public <T extends C0741y> T mo3293a(Class<T> cls) {
            String str = "Cannot create an instance of ";
            if (!C0702a.class.isAssignableFrom(cls)) {
                return super.mo3293a(cls);
            }
            try {
                return (C0741y) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f3037a});
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InstantiationException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
    }

    /* renamed from: androidx.lifecycle.z$b */
    /* compiled from: ViewModelProvider */
    public interface C0744b {
        /* renamed from: a */
        <T extends C0741y> T mo3293a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.z$c */
    /* compiled from: ViewModelProvider */
    static abstract class C0745c implements C0744b {
        C0745c() {
        }

        /* renamed from: a */
        public <T extends C0741y> T mo3293a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: a */
        public abstract <T extends C0741y> T mo4182a(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.z$d */
    /* compiled from: ViewModelProvider */
    public static class C0746d implements C0744b {
        /* renamed from: a */
        public <T extends C0741y> T mo3293a(Class<T> cls) {
            String str = "Cannot create an instance of ";
            try {
                return (C0741y) cls.newInstance();
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    public C0742z(C0707b0 b0Var, C0744b bVar) {
        this.f3034a = bVar;
        this.f3035b = b0Var;
    }

    /* renamed from: a */
    public <T extends C0741y> T mo4180a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo4181a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0741y> T mo4181a(String str, Class<T> cls) {
        T t;
        T a = this.f3035b.mo4118a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        C0744b bVar = this.f3034a;
        if (bVar instanceof C0745c) {
            t = ((C0745c) bVar).mo4182a(str, cls);
        } else {
            t = bVar.mo3293a(cls);
        }
        this.f3035b.mo4120a(str, t);
        return t;
    }
}
