package org.joda.time.format;

class DateTimeParserInternalParser implements InternalParser {
    private final DateTimeParser underlying;

    private DateTimeParserInternalParser(DateTimeParser dateTimeParser) {
        this.underlying = dateTimeParser;
    }

    /* renamed from: of */
    static InternalParser m45847of(DateTimeParser dateTimeParser) {
        if (dateTimeParser instanceof InternalParserDateTimeParser) {
            return (InternalParser) dateTimeParser;
        }
        if (dateTimeParser == null) {
            return null;
        }
        return new DateTimeParserInternalParser(dateTimeParser);
    }

    public int estimateParsedLength() {
        return this.underlying.estimateParsedLength();
    }

    /* access modifiers changed from: 0000 */
    public DateTimeParser getUnderlying() {
        return this.underlying;
    }

    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
        return this.underlying.parseInto(dateTimeParserBucket, charSequence.toString(), i);
    }
}
