package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.r2 */
final class C11284r2 {
    /* renamed from: a */
    static int m36033a(byte[] bArr, int i, C11270q2 q2Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m36027a((int) b, bArr, i2, q2Var);
        }
        q2Var.f26443a = b;
        return i2;
    }

    /* renamed from: b */
    static int m36034b(byte[] bArr, int i, C11270q2 q2Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            q2Var.f26444b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        q2Var.f26444b = j3;
        return i3;
    }

    /* renamed from: c */
    static double m36036c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m36035b(bArr, i));
    }

    /* renamed from: d */
    static float m36038d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m36031a(bArr, i));
    }

    /* renamed from: e */
    static int m36040e(byte[] bArr, int i, C11270q2 q2Var) throws C11258p4 {
        int a = m36033a(bArr, i, q2Var);
        int i2 = q2Var.f26443a;
        if (i2 < 0) {
            throw C11258p4.m35931b();
        } else if (i2 > bArr.length - a) {
            throw C11258p4.m35930a();
        } else if (i2 == 0) {
            q2Var.f26445c = C11342v2.f26574U;
            return a;
        } else {
            q2Var.f26445c = C11342v2.m36528a(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: c */
    static int m36037c(byte[] bArr, int i, C11270q2 q2Var) throws C11258p4 {
        int a = m36033a(bArr, i, q2Var);
        int i2 = q2Var.f26443a;
        if (i2 < 0) {
            throw C11258p4.m35931b();
        } else if (i2 == 0) {
            q2Var.f26445c = "";
            return a;
        } else {
            q2Var.f26445c = new String(bArr, a, i2, C11111f4.f26198a);
            return a + i2;
        }
    }

    /* renamed from: d */
    static int m36039d(byte[] bArr, int i, C11270q2 q2Var) throws C11258p4 {
        int a = m36033a(bArr, i, q2Var);
        int i2 = q2Var.f26443a;
        if (i2 < 0) {
            throw C11258p4.m35931b();
        } else if (i2 == 0) {
            q2Var.f26445c = "";
            return a;
        } else {
            q2Var.f26445c = C11114f7.m35227c(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: a */
    static int m36027a(int i, byte[] bArr, int i2, C11270q2 q2Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            q2Var.f26443a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            q2Var.f26443a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            q2Var.f26443a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            q2Var.f26443a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                q2Var.f26443a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: b */
    static long m36035b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: a */
    static int m36031a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m36030a(p163g.p449j.p450a.p451a.p457d.p464g.C11077d6 r6, byte[] r7, int r8, int r9, p163g.p449j.p450a.p451a.p457d.p464g.C11270q2 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m36027a(r8, r7, r0, r10)
            int r8 = r10.f26443a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo28400a(r1, r2, r3, r4, r5)
            r6.mo28404c(r9)
            r10.f26445c = r9
            return r8
        L_0x0025:
            g.j.a.a.d.g.p4 r6 = p163g.p449j.p450a.p451a.p457d.p464g.C11258p4.m35930a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11284r2.m36030a(g.j.a.a.d.g.d6, byte[], int, int, g.j.a.a.d.g.q2):int");
    }

    /* renamed from: a */
    static int m36029a(C11077d6 d6Var, byte[] bArr, int i, int i2, int i3, C11270q2 q2Var) throws IOException {
        C11302s5 s5Var = (C11302s5) d6Var;
        Object newInstance = s5Var.newInstance();
        int a = s5Var.mo28895a(newInstance, bArr, i, i2, i3, q2Var);
        s5Var.mo28404c(newInstance);
        q2Var.f26445c = newInstance;
        return a;
    }

    /* renamed from: a */
    static int m36024a(int i, byte[] bArr, int i2, int i3, C11216m4<?> m4Var, C11270q2 q2Var) {
        C11139h4 h4Var = (C11139h4) m4Var;
        int a = m36033a(bArr, i2, q2Var);
        h4Var.mo28535g(q2Var.f26443a);
        while (a < i3) {
            int a2 = m36033a(bArr, a, q2Var);
            if (i != q2Var.f26443a) {
                break;
            }
            a = m36033a(bArr, a2, q2Var);
            h4Var.mo28535g(q2Var.f26443a);
        }
        return a;
    }

    /* renamed from: a */
    static int m36032a(byte[] bArr, int i, C11216m4<?> m4Var, C11270q2 q2Var) throws IOException {
        C11139h4 h4Var = (C11139h4) m4Var;
        int a = m36033a(bArr, i, q2Var);
        int i2 = q2Var.f26443a + a;
        while (a < i2) {
            a = m36033a(bArr, a, q2Var);
            h4Var.mo28535g(q2Var.f26443a);
        }
        if (a == i2) {
            return a;
        }
        throw C11258p4.m35930a();
    }

    /* renamed from: a */
    static int m36028a(C11077d6<?> d6Var, int i, byte[] bArr, int i2, int i3, C11216m4<?> m4Var, C11270q2 q2Var) throws IOException {
        int a = m36030a((C11077d6) d6Var, bArr, i2, i3, q2Var);
        m4Var.add(q2Var.f26445c);
        while (a < i3) {
            int a2 = m36033a(bArr, a, q2Var);
            if (i != q2Var.f26443a) {
                break;
            }
            a = m36030a((C11077d6) d6Var, bArr, a2, i3, q2Var);
            m4Var.add(q2Var.f26445c);
        }
        return a;
    }

    /* renamed from: a */
    static int m36026a(int i, byte[] bArr, int i2, int i3, C11400z6 z6Var, C11270q2 q2Var) throws C11258p4 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = m36034b(bArr, i2, q2Var);
                z6Var.mo29200a(i, (Object) Long.valueOf(q2Var.f26444b));
                return b;
            } else if (i4 == 1) {
                z6Var.mo29200a(i, (Object) Long.valueOf(m36035b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m36033a(bArr, i2, q2Var);
                int i5 = q2Var.f26443a;
                if (i5 < 0) {
                    throw C11258p4.m35931b();
                } else if (i5 <= bArr.length - a) {
                    if (i5 == 0) {
                        z6Var.mo29200a(i, (Object) C11342v2.f26574U);
                    } else {
                        z6Var.mo29200a(i, (Object) C11342v2.m36528a(bArr, a, i5));
                    }
                    return a + i5;
                } else {
                    throw C11258p4.m35930a();
                }
            } else if (i4 == 3) {
                C11400z6 e = C11400z6.m36844e();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m36033a(bArr, i2, q2Var);
                    int i8 = q2Var.f26443a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = m36026a(i7, bArr, a2, i3, e, q2Var);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C11258p4.m35937h();
                }
                z6Var.mo29200a(i, (Object) e);
                return i2;
            } else if (i4 == 5) {
                z6Var.mo29200a(i, (Object) Integer.valueOf(m36031a(bArr, i2)));
                return i2 + 4;
            } else {
                throw C11258p4.m35933d();
            }
        } else {
            throw C11258p4.m35933d();
        }
    }

    /* renamed from: a */
    static int m36025a(int i, byte[] bArr, int i2, int i3, C11270q2 q2Var) throws C11258p4 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m36034b(bArr, i2, q2Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m36033a(bArr, i2, q2Var) + q2Var.f26443a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m36033a(bArr, i2, q2Var);
                    i6 = q2Var.f26443a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m36025a(i6, bArr, i2, i3, q2Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C11258p4.m35937h();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C11258p4.m35933d();
            }
        } else {
            throw C11258p4.m35933d();
        }
    }
}
