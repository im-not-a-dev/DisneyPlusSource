package com.bamtech.sdk4.internal.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.token.Grant;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0001\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "Lcom/bamtech/sdk4/token/Grant;", "()V", "Success", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse$Success;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CreateAccountGrantClient.kt */
public abstract class CreateAccountGrantResponse implements Grant {

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse$Success;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "Lcom/bamtech/sdk4/token/Grant;", "grantType", "", "assertion", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssertion", "()Ljava/lang/String;", "getGrantType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: CreateAccountGrantClient.kt */
    public static final class Success extends CreateAccountGrantResponse implements Grant {
        private final String assertion;
        private final String grantType;

        public Success(String str, String str2) {
            super(null);
            this.grantType = str;
            this.assertion = str2;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.getGrantType();
            }
            if ((i & 2) != 0) {
                str2 = success.getAssertion();
            }
            return success.copy(str, str2);
        }

        public final String component1() {
            return getGrantType();
        }

        public final String component2() {
            return getAssertion();
        }

        public final Success copy(String str, String str2) {
            return new Success(str, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getAssertion(), (java.lang.Object) r3.getAssertion()) != false) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0027
                boolean r0 = r3 instanceof com.bamtech.sdk4.internal.account.CreateAccountGrantResponse.Success
                if (r0 == 0) goto L_0x0025
                com.bamtech.sdk4.internal.account.CreateAccountGrantResponse$Success r3 = (com.bamtech.sdk4.internal.account.CreateAccountGrantResponse.Success) r3
                java.lang.String r0 = r2.getGrantType()
                java.lang.String r1 = r3.getGrantType()
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0025
                java.lang.String r0 = r2.getAssertion()
                java.lang.String r3 = r3.getAssertion()
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r3 = 0
                return r3
            L_0x0027:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.CreateAccountGrantResponse.Success.equals(java.lang.Object):boolean");
        }

        public String getAssertion() {
            return this.assertion;
        }

        public String getGrantType() {
            return this.grantType;
        }

        public int hashCode() {
            String grantType2 = getGrantType();
            int i = 0;
            int hashCode = (grantType2 != null ? grantType2.hashCode() : 0) * 31;
            String assertion2 = getAssertion();
            if (assertion2 != null) {
                i = assertion2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success(grantType=");
            sb.append(getGrantType());
            sb.append(", assertion=");
            sb.append(getAssertion());
            sb.append(")");
            return sb.toString();
        }
    }

    private CreateAccountGrantResponse() {
    }

    public /* synthetic */ CreateAccountGrantResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
