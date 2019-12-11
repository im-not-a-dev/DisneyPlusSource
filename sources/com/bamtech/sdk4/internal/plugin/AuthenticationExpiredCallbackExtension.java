package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.Extension;
import com.bamtech.sdk4.session.AuthenticationExpiredCallback;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/AuthenticationExpiredCallbackExtension;", "Lcom/bamtech/sdk4/plugin/Extension;", "instance", "Lcom/bamtech/sdk4/session/AuthenticationExpiredCallback;", "getInstance", "()Lcom/bamtech/sdk4/session/AuthenticationExpiredCallback;", "setInstance", "(Lcom/bamtech/sdk4/session/AuthenticationExpiredCallback;)V", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationExpiredCallbackExtension.kt */
public interface AuthenticationExpiredCallbackExtension extends Extension {
    AuthenticationExpiredCallback getInstance();
}
