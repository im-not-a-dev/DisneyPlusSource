package com.bamtech.sdk4.internal.media;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C12881k;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, mo31007d2 = {"<anonymous>", "", "response", "Lokhttp3/Response;", "throwable", "", "request", "Lokhttp3/Request;", "out", "Lcom/bamtech/sdk4/internal/media/Stream;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
final class DefaultOnlineMediaClient$getVerifiedMediaItem$1$3$qosCallback$1 extends C12881k implements Function4<Response, Throwable, Request, Stream, C13145v> {
    final /* synthetic */ C19273 this$0;

    DefaultOnlineMediaClient$getVerifiedMediaItem$1$3$qosCallback$1(C19273 r1) {
        this.this$0 = r1;
        super(4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((Response) obj, (Throwable) obj2, (Request) obj3, (Stream) obj4);
        return C13145v.f29587a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        if (r2 != null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 != null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(okhttp3.Response r19, java.lang.Throwable r20, okhttp3.Request r21, com.bamtech.sdk4.internal.media.Stream r22) {
        /*
            r18 = this;
            r0 = r18
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1$3 r1 = r0.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1 r1 = r1.this$0
            com.bamtech.sdk4.media.PlaybackContext r1 = r1.$playbackContext
            if (r1 == 0) goto L_0x0139
            java.lang.String r3 = r1.getPlaybackSessionId()
            if (r3 == 0) goto L_0x0139
            if (r19 == 0) goto L_0x0019
            okhttp3.Request r1 = r19.mo35870m()
            if (r1 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = r21
        L_0x001b:
            r2 = 0
            if (r19 == 0) goto L_0x002e
            long r4 = r19.mo35869l()
            long r6 = r19.mo35871n()
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r17 = r4
            goto L_0x0030
        L_0x002e:
            r17 = r2
        L_0x0030:
            com.bamtech.sdk4.media.ServerRequest r4 = new com.bamtech.sdk4.media.ServerRequest
            com.bamtech.sdk4.media.FetchStatus r6 = com.bamtech.sdk4.media.FetchStatus.completed
            r7 = 0
            r8 = 0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1$3 r5 = r0.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1 r5 = r5.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient r5 = r5.this$0
            com.bamtech.sdk4.media.QOSNetworkHelper r5 = r5.qosNetworkHelper
            com.bamtech.sdk4.media.NetworkType r9 = r5.currentNetworkType()
            r10 = 0
            r11 = 0
            if (r1 == 0) goto L_0x0054
            okhttp3.HttpUrl r5 = r1.mo35837g()
            if (r5 == 0) goto L_0x0054
            java.lang.String r5 = r5.mo35755g()
            r12 = r5
            goto L_0x0055
        L_0x0054:
            r12 = r2
        L_0x0055:
            if (r1 == 0) goto L_0x0063
            okhttp3.HttpUrl r5 = r1.mo35837g()
            if (r5 == 0) goto L_0x0063
            java.lang.String r5 = r5.mo35750c()
            r13 = r5
            goto L_0x0064
        L_0x0063:
            r13 = r2
        L_0x0064:
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r1.mo35835e()
            r14 = r1
            goto L_0x006d
        L_0x006c:
            r14 = r2
        L_0x006d:
            if (r19 == 0) goto L_0x0079
            int r1 = r19.mo35858c()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15 = r1
            goto L_0x007a
        L_0x0079:
            r15 = r2
        L_0x007a:
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1$3 r1 = r0.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1 r1 = r1.this$0
            com.bamtech.sdk4.internal.service.ServiceTransaction r1 = r1.$transaction
            java.util.UUID r1 = r1.getId()
            java.lang.String r16 = r1.toString()
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1$3 r1 = r0.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1 r1 = r1.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient r1 = r1.this$0
            com.bamtech.sdk4.media.QOSNetworkHelper r1 = r1.qosNetworkHelper
            r5 = r20
            com.bamtech.sdk4.media.NetworkError r1 = r1.translateLicenseError(r5)
            r4.setError(r1)
            java.lang.String r1 = "conviva"
            if (r22 == 0) goto L_0x00b8
            java.util.Map r5 = r22.getTracking()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r5.get(r1)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x00b8
            java.lang.String r6 = "fguid"
            java.lang.Object r5 = r5.get(r6)
            goto L_0x00b9
        L_0x00b8:
            r5 = r2
        L_0x00b9:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 != 0) goto L_0x00be
            r5 = r2
        L_0x00be:
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            if (r22 == 0) goto L_0x00d8
            java.util.Map r5 = r22.getTracking()
            if (r5 == 0) goto L_0x00d8
            java.lang.Object r1 = r5.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x00d8
            java.lang.String r5 = "productType"
            java.lang.Object r1 = r1.get(r5)
            goto L_0x00d9
        L_0x00d8:
            r1 = r2
        L_0x00d9:
            boolean r5 = r1 instanceof java.lang.String
            if (r5 != 0) goto L_0x00de
            r1 = r2
        L_0x00de:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = "LIVE"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r22 == 0) goto L_0x00f2
            com.bamtech.sdk4.internal.media.HlsPlaylists r5 = r22.getHlsPlaylists()
            if (r5 == 0) goto L_0x00f2
            com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r2 = r5.getAttributes()
        L_0x00f2:
            r8 = r2
            if (r22 == 0) goto L_0x0102
            com.bamtech.sdk4.internal.media.HlsPlaylists r2 = r22.getHlsPlaylists()
            if (r2 == 0) goto L_0x0102
            java.util.List r2 = r2.getVariants()
            if (r2 == 0) goto L_0x0102
            goto L_0x0106
        L_0x0102:
            java.util.List r2 = kotlin.p590y.C13185o.m40513a()
        L_0x0106:
            r9 = r2
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1$3 r2 = r0.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1 r2 = r2.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient r2 = r2.this$0
            com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener r13 = r2.defaultQosPlaybackEventListener
            com.bamtech.sdk4.media.MediaPayloadFetchedEventData r14 = new com.bamtech.sdk4.media.MediaPayloadFetchedEventData
            r5 = 0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1$3 r2 = r0.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1 r2 = r2.this$0
            com.bamtech.sdk4.media.MediaDescriptor r2 = r2.$descriptor
            java.lang.String r6 = r2.getPlaybackUrl()
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1$3 r2 = r0.this$0
            com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1 r2 = r2.this$0
            com.bamtech.sdk4.media.MediaDescriptor r2 = r2.$descriptor
            java.lang.String r7 = r2.getBasePlaybackScenario()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11 = 0
            r2 = r14
            r12 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.onEvent(r14)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getVerifiedMediaItem$1$3$qosCallback$1.invoke(okhttp3.Response, java.lang.Throwable, okhttp3.Request, com.bamtech.sdk4.internal.media.Stream):void");
    }
}
