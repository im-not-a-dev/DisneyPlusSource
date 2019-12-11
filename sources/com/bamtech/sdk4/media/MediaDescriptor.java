package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.media.drm.DrmType;
import java.util.Map;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 32\u00020\u0001:\u00013B;\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tBg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jm\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038FX\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018¨\u00064"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaDescriptor;", "", "playbackUrl", "", "adInsertionStrategy", "Lcom/bamtech/sdk4/media/AdInsertionStrategy;", "playbackScenario", "adTargeting", "", "(Ljava/lang/String;Lcom/bamtech/sdk4/media/AdInsertionStrategy;Ljava/lang/String;Ljava/util/Map;)V", "cachedMediaId", "basePlaybackScenario", "hdrType", "Lcom/bamtech/sdk4/media/HdrType;", "drmType", "Lcom/bamtech/sdk4/media/drm/DrmType;", "mediaPreferences", "Lcom/bamtech/sdk4/media/MediaPreferences;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/media/AdInsertionStrategy;Ljava/lang/String;Ljava/util/Map;Lcom/bamtech/sdk4/media/HdrType;Lcom/bamtech/sdk4/media/drm/DrmType;Lcom/bamtech/sdk4/media/MediaPreferences;)V", "getAdInsertionStrategy", "()Lcom/bamtech/sdk4/media/AdInsertionStrategy;", "getAdTargeting", "()Ljava/util/Map;", "getBasePlaybackScenario", "()Ljava/lang/String;", "getCachedMediaId", "getDrmType", "()Lcom/bamtech/sdk4/media/drm/DrmType;", "getHdrType", "()Lcom/bamtech/sdk4/media/HdrType;", "getMediaPreferences", "()Lcom/bamtech/sdk4/media/MediaPreferences;", "playbackScenario$annotations", "()V", "getPlaybackScenario", "getPlaybackUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaDescriptor.kt */
public final class MediaDescriptor {
    public static final Companion Companion = new Companion(null);
    private final AdInsertionStrategy adInsertionStrategy;
    private final Map<String, String> adTargeting;
    private final String basePlaybackScenario;
    private final String cachedMediaId;
    private final DrmType drmType;
    private final HdrType hdrType;
    private final MediaPreferences mediaPreferences;
    private final String playbackUrl;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaDescriptor$Companion;", "", "()V", "legacyCachedMediaId", "", "playbackUrl", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: MediaDescriptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String legacyCachedMediaId(String str) {
            return CacheIdGeneratorKt.generateCachedMediaId(str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MediaDescriptor(String str) {
        this(str, (AdInsertionStrategy) null, (String) null, (Map) null, 14, (DefaultConstructorMarker) null);
    }

    public MediaDescriptor(String str, AdInsertionStrategy adInsertionStrategy2) {
        this(str, adInsertionStrategy2, (String) null, (Map) null, 12, (DefaultConstructorMarker) null);
    }

    public MediaDescriptor(String str, AdInsertionStrategy adInsertionStrategy2, String str2) {
        this(str, adInsertionStrategy2, str2, (Map) null, 8, (DefaultConstructorMarker) null);
    }

    public MediaDescriptor(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, 252, null);
    }

    public MediaDescriptor(String str, String str2, AdInsertionStrategy adInsertionStrategy2) {
        this(str, str2, adInsertionStrategy2, null, null, null, null, null, 248, null);
    }

    public MediaDescriptor(String str, String str2, AdInsertionStrategy adInsertionStrategy2, String str3) {
        this(str, str2, adInsertionStrategy2, str3, null, null, null, null, 240, null);
    }

    public MediaDescriptor(String str, String str2, AdInsertionStrategy adInsertionStrategy2, String str3, Map<String, String> map) {
        this(str, str2, adInsertionStrategy2, str3, map, null, null, null, 224, null);
    }

    public MediaDescriptor(String str, String str2, AdInsertionStrategy adInsertionStrategy2, String str3, Map<String, String> map, HdrType hdrType2) {
        this(str, str2, adInsertionStrategy2, str3, map, hdrType2, null, null, 192, null);
    }

    public MediaDescriptor(String str, String str2, AdInsertionStrategy adInsertionStrategy2, String str3, Map<String, String> map, HdrType hdrType2, DrmType drmType2) {
        this(str, str2, adInsertionStrategy2, str3, map, hdrType2, drmType2, null, 128, null);
    }

    public MediaDescriptor(String str, String str2, AdInsertionStrategy adInsertionStrategy2, String str3, Map<String, String> map, HdrType hdrType2, DrmType drmType2, MediaPreferences mediaPreferences2) {
        this.playbackUrl = str;
        this.cachedMediaId = str2;
        this.adInsertionStrategy = adInsertionStrategy2;
        this.basePlaybackScenario = str3;
        this.adTargeting = map;
        this.hdrType = hdrType2;
        this.drmType = drmType2;
        this.mediaPreferences = mediaPreferences2;
    }

    public static /* synthetic */ MediaDescriptor copy$default(MediaDescriptor mediaDescriptor, String str, String str2, AdInsertionStrategy adInsertionStrategy2, String str3, Map map, HdrType hdrType2, DrmType drmType2, MediaPreferences mediaPreferences2, int i, Object obj) {
        MediaDescriptor mediaDescriptor2 = mediaDescriptor;
        int i2 = i;
        return mediaDescriptor.copy((i2 & 1) != 0 ? mediaDescriptor2.playbackUrl : str, (i2 & 2) != 0 ? mediaDescriptor2.cachedMediaId : str2, (i2 & 4) != 0 ? mediaDescriptor2.adInsertionStrategy : adInsertionStrategy2, (i2 & 8) != 0 ? mediaDescriptor2.basePlaybackScenario : str3, (i2 & 16) != 0 ? mediaDescriptor2.adTargeting : map, (i2 & 32) != 0 ? mediaDescriptor2.hdrType : hdrType2, (i2 & 64) != 0 ? mediaDescriptor2.drmType : drmType2, (i2 & 128) != 0 ? mediaDescriptor2.mediaPreferences : mediaPreferences2);
    }

    public static final String legacyCachedMediaId(String str) {
        return Companion.legacyCachedMediaId(str);
    }

    public static /* synthetic */ void playbackScenario$annotations() {
    }

    public final String component1() {
        return this.playbackUrl;
    }

    public final String component2() {
        return this.cachedMediaId;
    }

    public final AdInsertionStrategy component3() {
        return this.adInsertionStrategy;
    }

    public final String component4() {
        return this.basePlaybackScenario;
    }

    public final Map<String, String> component5() {
        return this.adTargeting;
    }

    public final HdrType component6() {
        return this.hdrType;
    }

    public final DrmType component7() {
        return this.drmType;
    }

    public final MediaPreferences component8() {
        return this.mediaPreferences;
    }

    public final MediaDescriptor copy(String str, String str2, AdInsertionStrategy adInsertionStrategy2, String str3, Map<String, String> map, HdrType hdrType2, DrmType drmType2, MediaPreferences mediaPreferences2) {
        MediaDescriptor mediaDescriptor = new MediaDescriptor(str, str2, adInsertionStrategy2, str3, map, hdrType2, drmType2, mediaPreferences2);
        return mediaDescriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.mediaPreferences, (java.lang.Object) r3.mediaPreferences) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof com.bamtech.sdk4.media.MediaDescriptor
            if (r0 == 0) goto L_0x0059
            com.bamtech.sdk4.media.MediaDescriptor r3 = (com.bamtech.sdk4.media.MediaDescriptor) r3
            java.lang.String r0 = r2.playbackUrl
            java.lang.String r1 = r3.playbackUrl
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.cachedMediaId
            java.lang.String r1 = r3.cachedMediaId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtech.sdk4.media.AdInsertionStrategy r0 = r2.adInsertionStrategy
            com.bamtech.sdk4.media.AdInsertionStrategy r1 = r3.adInsertionStrategy
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.basePlaybackScenario
            java.lang.String r1 = r3.basePlaybackScenario
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.adTargeting
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.adTargeting
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtech.sdk4.media.HdrType r0 = r2.hdrType
            com.bamtech.sdk4.media.HdrType r1 = r3.hdrType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtech.sdk4.media.drm.DrmType r0 = r2.drmType
            com.bamtech.sdk4.media.drm.DrmType r1 = r3.drmType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtech.sdk4.media.MediaPreferences r0 = r2.mediaPreferences
            com.bamtech.sdk4.media.MediaPreferences r3 = r3.mediaPreferences
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.MediaDescriptor.equals(java.lang.Object):boolean");
    }

    public final AdInsertionStrategy getAdInsertionStrategy() {
        return this.adInsertionStrategy;
    }

    public final Map<String, String> getAdTargeting() {
        return this.adTargeting;
    }

    public final String getBasePlaybackScenario() {
        return this.basePlaybackScenario;
    }

    public final String getCachedMediaId() {
        return this.cachedMediaId;
    }

    public final DrmType getDrmType() {
        return this.drmType;
    }

    public final HdrType getHdrType() {
        return this.hdrType;
    }

    public final MediaPreferences getMediaPreferences() {
        return this.mediaPreferences;
    }

    public final String getPlaybackScenario() {
        return this.basePlaybackScenario;
    }

    public final String getPlaybackUrl() {
        return this.playbackUrl;
    }

    public int hashCode() {
        String str = this.playbackUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.cachedMediaId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AdInsertionStrategy adInsertionStrategy2 = this.adInsertionStrategy;
        int hashCode3 = (hashCode2 + (adInsertionStrategy2 != null ? adInsertionStrategy2.hashCode() : 0)) * 31;
        String str3 = this.basePlaybackScenario;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.adTargeting;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        HdrType hdrType2 = this.hdrType;
        int hashCode6 = (hashCode5 + (hdrType2 != null ? hdrType2.hashCode() : 0)) * 31;
        DrmType drmType2 = this.drmType;
        int hashCode7 = (hashCode6 + (drmType2 != null ? drmType2.hashCode() : 0)) * 31;
        MediaPreferences mediaPreferences2 = this.mediaPreferences;
        if (mediaPreferences2 != null) {
            i = mediaPreferences2.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaDescriptor(playbackUrl=");
        sb.append(this.playbackUrl);
        sb.append(", cachedMediaId=");
        sb.append(this.cachedMediaId);
        sb.append(", adInsertionStrategy=");
        sb.append(this.adInsertionStrategy);
        sb.append(", basePlaybackScenario=");
        sb.append(this.basePlaybackScenario);
        sb.append(", adTargeting=");
        sb.append(this.adTargeting);
        sb.append(", hdrType=");
        sb.append(this.hdrType);
        sb.append(", drmType=");
        sb.append(this.drmType);
        sb.append(", mediaPreferences=");
        sb.append(this.mediaPreferences);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MediaDescriptor(String str, String str2, AdInsertionStrategy adInsertionStrategy2, String str3, Map map, HdrType hdrType2, DrmType drmType2, MediaPreferences mediaPreferences2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, str2, (i2 & 4) != 0 ? AdInsertionStrategy.NONE : adInsertionStrategy2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? C13173j0.m40350a() : map, (i2 & 32) != 0 ? null : hdrType2, (i2 & 64) != 0 ? null : drmType2, (i2 & 128) != 0 ? null : mediaPreferences2);
    }

    public /* synthetic */ MediaDescriptor(String str, AdInsertionStrategy adInsertionStrategy2, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            adInsertionStrategy2 = AdInsertionStrategy.NONE;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            map = C13173j0.m40350a();
        }
        this(str, adInsertionStrategy2, str2, map);
    }

    public MediaDescriptor(String str, AdInsertionStrategy adInsertionStrategy2, String str2, Map<String, String> map) {
        this(str, CacheIdGeneratorKt.generateCachedMediaId(str), adInsertionStrategy2, str2, map, null, null, null, 224, null);
    }
}
