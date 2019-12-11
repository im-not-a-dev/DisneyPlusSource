package com.bamtech.sdk4.media;

import android.content.Context;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class QOSNetworkHelper_Factory implements C2111c<QOSNetworkHelper> {
    private final Provider<Context> contextProvider;

    public QOSNetworkHelper_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static QOSNetworkHelper_Factory create(Provider<Context> provider) {
        return new QOSNetworkHelper_Factory(provider);
    }

    public QOSNetworkHelper get() {
        return new QOSNetworkHelper((Context) this.contextProvider.get());
    }
}
