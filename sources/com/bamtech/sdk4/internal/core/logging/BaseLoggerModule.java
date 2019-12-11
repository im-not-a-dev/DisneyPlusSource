package com.bamtech.sdk4.internal.core.logging;

import com.bamtech.core.logging.DefaultLogger;
import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.core.logging.LogSink;
import com.bamtech.core.logging.LogSink.Collection;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.google.common.base.Optional;
import java.util.Iterator;
import kotlin.Metadata;
import p520io.reactivex.C11968q;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/core/logging/BaseLoggerModule;", "", "()V", "logDispatcher", "Lcom/bamtech/core/logging/LogDispatcher;", "logger", "Lcom/bamtech/core/logging/DefaultLogger;", "logPublisher", "Lcom/bamtech/core/logging/LogPublisher;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "sinks", "Lcom/google/common/base/Optional;", "Lcom/bamtech/core/logging/LogSink$Collection;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BaseLoggerModule.kt */
public final class BaseLoggerModule {
    public final LogDispatcher logDispatcher(DefaultLogger defaultLogger) {
        return defaultLogger;
    }

    public final DefaultLogger logger(BootstrapConfiguration bootstrapConfiguration, Optional<Collection> optional) {
        DefaultLogger defaultLogger = new DefaultLogger(bootstrapConfiguration.getDebugEnabled());
        Collection collection = (Collection) optional.mo27107c();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                defaultLogger.watch().mo30162a((C11968q<? super T>) (LogSink) it.next());
            }
        }
        return defaultLogger;
    }
}
