package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder;
import com.bamtech.shadow.dagger.MembersInjector;
import javax.inject.Provider;

public final class RemoveMediaWorker_MembersInjector implements MembersInjector<RemoveMediaWorker> {
    public static void injectSubcomponent(RemoveMediaWorker removeMediaWorker, Provider<Builder> provider) {
        removeMediaWorker.subcomponent = provider;
    }
}
