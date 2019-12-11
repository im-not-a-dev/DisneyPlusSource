package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.plugin.Extension;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/SessionInfoExtension;", "Lcom/bamtech/sdk4/plugin/Extension;", "getSessionInfo", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "preferLocal", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionInfoExtension.kt */
public interface SessionInfoExtension extends Extension {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: SessionInfoExtension.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Single getSessionInfo$default(SessionInfoExtension sessionInfoExtension, ServiceTransaction serviceTransaction, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return sessionInfoExtension.getSessionInfo(serviceTransaction, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSessionInfo");
        }
    }

    Single<SessionInfo> getSessionInfo(ServiceTransaction serviceTransaction, boolean z);
}
