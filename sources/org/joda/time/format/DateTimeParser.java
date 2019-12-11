package org.joda.time.format;

public interface DateTimeParser {
    int estimateParsedLength();

    int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i);
}
