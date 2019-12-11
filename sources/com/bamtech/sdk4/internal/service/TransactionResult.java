package com.bamtech.sdk4.internal.service;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/service/TransactionResult;", "T", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "result", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/Object;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTransaction", "()Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "component1", "component2", "copy", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/Object;)Lcom/bamtech/sdk4/internal/service/TransactionResult;", "equals", "", "other", "hashCode", "", "toString", "", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TransactionResult.kt */
public final class TransactionResult<T> {
    private final T result;
    private final ServiceTransaction transaction;

    public TransactionResult(ServiceTransaction serviceTransaction, T t) {
        this.transaction = serviceTransaction;
        this.result = t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.result, (java.lang.Object) r3.result) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.service.TransactionResult
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.service.TransactionResult r3 = (com.bamtech.sdk4.internal.service.TransactionResult) r3
            com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r2.transaction
            com.bamtech.sdk4.internal.service.ServiceTransaction r1 = r3.transaction
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            T r0 = r2.result
            T r3 = r3.result
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.service.TransactionResult.equals(java.lang.Object):boolean");
    }

    public final T getResult() {
        return this.result;
    }

    public final ServiceTransaction getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        ServiceTransaction serviceTransaction = this.transaction;
        int i = 0;
        int hashCode = (serviceTransaction != null ? serviceTransaction.hashCode() : 0) * 31;
        T t = this.result;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionResult(transaction=");
        sb.append(this.transaction);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(")");
        return sb.toString();
    }
}
