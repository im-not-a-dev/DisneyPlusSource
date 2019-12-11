package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultRefreshActionPlanner_Factory implements C2111c<DefaultRefreshActionPlanner> {
    private final Provider<InternalSessionStateProvider> internalSessionStateProvider;

    public DefaultRefreshActionPlanner_Factory(Provider<InternalSessionStateProvider> provider) {
        this.internalSessionStateProvider = provider;
    }

    public static DefaultRefreshActionPlanner_Factory create(Provider<InternalSessionStateProvider> provider) {
        return new DefaultRefreshActionPlanner_Factory(provider);
    }

    public DefaultRefreshActionPlanner get() {
        return new DefaultRefreshActionPlanner((InternalSessionStateProvider) this.internalSessionStateProvider.get());
    }
}
