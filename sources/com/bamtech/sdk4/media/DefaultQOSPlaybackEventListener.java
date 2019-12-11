package com.bamtech.sdk4.media;

import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.EventBuffer.DefaultImpls;
import com.bamtech.sdk4.internal.telemetry.dust.DefaultDustClientData;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.media.adapters.QOSPlaybackEventListener;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "Lcom/bamtech/sdk4/media/adapters/QOSPlaybackEventListener;", "eventBuffer", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "dustConstants", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "(Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;)V", "getDustConstants", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "getEventBuffer", "()Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "onEvent", "", "event", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: QOSEvent.kt */
public final class DefaultQOSPlaybackEventListener implements QOSPlaybackEventListener {
    public static final Companion Companion = new Companion(null);
    private final DustClientConstants dustConstants;
    private final EventBuffer eventBuffer;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener$Companion;", "", "()V", "getString", "", "event", "Lcom/bamtech/sdk4/media/BaseQosClientData;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: QOSEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getString(BaseQosClientData baseQosClientData) {
            if (baseQosClientData instanceof MediaPayloadFetchedEventData) {
                return "urn:dss:event:fed:media:payload:fetched";
            }
            if (baseQosClientData instanceof PlaybackEndedEventData) {
                return "urn:dss:event:fed:media:playback:ended";
            }
            if (baseQosClientData instanceof PlaybackInitializedEventData) {
                return "urn:dss:event:fed:media:playback:initialized";
            }
            if (baseQosClientData instanceof PlaybackPausedEventData) {
                return "urn:dss:event:fed:media:playback:paused";
            }
            if (baseQosClientData instanceof PlaybackReadyEventData) {
                return "urn:dss:event:fed:media:playback:ready";
            }
            if (baseQosClientData instanceof PlaybackResumedEventData) {
                return "urn:dss:event:fed:media:playback:resumed";
            }
            if (baseQosClientData instanceof PlaybackSampledEventData) {
                return "urn:dss:event:fed:media:playback:sampled";
            }
            if (baseQosClientData instanceof PlaybackSeekedEventData) {
                return "urn:dss:event:fed:media:playback:seeked";
            }
            if (baseQosClientData instanceof PlaybackSelectedEventData) {
                return "urn:dss:event:fed:media:playback:requested";
            }
            if (baseQosClientData instanceof PlaybackSessionTransferredEventData) {
                return "urn:dss:event:fed:media:session:playback:transferred";
            }
            if (baseQosClientData instanceof PlaybackStartedEventData) {
                return "urn:dss:event:fed:media:playback:started";
            }
            if (baseQosClientData instanceof RebufferingStartedEventData) {
                return "urn:dss:event:fed:media:playback:rebuffering:started";
            }
            if (baseQosClientData instanceof RebufferingEndedEventData) {
                return "urn:dss:event:fed:media:playback:rebuffering:ended";
            }
            if (baseQosClientData instanceof AudioChangedEventData) {
                return "urn:dss:event:fed:media:playback:audio:changed";
            }
            if (baseQosClientData instanceof BitrateChangedEventData) {
                return "urn:dss:event:fed:media:playback:bitrate:changed";
            }
            if (baseQosClientData instanceof MasterPlaylistFetchedEventData) {
                return "urn:dss:event:fed:media:playlist:master:fetched";
            }
            if (baseQosClientData instanceof MediaSegmentFetchedEventData) {
                return "urn:dss:event:fed:media:segment:fetched";
            }
            if (baseQosClientData instanceof SubtitleChangedEventData) {
                return "urn:dss:event:fed:media:playback:subtitle:changed";
            }
            return baseQosClientData instanceof VariantPlaylistFetchedEventData ? "urn:dss:event:fed:media:playlist:variant:fetched" : "";
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultQOSPlaybackEventListener(EventBuffer eventBuffer2, DustClientConstants dustClientConstants) {
        this.eventBuffer = eventBuffer2;
        this.dustConstants = dustClientConstants;
    }

    public void onEvent(BaseQosClientData baseQosClientData) {
        if (baseQosClientData.getPlaybackSessionId() != null) {
            String string = Companion.getString(baseQosClientData);
            EventBuffer eventBuffer2 = this.eventBuffer;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkReturnedValueIsNotNull((Object) randomUUID, "UUID.randomUUID()");
            DefaultDustClientData defaultDustClientData = new DefaultDustClientData(randomUUID, string, "urn:bamtech:dust:bamsdk:event:qos", baseQosClientData, this.dustConstants);
            DefaultImpls.postEvent$default(eventBuffer2, new QOSEvent(null, defaultDustClientData), null, 2, null);
        }
    }
}
