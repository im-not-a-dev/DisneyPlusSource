package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.p699tz.DefaultNameProvider;
import org.joda.time.p699tz.FixedDateTimeZone;
import org.joda.time.p699tz.NameProvider;
import org.joda.time.p699tz.Provider;

public abstract class DateTimeZone implements Serializable {
    public static final String DEFAULT_TZ_DATA_PATH = "org/joda/time/tz/data";
    private static final int MAX_MILLIS = 86399999;
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();
    private static final AtomicReference<NameProvider> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<Provider> cProvider = new AtomicReference<>();
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;

    static final class LazyInit {
        static final Map<String, String> CONVERSION_MAP = buildMap();
        static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        LazyInit() {
        }

        private static DateTimeFormatter buildFormatter() {
            return new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(new BaseChronology() {
                private static final long serialVersionUID = -3128740902654445468L;

                public DateTimeZone getZone() {
                    return null;
                }

                public String toString() {
                    return C143071.class.getName();
                }

                public Chronology withUTC() {
                    return this;
                }

                public Chronology withZone(DateTimeZone dateTimeZone) {
                    return this;
                }
            });
        }

        private static Map<String, String> buildMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("GMT", "UTC");
            String str = "WET";
            hashMap.put(str, str);
            String str2 = "CET";
            hashMap.put(str2, str2);
            hashMap.put("MET", str2);
            hashMap.put("ECT", str2);
            String str3 = "EET";
            hashMap.put(str3, str3);
            hashMap.put("MIT", "Pacific/Apia");
            hashMap.put("HST", "Pacific/Honolulu");
            hashMap.put("AST", "America/Anchorage");
            hashMap.put("PST", "America/Los_Angeles");
            hashMap.put("MST", "America/Denver");
            hashMap.put("PNT", "America/Phoenix");
            hashMap.put("CST", "America/Chicago");
            hashMap.put("EST", "America/New_York");
            hashMap.put("IET", "America/Indiana/Indianapolis");
            hashMap.put("PRT", "America/Puerto_Rico");
            hashMap.put("CNT", "America/St_Johns");
            hashMap.put("AGT", "America/Argentina/Buenos_Aires");
            hashMap.put("BET", "America/Sao_Paulo");
            hashMap.put("ART", "Africa/Cairo");
            hashMap.put("CAT", "Africa/Harare");
            hashMap.put("EAT", "Africa/Addis_Ababa");
            hashMap.put("NET", "Asia/Yerevan");
            hashMap.put("PLT", "Asia/Karachi");
            hashMap.put("IST", "Asia/Kolkata");
            hashMap.put("BST", "Asia/Dhaka");
            hashMap.put("VST", "Asia/Ho_Chi_Minh");
            hashMap.put("CTT", "Asia/Shanghai");
            hashMap.put("JST", "Asia/Tokyo");
            hashMap.put("ACT", "Australia/Darwin");
            hashMap.put("AET", "Australia/Sydney");
            hashMap.put("SST", "Pacific/Guadalcanal");
            hashMap.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(hashMap);
        }
    }

    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    protected DateTimeZone(String str) {
        if (str != null) {
            this.iID = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    private static String convertToAsciiNumber(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            int digit = Character.digit(sb.charAt(i), 10);
            if (digit >= 0) {
                sb.setCharAt(i, (char) (digit + 48));
            }
        }
        return sb.toString();
    }

    private static DateTimeZone fixedOffsetZone(String str, int i) {
        if (i == 0) {
            return UTC;
        }
        return new FixedDateTimeZone(str, null, i, i);
    }

    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone zone = getProvider().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int parseOffset = parseOffset(str);
            if (((long) parseOffset) == 0) {
                return UTC;
            }
            return fixedOffsetZone(printOffset(parseOffset), parseOffset);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The datetime zone id '");
        sb.append(str);
        sb.append("' is not recognised");
        throw new IllegalArgumentException(sb.toString());
    }

    public static DateTimeZone forOffsetHours(int i) throws IllegalArgumentException {
        return forOffsetHoursMinutes(i, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i, int i2) throws IllegalArgumentException {
        int i3;
        if (i == 0 && i2 == 0) {
            return UTC;
        }
        if (i < -23 || i > 23) {
            StringBuilder sb = new StringBuilder();
            sb.append("Hours out of range: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < -59 || i2 > 59) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Minutes out of range: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i <= 0 || i2 >= 0) {
            int i4 = i * 60;
            if (i4 < 0) {
                try {
                    i3 = i4 - Math.abs(i2);
                } catch (ArithmeticException unused) {
                    throw new IllegalArgumentException("Offset is too large");
                }
            } else {
                i3 = i4 + i2;
            }
            return forOffsetMillis(FieldUtils.safeMultiply(i3, (int) DateTimeConstants.MILLIS_PER_MINUTE));
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Positive hours must not have negative minutes: ");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public static DateTimeZone forOffsetMillis(int i) {
        if (i >= -86399999 && i <= MAX_MILLIS) {
            return fixedOffsetZone(printOffset(i), i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Millis out of range: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            return getDefault();
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        } else if (id.equals("UTC")) {
            return UTC;
        } else {
            DateTimeZone dateTimeZone = null;
            String convertedId = getConvertedId(id);
            Provider provider = getProvider();
            if (convertedId != null) {
                dateTimeZone = provider.getZone(convertedId);
            }
            if (dateTimeZone == null) {
                dateTimeZone = provider.getZone(id);
            }
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            if (convertedId != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
                StringBuilder sb = new StringBuilder();
                sb.append("The datetime zone id '");
                sb.append(id);
                sb.append("' is not recognised");
                throw new IllegalArgumentException(sb.toString());
            }
            String substring = id.substring(3);
            if (substring.length() > 2) {
                char charAt = substring.charAt(1);
                if (charAt > '9' && Character.isDigit(charAt)) {
                    substring = convertToAsciiNumber(substring);
                }
            }
            int parseOffset = parseOffset(substring);
            if (((long) parseOffset) == 0) {
                return UTC;
            }
            return fixedOffsetZone(printOffset(parseOffset), parseOffset);
        }
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String str) {
        return (String) LazyInit.CONVERSION_MAP.get(str);
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZone = (DateTimeZone) cDefault.get();
        if (dateTimeZone != null) {
            return dateTimeZone;
        }
        try {
            String property = System.getProperty("user.timezone");
            if (property != null) {
                dateTimeZone = forID(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZone == null) {
            try {
                dateTimeZone = forTimeZone(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZone == null) {
            dateTimeZone = UTC;
        }
        return !cDefault.compareAndSet(null, dateTimeZone) ? (DateTimeZone) cDefault.get() : dateTimeZone;
    }

    private static NameProvider getDefaultNameProvider() {
        Class<NameProvider> cls = NameProvider.class;
        NameProvider nameProvider = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                Class cls2 = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                if (cls.isAssignableFrom(cls2)) {
                    nameProvider = (NameProvider) cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("System property referred to class that does not implement ");
                    sb.append(cls);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (SecurityException unused) {
        }
        return nameProvider == null ? new DefaultNameProvider() : nameProvider;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.joda.time.p699tz.Provider getDefaultProvider() {
        /*
            java.lang.Class<org.joda.time.tz.Provider> r0 = org.joda.time.p699tz.Provider.class
            java.lang.String r1 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ SecurityException -> 0x0050 }
            if (r1 == 0) goto L_0x0050
            java.lang.Class<org.joda.time.DateTimeZone> r2 = org.joda.time.DateTimeZone.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x0049 }
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch:{ Exception -> 0x0049 }
            boolean r2 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x0049 }
            if (r2 == 0) goto L_0x0032
            java.lang.Class r0 = r1.asSubclass(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0049 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch:{ Exception -> 0x0049 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ Exception -> 0x0049 }
            org.joda.time.tz.Provider r0 = (org.joda.time.p699tz.Provider) r0     // Catch:{ Exception -> 0x0049 }
            org.joda.time.tz.Provider r0 = validateProvider(r0)     // Catch:{ Exception -> 0x0049 }
            return r0
        L_0x0032:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
            r2.<init>()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r3 = "System property referred to class that does not implement "
            r2.append(r3)     // Catch:{ Exception -> 0x0049 }
            r2.append(r0)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0049 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0049 }
            throw r1     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ SecurityException -> 0x0050 }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x0050 }
            throw r1     // Catch:{ SecurityException -> 0x0050 }
        L_0x0050:
            java.lang.String r0 = "org.joda.time.DateTimeZone.Folder"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x006e }
            if (r0 == 0) goto L_0x006e
            org.joda.time.tz.ZoneInfoProvider r1 = new org.joda.time.tz.ZoneInfoProvider     // Catch:{ Exception -> 0x0067 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0067 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0067 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0067 }
            org.joda.time.tz.Provider r0 = validateProvider(r1)     // Catch:{ Exception -> 0x0067 }
            return r0
        L_0x0067:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ SecurityException -> 0x006e }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x006e }
            throw r1     // Catch:{ SecurityException -> 0x006e }
        L_0x006e:
            org.joda.time.tz.ZoneInfoProvider r0 = new org.joda.time.tz.ZoneInfoProvider     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = "org/joda/time/tz/data"
            r0.<init>(r1)     // Catch:{ Exception -> 0x007a }
            org.joda.time.tz.Provider r0 = validateProvider(r0)     // Catch:{ Exception -> 0x007a }
            return r0
        L_0x007a:
            r0 = move-exception
            r0.printStackTrace()
            org.joda.time.tz.UTCProvider r0 = new org.joda.time.tz.UTCProvider
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.getDefaultProvider():org.joda.time.tz.Provider");
    }

    public static NameProvider getNameProvider() {
        NameProvider nameProvider = (NameProvider) cNameProvider.get();
        if (nameProvider != null) {
            return nameProvider;
        }
        NameProvider defaultNameProvider = getDefaultNameProvider();
        return !cNameProvider.compareAndSet(null, defaultNameProvider) ? (NameProvider) cNameProvider.get() : defaultNameProvider;
    }

    public static Provider getProvider() {
        Provider provider = (Provider) cProvider.get();
        if (provider != null) {
            return provider;
        }
        Provider defaultProvider = getDefaultProvider();
        return !cProvider.compareAndSet(null, defaultProvider) ? (Provider) cProvider.get() : defaultProvider;
    }

    private static int parseOffset(String str) {
        return -((int) LazyInit.OFFSET_FORMATTER.parseMillis(str));
    }

    private static String printOffset(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / DateTimeConstants.MILLIS_PER_HOUR;
        FormatUtils.appendPaddedInteger(stringBuffer, i2, 2);
        int i3 = i - (i2 * DateTimeConstants.MILLIS_PER_HOUR);
        int i4 = i3 / DateTimeConstants.MILLIS_PER_MINUTE;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * DateTimeConstants.MILLIS_PER_MINUTE);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        FormatUtils.appendPaddedInteger(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone != null) {
            cDefault.set(dateTimeZone);
            return;
        }
        throw new IllegalArgumentException("The datetime zone must not be null");
    }

    public static void setNameProvider(NameProvider nameProvider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        if (nameProvider == null) {
            nameProvider = getDefaultNameProvider();
        }
        cNameProvider.set(nameProvider);
    }

    public static void setProvider(Provider provider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = getDefaultProvider();
        } else {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider) {
        Set availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        String str = "UTC";
        if (!availableIDs.contains(str)) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        } else if (UTC.equals(provider.getZone(str))) {
            return provider;
        } else {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    public long adjustOffset(long j, boolean z) {
        long j2 = j - 10800000;
        long offset = (long) getOffset(j2);
        long offset2 = (long) getOffset(10800000 + j);
        if (offset <= offset2) {
            return j;
        }
        long j3 = offset - offset2;
        long nextTransition = nextTransition(j2);
        long j4 = nextTransition - j3;
        long j5 = nextTransition + j3;
        if (j >= j4 && j < j5) {
            if (j - j4 >= j3) {
                if (!z) {
                    j -= j3;
                }
                return j;
            } else if (z) {
                j += j3;
            }
        }
        return j;
    }

    public long convertLocalToUTC(long j, boolean z, long j2) {
        int offset = getOffset(j2);
        long j3 = j - ((long) offset);
        if (getOffset(j3) == offset) {
            return j3;
        }
        return convertLocalToUTC(j, z);
    }

    public long convertUTCToLocal(long j) {
        long offset = (long) getOffset(j);
        long j2 = j + offset;
        if ((j ^ j2) >= 0 || (j ^ offset) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j) {
        if (dateTimeZone == null) {
            dateTimeZone = getDefault();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone2 == this) {
            return j;
        }
        return dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j), false, j);
    }

    public final String getName(long j) {
        return getName(j, null);
    }

    public abstract String getNameKey(long j);

    public abstract int getOffset(long j);

    public final int getOffset(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return getOffset(DateTimeUtils.currentTimeMillis());
        }
        return getOffset(readableInstant.getMillis());
    }

    public int getOffsetFromLocal(long j) {
        int offset = getOffset(j);
        long j2 = j - ((long) offset);
        int offset2 = getOffset(j2);
        if (offset != offset2) {
            if (offset - offset2 < 0) {
                long nextTransition = nextTransition(j2);
                if (nextTransition == j2) {
                    nextTransition = Long.MAX_VALUE;
                }
                long j3 = j - ((long) offset2);
                long nextTransition2 = nextTransition(j3);
                if (nextTransition2 == j3) {
                    nextTransition2 = Long.MAX_VALUE;
                }
                if (nextTransition != nextTransition2) {
                    return offset;
                }
            }
        } else if (offset >= 0) {
            long previousTransition = previousTransition(j2);
            if (previousTransition < j2) {
                int offset3 = getOffset(previousTransition);
                if (j2 - previousTransition <= ((long) (offset3 - offset))) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public final String getShortName(long j) {
        return getShortName(j, null);
    }

    public abstract int getStandardOffset(long j);

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException unused) {
            return true;
        }
    }

    public boolean isStandardOffset(long j) {
        return getOffset(j) == getStandardOffset(j);
    }

    public abstract long nextTransition(long j);

    public abstract long previousTransition(long j);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }

    public String getName(long j, Locale locale) {
        String str;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        if (nameProvider instanceof DefaultNameProvider) {
            str = ((DefaultNameProvider) nameProvider).getName(locale, this.iID, nameKey, isStandardOffset(j));
        } else {
            str = nameProvider.getName(locale, this.iID, nameKey);
        }
        if (str != null) {
            return str;
        }
        return printOffset(getOffset(j));
    }

    public String getShortName(long j, Locale locale) {
        String str;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        if (nameProvider instanceof DefaultNameProvider) {
            str = ((DefaultNameProvider) nameProvider).getShortName(locale, this.iID, nameKey, isStandardOffset(j));
        } else {
            str = nameProvider.getShortName(locale, this.iID, nameKey);
        }
        if (str != null) {
            return str;
        }
        return printOffset(getOffset(j));
    }

    public long convertLocalToUTC(long j, boolean z) {
        long j2;
        int offset = getOffset(j);
        long j3 = j - ((long) offset);
        int offset2 = getOffset(j3);
        if (offset != offset2 && (z || offset < 0)) {
            long nextTransition = nextTransition(j3);
            long j4 = Long.MAX_VALUE;
            if (nextTransition == j3) {
                nextTransition = Long.MAX_VALUE;
            }
            long j5 = j - ((long) offset2);
            long nextTransition2 = nextTransition(j5);
            if (nextTransition2 != j5) {
                j4 = nextTransition2;
            }
            if (nextTransition != j4) {
                if (z) {
                    throw new IllegalInstantException(j, getID());
                }
                long j6 = (long) offset;
                j2 = j - j6;
                if ((j ^ j2) < 0 || (j ^ j6) >= 0) {
                    return j2;
                }
                throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
        }
        offset = offset2;
        long j62 = (long) offset;
        j2 = j - j62;
        if ((j ^ j2) < 0) {
        }
        return j2;
    }
}
