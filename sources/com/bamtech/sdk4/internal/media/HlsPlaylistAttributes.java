package com.bamtech.sdk4.internal.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003JM\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "", "()V", "adPartner", "", "drms", "", "encryptionType", "audioSegmentTypes", "videoSegmentTypes", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAdPartner", "()Ljava/lang/String;", "getAudioSegmentTypes", "()Ljava/util/List;", "getDrms", "getEncryptionType", "getVideoSegmentTypes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaylistResponse.kt */
public final class HlsPlaylistAttributes {
    private final String adPartner;
    private final List<String> audioSegmentTypes;
    private final List<String> drms;
    private final String encryptionType;
    private final List<String> videoSegmentTypes;

    public HlsPlaylistAttributes(String str, List<String> list, String str2, List<String> list2, List<String> list3) {
        this.adPartner = str;
        this.drms = list;
        this.encryptionType = str2;
        this.audioSegmentTypes = list2;
        this.videoSegmentTypes = list3;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r5v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r7v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r8v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.internal.media.HlsPlaylistAttributes copy$default(com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r3, java.lang.String r4, java.util.List<java.lang.String> r5, java.lang.String r6, java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.adPartner
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.util.List<java.lang.String> r5 = r3.drms
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            java.lang.String r6 = r3.encryptionType
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.util.List<java.lang.String> r7 = r3.audioSegmentTypes
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            java.util.List<java.lang.String> r8 = r3.videoSegmentTypes
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.HlsPlaylistAttributes.copy$default(com.bamtech.sdk4.internal.media.HlsPlaylistAttributes, java.lang.String, java.util.List, java.lang.String, java.util.List, java.util.List, int, java.lang.Object):com.bamtech.sdk4.internal.media.HlsPlaylistAttributes");
    }

    public final String component1() {
        return this.adPartner;
    }

    public final List<String> component2() {
        return this.drms;
    }

    public final String component3() {
        return this.encryptionType;
    }

    public final List<String> component4() {
        return this.audioSegmentTypes;
    }

    public final List<String> component5() {
        return this.videoSegmentTypes;
    }

    public final HlsPlaylistAttributes copy(String str, List<String> list, String str2, List<String> list2, List<String> list3) {
        HlsPlaylistAttributes hlsPlaylistAttributes = new HlsPlaylistAttributes(str, list, str2, list2, list3);
        return hlsPlaylistAttributes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.videoSegmentTypes, (java.lang.Object) r3.videoSegmentTypes) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.media.HlsPlaylistAttributes
            if (r0 == 0) goto L_0x003b
            com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r3 = (com.bamtech.sdk4.internal.media.HlsPlaylistAttributes) r3
            java.lang.String r0 = r2.adPartner
            java.lang.String r1 = r3.adPartner
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<java.lang.String> r0 = r2.drms
            java.util.List<java.lang.String> r1 = r3.drms
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.encryptionType
            java.lang.String r1 = r3.encryptionType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<java.lang.String> r0 = r2.audioSegmentTypes
            java.util.List<java.lang.String> r1 = r3.audioSegmentTypes
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<java.lang.String> r0 = r2.videoSegmentTypes
            java.util.List<java.lang.String> r3 = r3.videoSegmentTypes
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.HlsPlaylistAttributes.equals(java.lang.Object):boolean");
    }

    public final String getAdPartner() {
        return this.adPartner;
    }

    public final List<String> getAudioSegmentTypes() {
        return this.audioSegmentTypes;
    }

    public final List<String> getDrms() {
        return this.drms;
    }

    public final String getEncryptionType() {
        return this.encryptionType;
    }

    public final List<String> getVideoSegmentTypes() {
        return this.videoSegmentTypes;
    }

    public int hashCode() {
        String str = this.adPartner;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.drms;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.encryptionType;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list2 = this.audioSegmentTypes;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.videoSegmentTypes;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HlsPlaylistAttributes(adPartner=");
        sb.append(this.adPartner);
        sb.append(", drms=");
        sb.append(this.drms);
        sb.append(", encryptionType=");
        sb.append(this.encryptionType);
        sb.append(", audioSegmentTypes=");
        sb.append(this.audioSegmentTypes);
        sb.append(", videoSegmentTypes=");
        sb.append(this.videoSegmentTypes);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ HlsPlaylistAttributes(String str, List list, String str2, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = C13185o.m40513a();
        }
        List list4 = list;
        if ((i & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            list2 = C13185o.m40513a();
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            list3 = C13185o.m40513a();
        }
        this(str, list4, str3, list5, list3);
    }

    public HlsPlaylistAttributes() {
        this("", C13185o.m40513a(), "", C13185o.m40513a(), C13185o.m40513a());
    }
}
