package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

public class DelegatedDateTimeField extends DateTimeField implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    private final DateTimeField iField;
    private final DurationField iRangeDurationField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(DateTimeField dateTimeField) {
        this(dateTimeField, null);
    }

    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    public long addWrapField(long j, int i) {
        return this.iField.addWrapField(j, i);
    }

    public int[] addWrapPartial(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return this.iField.addWrapPartial(readablePartial, i, iArr, i2);
    }

    public int get(long j) {
        return this.iField.get(j);
    }

    public String getAsShortText(long j, Locale locale) {
        return this.iField.getAsShortText(j, locale);
    }

    public String getAsText(long j, Locale locale) {
        return this.iField.getAsText(j, locale);
    }

    public int getDifference(long j, long j2) {
        return this.iField.getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    public DurationField getDurationField() {
        return this.iField.getDurationField();
    }

    public int getLeapAmount(long j) {
        return this.iField.getLeapAmount(j);
    }

    public DurationField getLeapDurationField() {
        return this.iField.getLeapDurationField();
    }

    public int getMaximumShortTextLength(Locale locale) {
        return this.iField.getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        return this.iField.getMaximumTextLength(locale);
    }

    public int getMaximumValue() {
        return this.iField.getMaximumValue();
    }

    public int getMinimumValue() {
        return this.iField.getMinimumValue();
    }

    public String getName() {
        return this.iType.getName();
    }

    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        if (durationField != null) {
            return durationField;
        }
        return this.iField.getRangeDurationField();
    }

    public DateTimeFieldType getType() {
        return this.iType;
    }

    public final DateTimeField getWrappedField() {
        return this.iField;
    }

    public boolean isLeap(long j) {
        return this.iField.isLeap(j);
    }

    public boolean isLenient() {
        return this.iField.isLenient();
    }

    public boolean isSupported() {
        return this.iField.isSupported();
    }

    public long remainder(long j) {
        return this.iField.remainder(j);
    }

    public long roundCeiling(long j) {
        return this.iField.roundCeiling(j);
    }

    public long roundFloor(long j) {
        return this.iField.roundFloor(j);
    }

    public long roundHalfCeiling(long j) {
        return this.iField.roundHalfCeiling(j);
    }

    public long roundHalfEven(long j) {
        return this.iField.roundHalfEven(j);
    }

    public long roundHalfFloor(long j) {
        return this.iField.roundHalfFloor(j);
    }

    public long set(long j, int i) {
        return this.iField.set(j, i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DateTimeField[");
        sb.append(getName());
        sb.append(']');
        return sb.toString();
    }

    public DelegatedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(dateTimeField, null, dateTimeFieldType);
    }

    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    public int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return this.iField.addWrapField(readablePartial, i, iArr, i2);
    }

    public String getAsShortText(long j) {
        return this.iField.getAsShortText(j);
    }

    public String getAsText(long j) {
        return this.iField.getAsText(j);
    }

    public int getMaximumValue(long j) {
        return this.iField.getMaximumValue(j);
    }

    public int getMinimumValue(long j) {
        return this.iField.getMinimumValue(j);
    }

    public long set(long j, String str, Locale locale) {
        return this.iField.set(j, str, locale);
    }

    public DelegatedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        if (dateTimeField != null) {
            this.iField = dateTimeField;
            this.iRangeDurationField = durationField;
            if (dateTimeFieldType == null) {
                dateTimeFieldType = dateTimeField.getType();
            }
            this.iType = dateTimeFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return this.iField.add(readablePartial, i, iArr, i2);
    }

    public String getAsShortText(ReadablePartial readablePartial, int i, Locale locale) {
        return this.iField.getAsShortText(readablePartial, i, locale);
    }

    public String getAsText(ReadablePartial readablePartial, int i, Locale locale) {
        return this.iField.getAsText(readablePartial, i, locale);
    }

    public int getMaximumValue(ReadablePartial readablePartial) {
        return this.iField.getMaximumValue(readablePartial);
    }

    public int getMinimumValue(ReadablePartial readablePartial) {
        return this.iField.getMinimumValue(readablePartial);
    }

    public long set(long j, String str) {
        return this.iField.set(j, str);
    }

    public String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return this.iField.getAsShortText(readablePartial, locale);
    }

    public String getAsText(ReadablePartial readablePartial, Locale locale) {
        return this.iField.getAsText(readablePartial, locale);
    }

    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return this.iField.getMaximumValue(readablePartial, iArr);
    }

    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return this.iField.getMinimumValue(readablePartial, iArr);
    }

    public int[] set(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return this.iField.set(readablePartial, i, iArr, i2);
    }

    public String getAsShortText(int i, Locale locale) {
        return this.iField.getAsShortText(i, locale);
    }

    public String getAsText(int i, Locale locale) {
        return this.iField.getAsText(i, locale);
    }

    public int[] set(ReadablePartial readablePartial, int i, int[] iArr, String str, Locale locale) {
        return this.iField.set(readablePartial, i, iArr, str, locale);
    }
}
