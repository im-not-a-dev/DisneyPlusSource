package com.bamtech.sdk4.internal.media.offline;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bamtech.sdk4.internal.media.offline.error.PlaybackInProgressError;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.adapters.exoplayer.WidevineDrmSessionManager;
import com.bamtech.sdk4.media.drm.WidevineDrmProvider;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.drm.C8709k;
import com.google.android.exoplayer2.drm.C8713o;
import com.google.android.exoplayer2.drm.C8715q;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\bH\u0002JM\u0010\u001a\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001e\u0012\u0004\u0012\u0002H\u001b0\u001dH\u0007¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/OfflineLicenseManager;", "Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "drmProvider", "Lcom/bamtech/sdk4/media/drm/WidevineDrmProvider;", "playbackSession", "Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager;", "(Lcom/bamtech/sdk4/media/drm/WidevineDrmProvider;Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager;)V", "download", "", "drmInitData", "Lcom/google/android/exoplayer2/drm/DrmInitData;", "currentLicense", "getDrmSessionManager", "Lcom/google/android/exoplayer2/drm/DefaultDrmSessionManager;", "Lcom/google/android/exoplayer2/drm/FrameworkMediaCrypto;", "mode", "Lcom/bamtech/sdk4/internal/media/offline/DRMKeyMode;", "getLicenseDuration", "", "license", "release", "permanently", "", "renew", "verifyNotPlaying", "", "withDrmSession", "T", "block", "Lkotlin/Function1;", "Lcom/google/android/exoplayer2/drm/DrmSession;", "(Lcom/bamtech/sdk4/internal/media/offline/DRMKeyMode;[BLcom/google/android/exoplayer2/drm/DrmInitData;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "WidevineDrmCallback", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineLicenseManager.kt */
public final class OfflineLicenseManager implements WidevineLicenseManager {
    private final WidevineDrmProvider drmProvider;
    private final WidevineDrmSessionManager playbackSession;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/OfflineLicenseManager$WidevineDrmCallback;", "Lcom/google/android/exoplayer2/drm/MediaDrmCallback;", "provider", "Lcom/bamtech/sdk4/media/drm/WidevineDrmProvider;", "requestMode", "Lcom/bamtech/sdk4/internal/media/offline/DRMKeyMode;", "(Lcom/bamtech/sdk4/media/drm/WidevineDrmProvider;Lcom/bamtech/sdk4/internal/media/offline/DRMKeyMode;)V", "executeKeyRequest", "", "uuid", "Ljava/util/UUID;", "request", "Lcom/google/android/exoplayer2/drm/ExoMediaDrm$KeyRequest;", "executeProvisionRequest", "Lcom/google/android/exoplayer2/drm/ExoMediaDrm$ProvisionRequest;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: OfflineLicenseManager.kt */
    private static final class WidevineDrmCallback implements C8715q {
        private final WidevineDrmProvider provider;
        private final DRMKeyMode requestMode;

        @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[DRMKeyMode.values().length];

            static {
                $EnumSwitchMapping$0[DRMKeyMode.Release.ordinal()] = 1;
                $EnumSwitchMapping$0[DRMKeyMode.Renew.ordinal()] = 2;
            }
        }

        public WidevineDrmCallback(WidevineDrmProvider widevineDrmProvider, DRMKeyMode dRMKeyMode) {
            this.provider = widevineDrmProvider;
            this.requestMode = dRMKeyMode;
        }

        public byte[] executeKeyRequest(UUID uuid, KeyRequest keyRequest) {
            Single single;
            if (!(!Intrinsics.areEqual((Object) uuid, (Object) C8883r.WIDEVINE_UUID))) {
                if ((keyRequest != null ? keyRequest.getData() : null) != null) {
                    ServiceTransaction serviceTransaction = (ServiceTransaction) this.provider.getTransactionProvider().get();
                    byte[] a = keyRequest.getData();
                    int i = WhenMappings.$EnumSwitchMapping$0[this.requestMode.ordinal()];
                    String str = "requestData";
                    String str2 = "transaction";
                    if (i == 1) {
                        WidevineDrmProvider widevineDrmProvider = this.provider;
                        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, str2);
                        Intrinsics.checkReturnedValueIsNotNull((Object) a, str);
                        single = widevineDrmProvider.releaseWidevineOfflineLicense(serviceTransaction, a, false);
                    } else if (i != 2) {
                        WidevineDrmProvider widevineDrmProvider2 = this.provider;
                        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, str2);
                        Intrinsics.checkReturnedValueIsNotNull((Object) a, str);
                        single = widevineDrmProvider2.getWidevineOfflineLicense(serviceTransaction, a, null, true);
                    } else {
                        WidevineDrmProvider widevineDrmProvider3 = this.provider;
                        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, str2);
                        Intrinsics.checkReturnedValueIsNotNull((Object) a, str);
                        single = widevineDrmProvider3.renewWidevineOfflineLicense(serviceTransaction, a, null, true);
                    }
                    Object c = single.mo30224c();
                    Intrinsics.checkReturnedValueIsNotNull(c, "let {\n                wh…          }.blockingGet()");
                    return (byte[]) c;
                }
            }
            return new byte[0];
        }

        public byte[] executeProvisionRequest(UUID uuid, ProvisionRequest provisionRequest) {
            if (Intrinsics.areEqual((Object) uuid, (Object) C8883r.WIDEVINE_UUID)) {
                if ((provisionRequest != null ? provisionRequest.getData() : null) != null) {
                    WidevineDrmProvider widevineDrmProvider = this.provider;
                    Object obj = widevineDrmProvider.getTransactionProvider().get();
                    Intrinsics.checkReturnedValueIsNotNull(obj, "provider.transactionProvider.get()");
                    ServiceTransaction serviceTransaction = (ServiceTransaction) obj;
                    String b = provisionRequest.getDefaultUrl();
                    byte[] a = provisionRequest.getData();
                    Intrinsics.checkReturnedValueIsNotNull((Object) a, "request.data");
                    Object c = widevineDrmProvider.getWidevineCertificate(serviceTransaction, b, a, null, true).mo30224c();
                    Intrinsics.checkReturnedValueIsNotNull(c, "provider.getWidevineCert…null, true).blockingGet()");
                    return (byte[]) c;
                }
            }
            return new byte[0];
        }
    }

    public OfflineLicenseManager(WidevineDrmProvider widevineDrmProvider, WidevineDrmSessionManager widevineDrmSessionManager) {
        this.drmProvider = widevineDrmProvider;
        this.playbackSession = widevineDrmSessionManager;
    }

    private final void verifyNotPlaying(byte[] bArr) {
        if (this.playbackSession.isSessionActive(bArr)) {
            throw new PlaybackInProgressError();
        }
    }

    public static /* synthetic */ Object withDrmSession$default(OfflineLicenseManager offlineLicenseManager, DRMKeyMode dRMKeyMode, byte[] bArr, DrmInitData drmInitData, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        if ((i & 4) != 0) {
            drmInitData = null;
        }
        return offlineLicenseManager.withDrmSession(dRMKeyMode, bArr, drmInitData, function1);
    }

    public byte[] download(DrmInitData drmInitData, byte[] bArr) {
        DRMKeyMode dRMKeyMode;
        if (bArr != null) {
            verifyNotPlaying(bArr);
        }
        if (bArr != null) {
            dRMKeyMode = DRMKeyMode.Renew;
        } else {
            dRMKeyMode = DRMKeyMode.Obtain;
        }
        Object withDrmSession = withDrmSession(dRMKeyMode, null, drmInitData, OfflineLicenseManager$download$2.INSTANCE);
        Intrinsics.checkReturnedValueIsNotNull(withDrmSession, "withDrmSession(mode, nul…censeKeySetId!!\n        }");
        return (byte[]) withDrmSession;
    }

    public final DefaultDrmSessionManager<C8713o> getDrmSessionManager(DRMKeyMode dRMKeyMode) {
        DefaultDrmSessionManager<C8713o> a = DefaultDrmSessionManager.m25147a((C8715q) new WidevineDrmCallback(this.drmProvider, dRMKeyMode), new HashMap<>());
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "DefaultDrmSessionManager…ring, String>()\n        )");
        return a;
    }

    public long getLicenseDuration(byte[] bArr) {
        return ((Number) withDrmSession$default(this, DRMKeyMode.Query, bArr, null, OfflineLicenseManager$getLicenseDuration$1.INSTANCE, 4, null)).longValue();
    }

    public byte[] release(byte[] bArr, boolean z) {
        verifyNotPlaying(bArr);
        FrameworkMediaDrm b = FrameworkMediaDrm.m25194b(C8883r.WIDEVINE_UUID);
        KeyRequest a = b.mo22775a(bArr, null, 3, null);
        WidevineDrmProvider widevineDrmProvider = this.drmProvider;
        Object obj = widevineDrmProvider.getTransactionProvider().get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "drmProvider.transactionProvider.get()");
        ServiceTransaction serviceTransaction = (ServiceTransaction) obj;
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "requestData");
        byte[] a2 = a.getData();
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "requestData.data");
        Object c = widevineDrmProvider.releaseWidevineOfflineLicense(serviceTransaction, a2, z).mo30233g(new OfflineLicenseManager$release$1(b, bArr)).mo30224c();
        Intrinsics.checkReturnedValueIsNotNull(c, "drmProvider.releaseWidev…           .blockingGet()");
        return (byte[]) c;
    }

    public final <T> T withDrmSession(DRMKeyMode dRMKeyMode, byte[] bArr, DrmInitData drmInitData, Function1<? super DrmSession<C8713o>, ? extends T> function1) {
        ConditionVariable conditionVariable = new ConditionVariable();
        DefaultDrmSessionManager drmSessionManager = getDrmSessionManager(dRMKeyMode);
        HandlerThread handlerThread = new HandlerThread("OfflineLicenseManager");
        handlerThread.start();
        drmSessionManager.mo22744a(new Handler(handlerThread.getLooper()), (C8709k) new OfflineLicenseManager$withDrmSession$eventListener$1(conditionVariable));
        try {
            drmSessionManager.mo22743a(dRMKeyMode.toDrmSessionMode(), bArr);
            Looper looper = handlerThread.getLooper();
            conditionVariable.close();
            DrmSession acquireSession = drmSessionManager.acquireSession(looper, drmInitData);
            conditionVariable.block();
            Intrinsics.checkReturnedValueIsNotNull((Object) acquireSession, "session");
            T invoke = function1.invoke(acquireSession);
            drmSessionManager.releaseSession(acquireSession);
            return invoke;
        } finally {
            handlerThread.quit();
        }
    }
}
