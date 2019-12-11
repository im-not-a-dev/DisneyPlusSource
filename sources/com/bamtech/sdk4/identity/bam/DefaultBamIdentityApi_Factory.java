package com.bamtech.sdk4.identity.bam;

import com.bamtech.sdk4.internal.identity.bam.IdentityManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultBamIdentityApi_Factory implements C2111c<DefaultBamIdentityApi> {
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultBamIdentityApi_Factory(Provider<ServiceTransaction> provider, Provider<IdentityManager> provider2) {
        this.transactionProvider = provider;
        this.identityManagerProvider = provider2;
    }

    public static DefaultBamIdentityApi_Factory create(Provider<ServiceTransaction> provider, Provider<IdentityManager> provider2) {
        return new DefaultBamIdentityApi_Factory(provider, provider2);
    }

    public DefaultBamIdentityApi get() {
        return new DefaultBamIdentityApi(this.transactionProvider, this.identityManagerProvider);
    }
}
