package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.plugin.DustEventBufferExtension;
import com.bamtech.sdk4.internal.plugin.GlimpseEventBufferExtension;
import com.bamtech.sdk4.internal.plugin.QOSEventBufferExtension;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/DustExtensionModule;", "", "()V", "GlimpseExtension", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "QOSExtension", "dustExtension", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionExtensionModule.kt */
public final class DustExtensionModule {
    public final EventBuffer GlimpseExtension(PluginRegistry pluginRegistry) {
        return ((GlimpseEventBufferExtension) pluginRegistry.getExtension(GlimpseEventBufferExtension.class)).getInstance();
    }

    public final EventBuffer QOSExtension(PluginRegistry pluginRegistry) {
        return ((QOSEventBufferExtension) pluginRegistry.getExtension(QOSEventBufferExtension.class)).getInstance();
    }

    public final EventBuffer dustExtension(PluginRegistry pluginRegistry) {
        return ((DustEventBufferExtension) pluginRegistry.getExtension(DustEventBufferExtension.class)).getInstance();
    }
}
