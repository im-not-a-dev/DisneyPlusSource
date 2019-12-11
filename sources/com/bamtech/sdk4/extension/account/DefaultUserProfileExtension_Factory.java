package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.internal.account.UserProfileClient;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.internal.token.AccountTokenExchangeProvider;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;
import p520io.reactivex.subjects.PublishSubject;

public final class DefaultUserProfileExtension_Factory implements C2111c<DefaultUserProfileExtension> {
    private final Provider<UserProfileClient> clientProvider;
    private final Provider<PublishSubject<UserProfileEvent>> profileEventNotifierProvider;
    private final Provider<RenewSessionTransformers> sessionTransformersProvider;
    private final Provider<AccountTokenExchangeProvider> tokenExchangeProvider;
    private final Provider<AccessTokenProvider> tokenProvider;
    private final Provider<AccessContextUpdater> updaterProvider;

    public DefaultUserProfileExtension_Factory(Provider<UserProfileClient> provider, Provider<AccessTokenProvider> provider2, Provider<AccountTokenExchangeProvider> provider3, Provider<AccessContextUpdater> provider4, Provider<PublishSubject<UserProfileEvent>> provider5, Provider<RenewSessionTransformers> provider6) {
        this.clientProvider = provider;
        this.tokenProvider = provider2;
        this.tokenExchangeProvider = provider3;
        this.updaterProvider = provider4;
        this.profileEventNotifierProvider = provider5;
        this.sessionTransformersProvider = provider6;
    }

    public static DefaultUserProfileExtension_Factory create(Provider<UserProfileClient> provider, Provider<AccessTokenProvider> provider2, Provider<AccountTokenExchangeProvider> provider3, Provider<AccessContextUpdater> provider4, Provider<PublishSubject<UserProfileEvent>> provider5, Provider<RenewSessionTransformers> provider6) {
        DefaultUserProfileExtension_Factory defaultUserProfileExtension_Factory = new DefaultUserProfileExtension_Factory(provider, provider2, provider3, provider4, provider5, provider6);
        return defaultUserProfileExtension_Factory;
    }

    public DefaultUserProfileExtension get() {
        DefaultUserProfileExtension defaultUserProfileExtension = new DefaultUserProfileExtension((UserProfileClient) this.clientProvider.get(), (AccessTokenProvider) this.tokenProvider.get(), (AccountTokenExchangeProvider) this.tokenExchangeProvider.get(), (AccessContextUpdater) this.updaterProvider.get(), (PublishSubject) this.profileEventNotifierProvider.get(), (RenewSessionTransformers) this.sessionTransformersProvider.get());
        return defaultUserProfileExtension;
    }
}
