package com.bamtech.sdk4.media;

import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.internal.media.MediaManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.media.adapters.PlayerAdapter;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001J\u0018\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00132\u0006\u0010 \u001a\u00020\u0014H\u0016J4\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020)0(H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/DefaultMediaApi;", "Lcom/bamtech/sdk4/media/MediaApi;", "Lcom/bamtech/sdk4/media/PlaybackSessionProvider;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "playbackSessionProvider", "mediaManager", "Lcom/bamtech/sdk4/internal/media/MediaManager;", "transformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "defaultQosPlaybackEventListener", "Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/media/PlaybackSessionProvider;Lcom/bamtech/sdk4/internal/media/MediaManager;Lcom/bamtech/sdk4/session/RenewSessionTransformers;Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;)V", "createPlaybackSession", "Lcom/bamtech/sdk4/media/PlaybackSession;", "playerAdapter", "Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;", "fetch", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/media/MediaItem;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "getBifThumbnail", "", "presentation", "Lcom/bamtech/sdk4/Presentation;", "getBifThumbnailSets", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "mediaItem", "initializePlaybackContext", "playbackIntent", "Lcom/bamtech/sdk4/media/PlaybackIntent;", "isPreBuffering", "", "offline", "data", "", "", "transferPlaybackContext", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultMediaApi.kt */
public final class DefaultMediaApi implements MediaApi, PlaybackSessionProvider {
    private final /* synthetic */ PlaybackSessionProvider $$delegate_0;
    private final DefaultQOSPlaybackEventListener defaultQosPlaybackEventListener;
    private final MediaManager mediaManager;
    private final Provider<ServiceTransaction> transactionProvider;
    private final RenewSessionTransformers transformers;

    public DefaultMediaApi(Provider<ServiceTransaction> provider, PlaybackSessionProvider playbackSessionProvider, MediaManager mediaManager2, RenewSessionTransformers renewSessionTransformers, DefaultQOSPlaybackEventListener defaultQOSPlaybackEventListener) {
        this.$$delegate_0 = playbackSessionProvider;
        this.transactionProvider = provider;
        this.mediaManager = mediaManager2;
        this.transformers = renewSessionTransformers;
        this.defaultQosPlaybackEventListener = defaultQOSPlaybackEventListener;
    }

    public PlaybackSession createPlaybackSession(PlayerAdapter playerAdapter) {
        return this.$$delegate_0.createPlaybackSession(playerAdapter);
    }

    public Single<? extends MediaItem> fetch(MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        MediaManager mediaManager2 = this.mediaManager;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        Single<? extends MediaItem> a = DustExtensionsKt.withDust(mediaManager2.getMediaItem(serviceTransaction, mediaDescriptor, playbackContext), serviceTransaction, PlaybackSessionProvider.Companion.getMEDIA_API_FETCH(), (Object) C13173j0.m40356a(C12907r.m40244a("playbackUrl", mediaDescriptor.getPlaybackUrl()), C12907r.m40244a("playbackScenario", mediaDescriptor.getBasePlaybackScenario()))).mo30206a(this.transformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "mediaManager.getMediaIte…enewSession(transaction))");
        return a;
    }

    public Single<String> getBifThumbnail(Presentation presentation) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        MediaManager mediaManager2 = this.mediaManager;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(mediaManager2.getBifThumbnail(serviceTransaction, presentation), serviceTransaction, DefaultMediaApiKt.getMEDIDA_API_GET_BIF(Dust$Events.INSTANCE), (Object) null, 4, (Object) null);
    }

    public Single<List<BifThumbnailSet>> getBifThumbnailSets(MediaItem mediaItem) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        MediaManager mediaManager2 = this.mediaManager;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(mediaManager2.getBifThumbnailSets(serviceTransaction, mediaItem), serviceTransaction, DefaultMediaApiKt.getMEDIA_API_GET_BIF_SET(Dust$Events.INSTANCE), (Object) null, 4, (Object) null);
    }

    public PlaybackContext initializePlaybackContext(PlaybackIntent playbackIntent, boolean z, boolean z2, Map<String, ? extends Object> map) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) uuid, "UUID.randomUUID().toString()");
        this.defaultQosPlaybackEventListener.onEvent(PlaybackSelectedEventData.Companion.init(uuid, playbackIntent, Boolean.valueOf(z), Boolean.valueOf(z2), map));
        return new DefaultPlaybackContext(uuid, z);
    }

    public void transferPlaybackContext(PlaybackContext playbackContext) {
        String playbackSessionId = playbackContext.getPlaybackSessionId();
        if (playbackSessionId != null) {
            this.defaultQosPlaybackEventListener.onEvent(new PlaybackSessionTransferredEventData(playbackSessionId));
        }
    }
}
