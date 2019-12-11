package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004\"\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004\"\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004\"\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004\"\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u0019"}, mo31007d2 = {"ACCOUNT_CREATE_ACCOUNT", "", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getACCOUNT_CREATE_ACCOUNT", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "ACCOUNT_CREATE_ACCOUNT_GRANT", "getACCOUNT_CREATE_ACCOUNT_GRANT", "ACCOUNT_CURRENT_ACCOUNT", "getACCOUNT_CURRENT_ACCOUNT", "ACCOUNT_UPDATE_ATTRIBUTES", "getACCOUNT_UPDATE_ATTRIBUTES", "PROFILE_CREATE", "getPROFILE_CREATE", "PROFILE_DELETE", "getPROFILE_DELETE", "PROFILE_GET", "getPROFILE_GET", "PROFILE_GET_ACTIVE", "getPROFILE_GET_ACTIVE", "PROFILE_GET_MULTIPLE", "getPROFILE_GET_MULTIPLE", "PROFILE_SET_ACTIVE", "getPROFILE_SET_ACTIVE", "PROFILE_UPDATE", "getPROFILE_UPDATE", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: AccountServiceConfiguration.kt */
public final class AccountServiceConfigurationKt {
    public static final String getACCOUNT_CREATE_ACCOUNT(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:createAccount";
    }

    public static final String getACCOUNT_CREATE_ACCOUNT_GRANT(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:createAccountGrant";
    }

    public static final String getACCOUNT_CURRENT_ACCOUNT(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:getCurrentAccount";
    }

    public static final String getPROFILE_CREATE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:createUserProfile";
    }

    public static final String getPROFILE_DELETE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:deleteUserProfile";
    }

    public static final String getPROFILE_GET(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:getProfile";
    }

    public static final String getPROFILE_GET_ACTIVE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:getActiveProfile";
    }

    public static final String getPROFILE_GET_MULTIPLE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:getProfiles";
    }

    public static final String getPROFILE_SET_ACTIVE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:setActiveProfile";
    }

    public static final String getPROFILE_UPDATE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:account:updateProfile";
    }
}
