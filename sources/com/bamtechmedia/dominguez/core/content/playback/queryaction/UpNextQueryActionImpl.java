package com.bamtechmedia.dominguez.core.content.playback.queryaction;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.core.content.assets.Availability;
import com.bamtechmedia.dominguez.core.content.assets.C3632f;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl;", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryAction;", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;)V", "mapToProgramType", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextProgramType;", "programType", "", "mapToUpNextType", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextType;", "upNextType", "upNextQuery", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextResult;", "contentId", "Companion", "ItemFrom", "ItemTo", "ParentItemTo", "UpNext", "UpNextResponse", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UpNextQueryActionImpl.kt */
public final class UpNextQueryActionImpl implements C3712b {

    /* renamed from: a */
    private final C3724a f9260a;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemFrom;", "Landroid/os/Parcelable;", "programType", "", "(Ljava/lang/String;)V", "getProgramType", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: UpNextQueryActionImpl.kt */
    public static final class ItemFrom implements Parcelable {
        public static final Creator CREATOR = new C3705a();

        /* renamed from: c */
        private final String f9261c;

        /* renamed from: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemFrom$a */
        public static class C3705a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                return new ItemFrom(parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new ItemFrom[i];
            }
        }

        public ItemFrom(@C11724g(name = "programType") String str) {
            this.f9261c = str;
        }

        public final ItemFrom copy(@C11724g(name = "programType") String str) {
            return new ItemFrom(str);
        }

        public int describeContents() {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f9261c, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemFrom) r2).f9261c) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemFrom
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemFrom r2 = (com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemFrom) r2
                java.lang.String r0 = r1.f9261c
                java.lang.String r2 = r2.f9261c
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemFrom.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f9261c;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        /* renamed from: r */
        public final String mo13482r() {
            return this.f9261c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ItemFrom(programType=");
            sb.append(this.f9261c);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f9261c);
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemTo;", "Landroid/os/Parcelable;", "programType", "", "(Ljava/lang/String;)V", "getProgramType", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: UpNextQueryActionImpl.kt */
    public static final class ItemTo implements Parcelable {
        public static final Creator CREATOR = new C3706a();

        /* renamed from: c */
        private final String f9262c;

        /* renamed from: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemTo$a */
        public static class C3706a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                return new ItemTo(parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new ItemTo[i];
            }
        }

        public ItemTo(@C11724g(name = "programType") String str) {
            this.f9262c = str;
        }

        public final ItemTo copy(@C11724g(name = "programType") String str) {
            return new ItemTo(str);
        }

        public int describeContents() {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f9262c, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemTo) r2).f9262c) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemTo
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemTo r2 = (com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemTo) r2
                java.lang.String r0 = r1.f9262c
                java.lang.String r2 = r2.f9262c
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemTo.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f9262c;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        /* renamed from: r */
        public final String mo13491r() {
            return this.f9262c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ItemTo(programType=");
            sb.append(this.f9262c);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f9262c);
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ParentItemTo;", "Landroid/os/Parcelable;", "currentAvailability", "Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "(Lcom/bamtechmedia/dominguez/core/content/assets/Availability;)V", "getCurrentAvailability", "()Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: UpNextQueryActionImpl.kt */
    public static final class ParentItemTo implements Parcelable {
        public static final Creator CREATOR = new C3707a();

        /* renamed from: c */
        private final Availability f9263c;

        /* renamed from: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ParentItemTo$a */
        public static class C3707a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                return new ParentItemTo((Availability) parcel.readParcelable(ParentItemTo.class.getClassLoader()));
            }

            public final Object[] newArray(int i) {
                return new ParentItemTo[i];
            }
        }

        public ParentItemTo(@C11724g(name = "currentAvailability") Availability availability) {
            this.f9263c = availability;
        }

        /* renamed from: X */
        public final Availability mo13496X() {
            return this.f9263c;
        }

        public final ParentItemTo copy(@C11724g(name = "currentAvailability") Availability availability) {
            return new ParentItemTo(availability);
        }

        public int describeContents() {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f9263c, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ParentItemTo) r2).f9263c) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ParentItemTo
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ParentItemTo r2 = (com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ParentItemTo) r2
                com.bamtechmedia.dominguez.core.content.assets.Availability r0 = r1.f9263c
                com.bamtechmedia.dominguez.core.content.assets.Availability r2 = r2.f9263c
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ParentItemTo.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Availability availability = this.f9263c;
            if (availability != null) {
                return availability.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ParentItemTo(currentAvailability=");
            sb.append(this.f9263c);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f9263c, i);
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$UpNext;", "Landroid/os/Parcelable;", "upNextElements", "", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAsset;", "upNextType", "", "itemFrom", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemFrom;", "itemTo", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemTo;", "parentItemTo", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ParentItemTo;", "(Ljava/util/List;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemFrom;Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemTo;Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ParentItemTo;)V", "getItemFrom", "()Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemFrom;", "getItemTo", "()Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemTo;", "getParentItemTo", "()Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ParentItemTo;", "getUpNextElements", "()Ljava/util/List;", "getUpNextType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: UpNextQueryActionImpl.kt */
    public static final class UpNext implements Parcelable {
        public static final Creator CREATOR = new C3708a();

        /* renamed from: U */
        private final String f9264U;

        /* renamed from: V */
        private final ItemFrom f9265V;

        /* renamed from: W */
        private final ItemTo f9266W;

        /* renamed from: X */
        private final ParentItemTo f9267X;

        /* renamed from: c */
        private final List<C3632f> f9268c;

        /* renamed from: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$UpNext$a */
        public static class C3708a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((C3632f) parcel.readParcelable(UpNext.class.getClassLoader()));
                    readInt--;
                }
                UpNext upNext = new UpNext(arrayList, parcel.readString(), parcel.readInt() != 0 ? (ItemFrom) ItemFrom.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ItemTo) ItemTo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParentItemTo) ParentItemTo.CREATOR.createFromParcel(parcel) : null);
                return upNext;
            }

            public final Object[] newArray(int i) {
                return new UpNext[i];
            }
        }

        public UpNext(@C11724g(name = "items") List<? extends C3632f> list, @C11724g(name = "upNextType") String str, @C11724g(name = "itemFrom") ItemFrom itemFrom, @C11724g(name = "itemTo") ItemTo itemTo, @C11724g(name = "parentItemTo") ParentItemTo parentItemTo) {
            this.f9268c = list;
            this.f9264U = str;
            this.f9265V = itemFrom;
            this.f9266W = itemTo;
            this.f9267X = parentItemTo;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.f>, for r4v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNext m12604a(com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNext r3, java.util.List<com.bamtechmedia.dominguez.core.content.assets.C3632f> r4, java.lang.String r5, com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemFrom r6, com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemTo r7, com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ParentItemTo r8, int r9, java.lang.Object r10) {
            /*
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0006
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.f> r4 = r3.f9268c
            L_0x0006:
                r10 = r9 & 2
                if (r10 == 0) goto L_0x000c
                java.lang.String r5 = r3.f9264U
            L_0x000c:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemFrom r6 = r3.f9265V
            L_0x0013:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L_0x001a
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemTo r7 = r3.f9266W
            L_0x001a:
                r1 = r7
                r5 = r9 & 16
                if (r5 == 0) goto L_0x0021
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ParentItemTo r8 = r3.f9267X
            L_0x0021:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r10 = r2
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$UpNext r3 = r5.copy(r6, r7, r8, r9, r10)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNext.m12604a(com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$UpNext, java.util.List, java.lang.String, com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemFrom, com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemTo, com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ParentItemTo, int, java.lang.Object):com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$UpNext");
        }

        /* renamed from: X */
        public final ItemFrom mo13505X() {
            return this.f9265V;
        }

        /* renamed from: Y */
        public final ItemTo mo13506Y() {
            return this.f9266W;
        }

        /* renamed from: Z */
        public final ParentItemTo mo13507Z() {
            return this.f9267X;
        }

        /* renamed from: a0 */
        public final List<C3632f> mo13508a0() {
            return this.f9268c;
        }

        /* renamed from: b0 */
        public final String mo13509b0() {
            return this.f9264U;
        }

        public final UpNext copy(@C11724g(name = "items") List<? extends C3632f> list, @C11724g(name = "upNextType") String str, @C11724g(name = "itemFrom") ItemFrom itemFrom, @C11724g(name = "itemTo") ItemTo itemTo, @C11724g(name = "parentItemTo") ParentItemTo parentItemTo) {
            UpNext upNext = new UpNext(list, str, itemFrom, itemTo, parentItemTo);
            return upNext;
        }

        public int describeContents() {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f9267X, (java.lang.Object) r3.f9267X) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x003d
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNext
                if (r0 == 0) goto L_0x003b
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$UpNext r3 = (com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNext) r3
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.f> r0 = r2.f9268c
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.f> r1 = r3.f9268c
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f9264U
                java.lang.String r1 = r3.f9264U
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemFrom r0 = r2.f9265V
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemFrom r1 = r3.f9265V
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemTo r0 = r2.f9266W
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ItemTo r1 = r3.f9266W
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x003b
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ParentItemTo r0 = r2.f9267X
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$ParentItemTo r3 = r3.f9267X
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r3 = 0
                return r3
            L_0x003d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNext.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List<C3632f> list = this.f9268c;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f9264U;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            ItemFrom itemFrom = this.f9265V;
            int hashCode3 = (hashCode2 + (itemFrom != null ? itemFrom.hashCode() : 0)) * 31;
            ItemTo itemTo = this.f9266W;
            int hashCode4 = (hashCode3 + (itemTo != null ? itemTo.hashCode() : 0)) * 31;
            ParentItemTo parentItemTo = this.f9267X;
            if (parentItemTo != null) {
                i = parentItemTo.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpNext(upNextElements=");
            sb.append(this.f9268c);
            sb.append(", upNextType=");
            sb.append(this.f9264U);
            sb.append(", itemFrom=");
            sb.append(this.f9265V);
            sb.append(", itemTo=");
            sb.append(this.f9266W);
            sb.append(", parentItemTo=");
            sb.append(this.f9267X);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            List<C3632f> list = this.f9268c;
            parcel.writeInt(list.size());
            for (C3632f writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
            parcel.writeString(this.f9264U);
            ItemFrom itemFrom = this.f9265V;
            if (itemFrom != null) {
                parcel.writeInt(1);
                itemFrom.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            ItemTo itemTo = this.f9266W;
            if (itemTo != null) {
                parcel.writeInt(1);
                itemTo.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            ParentItemTo parentItemTo = this.f9267X;
            if (parentItemTo != null) {
                parcel.writeInt(1);
                parentItemTo.writeToParcel(parcel, 0);
                return;
            }
            parcel.writeInt(0);
        }

        public /* synthetic */ UpNext(List list, String str, ItemFrom itemFrom, ItemTo itemTo, ParentItemTo parentItemTo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            this(list, str, itemFrom, itemTo, parentItemTo);
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$UpNextResponse;", "", "upNext", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$UpNext;", "(Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$UpNext;)V", "getUpNext", "()Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$UpNext;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: UpNextQueryActionImpl.kt */
    public static final class UpNextResponse {

        /* renamed from: a */
        private final UpNext f9269a;

        public UpNextResponse(@C11724g(name = "UpNext") UpNext upNext) {
            this.f9269a = upNext;
        }

        /* renamed from: a */
        public final UpNext mo13518a() {
            return this.f9269a;
        }

        public final UpNextResponse copy(@C11724g(name = "UpNext") UpNext upNext) {
            return new UpNextResponse(upNext);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f9269a, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNextResponse) r2).f9269a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNextResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$UpNextResponse r2 = (com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNextResponse) r2
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$UpNext r0 = r1.f9269a
                com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$UpNext r2 = r2.f9269a
                boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNextResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            UpNext upNext = this.f9269a;
            if (upNext != null) {
                return upNext.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpNextResponse(upNext=");
            sb.append(this.f9269a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$a */
    /* compiled from: UpNextQueryActionImpl.kt */
    public static final class C3709a {
        private C3709a() {
        }

        public /* synthetic */ C3709a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl$b */
    /* compiled from: UpNextQueryActionImpl.kt */
    static final class C3710b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ UpNextQueryActionImpl f9270c;

        C3710b(UpNextQueryActionImpl upNextQueryActionImpl) {
            this.f9270c = upNextQueryActionImpl;
        }

        /* renamed from: a */
        public final C3714d apply(GraphQlResponse<UpNextResponse> graphQlResponse) {
            DateTime dateTime;
            UpNextResponse upNextResponse = (UpNextResponse) graphQlResponse.getData();
            if (upNextResponse != null) {
                UpNext a = upNextResponse.mo13518a();
                if (a != null) {
                    C3632f fVar = (C3632f) C13199w.m40591g(a.mo13508a0());
                    C3715e b = this.f9270c.m12599c(a.mo13509b0());
                    UpNextQueryActionImpl upNextQueryActionImpl = this.f9270c;
                    ItemFrom X = a.mo13505X();
                    C3711a a2 = upNextQueryActionImpl.m12597b(X != null ? X.mo13482r() : null);
                    UpNextQueryActionImpl upNextQueryActionImpl2 = this.f9270c;
                    ItemTo Y = a.mo13506Y();
                    C3711a a3 = upNextQueryActionImpl2.m12597b(Y != null ? Y.mo13491r() : null);
                    ParentItemTo Z = a.mo13507Z();
                    if (Z != null) {
                        Availability X2 = Z.mo13496X();
                        if (X2 != null) {
                            dateTime = X2.mo12825X();
                            C3714d dVar = new C3714d(b, fVar, a2, a3, dateTime);
                            return dVar;
                        }
                    }
                    dateTime = null;
                    C3714d dVar2 = new C3714d(b, fVar, a2, a3, dateTime);
                    return dVar2;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Missing or bad data in GraphQlResponse ");
            sb.append(graphQlResponse);
            throw new AssertionError(sb.toString());
        }
    }

    static {
        new C3709a(null);
    }

    public UpNextQueryActionImpl(C3724a aVar) {
        this.f9260a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C3715e m12599c(String str) {
        C3715e eVar;
        C3715e[] values = C3715e.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = values[i];
            if (C12880j.m40224a((Object) eVar.mo13543a(), (Object) str)) {
                break;
            }
            i++;
        }
        return eVar != null ? eVar : C3715e.NONE;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C3711a m12597b(String str) {
        C3711a aVar;
        C3711a[] values = C3711a.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = values[i];
            if (C12880j.m40224a((Object) aVar.mo13534a(), (Object) str)) {
                break;
            }
            i++;
        }
        return aVar != null ? aVar : C3711a.UNKNOWN;
    }

    /* renamed from: a */
    public Single<C3714d> mo13477a(String str) {
        Single<C3714d> g = this.f9260a.mo13577a(UpNextResponse.class, "core/UpNext", C13170i0.m40332a(C12907r.m40244a("contentId", str)), null).mo30233g(new C3710b(this));
        C12880j.m40222a((Object) g, "searchApi.typedSearch<Up…          )\n            }");
        return g;
    }
}
