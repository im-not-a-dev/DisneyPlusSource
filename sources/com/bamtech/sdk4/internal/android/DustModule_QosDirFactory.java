package com.bamtech.sdk4.internal.android;

import android.app.Application;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import java.io.File;
import javax.inject.Provider;

public final class DustModule_QosDirFactory implements C2111c<File> {
    private final Provider<Application> applicationProvider;
    private final DustModule module;

    public DustModule_QosDirFactory(DustModule dustModule, Provider<Application> provider) {
        this.module = dustModule;
        this.applicationProvider = provider;
    }

    public static DustModule_QosDirFactory create(DustModule dustModule, Provider<Application> provider) {
        return new DustModule_QosDirFactory(dustModule, provider);
    }

    public File get() {
        File qosDir = this.module.qosDir((Application) this.applicationProvider.get());
        C2113e.m8178a(qosDir, "Cannot return null from a non-@Nullable @Provides method");
        return qosDir;
    }
}
