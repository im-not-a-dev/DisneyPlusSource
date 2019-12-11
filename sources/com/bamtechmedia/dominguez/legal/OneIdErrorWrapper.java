package com.bamtechmedia.dominguez.legal;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/OneIdErrorWrapper;", "Lcom/bamtechmedia/dominguez/legal/ErrorContainer;", "keyCategory", "", "errors", "", "Lcom/bamtechmedia/dominguez/legal/OneIdError;", "(Ljava/lang/String;Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "getKeyCategory", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalResponseModels.kt */
public final class OneIdErrorWrapper implements ErrorContainer {
    private final List<OneIdError> errors;
    private final String keyCategory;

    public OneIdErrorWrapper(String str, List<OneIdError> list) {
        this.keyCategory = str;
        this.errors = list;
    }

    public static /* synthetic */ OneIdErrorWrapper copy$default(OneIdErrorWrapper oneIdErrorWrapper, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneIdErrorWrapper.keyCategory;
        }
        if ((i & 2) != 0) {
            list = oneIdErrorWrapper.getErrors();
        }
        return oneIdErrorWrapper.copy(str, list);
    }

    public final String component1() {
        return this.keyCategory;
    }

    public final List<OneIdError> component2() {
        return getErrors();
    }

    public final OneIdErrorWrapper copy(String str, List<OneIdError> list) {
        return new OneIdErrorWrapper(str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) getErrors(), (java.lang.Object) r3.getErrors()) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0023
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.OneIdErrorWrapper
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.legal.OneIdErrorWrapper r3 = (com.bamtechmedia.dominguez.legal.OneIdErrorWrapper) r3
            java.lang.String r0 = r2.keyCategory
            java.lang.String r1 = r3.keyCategory
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0021
            java.util.List r0 = r2.getErrors()
            java.util.List r3 = r3.getErrors()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            return r3
        L_0x0023:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.OneIdErrorWrapper.equals(java.lang.Object):boolean");
    }

    public List<OneIdError> getErrors() {
        return this.errors;
    }

    public final String getKeyCategory() {
        return this.keyCategory;
    }

    public int hashCode() {
        String str = this.keyCategory;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List errors2 = getErrors();
        if (errors2 != null) {
            i = errors2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OneIdErrorWrapper(keyCategory=");
        sb.append(this.keyCategory);
        sb.append(", errors=");
        sb.append(getErrors());
        sb.append(")");
        return sb.toString();
    }
}
