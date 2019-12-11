package p163g.p441i.p442a.p443a.p445r;

/* renamed from: g.i.a.a.r.e */
/* compiled from: NumberOutput */
public final class C10920e {

    /* renamed from: a */
    private static int f25917a = 1000000;

    /* renamed from: b */
    private static int f25918b = 1000000000;

    /* renamed from: c */
    private static long f25919c = 1000000000;

    /* renamed from: d */
    private static long f25920d = -2147483648L;

    /* renamed from: e */
    private static long f25921e = 2147483647L;

    /* renamed from: f */
    static final String f25922f = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: g */
    static final String f25923g = String.valueOf(Long.MIN_VALUE);

    /* renamed from: h */
    private static final int[] f25924h = new int[1000];

    static {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            int i3 = i2;
            int i4 = 0;
            while (i4 < 10) {
                int i5 = i3;
                int i6 = 0;
                while (i6 < 10) {
                    int i7 = i5 + 1;
                    f25924h[i5] = ((i + 48) << 16) | ((i4 + 48) << 8) | (i6 + 48);
                    i6++;
                    i5 = i7;
                }
                i4++;
                i3 = i5;
            }
            i++;
            i2 = i3;
        }
        new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    /* renamed from: a */
    public static int m34468a(long j, char[] cArr, int i) {
        int i2;
        if (j < 0) {
            if (j > f25920d) {
                return m34482e((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return m34476b(cArr, i);
            }
            int i3 = i + 1;
            cArr[i] = '-';
            j = -j;
            i = i3;
        } else if (j <= f25921e) {
            return m34482e((int) j, cArr, i);
        }
        long j2 = f25919c;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            i2 = m34480d((int) j3, cArr, i);
        } else {
            long j5 = j3 / j2;
            long j6 = j3 - (j2 * j5);
            i2 = m34478c((int) j6, cArr, m34474b((int) j5, cArr, i));
        }
        return m34478c((int) j4, cArr, i2);
    }

    /* renamed from: b */
    private static int m34474b(int i, char[] cArr, int i2) {
        int i3;
        int i4 = f25924h[i];
        if (i > 9) {
            if (i > 99) {
                i3 = i2 + 1;
                cArr[i2] = (char) (i4 >> 16);
            } else {
                i3 = i2;
            }
            i2 = i3 + 1;
            cArr[i3] = (char) ((i4 >> 8) & 127);
        }
        int i5 = i2 + 1;
        cArr[i2] = (char) (i4 & 127);
        return i5;
    }

    /* renamed from: c */
    private static int m34478c(int i, char[] cArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = f25924h;
        int i6 = iArr[i5];
        int i7 = i2 + 1;
        cArr[i2] = (char) (i6 >> 16);
        int i8 = i7 + 1;
        cArr[i7] = (char) ((i6 >> 8) & 127);
        int i9 = i8 + 1;
        cArr[i8] = (char) (i6 & 127);
        int i10 = iArr[i3 - (i5 * 1000)];
        int i11 = i9 + 1;
        cArr[i9] = (char) (i10 >> 16);
        int i12 = i11 + 1;
        cArr[i11] = (char) ((i10 >> 8) & 127);
        int i13 = i12 + 1;
        cArr[i12] = (char) (i10 & 127);
        int i14 = iArr[i4];
        int i15 = i13 + 1;
        cArr[i13] = (char) (i14 >> 16);
        int i16 = i15 + 1;
        cArr[i15] = (char) ((i14 >> 8) & 127);
        int i17 = i16 + 1;
        cArr[i16] = (char) (i14 & 127);
        return i17;
    }

    /* renamed from: d */
    private static int m34480d(int i, char[] cArr, int i2) {
        if (i >= f25917a) {
            int i3 = i / 1000;
            int i4 = i - (i3 * 1000);
            int i5 = i3 / 1000;
            int i6 = i3 - (i5 * 1000);
            int b = m34474b(i5, cArr, i2);
            int[] iArr = f25924h;
            int i7 = iArr[i6];
            int i8 = b + 1;
            cArr[b] = (char) (i7 >> 16);
            int i9 = i8 + 1;
            cArr[i8] = (char) ((i7 >> 8) & 127);
            int i10 = i9 + 1;
            cArr[i9] = (char) (i7 & 127);
            int i11 = iArr[i4];
            int i12 = i10 + 1;
            cArr[i10] = (char) (i11 >> 16);
            int i13 = i12 + 1;
            cArr[i12] = (char) ((i11 >> 8) & 127);
            int i14 = i13 + 1;
            cArr[i13] = (char) (i11 & 127);
            return i14;
        } else if (i < 1000) {
            return m34474b(i, cArr, i2);
        } else {
            int i15 = i / 1000;
            return m34472a(cArr, i2, i15, i - (i15 * 1000));
        }
    }

    /* renamed from: e */
    public static int m34482e(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m34471a(cArr, i2);
            }
            int i4 = i2 + 1;
            cArr[i2] = '-';
            i = -i;
            i2 = i4;
        }
        if (i >= f25917a) {
            int i5 = f25918b;
            if (i >= i5) {
                int i6 = i - i5;
                if (i6 >= i5) {
                    i6 -= i5;
                    i3 = i2 + 1;
                    cArr[i2] = '2';
                } else {
                    i3 = i2 + 1;
                    cArr[i2] = '1';
                }
                return m34478c(i6, cArr, i3);
            }
            int i7 = i / 1000;
            int i8 = i7 / 1000;
            return m34466a(i - (i7 * 1000), cArr, m34466a(i7 - (i8 * 1000), cArr, m34474b(i8, cArr, i2)));
        } else if (i >= 1000) {
            int i9 = i / 1000;
            return m34466a(i - (i9 * 1000), cArr, m34474b(i9, cArr, i2));
        } else if (i >= 10) {
            return m34474b(i, cArr, i2);
        } else {
            cArr[i2] = (char) (i + 48);
            return i2 + 1;
        }
    }

    /* renamed from: b */
    private static int m34473b(int i, byte[] bArr, int i2) {
        int i3;
        int i4 = f25924h[i];
        if (i > 9) {
            if (i > 99) {
                i3 = i2 + 1;
                bArr[i2] = (byte) (i4 >> 16);
            } else {
                i3 = i2;
            }
            i2 = i3 + 1;
            bArr[i3] = (byte) (i4 >> 8);
        }
        int i5 = i2 + 1;
        bArr[i2] = (byte) i4;
        return i5;
    }

    /* renamed from: b */
    private static int m34476b(char[] cArr, int i) {
        int length = f25923g.length();
        f25923g.getChars(0, length, cArr, i);
        return i + length;
    }

    /* renamed from: b */
    private static int m34475b(byte[] bArr, int i) {
        int length = f25923g.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            bArr[i] = (byte) f25923g.charAt(i2);
            i2++;
            i = i3;
        }
        return i;
    }

    /* renamed from: a */
    public static int m34467a(long j, byte[] bArr, int i) {
        int i2;
        if (j < 0) {
            if (j > f25920d) {
                return m34481e((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return m34475b(bArr, i);
            }
            int i3 = i + 1;
            bArr[i] = Framer.STDIN_FRAME_PREFIX;
            j = -j;
            i = i3;
        } else if (j <= f25921e) {
            return m34481e((int) j, bArr, i);
        }
        long j2 = f25919c;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            i2 = m34479d((int) j3, bArr, i);
        } else {
            long j5 = j3 / j2;
            long j6 = j3 - (j2 * j5);
            i2 = m34477c((int) j6, bArr, m34473b((int) j5, bArr, i));
        }
        return m34477c((int) j4, bArr, i2);
    }

    /* renamed from: c */
    private static int m34477c(int i, byte[] bArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int i6 = i3 - (i5 * 1000);
        int[] iArr = f25924h;
        int i7 = iArr[i5];
        int i8 = i2 + 1;
        bArr[i2] = (byte) (i7 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) i7;
        int i11 = iArr[i6];
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) i11;
        int i15 = iArr[i4];
        int i16 = i14 + 1;
        bArr[i14] = (byte) (i15 >> 16);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (i15 >> 8);
        int i18 = i17 + 1;
        bArr[i17] = (byte) i15;
        return i18;
    }

    /* renamed from: d */
    private static int m34479d(int i, byte[] bArr, int i2) {
        if (i >= f25917a) {
            int i3 = i / 1000;
            int i4 = i - (i3 * 1000);
            int i5 = i3 / 1000;
            int i6 = i3 - (i5 * 1000);
            int b = m34473b(i5, bArr, i2);
            int[] iArr = f25924h;
            int i7 = iArr[i6];
            int i8 = b + 1;
            bArr[b] = (byte) (i7 >> 16);
            int i9 = i8 + 1;
            bArr[i8] = (byte) (i7 >> 8);
            int i10 = i9 + 1;
            bArr[i9] = (byte) i7;
            int i11 = iArr[i4];
            int i12 = i10 + 1;
            bArr[i10] = (byte) (i11 >> 16);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (i11 >> 8);
            int i14 = i13 + 1;
            bArr[i13] = (byte) i11;
            return i14;
        } else if (i < 1000) {
            return m34473b(i, bArr, i2);
        } else {
            int i15 = i / 1000;
            return m34470a(bArr, i2, i15, i - (i15 * 1000));
        }
    }

    /* renamed from: e */
    public static int m34481e(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m34469a(bArr, i2);
            }
            int i5 = i2 + 1;
            bArr[i2] = Framer.STDIN_FRAME_PREFIX;
            i = -i;
            i2 = i5;
        }
        if (i < f25917a) {
            if (i >= 1000) {
                int i6 = i / 1000;
                i4 = m34465a(i - (i6 * 1000), bArr, m34473b(i6, bArr, i2));
            } else if (i < 10) {
                i4 = i2 + 1;
                bArr[i2] = (byte) (i + 48);
            } else {
                i4 = m34473b(i, bArr, i2);
            }
            return i4;
        }
        int i7 = f25918b;
        if (i >= i7) {
            int i8 = i - i7;
            if (i8 >= i7) {
                i8 -= i7;
                i3 = i2 + 1;
                bArr[i2] = Framer.STDERR_FRAME_PREFIX;
            } else {
                i3 = i2 + 1;
                bArr[i2] = Framer.STDOUT_FRAME_PREFIX;
            }
            return m34477c(i8, bArr, i3);
        }
        int i9 = i / 1000;
        int i10 = i9 / 1000;
        return m34465a(i - (i9 * 1000), bArr, m34465a(i9 - (i10 * 1000), bArr, m34473b(i10, bArr, i2)));
    }

    /* renamed from: a */
    private static int m34472a(char[] cArr, int i, int i2, int i3) {
        int i4 = f25924h[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                int i5 = i + 1;
                cArr[i] = (char) (i4 >> 16);
                i = i5;
            }
            int i6 = i + 1;
            cArr[i] = (char) ((i4 >> 8) & 127);
            i = i6;
        }
        int i7 = i + 1;
        cArr[i] = (char) (i4 & 127);
        int i8 = f25924h[i3];
        int i9 = i7 + 1;
        cArr[i7] = (char) (i8 >> 16);
        int i10 = i9 + 1;
        cArr[i9] = (char) ((i8 >> 8) & 127);
        int i11 = i10 + 1;
        cArr[i10] = (char) (i8 & 127);
        return i11;
    }

    /* renamed from: a */
    private static int m34470a(byte[] bArr, int i, int i2, int i3) {
        int i4 = f25924h[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                int i5 = i + 1;
                bArr[i] = (byte) (i4 >> 16);
                i = i5;
            }
            int i6 = i + 1;
            bArr[i] = (byte) (i4 >> 8);
            i = i6;
        }
        int i7 = i + 1;
        bArr[i] = (byte) i4;
        int i8 = f25924h[i3];
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 >> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 8);
        int i11 = i10 + 1;
        bArr[i10] = (byte) i8;
        return i11;
    }

    /* renamed from: a */
    private static int m34466a(int i, char[] cArr, int i2) {
        int i3 = f25924h[i];
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 >> 16);
        int i5 = i4 + 1;
        cArr[i4] = (char) ((i3 >> 8) & 127);
        int i6 = i5 + 1;
        cArr[i5] = (char) (i3 & 127);
        return i6;
    }

    /* renamed from: a */
    private static int m34465a(int i, byte[] bArr, int i2) {
        int i3 = f25924h[i];
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i3;
        return i6;
    }

    /* renamed from: a */
    private static int m34471a(char[] cArr, int i) {
        int length = f25922f.length();
        f25922f.getChars(0, length, cArr, i);
        return i + length;
    }

    /* renamed from: a */
    private static int m34469a(byte[] bArr, int i) {
        int length = f25922f.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            bArr[i] = (byte) f25922f.charAt(i2);
            i2++;
            i = i3;
        }
        return i;
    }
}
