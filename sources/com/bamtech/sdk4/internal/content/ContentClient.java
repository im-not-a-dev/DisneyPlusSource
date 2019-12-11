package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014JX\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH&Jl\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\u0003\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH&¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/content/ContentClient;", "", "query", "Lio/reactivex/Single;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "templateMap", "", "request", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "optionalHeaders", "", "Lcom/bamtech/sdk4/internal/content/OptionalHeaderTemplate;", "customHeaders", "typedQuery", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/reflect/Type;", "Companion", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
public interface ContentClient {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/content/ContentClient$Companion;", "", "()V", "X_DELORIAN_HEADER", "", "getX_DELORIAN_HEADER", "()Ljava/lang/String;", "X_DELORIAN_TEMPLATE", "getX_DELORIAN_TEMPLATE", "X_GEO_OVERRIDE_HEADER", "getX_GEO_OVERRIDE_HEADER", "X_GEO_OVERRIDE_TEMPLATE", "getX_GEO_OVERRIDE_TEMPLATE", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ContentClient.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String X_DELORIAN_HEADER = X_DELORIAN_HEADER;
        private static final String X_DELORIAN_TEMPLATE = X_DELORIAN_TEMPLATE;
        private static final String X_GEO_OVERRIDE_HEADER = X_GEO_OVERRIDE_HEADER;
        private static final String X_GEO_OVERRIDE_TEMPLATE = X_GEO_OVERRIDE_TEMPLATE;

        private Companion() {
        }

        public final String getX_DELORIAN_HEADER() {
            return X_DELORIAN_HEADER;
        }

        public final String getX_DELORIAN_TEMPLATE() {
            return X_DELORIAN_TEMPLATE;
        }

        public final String getX_GEO_OVERRIDE_HEADER() {
            return X_GEO_OVERRIDE_HEADER;
        }

        public final String getX_GEO_OVERRIDE_TEMPLATE() {
            return X_GEO_OVERRIDE_TEMPLATE;
        }
    }

    Single<String> query(ServiceTransaction serviceTransaction, Map<String, String> map, GraphQlRequest graphQlRequest, List<OptionalHeaderTemplate> list, Map<String, String> map2);

    <T> Single<GraphQlResponse<T>> typedQuery(ServiceTransaction serviceTransaction, Map<String, String> map, GraphQlRequest graphQlRequest, Type type, List<OptionalHeaderTemplate> list, Map<String, String> map2);
}
