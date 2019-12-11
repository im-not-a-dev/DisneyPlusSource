package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\bHÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006)"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaMetadata;", "activeAspectRatio", "", "format", "", "videoFeatures", "", "audioTracks", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "(Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getActiveAspectRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAudioTracks", "()Ljava/util/List;", "getFormat", "()Ljava/lang/String;", "getVideoFeatures", "audioFeatures", "language", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcMediaMetadata.kt */
public final class DmcMediaMetadata implements Parcelable, C3638l {
    public static final Creator CREATOR = new C3600a();

    /* renamed from: U */
    private final String f9006U;

    /* renamed from: V */
    private final List<String> f9007V;

    /* renamed from: W */
    private final List<Language> f9008W;

    /* renamed from: c */
    private final Float f9009c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata$a */
    public static class C3600a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Float valueOf = parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null;
            String readString = parcel.readString();
            ArrayList createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Language) parcel.readParcelable(DmcMediaMetadata.class.getClassLoader()));
                readInt--;
            }
            return new DmcMediaMetadata(valueOf, readString, createStringArrayList, arrayList);
        }

        public final Object[] newArray(int i) {
            return new DmcMediaMetadata[i];
        }
    }

    public DmcMediaMetadata(Float f, String str, @C11724g(name = "features") List<String> list, List<Language> list2) {
        this.f9009c = f;
        this.f9006U = str;
        this.f9007V = list;
        this.f9008W = list2;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.Language>, for r4v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata m12176a(com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata r0, java.lang.Float r1, java.lang.String r2, java.util.List r3, java.util.List<com.bamtechmedia.dominguez.core.content.assets.Language> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0008
            java.lang.Float r1 = r0.mo12957n()
        L_0x0008:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x0010
            java.lang.String r2 = r0.getFormat()
        L_0x0010:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0018
            java.util.List r3 = r0.mo12950X()
        L_0x0018:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x001e
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.Language> r4 = r0.f9008W
        L_0x001e:
            com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata.m12176a(com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata, java.lang.Float, java.lang.String, java.util.List, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata");
    }

    /* renamed from: X */
    public List<String> mo12950X() {
        return this.f9007V;
    }

    public final DmcMediaMetadata copy(Float f, String str, @C11724g(name = "features") List<String> list, List<Language> list2) {
        return new DmcMediaMetadata(f, str, list, list2);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9008W, (java.lang.Object) r3.f9008W) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata
            if (r0 == 0) goto L_0x003d
            com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata r3 = (com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata) r3
            java.lang.Float r0 = r2.mo12957n()
            java.lang.Float r1 = r3.mo12957n()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r2.getFormat()
            java.lang.String r1 = r3.getFormat()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r2.mo12950X()
            java.util.List r1 = r3.mo12950X()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003d
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.Language> r0 = r2.f9008W
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.Language> r3 = r3.f9008W
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = 0
            return r3
        L_0x003f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata.equals(java.lang.Object):boolean");
    }

    public String getFormat() {
        return this.f9006U;
    }

    public int hashCode() {
        Float n = mo12957n();
        int i = 0;
        int hashCode = (n != null ? n.hashCode() : 0) * 31;
        String format = getFormat();
        int hashCode2 = (hashCode + (format != null ? format.hashCode() : 0)) * 31;
        List X = mo12950X();
        int hashCode3 = (hashCode2 + (X != null ? X.hashCode() : 0)) * 31;
        List<Language> list = this.f9008W;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: l */
    public final List<Language> mo12956l() {
        return this.f9008W;
    }

    /* renamed from: n */
    public Float mo12957n() {
        return this.f9009c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcMediaMetadata(activeAspectRatio=");
        sb.append(mo12957n());
        sb.append(", format=");
        sb.append(getFormat());
        sb.append(", videoFeatures=");
        sb.append(mo12950X());
        sb.append(", audioTracks=");
        sb.append(this.f9008W);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Float f = this.f9009c;
        if (f != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f9006U);
        parcel.writeStringList(this.f9007V);
        List<Language> list = this.f9008W;
        parcel.writeInt(list.size());
        for (Language writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public /* synthetic */ DmcMediaMetadata(Float f, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            f = null;
        }
        this(f, str, list, list2);
    }
}
