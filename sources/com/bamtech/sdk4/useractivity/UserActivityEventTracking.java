package com.bamtech.sdk4.useractivity;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/UserActivityEventTracking;", "", "schemataProvider", "Lcom/bamtech/sdk4/useractivity/EventSchemataProvider;", "getSchemataProvider", "()Lcom/bamtech/sdk4/useractivity/EventSchemataProvider;", "trackingParameters", "", "", "getTrackingParameters", "()Ljava/util/Map;", "trackEvent", "Lio/reactivex/Completable;", "event", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent;", "parameters", "", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserActivityApi.kt */
public interface UserActivityEventTracking {
    EventSchemataProvider getSchemataProvider();

    Map<String, Object> getTrackingParameters();

    Completable trackEvent(GlimpseEvent glimpseEvent, Map<String, ? extends Object> map);
}
