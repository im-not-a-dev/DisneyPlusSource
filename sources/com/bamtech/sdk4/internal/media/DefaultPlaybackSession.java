package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.AbstractPlaybackSession;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter;
import com.bamtech.sdk4.media.adapters.PlaybackEventListener;
import com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener;
import com.bamtech.sdk4.media.drm.DrmProvider;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B@\b\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/DefaultPlaybackSession;", "Lcom/bamtech/sdk4/media/AbstractPlaybackSession;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "playerAdapter", "Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "drmProviders", "", "Lcom/bamtech/sdk4/media/drm/DrmProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "streamSampler", "Lcom/bamtech/sdk4/internal/media/StreamSampler;", "defaultQosPlaybackEventListener", "Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;Ljava/util/Set;Lcom/bamtech/sdk4/internal/media/StreamSampler;Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;)V", "getDefaultQosPlaybackEventListener", "()Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "getPlayerAdapter", "()Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "getStreamSampler", "()Lcom/bamtech/sdk4/internal/media/StreamSampler;", "getTransactionProvider", "()Ljavax/inject/Provider;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultPlaybackSession.kt */
public final class DefaultPlaybackSession extends AbstractPlaybackSession {
    private final DefaultQOSPlaybackEventListener defaultQosPlaybackEventListener;
    private final AbstractPlayerAdapter playerAdapter;
    private final StreamSampler streamSampler;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultPlaybackSession(Provider<ServiceTransaction> provider, AbstractPlayerAdapter abstractPlayerAdapter, Set<DrmProvider> set, StreamSampler streamSampler2, DefaultQOSPlaybackEventListener defaultQOSPlaybackEventListener) {
        this.transactionProvider = provider;
        this.playerAdapter = abstractPlayerAdapter;
        this.streamSampler = streamSampler2;
        this.defaultQosPlaybackEventListener = defaultQOSPlaybackEventListener;
        getPlayerAdapter().drmProviders(set);
        getPlayerAdapter().addListener((PlaybackEventListener) this);
        getPlayerAdapter().addListener((QOSPlaybackEventListener) getDefaultQosPlaybackEventListener());
    }

    public DefaultQOSPlaybackEventListener getDefaultQosPlaybackEventListener() {
        return this.defaultQosPlaybackEventListener;
    }

    public AbstractPlayerAdapter getPlayerAdapter() {
        return this.playerAdapter;
    }

    public StreamSampler getStreamSampler() {
        return this.streamSampler;
    }

    public Provider<ServiceTransaction> getTransactionProvider() {
        return this.transactionProvider;
    }
}
