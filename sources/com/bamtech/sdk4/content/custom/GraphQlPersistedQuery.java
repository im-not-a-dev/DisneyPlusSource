package com.bamtech.sdk4.content.custom;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/GraphQlPersistedQuery;", "", "id", "", "operationName", "variables", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()Ljava/lang/String;", "getOperationName", "getVariables", "()Ljava/lang/Object;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlPersistedQuery.kt */
public final class GraphQlPersistedQuery {

    /* renamed from: id */
    private final String f6070id;
    private final String operationName;
    private final Object variables;

    public GraphQlPersistedQuery(String str) {
        this(str, null, null, 6, null);
    }

    public GraphQlPersistedQuery(String str, String str2) {
        this(str, str2, null, 4, null);
    }

    public GraphQlPersistedQuery(String str, String str2, Object obj) {
        this.f6070id = str;
        this.operationName = str2;
        this.variables = obj;
    }

    public final String getId() {
        return this.f6070id;
    }

    public final String getOperationName() {
        return this.operationName;
    }

    public final Object getVariables() {
        return this.variables;
    }

    public /* synthetic */ GraphQlPersistedQuery(String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        this(str, str2, obj);
    }
}
