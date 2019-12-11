package p096e.p121h.p125k;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import p096e.p121h.p122j.p124d.C4031c.C4033b;
import p096e.p121h.p122j.p124d.C4031c.C4034c;

/* renamed from: e.h.k.f */
/* compiled from: TypefaceCompatApi26Impl */
public class C4052f extends C4050d {

    /* renamed from: g */
    protected final Class f10261g;

    /* renamed from: h */
    protected final Constructor f10262h;

    /* renamed from: i */
    protected final Method f10263i;

    /* renamed from: j */
    protected final Method f10264j;

    /* renamed from: k */
    protected final Method f10265k;

    /* renamed from: l */
    protected final Method f10266l;

    /* renamed from: m */
    protected final Method f10267m;

    public C4052f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class a = mo14566a();
            constructor = mo14571e(a);
            method4 = mo14568b(a);
            method3 = mo14569c(a);
            method2 = mo14572f(a);
            method = mo14567a(a);
            Class cls2 = a;
            method5 = mo14570d(a);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f10261g = cls;
        this.f10262h = constructor;
        this.f10263i = method4;
        this.f10264j = method3;
        this.f10265k = method2;
        this.f10266l = method;
        this.f10267m = method5;
    }

    /* renamed from: a */
    private boolean m13918a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10263i.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m13921b() {
        if (this.f10263i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f10263i != null;
    }

    /* renamed from: c */
    private Object m13922c() {
        try {
            return this.f10262h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo14570d(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Constructor mo14571e(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo14572f(Class cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: c */
    private boolean m13923c(Object obj) {
        try {
            return ((Boolean) this.f10265k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo14569c(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: b */
    private void m13920b(Object obj) {
        try {
            this.f10266l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: a */
    private boolean m13919a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f10264j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo14568b(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo14565a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f10261g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10267m.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo14563a(Context context, C4033b bVar, Resources resources, int i) {
        C4034c[] a;
        if (!m13921b()) {
            return super.mo14563a(context, bVar, resources, i);
        }
        Object c = m13922c();
        if (c == null) {
            return null;
        }
        for (C4034c cVar : bVar.mo14547a()) {
            if (!m13918a(context, c, cVar.mo14548a(), cVar.mo14550c(), cVar.mo14552e(), cVar.mo14553f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo14551d()))) {
                m13920b(c);
                return null;
            }
        }
        if (!m13923c(c)) {
            return null;
        }
        return mo14565a(c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        throw r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo14562a(android.content.Context r11, android.os.CancellationSignal r12, p096e.p121h.p131p.C4073b.C4079f[] r13, int r14) {
        /*
            r10 = this;
            int r0 = r13.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r10.m13921b()
            if (r0 != 0) goto L_0x0058
            e.h.p.b$f r13 = r10.mo14575a(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.mo14611c()     // Catch:{ IOException -> 0x0057 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch:{ IOException -> 0x0057 }
            if (r11 != 0) goto L_0x0026
            if (r11 == 0) goto L_0x0025
            r11.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r12.<init>(r14)     // Catch:{ all -> 0x0049 }
            int r14 = r13.mo14612d()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch:{ all -> 0x0049 }
            boolean r13 = r13.mo14613e()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r12 = r12.build()     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x0048
            r11.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0048:
            return r12
        L_0x0049:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x004b }
        L_0x004b:
            r13 = move-exception
            if (r11 == 0) goto L_0x0056
            r11.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r11 = move-exception
            r12.addSuppressed(r11)     // Catch:{ IOException -> 0x0057 }
        L_0x0056:
            throw r13     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            return r2
        L_0x0058:
            java.util.Map r11 = p096e.p121h.p131p.C4073b.m13997a(r11, r13, r12)
            java.lang.Object r12 = r10.m13922c()
            if (r12 != 0) goto L_0x0063
            return r2
        L_0x0063:
            int r0 = r13.length
            r3 = 0
            r9 = 0
        L_0x0066:
            if (r9 >= r0) goto L_0x0093
            r4 = r13[r9]
            android.net.Uri r5 = r4.mo14611c()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0077
            goto L_0x0090
        L_0x0077:
            int r6 = r4.mo14610b()
            int r7 = r4.mo14612d()
            boolean r8 = r4.mo14613e()
            r3 = r10
            r4 = r12
            boolean r3 = r3.m13919a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L_0x008f
            r10.m13920b(r12)
            return r2
        L_0x008f:
            r3 = 1
        L_0x0090:
            int r9 = r9 + 1
            goto L_0x0066
        L_0x0093:
            if (r3 != 0) goto L_0x0099
            r10.m13920b(r12)
            return r2
        L_0x0099:
            boolean r11 = r10.m13923c(r12)
            if (r11 != 0) goto L_0x00a0
            return r2
        L_0x00a0:
            android.graphics.Typeface r11 = r10.mo14565a(r12)
            if (r11 != 0) goto L_0x00a7
            return r2
        L_0x00a7:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p125k.C4052f.mo14562a(android.content.Context, android.os.CancellationSignal, e.h.p.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo14564a(Context context, Resources resources, int i, String str, int i2) {
        if (!m13921b()) {
            return super.mo14564a(context, resources, i, str, i2);
        }
        Object c = m13922c();
        if (c == null) {
            return null;
        }
        if (!m13918a(context, c, str, 0, -1, -1, null)) {
            m13920b(c);
            return null;
        } else if (!m13923c(c)) {
            return null;
        } else {
            return mo14565a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class mo14566a() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo14567a(Class cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }
}
