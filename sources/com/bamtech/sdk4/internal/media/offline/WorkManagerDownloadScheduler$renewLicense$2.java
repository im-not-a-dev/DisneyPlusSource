package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DownloadScheduler.kt */
final class WorkManagerDownloadScheduler$renewLicense$2<T> implements Consumer<Throwable> {
    final /* synthetic */ CachedMedia $media;
    final /* synthetic */ byte[] $oldAudioLicense;
    final /* synthetic */ byte[] $oldLicense;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ WorkManagerDownloadScheduler this$0;

    WorkManagerDownloadScheduler$renewLicense$2(WorkManagerDownloadScheduler workManagerDownloadScheduler, CachedMedia cachedMedia, ServiceTransaction serviceTransaction, byte[] bArr, byte[] bArr2) {
        this.this$0 = workManagerDownloadScheduler;
        this.$media = cachedMedia;
        this.$transaction = serviceTransaction;
        this.$oldLicense = bArr;
        this.$oldAudioLicense = bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Throwable r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "renewLicense: catching exception "
            r0.append(r1)
            java.lang.String r1 = r9.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "OfflineDlScheduler"
            android.util.Log.d(r1, r0)
            java.lang.Throwable r0 = r9.getCause()
            r2 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            boolean r0 = r0 instanceof com.bamtech.sdk4.service.InvalidRequestException
            if (r0 != 0) goto L_0x005a
            if (r9 == 0) goto L_0x0038
            java.lang.Throwable r0 = r9.getCause()
            if (r0 == 0) goto L_0x0038
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            boolean r0 = r0 instanceof com.bamtech.sdk4.service.UnauthorizedException
            if (r0 != 0) goto L_0x005a
            if (r9 == 0) goto L_0x004a
            java.lang.Throwable r9 = r9.getCause()
            if (r9 == 0) goto L_0x004a
            java.lang.Throwable r9 = r9.getCause()
            goto L_0x004b
        L_0x004a:
            r9 = r2
        L_0x004b:
            boolean r9 = r9 instanceof com.bamtech.sdk4.service.ForbiddenException
            if (r9 == 0) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            com.bamtech.sdk4.media.offline.CachedMedia r9 = r8.$media
            com.bamtech.sdk4.internal.media.ExoCachedMedia r9 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r9
            com.bamtech.sdk4.media.offline.LicenseRenewalResult r0 = com.bamtech.sdk4.media.offline.LicenseRenewalResult.Recoverable
            r9.setLastLicenseRenewalResult(r0)
            goto L_0x0099
        L_0x005a:
            java.lang.String r9 = "renewLicense: catching an auth exception."
            android.util.Log.d(r1, r9)
            com.bamtech.sdk4.media.offline.CachedMedia r9 = r8.$media
            com.bamtech.sdk4.internal.media.ExoCachedMedia r9 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r9
            r0 = 0
            byte[] r3 = new byte[r0]
            r9.setLicense(r3)
            com.bamtech.sdk4.media.offline.CachedMedia r9 = r8.$media
            com.bamtech.sdk4.internal.media.ExoCachedMedia r9 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r9
            byte[] r0 = new byte[r0]
            r9.setAudioLicense(r0)
            com.bamtech.sdk4.media.offline.CachedMedia r9 = r8.$media
            com.bamtech.sdk4.internal.media.ExoCachedMedia r9 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r9
            r9.setExpiration(r2)
            com.bamtech.sdk4.media.offline.CachedMedia r9 = r8.$media
            com.bamtech.sdk4.internal.media.ExoCachedMedia r9 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r9
            com.bamtech.sdk4.media.offline.LicenseRenewalResult r0 = com.bamtech.sdk4.media.offline.LicenseRenewalResult.FatalErrorSingle
            r9.setLastLicenseRenewalResult(r0)
            java.lang.String r9 = "Attempt to release the old license after an auth exception."
            android.util.Log.d(r1, r9)
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r2 = r8.this$0
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r8.$transaction
            com.bamtech.sdk4.media.offline.CachedMedia r9 = r8.$media
            java.lang.String r4 = r9.getId()
            byte[] r5 = r8.$oldLicense
            byte[] r6 = r8.$oldAudioLicense
            r7 = 0
            r2.releaseOldLicense(r3, r4, r5, r6, r7)
        L_0x0099:
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r9 = r8.this$0
            com.bamtech.sdk4.internal.media.offline.MediaStorage r9 = r9.mediaStorage
            com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r8.$transaction
            com.bamtech.sdk4.media.offline.CachedMedia r1 = r8.$media
            io.reactivex.Completable r9 = r9.store(r0, r1)
            r9.mo30053d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler$renewLicense$2.accept(java.lang.Throwable):void");
    }
}
