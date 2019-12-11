package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtech.sdk4.bookmarks.Bookmark;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 22\u00020\u0001:\u00012B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\t\u0010#\u001a\u00020\u0012HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0012HÖ\u0001J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00063"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;", "Landroid/os/Parcelable;", "userId", "", "ccMedia", "", "ccDefault", "occurredOn", "playhead", "runtime", "(Ljava/lang/String;Ljava/lang/Long;JJJJ)V", "getCcDefault", "()J", "getCcMedia", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOccurredOn", "percentageWatched", "", "getPercentageWatched", "()Ljava/lang/Integer;", "getPlayhead", "remainingMinutes", "getRemainingMinutes", "getRuntime", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;JJJJ)Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;", "describeContents", "equals", "", "other", "", "hashCode", "toBookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "contentId", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: UserMediaMeta.kt */
public final class UserMediaMeta implements Parcelable {
    public static final Creator CREATOR = new C3622b();

    /* renamed from: U */
    private final Long f9112U;

    /* renamed from: V */
    private final long f9113V;

    /* renamed from: W */
    private final long f9114W;

    /* renamed from: X */
    private final long f9115X;

    /* renamed from: Y */
    private final long f9116Y;

    /* renamed from: c */
    private final String f9117c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.UserMediaMeta$a */
    /* compiled from: UserMediaMeta.kt */
    public static final class C3621a {
        private C3621a() {
        }

        public /* synthetic */ C3621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.UserMediaMeta$b */
    public static class C3622b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            UserMediaMeta userMediaMeta = new UserMediaMeta(parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            return userMediaMeta;
        }

        public final Object[] newArray(int i) {
            return new UserMediaMeta[i];
        }
    }

    static {
        new C3621a(null);
    }

    public UserMediaMeta(String str, Long l, long j, long j2, long j3, long j4) {
        this.f9117c = str;
        this.f9112U = l;
        this.f9113V = j;
        this.f9114W = j2;
        this.f9115X = j3;
        this.f9116Y = j4;
    }

    /* renamed from: A */
    public final Integer mo13224A() {
        return Integer.valueOf((int) ((((float) 100) * ((float) this.f9115X)) / ((float) this.f9116Y)));
    }

    /* renamed from: X */
    public final long mo13225X() {
        return this.f9113V;
    }

    /* renamed from: Y */
    public final Long mo13226Y() {
        return this.f9112U;
    }

    /* renamed from: Z */
    public final long mo13227Z() {
        return this.f9114W;
    }

    /* renamed from: a */
    public final Bookmark mo13228a(String str) {
        Bookmark bookmark = new Bookmark(str, this.f9115X, this.f9116Y, this.f9117c, this.f9114W, this.f9113V, this.f9112U);
        return bookmark;
    }

    /* renamed from: a0 */
    public final long mo13229a0() {
        return this.f9116Y;
    }

    /* renamed from: b0 */
    public final String mo13230b0() {
        return this.f9117c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserMediaMeta) {
                UserMediaMeta userMediaMeta = (UserMediaMeta) obj;
                if (C12880j.m40224a((Object) this.f9117c, (Object) userMediaMeta.f9117c) && C12880j.m40224a((Object) this.f9112U, (Object) userMediaMeta.f9112U)) {
                    if (this.f9113V == userMediaMeta.f9113V) {
                        if (this.f9114W == userMediaMeta.f9114W) {
                            if (this.f9115X == userMediaMeta.f9115X) {
                                if (this.f9116Y == userMediaMeta.f9116Y) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getPlayhead() {
        return this.f9115X;
    }

    public int hashCode() {
        String str = this.f9117c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.f9112U;
        if (l != null) {
            i = l.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        long j = this.f9113V;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f9114W;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f9115X;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f9116Y;
        return i5 + ((int) (j4 ^ (j4 >>> 32)));
    }

    /* renamed from: m */
    public final Integer mo13235m() {
        return Integer.valueOf((int) TimeUnit.SECONDS.toMinutes(this.f9116Y - this.f9115X));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserMediaMeta(userId=");
        sb.append(this.f9117c);
        sb.append(", ccMedia=");
        sb.append(this.f9112U);
        sb.append(", ccDefault=");
        sb.append(this.f9113V);
        sb.append(", occurredOn=");
        sb.append(this.f9114W);
        sb.append(", playhead=");
        sb.append(this.f9115X);
        sb.append(", runtime=");
        sb.append(this.f9116Y);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9117c);
        Long l = this.f9112U;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.f9113V);
        parcel.writeLong(this.f9114W);
        parcel.writeLong(this.f9115X);
        parcel.writeLong(this.f9116Y);
    }
}
