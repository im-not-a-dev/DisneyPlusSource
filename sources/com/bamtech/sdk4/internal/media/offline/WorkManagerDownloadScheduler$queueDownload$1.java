package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import kotlin.Metadata;
import org.reactivestreams.C14313b;
import p520io.reactivex.CompletableSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscriber;", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "subscribe"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DownloadScheduler.kt */
final class WorkManagerDownloadScheduler$queueDownload$1<T> implements C14313b<CompletableSource> {
    final /* synthetic */ CachedMedia $media;
    final /* synthetic */ DownloadSettings $settings;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ WorkManagerDownloadScheduler this$0;

    WorkManagerDownloadScheduler$queueDownload$1(WorkManagerDownloadScheduler workManagerDownloadScheduler, CachedMedia cachedMedia, ServiceTransaction serviceTransaction, DownloadSettings downloadSettings) {
        this.this$0 = workManagerDownloadScheduler;
        this.$media = cachedMedia;
        this.$transaction = serviceTransaction;
        this.$settings = downloadSettings;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [com.bamtech.sdk4.media.offline.DownloadStatus] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x010e A[Catch:{ all -> 0x017e, all -> 0x0224 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribe(org.reactivestreams.Subscriber<? super p520io.reactivex.CompletableSource> r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "{accessToken}"
            java.lang.String r2 = "OfflineDlScheduler"
            r3 = 46
            com.bamtech.sdk4.media.offline.CachedMedia r4 = r1.$media     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.ExoCachedMedia r4 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r4     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.DownloadStatus r4 = r4.getStatus()     // Catch:{ all -> 0x0224 }
            boolean r4 = r4 instanceof com.bamtech.sdk4.media.offline.DownloadStatus.None     // Catch:{ all -> 0x0224 }
            if (r4 == 0) goto L_0x0054
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0224 }
            r4.<init>()     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "Starting work for media "
            r4.append(r5)     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r5 = r1.$media     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = r5.getId()     // Catch:{ all -> 0x0224 }
            r4.append(r5)     // Catch:{ all -> 0x0224 }
            r4.append(r3)     // Catch:{ all -> 0x0224 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0224 }
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r4 = r1.this$0     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.offline.MediaStorage r4 = r4.mediaStorage     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.service.ServiceTransaction r5 = r1.$transaction     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r6 = r1.$media     // Catch:{ all -> 0x0224 }
            r7 = r6
            com.bamtech.sdk4.internal.media.ExoCachedMedia r7 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r7     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.DownloadStatus$Requested r15 = new com.bamtech.sdk4.media.offline.DownloadStatus$Requested     // Catch:{ all -> 0x0224 }
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 4
            r14 = 0
            r8 = r15
            r8.<init>(r9, r11, r12, r13, r14)     // Catch:{ all -> 0x0224 }
            r7.setStatus(r15)     // Catch:{ all -> 0x0224 }
            io.reactivex.Completable r4 = r4.store(r5, r6)     // Catch:{ all -> 0x0224 }
            r4.mo30053d()     // Catch:{ all -> 0x0224 }
        L_0x0054:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0224 }
            r4.<init>()     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "Set renditions for media "
            r4.append(r5)     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r5 = r1.$media     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = r5.getId()     // Catch:{ all -> 0x0224 }
            r4.append(r5)     // Catch:{ all -> 0x0224 }
            r4.append(r3)     // Catch:{ all -> 0x0224 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0224 }
            android.util.Log.i(r2, r4)     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r4 = r1.$media     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.ExoCachedMedia r4 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r4     // Catch:{ all -> 0x0224 }
            java.util.List r4 = r4.getRenditionKeys()     // Catch:{ all -> 0x0224 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0224 }
            if (r4 == 0) goto L_0x0095
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r4 = r1.this$0     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.offline.ExoCachedMediaHelper r5 = r4.exoCachedMediaHelper     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.service.ServiceTransaction r6 = r1.$transaction     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r4 = r1.$media     // Catch:{ all -> 0x0224 }
            r7 = r4
            com.bamtech.sdk4.internal.media.ExoCachedMedia r7 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r7     // Catch:{ all -> 0x0224 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 28
            r12 = 0
            com.bamtech.sdk4.internal.media.offline.ExoCachedMediaHelper.DefaultImpls.downloadMediaLicense$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0224 }
        L_0x0095:
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r4 = r1.this$0     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.plugin.ExtensionInstanceProvider r4 = r4.extensionProvider     // Catch:{ all -> 0x017e }
            java.lang.Class<com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient> r5 = com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient.class
            com.bamtech.sdk4.plugin.Extension r4 = r4.get(r5)     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient r4 = (com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient) r4     // Catch:{ all -> 0x017e }
            if (r4 == 0) goto L_0x0176
            com.bamtech.sdk4.media.offline.CachedMedia r5 = r1.$media     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.media.ExoCachedMedia r5 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r5     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.media.offline.DownloadRequest r5 = r5.getRequest()     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.media.MediaItem r5 = r5.getMediaItem()     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.MediaThumbnailLinks r5 = r5.getThumbnails()     // Catch:{ all -> 0x017e }
            if (r5 == 0) goto L_0x019c
            com.bamtech.sdk4.MediaThumbnailLink r5 = r5.getBif()     // Catch:{ all -> 0x017e }
            if (r5 == 0) goto L_0x019c
            java.util.Map r6 = r5.getHeaders()     // Catch:{ all -> 0x017e }
            if (r6 == 0) goto L_0x00ca
            java.util.Map r6 = kotlin.p590y.C13173j0.m40365e(r6)     // Catch:{ all -> 0x017e }
            if (r6 == 0) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x017e }
            r6.<init>()     // Catch:{ all -> 0x017e }
        L_0x00cf:
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r7 = r1.this$0     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.token.AccessTokenProvider r7 = r7.tokenProvider     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.service.ServiceTransaction r8 = r1.$transaction     // Catch:{ all -> 0x017e }
            io.reactivex.Single r7 = r7.getAccessToken(r8)     // Catch:{ all -> 0x017e }
            java.lang.Object r7 = r7.mo30224c()     // Catch:{ all -> 0x017e }
            java.lang.String r8 = "tokenProvider.getAccessT…ransaction).blockingGet()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r8)     // Catch:{ all -> 0x017e }
            r6.put(r0, r7)     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.service.ServiceTransaction r7 = r1.$transaction     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.media.offline.CachedMedia r8 = r1.$media     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.media.ExoCachedMedia r8 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r8     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.media.offline.DownloadRequest r8 = r8.getRequest()     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.ThumbnailResolution r8 = r8.getThumbnailResolution()     // Catch:{ all -> 0x017e }
            io.reactivex.Maybe r5 = r4.getBifThumbnails(r7, r5, r8, r6)     // Catch:{ all -> 0x017e }
            java.lang.Object r5 = r5.mo30121b()     // Catch:{ all -> 0x017e }
            java.lang.String r6 = "onlineClient.getBifThumb…, tokenMap).blockingGet()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r6)     // Catch:{ all -> 0x017e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x017e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x017e }
        L_0x0108:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x017e }
            if (r6 == 0) goto L_0x019c
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.BifThumbnailSet r6 = (com.bamtech.sdk4.BifThumbnailSet) r6     // Catch:{ all -> 0x017e }
            java.util.List r7 = r6.getPresentations()     // Catch:{ all -> 0x017e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x017e }
        L_0x011c:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x017e }
            if (r8 == 0) goto L_0x0108
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.Presentation r8 = (com.bamtech.sdk4.Presentation) r8     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.media.offline.CachedMedia r9 = r1.$media     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.media.ExoCachedMedia r9 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r9     // Catch:{ all -> 0x017e }
            java.util.List r10 = r6.getPresentations()     // Catch:{ all -> 0x017e }
            int r10 = r10.indexOf(r8)     // Catch:{ all -> 0x017e }
            java.lang.String r9 = r9.generateThumbnailFileName(r6, r10)     // Catch:{ all -> 0x017e }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.media.offline.CachedMedia r11 = r1.$media     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.media.ExoCachedMedia r11 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r11     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r12 = r1.this$0     // Catch:{ all -> 0x017e }
            android.content.Context r12 = r12.context     // Catch:{ all -> 0x017e }
            java.io.File r11 = r11.getThumbnailDirectory(r12)     // Catch:{ all -> 0x017e }
            r10.<init>(r11, r9)     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.service.ServiceTransaction r9 = r1.$transaction     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r11 = r1.this$0     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.token.AccessTokenProvider r11 = r11.tokenProvider     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.service.ServiceTransaction r12 = r1.$transaction     // Catch:{ all -> 0x017e }
            io.reactivex.Single r11 = r11.getAccessToken(r12)     // Catch:{ all -> 0x017e }
            java.lang.Object r11 = r11.mo30224c()     // Catch:{ all -> 0x017e }
            kotlin.Pair r11 = kotlin.C12907r.m40244a(r0, r11)     // Catch:{ all -> 0x017e }
            java.util.Map r11 = kotlin.p590y.C13170i0.m40332a(r11)     // Catch:{ all -> 0x017e }
            io.reactivex.Completable r8 = r4.downloadBifThumbnail(r9, r8, r10, r11)     // Catch:{ all -> 0x017e }
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler$queueDownload$1$$special$$inlined$let$lambda$1 r9 = new com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler$queueDownload$1$$special$$inlined$let$lambda$1     // Catch:{ all -> 0x017e }
            r9.<init>(r10, r6, r1, r4)     // Catch:{ all -> 0x017e }
            io.reactivex.Completable r8 = r8.mo30050b(r9)     // Catch:{ all -> 0x017e }
            r8.mo30054e()     // Catch:{ all -> 0x017e }
            goto L_0x011c
        L_0x0176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017e }
            java.lang.String r4 = "No online media client instance found."
            r0.<init>(r4)     // Catch:{ all -> 0x017e }
            throw r0     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0224 }
            r4.<init>()     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = "Unable to load thumbnails for "
            r4.append(r5)     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r5 = r1.$media     // Catch:{ all -> 0x0224 }
            java.lang.String r5 = r5.getId()     // Catch:{ all -> 0x0224 }
            r4.append(r5)     // Catch:{ all -> 0x0224 }
            r4.append(r3)     // Catch:{ all -> 0x0224 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0224 }
            android.util.Log.d(r2, r4, r0)     // Catch:{ all -> 0x0224 }
        L_0x019c:
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r0 = r1.this$0     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.offline.MediaStorage r0 = r0.mediaStorage     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.service.ServiceTransaction r4 = r1.$transaction     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r5 = r1.$media     // Catch:{ all -> 0x0224 }
            io.reactivex.Completable r0 = r0.store(r4, r5)     // Catch:{ all -> 0x0224 }
            r0.mo30053d()     // Catch:{ all -> 0x0224 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0224 }
            r0.<init>()     // Catch:{ all -> 0x0224 }
            java.lang.String r4 = "Renditions set. Begin download task for media "
            r0.append(r4)     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r4 = r1.$media     // Catch:{ all -> 0x0224 }
            java.lang.String r4 = r4.getId()     // Catch:{ all -> 0x0224 }
            r0.append(r4)     // Catch:{ all -> 0x0224 }
            r0.append(r3)     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0224 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r0 = r1.this$0     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper r0 = r0.workManagerHelper     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.service.ServiceTransaction r4 = r1.$transaction     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.DownloadSettings r5 = r1.$settings     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r6 = r1.$media     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.ExoCachedMedia r6 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r6     // Catch:{ all -> 0x0224 }
            r0.startDownload(r4, r5, r6)     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r0 = r1.this$0     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.media.offline.MediaStorage r0 = r0.mediaStorage     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.internal.service.ServiceTransaction r4 = r1.$transaction     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.CachedMedia r5 = r1.$media     // Catch:{ all -> 0x0224 }
            r6 = r5
            com.bamtech.sdk4.internal.media.ExoCachedMedia r6 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r6     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.DownloadStatus r7 = r6.getStatus()     // Catch:{ all -> 0x0224 }
            boolean r7 = r7 instanceof com.bamtech.sdk4.media.offline.DownloadStatus.Requested     // Catch:{ all -> 0x0224 }
            if (r7 == 0) goto L_0x0212
            com.bamtech.sdk4.media.offline.DownloadStatus$Queued r7 = new com.bamtech.sdk4.media.offline.DownloadStatus$Queued     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.DownloadStatus r8 = r6.getStatus()     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.DownloadProgress r8 = com.bamtech.sdk4.internal.media.offline.StatusProgressExtKt.getProgress(r8)     // Catch:{ all -> 0x0224 }
            long r9 = r8.getBytesDownloaded()     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.DownloadStatus r8 = r6.getStatus()     // Catch:{ all -> 0x0224 }
            com.bamtech.sdk4.media.offline.DownloadProgress r8 = com.bamtech.sdk4.internal.media.offline.StatusProgressExtKt.getProgress(r8)     // Catch:{ all -> 0x0224 }
            float r11 = r8.getPercentageComplete()     // Catch:{ all -> 0x0224 }
            r12 = 0
            r13 = 4
            r14 = 0
            r8 = r7
            r8.<init>(r9, r11, r12, r13, r14)     // Catch:{ all -> 0x0224 }
            goto L_0x0216
        L_0x0212:
            com.bamtech.sdk4.media.offline.DownloadStatus r7 = r6.getStatus()     // Catch:{ all -> 0x0224 }
        L_0x0216:
            r6.setStatus(r7)     // Catch:{ all -> 0x0224 }
            io.reactivex.Completable r0 = r0.store(r4, r5)     // Catch:{ all -> 0x0224 }
            r0.mo30053d()     // Catch:{ all -> 0x0224 }
            r17.onComplete()     // Catch:{ all -> 0x0224 }
            goto L_0x0270
        L_0x0224:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not start the task for "
            r4.append(r5)
            com.bamtech.sdk4.media.offline.CachedMedia r5 = r1.$media
            java.lang.String r5 = r5.getId()
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.i(r2, r3, r0)
            com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler r2 = r1.this$0
            com.bamtech.sdk4.internal.media.offline.MediaStorage r2 = r2.mediaStorage
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = r1.$transaction
            com.bamtech.sdk4.media.offline.CachedMedia r4 = r1.$media
            r5 = r4
            com.bamtech.sdk4.internal.media.ExoCachedMedia r5 = (com.bamtech.sdk4.internal.media.ExoCachedMedia) r5
            com.bamtech.sdk4.media.offline.DownloadStatus$Failed r14 = new com.bamtech.sdk4.media.offline.DownloadStatus$Failed
            r7 = 0
            r9 = 0
            com.bamtech.sdk4.media.offline.DownloadError r10 = new com.bamtech.sdk4.media.offline.DownloadError
            r10.<init>(r0)
            r11 = 0
            r12 = 11
            r13 = 0
            r6 = r14
            r6.<init>(r7, r9, r10, r11, r12, r13)
            r5.setStatus(r14)
            io.reactivex.Completable r2 = r2.store(r3, r4)
            r2.mo30053d()
            r2 = r17
            r2.onError(r0)
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler$queueDownload$1.subscribe(org.reactivestreams.Subscriber):void");
    }
}
