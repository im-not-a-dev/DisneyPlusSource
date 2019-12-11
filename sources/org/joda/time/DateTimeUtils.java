package org.joda.time;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;

public class DateTimeUtils {
    public static final MillisProvider SYSTEM_MILLIS_PROVIDER = new SystemMillisProvider();
    private static volatile MillisProvider cMillisProvider = SYSTEM_MILLIS_PROVIDER;
    private static final AtomicReference<Map<String, DateTimeZone>> cZoneNames = new AtomicReference<>();

    static class FixedMillisProvider implements MillisProvider {
        private final long iMillis;

        FixedMillisProvider(long j) {
            this.iMillis = j;
        }

        public long getMillis() {
            return this.iMillis;
        }
    }

    public interface MillisProvider {
        long getMillis();
    }

    static class OffsetMillisProvider implements MillisProvider {
        private final long iMillis;

        OffsetMillisProvider(long j) {
            this.iMillis = j;
        }

        public long getMillis() {
            return System.currentTimeMillis() + this.iMillis;
        }
    }

    static class SystemMillisProvider implements MillisProvider {
        SystemMillisProvider() {
        }

        public long getMillis() {
            return System.currentTimeMillis();
        }
    }

    protected DateTimeUtils() {
    }

    private static Map<String, DateTimeZone> buildDefaultTimeZoneNames() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", DateTimeZone.UTC);
        linkedHashMap.put("UTC", DateTimeZone.UTC);
        linkedHashMap.put("GMT", DateTimeZone.UTC);
        String str = "America/New_York";
        put(linkedHashMap, "EST", str);
        put(linkedHashMap, "EDT", str);
        String str2 = "America/Chicago";
        put(linkedHashMap, "CST", str2);
        put(linkedHashMap, "CDT", str2);
        String str3 = "America/Denver";
        put(linkedHashMap, "MST", str3);
        put(linkedHashMap, "MDT", str3);
        String str4 = "America/Los_Angeles";
        put(linkedHashMap, "PST", str4);
        put(linkedHashMap, "PDT", str4);
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static void checkPermission() throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("CurrentTime.setProvider"));
        }
    }

    public static final long currentTimeMillis() {
        return cMillisProvider.getMillis();
    }

    public static final long fromJulianDay(double d) {
        return (long) ((d - 2440587.5d) * 8.64E7d);
    }

    public static final Chronology getChronology(Chronology chronology) {
        return chronology == null ? ISOChronology.getInstance() : chronology;
    }

    public static final DateFormatSymbols getDateFormatSymbols(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class}).invoke(null, new Object[]{locale});
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final Map<String, DateTimeZone> getDefaultTimeZoneNames() {
        Map<String, DateTimeZone> map = (Map) cZoneNames.get();
        if (map != null) {
            return map;
        }
        Map<String, DateTimeZone> buildDefaultTimeZoneNames = buildDefaultTimeZoneNames();
        return !cZoneNames.compareAndSet(null, buildDefaultTimeZoneNames) ? (Map) cZoneNames.get() : buildDefaultTimeZoneNames;
    }

    public static final long getDurationMillis(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            return 0;
        }
        return readableDuration.getMillis();
    }

    public static final Chronology getInstantChronology(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return ISOChronology.getInstance();
        }
        Chronology chronology = readableInstant.getChronology();
        if (chronology == null) {
            chronology = ISOChronology.getInstance();
        }
        return chronology;
    }

    public static final long getInstantMillis(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return currentTimeMillis();
        }
        return readableInstant.getMillis();
    }

    public static final Chronology getIntervalChronology(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        Chronology chronology = readableInstant != null ? readableInstant.getChronology() : readableInstant2 != null ? readableInstant2.getChronology() : null;
        return chronology == null ? ISOChronology.getInstance() : chronology;
    }

    public static final PeriodType getPeriodType(PeriodType periodType) {
        return periodType == null ? PeriodType.standard() : periodType;
    }

    public static final ReadableInterval getReadableInterval(ReadableInterval readableInterval) {
        if (readableInterval != null) {
            return readableInterval;
        }
        long currentTimeMillis = currentTimeMillis();
        return new Interval(currentTimeMillis, currentTimeMillis);
    }

    public static final DateTimeZone getZone(DateTimeZone dateTimeZone) {
        return dateTimeZone == null ? DateTimeZone.getDefault() : dateTimeZone;
    }

    public static final boolean isContiguous(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            DurationFieldType durationFieldType = null;
            for (int i = 0; i < readablePartial.size(); i++) {
                DateTimeField field = readablePartial.getField(i);
                if (i > 0 && (field.getRangeDurationField() == null || field.getRangeDurationField().getType() != durationFieldType)) {
                    return false;
                }
                durationFieldType = field.getDurationField().getType();
            }
            return true;
        }
        throw new IllegalArgumentException("Partial must not be null");
    }

    private static void put(Map<String, DateTimeZone> map, String str, String str2) {
        try {
            map.put(str, DateTimeZone.forID(str2));
        } catch (RuntimeException unused) {
        }
    }

    public static final void setCurrentMillisFixed(long j) throws SecurityException {
        checkPermission();
        cMillisProvider = new FixedMillisProvider(j);
    }

    public static final void setCurrentMillisOffset(long j) throws SecurityException {
        checkPermission();
        if (j == 0) {
            cMillisProvider = SYSTEM_MILLIS_PROVIDER;
        } else {
            cMillisProvider = new OffsetMillisProvider(j);
        }
    }

    public static final void setCurrentMillisProvider(MillisProvider millisProvider) throws SecurityException {
        if (millisProvider != null) {
            checkPermission();
            cMillisProvider = millisProvider;
            return;
        }
        throw new IllegalArgumentException("The MillisProvider must not be null");
    }

    public static final void setCurrentMillisSystem() throws SecurityException {
        checkPermission();
        cMillisProvider = SYSTEM_MILLIS_PROVIDER;
    }

    public static final void setDefaultTimeZoneNames(Map<String, DateTimeZone> map) {
        cZoneNames.set(Collections.unmodifiableMap(new HashMap(map)));
    }

    public static final double toJulianDay(long j) {
        return (((double) j) / 8.64E7d) + 2440587.5d;
    }

    public static final long toJulianDayNumber(long j) {
        return (long) Math.floor(toJulianDay(j) + 0.5d);
    }

    public static final Chronology getIntervalChronology(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return ISOChronology.getInstance();
        }
        Chronology chronology = readableInterval.getChronology();
        if (chronology == null) {
            chronology = ISOChronology.getInstance();
        }
        return chronology;
    }
}
