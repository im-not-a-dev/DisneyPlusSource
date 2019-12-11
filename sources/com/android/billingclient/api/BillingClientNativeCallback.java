package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;

class BillingClientNativeCallback implements C1383b, C1413f, C1424k, C1425l, C1430p, C1431q, C1432r, C1438u {

    /* renamed from: c */
    private final long f5070c = 0;

    BillingClientNativeCallback() {
    }

    public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, String str, C1429o[] oVarArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, String str, C1426m[] mVarArr);

    public static native void nativeOnQueryPurchasesResponse(int i, String str, C1426m[] mVarArr, long j);

    public static native void nativeOnRewardResponse(int i, String str, long j);

    public static native void nativeOnSkuDetailsResponse(int i, String str, C1433s[] sVarArr, long j);

    /* renamed from: a */
    public void mo6439a(C1417h hVar, List<C1433s> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(hVar.mo6504b(), hVar.mo6503a(), (C1433s[]) list.toArray(new C1433s[list.size()]), this.f5070c);
    }

    /* renamed from: b */
    public void mo6440b(C1417h hVar) {
        nativeOnBillingSetupFinished(hVar.mo6504b(), hVar.mo6503a(), this.f5070c);
    }

    /* renamed from: g */
    public void mo6442g() {
        nativeOnBillingServiceDisconnected();
    }

    /* renamed from: b */
    public void mo6441b(C1417h hVar, List<C1426m> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(hVar.mo6504b(), hVar.mo6503a(), (C1426m[]) list.toArray(new C1426m[list.size()]));
    }

    /* renamed from: a */
    public void mo6437a(C1417h hVar) {
        nativeOnAcknowledgePurchaseResponse(hVar.mo6504b(), hVar.mo6503a(), this.f5070c);
    }

    /* renamed from: a */
    public void mo6438a(C1417h hVar, String str) {
        nativeOnConsumePurchaseResponse(hVar.mo6504b(), hVar.mo6503a(), str, this.f5070c);
    }
}
