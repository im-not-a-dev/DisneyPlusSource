package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public final class Partial extends AbstractPartial implements ReadablePartial, Serializable {
    private static final long serialVersionUID = 12324121189002L;
    private final Chronology iChronology;
    private transient DateTimeFormatter[] iFormatter;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        Property(Partial partial, int i) {
            this.iPartial = partial;
            this.iFieldIndex = i;
        }

        public Partial addToCopy(int i) {
            return new Partial(this.iPartial, getField().add(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public Partial addWrapFieldToCopy(int i) {
            return new Partial(this.iPartial, getField().addWrapField(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public int get() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        public DateTimeField getField() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        public Partial getPartial() {
            return this.iPartial;
        }

        /* access modifiers changed from: protected */
        public ReadablePartial getReadablePartial() {
            return this.iPartial;
        }

        public Partial setCopy(int i) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public Partial withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public Partial setCopy(String str, Locale locale) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), str, locale));
        }

        public Partial setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public Partial() {
        this((Chronology) null);
    }

    public Chronology getChronology() {
        return this.iChronology;
    }

    /* access modifiers changed from: protected */
    public DateTimeField getField(int i, Chronology chronology) {
        return this.iTypes[i].getField(chronology);
    }

    public DateTimeFieldType getFieldType(int i) {
        return this.iTypes[i];
    }

    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public DateTimeFormatter getFormatter() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        if (dateTimeFormatterArr == null) {
            if (size() == 0) {
                return null;
            }
            dateTimeFormatterArr = new DateTimeFormatter[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                dateTimeFormatterArr[0] = ISODateTimeFormat.forFields(arrayList, true, false);
                if (arrayList.size() == 0) {
                    dateTimeFormatterArr[1] = dateTimeFormatterArr[0];
                }
            } catch (IllegalArgumentException unused) {
            }
            this.iFormatter = dateTimeFormatterArr;
        }
        return dateTimeFormatterArr[0];
    }

    public int getValue(int i) {
        return this.iValues[i];
    }

    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public boolean isMatch(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        int i = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i].getField(instantChronology).get(instantMillis) != this.iValues[i]) {
                return false;
            }
            i++;
        }
    }

    public Partial minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public Partial plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public int size() {
        return this.iTypes.length;
    }

    public String toString() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        if (dateTimeFormatterArr == null) {
            getFormatter();
            dateTimeFormatterArr = this.iFormatter;
            if (dateTimeFormatterArr == null) {
                return toStringList();
            }
        }
        DateTimeFormatter dateTimeFormatter = dateTimeFormatterArr[1];
        if (dateTimeFormatter == null) {
            return toStringList();
        }
        return dateTimeFormatter.print((ReadablePartial) this);
    }

    public String toStringList() {
        int size = size();
        StringBuilder sb = new StringBuilder(size * 20);
        sb.append('[');
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(',');
                sb.append(' ');
            }
            sb.append(this.iTypes[i].getName());
            sb.append('=');
            sb.append(this.iValues[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Partial with(DateTimeFieldType dateTimeFieldType, int i) {
        int i2;
        if (dateTimeFieldType != null) {
            int indexOf = indexOf(dateTimeFieldType);
            if (indexOf == -1) {
                DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[(this.iTypes.length + 1)];
                int[] iArr = new int[dateTimeFieldTypeArr.length];
                DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
                if (field.isSupported()) {
                    i2 = 0;
                    while (true) {
                        DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                        if (i2 >= dateTimeFieldTypeArr2.length) {
                            break;
                        }
                        DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i2];
                        DurationField field2 = dateTimeFieldType2.getDurationType().getField(this.iChronology);
                        if (field2.isSupported()) {
                            int compareTo = field.compareTo(field2);
                            if (compareTo <= 0) {
                                if (compareTo == 0) {
                                    if (dateTimeFieldType.getRangeDurationType() != null) {
                                        if (dateTimeFieldType2.getRangeDurationType() != null && dateTimeFieldType.getRangeDurationType().getField(this.iChronology).compareTo(dateTimeFieldType2.getRangeDurationType().getField(this.iChronology)) > 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else {
                    i2 = 0;
                }
                System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i2);
                System.arraycopy(this.iValues, 0, iArr, 0, i2);
                dateTimeFieldTypeArr[i2] = dateTimeFieldType;
                iArr[i2] = i;
                int i3 = i2 + 1;
                System.arraycopy(this.iTypes, i2, dateTimeFieldTypeArr, i3, (dateTimeFieldTypeArr.length - i2) - 1);
                System.arraycopy(this.iValues, i2, iArr, i3, (iArr.length - i2) - 1);
                Partial partial = new Partial(dateTimeFieldTypeArr, iArr, this.iChronology);
                this.iChronology.validate(partial, iArr);
                return partial;
            } else if (i == getValue(indexOf)) {
                return this;
            } else {
                return new Partial(this, getField(indexOf).set(this, indexOf, getValues(), i));
            }
        } else {
            throw new IllegalArgumentException("The field type must not be null");
        }
    }

    public Partial withChronologyRetainFields(Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        Partial partial = new Partial(withUTC, this.iTypes, this.iValues);
        withUTC.validate(partial, this.iValues);
        return partial;
    }

    public Partial withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public Partial withFieldAddWrapped(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).addWrapPartial(this, indexOfSupported, getValues(), i));
    }

    public Partial withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public Partial withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < readablePeriod.size(); i2++) {
            int indexOf = indexOf(readablePeriod.getFieldType(i2));
            if (indexOf >= 0) {
                values = getField(indexOf).add(this, indexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i2), i));
            }
        }
        return new Partial(this, values);
    }

    public Partial without(DateTimeFieldType dateTimeFieldType) {
        int indexOf = indexOf(dateTimeFieldType);
        if (indexOf == -1) {
            return this;
        }
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[(size() - 1)];
        int[] iArr = new int[(size() - 1)];
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, indexOf);
        int i = indexOf + 1;
        System.arraycopy(this.iTypes, i, dateTimeFieldTypeArr, indexOf, dateTimeFieldTypeArr.length - indexOf);
        System.arraycopy(this.iValues, 0, iArr, 0, indexOf);
        System.arraycopy(this.iValues, i, iArr, indexOf, iArr.length - indexOf);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.validate(partial, iArr);
        return partial;
    }

    public Partial(Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology).withUTC();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i) {
        this(dateTimeFieldType, i, (Chronology) null);
    }

    public boolean isMatch(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            int i = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
                if (i >= dateTimeFieldTypeArr.length) {
                    return true;
                }
                if (readablePartial.get(dateTimeFieldTypeArr[i]) != this.iValues[i]) {
                    return false;
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException("The partial must not be null");
        }
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = withUTC;
        if (dateTimeFieldType != null) {
            this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
            this.iValues = new int[]{i};
            withUTC.validate(this, this.iValues);
            return;
        }
        throw new IllegalArgumentException("The field type must not be null");
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print((ReadablePartial) this);
    }

    public String toString(String str, Locale locale) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print((ReadablePartial) this);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (Chronology) null);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = withUTC;
        if (dateTimeFieldTypeArr == null) {
            throw new IllegalArgumentException("Types array must not be null");
        } else if (iArr == null) {
            throw new IllegalArgumentException("Values array must not be null");
        } else if (iArr.length != dateTimeFieldTypeArr.length) {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        } else if (dateTimeFieldTypeArr.length == 0) {
            this.iTypes = dateTimeFieldTypeArr;
            this.iValues = iArr;
        } else {
            int i = 0;
            int i2 = 0;
            while (i2 < dateTimeFieldTypeArr.length) {
                if (dateTimeFieldTypeArr[i2] != null) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Types array must not contain null: index ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            DurationField durationField = null;
            while (i < dateTimeFieldTypeArr.length) {
                DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i];
                DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
                if (i > 0) {
                    String str = " and ";
                    String str2 = "Types array must be in order largest-smallest: ";
                    String str3 = " < ";
                    if (field.isSupported()) {
                        int compareTo = durationField.compareTo(field);
                        if (compareTo < 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(dateTimeFieldTypeArr[i - 1].getName());
                            sb2.append(str3);
                            sb2.append(dateTimeFieldType.getName());
                            throw new IllegalArgumentException(sb2.toString());
                        } else if (compareTo != 0) {
                            continue;
                        } else if (durationField.equals(field)) {
                            int i3 = i - 1;
                            DurationFieldType rangeDurationType = dateTimeFieldTypeArr[i3].getRangeDurationType();
                            DurationFieldType rangeDurationType2 = dateTimeFieldType.getRangeDurationType();
                            String str4 = "Types array must not contain duplicate: ";
                            if (rangeDurationType == null) {
                                if (rangeDurationType2 == null) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(str4);
                                    sb3.append(dateTimeFieldTypeArr[i3].getName());
                                    sb3.append(str);
                                    sb3.append(dateTimeFieldType.getName());
                                    throw new IllegalArgumentException(sb3.toString());
                                }
                            } else if (rangeDurationType2 != null) {
                                DurationField field2 = rangeDurationType.getField(this.iChronology);
                                DurationField field3 = rangeDurationType2.getField(this.iChronology);
                                if (field2.compareTo(field3) < 0) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(str2);
                                    sb4.append(dateTimeFieldTypeArr[i3].getName());
                                    sb4.append(str3);
                                    sb4.append(dateTimeFieldType.getName());
                                    throw new IllegalArgumentException(sb4.toString());
                                } else if (field2.compareTo(field3) == 0) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(str4);
                                    sb5.append(dateTimeFieldTypeArr[i3].getName());
                                    sb5.append(str);
                                    sb5.append(dateTimeFieldType.getName());
                                    throw new IllegalArgumentException(sb5.toString());
                                }
                            } else {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(str2);
                                sb6.append(dateTimeFieldTypeArr[i3].getName());
                                sb6.append(str3);
                                sb6.append(dateTimeFieldType.getName());
                                throw new IllegalArgumentException(sb6.toString());
                            }
                        } else if (durationField.isSupported() && durationField.getType() != DurationFieldType.YEARS_TYPE) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: ");
                            sb7.append(dateTimeFieldTypeArr[i - 1].getName());
                            sb7.append(str3);
                            sb7.append(dateTimeFieldType.getName());
                            throw new IllegalArgumentException(sb7.toString());
                        }
                    } else if (durationField.isSupported()) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str2);
                        sb8.append(dateTimeFieldTypeArr[i - 1].getName());
                        sb8.append(str3);
                        sb8.append(dateTimeFieldType.getName());
                        throw new IllegalArgumentException(sb8.toString());
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Types array must not contain duplicate unsupported: ");
                        sb9.append(dateTimeFieldTypeArr[i - 1].getName());
                        sb9.append(str);
                        sb9.append(dateTimeFieldType.getName());
                        throw new IllegalArgumentException(sb9.toString());
                    }
                }
                i++;
                durationField = field;
            }
            this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
            withUTC.validate(this, iArr);
            this.iValues = (int[]) iArr.clone();
        }
    }

    public Partial(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            this.iChronology = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
            this.iTypes = new DateTimeFieldType[readablePartial.size()];
            this.iValues = new int[readablePartial.size()];
            for (int i = 0; i < readablePartial.size(); i++) {
                this.iTypes[i] = readablePartial.getFieldType(i);
                this.iValues[i] = readablePartial.getValue(i);
            }
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    Partial(Chronology chronology, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = chronology;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }
}
