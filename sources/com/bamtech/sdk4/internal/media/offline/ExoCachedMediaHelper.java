package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J2\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\bH&¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/ExoCachedMediaHelper;", "", "downloadMediaLicense", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "media", "currentLicense", "", "currentAudioLicense", "renditionKeyCheck", "Lkotlin/Function0;", "", "downloadMediaLicenseAsync", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "getRenditions", "", "Lkotlin/Pair;", "", "Lcom/bamtech/sdk4/internal/media/offline/VariantCandidate;", "dataSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "isFatalError", "", "e", "", "releaseOldLicense", "oldLicense", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExoCachedMediaHelper.kt */
public interface ExoCachedMediaHelper {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: ExoCachedMediaHelper.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ ExoCachedMedia downloadMediaLicense$default(ExoCachedMediaHelper exoCachedMediaHelper, ServiceTransaction serviceTransaction, ExoCachedMedia exoCachedMedia, byte[] bArr, byte[] bArr2, Function0 function0, int i, Object obj) {
            if (obj == null) {
                byte[] bArr3 = (i & 4) != 0 ? null : bArr;
                byte[] bArr4 = (i & 8) != 0 ? null : bArr2;
                if ((i & 16) != 0) {
                    function0 = ExoCachedMediaHelper$downloadMediaLicense$1.INSTANCE;
                }
                return exoCachedMediaHelper.downloadMediaLicense(serviceTransaction, exoCachedMedia, bArr3, bArr4, function0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadMediaLicense");
        }
    }

    ExoCachedMedia downloadMediaLicense(ServiceTransaction serviceTransaction, ExoCachedMedia exoCachedMedia, byte[] bArr, byte[] bArr2, Function0<C13145v> function0);

    Single<CachedMedia> downloadMediaLicenseAsync(ServiceTransaction serviceTransaction, ExoCachedMedia exoCachedMedia);

    boolean isFatalError(Throwable th);

    void releaseOldLicense(byte[] bArr);
}
