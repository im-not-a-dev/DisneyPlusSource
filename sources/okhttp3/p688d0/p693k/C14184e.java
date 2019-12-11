package okhttp3.p688d0.p693k;

import java.io.IOException;
import okhttp3.p688d0.C14126e;
import okio.ByteString;

/* renamed from: okhttp3.d0.k.e */
/* compiled from: Http2 */
public final class C14184e {

    /* renamed from: a */
    static final ByteString f31571a = ByteString.m45615e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f31572b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f31573c = new String[64];

    /* renamed from: d */
    static final String[] f31574d = new String[256];

    static {
        String str;
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f31574d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C14126e.m44817a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f31573c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr2 = {1};
        strArr2[8] = "PADDED";
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            str = "|PADDED";
            if (i3 >= length) {
                break;
            }
            int i4 = iArr2[i3];
            String[] strArr3 = f31573c;
            int i5 = i4 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(f31573c[i4]);
            sb.append(str);
            strArr3[i5] = sb.toString();
            i3++;
        }
        String[] strArr4 = f31573c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        for (int i6 : new int[]{4, 32, 36}) {
            for (int i7 : iArr2) {
                String[] strArr5 = f31573c;
                int i8 = i7 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f31573c[i7]);
                sb2.append('|');
                sb2.append(f31573c[i6]);
                strArr5[i8] = sb2.toString();
                String[] strArr6 = f31573c;
                int i9 = i8 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f31573c[i7]);
                sb3.append('|');
                sb3.append(f31573c[i6]);
                sb3.append(str);
                strArr6[i9] = sb3.toString();
            }
        }
        while (true) {
            String[] strArr7 = f31573c;
            if (i < strArr7.length) {
                if (strArr7[i] == null) {
                    strArr7[i] = f31574d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C14184e() {
    }

    /* renamed from: a */
    static IllegalArgumentException m45118a(String str, Object... objArr) {
        throw new IllegalArgumentException(C14126e.m44817a(str, objArr));
    }

    /* renamed from: b */
    static IOException m45121b(String str, Object... objArr) throws IOException {
        throw new IOException(C14126e.m44817a(str, objArr));
    }

    /* renamed from: a */
    static String m45120a(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f31572b;
        String a = b < strArr.length ? strArr[b] : C14126e.m44817a("0x%02x", Byte.valueOf(b));
        String a2 = m45119a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = a2;
        return C14126e.m44817a("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: a */
    static String m45119a(byte b, byte b2) {
        String str;
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    str = "ACK";
                } else {
                    str = f31574d[b2];
                }
                return str;
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = f31573c;
                String str2 = b2 < strArr.length ? strArr[b2] : f31574d[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                }
                return str2.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f31574d[b2];
    }
}
