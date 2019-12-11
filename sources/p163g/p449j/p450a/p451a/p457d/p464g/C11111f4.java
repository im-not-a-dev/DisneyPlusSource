package p163g.p449j.p450a.p451a.p457d.p464g;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: g.j.a.a.d.g.f4 */
public final class C11111f4 {

    /* renamed from: a */
    static final Charset f26198a = Charset.forName(Utf8Charset.NAME);

    /* renamed from: b */
    public static final byte[] f26199b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f26199b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f26199b;
        C11152i3.m35289a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    public static int m35148a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m35149a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m35151a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static boolean m35154a(C11259p5 p5Var) {
        return false;
    }

    /* renamed from: b */
    public static boolean m35155b(byte[] bArr) {
        return C11114f7.m35221a(bArr);
    }

    /* renamed from: c */
    public static String m35156c(byte[] bArr) {
        return new String(bArr, f26198a);
    }

    /* renamed from: a */
    static <T> T m35153a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static int m35150a(byte[] bArr) {
        int length = bArr.length;
        int a = m35147a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m35147a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m35152a(Object obj, Object obj2) {
        C11245o5 e = ((C11259p5) obj).mo28429e();
        e.mo28729a((C11259p5) obj2);
        return e.mo28445k0();
    }
}
