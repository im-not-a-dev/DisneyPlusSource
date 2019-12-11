package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.Map;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/Configuration;", "", "commonHeaders", "", "", "services", "Lcom/bamtech/sdk4/internal/configuration/Services;", "(Ljava/util/Map;Lcom/bamtech/sdk4/internal/configuration/Services;)V", "getCommonHeaders", "()Ljava/util/Map;", "location", "Lcom/bamtech/sdk4/internal/configuration/LocationConfiguration;", "getLocation", "()Lcom/bamtech/sdk4/internal/configuration/LocationConfiguration;", "getServices", "()Lcom/bamtech/sdk4/internal/configuration/Services;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Configuration.kt */
public final class Configuration {
    private final Map<String, String> commonHeaders;
    private final Services services;

    public Configuration() {
        this(null, null, 3, null);
    }

    public Configuration(Map<String, String> map, Services services2) {
        this.commonHeaders = map;
        this.services = services2;
    }

    public final Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public final LocationConfiguration getLocation() {
        return new LocationConfiguration();
    }

    public final Services getServices() {
        return this.services;
    }

    public /* synthetic */ Configuration(Map map, Services services2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            map = C13173j0.m40350a();
        }
        if ((i & 2) != 0) {
            services2 = new Services();
        }
        this(map, services2);
    }
}
