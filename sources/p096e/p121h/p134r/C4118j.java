package p096e.p121h.p134r;

import java.io.PrintWriter;
import org.joda.time.DateTimeConstants;

/* renamed from: e.h.r.j */
/* compiled from: TimeUtils */
public final class C4118j {

    /* renamed from: a */
    private static final Object f10392a = new Object();

    /* renamed from: b */
    private static char[] f10393b = new char[24];

    /* renamed from: a */
    private static int m14097a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: a */
    private static int m14099a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    /* renamed from: a */
    private static int m14098a(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        int i7 = i;
        if (f10393b.length < i7) {
            f10393b = new char[i7];
        }
        char[] cArr = f10393b;
        int i8 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i8 == 0) {
            int i9 = i7 - 1;
            while (i9 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i8 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i10 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / DateTimeConstants.SECONDS_PER_DAY;
            floor -= DateTimeConstants.SECONDS_PER_DAY * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / DateTimeConstants.SECONDS_PER_HOUR;
            floor -= i3 * DateTimeConstants.SECONDS_PER_HOUR;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i11 = floor / 60;
            i4 = floor - (i11 * 60);
            i5 = i11;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i7 != 0) {
            int a = m14097a(i2, 1, false, 0);
            int a2 = a + m14097a(i3, 1, a > 0, 2);
            int a3 = a2 + m14097a(i5, 1, a2 > 0, 2);
            int a4 = a3 + m14097a(i4, 1, a3 > 0, 2);
            i6 = 0;
            for (int a5 = a4 + m14097a(i10, 2, true, a4 > 0 ? 3 : 0) + 1; a5 < i7; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i12 = i6 + 1;
        boolean z = i7 != 0;
        int i13 = i12;
        int a6 = m14099a(cArr, i2, 'd', i12, false, 0);
        int a7 = m14099a(cArr, i3, 'h', a6, a6 != i13, z ? 2 : 0);
        int a8 = m14099a(cArr, i5, 'm', a7, a7 != i13, z ? 2 : 0);
        int a9 = m14099a(cArr, i4, 's', a8, a8 != i13, z ? 2 : 0);
        int a10 = m14099a(cArr, i10, 'm', a9, true, (!z || a9 == i13) ? 0 : 3);
        cArr[a10] = 's';
        return a10 + 1;
    }

    /* renamed from: a */
    public static void m14102a(long j, PrintWriter printWriter, int i) {
        synchronized (f10392a) {
            printWriter.print(new String(f10393b, 0, m14098a(j, i)));
        }
    }

    /* renamed from: a */
    public static void m14101a(long j, PrintWriter printWriter) {
        m14102a(j, printWriter, 0);
    }

    /* renamed from: a */
    public static void m14100a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m14102a(j - j2, printWriter, 0);
        }
    }
}
