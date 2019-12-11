package p096e.p121h.p125k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p096e.p121h.p122j.p124d.C4031c.C4033b;
import p096e.p121h.p122j.p124d.C4031c.C4034c;
import p096e.p121h.p131p.C4073b.C4079f;

/* renamed from: e.h.k.h */
/* compiled from: TypefaceCompatBaseImpl */
class C4054h {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C4033b> f10268a = new ConcurrentHashMap<>();

    /* renamed from: e.h.k.h$a */
    /* compiled from: TypefaceCompatBaseImpl */
    class C4055a implements C4057c<C4079f> {
        C4055a(C4054h hVar) {
        }

        /* renamed from: a */
        public int mo14577a(C4079f fVar) {
            return fVar.mo14612d();
        }

        /* renamed from: b */
        public boolean mo14579b(C4079f fVar) {
            return fVar.mo14613e();
        }
    }

    /* renamed from: e.h.k.h$b */
    /* compiled from: TypefaceCompatBaseImpl */
    class C4056b implements C4057c<C4034c> {
        C4056b(C4054h hVar) {
        }

        /* renamed from: a */
        public int mo14577a(C4034c cVar) {
            return cVar.mo14552e();
        }

        /* renamed from: b */
        public boolean mo14579b(C4034c cVar) {
            return cVar.mo14553f();
        }
    }

    /* renamed from: e.h.k.h$c */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface C4057c<T> {
        /* renamed from: a */
        int mo14577a(T t);

        /* renamed from: b */
        boolean mo14579b(T t);
    }

    C4054h() {
    }

    /* renamed from: a */
    private static <T> T m13938a(T[] tArr, int i, C4057c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo14577a(t2) - i2) * 2) + (cVar.mo14579b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: b */
    private static long m13940b(Typeface typeface) {
        String str = "Could not retrieve font from family.";
        String str2 = "TypefaceCompatBaseImpl";
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4079f mo14575a(C4079f[] fVarArr, int i) {
        return (C4079f) m13938a(fVarArr, i, new C4055a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo14573a(Context context, InputStream inputStream) {
        File a = C4058i.m13957a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C4058i.m13963a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo14562a(Context context, CancellationSignal cancellationSignal, C4079f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo14575a(fVarArr, i).mo14611c());
            try {
                Typeface a = mo14573a(context, inputStream);
                C4058i.m13961a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C4058i.m13961a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C4058i.m13961a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C4058i.m13961a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C4058i.m13961a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private C4034c m13937a(C4033b bVar, int i) {
        return (C4034c) m13938a(bVar.mo14547a(), i, new C4056b(this));
    }

    /* renamed from: a */
    public Typeface mo14563a(Context context, C4033b bVar, Resources resources, int i) {
        C4034c a = m13937a(bVar, i);
        if (a == null) {
            return null;
        }
        Typeface a2 = C4049c.m13898a(context, resources, a.mo14549b(), a.mo14548a(), i);
        m13939a(a2, bVar);
        return a2;
    }

    /* renamed from: a */
    public Typeface mo14564a(Context context, Resources resources, int i, String str, int i2) {
        File a = C4058i.m13957a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C4058i.m13962a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4033b mo14574a(Typeface typeface) {
        long b = m13940b(typeface);
        if (b == 0) {
            return null;
        }
        return (C4033b) this.f10268a.get(Long.valueOf(b));
    }

    /* renamed from: a */
    private void m13939a(Typeface typeface, C4033b bVar) {
        long b = m13940b(typeface);
        if (b != 0) {
            this.f10268a.put(Long.valueOf(b), bVar);
        }
    }
}
