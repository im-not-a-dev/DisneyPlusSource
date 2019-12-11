package org.joda.time;

import java.util.Locale;

public abstract class DateTimeField {
    public abstract long add(long j, int i);

    public abstract long add(long j, long j2);

    public abstract int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2);

    public abstract long addWrapField(long j, int i);

    public abstract int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2);

    public abstract int[] addWrapPartial(ReadablePartial readablePartial, int i, int[] iArr, int i2);

    public abstract int get(long j);

    public abstract String getAsShortText(int i, Locale locale);

    public abstract String getAsShortText(long j);

    public abstract String getAsShortText(long j, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, int i, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, Locale locale);

    public abstract String getAsText(int i, Locale locale);

    public abstract String getAsText(long j);

    public abstract String getAsText(long j, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, int i, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, Locale locale);

    public abstract int getDifference(long j, long j2);

    public abstract long getDifferenceAsLong(long j, long j2);

    public abstract DurationField getDurationField();

    public abstract int getLeapAmount(long j);

    public abstract DurationField getLeapDurationField();

    public abstract int getMaximumShortTextLength(Locale locale);

    public abstract int getMaximumTextLength(Locale locale);

    public abstract int getMaximumValue();

    public abstract int getMaximumValue(long j);

    public abstract int getMaximumValue(ReadablePartial readablePartial);

    public abstract int getMaximumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract int getMinimumValue();

    public abstract int getMinimumValue(long j);

    public abstract int getMinimumValue(ReadablePartial readablePartial);

    public abstract int getMinimumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract String getName();

    public abstract DurationField getRangeDurationField();

    public abstract DateTimeFieldType getType();

    public abstract boolean isLeap(long j);

    public abstract boolean isLenient();

    public abstract boolean isSupported();

    public abstract long remainder(long j);

    public abstract long roundCeiling(long j);

    public abstract long roundFloor(long j);

    public abstract long roundHalfCeiling(long j);

    public abstract long roundHalfEven(long j);

    public abstract long roundHalfFloor(long j);

    public abstract long set(long j, int i);

    public abstract long set(long j, String str);

    public abstract long set(long j, String str, Locale locale);

    public abstract int[] set(ReadablePartial readablePartial, int i, int[] iArr, int i2);

    public abstract int[] set(ReadablePartial readablePartial, int i, int[] iArr, String str, Locale locale);

    public long setExtended(long j, int i) {
        return set(j, i);
    }

    public abstract String toString();
}
