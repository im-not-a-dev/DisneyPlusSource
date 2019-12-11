package com.bamtech.sdk4.purchase.bamnet.models;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.Market.MarketType;
import com.bamtech.sdk4.purchase.ReceiptClaimBody;
import com.bamtech.sdk4.purchase.bamnet.BamnetClaim;
import com.bamtech.sdk4.purchase.bamnet.BamnetClaimException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptClaimBody;", "Lcom/bamtech/sdk4/purchase/ReceiptClaimBody;", "()V", "Factory", "Lcom/bamtech/sdk4/purchase/bamnet/models/AmazonReceiptClaimBody;", "Lcom/bamtech/sdk4/purchase/bamnet/models/GoogleReceiptClaimBody;", "Lcom/bamtech/sdk4/purchase/bamnet/models/MockReceiptClaimBody;", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetReceiptClaimBody.kt */
public abstract class BamnetReceiptClaimBody implements ReceiptClaimBody {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptClaimBody$Factory;", "", "()V", "receiptFactory", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem$Factory;", "create", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptClaimBody;", "receiptList", "", "Lcom/bamnet/iap/BamnetIAPPurchase;", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BamnetReceiptClaimBody.kt */
    public static final class Factory {
        private final com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptItem.Factory receiptFactory = new com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptItem.Factory();

        @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[MarketType.values().length];

            static {
                $EnumSwitchMapping$0[MarketType.AMAZON.ordinal()] = 1;
                $EnumSwitchMapping$0[MarketType.GOOGLE.ordinal()] = 2;
                $EnumSwitchMapping$0[MarketType.MOCK.ordinal()] = 3;
            }
        }

        public final BamnetReceiptClaimBody create(List<? extends BamnetIAPPurchase> list) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
                for (BamnetIAPPurchase create : list) {
                    arrayList.add(this.receiptFactory.create(create));
                }
                MarketType b = ((BamnetIAPPurchase) C13199w.m40589f((List) list)).mo7206b();
                if (b != null) {
                    int i = WhenMappings.$EnumSwitchMapping$0[b.ordinal()];
                    if (i == 1) {
                        JSONObject d = ((BamnetIAPPurchase) C13199w.m40589f((List) list)).mo7209d();
                        Intrinsics.checkReturnedValueIsNotNull((Object) d, "receiptList.first().receiptJSON");
                        return new AmazonReceiptClaimBody(BamnetReceiptItemKt.safeGetString(d, BamnetReceiptItem.Companion.getAMAZON_USER_ID()), arrayList);
                    } else if (i == 2) {
                        return new GoogleReceiptClaimBody(arrayList);
                    } else {
                        if (i == 3) {
                            return new MockReceiptClaimBody(arrayList);
                        }
                    }
                }
                throw new BamnetClaimException(BamnetClaim.Companion.getINVALID_STORE());
            }
            throw new BamnetClaimException(BamnetClaim.Companion.getMISSING_PURCHASES());
        }
    }

    private BamnetReceiptClaimBody() {
    }

    public /* synthetic */ BamnetReceiptClaimBody(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
