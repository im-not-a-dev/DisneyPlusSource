package org.joda.time.chrono;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology.Fields;

public final class IslamicChronology extends BasicChronology {

    /* renamed from: AH */
    public static final int f31929AH = 1;
    private static final int CYCLE = 30;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AH");
    private static final IslamicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    public static final LeapYearPatternType LEAP_YEAR_15_BASED = new LeapYearPatternType(0, 623158436);
    public static final LeapYearPatternType LEAP_YEAR_16_BASED = new LeapYearPatternType(1, 623191204);
    public static final LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new LeapYearPatternType(3, 153692453);
    public static final LeapYearPatternType LEAP_YEAR_INDIAN = new LeapYearPatternType(2, 690562340);
    private static final int LONG_MONTH_LENGTH = 30;
    private static final int MAX_YEAR = 292271022;
    private static final long MILLIS_PER_CYCLE = 918518400000L;
    private static final long MILLIS_PER_LONG_MONTH = 2592000000L;
    private static final long MILLIS_PER_LONG_YEAR = 30672000000L;
    private static final long MILLIS_PER_MONTH = 2551440384L;
    private static final long MILLIS_PER_MONTH_PAIR = 5097600000L;
    private static final long MILLIS_PER_SHORT_YEAR = 30585600000L;
    private static final long MILLIS_PER_YEAR = 30617280288L;
    private static final long MILLIS_YEAR_1 = -42521587200000L;
    private static final int MIN_YEAR = -292269337;
    private static final int MONTH_PAIR_LENGTH = 59;
    private static final int SHORT_MONTH_LENGTH = 29;
    private static final ConcurrentHashMap<DateTimeZone, IslamicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -3663823829888L;
    private final LeapYearPatternType iLeapYears;

    public static class LeapYearPatternType implements Serializable {
        private static final long serialVersionUID = 26581275372698L;
        final byte index;
        final int pattern;

        LeapYearPatternType(int i, int i2) {
            this.index = (byte) i;
            this.pattern = i2;
        }

        private Object readResolve() {
            byte b = this.index;
            if (b == 0) {
                return IslamicChronology.LEAP_YEAR_15_BASED;
            }
            if (b == 1) {
                return IslamicChronology.LEAP_YEAR_16_BASED;
            }
            if (b == 2) {
                return IslamicChronology.LEAP_YEAR_INDIAN;
            }
            if (b != 3) {
                return this;
            }
            return IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof LeapYearPatternType) || this.index != ((LeapYearPatternType) obj).index) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.index;
        }

        /* access modifiers changed from: 0000 */
        public boolean isLeapYear(int i) {
            if (((1 << (i % 30)) & this.pattern) > 0) {
                return true;
            }
            return false;
        }
    }

    IslamicChronology(Chronology chronology, Object obj, LeapYearPatternType leapYearPatternType) {
        super(chronology, obj, 4);
        this.iLeapYears = leapYearPatternType;
    }

    public static IslamicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    /* access modifiers changed from: protected */
    public void assemble(Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.era = ERA_FIELD;
            fields.monthOfYear = new BasicMonthOfYearDateTimeField(this, 12);
            fields.months = fields.monthOfYear.getDurationField();
        }
    }

    /* access modifiers changed from: 0000 */
    public long calculateFirstDayOfYearMillis(int i) {
        if (i > MAX_YEAR) {
            StringBuilder sb = new StringBuilder();
            sb.append("Year is too large: ");
            sb.append(i);
            sb.append(" > ");
            sb.append(MAX_YEAR);
            throw new ArithmeticException(sb.toString());
        } else if (i >= MIN_YEAR) {
            int i2 = i - 1;
            long j = (((long) (i2 / 30)) * MILLIS_PER_CYCLE) + MILLIS_YEAR_1;
            for (int i3 = 1; i3 < (i2 % 30) + 1; i3++) {
                j += isLeapYear(i3) ? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR;
            }
            return j;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Year is too small: ");
            sb2.append(i);
            sb2.append(" < ");
            sb2.append(MIN_YEAR);
            throw new ArithmeticException(sb2.toString());
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IslamicChronology)) {
            return false;
        }
        if (getLeapYearPatternType().index != ((IslamicChronology) obj).getLeapYearPatternType().index || !super.equals(obj)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public long getApproxMillisAtEpochDividedByTwo() {
        return 21260793600000L;
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
        return 15308640144L;
    }

    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return super.getDateTimeMillis(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    public int getDayOfMonth(long j) {
        int dayOfYear = getDayOfYear(j) - 1;
        if (dayOfYear == 354) {
            return 30;
        }
        return ((dayOfYear % 59) % 30) + 1;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMax() {
        return 30;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMax(int i) {
        int i2 = 30;
        if (i == 12) {
            return 30;
        }
        if ((i - 1) % 2 != 0) {
            i2 = 29;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInYear(int i) {
        return isLeapYear(i) ? 355 : 354;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInYearMax() {
        return 355;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInYearMonth(int i, int i2) {
        int i3 = 30;
        if (i2 == 12 && isLeapYear(i)) {
            return 30;
        }
        if ((i2 - 1) % 2 != 0) {
            i3 = 29;
        }
        return i3;
    }

    public LeapYearPatternType getLeapYearPatternType() {
        return this.iLeapYears;
    }

    /* access modifiers changed from: 0000 */
    public int getMaxYear() {
        return MAX_YEAR;
    }

    /* access modifiers changed from: 0000 */
    public int getMinYear() {
        return 1;
    }

    public /* bridge */ /* synthetic */ int getMinimumDaysInFirstWeek() {
        return super.getMinimumDaysInFirstWeek();
    }

    /* access modifiers changed from: 0000 */
    public int getMonthOfYear(long j, int i) {
        int yearMillis = (int) ((j - getYearMillis(i)) / 86400000);
        if (yearMillis == 354) {
            return 12;
        }
        return ((yearMillis * 2) / 59) + 1;
    }

    /* access modifiers changed from: 0000 */
    public long getTotalMillisByYearMonth(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 % 2 == 1) {
            return (((long) (i3 / 2)) * MILLIS_PER_MONTH_PAIR) + MILLIS_PER_LONG_MONTH;
        }
        return ((long) (i3 / 2)) * MILLIS_PER_MONTH_PAIR;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0024, code lost:
        if (isLeapYear(r0) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r6 = 30672000000L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        r6 = 30585600000L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r9 < r6) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r9 = r9 - r6;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (isLeapYear(r0) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getYear(long r9) {
        /*
            r8 = this;
            r0 = -42521587200000(0xffffd953abe65000, double:NaN)
            long r9 = r9 - r0
            r0 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r2 = r9 / r0
            long r9 = r9 % r0
            r0 = 30
            long r2 = r2 * r0
            r0 = 1
            long r2 = r2 + r0
            int r0 = (int) r2
            boolean r1 = r8.isLeapYear(r0)
            r2 = 30672000000(0x724319400, double:1.5153981489E-313)
            r4 = 30585600000(0x71f0b3800, double:1.51112942174E-313)
            if (r1 == 0) goto L_0x0028
        L_0x0026:
            r6 = r2
            goto L_0x0029
        L_0x0028:
            r6 = r4
        L_0x0029:
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0037
            long r9 = r9 - r6
            int r0 = r0 + 1
            boolean r1 = r8.isLeapYear(r0)
            if (r1 == 0) goto L_0x0028
            goto L_0x0026
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.IslamicChronology.getYear(long):int");
    }

    /* access modifiers changed from: 0000 */
    public long getYearDifference(long j, long j2) {
        int year = getYear(j);
        int year2 = getYear(j2);
        int i = year - year2;
        if (j - getYearMillis(year) < j2 - getYearMillis(year2)) {
            i--;
        }
        return (long) i;
    }

    public /* bridge */ /* synthetic */ DateTimeZone getZone() {
        return super.getZone();
    }

    public int hashCode() {
        return (super.hashCode() * 13) + getLeapYearPatternType().hashCode();
    }

    /* access modifiers changed from: 0000 */
    public boolean isLeapYear(int i) {
        return this.iLeapYears.isLeapYear(i);
    }

    /* access modifiers changed from: 0000 */
    public long setYear(long j, int i) {
        int dayOfYear = getDayOfYear(j, getYear(j));
        int millisOfDay = getMillisOfDay(j);
        if (dayOfYear > 354 && !isLeapYear(i)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i, 1, dayOfYear) + ((long) millisOfDay);
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

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, LEAP_YEAR_16_BASED);
    }

    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return super.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone, LeapYearPatternType leapYearPatternType) {
        IslamicChronology islamicChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        IslamicChronology[] islamicChronologyArr = (IslamicChronology[]) cCache.get(dateTimeZone);
        if (islamicChronologyArr == null) {
            islamicChronologyArr = new IslamicChronology[4];
            IslamicChronology[] islamicChronologyArr2 = (IslamicChronology[]) cCache.putIfAbsent(dateTimeZone, islamicChronologyArr);
            if (islamicChronologyArr2 != null) {
                islamicChronologyArr = islamicChronologyArr2;
            }
        }
        IslamicChronology islamicChronology2 = islamicChronologyArr[leapYearPatternType.index];
        if (islamicChronology2 == null) {
            synchronized (islamicChronologyArr) {
                islamicChronology2 = islamicChronologyArr[leapYearPatternType.index];
                if (islamicChronology2 == null) {
                    if (dateTimeZone == DateTimeZone.UTC) {
                        IslamicChronology islamicChronology3 = new IslamicChronology(null, null, leapYearPatternType);
                        DateTime dateTime = new DateTime(1, 1, 1, 0, 0, 0, 0, (Chronology) islamicChronology3);
                        islamicChronology = new IslamicChronology(LimitChronology.getInstance(islamicChronology3, dateTime, null), null, leapYearPatternType);
                    } else {
                        islamicChronology = new IslamicChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, leapYearPatternType), dateTimeZone), null, leapYearPatternType);
                    }
                    islamicChronologyArr[leapYearPatternType.index] = islamicChronology;
                    islamicChronology2 = islamicChronology;
                }
            }
        }
        return islamicChronology2;
    }
}
