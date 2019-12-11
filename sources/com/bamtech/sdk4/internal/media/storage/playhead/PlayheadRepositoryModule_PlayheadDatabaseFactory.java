package com.bamtech.sdk4.internal.media.storage.playhead;

import android.content.Context;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class PlayheadRepositoryModule_PlayheadDatabaseFactory implements C2111c<PlayheadDatabase> {
    private final Provider<Context> contextProvider;

    public PlayheadRepositoryModule_PlayheadDatabaseFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static PlayheadRepositoryModule_PlayheadDatabaseFactory create(Provider<Context> provider) {
        return new PlayheadRepositoryModule_PlayheadDatabaseFactory(provider);
    }

    public PlayheadDatabase get() {
        return PlayheadRepositoryModule.playheadDatabase((Context) this.contextProvider.get());
    }
}
