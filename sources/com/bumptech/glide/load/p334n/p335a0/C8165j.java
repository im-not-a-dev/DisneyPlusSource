package com.bumptech.glide.load.p334n.p335a0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.n.a0.j */
/* compiled from: LruArrayPool */
public final class C8165j implements C8154b {

    /* renamed from: a */
    private final C8162h<C8166a, Object> f17442a = new C8162h<>();

    /* renamed from: b */
    private final C8167b f17443b = new C8167b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f17444c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C8153a<?>> f17445d = new HashMap();

    /* renamed from: e */
    private final int f17446e;

    /* renamed from: f */
    private int f17447f;

    /* renamed from: com.bumptech.glide.load.n.a0.j$a */
    /* compiled from: LruArrayPool */
    private static final class C8166a implements C8172m {

        /* renamed from: a */
        private final C8167b f17448a;

        /* renamed from: b */
        int f17449b;

        /* renamed from: c */
        private Class<?> f17450c;

        C8166a(C8167b bVar) {
            this.f17448a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21255a(int i, Class<?> cls) {
            this.f17449b = i;
            this.f17450c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8166a)) {
                return false;
            }
            C8166a aVar = (C8166a) obj;
            if (this.f17449b == aVar.f17449b && this.f17450c == aVar.f17450c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f17449b * 31;
            Class<?> cls = this.f17450c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Key{size=");
            sb.append(this.f17449b);
            sb.append("array=");
            sb.append(this.f17450c);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        public void mo21232a() {
            this.f17448a.mo21239a(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.j$b */
    /* compiled from: LruArrayPool */
    private static final class C8167b extends C8158d<C8166a> {
        C8167b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8166a mo21259a(int i, Class<?> cls) {
            C8166a aVar = (C8166a) mo21240b();
            aVar.mo21255a(i, cls);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C8166a m23716a() {
            return new C8166a(this);
        }
    }

    public C8165j(int i) {
        this.f17446e = i;
    }

    /* renamed from: c */
    private boolean m23706c(int i) {
        return i <= this.f17446e / 2;
    }

    /* renamed from: a */
    public synchronized <T> void mo21223a(T t) {
        Class cls = t.getClass();
        C8153a a = m23696a(cls);
        int a2 = a.mo21216a(t);
        int b = a.mo21218b() * a2;
        if (m23706c(b)) {
            C8166a a3 = this.f17443b.mo21259a(a2, cls);
            this.f17442a.mo21249a(a3, t);
            NavigableMap b2 = m23701b(cls);
            Integer num = (Integer) b2.get(Integer.valueOf(a3.f17449b));
            Integer valueOf = Integer.valueOf(a3.f17449b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            b2.put(valueOf, Integer.valueOf(i));
            this.f17447f += b;
            m23702b();
        }
    }

    /* renamed from: b */
    public synchronized <T> T mo21224b(int i, Class<T> cls) {
        C8166a aVar;
        Integer num = (Integer) m23701b(cls).ceilingKey(Integer.valueOf(i));
        if (m23699a(i, num)) {
            aVar = this.f17443b.mo21259a(num.intValue(), cls);
        } else {
            aVar = this.f17443b.mo21259a(i, cls);
        }
        return m23698a(aVar, cls);
    }

    /* renamed from: c */
    private boolean m23705c() {
        int i = this.f17447f;
        return i == 0 || this.f17446e / i >= 2;
    }

    /* renamed from: c */
    private void m23704c(int i, Class<?> cls) {
        NavigableMap b = m23701b(cls);
        Integer num = (Integer) b.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            b.remove(Integer.valueOf(i));
        } else {
            b.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: b */
    private void m23702b() {
        m23703b(this.f17446e);
    }

    /* renamed from: b */
    private void m23703b(int i) {
        while (this.f17447f > i) {
            Object a = this.f17442a.mo21247a();
            C10774j.m34012a(a);
            C8153a b = m23700b((T) a);
            this.f17447f -= b.mo21216a(a) * b.mo21218b();
            m23704c(b.mo21216a(a), a.getClass());
            if (Log.isLoggable(b.mo21217a(), 2)) {
                String a2 = b.mo21217a();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(b.mo21216a(a));
                Log.v(a2, sb.toString());
            }
        }
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m23701b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f17444c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f17444c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public synchronized <T> T mo21220a(int i, Class<T> cls) {
        return m23698a(this.f17443b.mo21259a(i, cls), cls);
    }

    /* renamed from: a */
    private <T> T m23698a(C8166a aVar, Class<T> cls) {
        C8153a a = m23696a(cls);
        T a2 = m23697a(aVar);
        if (a2 != null) {
            this.f17447f -= a.mo21216a(a2) * a.mo21218b();
            m23704c(a.mo21216a(a2), cls);
        }
        if (a2 != null) {
            return a2;
        }
        if (Log.isLoggable(a.mo21217a(), 2)) {
            String a3 = a.mo21217a();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f17449b);
            sb.append(" bytes");
            Log.v(a3, sb.toString());
        }
        return a.newArray(aVar.f17449b);
    }

    /* renamed from: b */
    private <T> C8153a<T> m23700b(T t) {
        return m23696a(t.getClass());
    }

    /* renamed from: a */
    private <T> T m23697a(C8166a aVar) {
        return this.f17442a.mo21248a(aVar);
    }

    /* renamed from: a */
    private boolean m23699a(int i, Integer num) {
        return num != null && (m23705c() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    public synchronized void mo21221a() {
        m23703b(0);
    }

    /* renamed from: a */
    public synchronized void mo21222a(int i) {
        if (i >= 40) {
            try {
                mo21221a();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m23703b(this.f17446e / 2);
        }
    }

    /* renamed from: a */
    private <T> C8153a<T> m23696a(Class<T> cls) {
        C8153a<T> aVar = (C8153a) this.f17445d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C8164i<>();
            } else if (cls.equals(byte[].class)) {
                aVar = new C8161g<>();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No array pool found for: ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.f17445d.put(cls, aVar);
        }
        return aVar;
    }
}
