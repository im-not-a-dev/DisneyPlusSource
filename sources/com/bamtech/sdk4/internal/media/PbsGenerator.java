package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/PbsGenerator;", "", "mediaCapabilitiesProvider", "Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;", "(Lcom/bamtech/sdk4/media/MediaCapabilitiesProvider;)V", "generateScenario", "", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/MediaServiceConfiguration;", "allowL1", "", "generateScenario$sdk_core_api_release", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PbsGenerator.kt */
public final class PbsGenerator {
    private final MediaCapabilitiesProvider mediaCapabilitiesProvider;

    public PbsGenerator(MediaCapabilitiesProvider mediaCapabilitiesProvider2) {
        this.mediaCapabilitiesProvider = mediaCapabilitiesProvider2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String generateScenario$sdk_core_api_release(com.bamtech.sdk4.media.MediaDescriptor r10, com.bamtech.sdk4.internal.configuration.MediaServiceConfiguration r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getBasePlaybackScenario()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            boolean r0 = kotlin.p588j0.C12832w.m40118a(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x001a
            java.lang.String r10 = r10.getBasePlaybackScenario()
            if (r10 == 0) goto L_0x0016
            return r10
        L_0x0016:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            throw r1
        L_0x001a:
            java.lang.String r0 = r11.getDefaultPlaybackScenario()
            com.bamtech.sdk4.media.MediaPreferences r3 = r10.getMediaPreferences()
            if (r3 == 0) goto L_0x0029
            com.bamtech.sdk4.media.MediaQuality r3 = r3.getPreferredMediaQuality()
            goto L_0x002a
        L_0x0029:
            r3 = r1
        L_0x002a:
            if (r3 == 0) goto L_0x003a
            com.bamtech.sdk4.media.MediaQuality r4 = com.bamtech.sdk4.media.MediaQuality.restricted
            boolean r4 = r3.equals(r4)
            if (r4 != r2) goto L_0x003a
            java.lang.String r11 = r11.getRestrictedPlaybackScenario()
            goto L_0x0147
        L_0x003a:
            if (r3 == 0) goto L_0x005a
            com.bamtech.sdk4.media.MediaQuality r4 = com.bamtech.sdk4.media.MediaQuality.limited
            boolean r3 = r3.equals(r4)
            if (r3 != r2) goto L_0x005a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = 45
            r3.append(r0)
            com.bamtech.sdk4.media.MediaQuality r0 = com.bamtech.sdk4.media.MediaQuality.limited
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x005a:
            com.bamtech.sdk4.internal.configuration.MediaSecurityRequirements r3 = r11.getSecurityCheckRequirements()
            com.bamtech.sdk4.internal.configuration.WidevineSecurityRequirements r3 = r3.getWidevine()
            if (r3 == 0) goto L_0x0146
            boolean r3 = r3.getEnabled()
            if (r3 != r2) goto L_0x0146
            boolean r3 = r11.isUhdAllowed()
            if (r3 != r2) goto L_0x0146
            com.bamtech.sdk4.media.MediaCapabilitiesProvider r3 = r9.mediaCapabilitiesProvider
            if (r3 == 0) goto L_0x0079
            java.util.List r3 = r3.getSupportedHdrTypes()
            goto L_0x007a
        L_0x0079:
            r3 = r1
        L_0x007a:
            com.bamtech.sdk4.media.MediaCapabilitiesProvider r4 = r9.mediaCapabilitiesProvider
            if (r4 == 0) goto L_0x0083
            java.util.List r4 = r4.getSupportedCodecs()
            goto L_0x0084
        L_0x0083:
            r4 = r1
        L_0x0084:
            com.bamtech.sdk4.media.MediaCapabilitiesProvider r5 = r9.mediaCapabilitiesProvider
            if (r5 == 0) goto L_0x008d
            com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel r5 = r5.getWidevineSecurityLevel()
            goto L_0x008e
        L_0x008d:
            r5 = r1
        L_0x008e:
            com.bamtech.sdk4.internal.configuration.MediaSecurityRequirements r6 = r11.getSecurityCheckRequirements()
            com.bamtech.sdk4.internal.configuration.WidevineSecurityRequirements r6 = r6.getWidevine()
            if (r6 == 0) goto L_0x009d
            com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel r6 = r6.getMinimumSecurityLevel()
            goto L_0x009e
        L_0x009d:
            r6 = r1
        L_0x009e:
            com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel r7 = com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel.level1
            r8 = 0
            if (r6 != r7) goto L_0x00a9
            if (r5 != r7) goto L_0x00a9
            if (r12 == 0) goto L_0x00a9
            r12 = 1
            goto L_0x00aa
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel r5 = com.bamtech.sdk4.internal.configuration.WidevineSecurityLevel.level1
            if (r6 == r5) goto L_0x00af
            r8 = 1
        L_0x00af:
            if (r12 != 0) goto L_0x00ba
            if (r8 == 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            java.lang.String r11 = r11.getRestrictedPlaybackScenario()
            goto L_0x0147
        L_0x00ba:
            if (r4 == 0) goto L_0x011b
            com.bamtech.sdk4.media.SupportedCodec r11 = com.bamtech.sdk4.media.SupportedCodec.h265
            boolean r11 = r4.contains(r11)
            if (r11 != r2) goto L_0x011b
            com.bamtech.sdk4.media.HdrType r11 = r10.getHdrType()
            if (r11 == 0) goto L_0x00e3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r12 = "-h265-"
            r11.append(r12)
            com.bamtech.sdk4.media.HdrType r12 = r10.getHdrType()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            goto L_0x011c
        L_0x00e3:
            if (r3 == 0) goto L_0x00ff
            com.bamtech.sdk4.media.HdrType r11 = com.bamtech.sdk4.media.HdrType.DOLBY_VISION
            boolean r11 = r3.contains(r11)
            if (r11 != r2) goto L_0x00ff
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r12 = "-h265-dovi"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            goto L_0x011c
        L_0x00ff:
            if (r3 == 0) goto L_0x011b
            com.bamtech.sdk4.media.HdrType r11 = com.bamtech.sdk4.media.HdrType.HDR10
            boolean r11 = r3.contains(r11)
            if (r11 != r2) goto L_0x011b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r12 = "-h265-hdr10"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            goto L_0x011c
        L_0x011b:
            r11 = r0
        L_0x011c:
            com.bamtech.sdk4.media.MediaCapabilitiesProvider r12 = r9.mediaCapabilitiesProvider
            if (r12 == 0) goto L_0x0147
            boolean r12 = r12.supportsAtmos()
            if (r12 != r2) goto L_0x0147
            com.bamtech.sdk4.media.MediaPreferences r12 = r10.getMediaPreferences()
            if (r12 == 0) goto L_0x0130
            com.bamtech.sdk4.media.AudioQuality r1 = r12.getPreferredAudioQuality()
        L_0x0130:
            com.bamtech.sdk4.media.AudioQuality r12 = com.bamtech.sdk4.media.AudioQuality.atmos
            if (r1 != r12) goto L_0x0147
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "-atmos"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            goto L_0x0147
        L_0x0146:
            r11 = r0
        L_0x0147:
            com.bamtech.sdk4.media.AdInsertionStrategy r12 = r10.getAdInsertionStrategy()
            com.bamtech.sdk4.media.AdInsertionStrategy r0 = com.bamtech.sdk4.media.AdInsertionStrategy.NONE
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r0)
            if (r12 == 0) goto L_0x0154
            goto L_0x016c
        L_0x0154:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r11 = 126(0x7e, float:1.77E-43)
            r12.append(r11)
            com.bamtech.sdk4.media.AdInsertionStrategy r10 = r10.getAdInsertionStrategy()
            r12.append(r10)
            java.lang.String r11 = r12.toString()
        L_0x016c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.PbsGenerator.generateScenario$sdk_core_api_release(com.bamtech.sdk4.media.MediaDescriptor, com.bamtech.sdk4.internal.configuration.MediaServiceConfiguration, boolean):java.lang.String");
    }
}
