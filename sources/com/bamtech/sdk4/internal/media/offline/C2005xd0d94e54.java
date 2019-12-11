package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

/* renamed from: com.bamtech.sdk4.internal.media.offline.OfflineMediaServiceModule_OfflineWorkManagerModule_DatabaseFactory */
public final class C2005xd0d94e54 implements C2111c<OfflineDatabase> {
    private final Provider<Context> contextProvider;

    public C2005xd0d94e54(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static C2005xd0d94e54 create(Provider<Context> provider) {
        return new C2005xd0d94e54(provider);
    }

    public OfflineDatabase get() {
        OfflineDatabase database = OfflineMediaServiceModule$OfflineWorkManagerModule.database((Context) this.contextProvider.get());
        C2113e.m8178a(database, "Cannot return null from a non-@Nullable @Provides method");
        return database;
    }
}
