package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.sdk4.internal.media.OnlineMediaItem;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo31007d2 = {"parseTrackingData", "Lcom/bamtech/sdk4/internal/media/adengine/AdEngineTrackingData;", "Lcom/bamtech/sdk4/internal/media/OnlineMediaItem;", "sdk-core-api_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineTrackingData.kt */
public final class AdEngineTrackingDataKt {
    public static final AdEngineTrackingData parseTrackingData(OnlineMediaItem onlineMediaItem) {
        Map e = C13173j0.m40365e(onlineMediaItem.getAdEngineData());
        return new AdEngineTrackingData(e, (String) e.remove("cdn"), (String) e.remove("corigin"), (String) e.remove("ssess"));
    }
}
