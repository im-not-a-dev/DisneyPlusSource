package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;

/* renamed from: g.j.a.a.d.g.e4 */
public abstract class C11090e4<MessageType extends C11090e4<MessageType, BuilderType>, BuilderType extends C11091a<MessageType, BuilderType>> extends C11196l2<MessageType, BuilderType> {
    private static Map<Object, C11090e4<?, ?>> zzaib = new ConcurrentHashMap();
    protected C11400z6 zzahz = C11400z6.m36843d();
    private int zzaia = -1;

    /* renamed from: g.j.a.a.d.g.e4$a */
    public static abstract class C11091a<MessageType extends C11090e4<MessageType, BuilderType>, BuilderType extends C11091a<MessageType, BuilderType>> extends C11228n2<MessageType, BuilderType> {

        /* renamed from: U */
        protected MessageType f26158U;

        /* renamed from: V */
        private boolean f26159V = false;

        /* renamed from: c */
        private final MessageType f26160c;

        protected C11091a(MessageType messagetype) {
            this.f26160c = messagetype;
            this.f26158U = (C11090e4) messagetype.mo28293a(C11094d.f26165d, (Object) null, (Object) null);
        }

        /* renamed from: b */
        private final BuilderType m35041b(byte[] bArr, int i, int i2, C11285r3 r3Var) throws C11258p4 {
            mo28442f();
            try {
                C11399z5.m36838a().mo29198a(this.f26158U).mo28400a(this.f26158U, bArr, 0, i2 + 0, new C11270q2(r3Var));
                return this;
            } catch (C11258p4 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C11258p4.m35930a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: a */
        public final BuilderType mo28438a(MessageType messagetype) {
            mo28442f();
            m35040a(this.f26158U, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C11091a aVar = (C11091a) this.f26160c.mo28293a(C11094d.f26166e, (Object) null, (Object) null);
            aVar.mo28438a((MessageType) (C11090e4) mo28445k0());
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo28442f() {
            if (this.f26159V) {
                MessageType messagetype = (C11090e4) this.f26158U.mo28293a(C11094d.f26165d, (Object) null, (Object) null);
                m35040a(messagetype, this.f26158U);
                this.f26158U = messagetype;
                this.f26159V = false;
            }
        }

        /* renamed from: g */
        public MessageType mo28445k0() {
            if (this.f26159V) {
                return this.f26158U;
            }
            this.f26158U.mo28432h();
            this.f26159V = true;
            return this.f26158U;
        }

        /* renamed from: h */
        public final MessageType mo28446l0() {
            MessageType messagetype = (C11090e4) mo28445k0();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new C11374x6(messagetype);
        }

        /* renamed from: a */
        private static void m35040a(MessageType messagetype, MessageType messagetype2) {
            C11399z5.m36838a().mo29198a(messagetype).mo28399a(messagetype, messagetype2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ C11228n2 mo28439a(C11196l2 l2Var) {
            mo28438a((MessageType) (C11090e4) l2Var);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C11228n2 mo28440a(byte[] bArr, int i, int i2, C11285r3 r3Var) throws C11258p4 {
            m35041b(bArr, 0, i2, r3Var);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C11259p5 mo28424a() {
            return this.f26160c;
        }
    }

    /* renamed from: g.j.a.a.d.g.e4$b */
    public static abstract class C11092b<MessageType extends C11092b<MessageType, BuilderType>, BuilderType> extends C11090e4<MessageType, BuilderType> implements C11288r5 {
        protected C11329u3<Object> zzaic = C11329u3.m36415g();

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public final C11329u3<Object> mo28447n() {
            if (this.zzaic.mo29038b()) {
                this.zzaic = (C11329u3) this.zzaic.clone();
            }
            return this.zzaic;
        }
    }

    /* renamed from: g.j.a.a.d.g.e4$c */
    public static class C11093c<T extends C11090e4<T, ?>> extends C11214m2<T> {

        /* renamed from: a */
        private final T f26161a;

        public C11093c(T t) {
            this.f26161a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo28448a(C11152i3 i3Var, C11285r3 r3Var) throws C11258p4 {
            return C11090e4.m35016a(this.f26161a, i3Var, r3Var);
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: g.j.a.a.d.g.e4$d */
    public static final class C11094d {

        /* renamed from: a */
        public static final int f26162a = 1;

        /* renamed from: b */
        public static final int f26163b = 2;

        /* renamed from: c */
        public static final int f26164c = 3;

        /* renamed from: d */
        public static final int f26165d = 4;

        /* renamed from: e */
        public static final int f26166e = 5;

        /* renamed from: f */
        public static final int f26167f = 6;

        /* renamed from: g */
        public static final int f26168g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f26169h = {f26162a, f26163b, f26164c, f26165d, f26166e, f26167f, f26168g};

        /* renamed from: i */
        public static final int f26170i = 1;

        /* renamed from: j */
        public static final int f26171j = 2;

        /* renamed from: k */
        public static final int f26172k = 1;

        /* renamed from: l */
        public static final int f26173l = 2;

        static {
            int[] iArr = {f26170i, f26171j};
            int[] iArr2 = {f26172k, f26173l};
        }

        /* renamed from: a */
        public static int[] m35053a() {
            return (int[]) f26169h.clone();
        }
    }

    /* renamed from: g.j.a.a.d.g.e4$e */
    public static class C11095e<ContainingType extends C11259p5, Type> extends C11271q3<ContainingType, Type> {
    }

    /* renamed from: k */
    protected static C11181k4 m35026k() {
        return C11139h4.m35261c();
    }

    /* renamed from: l */
    protected static C11230n4 m35027l() {
        return C11076d5.m34965c();
    }

    /* renamed from: m */
    protected static <E> C11216m4<E> m35028m() {
        return C11057c6.m34841c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo28293a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28425a(int i) {
        this.zzaia = i;
    }

    /* renamed from: b */
    public final int mo28427b() {
        if (this.zzaia == -1) {
            this.zzaia = C11399z5.m36838a().mo29198a(this).mo28402b(this);
        }
        return this.zzaia;
    }

    /* renamed from: d */
    public final /* synthetic */ C11245o5 mo28428d() {
        return (C11091a) mo28293a(C11094d.f26166e, (Object) null, (Object) null);
    }

    /* renamed from: e */
    public final /* synthetic */ C11245o5 mo28429e() {
        C11091a aVar = (C11091a) mo28293a(C11094d.f26166e, (Object) null, (Object) null);
        aVar.mo28438a(this);
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C11090e4) mo28293a(C11094d.f26167f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C11399z5.m36838a().mo29198a(this).mo28403b(this, (C11090e4) obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo28431g() {
        return this.zzaia;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo28432h() {
        C11399z5.m36838a().mo29198a(this).mo28404c(this);
    }

    public int hashCode() {
        int i = this.zzact;
        if (i != 0) {
            return i;
        }
        this.zzact = C11399z5.m36838a().mo29198a(this).mo28405d(this);
        return this.zzact;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final <MessageType extends C11090e4<MessageType, BuilderType>, BuilderType extends C11091a<MessageType, BuilderType>> BuilderType mo28434i() {
        return (C11091a) mo28293a(C11094d.f26166e, (Object) null, (Object) null);
    }

    public final boolean isInitialized() {
        return m35025a((T) this, Boolean.TRUE.booleanValue());
    }

    /* renamed from: j */
    public final BuilderType mo28436j() {
        BuilderType buildertype = (C11091a) mo28293a(C11094d.f26166e, (Object) null, (Object) null);
        buildertype.mo28438a(this);
        return buildertype;
    }

    public String toString() {
        return C11273q5.m35964a(this, super.toString());
    }

    /* renamed from: a */
    public final void mo28426a(C11197l3 l3Var) throws IOException {
        C11399z5.m36838a().mo29197a(getClass()).mo28398a(this, (C11333u7) C11243o3.m35822a(l3Var));
    }

    /* renamed from: a */
    static <T extends C11090e4<?, ?>> T m35019a(Class<T> cls) {
        T t = (C11090e4) zzaib.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C11090e4) zzaib.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C11090e4) ((C11090e4) C11058c7.m34846a(cls)).mo28293a(C11094d.f26167f, (Object) null, (Object) null);
            if (t != null) {
                zzaib.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends C11090e4<?, ?>> void m35024a(Class<T> cls, T t) {
        zzaib.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m35022a(C11259p5 p5Var, String str, Object[] objArr) {
        return new C11042b6(p5Var, str, objArr);
    }

    /* renamed from: a */
    static Object m35023a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static final <T extends C11090e4<T, ?>> boolean m35025a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo28293a(C11094d.f26162a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a = C11399z5.m36838a().mo29198a(t).mo28401a(t);
        if (z) {
            t.mo28293a(C11094d.f26163b, (Object) a ? t : null, (Object) null);
        }
        return a;
    }

    /* renamed from: a */
    protected static C11230n4 m35021a(C11230n4 n4Var) {
        int size = n4Var.size();
        return n4Var.mo28391c(size == 0 ? 10 : size << 1);
    }

    /* renamed from: a */
    protected static <E> C11216m4<E> m35020a(C11216m4<E> m4Var) {
        int size = m4Var.size();
        return m4Var.mo28257a(size == 0 ? 10 : size << 1);
    }

    /* renamed from: a */
    static <T extends C11090e4<T, ?>> T m35016a(T t, C11152i3 i3Var, C11285r3 r3Var) throws C11258p4 {
        T t2 = (C11090e4) t.mo28293a(C11094d.f26165d, (Object) null, (Object) null);
        try {
            C11399z5.m36838a().mo29198a(t2).mo28397a(t2, C11166j3.m35349a(i3Var), r3Var);
            t2.mo28432h();
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C11258p4) {
                throw ((C11258p4) e.getCause());
            }
            C11258p4 p4Var = new C11258p4(e.getMessage());
            p4Var.mo28827a(t2);
            throw p4Var;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C11258p4) {
                throw ((C11258p4) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    private static <T extends C11090e4<T, ?>> T m35017a(T t, byte[] bArr, int i, int i2, C11285r3 r3Var) throws C11258p4 {
        T t2 = (C11090e4) t.mo28293a(C11094d.f26165d, (Object) null, (Object) null);
        try {
            C11399z5.m36838a().mo29198a(t2).mo28400a(t2, bArr, 0, i2, new C11270q2(r3Var));
            t2.mo28432h();
            if (t2.zzact == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C11258p4) {
                throw ((C11258p4) e.getCause());
            }
            C11258p4 p4Var = new C11258p4(e.getMessage());
            p4Var.mo28827a(t2);
            throw p4Var;
        } catch (IndexOutOfBoundsException unused) {
            C11258p4 a = C11258p4.m35930a();
            a.mo28827a(t2);
            throw a;
        }
    }

    /* renamed from: a */
    protected static <T extends C11090e4<T, ?>> T m35018a(T t, byte[] bArr, C11285r3 r3Var) throws C11258p4 {
        T a = m35017a(t, bArr, 0, bArr.length, r3Var);
        if (a == null || a.isInitialized()) {
            return a;
        }
        C11258p4 p4Var = new C11258p4(new C11374x6(a).getMessage());
        p4Var.mo28827a(a);
        throw p4Var;
    }

    /* renamed from: a */
    public final /* synthetic */ C11259p5 mo28424a() {
        return (C11090e4) mo28293a(C11094d.f26167f, (Object) null, (Object) null);
    }
}
