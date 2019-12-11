package com.bamtech.sdk4.useractivity;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultUserActivityApi_Factory implements C2111c<DefaultUserActivityApi> {
    private final Provider<DustClientConstants> dustClientConstantsProvider;
    private final Provider<EventBuffer> glimpseBufferProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultUserActivityApi_Factory(Provider<ServiceTransaction> provider, Provider<EventBuffer> provider2, Provider<DustClientConstants> provider3) {
        this.transactionProvider = provider;
        this.glimpseBufferProvider = provider2;
        this.dustClientConstantsProvider = provider3;
    }

    public static DefaultUserActivityApi_Factory create(Provider<ServiceTransaction> provider, Provider<EventBuffer> provider2, Provider<DustClientConstants> provider3) {
        return new DefaultUserActivityApi_Factory(provider, provider2, provider3);
    }

    public DefaultUserActivityApi get() {
        return new DefaultUserActivityApi(this.transactionProvider, (EventBuffer) this.glimpseBufferProvider.get(), (DustClientConstants) this.dustClientConstantsProvider.get());
    }
}
