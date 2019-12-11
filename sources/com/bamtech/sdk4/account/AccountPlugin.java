package com.bamtech.sdk4.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.account.AccountApiPluginComponent.Builder;
import com.bamtech.sdk4.internal.account.DaggerAccountApiPluginComponent;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.Plugin.DefaultImpls;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/AccountPlugin;", "Lcom/bamtech/sdk4/plugin/Plugin;", "()V", "api", "Lcom/bamtech/sdk4/account/AccountApi;", "getApi", "()Lcom/bamtech/sdk4/account/AccountApi;", "setApi", "(Lcom/bamtech/sdk4/account/AccountApi;)V", "profileApi", "Lcom/bamtech/sdk4/account/UserProfileApi;", "getProfileApi", "()Lcom/bamtech/sdk4/account/UserProfileApi;", "setProfileApi", "(Lcom/bamtech/sdk4/account/UserProfileApi;)V", "initialize", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "plugin-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountPlugin.kt */
public final class AccountPlugin implements Plugin {
    public AccountApi api;
    public UserProfileApi profileApi;

    public void initialize(PluginRegistry pluginRegistry, PluginExtra pluginExtra) {
        Builder registry = DaggerAccountApiPluginComponent.builder().registry(pluginRegistry);
        if (!(pluginExtra instanceof AccountPluginExtra)) {
            pluginExtra = null;
        }
        AccountPluginExtra accountPluginExtra = (AccountPluginExtra) pluginExtra;
        if (accountPluginExtra != null) {
            Converter converter$plugin_account = accountPluginExtra.getConverter$plugin_account();
            if (converter$plugin_account != null) {
                registry.converter(converter$plugin_account);
            }
        }
        registry.build().inject(this);
        AccountApi accountApi = this.api;
        if (accountApi != null) {
            pluginRegistry.registerPluginApi(AccountApi.class, accountApi);
            UserProfileApi userProfileApi = this.profileApi;
            if (userProfileApi != null) {
                pluginRegistry.registerPluginApi(UserProfileApi.class, userProfileApi);
            } else {
                C12880j.m40227c("profileApi");
                throw null;
            }
        } else {
            C12880j.m40227c("api");
            throw null;
        }
    }

    public void onReady() {
        DefaultImpls.onReady(this);
    }
}
