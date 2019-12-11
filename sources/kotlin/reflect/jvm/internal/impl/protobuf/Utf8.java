package kotlin.reflect.jvm.internal.impl.protobuf;

final class Utf8 {
    private static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    private static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    private static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    private static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return incompleteStateFor(b);
        }
        if (i3 == 1) {
            return incompleteStateFor(b, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return isValidUtf8(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r7[r8] > -65) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        if (r7[r6] > -65) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r7[r8] > -65) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int partialIsValidUtf8(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L_0x007d
            if (r8 < r9) goto L_0x0005
            return r6
        L_0x0005:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L_0x0018
            r6 = -62
            if (r0 < r6) goto L_0x0017
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x007e
        L_0x0017:
            return r2
        L_0x0018:
            r4 = -16
            if (r0 >= r4) goto L_0x0045
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L_0x0030
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r6 < r9) goto L_0x002d
            int r6 = incompleteStateFor(r0, r8)
            return r6
        L_0x002d:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0030:
            if (r6 > r3) goto L_0x0044
            r4 = -96
            if (r0 != r1) goto L_0x0038
            if (r6 < r4) goto L_0x0044
        L_0x0038:
            r1 = -19
            if (r0 != r1) goto L_0x003e
            if (r6 >= r4) goto L_0x0044
        L_0x003e:
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x007e
        L_0x0044:
            return r2
        L_0x0045:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            r4 = 0
            if (r1 != 0) goto L_0x0057
            int r6 = r8 + 1
            byte r1 = r7[r8]
            if (r6 < r9) goto L_0x005b
            int r6 = incompleteStateFor(r0, r1)
            return r6
        L_0x0057:
            int r6 = r6 >> 16
            byte r4 = (byte) r6
            r6 = r8
        L_0x005b:
            if (r4 != 0) goto L_0x0069
            int r8 = r6 + 1
            byte r4 = r7[r6]
            if (r8 < r9) goto L_0x0068
            int r6 = incompleteStateFor(r0, r1, r4)
            return r6
        L_0x0068:
            r6 = r8
        L_0x0069:
            if (r1 > r3) goto L_0x007c
            int r8 = r0 << 28
            int r1 = r1 + 112
            int r8 = r8 + r1
            int r8 = r8 >> 30
            if (r8 != 0) goto L_0x007c
            if (r4 > r3) goto L_0x007c
            int r8 = r6 + 1
            byte r6 = r7[r6]
            if (r6 <= r3) goto L_0x007d
        L_0x007c:
            return r2
        L_0x007d:
            r6 = r8
        L_0x007e:
            int r6 = partialIsValidUtf8(r7, r6, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.Utf8.partialIsValidUtf8(int, byte[], int, int):int");
    }

    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return incompleteStateFor(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return incompleteStateFor(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i = i3;
        }
        return 0;
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return partialIsValidUtf8(bArr, i, i2) == 0;
    }

    public static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i, i2);
    }
}
