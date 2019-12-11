package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormatter;

public interface PartialConverter extends Converter {
    Chronology getChronology(Object obj, Chronology chronology);

    Chronology getChronology(Object obj, DateTimeZone dateTimeZone);

    int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology);

    int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter);
}
