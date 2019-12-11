package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000bR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u000bR\u0011\u0010\"\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u000b¨\u0006$"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/BamIdentityServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/BamIdentityServiceExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/BamIdentityServiceExtras;)V", "changeEmailLink", "Lcom/bamtech/core/networking/Link;", "getChangeEmailLink", "()Lcom/bamtech/core/networking/Link;", "changePasswordLink", "getChangePasswordLink", "checkLink", "getCheckLink", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "createIdentityLink", "getCreateIdentityLink", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/BamIdentityServiceExtras;", "getIdentity", "getGetIdentity", "identityLoginLink", "getIdentityLoginLink", "redeemOneTimePasscode", "getRedeemOneTimePasscode", "requestOneTimePasscode", "getRequestOneTimePasscode", "resetPasswordLink", "getResetPasswordLink", "startPasswordResetLink", "getStartPasswordResetLink", "updateAttributes", "getUpdateAttributes", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityServiceConfiguration.kt */
public final class BamIdentityServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final BamIdentityServiceExtras extras;

    public BamIdentityServiceConfiguration(ServiceClientDefinition serviceClientDefinition, BamIdentityServiceExtras bamIdentityServiceExtras) {
        this.client = serviceClientDefinition;
        this.extras = bamIdentityServiceExtras;
    }

    public final Link getChangeEmailLink() {
        return getClient().getLink("changeEmail");
    }

    public final Link getChangePasswordLink() {
        return getClient().getLink("changePassword");
    }

    public final Link getCheckLink() {
        return getClient().getLink("check");
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getCreateIdentityLink() {
        return getClient().getLink("createIdentity");
    }

    public final Link getIdentityLoginLink() {
        return getClient().getLink("identityLogin");
    }

    public final Link getRedeemOneTimePasscode() {
        return getClient().getLink("otpRedeem");
    }

    public final Link getRequestOneTimePasscode() {
        return getClient().getLink("otpRequest");
    }

    public BamIdentityServiceConfiguration() {
        this(new ServiceClientDefinition(), new BamIdentityServiceExtras());
    }

    public BamIdentityServiceExtras getExtras() {
        return this.extras;
    }
}
