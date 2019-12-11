package p096e.p154p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;
import p096e.p121h.p135s.C4187x;

/* renamed from: e.p.d0 */
/* compiled from: ViewUtils */
class C4283d0 {

    /* renamed from: a */
    private static final C4297h0 f10659a;

    /* renamed from: b */
    private static Field f10660b;

    /* renamed from: c */
    private static boolean f10661c;

    /* renamed from: d */
    static final Property<View, Float> f10662d = new C4284a(Float.class, "translationAlpha");

    /* renamed from: e.p.d0$a */
    /* compiled from: ViewUtils */
    static class C4284a extends Property<View, Float> {
        C4284a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C4283d0.m14709c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C4283d0.m14703a(view, f.floatValue());
        }
    }

    /* renamed from: e.p.d0$b */
    /* compiled from: ViewUtils */
    static class C4285b extends Property<View, Rect> {
        C4285b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C4187x.m14391h(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            C4187x.m14357a(view, rect);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 22) {
            f10659a = new C4295g0();
        } else if (i >= 21) {
            f10659a = new C4293f0();
        } else if (i >= 19) {
            f10659a = new C4291e0();
        } else {
            f10659a = new C4297h0();
        }
        new C4285b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m14703a(View view, float f) {
        f10659a.mo15056a(view, f);
    }

    /* renamed from: b */
    static C4279c0 m14707b(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C4266b0(view);
        }
        return C4263a0.m14656c(view);
    }

    /* renamed from: c */
    static float m14709c(View view) {
        return f10659a.mo15057b(view);
    }

    /* renamed from: d */
    static C4308l0 m14710d(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C4306k0(view);
        }
        return new C4304j0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m14711e(View view) {
        f10659a.mo15058c(view);
    }

    /* renamed from: a */
    static void m14702a(View view) {
        f10659a.mo15055a(view);
    }

    /* renamed from: a */
    static void m14704a(View view, int i) {
        m14701a();
        Field field = f10660b;
        if (field != null) {
            try {
                f10660b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* renamed from: b */
    static void m14708b(View view, Matrix matrix) {
        f10659a.mo15060b(view, matrix);
    }

    /* renamed from: a */
    static void m14706a(View view, Matrix matrix) {
        f10659a.mo15059a(view, matrix);
    }

    /* renamed from: a */
    static void m14705a(View view, int i, int i2, int i3, int i4) {
        f10659a.mo15062a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    private static void m14701a() {
        if (!f10661c) {
            try {
                f10660b = View.class.getDeclaredField("mViewFlags");
                f10660b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f10661c = true;
        }
    }
}
