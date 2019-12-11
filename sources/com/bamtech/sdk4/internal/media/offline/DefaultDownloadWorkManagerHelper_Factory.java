package com.bamtech.sdk4.internal.media.offline;

import androidx.work.WorkManager;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultDownloadWorkManagerHelper_Factory implements C2111c<DefaultDownloadWorkManagerHelper> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<WorkManager> workManagerProvider;

    public DefaultDownloadWorkManagerHelper_Factory(Provider<WorkManager> provider, Provider<ConfigurationProvider> provider2) {
        this.workManagerProvider = provider;
        this.configurationProvider = provider2;
    }

    public static DefaultDownloadWorkManagerHelper_Factory create(Provider<WorkManager> provider, Provider<ConfigurationProvider> provider2) {
        return new DefaultDownloadWorkManagerHelper_Factory(provider, provider2);
    }

    public DefaultDownloadWorkManagerHelper get() {
        return new DefaultDownloadWorkManagerHelper((WorkManager) this.workManagerProvider.get(), (ConfigurationProvider) this.configurationProvider.get());
    }
}
