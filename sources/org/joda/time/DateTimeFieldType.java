package org.joda.time;

import java.io.Serializable;

public abstract class DateTimeFieldType implements Serializable {
    static final byte CENTURY_OF_ERA = 3;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType CENTURY_OF_ERA_TYPE = new StandardDateTimeFieldType("centuryOfEra", CENTURY_OF_ERA, DurationFieldType.centuries(), DurationFieldType.eras());
    static final byte CLOCKHOUR_OF_DAY = 16;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType CLOCKHOUR_OF_DAY_TYPE = new StandardDateTimeFieldType("clockhourOfDay", CLOCKHOUR_OF_DAY, DurationFieldType.hours(), DurationFieldType.days());
    static final byte CLOCKHOUR_OF_HALFDAY = 15;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType CLOCKHOUR_OF_HALFDAY_TYPE = new StandardDateTimeFieldType("clockhourOfHalfday", CLOCKHOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays());
    static final byte DAY_OF_MONTH = 8;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType DAY_OF_MONTH_TYPE = new StandardDateTimeFieldType("dayOfMonth", 8, DurationFieldType.days(), DurationFieldType.months());
    static final byte DAY_OF_WEEK = 12;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType DAY_OF_WEEK_TYPE = new StandardDateTimeFieldType("dayOfWeek", DAY_OF_WEEK, DurationFieldType.days(), DurationFieldType.weeks());
    static final byte DAY_OF_YEAR = 6;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType DAY_OF_YEAR_TYPE = new StandardDateTimeFieldType("dayOfYear", DAY_OF_YEAR, DurationFieldType.days(), DurationFieldType.years());
    static final byte ERA = 1;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType ERA_TYPE = new StandardDateTimeFieldType("era", 1, DurationFieldType.eras(), null);
    static final byte HALFDAY_OF_DAY = 13;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType HALFDAY_OF_DAY_TYPE = new StandardDateTimeFieldType("halfdayOfDay", HALFDAY_OF_DAY, DurationFieldType.halfdays(), DurationFieldType.days());
    static final byte HOUR_OF_DAY = 17;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType HOUR_OF_DAY_TYPE = new StandardDateTimeFieldType("hourOfDay", HOUR_OF_DAY, DurationFieldType.hours(), DurationFieldType.days());
    static final byte HOUR_OF_HALFDAY = 14;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType HOUR_OF_HALFDAY_TYPE = new StandardDateTimeFieldType("hourOfHalfday", HOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays());
    static final byte MILLIS_OF_DAY = 22;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType MILLIS_OF_DAY_TYPE = new StandardDateTimeFieldType("millisOfDay", MILLIS_OF_DAY, DurationFieldType.millis(), DurationFieldType.days());
    static final byte MILLIS_OF_SECOND = 23;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType MILLIS_OF_SECOND_TYPE = new StandardDateTimeFieldType("millisOfSecond", MILLIS_OF_SECOND, DurationFieldType.millis(), DurationFieldType.seconds());
    static final byte MINUTE_OF_DAY = 18;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType MINUTE_OF_DAY_TYPE = new StandardDateTimeFieldType("minuteOfDay", MINUTE_OF_DAY, DurationFieldType.minutes(), DurationFieldType.days());
    static final byte MINUTE_OF_HOUR = 19;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType MINUTE_OF_HOUR_TYPE = new StandardDateTimeFieldType("minuteOfHour", MINUTE_OF_HOUR, DurationFieldType.minutes(), DurationFieldType.hours());
    static final byte MONTH_OF_YEAR = 7;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType MONTH_OF_YEAR_TYPE = new StandardDateTimeFieldType("monthOfYear", MONTH_OF_YEAR, DurationFieldType.months(), DurationFieldType.years());
    static final byte SECOND_OF_DAY = 20;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType SECOND_OF_DAY_TYPE = new StandardDateTimeFieldType("secondOfDay", SECOND_OF_DAY, DurationFieldType.seconds(), DurationFieldType.days());
    static final byte SECOND_OF_MINUTE = 21;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType SECOND_OF_MINUTE_TYPE = new StandardDateTimeFieldType("secondOfMinute", SECOND_OF_MINUTE, DurationFieldType.seconds(), DurationFieldType.minutes());
    static final byte WEEKYEAR = 10;
    static final byte WEEKYEAR_OF_CENTURY = 9;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType WEEKYEAR_OF_CENTURY_TYPE = new StandardDateTimeFieldType("weekyearOfCentury", 9, DurationFieldType.weekyears(), DurationFieldType.centuries());
    /* access modifiers changed from: private */
    public static final DateTimeFieldType WEEKYEAR_TYPE = new StandardDateTimeFieldType("weekyear", 10, DurationFieldType.weekyears(), null);
    static final byte WEEK_OF_WEEKYEAR = 11;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType WEEK_OF_WEEKYEAR_TYPE = new StandardDateTimeFieldType("weekOfWeekyear", WEEK_OF_WEEKYEAR, DurationFieldType.weeks(), DurationFieldType.weekyears());
    static final byte YEAR = 5;
    static final byte YEAR_OF_CENTURY = 4;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType YEAR_OF_CENTURY_TYPE = new StandardDateTimeFieldType("yearOfCentury", YEAR_OF_CENTURY, DurationFieldType.years(), DurationFieldType.centuries());
    static final byte YEAR_OF_ERA = 2;
    /* access modifiers changed from: private */
    public static final DateTimeFieldType YEAR_OF_ERA_TYPE = new StandardDateTimeFieldType("yearOfEra", 2, DurationFieldType.years(), DurationFieldType.eras());
    /* access modifiers changed from: private */
    public static final DateTimeFieldType YEAR_TYPE = new StandardDateTimeFieldType("year", YEAR, DurationFieldType.years(), null);
    private static final long serialVersionUID = -42615285973990L;
    private final String iName;

    private static class StandardDateTimeFieldType extends DateTimeFieldType {
        private static final long serialVersionUID = -9937958251642L;
        private final byte iOrdinal;
        private final transient DurationFieldType iRangeType;
        private final transient DurationFieldType iUnitType;

        StandardDateTimeFieldType(String str, byte b, DurationFieldType durationFieldType, DurationFieldType durationFieldType2) {
            super(str);
            this.iOrdinal = b;
            this.iUnitType = durationFieldType;
            this.iRangeType = durationFieldType2;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DateTimeFieldType.ERA_TYPE;
                case 2:
                    return DateTimeFieldType.YEAR_OF_ERA_TYPE;
                case 3:
                    return DateTimeFieldType.CENTURY_OF_ERA_TYPE;
                case 4:
                    return DateTimeFieldType.YEAR_OF_CENTURY_TYPE;
                case 5:
                    return DateTimeFieldType.YEAR_TYPE;
                case 6:
                    return DateTimeFieldType.DAY_OF_YEAR_TYPE;
                case 7:
                    return DateTimeFieldType.MONTH_OF_YEAR_TYPE;
                case 8:
                    return DateTimeFieldType.DAY_OF_MONTH_TYPE;
                case 9:
                    return DateTimeFieldType.WEEKYEAR_OF_CENTURY_TYPE;
                case 10:
                    return DateTimeFieldType.WEEKYEAR_TYPE;
                case 11:
                    return DateTimeFieldType.WEEK_OF_WEEKYEAR_TYPE;
                case 12:
                    return DateTimeFieldType.DAY_OF_WEEK_TYPE;
                case 13:
                    return DateTimeFieldType.HALFDAY_OF_DAY_TYPE;
                case 14:
                    return DateTimeFieldType.HOUR_OF_HALFDAY_TYPE;
                case 15:
                    return DateTimeFieldType.CLOCKHOUR_OF_HALFDAY_TYPE;
                case 16:
                    return DateTimeFieldType.CLOCKHOUR_OF_DAY_TYPE;
                case 17:
                    return DateTimeFieldType.HOUR_OF_DAY_TYPE;
                case 18:
                    return DateTimeFieldType.MINUTE_OF_DAY_TYPE;
                case 19:
                    return DateTimeFieldType.MINUTE_OF_HOUR_TYPE;
                case 20:
                    return DateTimeFieldType.SECOND_OF_DAY_TYPE;
                case 21:
                    return DateTimeFieldType.SECOND_OF_MINUTE_TYPE;
                case 22:
                    return DateTimeFieldType.MILLIS_OF_DAY_TYPE;
                case 23:
                    return DateTimeFieldType.MILLIS_OF_SECOND_TYPE;
                default:
                    return this;
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardDateTimeFieldType)) {
                return false;
            }
            if (this.iOrdinal != ((StandardDateTimeFieldType) obj).iOrdinal) {
                z = false;
            }
            return z;
        }

        public DurationFieldType getDurationType() {
            return this.iUnitType;
        }

        public DateTimeField getField(Chronology chronology) {
            Chronology chronology2 = DateTimeUtils.getChronology(chronology);
            switch (this.iOrdinal) {
                case 1:
                    return chronology2.era();
                case 2:
                    return chronology2.yearOfEra();
                case 3:
                    return chronology2.centuryOfEra();
                case 4:
                    return chronology2.yearOfCentury();
                case 5:
                    return chronology2.year();
                case 6:
                    return chronology2.dayOfYear();
                case 7:
                    return chronology2.monthOfYear();
                case 8:
                    return chronology2.dayOfMonth();
                case 9:
                    return chronology2.weekyearOfCentury();
                case 10:
                    return chronology2.weekyear();
                case 11:
                    return chronology2.weekOfWeekyear();
                case 12:
                    return chronology2.dayOfWeek();
                case 13:
                    return chronology2.halfdayOfDay();
                case 14:
                    return chronology2.hourOfHalfday();
                case 15:
                    return chronology2.clockhourOfHalfday();
                case 16:
                    return chronology2.clockhourOfDay();
                case 17:
                    return chronology2.hourOfDay();
                case 18:
                    return chronology2.minuteOfDay();
                case 19:
                    return chronology2.minuteOfHour();
                case 20:
                    return chronology2.secondOfDay();
                case 21:
                    return chronology2.secondOfMinute();
                case 22:
                    return chronology2.millisOfDay();
                case 23:
                    return chronology2.millisOfSecond();
                default:
                    throw new InternalError();
            }
        }

        public DurationFieldType getRangeDurationType() {
            return this.iRangeType;
        }

        public int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    protected DateTimeFieldType(String str) {
        this.iName = str;
    }

    public static DateTimeFieldType centuryOfEra() {
        return CENTURY_OF_ERA_TYPE;
    }

    public static DateTimeFieldType clockhourOfDay() {
        return CLOCKHOUR_OF_DAY_TYPE;
    }

    public static DateTimeFieldType clockhourOfHalfday() {
        return CLOCKHOUR_OF_HALFDAY_TYPE;
    }

    public static DateTimeFieldType dayOfMonth() {
        return DAY_OF_MONTH_TYPE;
    }

    public static DateTimeFieldType dayOfWeek() {
        return DAY_OF_WEEK_TYPE;
    }

    public static DateTimeFieldType dayOfYear() {
        return DAY_OF_YEAR_TYPE;
    }

    public static DateTimeFieldType era() {
        return ERA_TYPE;
    }

    public static DateTimeFieldType halfdayOfDay() {
        return HALFDAY_OF_DAY_TYPE;
    }

    public static DateTimeFieldType hourOfDay() {
        return HOUR_OF_DAY_TYPE;
    }

    public static DateTimeFieldType hourOfHalfday() {
        return HOUR_OF_HALFDAY_TYPE;
    }

    public static DateTimeFieldType millisOfDay() {
        return MILLIS_OF_DAY_TYPE;
    }

    public static DateTimeFieldType millisOfSecond() {
        return MILLIS_OF_SECOND_TYPE;
    }

    public static DateTimeFieldType minuteOfDay() {
        return MINUTE_OF_DAY_TYPE;
    }

    public static DateTimeFieldType minuteOfHour() {
        return MINUTE_OF_HOUR_TYPE;
    }

    public static DateTimeFieldType monthOfYear() {
        return MONTH_OF_YEAR_TYPE;
    }

    public static DateTimeFieldType secondOfDay() {
        return SECOND_OF_DAY_TYPE;
    }

    public static DateTimeFieldType secondOfMinute() {
        return SECOND_OF_MINUTE_TYPE;
    }

    public static DateTimeFieldType weekOfWeekyear() {
        return WEEK_OF_WEEKYEAR_TYPE;
    }

    public static DateTimeFieldType weekyear() {
        return WEEKYEAR_TYPE;
    }

    public static DateTimeFieldType weekyearOfCentury() {
        return WEEKYEAR_OF_CENTURY_TYPE;
    }

    public static DateTimeFieldType year() {
        return YEAR_TYPE;
    }

    public static DateTimeFieldType yearOfCentury() {
        return YEAR_OF_CENTURY_TYPE;
    }

    public static DateTimeFieldType yearOfEra() {
        return YEAR_OF_ERA_TYPE;
    }

    public abstract DurationFieldType getDurationType();

    public abstract DateTimeField getField(Chronology chronology);

    public String getName() {
        return this.iName;
    }

    public abstract DurationFieldType getRangeDurationType();

    public boolean isSupported(Chronology chronology) {
        return getField(chronology).isSupported();
    }

    public String toString() {
        return getName();
    }
}
