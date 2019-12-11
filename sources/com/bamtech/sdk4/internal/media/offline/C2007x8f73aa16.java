package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;
import okhttp3.OkHttpClient.Builder;

/* renamed from: com.bamtech.sdk4.internal.media.offline.OfflineMediaServiceModule_OfflineWorkManagerModule_NetworkConfigurationProviderFactory */
public final class C2007x8f73aa16 implements C2111c<NetworkConfigurationProvider> {
    private final Provider<Builder> builderProvider;
    private final Provider<ServiceTransaction> transactionProvider;
    private final Provider<String> userAgentProvider;

    public C2007x8f73aa16(Provider<String> provider, Provider<Builder> provider2, Provider<ServiceTransaction> provider3) {
        this.userAgentProvider = provider;
        this.builderProvider = provider2;
        this.transactionProvider = provider3;
    }

    public static C2007x8f73aa16 create(Provider<String> provider, Provider<Builder> provider2, Provider<ServiceTransaction> provider3) {
        return new C2007x8f73aa16(provider, provider2, provider3);
    }

    public NetworkConfigurationProvider get() {
        NetworkConfigurationProvider networkConfigurationProvider = OfflineMediaServiceModule$OfflineWorkManagerModule.networkConfigurationProvider((String) this.userAgentProvider.get(), (Builder) this.builderProvider.get(), this.transactionProvider);
        C2113e.m8178a(networkConfigurationProvider, "Cannot return null from a non-@Nullable @Provides method");
        return networkConfigurationProvider;
    }
}
