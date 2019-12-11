package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultDownloadTaskFactory;", "Lcom/bamtech/sdk4/internal/media/offline/DownloadTaskFactory;", "scheduler", "Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Lcom/bamtech/sdk4/internal/service/ServiceTransactionProvider;", "mediaStorage", "Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "(Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;)V", "getMediaStorage", "()Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "getScheduler", "()Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;", "getTransactionProvider", "()Ljavax/inject/Provider;", "createTask", "Lcom/bamtech/sdk4/media/offline/DownloadTask;", "cachedMedia", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadTaskFactory.kt */
public final class DefaultDownloadTaskFactory implements DownloadTaskFactory {
    public DefaultDownloadTaskFactory(DownloadScheduler downloadScheduler, Provider<ServiceTransaction> provider, MediaStorage mediaStorage) {
    }
}
