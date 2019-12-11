package com.bamtech.sdk4.internal.service;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

public final class DefaultServiceTransaction_Factory implements C2111c<DefaultServiceTransaction> {
    private final Provider<DustClientConstants> baseDataProvider;
    private final Provider<OkHttpClient> clientProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<LogDispatcher> loggerProvider;

    public DefaultServiceTransaction_Factory(Provider<OkHttpClient> provider, Provider<LogDispatcher> provider2, Provider<ConverterProvider> provider3, Provider<DustClientConstants> provider4) {
        this.clientProvider = provider;
        this.loggerProvider = provider2;
        this.convertersProvider = provider3;
        this.baseDataProvider = provider4;
    }

    public static DefaultServiceTransaction_Factory create(Provider<OkHttpClient> provider, Provider<LogDispatcher> provider2, Provider<ConverterProvider> provider3, Provider<DustClientConstants> provider4) {
        return new DefaultServiceTransaction_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultServiceTransaction get() {
        return new DefaultServiceTransaction((OkHttpClient) this.clientProvider.get(), (LogDispatcher) this.loggerProvider.get(), (ConverterProvider) this.convertersProvider.get(), (DustClientConstants) this.baseDataProvider.get());
    }
}
