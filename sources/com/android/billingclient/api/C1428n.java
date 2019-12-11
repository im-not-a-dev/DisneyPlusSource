package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C1417h.C1419b;
import java.util.ArrayList;
import p163g.p166b.p167a.p168a.C4789a;

/* renamed from: com.android.billingclient.api.n */
/* compiled from: PurchaseApiResponseChecker */
final class C1428n {
    /* renamed from: a */
    static C1417h m6876a(Bundle bundle, String str, String str2) {
        C1417h hVar = C1420i.f5182i;
        if (bundle == null) {
            C4789a.m16681c(str, String.format("%s got null owned items list", new Object[]{str2}));
            return hVar;
        }
        int b = C4789a.m16678b(bundle, str);
        String a = C4789a.m16675a(bundle, str);
        C1419b c = C1417h.m6850c();
        c.mo6505a(b);
        c.mo6506a(a);
        C1417h a2 = c.mo6507a();
        if (b != 0) {
            C4789a.m16681c(str, String.format("%s failed. Response code: %s", new Object[]{str2, Integer.valueOf(b)}));
            return a2;
        }
        String str3 = "INAPP_PURCHASE_ITEM_LIST";
        if (bundle.containsKey(str3)) {
            String str4 = "INAPP_PURCHASE_DATA_LIST";
            if (bundle.containsKey(str4)) {
                String str5 = "INAPP_DATA_SIGNATURE_LIST";
                if (bundle.containsKey(str5)) {
                    ArrayList stringArrayList = bundle.getStringArrayList(str3);
                    ArrayList stringArrayList2 = bundle.getStringArrayList(str4);
                    ArrayList stringArrayList3 = bundle.getStringArrayList(str5);
                    if (stringArrayList == null) {
                        C4789a.m16681c(str, String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str2}));
                        return hVar;
                    } else if (stringArrayList2 == null) {
                        C4789a.m16681c(str, String.format("Bundle returned from %s contains null purchases list.", new Object[]{str2}));
                        return hVar;
                    } else if (stringArrayList3 != null) {
                        return C1420i.f5185l;
                    } else {
                        C4789a.m16681c(str, String.format("Bundle returned from %s contains null signatures list.", new Object[]{str2}));
                        return hVar;
                    }
                }
            }
        }
        C4789a.m16681c(str, String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str2}));
        return hVar;
    }
}
