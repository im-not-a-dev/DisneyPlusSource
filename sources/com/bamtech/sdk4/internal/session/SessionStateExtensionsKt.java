package com.bamtech.sdk4.internal.session;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.core.Storage.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.session.InternalSessionState.AuthenticationExpired;
import com.bamtech.sdk4.internal.session.InternalSessionState.Failed;
import com.bamtech.sdk4.internal.session.InternalSessionState.Initializing;
import com.bamtech.sdk4.internal.session.InternalSessionState.LoggedIn;
import com.bamtech.sdk4.internal.session.InternalSessionState.LoggedOut;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"SESSION_STATE", "", "SESSION_STATE_TYPE", "getSessionState", "Lcom/bamtech/sdk4/internal/session/InternalSessionState;", "Lcom/bamtech/sdk4/internal/core/Storage;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "saveSessionState", "", "sessionState", "sdk-core-api_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: SessionStateExtensions.kt */
public final class SessionStateExtensionsKt {
    public static final InternalSessionState getSessionState(Storage storage, ServiceTransaction serviceTransaction) {
        Class<LoggedOut> cls = LoggedOut.class;
        Class<LoggedIn> cls2 = LoggedIn.class;
        String str = "SESSION_STATE_TYPE";
        try {
            String str2 = (String) DefaultImpls.get$default(storage, str, C12895y.m40230a(String.class), null, 4, null);
            String str3 = "null cannot be cast to non-null type com.bamtech.sdk4.internal.session.InternalSessionState";
            if (C12880j.m40224a((Object) str2, (Object) cls.getSimpleName())) {
                Object obj = DefaultImpls.get$default(storage, "SESSION_STATE", C12895y.m40230a((Class) cls), null, 4, null);
                if (obj != null) {
                    return (InternalSessionState) obj;
                }
                throw new C13142s(str3);
            } else if (C12880j.m40224a((Object) str2, (Object) cls2.getSimpleName())) {
                Object obj2 = DefaultImpls.get$default(storage, "SESSION_STATE", C12895y.m40230a((Class) cls2), null, 4, null);
                if (obj2 != null) {
                    return (InternalSessionState) obj2;
                }
                throw new C13142s(str3);
            } else if (!C12880j.m40224a((Object) str2, (Object) AuthenticationExpired.class.getSimpleName())) {
                return new Initializing();
            } else {
                Object obj3 = DefaultImpls.get$default(storage, "SESSION_STATE", C12895y.m40230a((Class) cls2), null, 4, null);
                if (obj3 != null) {
                    return (InternalSessionState) obj3;
                }
                throw new C13142s(str3);
            }
        } catch (Throwable unused) {
            LogDispatcher.DefaultImpls.d$default(serviceTransaction, storage, "get session state failed", false, 4, null);
            storage.remove("SESSION_STATE_TYPE");
            storage.remove("SESSION_STATE");
            return new Initializing();
        }
    }

    public static final void saveSessionState(Storage storage, InternalSessionState internalSessionState) {
        if (!(internalSessionState instanceof Failed) && !(internalSessionState instanceof AuthenticationExpired)) {
            Storage storage2 = storage;
            DefaultImpls.save$default(storage2, "SESSION_STATE_TYPE", internalSessionState.getClass().getSimpleName(), null, 4, null);
            DefaultImpls.save$default(storage, "SESSION_STATE", internalSessionState, null, 4, null);
        }
    }
}
