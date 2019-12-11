package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class PlaybackSessionModule_PlayerAdapterFactory implements C2111c<AbstractPlayerAdapter> {
    public static AbstractPlayerAdapter proxyPlayerAdapter(PlaybackSessionModule playbackSessionModule) {
        AbstractPlayerAdapter playerAdapter = playbackSessionModule.playerAdapter();
        C2113e.m8178a(playerAdapter, "Cannot return null from a non-@Nullable @Provides method");
        return playerAdapter;
    }
}
