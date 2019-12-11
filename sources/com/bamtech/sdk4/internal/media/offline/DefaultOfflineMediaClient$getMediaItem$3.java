package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtech.sdk4.internal.media.CachedMediaItem;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.MediaPlayhead;
import com.bamtech.sdk4.media.Playhead;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/media/CachedMediaItem;", "it", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
final class DefaultOfflineMediaClient$getMediaItem$3<T, R> implements Function<T, R> {
    final /* synthetic */ MediaDescriptor $descriptor;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultOfflineMediaClient this$0;

    DefaultOfflineMediaClient$getMediaItem$3(DefaultOfflineMediaClient defaultOfflineMediaClient, ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor) {
        this.this$0 = defaultOfflineMediaClient;
        this.$transaction = serviceTransaction;
        this.$descriptor = mediaDescriptor;
    }

    public final CachedMediaItem apply(ExoCachedMedia exoCachedMedia) {
        String contentId = exoCachedMedia.getRequest().getMediaItem().getPlayhead().getContentId();
        if (contentId == null) {
            contentId = exoCachedMedia.getRequest().getMediaItem().getDescriptor().getCachedMediaId();
        }
        Object c = this.this$0.localBookmarkStore.fetchBookmarks(this.$transaction, C13183n.m40498a(contentId)).mo30224c();
        C12880j.m40222a(c, "localBookmarkStore.fetch…contentId)).blockingGet()");
        Bookmark bookmark = (Bookmark) C13199w.m40591g((List) c);
        Playhead fetchPlayhead = this.this$0.localPlayheadStore.fetchPlayhead(this.$transaction, contentId);
        Map map = null;
        MediaPlayhead mediaPlayhead = fetchPlayhead != null ? fetchPlayhead.toMediaPlayhead(bookmark) : null;
        MediaItem mediaItem = exoCachedMedia.getRequest().getMediaItem();
        if (!(mediaItem instanceof OfflineMediaItem)) {
            mediaItem = null;
        }
        OfflineMediaItem offlineMediaItem = (OfflineMediaItem) mediaItem;
        Map telemetry = offlineMediaItem != null ? offlineMediaItem.getTelemetry() : null;
        MediaItem mediaItem2 = exoCachedMedia.getRequest().getMediaItem();
        if (!(mediaItem2 instanceof OfflineMediaItem)) {
            mediaItem2 = null;
        }
        OfflineMediaItem offlineMediaItem2 = (OfflineMediaItem) mediaItem2;
        Map adEngine = offlineMediaItem2 != null ? offlineMediaItem2.getAdEngine() : null;
        MediaItem mediaItem3 = exoCachedMedia.getRequest().getMediaItem();
        if (!(mediaItem3 instanceof OfflineMediaItem)) {
            mediaItem3 = null;
        }
        OfflineMediaItem offlineMediaItem3 = (OfflineMediaItem) mediaItem3;
        if (offlineMediaItem3 != null) {
            map = offlineMediaItem3.getConviva();
        }
        MediaDescriptor mediaDescriptor = this.$descriptor;
        Cache cache = this.this$0.cacheProvider.getCache(this.$transaction, exoCachedMedia, this.this$0.databaseProvider);
        String masterPlaylist = exoCachedMedia.getMasterPlaylist();
        List renditionKeys = exoCachedMedia.getRenditionKeys();
        byte[] license = exoCachedMedia.getLicense();
        byte[] audioLicense = exoCachedMedia.getAudioLicense();
        List playlistVariants = exoCachedMedia.getRequest().getPlaylistVariants();
        if (mediaPlayhead == null) {
            mediaPlayhead = exoCachedMedia.getRequest().getMediaItem().getPlayhead();
        }
        MediaThumbnailLinks thumbnails = exoCachedMedia.getRequest().getMediaItem().getThumbnails();
        if (telemetry == null) {
            telemetry = C13173j0.m40350a();
        }
        Map map2 = telemetry;
        if (adEngine == null) {
            adEngine = C13173j0.m40350a();
        }
        Map map3 = adEngine;
        if (map == null) {
            map = C13173j0.m40350a();
        }
        CachedMediaItem cachedMediaItem = new CachedMediaItem(mediaDescriptor, cache, masterPlaylist, mediaPlayhead, map2, map3, map, renditionKeys, license, audioLicense, playlistVariants, thumbnails, null, 4096, null);
        return cachedMediaItem;
    }
}
