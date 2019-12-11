package com.bamtech.sdk4.internal.android;

import com.bamtech.core.logging.LogSink.Collection;
import com.bamtech.sdk4.internal.android.sinks.BamLogcatLogSink;
import com.bamtech.sdk4.internal.android.sinks.DustLogSink;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class AndroidLoggerModule_SinksFactory implements C2111c<Collection> {
    private final Provider<DustLogSink> dustLogSinkProvider;
    private final Provider<BamLogcatLogSink> logcatSinkProvider;
    private final AndroidLoggerModule module;

    public AndroidLoggerModule_SinksFactory(AndroidLoggerModule androidLoggerModule, Provider<BamLogcatLogSink> provider, Provider<DustLogSink> provider2) {
        this.module = androidLoggerModule;
        this.logcatSinkProvider = provider;
        this.dustLogSinkProvider = provider2;
    }

    public static AndroidLoggerModule_SinksFactory create(AndroidLoggerModule androidLoggerModule, Provider<BamLogcatLogSink> provider, Provider<DustLogSink> provider2) {
        return new AndroidLoggerModule_SinksFactory(androidLoggerModule, provider, provider2);
    }

    public Collection get() {
        Collection sinks = this.module.sinks((BamLogcatLogSink) this.logcatSinkProvider.get(), (DustLogSink) this.dustLogSinkProvider.get());
        C2113e.m8178a(sinks, "Cannot return null from a non-@Nullable @Provides method");
        return sinks;
    }
}
