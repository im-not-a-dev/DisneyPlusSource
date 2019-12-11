package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010.\u001a\u00020\"H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcExtraJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcExtra;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "dmcAssetTypeAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "listOfGenreMetaAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/GenreMeta;", "listOfImageAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "listOfLanguageAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "listOfPlaybackUrlAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/PlaybackUrl;", "listOfTextEntryAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "mediaRightsAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "nullableDmcMediaMetadataAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "nullableDmcVideoMetaAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;", "nullableListOfDmcDisclaimerLabelAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcDisclaimerLabel;", "nullableListOfDmcTagAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcTag;", "nullableListOfVideoArtAdapter", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "nullableLongAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcExtraJsonAdapter.kt */
public final class DmcExtraJsonAdapter extends C11725h<DmcExtra> {
    private final C11725h<DmcAssetType> dmcAssetTypeAdapter;
    private final C11725h<List<GenreMeta>> listOfGenreMetaAdapter;
    private final C11725h<List<Image>> listOfImageAdapter;
    private final C11725h<List<Language>> listOfLanguageAdapter;
    private final C11725h<List<PlaybackUrl>> listOfPlaybackUrlAdapter;
    private final C11725h<List<TextEntry>> listOfTextEntryAdapter;
    private final C11725h<MediaRights> mediaRightsAdapter;
    private final C11725h<DmcMediaMetadata> nullableDmcMediaMetadataAdapter;
    private final C11725h<DmcVideoMeta> nullableDmcVideoMetaAdapter;
    private final C11725h<List<DmcDisclaimerLabel>> nullableListOfDmcDisclaimerLabelAdapter;
    private final C11725h<List<DmcTag>> nullableListOfDmcTagAdapter;
    private final C11725h<List<C3680n>> nullableListOfVideoArtAdapter;
    private final C11725h<Long> nullableLongAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public DmcExtraJsonAdapter(C11760v vVar) {
        C11760v vVar2 = vVar;
        C11739b a = C11739b.m37729a("contentId", "type", "runtimeMillis", "internalTitle", "texts", "images", "playbackUrls", "originalLanguage", "mediaMetadata", "captions", "meta", "mediaRights", "mediaId", "contentType", "videoArt", "labels", "typedGenres", "programType", "tags");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"c…\", \"programType\", \"tags\")");
        this.options = a;
        C11725h<String> a2 = vVar2.mo29869a((Type) String.class, C13188p0.m40531a(), "contentId");
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St….emptySet(), \"contentId\")");
        this.stringAdapter = a2;
        C11725h<DmcAssetType> a3 = vVar2.mo29869a((Type) DmcAssetType.class, C13188p0.m40531a(), "type");
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<DmcAssetTy…tions.emptySet(), \"type\")");
        this.dmcAssetTypeAdapter = a3;
        C11725h<Long> a4 = vVar2.mo29869a((Type) Long.class, C13188p0.m40531a(), "runtimeMillis");
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<Long?>(Lon…tySet(), \"runtimeMillis\")");
        this.nullableLongAdapter = a4;
        C11725h<List<TextEntry>> a5 = vVar2.mo29869a((Type) C11780y.m37894a((Type) List.class, TextEntry.class), C13188p0.m40531a(), "texts");
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<List<TextE…ions.emptySet(), \"texts\")");
        this.listOfTextEntryAdapter = a5;
        C11725h<List<Image>> a6 = vVar2.mo29869a((Type) C11780y.m37894a((Type) List.class, Image.class), C13188p0.m40531a(), "images");
        Intrinsics.checkReturnedValueIsNotNull((Object) a6, "moshi.adapter<List<Image…ons.emptySet(), \"images\")");
        this.listOfImageAdapter = a6;
        C11725h<List<PlaybackUrl>> a7 = vVar2.mo29869a((Type) C11780y.m37894a((Type) List.class, PlaybackUrl.class), C13188p0.m40531a(), "playbackUrls");
        Intrinsics.checkReturnedValueIsNotNull((Object) a7, "moshi.adapter<List<Playb…ptySet(), \"playbackUrls\")");
        this.listOfPlaybackUrlAdapter = a7;
        C11725h<String> a8 = vVar2.mo29869a((Type) String.class, C13188p0.m40531a(), "originalLanguage");
        Intrinsics.checkReturnedValueIsNotNull((Object) a8, "moshi.adapter<String?>(S…et(), \"originalLanguage\")");
        this.nullableStringAdapter = a8;
        C11725h<DmcMediaMetadata> a9 = vVar2.mo29869a((Type) DmcMediaMetadata.class, C13188p0.m40531a(), "metadata");
        Intrinsics.checkReturnedValueIsNotNull((Object) a9, "moshi.adapter<DmcMediaMe…s.emptySet(), \"metadata\")");
        this.nullableDmcMediaMetadataAdapter = a9;
        C11725h<List<Language>> a10 = vVar2.mo29869a((Type) C11780y.m37894a((Type) List.class, Language.class), C13188p0.m40531a(), "captions");
        Intrinsics.checkReturnedValueIsNotNull((Object) a10, "moshi.adapter<List<Langu…s.emptySet(), \"captions\")");
        this.listOfLanguageAdapter = a10;
        C11725h<DmcVideoMeta> a11 = vVar2.mo29869a((Type) DmcVideoMeta.class, C13188p0.m40531a(), "meta");
        Intrinsics.checkReturnedValueIsNotNull((Object) a11, "moshi.adapter<DmcVideoMe…tions.emptySet(), \"meta\")");
        this.nullableDmcVideoMetaAdapter = a11;
        C11725h<MediaRights> a12 = vVar2.mo29869a((Type) MediaRights.class, C13188p0.m40531a(), "mediaRights");
        Intrinsics.checkReturnedValueIsNotNull((Object) a12, "moshi.adapter<MediaRight…mptySet(), \"mediaRights\")");
        this.mediaRightsAdapter = a12;
        C11725h<List<C3680n>> a13 = vVar2.mo29869a((Type) C11780y.m37894a((Type) List.class, C3680n.class), C13188p0.m40531a(), "videoArt");
        Intrinsics.checkReturnedValueIsNotNull((Object) a13, "moshi.adapter<List<Video…s.emptySet(), \"videoArt\")");
        this.nullableListOfVideoArtAdapter = a13;
        C11725h<List<DmcDisclaimerLabel>> a14 = vVar2.mo29869a((Type) C11780y.m37894a((Type) List.class, DmcDisclaimerLabel.class), C13188p0.m40531a(), "labels");
        Intrinsics.checkReturnedValueIsNotNull((Object) a14, "moshi.adapter<List<DmcDi…ons.emptySet(), \"labels\")");
        this.nullableListOfDmcDisclaimerLabelAdapter = a14;
        C11725h<List<GenreMeta>> a15 = vVar2.mo29869a((Type) C11780y.m37894a((Type) List.class, GenreMeta.class), C13188p0.m40531a(), "typedGenres");
        Intrinsics.checkReturnedValueIsNotNull((Object) a15, "moshi.adapter<List<Genre…mptySet(), \"typedGenres\")");
        this.listOfGenreMetaAdapter = a15;
        C11725h<List<DmcTag>> a16 = vVar2.mo29869a((Type) C11780y.m37894a((Type) List.class, DmcTag.class), C13188p0.m40531a(), "tags");
        Intrinsics.checkReturnedValueIsNotNull((Object) a16, "moshi.adapter<List<DmcTa…tions.emptySet(), \"tags\")");
        this.nullableListOfDmcTagAdapter = a16;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcExtra dmcExtra) {
        if (dmcExtra != null) {
            sVar.mo29791b();
            sVar.mo29796e("contentId");
            this.stringAdapter.toJson(sVar, dmcExtra.mo12903f());
            sVar.mo29796e("type");
            this.dmcAssetTypeAdapter.toJson(sVar, dmcExtra.mo12928V());
            sVar.mo29796e("runtimeMillis");
            this.nullableLongAdapter.toJson(sVar, dmcExtra.mo12913w());
            sVar.mo29796e("internalTitle");
            this.stringAdapter.toJson(sVar, dmcExtra.mo12912u());
            sVar.mo29796e("texts");
            this.listOfTextEntryAdapter.toJson(sVar, dmcExtra.mo12927U());
            sVar.mo29796e("images");
            this.listOfImageAdapter.toJson(sVar, dmcExtra.mo12847a());
            sVar.mo29796e("playbackUrls");
            this.listOfPlaybackUrlAdapter.toJson(sVar, dmcExtra.mo12925S());
            sVar.mo29796e("originalLanguage");
            this.nullableStringAdapter.toJson(sVar, dmcExtra.mo12910s());
            sVar.mo29796e("mediaMetadata");
            this.nullableDmcMediaMetadataAdapter.toJson(sVar, dmcExtra.mo12924R());
            sVar.mo29796e("captions");
            this.listOfLanguageAdapter.toJson(sVar, dmcExtra.mo12915x());
            sVar.mo29796e("meta");
            this.nullableDmcVideoMetaAdapter.toJson(sVar, dmcExtra.mo12923Q());
            sVar.mo29796e("mediaRights");
            this.mediaRightsAdapter.toJson(sVar, dmcExtra.mo12922P());
            sVar.mo29796e("mediaId");
            this.stringAdapter.toJson(sVar, dmcExtra.getMediaId());
            sVar.mo29796e("contentType");
            this.nullableStringAdapter.toJson(sVar, dmcExtra.getContentType());
            sVar.mo29796e("videoArt");
            this.nullableListOfVideoArtAdapter.toJson(sVar, dmcExtra.mo12839H());
            sVar.mo29796e("labels");
            this.nullableListOfDmcDisclaimerLabelAdapter.toJson(sVar, dmcExtra.mo12921O());
            sVar.mo29796e("typedGenres");
            this.listOfGenreMetaAdapter.toJson(sVar, dmcExtra.mo12896c());
            sVar.mo29796e("programType");
            this.stringAdapter.toJson(sVar, dmcExtra.mo12909r());
            sVar.mo29796e("tags");
            this.nullableListOfDmcTagAdapter.toJson(sVar, dmcExtra.mo12926T());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcExtra)";
    }

    public DmcExtra fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        String str = null;
        DmcAssetType dmcAssetType = null;
        Long l = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str3 = null;
        DmcMediaMetadata dmcMediaMetadata = null;
        List list4 = null;
        DmcVideoMeta dmcVideoMeta = null;
        MediaRights mediaRights = null;
        String str4 = null;
        String str5 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        String str6 = null;
        List list8 = null;
        while (mVar.mo29770f()) {
            switch (mVar2.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    String str7 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str7 != null) {
                        str = str7;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'contentId' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 1:
                    DmcAssetType dmcAssetType2 = (DmcAssetType) this.dmcAssetTypeAdapter.fromJson(mVar2);
                    if (dmcAssetType2 != null) {
                        dmcAssetType = dmcAssetType2;
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'type' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 2:
                    l = (Long) this.nullableLongAdapter.fromJson(mVar2);
                    break;
                case 3:
                    String str8 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str8 != null) {
                        str2 = str8;
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Non-null value 'internalTitle' was null at ");
                        sb3.append(mVar.mo29775j0());
                        throw new C11734j(sb3.toString());
                    }
                case 4:
                    List list9 = (List) this.listOfTextEntryAdapter.fromJson(mVar2);
                    if (list9 != null) {
                        list = list9;
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Non-null value 'texts' was null at ");
                        sb4.append(mVar.mo29775j0());
                        throw new C11734j(sb4.toString());
                    }
                case 5:
                    List list10 = (List) this.listOfImageAdapter.fromJson(mVar2);
                    if (list10 != null) {
                        list2 = list10;
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Non-null value 'images' was null at ");
                        sb5.append(mVar.mo29775j0());
                        throw new C11734j(sb5.toString());
                    }
                case 6:
                    List list11 = (List) this.listOfPlaybackUrlAdapter.fromJson(mVar2);
                    if (list11 != null) {
                        list3 = list11;
                        break;
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Non-null value 'playbackUrls' was null at ");
                        sb6.append(mVar.mo29775j0());
                        throw new C11734j(sb6.toString());
                    }
                case 7:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar2);
                    break;
                case 8:
                    dmcMediaMetadata = (DmcMediaMetadata) this.nullableDmcMediaMetadataAdapter.fromJson(mVar2);
                    break;
                case 9:
                    List list12 = (List) this.listOfLanguageAdapter.fromJson(mVar2);
                    if (list12 != null) {
                        list4 = list12;
                        break;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Non-null value 'captions' was null at ");
                        sb7.append(mVar.mo29775j0());
                        throw new C11734j(sb7.toString());
                    }
                case 10:
                    dmcVideoMeta = (DmcVideoMeta) this.nullableDmcVideoMetaAdapter.fromJson(mVar2);
                    break;
                case 11:
                    MediaRights mediaRights2 = (MediaRights) this.mediaRightsAdapter.fromJson(mVar2);
                    if (mediaRights2 != null) {
                        mediaRights = mediaRights2;
                        break;
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Non-null value 'mediaRights' was null at ");
                        sb8.append(mVar.mo29775j0());
                        throw new C11734j(sb8.toString());
                    }
                case 12:
                    String str9 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str9 != null) {
                        str4 = str9;
                        break;
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Non-null value 'mediaId' was null at ");
                        sb9.append(mVar.mo29775j0());
                        throw new C11734j(sb9.toString());
                    }
                case 13:
                    str5 = (String) this.nullableStringAdapter.fromJson(mVar2);
                    break;
                case 14:
                    list5 = (List) this.nullableListOfVideoArtAdapter.fromJson(mVar2);
                    break;
                case 15:
                    list6 = (List) this.nullableListOfDmcDisclaimerLabelAdapter.fromJson(mVar2);
                    break;
                case 16:
                    List list13 = (List) this.listOfGenreMetaAdapter.fromJson(mVar2);
                    if (list13 != null) {
                        list7 = list13;
                        break;
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("Non-null value 'typedGenres' was null at ");
                        sb10.append(mVar.mo29775j0());
                        throw new C11734j(sb10.toString());
                    }
                case 17:
                    String str10 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str10 != null) {
                        str6 = str10;
                        break;
                    } else {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("Non-null value 'programType' was null at ");
                        sb11.append(mVar.mo29775j0());
                        throw new C11734j(sb11.toString());
                    }
                case 18:
                    list8 = (List) this.nullableListOfDmcTagAdapter.fromJson(mVar2);
                    break;
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Required property 'contentId' missing at ");
            sb12.append(mVar.mo29775j0());
            throw new C11734j(sb12.toString());
        } else if (dmcAssetType == null) {
            StringBuilder sb13 = new StringBuilder();
            sb13.append("Required property 'type' missing at ");
            sb13.append(mVar.mo29775j0());
            throw new C11734j(sb13.toString());
        } else if (str2 == null) {
            StringBuilder sb14 = new StringBuilder();
            sb14.append("Required property 'internalTitle' missing at ");
            sb14.append(mVar.mo29775j0());
            throw new C11734j(sb14.toString());
        } else if (list == null) {
            StringBuilder sb15 = new StringBuilder();
            sb15.append("Required property 'texts' missing at ");
            sb15.append(mVar.mo29775j0());
            throw new C11734j(sb15.toString());
        } else if (list2 == null) {
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Required property 'images' missing at ");
            sb16.append(mVar.mo29775j0());
            throw new C11734j(sb16.toString());
        } else if (list3 == null) {
            StringBuilder sb17 = new StringBuilder();
            sb17.append("Required property 'playbackUrls' missing at ");
            sb17.append(mVar.mo29775j0());
            throw new C11734j(sb17.toString());
        } else if (list4 == null) {
            StringBuilder sb18 = new StringBuilder();
            sb18.append("Required property 'captions' missing at ");
            sb18.append(mVar.mo29775j0());
            throw new C11734j(sb18.toString());
        } else if (mediaRights == null) {
            StringBuilder sb19 = new StringBuilder();
            sb19.append("Required property 'mediaRights' missing at ");
            sb19.append(mVar.mo29775j0());
            throw new C11734j(sb19.toString());
        } else if (str4 == null) {
            StringBuilder sb20 = new StringBuilder();
            sb20.append("Required property 'mediaId' missing at ");
            sb20.append(mVar.mo29775j0());
            throw new C11734j(sb20.toString());
        } else if (list7 == null) {
            StringBuilder sb21 = new StringBuilder();
            sb21.append("Required property 'typedGenres' missing at ");
            sb21.append(mVar.mo29775j0());
            throw new C11734j(sb21.toString());
        } else if (str6 != null) {
            DmcExtra dmcExtra = new DmcExtra(str, dmcAssetType, l, str2, list, list2, list3, str3, dmcMediaMetadata, list4, dmcVideoMeta, mediaRights, str4, str5, list5, list6, list7, str6, list8);
            return dmcExtra;
        } else {
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Required property 'programType' missing at ");
            sb22.append(mVar.mo29775j0());
            throw new C11734j(sb22.toString());
        }
    }
}
