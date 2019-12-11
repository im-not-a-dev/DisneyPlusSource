package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.session.InternalSessionState;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/session/SessionState;", "it", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionApi.kt */
final class DefaultSessionApi$watchSessionState$1<T, R> implements Function<T, R> {
    final /* synthetic */ DefaultSessionApi this$0;

    DefaultSessionApi$watchSessionState$1(DefaultSessionApi defaultSessionApi) {
        this.this$0 = defaultSessionApi;
    }

    public final SessionState apply(InternalSessionState internalSessionState) {
        return this.this$0.toSessionState(internalSessionState);
    }
}
