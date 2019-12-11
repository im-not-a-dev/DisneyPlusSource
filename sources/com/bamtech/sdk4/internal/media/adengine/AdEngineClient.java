package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/AdEngineClient;", "", "updateCookies", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "payload", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineClient.kt */
public interface AdEngineClient {
    Completable updateCookies(ServiceTransaction serviceTransaction, Map<String, String> map, Map<String, String> map2);
}
