package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ConfigurationClient;", "", "getConfiguration", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "link", "Lcom/bamtech/core/networking/Link;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationClient.kt */
public interface ConfigurationClient {
    Single<Configuration> getConfiguration(ServiceTransaction serviceTransaction, Link link);
}
