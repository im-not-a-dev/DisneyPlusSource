package com.bamtech.sdk4.media.adapters.exoplayer;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/DrmSessionManagerModule;", "", "()V", "playbackDrmSessionManager", "Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager;", "extension-media-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DrmSessionManagerModule.kt */
public final class DrmSessionManagerModule {
    static {
        new DrmSessionManagerModule();
    }

    private DrmSessionManagerModule() {
    }

    public static final WidevineDrmSessionManager playbackDrmSessionManager() {
        return WidevineDrmSessionManager.INSTANCE;
    }
}
