package org.joda.time;

public interface ReadablePartial extends Comparable<ReadablePartial> {
    boolean equals(Object obj);

    int get(DateTimeFieldType dateTimeFieldType);

    Chronology getChronology();

    DateTimeField getField(int i);

    DateTimeFieldType getFieldType(int i);

    int getValue(int i);

    int hashCode();

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    int size();

    DateTime toDateTime(ReadableInstant readableInstant);

    String toString();
}
