package p602m.p613d.p614a.p626n2;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;

/* renamed from: m.d.a.n2.j */
/* compiled from: X9IntegerConverter */
public class C13624j {
    /* renamed from: a */
    public int mo34845a(C13806d dVar) {
        return (dVar.mo35090j() + 7) / 8;
    }

    /* renamed from: a */
    public int mo34846a(C13812e eVar) {
        return (eVar.mo35108d() + 7) / 8;
    }

    /* renamed from: a */
    public byte[] mo34847a(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - bArr.length, bArr, 0, bArr.length);
            return bArr;
        } else if (i <= byteArray.length) {
            return byteArray;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, bArr2.length - byteArray.length, byteArray.length);
            return bArr2;
        }
    }
}
