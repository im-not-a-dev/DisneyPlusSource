package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Months extends BaseSingleFieldPeriod {
    public static final Months EIGHT = new Months(8);
    public static final Months ELEVEN = new Months(11);
    public static final Months FIVE = new Months(5);
    public static final Months FOUR = new Months(4);
    public static final Months MAX_VALUE = new Months(Integer.MAX_VALUE);
    public static final Months MIN_VALUE = new Months(Integer.MIN_VALUE);
    public static final Months NINE = new Months(9);
    public static final Months ONE = new Months(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.months());
    public static final Months SEVEN = new Months(7);
    public static final Months SIX = new Months(6);
    public static final Months TEN = new Months(10);
    public static final Months THREE = new Months(3);
    public static final Months TWELVE = new Months(12);
    public static final Months TWO = new Months(2);
    public static final Months ZERO = new Months(0);
    private static final long serialVersionUID = 87525275727380867L;

    private Months(int i) {
        super(i);
    }

    public static Months months(int i) {
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
            case 9:
                return NINE;
            case 10:
                return TEN;
            case 11:
                return ELEVEN;
            case 12:
                return TWELVE;
            default:
                return new Months(i);
        }
    }

    public static Months monthsBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return months(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.months()));
    }

    public static Months monthsIn(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return ZERO;
        }
        return months(BaseSingleFieldPeriod.between((ReadableInstant) readableInterval.getStart(), (ReadableInstant) readableInterval.getEnd(), DurationFieldType.months()));
    }

    public static Months parseMonths(String str) {
        if (str == null) {
            return ZERO;
        }
        return months(PARSER.parsePeriod(str).getMonths());
    }

    private Object readResolve() {
        return months(getValue());
    }

    public Months dividedBy(int i) {
        return i == 1 ? this : months(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.months();
    }

    public int getMonths() {
        return getValue();
    }

    public PeriodType getPeriodType() {
        return PeriodType.months();
    }

    public boolean isGreaterThan(Months months) {
        boolean z = true;
        if (months == null) {
            if (getValue() <= 0) {
                z = false;
            }
            return z;
        }
        if (getValue() <= months.getValue()) {
            z = false;
        }
        return z;
    }

    public boolean isLessThan(Months months) {
        boolean z = true;
        if (months == null) {
            if (getValue() >= 0) {
                z = false;
            }
            return z;
        }
        if (getValue() >= months.getValue()) {
            z = false;
        }
        return z;
    }

    public Months minus(int i) {
        return plus(FieldUtils.safeNegate(i));
    }

    public Months multipliedBy(int i) {
        return months(FieldUtils.safeMultiply(getValue(), i));
    }

    public Months negated() {
        return months(FieldUtils.safeNegate(getValue()));
    }

    public Months plus(int i) {
        return i == 0 ? this : months(FieldUtils.safeAdd(getValue(), i));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("P");
        sb.append(String.valueOf(getValue()));
        sb.append("M");
        return sb.toString();
    }

    public Months minus(Months months) {
        return months == null ? this : minus(months.getValue());
    }

    public Months plus(Months months) {
        return months == null ? this : plus(months.getValue());
    }

    public static Months monthsBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if (!(readablePartial instanceof LocalDate) || !(readablePartial2 instanceof LocalDate)) {
            return months(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, (ReadablePeriod) ZERO));
        }
        return months(DateTimeUtils.getChronology(readablePartial.getChronology()).months().getDifference(((LocalDate) readablePartial2).getLocalMillis(), ((LocalDate) readablePartial).getLocalMillis()));
    }
}
