package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/configuration/LocationConfiguration;", "it", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationProvider.kt */
final class DefaultConfigurationProvider$getLocationConfiguration$1<T, R> implements Function<T, R> {
    public static final DefaultConfigurationProvider$getLocationConfiguration$1 INSTANCE = new DefaultConfigurationProvider$getLocationConfiguration$1();

    DefaultConfigurationProvider$getLocationConfiguration$1() {
    }

    public final LocationConfiguration apply(Configuration configuration) {
        return configuration.getLocation();
    }
}
