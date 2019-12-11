package p096e.p121h.p132q;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: e.h.q.c */
/* compiled from: ICUCompat */
public final class C4091c {

    /* renamed from: a */
    private static Method f10337a;

    /* renamed from: b */
    private static Method f10338b;

    static {
        int i = VERSION.SDK_INT;
        String str = "addLikelySubtags";
        if (i < 21) {
            try {
                Class cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f10337a = cls.getMethod("getScript", new Class[]{String.class});
                    f10338b = cls.getMethod(str, new Class[]{String.class});
                }
            } catch (Exception e) {
                f10337a = null;
                f10338b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f10338b = Class.forName("libcore.icu.ICU").getMethod(str, new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m14040a(String str) {
        String str2 = "ICUCompat";
        try {
            if (f10337a != null) {
                return (String) f10337a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w(str2, e);
        } catch (InvocationTargetException e2) {
            Log.w(str2, e2);
        }
        return null;
    }

    /* renamed from: b */
    public static String m14042b(Locale locale) {
        String str = "ICUCompat";
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f10338b.invoke(null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w(str, e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w(str, e2);
                return locale.getScript();
            }
        } else {
            String a = m14041a(locale);
            if (a != null) {
                return m14040a(a);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static String m14041a(Locale locale) {
        String str = "ICUCompat";
        String locale2 = locale.toString();
        try {
            if (f10338b != null) {
                return (String) f10338b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w(str, e);
        } catch (InvocationTargetException e2) {
            Log.w(str, e2);
        }
        return locale2;
    }
}
