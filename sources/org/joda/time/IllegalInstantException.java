package org.joda.time;

import org.joda.time.format.DateTimeFormat;

public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j, String str) {
        String str2;
        String print = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print((ReadableInstant) new Instant(j));
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(str);
            sb.append(")");
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ");
        sb2.append(print);
        sb2.append(str2);
        return sb2.toString();
    }

    public static boolean isIllegalInstant(Throwable th) {
        if (th instanceof IllegalInstantException) {
            return true;
        }
        if (th.getCause() == null || th.getCause() == th) {
            return false;
        }
        return isIllegalInstant(th.getCause());
    }

    public IllegalInstantException(long j, String str) {
        super(createMessage(j, str));
    }
}
