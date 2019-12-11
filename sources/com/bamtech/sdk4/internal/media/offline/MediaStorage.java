package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0005\u001a\u00020\u0006H&J0\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H&J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0010H&J \u0010 \u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0013H&¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "", "get", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "mediaId", "", "getAll", "Lio/reactivex/Single;", "", "getCachedMediaStatusChanges", "Lio/reactivex/Flowable;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "getDownloadSettings", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "getDownloadStatusFlowable", "getMaxOrderNumber", "", "markLicenseForRemoval", "Lio/reactivex/Completable;", "license", "", "audioLicense", "permanently", "", "remove", "store", "media", "updateDownloadSettings", "settings", "updateOrder", "", "orderNumber", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaStorage.kt */
public interface MediaStorage {
    Maybe<CachedMedia> get(ServiceTransaction serviceTransaction, String str);

    Single<? extends List<CachedMedia>> getAll(ServiceTransaction serviceTransaction);

    Single<DownloadSettings> getDownloadSettings(ServiceTransaction serviceTransaction);

    Completable markLicenseForRemoval(ServiceTransaction serviceTransaction, String str, byte[] bArr, byte[] bArr2, boolean z);

    Completable store(ServiceTransaction serviceTransaction, CachedMedia cachedMedia);
}
