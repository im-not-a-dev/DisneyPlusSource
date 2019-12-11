package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3686h;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000b\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000b\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000b¢\u0006\u0002\u0010%J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010D\u001a\u00020\u0019HÆ\u0003J\t\u0010E\u001a\u00020\u0004HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000bHÆ\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000bHÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020!0\u000bHÆ\u0003J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000bHÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00109J\t\u0010N\u001a\u00020\u0004HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000b2\b\b\u0002\u0010\"\u001a\u00020\u00042\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010UJ\t\u0010V\u001a\u00020WHÖ\u0001J\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0003J\t\u0010\\\u001a\u00020WHÖ\u0001J\t\u0010]\u001a\u00020\u0004HÖ\u0001J\u0019\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020WHÖ\u0001R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0014\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0014\u0010\u001a\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0014\u0010\"\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010'R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010'R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'¨\u0006c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcExtra;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcPlayable;", "Lcom/bamtechmedia/dominguez/core/content/Extra;", "contentId", "", "type", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "runtimeMillis", "", "internalTitle", "texts", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "images", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "playbackUrls", "Lcom/bamtechmedia/dominguez/core/content/assets/PlaybackUrl;", "originalLanguage", "metadata", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "captions", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "meta", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;", "mediaRights", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "mediaId", "contentType", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "labels", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcDisclaimerLabel;", "typedGenres", "Lcom/bamtechmedia/dominguez/core/content/GenreMeta;", "programType", "tags", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcTag;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getCaptions", "()Ljava/util/List;", "getContentId", "()Ljava/lang/String;", "getContentType", "getImages", "getInternalTitle", "getLabels", "getMediaId", "getMediaRights", "()Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;", "getMetadata", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "getOriginalLanguage", "getPlaybackUrls", "getProgramType", "getRuntimeMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTags", "getTexts", "getType", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "getTypedGenres", "getVideoArt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/bamtechmedia/dominguez/core/content/assets/DmcExtra;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcExtra.kt */
public final class DmcExtra extends C3635i implements C3686h {
    public static final Creator CREATOR = new C3598a();

    /* renamed from: A0 */
    private final List<DmcTag> f8985A0;

    /* renamed from: i0 */
    private final String f8986i0;

    /* renamed from: j0 */
    private final DmcAssetType f8987j0;

    /* renamed from: k0 */
    private final Long f8988k0;

    /* renamed from: l0 */
    private final String f8989l0;

    /* renamed from: m0 */
    private final List<TextEntry> f8990m0;

    /* renamed from: n0 */
    private final List<Image> f8991n0;

    /* renamed from: o0 */
    private final List<PlaybackUrl> f8992o0;

    /* renamed from: p0 */
    private final String f8993p0;

    /* renamed from: q0 */
    private final DmcMediaMetadata f8994q0;

    /* renamed from: r0 */
    private final List<Language> f8995r0;

    /* renamed from: s0 */
    private final DmcVideoMeta f8996s0;

    /* renamed from: t0 */
    private final MediaRights f8997t0;

    /* renamed from: u0 */
    private final String f8998u0;

    /* renamed from: v0 */
    private final String f8999v0;

    /* renamed from: w0 */
    private final List<C3680n> f9000w0;

    /* renamed from: x0 */
    private final List<DmcDisclaimerLabel> f9001x0;

    /* renamed from: y0 */
    private final List<GenreMeta> f9002y0;

    /* renamed from: z0 */
    private final String f9003z0;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcExtra$a */
    public static class C3598a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Parcel parcel2 = parcel;
            String readString = parcel.readString();
            DmcAssetType dmcAssetType = (DmcAssetType) Enum.valueOf(DmcAssetType.class, parcel.readString());
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList6.add((TextEntry) parcel2.readParcelable(DmcExtra.class.getClassLoader()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList7.add((Image) parcel2.readParcelable(DmcExtra.class.getClassLoader()));
                readInt2--;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList8.add((PlaybackUrl) PlaybackUrl.CREATOR.createFromParcel(parcel2));
                readInt3--;
            }
            String readString3 = parcel.readString();
            DmcMediaMetadata dmcMediaMetadata = parcel.readInt() != 0 ? (DmcMediaMetadata) DmcMediaMetadata.CREATOR.createFromParcel(parcel2) : null;
            int readInt4 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(readInt4);
            while (readInt4 != 0) {
                arrayList9.add((Language) parcel2.readParcelable(DmcExtra.class.getClassLoader()));
                readInt4--;
            }
            DmcVideoMeta dmcVideoMeta = parcel.readInt() != 0 ? (DmcVideoMeta) DmcVideoMeta.CREATOR.createFromParcel(parcel2) : null;
            MediaRights mediaRights = (MediaRights) MediaRights.CREATOR.createFromParcel(parcel2);
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt5);
                while (readInt5 != 0) {
                    String str2 = readString4;
                    arrayList10.add((C3680n) parcel2.readParcelable(DmcExtra.class.getClassLoader()));
                    readInt5--;
                    readString4 = str2;
                }
                str = readString4;
                arrayList = arrayList10;
            } else {
                str = readString4;
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt6);
                while (true) {
                    arrayList3 = arrayList;
                    if (readInt6 == 0) {
                        break;
                    }
                    arrayList11.add((DmcDisclaimerLabel) DmcDisclaimerLabel.CREATOR.createFromParcel(parcel2));
                    readInt6--;
                    arrayList = arrayList3;
                }
                arrayList2 = arrayList11;
            } else {
                arrayList3 = arrayList;
                arrayList2 = null;
            }
            int readInt7 = parcel.readInt();
            ArrayList arrayList12 = new ArrayList(readInt7);
            while (readInt7 != 0) {
                arrayList12.add((GenreMeta) parcel2.readParcelable(DmcExtra.class.getClassLoader()));
                readInt7--;
            }
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt8 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(readInt8);
                while (true) {
                    arrayList5 = arrayList12;
                    if (readInt8 == 0) {
                        break;
                    }
                    arrayList13.add((DmcTag) DmcTag.CREATOR.createFromParcel(parcel2));
                    readInt8--;
                    arrayList12 = arrayList5;
                }
                arrayList4 = arrayList13;
            } else {
                arrayList5 = arrayList12;
                arrayList4 = null;
            }
            DmcExtra dmcExtra = new DmcExtra(readString, dmcAssetType, valueOf, readString2, arrayList6, arrayList7, arrayList8, readString3, dmcMediaMetadata, arrayList9, dmcVideoMeta, mediaRights, str, readString5, arrayList3, arrayList2, arrayList5, readString6, arrayList4);
            return dmcExtra;
        }

        public final Object[] newArray(int i) {
            return new DmcExtra[i];
        }
    }

    public DmcExtra(String str, DmcAssetType dmcAssetType, Long l, String str2, List<TextEntry> list, List<Image> list2, List<PlaybackUrl> list3, String str3, @C11724g(name = "mediaMetadata") DmcMediaMetadata dmcMediaMetadata, List<Language> list4, DmcVideoMeta dmcVideoMeta, MediaRights mediaRights, String str4, String str5, List<? extends C3680n> list5, List<DmcDisclaimerLabel> list6, List<GenreMeta> list7, String str6, List<DmcTag> list8) {
        DmcMediaMetadata dmcMediaMetadata2 = dmcMediaMetadata;
        List<DmcDisclaimerLabel> list9 = list6;
        List<GenreMeta> list10 = list7;
        super(list, list2, C13185o.m40513a(), C13185o.m40513a(), C13185o.m40513a(), dmcMediaMetadata2, list3, C13185o.m40513a(), list10, dmcVideoMeta, mediaRights, list9, null, null, list5, list8, 12288, null);
        this.f8986i0 = str;
        this.f8987j0 = dmcAssetType;
        this.f8988k0 = l;
        this.f8989l0 = str2;
        this.f8990m0 = list;
        this.f8991n0 = list2;
        this.f8992o0 = list3;
        this.f8993p0 = str3;
        this.f8994q0 = dmcMediaMetadata;
        this.f8995r0 = list4;
        this.f8996s0 = dmcVideoMeta;
        this.f8997t0 = mediaRights;
        this.f8998u0 = str4;
        this.f8999v0 = str5;
        this.f9000w0 = list5;
        this.f9001x0 = list6;
        this.f9002y0 = list7;
        this.f9003z0 = str6;
        this.f8985A0 = list8;
    }

    /* renamed from: H */
    public List<C3680n> mo12839H() {
        return this.f9000w0;
    }

    /* renamed from: O */
    public final List<DmcDisclaimerLabel> mo12921O() {
        return this.f9001x0;
    }

    /* renamed from: P */
    public final MediaRights mo12922P() {
        return this.f8997t0;
    }

    /* renamed from: Q */
    public final DmcVideoMeta mo12923Q() {
        return this.f8996s0;
    }

    /* renamed from: R */
    public final DmcMediaMetadata mo12924R() {
        return this.f8994q0;
    }

    /* renamed from: S */
    public final List<PlaybackUrl> mo12925S() {
        return this.f8992o0;
    }

    /* renamed from: T */
    public final List<DmcTag> mo12926T() {
        return this.f8985A0;
    }

    /* renamed from: U */
    public final List<TextEntry> mo12927U() {
        return this.f8990m0;
    }

    /* renamed from: V */
    public DmcAssetType mo12928V() {
        return this.f8987j0;
    }

    /* renamed from: a */
    public List<Image> mo12847a() {
        return this.f8991n0;
    }

    /* renamed from: c */
    public List<GenreMeta> mo12896c() {
        return this.f9002y0;
    }

    public final DmcExtra copy(String str, DmcAssetType dmcAssetType, Long l, String str2, List<TextEntry> list, List<Image> list2, List<PlaybackUrl> list3, String str3, @C11724g(name = "mediaMetadata") DmcMediaMetadata dmcMediaMetadata, List<Language> list4, DmcVideoMeta dmcVideoMeta, MediaRights mediaRights, String str4, String str5, List<? extends C3680n> list5, List<DmcDisclaimerLabel> list6, List<GenreMeta> list7, String str6, List<DmcTag> list8) {
        DmcExtra dmcExtra = new DmcExtra(str, dmcAssetType, l, str2, list, list2, list3, str3, dmcMediaMetadata, list4, dmcVideoMeta, mediaRights, str4, str5, list5, list6, list7, str6, list8);
        return dmcExtra;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f4, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f8985A0, (java.lang.Object) r3.f8985A0) != false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00f9
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.DmcExtra
            if (r0 == 0) goto L_0x00f7
            com.bamtechmedia.dominguez.core.content.assets.DmcExtra r3 = (com.bamtechmedia.dominguez.core.content.assets.DmcExtra) r3
            java.lang.String r0 = r2.mo12903f()
            java.lang.String r1 = r3.mo12903f()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            com.bamtechmedia.dominguez.core.content.assets.DmcAssetType r0 = r2.mo12928V()
            com.bamtechmedia.dominguez.core.content.assets.DmcAssetType r1 = r3.mo12928V()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.lang.Long r0 = r2.mo12913w()
            java.lang.Long r1 = r3.mo12913w()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r2.mo12912u()
            java.lang.String r1 = r3.mo12912u()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r0 = r2.f8990m0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r1 = r3.f8990m0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.util.List r0 = r2.mo12847a()
            java.util.List r1 = r3.mo12847a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.PlaybackUrl> r0 = r2.f8992o0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.PlaybackUrl> r1 = r3.f8992o0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r2.mo12910s()
            java.lang.String r1 = r3.mo12910s()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata r0 = r2.f8994q0
            com.bamtechmedia.dominguez.core.content.assets.DmcMediaMetadata r1 = r3.f8994q0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.util.List r0 = r2.mo12915x()
            java.util.List r1 = r3.mo12915x()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta r0 = r2.f8996s0
            com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta r1 = r3.f8996s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            com.bamtechmedia.dominguez.core.content.assets.MediaRights r0 = r2.f8997t0
            com.bamtechmedia.dominguez.core.content.assets.MediaRights r1 = r3.f8997t0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r2.getMediaId()
            java.lang.String r1 = r3.getMediaId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r2.getContentType()
            java.lang.String r1 = r3.getContentType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.util.List r0 = r2.mo12839H()
            java.util.List r1 = r3.mo12839H()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel> r0 = r2.f9001x0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcDisclaimerLabel> r1 = r3.f9001x0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.util.List r0 = r2.mo12896c()
            java.util.List r1 = r3.mo12896c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r2.mo12909r()
            java.lang.String r1 = r3.mo12909r()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00f7
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcTag> r0 = r2.f8985A0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.DmcTag> r3 = r3.f8985A0
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r3 = 0
            return r3
        L_0x00f9:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcExtra.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo12903f() {
        return this.f8986i0;
    }

    public String getContentType() {
        return this.f8999v0;
    }

    public String getMediaId() {
        return this.f8998u0;
    }

    public int hashCode() {
        String f = mo12903f();
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        DmcAssetType V = mo12928V();
        int hashCode2 = (hashCode + (V != null ? V.hashCode() : 0)) * 31;
        Long w = mo12913w();
        int hashCode3 = (hashCode2 + (w != null ? w.hashCode() : 0)) * 31;
        String u = mo12912u();
        int hashCode4 = (hashCode3 + (u != null ? u.hashCode() : 0)) * 31;
        List<TextEntry> list = this.f8990m0;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List a = mo12847a();
        int hashCode6 = (hashCode5 + (a != null ? a.hashCode() : 0)) * 31;
        List<PlaybackUrl> list2 = this.f8992o0;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String s = mo12910s();
        int hashCode8 = (hashCode7 + (s != null ? s.hashCode() : 0)) * 31;
        DmcMediaMetadata dmcMediaMetadata = this.f8994q0;
        int hashCode9 = (hashCode8 + (dmcMediaMetadata != null ? dmcMediaMetadata.hashCode() : 0)) * 31;
        List x = mo12915x();
        int hashCode10 = (hashCode9 + (x != null ? x.hashCode() : 0)) * 31;
        DmcVideoMeta dmcVideoMeta = this.f8996s0;
        int hashCode11 = (hashCode10 + (dmcVideoMeta != null ? dmcVideoMeta.hashCode() : 0)) * 31;
        MediaRights mediaRights = this.f8997t0;
        int hashCode12 = (hashCode11 + (mediaRights != null ? mediaRights.hashCode() : 0)) * 31;
        String mediaId = getMediaId();
        int hashCode13 = (hashCode12 + (mediaId != null ? mediaId.hashCode() : 0)) * 31;
        String contentType = getContentType();
        int hashCode14 = (hashCode13 + (contentType != null ? contentType.hashCode() : 0)) * 31;
        List H = mo12839H();
        int hashCode15 = (hashCode14 + (H != null ? H.hashCode() : 0)) * 31;
        List<DmcDisclaimerLabel> list3 = this.f9001x0;
        int hashCode16 = (hashCode15 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List c = mo12896c();
        int hashCode17 = (hashCode16 + (c != null ? c.hashCode() : 0)) * 31;
        String r = mo12909r();
        int hashCode18 = (hashCode17 + (r != null ? r.hashCode() : 0)) * 31;
        List<DmcTag> list4 = this.f8985A0;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode18 + i;
    }

    /* renamed from: r */
    public String mo12909r() {
        return this.f9003z0;
    }

    /* renamed from: s */
    public String mo12910s() {
        return this.f8993p0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcExtra(contentId=");
        sb.append(mo12903f());
        sb.append(", type=");
        sb.append(mo12928V());
        sb.append(", runtimeMillis=");
        sb.append(mo12913w());
        sb.append(", internalTitle=");
        sb.append(mo12912u());
        sb.append(", texts=");
        sb.append(this.f8990m0);
        sb.append(", images=");
        sb.append(mo12847a());
        sb.append(", playbackUrls=");
        sb.append(this.f8992o0);
        sb.append(", originalLanguage=");
        sb.append(mo12910s());
        sb.append(", metadata=");
        sb.append(this.f8994q0);
        sb.append(", captions=");
        sb.append(mo12915x());
        sb.append(", meta=");
        sb.append(this.f8996s0);
        sb.append(", mediaRights=");
        sb.append(this.f8997t0);
        sb.append(", mediaId=");
        sb.append(getMediaId());
        sb.append(", contentType=");
        sb.append(getContentType());
        sb.append(", videoArt=");
        sb.append(mo12839H());
        sb.append(", labels=");
        sb.append(this.f9001x0);
        sb.append(", typedGenres=");
        sb.append(mo12896c());
        sb.append(", programType=");
        sb.append(mo12909r());
        sb.append(", tags=");
        sb.append(this.f8985A0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public String mo12912u() {
        return this.f8989l0;
    }

    /* renamed from: w */
    public Long mo12913w() {
        return this.f8988k0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8986i0);
        parcel.writeString(this.f8987j0.name());
        Long l = this.f8988k0;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f8989l0);
        List<TextEntry> list = this.f8990m0;
        parcel.writeInt(list.size());
        for (TextEntry writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<Image> list2 = this.f8991n0;
        parcel.writeInt(list2.size());
        for (Image writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        List<PlaybackUrl> list3 = this.f8992o0;
        parcel.writeInt(list3.size());
        for (PlaybackUrl writeToParcel : list3) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.f8993p0);
        DmcMediaMetadata dmcMediaMetadata = this.f8994q0;
        if (dmcMediaMetadata != null) {
            parcel.writeInt(1);
            dmcMediaMetadata.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Language> list4 = this.f8995r0;
        parcel.writeInt(list4.size());
        for (Language writeParcelable3 : list4) {
            parcel.writeParcelable(writeParcelable3, i);
        }
        DmcVideoMeta dmcVideoMeta = this.f8996s0;
        if (dmcVideoMeta != null) {
            parcel.writeInt(1);
            dmcVideoMeta.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        this.f8997t0.writeToParcel(parcel, 0);
        parcel.writeString(this.f8998u0);
        parcel.writeString(this.f8999v0);
        List<C3680n> list5 = this.f9000w0;
        if (list5 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            for (C3680n writeParcelable4 : list5) {
                parcel.writeParcelable(writeParcelable4, i);
            }
        } else {
            parcel.writeInt(0);
        }
        List<DmcDisclaimerLabel> list6 = this.f9001x0;
        if (list6 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            for (DmcDisclaimerLabel writeToParcel2 : list6) {
                writeToParcel2.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<GenreMeta> list7 = this.f9002y0;
        parcel.writeInt(list7.size());
        for (GenreMeta writeParcelable5 : list7) {
            parcel.writeParcelable(writeParcelable5, i);
        }
        parcel.writeString(this.f9003z0);
        List<DmcTag> list8 = this.f8985A0;
        if (list8 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list8.size());
            for (DmcTag writeToParcel3 : list8) {
                writeToParcel3.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: x */
    public List<Language> mo12915x() {
        return this.f8995r0;
    }
}
