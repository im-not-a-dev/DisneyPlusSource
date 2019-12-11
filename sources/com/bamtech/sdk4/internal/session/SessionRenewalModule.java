package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.plugin.AuthenticationExpiredCallbackExtension;
import com.bamtech.sdk4.plugin.PluginRegistry;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/SessionRenewalModule;", "", "()V", "authorizerExtension", "Lcom/bamtech/sdk4/internal/plugin/AuthenticationExpiredCallbackExtension;", "pluginRegistry", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionRenewalModule.kt */
public final class SessionRenewalModule {
    static {
        new SessionRenewalModule();
    }

    private SessionRenewalModule() {
    }

    public static final AuthenticationExpiredCallbackExtension authorizerExtension(Provider<PluginRegistry> provider) {
        Object obj = provider.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "pluginRegistry.get()");
        return (AuthenticationExpiredCallbackExtension) ((PluginRegistry) obj).getExtension(AuthenticationExpiredCallbackExtension.class);
    }
}
