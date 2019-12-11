package p096e.p121h.p125k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import p096e.p113e.C3934g;
import p096e.p121h.p122j.p124d.C4031c.C4032a;
import p096e.p121h.p122j.p124d.C4031c.C4033b;
import p096e.p121h.p122j.p124d.C4031c.C4035d;
import p096e.p121h.p122j.p124d.C4039f.C4040a;
import p096e.p121h.p131p.C4073b;
import p096e.p121h.p131p.C4073b.C4079f;

/* renamed from: e.h.k.c */
/* compiled from: TypefaceCompat */
public class C4049c {

    /* renamed from: a */
    private static final C4054h f10250a;

    /* renamed from: b */
    private static final C3934g<String, Typeface> f10251b = new C3934g<>(16);

    static {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            f10250a = new C4053g();
        } else if (i >= 26) {
            f10250a = new C4052f();
        } else if (i >= 24 && C4051e.m13913a()) {
            f10250a = new C4051e();
        } else if (VERSION.SDK_INT >= 21) {
            f10250a = new C4050d();
        } else {
            f10250a = new C4054h();
        }
    }

    /* renamed from: a */
    private static String m13902a(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    public static Typeface m13904b(Resources resources, int i, int i2) {
        return (Typeface) f10251b.mo14079b(m13902a(resources, i, i2));
    }

    /* renamed from: a */
    public static Typeface m13901a(Context context, C4032a aVar, Resources resources, int i, int i2, C4040a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C4035d) {
            C4035d dVar = (C4035d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo14554a() == 0) {
                z2 = true;
            }
            typeface = C4073b.m13992a(context, dVar.mo14555b(), aVar2, handler, z2, z ? dVar.mo14556c() : -1, i2);
        } else {
            typeface = f10250a.mo14563a(context, (C4033b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo14558a(typeface, handler);
                } else {
                    aVar2.mo14557a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f10251b.mo14073a(m13902a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: b */
    private static Typeface m13903b(Context context, Typeface typeface, int i) {
        C4033b a = f10250a.mo14574a(typeface);
        if (a == null) {
            return null;
        }
        return f10250a.mo14563a(context, a, context.getResources(), i);
    }

    /* renamed from: a */
    public static Typeface m13898a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f10250a.mo14564a(context, resources, i, str, i2);
        if (a != null) {
            f10251b.mo14073a(m13902a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m13900a(Context context, CancellationSignal cancellationSignal, C4079f[] fVarArr, int i) {
        return f10250a.mo14562a(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m13899a(Context context, Typeface typeface, int i) {
        if (context != null) {
            if (VERSION.SDK_INT < 21) {
                Typeface b = m13903b(context, typeface, i);
                if (b != null) {
                    return b;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
}
