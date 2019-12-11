package org.joda.time.format;

public class ISOPeriodFormat {
    private static PeriodFormatter cAlternate;
    private static PeriodFormatter cAlternateExtended;
    private static PeriodFormatter cAlternateExtendedWihWeeks;
    private static PeriodFormatter cAlternateWithWeeks;
    private static PeriodFormatter cStandard;

    protected ISOPeriodFormat() {
    }

    public static PeriodFormatter alternate() {
        if (cAlternate == null) {
            cAlternate = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendMonths().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternate;
    }

    public static PeriodFormatter alternateExtended() {
        if (cAlternateExtended == null) {
            String str = "-";
            String str2 = ":";
            cAlternateExtended = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator(str).minimumPrintedDigits(2).appendMonths().appendSeparator(str).appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(str2).appendMinutes().appendSeparator(str2).appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateExtended;
    }

    public static PeriodFormatter alternateExtendedWithWeeks() {
        if (cAlternateExtendedWihWeeks == null) {
            String str = "-";
            String str2 = ":";
            cAlternateExtendedWihWeeks = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator(str).minimumPrintedDigits(2).appendPrefix("W").appendWeeks().appendSeparator(str).appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(str2).appendMinutes().appendSeparator(str2).appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateExtendedWihWeeks;
    }

    public static PeriodFormatter alternateWithWeeks() {
        if (cAlternateWithWeeks == null) {
            cAlternateWithWeeks = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendPrefix("W").appendWeeks().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateWithWeeks;
    }

    public static PeriodFormatter standard() {
        if (cStandard == null) {
            String str = "M";
            cStandard = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix(str).appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix(str).appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter();
        }
        return cStandard;
    }
}
