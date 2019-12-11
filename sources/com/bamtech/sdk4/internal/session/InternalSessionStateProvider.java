package com.bamtech.sdk4.internal.session;

import kotlin.Metadata;
import p520io.reactivex.Observable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;", "", "currentInternalSessionState", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "getCurrentInternalSessionState", "()Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "removeLegacyAccountContext", "", "setInternalSessionState", "state", "watchInternalSessionState", "Lio/reactivex/Observable;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: InternalSessionStateProvider.kt */
public interface InternalSessionStateProvider {
    InternalSessionState getCurrentInternalSessionState();

    void removeLegacyAccountContext();

    void setInternalSessionState(InternalSessionState internalSessionState);

    Observable<InternalSessionState> watchInternalSessionState();
}
