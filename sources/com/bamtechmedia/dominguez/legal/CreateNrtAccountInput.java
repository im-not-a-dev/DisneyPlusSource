package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.MarketingInput;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/CreateNrtAccountInput;", "", "profile", "Lcom/bamtechmedia/dominguez/legal/NrtProfile;", "marketing", "", "Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "legalAssertions", "", "(Lcom/bamtechmedia/dominguez/legal/NrtProfile;Ljava/util/List;Ljava/util/List;)V", "getLegalAssertions", "()Ljava/util/List;", "getMarketing", "getProfile", "()Lcom/bamtechmedia/dominguez/legal/NrtProfile;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: LegalResponseModels.kt */
public final class CreateNrtAccountInput {
    private final List<String> legalAssertions;
    private final List<MarketingInput> marketing;
    private final NrtProfile profile;

    public CreateNrtAccountInput(NrtProfile nrtProfile, List<MarketingInput> list, List<String> list2) {
        this.profile = nrtProfile;
        this.marketing = list;
        this.legalAssertions = list2;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingInput>, for r2v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.legal.CreateNrtAccountInput copy$default(com.bamtechmedia.dominguez.legal.CreateNrtAccountInput r0, com.bamtechmedia.dominguez.legal.NrtProfile r1, java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingInput> r2, java.util.List<java.lang.String> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            com.bamtechmedia.dominguez.legal.NrtProfile r1 = r0.profile
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingInput> r2 = r0.marketing
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.util.List<java.lang.String> r3 = r0.legalAssertions
        L_0x0012:
            com.bamtechmedia.dominguez.legal.CreateNrtAccountInput r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.CreateNrtAccountInput.copy$default(com.bamtechmedia.dominguez.legal.CreateNrtAccountInput, com.bamtechmedia.dominguez.legal.NrtProfile, java.util.List, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.legal.CreateNrtAccountInput");
    }

    public final NrtProfile component1() {
        return this.profile;
    }

    public final List<MarketingInput> component2() {
        return this.marketing;
    }

    public final List<String> component3() {
        return this.legalAssertions;
    }

    public final CreateNrtAccountInput copy(NrtProfile nrtProfile, List<MarketingInput> list, List<String> list2) {
        return new CreateNrtAccountInput(nrtProfile, list, list2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.legalAssertions, (java.lang.Object) r3.legalAssertions) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.CreateNrtAccountInput
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.legal.CreateNrtAccountInput r3 = (com.bamtechmedia.dominguez.legal.CreateNrtAccountInput) r3
            com.bamtechmedia.dominguez.legal.NrtProfile r0 = r2.profile
            com.bamtechmedia.dominguez.legal.NrtProfile r1 = r3.profile
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingInput> r0 = r2.marketing
            java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingInput> r1 = r3.marketing
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<java.lang.String> r0 = r2.legalAssertions
            java.util.List<java.lang.String> r3 = r3.legalAssertions
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.CreateNrtAccountInput.equals(java.lang.Object):boolean");
    }

    public final List<String> getLegalAssertions() {
        return this.legalAssertions;
    }

    public final List<MarketingInput> getMarketing() {
        return this.marketing;
    }

    public final NrtProfile getProfile() {
        return this.profile;
    }

    public int hashCode() {
        NrtProfile nrtProfile = this.profile;
        int i = 0;
        int hashCode = (nrtProfile != null ? nrtProfile.hashCode() : 0) * 31;
        List<MarketingInput> list = this.marketing;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.legalAssertions;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateNrtAccountInput(profile=");
        sb.append(this.profile);
        sb.append(", marketing=");
        sb.append(this.marketing);
        sb.append(", legalAssertions=");
        sb.append(this.legalAssertions);
        sb.append(")");
        return sb.toString();
    }
}
