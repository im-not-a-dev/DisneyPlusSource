package p096e.p121h.p125k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p096e.p121h.p122j.p124d.C4031c.C4033b;
import p096e.p121h.p122j.p124d.C4031c.C4034c;

/* renamed from: e.h.k.d */
/* compiled from: TypefaceCompatApi21Impl */
class C4050d extends C4054h {

    /* renamed from: b */
    private static Class f10252b = null;

    /* renamed from: c */
    private static Constructor f10253c = null;

    /* renamed from: d */
    private static Method f10254d = null;

    /* renamed from: e */
    private static Method f10255e = null;

    /* renamed from: f */
    private static boolean f10256f = false;

    C4050d() {
    }

    /* renamed from: a */
    private static void mo14566a() {
        Method method;
        Class cls;
        Method method2;
        if (!f10256f) {
            f10256f = true;
            Constructor constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f10253c = constructor;
            f10252b = cls;
            f10254d = method;
            f10255e = method2;
        }
    }

    /* renamed from: b */
    private static Object m13909b() {
        mo14566a();
        try {
            return f10253c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private File m13906a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static Typeface mo14565a(Object obj) {
        mo14566a();
        try {
            Object newInstance = Array.newInstance(f10252b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10255e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m13908a(Object obj, String str, int i, boolean z) {
        mo14566a();
        try {
            return ((Boolean) f10254d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005c, code lost:
        if (r5 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0066, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo14562a(android.content.Context r4, android.os.CancellationSignal r5, p096e.p121h.p131p.C4073b.C4079f[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            e.h.p.b$f r6 = r3.mo14575a(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.mo14611c()     // Catch:{ IOException -> 0x0067 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0067 }
            if (r5 != 0) goto L_0x0020
            if (r5 == 0) goto L_0x001f
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x001f:
            return r1
        L_0x0020:
            java.io.File r6 = r3.m13906a(r5)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0037
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x0036
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0036:
            return r4
        L_0x0037:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0059 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0059 }
            r6.<init>(r7)     // Catch:{ all -> 0x0059 }
            android.graphics.Typeface r4 = super.mo14573a(r4, r6)     // Catch:{ all -> 0x004d }
            r6.close()     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x004c
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x004c:
            return r4
        L_0x004d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x004f }
        L_0x004f:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r7     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r6 = move-exception
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0067 }
        L_0x0066:
            throw r6     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p125k.C4050d.mo14562a(android.content.Context, android.os.CancellationSignal, e.h.p.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo14563a(Context context, C4033b bVar, Resources resources, int i) {
        Object b = m13909b();
        C4034c[] a = bVar.mo14547a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C4034c cVar = a[i2];
            File a2 = C4058i.m13957a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!C4058i.m13962a(a2, resources, cVar.mo14549b())) {
                    a2.delete();
                    return null;
                } else if (!m13908a(b, a2.getPath(), cVar.mo14552e(), cVar.mo14553f())) {
                    return null;
                } else {
                    a2.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a2.delete();
            }
        }
        return mo14565a(b);
    }
}
