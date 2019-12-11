package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.PlaybackSession;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class PlaybackSessionModule_SessionFactory implements C2111c<PlaybackSession> {
    public static PlaybackSession proxySession(PlaybackSessionModule playbackSessionModule, DefaultPlaybackSession defaultPlaybackSession) {
        PlaybackSession session = playbackSessionModule.session(defaultPlaybackSession);
        C2113e.m8178a(session, "Cannot return null from a non-@Nullable @Provides method");
        return session;
    }
}
