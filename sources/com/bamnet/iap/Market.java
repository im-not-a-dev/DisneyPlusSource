package com.bamnet.iap;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Keep;
import com.bamnet.iap.BamnetIAPProduct.BamnetIAPProductType;
import java.util.List;

public interface Market {

    @Keep
    public enum MarketType {
        GOOGLE,
        AMAZON,
        MOCK
    }

    /* renamed from: a */
    void mo7216a();

    /* renamed from: a */
    void mo7217a(Activity activity, String str);

    /* renamed from: a */
    void mo7218a(Activity activity, String str, C1621a aVar);

    /* renamed from: a */
    void mo7219a(BamnetIAPPurchase bamnetIAPPurchase);

    @Deprecated
    /* renamed from: a */
    void mo7220a(String str, BamnetIAPProductType bamnetIAPProductType, int i, String str2);

    /* renamed from: a */
    void mo7221a(List<String> list);

    @Deprecated
    /* renamed from: a */
    boolean mo7222a(int i, int i2, Intent intent);

    void cleanup();
}
