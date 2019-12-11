package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.Extension;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/RenewSessionTransformerExtension;", "Lcom/bamtech/sdk4/plugin/Extension;", "instance", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "(Lcom/bamtech/sdk4/session/RenewSessionTransformers;)V", "getInstance", "()Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultExtensions.kt */
public final class RenewSessionTransformerExtension implements Extension {
    private final RenewSessionTransformers instance;

    public RenewSessionTransformerExtension(RenewSessionTransformers renewSessionTransformers) {
        this.instance = renewSessionTransformers;
    }

    public final RenewSessionTransformers getInstance() {
        return this.instance;
    }
}
