package com.bamtech.sdk4.media;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.internal.media.StreamSampler;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter;
import com.bamtech.sdk4.media.adapters.PlaybackEventListener;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020%H\u0016J\"\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u001aH\u0016J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020%H\u0016J\b\u00101\u001a\u00020%H\u0016J\b\u00102\u001a\u00020%H\u0016J\u0010\u00103\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u00103\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*H\u0016J\b\u00104\u001a\u00020%H\u0016J\u001c\u00104\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u0005H\u0002J/\u0010;\u001a\u00020%\"\b\b\u0000\u0010<*\u00020\u00072\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u0002H<2\u0006\u0010=\u001a\u00020'H\u0004¢\u0006\u0002\u0010>R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006@"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/AbstractPlaybackSession;", "Lcom/bamtech/sdk4/media/PlaybackSession;", "Lcom/bamtech/sdk4/media/adapters/PlaybackEventListener;", "()V", "_isReleased", "", "currentMediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "getCurrentMediaItem", "()Lcom/bamtech/sdk4/media/MediaItem;", "currentServiceTransaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "defaultQosPlaybackEventListener", "Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "getDefaultQosPlaybackEventListener", "()Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "isInitialized", "()Z", "isReleased", "mediaItem", "playerAdapter", "Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "getPlayerAdapter", "()Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "serverData", "", "", "", "streamSampler", "Lcom/bamtech/sdk4/internal/media/StreamSampler;", "getStreamSampler", "()Lcom/bamtech/sdk4/internal/media/StreamSampler;", "transactionProvider", "Ljavax/inject/Provider;", "getTransactionProvider", "()Ljavax/inject/Provider;", "collectStreamSample", "", "doPrepare", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "transaction", "playlistType", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "onError", "errorMessage", "onException", "throwable", "", "onPause", "onPlay", "onPlayedToCompletion", "prepare", "release", "endCause", "Lcom/bamtech/sdk4/media/PlaybackEndCause;", "error", "Lcom/bamtech/sdk4/media/PlaybackError;", "serviceTransaction", "restart", "start", "T", "playlist", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/media/MediaItem;Lcom/bamtech/sdk4/media/MediaItemPlaylist;)V", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AbstractPlaybackSession.kt */
public abstract class AbstractPlaybackSession implements PlaybackSession, PlaybackEventListener {
    private boolean _isReleased;
    private ServiceTransaction currentServiceTransaction;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/AbstractPlaybackSession$Companion;", "", "()V", "PLAYLIST_TYPE", "", "STREAM_URL", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AbstractPlaybackSession.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public static /* synthetic */ MediaItemPlaylist doPrepare$default(AbstractPlaybackSession abstractPlaybackSession, ServiceTransaction serviceTransaction, MediaItem mediaItem, PlaylistType playlistType, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                playlistType = null;
            }
            return abstractPlaybackSession.doPrepare(serviceTransaction, mediaItem, playlistType);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doPrepare");
    }

    private final ServiceTransaction serviceTransaction(boolean z) {
        if (!z) {
            ServiceTransaction serviceTransaction = this.currentServiceTransaction;
            String str = "currentServiceTransaction";
            if (serviceTransaction == null) {
                C12880j.m40227c(str);
                throw null;
            } else if (serviceTransaction != null) {
                if (serviceTransaction == null) {
                    C12880j.m40227c(str);
                    throw null;
                } else if (serviceTransaction != null) {
                    return serviceTransaction;
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            }
        }
        Object obj = getTransactionProvider().get();
        ServiceTransaction serviceTransaction2 = (ServiceTransaction) obj;
        C12880j.m40222a((Object) serviceTransaction2, "it");
        this.currentServiceTransaction = serviceTransaction2;
        C12880j.m40222a(obj, "transactionProvider.get(…ServiceTransaction = it }");
        return serviceTransaction2;
    }

    public void collectStreamSample() {
        getStreamSampler().collectStreamSample();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r5 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bamtech.sdk4.media.MediaItemPlaylist doPrepare(com.bamtech.sdk4.internal.service.ServiceTransaction r3, com.bamtech.sdk4.media.MediaItem r4, com.bamtech.sdk4.internal.configuration.PlaylistType r5) {
        /*
            r2 = this;
            com.bamtech.sdk4.internal.media.StreamSampler r0 = r2.getStreamSampler()
            r0.setMediaItem(r4)
            com.bamtech.sdk4.internal.media.StreamSampler r0 = r2.getStreamSampler()
            com.bamtech.sdk4.media.MediaAnalyticsKey r1 = com.bamtech.sdk4.media.MediaAnalyticsKey.TELEMETRY
            java.util.Map r1 = r4.getTrackingData(r1)
            r0.setServerData(r1)
            if (r5 == 0) goto L_0x001d
            com.bamtech.sdk4.media.MediaItemPlaylist r5 = r4.tryGetPreferredPlaylist(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            com.bamtech.sdk4.media.MediaItemPlaylist r5 = r4.getDefaultPlaylist()
        L_0x0021:
            r2.start(r3, r4, r5)
            com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter r0 = r2.getPlayerAdapter()
            java.util.UUID r1 = r4.getPreferredDrmScheme()
            r0.onPrepared(r4, r5, r3, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.AbstractPlaybackSession.doPrepare(com.bamtech.sdk4.internal.service.ServiceTransaction, com.bamtech.sdk4.media.MediaItem, com.bamtech.sdk4.internal.configuration.PlaylistType):com.bamtech.sdk4.media.MediaItemPlaylist");
    }

    public abstract AbstractPlayerAdapter getPlayerAdapter();

    public abstract StreamSampler getStreamSampler();

    public abstract Provider<ServiceTransaction> getTransactionProvider();

    public final boolean isReleased() {
        return this._isReleased;
    }

    public void onException(Throwable th) {
    }

    public void onPause() {
        getStreamSampler().cleanup();
    }

    public void onPlay() {
        getStreamSampler().collectPeriodicStreamSample();
    }

    public void onPlayedToCompletion() {
        getStreamSampler().cleanup();
    }

    public MediaItemPlaylist prepare(MediaItem mediaItem) {
        return doPrepare$default(this, serviceTransaction(true), mediaItem, null, 4, null);
    }

    public void release(PlaybackEndCause playbackEndCause, PlaybackError playbackError) {
        DefaultImpls.logDust$default(serviceTransaction(true), PlaybackSessionProvider.Companion.getMEDIA_API_RELEASE(), "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
        getPlayerAdapter().clean();
        getStreamSampler().cleanup();
        getStreamSampler().release(playbackEndCause, playbackError);
        this._isReleased = true;
    }

    /* access modifiers changed from: protected */
    public final <T extends MediaItem> void start(ServiceTransaction serviceTransaction, T t, MediaItemPlaylist mediaItemPlaylist) {
        String str = "streamUrl";
        ServiceTransaction serviceTransaction2 = serviceTransaction;
        DefaultImpls.logDust$default(serviceTransaction2, PlaybackSessionProvider.Companion.getMEDIA_API_PREPARE(), "urn:bamtech:dust:bamsdk:event:sdk", C13170i0.m40332a(C12907r.m40244a(str, mediaItemPlaylist.getStreamUri())), LogLevel.INFO, false, 16, null);
        if (!isReleased()) {
            t.getTrackingData(MediaAnalyticsKey.TELEMETRY);
            String str2 = "urn:bamtech:dust:bamsdk:event:sdk";
            ServiceTransaction serviceTransaction3 = serviceTransaction;
            DefaultImpls.logDust$default(serviceTransaction3, PlaybackSessionProvider.Companion.getMEDIA_API_SET_SOURCE(), str2, C13173j0.m40356a(C12907r.m40244a(str, mediaItemPlaylist.getStreamUri()), C12907r.m40244a("playlistType", mediaItemPlaylist.getPlaylistType())), LogLevel.INFO, false, 16, null);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("The PlaybackSession has been released and cannot be reused.");
        ServiceTransaction serviceTransaction4 = serviceTransaction;
        DefaultImpls.logDust$default(serviceTransaction4, PlaybackSessionProvider.Companion.getMEDIA_API_PREPARE(), "urn:bamtech:dust:bamsdk:error:sdk", illegalStateException, LogLevel.ERROR, false, 16, null);
        throw illegalStateException;
    }
}
