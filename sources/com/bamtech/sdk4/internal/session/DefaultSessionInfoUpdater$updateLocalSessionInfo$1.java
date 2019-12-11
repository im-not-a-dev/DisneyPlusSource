package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.session.SessionInfo;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/session/SessionInfo;", "sessionInfo", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionInfoUpdater.kt */
final class DefaultSessionInfoUpdater$updateLocalSessionInfo$1<T, R> implements Function<T, R> {
    final /* synthetic */ DefaultSessionInfoUpdater this$0;

    DefaultSessionInfoUpdater$updateLocalSessionInfo$1(DefaultSessionInfoUpdater defaultSessionInfoUpdater) {
        this.this$0 = defaultSessionInfoUpdater;
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        SessionInfo sessionInfo = (SessionInfo) obj;
        apply(sessionInfo);
        return sessionInfo;
    }

    public final SessionInfo apply(SessionInfo sessionInfo) {
        this.this$0.sessionStorage.save(sessionInfo);
        return sessionInfo;
    }
}
