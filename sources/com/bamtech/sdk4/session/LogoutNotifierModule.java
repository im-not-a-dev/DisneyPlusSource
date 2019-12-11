package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.plugin.NotifierExtension;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/LogoutNotifierModule;", "", "()V", "notifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionExtensionModule.kt */
public final class LogoutNotifierModule {
    public final PublishSubject<LogoutMode> notifier(PluginRegistry pluginRegistry) {
        return ((NotifierExtension) pluginRegistry.getExtension(NotifierExtension.class)).getInstance();
    }
}
