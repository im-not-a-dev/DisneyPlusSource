package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010(\u001a\u00020\u000eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeasonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeason;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "dmcAssetTypeAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "intAdapter", "", "listOfImageAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "listOfStringAdapter", "", "listOfTextEntryAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "mediaRightsAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "nullableDefaultPagingMetaDataAdapter", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "nullableDmcSeasonMetaAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeasonMeta;", "nullableListOfDmcTagAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcTag;", "nullableListOfStringAdapter", "nullableListOfVideoArtAdapter", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "nullableStringAdapter", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcSeasonJsonAdapter.kt */
public final class DmcSeasonJsonAdapter extends C11725h<DmcSeason> {
    private final C11725h<DmcAssetType> dmcAssetTypeAdapter;
    private final C11725h<Integer> intAdapter;
    private final C11725h<List<Image>> listOfImageAdapter;
    private final C11725h<List<String>> listOfStringAdapter;
    private final C11725h<List<TextEntry>> listOfTextEntryAdapter;
    private final C11725h<MediaRights> mediaRightsAdapter;
    private final C11725h<DefaultPagingMetaData> nullableDefaultPagingMetaDataAdapter;
    private final C11725h<DmcSeasonMeta> nullableDmcSeasonMetaAdapter;
    private final C11725h<List<DmcTag>> nullableListOfDmcTagAdapter;
    private final C11725h<List<String>> nullableListOfStringAdapter;
    private final C11725h<List<C3680n>> nullableListOfVideoArtAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public DmcSeasonJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("type", "seasonId", "seriesId", "seasonSequenceNumber", "texts", "downloadableEpisodes", "mediaRights", "images", "childOf", "parentOf", "meta", "videoArt", "episodes_meta", "tags");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"t… \"episodes_meta\", \"tags\")");
        this.options = a;
        C11725h<DmcAssetType> a2 = vVar.mo29869a((Type) DmcAssetType.class, C13188p0.m40531a(), "type");
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<DmcAssetTy…tions.emptySet(), \"type\")");
        this.dmcAssetTypeAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "seasonId");
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<String>(St…s.emptySet(), \"seasonId\")");
        this.stringAdapter = a3;
        C11725h<Integer> a4 = vVar.mo29869a((Type) Integer.TYPE, C13188p0.m40531a(), "seasonSequenceNumber");
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<Int>(Int::…, \"seasonSequenceNumber\")");
        this.intAdapter = a4;
        C11725h<List<TextEntry>> a5 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, TextEntry.class), C13188p0.m40531a(), "texts");
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<List<TextE…ions.emptySet(), \"texts\")");
        this.listOfTextEntryAdapter = a5;
        C11725h<List<String>> a6 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, String.class), C13188p0.m40531a(), "downloadableEpisodes");
        Intrinsics.checkReturnedValueIsNotNull((Object) a6, "moshi.adapter<List<Strin…, \"downloadableEpisodes\")");
        this.listOfStringAdapter = a6;
        C11725h<MediaRights> a7 = vVar.mo29869a((Type) MediaRights.class, C13188p0.m40531a(), "mediaRights");
        Intrinsics.checkReturnedValueIsNotNull((Object) a7, "moshi.adapter<MediaRight…mptySet(), \"mediaRights\")");
        this.mediaRightsAdapter = a7;
        C11725h<List<Image>> a8 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, Image.class), C13188p0.m40531a(), "images");
        Intrinsics.checkReturnedValueIsNotNull((Object) a8, "moshi.adapter<List<Image…ons.emptySet(), \"images\")");
        this.listOfImageAdapter = a8;
        C11725h<List<String>> a9 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, String.class), C13188p0.m40531a(), "childOf");
        Intrinsics.checkReturnedValueIsNotNull((Object) a9, "moshi.adapter<List<Strin…ns.emptySet(), \"childOf\")");
        this.nullableListOfStringAdapter = a9;
        C11725h<String> a10 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "parentOf");
        Intrinsics.checkReturnedValueIsNotNull((Object) a10, "moshi.adapter<String?>(S…s.emptySet(), \"parentOf\")");
        this.nullableStringAdapter = a10;
        C11725h<DmcSeasonMeta> a11 = vVar.mo29869a((Type) DmcSeasonMeta.class, C13188p0.m40531a(), "meta");
        Intrinsics.checkReturnedValueIsNotNull((Object) a11, "moshi.adapter<DmcSeasonM…tions.emptySet(), \"meta\")");
        this.nullableDmcSeasonMetaAdapter = a11;
        C11725h<List<C3680n>> a12 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, C3680n.class), C13188p0.m40531a(), "videoArt");
        Intrinsics.checkReturnedValueIsNotNull((Object) a12, "moshi.adapter<List<Video…s.emptySet(), \"videoArt\")");
        this.nullableListOfVideoArtAdapter = a12;
        C11725h<DefaultPagingMetaData> a13 = vVar.mo29869a((Type) DefaultPagingMetaData.class, C13188p0.m40531a(), "episodesMeta");
        Intrinsics.checkReturnedValueIsNotNull((Object) a13, "moshi.adapter<DefaultPag…ptySet(), \"episodesMeta\")");
        this.nullableDefaultPagingMetaDataAdapter = a13;
        C11725h<List<DmcTag>> a14 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, DmcTag.class), C13188p0.m40531a(), "tags");
        Intrinsics.checkReturnedValueIsNotNull((Object) a14, "moshi.adapter<List<DmcTa…tions.emptySet(), \"tags\")");
        this.nullableListOfDmcTagAdapter = a14;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcSeason dmcSeason) {
        if (dmcSeason != null) {
            sVar.mo29791b();
            sVar.mo29796e("type");
            this.dmcAssetTypeAdapter.toJson(sVar, dmcSeason.mo13003X());
            sVar.mo29796e("seasonId");
            this.stringAdapter.toJson(sVar, dmcSeason.mo12992E());
            sVar.mo29796e("seriesId");
            this.stringAdapter.toJson(sVar, dmcSeason.mo12991D());
            sVar.mo29796e("seasonSequenceNumber");
            this.intAdapter.toJson(sVar, Integer.valueOf(dmcSeason.mo12993L()));
            sVar.mo29796e("texts");
            this.listOfTextEntryAdapter.toJson(sVar, dmcSeason.mo13002W());
            sVar.mo29796e("downloadableEpisodes");
            this.listOfStringAdapter.toJson(sVar, dmcSeason.mo12995P());
            sVar.mo29796e("mediaRights");
            this.mediaRightsAdapter.toJson(sVar, dmcSeason.mo12998S());
            sVar.mo29796e("images");
            this.listOfImageAdapter.toJson(sVar, dmcSeason.mo12847a());
            sVar.mo29796e("childOf");
            this.nullableListOfStringAdapter.toJson(sVar, dmcSeason.mo12994O());
            sVar.mo29796e("parentOf");
            this.nullableStringAdapter.toJson(sVar, dmcSeason.mo13000U());
            sVar.mo29796e("meta");
            this.nullableDmcSeasonMetaAdapter.toJson(sVar, dmcSeason.mo12999T());
            sVar.mo29796e("videoArt");
            this.nullableListOfVideoArtAdapter.toJson(sVar, dmcSeason.mo12839H());
            sVar.mo29796e("episodes_meta");
            this.nullableDefaultPagingMetaDataAdapter.toJson(sVar, dmcSeason.mo12997R());
            sVar.mo29796e("tags");
            this.nullableListOfDmcTagAdapter.toJson(sVar, dmcSeason.mo13001V());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcSeason)";
    }

    public DmcSeason fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        Integer num = null;
        DmcAssetType dmcAssetType = null;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        MediaRights mediaRights = null;
        List list3 = null;
        List list4 = null;
        String str3 = null;
        DmcSeasonMeta dmcSeasonMeta = null;
        List list5 = null;
        DefaultPagingMetaData defaultPagingMetaData = null;
        List list6 = null;
        while (mVar.mo29770f()) {
            switch (mVar2.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    DmcAssetType dmcAssetType2 = (DmcAssetType) this.dmcAssetTypeAdapter.fromJson(mVar2);
                    if (dmcAssetType2 != null) {
                        dmcAssetType = dmcAssetType2;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'type' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 1:
                    String str4 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str4 != null) {
                        str = str4;
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'seasonId' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 2:
                    String str5 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str5 != null) {
                        str2 = str5;
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Non-null value 'seriesId' was null at ");
                        sb3.append(mVar.mo29775j0());
                        throw new C11734j(sb3.toString());
                    }
                case 3:
                    Integer num2 = (Integer) this.intAdapter.fromJson(mVar2);
                    if (num2 != null) {
                        num = Integer.valueOf(num2.intValue());
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Non-null value 'seasonSequenceNumber' was null at ");
                        sb4.append(mVar.mo29775j0());
                        throw new C11734j(sb4.toString());
                    }
                case 4:
                    List list7 = (List) this.listOfTextEntryAdapter.fromJson(mVar2);
                    if (list7 != null) {
                        list = list7;
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Non-null value 'texts' was null at ");
                        sb5.append(mVar.mo29775j0());
                        throw new C11734j(sb5.toString());
                    }
                case 5:
                    List list8 = (List) this.listOfStringAdapter.fromJson(mVar2);
                    if (list8 != null) {
                        list2 = list8;
                        break;
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Non-null value 'downloadableEpisodes' was null at ");
                        sb6.append(mVar.mo29775j0());
                        throw new C11734j(sb6.toString());
                    }
                case 6:
                    MediaRights mediaRights2 = (MediaRights) this.mediaRightsAdapter.fromJson(mVar2);
                    if (mediaRights2 != null) {
                        mediaRights = mediaRights2;
                        break;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Non-null value 'mediaRights' was null at ");
                        sb7.append(mVar.mo29775j0());
                        throw new C11734j(sb7.toString());
                    }
                case 7:
                    List list9 = (List) this.listOfImageAdapter.fromJson(mVar2);
                    if (list9 != null) {
                        list3 = list9;
                        break;
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Non-null value 'images' was null at ");
                        sb8.append(mVar.mo29775j0());
                        throw new C11734j(sb8.toString());
                    }
                case 8:
                    list4 = (List) this.nullableListOfStringAdapter.fromJson(mVar2);
                    break;
                case 9:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar2);
                    break;
                case 10:
                    dmcSeasonMeta = (DmcSeasonMeta) this.nullableDmcSeasonMetaAdapter.fromJson(mVar2);
                    break;
                case 11:
                    list5 = (List) this.nullableListOfVideoArtAdapter.fromJson(mVar2);
                    break;
                case 12:
                    defaultPagingMetaData = (DefaultPagingMetaData) this.nullableDefaultPagingMetaDataAdapter.fromJson(mVar2);
                    break;
                case 13:
                    list6 = (List) this.nullableListOfDmcTagAdapter.fromJson(mVar2);
                    break;
            }
        }
        mVar.mo29767d();
        if (dmcAssetType == null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Required property 'type' missing at ");
            sb9.append(mVar.mo29775j0());
            throw new C11734j(sb9.toString());
        } else if (str == null) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Required property 'seasonId' missing at ");
            sb10.append(mVar.mo29775j0());
            throw new C11734j(sb10.toString());
        } else if (str2 == null) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Required property 'seriesId' missing at ");
            sb11.append(mVar.mo29775j0());
            throw new C11734j(sb11.toString());
        } else if (num != null) {
            int intValue = num.intValue();
            if (list == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append("Required property 'texts' missing at ");
                sb12.append(mVar.mo29775j0());
                throw new C11734j(sb12.toString());
            } else if (list2 == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append("Required property 'downloadableEpisodes' missing at ");
                sb13.append(mVar.mo29775j0());
                throw new C11734j(sb13.toString());
            } else if (mediaRights == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append("Required property 'mediaRights' missing at ");
                sb14.append(mVar.mo29775j0());
                throw new C11734j(sb14.toString());
            } else if (list3 != null) {
                DmcSeason dmcSeason = new DmcSeason(dmcAssetType, str, str2, intValue, list, list2, mediaRights, list3, list4, str3, dmcSeasonMeta, list5, defaultPagingMetaData, list6);
                return dmcSeason;
            } else {
                StringBuilder sb15 = new StringBuilder();
                sb15.append("Required property 'images' missing at ");
                sb15.append(mVar.mo29775j0());
                throw new C11734j(sb15.toString());
            }
        } else {
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Required property 'seasonSequenceNumber' missing at ");
            sb16.append(mVar.mo29775j0());
            throw new C11734j(sb16.toString());
        }
    }
}
