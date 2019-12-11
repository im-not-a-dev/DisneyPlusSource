package com.bamtech.sdk4.internal.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0001\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/CreateAccountResult;", "", "()V", "Created", "Lcom/bamtech/sdk4/internal/account/CreateAccountResult$Created;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CreateAccountClient.kt */
public abstract class CreateAccountResult {

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/CreateAccountResult$Created;", "Lcom/bamtech/sdk4/internal/account/CreateAccountResult;", "accountId", "", "Lcom/bamtech/sdk4/account/AccountId;", "(Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: CreateAccountClient.kt */
    public static final class Created extends CreateAccountResult {
        private final String accountId;

        public Created(String str) {
            super(null);
            this.accountId = str;
        }

        public static /* synthetic */ Created copy$default(Created created, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = created.accountId;
            }
            return created.copy(str);
        }

        public final String component1() {
            return this.accountId;
        }

        public final Created copy(String str) {
            return new Created(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.accountId, (java.lang.Object) ((com.bamtech.sdk4.internal.account.CreateAccountResult.Created) r2).accountId) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtech.sdk4.internal.account.CreateAccountResult.Created
                if (r0 == 0) goto L_0x0013
                com.bamtech.sdk4.internal.account.CreateAccountResult$Created r2 = (com.bamtech.sdk4.internal.account.CreateAccountResult.Created) r2
                java.lang.String r0 = r1.accountId
                java.lang.String r2 = r2.accountId
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.CreateAccountResult.Created.equals(java.lang.Object):boolean");
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public int hashCode() {
            String str = this.accountId;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Created(accountId=");
            sb.append(this.accountId);
            sb.append(")");
            return sb.toString();
        }
    }

    private CreateAccountResult() {
    }

    public /* synthetic */ CreateAccountResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
