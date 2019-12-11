package com.bamtech.sdk4.content.custom;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.content.ContentException;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0001\u0003\u0019\u0015\u0012¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder;", "", "context", "", "(Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "operationName", "getOperationName", "setOperationName", "variables", "getVariables", "()Ljava/lang/Object;", "setVariables", "(Ljava/lang/Object;)V", "build", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "persistedQueryId", "Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder$Persisted;", "queryId", "query", "Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder$Custom;", "Base", "Custom", "Persisted", "Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder$Base;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlRequestBuilder.kt */
public abstract class GraphQlRequestBuilder {
    private final String context;
    private String operationName;
    private Object variables;

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder$Base;", "Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder;", "context", "", "(Ljava/lang/String;)V", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: GraphQlRequestBuilder.kt */
    public static final class Base extends GraphQlRequestBuilder {
        public Base(String str) {
            super(str, null);
        }
    }

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder$Custom;", "Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder;", "context", "", "query", "(Ljava/lang/String;Ljava/lang/String;)V", "build", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: GraphQlRequestBuilder.kt */
    public static final class Custom extends GraphQlRequestBuilder {
        private final String query;

        public Custom(String str, String str2) {
            super(str, null);
            this.query = str2;
        }

        public GraphQlRequest build() {
            GraphQlRequestBuilder$Custom$build$1 graphQlRequestBuilder$Custom$build$1 = new GraphQlRequestBuilder$Custom$build$1(this, getContext(), this.query, getOperationName(), getVariables());
            return graphQlRequestBuilder$Custom$build$1;
        }
    }

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder$Persisted;", "Lcom/bamtech/sdk4/content/custom/GraphQlRequestBuilder;", "context", "", "queryId", "(Ljava/lang/String;Ljava/lang/String;)V", "build", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: GraphQlRequestBuilder.kt */
    public static final class Persisted extends GraphQlRequestBuilder {
        private final String queryId;

        public Persisted(String str, String str2) {
            super(str, null);
            this.queryId = str2;
        }

        public GraphQlRequest build() {
            GraphQlRequestBuilder$Persisted$build$1 graphQlRequestBuilder$Persisted$build$1 = new GraphQlRequestBuilder$Persisted$build$1(this, getContext(), this.queryId, getOperationName(), getVariables());
            return graphQlRequestBuilder$Persisted$build$1;
        }
    }

    private GraphQlRequestBuilder(String str) {
        this.context = str;
    }

    public GraphQlRequest build() {
        throw new ContentException("Invalid builder state. Must call `query()` or `persistedQueryId()` prior to `build()`");
    }

    /* access modifiers changed from: protected */
    public final String getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public final String getOperationName() {
        return this.operationName;
    }

    /* access modifiers changed from: protected */
    public final Object getVariables() {
        return this.variables;
    }

    public final GraphQlRequestBuilder operationName(String str) {
        this.operationName = str;
        return this;
    }

    public final Persisted persistedQueryId(String str) {
        Persisted persisted = new Persisted(this.context, str);
        persisted.setVariables(this.variables);
        persisted.setOperationName(this.operationName);
        return persisted;
    }

    public final Custom query(String str) {
        Custom custom = new Custom(this.context, str);
        custom.setVariables(this.variables);
        custom.setOperationName(this.operationName);
        return custom;
    }

    /* access modifiers changed from: protected */
    public final void setOperationName(String str) {
        this.operationName = str;
    }

    /* access modifiers changed from: protected */
    public final void setVariables(Object obj) {
        this.variables = obj;
    }

    public final GraphQlRequestBuilder variables(Object obj) {
        this.variables = obj;
        return this;
    }

    public /* synthetic */ GraphQlRequestBuilder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
