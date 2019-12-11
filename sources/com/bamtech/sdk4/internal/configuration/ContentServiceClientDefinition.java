package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientDefinition;", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "()V", "extras", "Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientExtras;)V", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientExtras;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentServiceConfiguration.kt */
public final class ContentServiceClientDefinition extends ServiceClientDefinition {
    private final ContentServiceClientExtras extras;

    public ContentServiceClientDefinition(ContentServiceClientExtras contentServiceClientExtras) {
        this.extras = contentServiceClientExtras;
    }

    public final ContentServiceClientExtras getExtras() {
        return this.extras;
    }

    public ContentServiceClientDefinition() {
        this(new ContentServiceClientExtras());
    }
}
