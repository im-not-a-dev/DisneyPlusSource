package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.MediaThumbnailLink;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.plugin.Extension;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH&JD\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH&J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r2\u0006\u0010\u001e\u001a\u00020\fH&¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/MediaClient;", "Lcom/bamtech/sdk4/plugin/Extension;", "downloadBifThumbnail", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "presentation", "Lcom/bamtech/sdk4/Presentation;", "filePath", "Ljava/io/File;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "getBifThumbnails", "Lio/reactivex/Maybe;", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "thumbnailLink", "Lcom/bamtech/sdk4/MediaThumbnailLink;", "resolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "getMediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "getPlayhead", "Lcom/bamtech/sdk4/media/Playhead;", "profileId", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaClient.kt */
public interface MediaClient extends Extension {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: MediaClient.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Maybe getMediaItem$default(MediaClient mediaClient, ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    playbackContext = null;
                }
                return mediaClient.getMediaItem(serviceTransaction, mediaDescriptor, playbackContext);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMediaItem");
        }
    }

    Completable downloadBifThumbnail(ServiceTransaction serviceTransaction, Presentation presentation, File file, Map<String, String> map);

    Maybe<List<BifThumbnailSet>> getBifThumbnails(ServiceTransaction serviceTransaction, MediaThumbnailLink mediaThumbnailLink, ThumbnailResolution thumbnailResolution, Map<String, String> map);

    Maybe<MediaItem> getMediaItem(ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext);

    Maybe<Playhead> getPlayhead(ServiceTransaction serviceTransaction, Map<String, String> map, String str);
}
