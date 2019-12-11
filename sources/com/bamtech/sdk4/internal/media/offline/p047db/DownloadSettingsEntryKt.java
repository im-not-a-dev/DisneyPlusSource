package com.bamtech.sdk4.internal.media.offline.p047db;

import com.bamtech.sdk4.media.offline.DownloadSettings;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, mo31007d2 = {"fromEntry", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "Lcom/bamtech/sdk4/internal/media/offline/db/DownloadSettingsEntry;", "toEntry", "plugin-offline-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.DownloadSettingsEntryKt */
/* compiled from: DownloadSettingsEntry.kt */
public final class DownloadSettingsEntryKt {
    public static final DownloadSettings fromEntry(DownloadSettingsEntry downloadSettingsEntry) {
        DownloadSettings downloadSettings = new DownloadSettings(downloadSettingsEntry.getWifiOnly(), downloadSettingsEntry.getChargingOnly(), downloadSettingsEntry.getBatteryNotLow(), downloadSettingsEntry.getStorageNotLow(), downloadSettingsEntry.getConcurrentDownloads());
        return downloadSettings;
    }
}
