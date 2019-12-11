package org.joda.time.convert;

public interface DurationConverter extends Converter {
    long getDurationMillis(Object obj);
}
