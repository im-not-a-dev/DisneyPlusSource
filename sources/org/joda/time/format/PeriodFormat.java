package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

public class PeriodFormat {
    private static final String BUNDLE_NAME = "org.joda.time.format.messages";
    private static final ConcurrentMap<Locale, PeriodFormatter> FORMATTERS = new ConcurrentHashMap();

    static class DynamicWordBased implements PeriodPrinter, PeriodParser {
        private final PeriodFormatter iFormatter;

        DynamicWordBased(PeriodFormatter periodFormatter) {
            this.iFormatter = periodFormatter;
        }

        private PeriodParser getParser(Locale locale) {
            if (locale == null || locale.equals(this.iFormatter.getLocale())) {
                return this.iFormatter.getParser();
            }
            return PeriodFormat.wordBased(locale).getParser();
        }

        private PeriodPrinter getPrinter(Locale locale) {
            if (locale == null || locale.equals(this.iFormatter.getLocale())) {
                return this.iFormatter.getPrinter();
            }
            return PeriodFormat.wordBased(locale).getPrinter();
        }

        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return getPrinter(locale).calculatePrintedLength(readablePeriod, locale);
        }

        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            return getPrinter(locale).countFieldsToPrint(readablePeriod, i, locale);
        }

        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            return getParser(locale).parseInto(readWritablePeriod, str, i, locale);
        }

        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            getPrinter(locale).printTo(stringBuffer, readablePeriod, locale);
        }

        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            getPrinter(locale).printTo(writer, readablePeriod, locale);
        }
    }

    protected PeriodFormat() {
    }

    private static PeriodFormatter buildNonRegExFormatter(ResourceBundle resourceBundle, Locale locale) {
        String[] retrieveVariants = retrieveVariants(resourceBundle);
        String str = "PeriodFormat.commaspace";
        String str2 = "PeriodFormat.spaceandspace";
        return new PeriodFormatterBuilder().appendYears().appendSuffix(resourceBundle.getString("PeriodFormat.year"), resourceBundle.getString("PeriodFormat.years")).appendSeparator(resourceBundle.getString(str), resourceBundle.getString(str2), retrieveVariants).appendMonths().appendSuffix(resourceBundle.getString("PeriodFormat.month"), resourceBundle.getString("PeriodFormat.months")).appendSeparator(resourceBundle.getString(str), resourceBundle.getString(str2), retrieveVariants).appendWeeks().appendSuffix(resourceBundle.getString("PeriodFormat.week"), resourceBundle.getString("PeriodFormat.weeks")).appendSeparator(resourceBundle.getString(str), resourceBundle.getString(str2), retrieveVariants).appendDays().appendSuffix(resourceBundle.getString("PeriodFormat.day"), resourceBundle.getString("PeriodFormat.days")).appendSeparator(resourceBundle.getString(str), resourceBundle.getString(str2), retrieveVariants).appendHours().appendSuffix(resourceBundle.getString("PeriodFormat.hour"), resourceBundle.getString("PeriodFormat.hours")).appendSeparator(resourceBundle.getString(str), resourceBundle.getString(str2), retrieveVariants).appendMinutes().appendSuffix(resourceBundle.getString("PeriodFormat.minute"), resourceBundle.getString("PeriodFormat.minutes")).appendSeparator(resourceBundle.getString(str), resourceBundle.getString(str2), retrieveVariants).appendSeconds().appendSuffix(resourceBundle.getString("PeriodFormat.second"), resourceBundle.getString("PeriodFormat.seconds")).appendSeparator(resourceBundle.getString(str), resourceBundle.getString(str2), retrieveVariants).appendMillis().appendSuffix(resourceBundle.getString("PeriodFormat.millisecond"), resourceBundle.getString("PeriodFormat.milliseconds")).toFormatter().withLocale(locale);
    }

    private static PeriodFormatter buildRegExFormatter(ResourceBundle resourceBundle, Locale locale) {
        String[] retrieveVariants = retrieveVariants(resourceBundle);
        String string = resourceBundle.getString("PeriodFormat.regex.separator");
        PeriodFormatterBuilder periodFormatterBuilder = new PeriodFormatterBuilder();
        periodFormatterBuilder.appendYears();
        String str = "PeriodFormat.years.regex";
        if (containsKey(resourceBundle, str)) {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString(str).split(string), resourceBundle.getString("PeriodFormat.years.list").split(string));
        } else {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString("PeriodFormat.year"), resourceBundle.getString("PeriodFormat.years"));
        }
        String str2 = "PeriodFormat.commaspace";
        String str3 = "PeriodFormat.spaceandspace";
        periodFormatterBuilder.appendSeparator(resourceBundle.getString(str2), resourceBundle.getString(str3), retrieveVariants);
        periodFormatterBuilder.appendMonths();
        String str4 = "PeriodFormat.months.regex";
        if (containsKey(resourceBundle, str4)) {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString(str4).split(string), resourceBundle.getString("PeriodFormat.months.list").split(string));
        } else {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString("PeriodFormat.month"), resourceBundle.getString("PeriodFormat.months"));
        }
        periodFormatterBuilder.appendSeparator(resourceBundle.getString(str2), resourceBundle.getString(str3), retrieveVariants);
        periodFormatterBuilder.appendWeeks();
        String str5 = "PeriodFormat.weeks.regex";
        if (containsKey(resourceBundle, str5)) {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString(str5).split(string), resourceBundle.getString("PeriodFormat.weeks.list").split(string));
        } else {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString("PeriodFormat.week"), resourceBundle.getString("PeriodFormat.weeks"));
        }
        periodFormatterBuilder.appendSeparator(resourceBundle.getString(str2), resourceBundle.getString(str3), retrieveVariants);
        periodFormatterBuilder.appendDays();
        String str6 = "PeriodFormat.days.regex";
        if (containsKey(resourceBundle, str6)) {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString(str6).split(string), resourceBundle.getString("PeriodFormat.days.list").split(string));
        } else {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString("PeriodFormat.day"), resourceBundle.getString("PeriodFormat.days"));
        }
        periodFormatterBuilder.appendSeparator(resourceBundle.getString(str2), resourceBundle.getString(str3), retrieveVariants);
        periodFormatterBuilder.appendHours();
        String str7 = "PeriodFormat.hours.regex";
        if (containsKey(resourceBundle, str7)) {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString(str7).split(string), resourceBundle.getString("PeriodFormat.hours.list").split(string));
        } else {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString("PeriodFormat.hour"), resourceBundle.getString("PeriodFormat.hours"));
        }
        periodFormatterBuilder.appendSeparator(resourceBundle.getString(str2), resourceBundle.getString(str3), retrieveVariants);
        periodFormatterBuilder.appendMinutes();
        String str8 = "PeriodFormat.minutes.regex";
        if (containsKey(resourceBundle, str8)) {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString(str8).split(string), resourceBundle.getString("PeriodFormat.minutes.list").split(string));
        } else {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString("PeriodFormat.minute"), resourceBundle.getString("PeriodFormat.minutes"));
        }
        periodFormatterBuilder.appendSeparator(resourceBundle.getString(str2), resourceBundle.getString(str3), retrieveVariants);
        periodFormatterBuilder.appendSeconds();
        String str9 = "PeriodFormat.seconds.regex";
        if (containsKey(resourceBundle, str9)) {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString(str9).split(string), resourceBundle.getString("PeriodFormat.seconds.list").split(string));
        } else {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString("PeriodFormat.second"), resourceBundle.getString("PeriodFormat.seconds"));
        }
        periodFormatterBuilder.appendSeparator(resourceBundle.getString(str2), resourceBundle.getString(str3), retrieveVariants);
        periodFormatterBuilder.appendMillis();
        String str10 = "PeriodFormat.milliseconds.regex";
        if (containsKey(resourceBundle, str10)) {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString(str10).split(string), resourceBundle.getString("PeriodFormat.milliseconds.list").split(string));
        } else {
            periodFormatterBuilder.appendSuffix(resourceBundle.getString("PeriodFormat.millisecond"), resourceBundle.getString("PeriodFormat.milliseconds"));
        }
        return periodFormatterBuilder.toFormatter().withLocale(locale);
    }

    private static PeriodFormatter buildWordBased(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
        if (containsKey(bundle, "PeriodFormat.regex.separator")) {
            return buildRegExFormatter(bundle, locale);
        }
        return buildNonRegExFormatter(bundle, locale);
    }

    private static boolean containsKey(ResourceBundle resourceBundle, String str) {
        Enumeration keys = resourceBundle.getKeys();
        while (keys.hasMoreElements()) {
            if (((String) keys.nextElement()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static PeriodFormatter getDefault() {
        return wordBased(Locale.ENGLISH);
    }

    private static String[] retrieveVariants(ResourceBundle resourceBundle) {
        return new String[]{resourceBundle.getString("PeriodFormat.space"), resourceBundle.getString("PeriodFormat.comma"), resourceBundle.getString("PeriodFormat.commandand"), resourceBundle.getString("PeriodFormat.commaspaceand")};
    }

    public static PeriodFormatter wordBased() {
        return wordBased(Locale.getDefault());
    }

    public static PeriodFormatter wordBased(Locale locale) {
        PeriodFormatter periodFormatter = (PeriodFormatter) FORMATTERS.get(locale);
        if (periodFormatter != null) {
            return periodFormatter;
        }
        DynamicWordBased dynamicWordBased = new DynamicWordBased(buildWordBased(locale));
        PeriodFormatter periodFormatter2 = new PeriodFormatter(dynamicWordBased, dynamicWordBased, locale, null);
        PeriodFormatter periodFormatter3 = (PeriodFormatter) FORMATTERS.putIfAbsent(locale, periodFormatter2);
        return periodFormatter3 != null ? periodFormatter3 : periodFormatter2;
    }
}
