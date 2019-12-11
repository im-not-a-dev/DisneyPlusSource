package com.bamtech.sdk4.content.custom;

import com.bamtech.sdk4.content.GraphQlResponseConverter;
import com.bamtech.sdk4.internal.configuration.ContentExtras;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/PersistedQueryRequest;", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "context", "", "persistedQuery", "Lcom/bamtech/sdk4/content/custom/GraphQlPersistedQuery;", "(Ljava/lang/String;Lcom/bamtech/sdk4/content/custom/GraphQlPersistedQuery;)V", "queryId", "operationName", "variables", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "createPostContent", "converter", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "prepareUrl", "url", "extras", "Lcom/bamtech/sdk4/internal/configuration/ContentExtras;", "Companion", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PersistedQueryRequest.kt */
public abstract class PersistedQueryRequest extends GraphQlRequest {
    private static final String QUERY_ID = QUERY_ID;
    private final String queryId;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/PersistedQueryRequest$Companion;", "", "()V", "QUERY_ID", "", "getQUERY_ID$extension_content", "()Ljava/lang/String;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PersistedQueryRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public PersistedQueryRequest(String str, String str2, String str3, Object obj) {
        super(str, str3, obj);
        this.queryId = str2;
    }

    public String createPostContent(GraphQlResponseConverter graphQlResponseConverter) {
        return graphQlResponseConverter.serialize(new GraphQlPersistedQuery(this.queryId, getOperationName(), getVariables()));
    }

    public String prepareUrl(String str, ContentExtras contentExtras) {
        return C12832w.m40117a(str, QUERY_ID, contentExtras.getQueryIdValue(this.queryId), false, 4, (Object) null);
    }
}
