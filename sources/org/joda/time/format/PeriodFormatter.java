package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

public class PeriodFormatter {
    private final Locale iLocale;
    private final PeriodType iParseType;
    private final PeriodParser iParser;
    private final PeriodPrinter iPrinter;

    public PeriodFormatter(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.iPrinter = periodPrinter;
        this.iParser = periodParser;
        this.iLocale = null;
        this.iParseType = null;
    }

    private void checkParser() {
        if (this.iParser == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
    }

    private void checkPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            throw new IllegalArgumentException("Period must not be null");
        }
    }

    private void checkPrinter() {
        if (this.iPrinter == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    public PeriodType getParseType() {
        return this.iParseType;
    }

    public PeriodParser getParser() {
        return this.iParser;
    }

    public PeriodPrinter getPrinter() {
        return this.iPrinter;
    }

    public boolean isParser() {
        return this.iParser != null;
    }

    public boolean isPrinter() {
        return this.iPrinter != null;
    }

    public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i) {
        checkParser();
        checkPeriod(readWritablePeriod);
        return getParser().parseInto(readWritablePeriod, str, i, this.iLocale);
    }

    public MutablePeriod parseMutablePeriod(String str) {
        checkParser();
        MutablePeriod mutablePeriod = new MutablePeriod(0, this.iParseType);
        int parseInto = getParser().parseInto(mutablePeriod, str, 0, this.iLocale);
        if (parseInto < 0) {
            parseInto = ~parseInto;
        } else if (parseInto >= str.length()) {
            return mutablePeriod;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, parseInto));
    }

    public Period parsePeriod(String str) {
        checkParser();
        return parseMutablePeriod(str).toPeriod();
    }

    public String print(ReadablePeriod readablePeriod) {
        checkPrinter();
        checkPeriod(readablePeriod);
        PeriodPrinter printer = getPrinter();
        StringBuffer stringBuffer = new StringBuffer(printer.calculatePrintedLength(readablePeriod, this.iLocale));
        printer.printTo(stringBuffer, readablePeriod, this.iLocale);
        return stringBuffer.toString();
    }

    public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod) {
        checkPrinter();
        checkPeriod(readablePeriod);
        getPrinter().printTo(stringBuffer, readablePeriod, this.iLocale);
    }

    public PeriodFormatter withLocale(Locale locale) {
        return (locale == getLocale() || (locale != null && locale.equals(getLocale()))) ? this : new PeriodFormatter(this.iPrinter, this.iParser, locale, this.iParseType);
    }

    public PeriodFormatter withParseType(PeriodType periodType) {
        if (periodType == this.iParseType) {
            return this;
        }
        return new PeriodFormatter(this.iPrinter, this.iParser, this.iLocale, periodType);
    }

    public void printTo(Writer writer, ReadablePeriod readablePeriod) throws IOException {
        checkPrinter();
        checkPeriod(readablePeriod);
        getPrinter().printTo(writer, readablePeriod, this.iLocale);
    }

    PeriodFormatter(PeriodPrinter periodPrinter, PeriodParser periodParser, Locale locale, PeriodType periodType) {
        this.iPrinter = periodPrinter;
        this.iParser = periodParser;
        this.iLocale = locale;
        this.iParseType = periodType;
    }
}
