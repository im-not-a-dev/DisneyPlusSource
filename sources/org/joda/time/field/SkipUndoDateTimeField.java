package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;

public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    public int get(long j) {
        int i = super.get(j);
        return i < this.iSkip ? i + 1 : i;
    }

    public int getMinimumValue() {
        return this.iMinValue;
    }

    public long set(long j, int i) {
        FieldUtils.verifyValueBounds((DateTimeField) this, i, this.iMinValue, getMaximumValue());
        if (i <= this.iSkip) {
            i--;
        }
        return super.set(j, i);
    }

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i) {
            this.iMinValue = minimumValue + 1;
        } else if (minimumValue == i + 1) {
            this.iMinValue = i;
        } else {
            this.iMinValue = minimumValue;
        }
        this.iSkip = i;
    }
}
