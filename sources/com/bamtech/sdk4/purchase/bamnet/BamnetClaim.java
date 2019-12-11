package com.bamtech.sdk4.purchase.bamnet;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.Market.MarketType;
import com.bamtech.sdk4.purchase.ReceiptClaim;
import com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptClaimBody.Factory;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/BamnetClaim;", "Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "()V", "claimFactory", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptClaimBody$Factory;", "getClaimFactory", "()Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptClaimBody$Factory;", "getStore", "", "purchase", "Lcom/bamnet/iap/BamnetIAPPurchase;", "Companion", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetClaim.kt */
public abstract class BamnetClaim implements ReceiptClaim {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final String FAILED_RESPONSE = FAILED_RESPONSE;
    /* access modifiers changed from: private */
    public static final String INVALID_STORE = INVALID_STORE;
    /* access modifiers changed from: private */
    public static final String MISSING_DATA = MISSING_DATA;
    /* access modifiers changed from: private */
    public static final String MISSING_PURCHASES = MISSING_PURCHASES;
    private final Factory claimFactory = new Factory();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/BamnetClaim$Companion;", "", "()V", "FAILED_RESPONSE", "", "getFAILED_RESPONSE", "()Ljava/lang/String;", "INVALID_STORE", "getINVALID_STORE", "MISSING_DATA", "getMISSING_DATA", "MISSING_PURCHASES", "getMISSING_PURCHASES", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BamnetClaim.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getFAILED_RESPONSE() {
            return BamnetClaim.FAILED_RESPONSE;
        }

        public final String getINVALID_STORE() {
            return BamnetClaim.INVALID_STORE;
        }

        public final String getMISSING_DATA() {
            return BamnetClaim.MISSING_DATA;
        }

        public final String getMISSING_PURCHASES() {
            return BamnetClaim.MISSING_PURCHASES;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[MarketType.values().length];

        static {
            $EnumSwitchMapping$0[MarketType.AMAZON.ordinal()] = 1;
            $EnumSwitchMapping$0[MarketType.GOOGLE.ordinal()] = 2;
            $EnumSwitchMapping$0[MarketType.MOCK.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: protected */
    public final Factory getClaimFactory() {
        return this.claimFactory;
    }

    /* access modifiers changed from: protected */
    public final String getStore(BamnetIAPPurchase bamnetIAPPurchase) {
        MarketType b = bamnetIAPPurchase.mo7206b();
        if (b != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[b.ordinal()];
            if (i == 1) {
                return "amazon";
            }
            if (i == 2) {
                return "google";
            }
            if (i == 3) {
                return "mock";
            }
        }
        throw new BamnetClaimException(INVALID_STORE);
    }
}
