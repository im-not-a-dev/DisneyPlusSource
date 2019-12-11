package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.core.networking.Headers;
import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.service.IllegalArgumentException;
import java.util.Map;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "", "()V", "baseUrl", "", "endpoints", "", "Lcom/bamtech/core/networking/Link;", "(Ljava/lang/String;Ljava/util/Map;)V", "getBaseUrl", "()Ljava/lang/String;", "headers", "Lcom/bamtech/core/networking/Headers;", "getHeaders", "()Lcom/bamtech/core/networking/Headers;", "setHeaders", "(Lcom/bamtech/core/networking/Headers;)V", "containsKey", "", "key", "getLink", "getLinkProperties", "Companion", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceClientDefinition.kt */
public class ServiceClientDefinition {
    public static final String BAD_CONFIG_KEY_CODE = "bad.config.key";
    public static final Companion Companion = new Companion(null);
    public static final String MISSING_URL_CODE = "missing.url.from.config";
    public static final String MISSING_URL_DESCRIPTION = "Unable to prepare the url because the url is missing.  Please contact support for assistance.";
    private final String baseUrl;
    private final Map<String, Link> endpoints;
    private Headers headers;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition$Companion;", "", "()V", "BAD_CONFIG_KEY_CODE", "", "MISSING_URL_CODE", "MISSING_URL_DESCRIPTION", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceClientDefinition.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ServiceClientDefinition(String str, Map<String, Link> map) {
        this.baseUrl = str;
        this.endpoints = map;
        this.headers = new Headers();
    }

    public final boolean containsKey(String str) {
        return this.endpoints.containsKey(str);
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final Link getLink(String str) {
        Link link = (Link) this.endpoints.get(str);
        if (link == null || link.getHref() == null) {
            throw IllegalArgumentException.Companion.init(MISSING_URL_CODE, MISSING_URL_DESCRIPTION);
        }
        Link withHeaders = link.withHeaders(this.headers);
        if (withHeaders != null) {
            return withHeaders;
        }
        com.bamtech.sdk4.service.IllegalArgumentException.Companion companion = IllegalArgumentException.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" is not a valid endpoint key");
        throw companion.init(BAD_CONFIG_KEY_CODE, sb.toString());
    }

    public final Link getLinkProperties(String str) {
        Link link = (Link) this.endpoints.get(str);
        if (link != null) {
            return link.withHeaders(this.headers);
        }
        return null;
    }

    public final void setHeaders(Headers headers2) {
        this.headers = headers2;
    }

    public ServiceClientDefinition() {
        this("", C13173j0.m40350a());
    }
}
