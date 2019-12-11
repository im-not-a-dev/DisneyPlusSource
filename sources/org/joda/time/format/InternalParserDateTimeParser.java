package org.joda.time.format;

class InternalParserDateTimeParser implements DateTimeParser, InternalParser {
    private final InternalParser underlying;

    private InternalParserDateTimeParser(InternalParser internalParser) {
        this.underlying = internalParser;
    }

    /* renamed from: of */
    static DateTimeParser m45849of(InternalParser internalParser) {
        if (internalParser instanceof DateTimeParserInternalParser) {
            return ((DateTimeParserInternalParser) internalParser).getUnderlying();
        }
        if (internalParser instanceof DateTimeParser) {
            return (DateTimeParser) internalParser;
        }
        if (internalParser == null) {
            return null;
        }
        return new InternalParserDateTimeParser(internalParser);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternalParserDateTimeParser)) {
            return false;
        }
        return this.underlying.equals(((InternalParserDateTimeParser) obj).underlying);
    }

    public int estimateParsedLength() {
        return this.underlying.estimateParsedLength();
    }

    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
        return this.underlying.parseInto(dateTimeParserBucket, charSequence, i);
    }

    public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
        return this.underlying.parseInto(dateTimeParserBucket, str, i);
    }
}
