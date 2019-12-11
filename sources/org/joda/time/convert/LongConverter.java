package org.joda.time.convert;

import org.joda.time.Chronology;

class LongConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter {
    static final LongConverter INSTANCE = new LongConverter();

    protected LongConverter() {
    }

    public long getDurationMillis(Object obj) {
        return ((Long) obj).longValue();
    }

    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Long) obj).longValue();
    }

    public Class<?> getSupportedType() {
        return Long.class;
    }
}
