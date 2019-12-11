package com.bamtech.sdk4.account;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001bBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003JO\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/DefaultUserProfile;", "Lcom/bamtech/sdk4/account/UserProfile;", "profileId", "", "profileName", "attributes", "", "", "metadata", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "getMetadata", "getProfileId", "()Ljava/lang/String;", "getProfileName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Collection", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfile.kt */
public final class DefaultUserProfile implements UserProfile {
    private final Map<String, Object> attributes;
    private final Map<String, Object> metadata;
    private final String profileId;
    private final String profileName;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/DefaultUserProfile$Collection;", "Ljava/util/ArrayList;", "Lcom/bamtech/sdk4/account/DefaultUserProfile;", "Lkotlin/collections/ArrayList;", "(Lcom/bamtech/sdk4/account/DefaultUserProfile;)V", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: UserProfile.kt */
    public final class Collection extends ArrayList<DefaultUserProfile> {
        public /* bridge */ boolean contains(DefaultUserProfile defaultUserProfile) {
            return super.contains(defaultUserProfile);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ int indexOf(DefaultUserProfile defaultUserProfile) {
            return super.indexOf(defaultUserProfile);
        }

        public /* bridge */ int lastIndexOf(DefaultUserProfile defaultUserProfile) {
            return super.lastIndexOf(defaultUserProfile);
        }

        public /* bridge */ boolean remove(DefaultUserProfile defaultUserProfile) {
            return super.remove(defaultUserProfile);
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof DefaultUserProfile) {
                return contains((DefaultUserProfile) obj);
            }
            return false;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof DefaultUserProfile) {
                return indexOf((DefaultUserProfile) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof DefaultUserProfile) {
                return lastIndexOf((DefaultUserProfile) obj);
            }
            return -1;
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof DefaultUserProfile) {
                return remove((DefaultUserProfile) obj);
            }
            return false;
        }
    }

    public DefaultUserProfile(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.profileId = str;
        this.profileName = str2;
        this.attributes = map;
        this.metadata = map2;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.lang.Object>, for r3v0, types: [java.util.Map] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.lang.Object>, for r4v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.account.DefaultUserProfile copy$default(com.bamtech.sdk4.account.DefaultUserProfile r0, java.lang.String r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.Object> r3, java.util.Map<java.lang.String, java.lang.Object> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0008
            java.lang.String r1 = r0.getProfileId()
        L_0x0008:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x0010
            java.lang.String r2 = r0.getProfileName()
        L_0x0010:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0016
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.attributes
        L_0x0016:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x001c
            java.util.Map<java.lang.String, java.lang.Object> r4 = r0.metadata
        L_0x001c:
            com.bamtech.sdk4.account.DefaultUserProfile r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.account.DefaultUserProfile.copy$default(com.bamtech.sdk4.account.DefaultUserProfile, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, java.lang.Object):com.bamtech.sdk4.account.DefaultUserProfile");
    }

    public final DefaultUserProfile copy(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        return new DefaultUserProfile(str, str2, map, map2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.metadata, (java.lang.Object) r3.metadata) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003b
            boolean r0 = r3 instanceof com.bamtech.sdk4.account.DefaultUserProfile
            if (r0 == 0) goto L_0x0039
            com.bamtech.sdk4.account.DefaultUserProfile r3 = (com.bamtech.sdk4.account.DefaultUserProfile) r3
            java.lang.String r0 = r2.getProfileId()
            java.lang.String r1 = r3.getProfileId()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r2.getProfileName()
            java.lang.String r1 = r3.getProfileName()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.attributes
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.attributes
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.metadata
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.metadata
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r3 = 0
            return r3
        L_0x003b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.account.DefaultUserProfile.equals(java.lang.Object):boolean");
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public String getProfileName() {
        return this.profileName;
    }

    public int hashCode() {
        String profileId2 = getProfileId();
        int i = 0;
        int hashCode = (profileId2 != null ? profileId2.hashCode() : 0) * 31;
        String profileName2 = getProfileName();
        int hashCode2 = (hashCode + (profileName2 != null ? profileName2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.attributes;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, Object> map2 = this.metadata;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultUserProfile(profileId=");
        sb.append(getProfileId());
        sb.append(", profileName=");
        sb.append(getProfileName());
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ DefaultUserProfile(String str, String str2, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = C13173j0.m40350a();
        }
        if ((i & 8) != 0) {
            map2 = C13173j0.m40350a();
        }
        this(str, str2, map, map2);
    }
}
