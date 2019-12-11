package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.field.FieldUtils;

public class PeriodType implements Serializable {
    static int DAY_INDEX = 3;
    static int HOUR_INDEX = 4;
    static int MILLI_INDEX = 7;
    static int MINUTE_INDEX = 5;
    static int MONTH_INDEX = 1;
    static int SECOND_INDEX = 6;
    static int WEEK_INDEX = 2;
    static int YEAR_INDEX = 0;
    private static PeriodType cDTime = null;
    private static PeriodType cDays = null;
    private static PeriodType cHours = null;
    private static PeriodType cMillis = null;
    private static PeriodType cMinutes = null;
    private static PeriodType cMonths = null;
    private static PeriodType cSeconds = null;
    private static PeriodType cStandard = null;
    private static PeriodType cTime = null;
    private static final Map<PeriodType, Object> cTypes = new HashMap(32);
    private static PeriodType cWeeks = null;
    private static PeriodType cYD = null;
    private static PeriodType cYDTime = null;
    private static PeriodType cYMD = null;
    private static PeriodType cYMDTime = null;
    private static PeriodType cYWD = null;
    private static PeriodType cYWDTime = null;
    private static PeriodType cYears = null;
    private static final long serialVersionUID = 2274324892792009998L;
    private final int[] iIndices;
    private final String iName;
    private final DurationFieldType[] iTypes;

    protected PeriodType(String str, DurationFieldType[] durationFieldTypeArr, int[] iArr) {
        this.iName = str;
        this.iTypes = durationFieldTypeArr;
        this.iIndices = iArr;
    }

    public static PeriodType dayTime() {
        PeriodType periodType = cDTime;
        if (periodType != null) {
            return periodType;
        }
        String str = "DayTime";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{-1, -1, -1, 0, 1, 2, 3, 4});
        cDTime = periodType2;
        return periodType2;
    }

    public static PeriodType days() {
        PeriodType periodType = cDays;
        if (periodType != null) {
            return periodType;
        }
        String str = "Days";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.days()}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
        cDays = periodType2;
        return periodType2;
    }

    public static synchronized PeriodType forFields(DurationFieldType[] durationFieldTypeArr) {
        synchronized (PeriodType.class) {
            if (durationFieldTypeArr != null) {
                if (durationFieldTypeArr.length != 0) {
                    int i = 0;
                    while (i < durationFieldTypeArr.length) {
                        if (durationFieldTypeArr[i] != null) {
                            i++;
                        } else {
                            throw new IllegalArgumentException("Types array must not contain null");
                        }
                    }
                    Map<PeriodType, Object> map = cTypes;
                    if (map.isEmpty()) {
                        map.put(standard(), standard());
                        map.put(yearMonthDayTime(), yearMonthDayTime());
                        map.put(yearMonthDay(), yearMonthDay());
                        map.put(yearWeekDayTime(), yearWeekDayTime());
                        map.put(yearWeekDay(), yearWeekDay());
                        map.put(yearDayTime(), yearDayTime());
                        map.put(yearDay(), yearDay());
                        map.put(dayTime(), dayTime());
                        map.put(time(), time());
                        map.put(years(), years());
                        map.put(months(), months());
                        map.put(weeks(), weeks());
                        map.put(days(), days());
                        map.put(hours(), hours());
                        map.put(minutes(), minutes());
                        map.put(seconds(), seconds());
                        map.put(millis(), millis());
                    }
                    PeriodType periodType = new PeriodType(null, durationFieldTypeArr, null);
                    Object obj = map.get(periodType);
                    if (obj instanceof PeriodType) {
                        PeriodType periodType2 = (PeriodType) obj;
                        return periodType2;
                    } else if (obj == null) {
                        PeriodType standard = standard();
                        ArrayList arrayList = new ArrayList(Arrays.asList(durationFieldTypeArr));
                        if (!arrayList.remove(DurationFieldType.years())) {
                            standard = standard.withYearsRemoved();
                        }
                        if (!arrayList.remove(DurationFieldType.months())) {
                            standard = standard.withMonthsRemoved();
                        }
                        if (!arrayList.remove(DurationFieldType.weeks())) {
                            standard = standard.withWeeksRemoved();
                        }
                        if (!arrayList.remove(DurationFieldType.days())) {
                            standard = standard.withDaysRemoved();
                        }
                        if (!arrayList.remove(DurationFieldType.hours())) {
                            standard = standard.withHoursRemoved();
                        }
                        if (!arrayList.remove(DurationFieldType.minutes())) {
                            standard = standard.withMinutesRemoved();
                        }
                        if (!arrayList.remove(DurationFieldType.seconds())) {
                            standard = standard.withSecondsRemoved();
                        }
                        if (!arrayList.remove(DurationFieldType.millis())) {
                            standard = standard.withMillisRemoved();
                        }
                        if (arrayList.size() <= 0) {
                            PeriodType periodType3 = new PeriodType(null, standard.iTypes, null);
                            PeriodType periodType4 = (PeriodType) map.get(periodType3);
                            if (periodType4 != null) {
                                map.put(periodType3, periodType4);
                                return periodType4;
                            }
                            map.put(periodType3, standard);
                            return standard;
                        }
                        map.put(periodType, arrayList);
                        StringBuilder sb = new StringBuilder();
                        sb.append("PeriodType does not support fields: ");
                        sb.append(arrayList);
                        throw new IllegalArgumentException(sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("PeriodType does not support fields: ");
                        sb2.append(obj);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
            throw new IllegalArgumentException("Types array must not be null or empty");
        }
    }

    public static PeriodType hours() {
        PeriodType periodType = cHours;
        if (periodType != null) {
            return periodType;
        }
        String str = "Hours";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.hours()}, new int[]{-1, -1, -1, -1, 0, -1, -1, -1});
        cHours = periodType2;
        return periodType2;
    }

    public static PeriodType millis() {
        PeriodType periodType = cMillis;
        if (periodType != null) {
            return periodType;
        }
        String str = "Millis";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.millis()}, new int[]{-1, -1, -1, -1, -1, -1, -1, 0});
        cMillis = periodType2;
        return periodType2;
    }

    public static PeriodType minutes() {
        PeriodType periodType = cMinutes;
        if (periodType != null) {
            return periodType;
        }
        String str = "Minutes";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.minutes()}, new int[]{-1, -1, -1, -1, -1, 0, -1, -1});
        cMinutes = periodType2;
        return periodType2;
    }

    public static PeriodType months() {
        PeriodType periodType = cMonths;
        if (periodType != null) {
            return periodType;
        }
        String str = "Months";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.months()}, new int[]{-1, 0, -1, -1, -1, -1, -1, -1});
        cMonths = periodType2;
        return periodType2;
    }

    public static PeriodType seconds() {
        PeriodType periodType = cSeconds;
        if (periodType != null) {
            return periodType;
        }
        String str = "Seconds";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.seconds()}, new int[]{-1, -1, -1, -1, -1, -1, 0, -1});
        cSeconds = periodType2;
        return periodType2;
    }

    public static PeriodType standard() {
        PeriodType periodType = cStandard;
        if (periodType != null) {
            return periodType;
        }
        String str = "Standard";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        cStandard = periodType2;
        return periodType2;
    }

    public static PeriodType time() {
        PeriodType periodType = cTime;
        if (periodType != null) {
            return periodType;
        }
        String str = "Time";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{-1, -1, -1, -1, 0, 1, 2, 3});
        cTime = periodType2;
        return periodType2;
    }

    public static PeriodType weeks() {
        PeriodType periodType = cWeeks;
        if (periodType != null) {
            return periodType;
        }
        String str = "Weeks";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.weeks()}, new int[]{-1, -1, 0, -1, -1, -1, -1, -1});
        cWeeks = periodType2;
        return periodType2;
    }

    private PeriodType withFieldRemoved(int i, String str) {
        int i2 = this.iIndices[i];
        if (i2 == -1) {
            return this;
        }
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[(size() - 1)];
        int i3 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr2 = this.iTypes;
            if (i3 >= durationFieldTypeArr2.length) {
                break;
            }
            if (i3 < i2) {
                durationFieldTypeArr[i3] = durationFieldTypeArr2[i3];
            } else if (i3 > i2) {
                durationFieldTypeArr[i3 - 1] = durationFieldTypeArr2[i3];
            }
            i3++;
        }
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (i4 < i) {
                iArr[i4] = this.iIndices[i4];
            } else if (i4 > i) {
                int[] iArr2 = this.iIndices;
                iArr[i4] = iArr2[i4] == -1 ? -1 : iArr2[i4] - 1;
            } else {
                iArr[i4] = -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(str);
        return new PeriodType(sb.toString(), durationFieldTypeArr, iArr);
    }

    public static PeriodType yearDay() {
        PeriodType periodType = cYD;
        if (periodType != null) {
            return periodType;
        }
        String str = "YearDay";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.days()}, new int[]{0, -1, -1, 1, -1, -1, -1, -1});
        cYD = periodType2;
        return periodType2;
    }

    public static PeriodType yearDayTime() {
        PeriodType periodType = cYDTime;
        if (periodType != null) {
            return periodType;
        }
        String str = "YearDayTime";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, -1, -1, 1, 2, 3, 4, 5});
        cYDTime = periodType2;
        return periodType2;
    }

    public static PeriodType yearMonthDay() {
        PeriodType periodType = cYMD;
        if (periodType != null) {
            return periodType;
        }
        String str = "YearMonthDay";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.days()}, new int[]{0, 1, -1, 2, -1, -1, -1, -1});
        cYMD = periodType2;
        return periodType2;
    }

    public static PeriodType yearMonthDayTime() {
        PeriodType periodType = cYMDTime;
        if (periodType != null) {
            return periodType;
        }
        String str = "YearMonthDayTime";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, 1, -1, 2, 3, 4, 5, 6});
        cYMDTime = periodType2;
        return periodType2;
    }

    public static PeriodType yearWeekDay() {
        PeriodType periodType = cYWD;
        if (periodType != null) {
            return periodType;
        }
        String str = "YearWeekDay";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.weeks(), DurationFieldType.days()}, new int[]{0, -1, 1, 2, -1, -1, -1, -1});
        cYWD = periodType2;
        return periodType2;
    }

    public static PeriodType yearWeekDayTime() {
        PeriodType periodType = cYWDTime;
        if (periodType != null) {
            return periodType;
        }
        String str = "YearWeekDayTime";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, -1, 1, 2, 3, 4, 5, 6});
        cYWDTime = periodType2;
        return periodType2;
    }

    public static PeriodType years() {
        PeriodType periodType = cYears;
        if (periodType != null) {
            return periodType;
        }
        String str = "Years";
        PeriodType periodType2 = new PeriodType(str, new DurationFieldType[]{DurationFieldType.years()}, new int[]{0, -1, -1, -1, -1, -1, -1, -1});
        cYears = periodType2;
        return periodType2;
    }

    /* access modifiers changed from: 0000 */
    public boolean addIndexedField(ReadablePeriod readablePeriod, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return false;
        }
        int i3 = this.iIndices[i];
        if (i3 != -1) {
            iArr[i3] = FieldUtils.safeAdd(iArr[i3], i2);
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodType)) {
            return false;
        }
        return Arrays.equals(this.iTypes, ((PeriodType) obj).iTypes);
    }

    public DurationFieldType getFieldType(int i) {
        return this.iTypes[i];
    }

    /* access modifiers changed from: 0000 */
    public int getIndexedField(ReadablePeriod readablePeriod, int i) {
        int i2 = this.iIndices[i];
        if (i2 == -1) {
            return 0;
        }
        return readablePeriod.getValue(i2);
    }

    public String getName() {
        return this.iName;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr = this.iTypes;
            if (i >= durationFieldTypeArr.length) {
                return i2;
            }
            i2 += durationFieldTypeArr[i].hashCode();
            i++;
        }
    }

    public int indexOf(DurationFieldType durationFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.iTypes[i] == durationFieldType) {
                return i;
            }
        }
        return -1;
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return indexOf(durationFieldType) >= 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean setIndexedField(ReadablePeriod readablePeriod, int i, int[] iArr, int i2) {
        int i3 = this.iIndices[i];
        if (i3 != -1) {
            iArr[i3] = i2;
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }

    public int size() {
        return this.iTypes.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PeriodType[");
        sb.append(getName());
        sb.append("]");
        return sb.toString();
    }

    public PeriodType withDaysRemoved() {
        return withFieldRemoved(3, "NoDays");
    }

    public PeriodType withHoursRemoved() {
        return withFieldRemoved(4, "NoHours");
    }

    public PeriodType withMillisRemoved() {
        return withFieldRemoved(7, "NoMillis");
    }

    public PeriodType withMinutesRemoved() {
        return withFieldRemoved(5, "NoMinutes");
    }

    public PeriodType withMonthsRemoved() {
        return withFieldRemoved(1, "NoMonths");
    }

    public PeriodType withSecondsRemoved() {
        return withFieldRemoved(6, "NoSeconds");
    }

    public PeriodType withWeeksRemoved() {
        return withFieldRemoved(2, "NoWeeks");
    }

    public PeriodType withYearsRemoved() {
        return withFieldRemoved(0, "NoYears");
    }
}
