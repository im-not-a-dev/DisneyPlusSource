package com.bamtech.sdk4.account;

import com.bamtech.sdk4.extension.account.UserProfileExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultUserProfileApi_Factory implements C2111c<DefaultUserProfileApi> {
    private final Provider<ServiceTransaction> transactionProvider;
    private final Provider<UserProfileExtension> userProfileExtensionProvider;

    public DefaultUserProfileApi_Factory(Provider<ServiceTransaction> provider, Provider<UserProfileExtension> provider2) {
        this.transactionProvider = provider;
        this.userProfileExtensionProvider = provider2;
    }

    public static DefaultUserProfileApi_Factory create(Provider<ServiceTransaction> provider, Provider<UserProfileExtension> provider2) {
        return new DefaultUserProfileApi_Factory(provider, provider2);
    }

    public DefaultUserProfileApi get() {
        return new DefaultUserProfileApi(this.transactionProvider, (UserProfileExtension) this.userProfileExtensionProvider.get());
    }
}
