package com.bamtech.sdk4.internal.media.offline;

import com.google.android.exoplayer2.drm.DrmInitData;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "", "download", "", "drmInitData", "Lcom/google/android/exoplayer2/drm/DrmInitData;", "currentLicense", "getLicenseDuration", "", "license", "release", "permanently", "", "renew", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineLicenseManager.kt */
public interface WidevineLicenseManager {
    byte[] download(DrmInitData drmInitData, byte[] bArr);

    long getLicenseDuration(byte[] bArr);

    byte[] release(byte[] bArr, boolean z);
}
