package com.bamtech.sdk4.session;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\f\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0003\"\u0014\u0010\u0012\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0003\"\u0014\u0010\u0014\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0003¨\u0006\u0016"}, mo31007d2 = {"SESSION_API_CREATE", "", "getSESSION_API_CREATE", "()Ljava/lang/String;", "SESSION_API_GET_ACCESS_STATE", "getSESSION_API_GET_ACCESS_STATE", "SESSION_API_GET_SESSION_INFO", "getSESSION_API_GET_SESSION_INFO", "SESSION_API_GET_SESSION_STATE", "getSESSION_API_GET_SESSION_STATE", "SESSION_API_GET_SESSION_TOKEN", "getSESSION_API_GET_SESSION_TOKEN", "SESSION_API_GRANT_AUTHORIZATION", "getSESSION_API_GRANT_AUTHORIZATION", "SESSION_API_LOGOUT", "getSESSION_API_LOGOUT", "SESSION_API_REAUTHORIZE", "getSESSION_API_REAUTHORIZE", "SESSION_API_RESET", "getSESSION_API_RESET", "SESSION_API_WATCH_SESSION_STATE", "getSESSION_API_WATCH_SESSION_STATE", "sdk-core-api_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSessionApi.kt */
public final class DefaultSessionApiKt {
    /* access modifiers changed from: private */
    public static final String getSESSION_API_CREATE() {
        return "urn:bamtech:dust:bamsdk:api:session:create";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_GET_ACCESS_STATE() {
        return "urn:bamtech:dust:bamsdk:api:session:getAccessState";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_GET_SESSION_INFO() {
        return "urn:bamtech:dust:bamsdk:api:session:getSessionInfo";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_GET_SESSION_STATE() {
        return "urn:bamtech:dust:bamsdk:api:session:currentInternalSessionState";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_GET_SESSION_TOKEN() {
        return "urn:bamtech:dust:bamsdk:api:session:getSessionToken";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_GRANT_AUTHORIZATION() {
        return "urn:bamtech:dust:bamsdk:api:session:authorize";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_LOGOUT() {
        return "urn:bamtech:dust:bamsdk:api:session:logout";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_REAUTHORIZE() {
        return "urn:bamtech:dust:bamsdk:api:session:reauthorize";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_RESET() {
        return "urn:bamtech:dust:bamsdk:api:session:reset";
    }

    /* access modifiers changed from: private */
    public static final String getSESSION_API_WATCH_SESSION_STATE() {
        return "urn:bamtech:dust:bamsdk:api:session:watchInternalSessionState";
    }
}
