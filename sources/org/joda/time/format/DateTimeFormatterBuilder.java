package org.joda.time.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableDateTime.Property;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        CharacterLiteral(char c) {
            this.iValue = c;
        }

        public int estimateParsedLength() {
            return 1;
        }

        public int estimatePrintedLength() {
            return 1;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            if (i >= charSequence.length()) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            char c = this.iValue;
            if (charAt != c) {
                char upperCase = Character.toUpperCase(charAt);
                char upperCase2 = Character.toUpperCase(c);
                if (!(upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2))) {
                    return ~i;
                }
            }
            return i + 1;
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i2);
                    i += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i2] = internalPrinter;
                }
                this.iPrintedLengthEstimate = i;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i4);
                i3 += internalParser.estimateParsedLength();
                this.iParsers[i4] = internalParser;
            }
            this.iParsedLengthEstimate = i3;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        /* access modifiers changed from: 0000 */
        public boolean isParser() {
            return this.iParsers != null;
        }

        /* access modifiers changed from: 0000 */
        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr != null) {
                int length = internalParserArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = internalParserArr[i2].parseInto(dateTimeParserBucket, charSequence, i);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                Locale locale2 = locale == null ? Locale.getDefault() : locale;
                for (InternalPrinter printTo : internalPrinterArr) {
                    printTo.printTo(appendable, j, chronology, i, dateTimeZone, locale2);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (InternalPrinter printTo : internalPrinterArr) {
                    printTo.printTo(appendable, readablePartial, locale);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    static class FixedNumber extends PaddedNumber {
        protected FixedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int parseInto = super.parseInto(dateTimeParserBucket, charSequence, i);
            if (parseInto < 0) {
                return parseInto;
            }
            int i2 = this.iMaxParsedDigits + i;
            if (parseInto != i2) {
                if (this.iSigned) {
                    char charAt = charSequence.charAt(i);
                    if (charAt == '-' || charAt == '+') {
                        i2++;
                    }
                }
                if (parseInto > i2) {
                    return ~(i2 + 1);
                }
                if (parseInto < i2) {
                    parseInto = ~parseInto;
                }
            }
            return parseInto;
        }
    }

    static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        protected Fraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.iFieldType = dateTimeFieldType;
            int i3 = 18;
            if (i2 <= 18) {
                i3 = i2;
            }
            this.iMinDigits = i;
            this.iMaxDigits = i3;
        }

        private long[] getFractionData(long j, DateTimeField dateTimeField) {
            long j2;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i = this.iMaxDigits;
            while (true) {
                switch (i) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = 10000;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = 1000000;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = 1000000000;
                        break;
                    case 10:
                        j2 = 10000000000L;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((unitMillis * j2) / j2 == unitMillis) {
                    return new long[]{(j * j2) / unitMillis, (long) i};
                }
                i--;
            }
        }

        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int min = Math.min(this.iMaxDigits, charSequence.length() - i);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min) {
                char charAt = charSequence.charAt(i + i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2++;
                unitMillis /= 10;
                j += ((long) (charAt - '0')) * unitMillis;
            }
            long j2 = j / 10;
            if (i2 == 0) {
                return ~i;
            }
            if (j2 > 2147483647L) {
                return ~i;
            }
            dateTimeParserBucket.saveField((DateTimeField) new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j2);
            return i + i2;
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j, chronology);
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0), readablePartial.getChronology());
        }

        /* access modifiers changed from: protected */
        public void printTo(Appendable appendable, long j, Chronology chronology) throws IOException {
            String str;
            DateTimeField field = this.iFieldType.getField(chronology);
            int i = this.iMinDigits;
            try {
                long remainder = field.remainder(j);
                if (remainder == 0) {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            appendable.append('0');
                        } else {
                            return;
                        }
                    }
                } else {
                    long[] fractionData = getFractionData(remainder, field);
                    long j2 = fractionData[0];
                    int i2 = (int) fractionData[1];
                    if ((2147483647L & j2) == j2) {
                        str = Integer.toString((int) j2);
                    } else {
                        str = Long.toString(j2);
                    }
                    int length = str.length();
                    while (length < i2) {
                        appendable.append('0');
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        while (i < i2 && length > 1 && str.charAt(length - 1) == '0') {
                            i2--;
                            length--;
                        }
                        if (length < str.length()) {
                            for (int i3 = 0; i3 < length; i3++) {
                                appendable.append(str.charAt(i3));
                            }
                            return;
                        }
                    }
                    appendable.append(str);
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i);
            }
        }
    }

    static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        MatchingParser(InternalParser[] internalParserArr) {
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    InternalParser internalParser = internalParserArr[length];
                    if (internalParser != null) {
                        int estimateParsedLength = internalParser.estimateParsedLength();
                        if (estimateParsedLength > i) {
                            i = estimateParsedLength;
                        }
                    }
                } else {
                    this.iParsedLengthEstimate = i;
                    return;
                }
            }
        }

        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            return r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r10, java.lang.CharSequence r11, int r12) {
            /*
                r9 = this;
                org.joda.time.format.InternalParser[] r0 = r9.iParsers
                int r1 = r0.length
                java.lang.Object r2 = r10.saveState()
                r3 = 0
                r4 = 0
                r5 = r12
                r6 = r5
                r7 = r4
                r4 = 0
            L_0x000d:
                if (r4 >= r1) goto L_0x0043
                r8 = r0[r4]
                if (r8 != 0) goto L_0x0018
                if (r5 > r12) goto L_0x0016
                return r12
            L_0x0016:
                r3 = 1
                goto L_0x0043
            L_0x0018:
                int r8 = r8.parseInto(r10, r11, r12)
                if (r8 < r12) goto L_0x0037
                if (r8 <= r5) goto L_0x003d
                int r5 = r11.length()
                if (r8 >= r5) goto L_0x0036
                int r5 = r4 + 1
                if (r5 >= r1) goto L_0x0036
                r5 = r0[r5]
                if (r5 != 0) goto L_0x002f
                goto L_0x0036
            L_0x002f:
                java.lang.Object r5 = r10.saveState()
                r7 = r5
                r5 = r8
                goto L_0x003d
            L_0x0036:
                return r8
            L_0x0037:
                if (r8 >= 0) goto L_0x003d
                int r8 = ~r8
                if (r8 <= r6) goto L_0x003d
                r6 = r8
            L_0x003d:
                r10.restoreState(r2)
                int r4 = r4 + 1
                goto L_0x000d
            L_0x0043:
                if (r5 > r12) goto L_0x004c
                if (r5 != r12) goto L_0x004a
                if (r3 == 0) goto L_0x004a
                goto L_0x004c
            L_0x004a:
                int r10 = ~r6
                return r10
            L_0x004c:
                if (r7 == 0) goto L_0x0051
                r10.restoreState(r7)
            L_0x0051:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.MatchingParser.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        NumberFormatter(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i;
            this.iSigned = z;
        }

        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            boolean z;
            boolean z2;
            CharSequence charSequence2 = charSequence;
            int i4 = i;
            int min = Math.min(this.iMaxParsedDigits, charSequence.length() - i4);
            int i5 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i5 >= min) {
                    break;
                }
                int i6 = i4 + i5;
                char charAt = charSequence2.charAt(i6);
                if (i5 != 0 || ((charAt != '-' && charAt != '+') || !this.iSigned)) {
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    i5++;
                } else {
                    z = true;
                    z2 = charAt == '-';
                    if (charAt != '+') {
                        z = false;
                    }
                    int i7 = i5 + 1;
                    if (i7 >= min) {
                        break;
                    }
                    char charAt2 = charSequence2.charAt(i6 + 1);
                    if (charAt2 < '0' || charAt2 > '9') {
                        break;
                    }
                    min = Math.min(min + 1, charSequence.length() - i4);
                    i5 = i7;
                    boolean z5 = z2;
                    z4 = z;
                    z3 = z5;
                }
            }
            boolean z6 = z2;
            z4 = z;
            z3 = z6;
            if (i5 == 0) {
                return ~i4;
            }
            if (i5 < 9) {
                int i8 = (z3 || z4) ? i4 + 1 : i4;
                int i9 = i8 + 1;
                try {
                    int charAt3 = charSequence2.charAt(i8) - '0';
                    i2 = i4 + i5;
                    while (i9 < i2) {
                        i9++;
                        charAt3 = (((charAt3 << 3) + (charAt3 << 1)) + charSequence2.charAt(i9)) - 48;
                    }
                    i3 = z3 ? -charAt3 : charAt3;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i4;
                }
            } else if (z4) {
                int i10 = i4 + 1;
                i2 = i4 + i5;
                i3 = Integer.parseInt(charSequence2.subSequence(i10, i2).toString());
            } else {
                int i11 = i5 + i4;
                i3 = Integer.parseInt(charSequence2.subSequence(i4, i11).toString());
                i2 = i11;
            }
            dateTimeParserBucket.saveField(this.iFieldType, i3);
            return i2;
        }
    }

    static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        protected PaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.iMinPrintedDigits = i2;
        }

        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                } catch (RuntimeException unused) {
                    DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
                }
            } else {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }
    }

    static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        StringLiteral(String str) {
            this.iValue = str;
        }

        public int estimateParsedLength() {
            return this.iValue.length();
        }

        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i, this.iValue) ? i + this.iValue.length() : ~i;
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        TextField(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z;
        }

        private String print(long j, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            if (this.iShort) {
                return field.getAsShortText(j, locale);
            }
            return field.getAsText(j, locale);
        }

        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map map2 = (Map) cParseCache.get(locale);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                cParseCache.put(locale, map2);
            }
            Object[] objArr = (Object[]) map2.get(this.iFieldType);
            if (objArr == null) {
                Map concurrentHashMap = new ConcurrentHashMap(32);
                Property property = new MutableDateTime(0, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i;
                }
                i2 = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    concurrentHashMap.put(property.getAsShortText(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsShortText(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsShortText(locale).toUpperCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsText(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsText(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(property.getAsText(locale).toUpperCase(locale), Boolean.TRUE);
                    minimumValueOverall++;
                }
                if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    concurrentHashMap.put("BCE", Boolean.TRUE);
                    concurrentHashMap.put("bce", Boolean.TRUE);
                    concurrentHashMap.put("CE", Boolean.TRUE);
                    concurrentHashMap.put("ce", Boolean.TRUE);
                    i2 = 3;
                }
                map2.put(this.iFieldType, new Object[]{concurrentHashMap, Integer.valueOf(i2)});
                map = concurrentHashMap;
            } else {
                map = (Map) objArr[0];
                i2 = ((Integer) objArr[1]).intValue();
            }
            for (int min = Math.min(charSequence.length(), i2 + i); min > i; min--) {
                String charSequence2 = charSequence.subSequence(i, min).toString();
                if (map.containsKey(charSequence2)) {
                    dateTimeParserBucket.saveField(this.iFieldType, charSequence2, locale);
                    return min;
                }
            }
            return ~i;
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.iFieldType)) {
                return "�";
            }
            DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
            if (this.iShort) {
                return field.getAsShortText(readablePartial, locale);
            }
            return field.getAsText(readablePartial, locale);
        }
    }

    enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;
        
        private static final List<String> ALL_IDS = null;
        private static final List<String> BASE_GROUPED_IDS = null;
        private static final Map<String, List<String>> GROUPED_IDS = null;
        static final int MAX_LENGTH = 0;
        static final int MAX_PREFIX_LENGTH = 0;

        static {
            BASE_GROUPED_IDS = new ArrayList();
            ALL_IDS = new ArrayList(DateTimeZone.getAvailableIDs());
            Collections.sort(ALL_IDS);
            GROUPED_IDS = new HashMap();
            int i = 0;
            int i2 = 0;
            for (String str : ALL_IDS) {
                int indexOf = str.indexOf(47);
                if (indexOf >= 0) {
                    if (indexOf < str.length()) {
                        indexOf++;
                    }
                    i2 = Math.max(i2, indexOf);
                    String substring = str.substring(0, indexOf + 1);
                    String substring2 = str.substring(indexOf);
                    if (!GROUPED_IDS.containsKey(substring)) {
                        GROUPED_IDS.put(substring, new ArrayList());
                    }
                    ((List) GROUPED_IDS.get(substring)).add(substring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                i = Math.max(i, str.length());
            }
            MAX_LENGTH = i;
            MAX_PREFIX_LENGTH = i2;
        }

        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            String str;
            int i2;
            String str2;
            List<String> list = BASE_GROUPED_IDS;
            int length = charSequence.length();
            int min = Math.min(length, MAX_PREFIX_LENGTH + i);
            int i3 = i;
            while (true) {
                if (i3 >= min) {
                    str = "";
                    i2 = i;
                    break;
                } else if (charSequence.charAt(i3) == '/') {
                    int i4 = i3 + 1;
                    str = charSequence.subSequence(i, i4).toString();
                    i2 = str.length() + i;
                    if (i3 < length) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(charSequence.charAt(i4));
                        str2 = sb.toString();
                    } else {
                        str2 = str;
                    }
                    list = (List) GROUPED_IDS.get(str2);
                    if (list == null) {
                        return ~i;
                    }
                } else {
                    i3++;
                }
            }
            String str3 = null;
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str4 = (String) list.get(i5);
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i2, str4) && (str3 == null || str4.length() > str3.length())) {
                    str3 = str4;
                }
            }
            if (str3 == null) {
                return ~i;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(str3);
            dateTimeParserBucket.setZone(DateTimeZone.forID(sb2.toString()));
            return i2 + str3.length();
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    static class TimeZoneName implements InternalPrinter, InternalParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        TimeZoneName(int i, Map<String, DateTimeZone> map) {
            this.iType = i;
            this.iParseLookup = map;
        }

        private String print(long j, DateTimeZone dateTimeZone, Locale locale) {
            String str = "";
            if (dateTimeZone == null) {
                return str;
            }
            int i = this.iType;
            if (i == 0) {
                return dateTimeZone.getName(j, locale);
            }
            if (i != 1) {
                return str;
            }
            return dateTimeZone.getShortName(j, locale);
        }

        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            Map<String, DateTimeZone> map = this.iParseLookup;
            if (map == null) {
                map = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : map.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i;
            }
            dateTimeParserBucket.setZone((DateTimeZone) map.get(str));
            return i + str.length();
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j - ((long) i), dateTimeZone, locale));
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        TimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z;
            if (i <= 0 || i2 < i) {
                throw new IllegalArgumentException();
            }
            int i3 = 4;
            if (i > 4) {
                i2 = 4;
            } else {
                i3 = i;
            }
            this.iMinFields = i3;
            this.iMaxFields = i2;
        }

        private int digitCount(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (int min = Math.min(charSequence.length() - i, i2); min > 0; min--) {
                char charAt = charSequence.charAt(i + i3);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        public int estimatePrintedLength() {
            int i = this.iMinFields;
            int i2 = (i + 1) << 1;
            if (this.iShowSeparators) {
                i2 += i - 1;
            }
            String str = this.iZeroOffsetPrintText;
            return (str == null || str.length() <= i2) ? i2 : this.iZeroOffsetPrintText.length();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0080, code lost:
            if (r6 <= '9') goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
            if (r1 != '+') goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r12, java.lang.CharSequence r13, int r14) {
            /*
                r11 = this;
                int r0 = r13.length()
                int r0 = r0 - r14
                java.lang.String r1 = r11.iZeroOffsetParseText
                r2 = 43
                r3 = 45
                r4 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                if (r1 == 0) goto L_0x003a
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0027
                if (r0 <= 0) goto L_0x0023
                char r1 = r13.charAt(r14)
                if (r1 == r3) goto L_0x003a
                if (r1 != r2) goto L_0x0023
                goto L_0x003a
            L_0x0023:
                r12.setOffset(r5)
                return r14
            L_0x0027:
                java.lang.String r1 = r11.iZeroOffsetParseText
                boolean r1 = org.joda.time.format.DateTimeFormatterBuilder.csStartsWithIgnoreCase(r13, r14, r1)
                if (r1 == 0) goto L_0x003a
                r12.setOffset(r5)
                java.lang.String r12 = r11.iZeroOffsetParseText
                int r12 = r12.length()
                int r14 = r14 + r12
                return r14
            L_0x003a:
                r1 = 1
                if (r0 > r1) goto L_0x003f
                int r12 = ~r14
                return r12
            L_0x003f:
                char r5 = r13.charAt(r14)
                if (r5 != r3) goto L_0x0047
                r2 = 1
                goto L_0x004a
            L_0x0047:
                if (r5 != r2) goto L_0x0126
                r2 = 0
            L_0x004a:
                int r0 = r0 + -1
                int r14 = r14 + r1
                r3 = 2
                int r5 = r11.digitCount(r13, r14, r3)
                if (r5 >= r3) goto L_0x0056
                int r12 = ~r14
                return r12
            L_0x0056:
                int r5 = org.joda.time.format.FormatUtils.parseTwoDigits(r13, r14)
                r6 = 23
                if (r5 <= r6) goto L_0x0060
                int r12 = ~r14
                return r12
            L_0x0060:
                r6 = 3600000(0x36ee80, float:5.044674E-39)
                int r5 = r5 * r6
                int r0 = r0 + -2
                int r14 = r14 + r3
                if (r0 > 0) goto L_0x006c
                goto L_0x011b
            L_0x006c:
                char r6 = r13.charAt(r14)
                r7 = 58
                r8 = 48
                if (r6 != r7) goto L_0x007c
                int r0 = r0 + -1
                int r14 = r14 + 1
                r4 = 1
                goto L_0x0082
            L_0x007c:
                if (r6 < r8) goto L_0x011b
                r9 = 57
                if (r6 > r9) goto L_0x011b
            L_0x0082:
                int r6 = r11.digitCount(r13, r14, r3)
                if (r6 != 0) goto L_0x008c
                if (r4 != 0) goto L_0x008c
                goto L_0x011b
            L_0x008c:
                if (r6 >= r3) goto L_0x0090
                int r12 = ~r14
                return r12
            L_0x0090:
                int r6 = org.joda.time.format.FormatUtils.parseTwoDigits(r13, r14)
                r9 = 59
                if (r6 <= r9) goto L_0x009a
                int r12 = ~r14
                return r12
            L_0x009a:
                r10 = 60000(0xea60, float:8.4078E-41)
                int r6 = r6 * r10
                int r5 = r5 + r6
                int r0 = r0 + -2
                int r14 = r14 + 2
                if (r0 > 0) goto L_0x00a8
                goto L_0x011b
            L_0x00a8:
                if (r4 == 0) goto L_0x00b6
                char r6 = r13.charAt(r14)
                if (r6 == r7) goto L_0x00b2
                goto L_0x011b
            L_0x00b2:
                int r0 = r0 + -1
                int r14 = r14 + 1
            L_0x00b6:
                int r6 = r11.digitCount(r13, r14, r3)
                if (r6 != 0) goto L_0x00bf
                if (r4 != 0) goto L_0x00bf
                goto L_0x011b
            L_0x00bf:
                if (r6 >= r3) goto L_0x00c3
                int r12 = ~r14
                return r12
            L_0x00c3:
                int r6 = org.joda.time.format.FormatUtils.parseTwoDigits(r13, r14)
                if (r6 <= r9) goto L_0x00cb
                int r12 = ~r14
                return r12
            L_0x00cb:
                int r6 = r6 * 1000
                int r5 = r5 + r6
                int r0 = r0 + -2
                int r14 = r14 + 2
                if (r0 > 0) goto L_0x00d5
                goto L_0x011b
            L_0x00d5:
                if (r4 == 0) goto L_0x00ea
                char r0 = r13.charAt(r14)
                r6 = 46
                if (r0 == r6) goto L_0x00e8
                char r0 = r13.charAt(r14)
                r6 = 44
                if (r0 == r6) goto L_0x00e8
                goto L_0x011b
            L_0x00e8:
                int r14 = r14 + 1
            L_0x00ea:
                r0 = 3
                int r0 = r11.digitCount(r13, r14, r0)
                if (r0 != 0) goto L_0x00f4
                if (r4 != 0) goto L_0x00f4
                goto L_0x011b
            L_0x00f4:
                if (r0 >= r1) goto L_0x00f8
                int r12 = ~r14
                return r12
            L_0x00f8:
                int r4 = r14 + 1
                char r14 = r13.charAt(r14)
                int r14 = r14 - r8
                int r14 = r14 * 100
                int r5 = r5 + r14
                if (r0 <= r1) goto L_0x011a
                int r14 = r4 + 1
                char r1 = r13.charAt(r4)
                int r1 = r1 - r8
                int r1 = r1 * 10
                int r5 = r5 + r1
                if (r0 <= r3) goto L_0x011b
                int r0 = r14 + 1
                char r13 = r13.charAt(r14)
                int r13 = r13 - r8
                int r5 = r5 + r13
                r14 = r0
                goto L_0x011b
            L_0x011a:
                r14 = r4
            L_0x011b:
                if (r2 == 0) goto L_0x011e
                int r5 = -r5
            L_0x011e:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
                r12.setOffset(r13)
                return r14
            L_0x0126:
                int r12 = ~r14
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            if (dateTimeZone != null) {
                if (i == 0) {
                    String str = this.iZeroOffsetPrintText;
                    if (str != null) {
                        appendable.append(str);
                        return;
                    }
                }
                if (i >= 0) {
                    appendable.append('+');
                } else {
                    appendable.append('-');
                    i = -i;
                }
                int i2 = i / DateTimeConstants.MILLIS_PER_HOUR;
                FormatUtils.appendPaddedInteger(appendable, i2, 2);
                if (this.iMaxFields != 1) {
                    int i3 = i - (i2 * DateTimeConstants.MILLIS_PER_HOUR);
                    if (i3 != 0 || this.iMinFields > 1) {
                        int i4 = i3 / DateTimeConstants.MILLIS_PER_MINUTE;
                        if (this.iShowSeparators) {
                            appendable.append(':');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i4, 2);
                        if (this.iMaxFields != 2) {
                            int i5 = i3 - (i4 * DateTimeConstants.MILLIS_PER_MINUTE);
                            if (i5 != 0 || this.iMinFields > 2) {
                                int i6 = i5 / 1000;
                                if (this.iShowSeparators) {
                                    appendable.append(':');
                                }
                                FormatUtils.appendPaddedInteger(appendable, i6, 2);
                                if (this.iMaxFields != 3) {
                                    int i7 = i5 - (i6 * 1000);
                                    if (i7 != 0 || this.iMinFields > 3) {
                                        if (this.iShowSeparators) {
                                            appendable.append('.');
                                        }
                                        FormatUtils.appendPaddedInteger(appendable, i7, 3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }
    }

    static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.iType = dateTimeFieldType;
            this.iPivot = i;
            this.iLenientParse = z;
        }

        private int getTwoDigitYear(long j, Chronology chronology) {
            try {
                int i = this.iType.getField(chronology).get(j);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        public int estimatePrintedLength() {
            return 2;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            int length = charSequence.length() - i;
            if (this.iLenientParse) {
                int i5 = i;
                int i6 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i6 < length) {
                    char charAt = charSequence.charAt(i5 + i6);
                    if (i6 != 0 || (charAt != '-' && charAt != '+')) {
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i6++;
                    } else {
                        z2 = charAt == '-';
                        if (z2) {
                            i6++;
                        } else {
                            i5++;
                            length--;
                        }
                        z = true;
                    }
                }
                if (i6 == 0) {
                    return ~i5;
                }
                if (z || i6 != 2) {
                    if (i6 >= 9) {
                        i3 = i6 + i5;
                        i4 = Integer.parseInt(charSequence.subSequence(i5, i3).toString());
                    } else {
                        int i7 = z2 ? i5 + 1 : i5;
                        int i8 = i7 + 1;
                        try {
                            int charAt2 = charSequence.charAt(i7) - '0';
                            i3 = i6 + i5;
                            while (i8 < i3) {
                                i8++;
                                charAt2 = (((charAt2 << 3) + (charAt2 << 1)) + charSequence.charAt(i8)) - 48;
                            }
                            i4 = z2 ? -charAt2 : charAt2;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i5;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i4);
                    return i3;
                }
                i = i5;
            } else if (Math.min(2, length) < 2) {
                return ~i;
            }
            char charAt3 = charSequence.charAt(i);
            if (charAt3 < '0' || charAt3 > '9') {
                return ~i;
            }
            int i9 = charAt3 - '0';
            char charAt4 = charSequence.charAt(i + 1);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i;
            }
            int i10 = (((i9 << 3) + (i9 << 1)) + charAt4) - 48;
            int i11 = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                i11 = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i12 = i11 - 50;
            int i13 = 100;
            if (i12 >= 0) {
                i2 = i12 % 100;
            } else {
                i2 = ((i12 + 1) % 100) + 99;
            }
            if (i10 >= i2) {
                i13 = 0;
            }
            dateTimeParserBucket.saveField(this.iType, i10 + ((i12 + i13) - i2));
            return i + 2;
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j, chronology);
            if (twoDigitYear < 0) {
                appendable.append(65533);
                appendable.append(65533);
                return;
            }
            FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (readablePartial.isSupported(this.iType)) {
                try {
                    int i = readablePartial.get(this.iType);
                    if (i < 0) {
                        i = -i;
                    }
                    return i % 100;
                } catch (RuntimeException unused) {
                }
            }
            return -1;
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                appendable.append(65533);
                appendable.append(65533);
                return;
            }
            FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
        }
    }

    static class UnpaddedNumber extends NumberFormatter {
        protected UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                } catch (RuntimeException unused) {
                    appendable.append(65533);
                }
            } else {
                appendable.append(65533);
            }
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    static void appendUnknownString(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append(65533);
            } else {
                return;
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    static boolean csStartsWith(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2) {
                char upperCase = Character.toUpperCase(charAt);
                char upperCase2 = Character.toUpperCase(charAt2);
                if (!(upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2))) {
                    return false;
                }
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object obj = this.iFormatter;
        if (obj == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj2 = this.iElementPairs.get(0);
                Object obj3 = this.iElementPairs.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new Composite(this.iElementPairs);
            }
            this.iFormatter = obj;
        }
        return obj;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i, i2);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            } else if (i <= 1) {
                return append0(new UnpaddedNumber(dateTimeFieldType, i2, false));
            } else {
                return append0(new PaddedNumber(dateTimeFieldType, i2, false, i));
            }
        } else {
            throw new IllegalArgumentException("Field type must not be null");
        }
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i, false));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal number of digits: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i, true));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal number of digits: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return append0(new Fraction(dateTimeFieldType, i, i2));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i, int i2) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i, int i2) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i, int i2) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i, int i2) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        return append0(new CharacterLiteral(c));
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.m45847of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            } else if (i <= 1) {
                return append0(new UnpaddedNumber(dateTimeFieldType, i2, true));
            } else {
                return append0(new PaddedNumber(dateTimeFieldType, i2, true, i));
            }
        } else {
            throw new IllegalArgumentException("Field type must not be null");
        }
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z, int i, int i2) {
        TimeZoneOffset timeZoneOffset = new TimeZoneOffset(str, str, z, i, i2);
        return append0(timeZoneOffset);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i) {
        return appendTwoDigitWeekyear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i) {
        return appendTwoDigitYear(i, false);
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i, i2);
    }

    public DateTimeFormatterBuilder appendYear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.year(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i, i2);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalParser internalParser = null;
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        if (isParser(formatter)) {
            internalParser = (InternalParser) formatter;
        }
        if (internalPrinter != null || internalParser != null) {
            return new DateTimeFormatter(internalPrinter, internalParser);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.m45849of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.m45850of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str != null) {
            int length = str.length();
            if (length == 0) {
                return this;
            }
            if (length != 1) {
                return append0(new StringLiteral(str));
            }
            return append0(new CharacterLiteral(str.charAt(0)));
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
        TimeZoneOffset timeZoneOffset = new TimeZoneOffset(str, str2, z, i, i2);
        return append0(timeZoneOffset);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i, z));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i, z));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.m45848of(dateTimePrinter), null);
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.m45847of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.m45848of(dateTimePrinter), DateTimeParserInternalParser.m45847of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr != null) {
            int length = dateTimeParserArr.length;
            int i = 0;
            if (length != 1) {
                InternalParser[] internalParserArr = new InternalParser[length];
                while (i < length - 1) {
                    InternalParser of = DateTimeParserInternalParser.m45847of(dateTimeParserArr[i]);
                    internalParserArr[i] = of;
                    if (of != null) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Incomplete parser array");
                    }
                }
                internalParserArr[i] = DateTimeParserInternalParser.m45847of(dateTimeParserArr[i]);
                return append0(DateTimePrinterInternalPrinter.m45848of(dateTimePrinter), new MatchingParser(internalParserArr));
            } else if (dateTimeParserArr[0] != null) {
                return append0(DateTimePrinterInternalPrinter.m45848of(dateTimePrinter), DateTimeParserInternalParser.m45847of(dateTimeParserArr[0]));
            } else {
                throw new IllegalArgumentException("No parser supplied");
            }
        } else {
            throw new IllegalArgumentException("No parsers supplied");
        }
    }
}
