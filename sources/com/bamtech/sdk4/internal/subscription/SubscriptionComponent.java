package com.bamtech.sdk4.internal.subscription;

import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.subscription.SubscriptionPlugin;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/SubscriptionComponent;", "", "inject", "", "subscriptionPlugin", "Lcom/bamtech/sdk4/subscription/SubscriptionPlugin;", "Builder", "plugin-iap-subscription"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionComponent.kt */
public interface SubscriptionComponent {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/SubscriptionComponent$Builder;", "", "build", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionComponent;", "registry", "pluginRegistry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "plugin-iap-subscription"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SubscriptionComponent.kt */
    public interface Builder {
        SubscriptionComponent build();

        Builder registry(PluginRegistry pluginRegistry);
    }

    void inject(SubscriptionPlugin subscriptionPlugin);
}
