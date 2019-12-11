package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.plugin.Extension;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/TransactionProviderExtension;", "Lcom/bamtech/sdk4/plugin/Extension;", "instance", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "(Ljavax/inject/Provider;)V", "getInstance", "()Ljavax/inject/Provider;", "sdk-plugin-api"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultExtensions.kt */
public final class TransactionProviderExtension implements Extension {
    private final Provider<ServiceTransaction> instance;

    public TransactionProviderExtension(Provider<ServiceTransaction> provider) {
        this.instance = provider;
    }

    public final Provider<ServiceTransaction> getInstance() {
        return this.instance;
    }
}
