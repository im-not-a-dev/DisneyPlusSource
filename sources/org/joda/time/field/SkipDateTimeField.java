package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    public int get(long j) {
        int i = super.get(j);
        return i <= this.iSkip ? i - 1 : i;
    }

    public int getMinimumValue() {
        return this.iMinValue;
    }

    public long set(long j, int i) {
        FieldUtils.verifyValueBounds((DateTimeField) this, i, this.iMinValue, getMaximumValue());
        int i2 = this.iSkip;
        if (i <= i2) {
            if (i != i2) {
                i++;
            } else {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
            }
        }
        return super.set(j, i);
    }

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i) {
            this.iMinValue = minimumValue - 1;
        } else if (minimumValue == i) {
            this.iMinValue = i + 1;
        } else {
            this.iMinValue = minimumValue;
        }
        this.iSkip = i;
    }
}
