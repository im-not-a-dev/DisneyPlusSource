package com.bamtech.sdk4.purchase.bamnet.models;

import android.util.Base64;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.Market.MarketType;
import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.purchase.bamnet.BamnetClaim;
import com.bamtech.sdk4.purchase.bamnet.BamnetClaimException;
import java.nio.charset.Charset;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12801c;
import org.json.JSONObject;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem;", "", "()V", "Companion", "Factory", "Lcom/bamtech/sdk4/purchase/bamnet/models/AmazonReceipt;", "Lcom/bamtech/sdk4/purchase/bamnet/models/GoogleReceipt;", "Lcom/bamtech/sdk4/purchase/bamnet/models/MockReceipt;", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetReceiptItem.kt */
public abstract class BamnetReceiptItem {
    /* access modifiers changed from: private */
    public static final String AMAZON_RECEIPT_ID;
    /* access modifiers changed from: private */
    public static final String AMAZON_USER_ID;
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final String GOOGLE_PACKAGE_NAME = GOOGLE_PACKAGE_NAME;
    /* access modifiers changed from: private */
    public static final String GOOGLE_PRODUCT_ID = GOOGLE_PRODUCT_ID;
    /* access modifiers changed from: private */
    public static final String GOOGLE_PURCHASE_TOKEN = GOOGLE_PURCHASE_TOKEN;
    /* access modifiers changed from: private */
    public static final String GOOGLE_SIGNATURE = GOOGLE_SIGNATURE;
    /* access modifiers changed from: private */
    public static final String MOCK_RECEIPT_ID;
    /* access modifiers changed from: private */
    public static final String MOCK_USER_ID;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem$Companion;", "", "()V", "AMAZON_RECEIPT_ID", "", "getAMAZON_RECEIPT_ID", "()Ljava/lang/String;", "AMAZON_USER_ID", "getAMAZON_USER_ID", "GOOGLE_PACKAGE_NAME", "getGOOGLE_PACKAGE_NAME", "GOOGLE_PRODUCT_ID", "getGOOGLE_PRODUCT_ID", "GOOGLE_PURCHASE_TOKEN", "getGOOGLE_PURCHASE_TOKEN", "GOOGLE_SIGNATURE", "getGOOGLE_SIGNATURE", "MOCK_RECEIPT_ID", "getMOCK_RECEIPT_ID", "MOCK_USER_ID", "getMOCK_USER_ID", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BamnetReceiptItem.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getAMAZON_RECEIPT_ID() {
            return BamnetReceiptItem.AMAZON_RECEIPT_ID;
        }

        public final String getAMAZON_USER_ID() {
            return BamnetReceiptItem.AMAZON_USER_ID;
        }

        public final String getGOOGLE_PACKAGE_NAME() {
            return BamnetReceiptItem.GOOGLE_PACKAGE_NAME;
        }

        public final String getGOOGLE_PRODUCT_ID() {
            return BamnetReceiptItem.GOOGLE_PRODUCT_ID;
        }

        public final String getGOOGLE_PURCHASE_TOKEN() {
            return BamnetReceiptItem.GOOGLE_PURCHASE_TOKEN;
        }

        public final String getGOOGLE_SIGNATURE() {
            return BamnetReceiptItem.GOOGLE_SIGNATURE;
        }

        public final String getMOCK_RECEIPT_ID() {
            return BamnetReceiptItem.MOCK_RECEIPT_ID;
        }

        public final String getMOCK_USER_ID() {
            return BamnetReceiptItem.MOCK_USER_ID;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem$Factory;", "", "()V", "create", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptItem;", "receipt", "Lcom/bamnet/iap/BamnetIAPPurchase;", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BamnetReceiptItem.kt */
    public static final class Factory {

        @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[MarketType.values().length];

            static {
                $EnumSwitchMapping$0[MarketType.AMAZON.ordinal()] = 1;
                $EnumSwitchMapping$0[MarketType.GOOGLE.ordinal()] = 2;
                $EnumSwitchMapping$0[MarketType.MOCK.ordinal()] = 3;
            }
        }

        public final BamnetReceiptItem create(BamnetIAPPurchase bamnetIAPPurchase) {
            if (bamnetIAPPurchase.mo7210e() == null || bamnetIAPPurchase.mo7208c() == null) {
                throw new BamnetClaimException(BamnetClaim.Companion.getMISSING_DATA());
            }
            MarketType b = bamnetIAPPurchase.mo7206b();
            if (b != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[b.ordinal()];
                String str = "receipt.receiptJSON";
                if (i == 1) {
                    JSONObject d = bamnetIAPPurchase.mo7209d();
                    Intrinsics.checkReturnedValueIsNotNull((Object) d, str);
                    return new AmazonReceipt(BamnetReceiptItemKt.safeGetString(d, BamnetReceiptItem.Companion.getAMAZON_RECEIPT_ID()));
                } else if (i == 2) {
                    JSONObject d2 = bamnetIAPPurchase.mo7209d();
                    Intrinsics.checkReturnedValueIsNotNull((Object) d2, str);
                    String safeGetString = BamnetReceiptItemKt.safeGetString(d2, BamnetReceiptItem.Companion.getGOOGLE_SIGNATURE());
                    String c = bamnetIAPPurchase.mo7208c();
                    Intrinsics.checkReturnedValueIsNotNull((Object) c, "receipt.originalJson");
                    Charset charset = C12801c.f29474a;
                    if (c != null) {
                        byte[] bytes = c.getBytes(charset);
                        Intrinsics.checkReturnedValueIsNotNull((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        String encodeToString = Base64.encodeToString(bytes, 2);
                        JSONObject d3 = bamnetIAPPurchase.mo7209d();
                        Intrinsics.checkReturnedValueIsNotNull((Object) d3, str);
                        String safeGetString2 = BamnetReceiptItemKt.safeGetString(d3, BamnetReceiptItem.Companion.getGOOGLE_PRODUCT_ID());
                        JSONObject d4 = bamnetIAPPurchase.mo7209d();
                        Intrinsics.checkReturnedValueIsNotNull((Object) d4, str);
                        String safeGetString3 = BamnetReceiptItemKt.safeGetString(d4, BamnetReceiptItem.Companion.getGOOGLE_PACKAGE_NAME());
                        JSONObject d5 = bamnetIAPPurchase.mo7209d();
                        Intrinsics.checkReturnedValueIsNotNull((Object) d5, str);
                        String safeGetString4 = BamnetReceiptItemKt.safeGetString(d5, BamnetReceiptItem.Companion.getGOOGLE_PURCHASE_TOKEN());
                        Intrinsics.checkReturnedValueIsNotNull((Object) encodeToString, "encodedJson");
                        GoogleReceipt googleReceipt = new GoogleReceipt(safeGetString2, safeGetString3, safeGetString, safeGetString4, encodeToString);
                        return googleReceipt;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                } else if (i == 3) {
                    String e = bamnetIAPPurchase.mo7210e();
                    Intrinsics.checkReturnedValueIsNotNull((Object) e, "receipt.sku");
                    JSONObject d6 = bamnetIAPPurchase.mo7209d();
                    Intrinsics.checkReturnedValueIsNotNull((Object) d6, str);
                    String safeGetString5 = BamnetReceiptItemKt.safeGetString(d6, BamnetReceiptItem.Companion.getMOCK_USER_ID());
                    JSONObject d7 = bamnetIAPPurchase.mo7209d();
                    Intrinsics.checkReturnedValueIsNotNull((Object) d7, str);
                    return new MockReceipt(e, safeGetString5, BamnetReceiptItemKt.safeGetString(d7, BamnetReceiptItem.Companion.getMOCK_RECEIPT_ID()));
                }
            }
            throw new BamnetClaimException(BamnetClaim.Companion.getINVALID_STORE());
        }
    }

    static {
        String str = "receiptId";
        AMAZON_RECEIPT_ID = str;
        String str2 = "userId";
        AMAZON_USER_ID = str2;
        MOCK_RECEIPT_ID = str;
        MOCK_USER_ID = str2;
    }

    private BamnetReceiptItem() {
    }

    public /* synthetic */ BamnetReceiptItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
