package com.bamtech.sdk4.content.custom;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.content.ContentException;
import com.bamtech.sdk4.content.GraphQlResponseConverter;
import com.bamtech.sdk4.content.custom.GraphQlRequestBuilder.Base;
import com.bamtech.sdk4.internal.configuration.ContentExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "", "context", "", "operationName", "variables", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getContext", "()Ljava/lang/String;", "getOperationName", "getVariables", "()Ljava/lang/Object;", "createPostContent", "converter", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "createQueryUrl", "Lcom/bamtech/core/networking/Link;", "link", "method", "extras", "Lcom/bamtech/sdk4/internal/configuration/ContentExtras;", "prepareUrl", "url", "updateQueryParameters", "", "builder", "Lokhttp3/HttpUrl$Builder;", "Companion", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlRequest.kt */
public abstract class GraphQlRequest {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final String GET = GET;
    public static final String OPERATION_NAME = "operationName";
    /* access modifiers changed from: private */
    public static final String POST = POST;
    public static final String VARIABLES = "variables";
    private final String context;
    private final String operationName;
    private final Object variables;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/GraphQlRequest$Companion;", "", "()V", "GET", "", "getGET", "()Ljava/lang/String;", "OPERATION_NAME", "POST", "getPOST", "VARIABLES", "builder", "Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder;", "context", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: GraphQlRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public final GraphQlRequestBuilder builder(String str) {
            return new Base(str);
        }

        public final String getGET() {
            return GraphQlRequest.GET;
        }

        public final String getPOST() {
            return GraphQlRequest.POST;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GraphQlRequest(String str, String str2, Object obj) {
        this.context = str;
        this.operationName = str2;
        this.variables = obj;
    }

    public static final GraphQlRequestBuilder builder(String str) {
        return Companion.builder(str);
    }

    public abstract String createPostContent(GraphQlResponseConverter graphQlResponseConverter);

    public final Link createQueryUrl(Link link, String str, GraphQlResponseConverter graphQlResponseConverter, ContentExtras contentExtras) {
        HttpUrl e = HttpUrl.m44643e(prepareUrl(link.getHref(), contentExtras));
        if (e != null) {
            Builder i = e.mo35758i();
            if (C12880j.m40224a((Object) str, (Object) GET)) {
                C12880j.m40222a((Object) i, "httpBuilder");
                updateQueryParameters(i, graphQlResponseConverter);
            } else if (!C12880j.m40224a((Object) str, (Object) POST)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Method: ");
                sb.append(str);
                sb.append(" not supported, only GET and POST are supported");
                throw new ContentException(sb.toString());
            }
            return link.updateTemplates(C13173j0.m40350a(), i.mo35772a().toString()).toLinkBuilder().mo7438c(str).mo7432a();
        }
        C12880j.m40220a();
        throw null;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getOperationName() {
        return this.operationName;
    }

    public final Object getVariables() {
        return this.variables;
    }

    public String prepareUrl(String str, ContentExtras contentExtras) {
        return str;
    }

    public void updateQueryParameters(Builder builder, GraphQlResponseConverter graphQlResponseConverter) {
        Object obj = this.variables;
        if (obj != null) {
            builder.mo35770a(VARIABLES, graphQlResponseConverter.serialize(obj));
        }
        String str = this.operationName;
        if (str != null) {
            builder.mo35770a(OPERATION_NAME, str);
        }
    }

    public /* synthetic */ GraphQlRequest(String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        this(str, str2, obj);
    }
}
