package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/AvatarResponse;", "", "avatars", "", "Lcom/bamtechmedia/dominguez/core/content/assets/ProfileAvatar;", "(Ljava/util/List;)V", "getAvatars", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: AvatarsRepositoryImpl.kt */
public final class AvatarResponse {

    /* renamed from: a */
    private final List<ProfileAvatar> f14905a;

    public AvatarResponse(List<ProfileAvatar> list) {
        this.f14905a = list;
    }

    /* renamed from: a */
    public final List<ProfileAvatar> mo19258a() {
        return this.f14905a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14905a, (java.lang.Object) ((com.bamtechmedia.dominguez.profiles.AvatarResponse) r2).f14905a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.profiles.AvatarResponse
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.profiles.AvatarResponse r2 = (com.bamtechmedia.dominguez.profiles.AvatarResponse) r2
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar> r0 = r1.f14905a
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.ProfileAvatar> r2 = r2.f14905a
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.AvatarResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<ProfileAvatar> list = this.f14905a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AvatarResponse(avatars=");
        sb.append(this.f14905a);
        sb.append(")");
        return sb.toString();
    }
}
