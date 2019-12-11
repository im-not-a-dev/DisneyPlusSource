package com.bamtech.sdk4.media;

import com.bamtech.sdk4.media.adapters.PlayerAdapter;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackSessionProvider;", "", "createPlaybackSession", "Lcom/bamtech/sdk4/media/PlaybackSession;", "playerAdapter", "Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackSessionProvider.kt */
public interface PlaybackSessionProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackSessionProvider$Companion;", "", "()V", "MEDIA_API_FETCH", "", "getMEDIA_API_FETCH", "()Ljava/lang/String;", "MEDIA_API_PREPARE", "getMEDIA_API_PREPARE", "MEDIA_API_RELEASE", "getMEDIA_API_RELEASE", "MEDIA_API_SET_SOURCE", "getMEDIA_API_SET_SOURCE", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PlaybackSessionProvider.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final String getMEDIA_API_FETCH() {
            return "urn:bamtech:dust:bamsdk:api:media:playbackSession:fetch";
        }

        public final String getMEDIA_API_PREPARE() {
            return "urn:bamtech:dust:bamsdk:api:media:playbackSession:prepare";
        }

        public final String getMEDIA_API_RELEASE() {
            return "urn:bamtech:dust:bamsdk:api:media:playbackSession:release";
        }

        public final String getMEDIA_API_SET_SOURCE() {
            return "urn:bamtech:dust:bamsdk:api:media:playerAdapter:setSource";
        }
    }

    PlaybackSession createPlaybackSession(PlayerAdapter playerAdapter);
}
