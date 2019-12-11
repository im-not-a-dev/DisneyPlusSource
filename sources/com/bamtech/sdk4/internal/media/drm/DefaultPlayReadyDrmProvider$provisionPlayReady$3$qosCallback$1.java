package com.bamtech.sdk4.internal.media.drm;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C12881k;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, mo31007d2 = {"<anonymous>", "", "response", "Lokhttp3/Response;", "throwable", "", "request", "Lokhttp3/Request;", "<anonymous parameter 3>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultPlayReadyDrmProvider.kt */
final class DefaultPlayReadyDrmProvider$provisionPlayReady$3$qosCallback$1 extends C12881k implements Function4<Response, Throwable, Request, byte[], C13145v> {
    final /* synthetic */ DefaultPlayReadyDrmProvider$provisionPlayReady$3 this$0;

    DefaultPlayReadyDrmProvider$provisionPlayReady$3$qosCallback$1(DefaultPlayReadyDrmProvider$provisionPlayReady$3 defaultPlayReadyDrmProvider$provisionPlayReady$3) {
        this.this$0 = defaultPlayReadyDrmProvider$provisionPlayReady$3;
        super(4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((Response) obj, (Throwable) obj2, (Request) obj3, (byte[]) obj4);
        return C13145v.f29587a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r2 != null) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(okhttp3.Response r19, java.lang.Throwable r20, okhttp3.Request r21, byte[] r22) {
        /*
            r18 = this;
            r0 = r18
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3 r1 = r0.this$0
            java.lang.String r1 = r1.$playbackSessionId
            if (r1 == 0) goto L_0x00c5
            if (r19 == 0) goto L_0x0011
            okhttp3.Request r2 = r19.mo35870m()
            if (r2 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = r21
        L_0x0013:
            r3 = 0
            if (r19 == 0) goto L_0x0026
            long r4 = r19.mo35869l()
            long r6 = r19.mo35871n()
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r17 = r4
            goto L_0x0028
        L_0x0026:
            r17 = r3
        L_0x0028:
            com.bamtech.sdk4.media.ServerRequest r4 = new com.bamtech.sdk4.media.ServerRequest
            com.bamtech.sdk4.media.FetchStatus r6 = com.bamtech.sdk4.media.FetchStatus.completed
            r7 = 0
            r8 = 0
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3 r5 = r0.this$0
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider r5 = r5.this$0
            com.bamtech.sdk4.media.QOSNetworkHelper r5 = r5.getQosNetworkHelper()
            com.bamtech.sdk4.media.NetworkType r9 = r5.currentNetworkType()
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x004a
            okhttp3.HttpUrl r5 = r2.mo35837g()
            if (r5 == 0) goto L_0x004a
            java.lang.String r5 = r5.mo35755g()
            r12 = r5
            goto L_0x004b
        L_0x004a:
            r12 = r3
        L_0x004b:
            if (r2 == 0) goto L_0x0059
            okhttp3.HttpUrl r5 = r2.mo35837g()
            if (r5 == 0) goto L_0x0059
            java.lang.String r5 = r5.mo35750c()
            r13 = r5
            goto L_0x005a
        L_0x0059:
            r13 = r3
        L_0x005a:
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = r2.mo35835e()
            r14 = r2
            goto L_0x0063
        L_0x0062:
            r14 = r3
        L_0x0063:
            if (r19 == 0) goto L_0x006f
            int r2 = r19.mo35858c()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15 = r2
            goto L_0x0070
        L_0x006f:
            r15 = r3
        L_0x0070:
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3 r2 = r0.this$0
            com.bamtech.sdk4.internal.service.ServiceTransaction r2 = r2.$transaction
            java.util.UUID r2 = r2.getId()
            java.lang.String r16 = r2.toString()
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3 r2 = r0.this$0
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider r2 = r2.this$0
            com.bamtech.sdk4.media.QOSNetworkHelper r2 = r2.getQosNetworkHelper()
            r5 = r20
            com.bamtech.sdk4.media.NetworkError r2 = r2.translateLicenseError(r5)
            r4.setError(r2)
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3 r2 = r0.this$0
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider r2 = r2.this$0
            com.bamtech.sdk4.internal.telemetry.EventBuffer r2 = r2.eventBuffer
            com.bamtech.sdk4.media.QOSEvent r5 = new com.bamtech.sdk4.media.QOSEvent
            com.bamtech.sdk4.internal.telemetry.dust.DefaultDustClientData r12 = new com.bamtech.sdk4.internal.telemetry.dust.DefaultDustClientData
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3 r6 = r0.this$0
            com.bamtech.sdk4.internal.service.ServiceTransaction r6 = r6.$transaction
            java.util.UUID r7 = r6.getId()
            com.bamtech.sdk4.media.DrmCertificateFetchedEventData r10 = new com.bamtech.sdk4.media.DrmCertificateFetchedEventData
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3 r6 = r0.this$0
            boolean r6 = r6.$isOffline
            r10.<init>(r1, r6, r4)
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3 r1 = r0.this$0
            com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider r1 = r1.this$0
            com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants r11 = r1.dustConstants
            java.lang.String r8 = "urn:dss:event:fed:media:drm:certificate:fetched"
            java.lang.String r9 = "urn:bamtech:dust:bamsdk:event:qos"
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r5.<init>(r3, r12)
            r1 = 2
            com.bamtech.sdk4.internal.telemetry.EventBuffer.DefaultImpls.postEvent$default(r2, r5, r3, r1, r3)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider$provisionPlayReady$3$qosCallback$1.invoke(okhttp3.Response, java.lang.Throwable, okhttp3.Request, byte[]):void");
    }
}
