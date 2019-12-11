package com.bamtech.sdk4.purchase.bamnet;

import com.bamtech.shadow.dagger.MembersInjector;

public final class BamnetPurchasePlugin_MembersInjector implements MembersInjector<BamnetPurchasePlugin> {
    public static void injectApi(BamnetPurchasePlugin bamnetPurchasePlugin, BamnetPurchaseApi bamnetPurchaseApi) {
        bamnetPurchasePlugin.api = bamnetPurchaseApi;
    }
}
