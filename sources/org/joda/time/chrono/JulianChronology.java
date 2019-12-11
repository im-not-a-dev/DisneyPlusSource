package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology.Fields;
import org.joda.time.field.SkipDateTimeField;

public final class JulianChronology extends BasicGJChronology {
    private static final JulianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    private static final int MAX_YEAR = 292272992;
    private static final long MILLIS_PER_MONTH = 2629800000L;
    private static final long MILLIS_PER_YEAR = 31557600000L;
    private static final int MIN_YEAR = -292269054;
    private static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -8731039522547897247L;

    JulianChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    static int adjustYearForSet(int i) {
        if (i > 0) {
            return i;
        }
        if (i != 0) {
            return i + 1;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.year(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
    }

    public static JulianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static JulianChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        if (minimumDaysInFirstWeek == 0) {
            minimumDaysInFirstWeek = 4;
        }
        if (base == null) {
            return getInstance(DateTimeZone.UTC, minimumDaysInFirstWeek);
        }
        return getInstance(base.getZone(), minimumDaysInFirstWeek);
    }

    /* access modifiers changed from: protected */
    public void assemble(Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
        }
    }

    /* access modifiers changed from: 0000 */
    public long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i - 1968;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !isLeapYear(i) ? i4 + 1 : i4;
        }
        return (((((long) i3) * 365) + ((long) i2)) * 86400000) - 62035200000L;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083663600000L;
    }

    /* access modifiers changed from: 0000 */
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    /* access modifiers changed from: 0000 */
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    /* access modifiers changed from: 0000 */
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    /* access modifiers changed from: 0000 */
    public long getDateMidnightMillis(int i, int i2, int i3) throws IllegalArgumentException {
        return super.getDateMidnightMillis(adjustYearForSet(i), i2, i3);
    }

    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return super.getDateTimeMillis(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    public int getMaxYear() {
        return MAX_YEAR;
    }

    /* access modifiers changed from: 0000 */
    public int getMinYear() {
        return MIN_YEAR;
    }

    public /* bridge */ /* synthetic */ int getMinimumDaysInFirstWeek() {
        return super.getMinimumDaysInFirstWeek();
    }

    public /* bridge */ /* synthetic */ DateTimeZone getZone() {
        return super.getZone();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public boolean isLeapYear(int i) {
        return (i & 3) == 0;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Chronology withUTC() {
        return INSTANCE_UTC;
    }

    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getZone()) {
            return this;
        }
        return getInstance(dateTimeZone);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return super.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone, int i) {
        JulianChronology julianChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        JulianChronology[] julianChronologyArr = (JulianChronology[]) cCache.get(dateTimeZone);
        if (julianChronologyArr == null) {
            julianChronologyArr = new JulianChronology[7];
            JulianChronology[] julianChronologyArr2 = (JulianChronology[]) cCache.putIfAbsent(dateTimeZone, julianChronologyArr);
            if (julianChronologyArr2 != null) {
                julianChronologyArr = julianChronologyArr2;
            }
        }
        int i2 = i - 1;
        try {
            JulianChronology julianChronology2 = julianChronologyArr[i2];
            if (julianChronology2 == null) {
                synchronized (julianChronologyArr) {
                    julianChronology2 = julianChronologyArr[i2];
                    if (julianChronology2 == null) {
                        if (dateTimeZone == DateTimeZone.UTC) {
                            julianChronology = new JulianChronology(null, null, i);
                        } else {
                            julianChronology = new JulianChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, i), dateTimeZone), null, i);
                        }
                        julianChronologyArr[i2] = julianChronology;
                        julianChronology2 = julianChronology;
                    }
                }
            }
            return julianChronology2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid min days in first week: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
