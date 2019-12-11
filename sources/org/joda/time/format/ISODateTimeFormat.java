package org.joda.time.format;

import java.util.Collection;
import org.joda.time.DateTimeFieldType;

public class ISODateTimeFormat {

    static final class Constants {
        /* access modifiers changed from: private */

        /* renamed from: bd */
        public static final DateTimeFormatter f31930bd = basicDate();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bdt = basicDateTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bdtx = basicDateTimeNoMillis();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bod = basicOrdinalDate();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bodt = basicOrdinalDateTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bodtx = basicOrdinalDateTimeNoMillis();
        /* access modifiers changed from: private */

        /* renamed from: bt */
        public static final DateTimeFormatter f31931bt = basicTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter btt = basicTTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bttx = basicTTimeNoMillis();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter btx = basicTimeNoMillis();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bwd = basicWeekDate();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bwdt = basicWeekDateTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter bwdtx = basicWeekDateTimeNoMillis();
        /* access modifiers changed from: private */

        /* renamed from: dh */
        public static final DateTimeFormatter f31932dh = dateHour();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter dhm = dateHourMinute();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter dhms = dateHourMinuteSecond();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter dhmsf = dateHourMinuteSecondFraction();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter dhmsl = dateHourMinuteSecondMillis();
        private static final DateTimeFormatter dme = dayOfMonthElement();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter dotp = dateOptionalTimeParser();
        /* access modifiers changed from: private */

        /* renamed from: dp */
        public static final DateTimeFormatter f31933dp = dateParser();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter dpe = dateElementParser();
        /* access modifiers changed from: private */

        /* renamed from: dt */
        public static final DateTimeFormatter f31934dt = dateTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter dtp = dateTimeParser();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter dtx = dateTimeNoMillis();
        private static final DateTimeFormatter dwe = dayOfWeekElement();
        private static final DateTimeFormatter dye = dayOfYearElement();
        private static final DateTimeFormatter fse = fractionElement();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter hde = hourElement();
        /* access modifiers changed from: private */

        /* renamed from: hm */
        public static final DateTimeFormatter f31935hm = hourMinute();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter hms = hourMinuteSecond();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter hmsf = hourMinuteSecondFraction();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter hmsl = hourMinuteSecondMillis();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter ldotp = localDateOptionalTimeParser();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter ldp = localDateParser();
        private static final DateTimeFormatter lte = literalTElement();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter ltp = localTimeParser();
        private static final DateTimeFormatter mhe = minuteElement();
        private static final DateTimeFormatter mye = monthElement();
        /* access modifiers changed from: private */

        /* renamed from: od */
        public static final DateTimeFormatter f31936od = ordinalDate();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter odt = ordinalDateTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter odtx = ordinalDateTimeNoMillis();
        private static final DateTimeFormatter sme = secondElement();
        /* access modifiers changed from: private */

        /* renamed from: t */
        public static final DateTimeFormatter f31937t = time();
        /* access modifiers changed from: private */

        /* renamed from: tp */
        public static final DateTimeFormatter f31938tp = timeParser();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter tpe = timeElementParser();
        /* access modifiers changed from: private */

        /* renamed from: tt */
        public static final DateTimeFormatter f31939tt = tTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter ttx = tTimeNoMillis();
        /* access modifiers changed from: private */

        /* renamed from: tx */
        public static final DateTimeFormatter f31940tx = timeNoMillis();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter wdt = weekDateTime();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter wdtx = weekDateTimeNoMillis();
        /* access modifiers changed from: private */

        /* renamed from: we */
        public static final DateTimeFormatter f31941we = weekyearElement();
        /* access modifiers changed from: private */

        /* renamed from: ww */
        public static final DateTimeFormatter f31942ww = weekyearWeek();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter wwd = weekyearWeekDay();
        private static final DateTimeFormatter wwe = weekElement();
        /* access modifiers changed from: private */

        /* renamed from: ye */
        public static final DateTimeFormatter f31943ye = yearElement();
        /* access modifiers changed from: private */

        /* renamed from: ym */
        public static final DateTimeFormatter f31944ym = yearMonth();
        /* access modifiers changed from: private */
        public static final DateTimeFormatter ymd = yearMonthDay();

        /* renamed from: ze */
        private static final DateTimeFormatter f31945ze = offsetElement();

        Constants() {
        }

        private static DateTimeFormatter basicDate() {
            DateTimeFormatter dateTimeFormatter = f31930bd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicDateTime() {
            DateTimeFormatter dateTimeFormatter = bdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDate() {
            DateTimeFormatter dateTimeFormatter = bod;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDateTime() {
            DateTimeFormatter dateTimeFormatter = bodt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bodtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTTime() {
            DateTimeFormatter dateTimeFormatter = btt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(basicTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bttx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(basicTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTime() {
            DateTimeFormatter dateTimeFormatter = f31931bt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral('.').appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = btx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDate() {
            DateTimeFormatter dateTimeFormatter = bwd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDateTime() {
            DateTimeFormatter dateTimeFormatter = bwdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bwdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateElementParser() {
            DateTimeFormatter dateTimeFormatter = dpe;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(yearElement()).appendOptional(new DateTimeFormatterBuilder().append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toParser()}).toFormatter();
        }

        private static DateTimeFormatter dateHour() {
            DateTimeFormatter dateTimeFormatter = f31932dh;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(ISODateTimeFormat.hour()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinute() {
            DateTimeFormatter dateTimeFormatter = dhm;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinute()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = dhms;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = dhmsf;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = dhmsl;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = dotp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser()).toFormatter();
        }

        private static DateTimeFormatter dateParser() {
            DateTimeFormatter dateTimeFormatter = f31933dp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(offsetElement()).toParser()).toFormatter();
        }

        private static DateTimeFormatter dateTime() {
            DateTimeFormatter dateTimeFormatter = f31934dt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = dtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateTimeParser() {
            DateTimeFormatter dateTimeFormatter = dtp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeParser parser = new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser();
            return new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{parser, dateOptionalTimeParser().getParser()}).toFormatter();
        }

        private static DateTimeFormatter dayOfMonthElement() {
            DateTimeFormatter dateTimeFormatter = dme;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfMonth(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfWeekElement() {
            DateTimeFormatter dateTimeFormatter = dwe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfWeek(1).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfYearElement() {
            DateTimeFormatter dateTimeFormatter = dye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfYear(3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter fractionElement() {
            DateTimeFormatter dateTimeFormatter = fse;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('.').appendFractionOfSecond(3, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourElement() {
            DateTimeFormatter dateTimeFormatter = hde;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinute() {
            DateTimeFormatter dateTimeFormatter = f31935hm;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = hms;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = hmsf;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = hmsl;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral('.').appendFractionOfSecond(3, 3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter literalTElement() {
            DateTimeFormatter dateTimeFormatter = lte;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('T').toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter localDateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = ldotp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).toParser()).toFormatter().withZoneUTC();
        }

        private static DateTimeFormatter localDateParser() {
            DateTimeFormatter dateTimeFormatter = ldp;
            return dateTimeFormatter == null ? dateElementParser().withZoneUTC() : dateTimeFormatter;
        }

        private static DateTimeFormatter localTimeParser() {
            DateTimeFormatter dateTimeFormatter = ltp;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC() : dateTimeFormatter;
        }

        private static DateTimeFormatter minuteElement() {
            DateTimeFormatter dateTimeFormatter = mhe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(':').appendMinuteOfHour(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter monthElement() {
            DateTimeFormatter dateTimeFormatter = mye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('-').appendMonthOfYear(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter offsetElement() {
            DateTimeFormatter dateTimeFormatter = f31945ze;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDate() {
            DateTimeFormatter dateTimeFormatter = f31936od;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDateTime() {
            DateTimeFormatter dateTimeFormatter = odt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ordinalDate()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = odtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ordinalDate()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter secondElement() {
            DateTimeFormatter dateTimeFormatter = sme;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(':').appendSecondOfMinute(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter tTime() {
            DateTimeFormatter dateTimeFormatter = f31939tt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(time()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter tTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = ttx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(timeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter time() {
            DateTimeFormatter dateTimeFormatter = f31937t;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter timeElementParser() {
            DateTimeFormatter dateTimeFormatter = tpe;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeParser parser = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('.').toParser(), new DateTimeFormatterBuilder().appendLiteral(',').toParser()}).toParser();
            return new DateTimeFormatterBuilder().append(hourElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(minuteElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(secondElement()).appendOptional(new DateTimeFormatterBuilder().append(parser).appendFractionOfSecond(1, 9).toParser()).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfMinute(1, 9).toParser(), null}).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfHour(1, 9).toParser(), null}).toFormatter();
        }

        private static DateTimeFormatter timeNoMillis() {
            DateTimeFormatter dateTimeFormatter = f31940tx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourMinuteSecond()).append(offsetElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter timeParser() {
            DateTimeFormatter dateTimeFormatter = f31938tp;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekDateTime() {
            DateTimeFormatter dateTimeFormatter = wdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = wdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekElement() {
            DateTimeFormatter dateTimeFormatter = wwe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearElement() {
            DateTimeFormatter dateTimeFormatter = f31941we;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearWeek() {
            DateTimeFormatter dateTimeFormatter = f31942ww;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearWeekDay() {
            DateTimeFormatter dateTimeFormatter = wwd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearElement() {
            DateTimeFormatter dateTimeFormatter = f31943ye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearMonth() {
            DateTimeFormatter dateTimeFormatter = f31944ym;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearMonthDay() {
            DateTimeFormatter dateTimeFormatter = ymd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter() : dateTimeFormatter;
        }
    }

    protected ISODateTimeFormat() {
    }

    private static void appendSeparator(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        if (z) {
            dateTimeFormatterBuilder.appendLiteral('-');
        }
    }

    public static DateTimeFormatter basicDate() {
        return Constants.f31930bd;
    }

    public static DateTimeFormatter basicDateTime() {
        return Constants.bdt;
    }

    public static DateTimeFormatter basicDateTimeNoMillis() {
        return Constants.bdtx;
    }

    public static DateTimeFormatter basicOrdinalDate() {
        return Constants.bod;
    }

    public static DateTimeFormatter basicOrdinalDateTime() {
        return Constants.bodt;
    }

    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
        return Constants.bodtx;
    }

    public static DateTimeFormatter basicTTime() {
        return Constants.btt;
    }

    public static DateTimeFormatter basicTTimeNoMillis() {
        return Constants.bttx;
    }

    public static DateTimeFormatter basicTime() {
        return Constants.f31931bt;
    }

    public static DateTimeFormatter basicTimeNoMillis() {
        return Constants.btx;
    }

    public static DateTimeFormatter basicWeekDate() {
        return Constants.bwd;
    }

    public static DateTimeFormatter basicWeekDateTime() {
        return Constants.bwdt;
    }

    public static DateTimeFormatter basicWeekDateTimeNoMillis() {
        return Constants.bwdtx;
    }

    private static void checkNotStrictISO(Collection<DateTimeFieldType> collection, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("No valid ISO8601 format for fields: ");
            sb.append(collection);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static DateTimeFormatter date() {
        return yearMonthDay();
    }

    private static boolean dateByMonth(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (collection.remove(DateTimeFieldType.year())) {
            dateTimeFormatterBuilder.append(Constants.f31943ye);
            if (collection.remove(DateTimeFieldType.monthOfYear())) {
                if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                    appendSeparator(dateTimeFormatterBuilder, z);
                    dateTimeFormatterBuilder.appendMonthOfYear(2);
                    appendSeparator(dateTimeFormatterBuilder, z);
                    dateTimeFormatterBuilder.appendDayOfMonth(2);
                } else {
                    dateTimeFormatterBuilder.appendLiteral('-');
                    dateTimeFormatterBuilder.appendMonthOfYear(2);
                    return true;
                }
            } else if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            } else {
                checkNotStrictISO(collection, z2);
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendDayOfMonth(2);
            }
        } else if (collection.remove(DateTimeFieldType.monthOfYear())) {
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendMonthOfYear(2);
            if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfMonth(2);
        } else if (collection.remove(DateTimeFieldType.dayOfMonth())) {
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendDayOfMonth(2);
        }
        return false;
    }

    private static boolean dateByOrdinal(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (collection.remove(DateTimeFieldType.year())) {
            dateTimeFormatterBuilder.append(Constants.f31943ye);
            if (!collection.remove(DateTimeFieldType.dayOfYear())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfYear(3);
        } else if (collection.remove(DateTimeFieldType.dayOfYear())) {
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendDayOfYear(3);
        }
        return false;
    }

    private static boolean dateByWeek(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2) {
        if (collection.remove(DateTimeFieldType.weekyear())) {
            dateTimeFormatterBuilder.append(Constants.f31941we);
            if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
                if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                    return true;
                }
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendDayOfWeek(1);
            } else if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            } else {
                checkNotStrictISO(collection, z2);
                appendSeparator(dateTimeFormatterBuilder, z);
                dateTimeFormatterBuilder.appendLiteral('W');
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendDayOfWeek(1);
            }
        } else if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
            if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
        } else if (collection.remove(DateTimeFieldType.dayOfWeek())) {
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendDayOfWeek(1);
        }
        return false;
    }

    public static DateTimeFormatter dateElementParser() {
        return Constants.dpe;
    }

    public static DateTimeFormatter dateHour() {
        return Constants.f31932dh;
    }

    public static DateTimeFormatter dateHourMinute() {
        return Constants.dhm;
    }

    public static DateTimeFormatter dateHourMinuteSecond() {
        return Constants.dhms;
    }

    public static DateTimeFormatter dateHourMinuteSecondFraction() {
        return Constants.dhmsf;
    }

    public static DateTimeFormatter dateHourMinuteSecondMillis() {
        return Constants.dhmsl;
    }

    public static DateTimeFormatter dateOptionalTimeParser() {
        return Constants.dotp;
    }

    public static DateTimeFormatter dateParser() {
        return Constants.f31933dp;
    }

    public static DateTimeFormatter dateTime() {
        return Constants.f31934dt;
    }

    public static DateTimeFormatter dateTimeNoMillis() {
        return Constants.dtx;
    }

    public static DateTimeFormatter dateTimeParser() {
        return Constants.dtp;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[SYNTHETIC, Splitter:B:33:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.joda.time.format.DateTimeFormatter forFields(java.util.Collection<org.joda.time.DateTimeFieldType> r8, boolean r9, boolean r10) {
        /*
            if (r8 == 0) goto L_0x00bf
            int r0 = r8.size()
            if (r0 == 0) goto L_0x00bf
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r8)
            int r1 = r0.size()
            org.joda.time.format.DateTimeFormatterBuilder r7 = new org.joda.time.format.DateTimeFormatterBuilder
            r7.<init>()
            org.joda.time.DateTimeFieldType r2 = org.joda.time.DateTimeFieldType.monthOfYear()
            boolean r2 = r0.contains(r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0028
            boolean r2 = dateByMonth(r7, r0, r9, r10)
        L_0x0026:
            r5 = r2
            goto L_0x008a
        L_0x0028:
            org.joda.time.DateTimeFieldType r2 = org.joda.time.DateTimeFieldType.dayOfYear()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0037
            boolean r2 = dateByOrdinal(r7, r0, r9, r10)
            goto L_0x0026
        L_0x0037:
            org.joda.time.DateTimeFieldType r2 = org.joda.time.DateTimeFieldType.weekOfWeekyear()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0046
            boolean r2 = dateByWeek(r7, r0, r9, r10)
            goto L_0x0026
        L_0x0046:
            org.joda.time.DateTimeFieldType r2 = org.joda.time.DateTimeFieldType.dayOfMonth()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0055
            boolean r2 = dateByMonth(r7, r0, r9, r10)
            goto L_0x0026
        L_0x0055:
            org.joda.time.DateTimeFieldType r2 = org.joda.time.DateTimeFieldType.dayOfWeek()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0064
            boolean r2 = dateByWeek(r7, r0, r9, r10)
            goto L_0x0026
        L_0x0064:
            org.joda.time.DateTimeFieldType r2 = org.joda.time.DateTimeFieldType.year()
            boolean r2 = r0.remove(r2)
            if (r2 == 0) goto L_0x0077
            org.joda.time.format.DateTimeFormatter r2 = org.joda.time.format.ISODateTimeFormat.Constants.f31943ye
            r7.append(r2)
        L_0x0075:
            r5 = 1
            goto L_0x008a
        L_0x0077:
            org.joda.time.DateTimeFieldType r2 = org.joda.time.DateTimeFieldType.weekyear()
            boolean r2 = r0.remove(r2)
            if (r2 == 0) goto L_0x0089
            org.joda.time.format.DateTimeFormatter r2 = org.joda.time.format.ISODateTimeFormat.Constants.f31941we
            r7.append(r2)
            goto L_0x0075
        L_0x0089:
            r5 = 0
        L_0x008a:
            int r2 = r0.size()
            if (r2 >= r1) goto L_0x0092
            r6 = 1
            goto L_0x0093
        L_0x0092:
            r6 = 0
        L_0x0093:
            r1 = r7
            r2 = r0
            r3 = r9
            r4 = r10
            time(r1, r2, r3, r4, r5, r6)
            boolean r9 = r7.canBuildFormatter()
            if (r9 == 0) goto L_0x00a8
            r8.retainAll(r0)     // Catch:{ UnsupportedOperationException -> 0x00a3 }
        L_0x00a3:
            org.joda.time.format.DateTimeFormatter r8 = r7.toFormatter()
            return r8
        L_0x00a8:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "No valid format for fields: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x00bf:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The fields must not be null or empty"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.ISODateTimeFormat.forFields(java.util.Collection, boolean, boolean):org.joda.time.format.DateTimeFormatter");
    }

    public static DateTimeFormatter hour() {
        return Constants.hde;
    }

    public static DateTimeFormatter hourMinute() {
        return Constants.f31935hm;
    }

    public static DateTimeFormatter hourMinuteSecond() {
        return Constants.hms;
    }

    public static DateTimeFormatter hourMinuteSecondFraction() {
        return Constants.hmsf;
    }

    public static DateTimeFormatter hourMinuteSecondMillis() {
        return Constants.hmsl;
    }

    public static DateTimeFormatter localDateOptionalTimeParser() {
        return Constants.ldotp;
    }

    public static DateTimeFormatter localDateParser() {
        return Constants.ldp;
    }

    public static DateTimeFormatter localTimeParser() {
        return Constants.ltp;
    }

    public static DateTimeFormatter ordinalDate() {
        return Constants.f31936od;
    }

    public static DateTimeFormatter ordinalDateTime() {
        return Constants.odt;
    }

    public static DateTimeFormatter ordinalDateTimeNoMillis() {
        return Constants.odtx;
    }

    public static DateTimeFormatter tTime() {
        return Constants.f31939tt;
    }

    public static DateTimeFormatter tTimeNoMillis() {
        return Constants.ttx;
    }

    private static void time(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean remove = collection.remove(DateTimeFieldType.hourOfDay());
        boolean remove2 = collection.remove(DateTimeFieldType.minuteOfHour());
        boolean remove3 = collection.remove(DateTimeFieldType.secondOfMinute());
        boolean remove4 = collection.remove(DateTimeFieldType.millisOfSecond());
        if (remove || remove2 || remove3 || remove4) {
            if (remove || remove2 || remove3 || remove4) {
                if (z2 && z3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No valid ISO8601 format for fields because Date was reduced precision: ");
                    sb.append(collection);
                    throw new IllegalArgumentException(sb.toString());
                } else if (z4) {
                    dateTimeFormatterBuilder.appendLiteral('T');
                }
            }
            if ((!remove || !remove2 || !remove3) && (!remove || remove3 || remove4)) {
                if (z2 && z4) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No valid ISO8601 format for fields because Time was truncated: ");
                    sb2.append(collection);
                    throw new IllegalArgumentException(sb2.toString());
                } else if ((remove || ((!remove2 || !remove3) && ((!remove2 || remove4) && !remove3))) && z2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No valid ISO8601 format for fields: ");
                    sb3.append(collection);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (remove) {
                dateTimeFormatterBuilder.appendHourOfDay(2);
            } else if (remove2 || remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z && remove && remove2) {
                dateTimeFormatterBuilder.appendLiteral(':');
            }
            if (remove2) {
                dateTimeFormatterBuilder.appendMinuteOfHour(2);
            } else if (remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z && remove2 && remove3) {
                dateTimeFormatterBuilder.appendLiteral(':');
            }
            if (remove3) {
                dateTimeFormatterBuilder.appendSecondOfMinute(2);
            } else if (remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (remove4) {
                dateTimeFormatterBuilder.appendLiteral('.');
                dateTimeFormatterBuilder.appendMillisOfSecond(3);
            }
        }
    }

    public static DateTimeFormatter timeElementParser() {
        return Constants.tpe;
    }

    public static DateTimeFormatter timeNoMillis() {
        return Constants.f31940tx;
    }

    public static DateTimeFormatter timeParser() {
        return Constants.f31938tp;
    }

    public static DateTimeFormatter weekDate() {
        return Constants.wwd;
    }

    public static DateTimeFormatter weekDateTime() {
        return Constants.wdt;
    }

    public static DateTimeFormatter weekDateTimeNoMillis() {
        return Constants.wdtx;
    }

    public static DateTimeFormatter weekyear() {
        return Constants.f31941we;
    }

    public static DateTimeFormatter weekyearWeek() {
        return Constants.f31942ww;
    }

    public static DateTimeFormatter weekyearWeekDay() {
        return Constants.wwd;
    }

    public static DateTimeFormatter year() {
        return Constants.f31943ye;
    }

    public static DateTimeFormatter yearMonth() {
        return Constants.f31944ym;
    }

    public static DateTimeFormatter yearMonthDay() {
        return Constants.ymd;
    }

    public static DateTimeFormatter time() {
        return Constants.f31937t;
    }
}
