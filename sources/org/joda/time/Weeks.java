package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Weeks extends BaseSingleFieldPeriod {
    public static final Weeks MAX_VALUE = new Weeks(Integer.MAX_VALUE);
    public static final Weeks MIN_VALUE = new Weeks(Integer.MIN_VALUE);
    public static final Weeks ONE = new Weeks(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.weeks());
    public static final Weeks THREE = new Weeks(3);
    public static final Weeks TWO = new Weeks(2);
    public static final Weeks ZERO = new Weeks(0);
    private static final long serialVersionUID = 87525275727380866L;

    private Weeks(int i) {
        super(i);
    }

    public static Weeks parseWeeks(String str) {
        if (str == null) {
            return ZERO;
        }
        return weeks(PARSER.parsePeriod(str).getWeeks());
    }

    private Object readResolve() {
        return weeks(getValue());
    }

    public static Weeks standardWeeksIn(ReadablePeriod readablePeriod) {
        return weeks(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 604800000));
    }

    public static Weeks weeks(int i) {
        if (i == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return ONE;
        }
        if (i == 2) {
            return TWO;
        }
        if (i != 3) {
            return new Weeks(i);
        }
        return THREE;
    }

    public static Weeks weeksBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return weeks(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.weeks()));
    }

    public static Weeks weeksIn(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return ZERO;
        }
        return weeks(BaseSingleFieldPeriod.between((ReadableInstant) readableInterval.getStart(), (ReadableInstant) readableInterval.getEnd(), DurationFieldType.weeks()));
    }

    public Weeks dividedBy(int i) {
        return i == 1 ? this : weeks(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.weeks();
    }

    public PeriodType getPeriodType() {
        return PeriodType.weeks();
    }

    public int getWeeks() {
        return getValue();
    }

    public boolean isGreaterThan(Weeks weeks) {
        boolean z = true;
        if (weeks == null) {
            if (getValue() <= 0) {
                z = false;
            }
            return z;
        }
        if (getValue() <= weeks.getValue()) {
            z = false;
        }
        return z;
    }

    public boolean isLessThan(Weeks weeks) {
        boolean z = true;
        if (weeks == null) {
            if (getValue() >= 0) {
                z = false;
            }
            return z;
        }
        if (getValue() >= weeks.getValue()) {
            z = false;
        }
        return z;
    }

    public Weeks minus(int i) {
        return plus(FieldUtils.safeNegate(i));
    }

    public Weeks multipliedBy(int i) {
        return weeks(FieldUtils.safeMultiply(getValue(), i));
    }

    public Weeks negated() {
        return weeks(FieldUtils.safeNegate(getValue()));
    }

    public Weeks plus(int i) {
        return i == 0 ? this : weeks(FieldUtils.safeAdd(getValue(), i));
    }

    public Days toStandardDays() {
        return Days.days(FieldUtils.safeMultiply(getValue(), 7));
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 604800000);
    }

    public Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.HOURS_PER_WEEK));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.MINUTES_PER_WEEK));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.SECONDS_PER_WEEK));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("P");
        sb.append(String.valueOf(getValue()));
        sb.append("W");
        return sb.toString();
    }

    public Weeks minus(Weeks weeks) {
        return weeks == null ? this : minus(weeks.getValue());
    }

    public Weeks plus(Weeks weeks) {
        return weeks == null ? this : plus(weeks.getValue());
    }

    public static Weeks weeksBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if (!(readablePartial instanceof LocalDate) || !(readablePartial2 instanceof LocalDate)) {
            return weeks(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, (ReadablePeriod) ZERO));
        }
        return weeks(DateTimeUtils.getChronology(readablePartial.getChronology()).weeks().getDifference(((LocalDate) readablePartial2).getLocalMillis(), ((LocalDate) readablePartial).getLocalMillis()));
    }
}
