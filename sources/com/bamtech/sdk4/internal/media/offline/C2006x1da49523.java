package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.android.exoplayer2.database.DatabaseProvider;
import javax.inject.Provider;

/* renamed from: com.bamtech.sdk4.internal.media.offline.OfflineMediaServiceModule_OfflineWorkManagerModule_DatabaseProviderFactory */
public final class C2006x1da49523 implements C2111c<DatabaseProvider> {
    private final Provider<Context> contextProvider;

    public C2006x1da49523(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static C2006x1da49523 create(Provider<Context> provider) {
        return new C2006x1da49523(provider);
    }

    public DatabaseProvider get() {
        DatabaseProvider databaseProvider = OfflineMediaServiceModule$OfflineWorkManagerModule.databaseProvider((Context) this.contextProvider.get());
        C2113e.m8178a(databaseProvider, "Cannot return null from a non-@Nullable @Provides method");
        return databaseProvider;
    }
}
