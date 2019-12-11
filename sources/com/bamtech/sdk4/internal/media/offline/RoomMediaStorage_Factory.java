package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class RoomMediaStorage_Factory implements C2111c<RoomMediaStorage> {
    private final Provider<OfflineDatabase> dbProvider;

    public RoomMediaStorage_Factory(Provider<OfflineDatabase> provider) {
        this.dbProvider = provider;
    }

    public static RoomMediaStorage_Factory create(Provider<OfflineDatabase> provider) {
        return new RoomMediaStorage_Factory(provider);
    }

    public RoomMediaStorage get() {
        return new RoomMediaStorage((OfflineDatabase) this.dbProvider.get());
    }
}
