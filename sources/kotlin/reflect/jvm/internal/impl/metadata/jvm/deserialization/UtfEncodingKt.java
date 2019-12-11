package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.C13147x;

/* compiled from: utfEncoding.kt */
public final class UtfEncodingKt {
    public static final byte[] stringsToBytes(String[] strArr) {
        int i;
        boolean z = false;
        int i2 = 0;
        for (String length : strArr) {
            i2 += length.length();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (String str : strArr) {
            int length2 = str.length() - 1;
            if (length2 >= 0) {
                int i4 = 0;
                while (true) {
                    i = i3 + 1;
                    bArr[i3] = (byte) str.charAt(i4);
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
                i3 = i;
            }
        }
        if (i3 == bArr.length) {
            z = true;
        }
        if (!C13147x.f29590a || z) {
            return bArr;
        }
        throw new AssertionError("Should have reached the end");
    }
}
