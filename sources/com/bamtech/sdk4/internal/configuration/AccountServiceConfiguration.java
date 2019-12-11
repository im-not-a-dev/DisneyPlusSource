package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u001d\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u0011\u0010 \u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010\"\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010\rR\u0011\u0010$\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\r¨\u00061"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/AccountServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "createAccountGrantLink", "Lcom/bamtech/core/networking/Link;", "getCreateAccountGrantLink", "()Lcom/bamtech/core/networking/Link;", "createAccountLink", "getCreateAccountLink", "createUserProfile", "getCreateUserProfile", "deleteAccountAttributesLink", "getDeleteAccountAttributesLink", "deleteUserProfile", "getDeleteUserProfile", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;", "getActiveUserProfile", "getGetActiveUserProfile", "getCurrentAccountLink", "getGetCurrentAccountLink", "getUserProfile", "getGetUserProfile", "getUserProfiles", "getGetUserProfiles", "setActiveUserProfile", "getSetActiveUserProfile", "updateAccountAttributesLink", "getUpdateAccountAttributesLink", "updateUserProfile", "getUpdateUserProfile", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountServiceConfiguration.kt */
public final class AccountServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final NullServiceExtras extras;

    public AccountServiceConfiguration(ServiceClientDefinition serviceClientDefinition, NullServiceExtras nullServiceExtras) {
        this.client = serviceClientDefinition;
        this.extras = nullServiceExtras;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getExtras(), (java.lang.Object) r3.getExtras()) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0027
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.configuration.AccountServiceConfiguration
            if (r0 == 0) goto L_0x0025
            com.bamtech.sdk4.internal.configuration.AccountServiceConfiguration r3 = (com.bamtech.sdk4.internal.configuration.AccountServiceConfiguration) r3
            com.bamtech.sdk4.internal.configuration.ServiceClientDefinition r0 = r2.getClient()
            com.bamtech.sdk4.internal.configuration.ServiceClientDefinition r1 = r3.getClient()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0025
            com.bamtech.sdk4.internal.configuration.NullServiceExtras r0 = r2.getExtras()
            com.bamtech.sdk4.internal.configuration.NullServiceExtras r3 = r3.getExtras()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            return r3
        L_0x0027:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.configuration.AccountServiceConfiguration.equals(java.lang.Object):boolean");
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getCreateAccountGrantLink() {
        return getClient().getLink("createAccountGrant");
    }

    public final Link getCreateAccountLink() {
        return getClient().getLink("createAccount");
    }

    public final Link getCreateUserProfile() {
        return getClient().getLink("createUserProfile");
    }

    public final Link getDeleteUserProfile() {
        return getClient().getLink("deleteUserProfile");
    }

    public final Link getGetActiveUserProfile() {
        return getClient().getLink("getActiveUserProfile");
    }

    public final Link getGetCurrentAccountLink() {
        return getClient().getLink("getCurrentAccount");
    }

    public final Link getGetUserProfile() {
        return getClient().getLink("getUserProfile");
    }

    public final Link getGetUserProfiles() {
        return getClient().getLink("getUserProfiles");
    }

    public final Link getSetActiveUserProfile() {
        return getClient().getLink("setActiveUserProfile");
    }

    public final Link getUpdateUserProfile() {
        return getClient().getLink("updateUserProfile");
    }

    public int hashCode() {
        ServiceClientDefinition client2 = getClient();
        int i = 0;
        int hashCode = (client2 != null ? client2.hashCode() : 0) * 31;
        NullServiceExtras extras2 = getExtras();
        if (extras2 != null) {
            i = extras2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountServiceConfiguration(client=");
        sb.append(getClient());
        sb.append(", extras=");
        sb.append(getExtras());
        sb.append(")");
        return sb.toString();
    }

    public AccountServiceConfiguration() {
        this(new ServiceClientDefinition(), new NullServiceExtras());
    }

    public NullServiceExtras getExtras() {
        return this.extras;
    }
}
