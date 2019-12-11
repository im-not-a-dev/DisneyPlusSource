package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.configuration.TokenServiceConfiguration;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/RefreshActionPlanner;", "", "getRefreshAction", "Lcom/bamtech/sdk4/internal/token/RefreshAction;", "force", "", "configuration", "Lcom/bamtech/sdk4/internal/configuration/TokenServiceConfiguration;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RefreshActionPlanner.kt */
public interface RefreshActionPlanner {
    RefreshAction getRefreshAction(boolean z, TokenServiceConfiguration tokenServiceConfiguration);
}
