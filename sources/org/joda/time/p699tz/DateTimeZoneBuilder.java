package org.joda.time.p699tz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* renamed from: org.joda.time.tz.DateTimeZoneBuilder */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$DSTZone */
    private static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        DSTZone(String str, int i, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j) {
            long j2;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                j2 = recurrence.next(j, i, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                j2 = j;
            }
            try {
                j = recurrence2.next(j, i, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return j2 > j ? recurrence : recurrence2;
        }

        static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            if (!getID().equals(dSTZone.getID()) || this.iStandardOffset != dSTZone.iStandardOffset || !this.iStartRecurrence.equals(dSTZone.iStartRecurrence) || !this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                z = false;
            }
            return z;
        }

        public String getNameKey(long j) {
            return findMatchingRecurrence(j).getNameKey();
        }

        public int getOffset(long j) {
            return this.iStandardOffset + findMatchingRecurrence(j).getSaveMillis();
        }

        public int getStandardOffset(long j) {
            return this.iStandardOffset;
        }

        public boolean isFixed() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r5 < 0) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long nextTransition(long r9) {
            /*
                r8 = this;
                int r0 = r8.iStandardOffset
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r1 = r8.iStartRecurrence
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r2 = r8.iEndRecurrence
                r3 = 0
                int r5 = r2.getSaveMillis()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
                long r5 = r1.next(r9, r0, r5)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
                int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x0019
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x0019
            L_0x0018:
                r5 = r9
            L_0x0019:
                int r1 = r1.getSaveMillis()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002c }
                long r0 = r2.next(r9, r0, r1)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002c }
                int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r2 <= 0) goto L_0x002a
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r2 >= 0) goto L_0x002a
                goto L_0x002d
            L_0x002a:
                r9 = r0
                goto L_0x002d
            L_0x002c:
            L_0x002d:
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x0032
                goto L_0x0033
            L_0x0032:
                r9 = r5
            L_0x0033:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p699tz.DateTimeZoneBuilder.DSTZone.nextTransition(long):long");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r7 > 0) goto L_0x001b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long previousTransition(long r11) {
            /*
                r10 = this;
                r0 = 1
                long r11 = r11 + r0
                int r2 = r10.iStandardOffset
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r3 = r10.iStartRecurrence
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r4 = r10.iEndRecurrence
                r5 = 0
                int r7 = r4.getSaveMillis()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
                long r7 = r3.previous(r11, r2, r7)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
                int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r9 >= 0) goto L_0x001c
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x001c
            L_0x001b:
                r7 = r11
            L_0x001c:
                int r3 = r3.getSaveMillis()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002f }
                long r2 = r4.previous(r11, r2, r3)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002f }
                int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r4 >= 0) goto L_0x002d
                int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r4 <= 0) goto L_0x002d
                goto L_0x0030
            L_0x002d:
                r11 = r2
                goto L_0x0030
            L_0x002f:
            L_0x0030:
                int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r2 <= 0) goto L_0x0035
                r11 = r7
            L_0x0035:
                long r11 = r11 - r0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p699tz.DateTimeZoneBuilder.DSTZone.previousTransition(long):long");
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$OfYear */
    private static final class OfYear {
        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        OfYear(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c == 'u' || c == 'w' || c == 's') {
                this.iMode = c;
                this.iMonthOfYear = i;
                this.iDayOfMonth = i2;
                this.iDayOfWeek = i3;
                this.iAdvance = z;
                this.iMillisOfDay = i4;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown mode: ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }

        static OfYear readFrom(DataInput dataInput) throws IOException {
            OfYear ofYear = new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
            return ofYear;
        }

        private long setDayOfMonth(Chronology chronology, long j) {
            if (this.iDayOfMonth >= 0) {
                return chronology.dayOfMonth().set(j, this.iDayOfMonth);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j, 1), 1), this.iDayOfMonth);
        }

        private long setDayOfMonthNext(Chronology chronology, long j) {
            try {
                return setDayOfMonth(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear == 2 && this.iDayOfMonth == 29) {
                    while (!chronology.year().isLeap(j)) {
                        j = chronology.year().add(j, 1);
                    }
                    return setDayOfMonth(chronology, j);
                }
                throw e;
            }
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j) {
            try {
                return setDayOfMonth(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear == 2 && this.iDayOfMonth == 29) {
                    while (!chronology.year().isLeap(j)) {
                        j = chronology.year().add(j, -1);
                    }
                    return setDayOfMonth(chronology, j);
                }
                throw e;
            }
        }

        private long setDayOfWeek(Chronology chronology, long j) {
            int i = this.iDayOfWeek - chronology.dayOfWeek().get(j);
            if (i == 0) {
                return j;
            }
            if (this.iAdvance) {
                if (i < 0) {
                    i += 7;
                }
            } else if (i > 0) {
                i -= 7;
            }
            return chronology.dayOfWeek().add(j, i);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfYear)) {
                return false;
            }
            OfYear ofYear = (OfYear) obj;
            if (!(this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay)) {
                z = false;
            }
            return z;
        }

        public long next(long j, int i, int i2) {
            char c = this.iMode;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthNext = setDayOfWeek(instanceUTC, dayOfMonthNext);
                if (dayOfMonthNext <= j3) {
                    dayOfMonthNext = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthNext, 1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthNext <= j3) {
                dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthNext, 0), this.iMillisOfDay) - j2;
        }

        public long previous(long j, int i, int i2) {
            char c = this.iMode;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthPrevious = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                if (dayOfMonthPrevious >= j3) {
                    dayOfMonthPrevious = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthPrevious, -1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthPrevious >= j3) {
                dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthPrevious, 0), this.iMillisOfDay) - j2;
        }

        public long setInstant(int i, int i2, int i3) {
            char c = this.iMode;
            if (c == 'w') {
                i2 += i3;
            } else if (c != 's') {
                i2 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0, i), this.iMonthOfYear), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonth = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return dayOfMonth - ((long) i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[OfYear]\nMode: ");
            sb.append(this.iMode);
            sb.append(10);
            sb.append("MonthOfYear: ");
            sb.append(this.iMonthOfYear);
            sb.append(10);
            sb.append("DayOfMonth: ");
            sb.append(this.iDayOfMonth);
            sb.append(10);
            sb.append("DayOfWeek: ");
            sb.append(this.iDayOfWeek);
            sb.append(10);
            sb.append("AdvanceDayOfWeek: ");
            sb.append(this.iAdvance);
            sb.append(10);
            sb.append("MillisOfDay: ");
            sb.append(this.iMillisOfDay);
            sb.append(10);
            return sb.toString();
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iMillisOfDay);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone */
    private static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        static PrecalculatedZone create(String str, boolean z, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            String str2;
            DSTZone dSTZone2;
            DSTZone dSTZone3;
            String str3 = str;
            DSTZone dSTZone4 = dSTZone;
            int size = arrayList.size();
            if (size != 0) {
                long[] jArr = new long[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                String[] strArr = new String[size];
                int i = 0;
                Transition transition = null;
                int i2 = 0;
                while (i2 < size) {
                    Transition transition2 = (Transition) arrayList.get(i2);
                    if (transition2.isTransitionFrom(transition)) {
                        jArr[i2] = transition2.getMillis();
                        iArr[i2] = transition2.getWallOffset();
                        iArr2[i2] = transition2.getStandardOffset();
                        strArr[i2] = transition2.getNameKey();
                        i2++;
                        transition = transition2;
                    } else {
                        throw new IllegalArgumentException(str3);
                    }
                }
                String[] strArr2 = new String[5];
                String[][] zoneStrings = new DateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                String[] strArr3 = strArr2;
                for (String[] strArr4 : zoneStrings) {
                    if (strArr4 != null && strArr4.length == 5 && str3.equals(strArr4[0])) {
                        strArr3 = strArr4;
                    }
                }
                ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
                while (true) {
                    str2 = "-Summer";
                    if (i >= strArr.length - 1) {
                        break;
                    }
                    String str4 = strArr[i];
                    int i3 = i + 1;
                    String str5 = strArr[i3];
                    long j = (long) iArr[i];
                    long j2 = (long) iArr[i3];
                    String[] strArr5 = strArr;
                    String str6 = str2;
                    long j3 = (long) iArr2[i];
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    long j4 = (long) iArr2[i3];
                    long j5 = j;
                    int i4 = i;
                    String str7 = str5;
                    Period period = new Period(jArr[i], jArr[i3], PeriodType.yearMonthDay(), (Chronology) instanceUTC);
                    int i5 = (j5 > j2 ? 1 : (j5 == j2 ? 0 : -1));
                    if (i5 != 0 && j3 == j4 && str4.equals(str7) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str4.equals(strArr3[2]) && str4.equals(strArr3[4])) {
                        if (ZoneInfoLogger.verbose()) {
                            PrintStream printStream = System.out;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Fixing duplicate name key - ");
                            sb.append(str7);
                            printStream.println(sb.toString());
                            PrintStream printStream2 = System.out;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("     - ");
                            sb2.append(new DateTime(jArr[i4], (Chronology) instanceUTC));
                            sb2.append(" - ");
                            sb2.append(new DateTime(jArr[i3], (Chronology) instanceUTC));
                            printStream2.println(sb2.toString());
                        }
                        if (i5 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str4);
                            sb3.append(str6);
                            strArr5[i4] = sb3.toString().intern();
                        } else {
                            String str8 = str6;
                            if (i5 < 0) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str7);
                                sb4.append(str8);
                                strArr5[i3] = sb4.toString().intern();
                                i = i3 + 1;
                                String str9 = str;
                                dSTZone4 = dSTZone;
                                strArr = strArr5;
                                iArr = iArr3;
                                iArr2 = iArr4;
                            }
                        }
                    }
                    i3 = i4;
                    i = i3 + 1;
                    String str92 = str;
                    dSTZone4 = dSTZone;
                    strArr = strArr5;
                    iArr = iArr3;
                    iArr2 = iArr4;
                }
                DSTZone dSTZone5 = dSTZone4;
                int[] iArr5 = iArr;
                int[] iArr6 = iArr2;
                String[] strArr6 = strArr;
                String str10 = str2;
                if (dSTZone5 == null || !dSTZone5.iStartRecurrence.getNameKey().equals(dSTZone5.iEndRecurrence.getNameKey())) {
                    dSTZone2 = dSTZone5;
                } else {
                    if (ZoneInfoLogger.verbose()) {
                        PrintStream printStream3 = System.out;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Fixing duplicate recurrent name key - ");
                        sb5.append(dSTZone5.iStartRecurrence.getNameKey());
                        printStream3.println(sb5.toString());
                    }
                    if (dSTZone5.iStartRecurrence.getSaveMillis() > 0) {
                        dSTZone3 = new DSTZone(dSTZone.getID(), dSTZone5.iStandardOffset, dSTZone5.iStartRecurrence.renameAppend(str10), dSTZone5.iEndRecurrence);
                    } else {
                        dSTZone3 = new DSTZone(dSTZone.getID(), dSTZone5.iStandardOffset, dSTZone5.iStartRecurrence, dSTZone5.iEndRecurrence.renameAppend(str10));
                    }
                    dSTZone2 = dSTZone3;
                }
                PrecalculatedZone precalculatedZone = new PrecalculatedZone(z ? str : "", jArr, iArr5, iArr6, strArr6, dSTZone2);
                return precalculatedZone;
            }
            throw new IllegalArgumentException();
        }

        static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            int i;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i2 = 0; i2 < readUnsignedShort; i2++) {
                strArr[i2] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i3 = 0; i3 < readInt; i3++) {
                jArr[i3] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i3] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i3] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        i = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    i = dataInput.readUnsignedShort();
                }
                strArr2[i3] = strArr[i];
            }
            PrecalculatedZone precalculatedZone = new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
            return precalculatedZone;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone != null) {
                }
            }
            z = false;
            return z;
        }

        public String getNameKey(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iNameKeys[binarySearch];
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                return i > 0 ? this.iNameKeys[i - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return this.iNameKeys[i - 1];
            }
            return dSTZone.getNameKey(j);
        }

        public int getOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iWallOffsets[binarySearch];
            }
            int i = ~binarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone == null) {
                    return this.iWallOffsets[i - 1];
                }
                return dSTZone.getOffset(j);
            } else if (i > 0) {
                return this.iWallOffsets[i - 1];
            } else {
                return 0;
            }
        }

        public int getStandardOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iStandardOffsets[binarySearch];
            }
            int i = ~binarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone == null) {
                    return this.iStandardOffsets[i - 1];
                }
                return dSTZone.getStandardOffset(j);
            } else if (i > 0) {
                return this.iStandardOffsets[i - 1];
            } else {
                return 0;
            }
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d = 0.0d;
            int i = 0;
            for (int i2 = 1; i2 < jArr.length; i2++) {
                long j = jArr[i2] - jArr[i2 - 1];
                if (j < 63158400000L) {
                    d += (double) j;
                    i++;
                }
            }
            if (i <= 0 || (d / ((double) i)) / 8.64E7d < 25.0d) {
                return false;
            }
            return true;
        }

        public boolean isFixed() {
            return false;
        }

        public long nextTransition(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            int i = binarySearch >= 0 ? binarySearch + 1 : ~binarySearch;
            if (i < jArr.length) {
                return jArr[i];
            }
            if (this.iTailZone == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return this.iTailZone.nextTransition(j);
        }

        public long previousTransition(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                if (j > Long.MIN_VALUE) {
                    j--;
                }
                return j;
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    long j2 = jArr[i - 1];
                    if (j2 > Long.MIN_VALUE) {
                        return j2 - 1;
                    }
                }
                return j;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                long previousTransition = dSTZone.previousTransition(j);
                if (previousTransition < j) {
                    return previousTransition;
                }
            }
            long j3 = jArr[i - 1];
            return j3 > Long.MIN_VALUE ? j3 - 1 : j;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet<String> hashSet = new HashSet<>();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                hashSet.add(this.iNameKeys[i]);
            }
            int size = hashSet.size();
            if (size <= 65535) {
                String[] strArr = new String[size];
                int i2 = 0;
                for (String str : hashSet) {
                    strArr[i2] = str;
                    i2++;
                }
                dataOutput.writeShort(size);
                for (int i3 = 0; i3 < size; i3++) {
                    dataOutput.writeUTF(strArr[i3]);
                }
                dataOutput.writeInt(length);
                for (int i4 = 0; i4 < length; i4++) {
                    DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i4]);
                    DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iWallOffsets[i4]);
                    DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iStandardOffsets[i4]);
                    String str2 = this.iNameKeys[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        } else if (!strArr[i5].equals(str2)) {
                            i5++;
                        } else if (size < 256) {
                            dataOutput.writeByte(i5);
                        } else {
                            dataOutput.writeShort(i5);
                        }
                    }
                }
                if (this.iTailZone != null) {
                    z = true;
                }
                dataOutput.writeBoolean(z);
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone != null) {
                    dSTZone.writeTo(dataOutput);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("String pool is too large");
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$Recurrence */
    private static final class Recurrence {
        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        Recurrence(OfYear ofYear, String str, int i) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i;
        }

        static Recurrence readFrom(DataInput dataInput) throws IOException {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            if (this.iSaveMillis != recurrence.iSaveMillis || !this.iNameKey.equals(recurrence.iNameKey) || !this.iOfYear.equals(recurrence.iOfYear)) {
                z = false;
            }
            return z;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public long next(long j, int i, int i2) {
            return this.iOfYear.next(j, i, i2);
        }

        public long previous(long j, int i, int i2) {
            return this.iOfYear.previous(j, i, i2);
        }

        /* access modifiers changed from: 0000 */
        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        /* access modifiers changed from: 0000 */
        public Recurrence renameAppend(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.iNameKey);
            sb.append(str);
            return rename(sb.toString().intern());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.iOfYear);
            sb.append(" named ");
            sb.append(this.iNameKey);
            sb.append(" at ");
            sb.append(this.iSaveMillis);
            return sb.toString();
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iSaveMillis);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$Rule */
    private static final class Rule {
        final int iFromYear;
        final Recurrence iRecurrence;
        final int iToYear;

        Rule(Recurrence recurrence, int i, int i2) {
            this.iRecurrence = recurrence;
            this.iFromYear = i;
            this.iToYear = i2;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j, int i, int i2) {
            int i3;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i4 = i + i2;
            if (j == Long.MIN_VALUE) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = instanceUTC.year().get(((long) i4) + j);
            }
            long next = this.iRecurrence.next(i3 < this.iFromYear ? (instanceUTC.year().set(0, this.iFromYear) - ((long) i4)) - 1 : j, i, i2);
            return (next <= j || instanceUTC.year().get(((long) i4) + next) <= this.iToYear) ? next : j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.iFromYear);
            sb.append(" to ");
            sb.append(this.iToYear);
            sb.append(" using ");
            sb.append(this.iRecurrence);
            return sb.toString();
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$RuleSet */
    private static final class RuleSet {
        private static final int YEAR_LIMIT = (ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100);
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = Integer.MAX_VALUE;
        }

        public void addRule(Rule rule) {
            if (!this.iRules.contains(rule)) {
                this.iRules.add(rule);
            }
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() == 2) {
                Rule rule = (Rule) this.iRules.get(0);
                Rule rule2 = (Rule) this.iRules.get(1);
                if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                    return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
                }
            }
            return null;
        }

        public Transition firstTransition(long j) {
            String str = this.iInitialNameKey;
            if (str != null) {
                int i = this.iStandardOffset;
                Transition transition = new Transition(j, str, i + this.iInitialSaveMillis, i);
                return transition;
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long j2 = Long.MIN_VALUE;
            int i2 = 0;
            Transition transition2 = null;
            while (true) {
                Transition nextTransition = nextTransition(j2, i2);
                if (nextTransition == null) {
                    break;
                }
                long millis = nextTransition.getMillis();
                int i3 = (millis > j ? 1 : (millis == j ? 0 : -1));
                if (i3 == 0) {
                    transition2 = new Transition(j, nextTransition);
                    break;
                } else if (i3 > 0) {
                    if (transition2 == null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Rule rule = (Rule) it.next();
                            if (rule.getSaveMillis() == 0) {
                                transition2 = new Transition(j, rule, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    if (transition2 == null) {
                        String nameKey = nextTransition.getNameKey();
                        int i4 = this.iStandardOffset;
                        Transition transition3 = new Transition(j, nameKey, i4, i4);
                        transition2 = transition3;
                    }
                } else {
                    transition2 = new Transition(j, nextTransition);
                    i2 = nextTransition.getSaveMillis();
                    j2 = millis;
                }
            }
            this.iRules = arrayList;
            return transition2;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i) {
            int i2 = this.iUpperYear;
            if (i2 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.iUpperOfYear.setInstant(i2, this.iStandardOffset, i);
        }

        public Transition nextTransition(long j, int i) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator it = this.iRules.iterator();
            long j2 = Long.MAX_VALUE;
            Rule rule = null;
            while (it.hasNext()) {
                Rule rule2 = (Rule) it.next();
                long next = rule2.next(j, this.iStandardOffset, i);
                if (next <= j) {
                    it.remove();
                } else if (next <= j2) {
                    rule = rule2;
                    j2 = next;
                }
            }
            if (rule == null || instanceUTC.year().get(j2) >= YEAR_LIMIT) {
                return null;
            }
            int i2 = this.iUpperYear;
            if (i2 >= Integer.MAX_VALUE || j2 < this.iUpperOfYear.setInstant(i2, this.iStandardOffset, i)) {
                return new Transition(j2, rule, this.iStandardOffset);
            }
            return null;
        }

        public void setFixedSavings(String str, int i) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i;
        }

        public void setStandardOffset(int i) {
            this.iStandardOffset = i;
        }

        public void setUpperLimit(int i, OfYear ofYear) {
            this.iUpperYear = i;
            this.iUpperOfYear = ofYear;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.iInitialNameKey);
            sb.append(" initial: ");
            sb.append(this.iInitialSaveMillis);
            sb.append(" std: ");
            sb.append(this.iStandardOffset);
            sb.append(" upper: ");
            sb.append(this.iUpperYear);
            String str = " ";
            sb.append(str);
            sb.append(this.iUpperOfYear);
            sb.append(str);
            sb.append(this.iRules);
            return sb.toString();
        }

        RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$Transition */
    private static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        Transition(long j, Transition transition) {
            this.iMillis = j;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            boolean z = true;
            if (transition == null) {
                return true;
            }
            if (this.iMillis <= transition.iMillis || (this.iWallOffset == transition.iWallOffset && this.iStandardOffset == transition.iStandardOffset && this.iNameKey.equals(transition.iNameKey))) {
                z = false;
            }
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(new DateTime(this.iMillis, DateTimeZone.UTC));
            String str = " ";
            sb.append(str);
            sb.append(this.iStandardOffset);
            sb.append(str);
            sb.append(this.iWallOffset);
            return sb.toString();
        }

        public Transition withMillis(long j) {
            Transition transition = new Transition(j, this.iNameKey, this.iWallOffset, this.iStandardOffset);
            return transition;
        }

        Transition(long j, Rule rule, int i) {
            this.iMillis = j;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i;
            this.iStandardOffset = i;
        }

        Transition(long j, String str, int i, int i2) {
            this.iMillis = j;
            this.iNameKey = str;
            this.iWallOffset = i;
            this.iStandardOffset = i2;
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i = size - 1;
        Transition transition2 = (Transition) arrayList.get(i);
        int i2 = 0;
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (size >= 2) {
            i2 = ((Transition) arrayList.get(size - 2)).getWallOffset();
        }
        int wallOffset = transition2.getWallOffset();
        if (transition.getMillis() + ((long) wallOffset) == transition2.getMillis() + ((long) i2)) {
            return addTransition(arrayList, transition.withMillis(((Transition) arrayList.remove(i)).getMillis()));
        }
        arrayList.add(transition);
        return true;
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i, int i2) {
        if (!"UTC".equals(str) || !str.equals(str2) || i != 0 || i2 != 0) {
            return new FixedDateTimeZone(str, str2, i, i2);
        }
        return DateTimeZone.UTC;
    }

    private RuleSet getLastRuleSet() {
        if (this.iRuleSets.size() == 0) {
            addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        ArrayList<RuleSet> arrayList = this.iRuleSets;
        return (RuleSet) arrayList.get(arrayList.size() - 1);
    }

    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        if (inputStream instanceof DataInput) {
            return readFrom((DataInput) inputStream, str);
        }
        return readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    static long readMillis(DataInput dataInput) throws IOException {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = (long) (dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8));
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = ((((long) readUnsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (long) ((readUnsignedByte2 << 26) >> 26);
            j = 1800000;
        }
        return readUnsignedByte * j;
    }

    static void writeMillis(DataOutput dataOutput, long j) throws IOException {
        if (j % 1800000 == 0) {
            long j2 = j / 1800000;
            if (((j2 << 58) >> 58) == j2) {
                dataOutput.writeByte((int) (j2 & 63));
                return;
            }
        }
        if (j % 60000 == 0) {
            long j3 = j / 60000;
            if (((j3 << 34) >> 34) == j3) {
                dataOutput.writeInt(1073741824 | ((int) (j3 & 1073741823)));
                return;
            }
        }
        if (j % 1000 == 0) {
            long j4 = j / 1000;
            if (((j4 << 26) >> 26) == j4) {
                dataOutput.writeByte(((int) ((j4 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) (-1 & j4));
                return;
            }
        }
        dataOutput.writeByte(j < 0 ? 255 : 192);
        dataOutput.writeLong(j);
    }

    public DateTimeZoneBuilder addCutover(int i, char c, int i2, int i3, int i4, boolean z, int i5) {
        if (this.iRuleSets.size() > 0) {
            OfYear ofYear = new OfYear(c, i2, i3, i4, z, i5);
            ArrayList<RuleSet> arrayList = this.iRuleSets;
            ((RuleSet) arrayList.get(arrayList.size() - 1)).setUpperLimit(i, ofYear);
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i, int i2, int i3, char c, int i4, int i5, int i6, boolean z, int i7) {
        if (i2 <= i3) {
            OfYear ofYear = new OfYear(c, i4, i5, i6, z, i7);
            String str2 = str;
            int i8 = i;
            getLastRuleSet().addRule(new Rule(new Recurrence(ofYear, str, i), i2, i3));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i) {
        getLastRuleSet().setFixedSavings(str, i);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i) {
        getLastRuleSet().setStandardOffset(i);
        return this;
    }

    /* JADX WARNING: type inference failed for: r13v4, types: [org.joda.time.tz.CachedDateTimeZone] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.joda.time.DateTimeZone toDateTimeZone(java.lang.String r13, boolean r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x009f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = -9223372036854775808
            java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder$RuleSet> r4 = r12.iRuleSets
            int r4 = r4.size()
            r5 = 0
            r6 = r1
            r1 = 0
        L_0x0013:
            if (r1 >= r4) goto L_0x0060
            java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder$RuleSet> r7 = r12.iRuleSets
            java.lang.Object r7 = r7.get(r1)
            org.joda.time.tz.DateTimeZoneBuilder$RuleSet r7 = (org.joda.time.p699tz.DateTimeZoneBuilder.RuleSet) r7
            org.joda.time.tz.DateTimeZoneBuilder$Transition r8 = r7.firstTransition(r2)
            if (r8 != 0) goto L_0x0024
            goto L_0x005d
        L_0x0024:
            r12.addTransition(r0, r8)
            long r2 = r8.getMillis()
            int r8 = r8.getSaveMillis()
            org.joda.time.tz.DateTimeZoneBuilder$RuleSet r9 = new org.joda.time.tz.DateTimeZoneBuilder$RuleSet
            r9.<init>(r7)
        L_0x0034:
            org.joda.time.tz.DateTimeZoneBuilder$Transition r2 = r9.nextTransition(r2, r8)
            if (r2 == 0) goto L_0x0059
            boolean r3 = r12.addTransition(r0, r2)
            if (r3 == 0) goto L_0x0043
            if (r6 == 0) goto L_0x0043
            goto L_0x0059
        L_0x0043:
            long r7 = r2.getMillis()
            int r2 = r2.getSaveMillis()
            if (r6 != 0) goto L_0x0055
            int r3 = r4 + -1
            if (r1 != r3) goto L_0x0055
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone r6 = r9.buildTailZone(r13)
        L_0x0055:
            r10 = r7
            r8 = r2
            r2 = r10
            goto L_0x0034
        L_0x0059:
            long r2 = r9.getUpperLimit(r8)
        L_0x005d:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0060:
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0070
            if (r6 == 0) goto L_0x0069
            return r6
        L_0x0069:
            java.lang.String r14 = "UTC"
            org.joda.time.DateTimeZone r13 = buildFixedZone(r13, r14, r5, r5)
            return r13
        L_0x0070:
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            java.lang.Object r14 = r0.get(r5)
            org.joda.time.tz.DateTimeZoneBuilder$Transition r14 = (org.joda.time.p699tz.DateTimeZoneBuilder.Transition) r14
            java.lang.String r0 = r14.getNameKey()
            int r1 = r14.getWallOffset()
            int r14 = r14.getStandardOffset()
            org.joda.time.DateTimeZone r13 = buildFixedZone(r13, r0, r1, r14)
            return r13
        L_0x0090:
            org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone r13 = org.joda.time.p699tz.DateTimeZoneBuilder.PrecalculatedZone.create(r13, r14, r0, r6)
            boolean r14 = r13.isCachable()
            if (r14 == 0) goto L_0x009e
            org.joda.time.tz.CachedDateTimeZone r13 = org.joda.time.p699tz.CachedDateTimeZone.forZone(r13)
        L_0x009e:
            return r13
        L_0x009f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p699tz.DateTimeZoneBuilder.toDateTimeZone(java.lang.String, boolean):org.joda.time.DateTimeZone");
    }

    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [org.joda.time.DateTimeZone] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.joda.time.DateTimeZone readFrom(java.io.DataInput r6, java.lang.String r7) throws java.io.IOException {
        /*
            int r0 = r6.readUnsignedByte()
            r1 = 67
            if (r0 == r1) goto L_0x003b
            r1 = 70
            if (r0 == r1) goto L_0x001d
            r1 = 80
            if (r0 != r1) goto L_0x0015
            org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone r6 = org.joda.time.p699tz.DateTimeZoneBuilder.PrecalculatedZone.readFrom(r6, r7)
            return r6
        L_0x0015:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Invalid encoding"
            r6.<init>(r7)
            throw r6
        L_0x001d:
            org.joda.time.tz.FixedDateTimeZone r0 = new org.joda.time.tz.FixedDateTimeZone
            java.lang.String r1 = r6.readUTF()
            long r2 = readMillis(r6)
            int r3 = (int) r2
            long r4 = readMillis(r6)
            int r6 = (int) r4
            r0.<init>(r7, r1, r3, r6)
            org.joda.time.DateTimeZone r6 = org.joda.time.DateTimeZone.UTC
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x003a
            org.joda.time.DateTimeZone r0 = org.joda.time.DateTimeZone.UTC
        L_0x003a:
            return r0
        L_0x003b:
            org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone r6 = org.joda.time.p699tz.DateTimeZoneBuilder.PrecalculatedZone.readFrom(r6, r7)
            org.joda.time.tz.CachedDateTimeZone r6 = org.joda.time.p699tz.CachedDateTimeZone.forZone(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p699tz.DateTimeZoneBuilder.readFrom(java.io.DataInput, java.lang.String):org.joda.time.DateTimeZone");
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0));
            writeMillis(dataOutput, (long) dateTimeZone.getOffset(0));
            writeMillis(dataOutput, (long) dateTimeZone.getStandardOffset(0));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }
}
