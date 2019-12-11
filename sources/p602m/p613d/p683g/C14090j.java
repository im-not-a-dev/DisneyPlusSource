package p602m.p613d.p683g;

import java.security.AccessController;
import java.security.PrivilegedAction;
import net.danlew.android.joda.DateUtils;

/* renamed from: m.d.g.j */
/* compiled from: Strings */
public final class C14090j {

    /* renamed from: a */
    private static String f31111a;

    /* renamed from: m.d.g.j$a */
    /* compiled from: Strings */
    static class C14091a implements PrivilegedAction<String> {
        C14091a() {
        }

        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            f31111a = (String) AccessController.doPrivileged(new C14091a());
        } catch (Exception unused) {
            try {
                f31111a = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                f31111a = "\n";
            }
        }
    }

    /* renamed from: a */
    public static String m44486a(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* renamed from: b */
    public static String m44488b(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* renamed from: c */
    public static String m44490c(byte[] bArr) {
        char c;
        int i;
        byte b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            i4++;
            if ((bArr[i3] & 240) == 240) {
                i4++;
                i3 += 4;
            } else {
                i3 = (bArr[i3] & 224) == 224 ? i3 + 3 : (bArr[i3] & 192) == 192 ? i3 + 2 : i3 + 1;
            }
        }
        char[] cArr = new char[i4];
        int i5 = 0;
        while (i2 < bArr.length) {
            if ((bArr[i2] & 240) == 240) {
                int i6 = (((((bArr[i2] & 3) << 18) | ((bArr[i2 + 1] & 63) << 12)) | ((bArr[i2 + 2] & 63) << 6)) | (bArr[i2 + 3] & 63)) - DateUtils.FORMAT_ABBREV_MONTH;
                c = (char) ((i6 & 1023) | 56320);
                int i7 = i5 + 1;
                cArr[i5] = (char) (55296 | (i6 >> 10));
                i2 += 4;
                i5 = i7;
            } else if ((bArr[i2] & 224) == 224) {
                c = (char) (((bArr[i2] & 15) << 12) | ((bArr[i2 + 1] & 63) << 6) | (bArr[i2 + 2] & 63));
                i2 += 3;
            } else {
                if ((bArr[i2] & 208) == 208) {
                    i = (bArr[i2] & 31) << 6;
                    b = bArr[i2 + 1];
                } else if ((bArr[i2] & 192) == 192) {
                    i = (bArr[i2] & 31) << 6;
                    b = bArr[i2 + 1];
                } else {
                    c = (char) (bArr[i2] & 255);
                    i2++;
                }
                c = (char) (i | (b & 63));
                i2 += 2;
            }
            int i8 = i5 + 1;
            cArr[i5] = c;
            i5 = i8;
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static char[] m44487a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i != cArr.length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    /* renamed from: b */
    public static String m44489b(byte[] bArr) {
        return new String(m44487a(bArr));
    }

    /* renamed from: a */
    public static String m44485a() {
        return f31111a;
    }
}
