package org.joda.time.chrono;

import org.joda.time.Chronology;

abstract class BasicGJChronology extends BasicChronology {
    private static final long FEB_29 = 5097600000L;
    private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
    private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            j += ((long) MIN_DAYS_PER_MONTH_ARRAY[i]) * 86400000;
            int i2 = i + 1;
            MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i2] = j;
            j2 += ((long) MAX_DAYS_PER_MONTH_ARRAY[i]) * 86400000;
            MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i2] = j2;
            i = i2;
        }
    }

    BasicGJChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMax(int i) {
        return MAX_DAYS_PER_MONTH_ARRAY[i - 1];
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInMonthMaxForSet(long j, int i) {
        if (i > 28 || i < 1) {
            return getDaysInMonthMax(j);
        }
        return 28;
    }

    /* access modifiers changed from: 0000 */
    public int getDaysInYearMonth(int i, int i2) {
        if (isLeapYear(i)) {
            return MAX_DAYS_PER_MONTH_ARRAY[i2 - 1];
        }
        return MIN_DAYS_PER_MONTH_ARRAY[i2 - 1];
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r14 < 12825000) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r14 < 20587500) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r14 < 28265625) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        if (r14 < 12740625) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        if (r14 < 20503125) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a6, code lost:
        if (r14 < 28181250) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return 11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getMonthOfYear(long r13, int r15) {
        /*
            r12 = this;
            long r0 = r12.getYearMillis(r15)
            long r13 = r13 - r0
            r0 = 10
            long r13 = r13 >> r0
            int r14 = (int) r13
            boolean r13 = r12.isLeapYear(r15)
            r15 = 2
            r1 = 3
            r2 = 5
            r3 = 6
            r4 = 8
            r5 = 9
            r6 = 11
            r7 = 12
            r8 = 1
            r9 = 4
            r10 = 7
            r11 = 2615625(0x27e949, float:3.665271E-39)
            if (r13 == 0) goto L_0x005e
            r13 = 15356250(0xea515a, float:2.151869E-38)
            if (r14 >= r13) goto L_0x0041
            r13 = 7678125(0x7528ad, float:1.0759345E-38)
            if (r14 >= r13) goto L_0x0035
            if (r14 >= r11) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            r13 = 5062500(0x4d3f64, float:7.094073E-39)
            if (r14 >= r13) goto L_0x0072
            goto L_0x00ad
        L_0x0035:
            r13 = 10209375(0x9bc85f, float:1.4306382E-38)
            if (r14 >= r13) goto L_0x003b
            goto L_0x0079
        L_0x003b:
            r13 = 12825000(0xc3b1a8, float:1.7971653E-38)
            if (r14 >= r13) goto L_0x0082
            goto L_0x0080
        L_0x0041:
            r13 = 23118750(0x160c39e, float:4.128265E-38)
            if (r14 >= r13) goto L_0x0052
            r13 = 17971875(0x1123aa3, float:2.6858035E-38)
            if (r14 >= r13) goto L_0x004c
            goto L_0x008e
        L_0x004c:
            r13 = 20587500(0x13a23ec, float:3.4188577E-38)
            if (r14 >= r13) goto L_0x0098
            goto L_0x0095
        L_0x0052:
            r13 = 25734375(0x188ace7, float:5.020661E-38)
            if (r14 >= r13) goto L_0x0058
            goto L_0x00a0
        L_0x0058:
            r13 = 28265625(0x1af4c99, float:6.439476E-38)
            if (r14 >= r13) goto L_0x00ab
            goto L_0x00a8
        L_0x005e:
            r13 = 15271875(0xe907c3, float:2.1400455E-38)
            if (r14 >= r13) goto L_0x0084
            r13 = 7593750(0x73df16, float:1.064111E-38)
            if (r14 >= r13) goto L_0x0074
            if (r14 >= r11) goto L_0x006c
        L_0x006a:
            r15 = 1
            goto L_0x00ad
        L_0x006c:
            r13 = 4978125(0x4bf5cd, float:6.975839E-39)
            if (r14 >= r13) goto L_0x0072
            goto L_0x00ad
        L_0x0072:
            r15 = 3
            goto L_0x00ad
        L_0x0074:
            r13 = 10125000(0x9a7ec8, float:1.4188147E-38)
            if (r14 >= r13) goto L_0x007b
        L_0x0079:
            r15 = 4
            goto L_0x00ad
        L_0x007b:
            r13 = 12740625(0xc26811, float:1.7853418E-38)
            if (r14 >= r13) goto L_0x0082
        L_0x0080:
            r15 = 5
            goto L_0x00ad
        L_0x0082:
            r15 = 6
            goto L_0x00ad
        L_0x0084:
            r13 = 23034375(0x15f7a07, float:4.1046182E-38)
            if (r14 >= r13) goto L_0x009b
            r13 = 17887500(0x110f10c, float:2.6621566E-38)
            if (r14 >= r13) goto L_0x0090
        L_0x008e:
            r15 = 7
            goto L_0x00ad
        L_0x0090:
            r13 = 20503125(0x138da55, float:3.3952108E-38)
            if (r14 >= r13) goto L_0x0098
        L_0x0095:
            r15 = 8
            goto L_0x00ad
        L_0x0098:
            r15 = 9
            goto L_0x00ad
        L_0x009b:
            r13 = 25650000(0x1876350, float:4.9733674E-38)
            if (r14 >= r13) goto L_0x00a3
        L_0x00a0:
            r15 = 10
            goto L_0x00ad
        L_0x00a3:
            r13 = 28181250(0x1ae0302, float:6.392182E-38)
            if (r14 >= r13) goto L_0x00ab
        L_0x00a8:
            r15 = 11
            goto L_0x00ad
        L_0x00ab:
            r15 = 12
        L_0x00ad:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicGJChronology.getMonthOfYear(long, int):int");
    }

    /* access modifiers changed from: 0000 */
    public long getTotalMillisByYearMonth(int i, int i2) {
        if (isLeapYear(i)) {
            return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i2 - 1];
        }
        return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i2 - 1];
    }

    /* access modifiers changed from: 0000 */
    public long getYearDifference(long j, long j2) {
        int year = getYear(j);
        int year2 = getYear(j2);
        long yearMillis = j - getYearMillis(year);
        long yearMillis2 = j2 - getYearMillis(year2);
        if (yearMillis2 >= FEB_29) {
            if (isLeapYear(year2)) {
                if (!isLeapYear(year)) {
                    yearMillis2 -= 86400000;
                }
            } else if (yearMillis >= FEB_29 && isLeapYear(year)) {
                yearMillis -= 86400000;
            }
        }
        int i = year - year2;
        if (yearMillis < yearMillis2) {
            i--;
        }
        return (long) i;
    }

    /* access modifiers changed from: 0000 */
    public boolean isLeapDay(long j) {
        return dayOfMonth().get(j) == 29 && monthOfYear().isLeap(j);
    }

    /* access modifiers changed from: 0000 */
    public long setYear(long j, int i) {
        int year = getYear(j);
        int dayOfYear = getDayOfYear(j, year);
        int millisOfDay = getMillisOfDay(j);
        if (dayOfYear > 59) {
            if (isLeapYear(year)) {
                if (!isLeapYear(i)) {
                    dayOfYear--;
                }
            } else if (isLeapYear(i)) {
                dayOfYear++;
            }
        }
        return getYearMonthDayMillis(i, 1, dayOfYear) + ((long) millisOfDay);
    }
}
