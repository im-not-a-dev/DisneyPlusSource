package okio;

import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12801c;

/* renamed from: okio.b */
/* compiled from: -Platform.kt */
public final class C14272b {
    /* renamed from: a */
    public static final void m45647a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    /* renamed from: a */
    public static final String m45646a(byte[] bArr) {
        return new String(bArr, C12801c.f29474a);
    }

    /* renamed from: a */
    public static final byte[] m45648a(String str) {
        byte[] bytes = str.getBytes(C12801c.f29474a);
        Intrinsics.checkReturnedValueIsNotNull((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
