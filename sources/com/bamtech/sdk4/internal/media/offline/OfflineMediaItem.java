package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.HlsPlaylistVariant;
import com.bamtech.sdk4.media.MediaItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaItem;", "Lcom/bamtech/sdk4/media/MediaItem;", "adEngine", "", "", "", "getAdEngine", "()Ljava/util/Map;", "conviva", "getConviva", "playlistVariants", "", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "getPlaylistVariants", "()Ljava/util/List;", "telemetry", "getTelemetry", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineMediaItem.kt */
public interface OfflineMediaItem extends MediaItem {
    Map<String, Object> getAdEngine();

    Map<String, Object> getConviva();

    List<HlsPlaylistVariant> getPlaylistVariants();

    Map<String, Object> getTelemetry();
}
