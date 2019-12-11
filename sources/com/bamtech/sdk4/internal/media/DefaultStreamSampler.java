package com.bamtech.sdk4.internal.media;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.media.offline.OfflineMediaItem;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.RequestType;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.PlaybackEndCause;
import com.bamtech.sdk4.media.PlaybackEndedEventData;
import com.bamtech.sdk4.media.PlaybackError;
import com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter;
import com.bamtech.sdk4.media.adapters.PlaybackMetrics;
import com.bamtech.sdk4.media.storage.PlayheadRecorder;
import java.util.Map;
import java.util.UUID;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p524d0.C11917a;
import p520io.reactivex.p524d0.C11922d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000206H\u0016J\b\u00108\u001a\u000206H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0015\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=J\u0017\u0010>\u001a\u0002062\b\b\u0002\u0010?\u001a\u00020@H\u0000¢\u0006\u0002\bAJ\u0012\u0010B\u001a\u0002062\b\b\u0002\u0010C\u001a\u00020\u0011H\u0002J\u001c\u0010D\u001a\u0002062\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010I\u001a\u0002062\u0006\u0010J\u001a\u00020KH\u0002J\u0012\u0010L\u001a\u00020\u000e2\b\b\u0002\u0010M\u001a\u00020\u0011H\u0002J\b\u0010N\u001a\u000206H\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R*\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006O"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/DefaultStreamSampler;", "Lcom/bamtech/sdk4/internal/media/StreamSampler;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "playerAdapter", "Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "streamBuffer", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "recorder", "Lcom/bamtech/sdk4/media/storage/PlayheadRecorder;", "defaultQosPlaybackEventListener", "Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/media/storage/PlayheadRecorder;Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;Ljavax/inject/Provider;)V", "_isReleased", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getConfigurationProvider", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "currentServiceTransaction", "getDefaultQosPlaybackEventListener", "()Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "isInitialized", "()Z", "isReleased", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "getMediaItem", "()Lcom/bamtech/sdk4/media/MediaItem;", "setMediaItem", "(Lcom/bamtech/sdk4/media/MediaItem;)V", "getPlayerAdapter", "()Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "getRecorder", "()Lcom/bamtech/sdk4/media/storage/PlayheadRecorder;", "serverData", "", "", "", "getServerData", "()Ljava/util/Map;", "setServerData", "(Ljava/util/Map;)V", "sessionId", "getStreamBuffer", "()Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "timer", "Lio/reactivex/disposables/Disposable;", "getTransactionProvider", "()Ljavax/inject/Provider;", "cleanup", "", "collectPeriodicStreamSample", "collectStreamSample", "createSample", "Lcom/bamtech/sdk4/internal/media/StreamSample;", "info", "Lcom/bamtech/sdk4/media/adapters/PlaybackMetrics;", "createSample$sdk_core_api_release", "postEvent", "type", "Lcom/bamtech/sdk4/internal/telemetry/RequestType;", "postEvent$sdk_core_api_release", "recordStreamSample", "newSequence", "release", "endCause", "Lcom/bamtech/sdk4/media/PlaybackEndCause;", "error", "Lcom/bamtech/sdk4/media/PlaybackError;", "scheduleNext", "delay", "", "serviceTransaction", "restart", "stopCollectingStreamSample", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultStreamSampler.kt */
public final class DefaultStreamSampler implements StreamSampler {
    private boolean _isReleased;
    private CompositeDisposable compositeDisposable;
    private final ConfigurationProvider configurationProvider;
    private ServiceTransaction currentServiceTransaction;
    private final DefaultQOSPlaybackEventListener defaultQosPlaybackEventListener;
    private MediaItem mediaItem;
    private final AbstractPlayerAdapter playerAdapter;
    private final PlayheadRecorder recorder;
    private Map<String, ? extends Object> serverData;
    private String sessionId;
    private final EventBuffer streamBuffer;
    private Disposable timer;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultStreamSampler(ConfigurationProvider configurationProvider2, AbstractPlayerAdapter abstractPlayerAdapter, EventBuffer eventBuffer, PlayheadRecorder playheadRecorder, DefaultQOSPlaybackEventListener defaultQOSPlaybackEventListener, Provider<ServiceTransaction> provider) {
        this.configurationProvider = configurationProvider2;
        this.playerAdapter = abstractPlayerAdapter;
        this.streamBuffer = eventBuffer;
        this.recorder = playheadRecorder;
        this.defaultQosPlaybackEventListener = defaultQOSPlaybackEventListener;
        this.transactionProvider = provider;
        Object obj = this.transactionProvider.get();
        C12880j.m40222a(obj, "transactionProvider.get()");
        this.currentServiceTransaction = (ServiceTransaction) obj;
        String uuid = UUID.randomUUID().toString();
        C12880j.m40222a((Object) uuid, "UUID.randomUUID().toString()");
        this.sessionId = uuid;
    }

    private final CompositeDisposable compositeDisposable() {
        if (this.compositeDisposable == null) {
            this.compositeDisposable = new CompositeDisposable();
        }
        CompositeDisposable compositeDisposable2 = this.compositeDisposable;
        if (compositeDisposable2 != null) {
            return compositeDisposable2;
        }
        C12880j.m40220a();
        throw null;
    }

    private final void recordStreamSample(boolean z) {
        if (isInitialized() && getServerData() != null) {
            postEvent$sdk_core_api_release(RequestType.SequenceRequest);
            C11917a.m38473a(C11922d.m38479a(this.configurationProvider.getServiceConfigurationExtras(serviceTransaction(z), DefaultStreamSampler$recordStreamSample$1$1.INSTANCE), null, new DefaultStreamSampler$recordStreamSample$$inlined$let$lambda$1(this, z), 1, null), compositeDisposable());
        }
    }

    static /* synthetic */ void recordStreamSample$default(DefaultStreamSampler defaultStreamSampler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        defaultStreamSampler.recordStreamSample(z);
    }

    /* access modifiers changed from: private */
    public final void scheduleNext(long j) {
        Observable d = this.configurationProvider.getServiceConfiguration(serviceTransaction$default(this, false, 1, null), DefaultStreamSampler$scheduleNext$1.INSTANCE).mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new DefaultStreamSampler$scheduleNext$2<Object,Object>(this, j));
        C12880j.m40222a((Object) d, "configurationProvider.ge…ECONDS)\n                }");
        Disposable a = C11922d.m38477a(d, null, null, new DefaultStreamSampler$scheduleNext$3(this), 3, null);
        C11917a.m38473a(a, compositeDisposable());
        this.timer = a;
    }

    private final ServiceTransaction serviceTransaction(boolean z) {
        if (!z) {
            ServiceTransaction serviceTransaction = this.currentServiceTransaction;
            if (serviceTransaction != null) {
                if (serviceTransaction != null) {
                    return serviceTransaction;
                }
                C12880j.m40220a();
                throw null;
            }
        }
        Object obj = this.transactionProvider.get();
        ServiceTransaction serviceTransaction2 = (ServiceTransaction) obj;
        C12880j.m40222a((Object) serviceTransaction2, "it");
        this.currentServiceTransaction = serviceTransaction2;
        C12880j.m40222a(obj, "transactionProvider.get(…ServiceTransaction = it }");
        return serviceTransaction2;
    }

    static /* synthetic */ ServiceTransaction serviceTransaction$default(DefaultStreamSampler defaultStreamSampler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return defaultStreamSampler.serviceTransaction(z);
    }

    public void cleanup() {
        stopCollectingStreamSample();
        CompositeDisposable compositeDisposable2 = this.compositeDisposable;
        if (compositeDisposable2 != null) {
            compositeDisposable2.dispose();
        }
        this.compositeDisposable = null;
    }

    public void collectPeriodicStreamSample() {
        recordStreamSample(true);
    }

    public void collectStreamSample() {
        serviceTransaction(true);
        postEvent$sdk_core_api_release(RequestType.OneOffRequest);
    }

    public final StreamSample createSample$sdk_core_api_release(PlaybackMetrics playbackMetrics) {
        StreamSampleTelemetryData streamSampleTelemetryData = new StreamSampleTelemetryData(this.sessionId, playbackMetrics.getCurrentPlayheadInSeconds(), playbackMetrics.getCurrentBitrate(), getMediaItem() instanceof OfflineMediaItem);
        return new StreamSample(getServerData(), streamSampleTelemetryData);
    }

    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    public Map<String, Object> getServerData() {
        return this.serverData;
    }

    public final boolean isInitialized() {
        return getMediaItem() != null && !isReleased();
    }

    public final boolean isReleased() {
        return this._isReleased;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r12 != null) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void postEvent$sdk_core_api_release(com.bamtech.sdk4.internal.telemetry.RequestType r12) {
        /*
            r11 = this;
            boolean r0 = r11.isInitialized()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter r0 = r11.playerAdapter
            com.bamtech.sdk4.media.adapters.PlaybackMetrics r0 = r0.getPlaybackMetrics()
            com.bamtech.sdk4.internal.media.StreamSample r1 = r11.createSample$sdk_core_api_release(r0)
            com.bamtech.sdk4.internal.telemetry.EventBuffer r2 = r11.streamBuffer
            r2.postEvent(r1, r12)
            com.bamtech.sdk4.media.MediaItem r12 = r11.getMediaItem()
            r2 = 0
            if (r12 == 0) goto L_0x002a
            com.bamtech.sdk4.media.MediaPlayhead r12 = r12.getPlayhead()
            if (r12 == 0) goto L_0x002a
            java.lang.String r12 = r12.getContentId()
            if (r12 == 0) goto L_0x002a
            goto L_0x003a
        L_0x002a:
            com.bamtech.sdk4.media.MediaItem r12 = r11.getMediaItem()
            if (r12 == 0) goto L_0x003c
            com.bamtech.sdk4.media.MediaDescriptor r12 = r12.getDescriptor()
            if (r12 == 0) goto L_0x003c
            java.lang.String r12 = r12.getCachedMediaId()
        L_0x003a:
            r5 = r12
            goto L_0x003d
        L_0x003c:
            r5 = r2
        L_0x003d:
            com.bamtech.sdk4.media.storage.PlayheadRecorder r3 = r11.recorder
            r12 = 0
            r4 = 1
            com.bamtech.sdk4.internal.service.ServiceTransaction r4 = serviceTransaction$default(r11, r12, r4, r2)
            long r6 = r0.getCurrentPlayheadInSeconds()
            com.bamtech.sdk4.internal.telemetry.TelemetryClientPayload r12 = r1.getClient()
            com.bamtech.sdk4.internal.media.StreamSampleTelemetryData r12 = (com.bamtech.sdk4.internal.media.StreamSampleTelemetryData) r12
            long r8 = r12.getTimestamp()
            com.bamtech.sdk4.media.MediaItem r12 = r11.getMediaItem()
            if (r12 == 0) goto L_0x0063
            com.bamtech.sdk4.media.MediaDescriptor r12 = r12.getDescriptor()
            if (r12 == 0) goto L_0x0063
            java.lang.String r2 = r12.getPlaybackUrl()
        L_0x0063:
            r10 = r2
            io.reactivex.Flowable r12 = r3.recordPlayheadAndBookmark(r4, r5, r6, r8, r10)
            io.reactivex.r r1 = p520io.reactivex.p525e0.C11934b.m38500b()
            io.reactivex.Flowable r12 = r12.mo30086b(r1)
            com.bamtech.sdk4.internal.media.DefaultStreamSampler$postEvent$1 r1 = com.bamtech.sdk4.internal.media.DefaultStreamSampler$postEvent$1.INSTANCE
            com.bamtech.sdk4.internal.media.DefaultStreamSampler$postEvent$2 r2 = com.bamtech.sdk4.internal.media.DefaultStreamSampler$postEvent$2.INSTANCE
            io.reactivex.disposables.Disposable r12 = r12.mo30077a(r1, r2)
            java.lang.String r1 = "recorder.recordPlayheadA…       .subscribe({}, {})"
            kotlin.jvm.internal.C12880j.m40222a(r12, r1)
            io.reactivex.disposables.CompositeDisposable r1 = r11.compositeDisposable()
            p520io.reactivex.p524d0.C11917a.m38473a(r12, r1)
            com.bamtech.sdk4.media.MediaItem r12 = r11.getMediaItem()
            if (r12 == 0) goto L_0x00ad
            com.bamtech.sdk4.media.PlaybackContext r12 = r12.getPlaybackContext()
            if (r12 == 0) goto L_0x00ad
            java.lang.String r2 = r12.getPlaybackSessionId()
            if (r2 == 0) goto L_0x00ad
            com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener r12 = r11.defaultQosPlaybackEventListener
            com.bamtech.sdk4.media.PlaybackSampledEventData r7 = new com.bamtech.sdk4.media.PlaybackSampledEventData
            long r3 = r0.getCurrentPlayheadInSeconds()
            java.lang.Long r5 = r0.getCurrentBitrate()
            com.bamtech.sdk4.media.BitrateType r6 = r0.getBitrateType()
            r1 = r7
            r1.<init>(r2, r3, r5, r6)
            r12.onEvent(r7)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.DefaultStreamSampler.postEvent$sdk_core_api_release(com.bamtech.sdk4.internal.telemetry.RequestType):void");
    }

    public void release(PlaybackEndCause playbackEndCause, PlaybackError playbackError) {
        this._isReleased = true;
        if (playbackEndCause != null) {
            try {
                MediaItem mediaItem2 = getMediaItem();
                if (mediaItem2 != null) {
                    PlaybackContext playbackContext = mediaItem2.getPlaybackContext();
                    if (playbackContext != null) {
                        String playbackSessionId = playbackContext.getPlaybackSessionId();
                        if (playbackSessionId != null) {
                            DefaultQOSPlaybackEventListener defaultQOSPlaybackEventListener = this.defaultQosPlaybackEventListener;
                            PlaybackEndedEventData playbackEndedEventData = new PlaybackEndedEventData(playbackSessionId, this.playerAdapter.getPlaybackMetrics().getCurrentPlayhead(), playbackEndCause, playbackError);
                            defaultQOSPlaybackEventListener.onEvent(playbackEndedEventData);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setMediaItem(MediaItem mediaItem2) {
        this.mediaItem = mediaItem2;
    }

    public void setServerData(Map<String, ? extends Object> map) {
        this.serverData = map;
    }

    public void stopCollectingStreamSample() {
        DefaultImpls.d$default(serviceTransaction(true), this, "StreamSampleDispatchSuspended", false, 4, null);
        Disposable disposable = this.timer;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
