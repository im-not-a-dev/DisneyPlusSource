package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

public abstract class AbstractPartialFieldProperty {
    protected AbstractPartialFieldProperty() {
    }

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
        if (!(obj instanceof AbstractPartialFieldProperty)) {
            return false;
        }
        AbstractPartialFieldProperty abstractPartialFieldProperty = (AbstractPartialFieldProperty) obj;
        if (!(get() == abstractPartialFieldProperty.get() && getFieldType() == abstractPartialFieldProperty.getFieldType() && FieldUtils.equals(getReadablePartial().getChronology(), abstractPartialFieldProperty.getReadablePartial().getChronology()))) {
            z = false;
        }
        return z;
    }

    public abstract int get();

    public String getAsShortText() {
        return getAsShortText(null);
    }

    public String getAsString() {
        return Integer.toString(get());
    }

    public String getAsText() {
        return getAsText(null);
    }

    public DurationField getDurationField() {
        return getField().getDurationField();
    }

    public abstract DateTimeField getField();

    public DateTimeFieldType getFieldType() {
        return getField().getType();
    }

    public int getMaximumShortTextLength(Locale locale) {
        return getField().getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        return getField().getMaximumTextLength(locale);
    }

    public int getMaximumValue() {
        return getField().getMaximumValue(getReadablePartial());
    }

    public int getMaximumValueOverall() {
        return getField().getMaximumValue();
    }

    public int getMinimumValue() {
        return getField().getMinimumValue(getReadablePartial());
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

    /* access modifiers changed from: protected */
    public abstract ReadablePartial getReadablePartial();

    public int hashCode() {
        return ((((247 + get()) * 13) + getFieldType().hashCode()) * 13) + getReadablePartial().getChronology().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Property[");
        sb.append(getName());
        sb.append("]");
        return sb.toString();
    }

    public String getAsShortText(Locale locale) {
        return getField().getAsShortText(getReadablePartial(), get(), locale);
    }

    public String getAsText(Locale locale) {
        return getField().getAsText(getReadablePartial(), get(), locale);
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
        throw new IllegalArgumentException("The instant must not be null");
    }
}
