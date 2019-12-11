package com.bamtech.sdk4.useractivity;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.EventBuffer.DefaultImpls;
import com.bamtech.sdk4.useractivity.internal.UserActivityDustEvent;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: UserActivityApi.kt */
final class DefaultUserActivityApi$trackEvent$1 implements C11945a {
    final /* synthetic */ GlimpseEvent $event;
    final /* synthetic */ Map $parameters;
    final /* synthetic */ DefaultUserActivityApi this$0;

    DefaultUserActivityApi$trackEvent$1(DefaultUserActivityApi defaultUserActivityApi, Map map, GlimpseEvent glimpseEvent) {
        this.this$0 = defaultUserActivityApi;
        this.$parameters = map;
        this.$event = glimpseEvent;
    }

    public final void run() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.this$0.transactionProvider.get();
        String str = "urn:bamtech:dust:bamsdk:event:glimpse";
        DefaultImpls.postEvent$default(this.this$0.glimpseBuffer, UserActivityDustEvent.Companion.generateEvent(this.$event.getEventUrn(), str, this.this$0.dustClientConstants, serviceTransaction.getId(), this.this$0.getSchemataProvider().getSchemata(this.$event).generateEventPayload(C13173j0.m40353a(this.this$0.getTrackingParameters(), this.$parameters))), null, 2, null);
    }
}
