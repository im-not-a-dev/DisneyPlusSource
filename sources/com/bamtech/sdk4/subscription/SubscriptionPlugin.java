package com.bamtech.sdk4.subscription;

import com.bamtech.sdk4.internal.subscription.DaggerSubscriptionComponent;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.Plugin.DefaultImpls;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/SubscriptionPlugin;", "Lcom/bamtech/sdk4/plugin/Plugin;", "()V", "api", "Lcom/bamtech/sdk4/subscription/SubscriptionApi;", "getApi", "()Lcom/bamtech/sdk4/subscription/SubscriptionApi;", "setApi", "(Lcom/bamtech/sdk4/subscription/SubscriptionApi;)V", "initialize", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "plugin-iap-subscription"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionPlugin.kt */
public final class SubscriptionPlugin implements Plugin {
    public SubscriptionApi api;

    public void initialize(PluginRegistry pluginRegistry, PluginExtra pluginExtra) {
        DaggerSubscriptionComponent.builder().registry(pluginRegistry).build().inject(this);
        SubscriptionApi subscriptionApi = this.api;
        if (subscriptionApi != null) {
            pluginRegistry.registerPluginApi(SubscriptionApi.class, subscriptionApi);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("api");
            throw null;
        }
    }

    public void onReady() {
        DefaultImpls.onReady(this);
    }
}
