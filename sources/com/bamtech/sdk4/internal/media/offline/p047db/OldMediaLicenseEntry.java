package com.bamtech.sdk4.internal.media.offline.p047db;

import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010(\u001a\u00020\bH\u0016J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/OldMediaLicenseEntry;", "", "mediaId", "", "license", "", "audioLicense", "retryCount", "", "lastFailure", "Lorg/joda/time/DateTime;", "permanently", "", "(Ljava/lang/String;[B[BILorg/joda/time/DateTime;Z)V", "getAudioLicense", "()[B", "id", "", "getId", "()J", "setId", "(J)V", "getLastFailure", "()Lorg/joda/time/DateTime;", "getLicense", "getMediaId", "()Ljava/lang/String;", "getPermanently", "()Z", "getRetryCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry */
/* compiled from: OldMediaLicenseEntry.kt */
public final class OldMediaLicenseEntry {
    private final byte[] audioLicense;

    /* renamed from: id */
    private long f6076id;
    private final DateTime lastFailure;
    private final byte[] license;
    private final String mediaId;
    private final boolean permanently;
    private final int retryCount;

    public OldMediaLicenseEntry(String str, byte[] bArr, byte[] bArr2, int i, DateTime dateTime, boolean z) {
        this.mediaId = str;
        this.license = bArr;
        this.audioLicense = bArr2;
        this.retryCount = i;
        this.lastFailure = dateTime;
        this.permanently = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) OldMediaLicenseEntry.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            if (this.f6076id != ((OldMediaLicenseEntry) obj).f6076id) {
                z = false;
            }
            return z;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry");
    }

    public final byte[] getAudioLicense() {
        return this.audioLicense;
    }

    public final long getId() {
        return this.f6076id;
    }

    public final DateTime getLastFailure() {
        return this.lastFailure;
    }

    public final byte[] getLicense() {
        return this.license;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final boolean getPermanently() {
        return this.permanently;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public int hashCode() {
        return Long.valueOf(this.f6076id).hashCode();
    }

    public final void setId(long j) {
        this.f6076id = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OldMediaLicenseEntry(mediaId=");
        sb.append(this.mediaId);
        sb.append(", license=");
        sb.append(Arrays.toString(this.license));
        sb.append(", audioLicense=");
        sb.append(Arrays.toString(this.audioLicense));
        sb.append(", retryCount=");
        sb.append(this.retryCount);
        sb.append(", lastFailure=");
        sb.append(this.lastFailure);
        sb.append(", permanently=");
        sb.append(this.permanently);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ OldMediaLicenseEntry(String str, byte[] bArr, byte[] bArr2, int i, DateTime dateTime, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        DateTime dateTime2;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        if ((i2 & 16) != 0) {
            DateTime now = DateTime.now(DateTimeZone.UTC);
            Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now(DateTimeZone.UTC)");
            dateTime2 = now;
        } else {
            dateTime2 = dateTime;
        }
        this(str, bArr, bArr2, i3, dateTime2, (i2 & 32) != 0 ? false : z);
    }
}
