package com.bamtech.sdk4.identity.bam;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\f\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0003\"\u0014\u0010\u0012\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0003\"\u0014\u0010\u0014\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0003\"\u0014\u0010\u0016\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0003\"\u0014\u0010\u0018\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0003¨\u0006\u001a"}, mo31007d2 = {"BAMIDP_API_AUTHENTICATE_IDENTITY", "", "getBAMIDP_API_AUTHENTICATE_IDENTITY", "()Ljava/lang/String;", "BAMIDP_API_AUTHENTICATE_WITH_PASSCODE", "getBAMIDP_API_AUTHENTICATE_WITH_PASSCODE", "BAMIDP_API_CREATE_IDENTITY", "getBAMIDP_API_CREATE_IDENTITY", "BAMIDP_API_DEAUTHENTICATE_IDENTITY", "getBAMIDP_API_DEAUTHENTICATE_IDENTITY", "BAMIDP_API_GET_IDENTITY", "getBAMIDP_API_GET_IDENTITY", "BAMIDP_API_REQUEST_AUTHENTICATION_FLOW", "getBAMIDP_API_REQUEST_AUTHENTICATION_FLOW", "BAMIDP_API_REQUEST_ONE_TIME_PASSCODE", "getBAMIDP_API_REQUEST_ONE_TIME_PASSCODE", "BAMIDP_API_REQUEST_PASSWORD_RESET", "getBAMIDP_API_REQUEST_PASSWORD_RESET", "BAMIDP_API_RESET_PASSWORD", "getBAMIDP_API_RESET_PASSWORD", "BAMIDP_API_UPDATE_EMAIL", "getBAMIDP_API_UPDATE_EMAIL", "BAMIDP_API_UPDATE_IDENTITY", "getBAMIDP_API_UPDATE_IDENTITY", "BAMIDP_API_UPDATE_PASSWORD", "getBAMIDP_API_UPDATE_PASSWORD", "plugin-identity-bam"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityApi.kt */
public final class BamIdentityApiKt {
    /* access modifiers changed from: private */
    public static final String getBAMIDP_API_AUTHENTICATE_IDENTITY() {
        return "urn:bamtech:dust:bamsdk:api:identity:bam:authenticate";
    }

    /* access modifiers changed from: private */
    public static final String getBAMIDP_API_AUTHENTICATE_WITH_PASSCODE() {
        return "api:identity:bam:authenticateWithPasscode";
    }

    /* access modifiers changed from: private */
    public static final String getBAMIDP_API_CREATE_IDENTITY() {
        return "urn:bamtech:dust:bamsdk:api:identity:bam:createIdentity";
    }

    /* access modifiers changed from: private */
    public static final String getBAMIDP_API_REQUEST_AUTHENTICATION_FLOW() {
        return "api:identity:bam:getAuthenticationFlow";
    }

    /* access modifiers changed from: private */
    public static final String getBAMIDP_API_REQUEST_ONE_TIME_PASSCODE() {
        return "api:identity:bam:requestOneTimePasscode";
    }

    /* access modifiers changed from: private */
    public static final String getBAMIDP_API_UPDATE_EMAIL() {
        return "urn:bamtech:dust:bamsdk:api:identity:bam:updateEmail";
    }

    /* access modifiers changed from: private */
    public static final String getBAMIDP_API_UPDATE_PASSWORD() {
        return "urn:bamtech:dust:bamsdk:api:identity:bam:updatePassword";
    }
}
