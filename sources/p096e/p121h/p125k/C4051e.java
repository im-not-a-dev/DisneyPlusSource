package p096e.p121h.p125k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p096e.p113e.C3941i;
import p096e.p121h.p122j.p124d.C4031c.C4033b;
import p096e.p121h.p122j.p124d.C4031c.C4034c;
import p096e.p121h.p131p.C4073b.C4079f;

/* renamed from: e.h.k.e */
/* compiled from: TypefaceCompatApi24Impl */
class C4051e extends C4054h {

    /* renamed from: b */
    private static final Class f10257b;

    /* renamed from: c */
    private static final Constructor f10258c;

    /* renamed from: d */
    private static final Method f10259d;

    /* renamed from: e */
    private static final Method f10260e;

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f10258c = constructor;
        f10257b = cls;
        f10259d = method;
        f10260e = method2;
    }

    C4051e() {
    }

    /* renamed from: a */
    public static boolean m13913a() {
        if (f10259d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f10259d != null;
    }

    /* renamed from: b */
    private static Object m13915b() {
        try {
            return f10258c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m13914a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f10259d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Typeface m13912a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f10257b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10260e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo14562a(Context context, CancellationSignal cancellationSignal, C4079f[] fVarArr, int i) {
        Object b = m13915b();
        if (b == null) {
            return null;
        }
        C3941i iVar = new C3941i();
        for (C4079f fVar : fVarArr) {
            Uri c = fVar.mo14611c();
            ByteBuffer byteBuffer = (ByteBuffer) iVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C4058i.m13959a(context, cancellationSignal, c);
                iVar.put(c, byteBuffer);
            }
            if (byteBuffer == null || !m13914a(b, byteBuffer, fVar.mo14610b(), fVar.mo14612d(), fVar.mo14613e())) {
                return null;
            }
        }
        Typeface a = m13912a(b);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i);
    }

    /* renamed from: a */
    public Typeface mo14563a(Context context, C4033b bVar, Resources resources, int i) {
        C4034c[] a;
        Object b = m13915b();
        if (b == null) {
            return null;
        }
        for (C4034c cVar : bVar.mo14547a()) {
            ByteBuffer a2 = C4058i.m13958a(context, resources, cVar.mo14549b());
            if (a2 == null || !m13914a(b, a2, cVar.mo14550c(), cVar.mo14552e(), cVar.mo14553f())) {
                return null;
            }
        }
        return m13912a(b);
    }
}
