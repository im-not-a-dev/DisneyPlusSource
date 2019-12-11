package com.bamtech.sdk4.internal.paywall;

import com.bamtech.sdk4.paywall.PaywallPlugin;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/paywall/PaywallPluginComponent;", "", "inject", "", "paywallPlugin", "Lcom/bamtech/sdk4/paywall/PaywallPlugin;", "Builder", "plugin-paywall"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PaywallPluginComponent.kt */
public interface PaywallPluginComponent {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/paywall/PaywallPluginComponent$Builder;", "", "build", "Lcom/bamtech/sdk4/internal/paywall/PaywallPluginComponent;", "registry", "pluginRegistry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "plugin-paywall"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PaywallPluginComponent.kt */
    public interface Builder {
        PaywallPluginComponent build();

        Builder registry(PluginRegistry pluginRegistry);
    }

    void inject(PaywallPlugin paywallPlugin);
}
