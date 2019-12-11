package com.bamtech.sdk4.media;

import com.bamtech.core.logging.LogLevel;
import com.bamtech.sdk4.internal.media.PlaybackSessionModule;
import com.bamtech.sdk4.internal.media.PlaybackSessionSubcomponent;
import com.bamtech.sdk4.internal.media.PlaybackSessionSubcomponent.Builder;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.media.adapters.PlayerAdapter;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/DefaultPlaybackSessionProvider;", "Lcom/bamtech/sdk4/media/PlaybackSessionProvider;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "playbackSessionProvider", "Lcom/bamtech/sdk4/internal/media/PlaybackSessionSubcomponent$Builder;", "qosNewtorkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "createPlaybackSession", "Lcom/bamtech/sdk4/media/PlaybackSession;", "playerAdapter", "Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackSessionProvider.kt */
public final class DefaultPlaybackSessionProvider implements PlaybackSessionProvider {
    private final Provider<Builder> playbackSessionProvider;
    private final QOSNetworkHelper qosNewtorkHelper;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultPlaybackSessionProvider(Provider<ServiceTransaction> provider, Provider<Builder> provider2, QOSNetworkHelper qOSNetworkHelper) {
        this.transactionProvider = provider;
        this.playbackSessionProvider = provider2;
        this.qosNewtorkHelper = qOSNetworkHelper;
    }

    public PlaybackSession createPlaybackSession(PlayerAdapter playerAdapter) {
        PlaybackSessionSubcomponent build = ((Builder) this.playbackSessionProvider.get()).module(new PlaybackSessionModule(playerAdapter)).build();
        DefaultImpls.logDust$default((ServiceTransaction) this.transactionProvider.get(), PlaybackSessionProviderKt.getMEDIA_API_CREATE_PLAYBACK_SESSION(), "urn:bamtech:dust:bamsdk:event:sdk", LogLevel.INFO, false, 8, null);
        playerAdapter.setQosNetworkHelper(this.qosNewtorkHelper);
        return build.session();
    }
}
