package com.bamtech.sdk4.internal.service;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/service/ServiceTransactionModule;", "", "()V", "Companion", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceTransactionModule.kt */
public final class ServiceTransactionModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/service/ServiceTransactionModule$Companion;", "", "()V", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "default", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/DefaultServiceTransaction;", "debug", "Lcom/bamtech/sdk4/internal/service/DebugServiceTransaction;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceTransactionModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ServiceTransaction transaction(BootstrapConfiguration bootstrapConfiguration, Provider<DefaultServiceTransaction> provider, Provider<DebugServiceTransaction> provider2) {
            if (bootstrapConfiguration.getDebugEnabled()) {
                Object obj = provider2.get();
                Intrinsics.checkReturnedValueIsNotNull(obj, "debug.get()");
                return (ServiceTransaction) obj;
            }
            Object obj2 = provider.get();
            Intrinsics.checkReturnedValueIsNotNull(obj2, "default.get()");
            return (ServiceTransaction) obj2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final ServiceTransaction transaction(BootstrapConfiguration bootstrapConfiguration, Provider<DefaultServiceTransaction> provider, Provider<DebugServiceTransaction> provider2) {
        return Companion.transaction(bootstrapConfiguration, provider, provider2);
    }
}
