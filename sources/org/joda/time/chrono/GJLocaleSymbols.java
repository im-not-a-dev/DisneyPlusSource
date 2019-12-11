package org.joda.time.chrono;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.IllegalFieldValueException;

class GJLocaleSymbols {
    private static ConcurrentMap<Locale, GJLocaleSymbols> cCache = new ConcurrentHashMap();
    private final String[] iDaysOfWeek;
    private final String[] iEras;
    private final String[] iHalfday;
    private final int iMaxDayOfWeekLength;
    private final int iMaxEraLength;
    private final int iMaxHalfdayLength;
    private final int iMaxMonthLength;
    private final int iMaxShortDayOfWeekLength;
    private final int iMaxShortMonthLength;
    private final String[] iMonths;
    private final TreeMap<String, Integer> iParseDaysOfWeek;
    private final TreeMap<String, Integer> iParseEras;
    private final TreeMap<String, Integer> iParseMonths;
    private final String[] iShortDaysOfWeek;
    private final String[] iShortMonths;

    private GJLocaleSymbols(Locale locale) {
        DateFormatSymbols dateFormatSymbols = DateTimeUtils.getDateFormatSymbols(locale);
        this.iEras = dateFormatSymbols.getEras();
        this.iDaysOfWeek = realignDaysOfWeek(dateFormatSymbols.getWeekdays());
        this.iShortDaysOfWeek = realignDaysOfWeek(dateFormatSymbols.getShortWeekdays());
        this.iMonths = realignMonths(dateFormatSymbols.getMonths());
        this.iShortMonths = realignMonths(dateFormatSymbols.getShortMonths());
        this.iHalfday = dateFormatSymbols.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        this.iParseEras = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        addSymbols(this.iParseEras, this.iEras, numArr);
        if ("en".equals(locale.getLanguage())) {
            this.iParseEras.put("BCE", numArr[0]);
            this.iParseEras.put("CE", numArr[1]);
        }
        this.iParseDaysOfWeek = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        addSymbols(this.iParseDaysOfWeek, this.iDaysOfWeek, numArr);
        addSymbols(this.iParseDaysOfWeek, this.iShortDaysOfWeek, numArr);
        addNumerals(this.iParseDaysOfWeek, 1, 7, numArr);
        this.iParseMonths = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        addSymbols(this.iParseMonths, this.iMonths, numArr);
        addSymbols(this.iParseMonths, this.iShortMonths, numArr);
        addNumerals(this.iParseMonths, 1, 12, numArr);
        this.iMaxEraLength = maxLength(this.iEras);
        this.iMaxDayOfWeekLength = maxLength(this.iDaysOfWeek);
        this.iMaxShortDayOfWeekLength = maxLength(this.iShortDaysOfWeek);
        this.iMaxMonthLength = maxLength(this.iMonths);
        this.iMaxShortMonthLength = maxLength(this.iShortMonths);
        this.iMaxHalfdayLength = maxLength(this.iHalfday);
    }

    private static void addNumerals(TreeMap<String, Integer> treeMap, int i, int i2, Integer[] numArr) {
        while (i <= i2) {
            treeMap.put(String.valueOf(i).intern(), numArr[i]);
            i++;
        }
    }

    private static void addSymbols(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                String str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    static GJLocaleSymbols forLocale(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        GJLocaleSymbols gJLocaleSymbols = (GJLocaleSymbols) cCache.get(locale);
        if (gJLocaleSymbols != null) {
            return gJLocaleSymbols;
        }
        GJLocaleSymbols gJLocaleSymbols2 = new GJLocaleSymbols(locale);
        GJLocaleSymbols gJLocaleSymbols3 = (GJLocaleSymbols) cCache.putIfAbsent(locale, gJLocaleSymbols2);
        return gJLocaleSymbols3 != null ? gJLocaleSymbols3 : gJLocaleSymbols2;
    }

    private static int maxLength(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            String str = strArr[length];
            if (str != null) {
                int length2 = str.length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }
    }

    private static String[] realignDaysOfWeek(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    private static String[] realignMonths(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    public int dayOfWeekTextToValue(String str) {
        Integer num = (Integer) this.iParseDaysOfWeek.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), str);
    }

    public String dayOfWeekValueToShortText(int i) {
        return this.iShortDaysOfWeek[i];
    }

    public String dayOfWeekValueToText(int i) {
        return this.iDaysOfWeek[i];
    }

    public int eraTextToValue(String str) {
        Integer num = (Integer) this.iParseEras.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }

    public String eraValueToText(int i) {
        return this.iEras[i];
    }

    public int getDayOfWeekMaxShortTextLength() {
        return this.iMaxShortDayOfWeekLength;
    }

    public int getDayOfWeekMaxTextLength() {
        return this.iMaxDayOfWeekLength;
    }

    public int getEraMaxTextLength() {
        return this.iMaxEraLength;
    }

    public int getHalfdayMaxTextLength() {
        return this.iMaxHalfdayLength;
    }

    public int getMonthMaxShortTextLength() {
        return this.iMaxShortMonthLength;
    }

    public int getMonthMaxTextLength() {
        return this.iMaxMonthLength;
    }

    public int halfdayTextToValue(String str) {
        String[] strArr = this.iHalfday;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.halfdayOfDay(), str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    public String halfdayValueToText(int i) {
        return this.iHalfday[i];
    }

    public int monthOfYearTextToValue(String str) {
        Integer num = (Integer) this.iParseMonths.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), str);
    }

    public String monthOfYearValueToShortText(int i) {
        return this.iShortMonths[i];
    }

    public String monthOfYearValueToText(int i) {
        return this.iMonths[i];
    }
}
