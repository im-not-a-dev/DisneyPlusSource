package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/AdEngineManager;", "", "constructAdEnginePayload", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/media/adengine/AdEnginePayload;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "adEngineTrackingData", "Lcom/bamtech/sdk4/internal/media/adengine/AdEngineTrackingData;", "updateCookies", "Lio/reactivex/Completable;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineManager.kt */
public interface AdEngineManager {
    Completable updateCookies(ServiceTransaction serviceTransaction, AdEngineTrackingData adEngineTrackingData);
}
