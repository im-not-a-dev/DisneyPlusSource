package com.bamtech.sdk4.content;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "", "data", "errors", "", "Lcom/bamtech/sdk4/content/GraphQlError;", "(Ljava/lang/Object;Ljava/util/List;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrors", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/util/List;)Lcom/bamtech/sdk4/content/GraphQlResponse;", "equals", "", "other", "hashCode", "", "toString", "", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GraphQlResponse.kt */
public final class GraphQlResponse<T> {
    private final T data;
    private final List<GraphQlError> errors;

    public GraphQlResponse() {
        this(null, null, 3, null);
    }

    public GraphQlResponse(T t, List<GraphQlError> list) {
        this.data = t;
        this.errors = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=T, for r1v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtech.sdk4.content.GraphQlError>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.content.GraphQlResponse copy$default(com.bamtech.sdk4.content.GraphQlResponse r0, T r1, java.util.List<com.bamtech.sdk4.content.GraphQlError> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            T r1 = r0.data
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.bamtech.sdk4.content.GraphQlError> r2 = r0.errors
        L_0x000c:
            com.bamtech.sdk4.content.GraphQlResponse r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.content.GraphQlResponse.copy$default(com.bamtech.sdk4.content.GraphQlResponse, java.lang.Object, java.util.List, int, java.lang.Object):com.bamtech.sdk4.content.GraphQlResponse");
    }

    public final T component1() {
        return this.data;
    }

    public final List<GraphQlError> component2() {
        return this.errors;
    }

    public final GraphQlResponse<T> copy(T t, List<GraphQlError> list) {
        return new GraphQlResponse<>(t, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.errors, (java.lang.Object) r3.errors) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.content.GraphQlResponse
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.content.GraphQlResponse r3 = (com.bamtech.sdk4.content.GraphQlResponse) r3
            T r0 = r2.data
            T r1 = r3.data
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.bamtech.sdk4.content.GraphQlError> r0 = r2.errors
            java.util.List<com.bamtech.sdk4.content.GraphQlError> r3 = r3.errors
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.content.GraphQlResponse.equals(java.lang.Object):boolean");
    }

    public final T getData() {
        return this.data;
    }

    public final List<GraphQlError> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        T t = this.data;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        List<GraphQlError> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GraphQlResponse(data=");
        sb.append(this.data);
        sb.append(", errors=");
        sb.append(this.errors);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ GraphQlResponse(Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            list = C13185o.m40513a();
        }
        this(obj, list);
    }
}
