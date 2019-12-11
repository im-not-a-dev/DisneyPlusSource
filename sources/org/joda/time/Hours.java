package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Hours extends BaseSingleFieldPeriod {
    public static final Hours EIGHT = new Hours(8);
    public static final Hours FIVE = new Hours(5);
    public static final Hours FOUR = new Hours(4);
    public static final Hours MAX_VALUE = new Hours(Integer.MAX_VALUE);
    public static final Hours MIN_VALUE = new Hours(Integer.MIN_VALUE);
    public static final Hours ONE = new Hours(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.hours());
    public static final Hours SEVEN = new Hours(7);
    public static final Hours SIX = new Hours(6);
    public static final Hours THREE = new Hours(3);
    public static final Hours TWO = new Hours(2);
    public static final Hours ZERO = new Hours(0);
    private static final long serialVersionUID = 87525275727380864L;

    private Hours(int i) {
        super(i);
    }

    public static Hours hours(int i) {
        if (i == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        switch (i) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            default:
                return new Hours(i);
        }
    }

    public static Hours hoursBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return hours(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.hours()));
    }

    public static Hours hoursIn(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return ZERO;
        }
        return hours(BaseSingleFieldPeriod.between((ReadableInstant) readableInterval.getStart(), (ReadableInstant) readableInterval.getEnd(), DurationFieldType.hours()));
    }

    public static Hours parseHours(String str) {
        if (str == null) {
            return ZERO;
        }
        return hours(PARSER.parsePeriod(str).getHours());
    }

    private Object readResolve() {
        return hours(getValue());
    }

    public static Hours standardHoursIn(ReadablePeriod readablePeriod) {
        return hours(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 3600000));
    }

    public Hours dividedBy(int i) {
        return i == 1 ? this : hours(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.hours();
    }

    public int getHours() {
        return getValue();
    }

    public PeriodType getPeriodType() {
        return PeriodType.hours();
    }

    public boolean isGreaterThan(Hours hours) {
        boolean z = true;
        if (hours == null) {
            if (getValue() <= 0) {
                z = false;
            }
            return z;
        }
        if (getValue() <= hours.getValue()) {
            z = false;
        }
        return z;
    }

    public boolean isLessThan(Hours hours) {
        boolean z = true;
        if (hours == null) {
            if (getValue() >= 0) {
                z = false;
            }
            return z;
        }
        if (getValue() >= hours.getValue()) {
            z = false;
        }
        return z;
    }

    public Hours minus(int i) {
        return plus(FieldUtils.safeNegate(i));
    }

    public Hours multipliedBy(int i) {
        return hours(FieldUtils.safeMultiply(getValue(), i));
    }

    public Hours negated() {
        return hours(FieldUtils.safeNegate(getValue()));
    }

    public Hours plus(int i) {
        return i == 0 ? this : hours(FieldUtils.safeAdd(getValue(), i));
    }

    public Days toStandardDays() {
        return Days.days(getValue() / 24);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 3600000);
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 60));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.SECONDS_PER_HOUR));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / DateTimeConstants.HOURS_PER_WEEK);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PT");
        sb.append(String.valueOf(getValue()));
        sb.append("H");
        return sb.toString();
    }

    public Hours minus(Hours hours) {
        return hours == null ? this : minus(hours.getValue());
    }

    public Hours plus(Hours hours) {
        return hours == null ? this : plus(hours.getValue());
    }

    public static Hours hoursBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if (!(readablePartial instanceof LocalTime) || !(readablePartial2 instanceof LocalTime)) {
            return hours(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, (ReadablePeriod) ZERO));
        }
        return hours(DateTimeUtils.getChronology(readablePartial.getChronology()).hours().getDifference(((LocalTime) readablePartial2).getLocalMillis(), ((LocalTime) readablePartial).getLocalMillis()));
    }
}
