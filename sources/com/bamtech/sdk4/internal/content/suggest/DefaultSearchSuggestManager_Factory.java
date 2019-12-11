package com.bamtech.sdk4.internal.content.suggest;

import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSearchSuggestManager_Factory implements C2111c<DefaultSearchSuggestManager> {
    private final Provider<SearchSuggestClient> clientProvider;

    public DefaultSearchSuggestManager_Factory(Provider<SearchSuggestClient> provider) {
        this.clientProvider = provider;
    }

    public static DefaultSearchSuggestManager_Factory create(Provider<SearchSuggestClient> provider) {
        return new DefaultSearchSuggestManager_Factory(provider);
    }

    public DefaultSearchSuggestManager get() {
        return new DefaultSearchSuggestManager((SearchSuggestClient) this.clientProvider.get());
    }
}
