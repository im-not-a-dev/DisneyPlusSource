package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology.Fields;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;

abstract class BasicChronology extends AssembledChronology {
    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final DateTimeField cClockhourOfDayField = new ZeroIsMaxDateTimeField(cHourOfDayField, DateTimeFieldType.clockhourOfDay());
    private static final DateTimeField cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField(cHourOfHalfdayField, DateTimeFieldType.clockhourOfHalfday());
    /* access modifiers changed from: private */
    public static final DurationField cDaysField = new PreciseDurationField(DurationFieldType.days(), 86400000);
    private static final DateTimeField cHalfdayOfDayField = new HalfdayField();
    /* access modifiers changed from: private */
    public static final DurationField cHalfdaysField = new PreciseDurationField(DurationFieldType.halfdays(), 43200000);
    private static final DateTimeField cHourOfDayField = new PreciseDateTimeField(DateTimeFieldType.hourOfDay(), cHoursField, cDaysField);
    private static final DateTimeField cHourOfHalfdayField = new PreciseDateTimeField(DateTimeFieldType.hourOfHalfday(), cHoursField, cHalfdaysField);
    private static final DurationField cHoursField = new PreciseDurationField(DurationFieldType.hours(), 3600000);
    private static final DurationField cMillisField = MillisDurationField.INSTANCE;
    private static final DateTimeField cMillisOfDayField = new PreciseDateTimeField(DateTimeFieldType.millisOfDay(), cMillisField, cDaysField);
    private static final DateTimeField cMillisOfSecondField = new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), cMillisField, cSecondsField);
    private static final DateTimeField cMinuteOfDayField = new PreciseDateTimeField(DateTimeFieldType.minuteOfDay(), cMinutesField, cDaysField);
    private static final DateTimeField cMinuteOfHourField = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), cMinutesField, cHoursField);
    private static final DurationField cMinutesField = new PreciseDurationField(DurationFieldType.minutes(), 60000);
    private static final DateTimeField cSecondOfDayField = new PreciseDateTimeField(DateTimeFieldType.secondOfDay(), cSecondsField, cDaysField);
    private static final DateTimeField cSecondOfMinuteField = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), cSecondsField, cMinutesField);
    private static final DurationField cSecondsField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    private static final DurationField cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), 604800000);
    private static final long serialVersionUID = 8283225332206808863L;
    private final int iMinDaysInFirstWeek;
    private final transient YearInfo[] iYearInfoCache = new YearInfo[CACHE_SIZE];

    private static class HalfdayField extends PreciseDateTimeField {
        private static final long serialVersionUID = 581601443656929254L;

        HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }

        public String getAsText(int i, Locale locale) {
            return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i);
        }

        public int getMaximumTextLength(Locale locale) {
            return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }

        public long set(long j, String str, Locale locale) {
            return set(j, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(str));
        }
    }

    private static class YearInfo {
        public final long iFirstDayMillis;
        public final int iYear;

        YearInfo(int i, long j) {
            this.iYear = i;
            this.iFirstDayMillis = j;
        }
    }

    BasicChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj);
        if (i < 1 || i > 7) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid min days in first week: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.iMinDaysInFirstWeek = i;
    }

    private long getDateTimeMillis0(int i, int i2, int i3, int i4) {
        long dateMidnightMillis = getDateMidnightMillis(i, i2, i3);
        if (dateMidnightMillis == Long.MIN_VALUE) {
            dateMidnightMillis = getDateMidnightMillis(i, i2, i3 + 1);
            i4 -= DateTimeConstants.MILLIS_PER_DAY;
        }
        long j = ((long) i4) + dateMidnightMillis;
        int i5 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i5 < 0 && dateMidnightMillis > 0) {
            return Long.MAX_VALUE;
        }
        if (i5 <= 0 || dateMidnightMillis >= 0) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    private YearInfo getYearInfo(int i) {
        int i2 = i & CACHE_MASK;
        YearInfo yearInfo = this.iYearInfoCache[i2];
        if (yearInfo != null && yearInfo.iYear == i) {
            return yearInfo;
        }
        YearInfo yearInfo2 = new YearInfo(i, calculateFirstDayOfYearMillis(i));
        this.iYearInfoCache[i2] = yearInfo2;
        return yearInfo2;
    }

    /* access modifiers changed from: protected */
    public void assemble(Fields fields) {
        fields.millis = cMillisField;
        fields.seconds = cSecondsField;
        fields.minutes = cMinutesField;
        fields.hours = cHoursField;
        fields.halfdays = cHalfdaysField;
        fields.days = cDaysField;
        fields.weeks = cWeeksField;
        fields.millisOfSecond = cMillisOfSecondField;
        fields.millisOfDay = cMillisOfDayField;
        fields.secondOfMinute = cSecondOfMinuteField;
        fields.secondOfDay = cSecondOfDayField;
        fields.minuteOfHour = cMinuteOfHourField;
        fields.minuteOfDay = cMinuteOfDayField;
        fields.hourOfDay = cHourOfDayField;
        fields.hourOfHalfday = cHourOfHalfdayField;
        fields.clockhourOfDay = cClockhourOfDayField;
        fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        fields.halfdayOfDay = cHalfdayOfDayField;
        fields.year = new BasicYearDateTimeField(this);
        fields.yearOfEra = new GJYearOfEraDateTimeField(fields.year, this);
        fields.centuryOfEra = new DividedDateTimeField((DateTimeField) new OffsetDateTimeField(fields.yearOfEra, 99), DateTimeFieldType.centuryOfEra(), 100);
        fields.centuries = fields.centuryOfEra.getDurationField();
        fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
        fields.era = new GJEraDateTimeField(this);
        fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        fields.weekyear = new BasicWeekyearDateTimeField(this);
        fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        fields.years = fields.year.getDurationField();
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyears = fields.weekyear.getDurationField();
    }

    /* access modifiers changed from: 0000 */
    public abstract long calculateFirstDayOfYearMillis(int i);

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        if (getMinimumDaysInFirstWeek() != basicChronology.getMinimumDaysInFirstWeek() || !getZone().equals(basicChronology.getZone())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public abstract long getApproxMillisAtEpochDividedByTwo();

    /* access modifiers changed from: 0000 */
    public abstract long getAverageMillisPerMonth();

    /* access modifiers changed from: 0000 */
    public abstract long getAverageMillisPerYear();

    /* access modifiers changed from: 0000 */
    public abstract long getAverageMillisPerYearDividedByTwo();

    /* access modifiers changed from: 0000 */
    public long getDateMidnightMillis(int i, int i2, int i3) {
        FieldUtils.verifyValueBounds(DateTimeFieldType.year(), i, getMinYear() - 1, getMaxYear() + 1);
        FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), i2, 1, getMaxMonth(i));
        FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), i3, 1, getDaysInYearMonth(i, i2));
        long yearMonthDayMillis = getYearMonthDayMillis(i, i2, i3);
        int i4 = (yearMonthDayMillis > 0 ? 1 : (yearMonthDayMillis == 0 ? 0 : -1));
        if (i4 < 0 && i == getMaxYear() + 1) {
            return Long.MAX_VALUE;
        }
        if (i4 <= 0 || i != getMinYear() - 1) {
            return yearMonthDayMillis;
        }
        return Long.MIN_VALUE;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfDay(), i4, 0, 86399999);
        return getDateTimeMillis0(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    public int getDayOfMonth(long j) {
        int year = getYear(j);
        return getDayOfMonth(j, year, getMonthOfYear(j, year));
    }

    /* access modifiers changed from: 0000 */
    public int getDayOfWeek(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* access modifiers changed from: 0000 */
    public int getDayOfYear(long j) {
        return getDayOfYear(j, getYear(j));
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMax() {
        return 31;
    }

    /* access modifiers changed from: 0000 */
    public abstract int getDaysInMonthMax(int i);

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMax(long j) {
        int year = getYear(j);
        return getDaysInYearMonth(year, getMonthOfYear(j, year));
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMaxForSet(long j, int i) {
        return getDaysInMonthMax(j);
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInYear(int i) {
        return isLeapYear(i) ? 366 : 365;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInYearMax() {
        return 366;
    }

    /* access modifiers changed from: 0000 */
    public abstract int getDaysInYearMonth(int i, int i2);

    /* access modifiers changed from: 0000 */
    public long getFirstWeekOfYearMillis(int i) {
        long yearMillis = getYearMillis(i);
        int dayOfWeek = getDayOfWeek(yearMillis);
        return dayOfWeek > 8 - this.iMinDaysInFirstWeek ? yearMillis + (((long) (8 - dayOfWeek)) * 86400000) : yearMillis - (((long) (dayOfWeek - 1)) * 86400000);
    }

    /* access modifiers changed from: 0000 */
    public int getMaxMonth() {
        return 12;
    }

    /* access modifiers changed from: 0000 */
    public int getMaxMonth(int i) {
        return getMaxMonth();
    }

    /* access modifiers changed from: 0000 */
    public abstract int getMaxYear();

    /* access modifiers changed from: 0000 */
    public int getMillisOfDay(long j) {
        if (j >= 0) {
            return (int) (j % 86400000);
        }
        return ((int) ((j + 1) % 86400000)) + 86399999;
    }

    /* access modifiers changed from: 0000 */
    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    /* access modifiers changed from: 0000 */
    public int getMonthOfYear(long j) {
        return getMonthOfYear(j, getYear(j));
    }

    /* access modifiers changed from: 0000 */
    public abstract int getMonthOfYear(long j, int i);

    /* access modifiers changed from: 0000 */
    public abstract long getTotalMillisByYearMonth(int i, int i2);

    /* access modifiers changed from: 0000 */
    public int getWeekOfWeekyear(long j) {
        return getWeekOfWeekyear(j, getYear(j));
    }

    /* access modifiers changed from: 0000 */
    public int getWeeksInYear(int i) {
        return (int) ((getFirstWeekOfYearMillis(i + 1) - getFirstWeekOfYearMillis(i)) / 604800000);
    }

    /* access modifiers changed from: 0000 */
    public int getWeekyear(long j) {
        int year = getYear(j);
        int weekOfWeekyear = getWeekOfWeekyear(j, year);
        if (weekOfWeekyear == 1) {
            return getYear(j + 604800000);
        }
        return weekOfWeekyear > 51 ? getYear(j - 1209600000) : year;
    }

    /* access modifiers changed from: 0000 */
    public int getYear(long j) {
        long averageMillisPerYearDividedByTwo = getAverageMillisPerYearDividedByTwo();
        long approxMillisAtEpochDividedByTwo = (j >> 1) + getApproxMillisAtEpochDividedByTwo();
        if (approxMillisAtEpochDividedByTwo < 0) {
            approxMillisAtEpochDividedByTwo = (approxMillisAtEpochDividedByTwo - averageMillisPerYearDividedByTwo) + 1;
        }
        int i = (int) (approxMillisAtEpochDividedByTwo / averageMillisPerYearDividedByTwo);
        long yearMillis = getYearMillis(i);
        long j2 = j - yearMillis;
        if (j2 < 0) {
            return i - 1;
        }
        long j3 = 31536000000L;
        if (j2 < 31536000000L) {
            return i;
        }
        if (isLeapYear(i)) {
            j3 = 31622400000L;
        }
        return yearMillis + j3 <= j ? i + 1 : i;
    }

    /* access modifiers changed from: 0000 */
    public abstract long getYearDifference(long j, long j2);

    /* access modifiers changed from: 0000 */
    public long getYearMillis(int i) {
        return getYearInfo(i).iFirstDayMillis;
    }

    /* access modifiers changed from: 0000 */
    public long getYearMonthDayMillis(int i, int i2, int i3) {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, i2) + (((long) (i3 - 1)) * 86400000);
    }

    /* access modifiers changed from: 0000 */
    public long getYearMonthMillis(int i, int i2) {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, i2);
    }

    public DateTimeZone getZone() {
        Chronology base = getBase();
        if (base != null) {
            return base.getZone();
        }
        return DateTimeZone.UTC;
    }

    public int hashCode() {
        return (getClass().getName().hashCode() * 11) + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }

    /* access modifiers changed from: 0000 */
    public boolean isLeapDay(long j) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean isLeapYear(int i);

    /* access modifiers changed from: 0000 */
    public abstract long setYear(long j, int i);

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb.append(",mdfw=");
            sb.append(getMinimumDaysInFirstWeek());
        }
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public int getDayOfYear(long j, int i) {
        return ((int) ((j - getYearMillis(i)) / 86400000)) + 1;
    }

    /* access modifiers changed from: 0000 */
    public int getWeekOfWeekyear(long j, int i) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i);
        if (j < firstWeekOfYearMillis) {
            return getWeeksInYear(i - 1);
        }
        if (j >= getFirstWeekOfYearMillis(i + 1)) {
            return 1;
        }
        return ((int) ((j - firstWeekOfYearMillis) / 604800000)) + 1;
    }

    /* access modifiers changed from: 0000 */
    public int getDayOfMonth(long j, int i) {
        return getDayOfMonth(j, i, getMonthOfYear(j, i));
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), i4, 0, 23);
        FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), i5, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), i6, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), i7, 0, 999);
        return getDateTimeMillis0(i, i2, i3, (int) ((long) ((i4 * DateTimeConstants.MILLIS_PER_HOUR) + (i5 * DateTimeConstants.MILLIS_PER_MINUTE) + (i6 * 1000) + i7)));
    }

    /* access modifiers changed from: 0000 */
    public int getDayOfMonth(long j, int i, int i2) {
        return ((int) ((j - (getYearMillis(i) + getTotalMillisByYearMonth(i, i2))) / 86400000)) + 1;
    }
}
