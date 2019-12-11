package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceConfiguration.kt */
public interface ServiceConfiguration {
    ServiceClientDefinition getClient();

    ServiceExtras getExtras();
}
