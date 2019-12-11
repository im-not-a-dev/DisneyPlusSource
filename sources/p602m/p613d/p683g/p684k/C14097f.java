package p602m.p613d.p683g.p684k;

import java.io.ByteArrayOutputStream;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.g.k.f */
/* compiled from: Hex */
public class C14097f {

    /* renamed from: a */
    private static final C14095d f31118a = new C14098g();

    /* renamed from: a */
    public static byte[] m44508a(byte[] bArr) {
        return m44509a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static String m44510b(byte[] bArr) {
        return m44511b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static byte[] m44509a(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f31118a.mo35660a(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception encoding Hex string: ");
            sb.append(e.getMessage());
            throw new C14096e(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public static String m44511b(byte[] bArr, int i, int i2) {
        return C14090j.m44489b(m44509a(bArr, i, i2));
    }

    /* renamed from: a */
    public static byte[] m44507a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f31118a.mo35659a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception decoding Hex string: ");
            sb.append(e.getMessage());
            throw new C14094c(sb.toString(), e);
        }
    }
}
