package p602m.p613d.p653e.p654a;

import java.math.BigInteger;

/* renamed from: m.d.e.a.r */
/* compiled from: WNafL2RMultiplier */
public class C13831r extends C13803a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35215a(int i) {
        return C13833t.m42628a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35059b(C13816g gVar, BigInteger bigInteger) {
        C13816g gVar2;
        int max = Math.max(2, Math.min(16, mo35215a(bigInteger.bitLength())));
        C13832s a = C13833t.m42632a(gVar, max, true);
        C13816g[] a2 = a.mo35218a();
        C13816g[] b = a.mo35220b();
        int[] a3 = C13833t.m42635a(max, bigInteger);
        C13816g k = gVar.mo35148f().mo35091k();
        int length = a3.length;
        if (length > 1) {
            length--;
            int i = a3[length];
            int i2 = i >> 16;
            int i3 = i & 65535;
            int abs = Math.abs(i2);
            C13816g[] gVarArr = i2 < 0 ? b : a2;
            if ((abs << 2) < (1 << max)) {
                byte b2 = C13826m.f30680V[abs];
                int i4 = max - b2;
                gVar2 = gVarArr[((1 << (max - 1)) - 1) >>> 1].mo35134a(gVarArr[(((abs ^ (1 << (b2 - 1))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                gVar2 = gVarArr[abs >>> 1];
            }
            k = gVar2.mo35138b(i3);
        }
        while (length > 0) {
            length--;
            int i5 = a3[length];
            int i6 = i5 >> 16;
            k = k.mo35145d((i6 < 0 ? b : a2)[Math.abs(i6) >>> 1]).mo35138b(i5 & 65535);
        }
        return k;
    }
}
