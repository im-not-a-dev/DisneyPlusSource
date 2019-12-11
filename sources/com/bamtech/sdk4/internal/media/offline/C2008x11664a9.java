package com.bamtech.sdk4.internal.media.offline;

import androidx.work.WorkManager;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

/* renamed from: com.bamtech.sdk4.internal.media.offline.OfflineMediaServiceModule_OfflineWorkManagerModule_WorkManagerFactory */
public final class C2008x11664a9 implements C2111c<WorkManager> {
    private static final C2008x11664a9 INSTANCE = new C2008x11664a9();

    public static C2008x11664a9 create() {
        return INSTANCE;
    }

    public WorkManager get() {
        WorkManager workManager = OfflineMediaServiceModule$OfflineWorkManagerModule.workManager();
        C2113e.m8178a(workManager, "Cannot return null from a non-@Nullable @Provides method");
        return workManager;
    }
}
