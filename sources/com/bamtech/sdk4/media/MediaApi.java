package com.bamtech.sdk4.media;

import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.Presentation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J$\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\u0006\u0010\u0010\u001a\u00020\u0004H&J4\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00190\u0018H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaApi;", "Lcom/bamtech/sdk4/media/PlaybackSessionProvider;", "fetch", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/media/MediaItem;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "getBifThumbnail", "", "presentation", "Lcom/bamtech/sdk4/Presentation;", "getBifThumbnailSets", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "mediaItem", "initializePlaybackContext", "playbackIntent", "Lcom/bamtech/sdk4/media/PlaybackIntent;", "isPreBuffering", "", "offline", "data", "", "", "transferPlaybackContext", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaApi.kt */
public interface MediaApi extends PlaybackSessionProvider {
    Single<? extends MediaItem> fetch(MediaDescriptor mediaDescriptor, PlaybackContext playbackContext);

    Single<String> getBifThumbnail(Presentation presentation);

    Single<List<BifThumbnailSet>> getBifThumbnailSets(MediaItem mediaItem);

    PlaybackContext initializePlaybackContext(PlaybackIntent playbackIntent, boolean z, boolean z2, Map<String, ? extends Object> map);

    void transferPlaybackContext(PlaybackContext playbackContext);
}
