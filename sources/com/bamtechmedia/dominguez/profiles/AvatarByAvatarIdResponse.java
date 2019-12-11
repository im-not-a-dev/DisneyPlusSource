package com.bamtechmedia.dominguez.profiles;

import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/AvatarByAvatarIdResponse;", "", "item", "Lcom/bamtechmedia/dominguez/profiles/AvatarResponse;", "(Lcom/bamtechmedia/dominguez/profiles/AvatarResponse;)V", "getItem", "()Lcom/bamtechmedia/dominguez/profiles/AvatarResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: AvatarsRepositoryImpl.kt */
public final class AvatarByAvatarIdResponse {

    /* renamed from: a */
    private final AvatarResponse f14904a;

    public AvatarByAvatarIdResponse(@C11724g(name = "AvatarByAvatarId") AvatarResponse avatarResponse) {
        this.f14904a = avatarResponse;
    }

    /* renamed from: a */
    public final AvatarResponse mo19251a() {
        return this.f14904a;
    }

    public final AvatarByAvatarIdResponse copy(@C11724g(name = "AvatarByAvatarId") AvatarResponse avatarResponse) {
        return new AvatarByAvatarIdResponse(avatarResponse);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f14904a, (java.lang.Object) ((com.bamtechmedia.dominguez.profiles.AvatarByAvatarIdResponse) r2).f14904a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.profiles.AvatarByAvatarIdResponse
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.profiles.AvatarByAvatarIdResponse r2 = (com.bamtechmedia.dominguez.profiles.AvatarByAvatarIdResponse) r2
            com.bamtechmedia.dominguez.profiles.AvatarResponse r0 = r1.f14904a
            com.bamtechmedia.dominguez.profiles.AvatarResponse r2 = r2.f14904a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.AvatarByAvatarIdResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        AvatarResponse avatarResponse = this.f14904a;
        if (avatarResponse != null) {
            return avatarResponse.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AvatarByAvatarIdResponse(item=");
        sb.append(this.f14904a);
        sb.append(")");
        return sb.toString();
    }
}
