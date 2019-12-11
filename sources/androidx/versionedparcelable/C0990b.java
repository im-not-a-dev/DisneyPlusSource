package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p096e.p113e.C3926a;

/* renamed from: androidx.versionedparcelable.b */
/* compiled from: VersionedParcel */
public abstract class C0990b {

    /* renamed from: a */
    protected final C3926a<String, Method> f3901a;

    /* renamed from: b */
    protected final C3926a<String, Method> f3902b;

    /* renamed from: c */
    protected final C3926a<String, Class> f3903c;

    public C0990b(C3926a<String, Method> aVar, C3926a<String, Method> aVar2, C3926a<String, Class> aVar3) {
        this.f3901a = aVar;
        this.f3902b = aVar2;
        this.f3903c = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5456a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5457a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5460a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5461a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5462a(boolean z);

    /* renamed from: a */
    public void mo5463a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5464a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo5465a(int i);

    /* renamed from: a */
    public boolean mo5466a(boolean z, int i) {
        if (!mo5465a(i)) {
            return z;
        }
        return mo5479d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0990b mo5468b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo5469b(int i);

    /* renamed from: b */
    public void mo5475b(boolean z, int i) {
        mo5469b(i);
        mo5462a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo5477c(int i);

    /* renamed from: c */
    public boolean mo5478c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo5479d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo5480e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract CharSequence mo5481f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo5482g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract <T extends Parcelable> T mo5483h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo5484i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public <T extends C0992d> T mo5485j() {
        String i = mo5484i();
        if (i == null) {
            return null;
        }
        return mo5453a(i, mo5468b());
    }

    /* renamed from: a */
    public int mo5450a(int i, int i2) {
        if (!mo5465a(i2)) {
            return i;
        }
        return mo5482g();
    }

    /* renamed from: b */
    public void mo5476b(byte[] bArr, int i) {
        mo5469b(i);
        mo5464a(bArr);
    }

    /* renamed from: a */
    public String mo5455a(String str, int i) {
        if (!mo5465a(i)) {
            return str;
        }
        return mo5484i();
    }

    /* renamed from: b */
    public void mo5473b(CharSequence charSequence, int i) {
        mo5469b(i);
        mo5460a(charSequence);
    }

    /* renamed from: a */
    public byte[] mo5467a(byte[] bArr, int i) {
        if (!mo5465a(i)) {
            return bArr;
        }
        return mo5480e();
    }

    /* renamed from: b */
    public void mo5470b(int i, int i2) {
        mo5469b(i2);
        mo5477c(i);
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo5451a(T t, int i) {
        if (!mo5465a(i)) {
            return t;
        }
        return mo5483h();
    }

    /* renamed from: b */
    public void mo5474b(String str, int i) {
        mo5469b(i);
        mo5461a(str);
    }

    /* renamed from: a */
    public CharSequence mo5454a(CharSequence charSequence, int i) {
        if (!mo5465a(i)) {
            return charSequence;
        }
        return mo5481f();
    }

    /* renamed from: b */
    public void mo5471b(Parcelable parcelable, int i) {
        mo5469b(i);
        mo5457a(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5458a(C0992d dVar) {
        if (dVar == null) {
            mo5461a((String) null);
            return;
        }
        m5316b(dVar);
        C0990b b = mo5468b();
        mo5459a((T) dVar, b);
        b.mo5456a();
    }

    /* renamed from: b */
    public void mo5472b(C0992d dVar, int i) {
        mo5469b(i);
        mo5458a(dVar);
    }

    /* renamed from: b */
    private void m5316b(C0992d dVar) {
        try {
            mo5461a(m5313a(dVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: b */
    private Method m5315b(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<C0990b> cls = C0990b.class;
        Method method = (Method) this.f3901a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3901a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: a */
    public <T extends C0992d> T mo5452a(T t, int i) {
        if (!mo5465a(i)) {
            return t;
        }
        return mo5485j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0992d> T mo5453a(String str, C0990b bVar) {
        try {
            return (C0992d) m5315b(str).invoke(null, new Object[]{bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    private Method m5314b(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f3902b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a = m5313a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a.getDeclaredMethod("write", new Class[]{cls, C0990b.class});
        this.f3902b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0992d> void mo5459a(T t, C0990b bVar) {
        try {
            m5314b(t.getClass()).invoke(null, new Object[]{t, bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    private Class m5313a(Class<? extends C0992d> cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f3903c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3903c.put(cls.getName(), cls3);
        return cls3;
    }
}
