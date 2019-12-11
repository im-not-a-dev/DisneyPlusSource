package com.bamtech.sdk4;

import com.bamtech.sdk4.session.SessionApi;
import com.bamtech.sdk4.session.SessionInfo;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/Session;", "Lcom/bamtech/sdk4/session/SessionApi;", "Lcom/bamtech/sdk4/SDK;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Session.kt */
public interface Session extends SessionApi, SDK {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: Session.kt */
    public static final class DefaultImpls {
        public static Single<SessionInfo> getSessionInfo(Session session) {
            return com.bamtech.sdk4.session.SessionApi.DefaultImpls.getSessionInfo(session);
        }
    }
}
