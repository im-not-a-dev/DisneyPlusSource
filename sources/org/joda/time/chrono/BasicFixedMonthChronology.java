package org.joda.time.chrono;

import org.joda.time.Chronology;

abstract class BasicFixedMonthChronology extends BasicChronology {
    static final long MILLIS_PER_MONTH = 2592000000L;
    static final long MILLIS_PER_YEAR = 31557600000L;
    static final int MONTH_LENGTH = 30;
    private static final long serialVersionUID = 261387371998L;

    BasicFixedMonthChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
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
    public int getDayOfMonth(long j) {
        return ((getDayOfYear(j) - 1) % 30) + 1;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMax() {
        return 30;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMax(int i) {
        return i != 13 ? 30 : 6;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInYearMonth(int i, int i2) {
        if (i2 != 13) {
            return 30;
        }
        return isLeapYear(i) ? 6 : 5;
    }

    /* access modifiers changed from: 0000 */
    public int getMaxMonth() {
        return 13;
    }

    /* access modifiers changed from: 0000 */
    public int getMonthOfYear(long j) {
        return ((getDayOfYear(j) - 1) / 30) + 1;
    }

    /* access modifiers changed from: 0000 */
    public long getTotalMillisByYearMonth(int i, int i2) {
        return ((long) (i2 - 1)) * MILLIS_PER_MONTH;
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

    /* access modifiers changed from: 0000 */
    public boolean isLeapYear(int i) {
        return (i & 3) == 3;
    }

    /* access modifiers changed from: 0000 */
    public long setYear(long j, int i) {
        int dayOfYear = getDayOfYear(j, getYear(j));
        int millisOfDay = getMillisOfDay(j);
        if (dayOfYear > 365 && !isLeapYear(i)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i, 1, dayOfYear) + ((long) millisOfDay);
    }

    /* access modifiers changed from: 0000 */
    public int getMonthOfYear(long j, int i) {
        return ((int) ((j - getYearMillis(i)) / MILLIS_PER_MONTH)) + 1;
    }
}
