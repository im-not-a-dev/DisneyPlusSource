package com.bamtechmedia.dominguez.offline;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/offline/StreamingPreferences;", "Lcom/bamtechmedia/dominguez/offline/StoragePreference;", "cellularDataUsagePreference", "Lcom/bamtechmedia/dominguez/offline/StreamingPreferences$CellularDataPreference;", "getCellularDataUsagePreference", "()Lcom/bamtechmedia/dominguez/offline/StreamingPreferences$CellularDataPreference;", "wifiOnlyPlaybackPreference", "", "getWifiOnlyPlaybackPreference", "()Z", "CellularDataPreference", "offlineApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: StreamingPreferences.kt */
public interface StreamingPreferences extends C6248f {

    @Keep
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/offline/StreamingPreferences$CellularDataPreference;", "", "(Ljava/lang/String;I)V", "AUTO", "DATA_SAVER", "WIFI_ONLY", "offlineApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: StreamingPreferences.kt */
    public enum CellularDataPreference {
        AUTO,
        DATA_SAVER,
        WIFI_ONLY
    }

    /* renamed from: b */
    CellularDataPreference mo18832b();
}
