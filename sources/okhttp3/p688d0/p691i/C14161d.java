package okhttp3.p688d0.p691i;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.d0.i.d */
/* compiled from: HttpDate */
public final class C14161d {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f31487a = new C14162a();

    /* renamed from: b */
    private static final String[] f31488b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: c */
    private static final DateFormat[] f31489c = new DateFormat[f31488b.length];

    /* renamed from: okhttp3.d0.i.d$a */
    /* compiled from: HttpDate */
    class C14162a extends ThreadLocal<DateFormat> {
        C14162a() {
        }

        /* access modifiers changed from: protected */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C14126e.f31337h);
            return simpleDateFormat;
        }
    }

    /* renamed from: a */
    public static Date m45009a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f31487a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f31488b) {
            int length = f31488b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f31489c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f31488b[i], Locale.US);
                    dateFormat.setTimeZone(C14126e.f31337h);
                    f31489c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m45008a(Date date) {
        return ((DateFormat) f31487a.get()).format(date);
    }
}
