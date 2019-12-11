package p161f.p162a;

import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: f.a.i3 */
public final class C4472i3 {

    /* renamed from: a */
    private static final String f11102a = C1557c.m7461a(C4472i3.class);

    /* renamed from: b */
    private static final TimeZone f11103b = TimeZone.getTimeZone("UTC");

    /* renamed from: c */
    private static final EnumSet<C4573r6> f11104c = EnumSet.of(C4573r6.SHORT, C4573r6.LONG, C4573r6.ANDROID_LOGCAT);

    /* renamed from: a */
    public static long m15480a() {
        return System.currentTimeMillis() / 1000;
    }

    /* renamed from: b */
    public static double m15486b() {
        return ((double) System.currentTimeMillis()) / 1000.0d;
    }

    /* renamed from: c */
    public static long m15487c() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static Date m15485a(String str, C4573r6 r6Var) {
        if (C1563i.m7490d(str)) {
            String str2 = f11102a;
            StringBuilder sb = new StringBuilder();
            sb.append("Null or blank date string received: ");
            sb.append(str);
            C1557c.m7473e(str2, sb.toString());
            return null;
        } else if (!f11104c.contains(r6Var)) {
            String str3 = f11102a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported date format. Returning null. Got date format: ");
            sb2.append(r6Var);
            C1557c.m7473e(str3, sb2.toString());
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(r6Var.mo15815a(), Locale.US);
            simpleDateFormat.setTimeZone(f11103b);
            try {
                return simpleDateFormat.parse(str);
            } catch (Exception e) {
                String str4 = f11102a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Exception parsing date ");
                sb3.append(str);
                sb3.append(". Returning null");
                C1557c.m7470c(str4, sb3.toString(), e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static String m15482a(Date date, C4573r6 r6Var) {
        if (!f11104c.contains(r6Var)) {
            String str = f11102a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported date format: ");
            sb.append(r6Var);
            sb.append(". Defaulting to ");
            sb.append(C4573r6.LONG);
            C1557c.m7473e(str, sb.toString());
            r6Var = C4573r6.LONG;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(r6Var.mo15815a(), Locale.US);
        simpleDateFormat.setTimeZone(f11103b);
        return simpleDateFormat.format(date);
    }

    /* renamed from: a */
    public static Date m15483a(int i, int i2, int i3) {
        return m15484a(i, i2, i3, 0, 0, 0);
    }

    /* renamed from: a */
    public static Date m15484a(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(f11103b);
        return gregorianCalendar.getTime();
    }

    /* renamed from: a */
    public static long m15481a(Date date) {
        return date.getTime() / 1000;
    }
}
