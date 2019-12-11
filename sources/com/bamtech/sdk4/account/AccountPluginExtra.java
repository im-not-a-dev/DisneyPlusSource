package com.bamtech.sdk4.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.plugin.PluginExtra;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/AccountPluginExtra;", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/core/networking/converters/Converter;)V", "getConverter$plugin_account", "()Lcom/bamtech/core/networking/converters/Converter;", "plugin-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountPlugin.kt */
public final class AccountPluginExtra implements PluginExtra {
    private final Converter converter;

    public final Converter getConverter$plugin_account() {
        return this.converter;
    }
}
