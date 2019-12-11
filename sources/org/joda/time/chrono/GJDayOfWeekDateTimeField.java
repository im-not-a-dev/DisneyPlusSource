package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.PreciseDurationDateTimeField;

final class GJDayOfWeekDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -3857947176719041436L;
    private final BasicChronology iChronology;

    GJDayOfWeekDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfWeek(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfWeek();
    }

    /* access modifiers changed from: protected */
    public int convertText(String str, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekTextToValue(str);
    }

    public int get(long j) {
        return this.iChronology.getDayOfWeek(j);
    }

    public String getAsShortText(int i, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToShortText(i);
    }

    public String getAsText(int i, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToText(i);
    }

    public int getMaximumShortTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxShortTextLength();
    }

    public int getMaximumTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxTextLength();
    }

    public int getMaximumValue() {
        return 7;
    }

    public int getMinimumValue() {
        return 1;
    }

    public DurationField getRangeDurationField() {
        return this.iChronology.weeks();
    }
}
