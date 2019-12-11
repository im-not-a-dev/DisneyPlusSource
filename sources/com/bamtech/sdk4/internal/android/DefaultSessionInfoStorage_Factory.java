package com.bamtech.sdk4.internal.android;

import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSessionInfoStorage_Factory implements C2111c<DefaultSessionInfoStorage> {
    private final Provider<Storage> storageProvider;

    public DefaultSessionInfoStorage_Factory(Provider<Storage> provider) {
        this.storageProvider = provider;
    }

    public static DefaultSessionInfoStorage_Factory create(Provider<Storage> provider) {
        return new DefaultSessionInfoStorage_Factory(provider);
    }

    public DefaultSessionInfoStorage get() {
        return new DefaultSessionInfoStorage((Storage) this.storageProvider.get());
    }
}
