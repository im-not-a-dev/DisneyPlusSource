package com.bamtech.sdk4.purchase.bamnet;

import com.bamtech.sdk4.internal.purchase.bamnet.DaggerBamnetPurchaseComponent;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.Plugin.DefaultImpls;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/BamnetPurchasePlugin;", "Lcom/bamtech/sdk4/plugin/Plugin;", "()V", "api", "Lcom/bamtech/sdk4/purchase/bamnet/BamnetPurchaseApi;", "getApi", "()Lcom/bamtech/sdk4/purchase/bamnet/BamnetPurchaseApi;", "setApi", "(Lcom/bamtech/sdk4/purchase/bamnet/BamnetPurchaseApi;)V", "initialize", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetPurchasePlugin.kt */
public final class BamnetPurchasePlugin implements Plugin {
    public BamnetPurchaseApi api;

    public void initialize(PluginRegistry pluginRegistry, PluginExtra pluginExtra) {
        DaggerBamnetPurchaseComponent.builder().registry(pluginRegistry).build().inject(this);
        BamnetPurchaseApi bamnetPurchaseApi = this.api;
        if (bamnetPurchaseApi != null) {
            pluginRegistry.registerPluginApi(BamnetPurchaseApi.class, bamnetPurchaseApi);
        } else {
            C12880j.m40227c("api");
            throw null;
        }
    }

    public void onReady() {
        DefaultImpls.onReady(this);
    }
}
