package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/DefaultRefreshActionPlanner;", "Lcom/bamtech/sdk4/internal/token/RefreshActionPlanner;", "internalSessionStateProvider", "Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;", "(Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;)V", "getRefreshAction", "Lcom/bamtech/sdk4/internal/token/RefreshAction;", "force", "", "configuration", "Lcom/bamtech/sdk4/internal/configuration/TokenServiceConfiguration;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RefreshActionPlanner.kt */
public final class DefaultRefreshActionPlanner implements RefreshActionPlanner {
    private final InternalSessionStateProvider internalSessionStateProvider;

    public DefaultRefreshActionPlanner(InternalSessionStateProvider internalSessionStateProvider2) {
        this.internalSessionStateProvider = internalSessionStateProvider2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if ((r1 != null ? r1.shouldRefresh(r7.getExtras().getRefreshThreshold()) : false) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bamtech.sdk4.internal.token.RefreshAction getRefreshAction(boolean r6, com.bamtech.sdk4.internal.configuration.TokenServiceConfiguration r7) {
        /*
            r5 = this;
            com.bamtech.sdk4.internal.session.InternalSessionStateProvider r0 = r5.internalSessionStateProvider
            com.bamtech.sdk4.internal.session.InternalSessionState r0 = r0.getCurrentInternalSessionState()
            com.bamtech.sdk4.token.AccessContext r1 = r0.getAccessContext()
            boolean r0 = r0 instanceof com.bamtech.sdk4.internal.session.InternalSessionState.Legacy
            r2 = 0
            if (r0 != 0) goto L_0x0021
            if (r1 == 0) goto L_0x001e
            com.bamtech.sdk4.internal.configuration.TokenExtras r7 = r7.getExtras()
            double r3 = r7.getRefreshThreshold()
            boolean r7 = r1.shouldRefresh(r3)
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            if (r7 == 0) goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            com.bamtech.sdk4.internal.token.RefreshAction r6 = com.bamtech.sdk4.internal.token.RefreshAction.LEGACY_CONTEXT
            goto L_0x0057
        L_0x0027:
            if (r1 != 0) goto L_0x002c
            com.bamtech.sdk4.internal.token.RefreshAction r6 = com.bamtech.sdk4.internal.token.RefreshAction.MISSING_CONTEXT
            goto L_0x0057
        L_0x002c:
            if (r6 == 0) goto L_0x0037
            java.lang.String r7 = r1.getRefreshToken()
            if (r7 != 0) goto L_0x0037
            com.bamtech.sdk4.internal.token.RefreshAction r6 = com.bamtech.sdk4.internal.token.RefreshAction.FORCED_MISSING_REFRESH_TOKEN
            goto L_0x0057
        L_0x0037:
            if (r6 == 0) goto L_0x003c
            com.bamtech.sdk4.internal.token.RefreshAction r6 = com.bamtech.sdk4.internal.token.RefreshAction.FORCED
            goto L_0x0057
        L_0x003c:
            if (r6 != 0) goto L_0x0043
            if (r2 == 0) goto L_0x0043
            com.bamtech.sdk4.internal.token.RefreshAction r6 = com.bamtech.sdk4.internal.token.RefreshAction.REFRESH_ELIGIBLE
            goto L_0x0057
        L_0x0043:
            boolean r6 = r1.isValid()
            if (r6 == 0) goto L_0x004c
            com.bamtech.sdk4.internal.token.RefreshAction r6 = com.bamtech.sdk4.internal.token.RefreshAction.USE_EXISTING_CONTEXT
            goto L_0x0057
        L_0x004c:
            java.lang.String r6 = r1.getRefreshToken()
            if (r6 != 0) goto L_0x0055
            com.bamtech.sdk4.internal.token.RefreshAction r6 = com.bamtech.sdk4.internal.token.RefreshAction.MISSING_REFRESH_TOKEN
            goto L_0x0057
        L_0x0055:
            com.bamtech.sdk4.internal.token.RefreshAction r6 = com.bamtech.sdk4.internal.token.RefreshAction.NO_REFRESH
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.token.DefaultRefreshActionPlanner.getRefreshAction(boolean, com.bamtech.sdk4.internal.configuration.TokenServiceConfiguration):com.bamtech.sdk4.internal.token.RefreshAction");
    }
}
