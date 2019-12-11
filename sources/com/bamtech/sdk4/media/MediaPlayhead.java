package com.bamtech.sdk4.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.shadow.gson.p050r.C2246c;
import kotlin.Metadata;
import org.joda.time.DateTime;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaPlayhead;", "", "position", "", "lastUpdated", "Lorg/joda/time/DateTime;", "status", "Lcom/bamtech/sdk4/media/MediaPlayheadStatus;", "contentId", "", "(DLorg/joda/time/DateTime;Lcom/bamtech/sdk4/media/MediaPlayheadStatus;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getLastUpdated", "()Lorg/joda/time/DateTime;", "getPosition", "()D", "getStatus", "()Lcom/bamtech/sdk4/media/MediaPlayheadStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaPlayhead.kt */
public final class MediaPlayhead {
    @C2246c("content_id")
    private final String contentId;
    @C2246c("last_updated")
    private final DateTime lastUpdated;
    private final double position;
    private final MediaPlayheadStatus status;

    public MediaPlayhead() {
        this(0.0d, null, null, null, 15, null);
    }

    public MediaPlayhead(double d, DateTime dateTime, MediaPlayheadStatus mediaPlayheadStatus, String str) {
        this.position = d;
        this.lastUpdated = dateTime;
        this.status = mediaPlayheadStatus;
        this.contentId = str;
    }

    public static /* synthetic */ MediaPlayhead copy$default(MediaPlayhead mediaPlayhead, double d, DateTime dateTime, MediaPlayheadStatus mediaPlayheadStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = mediaPlayhead.position;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            dateTime = mediaPlayhead.lastUpdated;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 4) != 0) {
            mediaPlayheadStatus = mediaPlayhead.status;
        }
        MediaPlayheadStatus mediaPlayheadStatus2 = mediaPlayheadStatus;
        if ((i & 8) != 0) {
            str = mediaPlayhead.contentId;
        }
        return mediaPlayhead.copy(d2, dateTime2, mediaPlayheadStatus2, str);
    }

    public final double component1() {
        return this.position;
    }

    public final DateTime component2() {
        return this.lastUpdated;
    }

    public final MediaPlayheadStatus component3() {
        return this.status;
    }

    public final String component4() {
        return this.contentId;
    }

    public final MediaPlayhead copy(double d, DateTime dateTime, MediaPlayheadStatus mediaPlayheadStatus, String str) {
        MediaPlayhead mediaPlayhead = new MediaPlayhead(d, dateTime, mediaPlayheadStatus, str);
        return mediaPlayhead;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4.contentId, (java.lang.Object) r5.contentId) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 == r5) goto L_0x0033
            boolean r0 = r5 instanceof com.bamtech.sdk4.media.MediaPlayhead
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.media.MediaPlayhead r5 = (com.bamtech.sdk4.media.MediaPlayhead) r5
            double r0 = r4.position
            double r2 = r5.position
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 != 0) goto L_0x0031
            org.joda.time.DateTime r0 = r4.lastUpdated
            org.joda.time.DateTime r1 = r5.lastUpdated
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.media.MediaPlayheadStatus r0 = r4.status
            com.bamtech.sdk4.media.MediaPlayheadStatus r1 = r5.status
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r4.contentId
            java.lang.String r5 = r5.contentId
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r5 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r5 = 0
            return r5
        L_0x0033:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.MediaPlayhead.equals(java.lang.Object):boolean");
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final DateTime getLastUpdated() {
        return this.lastUpdated;
    }

    public final double getPosition() {
        return this.position;
    }

    public final MediaPlayheadStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.position);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        DateTime dateTime = this.lastUpdated;
        int i2 = 0;
        int hashCode = (i + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        MediaPlayheadStatus mediaPlayheadStatus = this.status;
        int hashCode2 = (hashCode + (mediaPlayheadStatus != null ? mediaPlayheadStatus.hashCode() : 0)) * 31;
        String str = this.contentId;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaPlayhead(position=");
        sb.append(this.position);
        sb.append(", lastUpdated=");
        sb.append(this.lastUpdated);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", contentId=");
        sb.append(this.contentId);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MediaPlayhead(double d, DateTime dateTime, MediaPlayheadStatus mediaPlayheadStatus, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        double d2 = d;
        DateTime dateTime2 = (i & 2) != 0 ? null : dateTime;
        if ((i & 4) != 0) {
            mediaPlayheadStatus = MediaPlayheadStatus.NoPlayhead;
        }
        this(d2, dateTime2, mediaPlayheadStatus, (i & 8) != 0 ? null : str);
    }
}
