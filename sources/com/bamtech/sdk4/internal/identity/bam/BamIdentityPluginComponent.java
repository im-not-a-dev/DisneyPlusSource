package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.identity.bam.BamIdentityPlugin;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/BamIdentityPluginComponent;", "", "inject", "", "bamIdentityPlugin", "Lcom/bamtech/sdk4/identity/bam/BamIdentityPlugin;", "Builder", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityPluginComponent.kt */
public interface BamIdentityPluginComponent {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/BamIdentityPluginComponent$Builder;", "", "build", "Lcom/bamtech/sdk4/internal/identity/bam/BamIdentityPluginComponent;", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "registry", "pluginRegistry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: BamIdentityPluginComponent.kt */
    public interface Builder {
        BamIdentityPluginComponent build();

        Builder converter(Converter converter);

        Builder registry(PluginRegistry pluginRegistry);
    }

    void inject(BamIdentityPlugin bamIdentityPlugin);
}
