package p163g.p174d.p178b.p179a0;

import java.io.DataInput;

/* renamed from: g.d.b.a0.g */
/* compiled from: DataInputEx.kt */
public final class C4832g {
    /* renamed from: a */
    public static final int m16798a(DataInput dataInput) {
        int readInt = dataInput.readInt();
        return (readInt >>> 24) | (readInt << 24) | ((readInt >> 8) & 65280) | ((readInt << 8) & 16711680);
    }
}
