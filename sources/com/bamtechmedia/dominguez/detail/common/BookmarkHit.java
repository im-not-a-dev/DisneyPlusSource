package com.bamtechmedia.dominguez.detail.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtechmedia.dominguez.core.content.assets.UserMediaMeta;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/BookmarkHit;", "Landroid/os/Parcelable;", "contentId", "", "userMeta", "Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;)V", "getContentId", "()Ljava/lang/String;", "getUserMeta", "()Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toBookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetailApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: BookmarkHit.kt */
public final class BookmarkHit implements Parcelable {
    public static final Creator CREATOR = new C5893a();

    /* renamed from: U */
    private final UserMediaMeta f13673U;

    /* renamed from: c */
    private final String f13674c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.BookmarkHit$a */
    public static class C5893a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new BookmarkHit(parcel.readString(), (UserMediaMeta) parcel.readParcelable(BookmarkHit.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new BookmarkHit[i];
        }
    }

    public BookmarkHit(String str, UserMediaMeta userMediaMeta) {
        this.f13674c = str;
        this.f13673U = userMediaMeta;
    }

    /* renamed from: X */
    public final UserMediaMeta mo17780X() {
        return this.f13673U;
    }

    /* renamed from: Y */
    public final Bookmark mo17781Y() {
        return this.f13673U.mo13228a(this.f13674c);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13673U, (java.lang.Object) r3.f13673U) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.common.BookmarkHit
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.detail.common.BookmarkHit r3 = (com.bamtechmedia.dominguez.detail.common.BookmarkHit) r3
            java.lang.String r0 = r2.f13674c
            java.lang.String r1 = r3.f13674c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.assets.UserMediaMeta r0 = r2.f13673U
            com.bamtechmedia.dominguez.core.content.assets.UserMediaMeta r3 = r3.f13673U
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.BookmarkHit.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo17784f() {
        return this.f13674c;
    }

    public int hashCode() {
        String str = this.f13674c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UserMediaMeta userMediaMeta = this.f13673U;
        if (userMediaMeta != null) {
            i = userMediaMeta.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BookmarkHit(contentId=");
        sb.append(this.f13674c);
        sb.append(", userMeta=");
        sb.append(this.f13673U);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13674c);
        parcel.writeParcelable(this.f13673U, i);
    }
}
