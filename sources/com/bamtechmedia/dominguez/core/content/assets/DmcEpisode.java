package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bamtech.sdk4.bookmarks.Bookmark;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.DateUtils;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000b\u0012\u0006\u0010!\u001a\u00020\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000b\u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000b\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00100\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\u0004\u0012\b\b\u0002\u00102\u001a\u00020\b\u0012\u000e\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u000b\u0012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u000b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\b\u0012\u000e\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u000b¢\u0006\u0002\u0010:J\b\u0010r\u001a\u0004\u0018\u00010sJ\t\u0010t\u001a\u00020\u0004HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010<J\t\u0010v\u001a\u00020\u0004HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010x\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010<J\u000f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bHÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000bHÆ\u0003J\t\u0010{\u001a\u00020\u0004HÆ\u0003J\u000f\u0010|\u001a\b\u0012\u0004\u0012\u00020 0\u000bHÆ\u0003J\t\u0010}\u001a\u00020\"HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010_J\n\u0010\u0001\u001a\u00020\bHÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010_J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bHÆ\u0003JÖ\u0003\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000b2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000b2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000b2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\b2\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u000b2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u000b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u000bHÆ\u0001¢\u0006\u0003\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u00002\u0006\u00102\u001a\u00020\bH\u0016J\u0011\u0010\u0001\u001a\u00020\u00022\u0006\u00107\u001a\u00020\bH\u0016J\n\u0010\u0001\u001a\u00020\u0016HÖ\u0001J\u0017\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0001\u001a\u00020\u0016HÖ\u0001J\n\u0010 \u0001\u001a\u00020\u0004HÖ\u0001J\u001e\u0010¡\u0001\u001a\u00030¢\u00012\b\u0010£\u0001\u001a\u00030¤\u00012\u0007\u0010¥\u0001\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010,\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010BR\u0014\u0010G\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010=\u001a\u0004\bJ\u0010<R\u0014\u0010K\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010IR\u0016\u0010M\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010BR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010?R\u0014\u0010\u001e\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010BR\u0019\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010?R\u0014\u0010%\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010BR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010?R\u0016\u0010&\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010BR\u0013\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010BR\u001c\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010?R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\b\n\u0000\u001a\u0004\b]\u0010?R\u0018\u00107\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\n\n\u0002\u0010`\u001a\u0004\b^\u0010_R\u0014\u00102\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0014\u00100\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010BR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010?R\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\be\u0010?R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\n\n\u0002\u0010`\u001a\u0004\bf\u0010_R\u0014\u00101\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010BR\u0014\u0010h\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\bi\u0010IR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010=\u001a\u0004\bj\u0010<R\u0014\u0010\u0017\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010BR\u0019\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bl\u0010?R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\bm\u0010?R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010?R\u001c\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010?¨\u0006¦\u0001"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcEpisode;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcPlayable;", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "contentId", "", "type", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "runtimeMillis", "", "encodedSeriesId", "texts", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "images", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "playbackUrls", "Lcom/bamtechmedia/dominguez/core/content/assets/PlaybackUrl;", "metadata", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "captions", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "seasonSequenceNumber", "", "seriesId", "episodeSequenceNumber", "_episodeSeriesSequenceNumber", "ratings", "Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "typedGenres", "Lcom/bamtechmedia/dominguez/core/content/GenreMeta;", "internalTitle", "milestones", "Lcom/bamtechmedia/dominguez/core/content/assets/Milestone;", "mediaRights", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "currentAvailability", "Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "mediaId", "originalLanguage", "participants", "Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "releases", "Lcom/bamtechmedia/dominguez/core/content/assets/Release;", "childOf", "contentType", "parentOf", "meta", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;", "programType", "seasonId", "predictedSize", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "labels", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcDisclaimerLabel;", "playhead", "tags", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcTag;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Lcom/bamtechmedia/dominguez/core/content/assets/Availability;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)V", "get_episodeSeriesSequenceNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCaptions", "()Ljava/util/List;", "getChildOf", "getContentId", "()Ljava/lang/String;", "getContentType", "getCurrentAvailability", "()Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "getEncodedSeriesId", "episodeNumber", "getEpisodeNumber", "()I", "getEpisodeSequenceNumber", "episodeSeriesSequenceNumber", "getEpisodeSeriesSequenceNumber", "episodeSeriesTitle", "getEpisodeSeriesTitle", "getImages", "getInternalTitle", "getLabels", "getMediaId", "getMediaRights", "()Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;", "getMetadata", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "getMilestones", "getOriginalLanguage", "getParentOf", "getParticipants", "getPlaybackUrls", "getPlayhead", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPredictedSize", "()J", "getProgramType", "getRatings", "getReleases", "getRuntimeMillis", "getSeasonId", "seasonNumber", "getSeasonNumber", "getSeasonSequenceNumber", "getSeriesId", "getTags", "getTexts", "getType", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "getTypedGenres", "getVideoArt", "bookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Lcom/bamtechmedia/dominguez/core/content/assets/Availability;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)Lcom/bamtechmedia/dominguez/core/content/assets/DmcEpisode;", "copyWith", "copyWithPlayhead", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcEpisode.kt */
public final class DmcEpisode extends C3635i implements C3685g {
    public static final Creator CREATOR = new C3597a();

    /* renamed from: A0 */
    private final Availability f8951A0;

    /* renamed from: B0 */
    private final String f8952B0;

    /* renamed from: C0 */
    private final String f8953C0;

    /* renamed from: D0 */
    private final List<Participant> f8954D0;

    /* renamed from: E0 */
    private final List<Release> f8955E0;

    /* renamed from: F0 */
    private final List<String> f8956F0;

    /* renamed from: G0 */
    private final String f8957G0;

    /* renamed from: H0 */
    private final String f8958H0;

    /* renamed from: I0 */
    private final DmcVideoMeta f8959I0;

    /* renamed from: J0 */
    private final String f8960J0;

    /* renamed from: K0 */
    private final String f8961K0;

    /* renamed from: L0 */
    private final long f8962L0;

    /* renamed from: M0 */
    private final List<C3680n> f8963M0;

    /* renamed from: N0 */
    private final List<DmcDisclaimerLabel> f8964N0;

    /* renamed from: O0 */
    private final Long f8965O0;

    /* renamed from: P0 */
    private final List<DmcTag> f8966P0;

    /* renamed from: i0 */
    private final String f8967i0;

    /* renamed from: j0 */
    private final DmcAssetType f8968j0;

    /* renamed from: k0 */
    private final Long f8969k0;

    /* renamed from: l0 */
    private final String f8970l0;

    /* renamed from: m0 */
    private final List<TextEntry> f8971m0;

    /* renamed from: n0 */
    private final List<Image> f8972n0;

    /* renamed from: o0 */
    private final List<PlaybackUrl> f8973o0;

    /* renamed from: p0 */
    private final DmcMediaMetadata f8974p0;

    /* renamed from: q0 */
    private final List<Language> f8975q0;

    /* renamed from: r0 */
    private final Integer f8976r0;

    /* renamed from: s0 */
    private final String f8977s0;

    /* renamed from: t0 */
    private final Integer f8978t0;

    /* renamed from: u0 */
    private final Integer f8979u0;

    /* renamed from: v0 */
    private final List<Rating> f8980v0;

    /* renamed from: w0 */
    private final List<GenreMeta> f8981w0;

    /* renamed from: x0 */
    private final String f8982x0;

    /* renamed from: y0 */
    private final List<Milestone> f8983y0;

    /* renamed from: z0 */
    private final MediaRights f8984z0;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcEpisode$a */
    public static class C3597a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Parcel parcel2 = parcel;
            String readString = parcel.readString();
            DmcAssetType dmcAssetType = (DmcAssetType) Enum.valueOf(DmcAssetType.class, parcel.readString());
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList8.add((TextEntry) parcel2.readParcelable(DmcEpisode.class.getClassLoader()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList9.add((Image) parcel2.readParcelable(DmcEpisode.class.getClassLoader()));
                readInt2--;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList10.add((PlaybackUrl) PlaybackUrl.CREATOR.createFromParcel(parcel2));
                readInt3--;
            }
            DmcMediaMetadata dmcMediaMetadata = parcel.readInt() != 0 ? (DmcMediaMetadata) DmcMediaMetadata.CREATOR.createFromParcel(parcel2) : null;
            int readInt4 = parcel.readInt();
            ArrayList arrayList11 = new ArrayList(readInt4);
            while (readInt4 != 0) {
                arrayList11.add((Language) parcel2.readParcelable(DmcEpisode.class.getClassLoader()));
                readInt4--;
            }
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf4 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int readInt5 = parcel.readInt();
            Integer num = valueOf4;
            ArrayList arrayList12 = new ArrayList(readInt5);
            while (readInt5 != 0) {
                arrayList12.add((Rating) parcel2.readParcelable(DmcEpisode.class.getClassLoader()));
                readInt5--;
            }
            int readInt6 = parcel.readInt();
            ArrayList arrayList13 = new ArrayList(readInt6);
            while (readInt6 != 0) {
                ArrayList arrayList14 = arrayList12;
                arrayList13.add((GenreMeta) parcel2.readParcelable(DmcEpisode.class.getClassLoader()));
                readInt6--;
                arrayList12 = arrayList14;
            }
            ArrayList arrayList15 = arrayList12;
            String readString4 = parcel.readString();
            int readInt7 = parcel.readInt();
            ArrayList arrayList16 = new ArrayList(readInt7);
            while (true) {
                arrayList = arrayList13;
                if (readInt7 == 0) {
                    break;
                }
                arrayList16.add((Milestone) Milestone.CREATOR.createFromParcel(parcel2));
                readInt7--;
                arrayList13 = arrayList;
            }
            MediaRights mediaRights = (MediaRights) MediaRights.CREATOR.createFromParcel(parcel2);
            Availability availability = (Availability) parcel2.readParcelable(DmcEpisode.class.getClassLoader());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt8 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(readInt8);
                while (readInt8 != 0) {
                    ArrayList arrayList18 = arrayList16;
                    arrayList17.add((Participant) parcel2.readParcelable(DmcEpisode.class.getClassLoader()));
                    readInt8--;
                    arrayList16 = arrayList18;
                }
                arrayList2 = arrayList16;
                arrayList3 = arrayList17;
            } else {
                arrayList2 = arrayList16;
                arrayList3 = null;
            }
            if (parcel.readInt() != 0) {
                int readInt9 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(readInt9);
                while (readInt9 != 0) {
                    arrayList19.add((Release) Release.CREATOR.createFromParcel(parcel2));
                    readInt9--;
                }
                arrayList4 = arrayList19;
            } else {
                arrayList4 = null;
            }
            ArrayList createStringArrayList = parcel.createStringArrayList();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            DmcVideoMeta dmcVideoMeta = parcel.readInt() != 0 ? (DmcVideoMeta) DmcVideoMeta.CREATOR.createFromParcel(parcel2) : null;
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                int readInt10 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(readInt10);
                while (readInt10 != 0) {
                    arrayList20.add((C3680n) parcel2.readParcelable(DmcEpisode.class.getClassLoader()));
                    readInt10--;
                }
                arrayList5 = arrayList20;
            } else {
                arrayList5 = null;
            }
            if (parcel.readInt() != 0) {
                int readInt11 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(readInt11);
                while (readInt11 != 0) {
                    arrayList21.add((DmcDisclaimerLabel) DmcDisclaimerLabel.CREATOR.createFromParcel(parcel2));
                    readInt11--;
                }
                arrayList6 = arrayList21;
            } else {
                arrayList6 = null;
            }
            Long valueOf5 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            if (parcel.readInt() != 0) {
                int readInt12 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(readInt12);
                while (readInt12 != 0) {
                    arrayList22.add((DmcTag) DmcTag.CREATOR.createFromParcel(parcel2));
                    readInt12--;
                }
                arrayList7 = arrayList22;
            } else {
                arrayList7 = null;
            }
            DmcEpisode dmcEpisode = new DmcEpisode(readString, dmcAssetType, valueOf, readString2, arrayList8, arrayList9, arrayList10, dmcMediaMetadata, arrayList11, valueOf2, readString3, valueOf3, num, arrayList15, arrayList, readString4, arrayList2, mediaRights, availability, readString5, readString6, arrayList3, arrayList4, createStringArrayList, readString7, readString8, dmcVideoMeta, readString9, readString10, readLong, arrayList5, arrayList6, valueOf5, arrayList7);
            return dmcEpisode;
        }

        public final Object[] newArray(int i) {
            return new DmcEpisode[i];
        }
    }

    public /* synthetic */ DmcEpisode(String str, DmcAssetType dmcAssetType, Long l, String str2, List list, List list2, List list3, DmcMediaMetadata dmcMediaMetadata, List list4, Integer num, String str3, Integer num2, Integer num3, List list5, List list6, String str4, List list7, MediaRights mediaRights, Availability availability, String str5, String str6, List list8, List list9, List list10, String str7, String str8, DmcVideoMeta dmcVideoMeta, String str9, String str10, long j, List list11, List list12, Long l2, List list13, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Long l3;
        String str11 = (i & 134217728) != 0 ? "episode" : str9;
        long j2 = 0;
        long j3 = (i & 536870912) != 0 ? 0 : j;
        if ((i2 & 1) != 0) {
            if (dmcVideoMeta != null) {
                UserMediaMeta X = dmcVideoMeta.mo13065X();
                if (X != null) {
                    j2 = X.getPlayhead();
                }
            }
            l3 = Long.valueOf(j2);
        } else {
            l3 = l2;
        }
        this(str, dmcAssetType, l, str2, list, list2, list3, dmcMediaMetadata, list4, num, str3, num2, num3, list5, list6, str4, list7, mediaRights, availability, str5, str6, list8, list9, list10, str7, str8, dmcVideoMeta, str11, str10, j3, list11, list12, l3, list13);
    }

    /* renamed from: a */
    public static /* synthetic */ DmcEpisode m12116a(DmcEpisode dmcEpisode, String str, DmcAssetType dmcAssetType, Long l, String str2, List list, List list2, List list3, DmcMediaMetadata dmcMediaMetadata, List list4, Integer num, String str3, Integer num2, Integer num3, List list5, List list6, String str4, List list7, MediaRights mediaRights, Availability availability, String str5, String str6, List list8, List list9, List list10, String str7, String str8, DmcVideoMeta dmcVideoMeta, String str9, String str10, long j, List list11, List list12, Long l2, List list13, int i, int i2, Object obj) {
        DmcEpisode dmcEpisode2 = dmcEpisode;
        int i3 = i;
        String f = (i3 & 1) != 0 ? dmcEpisode.mo12903f() : str;
        DmcAssetType e0 = (i3 & 2) != 0 ? dmcEpisode.mo12901e0() : dmcAssetType;
        Long w = (i3 & 4) != 0 ? dmcEpisode.mo12913w() : l;
        String C = (i3 & 8) != 0 ? dmcEpisode.mo12873C() : str2;
        List list14 = (i3 & 16) != 0 ? dmcEpisode2.f8971m0 : list;
        List a = (i3 & 32) != 0 ? dmcEpisode.mo12847a() : list2;
        List list15 = (i3 & 64) != 0 ? dmcEpisode2.f8973o0 : list3;
        DmcMediaMetadata dmcMediaMetadata2 = (i3 & 128) != 0 ? dmcEpisode2.f8974p0 : dmcMediaMetadata;
        List x = (i3 & 256) != 0 ? dmcEpisode.mo12915x() : list4;
        Integer num4 = (i3 & DateUtils.FORMAT_NO_NOON) != 0 ? dmcEpisode2.f8976r0 : num;
        String D = (i3 & 1024) != 0 ? dmcEpisode.mo12874D() : str3;
        Integer num5 = (i3 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? dmcEpisode2.f8978t0 : num2;
        Integer num6 = (i3 & 4096) != 0 ? dmcEpisode2.f8979u0 : num3;
        List list16 = (i3 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? dmcEpisode2.f8980v0 : list5;
        List c = (i3 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? dmcEpisode.mo12896c() : list6;
        String u = (i3 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? dmcEpisode.mo12912u() : str4;
        List list17 = c;
        List list18 = (i3 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? dmcEpisode2.f8983y0 : list7;
        MediaRights mediaRights2 = (i3 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? dmcEpisode2.f8984z0 : mediaRights;
        Availability availability2 = (i3 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? dmcEpisode2.f8951A0 : availability;
        String mediaId = (i3 & DateUtils.FORMAT_ABBREV_ALL) != 0 ? dmcEpisode.getMediaId() : str5;
        String s = (i3 & 1048576) != 0 ? dmcEpisode.mo12910s() : str6;
        List z = (i3 & 2097152) != 0 ? dmcEpisode.mo12916z() : list8;
        Availability availability3 = availability2;
        List list19 = (i3 & 4194304) != 0 ? dmcEpisode2.f8955E0 : list9;
        List list20 = (i3 & 8388608) != 0 ? dmcEpisode2.f8956F0 : list10;
        return dmcEpisode.copy(f, e0, w, C, list14, a, list15, dmcMediaMetadata2, x, num4, D, num5, num6, list16, list17, u, list18, mediaRights2, availability3, mediaId, s, z, list19, list20, (i3 & 16777216) != 0 ? dmcEpisode.getContentType() : str7, (i3 & 33554432) != 0 ? dmcEpisode2.f8958H0 : str8, (i3 & 67108864) != 0 ? dmcEpisode2.f8959I0 : dmcVideoMeta, (i3 & 134217728) != 0 ? dmcEpisode.mo12909r() : str9, (i3 & 268435456) != 0 ? dmcEpisode.mo12875E() : str10, (i3 & 536870912) != 0 ? dmcEpisode.mo12892Z() : j, (i3 & 1073741824) != 0 ? dmcEpisode.mo12839H() : list11, (i3 & Integer.MIN_VALUE) != 0 ? dmcEpisode2.f8964N0 : list12, (i2 & 1) != 0 ? dmcEpisode.getPlayhead() : l2, (i2 & 2) != 0 ? dmcEpisode2.f8966P0 : list13);
    }

    /* renamed from: C */
    public String mo12873C() {
        return this.f8970l0;
    }

    /* renamed from: D */
    public String mo12874D() {
        return this.f8977s0;
    }

    /* renamed from: E */
    public String mo12875E() {
        return this.f8961K0;
    }

    /* renamed from: F */
    public int mo12876F() {
        Integer num = this.f8976r0;
        if (num != null) {
            return num.intValue();
        }
        throw new AssertionError("seasonSequenceNumber should never be null");
    }

    /* renamed from: G */
    public String mo12877G() {
        return C3650u.m12406a(this.f8971m0, C3648s.TITLE, null, C3647r.SERIES, 2, null);
    }

    /* renamed from: H */
    public List<C3680n> mo12839H() {
        return this.f8963M0;
    }

    /* renamed from: I */
    public int mo12878I() {
        Integer num = this.f8978t0;
        if (num != null) {
            return num.intValue();
        }
        throw new AssertionError("episodeSequenceNumber should never be null");
    }

    /* renamed from: J */
    public int mo12879J() {
        Integer num = this.f8979u0;
        if (num != null) {
            return num.intValue();
        }
        throw new AssertionError("episodeSeriesSequenceNumber should never be null");
    }

    /* renamed from: L */
    public final Integer mo12880L() {
        return this.f8976r0;
    }

    /* renamed from: O */
    public final Bookmark mo12881O() {
        DmcVideoMeta dmcVideoMeta = this.f8959I0;
        if (dmcVideoMeta != null) {
            UserMediaMeta X = dmcVideoMeta.mo13065X();
            if (X != null) {
                return X.mo13228a(mo12903f());
            }
        }
        return null;
    }

    /* renamed from: P */
    public final List<String> mo12882P() {
        return this.f8956F0;
    }

    /* renamed from: Q */
    public final Availability mo12883Q() {
        return this.f8951A0;
    }

    /* renamed from: R */
    public final Integer mo12884R() {
        return this.f8978t0;
    }

    /* renamed from: S */
    public final List<DmcDisclaimerLabel> mo12885S() {
        return this.f8964N0;
    }

    /* renamed from: T */
    public final MediaRights mo12886T() {
        return this.f8984z0;
    }

    /* renamed from: U */
    public final DmcVideoMeta mo12887U() {
        return this.f8959I0;
    }

    /* renamed from: V */
    public final DmcMediaMetadata mo12888V() {
        return this.f8974p0;
    }

    /* renamed from: W */
    public final List<Milestone> mo12889W() {
        return this.f8983y0;
    }

    /* renamed from: X */
    public final String mo12890X() {
        return this.f8958H0;
    }

    /* renamed from: Y */
    public final List<PlaybackUrl> mo12891Y() {
        return this.f8973o0;
    }

    /* renamed from: Z */
    public long mo12892Z() {
        return this.f8962L0;
    }

    /* renamed from: a */
    public List<Image> mo12847a() {
        return this.f8972n0;
    }

    /* renamed from: a0 */
    public final List<Rating> mo12894a0() {
        return this.f8980v0;
    }

    /* renamed from: b0 */
    public final List<Release> mo12895b0() {
        return this.f8955E0;
    }

    /* renamed from: c */
    public List<GenreMeta> mo12896c() {
        return this.f8981w0;
    }

    /* renamed from: c0 */
    public final List<DmcTag> mo12897c0() {
        return this.f8966P0;
    }

    public final DmcEpisode copy(String str, DmcAssetType dmcAssetType, Long l, String str2, List<TextEntry> list, List<Image> list2, List<PlaybackUrl> list3, @C11724g(name = "mediaMetadata") DmcMediaMetadata dmcMediaMetadata, List<Language> list4, Integer num, String str3, Integer num2, @C11724g(name = "episodeSeriesSequenceNumber") Integer num3, List<Rating> list5, List<GenreMeta> list6, String str4, List<Milestone> list7, MediaRights mediaRights, Availability availability, String str5, String str6, List<Participant> list8, List<Release> list9, List<String> list10, String str7, String str8, DmcVideoMeta dmcVideoMeta, String str9, String str10, long j, List<? extends C3680n> list11, List<DmcDisclaimerLabel> list12, Long l2, List<DmcTag> list13) {
        DmcEpisode dmcEpisode = new DmcEpisode(str, dmcAssetType, l, str2, list, list2, list3, dmcMediaMetadata, list4, num, str3, num2, num3, list5, list6, str4, list7, mediaRights, availability, str5, str6, list8, list9, list10, str7, str8, dmcVideoMeta, str9, str10, j, list11, list12, l2, list13);
        return dmcEpisode;
    }

    /* renamed from: d0 */
    public final List<TextEntry> mo12899d0() {
        return this.f8971m0;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public DmcAssetType mo12901e0() {
        return this.f8968j0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DmcEpisode) {
                DmcEpisode dmcEpisode = (DmcEpisode) obj;
                if (C12880j.m40224a((Object) mo12903f(), (Object) dmcEpisode.mo12903f()) && C12880j.m40224a((Object) mo12901e0(), (Object) dmcEpisode.mo12901e0()) && C12880j.m40224a((Object) mo12913w(), (Object) dmcEpisode.mo12913w()) && C12880j.m40224a((Object) mo12873C(), (Object) dmcEpisode.mo12873C()) && C12880j.m40224a((Object) this.f8971m0, (Object) dmcEpisode.f8971m0) && C12880j.m40224a((Object) mo12847a(), (Object) dmcEpisode.mo12847a()) && C12880j.m40224a((Object) this.f8973o0, (Object) dmcEpisode.f8973o0) && C12880j.m40224a((Object) this.f8974p0, (Object) dmcEpisode.f8974p0) && C12880j.m40224a((Object) mo12915x(), (Object) dmcEpisode.mo12915x()) && C12880j.m40224a((Object) this.f8976r0, (Object) dmcEpisode.f8976r0) && C12880j.m40224a((Object) mo12874D(), (Object) dmcEpisode.mo12874D()) && C12880j.m40224a((Object) this.f8978t0, (Object) dmcEpisode.f8978t0) && C12880j.m40224a((Object) this.f8979u0, (Object) dmcEpisode.f8979u0) && C12880j.m40224a((Object) this.f8980v0, (Object) dmcEpisode.f8980v0) && C12880j.m40224a((Object) mo12896c(), (Object) dmcEpisode.mo12896c()) && C12880j.m40224a((Object) mo12912u(), (Object) dmcEpisode.mo12912u()) && C12880j.m40224a((Object) this.f8983y0, (Object) dmcEpisode.f8983y0) && C12880j.m40224a((Object) this.f8984z0, (Object) dmcEpisode.f8984z0) && C12880j.m40224a((Object) this.f8951A0, (Object) dmcEpisode.f8951A0) && C12880j.m40224a((Object) getMediaId(), (Object) dmcEpisode.getMediaId()) && C12880j.m40224a((Object) mo12910s(), (Object) dmcEpisode.mo12910s()) && C12880j.m40224a((Object) mo12916z(), (Object) dmcEpisode.mo12916z()) && C12880j.m40224a((Object) this.f8955E0, (Object) dmcEpisode.f8955E0) && C12880j.m40224a((Object) this.f8956F0, (Object) dmcEpisode.f8956F0) && C12880j.m40224a((Object) getContentType(), (Object) dmcEpisode.getContentType()) && C12880j.m40224a((Object) this.f8958H0, (Object) dmcEpisode.f8958H0) && C12880j.m40224a((Object) this.f8959I0, (Object) dmcEpisode.f8959I0) && C12880j.m40224a((Object) mo12909r(), (Object) dmcEpisode.mo12909r()) && C12880j.m40224a((Object) mo12875E(), (Object) dmcEpisode.mo12875E())) {
                    if (!(mo12892Z() == dmcEpisode.mo12892Z()) || !C12880j.m40224a((Object) mo12839H(), (Object) dmcEpisode.mo12839H()) || !C12880j.m40224a((Object) this.f8964N0, (Object) dmcEpisode.f8964N0) || !C12880j.m40224a((Object) getPlayhead(), (Object) dmcEpisode.getPlayhead()) || !C12880j.m40224a((Object) this.f8966P0, (Object) dmcEpisode.f8966P0)) {
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
        return this.f8967i0;
    }

    /* renamed from: f0 */
    public final Integer mo12904f0() {
        return this.f8979u0;
    }

    public String getContentType() {
        return this.f8957G0;
    }

    public String getMediaId() {
        return this.f8952B0;
    }

    public Long getPlayhead() {
        return this.f8965O0;
    }

    public int hashCode() {
        String f = mo12903f();
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        DmcAssetType e0 = mo12901e0();
        int hashCode2 = (hashCode + (e0 != null ? e0.hashCode() : 0)) * 31;
        Long w = mo12913w();
        int hashCode3 = (hashCode2 + (w != null ? w.hashCode() : 0)) * 31;
        String C = mo12873C();
        int hashCode4 = (hashCode3 + (C != null ? C.hashCode() : 0)) * 31;
        List<TextEntry> list = this.f8971m0;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List a = mo12847a();
        int hashCode6 = (hashCode5 + (a != null ? a.hashCode() : 0)) * 31;
        List<PlaybackUrl> list2 = this.f8973o0;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        DmcMediaMetadata dmcMediaMetadata = this.f8974p0;
        int hashCode8 = (hashCode7 + (dmcMediaMetadata != null ? dmcMediaMetadata.hashCode() : 0)) * 31;
        List x = mo12915x();
        int hashCode9 = (hashCode8 + (x != null ? x.hashCode() : 0)) * 31;
        Integer num = this.f8976r0;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        String D = mo12874D();
        int hashCode11 = (hashCode10 + (D != null ? D.hashCode() : 0)) * 31;
        Integer num2 = this.f8978t0;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f8979u0;
        int hashCode13 = (hashCode12 + (num3 != null ? num3.hashCode() : 0)) * 31;
        List<Rating> list3 = this.f8980v0;
        int hashCode14 = (hashCode13 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List c = mo12896c();
        int hashCode15 = (hashCode14 + (c != null ? c.hashCode() : 0)) * 31;
        String u = mo12912u();
        int hashCode16 = (hashCode15 + (u != null ? u.hashCode() : 0)) * 31;
        List<Milestone> list4 = this.f8983y0;
        int hashCode17 = (hashCode16 + (list4 != null ? list4.hashCode() : 0)) * 31;
        MediaRights mediaRights = this.f8984z0;
        int hashCode18 = (hashCode17 + (mediaRights != null ? mediaRights.hashCode() : 0)) * 31;
        Availability availability = this.f8951A0;
        int hashCode19 = (hashCode18 + (availability != null ? availability.hashCode() : 0)) * 31;
        String mediaId = getMediaId();
        int hashCode20 = (hashCode19 + (mediaId != null ? mediaId.hashCode() : 0)) * 31;
        String s = mo12910s();
        int hashCode21 = (hashCode20 + (s != null ? s.hashCode() : 0)) * 31;
        List z = mo12916z();
        int hashCode22 = (hashCode21 + (z != null ? z.hashCode() : 0)) * 31;
        List<Release> list5 = this.f8955E0;
        int hashCode23 = (hashCode22 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<String> list6 = this.f8956F0;
        int hashCode24 = (hashCode23 + (list6 != null ? list6.hashCode() : 0)) * 31;
        String contentType = getContentType();
        int hashCode25 = (hashCode24 + (contentType != null ? contentType.hashCode() : 0)) * 31;
        String str = this.f8958H0;
        int hashCode26 = (hashCode25 + (str != null ? str.hashCode() : 0)) * 31;
        DmcVideoMeta dmcVideoMeta = this.f8959I0;
        int hashCode27 = (hashCode26 + (dmcVideoMeta != null ? dmcVideoMeta.hashCode() : 0)) * 31;
        String r = mo12909r();
        int hashCode28 = (hashCode27 + (r != null ? r.hashCode() : 0)) * 31;
        String E = mo12875E();
        int hashCode29 = (hashCode28 + (E != null ? E.hashCode() : 0)) * 31;
        long Z = mo12892Z();
        int i2 = (hashCode29 + ((int) (Z ^ (Z >>> 32)))) * 31;
        List H = mo12839H();
        int hashCode30 = (i2 + (H != null ? H.hashCode() : 0)) * 31;
        List<DmcDisclaimerLabel> list7 = this.f8964N0;
        int hashCode31 = (hashCode30 + (list7 != null ? list7.hashCode() : 0)) * 31;
        Long playhead = getPlayhead();
        int hashCode32 = (hashCode31 + (playhead != null ? playhead.hashCode() : 0)) * 31;
        List<DmcTag> list8 = this.f8966P0;
        if (list8 != null) {
            i = list8.hashCode();
        }
        return hashCode32 + i;
    }

    /* renamed from: r */
    public String mo12909r() {
        return this.f8960J0;
    }

    /* renamed from: s */
    public String mo12910s() {
        return this.f8953C0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcEpisode(contentId=");
        sb.append(mo12903f());
        sb.append(", type=");
        sb.append(mo12901e0());
        sb.append(", runtimeMillis=");
        sb.append(mo12913w());
        sb.append(", encodedSeriesId=");
        sb.append(mo12873C());
        sb.append(", texts=");
        sb.append(this.f8971m0);
        sb.append(", images=");
        sb.append(mo12847a());
        sb.append(", playbackUrls=");
        sb.append(this.f8973o0);
        sb.append(", metadata=");
        sb.append(this.f8974p0);
        sb.append(", captions=");
        sb.append(mo12915x());
        sb.append(", seasonSequenceNumber=");
        sb.append(this.f8976r0);
        sb.append(", seriesId=");
        sb.append(mo12874D());
        sb.append(", episodeSequenceNumber=");
        sb.append(this.f8978t0);
        sb.append(", _episodeSeriesSequenceNumber=");
        sb.append(this.f8979u0);
        sb.append(", ratings=");
        sb.append(this.f8980v0);
        sb.append(", typedGenres=");
        sb.append(mo12896c());
        sb.append(", internalTitle=");
        sb.append(mo12912u());
        sb.append(", milestones=");
        sb.append(this.f8983y0);
        sb.append(", mediaRights=");
        sb.append(this.f8984z0);
        sb.append(", currentAvailability=");
        sb.append(this.f8951A0);
        sb.append(", mediaId=");
        sb.append(getMediaId());
        sb.append(", originalLanguage=");
        sb.append(mo12910s());
        sb.append(", participants=");
        sb.append(mo12916z());
        sb.append(", releases=");
        sb.append(this.f8955E0);
        sb.append(", childOf=");
        sb.append(this.f8956F0);
        sb.append(", contentType=");
        sb.append(getContentType());
        sb.append(", parentOf=");
        sb.append(this.f8958H0);
        sb.append(", meta=");
        sb.append(this.f8959I0);
        sb.append(", programType=");
        sb.append(mo12909r());
        sb.append(", seasonId=");
        sb.append(mo12875E());
        sb.append(", predictedSize=");
        sb.append(mo12892Z());
        sb.append(", videoArt=");
        sb.append(mo12839H());
        sb.append(", labels=");
        sb.append(this.f8964N0);
        sb.append(", playhead=");
        sb.append(getPlayhead());
        sb.append(", tags=");
        sb.append(this.f8966P0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public String mo12912u() {
        return this.f8982x0;
    }

    /* renamed from: w */
    public Long mo12913w() {
        return this.f8969k0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8967i0);
        parcel.writeString(this.f8968j0.name());
        Long l = this.f8969k0;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f8970l0);
        List<TextEntry> list = this.f8971m0;
        parcel.writeInt(list.size());
        for (TextEntry writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<Image> list2 = this.f8972n0;
        parcel.writeInt(list2.size());
        for (Image writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        List<PlaybackUrl> list3 = this.f8973o0;
        parcel.writeInt(list3.size());
        for (PlaybackUrl writeToParcel : list3) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        DmcMediaMetadata dmcMediaMetadata = this.f8974p0;
        if (dmcMediaMetadata != null) {
            parcel.writeInt(1);
            dmcMediaMetadata.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Language> list4 = this.f8975q0;
        parcel.writeInt(list4.size());
        for (Language writeParcelable3 : list4) {
            parcel.writeParcelable(writeParcelable3, i);
        }
        Integer num = this.f8976r0;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f8977s0);
        Integer num2 = this.f8978t0;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.f8979u0;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<Rating> list5 = this.f8980v0;
        parcel.writeInt(list5.size());
        for (Rating writeParcelable4 : list5) {
            parcel.writeParcelable(writeParcelable4, i);
        }
        List<GenreMeta> list6 = this.f8981w0;
        parcel.writeInt(list6.size());
        for (GenreMeta writeParcelable5 : list6) {
            parcel.writeParcelable(writeParcelable5, i);
        }
        parcel.writeString(this.f8982x0);
        List<Milestone> list7 = this.f8983y0;
        parcel.writeInt(list7.size());
        for (Milestone writeToParcel2 : list7) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        this.f8984z0.writeToParcel(parcel, 0);
        parcel.writeParcelable(this.f8951A0, i);
        parcel.writeString(this.f8952B0);
        parcel.writeString(this.f8953C0);
        List<Participant> list8 = this.f8954D0;
        if (list8 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list8.size());
            for (Participant writeParcelable6 : list8) {
                parcel.writeParcelable(writeParcelable6, i);
            }
        } else {
            parcel.writeInt(0);
        }
        List<Release> list9 = this.f8955E0;
        if (list9 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list9.size());
            for (Release writeToParcel3 : list9) {
                writeToParcel3.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.f8956F0);
        parcel.writeString(this.f8957G0);
        parcel.writeString(this.f8958H0);
        DmcVideoMeta dmcVideoMeta = this.f8959I0;
        if (dmcVideoMeta != null) {
            parcel.writeInt(1);
            dmcVideoMeta.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f8960J0);
        parcel.writeString(this.f8961K0);
        parcel.writeLong(this.f8962L0);
        List<C3680n> list10 = this.f8963M0;
        if (list10 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list10.size());
            for (C3680n writeParcelable7 : list10) {
                parcel.writeParcelable(writeParcelable7, i);
            }
        } else {
            parcel.writeInt(0);
        }
        List<DmcDisclaimerLabel> list11 = this.f8964N0;
        if (list11 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list11.size());
            for (DmcDisclaimerLabel writeToParcel4 : list11) {
                writeToParcel4.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Long l2 = this.f8965O0;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        List<DmcTag> list12 = this.f8966P0;
        if (list12 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list12.size());
            for (DmcTag writeToParcel5 : list12) {
                writeToParcel5.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: x */
    public List<Language> mo12915x() {
        return this.f8975q0;
    }

    /* renamed from: z */
    public List<Participant> mo12916z() {
        return this.f8954D0;
    }

    public DmcEpisode(String str, DmcAssetType dmcAssetType, Long l, String str2, List<TextEntry> list, List<Image> list2, List<PlaybackUrl> list3, @C11724g(name = "mediaMetadata") DmcMediaMetadata dmcMediaMetadata, List<Language> list4, Integer num, String str3, Integer num2, @C11724g(name = "episodeSeriesSequenceNumber") Integer num3, List<Rating> list5, List<GenreMeta> list6, String str4, List<Milestone> list7, MediaRights mediaRights, Availability availability, String str5, String str6, List<Participant> list8, List<Release> list9, List<String> list10, String str7, String str8, DmcVideoMeta dmcVideoMeta, String str9, String str10, long j, List<? extends C3680n> list11, List<DmcDisclaimerLabel> list12, Long l2, List<DmcTag> list13) {
        List<Rating> list14 = list5;
        List<Participant> list15 = list8;
        List<Release> list16 = list9;
        DmcVideoMeta dmcVideoMeta2 = dmcVideoMeta;
        List<DmcDisclaimerLabel> list17 = list12;
        super(list, list2, list15, list16, list14, dmcMediaMetadata, list3, list7, list6, dmcVideoMeta2, mediaRights, list17, str8, list10, list11, list13);
        this.f8967i0 = str;
        this.f8968j0 = dmcAssetType;
        this.f8969k0 = l;
        this.f8970l0 = str2;
        this.f8971m0 = list;
        this.f8972n0 = list2;
        this.f8973o0 = list3;
        this.f8974p0 = dmcMediaMetadata;
        this.f8975q0 = list4;
        this.f8976r0 = num;
        this.f8977s0 = str3;
        this.f8978t0 = num2;
        this.f8979u0 = num3;
        this.f8980v0 = list5;
        this.f8981w0 = list6;
        this.f8982x0 = str4;
        this.f8983y0 = list7;
        this.f8984z0 = mediaRights;
        this.f8951A0 = availability;
        this.f8952B0 = str5;
        this.f8953C0 = str6;
        this.f8954D0 = list8;
        this.f8955E0 = list9;
        this.f8956F0 = list10;
        this.f8957G0 = str7;
        this.f8958H0 = str8;
        this.f8959I0 = dmcVideoMeta;
        this.f8960J0 = str9;
        this.f8961K0 = str10;
        this.f8962L0 = j;
        this.f8963M0 = list11;
        this.f8964N0 = list12;
        this.f8965O0 = l2;
        this.f8966P0 = list13;
    }

    /* renamed from: a */
    public C3685g mo12893a(long j) {
        return m12116a(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, Long.valueOf(j), null, -1, 2, null);
    }
}
