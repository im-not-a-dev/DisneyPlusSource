package com.bamtechmedia.dominguez.offline;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtech.sdk4.media.offline.DownloadErrorReason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 N2\u00020\u0001:\u0001NBj\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u000f\b\u0002\u0010\u0013\u001a\t\u0018\u00010\u0014¢\u0006\u0002\b\u0015¢\u0006\u0002\u0010\u0016J\r\u00105\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0010\u00106\u001a\t\u0018\u00010\u0014¢\u0006\u0002\b\u0015HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0007HÂ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\r\u0010=\u001a\u00060\u0003j\u0002`\u0011HÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J~\u0010?\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\b\u0002\u0010\u0010\u001a\u00060\u0003j\u0002`\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u000f\b\u0002\u0010\u0013\u001a\t\u0018\u00010\u0014¢\u0006\u0002\b\u0015HÆ\u0001J\u001a\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020.2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\t\u0010B\u001a\u00020CHÖ\u0001J\u0013\u0010D\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020CHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0019\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020CHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0013\u001a\t\u0018\u00010\u0014¢\u0006\u0002\b\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0011\u0010 \u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010!\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0010\u001a\u00060\u0003j\u0002`\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0018\u0010-\u001a\u00020\u000b*\u00020.8BX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u00101\u001a\u00020\t*\u00020.8BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020.8BX\u0004¢\u0006\u0006\u001a\u0004\b*\u00104¨\u0006O"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/offline/DownloadState;", "Landroid/os/Parcelable;", "contentId", "", "Lcom/bamtechmedia/dominguez/core/content/ContentId;", "playbackUrl", "status", "Lcom/bamtechmedia/dominguez/offline/Status;", "completePercentage", "", "downloadedBytes", "", "isActive", "", "licenseExpiration", "Lorg/joda/time/DateTime;", "storageLocation", "Lcom/bamtechmedia/dominguez/offline/StorageId;", "predictedSize", "errorReason", "Lcom/bamtech/sdk4/media/offline/DownloadErrorReason;", "Lkotlinx/android/parcel/RawValue;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/offline/Status;FJZLorg/joda/time/DateTime;Ljava/lang/String;JLcom/bamtech/sdk4/media/offline/DownloadErrorReason;)V", "getCompletePercentage", "()F", "getContentId", "()Ljava/lang/String;", "getDownloadedBytes", "()J", "getErrorReason", "()Lcom/bamtech/sdk4/media/offline/DownloadErrorReason;", "()Z", "isLicenseExpired", "isStoredInternal", "getLicenseExpiration", "()Lorg/joda/time/DateTime;", "mediaDescriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "getMediaDescriptor", "()Lcom/bamtech/sdk4/media/MediaDescriptor;", "getPlaybackUrl", "getPredictedSize", "getStatus", "()Lcom/bamtechmedia/dominguez/offline/Status;", "getStorageLocation", "bytesDownloaded", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "getBytesDownloaded", "(Lcom/bamtech/sdk4/media/offline/DownloadStatus;)J", "percentageComplete", "getPercentageComplete", "(Lcom/bamtech/sdk4/media/offline/DownloadStatus;)F", "(Lcom/bamtech/sdk4/media/offline/DownloadStatus;)Lcom/bamtechmedia/dominguez/offline/Status;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copyWith", "downloadStatus", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.offline.d */
/* compiled from: DownloadState.kt */
public final class C6243d implements Parcelable {
    public static final Creator CREATOR = new C6245b();

    /* renamed from: d0 */
    public static final C6244a f14276d0 = new C6244a(null);

    /* renamed from: U */
    private final String f14277U;

    /* renamed from: V */
    private final C6246e f14278V;

    /* renamed from: W */
    private final float f14279W;

    /* renamed from: X */
    private final long f14280X;

    /* renamed from: Y */
    private final boolean f14281Y;

    /* renamed from: Z */
    private final DateTime f14282Z;

    /* renamed from: a0 */
    private final String f14283a0;

    /* renamed from: b0 */
    private final long f14284b0;

    /* renamed from: c */
    private final String f14285c;

    /* renamed from: c0 */
    private final DownloadErrorReason f14286c0;

    /* renamed from: com.bamtechmedia.dominguez.offline.d$a */
    /* compiled from: DownloadState.kt */
    public static final class C6244a {
        private C6244a() {
        }

        /* renamed from: a */
        public static /* synthetic */ C6243d m19736a(C6244a aVar, C6246e eVar, String str, String str2, float f, long j, boolean z, DateTime dateTime, String str3, long j2, int i, Object obj) {
            int i2 = i;
            C6246e eVar2 = (i2 & 1) != 0 ? C6246e.NONE : eVar;
            String str4 = "";
            String str5 = (i2 & 2) != 0 ? str4 : str;
            if ((i2 & 4) == 0) {
                str4 = str2;
            }
            float f2 = (i2 & 8) != 0 ? 0.0f : f;
            long j3 = 0;
            long j4 = (i2 & 16) != 0 ? 0 : j;
            boolean z2 = (i2 & 32) != 0 ? false : z;
            DateTime dateTime2 = (i2 & 64) != 0 ? null : dateTime;
            String str6 = (i2 & 128) != 0 ? "Internal" : str3;
            if ((i2 & 256) == 0) {
                j3 = j2;
            }
            return aVar.mo18841a(eVar2, str5, str4, f2, j4, z2, dateTime2, str6, j3);
        }

        public /* synthetic */ C6244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6243d mo18841a(C6246e eVar, String str, String str2, float f, long j, boolean z, DateTime dateTime, String str3, long j2) {
            C6243d dVar = new C6243d(str, str2, eVar, f, j, z, dateTime, str3, j2, null, DateUtils.FORMAT_NO_NOON, null);
            return dVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.offline.d$b */
    public static class C6245b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C6243d dVar = new C6243d(parcel.readString(), parcel.readString(), (C6246e) Enum.valueOf(C6246e.class, parcel.readString()), parcel.readFloat(), parcel.readLong(), parcel.readInt() != 0, (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readLong(), (DownloadErrorReason) parcel.readValue(DownloadErrorReason.class.getClassLoader()));
            return dVar;
        }

        public final Object[] newArray(int i) {
            return new C6243d[i];
        }
    }

    public C6243d(String str, String str2, C6246e eVar, float f, long j, boolean z, DateTime dateTime, String str3, long j2, DownloadErrorReason downloadErrorReason) {
        this.f14285c = str;
        this.f14277U = str2;
        this.f14278V = eVar;
        this.f14279W = f;
        this.f14280X = j;
        this.f14281Y = z;
        this.f14282Z = dateTime;
        this.f14283a0 = str3;
        this.f14284b0 = j2;
        this.f14286c0 = downloadErrorReason;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6243d) {
                C6243d dVar = (C6243d) obj;
                if (Intrinsics.areEqual((Object) this.f14285c, (Object) dVar.f14285c) && Intrinsics.areEqual((Object) this.f14277U, (Object) dVar.f14277U) && Intrinsics.areEqual((Object) this.f14278V, (Object) dVar.f14278V) && Float.compare(this.f14279W, dVar.f14279W) == 0) {
                    if (this.f14280X == dVar.f14280X) {
                        if ((this.f14281Y == dVar.f14281Y) && Intrinsics.areEqual((Object) this.f14282Z, (Object) dVar.f14282Z) && Intrinsics.areEqual((Object) this.f14283a0, (Object) dVar.f14283a0)) {
                            if (!(this.f14284b0 == dVar.f14284b0) || !Intrinsics.areEqual((Object) this.f14286c0, (Object) dVar.f14286c0)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f14285c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14277U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C6246e eVar = this.f14278V;
        int hashCode3 = (((hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f14279W)) * 31;
        long j = this.f14280X;
        int i2 = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f14281Y;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        DateTime dateTime = this.f14282Z;
        int hashCode4 = (i3 + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        String str3 = this.f14283a0;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j2 = this.f14284b0;
        int i4 = (hashCode5 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        DownloadErrorReason downloadErrorReason = this.f14286c0;
        if (downloadErrorReason != null) {
            i = downloadErrorReason.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadState(contentId=");
        sb.append(this.f14285c);
        sb.append(", playbackUrl=");
        sb.append(this.f14277U);
        sb.append(", status=");
        sb.append(this.f14278V);
        sb.append(", completePercentage=");
        sb.append(this.f14279W);
        sb.append(", downloadedBytes=");
        sb.append(this.f14280X);
        sb.append(", isActive=");
        sb.append(this.f14281Y);
        sb.append(", licenseExpiration=");
        sb.append(this.f14282Z);
        sb.append(", storageLocation=");
        sb.append(this.f14283a0);
        sb.append(", predictedSize=");
        sb.append(this.f14284b0);
        sb.append(", errorReason=");
        sb.append(this.f14286c0);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14285c);
        parcel.writeString(this.f14277U);
        parcel.writeString(this.f14278V.name());
        parcel.writeFloat(this.f14279W);
        parcel.writeLong(this.f14280X);
        parcel.writeInt(this.f14281Y ? 1 : 0);
        parcel.writeSerializable(this.f14282Z);
        parcel.writeString(this.f14283a0);
        parcel.writeLong(this.f14284b0);
        parcel.writeValue(this.f14286c0);
    }

    public /* synthetic */ C6243d(String str, String str2, C6246e eVar, float f, long j, boolean z, DateTime dateTime, String str3, long j2, DownloadErrorReason downloadErrorReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, str2, eVar, f, j, z, dateTime, str3, (i2 & 256) != 0 ? 0 : j2, (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? null : downloadErrorReason);
    }
}
