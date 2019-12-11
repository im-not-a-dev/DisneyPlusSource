package p163g.p449j.p450a.p451a.p457d.p464g;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;

/* renamed from: g.j.a.a.d.g.c8 */
public final class C11063c8 {

    /* renamed from: a */
    protected static final Charset f26115a = Charset.forName(Utf8Charset.NAME);

    /* renamed from: b */
    public static final Object f26116b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    /* renamed from: a */
    public static boolean m34933a(Object[] objArr, Object[] objArr2) {
        int i;
        int length = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            i = 0;
        } else {
            i = objArr2.length;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                while (i3 < i && objArr2[i3] == null) {
                    i3++;
                }
                boolean z = i2 >= length;
                boolean z2 = i3 >= i;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i2++;
                i3++;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m34931a(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m34932a(C11388y7 y7Var, C11388y7 y7Var2) {
        C11029a8 a8Var = y7Var.f26656b;
        if (a8Var != null) {
            y7Var2.f26656b = (C11029a8) a8Var.clone();
        }
    }
}
