package com.bamnet.iap.p035c.p036c;

import com.bamnet.iap.BamnetIAPResult;

/* renamed from: com.bamnet.iap.c.c.b */
/* compiled from: GoogleBillingExt.kt */
public final class C1627b {
    /* renamed from: a */
    public static final int m7594a(int i) {
        switch (i) {
            case -2:
                return 10;
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            case 6:
                return 8;
            case 7:
                return 7;
            case 8:
                return 6;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public static final BamnetIAPResult m7595a(Throwable th) {
        BamnetIAPResult b = m7596b(th);
        return b.mo7212b() == -1 ? new BamnetIAPResult(3, b.mo7211a()) : b;
    }

    /* renamed from: b */
    public static final BamnetIAPResult m7596b(Throwable th) {
        if (!(th instanceof C1646f)) {
            return new BamnetIAPResult(-1, "");
        }
        C1646f fVar = (C1646f) th;
        return new BamnetIAPResult(m7594a(fVar.mo7282b()), fVar.mo7281a());
    }
}
