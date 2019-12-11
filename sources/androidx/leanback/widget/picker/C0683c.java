package androidx.leanback.widget.picker;

import android.content.res.Resources;
import android.os.Build.VERSION;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: androidx.leanback.widget.picker.c */
/* compiled from: PickerUtility */
class C0683c {

    /* renamed from: a */
    static final boolean f2934a = (VERSION.SDK_INT >= 18);

    /* renamed from: androidx.leanback.widget.picker.c$a */
    /* compiled from: PickerUtility */
    public static class C0684a {

        /* renamed from: a */
        public final Locale f2935a;

        /* renamed from: b */
        public final String[] f2936b;

        C0684a(Locale locale, Resources resources) {
            this.f2935a = locale;
            this.f2936b = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar instance = Calendar.getInstance(locale);
            C0683c.m3626a(instance.getMinimum(5), instance.getMaximum(5), "%02d");
        }
    }

    /* renamed from: a */
    public static C0684a m3624a(Locale locale, Resources resources) {
        return new C0684a(locale, resources);
    }

    /* renamed from: a */
    public static String[] m3626a(int i, int i2, String str) {
        String[] strArr = new String[((i2 - i) + 1)];
        for (int i3 = i; i3 <= i2; i3++) {
            if (str != null) {
                strArr[i3 - i] = String.format(str, new Object[]{Integer.valueOf(i3)});
            } else {
                strArr[i3 - i] = String.valueOf(i3);
            }
        }
        return strArr;
    }

    /* renamed from: a */
    public static Calendar m3625a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar instance = Calendar.getInstance(locale);
        instance.setTimeInMillis(timeInMillis);
        return instance;
    }
}
