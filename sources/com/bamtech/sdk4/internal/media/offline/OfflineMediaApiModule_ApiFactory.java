package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.media.offline.OfflineMediaApi;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class OfflineMediaApiModule_ApiFactory implements C2111c<OfflineMediaApi> {
    public static OfflineMediaApi proxyApi(OfflineMediaApiModule offlineMediaApiModule, DefaultOfflineMediaApi defaultOfflineMediaApi) {
        OfflineMediaApi api = offlineMediaApiModule.api(defaultOfflineMediaApi);
        C2113e.m8178a(api, "Cannot return null from a non-@Nullable @Provides method");
        return api;
    }
}
