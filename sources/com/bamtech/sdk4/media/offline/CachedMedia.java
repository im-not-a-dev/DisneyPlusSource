package com.bamtech.sdk4.media.offline;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010 \u001a\u00020!H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/CachedMedia;", "", "expiration", "Lorg/joda/time/DateTime;", "getExpiration", "()Lorg/joda/time/DateTime;", "id", "", "getId", "()Ljava/lang/String;", "lastLicenseRenewal", "getLastLicenseRenewal", "lastLicenseRenewalResult", "Lcom/bamtech/sdk4/media/offline/LicenseRenewalResult;", "getLastLicenseRenewalResult", "()Lcom/bamtech/sdk4/media/offline/LicenseRenewalResult;", "orderNumber", "", "getOrderNumber", "()I", "size", "", "getSize", "()J", "status", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "getStatus", "()Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "thumbnailResolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "getThumbnailResolution", "()Lcom/bamtech/sdk4/ThumbnailResolution;", "getLicenseStatus", "Lcom/bamtech/sdk4/media/offline/LicenseStatus;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CachedMedia.kt */
public interface CachedMedia {
    String getId();

    LicenseStatus getLicenseStatus();

    int getOrderNumber();

    DownloadStatus getStatus();
}
