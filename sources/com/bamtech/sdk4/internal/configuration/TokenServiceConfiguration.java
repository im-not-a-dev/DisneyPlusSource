package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00158F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/TokenServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/TokenExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/TokenExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "exchangeLink", "Lcom/bamtech/core/networking/Link;", "getExchangeLink", "()Lcom/bamtech/core/networking/Link;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/TokenExtras;", "retryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "getRetryPolicy", "()Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "subjectTokenTypes", "Lcom/bamtech/sdk4/internal/configuration/SubjectTokenTypes;", "subjectTokenTypes$annotations", "getSubjectTokenTypes", "()Lcom/bamtech/sdk4/internal/configuration/SubjectTokenTypes;", "toString", "", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenServiceConfiguration.kt */
public final class TokenServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final TokenExtras extras;

    public TokenServiceConfiguration(ServiceClientDefinition serviceClientDefinition, TokenExtras tokenExtras) {
        this.client = serviceClientDefinition;
        this.extras = tokenExtras;
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getExchangeLink() {
        return getClient().getLink("exchange");
    }

    public final RetryPolicy getRetryPolicy() {
        return getExtras().getAutoRefreshRetryPolicy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bamtech.sdk4.internal.configuration.SubjectTokenTypes getSubjectTokenTypes() {
        /*
            r2 = this;
            com.bamtech.sdk4.internal.configuration.SubjectTokenTypes r0 = new com.bamtech.sdk4.internal.configuration.SubjectTokenTypes
            com.bamtech.sdk4.internal.configuration.TokenExtras r1 = r2.getExtras()
            if (r1 == 0) goto L_0x000f
            java.util.Map r1 = r1.getSubjectTokenTypes()
            if (r1 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            com.bamtech.sdk4.internal.configuration.SubjectTokenTypes$Companion r1 = com.bamtech.sdk4.internal.configuration.SubjectTokenTypes.Companion
            java.util.Map r1 = r1.getDEFAULT()
        L_0x0015:
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.configuration.TokenServiceConfiguration.getSubjectTokenTypes():com.bamtech.sdk4.internal.configuration.SubjectTokenTypes");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TokenServiceConfiguration(client=");
        sb.append(getClient());
        sb.append(", extras=");
        sb.append(getExtras());
        sb.append(')');
        return sb.toString();
    }

    public TokenServiceConfiguration() {
        this(new ServiceClientDefinition(), new TokenExtras());
    }

    public TokenExtras getExtras() {
        return this.extras;
    }
}
