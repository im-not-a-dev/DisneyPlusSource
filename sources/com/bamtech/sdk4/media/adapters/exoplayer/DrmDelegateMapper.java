package com.bamtech.sdk4.media.adapters.exoplayer;

import com.google.android.exoplayer2.drm.C8713o;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bJ\u0006\u0010\u001d\u001a\u00020\u0017R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/DrmDelegateMapper;", "", "()V", "audioManager", "Lcom/google/android/exoplayer2/drm/DefaultDrmSessionManager;", "Lcom/google/android/exoplayer2/drm/FrameworkMediaCrypto;", "getAudioManager", "()Lcom/google/android/exoplayer2/drm/DefaultDrmSessionManager;", "setAudioManager", "(Lcom/google/android/exoplayer2/drm/DefaultDrmSessionManager;)V", "audioSession", "Lcom/google/android/exoplayer2/drm/DrmSession;", "getAudioSession", "()Lcom/google/android/exoplayer2/drm/DrmSession;", "setAudioSession", "(Lcom/google/android/exoplayer2/drm/DrmSession;)V", "videoManager", "getVideoManager", "setVideoManager", "videoSession", "getVideoSession", "setVideoSession", "clearSession", "", "session", "getManager", "isAudio", "", "putSession", "reset", "extension-media-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DrmDelegateMapper.kt */
public final class DrmDelegateMapper {
    private DefaultDrmSessionManager<C8713o> audioManager;
    private DrmSession<C8713o> audioSession;
    private DefaultDrmSessionManager<C8713o> videoManager;
    private DrmSession<C8713o> videoSession;

    public final void clearSession(DrmSession<C8713o> drmSession) {
        if (Intrinsics.areEqual((Object) drmSession, (Object) this.audioSession)) {
            this.audioSession = null;
        } else if (Intrinsics.areEqual((Object) drmSession, (Object) this.videoSession)) {
            this.videoSession = null;
        }
    }

    public final DefaultDrmSessionManager<C8713o> getAudioManager() {
        return this.audioManager;
    }

    public final DefaultDrmSessionManager<C8713o> getManager(DrmSession<C8713o> drmSession) {
        return drmSession.equals(this.videoSession) ? this.videoManager : this.audioManager;
    }

    public final DefaultDrmSessionManager<C8713o> getVideoManager() {
        return this.videoManager;
    }

    public final DrmSession<C8713o> getVideoSession() {
        return this.videoSession;
    }

    public final void putSession(boolean z, DrmSession<C8713o> drmSession) {
        if (z) {
            this.audioSession = drmSession;
        } else {
            this.videoSession = drmSession;
        }
    }

    public final void reset() {
        this.audioSession = null;
        this.videoSession = null;
        this.audioManager = null;
        this.videoManager = null;
    }

    public final void setAudioManager(DefaultDrmSessionManager<C8713o> defaultDrmSessionManager) {
        this.audioManager = defaultDrmSessionManager;
    }

    public final void setVideoManager(DefaultDrmSessionManager<C8713o> defaultDrmSessionManager) {
        this.videoManager = defaultDrmSessionManager;
    }

    public final DefaultDrmSessionManager<C8713o> getManager(boolean z) {
        return z ? this.audioManager : this.videoManager;
    }
}
