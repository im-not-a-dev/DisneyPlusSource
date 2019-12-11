package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

public class DateTimeParserBucket {
    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    /* access modifiers changed from: private */
    public Integer iOffset;
    private Integer iPivotYear;
    /* access modifiers changed from: private */
    public SavedField[] iSavedFields;
    /* access modifiers changed from: private */
    public int iSavedFieldsCount;
    /* access modifiers changed from: private */
    public boolean iSavedFieldsShared;
    private Object iSavedState;
    /* access modifiers changed from: private */
    public DateTimeZone iZone;

    static class SavedField implements Comparable<SavedField> {
        DateTimeField iField;
        Locale iLocale;
        String iText;
        int iValue;

        SavedField() {
        }

        /* access modifiers changed from: 0000 */
        public void init(DateTimeField dateTimeField, int i) {
            this.iField = dateTimeField;
            this.iValue = i;
            this.iText = null;
            this.iLocale = null;
        }

        /* access modifiers changed from: 0000 */
        public long set(long j, boolean z) {
            long j2;
            String str = this.iText;
            if (str == null) {
                j2 = this.iField.setExtended(j, this.iValue);
            } else {
                j2 = this.iField.set(j, str, this.iLocale);
            }
            return z ? this.iField.roundFloor(j2) : j2;
        }

        public int compareTo(SavedField savedField) {
            DateTimeField dateTimeField = savedField.iField;
            int compareReverse = DateTimeParserBucket.compareReverse(this.iField.getRangeDurationField(), dateTimeField.getRangeDurationField());
            if (compareReverse != 0) {
                return compareReverse;
            }
            return DateTimeParserBucket.compareReverse(this.iField.getDurationField(), dateTimeField.getDurationField());
        }

        /* access modifiers changed from: 0000 */
        public void init(DateTimeField dateTimeField, String str, Locale locale) {
            this.iField = dateTimeField;
            this.iValue = 0;
            this.iText = str;
            this.iLocale = locale;
        }
    }

    class SavedState {
        final Integer iOffset;
        final SavedField[] iSavedFields;
        final int iSavedFieldsCount;
        final DateTimeZone iZone;

        SavedState() {
            this.iZone = DateTimeParserBucket.this.iZone;
            this.iOffset = DateTimeParserBucket.this.iOffset;
            this.iSavedFields = DateTimeParserBucket.this.iSavedFields;
            this.iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }

        /* access modifiers changed from: 0000 */
        public boolean restoreState(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket != DateTimeParserBucket.this) {
                return false;
            }
            dateTimeParserBucket.iZone = this.iZone;
            dateTimeParserBucket.iOffset = this.iOffset;
            dateTimeParserBucket.iSavedFields = this.iSavedFields;
            if (this.iSavedFieldsCount < dateTimeParserBucket.iSavedFieldsCount) {
                dateTimeParserBucket.iSavedFieldsShared = true;
            }
            dateTimeParserBucket.iSavedFieldsCount = this.iSavedFieldsCount;
            return true;
        }
    }

    @Deprecated
    public DateTimeParserBucket(long j, Chronology chronology, Locale locale) {
        this(j, chronology, locale, null, 2000);
    }

    static int compareReverse(DurationField durationField, DurationField durationField2) {
        if (durationField == null || !durationField.isSupported()) {
            return (durationField2 == null || !durationField2.isSupported()) ? 0 : -1;
        }
        if (durationField2 == null || !durationField2.isSupported()) {
            return 1;
        }
        return -durationField.compareTo(durationField2);
    }

    private SavedField obtainSaveField() {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i = this.iSavedFieldsCount;
        if (i == savedFieldArr.length || this.iSavedFieldsShared) {
            SavedField[] savedFieldArr2 = new SavedField[(i == savedFieldArr.length ? i * 2 : savedFieldArr.length)];
            System.arraycopy(savedFieldArr, 0, savedFieldArr2, 0, i);
            this.iSavedFields = savedFieldArr2;
            this.iSavedFieldsShared = false;
            savedFieldArr = savedFieldArr2;
        }
        this.iSavedState = null;
        SavedField savedField = savedFieldArr[i];
        if (savedField == null) {
            savedField = new SavedField();
            savedFieldArr[i] = savedField;
        }
        this.iSavedFieldsCount = i + 1;
        return savedField;
    }

    private static void sort(SavedField[] savedFieldArr, int i) {
        if (i > 10) {
            Arrays.sort(savedFieldArr, 0, i);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = i2; i3 > 0; i3--) {
                int i4 = i3 - 1;
                if (savedFieldArr[i4].compareTo(savedFieldArr[i3]) <= 0) {
                    break;
                }
                SavedField savedField = savedFieldArr[i3];
                savedFieldArr[i3] = savedFieldArr[i4];
                savedFieldArr[i4] = savedField;
            }
        }
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }

    /* access modifiers changed from: 0000 */
    public long doParseMillis(InternalParser internalParser, CharSequence charSequence) {
        int parseInto = internalParser.parseInto(this, charSequence, 0);
        if (parseInto < 0) {
            parseInto = ~parseInto;
        } else if (parseInto >= charSequence.length()) {
            return computeMillis(true, charSequence);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(charSequence.toString(), parseInto));
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.iOffset;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Integer getOffsetInteger() {
        return this.iOffset;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return doParseMillis(DateTimeParserInternalParser.m45847of(dateTimeParser), charSequence);
    }

    public void reset() {
        this.iZone = this.iDefaultZone;
        this.iOffset = null;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFieldsCount = 0;
        this.iSavedFieldsShared = false;
        this.iSavedState = null;
    }

    public boolean restoreState(Object obj) {
        if (!(obj instanceof SavedState) || !((SavedState) obj).restoreState(this)) {
            return false;
        }
        this.iSavedState = obj;
        return true;
    }

    public void saveField(DateTimeField dateTimeField, int i) {
        obtainSaveField().init(dateTimeField, i);
    }

    public Object saveState() {
        if (this.iSavedState == null) {
            this.iSavedState = new SavedState();
        }
        return this.iSavedState;
    }

    @Deprecated
    public void setOffset(int i) {
        this.iSavedState = null;
        this.iOffset = Integer.valueOf(i);
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.iPivotYear = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.iSavedState = null;
        this.iZone = dateTimeZone;
    }

    @Deprecated
    public DateTimeParserBucket(long j, Chronology chronology, Locale locale, Integer num) {
        this(j, chronology, locale, num, 2000);
    }

    public long computeMillis(boolean z) {
        return computeMillis(z, (CharSequence) null);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), i);
    }

    public DateTimeParserBucket(long j, Chronology chronology, Locale locale, Integer num, int i) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iMillis = j;
        this.iDefaultZone = chronology2.getZone();
        this.iChrono = chronology2.withUTC();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        this.iLocale = locale;
        this.iDefaultYear = i;
        this.iDefaultPivotYear = num;
        this.iZone = this.iDefaultZone;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFields = new SavedField[8];
    }

    public long computeMillis(boolean z, String str) {
        return computeMillis(z, (CharSequence) str);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), str, locale);
    }

    public void setOffset(Integer num) {
        this.iSavedState = null;
        this.iOffset = num;
    }

    public long computeMillis(boolean z, CharSequence charSequence) {
        String str;
        SavedField[] savedFieldArr = this.iSavedFields;
        int i = this.iSavedFieldsCount;
        if (this.iSavedFieldsShared) {
            savedFieldArr = (SavedField[]) savedFieldArr.clone();
            this.iSavedFields = savedFieldArr;
            this.iSavedFieldsShared = false;
        }
        sort(savedFieldArr, i);
        if (i > 0) {
            DurationField field = DurationFieldType.months().getField(this.iChrono);
            DurationField field2 = DurationFieldType.days().getField(this.iChrono);
            DurationField durationField = savedFieldArr[0].iField.getDurationField();
            if (compareReverse(durationField, field) >= 0 && compareReverse(durationField, field2) <= 0) {
                saveField(DateTimeFieldType.year(), this.iDefaultYear);
                return computeMillis(z, charSequence);
            }
        }
        long j = this.iMillis;
        int i2 = 0;
        while (true) {
            str = "Cannot parse \"";
            if (i2 >= i) {
                break;
            }
            try {
                j = savedFieldArr[i2].set(j, z);
                i2++;
            } catch (IllegalFieldValueException e) {
                if (charSequence != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(charSequence);
                    sb.append('\"');
                    e.prependMessage(sb.toString());
                }
                throw e;
            }
        }
        if (z) {
            int i3 = 0;
            while (i3 < i) {
                if (!savedFieldArr[i3].iField.isLenient()) {
                    j = savedFieldArr[i3].set(j, i3 == i + -1);
                }
                i3++;
            }
        }
        Integer num = this.iOffset;
        if (num != null) {
            j -= (long) num.intValue();
        } else {
            DateTimeZone dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j);
                j -= (long) offsetFromLocal;
                if (offsetFromLocal != this.iZone.getOffset(j)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Illegal instant due to time zone offset transition (");
                    sb2.append(this.iZone);
                    sb2.append(')');
                    String sb3 = sb2.toString();
                    if (charSequence != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(charSequence);
                        sb4.append("\": ");
                        sb4.append(sb3);
                        sb3 = sb4.toString();
                    }
                    throw new IllegalInstantException(sb3);
                }
            }
        }
        return j;
    }
}
