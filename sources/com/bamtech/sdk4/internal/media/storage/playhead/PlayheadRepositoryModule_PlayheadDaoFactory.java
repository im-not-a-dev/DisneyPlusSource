package com.bamtech.sdk4.internal.media.storage.playhead;

import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class PlayheadRepositoryModule_PlayheadDaoFactory implements C2111c<PlayheadDao> {
    private final Provider<PlayheadDatabase> dbProvider;

    public PlayheadRepositoryModule_PlayheadDaoFactory(Provider<PlayheadDatabase> provider) {
        this.dbProvider = provider;
    }

    public static PlayheadRepositoryModule_PlayheadDaoFactory create(Provider<PlayheadDatabase> provider) {
        return new PlayheadRepositoryModule_PlayheadDaoFactory(provider);
    }

    public PlayheadDao get() {
        return PlayheadRepositoryModule.playheadDao((PlayheadDatabase) this.dbProvider.get());
    }
}
