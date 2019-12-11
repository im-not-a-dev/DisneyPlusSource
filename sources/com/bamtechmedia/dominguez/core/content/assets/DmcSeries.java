package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import net.danlew.android.joda.DateUtils;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BÛ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\t\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\t¢\u0006\u0002\u0010\"J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00160\tHÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010M\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u00102J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\tHÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\tHÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\t\u0010Q\u001a\u00020\u0004HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\t\u0010T\u001a\u00020\u000eHÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\tHÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\tHÆ\u0003J\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\t2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010YJ\t\u0010Z\u001a\u00020\u001cHÖ\u0001J\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020\u001cHÖ\u0001J\t\u0010`\u001a\u00020\u0004HÖ\u0001J\u0019\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0016\u00100\u001a\u0004\u0018\u00010\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u00105\u001a\u0004\u0018\u00010\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00102R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\n\n\u0002\u0010<\u001a\u0004\b;\u00102R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\n\n\u0002\u0010<\u001a\u0004\b=\u00102R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010'R\u0014\u0010?\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010'R\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\bB\u0010$R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010$R\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010$¨\u0006f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeries;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcBrowsable;", "Lcom/bamtechmedia/dominguez/core/content/Series;", "seriesId", "", "type", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "encodedSeriesId", "texts", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "images", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "mediaRights", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "typedGenres", "Lcom/bamtechmedia/dominguez/core/content/GenreMeta;", "participants", "Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "releases", "Lcom/bamtechmedia/dominguez/core/content/assets/Release;", "ratings", "Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "childOf", "currentAvailability", "Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "parentOf", "seasonsMinYear", "", "seasonsMaxYear", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "tags", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcTag;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/Availability;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getChildOf", "()Ljava/util/List;", "contentId", "getContentId", "()Ljava/lang/String;", "getCurrentAvailability", "()Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "defaultSourceType", "Lcom/bamtechmedia/dominguez/core/content/assets/SourceEntityType;", "getDefaultSourceType", "()Lcom/bamtechmedia/dominguez/core/content/assets/SourceEntityType;", "getEncodedSeriesId", "getImages", "maxYear", "getMaxYear", "()Ljava/lang/Integer;", "getMediaRights", "()Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "minYear", "getMinYear", "getParentOf", "getParticipants", "getRatings", "getReleases", "getSeasonsMaxYear", "Ljava/lang/Integer;", "getSeasonsMinYear", "getSeriesId", "slug", "getSlug", "getTags", "getTexts", "getType", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "getTypedGenres", "getVideoArt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/Availability;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeries;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcSeries.kt */
public final class DmcSeries extends C3633g implements C3791v {
    public static final Creator CREATOR = new C3604a();

    /* renamed from: b0 */
    private final String f9053b0;

    /* renamed from: c0 */
    private final DmcAssetType f9054c0;

    /* renamed from: d0 */
    private final String f9055d0;

    /* renamed from: e0 */
    private final List<TextEntry> f9056e0;

    /* renamed from: f0 */
    private final List<Image> f9057f0;

    /* renamed from: g0 */
    private final MediaRights f9058g0;

    /* renamed from: h0 */
    private final List<GenreMeta> f9059h0;

    /* renamed from: i0 */
    private final List<Participant> f9060i0;

    /* renamed from: j0 */
    private final List<Release> f9061j0;

    /* renamed from: k0 */
    private final List<Rating> f9062k0;

    /* renamed from: l0 */
    private final List<String> f9063l0;

    /* renamed from: m0 */
    private final Availability f9064m0;

    /* renamed from: n0 */
    private final String f9065n0;

    /* renamed from: o0 */
    private final Integer f9066o0;

    /* renamed from: p0 */
    private final Integer f9067p0;

    /* renamed from: q0 */
    private final List<C3680n> f9068q0;

    /* renamed from: r0 */
    private final List<DmcTag> f9069r0;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcSeries$a */
    public static class C3604a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Parcel parcel2 = parcel;
            String readString = parcel.readString();
            DmcAssetType dmcAssetType = (DmcAssetType) Enum.valueOf(DmcAssetType.class, parcel.readString());
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList5.add((TextEntry) parcel2.readParcelable(DmcSeries.class.getClassLoader()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList6.add((Image) parcel2.readParcelable(DmcSeries.class.getClassLoader()));
                readInt2--;
            }
            MediaRights mediaRights = (MediaRights) MediaRights.CREATOR.createFromParcel(parcel2);
            int readInt3 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList7.add((GenreMeta) parcel2.readParcelable(DmcSeries.class.getClassLoader()));
                readInt3--;
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                while (readInt4 != 0) {
                    arrayList.add((Participant) parcel2.readParcelable(DmcSeries.class.getClassLoader()));
                    readInt4--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList2 = new ArrayList(readInt5);
                while (readInt5 != 0) {
                    arrayList2.add((Release) Release.CREATOR.createFromParcel(parcel2));
                    readInt5--;
                }
            } else {
                arrayList2 = null;
            }
            int readInt6 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(readInt6);
            while (readInt6 != 0) {
                arrayList8.add((Rating) parcel2.readParcelable(DmcSeries.class.getClassLoader()));
                readInt6--;
            }
            ArrayList createStringArrayList = parcel.createStringArrayList();
            Availability availability = (Availability) parcel2.readParcelable(DmcSeries.class.getClassLoader());
            String readString3 = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt7 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt7);
                while (readInt7 != 0) {
                    String str2 = readString3;
                    arrayList9.add((C3680n) parcel2.readParcelable(DmcSeries.class.getClassLoader()));
                    readInt7--;
                    readString3 = str2;
                }
                str = readString3;
                arrayList3 = arrayList9;
            } else {
                str = readString3;
                arrayList3 = null;
            }
            if (parcel.readInt() != 0) {
                int readInt8 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt8);
                while (readInt8 != 0) {
                    arrayList10.add((DmcTag) DmcTag.CREATOR.createFromParcel(parcel2));
                    readInt8--;
                }
                arrayList4 = arrayList10;
            } else {
                arrayList4 = null;
            }
            DmcSeries dmcSeries = new DmcSeries(readString, dmcAssetType, readString2, arrayList5, arrayList6, mediaRights, arrayList7, arrayList, arrayList2, arrayList8, createStringArrayList, availability, str, valueOf, valueOf2, arrayList3, arrayList4);
            return dmcSeries;
        }

        public final Object[] newArray(int i) {
            return new DmcSeries[i];
        }
    }

    public /* synthetic */ DmcSeries(String str, DmcAssetType dmcAssetType, String str2, List list, List list2, MediaRights mediaRights, List list3, List list4, List list5, List list6, List list7, Availability availability, String str3, Integer num, Integer num2, List list8, List list9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, dmcAssetType, str2, list, list2, mediaRights, list3, (i2 & 128) != 0 ? null : list4, (i2 & 256) != 0 ? null : list5, (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? C13185o.m40513a() : list6, list7, availability, str3, num, num2, list8, list9);
    }

    /* renamed from: a */
    public static /* synthetic */ DmcSeries m12228a(DmcSeries dmcSeries, String str, DmcAssetType dmcAssetType, String str2, List list, List list2, MediaRights mediaRights, List list3, List list4, List list5, List list6, List list7, Availability availability, String str3, Integer num, Integer num2, List list8, List list9, int i, Object obj) {
        DmcSeries dmcSeries2 = dmcSeries;
        int i2 = i;
        return dmcSeries.mo13039a((i2 & 1) != 0 ? dmcSeries.mo13025D() : str, (i2 & 2) != 0 ? dmcSeries.mo13038Y() : dmcAssetType, (i2 & 4) != 0 ? dmcSeries.mo13024C() : str2, (i2 & 8) != 0 ? dmcSeries2.f9056e0 : list, (i2 & 16) != 0 ? dmcSeries.mo12847a() : list2, (i2 & 32) != 0 ? dmcSeries2.f9058g0 : mediaRights, (i2 & 64) != 0 ? dmcSeries.mo12896c() : list3, (i2 & 128) != 0 ? dmcSeries.mo13047z() : list4, (i2 & 256) != 0 ? dmcSeries2.f9061j0 : list5, (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? dmcSeries2.f9062k0 : list6, (i2 & 1024) != 0 ? dmcSeries2.f9063l0 : list7, (i2 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? dmcSeries.mo13029P() : availability, (i2 & 4096) != 0 ? dmcSeries2.f9065n0 : str3, (i2 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? dmcSeries2.f9066o0 : num, (i2 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? dmcSeries2.f9067p0 : num2, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? dmcSeries.mo12839H() : list8, (i2 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? dmcSeries2.f9069r0 : list9);
    }

    /* renamed from: C */
    public String mo13024C() {
        return this.f9055d0;
    }

    /* renamed from: D */
    public String mo13025D() {
        return this.f9053b0;
    }

    /* renamed from: H */
    public List<C3680n> mo12839H() {
        return this.f9068q0;
    }

    /* renamed from: M */
    public Integer mo13026M() {
        return this.f9067p0;
    }

    /* renamed from: N */
    public Integer mo13027N() {
        return this.f9066o0;
    }

    /* renamed from: O */
    public final List<String> mo13028O() {
        return this.f9063l0;
    }

    /* renamed from: P */
    public Availability mo13029P() {
        return this.f9064m0;
    }

    /* renamed from: Q */
    public final MediaRights mo13030Q() {
        return this.f9058g0;
    }

    /* renamed from: R */
    public final String mo13031R() {
        return this.f9065n0;
    }

    /* renamed from: S */
    public final List<Rating> mo13032S() {
        return this.f9062k0;
    }

    /* renamed from: T */
    public final List<Release> mo13033T() {
        return this.f9061j0;
    }

    /* renamed from: U */
    public final Integer mo13034U() {
        return this.f9067p0;
    }

    /* renamed from: V */
    public final Integer mo13035V() {
        return this.f9066o0;
    }

    /* renamed from: W */
    public final List<DmcTag> mo13036W() {
        return this.f9069r0;
    }

    /* renamed from: X */
    public final List<TextEntry> mo13037X() {
        return this.f9056e0;
    }

    /* renamed from: Y */
    public DmcAssetType mo13038Y() {
        return this.f9054c0;
    }

    /* renamed from: a */
    public final DmcSeries mo13039a(String str, DmcAssetType dmcAssetType, String str2, List<TextEntry> list, List<Image> list2, MediaRights mediaRights, List<GenreMeta> list3, List<Participant> list4, List<Release> list5, List<Rating> list6, List<String> list7, Availability availability, String str3, Integer num, Integer num2, List<? extends C3680n> list8, List<DmcTag> list9) {
        DmcSeries dmcSeries = new DmcSeries(str, dmcAssetType, str2, list, list2, mediaRights, list3, list4, list5, list6, list7, availability, str3, num, num2, list8, list9);
        return dmcSeries;
    }

    /* renamed from: a */
    public List<Image> mo12847a() {
        return this.f9057f0;
    }

    /* renamed from: b */
    public String mo13040b() {
        return mo13262b(C3649t.SLUG, C3647r.SERIES);
    }

    /* renamed from: c */
    public List<GenreMeta> mo12896c() {
        return this.f9059h0;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9069r0, (java.lang.Object) r3.f9069r0) != false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00d5
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.DmcSeries
            if (r0 == 0) goto L_0x00d3
            com.bamtechmedia.dominguez.core.content.assets.DmcSeries r3 = (com.bamtechmedia.dominguez.core.content.assets.DmcSeries) r3
            java.lang.String r0 = r2.mo13025D()
            java.lang.String r1 = r3.mo13025D()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            com.bamtechmedia.dominguez.core.content.assets.DmcAssetType r0 = r2.mo13038Y()
            com.bamtechmedia.dominguez.core.content.assets.DmcAssetType r1 = r3.mo13038Y()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r2.mo13024C()
            java.lang.String r1 = r3.mo13024C()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r0 = r2.f9056e0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r1 = r3.f9056e0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List r0 = r2.mo12847a()
            java.util.List r1 = r3.mo12847a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            com.bamtechmedia.dominguez.core.content.assets.MediaRights r0 = r2.f9058g0
            com.bamtechmedia.dominguez.core.content.assets.MediaRights r1 = r3.f9058g0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List r0 = r2.mo12896c()
            java.util.List r1 = r3.mo12896c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List r0 = r2.mo13047z()
            java.util.List r1 = r3.mo13047z()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.Release> r0 = r2.f9061j0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.Release> r1 = r3.f9061j0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.Rating> r0 = r2.f9062k0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.Rating> r1 = r3.f9062k0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List<java.lang.String> r0 = r2.f9063l0
            java.util.List<java.lang.String> r1 = r3.f9063l0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            com.bamtechmedia.dominguez.core.content.assets.Availability r0 = r2.mo13029P()
            com.bamtechmedia.dominguez.core.content.assets.Availability r1 = r3.mo13029P()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r2.f9065n0
            java.lang.String r1 = r3.f9065n0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = r2.f9066o0
            java.lang.Integer r1 = r3.f9066o0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = r2.f9067p0
            java.lang.Integer r1 = r3.f9067p0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List r0 = r2.mo12839H()
            java.util.List r1 = r3.mo12839H()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00d3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcTag> r0 = r2.f9069r0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcTag> r3 = r3.f9069r0
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r3 = 0
            return r3
        L_0x00d5:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcSeries.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo12903f() {
        return mo13025D();
    }

    public int hashCode() {
        String D = mo13025D();
        int i = 0;
        int hashCode = (D != null ? D.hashCode() : 0) * 31;
        DmcAssetType Y = mo13038Y();
        int hashCode2 = (hashCode + (Y != null ? Y.hashCode() : 0)) * 31;
        String C = mo13024C();
        int hashCode3 = (hashCode2 + (C != null ? C.hashCode() : 0)) * 31;
        List<TextEntry> list = this.f9056e0;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List a = mo12847a();
        int hashCode5 = (hashCode4 + (a != null ? a.hashCode() : 0)) * 31;
        MediaRights mediaRights = this.f9058g0;
        int hashCode6 = (hashCode5 + (mediaRights != null ? mediaRights.hashCode() : 0)) * 31;
        List c = mo12896c();
        int hashCode7 = (hashCode6 + (c != null ? c.hashCode() : 0)) * 31;
        List z = mo13047z();
        int hashCode8 = (hashCode7 + (z != null ? z.hashCode() : 0)) * 31;
        List<Release> list2 = this.f9061j0;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Rating> list3 = this.f9062k0;
        int hashCode10 = (hashCode9 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.f9063l0;
        int hashCode11 = (hashCode10 + (list4 != null ? list4.hashCode() : 0)) * 31;
        Availability P = mo13029P();
        int hashCode12 = (hashCode11 + (P != null ? P.hashCode() : 0)) * 31;
        String str = this.f9065n0;
        int hashCode13 = (hashCode12 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f9066o0;
        int hashCode14 = (hashCode13 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f9067p0;
        int hashCode15 = (hashCode14 + (num2 != null ? num2.hashCode() : 0)) * 31;
        List H = mo12839H();
        int hashCode16 = (hashCode15 + (H != null ? H.hashCode() : 0)) * 31;
        List<DmcTag> list5 = this.f9069r0;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode16 + i;
    }

    /* renamed from: j */
    public C3647r mo13044j() {
        return C3647r.SERIES;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcSeries(seriesId=");
        sb.append(mo13025D());
        sb.append(", type=");
        sb.append(mo13038Y());
        sb.append(", encodedSeriesId=");
        sb.append(mo13024C());
        sb.append(", texts=");
        sb.append(this.f9056e0);
        sb.append(", images=");
        sb.append(mo12847a());
        sb.append(", mediaRights=");
        sb.append(this.f9058g0);
        sb.append(", typedGenres=");
        sb.append(mo12896c());
        sb.append(", participants=");
        sb.append(mo13047z());
        sb.append(", releases=");
        sb.append(this.f9061j0);
        sb.append(", ratings=");
        sb.append(this.f9062k0);
        sb.append(", childOf=");
        sb.append(this.f9063l0);
        sb.append(", currentAvailability=");
        sb.append(mo13029P());
        sb.append(", parentOf=");
        sb.append(this.f9065n0);
        sb.append(", seasonsMinYear=");
        sb.append(this.f9066o0);
        sb.append(", seasonsMaxYear=");
        sb.append(this.f9067p0);
        sb.append(", videoArt=");
        sb.append(mo12839H());
        sb.append(", tags=");
        sb.append(this.f9069r0);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9053b0);
        parcel.writeString(this.f9054c0.name());
        parcel.writeString(this.f9055d0);
        List<TextEntry> list = this.f9056e0;
        parcel.writeInt(list.size());
        for (TextEntry writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<Image> list2 = this.f9057f0;
        parcel.writeInt(list2.size());
        for (Image writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        this.f9058g0.writeToParcel(parcel, 0);
        List<GenreMeta> list3 = this.f9059h0;
        parcel.writeInt(list3.size());
        for (GenreMeta writeParcelable3 : list3) {
            parcel.writeParcelable(writeParcelable3, i);
        }
        List<Participant> list4 = this.f9060i0;
        if (list4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (Participant writeParcelable4 : list4) {
                parcel.writeParcelable(writeParcelable4, i);
            }
        } else {
            parcel.writeInt(0);
        }
        List<Release> list5 = this.f9061j0;
        if (list5 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            for (Release writeToParcel : list5) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<Rating> list6 = this.f9062k0;
        parcel.writeInt(list6.size());
        for (Rating writeParcelable5 : list6) {
            parcel.writeParcelable(writeParcelable5, i);
        }
        parcel.writeStringList(this.f9063l0);
        parcel.writeParcelable(this.f9064m0, i);
        parcel.writeString(this.f9065n0);
        Integer num = this.f9066o0;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.f9067p0;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<C3680n> list7 = this.f9068q0;
        if (list7 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list7.size());
            for (C3680n writeParcelable6 : list7) {
                parcel.writeParcelable(writeParcelable6, i);
            }
        } else {
            parcel.writeInt(0);
        }
        List<DmcTag> list8 = this.f9069r0;
        if (list8 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list8.size());
            for (DmcTag writeToParcel2 : list8) {
                writeToParcel2.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: z */
    public List<Participant> mo13047z() {
        return this.f9060i0;
    }

    public DmcSeries(String str, DmcAssetType dmcAssetType, String str2, List<TextEntry> list, List<Image> list2, MediaRights mediaRights, List<GenreMeta> list3, List<Participant> list4, List<Release> list5, List<Rating> list6, List<String> list7, Availability availability, String str3, Integer num, Integer num2, List<? extends C3680n> list8, List<DmcTag> list9) {
        super(list, list2, list4, list5, list6, mediaRights, str3, list7, list8, list9, list3);
        this.f9053b0 = str;
        this.f9054c0 = dmcAssetType;
        this.f9055d0 = str2;
        this.f9056e0 = list;
        this.f9057f0 = list2;
        this.f9058g0 = mediaRights;
        this.f9059h0 = list3;
        this.f9060i0 = list4;
        this.f9061j0 = list5;
        this.f9062k0 = list6;
        this.f9063l0 = list7;
        this.f9064m0 = availability;
        this.f9065n0 = str3;
        this.f9066o0 = num;
        this.f9067p0 = num2;
        this.f9068q0 = list8;
        this.f9069r0 = list9;
    }
}
