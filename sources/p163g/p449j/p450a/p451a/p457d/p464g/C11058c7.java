package p163g.p449j.p450a.p451a.p457d.p464g;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: g.j.a.a.d.g.c7 */
final class C11058c7 {

    /* renamed from: a */
    private static final Logger f26103a = Logger.getLogger(C11058c7.class.getName());

    /* renamed from: b */
    private static final Unsafe f26104b = m34865c();

    /* renamed from: c */
    private static final Class<?> f26105c = C11242o2.m35821b();

    /* renamed from: d */
    private static final boolean f26106d = m34873d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f26107e = m34873d(Integer.TYPE);

    /* renamed from: f */
    private static final C11062d f26108f;

    /* renamed from: g */
    private static final boolean f26109g = m34876e();

    /* renamed from: h */
    private static final boolean f26110h = m34872d();

    /* renamed from: i */
    static final long f26111i = ((long) m34859b(byte[].class));

    /* renamed from: j */
    private static final long f26112j;

    /* renamed from: k */
    static final boolean f26113k = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: g.j.a.a.d.g.c7$a */
    static final class C11059a extends C11062d {
        C11059a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo28350a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: c */
        public final boolean mo28356c(Object obj, long j) {
            if (C11058c7.f26113k) {
                return C11058c7.m34881i(obj, j);
            }
            return C11058c7.m34882j(obj, j);
        }

        /* renamed from: d */
        public final float mo28357d(Object obj, long j) {
            return Float.intBitsToFloat(mo28360a(obj, j));
        }

        /* renamed from: e */
        public final double mo28358e(Object obj, long j) {
            return Double.longBitsToDouble(mo28363b(obj, j));
        }

        /* renamed from: f */
        public final byte mo28359f(Object obj, long j) {
            if (C11058c7.f26113k) {
                return C11058c7.m34879g(obj, j);
            }
            return C11058c7.m34880h(obj, j);
        }

        /* renamed from: a */
        public final void mo28351a(Object obj, long j, byte b) {
            if (C11058c7.f26113k) {
                C11058c7.m34849a(obj, j, b);
            } else {
                C11058c7.m34861b(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo28354a(Object obj, long j, boolean z) {
            if (C11058c7.f26113k) {
                C11058c7.m34862b(obj, j, z);
            } else {
                C11058c7.m34867c(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo28353a(Object obj, long j, float f) {
            mo28361a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo28352a(Object obj, long j, double d) {
            mo28362a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo28355a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: g.j.a.a.d.g.c7$b */
    static final class C11060b extends C11062d {
        C11060b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo28350a(long j, byte b) {
            this.f26114a.putByte(j, b);
        }

        /* renamed from: c */
        public final boolean mo28356c(Object obj, long j) {
            return this.f26114a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public final float mo28357d(Object obj, long j) {
            return this.f26114a.getFloat(obj, j);
        }

        /* renamed from: e */
        public final double mo28358e(Object obj, long j) {
            return this.f26114a.getDouble(obj, j);
        }

        /* renamed from: f */
        public final byte mo28359f(Object obj, long j) {
            return this.f26114a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo28351a(Object obj, long j, byte b) {
            this.f26114a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo28354a(Object obj, long j, boolean z) {
            this.f26114a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public final void mo28353a(Object obj, long j, float f) {
            this.f26114a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo28352a(Object obj, long j, double d) {
            this.f26114a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo28355a(byte[] bArr, long j, long j2, long j3) {
            this.f26114a.copyMemory(bArr, C11058c7.f26111i + j, null, j2, j3);
        }
    }

    /* renamed from: g.j.a.a.d.g.c7$c */
    static final class C11061c extends C11062d {
        C11061c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo28350a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: c */
        public final boolean mo28356c(Object obj, long j) {
            if (C11058c7.f26113k) {
                return C11058c7.m34881i(obj, j);
            }
            return C11058c7.m34882j(obj, j);
        }

        /* renamed from: d */
        public final float mo28357d(Object obj, long j) {
            return Float.intBitsToFloat(mo28360a(obj, j));
        }

        /* renamed from: e */
        public final double mo28358e(Object obj, long j) {
            return Double.longBitsToDouble(mo28363b(obj, j));
        }

        /* renamed from: f */
        public final byte mo28359f(Object obj, long j) {
            if (C11058c7.f26113k) {
                return C11058c7.m34879g(obj, j);
            }
            return C11058c7.m34880h(obj, j);
        }

        /* renamed from: a */
        public final void mo28351a(Object obj, long j, byte b) {
            if (C11058c7.f26113k) {
                C11058c7.m34849a(obj, j, b);
            } else {
                C11058c7.m34861b(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo28354a(Object obj, long j, boolean z) {
            if (C11058c7.f26113k) {
                C11058c7.m34862b(obj, j, z);
            } else {
                C11058c7.m34867c(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo28353a(Object obj, long j, float f) {
            mo28361a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo28352a(Object obj, long j, double d) {
            mo28362a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo28355a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: g.j.a.a.d.g.c7$d */
    static abstract class C11062d {

        /* renamed from: a */
        Unsafe f26114a;

        C11062d(Unsafe unsafe) {
            this.f26114a = unsafe;
        }

        /* renamed from: a */
        public final int mo28360a(Object obj, long j) {
            return this.f26114a.getInt(obj, j);
        }

        /* renamed from: a */
        public abstract void mo28350a(long j, byte b);

        /* renamed from: a */
        public abstract void mo28351a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo28352a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo28353a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo28354a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo28355a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public final long mo28363b(Object obj, long j) {
            return this.f26114a.getLong(obj, j);
        }

        /* renamed from: c */
        public abstract boolean mo28356c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo28357d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo28358e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo28359f(Object obj, long j);

        /* renamed from: a */
        public final void mo28361a(Object obj, long j, int i) {
            this.f26114a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo28362a(Object obj, long j, long j2) {
            this.f26114a.putLong(obj, j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ba  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<g.j.a.a.d.g.c7> r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            f26103a = r6
            sun.misc.Unsafe r6 = m34865c()
            f26104b = r6
            java.lang.Class r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11242o2.m35821b()
            f26105c = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = m34873d(r6)
            f26106d = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = m34873d(r6)
            f26107e = r6
            sun.misc.Unsafe r6 = f26104b
            r7 = 0
            if (r6 != 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            boolean r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11242o2.m35820a()
            if (r6 == 0) goto L_0x0058
            boolean r6 = f26106d
            if (r6 == 0) goto L_0x004c
            g.j.a.a.d.g.c7$c r7 = new g.j.a.a.d.g.c7$c
            sun.misc.Unsafe r6 = f26104b
            r7.<init>(r6)
            goto L_0x005f
        L_0x004c:
            boolean r6 = f26107e
            if (r6 == 0) goto L_0x005f
            g.j.a.a.d.g.c7$a r7 = new g.j.a.a.d.g.c7$a
            sun.misc.Unsafe r6 = f26104b
            r7.<init>(r6)
            goto L_0x005f
        L_0x0058:
            g.j.a.a.d.g.c7$b r7 = new g.j.a.a.d.g.c7$b
            sun.misc.Unsafe r6 = f26104b
            r7.<init>(r6)
        L_0x005f:
            f26108f = r7
            boolean r6 = m34876e()
            f26109g = r6
            boolean r6 = m34872d()
            f26110h = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m34859b(r6)
            long r6 = (long) r6
            f26111i = r6
            m34859b(r5)
            m34864c(r5)
            m34859b(r4)
            m34864c(r4)
            m34859b(r3)
            m34864c(r3)
            m34859b(r2)
            m34864c(r2)
            m34859b(r1)
            m34864c(r1)
            m34859b(r0)
            m34864c(r0)
            java.lang.reflect.Field r0 = m34878f()
            if (r0 == 0) goto L_0x00ac
            g.j.a.a.d.g.c7$d r1 = f26108f
            if (r1 != 0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            sun.misc.Unsafe r1 = r1.f26114a
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00ae
        L_0x00ac:
            r0 = -1
        L_0x00ae:
            f26112j = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ba
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            f26113k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11058c7.<clinit>():void");
    }

    private C11058c7() {
    }

    /* renamed from: a */
    static boolean m34858a() {
        return f26110h;
    }

    /* renamed from: b */
    static boolean m34863b() {
        return f26109g;
    }

    /* renamed from: c */
    private static int m34864c(Class<?> cls) {
        if (f26110h) {
            return f26108f.f26114a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: d */
    static float m34869d(Object obj, long j) {
        return f26108f.mo28357d(obj, j);
    }

    /* renamed from: e */
    static double m34874e(Object obj, long j) {
        return f26108f.mo28358e(obj, j);
    }

    /* renamed from: f */
    static Object m34877f(Object obj, long j) {
        return f26108f.f26114a.getObject(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static byte m34879g(Object obj, long j) {
        return (byte) (m34844a(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static byte m34880h(Object obj, long j) {
        return (byte) (m34844a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m34881i(Object obj, long j) {
        return m34879g(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m34882j(Object obj, long j) {
        return m34880h(obj, j) != 0;
    }

    /* renamed from: a */
    static <T> T m34846a(Class<T> cls) {
        try {
            return f26104b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m34859b(Class<?> cls) {
        if (f26110h) {
            return f26108f.f26114a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static boolean m34872d() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f26104b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (C11242o2.m35820a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f26103a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m34876e() {
        String str = "copyMemory";
        String str2 = "getLong";
        Class<Object> cls = Object.class;
        Unsafe unsafe = f26104b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod(str2, new Class[]{cls, Long.TYPE});
            if (m34878f() == null) {
                return false;
            }
            if (C11242o2.m35820a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod(str2, new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod(str, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod(str, new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f26103a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: c */
    static boolean m34868c(Object obj, long j) {
        return f26108f.mo28356c(obj, j);
    }

    /* renamed from: f */
    private static Field m34878f() {
        if (C11242o2.m35820a()) {
            Field a = m34847a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m34847a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    static int m34844a(Object obj, long j) {
        return f26108f.mo28360a(obj, j);
    }

    /* renamed from: b */
    static long m34860b(Object obj, long j) {
        return f26108f.mo28363b(obj, j);
    }

    /* renamed from: c */
    static Unsafe m34865c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C11098e7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m34852a(Object obj, long j, int i) {
        f26108f.mo28361a(obj, j, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m34861b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m34852a(obj, j2, ((255 & b) << i) | (m34844a(obj, j2) & (~(255 << i))));
    }

    /* renamed from: a */
    static void m34853a(Object obj, long j, long j2) {
        f26108f.mo28362a(obj, j, j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m34867c(Object obj, long j, boolean z) {
        m34861b(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    static void m34855a(Object obj, long j, boolean z) {
        f26108f.mo28354a(obj, j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m34862b(Object obj, long j, boolean z) {
        m34849a(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    static void m34851a(Object obj, long j, float f) {
        f26108f.mo28353a(obj, j, f);
    }

    /* renamed from: a */
    static void m34850a(Object obj, long j, double d) {
        f26108f.mo28352a(obj, j, d);
    }

    /* renamed from: a */
    static void m34854a(Object obj, long j, Object obj2) {
        f26108f.f26114a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m34843a(byte[] bArr, long j) {
        return f26108f.mo28359f(bArr, f26111i + j);
    }

    /* renamed from: a */
    static void m34856a(byte[] bArr, long j, byte b) {
        f26108f.mo28351a((Object) bArr, f26111i + j, b);
    }

    /* renamed from: a */
    static void m34857a(byte[] bArr, long j, long j2, long j3) {
        f26108f.mo28355a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m34848a(long j, byte b) {
        f26108f.mo28350a(j, b);
    }

    /* renamed from: a */
    static long m34845a(ByteBuffer byteBuffer) {
        return f26108f.mo28363b(byteBuffer, f26112j);
    }

    /* renamed from: a */
    private static Field m34847a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m34849a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((~((int) j)) & 3) << 3;
        int i2 = (255 & b) << i;
        m34852a(obj, j2, i2 | (m34844a(obj, j2) & (~(255 << i))));
    }

    /* renamed from: d */
    private static boolean m34873d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C11242o2.m35820a()) {
            return false;
        }
        try {
            Class<?> cls3 = f26105c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
