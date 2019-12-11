package net.danlew.android.joda;

import android.content.Context;
import android.content.res.Resources;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;

public class DateUtils {
    private static final DateTime EPOCH = new DateTime(0, DateTimeZone.UTC);
    public static final int FORMAT_ABBREV_ALL = 524288;
    public static final int FORMAT_ABBREV_MONTH = 65536;
    public static final int FORMAT_ABBREV_RELATIVE = 262144;
    public static final int FORMAT_ABBREV_TIME = 16384;
    public static final int FORMAT_ABBREV_WEEKDAY = 32768;
    public static final int FORMAT_NO_MIDNIGHT = 2048;
    public static final int FORMAT_NO_MONTH_DAY = 32;
    public static final int FORMAT_NO_NOON = 512;
    public static final int FORMAT_NO_YEAR = 8;
    public static final int FORMAT_NUMERIC_DATE = 131072;
    public static final int FORMAT_SHOW_DATE = 16;
    public static final int FORMAT_SHOW_TIME = 1;
    public static final int FORMAT_SHOW_WEEKDAY = 2;
    public static final int FORMAT_SHOW_YEAR = 4;
    private static final int FORMAT_UTC = 8192;

    public static String formatDateRange(Context context, ReadablePartial readablePartial, ReadablePartial readablePartial2, int i) {
        return formatDateRange(context, toMillis(readablePartial), toMillis(readablePartial2), i);
    }

    public static String formatDateTime(Context context, ReadablePartial readablePartial, int i) {
        return android.text.format.DateUtils.formatDateTime(context, toMillis(readablePartial), i | 8192);
    }

    public static CharSequence formatDuration(Context context, ReadableDuration readableDuration) {
        Resources resources = context.getResources();
        Duration duration = readableDuration.toDuration();
        int standardHours = (int) duration.getStandardHours();
        if (standardHours != 0) {
            return resources.getQuantityString(C14103R.plurals.joda_time_android_duration_hours, standardHours, new Object[]{Integer.valueOf(standardHours)});
        }
        int standardMinutes = (int) duration.getStandardMinutes();
        if (standardMinutes != 0) {
            return resources.getQuantityString(C14103R.plurals.joda_time_android_duration_minutes, standardMinutes, new Object[]{Integer.valueOf(standardMinutes)});
        }
        int standardSeconds = (int) duration.getStandardSeconds();
        return resources.getQuantityString(C14103R.plurals.joda_time_android_duration_seconds, standardSeconds, new Object[]{Integer.valueOf(standardSeconds)});
    }

    public static String formatElapsedTime(ReadableDuration readableDuration) {
        return formatElapsedTime(null, readableDuration);
    }

    public static CharSequence getRelativeDateTimeString(Context context, ReadablePartial readablePartial, ReadablePeriod readablePeriod, int i) {
        if (readablePartial.isSupported(DateTimeFieldType.hourOfDay()) && readablePartial.isSupported(DateTimeFieldType.minuteOfHour())) {
            return getRelativeDateTimeString(context, (ReadableInstant) readablePartial.toDateTime(DateTime.now()), readablePeriod, i);
        }
        throw new IllegalArgumentException("getRelativeDateTimeString() must be passed a ReadablePartial that supports time, otherwise it makes no sense");
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadablePartial readablePartial) {
        return getRelativeTimeSpanString(context, (ReadableInstant) readablePartial.toDateTime(DateTime.now()));
    }

    public static boolean isToday(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.dayOfMonth()) || !readablePartial.isSupported(DateTimeFieldType.monthOfYear()) || !readablePartial.isSupported(DateTimeFieldType.year())) {
            throw new IllegalArgumentException("isToday() must be passed a ReadablePartial that supports day of month, month of year and year.");
        }
        return LocalDate.now().compareTo((ReadablePartial) readablePartial instanceof LocalDate ? (LocalDate) readablePartial : new LocalDate((Object) readablePartial)) == 0;
    }

    private static long toMillis(ReadablePartial readablePartial) {
        return readablePartial.toDateTime(EPOCH).getMillis();
    }

    public static String formatDateRange(Context context, ReadableInstant readableInstant, ReadableInstant readableInstant2, int i) {
        return formatDateRange(context, toMillis(readableInstant), toMillis(readableInstant2), i);
    }

    public static String formatDateTime(Context context, ReadableInstant readableInstant, int i) {
        return android.text.format.DateUtils.formatDateTime(context, toMillis(readableInstant), i | 8192);
    }

    public static String formatElapsedTime(StringBuilder sb, ReadableDuration readableDuration) {
        return android.text.format.DateUtils.formatElapsedTime(sb, (long) readableDuration.toDuration().toStandardSeconds().getSeconds());
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadableInstant readableInstant) {
        return getRelativeTimeSpanString(context, readableInstant, 65556);
    }

    private static long toMillis(ReadableInstant readableInstant) {
        return (readableInstant instanceof DateTime ? (DateTime) readableInstant : new DateTime((Object) readableInstant)).withZoneRetainFields(DateTimeZone.UTC).getMillis();
    }

    private static String formatDateRange(Context context, long j, long j2, int i) {
        if (j != j2) {
            j2 += 1000;
        }
        return android.text.format.DateUtils.formatDateRange(context, j, j2, i | 8192);
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadablePartial readablePartial, int i) {
        return getRelativeTimeSpanString(context, (ReadableInstant) readablePartial.toDateTime(DateTime.now()), i);
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadableInstant readableInstant, int i) {
        Interval interval;
        long j;
        int i2;
        boolean z = (786432 & i) != 0;
        DateTime withMillisOfSecond = DateTime.now(readableInstant.getZone()).withMillisOfSecond(0);
        DateTime withMillisOfSecond2 = new DateTime((Object) readableInstant).withMillisOfSecond(0);
        boolean z2 = !withMillisOfSecond.isBefore((ReadableInstant) withMillisOfSecond2);
        if (z2) {
            interval = new Interval((ReadableInstant) withMillisOfSecond2, (ReadableInstant) withMillisOfSecond);
        } else {
            interval = new Interval((ReadableInstant) withMillisOfSecond, (ReadableInstant) withMillisOfSecond2);
        }
        if (Minutes.minutesIn(interval).isLessThan(Minutes.ONE)) {
            j = (long) Seconds.secondsIn(interval).getSeconds();
            if (z2) {
                if (z) {
                    i2 = C14103R.plurals.joda_time_android_abbrev_num_seconds_ago;
                } else {
                    i2 = C14103R.plurals.joda_time_android_num_seconds_ago;
                }
            } else if (z) {
                i2 = C14103R.plurals.joda_time_android_abbrev_in_num_seconds;
            } else {
                i2 = C14103R.plurals.joda_time_android_in_num_seconds;
            }
        } else if (Hours.hoursIn(interval).isLessThan(Hours.ONE)) {
            j = (long) Minutes.minutesIn(interval).getMinutes();
            if (z2) {
                if (z) {
                    i2 = C14103R.plurals.joda_time_android_abbrev_num_minutes_ago;
                } else {
                    i2 = C14103R.plurals.joda_time_android_num_minutes_ago;
                }
            } else if (z) {
                i2 = C14103R.plurals.joda_time_android_abbrev_in_num_minutes;
            } else {
                i2 = C14103R.plurals.joda_time_android_in_num_minutes;
            }
        } else if (Days.daysIn(interval).isLessThan(Days.ONE)) {
            j = (long) Hours.hoursIn(interval).getHours();
            if (z2) {
                if (z) {
                    i2 = C14103R.plurals.joda_time_android_abbrev_num_hours_ago;
                } else {
                    i2 = C14103R.plurals.joda_time_android_num_hours_ago;
                }
            } else if (z) {
                i2 = C14103R.plurals.joda_time_android_abbrev_in_num_hours;
            } else {
                i2 = C14103R.plurals.joda_time_android_in_num_hours;
            }
        } else if (!Weeks.weeksIn(interval).isLessThan(Weeks.ONE)) {
            return formatDateRange(context, readableInstant, readableInstant, i);
        } else {
            j = (long) Days.daysIn(interval).getDays();
            if (z2) {
                if (z) {
                    i2 = C14103R.plurals.joda_time_android_abbrev_num_days_ago;
                } else {
                    i2 = C14103R.plurals.joda_time_android_num_days_ago;
                }
            } else if (z) {
                i2 = C14103R.plurals.joda_time_android_abbrev_in_num_days;
            } else {
                i2 = C14103R.plurals.joda_time_android_in_num_days;
            }
        }
        return String.format(context.getResources().getQuantityString(i2, (int) j), new Object[]{Long.valueOf(j)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r10.isShorterThan(r7) != false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence getRelativeDateTimeString(android.content.Context r8, org.joda.time.ReadableInstant r9, org.joda.time.ReadablePeriod r10, int r11) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            org.joda.time.DateTimeZone r1 = r9.getZone()
            org.joda.time.DateTime r1 = org.joda.time.DateTime.now(r1)
            r2 = 0
            org.joda.time.DateTime r1 = r1.withMillisOfSecond(r2)
            org.joda.time.DateTime r3 = new org.joda.time.DateTime
            r3.<init>(r9)
            org.joda.time.DateTime r3 = r3.withMillisOfSecond(r2)
            boolean r4 = r1.isBefore(r3)
            r5 = 1
            r4 = r4 ^ r5
            org.joda.time.Duration r6 = new org.joda.time.Duration
            if (r4 == 0) goto L_0x0028
            r6.<init>(r3, r1)
            goto L_0x002b
        L_0x0028:
            r6.<init>(r1, r3)
        L_0x002b:
            org.joda.time.Days r7 = org.joda.time.Days.ONE
            org.joda.time.Period r7 = r7.toPeriod()
            org.joda.time.Duration r7 = r7.toDurationTo(r3)
            if (r10 != 0) goto L_0x0038
            goto L_0x0063
        L_0x0038:
            if (r4 == 0) goto L_0x0043
            org.joda.time.Period r10 = r10.toPeriod()
            org.joda.time.Duration r10 = r10.toDurationTo(r1)
            goto L_0x004b
        L_0x0043:
            org.joda.time.Period r10 = r10.toPeriod()
            org.joda.time.Duration r10 = r10.toDurationFrom(r1)
        L_0x004b:
            org.joda.time.Weeks r1 = org.joda.time.Weeks.ONE
            org.joda.time.Period r1 = r1.toPeriod()
            org.joda.time.Duration r1 = r1.toDurationTo(r3)
            boolean r3 = r10.isLongerThan(r1)
            if (r3 == 0) goto L_0x005d
            r10 = r1
            goto L_0x0064
        L_0x005d:
            boolean r1 = r10.isShorterThan(r7)
            if (r1 == 0) goto L_0x0064
        L_0x0063:
            r10 = r7
        L_0x0064:
            java.lang.String r1 = formatDateRange(r8, r9, r9, r5)
            boolean r10 = r6.isLongerThan(r10)
            r3 = 2
            if (r10 != 0) goto L_0x0080
            java.lang.CharSequence r8 = getRelativeTimeSpanString(r8, r9, r11)
            int r9 = net.danlew.android.joda.C14103R.string.joda_time_android_relative_time
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r2] = r8
            r10[r5] = r1
            java.lang.String r8 = r0.getString(r9, r10)
            goto L_0x0090
        L_0x0080:
            java.lang.CharSequence r8 = getRelativeTimeSpanString(r8, r9, r2)
            int r9 = net.danlew.android.joda.C14103R.string.joda_time_android_date_time
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r2] = r8
            r10[r5] = r1
            java.lang.String r8 = r0.getString(r9, r10)
        L_0x0090:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.danlew.android.joda.DateUtils.getRelativeDateTimeString(android.content.Context, org.joda.time.ReadableInstant, org.joda.time.ReadablePeriod, int):java.lang.CharSequence");
    }

    public static boolean isToday(ReadableInstant readableInstant) {
        return LocalDate.now().compareTo((ReadablePartial) new LocalDate((Object) readableInstant)) == 0;
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadablePartial readablePartial, boolean z) {
        return getRelativeTimeSpanString(context, (ReadableInstant) readablePartial.toDateTime(DateTime.now()), z);
    }

    public static CharSequence getRelativeTimeSpanString(Context context, ReadableInstant readableInstant, boolean z) {
        String str;
        int i;
        LocalDate now = LocalDate.now();
        LocalDate localDate = new LocalDate((Object) readableInstant);
        if (Days.daysBetween((ReadablePartial) now, (ReadablePartial) localDate).getDays() == 0) {
            str = formatDateRange(context, readableInstant, readableInstant, 1);
            i = C14103R.string.joda_time_android_preposition_for_time;
        } else if (Years.yearsBetween((ReadablePartial) now, (ReadablePartial) localDate).getYears() != 0) {
            str = formatDateRange(context, readableInstant, readableInstant, 131092);
            i = C14103R.string.joda_time_android_preposition_for_date;
        } else {
            str = formatDateRange(context, readableInstant, readableInstant, 65552);
            i = C14103R.string.joda_time_android_preposition_for_date;
        }
        if (!z) {
            return str;
        }
        return context.getString(i, new Object[]{str});
    }
}
