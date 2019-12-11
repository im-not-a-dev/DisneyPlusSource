package com.bamtech.sdk4.internal.core.logging;

import com.bamtech.core.logging.DefaultLogger;
import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class BaseLoggerModule_LogDispatcherFactory implements C2111c<LogDispatcher> {
    private final Provider<DefaultLogger> loggerProvider;
    private final BaseLoggerModule module;

    public BaseLoggerModule_LogDispatcherFactory(BaseLoggerModule baseLoggerModule, Provider<DefaultLogger> provider) {
        this.module = baseLoggerModule;
        this.loggerProvider = provider;
    }

    public static BaseLoggerModule_LogDispatcherFactory create(BaseLoggerModule baseLoggerModule, Provider<DefaultLogger> provider) {
        return new BaseLoggerModule_LogDispatcherFactory(baseLoggerModule, provider);
    }

    public LogDispatcher get() {
        LogDispatcher logDispatcher = this.module.logDispatcher((DefaultLogger) this.loggerProvider.get());
        C2113e.m8178a(logDispatcher, "Cannot return null from a non-@Nullable @Provides method");
        return logDispatcher;
    }
}
