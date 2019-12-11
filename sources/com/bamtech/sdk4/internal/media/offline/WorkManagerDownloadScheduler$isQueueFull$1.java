package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import com.bamtech.sdk4.media.offline.DownloadStatus.InProgress;
import com.bamtech.sdk4.media.offline.DownloadStatus.Queued;
import com.bamtech.sdk4.media.offline.DownloadStatus.Requested;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "list", "", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DownloadScheduler.kt */
final class WorkManagerDownloadScheduler$isQueueFull$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ boolean $ignoreRequested;
    final /* synthetic */ DownloadSettings $settings;

    WorkManagerDownloadScheduler$isQueueFull$1(boolean z, DownloadSettings downloadSettings) {
        this.$ignoreRequested = z;
        this.$settings = downloadSettings;
    }

    public final Single<Boolean> apply(List<? extends CachedMedia> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CachedMedia cachedMedia = (CachedMedia) next;
            if (!(cachedMedia.getStatus() instanceof InProgress) && !(cachedMedia.getStatus() instanceof Queued) && (!(cachedMedia.getStatus() instanceof Requested) || this.$ignoreRequested)) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() < this.$settings.getConcurrentDownloads()) {
            z = false;
        }
        return Single.m38399b(Boolean.valueOf(z));
    }
}
