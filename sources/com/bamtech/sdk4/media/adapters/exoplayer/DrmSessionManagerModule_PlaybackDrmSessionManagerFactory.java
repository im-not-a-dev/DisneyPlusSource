package com.bamtech.sdk4.media.adapters.exoplayer;

import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class DrmSessionManagerModule_PlaybackDrmSessionManagerFactory implements C2111c<WidevineDrmSessionManager> {
    private static final DrmSessionManagerModule_PlaybackDrmSessionManagerFactory INSTANCE = new DrmSessionManagerModule_PlaybackDrmSessionManagerFactory();

    public static DrmSessionManagerModule_PlaybackDrmSessionManagerFactory create() {
        return INSTANCE;
    }

    public WidevineDrmSessionManager get() {
        WidevineDrmSessionManager playbackDrmSessionManager = DrmSessionManagerModule.playbackDrmSessionManager();
        C2113e.m8178a(playbackDrmSessionManager, "Cannot return null from a non-@Nullable @Provides method");
        return playbackDrmSessionManager;
    }
}
