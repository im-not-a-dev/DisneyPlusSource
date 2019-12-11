package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.session.AuthenticationExpiredCallback;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/DefaultAuthenticationExpiredCallbackExtension;", "Lcom/bamtech/sdk4/internal/plugin/AuthenticationExpiredCallbackExtension;", "instance", "Lcom/bamtech/sdk4/session/AuthenticationExpiredCallback;", "(Lcom/bamtech/sdk4/session/AuthenticationExpiredCallback;)V", "getInstance", "()Lcom/bamtech/sdk4/session/AuthenticationExpiredCallback;", "setInstance", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultExtensions.kt */
public final class DefaultAuthenticationExpiredCallbackExtension implements AuthenticationExpiredCallbackExtension {
    private AuthenticationExpiredCallback instance;

    public DefaultAuthenticationExpiredCallbackExtension(AuthenticationExpiredCallback authenticationExpiredCallback) {
        this.instance = authenticationExpiredCallback;
    }

    public AuthenticationExpiredCallback getInstance() {
        return this.instance;
    }

    public /* synthetic */ DefaultAuthenticationExpiredCallbackExtension(AuthenticationExpiredCallback authenticationExpiredCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            authenticationExpiredCallback = null;
        }
        this(authenticationExpiredCallback);
    }
}
