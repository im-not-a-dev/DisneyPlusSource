package p096e.p121h.p132q;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: e.h.q.g */
/* compiled from: TextUtilsCompat */
public final class C4103g {

    /* renamed from: a */
    private static final Locale f10360a;

    static {
        String str = "";
        f10360a = new Locale(str, str);
    }

    /* renamed from: a */
    private static int m14064a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m14065b(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f10360a)) {
            String b = C4091c.m14042b(locale);
            if (b == null) {
                return m14064a(locale);
            }
            if (b.equalsIgnoreCase("Arab") || b.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
