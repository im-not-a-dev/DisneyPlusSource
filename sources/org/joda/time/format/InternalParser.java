package org.joda.time.format;

interface InternalParser {
    int estimateParsedLength();

    int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i);
}
