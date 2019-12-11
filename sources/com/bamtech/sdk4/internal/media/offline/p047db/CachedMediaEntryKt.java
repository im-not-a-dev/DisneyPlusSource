package com.bamtech.sdk4.internal.media.offline.p047db;

import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.OfflineMediaItemData;
import com.bamtech.sdk4.media.MediaAnalyticsKey;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.offline.DownloadRequest;
import com.bamtech.sdk4.media.offline.LicenseRenewalResult;
import com.bamtech.sdk4.media.offline.VariantConstraints;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¨\u0006\u0007"}, mo31007d2 = {"nullIfEmpty", "", "", "toCachedMedia", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "Lcom/bamtech/sdk4/internal/media/offline/db/CachedMediaEntry;", "toCachedMediaEntry", "plugin-offline-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntryKt */
/* compiled from: CachedMediaEntry.kt */
public final class CachedMediaEntryKt {
    public static final List<String> nullIfEmpty(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        return null;
    }

    public static final ExoCachedMedia toCachedMedia(CachedMediaEntry cachedMediaEntry) {
        VariantConstraints variantConstraints;
        ThumbnailResolution thumbnailResolution;
        MediaDescriptor mediaDescriptor = new MediaDescriptor(cachedMediaEntry.getPlaybackUrl(), cachedMediaEntry.getMediaId(), null, null, null, null, null, null, 252, null);
        String masterPlaylist = cachedMediaEntry.getMasterPlaylist();
        Map telemetry = cachedMediaEntry.getTelemetry();
        if (telemetry == null) {
            telemetry = C13173j0.m40350a();
        }
        Map map = telemetry;
        Map adEngine = cachedMediaEntry.getAdEngine();
        if (adEngine == null) {
            adEngine = C13173j0.m40350a();
        }
        Map map2 = adEngine;
        Map conviva = cachedMediaEntry.getConviva();
        if (conviva == null) {
            conviva = C13173j0.m40350a();
        }
        OfflineMediaItemData offlineMediaItemData = new OfflineMediaItemData(masterPlaylist, cachedMediaEntry.getContentId(), mediaDescriptor, cachedMediaEntry.getPlaylistVariants(), map, map2, conviva, cachedMediaEntry.getThumbnails(), null, 256, null);
        if (cachedMediaEntry.getMaxBitrate() == null && cachedMediaEntry.getMaxHeight() == null && cachedMediaEntry.getMaxWidth() == null) {
            variantConstraints = new VariantConstraints(0, 0, 0, 7, null);
        } else {
            Integer maxBitrate = cachedMediaEntry.getMaxBitrate();
            int i = Integer.MAX_VALUE;
            int intValue = maxBitrate != null ? maxBitrate.intValue() : Integer.MAX_VALUE;
            Integer maxHeight = cachedMediaEntry.getMaxHeight();
            int intValue2 = maxHeight != null ? maxHeight.intValue() : Integer.MAX_VALUE;
            Integer maxWidth = cachedMediaEntry.getMaxWidth();
            if (maxWidth != null) {
                i = maxWidth.intValue();
            }
            variantConstraints = new VariantConstraints(intValue, intValue2, i);
        }
        VariantConstraints variantConstraints2 = variantConstraints;
        List audioLanguages = cachedMediaEntry.getAudioLanguages();
        if (audioLanguages == null) {
            audioLanguages = C13185o.m40513a();
        }
        List list = audioLanguages;
        List subtitleLanguages = cachedMediaEntry.getSubtitleLanguages();
        if (subtitleLanguages == null) {
            subtitleLanguages = C13185o.m40513a();
        }
        List list2 = subtitleLanguages;
        String alternateStorageDir = cachedMediaEntry.getAlternateStorageDir();
        LicenseRenewalResult licenseRenewalResult = null;
        File file = alternateStorageDir != null ? new File(alternateStorageDir) : null;
        List playlistVariants = cachedMediaEntry.getPlaylistVariants();
        String thumbnailResolution2 = cachedMediaEntry.getThumbnailResolution();
        if (thumbnailResolution2 == null || C12832w.m40118a(thumbnailResolution2)) {
            thumbnailResolution = ThumbnailResolution.LOW;
        } else {
            thumbnailResolution = ThumbnailResolution.valueOf(cachedMediaEntry.getThumbnailResolution());
        }
        DownloadRequest downloadRequest = new DownloadRequest(offlineMediaItemData, variantConstraints2, list, list2, file, playlistVariants, thumbnailResolution);
        ExoCachedMedia exoCachedMedia = new ExoCachedMedia(downloadRequest, DownloadStatusEntryKt.toDownloadStatus(cachedMediaEntry.getStatus()));
        exoCachedMedia.setLicense(cachedMediaEntry.getLicense());
        exoCachedMedia.setAudioLicense(cachedMediaEntry.getAudioLicense());
        exoCachedMedia.setExpiration(cachedMediaEntry.getExpiration());
        exoCachedMedia.setRenditionKeys(cachedMediaEntry.getRenditionKeys());
        exoCachedMedia.setOrderNumber(cachedMediaEntry.getOrderNumber());
        exoCachedMedia.setThumbnailsSize(cachedMediaEntry.getThumbnailsSize());
        exoCachedMedia.setLastLicenseRenewal(cachedMediaEntry.getLastLicenseRenewal());
        String lastLicenseRenewalResult = cachedMediaEntry.getLastLicenseRenewalResult();
        if (lastLicenseRenewalResult != null) {
            licenseRenewalResult = LicenseRenewalResult.valueOf(lastLicenseRenewalResult);
        }
        exoCachedMedia.setLastLicenseRenewalResult(licenseRenewalResult);
        return exoCachedMedia;
    }

    public static final CachedMediaEntry toCachedMediaEntry(ExoCachedMedia exoCachedMedia) {
        Object obj;
        String id = exoCachedMedia.getId();
        String playbackUrl = exoCachedMedia.getRequest().getMediaItem().getDescriptor().getPlaybackUrl();
        String masterPlaylist = exoCachedMedia.getMasterPlaylist();
        byte[] license = exoCachedMedia.getLicense();
        byte[] audioLicense = exoCachedMedia.getAudioLicense();
        DateTime expiration = exoCachedMedia.getExpiration();
        Integer valueOf = Integer.valueOf(exoCachedMedia.getRequest().getVariantConstraints().getBitrate());
        Integer valueOf2 = Integer.valueOf(exoCachedMedia.getRequest().getVariantConstraints().getMaxHeight());
        Integer valueOf3 = Integer.valueOf(exoCachedMedia.getRequest().getVariantConstraints().getMaxWidth());
        List nullIfEmpty = nullIfEmpty(exoCachedMedia.getRequest().getAudioLanguages());
        List nullIfEmpty2 = nullIfEmpty(exoCachedMedia.getRequest().getSubtitleLanguages());
        File alternateStorageDir = exoCachedMedia.getRequest().getAlternateStorageDir();
        String path = alternateStorageDir != null ? alternateStorageDir.getPath() : null;
        ArrayList arrayList = new ArrayList(exoCachedMedia.getRenditionKeys());
        DownloadStatusEntry downloadStatusEntry = DownloadStatusEntryKt.toDownloadStatusEntry(exoCachedMedia.getStatus());
        List playlistVariants = exoCachedMedia.getRequest().getPlaylistVariants();
        String contentId = exoCachedMedia.getRequest().getMediaItem().getPlayhead().getContentId();
        Map trackingData = exoCachedMedia.getRequest().getMediaItem().getTrackingData(MediaAnalyticsKey.TELEMETRY);
        DownloadStatusEntry downloadStatusEntry2 = downloadStatusEntry;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(trackingData.size()));
        Iterator it = trackingData.entrySet().iterator();
        while (true) {
            obj = "";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            Iterator it2 = it;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = obj;
            }
            linkedHashMap.put(key, value);
            it = it2;
        }
        Map trackingData2 = exoCachedMedia.getRequest().getMediaItem().getTrackingData(MediaAnalyticsKey.AD_ENGINE);
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C13173j0.m40349a(trackingData2.size()));
        Iterator it3 = trackingData2.entrySet().iterator();
        while (it3.hasNext()) {
            Entry entry2 = (Entry) it3.next();
            Iterator it4 = it3;
            Object key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 == null) {
                value2 = obj;
            }
            linkedHashMap3.put(key2, value2);
            it3 = it4;
        }
        Map trackingData3 = exoCachedMedia.getRequest().getMediaItem().getTrackingData(MediaAnalyticsKey.CONVIVA);
        LinkedHashMap linkedHashMap4 = linkedHashMap3;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(C13173j0.m40349a(trackingData3.size()));
        Iterator it5 = trackingData3.entrySet().iterator();
        while (it5.hasNext()) {
            Entry entry3 = (Entry) it5.next();
            Iterator it6 = it5;
            Object key3 = entry3.getKey();
            Object value3 = entry3.getValue();
            if (value3 == null) {
                value3 = obj;
            }
            linkedHashMap5.put(key3, value3);
            it5 = it6;
        }
        int orderNumber = exoCachedMedia.getOrderNumber();
        String name = exoCachedMedia.getRequest().getThumbnailResolution().name();
        MediaThumbnailLinks thumbnails = exoCachedMedia.getRequest().getMediaItem().getThumbnails();
        long thumbnailsSize = exoCachedMedia.getThumbnailsSize();
        DateTime lastLicenseRenewal = exoCachedMedia.getLastLicenseRenewal();
        LicenseRenewalResult lastLicenseRenewalResult = exoCachedMedia.getLastLicenseRenewalResult();
        CachedMediaEntry cachedMediaEntry = new CachedMediaEntry(id, playbackUrl, masterPlaylist, license, audioLicense, expiration, valueOf, valueOf2, valueOf3, nullIfEmpty, nullIfEmpty2, path, arrayList, downloadStatusEntry2, playlistVariants, contentId, linkedHashMap2, linkedHashMap4, linkedHashMap5, orderNumber, name, thumbnails, thumbnailsSize, lastLicenseRenewal, lastLicenseRenewalResult != null ? lastLicenseRenewalResult.name() : null);
        return cachedMediaEntry;
    }
}
