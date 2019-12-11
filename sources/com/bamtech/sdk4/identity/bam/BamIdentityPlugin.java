package com.bamtech.sdk4.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.identity.bam.BamIdentityPluginComponent.Builder;
import com.bamtech.sdk4.internal.identity.bam.DaggerBamIdentityPluginComponent;
import com.bamtech.sdk4.plugin.Plugin;
import com.bamtech.sdk4.plugin.Plugin.DefaultImpls;
import com.bamtech.sdk4.plugin.PluginExtra;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/BamIdentityPlugin;", "Lcom/bamtech/sdk4/plugin/Plugin;", "()V", "api", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "getApi", "()Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "setApi", "(Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;)V", "initialize", "", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityPlugin.kt */
public final class BamIdentityPlugin implements Plugin {
    public BamIdentityApi api;

    public void initialize(PluginRegistry pluginRegistry, PluginExtra pluginExtra) {
        Builder registry = DaggerBamIdentityPluginComponent.builder().registry(pluginRegistry);
        if (!(pluginExtra instanceof IdentityPluginExtra)) {
            pluginExtra = null;
        }
        IdentityPluginExtra identityPluginExtra = (IdentityPluginExtra) pluginExtra;
        if (identityPluginExtra != null) {
            Converter converter$plugin_identity_bam = identityPluginExtra.getConverter$plugin_identity_bam();
            if (converter$plugin_identity_bam != null) {
                registry.converter(converter$plugin_identity_bam);
            }
        }
        registry.build().inject(this);
        BamIdentityApi bamIdentityApi = this.api;
        if (bamIdentityApi != null) {
            pluginRegistry.registerPluginApi(BamIdentityApi.class, bamIdentityApi);
        } else {
            C12880j.m40227c("api");
            throw null;
        }
    }

    public void onReady() {
        DefaultImpls.onReady(this);
    }
}
