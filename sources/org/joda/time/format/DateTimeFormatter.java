package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

public class DateTimeFormatter {
    private final Chronology iChrono;
    private final int iDefaultYear;
    private final Locale iLocale;
    private final boolean iOffsetParsed;
    private final InternalParser iParser;
    private final Integer iPivotYear;
    private final InternalPrinter iPrinter;
    private final DateTimeZone iZone;

    public DateTimeFormatter(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this(DateTimePrinterInternalPrinter.m45848of(dateTimePrinter), DateTimeParserInternalParser.m45847of(dateTimeParser));
    }

    private InternalParser requireParser() {
        InternalParser internalParser = this.iParser;
        if (internalParser != null) {
            return internalParser;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private InternalPrinter requirePrinter() {
        InternalPrinter internalPrinter = this.iPrinter;
        if (internalPrinter != null) {
            return internalPrinter;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private Chronology selectChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        Chronology chronology3 = this.iChrono;
        if (chronology3 != null) {
            chronology2 = chronology3;
        }
        DateTimeZone dateTimeZone = this.iZone;
        return dateTimeZone != null ? chronology2.withZone(dateTimeZone) : chronology2;
    }

    @Deprecated
    public Chronology getChronolgy() {
        return this.iChrono;
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public int getDefaultYear() {
        return this.iDefaultYear;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    public DateTimeParser getParser() {
        return InternalParserDateTimeParser.m45849of(this.iParser);
    }

    /* access modifiers changed from: 0000 */
    public InternalParser getParser0() {
        return this.iParser;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimePrinter getPrinter() {
        return InternalPrinterDateTimePrinter.m45850of(this.iPrinter);
    }

    /* access modifiers changed from: 0000 */
    public InternalPrinter getPrinter0() {
        return this.iPrinter;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public boolean isOffsetParsed() {
        return this.iOffsetParsed;
    }

    public boolean isParser() {
        return this.iParser != null;
    }

    public boolean isPrinter() {
        return this.iPrinter != null;
    }

    public DateTime parseDateTime(String str) {
        InternalParser requireParser = requireParser();
        Chronology selectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0, selectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto < 0) {
            parseInto = ~parseInto;
        } else if (parseInto >= str.length()) {
            long computeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
                selectChronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                selectChronology = selectChronology.withZone(dateTimeParserBucket.getZone());
            }
            DateTime dateTime = new DateTime(computeMillis, selectChronology);
            DateTimeZone dateTimeZone = this.iZone;
            return dateTimeZone != null ? dateTime.withZone(dateTimeZone) : dateTime;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, parseInto));
    }

    public int parseInto(ReadWritableInstant readWritableInstant, String str, int i) {
        InternalParser requireParser = requireParser();
        if (readWritableInstant != null) {
            long millis = readWritableInstant.getMillis();
            Chronology chronology = readWritableInstant.getChronology();
            int i2 = DateTimeUtils.getChronology(chronology).year().get(millis);
            long offset = millis + ((long) chronology.getZone().getOffset(millis));
            Chronology selectChronology = selectChronology(chronology);
            DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(offset, selectChronology, this.iLocale, this.iPivotYear, i2);
            int parseInto = requireParser.parseInto(dateTimeParserBucket, str, i);
            readWritableInstant.setMillis(dateTimeParserBucket.computeMillis(false, str));
            if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
                selectChronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                selectChronology = selectChronology.withZone(dateTimeParserBucket.getZone());
            }
            readWritableInstant.setChronology(selectChronology);
            DateTimeZone dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                readWritableInstant.setZone(dateTimeZone);
            }
            return parseInto;
        }
        throw new IllegalArgumentException("Instant must not be null");
    }

    public LocalDate parseLocalDate(String str) {
        return parseLocalDateTime(str).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String str) {
        InternalParser requireParser = requireParser();
        Chronology withUTC = selectChronology(null).withUTC();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0, withUTC, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto < 0) {
            parseInto = ~parseInto;
        } else if (parseInto >= str.length()) {
            long computeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (dateTimeParserBucket.getOffsetInteger() != null) {
                withUTC = withUTC.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                withUTC = withUTC.withZone(dateTimeParserBucket.getZone());
            }
            return new LocalDateTime(computeMillis, withUTC);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, parseInto));
    }

    public LocalTime parseLocalTime(String str) {
        return parseLocalDateTime(str).toLocalTime();
    }

    public long parseMillis(String str) {
        InternalParser requireParser = requireParser();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0, selectChronology(this.iChrono), this.iLocale, this.iPivotYear, this.iDefaultYear);
        return dateTimeParserBucket.doParseMillis(requireParser, str);
    }

    public MutableDateTime parseMutableDateTime(String str) {
        InternalParser requireParser = requireParser();
        Chronology selectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0, selectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto < 0) {
            parseInto = ~parseInto;
        } else if (parseInto >= str.length()) {
            long computeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
                selectChronology = selectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                selectChronology = selectChronology.withZone(dateTimeParserBucket.getZone());
            }
            MutableDateTime mutableDateTime = new MutableDateTime(computeMillis, selectChronology);
            DateTimeZone dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                mutableDateTime.setZone(dateTimeZone);
            }
            return mutableDateTime;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, parseInto));
    }

    public String print(ReadableInstant readableInstant) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, readableInstant);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(StringBuffer stringBuffer, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) stringBuffer, readableInstant);
        } catch (IOException unused) {
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        if (this.iChrono == chronology) {
            return this;
        }
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, chronology, this.iZone, this.iPivotYear, this.iDefaultYear);
        return dateTimeFormatter;
    }

    public DateTimeFormatter withDefaultYear(int i) {
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, i);
        return dateTimeFormatter;
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (locale == getLocale() || (locale != null && locale.equals(getLocale()))) {
            return this;
        }
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(this.iPrinter, this.iParser, locale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, this.iDefaultYear);
        return dateTimeFormatter;
    }

    public DateTimeFormatter withOffsetParsed() {
        if (this.iOffsetParsed) {
            return this;
        }
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, true, this.iChrono, null, this.iPivotYear, this.iDefaultYear);
        return dateTimeFormatter;
    }

    public DateTimeFormatter withPivotYear(Integer num) {
        Integer num2 = this.iPivotYear;
        if (num2 == num || (num2 != null && num2.equals(num))) {
            return this;
        }
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, num, this.iDefaultYear);
        return dateTimeFormatter;
    }

    public DateTimeFormatter withZone(DateTimeZone dateTimeZone) {
        if (this.iZone == dateTimeZone) {
            return this;
        }
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, false, this.iChrono, dateTimeZone, this.iPivotYear, this.iDefaultYear);
        return dateTimeFormatter;
    }

    public DateTimeFormatter withZoneUTC() {
        return withZone(DateTimeZone.UTC);
    }

    DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = null;
        this.iOffsetParsed = false;
        this.iChrono = null;
        this.iZone = null;
        this.iPivotYear = null;
        this.iDefaultYear = 2000;
    }

    public void printTo(StringBuilder sb, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) sb, readableInstant);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, ReadableInstant readableInstant) throws IOException {
        printTo((Appendable) writer, readableInstant);
    }

    public DateTimeFormatter withPivotYear(int i) {
        return withPivotYear(Integer.valueOf(i));
    }

    public String print(long j) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, j);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(Appendable appendable, ReadableInstant readableInstant) throws IOException {
        printTo(appendable, DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantChronology(readableInstant));
    }

    public String print(ReadablePartial readablePartial) {
        StringBuilder sb = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb, readablePartial);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(StringBuffer stringBuffer, long j) {
        try {
            printTo((Appendable) stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb, long j) {
        try {
            printTo((Appendable) sb, j);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, long j) throws IOException {
        printTo((Appendable) writer, j);
    }

    public void printTo(Appendable appendable, long j) throws IOException {
        printTo(appendable, j, null);
    }

    private DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser, Locale locale, boolean z, Chronology chronology, DateTimeZone dateTimeZone, Integer num, int i) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = locale;
        this.iOffsetParsed = z;
        this.iChrono = chronology;
        this.iZone = dateTimeZone;
        this.iPivotYear = num;
        this.iDefaultYear = i;
    }

    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) stringBuffer, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) sb, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, ReadablePartial readablePartial) throws IOException {
        printTo((Appendable) writer, readablePartial);
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial) throws IOException {
        InternalPrinter requirePrinter = requirePrinter();
        if (readablePartial != null) {
            requirePrinter.printTo(appendable, readablePartial, this.iLocale);
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    private void printTo(Appendable appendable, long j, Chronology chronology) throws IOException {
        long j2 = j;
        InternalPrinter requirePrinter = requirePrinter();
        Chronology selectChronology = selectChronology(chronology);
        DateTimeZone zone = selectChronology.getZone();
        int offset = zone.getOffset(j2);
        long j3 = (long) offset;
        long j4 = j2 + j3;
        if ((j2 ^ j4) < 0 && (j3 ^ j2) >= 0) {
            zone = DateTimeZone.UTC;
            offset = 0;
            j4 = j2;
        }
        InternalPrinter internalPrinter = requirePrinter;
        Appendable appendable2 = appendable;
        long j5 = j4;
        internalPrinter.printTo(appendable2, j5, selectChronology.withUTC(), offset, zone, this.iLocale);
    }
}
