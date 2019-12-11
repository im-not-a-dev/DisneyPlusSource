package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004\"\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004\"\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004\"\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004\"\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u0019"}, mo31007d2 = {"BAM_GET_IDENTITY", "", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getBAM_GET_IDENTITY", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "BAM_GET_IDENTITY_CHECK", "getBAM_GET_IDENTITY_CHECK", "BAM_IDENTITY_CHANGE_EMAIL", "getBAM_IDENTITY_CHANGE_EMAIL", "BAM_IDENTITY_CHANGE_PASSWORD", "getBAM_IDENTITY_CHANGE_PASSWORD", "BAM_IDENTITY_CREATE", "getBAM_IDENTITY_CREATE", "BAM_IDENTITY_LOGIN", "getBAM_IDENTITY_LOGIN", "BAM_IDENTITY_RESET_PASSWORD", "getBAM_IDENTITY_RESET_PASSWORD", "BAM_IDENTITY_START_PASSWORD_RESET", "getBAM_IDENTITY_START_PASSWORD_RESET", "BAM_REDEEM_ONE_TIME_PASSCODE", "getBAM_REDEEM_ONE_TIME_PASSCODE", "BAM_REQUEST_ONE_TIME_PASSCODE", "getBAM_REQUEST_ONE_TIME_PASSCODE", "BAM_UPDATE_ATTRIBUTES", "getBAM_UPDATE_ATTRIBUTES", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityServiceConfiguration.kt */
public final class BamIdentityServiceConfigurationKt {
    public static final String getBAM_GET_IDENTITY_CHECK(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:identity:bam:check";
    }

    public static final String getBAM_IDENTITY_CHANGE_EMAIL(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:identity:bam:changeEmail";
    }

    public static final String getBAM_IDENTITY_CHANGE_PASSWORD(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:identity:bam:changePassword";
    }

    public static final String getBAM_IDENTITY_CREATE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:identity:bam:createIdentity";
    }

    public static final String getBAM_IDENTITY_LOGIN(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:identity:bam:identityLogin";
    }

    public static final String getBAM_REDEEM_ONE_TIME_PASSCODE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:identity:bam:otpRedeem";
    }

    public static final String getBAM_REQUEST_ONE_TIME_PASSCODE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:identity:bam:otpRequest";
    }
}
