package com.bamtech.sdk4.media.offline;

import com.bamtech.sdk4.internal.media.offline.OfflineMediaClient;
import com.bamtech.shadow.dagger.MembersInjector;

public final class OfflineMediaPlugin_MembersInjector implements MembersInjector<OfflineMediaPlugin> {
    public static void injectApi(OfflineMediaPlugin offlineMediaPlugin, OfflineMediaApi offlineMediaApi) {
        offlineMediaPlugin.api = offlineMediaApi;
    }

    public static void injectClient(OfflineMediaPlugin offlineMediaPlugin, OfflineMediaClient offlineMediaClient) {
        offlineMediaPlugin.client = offlineMediaClient;
    }
}
