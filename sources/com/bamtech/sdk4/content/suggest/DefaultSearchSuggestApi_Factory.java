package com.bamtech.sdk4.content.suggest;

import com.bamtech.sdk4.internal.content.suggest.SearchSuggestManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSearchSuggestApi_Factory implements C2111c<DefaultSearchSuggestApi> {
    private final Provider<SearchSuggestManager> managerProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultSearchSuggestApi_Factory(Provider<ServiceTransaction> provider, Provider<SearchSuggestManager> provider2) {
        this.transactionProvider = provider;
        this.managerProvider = provider2;
    }

    public static DefaultSearchSuggestApi_Factory create(Provider<ServiceTransaction> provider, Provider<SearchSuggestManager> provider2) {
        return new DefaultSearchSuggestApi_Factory(provider, provider2);
    }

    public DefaultSearchSuggestApi get() {
        return new DefaultSearchSuggestApi(this.transactionProvider, (SearchSuggestManager) this.managerProvider.get());
    }
}
