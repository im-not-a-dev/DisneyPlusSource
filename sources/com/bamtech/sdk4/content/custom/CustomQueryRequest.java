package com.bamtech.sdk4.content.custom;

import com.bamtech.sdk4.content.GraphQlResponseConverter;
import kotlin.Metadata;
import okhttp3.HttpUrl.Builder;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/CustomQueryRequest;", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "context", "", "query", "Lcom/bamtech/sdk4/content/custom/GraphQlQuery;", "(Ljava/lang/String;Lcom/bamtech/sdk4/content/custom/GraphQlQuery;)V", "operationName", "variables", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "createPostContent", "converter", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "updateQueryParameters", "", "builder", "Lokhttp3/HttpUrl$Builder;", "Companion", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CustomQueryRequest.kt */
public abstract class CustomQueryRequest extends GraphQlRequest {
    private static final String QUERY = QUERY;
    private final String query;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/CustomQueryRequest$Companion;", "", "()V", "QUERY", "", "getQUERY$extension_content", "()Ljava/lang/String;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: CustomQueryRequest.kt */
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

    public CustomQueryRequest(String str, String str2, String str3, Object obj) {
        super(str, str3, obj);
        this.query = str2;
    }

    public String createPostContent(GraphQlResponseConverter graphQlResponseConverter) {
        return graphQlResponseConverter.serialize(new GraphQlQuery(this.query, getOperationName(), getVariables()));
    }

    public void updateQueryParameters(Builder builder, GraphQlResponseConverter graphQlResponseConverter) {
        builder.mo35770a(QUERY, this.query);
        super.updateQueryParameters(builder, graphQlResponseConverter);
    }
}
