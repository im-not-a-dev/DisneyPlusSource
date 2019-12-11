package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/OneIdError;", "", "code", "", "category", "errorId", "inputName", "developerMessage", "data", "Lcom/bamtechmedia/dominguez/legal/ErrorData;", "content", "Lcom/bamtechmedia/dominguez/legal/ErrorContent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/legal/ErrorData;Lcom/bamtechmedia/dominguez/legal/ErrorContent;)V", "getCategory", "()Ljava/lang/String;", "getCode", "getContent", "()Lcom/bamtechmedia/dominguez/legal/ErrorContent;", "getData", "()Lcom/bamtechmedia/dominguez/legal/ErrorData;", "getDeveloperMessage", "getErrorId", "getInputName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalResponseModels.kt */
public final class OneIdError {
    private final String category;
    private final String code;
    private final ErrorContent content;
    private final ErrorData data;
    private final String developerMessage;
    private final String errorId;
    private final String inputName;

    public OneIdError(String str, String str2, String str3, String str4, String str5, ErrorData errorData, ErrorContent errorContent) {
        this.code = str;
        this.category = str2;
        this.errorId = str3;
        this.inputName = str4;
        this.developerMessage = str5;
        this.data = errorData;
        this.content = errorContent;
    }

    public static /* synthetic */ OneIdError copy$default(OneIdError oneIdError, String str, String str2, String str3, String str4, String str5, ErrorData errorData, ErrorContent errorContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneIdError.code;
        }
        if ((i & 2) != 0) {
            str2 = oneIdError.category;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneIdError.errorId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneIdError.inputName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = oneIdError.developerMessage;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            errorData = oneIdError.data;
        }
        ErrorData errorData2 = errorData;
        if ((i & 64) != 0) {
            errorContent = oneIdError.content;
        }
        return oneIdError.copy(str, str6, str7, str8, str9, errorData2, errorContent);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.errorId;
    }

    public final String component4() {
        return this.inputName;
    }

    public final String component5() {
        return this.developerMessage;
    }

    public final ErrorData component6() {
        return this.data;
    }

    public final ErrorContent component7() {
        return this.content;
    }

    public final OneIdError copy(String str, String str2, String str3, String str4, String str5, ErrorData errorData, ErrorContent errorContent) {
        OneIdError oneIdError = new OneIdError(str, str2, str3, str4, str5, errorData, errorContent);
        return oneIdError;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.content, (java.lang.Object) r3.content) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.OneIdError
            if (r0 == 0) goto L_0x004f
            com.bamtechmedia.dominguez.legal.OneIdError r3 = (com.bamtechmedia.dominguez.legal.OneIdError) r3
            java.lang.String r0 = r2.code
            java.lang.String r1 = r3.code
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.category
            java.lang.String r1 = r3.category
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.errorId
            java.lang.String r1 = r3.errorId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.inputName
            java.lang.String r1 = r3.inputName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.developerMessage
            java.lang.String r1 = r3.developerMessage
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.bamtechmedia.dominguez.legal.ErrorData r0 = r2.data
            com.bamtechmedia.dominguez.legal.ErrorData r1 = r3.data
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.bamtechmedia.dominguez.legal.ErrorContent r0 = r2.content
            com.bamtechmedia.dominguez.legal.ErrorContent r3 = r3.content
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.OneIdError.equals(java.lang.Object):boolean");
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCode() {
        return this.code;
    }

    public final ErrorContent getContent() {
        return this.content;
    }

    public final ErrorData getData() {
        return this.data;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getErrorId() {
        return this.errorId;
    }

    public final String getInputName() {
        return this.inputName;
    }

    public int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.category;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.errorId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.inputName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.developerMessage;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        ErrorData errorData = this.data;
        int hashCode6 = (hashCode5 + (errorData != null ? errorData.hashCode() : 0)) * 31;
        ErrorContent errorContent = this.content;
        if (errorContent != null) {
            i = errorContent.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OneIdError(code=");
        sb.append(this.code);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", errorId=");
        sb.append(this.errorId);
        sb.append(", inputName=");
        sb.append(this.inputName);
        sb.append(", developerMessage=");
        sb.append(this.developerMessage);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(")");
        return sb.toString();
    }
}
