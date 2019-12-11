package com.bamtech.sdk4.internal.media.offline.p047db;

import com.bamtech.sdk4.media.offline.DownloadError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DownloadStatusEntry;", "", "type", "", "bytesDownloaded", "", "percentageComplete", "", "error", "Lcom/bamtech/sdk4/media/offline/DownloadError;", "timestamp", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;JFLcom/bamtech/sdk4/media/offline/DownloadError;Lorg/joda/time/DateTime;)V", "getBytesDownloaded", "()J", "getError", "()Lcom/bamtech/sdk4/media/offline/DownloadError;", "getPercentageComplete", "()F", "getTimestamp", "()Lorg/joda/time/DateTime;", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.DownloadStatusEntry */
/* compiled from: DownloadStatusEntry.kt */
public final class DownloadStatusEntry {
    private final long bytesDownloaded;
    private final DownloadError error;
    private final float percentageComplete;
    private final DateTime timestamp;
    private final String type;

    public DownloadStatusEntry(String str, long j, float f, DownloadError downloadError, DateTime dateTime) {
        this.type = str;
        this.bytesDownloaded = j;
        this.percentageComplete = f;
        this.error = downloadError;
        this.timestamp = dateTime;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DownloadStatusEntry) {
                DownloadStatusEntry downloadStatusEntry = (DownloadStatusEntry) obj;
                if (Intrinsics.areEqual((Object) this.type, (Object) downloadStatusEntry.type)) {
                    if (!(this.bytesDownloaded == downloadStatusEntry.bytesDownloaded) || Float.compare(this.percentageComplete, downloadStatusEntry.percentageComplete) != 0 || !Intrinsics.areEqual((Object) this.error, (Object) downloadStatusEntry.error) || !Intrinsics.areEqual((Object) this.timestamp, (Object) downloadStatusEntry.timestamp)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getBytesDownloaded() {
        return this.bytesDownloaded;
    }

    public final DownloadError getError() {
        return this.error;
    }

    public final float getPercentageComplete() {
        return this.percentageComplete;
    }

    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.bytesDownloaded;
        int floatToIntBits = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.percentageComplete)) * 31;
        DownloadError downloadError = this.error;
        int hashCode2 = (floatToIntBits + (downloadError != null ? downloadError.hashCode() : 0)) * 31;
        DateTime dateTime = this.timestamp;
        if (dateTime != null) {
            i = dateTime.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadStatusEntry(type=");
        sb.append(this.type);
        sb.append(", bytesDownloaded=");
        sb.append(this.bytesDownloaded);
        sb.append(", percentageComplete=");
        sb.append(this.percentageComplete);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(")");
        return sb.toString();
    }
}
