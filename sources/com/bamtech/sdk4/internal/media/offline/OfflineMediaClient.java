package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.internal.media.MediaClient;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaItem;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Single;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaClient;", "Lcom/bamtech/sdk4/internal/media/MediaClient;", "getLocalBifThumbnail", "Lio/reactivex/Single;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "context", "Landroid/content/Context;", "presentation", "Lcom/bamtech/sdk4/Presentation;", "getLocalBifThumbnailSets", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineMediaClient.kt */
public interface OfflineMediaClient extends MediaClient {
    Single<String> getLocalBifThumbnail(ServiceTransaction serviceTransaction, Context context, Presentation presentation);

    Single<List<BifThumbnailSet>> getLocalBifThumbnailSets(ServiceTransaction serviceTransaction, Context context, MediaItem mediaItem);
}
