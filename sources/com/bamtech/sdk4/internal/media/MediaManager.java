package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH&J*\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/MediaManager;", "", "getBifThumbnail", "Lio/reactivex/Single;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "presentation", "Lcom/bamtech/sdk4/Presentation;", "getBifThumbnailSets", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "getMediaItem", "mediaDescriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
public interface MediaManager {
    Single<String> getBifThumbnail(ServiceTransaction serviceTransaction, Presentation presentation);

    Single<List<BifThumbnailSet>> getBifThumbnailSets(ServiceTransaction serviceTransaction, MediaItem mediaItem);

    Single<? extends MediaItem> getMediaItem(ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext);
}
