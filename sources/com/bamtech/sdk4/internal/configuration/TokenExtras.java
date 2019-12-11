package com.bamtech.sdk4.internal.configuration;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\tH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/TokenExtras;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "autoRefreshRetryPolicy", "Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "refreshThreshold", "", "subjectTokenTypes", "", "", "(Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;DLjava/util/Map;)V", "getAutoRefreshRetryPolicy", "()Lcom/bamtech/sdk4/internal/configuration/RetryPolicy;", "getRefreshThreshold", "()D", "getSubjectTokenTypes", "()Ljava/util/Map;", "toString", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenServiceConfiguration.kt */
public final class TokenExtras implements ServiceExtras {
    private final RetryPolicy autoRefreshRetryPolicy;
    private final double refreshThreshold;
    private final Map<String, String> subjectTokenTypes;

    public TokenExtras(RetryPolicy retryPolicy, double d, Map<String, String> map) {
        this.autoRefreshRetryPolicy = retryPolicy;
        this.refreshThreshold = d;
        this.subjectTokenTypes = map;
    }

    public final RetryPolicy getAutoRefreshRetryPolicy() {
        return this.autoRefreshRetryPolicy;
    }

    public final double getRefreshThreshold() {
        return this.refreshThreshold;
    }

    public final Map<String, String> getSubjectTokenTypes() {
        return this.subjectTokenTypes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TokenExtras(autoRefreshRetryPolicy=");
        sb.append(this.autoRefreshRetryPolicy);
        sb.append(", refreshThreshold=");
        sb.append(this.refreshThreshold);
        sb.append(", subjectTokenTypes=");
        sb.append(this.subjectTokenTypes);
        sb.append(')');
        return sb.toString();
    }

    public TokenExtras() {
        RetryPolicy retryPolicy = new RetryPolicy(2.0d, 1.5d, 20, 120);
        this(retryPolicy, 0.9d, SubjectTokenTypes.Companion.getDEFAULT());
    }
}
