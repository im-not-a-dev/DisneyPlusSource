package okio.p698z;

import java.util.Arrays;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import okio.ByteString;
import okio.C14271a;
import okio.C14272b;
import okio.C14273c;

/* renamed from: okio.z.a */
/* compiled from: ByteString.kt */
public final class C14306a {

    /* renamed from: a */
    private static final char[] f31919a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static final ByteString f31920b = ByteString.f31852X.mo36398a(new byte[0]);

    /* renamed from: a */
    public static final String m45828a(ByteString byteString) {
        return C14271a.m45644a(byteString.mo36379b(), null, 1, null);
    }

    /* renamed from: b */
    public static final int m45836b(ByteString byteString) {
        return byteString.mo36379b().length;
    }

    /* renamed from: c */
    public static final int m45839c(ByteString byteString) {
        int c = byteString.mo36380c();
        if (c != 0) {
            return c;
        }
        byteString.mo36381c(Arrays.hashCode(byteString.mo36379b()));
        return byteString.mo36380c();
    }

    /* renamed from: d */
    public static final String m45841d(ByteString byteString) {
        byte[] b;
        char[] cArr = new char[(byteString.mo36379b().length * 2)];
        int i = 0;
        for (byte b2 : byteString.mo36379b()) {
            int i2 = i + 1;
            char[] cArr2 = f31919a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static final byte[] m45842e(ByteString byteString) {
        return byteString.mo36379b();
    }

    /* renamed from: f */
    public static final ByteString m45843f(ByteString byteString) {
        for (int i = 0; i < byteString.mo36379b().length; i++) {
            byte b = byteString.mo36379b()[i];
            byte b2 = (byte) 65;
            if (b >= b2) {
                byte b3 = (byte) 90;
                if (b <= b3) {
                    byte[] b4 = byteString.mo36379b();
                    byte[] copyOf = Arrays.copyOf(b4, b4.length);
                    C12880j.m40222a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b5 = copyOf[i2];
                        if (b5 >= b2 && b5 <= b3) {
                            copyOf[i2] = (byte) (b5 + 32);
                        }
                    }
                    return new ByteString(copyOf);
                }
            }
        }
        return byteString;
    }

    /* renamed from: g */
    public static final byte[] m45844g(ByteString byteString) {
        byte[] b = byteString.mo36379b();
        byte[] copyOf = Arrays.copyOf(b, b.length);
        C12880j.m40222a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: h */
    public static final String m45845h(ByteString byteString) {
        String str;
        String str2;
        if (byteString.mo36379b().length == 0) {
            return "[size=0]";
        }
        int a = m45827a(byteString.mo36379b(), 64);
        String str3 = "…]";
        String str4 = "[size=";
        if (a == -1) {
            if (byteString.mo36379b().length <= 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[hex=");
                sb.append(byteString.mo36386f());
                sb.append(']');
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(byteString.mo36379b().length);
                sb2.append(" hex=");
                sb2.append(m45831a(byteString, 0, 64).mo36386f());
                sb2.append(str3);
                str2 = sb2.toString();
            }
            return str2;
        }
        ByteString byteString2 = byteString;
        String m = byteString.mo36394m();
        if (m != null) {
            String substring = m.substring(0, a);
            C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String a2 = C12832w.m40117a(C12832w.m40117a(C12832w.m40117a(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (a < m.length()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(byteString.mo36379b().length);
                sb3.append(" text=");
                sb3.append(a2);
                sb3.append(str3);
                str = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[text=");
                sb4.append(a2);
                sb4.append(']');
                str = sb4.toString();
            }
            return str;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: i */
    public static final String m45846i(ByteString byteString) {
        String e = byteString.mo36384e();
        if (e != null) {
            return e;
        }
        String a = C14272b.m45646a(byteString.mo36387g());
        byteString.mo36377b(a);
        return a;
    }

    /* renamed from: a */
    public static final ByteString m45831a(ByteString byteString, int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 <= byteString.mo36379b().length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && i2 == byteString.mo36379b().length) {
                    return byteString;
                } else {
                    byte[] bArr = new byte[i3];
                    C14272b.m45647a(byteString.mo36379b(), i, bArr, 0, i3);
                    return new ByteString(bArr);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > length(");
                sb.append(byteString.mo36379b().length);
                sb.append(')');
                throw new IllegalArgumentException(sb.toString().toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    /* renamed from: b */
    public static final boolean m45838b(ByteString byteString, ByteString byteString2) {
        return byteString.mo36374a(0, byteString2, 0, byteString2.size());
    }

    /* renamed from: b */
    public static final ByteString m45837b(String str) {
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m45825a(str.charAt(i2)) << 4) + m45825a(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected hex string: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: c */
    public static final ByteString m45840c(String str) {
        ByteString byteString = new ByteString(C14272b.m45648a(str));
        byteString.mo36377b(str);
        return byteString;
    }

    /* renamed from: a */
    public static final byte m45824a(ByteString byteString, int i) {
        return byteString.mo36379b()[i];
    }

    /* renamed from: a */
    public static final boolean m45833a(ByteString byteString, int i, ByteString byteString2, int i2, int i3) {
        return byteString2.mo36375a(i2, byteString.mo36379b(), i, i3);
    }

    /* renamed from: a */
    public static final boolean m45834a(ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= byteString.mo36379b().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C14273c.m45652a(byteString.mo36379b(), i, bArr, i2, i3);
    }

    /* renamed from: a */
    public static final boolean m45835a(ByteString byteString, Object obj) {
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.mo36379b().length && byteString2.mo36375a(0, byteString.mo36379b(), 0, byteString.mo36379b().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final int m45826a(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i < min) {
                byte a = byteString.mo36369a(i) & 255;
                byte a2 = byteString2.mo36369a(i) & 255;
                if (a == a2) {
                    i++;
                } else {
                    if (a >= a2) {
                        i2 = 1;
                    }
                    return i2;
                }
            } else if (size == size2) {
                return 0;
            } else {
                if (size >= size2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    /* renamed from: a */
    public static final ByteString m45829a() {
        return f31920b;
    }

    /* renamed from: a */
    public static final ByteString m45832a(byte[] bArr) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C12880j.m40222a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    /* renamed from: a */
    public static final ByteString m45830a(String str) {
        byte[] a = C14271a.m45645a(str);
        if (a != null) {
            return new ByteString(a);
        }
        return null;
    }

    /* renamed from: a */
    private static final int m45825a(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected hex digit: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c - c2) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int m45827a(byte[] r20, int r21) {
        /*
            r0 = r20
            r1 = r21
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x01df
            byte r7 = r0[r4]
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x0078
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0038
            if (r7 == r11) goto L_0x0038
            if (r7 < 0) goto L_0x002e
            if (r10 >= r7) goto L_0x0033
        L_0x002e:
            if (r8 <= r7) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            if (r9 < r7) goto L_0x0035
        L_0x0033:
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r6 != 0) goto L_0x003a
        L_0x0038:
            if (r7 != r12) goto L_0x003b
        L_0x003a:
            return r16
        L_0x003b:
            if (r7 >= r14) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 2
        L_0x0040:
            int r5 = r5 + r6
            int r4 = r4 + 1
            r6 = r5
        L_0x0044:
            r5 = r18
            if (r4 >= r2) goto L_0x0072
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0072
            int r7 = r4 + 1
            byte r4 = r0[r4]
            int r18 = r5 + 1
            if (r5 != r1) goto L_0x0055
            return r6
        L_0x0055:
            if (r4 == r13) goto L_0x0067
            if (r4 == r11) goto L_0x0067
            if (r4 < 0) goto L_0x005d
            if (r10 >= r4) goto L_0x0062
        L_0x005d:
            if (r8 <= r4) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            if (r9 < r4) goto L_0x0064
        L_0x0062:
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            if (r5 != 0) goto L_0x0069
        L_0x0067:
            if (r4 != r12) goto L_0x006a
        L_0x0069:
            return r16
        L_0x006a:
            if (r4 >= r14) goto L_0x006e
            r4 = 1
            goto L_0x006f
        L_0x006e:
            r4 = 2
        L_0x006f:
            int r6 = r6 + r4
            r4 = r7
            goto L_0x0044
        L_0x0072:
            r19 = r6
            r6 = r5
            r5 = r19
            goto L_0x0008
        L_0x0078:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00cb
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0087
            if (r6 != r1) goto L_0x0086
            return r5
        L_0x0086:
            return r16
        L_0x0087:
            byte r7 = r0[r4]
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0091
            r15 = 1
            goto L_0x0092
        L_0x0091:
            r15 = 0
        L_0x0092:
            if (r15 != 0) goto L_0x0098
            if (r6 != r1) goto L_0x0097
            return r5
        L_0x0097:
            return r16
        L_0x0098:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x00a3
            if (r6 != r1) goto L_0x00a2
            return r5
        L_0x00a2:
            return r16
        L_0x00a3:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00a8
            return r5
        L_0x00a8:
            if (r3 == r13) goto L_0x00ba
            if (r3 == r11) goto L_0x00ba
            if (r3 < 0) goto L_0x00b0
            if (r10 >= r3) goto L_0x00b5
        L_0x00b0:
            if (r8 <= r3) goto L_0x00b3
            goto L_0x00b7
        L_0x00b3:
            if (r9 < r3) goto L_0x00b7
        L_0x00b5:
            r6 = 1
            goto L_0x00b8
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            if (r6 != 0) goto L_0x00bc
        L_0x00ba:
            if (r3 != r12) goto L_0x00bd
        L_0x00bc:
            return r16
        L_0x00bd:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r17 = 2
        L_0x00c4:
            int r5 = r5 + r17
            int r4 = r4 + 2
        L_0x00c8:
            r6 = r7
            goto L_0x0008
        L_0x00cb:
            int r3 = r7 >> 4
            if (r3 != r15) goto L_0x0143
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00d7
            if (r6 != r1) goto L_0x00d6
            return r5
        L_0x00d6:
            return r16
        L_0x00d7:
            byte r7 = r0[r4]
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r12 = r15 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x00e3
            r12 = 1
            goto L_0x00e4
        L_0x00e3:
            r12 = 0
        L_0x00e4:
            if (r12 != 0) goto L_0x00ea
            if (r6 != r1) goto L_0x00e9
            return r5
        L_0x00e9:
            return r16
        L_0x00ea:
            byte r3 = r0[r3]
            r12 = r3 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x00f2
            r12 = 1
            goto L_0x00f3
        L_0x00f2:
            r12 = 0
        L_0x00f3:
            if (r12 != 0) goto L_0x00f9
            if (r6 != r1) goto L_0x00f8
            return r5
        L_0x00f8:
            return r16
        L_0x00f9:
            r12 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r12
            int r12 = r15 << 6
            r3 = r3 ^ r12
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x010b
            if (r6 != r1) goto L_0x010a
            return r5
        L_0x010a:
            return r16
        L_0x010b:
            r7 = 57343(0xdfff, float:8.0355E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r12 <= r3) goto L_0x0114
            goto L_0x011a
        L_0x0114:
            if (r7 < r3) goto L_0x011a
            if (r6 != r1) goto L_0x0119
            return r5
        L_0x0119:
            return r16
        L_0x011a:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x011f
            return r5
        L_0x011f:
            if (r3 == r13) goto L_0x0131
            if (r3 == r11) goto L_0x0131
            if (r3 < 0) goto L_0x0127
            if (r10 >= r3) goto L_0x012c
        L_0x0127:
            if (r8 <= r3) goto L_0x012a
            goto L_0x012e
        L_0x012a:
            if (r9 < r3) goto L_0x012e
        L_0x012c:
            r6 = 1
            goto L_0x012f
        L_0x012e:
            r6 = 0
        L_0x012f:
            if (r6 != 0) goto L_0x0136
        L_0x0131:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0137
        L_0x0136:
            return r16
        L_0x0137:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r17 = 2
        L_0x013e:
            int r5 = r5 + r17
            int r4 = r4 + 3
            goto L_0x00c8
        L_0x0143:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x01db
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x014f
            if (r6 != r1) goto L_0x014e
            return r5
        L_0x014e:
            return r16
        L_0x014f:
            byte r7 = r0[r4]
            int r12 = r4 + 1
            byte r12 = r0[r12]
            r15 = r12 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x015b
            r15 = 1
            goto L_0x015c
        L_0x015b:
            r15 = 0
        L_0x015c:
            if (r15 != 0) goto L_0x0162
            if (r6 != r1) goto L_0x0161
            return r5
        L_0x0161:
            return r16
        L_0x0162:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x016c
            r9 = 1
            goto L_0x016d
        L_0x016c:
            r9 = 0
        L_0x016d:
            if (r9 != 0) goto L_0x0173
            if (r6 != r1) goto L_0x0172
            return r5
        L_0x0172:
            return r16
        L_0x0173:
            byte r3 = r0[r3]
            r9 = r3 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x017b
            r9 = 1
            goto L_0x017c
        L_0x017b:
            r9 = 0
        L_0x017c:
            if (r9 != 0) goto L_0x0182
            if (r6 != r1) goto L_0x0181
            return r5
        L_0x0181:
            return r16
        L_0x0182:
            r9 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r9
            int r9 = r15 << 6
            r3 = r3 ^ r9
            int r9 = r12 << 12
            r3 = r3 ^ r9
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x0198
            if (r6 != r1) goto L_0x0197
            return r5
        L_0x0197:
            return r16
        L_0x0198:
            r7 = 57343(0xdfff, float:8.0355E-41)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 <= r3) goto L_0x01a1
            goto L_0x01a7
        L_0x01a1:
            if (r7 < r3) goto L_0x01a7
            if (r6 != r1) goto L_0x01a6
            return r5
        L_0x01a6:
            return r16
        L_0x01a7:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01af
            if (r6 != r1) goto L_0x01ae
            return r5
        L_0x01ae:
            return r16
        L_0x01af:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01b4
            return r5
        L_0x01b4:
            if (r3 == r13) goto L_0x01c8
            if (r3 == r11) goto L_0x01c8
            if (r3 < 0) goto L_0x01bc
            if (r10 >= r3) goto L_0x01c3
        L_0x01bc:
            if (r8 <= r3) goto L_0x01bf
            goto L_0x01c5
        L_0x01bf:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x01c5
        L_0x01c3:
            r6 = 1
            goto L_0x01c6
        L_0x01c5:
            r6 = 0
        L_0x01c6:
            if (r6 != 0) goto L_0x01cd
        L_0x01c8:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x01ce
        L_0x01cd:
            return r16
        L_0x01ce:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r17 = 2
        L_0x01d5:
            int r5 = r5 + r17
            int r4 = r4 + 4
            goto L_0x00c8
        L_0x01db:
            if (r6 != r1) goto L_0x01de
            return r5
        L_0x01de:
            return r16
        L_0x01df:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.p698z.C14306a.m45827a(byte[], int):int");
    }
}
