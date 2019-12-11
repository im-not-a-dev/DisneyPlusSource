package org.joda.time.convert;

import java.util.Date;
import org.joda.time.Chronology;

final class DateConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    static final DateConverter INSTANCE = new DateConverter();

    protected DateConverter() {
    }

    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Date) obj).getTime();
    }

    public Class<?> getSupportedType() {
        return Date.class;
    }
}
