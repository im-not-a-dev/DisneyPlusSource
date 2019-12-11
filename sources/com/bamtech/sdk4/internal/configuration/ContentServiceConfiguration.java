package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ContentServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/ContentExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/ContentExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ContentServiceClientDefinition;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/ContentExtras;", "getSearchSuggestLink", "Lcom/bamtech/core/networking/Link;", "getGetSearchSuggestLink", "()Lcom/bamtech/core/networking/Link;", "getLink", "key", "", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentServiceConfiguration.kt */
public final class ContentServiceConfiguration implements ServiceConfiguration {
    private final ContentServiceClientDefinition client;
    private final ContentExtras extras;

    public ContentServiceConfiguration(ContentServiceClientDefinition contentServiceClientDefinition, ContentExtras contentExtras) {
        this.client = contentServiceClientDefinition;
        this.extras = contentExtras;
    }

    public final Link getLink(String str) {
        return getClient().getLink(str);
    }

    public ContentServiceConfiguration() {
        this(new ContentServiceClientDefinition(), new ContentExtras());
    }

    public ContentServiceClientDefinition getClient() {
        return this.client;
    }

    public ContentExtras getExtras() {
        return this.extras;
    }
}
