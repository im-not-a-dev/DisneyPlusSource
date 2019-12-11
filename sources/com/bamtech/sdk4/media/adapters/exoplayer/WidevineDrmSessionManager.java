package com.bamtech.sdk4.media.adapters.exoplayer;

import android.os.Looper;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.PlaybackEndCause;
import com.bamtech.sdk4.media.PlaybackEndedEventData;
import com.bamtech.sdk4.media.PlaybackError;
import com.bamtech.sdk4.media.adapters.PlaybackEventListener;
import com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener;
import com.bamtech.sdk4.media.drm.DrmProvider;
import com.google.android.exoplayer2.drm.C8710l;
import com.google.android.exoplayer2.drm.C8713o;
import com.google.android.exoplayer2.drm.C8715q;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import java.util.HashMap;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12801c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bJL\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\r2\u0006\u0010(\u001a\u00020\u0019J(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010,\u001a\u0004\u0018\u00010\r2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013H\u0007J\u000e\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020$J\u0018\u00100\u001a\u00020\u001b2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager;", "Lcom/google/android/exoplayer2/drm/DrmSessionManager;", "Lcom/google/android/exoplayer2/drm/FrameworkMediaCrypto;", "()V", "audioManagerCallback", "Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager$CompositeCallback;", "delegateMapper", "Lcom/bamtech/sdk4/media/adapters/exoplayer/DrmDelegateMapper;", "delegateMapper$annotations", "getDelegateMapper", "()Lcom/bamtech/sdk4/media/adapters/exoplayer/DrmDelegateMapper;", "playbackLock", "Ljava/util/Queue;", "", "playbackLock$annotations", "getPlaybackLock", "()Ljava/util/Queue;", "videoManagerCallback", "acquireSession", "Lcom/google/android/exoplayer2/drm/DrmSession;", "playbackLooper", "Landroid/os/Looper;", "drmInitData", "Lcom/google/android/exoplayer2/drm/DrmInitData;", "canAcquireSession", "", "clearCallbackAndEventListeners", "", "create", "drmProvider", "Lcom/bamtech/sdk4/media/drm/DrmProvider;", "listener", "Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "listenerQOS", "Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "offlineKeys", "", "audioKeys", "isDrmMultiSession", "playbackSessionId", "isOffline", "createSessionManager", "Lcom/google/android/exoplayer2/drm/DefaultDrmSessionManager;", "callback", "extractSessionKeyId", "drmSession", "isSessionActive", "requestedLicenseKeyId", "releaseSession", "CompositeCallback", "extension-media-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: WidevineDrmSessionManager.kt */
public final class WidevineDrmSessionManager implements C8710l<C8713o> {
    public static final WidevineDrmSessionManager INSTANCE = new WidevineDrmSessionManager();
    private static CompositeCallback audioManagerCallback;
    private static final DrmDelegateMapper delegateMapper = new DrmDelegateMapper();
    private static final Queue<String> playbackLock = new ConcurrentLinkedQueue();
    private static CompositeCallback videoManagerCallback;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001fH\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager$CompositeCallback;", "Lcom/google/android/exoplayer2/drm/MediaDrmCallback;", "provider", "Lcom/bamtech/sdk4/media/drm/DrmProvider;", "listener", "Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "listenerQOS", "Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "playbackSessionId", "", "isOffline", "", "(Lcom/bamtech/sdk4/media/drm/DrmProvider;Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;Ljava/lang/String;Z)V", "()Z", "getListener", "()Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "setListener", "(Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;)V", "getListenerQOS", "()Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "setListenerQOS", "(Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;)V", "getPlaybackSessionId", "()Ljava/lang/String;", "executeKeyRequest", "", "uuid", "Ljava/util/UUID;", "request", "Lcom/google/android/exoplayer2/drm/ExoMediaDrm$KeyRequest;", "executeProvisionRequest", "Lcom/google/android/exoplayer2/drm/ExoMediaDrm$ProvisionRequest;", "extension-media-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: WidevineDrmSessionManager.kt */
    private static final class CompositeCallback implements C8715q {
        private final boolean isOffline;
        private PlaybackEventListener listener;
        private QOSPlaybackEventListener listenerQOS;
        private final String playbackSessionId;
        private final DrmProvider provider;

        public CompositeCallback(DrmProvider drmProvider, PlaybackEventListener playbackEventListener, QOSPlaybackEventListener qOSPlaybackEventListener, String str, boolean z) {
            this.provider = drmProvider;
            this.listener = playbackEventListener;
            this.listenerQOS = qOSPlaybackEventListener;
            this.playbackSessionId = str;
            this.isOffline = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
            if (r8 != null) goto L_0x009e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public byte[] executeKeyRequest(java.util.UUID r8, com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest r9) {
            /*
                r7 = this;
                com.bamtech.sdk4.media.drm.DrmProvider r0 = r7.provider
                java.util.UUID r0 = r0.getUuid()
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r0)
                if (r8 == 0) goto L_0x00ba
                r8 = 0
                if (r9 == 0) goto L_0x0014
                byte[] r0 = r9.getData()
                goto L_0x0015
            L_0x0014:
                r0 = r8
            L_0x0015:
                if (r0 == 0) goto L_0x00ba
                com.bamtech.sdk4.media.drm.DrmProvider r1 = r7.provider     // Catch:{ all -> 0x0046 }
                com.bamtech.sdk4.media.drm.DrmProvider r0 = r7.provider     // Catch:{ all -> 0x0046 }
                javax.inject.Provider r0 = r0.getTransactionProvider()     // Catch:{ all -> 0x0046 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0046 }
                java.lang.String r2 = "provider.transactionProvider.get()"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)     // Catch:{ all -> 0x0046 }
                r2 = r0
                com.bamtech.sdk4.internal.service.ServiceTransaction r2 = (com.bamtech.sdk4.internal.service.ServiceTransaction) r2     // Catch:{ all -> 0x0046 }
                java.lang.String r3 = r9.getLicenseServerUrl()     // Catch:{ all -> 0x0046 }
                java.lang.String r0 = "request.licenseServerUrl"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r0)     // Catch:{ all -> 0x0046 }
                byte[] r4 = r9.getData()     // Catch:{ all -> 0x0046 }
                java.lang.String r9 = "request.data"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r9)     // Catch:{ all -> 0x0046 }
                java.lang.String r5 = r7.playbackSessionId     // Catch:{ all -> 0x0046 }
                boolean r6 = r7.isOffline     // Catch:{ all -> 0x0046 }
                byte[] r8 = r1.executeKeyRequest(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0046 }
                return r8
            L_0x0046:
                r9 = move-exception
                boolean r0 = r9 instanceof com.bamtech.sdk4.service.ServiceException
                if (r0 != 0) goto L_0x004d
                r0 = r8
                goto L_0x004e
            L_0x004d:
                r0 = r9
            L_0x004e:
                com.bamtech.sdk4.service.ServiceException r0 = (com.bamtech.sdk4.service.ServiceException) r0
                if (r0 == 0) goto L_0x009c
                com.bamtech.sdk4.service.ServiceExceptionCase$Companion r1 = com.bamtech.sdk4.service.ServiceExceptionCase.Companion
                java.util.List r0 = r1.getCases(r0)
                com.bamtech.sdk4.service.ServiceExceptionCase$NetworkConnectionError r1 = com.bamtech.sdk4.service.ServiceExceptionCase.NetworkConnectionError.INSTANCE
                boolean r1 = r0.contains(r1)
                if (r1 == 0) goto L_0x0063
                com.bamtech.sdk4.media.PlaybackError r8 = com.bamtech.sdk4.media.PlaybackError.networkFailure
                goto L_0x0099
            L_0x0063:
                com.bamtech.sdk4.service.ServiceExceptionCase$StreamConcurrencyViolation r1 = com.bamtech.sdk4.service.ServiceExceptionCase.StreamConcurrencyViolation.INSTANCE
                boolean r1 = r0.contains(r1)
                if (r1 == 0) goto L_0x006e
                com.bamtech.sdk4.media.PlaybackError r8 = com.bamtech.sdk4.media.PlaybackError.concurrency
                goto L_0x0099
            L_0x006e:
                com.bamtech.sdk4.service.ServiceExceptionCase$Blackout r1 = com.bamtech.sdk4.service.ServiceExceptionCase.Blackout.INSTANCE
                boolean r1 = r0.contains(r1)
                if (r1 == 0) goto L_0x0079
                com.bamtech.sdk4.media.PlaybackError r8 = com.bamtech.sdk4.media.PlaybackError.blackout
                goto L_0x0099
            L_0x0079:
                com.bamtech.sdk4.service.ServiceExceptionCase$NotEntitled r1 = com.bamtech.sdk4.service.ServiceExceptionCase.NotEntitled.INSTANCE
                boolean r1 = r0.contains(r1)
                if (r1 == 0) goto L_0x0084
                com.bamtech.sdk4.media.PlaybackError r8 = com.bamtech.sdk4.media.PlaybackError.notEntitled
                goto L_0x0099
            L_0x0084:
                com.bamtech.sdk4.service.ServiceExceptionCase$AuthorizationExpired r1 = com.bamtech.sdk4.service.ServiceExceptionCase.AuthorizationExpired.INSTANCE
                boolean r1 = r0.contains(r1)
                if (r1 == 0) goto L_0x008f
                com.bamtech.sdk4.media.PlaybackError r8 = com.bamtech.sdk4.media.PlaybackError.authorizationExpired
                goto L_0x0099
            L_0x008f:
                com.bamtech.sdk4.service.ServiceExceptionCase$UnexpectedError r1 = com.bamtech.sdk4.service.ServiceExceptionCase.UnexpectedError.INSTANCE
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x0099
                com.bamtech.sdk4.media.PlaybackError r8 = com.bamtech.sdk4.media.PlaybackError.serviceError
            L_0x0099:
                if (r8 == 0) goto L_0x009c
                goto L_0x009e
            L_0x009c:
                com.bamtech.sdk4.media.PlaybackError r8 = com.bamtech.sdk4.media.PlaybackError.drmOther
            L_0x009e:
                r5 = r8
                com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener r8 = r7.listenerQOS
                if (r8 == 0) goto L_0x00b2
                com.bamtech.sdk4.media.PlaybackEndedEventData r6 = new com.bamtech.sdk4.media.PlaybackEndedEventData
                java.lang.String r1 = r7.playbackSessionId
                r2 = 0
                com.bamtech.sdk4.media.PlaybackEndCause r4 = com.bamtech.sdk4.media.PlaybackEndCause.error
                r0 = r6
                r0.<init>(r1, r2, r4, r5)
                r8.onEvent(r6)
            L_0x00b2:
                com.bamtech.sdk4.media.adapters.PlaybackEventListener r8 = r7.listener
                if (r8 == 0) goto L_0x00b9
                r8.onException(r9)
            L_0x00b9:
                throw r9
            L_0x00ba:
                r8 = 0
                byte[] r8 = new byte[r8]
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.adapters.exoplayer.WidevineDrmSessionManager.CompositeCallback.executeKeyRequest(java.util.UUID, com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest):byte[]");
        }

        public byte[] executeProvisionRequest(UUID uuid, ProvisionRequest provisionRequest) {
            if (Intrinsics.areEqual((Object) uuid, (Object) this.provider.getUuid())) {
                if ((provisionRequest != null ? provisionRequest.getData() : null) != null) {
                    try {
                        DrmProvider drmProvider = this.provider;
                        Object obj = this.provider.getTransactionProvider().get();
                        Intrinsics.checkReturnedValueIsNotNull(obj, "provider.transactionProvider.get()");
                        ServiceTransaction serviceTransaction = (ServiceTransaction) obj;
                        String b = provisionRequest.getDefaultUrl();
                        Intrinsics.checkReturnedValueIsNotNull((Object) b, "request.defaultUrl");
                        byte[] a = provisionRequest.getData();
                        Intrinsics.checkReturnedValueIsNotNull((Object) a, "request.data");
                        return drmProvider.executeProvisionRequest(serviceTransaction, b, a, this.playbackSessionId, this.isOffline);
                    } catch (Exception e) {
                        QOSPlaybackEventListener qOSPlaybackEventListener = this.listenerQOS;
                        if (qOSPlaybackEventListener != null) {
                            PlaybackEndedEventData playbackEndedEventData = new PlaybackEndedEventData(this.playbackSessionId, 0, PlaybackEndCause.error, PlaybackError.drmOther);
                            qOSPlaybackEventListener.onEvent(playbackEndedEventData);
                        }
                        PlaybackEventListener playbackEventListener = this.listener;
                        if (playbackEventListener != null) {
                            playbackEventListener.onException(e);
                        }
                        throw e;
                    }
                }
            }
            return new byte[0];
        }

        public final void setListener(PlaybackEventListener playbackEventListener) {
            this.listener = playbackEventListener;
        }

        public final void setListenerQOS(QOSPlaybackEventListener qOSPlaybackEventListener) {
            this.listenerQOS = qOSPlaybackEventListener;
        }
    }

    private WidevineDrmSessionManager() {
    }

    private final DefaultDrmSessionManager<C8713o> createSessionManager(DrmProvider drmProvider, boolean z, CompositeCallback compositeCallback) {
        if (drmProvider.getUuid() != null) {
            DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(drmProvider.getUuid(), FrameworkMediaDrm.m25194b(drmProvider.getUuid()), compositeCallback, new HashMap(), z, 3);
            return defaultDrmSessionManager;
        }
        throw new RuntimeException("DRM Scheme not found.  Only Widevine and Playready are supported");
    }

    public DrmSession<C8713o> acquireSession(Looper looper, DrmInitData drmInitData) {
        boolean z = (delegateMapper.getAudioManager() == null || delegateMapper.getVideoSession() == null) ? false : true;
        DefaultDrmSessionManager manager = delegateMapper.getManager(z);
        DrmSession<C8713o> acquireSession = manager != null ? manager.acquireSession(looper, drmInitData) : null;
        delegateMapper.putSession(z, acquireSession);
        String extractSessionKeyId = extractSessionKeyId(acquireSession);
        if (extractSessionKeyId != null && !playbackLock.contains(extractSessionKeyId)) {
            playbackLock.offer(extractSessionKeyId);
        }
        return acquireSession;
    }

    public boolean canAcquireSession(DrmInitData drmInitData) {
        DefaultDrmSessionManager videoManager = delegateMapper.getVideoManager();
        return videoManager != null && videoManager.canAcquireSession(drmInitData);
    }

    public final void clearCallbackAndEventListeners() {
        CompositeCallback compositeCallback = videoManagerCallback;
        if (compositeCallback != null) {
            compositeCallback.setListener(null);
        }
        CompositeCallback compositeCallback2 = videoManagerCallback;
        if (compositeCallback2 != null) {
            compositeCallback2.setListenerQOS(null);
        }
        videoManagerCallback = null;
        CompositeCallback compositeCallback3 = audioManagerCallback;
        if (compositeCallback3 != null) {
            compositeCallback3.setListener(null);
        }
        CompositeCallback compositeCallback4 = audioManagerCallback;
        if (compositeCallback4 != null) {
            compositeCallback4.setListenerQOS(null);
        }
        audioManagerCallback = null;
    }

    public final void create(DrmProvider drmProvider, PlaybackEventListener playbackEventListener, QOSPlaybackEventListener qOSPlaybackEventListener, byte[] bArr, byte[] bArr2, boolean z, String str, boolean z2) {
        DrmProvider drmProvider2 = drmProvider;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        boolean z3 = z;
        delegateMapper.reset();
        CompositeCallback compositeCallback = new CompositeCallback(drmProvider, playbackEventListener, qOSPlaybackEventListener, str, z2);
        videoManagerCallback = compositeCallback;
        delegateMapper.setVideoManager(createSessionManager(drmProvider, z3, videoManagerCallback));
        if (bArr3 != null) {
            DefaultDrmSessionManager videoManager = delegateMapper.getVideoManager();
            if (videoManager != null) {
                videoManager.mo22743a(0, bArr3);
            }
            if (bArr4 != null) {
                if (!(bArr4.length == 0)) {
                    CompositeCallback compositeCallback2 = new CompositeCallback(drmProvider, playbackEventListener, qOSPlaybackEventListener, str, z2);
                    audioManagerCallback = compositeCallback2;
                    delegateMapper.setAudioManager(INSTANCE.createSessionManager(drmProvider, z3, audioManagerCallback));
                    DefaultDrmSessionManager audioManager = delegateMapper.getAudioManager();
                    if (audioManager != null) {
                        audioManager.mo22743a(0, bArr4);
                    }
                }
            }
        }
    }

    public final String extractSessionKeyId(DrmSession<C8713o> drmSession) {
        if (drmSession != null) {
            byte[] c = drmSession.mo22772c();
            if (c != null) {
                return new String(c, C12801c.f29474a);
            }
        }
        return null;
    }

    public final boolean isSessionActive(byte[] bArr) {
        return playbackLock.contains(new String(bArr, C12801c.f29474a));
    }

    public void releaseSession(DrmSession<C8713o> drmSession) {
        playbackLock.remove(extractSessionKeyId(drmSession));
        if (drmSession != null) {
            DefaultDrmSessionManager manager = delegateMapper.getManager(drmSession);
            if (manager != null) {
                manager.releaseSession(drmSession);
            }
            delegateMapper.clearSession(drmSession);
        }
    }
}
