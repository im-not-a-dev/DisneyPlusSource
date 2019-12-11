package com.bamtechmedia.dominguez.core.content.collections;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/DmcUrl;", "Landroid/os/Parcelable;", "url", "", "regions", "", "(Ljava/lang/String;Ljava/util/List;)V", "getRegions", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcVideoArt.kt */
public final class DmcUrl implements Parcelable {
    public static final Creator CREATOR = new C3655a();

    /* renamed from: U */
    private final List<String> f9182U;

    /* renamed from: c */
    private final String f9183c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.DmcUrl$a */
    public static class C3655a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DmcUrl(parcel.readString(), parcel.createStringArrayList());
        }

        public final Object[] newArray(int i) {
            return new DmcUrl[i];
        }
    }

    public DmcUrl(String str, List<String> list) {
        this.f9183c = str;
        this.f9182U = list;
    }

    /* renamed from: X */
    public final List<String> mo13311X() {
        return this.f9182U;
    }

    public int describeContents() {
        return 0;
    }

    public final String getUrl() {
        return this.f9183c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9183c);
        parcel.writeStringList(this.f9182U);
    }
}
