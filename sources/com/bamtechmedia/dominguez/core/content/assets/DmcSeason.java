package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3789t;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u000e0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000b¢\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0004HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0013\u0010D\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u000e0\u000bHÆ\u0003J\t\u0010E\u001a\u00020\u0010HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bHÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003JÉ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\b\u0002\u0010\r\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u000e0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000b2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000bHÆ\u0001J\t\u0010I\u001a\u00020\tHÖ\u0001J\u0013\u0010J\u001a\u00020+2\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\tHÖ\u0001J\t\u0010N\u001a\u00020\u0006HÖ\u0001J\u0019\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010\r\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u000e0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0014\u0010*\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010,R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001f¨\u0006T"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeason;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcBrowsable;", "Lcom/bamtechmedia/dominguez/core/content/Season;", "type", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "seasonId", "", "seriesId", "seasonSequenceNumber", "", "texts", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "downloadableEpisodes", "Lcom/bamtechmedia/dominguez/core/content/ContentId;", "mediaRights", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "images", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "childOf", "parentOf", "meta", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeasonMeta;", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "episodesMeta", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "tags", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcTag;", "(Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeasonMeta;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;Ljava/util/List;)V", "getChildOf", "()Ljava/util/List;", "contentId", "getContentId", "()Ljava/lang/String;", "getDownloadableEpisodes", "episodeCount", "getEpisodeCount", "()I", "getEpisodesMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "getImages", "isNew", "", "()Z", "getMediaRights", "()Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeasonMeta;", "getParentOf", "getSeasonId", "getSeasonSequenceNumber", "getSeriesId", "getTags", "getTexts", "getType", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "getVideoArt", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcSeason.kt */
public final class DmcSeason extends C3633g implements C3789t {
    public static final Creator CREATOR = new C3602a();

    /* renamed from: b0 */
    private final DmcAssetType f9038b0;

    /* renamed from: c0 */
    private final String f9039c0;

    /* renamed from: d0 */
    private final String f9040d0;

    /* renamed from: e0 */
    private final int f9041e0;

    /* renamed from: f0 */
    private final List<TextEntry> f9042f0;

    /* renamed from: g0 */
    private final List<String> f9043g0;

    /* renamed from: h0 */
    private final MediaRights f9044h0;

    /* renamed from: i0 */
    private final List<Image> f9045i0;

    /* renamed from: j0 */
    private final List<String> f9046j0;

    /* renamed from: k0 */
    private final String f9047k0;

    /* renamed from: l0 */
    private final DmcSeasonMeta f9048l0;

    /* renamed from: m0 */
    private final List<C3680n> f9049m0;

    /* renamed from: n0 */
    private final DefaultPagingMetaData f9050n0;

    /* renamed from: o0 */
    private final List<DmcTag> f9051o0;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcSeason$a */
    public static class C3602a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            DefaultPagingMetaData defaultPagingMetaData;
            ArrayList arrayList3;
            Parcel parcel2 = parcel;
            DmcAssetType dmcAssetType = (DmcAssetType) Enum.valueOf(DmcAssetType.class, parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList4.add((TextEntry) parcel2.readParcelable(DmcSeason.class.getClassLoader()));
                readInt2--;
            }
            ArrayList createStringArrayList = parcel.createStringArrayList();
            MediaRights mediaRights = (MediaRights) MediaRights.CREATOR.createFromParcel(parcel2);
            int readInt3 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList5.add((Image) parcel2.readParcelable(DmcSeason.class.getClassLoader()));
                readInt3--;
            }
            ArrayList createStringArrayList2 = parcel.createStringArrayList();
            String readString3 = parcel.readString();
            DmcSeasonMeta dmcSeasonMeta = parcel.readInt() != 0 ? (DmcSeasonMeta) DmcSeasonMeta.CREATOR.createFromParcel(parcel2) : null;
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt4);
                while (readInt4 != 0) {
                    arrayList6.add((C3680n) parcel2.readParcelable(DmcSeason.class.getClassLoader()));
                    readInt4--;
                }
                arrayList = arrayList6;
            } else {
                arrayList = null;
            }
            DefaultPagingMetaData defaultPagingMetaData2 = (DefaultPagingMetaData) parcel2.readParcelable(DmcSeason.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                defaultPagingMetaData = defaultPagingMetaData2;
                arrayList3 = new ArrayList(readInt5);
                while (true) {
                    arrayList2 = arrayList;
                    if (readInt5 == 0) {
                        break;
                    }
                    arrayList3.add((DmcTag) DmcTag.CREATOR.createFromParcel(parcel2));
                    readInt5--;
                    arrayList = arrayList2;
                }
            } else {
                arrayList2 = arrayList;
                defaultPagingMetaData = defaultPagingMetaData2;
                arrayList3 = null;
            }
            DmcSeason dmcSeason = new DmcSeason(dmcAssetType, readString, readString2, readInt, arrayList4, createStringArrayList, mediaRights, arrayList5, createStringArrayList2, readString3, dmcSeasonMeta, arrayList2, defaultPagingMetaData, arrayList3);
            return dmcSeason;
        }

        public final Object[] newArray(int i) {
            return new DmcSeason[i];
        }
    }

    public DmcSeason(DmcAssetType dmcAssetType, String str, String str2, int i, List<TextEntry> list, List<String> list2, MediaRights mediaRights, List<Image> list3, List<String> list4, String str3, DmcSeasonMeta dmcSeasonMeta, List<? extends C3680n> list5, @C11724g(name = "episodes_meta") DefaultPagingMetaData defaultPagingMetaData, List<DmcTag> list6) {
        super(list, list3, C13185o.m40513a(), C13185o.m40513a(), C13185o.m40513a(), mediaRights, str3, list4, list5, list6, C13185o.m40513a());
        this.f9038b0 = dmcAssetType;
        this.f9039c0 = str;
        this.f9040d0 = str2;
        this.f9041e0 = i;
        this.f9042f0 = list;
        this.f9043g0 = list2;
        this.f9044h0 = mediaRights;
        this.f9045i0 = list3;
        this.f9046j0 = list4;
        this.f9047k0 = str3;
        this.f9048l0 = dmcSeasonMeta;
        this.f9049m0 = list5;
        this.f9050n0 = defaultPagingMetaData;
        this.f9051o0 = list6;
    }

    /* renamed from: D */
    public String mo12991D() {
        return this.f9040d0;
    }

    /* renamed from: E */
    public String mo12992E() {
        return this.f9039c0;
    }

    /* renamed from: H */
    public List<C3680n> mo12839H() {
        return this.f9049m0;
    }

    /* renamed from: L */
    public int mo12993L() {
        return this.f9041e0;
    }

    /* renamed from: O */
    public final List<String> mo12994O() {
        return this.f9046j0;
    }

    /* renamed from: P */
    public List<String> mo12995P() {
        return this.f9043g0;
    }

    /* renamed from: Q */
    public int mo12996Q() {
        DefaultPagingMetaData defaultPagingMetaData = this.f9050n0;
        if (defaultPagingMetaData != null) {
            return defaultPagingMetaData.mo13413b0();
        }
        return 0;
    }

    /* renamed from: R */
    public final DefaultPagingMetaData mo12997R() {
        return this.f9050n0;
    }

    /* renamed from: S */
    public final MediaRights mo12998S() {
        return this.f9044h0;
    }

    /* renamed from: T */
    public DmcSeasonMeta mo12999T() {
        return this.f9048l0;
    }

    /* renamed from: U */
    public final String mo13000U() {
        return this.f9047k0;
    }

    /* renamed from: V */
    public final List<DmcTag> mo13001V() {
        return this.f9051o0;
    }

    /* renamed from: W */
    public final List<TextEntry> mo13002W() {
        return this.f9042f0;
    }

    /* renamed from: X */
    public DmcAssetType mo13003X() {
        return this.f9038b0;
    }

    /* renamed from: a */
    public List<Image> mo12847a() {
        return this.f9045i0;
    }

    public final DmcSeason copy(DmcAssetType dmcAssetType, String str, String str2, int i, List<TextEntry> list, List<String> list2, MediaRights mediaRights, List<Image> list3, List<String> list4, String str3, DmcSeasonMeta dmcSeasonMeta, List<? extends C3680n> list5, @C11724g(name = "episodes_meta") DefaultPagingMetaData defaultPagingMetaData, List<DmcTag> list6) {
        DmcSeason dmcSeason = new DmcSeason(dmcAssetType, str, str2, i, list, list2, mediaRights, list3, list4, str3, dmcSeasonMeta, list5, defaultPagingMetaData, list6);
        return dmcSeason;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DmcSeason) {
                DmcSeason dmcSeason = (DmcSeason) obj;
                if (C12880j.m40224a((Object) mo13003X(), (Object) dmcSeason.mo13003X()) && C12880j.m40224a((Object) mo12992E(), (Object) dmcSeason.mo12992E()) && C12880j.m40224a((Object) mo12991D(), (Object) dmcSeason.mo12991D())) {
                    if (!(mo12993L() == dmcSeason.mo12993L()) || !C12880j.m40224a((Object) this.f9042f0, (Object) dmcSeason.f9042f0) || !C12880j.m40224a((Object) mo12995P(), (Object) dmcSeason.mo12995P()) || !C12880j.m40224a((Object) this.f9044h0, (Object) dmcSeason.f9044h0) || !C12880j.m40224a((Object) mo12847a(), (Object) dmcSeason.mo12847a()) || !C12880j.m40224a((Object) this.f9046j0, (Object) dmcSeason.f9046j0) || !C12880j.m40224a((Object) this.f9047k0, (Object) dmcSeason.f9047k0) || !C12880j.m40224a((Object) mo12999T(), (Object) dmcSeason.mo12999T()) || !C12880j.m40224a((Object) mo12839H(), (Object) dmcSeason.mo12839H()) || !C12880j.m40224a((Object) this.f9050n0, (Object) dmcSeason.f9050n0) || !C12880j.m40224a((Object) this.f9051o0, (Object) dmcSeason.f9051o0)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo12903f() {
        return mo12992E();
    }

    public int hashCode() {
        DmcAssetType X = mo13003X();
        int i = 0;
        int hashCode = (X != null ? X.hashCode() : 0) * 31;
        String E = mo12992E();
        int hashCode2 = (hashCode + (E != null ? E.hashCode() : 0)) * 31;
        String D = mo12991D();
        int hashCode3 = (((hashCode2 + (D != null ? D.hashCode() : 0)) * 31) + mo12993L()) * 31;
        List<TextEntry> list = this.f9042f0;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List P = mo12995P();
        int hashCode5 = (hashCode4 + (P != null ? P.hashCode() : 0)) * 31;
        MediaRights mediaRights = this.f9044h0;
        int hashCode6 = (hashCode5 + (mediaRights != null ? mediaRights.hashCode() : 0)) * 31;
        List a = mo12847a();
        int hashCode7 = (hashCode6 + (a != null ? a.hashCode() : 0)) * 31;
        List<String> list2 = this.f9046j0;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f9047k0;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 31;
        DmcSeasonMeta T = mo12999T();
        int hashCode10 = (hashCode9 + (T != null ? T.hashCode() : 0)) * 31;
        List H = mo12839H();
        int hashCode11 = (hashCode10 + (H != null ? H.hashCode() : 0)) * 31;
        DefaultPagingMetaData defaultPagingMetaData = this.f9050n0;
        int hashCode12 = (hashCode11 + (defaultPagingMetaData != null ? defaultPagingMetaData.hashCode() : 0)) * 31;
        List<DmcTag> list3 = this.f9051o0;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcSeason(type=");
        sb.append(mo13003X());
        sb.append(", seasonId=");
        sb.append(mo12992E());
        sb.append(", seriesId=");
        sb.append(mo12991D());
        sb.append(", seasonSequenceNumber=");
        sb.append(mo12993L());
        sb.append(", texts=");
        sb.append(this.f9042f0);
        sb.append(", downloadableEpisodes=");
        sb.append(mo12995P());
        sb.append(", mediaRights=");
        sb.append(this.f9044h0);
        sb.append(", images=");
        sb.append(mo12847a());
        sb.append(", childOf=");
        sb.append(this.f9046j0);
        sb.append(", parentOf=");
        sb.append(this.f9047k0);
        sb.append(", meta=");
        sb.append(mo12999T());
        sb.append(", videoArt=");
        sb.append(mo12839H());
        sb.append(", episodesMeta=");
        sb.append(this.f9050n0);
        sb.append(", tags=");
        sb.append(this.f9051o0);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9038b0.name());
        parcel.writeString(this.f9039c0);
        parcel.writeString(this.f9040d0);
        parcel.writeInt(this.f9041e0);
        List<TextEntry> list = this.f9042f0;
        parcel.writeInt(list.size());
        for (TextEntry writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeStringList(this.f9043g0);
        this.f9044h0.writeToParcel(parcel, 0);
        List<Image> list2 = this.f9045i0;
        parcel.writeInt(list2.size());
        for (Image writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        parcel.writeStringList(this.f9046j0);
        parcel.writeString(this.f9047k0);
        DmcSeasonMeta dmcSeasonMeta = this.f9048l0;
        if (dmcSeasonMeta != null) {
            parcel.writeInt(1);
            dmcSeasonMeta.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<C3680n> list3 = this.f9049m0;
        if (list3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (C3680n writeParcelable3 : list3) {
                parcel.writeParcelable(writeParcelable3, i);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.f9050n0, i);
        List<DmcTag> list4 = this.f9051o0;
        if (list4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (DmcTag writeToParcel : list4) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }
}
