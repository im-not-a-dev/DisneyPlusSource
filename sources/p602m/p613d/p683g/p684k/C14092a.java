package p602m.p613d.p683g.p684k;

import java.io.ByteArrayOutputStream;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.g.k.a */
/* compiled from: Base64 */
public class C14092a {

    /* renamed from: a */
    private static final C14095d f31112a = new C14093b();

    /* renamed from: a */
    public static byte[] m44493a(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 + 2) / 3) * 4);
        try {
            f31112a.mo35660a(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception encoding base64 string: ");
            sb.append(e.getMessage());
            throw new C14096e(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public static String m44494b(byte[] bArr) {
        return m44495b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static String m44495b(byte[] bArr, int i, int i2) {
        return C14090j.m44489b(m44493a(bArr, i, i2));
    }

    /* renamed from: a */
    public static byte[] m44492a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            f31112a.mo35662b(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("unable to decode base64 data: ");
            sb.append(e.getMessage());
            throw new C14094c(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public static byte[] m44491a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f31112a.mo35659a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("unable to decode base64 string: ");
            sb.append(e.getMessage());
            throw new C14094c(sb.toString(), e);
        }
    }
}
