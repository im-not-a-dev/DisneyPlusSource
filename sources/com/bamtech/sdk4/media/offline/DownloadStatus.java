package com.bamtech.sdk4.media.offline;

import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u001c\u001d\u001e\u001f !\"#$%&'B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0001\u000b()*+,-./012¨\u00063"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "", "timestamp", "Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "canCancel", "", "getCanCancel", "()Z", "canResume", "getCanResume", "canStart", "getCanStart", "canSuspend", "getCanSuspend", "isActive", "isRenewable", "name", "", "getName", "()Ljava/lang/String;", "getTimestamp", "()Lorg/joda/time/DateTime;", "equals", "other", "hashCode", "", "toString", "Cancelled", "Failed", "Finished", "InProgress", "Interrupted", "MissingCache", "None", "OperationPriorityComparator", "Paused", "Queued", "Requested", "Tombstoned", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$None;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$Requested;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$Queued;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$Paused;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$Interrupted;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$InProgress;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$Finished;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$Cancelled;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$Tombstoned;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$Failed;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus$MissingCache;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadStatus.kt */
public abstract class DownloadStatus {
    private final boolean canResume;
    private final DateTime timestamp;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$Cancelled;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "timestamp", "Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class Cancelled extends DownloadStatus {
        private final DateTime timestamp;

        public Cancelled() {
            this(null, 1, null);
        }

        public /* synthetic */ Cancelled(DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(dateTime);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getTimestamp(), (java.lang.Object) ((com.bamtech.sdk4.media.offline.DownloadStatus.Cancelled) r2).getTimestamp()) != false) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0019
                boolean r0 = r2 instanceof com.bamtech.sdk4.media.offline.DownloadStatus.Cancelled
                if (r0 == 0) goto L_0x0017
                com.bamtech.sdk4.media.offline.DownloadStatus$Cancelled r2 = (com.bamtech.sdk4.media.offline.DownloadStatus.Cancelled) r2
                org.joda.time.DateTime r0 = r1.getTimestamp()
                org.joda.time.DateTime r2 = r2.getTimestamp()
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r2 = 0
                return r2
            L_0x0019:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.offline.DownloadStatus.Cancelled.equals(java.lang.Object):boolean");
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            DateTime timestamp2 = getTimestamp();
            if (timestamp2 != null) {
                return timestamp2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Cancelled(timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public Cancelled(DateTime dateTime) {
            super(dateTime, null);
            this.timestamp = dateTime;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J3\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$Failed;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "Lcom/bamtech/sdk4/media/offline/DownloadErrorStatus;", "bytesDownloaded", "", "percentageComplete", "", "error", "Lcom/bamtech/sdk4/media/offline/DownloadError;", "timestamp", "Lorg/joda/time/DateTime;", "(JFLcom/bamtech/sdk4/media/offline/DownloadError;Lorg/joda/time/DateTime;)V", "getBytesDownloaded", "()J", "canStart", "", "getCanStart", "()Z", "getError", "()Lcom/bamtech/sdk4/media/offline/DownloadError;", "getPercentageComplete", "()F", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class Failed extends DownloadStatus implements DownloadProgress, DownloadErrorStatus {
        private final long bytesDownloaded;
        private final DownloadError error;
        private final float percentageComplete;
        private final DateTime timestamp;

        public /* synthetic */ Failed(long j, float f, DownloadError downloadError, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                j = 0;
            }
            long j2 = j;
            float f2 = (i & 2) != 0 ? 0.0f : f;
            if ((i & 8) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(j2, f2, downloadError, dateTime);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!(getBytesDownloaded() == failed.getBytesDownloaded()) || Float.compare(getPercentageComplete(), failed.getPercentageComplete()) != 0 || !C12880j.m40224a((Object) getError(), (Object) failed.getError()) || !C12880j.m40224a((Object) getTimestamp(), (Object) failed.getTimestamp())) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public DownloadError getError() {
            return this.error;
        }

        public float getPercentageComplete() {
            return this.percentageComplete;
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            long bytesDownloaded2 = getBytesDownloaded();
            int floatToIntBits = ((((int) (bytesDownloaded2 ^ (bytesDownloaded2 >>> 32))) * 31) + Float.floatToIntBits(getPercentageComplete())) * 31;
            DownloadError error2 = getError();
            int i = 0;
            int hashCode = (floatToIntBits + (error2 != null ? error2.hashCode() : 0)) * 31;
            DateTime timestamp2 = getTimestamp();
            if (timestamp2 != null) {
                i = timestamp2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed(bytesDownloaded=");
            sb.append(getBytesDownloaded());
            sb.append(", percentageComplete=");
            sb.append(getPercentageComplete());
            sb.append(", error=");
            sb.append(getError());
            sb.append(", timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public Failed(long j, float f, DownloadError downloadError, DateTime dateTime) {
            super(dateTime, null);
            this.bytesDownloaded = j;
            this.percentageComplete = f;
            this.error = downloadError;
            this.timestamp = dateTime;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$Finished;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "bytesDownloaded", "", "percentageComplete", "", "timestamp", "Lorg/joda/time/DateTime;", "(JFLorg/joda/time/DateTime;)V", "getBytesDownloaded", "()J", "isRenewable", "", "()Z", "getPercentageComplete", "()F", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class Finished extends DownloadStatus implements DownloadProgress {
        private final long bytesDownloaded;
        private final float percentageComplete;
        private final DateTime timestamp;

        public /* synthetic */ Finished(long j, float f, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(j, f, dateTime);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Finished) {
                    Finished finished = (Finished) obj;
                    if (!(getBytesDownloaded() == finished.getBytesDownloaded()) || Float.compare(getPercentageComplete(), finished.getPercentageComplete()) != 0 || !C12880j.m40224a((Object) getTimestamp(), (Object) finished.getTimestamp())) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public float getPercentageComplete() {
            return this.percentageComplete;
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            long bytesDownloaded2 = getBytesDownloaded();
            int floatToIntBits = ((((int) (bytesDownloaded2 ^ (bytesDownloaded2 >>> 32))) * 31) + Float.floatToIntBits(getPercentageComplete())) * 31;
            DateTime timestamp2 = getTimestamp();
            return floatToIntBits + (timestamp2 != null ? timestamp2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished(bytesDownloaded=");
            sb.append(getBytesDownloaded());
            sb.append(", percentageComplete=");
            sb.append(getPercentageComplete());
            sb.append(", timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public Finished(long j, float f, DateTime dateTime) {
            super(dateTime, null);
            this.bytesDownloaded = j;
            this.percentageComplete = f;
            this.timestamp = dateTime;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$InProgress;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "bytesDownloaded", "", "percentageComplete", "", "timestamp", "Lorg/joda/time/DateTime;", "(JFLorg/joda/time/DateTime;)V", "getBytesDownloaded", "()J", "canCancel", "", "getCanCancel", "()Z", "canSuspend", "getCanSuspend", "isActive", "isRenewable", "getPercentageComplete", "()F", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class InProgress extends DownloadStatus implements DownloadProgress {
        private final long bytesDownloaded;
        private final float percentageComplete;
        private final DateTime timestamp;

        public /* synthetic */ InProgress(long j, float f, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(j, f, dateTime);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InProgress) {
                    InProgress inProgress = (InProgress) obj;
                    if (!(getBytesDownloaded() == inProgress.getBytesDownloaded()) || Float.compare(getPercentageComplete(), inProgress.getPercentageComplete()) != 0 || !C12880j.m40224a((Object) getTimestamp(), (Object) inProgress.getTimestamp())) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public float getPercentageComplete() {
            return this.percentageComplete;
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            long bytesDownloaded2 = getBytesDownloaded();
            int floatToIntBits = ((((int) (bytesDownloaded2 ^ (bytesDownloaded2 >>> 32))) * 31) + Float.floatToIntBits(getPercentageComplete())) * 31;
            DateTime timestamp2 = getTimestamp();
            return floatToIntBits + (timestamp2 != null ? timestamp2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InProgress(bytesDownloaded=");
            sb.append(getBytesDownloaded());
            sb.append(", percentageComplete=");
            sb.append(getPercentageComplete());
            sb.append(", timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public InProgress(long j, float f, DateTime dateTime) {
            super(dateTime, null);
            this.bytesDownloaded = j;
            this.percentageComplete = f;
            this.timestamp = dateTime;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J3\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$Interrupted;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "Lcom/bamtech/sdk4/media/offline/DownloadErrorStatus;", "bytesDownloaded", "", "percentageComplete", "", "error", "Lcom/bamtech/sdk4/media/offline/DownloadError;", "timestamp", "Lorg/joda/time/DateTime;", "(JFLcom/bamtech/sdk4/media/offline/DownloadError;Lorg/joda/time/DateTime;)V", "getBytesDownloaded", "()J", "canCancel", "", "getCanCancel", "()Z", "canResume", "getCanResume", "canSuspend", "getCanSuspend", "getError", "()Lcom/bamtech/sdk4/media/offline/DownloadError;", "isActive", "isRenewable", "getPercentageComplete", "()F", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class Interrupted extends DownloadStatus implements DownloadProgress, DownloadErrorStatus {
        private final long bytesDownloaded;
        private final boolean canResume;
        private final DownloadError error;
        private final float percentageComplete;
        private final DateTime timestamp;

        public /* synthetic */ Interrupted(long j, float f, DownloadError downloadError, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                downloadError = null;
            }
            DownloadError downloadError2 = downloadError;
            if ((i & 8) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(j, f, downloadError2, dateTime);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Interrupted) {
                    Interrupted interrupted = (Interrupted) obj;
                    if (!(getBytesDownloaded() == interrupted.getBytesDownloaded()) || Float.compare(getPercentageComplete(), interrupted.getPercentageComplete()) != 0 || !C12880j.m40224a((Object) getError(), (Object) interrupted.getError()) || !C12880j.m40224a((Object) getTimestamp(), (Object) interrupted.getTimestamp())) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public boolean getCanResume() {
            return this.canResume;
        }

        public DownloadError getError() {
            return this.error;
        }

        public float getPercentageComplete() {
            return this.percentageComplete;
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            long bytesDownloaded2 = getBytesDownloaded();
            int floatToIntBits = ((((int) (bytesDownloaded2 ^ (bytesDownloaded2 >>> 32))) * 31) + Float.floatToIntBits(getPercentageComplete())) * 31;
            DownloadError error2 = getError();
            int i = 0;
            int hashCode = (floatToIntBits + (error2 != null ? error2.hashCode() : 0)) * 31;
            DateTime timestamp2 = getTimestamp();
            if (timestamp2 != null) {
                i = timestamp2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Interrupted(bytesDownloaded=");
            sb.append(getBytesDownloaded());
            sb.append(", percentageComplete=");
            sb.append(getPercentageComplete());
            sb.append(", error=");
            sb.append(getError());
            sb.append(", timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public Interrupted(long j, float f, DownloadError downloadError, DateTime dateTime) {
            super(dateTime, null);
            this.bytesDownloaded = j;
            this.percentageComplete = f;
            this.error = downloadError;
            this.timestamp = dateTime;
            this.canResume = true;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$MissingCache;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "timestamp", "Lorg/joda/time/DateTime;", "canStart", "", "(Lorg/joda/time/DateTime;Z)V", "getCanStart", "()Z", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class MissingCache extends DownloadStatus {
        private final boolean canStart;
        private final DateTime timestamp;

        public MissingCache() {
            this(null, false, 3, null);
        }

        public /* synthetic */ MissingCache(DateTime dateTime, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            this(dateTime, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MissingCache) {
                    MissingCache missingCache = (MissingCache) obj;
                    if (C12880j.m40224a((Object) getTimestamp(), (Object) missingCache.getTimestamp())) {
                        if (getCanStart() == missingCache.getCanStart()) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public boolean getCanStart() {
            return this.canStart;
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            DateTime timestamp2 = getTimestamp();
            int hashCode = (timestamp2 != null ? timestamp2.hashCode() : 0) * 31;
            boolean canStart2 = getCanStart();
            if (canStart2) {
                canStart2 = true;
            }
            return hashCode + (canStart2 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MissingCache(timestamp=");
            sb.append(getTimestamp());
            sb.append(", canStart=");
            sb.append(getCanStart());
            sb.append(")");
            return sb.toString();
        }

        public MissingCache(DateTime dateTime, boolean z) {
            super(dateTime, null);
            this.timestamp = dateTime;
            this.canStart = z;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$None;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "timestamp", "Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "canStart", "", "getCanStart", "()Z", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class None extends DownloadStatus {
        private final DateTime timestamp;

        public None() {
            this(null, 1, null);
        }

        public /* synthetic */ None(DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(dateTime);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getTimestamp(), (java.lang.Object) ((com.bamtech.sdk4.media.offline.DownloadStatus.None) r2).getTimestamp()) != false) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0019
                boolean r0 = r2 instanceof com.bamtech.sdk4.media.offline.DownloadStatus.None
                if (r0 == 0) goto L_0x0017
                com.bamtech.sdk4.media.offline.DownloadStatus$None r2 = (com.bamtech.sdk4.media.offline.DownloadStatus.None) r2
                org.joda.time.DateTime r0 = r1.getTimestamp()
                org.joda.time.DateTime r2 = r2.getTimestamp()
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r2 = 0
                return r2
            L_0x0019:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.offline.DownloadStatus.None.equals(java.lang.Object):boolean");
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            DateTime timestamp2 = getTimestamp();
            if (timestamp2 != null) {
                return timestamp2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("None(timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public None(DateTime dateTime) {
            super(dateTime, null);
            this.timestamp = dateTime;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$Paused;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "bytesDownloaded", "", "percentageComplete", "", "timestamp", "Lorg/joda/time/DateTime;", "(JFLorg/joda/time/DateTime;)V", "getBytesDownloaded", "()J", "canCancel", "", "getCanCancel", "()Z", "canResume", "getCanResume", "isActive", "isRenewable", "getPercentageComplete", "()F", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class Paused extends DownloadStatus implements DownloadProgress {
        private final long bytesDownloaded;
        private final boolean canResume;
        private final float percentageComplete;
        private final DateTime timestamp;

        public /* synthetic */ Paused(long j, float f, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(j, f, dateTime);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Paused) {
                    Paused paused = (Paused) obj;
                    if (!(getBytesDownloaded() == paused.getBytesDownloaded()) || Float.compare(getPercentageComplete(), paused.getPercentageComplete()) != 0 || !C12880j.m40224a((Object) getTimestamp(), (Object) paused.getTimestamp())) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public boolean getCanResume() {
            return this.canResume;
        }

        public float getPercentageComplete() {
            return this.percentageComplete;
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            long bytesDownloaded2 = getBytesDownloaded();
            int floatToIntBits = ((((int) (bytesDownloaded2 ^ (bytesDownloaded2 >>> 32))) * 31) + Float.floatToIntBits(getPercentageComplete())) * 31;
            DateTime timestamp2 = getTimestamp();
            return floatToIntBits + (timestamp2 != null ? timestamp2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Paused(bytesDownloaded=");
            sb.append(getBytesDownloaded());
            sb.append(", percentageComplete=");
            sb.append(getPercentageComplete());
            sb.append(", timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public Paused(long j, float f, DateTime dateTime) {
            super(dateTime, null);
            this.bytesDownloaded = j;
            this.percentageComplete = f;
            this.timestamp = dateTime;
            this.canResume = true;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$Queued;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "bytesDownloaded", "", "percentageComplete", "", "timestamp", "Lorg/joda/time/DateTime;", "(JFLorg/joda/time/DateTime;)V", "getBytesDownloaded", "()J", "canCancel", "", "getCanCancel", "()Z", "canSuspend", "getCanSuspend", "isActive", "isRenewable", "getPercentageComplete", "()F", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class Queued extends DownloadStatus implements DownloadProgress {
        private final long bytesDownloaded;
        private final float percentageComplete;
        private final DateTime timestamp;

        public /* synthetic */ Queued(long j, float f, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(j, f, dateTime);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Queued) {
                    Queued queued = (Queued) obj;
                    if (!(getBytesDownloaded() == queued.getBytesDownloaded()) || Float.compare(getPercentageComplete(), queued.getPercentageComplete()) != 0 || !C12880j.m40224a((Object) getTimestamp(), (Object) queued.getTimestamp())) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public float getPercentageComplete() {
            return this.percentageComplete;
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            long bytesDownloaded2 = getBytesDownloaded();
            int floatToIntBits = ((((int) (bytesDownloaded2 ^ (bytesDownloaded2 >>> 32))) * 31) + Float.floatToIntBits(getPercentageComplete())) * 31;
            DateTime timestamp2 = getTimestamp();
            return floatToIntBits + (timestamp2 != null ? timestamp2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Queued(bytesDownloaded=");
            sb.append(getBytesDownloaded());
            sb.append(", percentageComplete=");
            sb.append(getPercentageComplete());
            sb.append(", timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public Queued(long j, float f, DateTime dateTime) {
            super(dateTime, null);
            this.bytesDownloaded = j;
            this.percentageComplete = f;
            this.timestamp = dateTime;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$Requested;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "bytesDownloaded", "", "percentageComplete", "", "timestamp", "Lorg/joda/time/DateTime;", "(JFLorg/joda/time/DateTime;)V", "getBytesDownloaded", "()J", "canCancel", "", "getCanCancel", "()Z", "canSuspend", "getCanSuspend", "isActive", "getPercentageComplete", "()F", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class Requested extends DownloadStatus implements DownloadProgress {
        private final long bytesDownloaded;
        private final float percentageComplete;
        private final DateTime timestamp;

        public /* synthetic */ Requested(long j, float f, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(j, f, dateTime);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Requested) {
                    Requested requested = (Requested) obj;
                    if (!(getBytesDownloaded() == requested.getBytesDownloaded()) || Float.compare(getPercentageComplete(), requested.getPercentageComplete()) != 0 || !C12880j.m40224a((Object) getTimestamp(), (Object) requested.getTimestamp())) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public float getPercentageComplete() {
            return this.percentageComplete;
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            long bytesDownloaded2 = getBytesDownloaded();
            int floatToIntBits = ((((int) (bytesDownloaded2 ^ (bytesDownloaded2 >>> 32))) * 31) + Float.floatToIntBits(getPercentageComplete())) * 31;
            DateTime timestamp2 = getTimestamp();
            return floatToIntBits + (timestamp2 != null ? timestamp2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested(bytesDownloaded=");
            sb.append(getBytesDownloaded());
            sb.append(", percentageComplete=");
            sb.append(getPercentageComplete());
            sb.append(", timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public Requested(long j, float f, DateTime dateTime) {
            super(dateTime, null);
            this.bytesDownloaded = j;
            this.percentageComplete = f;
            this.timestamp = dateTime;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadStatus$Tombstoned;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "timestamp", "Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadStatus.kt */
    public static final class Tombstoned extends DownloadStatus {
        private final DateTime timestamp;

        public Tombstoned() {
            this(null, 1, null);
        }

        public /* synthetic */ Tombstoned(DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                dateTime = DateTime.now(DateTimeZone.UTC);
                C12880j.m40222a((Object) dateTime, "DateTime.now(DateTimeZone.UTC)");
            }
            this(dateTime);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getTimestamp(), (java.lang.Object) ((com.bamtech.sdk4.media.offline.DownloadStatus.Tombstoned) r2).getTimestamp()) != false) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0019
                boolean r0 = r2 instanceof com.bamtech.sdk4.media.offline.DownloadStatus.Tombstoned
                if (r0 == 0) goto L_0x0017
                com.bamtech.sdk4.media.offline.DownloadStatus$Tombstoned r2 = (com.bamtech.sdk4.media.offline.DownloadStatus.Tombstoned) r2
                org.joda.time.DateTime r0 = r1.getTimestamp()
                org.joda.time.DateTime r2 = r2.getTimestamp()
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r2 = 0
                return r2
            L_0x0019:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.offline.DownloadStatus.Tombstoned.equals(java.lang.Object):boolean");
        }

        public DateTime getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            DateTime timestamp2 = getTimestamp();
            if (timestamp2 != null) {
                return timestamp2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Tombstoned(timestamp=");
            sb.append(getTimestamp());
            sb.append(")");
            return sb.toString();
        }

        public Tombstoned(DateTime dateTime) {
            super(dateTime, null);
            this.timestamp = dateTime;
        }
    }

    private DownloadStatus(DateTime dateTime) {
        this.timestamp = dateTime;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!C12895y.m40230a(getClass()).isInstance(obj)) {
            return false;
        }
        if (this instanceof DownloadProgress) {
            DownloadProgress downloadProgress = (DownloadProgress) this;
            long bytesDownloaded = downloadProgress.getBytesDownloaded();
            if (obj != null) {
                DownloadProgress downloadProgress2 = (DownloadProgress) obj;
                if (!(bytesDownloaded == downloadProgress2.getBytesDownloaded() && downloadProgress.getPercentageComplete() == downloadProgress2.getPercentageComplete())) {
                    z = false;
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.media.offline.DownloadProgress");
            }
        }
        return z;
    }

    public boolean getCanResume() {
        return this.canResume;
    }

    public final String getName() {
        String simpleName = getClass().getSimpleName();
        C12880j.m40222a((Object) simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    public DateTime getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String qualifiedName = C12895y.m40230a(getClass()).getQualifiedName();
        int hashCode = qualifiedName != null ? qualifiedName.hashCode() : getTimestamp().hashCode();
        if (!(this instanceof DownloadProgress)) {
            return hashCode;
        }
        DownloadProgress downloadProgress = (DownloadProgress) this;
        return (((hashCode * 31) + Long.valueOf(downloadProgress.getBytesDownloaded()).hashCode()) * 31) + Float.valueOf(downloadProgress.getPercentageComplete()).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadStatus(");
        sb.append("status=");
        sb.append(getName());
        String str = ", ";
        sb.append(str);
        sb.append("bytesDownloaded=");
        boolean z = this instanceof DownloadProgress;
        Float f = null;
        DownloadProgress downloadProgress = (DownloadProgress) (!z ? null : this);
        sb.append(downloadProgress != null ? Long.valueOf(downloadProgress.getBytesDownloaded()) : null);
        sb.append(str);
        sb.append("percentageComplete=");
        DownloadProgress downloadProgress2 = (DownloadProgress) (!z ? null : this);
        if (downloadProgress2 != null) {
            f = Float.valueOf(downloadProgress2.getPercentageComplete());
        }
        sb.append(f);
        sb.append(str);
        sb.append("timestamp=");
        sb.append(getTimestamp());
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ DownloadStatus(DateTime dateTime, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTime);
    }
}
