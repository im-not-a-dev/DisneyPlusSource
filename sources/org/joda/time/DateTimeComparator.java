package org.joda.time;

import java.io.Serializable;
import java.util.Comparator;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

public class DateTimeComparator implements Comparator<Object>, Serializable {
    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator(null, null);
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), null);
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator(null, DateTimeFieldType.dayOfYear());
    private static final long serialVersionUID = -6097339773320178364L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    protected DateTimeComparator(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        this.iLowerLimit = dateTimeFieldType;
        this.iUpperLimit = dateTimeFieldType2;
    }

    public static DateTimeComparator getDateOnlyInstance() {
        return DATE_INSTANCE;
    }

    public static DateTimeComparator getInstance() {
        return ALL_INSTANCE;
    }

    public static DateTimeComparator getTimeOnlyInstance() {
        return TIME_INSTANCE;
    }

    private Object readResolve() {
        return getInstance(this.iLowerLimit, this.iUpperLimit);
    }

    public int compare(Object obj, Object obj2) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        Chronology chronology = instantConverter.getChronology(obj, (Chronology) null);
        long instantMillis = instantConverter.getInstantMillis(obj, chronology);
        if (obj == obj2) {
            return 0;
        }
        InstantConverter instantConverter2 = ConverterManager.getInstance().getInstantConverter(obj2);
        Chronology chronology2 = instantConverter2.getChronology(obj2, (Chronology) null);
        long instantMillis2 = instantConverter2.getInstantMillis(obj2, chronology2);
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        if (dateTimeFieldType != null) {
            instantMillis = dateTimeFieldType.getField(chronology).roundFloor(instantMillis);
            instantMillis2 = this.iLowerLimit.getField(chronology2).roundFloor(instantMillis2);
        }
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            instantMillis = dateTimeFieldType2.getField(chronology).remainder(instantMillis);
            instantMillis2 = this.iUpperLimit.getField(chronology2).remainder(instantMillis2);
        }
        int i = (instantMillis > instantMillis2 ? 1 : (instantMillis == instantMillis2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DateTimeComparator)) {
            return false;
        }
        DateTimeComparator dateTimeComparator = (DateTimeComparator) obj;
        if (this.iLowerLimit != dateTimeComparator.getLowerLimit()) {
            DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
            if (dateTimeFieldType == null || !dateTimeFieldType.equals(dateTimeComparator.getLowerLimit())) {
                return false;
            }
        }
        if (this.iUpperLimit != dateTimeComparator.getUpperLimit()) {
            DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
            if (dateTimeFieldType2 == null || !dateTimeFieldType2.equals(dateTimeComparator.getUpperLimit())) {
                return false;
            }
        }
        return true;
    }

    public DateTimeFieldType getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTimeFieldType getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        int i = 0;
        int hashCode = dateTimeFieldType == null ? 0 : dateTimeFieldType.hashCode();
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            i = dateTimeFieldType2.hashCode();
        }
        return hashCode + (i * 123);
    }

    public String toString() {
        String str;
        String str2 = "]";
        String str3 = "DateTimeComparator[";
        String str4 = "";
        if (this.iLowerLimit == this.iUpperLimit) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
            if (dateTimeFieldType != null) {
                str4 = dateTimeFieldType.getName();
            }
            sb.append(str4);
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        DateTimeFieldType dateTimeFieldType2 = this.iLowerLimit;
        if (dateTimeFieldType2 == null) {
            str = str4;
        } else {
            str = dateTimeFieldType2.getName();
        }
        sb2.append(str);
        sb2.append("-");
        DateTimeFieldType dateTimeFieldType3 = this.iUpperLimit;
        if (dateTimeFieldType3 != null) {
            str4 = dateTimeFieldType3.getName();
        }
        sb2.append(str4);
        sb2.append(str2);
        return sb2.toString();
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType) {
        return getInstance(dateTimeFieldType, null);
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        if (dateTimeFieldType == null && dateTimeFieldType2 == null) {
            return ALL_INSTANCE;
        }
        if (dateTimeFieldType == DateTimeFieldType.dayOfYear() && dateTimeFieldType2 == null) {
            return DATE_INSTANCE;
        }
        if (dateTimeFieldType == null && dateTimeFieldType2 == DateTimeFieldType.dayOfYear()) {
            return TIME_INSTANCE;
        }
        return new DateTimeComparator(dateTimeFieldType, dateTimeFieldType2);
    }
}
