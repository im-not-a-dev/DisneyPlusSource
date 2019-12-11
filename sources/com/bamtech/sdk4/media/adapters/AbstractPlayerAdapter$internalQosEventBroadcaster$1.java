package com.bamtech.sdk4.media.adapters;

import com.bamtech.sdk4.media.BaseQosClientData;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo31007d2 = {"com/bamtech/sdk4/media/adapters/AbstractPlayerAdapter$internalQosEventBroadcaster$1", "Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "onEvent", "", "event", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AbstractPlayerAdapter.kt */
public final class AbstractPlayerAdapter$internalQosEventBroadcaster$1 implements QOSPlaybackEventListener {
    final /* synthetic */ AbstractPlayerAdapter this$0;

    AbstractPlayerAdapter$internalQosEventBroadcaster$1(AbstractPlayerAdapter abstractPlayerAdapter) {
        this.this$0 = abstractPlayerAdapter;
    }

    public void onEvent(BaseQosClientData baseQosClientData) {
        for (QOSPlaybackEventListener onEvent : C13199w.m40606q(this.this$0.listenersQOS)) {
            onEvent.onEvent(baseQosClientData);
        }
    }
}
