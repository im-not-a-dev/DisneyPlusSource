package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    public int compareTo(ReadableInstant readableInstant) {
        if (readableInstant != null) {
            int i = get();
            int i2 = readableInstant.get(getFieldType());
            if (i < i2) {
                return -1;
            }
            return i > i2 ? 1 : 0;
        }
        throw new IllegalArgumentException("The instant must not be null");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractReadableInstantFieldProperty)) {
            return false;
        }
        AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
        if (get() != abstractReadableInstantFieldProperty.get() || !getFieldType().equals(abstractReadableInstantFieldProperty.getFieldType()) || !FieldUtils.equals(getChronology(), abstractReadableInstantFieldProperty.getChronology())) {
            z = false;
        }
        return z;
    }

    public int get() {
        return getField().get(getMillis());
    }

    public String getAsShortText() {
        return getAsShortText(null);
    }

    public String getAsString() {
        return Integer.toString(get());
    }

    public String getAsText() {
        return getAsText(null);
    }

    /* access modifiers changed from: protected */
    public Chronology getChronology() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    public int getDifference(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return getField().getDifference(getMillis(), DateTimeUtils.currentTimeMillis());
        }
        return getField().getDifference(getMillis(), readableInstant.getMillis());
    }

    public long getDifferenceAsLong(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return getField().getDifferenceAsLong(getMillis(), DateTimeUtils.currentTimeMillis());
        }
        return getField().getDifferenceAsLong(getMillis(), readableInstant.getMillis());
    }

    public DurationField getDurationField() {
        return getField().getDurationField();
    }

    public abstract DateTimeField getField();

    public DateTimeFieldType getFieldType() {
        return getField().getType();
    }

    public int getLeapAmount() {
        return getField().getLeapAmount(getMillis());
    }

    public DurationField getLeapDurationField() {
        return getField().getLeapDurationField();
    }

    public int getMaximumShortTextLength(Locale locale) {
        return getField().getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        return getField().getMaximumTextLength(locale);
    }

    public int getMaximumValue() {
        return getField().getMaximumValue(getMillis());
    }

    public int getMaximumValueOverall() {
        return getField().getMaximumValue();
    }

    /* access modifiers changed from: protected */
    public abstract long getMillis();

    public int getMinimumValue() {
        return getField().getMinimumValue(getMillis());
    }

    public int getMinimumValueOverall() {
        return getField().getMinimumValue();
    }

    public String getName() {
        return getField().getName();
    }

    public DurationField getRangeDurationField() {
        return getField().getRangeDurationField();
    }

    public int hashCode() {
        return (get() * 17) + getFieldType().hashCode() + getChronology().hashCode();
    }

    public boolean isLeap() {
        return getField().isLeap(getMillis());
    }

    public long remainder() {
        return getField().remainder(getMillis());
    }

    public Interval toInterval() {
        DateTimeField field = getField();
        long roundFloor = field.roundFloor(getMillis());
        Interval interval = new Interval(roundFloor, field.add(roundFloor, 1), getChronology());
        return interval;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Property[");
        sb.append(getName());
        sb.append("]");
        return sb.toString();
    }

    public String getAsShortText(Locale locale) {
        return getField().getAsShortText(getMillis(), locale);
    }

    public String getAsText(Locale locale) {
        return getField().getAsText(getMillis(), locale);
    }

    public int compareTo(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            int i = get();
            int i2 = readablePartial.get(getFieldType());
            if (i < i2) {
                return -1;
            }
            return i > i2 ? 1 : 0;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }
}
