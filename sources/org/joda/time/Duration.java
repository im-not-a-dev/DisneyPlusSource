package org.joda.time;

import java.io.Serializable;
import java.math.RoundingMode;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

public final class Duration extends BaseDuration implements ReadableDuration, Serializable {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j) {
        super(j);
    }

    public static Duration millis(long j) {
        if (j == 0) {
            return ZERO;
        }
        return new Duration(j);
    }

    public static Duration parse(String str) {
        return new Duration((Object) str);
    }

    public static Duration standardDays(long j) {
        if (j == 0) {
            return ZERO;
        }
        return new Duration(FieldUtils.safeMultiply(j, (int) DateTimeConstants.MILLIS_PER_DAY));
    }

    public static Duration standardHours(long j) {
        if (j == 0) {
            return ZERO;
        }
        return new Duration(FieldUtils.safeMultiply(j, (int) DateTimeConstants.MILLIS_PER_HOUR));
    }

    public static Duration standardMinutes(long j) {
        if (j == 0) {
            return ZERO;
        }
        return new Duration(FieldUtils.safeMultiply(j, (int) DateTimeConstants.MILLIS_PER_MINUTE));
    }

    public static Duration standardSeconds(long j) {
        if (j == 0) {
            return ZERO;
        }
        return new Duration(FieldUtils.safeMultiply(j, 1000));
    }

    public Duration abs() {
        return getMillis() < 0 ? negated() : this;
    }

    public Duration dividedBy(long j) {
        return j == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j));
    }

    public long getStandardDays() {
        return getMillis() / 86400000;
    }

    public long getStandardHours() {
        return getMillis() / 3600000;
    }

    public long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public Duration minus(long j) {
        return withDurationAdded(j, -1);
    }

    public Duration multipliedBy(long j) {
        return j == 1 ? this : new Duration(FieldUtils.safeMultiply(getMillis(), j));
    }

    public Duration negated() {
        if (getMillis() != Long.MIN_VALUE) {
            return new Duration(-getMillis());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }

    public Duration plus(long j) {
        return withDurationAdded(j, 1);
    }

    public Duration toDuration() {
        return this;
    }

    public Days toStandardDays() {
        return Days.days(FieldUtils.safeToInt(getStandardDays()));
    }

    public Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
    }

    public Duration withDurationAdded(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return new Duration(FieldUtils.safeAdd(getMillis(), FieldUtils.safeMultiply(j, i)));
    }

    public Duration withMillis(long j) {
        if (j == getMillis()) {
            return this;
        }
        return new Duration(j);
    }

    public Duration(long j, long j2) {
        super(j, j2);
    }

    public Duration dividedBy(long j, RoundingMode roundingMode) {
        return j == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j, roundingMode));
    }

    public Duration minus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), -1);
    }

    public Duration plus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), 1);
    }

    public Duration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public Duration(Object obj) {
        super(obj);
    }

    public Duration withDurationAdded(ReadableDuration readableDuration, int i) {
        return (readableDuration == null || i == 0) ? this : withDurationAdded(readableDuration.getMillis(), i);
    }
}
