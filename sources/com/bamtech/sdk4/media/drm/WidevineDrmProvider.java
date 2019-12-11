package com.bamtech.sdk4.media.drm;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH&J:\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH&J0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH&J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH&J0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/drm/WidevineDrmProvider;", "Lcom/bamtech/sdk4/media/drm/DrmProvider;", "getWidevineCertificate", "Lio/reactivex/Single;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "provisioningUrl", "", "requestData", "playbackSessionId", "isOffline", "", "getWidevineLicense", "licenseUrl", "getWidevineOfflineLicense", "releaseWidevineOfflineLicense", "permanently", "renewWidevineOfflineLicense", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: WidevineDrmProvider.kt */
public interface WidevineDrmProvider extends DrmProvider {
    Single<byte[]> getWidevineCertificate(ServiceTransaction serviceTransaction, String str, byte[] bArr, String str2, boolean z);

    Single<byte[]> getWidevineOfflineLicense(ServiceTransaction serviceTransaction, byte[] bArr, String str, boolean z);

    Single<byte[]> releaseWidevineOfflineLicense(ServiceTransaction serviceTransaction, byte[] bArr, boolean z);

    Single<byte[]> renewWidevineOfflineLicense(ServiceTransaction serviceTransaction, byte[] bArr, String str, boolean z);
}
