package com.bamtech.sdk4.internal.media.offline.p047db;

import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.internal.media.HlsPlaylistVariant;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B·\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d\u0012\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d\u0012\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0006\u0010$\u001a\u00020%\u0012\b\u0010&\u001a\u0004\u0018\u00010\n\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010(J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010R\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016HÆ\u0003J\t\u0010S\u001a\u00020\u0018HÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dHÆ\u0003J\u0019\u0010W\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001dHÆ\u0003J\u0019\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001dHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\fHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010#HÆ\u0003J\t\u0010]\u001a\u00020%HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0007HÆ\u0003J\t\u0010b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010:J\u0010\u0010f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010:Jò\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\u0018\b\u0002\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d2\u0018\b\u0002\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010l\u001a\u00020\fHÖ\u0001J\t\u0010m\u001a\u00020\u0003HÖ\u0001R!\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R!\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010&\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010;\u001a\u0004\b<\u0010:R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010;\u001a\u0004\b=\u0010:R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010,R\u0011\u0010 \u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bB\u0010.R!\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u001f\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bH\u0010*R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010,R\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bL\u0010M¨\u0006n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/CachedMediaEntry;", "", "mediaId", "", "playbackUrl", "masterPlaylist", "license", "", "audioLicense", "expiration", "Lorg/joda/time/DateTime;", "maxBitrate", "", "maxHeight", "maxWidth", "audioLanguages", "", "subtitleLanguages", "alternateStorageDir", "renditionKeys", "Ljava/util/ArrayList;", "Lcom/google/android/exoplayer2/offline/StreamKey;", "Lkotlin/collections/ArrayList;", "status", "Lcom/bamtech/sdk4/internal/media/offline/db/DownloadStatusEntry;", "playlistVariants", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "contentId", "telemetry", "", "adEngine", "conviva", "orderNumber", "thumbnailResolution", "thumbnails", "Lcom/bamtech/sdk4/MediaThumbnailLinks;", "thumbnailsSize", "", "lastLicenseRenewal", "lastLicenseRenewalResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B[BLorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Lcom/bamtech/sdk4/internal/media/offline/db/DownloadStatusEntry;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/String;Lcom/bamtech/sdk4/MediaThumbnailLinks;JLorg/joda/time/DateTime;Ljava/lang/String;)V", "getAdEngine", "()Ljava/util/Map;", "getAlternateStorageDir", "()Ljava/lang/String;", "getAudioLanguages", "()Ljava/util/List;", "getAudioLicense", "()[B", "getContentId", "getConviva", "getExpiration", "()Lorg/joda/time/DateTime;", "getLastLicenseRenewal", "getLastLicenseRenewalResult", "getLicense", "getMasterPlaylist", "getMaxBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxHeight", "getMaxWidth", "getMediaId", "getOrderNumber", "()I", "getPlaybackUrl", "getPlaylistVariants", "getRenditionKeys", "()Ljava/util/ArrayList;", "getStatus", "()Lcom/bamtech/sdk4/internal/media/offline/db/DownloadStatusEntry;", "getSubtitleLanguages", "getTelemetry", "getThumbnailResolution", "getThumbnails", "()Lcom/bamtech/sdk4/MediaThumbnailLinks;", "getThumbnailsSize", "()J", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B[BLorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Lcom/bamtech/sdk4/internal/media/offline/db/DownloadStatusEntry;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/String;Lcom/bamtech/sdk4/MediaThumbnailLinks;JLorg/joda/time/DateTime;Ljava/lang/String;)Lcom/bamtech/sdk4/internal/media/offline/db/CachedMediaEntry;", "equals", "", "other", "hashCode", "toString", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntry */
/* compiled from: CachedMediaEntry.kt */
public final class CachedMediaEntry {
    private final Map<String, Object> adEngine;
    private final String alternateStorageDir;
    private final List<String> audioLanguages;
    private final byte[] audioLicense;
    private final String contentId;
    private final Map<String, Object> conviva;
    private final DateTime expiration;
    private final DateTime lastLicenseRenewal;
    private final String lastLicenseRenewalResult;
    private final byte[] license;
    private final String masterPlaylist;
    private final Integer maxBitrate;
    private final Integer maxHeight;
    private final Integer maxWidth;
    private final String mediaId;
    private final int orderNumber;
    private final String playbackUrl;
    private final List<HlsPlaylistVariant> playlistVariants;
    private final ArrayList<StreamKey> renditionKeys;
    private final DownloadStatusEntry status;
    private final List<String> subtitleLanguages;
    private final Map<String, Object> telemetry;
    private final String thumbnailResolution;
    private final MediaThumbnailLinks thumbnails;
    private final long thumbnailsSize;

    public CachedMediaEntry(String str, String str2, String str3, byte[] bArr, byte[] bArr2, DateTime dateTime, Integer num, Integer num2, Integer num3, List<String> list, List<String> list2, String str4, ArrayList<StreamKey> arrayList, DownloadStatusEntry downloadStatusEntry, List<HlsPlaylistVariant> list3, String str5, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, int i, String str6, MediaThumbnailLinks mediaThumbnailLinks, long j, DateTime dateTime2, String str7) {
        this.mediaId = str;
        this.playbackUrl = str2;
        this.masterPlaylist = str3;
        this.license = bArr;
        this.audioLicense = bArr2;
        this.expiration = dateTime;
        this.maxBitrate = num;
        this.maxHeight = num2;
        this.maxWidth = num3;
        this.audioLanguages = list;
        this.subtitleLanguages = list2;
        this.alternateStorageDir = str4;
        this.renditionKeys = arrayList;
        this.status = downloadStatusEntry;
        this.playlistVariants = list3;
        this.contentId = str5;
        this.telemetry = map;
        this.adEngine = map2;
        this.conviva = map3;
        this.orderNumber = i;
        this.thumbnailResolution = str6;
        this.thumbnails = mediaThumbnailLinks;
        this.thumbnailsSize = j;
        this.lastLicenseRenewal = dateTime2;
        this.lastLicenseRenewalResult = str7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CachedMediaEntry) {
                CachedMediaEntry cachedMediaEntry = (CachedMediaEntry) obj;
                if (Intrinsics.areEqual((Object) this.mediaId, (Object) cachedMediaEntry.mediaId) && Intrinsics.areEqual((Object) this.playbackUrl, (Object) cachedMediaEntry.playbackUrl) && Intrinsics.areEqual((Object) this.masterPlaylist, (Object) cachedMediaEntry.masterPlaylist) && Intrinsics.areEqual((Object) this.license, (Object) cachedMediaEntry.license) && Intrinsics.areEqual((Object) this.audioLicense, (Object) cachedMediaEntry.audioLicense) && Intrinsics.areEqual((Object) this.expiration, (Object) cachedMediaEntry.expiration) && Intrinsics.areEqual((Object) this.maxBitrate, (Object) cachedMediaEntry.maxBitrate) && Intrinsics.areEqual((Object) this.maxHeight, (Object) cachedMediaEntry.maxHeight) && Intrinsics.areEqual((Object) this.maxWidth, (Object) cachedMediaEntry.maxWidth) && Intrinsics.areEqual((Object) this.audioLanguages, (Object) cachedMediaEntry.audioLanguages) && Intrinsics.areEqual((Object) this.subtitleLanguages, (Object) cachedMediaEntry.subtitleLanguages) && Intrinsics.areEqual((Object) this.alternateStorageDir, (Object) cachedMediaEntry.alternateStorageDir) && Intrinsics.areEqual((Object) this.renditionKeys, (Object) cachedMediaEntry.renditionKeys) && Intrinsics.areEqual((Object) this.status, (Object) cachedMediaEntry.status) && Intrinsics.areEqual((Object) this.playlistVariants, (Object) cachedMediaEntry.playlistVariants) && Intrinsics.areEqual((Object) this.contentId, (Object) cachedMediaEntry.contentId) && Intrinsics.areEqual((Object) this.telemetry, (Object) cachedMediaEntry.telemetry) && Intrinsics.areEqual((Object) this.adEngine, (Object) cachedMediaEntry.adEngine) && Intrinsics.areEqual((Object) this.conviva, (Object) cachedMediaEntry.conviva)) {
                    if ((this.orderNumber == cachedMediaEntry.orderNumber) && Intrinsics.areEqual((Object) this.thumbnailResolution, (Object) cachedMediaEntry.thumbnailResolution) && Intrinsics.areEqual((Object) this.thumbnails, (Object) cachedMediaEntry.thumbnails)) {
                        if (!(this.thumbnailsSize == cachedMediaEntry.thumbnailsSize) || !Intrinsics.areEqual((Object) this.lastLicenseRenewal, (Object) cachedMediaEntry.lastLicenseRenewal) || !Intrinsics.areEqual((Object) this.lastLicenseRenewalResult, (Object) cachedMediaEntry.lastLicenseRenewalResult)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Map<String, Object> getAdEngine() {
        return this.adEngine;
    }

    public final String getAlternateStorageDir() {
        return this.alternateStorageDir;
    }

    public final List<String> getAudioLanguages() {
        return this.audioLanguages;
    }

    public final byte[] getAudioLicense() {
        return this.audioLicense;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final Map<String, Object> getConviva() {
        return this.conviva;
    }

    public final DateTime getExpiration() {
        return this.expiration;
    }

    public final DateTime getLastLicenseRenewal() {
        return this.lastLicenseRenewal;
    }

    public final String getLastLicenseRenewalResult() {
        return this.lastLicenseRenewalResult;
    }

    public final byte[] getLicense() {
        return this.license;
    }

    public final String getMasterPlaylist() {
        return this.masterPlaylist;
    }

    public final Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final int getOrderNumber() {
        return this.orderNumber;
    }

    public final String getPlaybackUrl() {
        return this.playbackUrl;
    }

    public final List<HlsPlaylistVariant> getPlaylistVariants() {
        return this.playlistVariants;
    }

    public final ArrayList<StreamKey> getRenditionKeys() {
        return this.renditionKeys;
    }

    public final DownloadStatusEntry getStatus() {
        return this.status;
    }

    public final List<String> getSubtitleLanguages() {
        return this.subtitleLanguages;
    }

    public final Map<String, Object> getTelemetry() {
        return this.telemetry;
    }

    public final String getThumbnailResolution() {
        return this.thumbnailResolution;
    }

    public final MediaThumbnailLinks getThumbnails() {
        return this.thumbnails;
    }

    public final long getThumbnailsSize() {
        return this.thumbnailsSize;
    }

    public int hashCode() {
        String str = this.mediaId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.playbackUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.masterPlaylist;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        byte[] bArr = this.license;
        int hashCode4 = (hashCode3 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        byte[] bArr2 = this.audioLicense;
        int hashCode5 = (hashCode4 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        DateTime dateTime = this.expiration;
        int hashCode6 = (hashCode5 + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        Integer num = this.maxBitrate;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.maxHeight;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.maxWidth;
        int hashCode9 = (hashCode8 + (num3 != null ? num3.hashCode() : 0)) * 31;
        List<String> list = this.audioLanguages;
        int hashCode10 = (hashCode9 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.subtitleLanguages;
        int hashCode11 = (hashCode10 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str4 = this.alternateStorageDir;
        int hashCode12 = (hashCode11 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ArrayList<StreamKey> arrayList = this.renditionKeys;
        int hashCode13 = (hashCode12 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        DownloadStatusEntry downloadStatusEntry = this.status;
        int hashCode14 = (hashCode13 + (downloadStatusEntry != null ? downloadStatusEntry.hashCode() : 0)) * 31;
        List<HlsPlaylistVariant> list3 = this.playlistVariants;
        int hashCode15 = (hashCode14 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str5 = this.contentId;
        int hashCode16 = (hashCode15 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Map<String, Object> map = this.telemetry;
        int hashCode17 = (hashCode16 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, Object> map2 = this.adEngine;
        int hashCode18 = (hashCode17 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, Object> map3 = this.conviva;
        int hashCode19 = (((hashCode18 + (map3 != null ? map3.hashCode() : 0)) * 31) + this.orderNumber) * 31;
        String str6 = this.thumbnailResolution;
        int hashCode20 = (hashCode19 + (str6 != null ? str6.hashCode() : 0)) * 31;
        MediaThumbnailLinks mediaThumbnailLinks = this.thumbnails;
        int hashCode21 = (hashCode20 + (mediaThumbnailLinks != null ? mediaThumbnailLinks.hashCode() : 0)) * 31;
        long j = this.thumbnailsSize;
        int i2 = (hashCode21 + ((int) (j ^ (j >>> 32)))) * 31;
        DateTime dateTime2 = this.lastLicenseRenewal;
        int hashCode22 = (i2 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31;
        String str7 = this.lastLicenseRenewalResult;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode22 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CachedMediaEntry(mediaId=");
        sb.append(this.mediaId);
        sb.append(", playbackUrl=");
        sb.append(this.playbackUrl);
        sb.append(", masterPlaylist=");
        sb.append(this.masterPlaylist);
        sb.append(", license=");
        sb.append(Arrays.toString(this.license));
        sb.append(", audioLicense=");
        sb.append(Arrays.toString(this.audioLicense));
        sb.append(", expiration=");
        sb.append(this.expiration);
        sb.append(", maxBitrate=");
        sb.append(this.maxBitrate);
        sb.append(", maxHeight=");
        sb.append(this.maxHeight);
        sb.append(", maxWidth=");
        sb.append(this.maxWidth);
        sb.append(", audioLanguages=");
        sb.append(this.audioLanguages);
        sb.append(", subtitleLanguages=");
        sb.append(this.subtitleLanguages);
        sb.append(", alternateStorageDir=");
        sb.append(this.alternateStorageDir);
        sb.append(", renditionKeys=");
        sb.append(this.renditionKeys);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", playlistVariants=");
        sb.append(this.playlistVariants);
        sb.append(", contentId=");
        sb.append(this.contentId);
        sb.append(", telemetry=");
        sb.append(this.telemetry);
        sb.append(", adEngine=");
        sb.append(this.adEngine);
        sb.append(", conviva=");
        sb.append(this.conviva);
        sb.append(", orderNumber=");
        sb.append(this.orderNumber);
        sb.append(", thumbnailResolution=");
        sb.append(this.thumbnailResolution);
        sb.append(", thumbnails=");
        sb.append(this.thumbnails);
        sb.append(", thumbnailsSize=");
        sb.append(this.thumbnailsSize);
        sb.append(", lastLicenseRenewal=");
        sb.append(this.lastLicenseRenewal);
        sb.append(", lastLicenseRenewalResult=");
        sb.append(this.lastLicenseRenewalResult);
        sb.append(")");
        return sb.toString();
    }
}
