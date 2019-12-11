package com.bamtech.sdk4.useractivity;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ.\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH\u0016J&\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120 H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtech/sdk4/useractivity/DefaultUserActivityApi;", "Lcom/bamtech/sdk4/useractivity/UserActivityApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Lcom/bamtech/sdk4/internal/service/ServiceTransactionProvider;", "glimpseBuffer", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "dustClientConstants", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;)V", "schemataProvider", "Lcom/bamtech/sdk4/useractivity/EventSchemataProvider;", "getSchemataProvider", "()Lcom/bamtech/sdk4/useractivity/EventSchemataProvider;", "trackingParameters", "", "", "", "getTrackingParameters", "()Ljava/util/Map;", "sendContentReward", "Lio/reactivex/Completable;", "rewardToken", "contentId", "action", "recommendedContentIds", "", "trackEvent", "event", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent;", "parameters", "", "plugin-user-activity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserActivityApi.kt */
public final class DefaultUserActivityApi implements UserActivityApi {
    /* access modifiers changed from: private */
    public final DustClientConstants dustClientConstants;
    /* access modifiers changed from: private */
    public final EventBuffer glimpseBuffer;
    private final EventSchemataProvider schemataProvider = new DefaultEventSchemataProvider();
    private final Map<String, Object> trackingParameters = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Provider<ServiceTransaction> transactionProvider;

    public DefaultUserActivityApi(Provider<ServiceTransaction> provider, EventBuffer eventBuffer, DustClientConstants dustClientConstants2) {
        this.transactionProvider = provider;
        this.glimpseBuffer = eventBuffer;
        this.dustClientConstants = dustClientConstants2;
    }

    public EventSchemataProvider getSchemataProvider() {
        return this.schemataProvider;
    }

    public Map<String, Object> getTrackingParameters() {
        return this.trackingParameters;
    }

    public Completable trackEvent(GlimpseEvent glimpseEvent, Map<String, ? extends Object> map) {
        Completable c = Completable.m38166c((C11945a) new DefaultUserActivityApi$trackEvent$1(this, map, glimpseEvent));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "Completable.fromAction {…      payload))\n        }");
        return c;
    }
}
