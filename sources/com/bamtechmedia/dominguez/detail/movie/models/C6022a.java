package com.bamtechmedia.dominguez.detail.movie.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.content.assets.DmcMovie;
import com.bamtechmedia.dominguez.core.content.assets.Participant;
import com.bamtechmedia.dominguez.detail.common.C5982j;
import com.bamtechmedia.dominguez.detail.common.C6003u;
import com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent;
import com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent;
import com.bamtechmedia.dominguez.detail.common.p228e0.C5923c;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J7\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020;HÖ\u0001J\t\u0010A\u001a\u00020\rHÖ\u0001J\u0010\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u001eH\u0016J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020;HÖ\u0001R\u001a\u0010\f\u001a\u00020\rX\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\rX\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@RX\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u000f\u001a\u0004\b+\u0010,R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006I"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/models/DmcMovieDetail;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/detail/movie/models/MovieDetail;", "label", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "video", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;", "extras", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "related", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "(Lcom/bamtechmedia/dominguez/core/content/PromoLabel;Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;)V", "briefDescription", "", "briefDescription$annotations", "()V", "getBriefDescription", "()Ljava/lang/String;", "extraContent", "Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "getExtraContent", "()Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "getExtras", "()Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "getLabel", "()Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "mediumDescription", "mediumDescription$annotations", "getMediumDescription", "<set-?>", "Lcom/bamtechmedia/dominguez/detail/common/metadata/PlayableMetadata;", "metadata", "metadata$annotations", "getMetadata", "()Lcom/bamtechmedia/dominguez/detail/common/metadata/PlayableMetadata;", "movie", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "getMovie", "()Lcom/bamtechmedia/dominguez/core/content/Movie;", "participants", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "participants$annotations", "getParticipants", "()Ljava/util/List;", "getRelated", "()Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "relatedContent", "Lcom/bamtechmedia/dominguez/detail/common/RelatedContent;", "getRelatedContent", "()Lcom/bamtechmedia/dominguez/detail/common/RelatedContent;", "getVideo", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "withMetadata", "playableMetadata", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.movie.models.a */
/* compiled from: MovieDetailsModels.kt */
public final class C6022a implements Parcelable, C6024b {
    public static final Creator CREATOR = new C6023a();

    /* renamed from: U */
    private final List<Participant> f13880U;

    /* renamed from: V */
    private final String f13881V;

    /* renamed from: W */
    private final PromoLabel f13882W;

    /* renamed from: X */
    private final DmcMovie f13883X;

    /* renamed from: Y */
    private final DmcExtraContent f13884Y;

    /* renamed from: Z */
    private final DmcRelatedContent f13885Z;

    /* renamed from: c */
    private transient C5923c f13886c;

    /* renamed from: com.bamtechmedia.dominguez.detail.movie.models.a$a */
    public static class C6023a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            PromoLabel promoLabel = (PromoLabel) parcel.readParcelable(C6022a.class.getClassLoader());
            DmcMovie dmcMovie = (DmcMovie) parcel.readParcelable(C6022a.class.getClassLoader());
            DmcRelatedContent dmcRelatedContent = null;
            DmcExtraContent dmcExtraContent = parcel.readInt() != 0 ? (DmcExtraContent) DmcExtraContent.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                dmcRelatedContent = (DmcRelatedContent) DmcRelatedContent.CREATOR.createFromParcel(parcel);
            }
            return new C6022a(promoLabel, dmcMovie, dmcExtraContent, dmcRelatedContent);
        }

        public final Object[] newArray(int i) {
            return new C6022a[i];
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<com.bamtechmedia.dominguez.core.content.assets.Participant>] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6022a(com.bamtechmedia.dominguez.core.content.PromoLabel r17, com.bamtechmedia.dominguez.core.content.assets.DmcMovie r18, com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r19, com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r20) {
        /*
            r16 = this;
            r0 = r16
            r16.<init>()
            r1 = r17
            r0.f13882W = r1
            r1 = r18
            r0.f13883X = r1
            r1 = r19
            r0.f13884Y = r1
            r1 = r20
            r0.f13885Z = r1
            com.bamtechmedia.dominguez.detail.common.e0.c r15 = new com.bamtechmedia.dominguez.detail.common.e0.c
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r1 = r0.f13883X
            java.lang.String r2 = r1.getTitle()
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r1 = r0.f13883X
            java.lang.String r3 = r1.getDescription()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2044(0x7fc, float:2.864E-42)
            r14 = 0
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.f13886c = r15
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r1 = r0.f13883X
            java.util.List r1 = r1.mo12986z()
            if (r1 == 0) goto L_0x0066
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x004b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.bamtechmedia.dominguez.core.content.assets.Participant r5 = (com.bamtechmedia.dominguez.core.content.assets.Participant) r5
            java.lang.String r5 = r5.mo13150X()
            boolean r5 = r2.add(r5)
            if (r5 == 0) goto L_0x004b
            r3.add(r4)
            goto L_0x004b
        L_0x0066:
            java.util.List r3 = kotlin.p590y.C13185o.m40513a()
        L_0x006a:
            r0.f13880U = r3
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r1 = r0.f13883X
            com.bamtechmedia.dominguez.core.content.assets.t r2 = com.bamtechmedia.dominguez.core.content.assets.C3649t.MEDIUM
            r3 = 2
            r4 = 0
            com.bamtechmedia.dominguez.core.content.C3651b.C3652a.m12419a(r1, r2, r4, r3, r4)
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r1 = r0.f13883X
            com.bamtechmedia.dominguez.core.content.assets.t r2 = com.bamtechmedia.dominguez.core.content.assets.C3649t.BRIEF
            java.lang.String r1 = com.bamtechmedia.dominguez.core.content.C3651b.C3652a.m12419a(r1, r2, r4, r3, r4)
            r0.f13881V = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.movie.models.C6022a.<init>(com.bamtechmedia.dominguez.core.content.PromoLabel, com.bamtechmedia.dominguez.core.content.assets.DmcMovie, com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent, com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent):void");
    }

    /* renamed from: X */
    public C5923c mo18105X() {
        return this.f13886c;
    }

    /* renamed from: Y */
    public C5982j mo18106Y() {
        DmcExtraContent dmcExtraContent = this.f13884Y;
        return dmcExtraContent != null ? dmcExtraContent : new DmcExtraContent(C13185o.m40513a(), C6025c.f13887a);
    }

    /* renamed from: Z */
    public PromoLabel mo18107Z() {
        return this.f13882W;
    }

    /* renamed from: a */
    public C6024b mo18108a(C5923c cVar) {
        this.f13886c = cVar;
        return this;
    }

    /* renamed from: a0 */
    public C6003u mo18109a0() {
        DmcRelatedContent dmcRelatedContent = this.f13885Z;
        if (dmcRelatedContent != null) {
            return dmcRelatedContent;
        }
        DmcRelatedContent dmcRelatedContent2 = new DmcRelatedContent(C13185o.m40513a(), C6025c.f13887a, null, 4, null);
        return dmcRelatedContent2;
    }

    /* renamed from: b0 */
    public String mo18110b0() {
        return this.f13881V;
    }

    /* renamed from: c0 */
    public C3692n mo18111c0() {
        return this.f13883X;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13885Z, (java.lang.Object) r3.f13885Z) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0037
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.movie.models.C6022a
            if (r0 == 0) goto L_0x0035
            com.bamtechmedia.dominguez.detail.movie.models.a r3 = (com.bamtechmedia.dominguez.detail.movie.models.C6022a) r3
            com.bamtechmedia.dominguez.core.content.PromoLabel r0 = r2.mo18107Z()
            com.bamtechmedia.dominguez.core.content.PromoLabel r1 = r3.mo18107Z()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r0 = r2.f13883X
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r1 = r3.f13883X
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r0 = r2.f13884Y
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r1 = r3.f13884Y
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0035
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r0 = r2.f13885Z
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r3 = r3.f13885Z
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            return r3
        L_0x0037:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.movie.models.C6022a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        PromoLabel Z = mo18107Z();
        int i = 0;
        int hashCode = (Z != null ? Z.hashCode() : 0) * 31;
        DmcMovie dmcMovie = this.f13883X;
        int hashCode2 = (hashCode + (dmcMovie != null ? dmcMovie.hashCode() : 0)) * 31;
        DmcExtraContent dmcExtraContent = this.f13884Y;
        int hashCode3 = (hashCode2 + (dmcExtraContent != null ? dmcExtraContent.hashCode() : 0)) * 31;
        DmcRelatedContent dmcRelatedContent = this.f13885Z;
        if (dmcRelatedContent != null) {
            i = dmcRelatedContent.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcMovieDetail(label=");
        sb.append(mo18107Z());
        sb.append(", video=");
        sb.append(this.f13883X);
        sb.append(", extras=");
        sb.append(this.f13884Y);
        sb.append(", related=");
        sb.append(this.f13885Z);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13882W, i);
        parcel.writeParcelable(this.f13883X, i);
        DmcExtraContent dmcExtraContent = this.f13884Y;
        if (dmcExtraContent != null) {
            parcel.writeInt(1);
            dmcExtraContent.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        DmcRelatedContent dmcRelatedContent = this.f13885Z;
        if (dmcRelatedContent != null) {
            parcel.writeInt(1);
            dmcRelatedContent.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: z */
    public List<Participant> mo18117z() {
        return this.f13880U;
    }
}
