package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

final class GJEraDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 4240986525305515528L;
    private final BasicChronology iChronology;

    GJEraDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.era());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.era();
    }

    public int get(long j) {
        return this.iChronology.getYear(j) <= 0 ? 0 : 1;
    }

    public String getAsText(int i, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).eraValueToText(i);
    }

    public DurationField getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    public int getMaximumTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getEraMaxTextLength();
    }

    public int getMaximumValue() {
        return 1;
    }

    public int getMinimumValue() {
        return 0;
    }

    public DurationField getRangeDurationField() {
        return null;
    }

    public boolean isLenient() {
        return false;
    }

    public long roundCeiling(long j) {
        if (get(j) == 0) {
            return this.iChronology.setYear(0, 1);
        }
        return Long.MAX_VALUE;
    }

    public long roundFloor(long j) {
        if (get(j) == 1) {
            return this.iChronology.setYear(0, 1);
        }
        return Long.MIN_VALUE;
    }

    public long roundHalfCeiling(long j) {
        return roundFloor(j);
    }

    public long roundHalfEven(long j) {
        return roundFloor(j);
    }

    public long roundHalfFloor(long j) {
        return roundFloor(j);
    }

    public long set(long j, int i) {
        FieldUtils.verifyValueBounds((DateTimeField) this, i, 0, 1);
        if (get(j) == i) {
            return j;
        }
        return this.iChronology.setYear(j, -this.iChronology.getYear(j));
    }

    public long set(long j, String str, Locale locale) {
        return set(j, GJLocaleSymbols.forLocale(locale).eraTextToValue(str));
    }
}
