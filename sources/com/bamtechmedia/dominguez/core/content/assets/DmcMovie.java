package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B×\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\r\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\r\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\r\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\b\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\r\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\r\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\r¢\u0006\u0002\u00103J\t\u0010Z\u001a\u00020\u0004HÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00160\rHÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00180\rHÆ\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001a0\rHÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001c0\rHÆ\u0003J\t\u0010_\u001a\u00020\u001eHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010a\u001a\u00020\u0004HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\rHÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\rHÆ\u0003J\t\u0010e\u001a\u00020\u0006HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010i\u001a\u00020\u0004HÆ\u0003J\t\u0010j\u001a\u00020\bHÆ\u0003J\u0011\u0010k\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\rHÆ\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\rHÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010LJ\u0011\u0010n\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\rHÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010LJ\t\u0010p\u001a\u00020\u0004HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J\u000f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00120\rHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0003\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\r2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\r2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\r2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\b2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\r2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\r2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010wJ\u0010\u0010x\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u0010y\u001a\u00020\u00022\u0006\u00100\u001a\u00020\bH\u0016J\t\u0010z\u001a\u00020{HÖ\u0001J\u0013\u0010|\u001a\u00020}2\b\u0010~\u001a\u0004\u0018\u00010HÖ\u0003J\n\u0010\u0001\u001a\u00020{HÖ\u0001J\n\u0010\u0001\u001a\u00020\u0004HÖ\u0001J\u001e\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030
\u00012\u0007\u0010\u0001\u001a\u00020{HÖ\u0001R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010(\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0014\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00108R\u0019\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0014\u0010!\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00108R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r¢\u0006\b\n\u0000\u001a\u0004\bF\u00105R\u0016\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u0013\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\b\n\u0000\u001a\u0004\bJ\u00105R\u0018\u00100\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\n\n\u0002\u0010M\u001a\u0004\bK\u0010LR\u0014\u0010+\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0014\u0010*\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00108R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\r¢\u0006\b\n\u0000\u001a\u0004\bQ\u00105R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bR\u00105R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\n\n\u0002\u0010M\u001a\u0004\bS\u0010LR\u0019\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bT\u00105R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\bU\u00105R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00105R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00105¨\u0006\u0001"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcPlayable;", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "contentId", "", "type", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "runtimeMillis", "", "internalTitle", "meta", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;", "texts", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "images", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "playbackUrls", "Lcom/bamtechmedia/dominguez/core/content/assets/PlaybackUrl;", "metadata", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "captions", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "typedGenres", "Lcom/bamtechmedia/dominguez/core/content/GenreMeta;", "ratings", "Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "milestones", "Lcom/bamtechmedia/dominguez/core/content/assets/Milestone;", "mediaRights", "Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "currentAvailability", "Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "mediaId", "originalLanguage", "participants", "Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "releases", "Lcom/bamtechmedia/dominguez/core/content/assets/Release;", "childOf", "contentType", "parentOf", "programType", "predictedSize", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "labels", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcDisclaimerLabel;", "playhead", "tags", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcTag;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/Long;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Lcom/bamtechmedia/dominguez/core/content/assets/Availability;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)V", "getCaptions", "()Ljava/util/List;", "getChildOf", "getContentId", "()Ljava/lang/String;", "getContentType", "getCurrentAvailability", "()Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "getImages", "getInternalTitle", "getLabels", "getMediaId", "getMediaRights", "()Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;", "getMetadata", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "getMilestones", "getOriginalLanguage", "getParentOf", "getParticipants", "getPlaybackUrls", "getPlayhead", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPredictedSize", "()J", "getProgramType", "getRatings", "getReleases", "getRuntimeMillis", "getTags", "getTexts", "getType", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;", "getTypedGenres", "getVideoArt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcAssetType;Ljava/lang/Long;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtechmedia/dominguez/core/content/assets/MediaRights;Lcom/bamtechmedia/dominguez/core/content/assets/Availability;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;", "copyWith", "copyWithPlayhead", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcMovie.kt */
public final class DmcMovie extends C3635i implements C3692n {
    public static final Creator CREATOR = new C3601a();

    /* renamed from: A0 */
    private final List<Release> f9010A0;

    /* renamed from: B0 */
    private final List<String> f9011B0;

    /* renamed from: C0 */
    private final String f9012C0;

    /* renamed from: D0 */
    private final String f9013D0;

    /* renamed from: E0 */
    private final String f9014E0;

    /* renamed from: F0 */
    private final long f9015F0;

    /* renamed from: G0 */
    private final List<C3680n> f9016G0;

    /* renamed from: H0 */
    private final List<DmcDisclaimerLabel> f9017H0;

    /* renamed from: I0 */
    private final Long f9018I0;

    /* renamed from: J0 */
    private final List<DmcTag> f9019J0;

    /* renamed from: i0 */
    private final String f9020i0;

    /* renamed from: j0 */
    private final DmcAssetType f9021j0;

    /* renamed from: k0 */
    private final Long f9022k0;

    /* renamed from: l0 */
    private final String f9023l0;

    /* renamed from: m0 */
    private final DmcVideoMeta f9024m0;

    /* renamed from: n0 */
    private final List<TextEntry> f9025n0;

    /* renamed from: o0 */
    private final List<Image> f9026o0;

    /* renamed from: p0 */
    private final List<PlaybackUrl> f9027p0;

    /* renamed from: q0 */
    private final DmcMediaMetadata f9028q0;

    /* renamed from: r0 */
    private final List<Language> f9029r0;

    /* renamed from: s0 */
    private final List<GenreMeta> f9030s0;

    /* renamed from: t0 */
    private final List<Rating> f9031t0;

    /* renamed from: u0 */
    private final List<Milestone> f9032u0;

    /* renamed from: v0 */
    private final MediaRights f9033v0;

    /* renamed from: w0 */
    private final Availability f9034w0;

    /* renamed from: x0 */
    private final String f9035x0;

    /* renamed from: y0 */
    private final String f9036y0;

    /* renamed from: z0 */
    private final List<Participant> f9037z0;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcMovie$a */
    public static class C3601a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Parcel parcel2 = parcel;
            String readString = parcel.readString();
            DmcAssetType dmcAssetType = (DmcAssetType) Enum.valueOf(DmcAssetType.class, parcel.readString());
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString2 = parcel.readString();
            DmcVideoMeta dmcVideoMeta = parcel.readInt() != 0 ? (DmcVideoMeta) DmcVideoMeta.CREATOR.createFromParcel(parcel2) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList7.add((TextEntry) parcel2.readParcelable(DmcMovie.class.getClassLoader()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList8.add((Image) parcel2.readParcelable(DmcMovie.class.getClassLoader()));
                readInt2--;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList9.add((PlaybackUrl) PlaybackUrl.CREATOR.createFromParcel(parcel2));
                readInt3--;
            }
            DmcMediaMetadata dmcMediaMetadata = parcel.readInt() != 0 ? (DmcMediaMetadata) DmcMediaMetadata.CREATOR.createFromParcel(parcel2) : null;
            int readInt4 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(readInt4);
            while (readInt4 != 0) {
                arrayList10.add((Language) parcel2.readParcelable(DmcMovie.class.getClassLoader()));
                readInt4--;
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList11 = new ArrayList(readInt5);
            while (readInt5 != 0) {
                arrayList11.add((GenreMeta) parcel2.readParcelable(DmcMovie.class.getClassLoader()));
                readInt5--;
            }
            int readInt6 = parcel.readInt();
            ArrayList arrayList12 = new ArrayList(readInt6);
            while (readInt6 != 0) {
                arrayList12.add((Rating) parcel2.readParcelable(DmcMovie.class.getClassLoader()));
                readInt6--;
            }
            int readInt7 = parcel.readInt();
            ArrayList arrayList13 = new ArrayList(readInt7);
            while (readInt7 != 0) {
                arrayList13.add((Milestone) Milestone.CREATOR.createFromParcel(parcel2));
                readInt7--;
            }
            MediaRights mediaRights = (MediaRights) MediaRights.CREATOR.createFromParcel(parcel2);
            Availability availability = (Availability) parcel2.readParcelable(DmcMovie.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt8 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(readInt8);
                while (readInt8 != 0) {
                    ArrayList arrayList15 = arrayList13;
                    arrayList14.add((Participant) parcel2.readParcelable(DmcMovie.class.getClassLoader()));
                    readInt8--;
                    arrayList13 = arrayList15;
                }
                arrayList = arrayList13;
                arrayList2 = arrayList14;
            } else {
                arrayList = arrayList13;
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                int readInt9 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(readInt9);
                while (readInt9 != 0) {
                    arrayList16.add((Release) Release.CREATOR.createFromParcel(parcel2));
                    readInt9--;
                }
                arrayList3 = arrayList16;
            } else {
                arrayList3 = null;
            }
            ArrayList createStringArrayList = parcel.createStringArrayList();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                int readInt10 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(readInt10);
                while (readInt10 != 0) {
                    arrayList17.add((C3680n) parcel2.readParcelable(DmcMovie.class.getClassLoader()));
                    readInt10--;
                }
                arrayList4 = arrayList17;
            } else {
                arrayList4 = null;
            }
            if (parcel.readInt() != 0) {
                int readInt11 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(readInt11);
                while (readInt11 != 0) {
                    arrayList18.add((DmcDisclaimerLabel) DmcDisclaimerLabel.CREATOR.createFromParcel(parcel2));
                    readInt11--;
                }
                arrayList5 = arrayList18;
            } else {
                arrayList5 = null;
            }
            Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            if (parcel.readInt() != 0) {
                int readInt12 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(readInt12);
                while (readInt12 != 0) {
                    arrayList19.add((DmcTag) DmcTag.CREATOR.createFromParcel(parcel2));
                    readInt12--;
                }
                arrayList6 = arrayList19;
            } else {
                arrayList6 = null;
            }
            DmcMovie dmcMovie = new DmcMovie(readString, dmcAssetType, valueOf, readString2, dmcVideoMeta, arrayList7, arrayList8, arrayList9, dmcMediaMetadata, arrayList10, arrayList11, arrayList12, arrayList, mediaRights, availability, readString3, readString4, arrayList2, arrayList3, createStringArrayList, readString5, readString6, readString7, readLong, arrayList4, arrayList5, valueOf2, arrayList6);
            return dmcMovie;
        }

        public final Object[] newArray(int i) {
            return new DmcMovie[i];
        }
    }

    public /* synthetic */ DmcMovie(String str, DmcAssetType dmcAssetType, Long l, String str2, DmcVideoMeta dmcVideoMeta, List list, List list2, List list3, DmcMediaMetadata dmcMediaMetadata, List list4, List list5, List list6, List list7, MediaRights mediaRights, Availability availability, String str3, String str4, List list8, List list9, List list10, String str5, String str6, String str7, long j, List list11, List list12, Long l2, List list13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l3;
        String str8 = (i & 4194304) != 0 ? "movie" : str7;
        long j2 = 0;
        long j3 = (i & 8388608) != 0 ? 0 : j;
        if ((i & 67108864) != 0) {
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
        this(str, dmcAssetType, l, str2, dmcVideoMeta, list, list2, list3, dmcMediaMetadata, list4, list5, list6, list7, mediaRights, availability, str3, str4, list8, list9, list10, str5, str6, str8, j3, list11, list12, l3, list13);
    }

    /* renamed from: a */
    public static /* synthetic */ DmcMovie m12181a(DmcMovie dmcMovie, String str, DmcAssetType dmcAssetType, Long l, String str2, DmcVideoMeta dmcVideoMeta, List list, List list2, List list3, DmcMediaMetadata dmcMediaMetadata, List list4, List list5, List list6, List list7, MediaRights mediaRights, Availability availability, String str3, String str4, List list8, List list9, List list10, String str5, String str6, String str7, long j, List list11, List list12, Long l2, List list13, int i, Object obj) {
        DmcMovie dmcMovie2 = dmcMovie;
        int i2 = i;
        String f = (i2 & 1) != 0 ? dmcMovie.mo12903f() : str;
        DmcAssetType c0 = (i2 & 2) != 0 ? dmcMovie.mo12979c0() : dmcAssetType;
        Long w = (i2 & 4) != 0 ? dmcMovie.mo12913w() : l;
        String u = (i2 & 8) != 0 ? dmcMovie.mo12912u() : str2;
        DmcVideoMeta dmcVideoMeta2 = (i2 & 16) != 0 ? dmcMovie2.f9024m0 : dmcVideoMeta;
        List list14 = (i2 & 32) != 0 ? dmcMovie2.f9025n0 : list;
        List a = (i2 & 64) != 0 ? dmcMovie.mo12847a() : list2;
        List list15 = (i2 & 128) != 0 ? dmcMovie2.f9027p0 : list3;
        DmcMediaMetadata dmcMediaMetadata2 = (i2 & 256) != 0 ? dmcMovie2.f9028q0 : dmcMediaMetadata;
        List x = (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? dmcMovie.mo12915x() : list4;
        List c = (i2 & 1024) != 0 ? dmcMovie.mo12896c() : list5;
        List list16 = (i2 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? dmcMovie2.f9031t0 : list6;
        List list17 = (i2 & 4096) != 0 ? dmcMovie2.f9032u0 : list7;
        MediaRights mediaRights2 = (i2 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? dmcMovie2.f9033v0 : mediaRights;
        Availability availability2 = (i2 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? dmcMovie2.f9034w0 : availability;
        String mediaId = (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? dmcMovie.getMediaId() : str3;
        String s = (i2 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? dmcMovie.mo12910s() : str4;
        Availability availability3 = availability2;
        List list18 = (i2 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? dmcMovie2.f9037z0 : list8;
        List list19 = (i2 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? dmcMovie2.f9010A0 : list9;
        List list20 = (i2 & DateUtils.FORMAT_ABBREV_ALL) != 0 ? dmcMovie2.f9011B0 : list10;
        return dmcMovie.copy(f, c0, w, u, dmcVideoMeta2, list14, a, list15, dmcMediaMetadata2, x, c, list16, list17, mediaRights2, availability3, mediaId, s, list18, list19, list20, (i2 & 1048576) != 0 ? dmcMovie.getContentType() : str5, (i2 & 2097152) != 0 ? dmcMovie2.f9013D0 : str6, (i2 & 4194304) != 0 ? dmcMovie.mo12909r() : str7, (i2 & 8388608) != 0 ? dmcMovie.mo12973X() : j, (i2 & 16777216) != 0 ? dmcMovie.mo12839H() : list11, (i2 & 33554432) != 0 ? dmcMovie2.f9017H0 : list12, (i2 & 67108864) != 0 ? dmcMovie.getPlayhead() : l2, (i2 & 134217728) != 0 ? dmcMovie2.f9019J0 : list13);
    }

    /* renamed from: H */
    public List<C3680n> mo12839H() {
        return this.f9016G0;
    }

    /* renamed from: O */
    public final List<String> mo12964O() {
        return this.f9011B0;
    }

    /* renamed from: P */
    public final Availability mo12965P() {
        return this.f9034w0;
    }

    /* renamed from: Q */
    public final List<DmcDisclaimerLabel> mo12966Q() {
        return this.f9017H0;
    }

    /* renamed from: R */
    public final MediaRights mo12967R() {
        return this.f9033v0;
    }

    /* renamed from: S */
    public final DmcVideoMeta mo12968S() {
        return this.f9024m0;
    }

    /* renamed from: T */
    public final DmcMediaMetadata mo12969T() {
        return this.f9028q0;
    }

    /* renamed from: U */
    public final List<Milestone> mo12970U() {
        return this.f9032u0;
    }

    /* renamed from: V */
    public final String mo12971V() {
        return this.f9013D0;
    }

    /* renamed from: W */
    public final List<PlaybackUrl> mo12972W() {
        return this.f9027p0;
    }

    /* renamed from: X */
    public long mo12973X() {
        return this.f9015F0;
    }

    /* renamed from: Y */
    public final List<Rating> mo12974Y() {
        return this.f9031t0;
    }

    /* renamed from: Z */
    public final List<Release> mo12975Z() {
        return this.f9010A0;
    }

    /* renamed from: a */
    public List<Image> mo12847a() {
        return this.f9026o0;
    }

    /* renamed from: a0 */
    public final List<DmcTag> mo12977a0() {
        return this.f9019J0;
    }

    /* renamed from: b0 */
    public final List<TextEntry> mo12978b0() {
        return this.f9025n0;
    }

    /* renamed from: c */
    public List<GenreMeta> mo12896c() {
        return this.f9030s0;
    }

    /* renamed from: c0 */
    public DmcAssetType mo12979c0() {
        return this.f9021j0;
    }

    public final DmcMovie copy(String str, DmcAssetType dmcAssetType, Long l, String str2, DmcVideoMeta dmcVideoMeta, List<TextEntry> list, List<Image> list2, List<PlaybackUrl> list3, @C11724g(name = "mediaMetadata") DmcMediaMetadata dmcMediaMetadata, List<Language> list4, List<GenreMeta> list5, List<Rating> list6, List<Milestone> list7, MediaRights mediaRights, Availability availability, String str3, String str4, List<Participant> list8, List<Release> list9, List<String> list10, String str5, String str6, String str7, long j, List<? extends C3680n> list11, List<DmcDisclaimerLabel> list12, Long l2, List<DmcTag> list13) {
        DmcMovie dmcMovie = new DmcMovie(str, dmcAssetType, l, str2, dmcVideoMeta, list, list2, list3, dmcMediaMetadata, list4, list5, list6, list7, mediaRights, availability, str3, str4, list8, list9, list10, str5, str6, str7, j, list11, list12, l2, list13);
        return dmcMovie;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DmcMovie) {
                DmcMovie dmcMovie = (DmcMovie) obj;
                if (Intrinsics.areEqual((Object) mo12903f(), (Object) dmcMovie.mo12903f()) && Intrinsics.areEqual((Object) mo12979c0(), (Object) dmcMovie.mo12979c0()) && Intrinsics.areEqual((Object) mo12913w(), (Object) dmcMovie.mo12913w()) && Intrinsics.areEqual((Object) mo12912u(), (Object) dmcMovie.mo12912u()) && Intrinsics.areEqual((Object) this.f9024m0, (Object) dmcMovie.f9024m0) && Intrinsics.areEqual((Object) this.f9025n0, (Object) dmcMovie.f9025n0) && Intrinsics.areEqual((Object) mo12847a(), (Object) dmcMovie.mo12847a()) && Intrinsics.areEqual((Object) this.f9027p0, (Object) dmcMovie.f9027p0) && Intrinsics.areEqual((Object) this.f9028q0, (Object) dmcMovie.f9028q0) && Intrinsics.areEqual((Object) mo12915x(), (Object) dmcMovie.mo12915x()) && Intrinsics.areEqual((Object) mo12896c(), (Object) dmcMovie.mo12896c()) && Intrinsics.areEqual((Object) this.f9031t0, (Object) dmcMovie.f9031t0) && Intrinsics.areEqual((Object) this.f9032u0, (Object) dmcMovie.f9032u0) && Intrinsics.areEqual((Object) this.f9033v0, (Object) dmcMovie.f9033v0) && Intrinsics.areEqual((Object) this.f9034w0, (Object) dmcMovie.f9034w0) && Intrinsics.areEqual((Object) getMediaId(), (Object) dmcMovie.getMediaId()) && Intrinsics.areEqual((Object) mo12910s(), (Object) dmcMovie.mo12910s()) && Intrinsics.areEqual((Object) this.f9037z0, (Object) dmcMovie.f9037z0) && Intrinsics.areEqual((Object) this.f9010A0, (Object) dmcMovie.f9010A0) && Intrinsics.areEqual((Object) this.f9011B0, (Object) dmcMovie.f9011B0) && Intrinsics.areEqual((Object) getContentType(), (Object) dmcMovie.getContentType()) && Intrinsics.areEqual((Object) this.f9013D0, (Object) dmcMovie.f9013D0) && Intrinsics.areEqual((Object) mo12909r(), (Object) dmcMovie.mo12909r())) {
                    if (!(mo12973X() == dmcMovie.mo12973X()) || !Intrinsics.areEqual((Object) mo12839H(), (Object) dmcMovie.mo12839H()) || !Intrinsics.areEqual((Object) this.f9017H0, (Object) dmcMovie.f9017H0) || !Intrinsics.areEqual((Object) getPlayhead(), (Object) dmcMovie.getPlayhead()) || !Intrinsics.areEqual((Object) this.f9019J0, (Object) dmcMovie.f9019J0)) {
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
        return this.f9020i0;
    }

    public String getContentType() {
        return this.f9012C0;
    }

    public String getMediaId() {
        return this.f9035x0;
    }

    public Long getPlayhead() {
        return this.f9018I0;
    }

    public int hashCode() {
        String f = mo12903f();
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        DmcAssetType c0 = mo12979c0();
        int hashCode2 = (hashCode + (c0 != null ? c0.hashCode() : 0)) * 31;
        Long w = mo12913w();
        int hashCode3 = (hashCode2 + (w != null ? w.hashCode() : 0)) * 31;
        String u = mo12912u();
        int hashCode4 = (hashCode3 + (u != null ? u.hashCode() : 0)) * 31;
        DmcVideoMeta dmcVideoMeta = this.f9024m0;
        int hashCode5 = (hashCode4 + (dmcVideoMeta != null ? dmcVideoMeta.hashCode() : 0)) * 31;
        List<TextEntry> list = this.f9025n0;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List a = mo12847a();
        int hashCode7 = (hashCode6 + (a != null ? a.hashCode() : 0)) * 31;
        List<PlaybackUrl> list2 = this.f9027p0;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        DmcMediaMetadata dmcMediaMetadata = this.f9028q0;
        int hashCode9 = (hashCode8 + (dmcMediaMetadata != null ? dmcMediaMetadata.hashCode() : 0)) * 31;
        List x = mo12915x();
        int hashCode10 = (hashCode9 + (x != null ? x.hashCode() : 0)) * 31;
        List c = mo12896c();
        int hashCode11 = (hashCode10 + (c != null ? c.hashCode() : 0)) * 31;
        List<Rating> list3 = this.f9031t0;
        int hashCode12 = (hashCode11 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Milestone> list4 = this.f9032u0;
        int hashCode13 = (hashCode12 + (list4 != null ? list4.hashCode() : 0)) * 31;
        MediaRights mediaRights = this.f9033v0;
        int hashCode14 = (hashCode13 + (mediaRights != null ? mediaRights.hashCode() : 0)) * 31;
        Availability availability = this.f9034w0;
        int hashCode15 = (hashCode14 + (availability != null ? availability.hashCode() : 0)) * 31;
        String mediaId = getMediaId();
        int hashCode16 = (hashCode15 + (mediaId != null ? mediaId.hashCode() : 0)) * 31;
        String s = mo12910s();
        int hashCode17 = (hashCode16 + (s != null ? s.hashCode() : 0)) * 31;
        List<Participant> list5 = this.f9037z0;
        int hashCode18 = (hashCode17 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<Release> list6 = this.f9010A0;
        int hashCode19 = (hashCode18 + (list6 != null ? list6.hashCode() : 0)) * 31;
        List<String> list7 = this.f9011B0;
        int hashCode20 = (hashCode19 + (list7 != null ? list7.hashCode() : 0)) * 31;
        String contentType = getContentType();
        int hashCode21 = (hashCode20 + (contentType != null ? contentType.hashCode() : 0)) * 31;
        String str = this.f9013D0;
        int hashCode22 = (hashCode21 + (str != null ? str.hashCode() : 0)) * 31;
        String r = mo12909r();
        int hashCode23 = (hashCode22 + (r != null ? r.hashCode() : 0)) * 31;
        long X = mo12973X();
        int i2 = (hashCode23 + ((int) (X ^ (X >>> 32)))) * 31;
        List H = mo12839H();
        int hashCode24 = (i2 + (H != null ? H.hashCode() : 0)) * 31;
        List<DmcDisclaimerLabel> list8 = this.f9017H0;
        int hashCode25 = (hashCode24 + (list8 != null ? list8.hashCode() : 0)) * 31;
        Long playhead = getPlayhead();
        int hashCode26 = (hashCode25 + (playhead != null ? playhead.hashCode() : 0)) * 31;
        List<DmcTag> list9 = this.f9019J0;
        if (list9 != null) {
            i = list9.hashCode();
        }
        return hashCode26 + i;
    }

    /* renamed from: r */
    public String mo12909r() {
        return this.f9014E0;
    }

    /* renamed from: s */
    public String mo12910s() {
        return this.f9036y0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcMovie(contentId=");
        sb.append(mo12903f());
        sb.append(", type=");
        sb.append(mo12979c0());
        sb.append(", runtimeMillis=");
        sb.append(mo12913w());
        sb.append(", internalTitle=");
        sb.append(mo12912u());
        sb.append(", meta=");
        sb.append(this.f9024m0);
        sb.append(", texts=");
        sb.append(this.f9025n0);
        sb.append(", images=");
        sb.append(mo12847a());
        sb.append(", playbackUrls=");
        sb.append(this.f9027p0);
        sb.append(", metadata=");
        sb.append(this.f9028q0);
        sb.append(", captions=");
        sb.append(mo12915x());
        sb.append(", typedGenres=");
        sb.append(mo12896c());
        sb.append(", ratings=");
        sb.append(this.f9031t0);
        sb.append(", milestones=");
        sb.append(this.f9032u0);
        sb.append(", mediaRights=");
        sb.append(this.f9033v0);
        sb.append(", currentAvailability=");
        sb.append(this.f9034w0);
        sb.append(", mediaId=");
        sb.append(getMediaId());
        sb.append(", originalLanguage=");
        sb.append(mo12910s());
        sb.append(", participants=");
        sb.append(this.f9037z0);
        sb.append(", releases=");
        sb.append(this.f9010A0);
        sb.append(", childOf=");
        sb.append(this.f9011B0);
        sb.append(", contentType=");
        sb.append(getContentType());
        sb.append(", parentOf=");
        sb.append(this.f9013D0);
        sb.append(", programType=");
        sb.append(mo12909r());
        sb.append(", predictedSize=");
        sb.append(mo12973X());
        sb.append(", videoArt=");
        sb.append(mo12839H());
        sb.append(", labels=");
        sb.append(this.f9017H0);
        sb.append(", playhead=");
        sb.append(getPlayhead());
        sb.append(", tags=");
        sb.append(this.f9019J0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public String mo12912u() {
        return this.f9023l0;
    }

    /* renamed from: w */
    public Long mo12913w() {
        return this.f9022k0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9020i0);
        parcel.writeString(this.f9021j0.name());
        Long l = this.f9022k0;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f9023l0);
        DmcVideoMeta dmcVideoMeta = this.f9024m0;
        if (dmcVideoMeta != null) {
            parcel.writeInt(1);
            dmcVideoMeta.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<TextEntry> list = this.f9025n0;
        parcel.writeInt(list.size());
        for (TextEntry writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<Image> list2 = this.f9026o0;
        parcel.writeInt(list2.size());
        for (Image writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        List<PlaybackUrl> list3 = this.f9027p0;
        parcel.writeInt(list3.size());
        for (PlaybackUrl writeToParcel : list3) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        DmcMediaMetadata dmcMediaMetadata = this.f9028q0;
        if (dmcMediaMetadata != null) {
            parcel.writeInt(1);
            dmcMediaMetadata.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Language> list4 = this.f9029r0;
        parcel.writeInt(list4.size());
        for (Language writeParcelable3 : list4) {
            parcel.writeParcelable(writeParcelable3, i);
        }
        List<GenreMeta> list5 = this.f9030s0;
        parcel.writeInt(list5.size());
        for (GenreMeta writeParcelable4 : list5) {
            parcel.writeParcelable(writeParcelable4, i);
        }
        List<Rating> list6 = this.f9031t0;
        parcel.writeInt(list6.size());
        for (Rating writeParcelable5 : list6) {
            parcel.writeParcelable(writeParcelable5, i);
        }
        List<Milestone> list7 = this.f9032u0;
        parcel.writeInt(list7.size());
        for (Milestone writeToParcel2 : list7) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        this.f9033v0.writeToParcel(parcel, 0);
        parcel.writeParcelable(this.f9034w0, i);
        parcel.writeString(this.f9035x0);
        parcel.writeString(this.f9036y0);
        List<Participant> list8 = this.f9037z0;
        if (list8 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list8.size());
            for (Participant writeParcelable6 : list8) {
                parcel.writeParcelable(writeParcelable6, i);
            }
        } else {
            parcel.writeInt(0);
        }
        List<Release> list9 = this.f9010A0;
        if (list9 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list9.size());
            for (Release writeToParcel3 : list9) {
                writeToParcel3.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.f9011B0);
        parcel.writeString(this.f9012C0);
        parcel.writeString(this.f9013D0);
        parcel.writeString(this.f9014E0);
        parcel.writeLong(this.f9015F0);
        List<C3680n> list10 = this.f9016G0;
        if (list10 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list10.size());
            for (C3680n writeParcelable7 : list10) {
                parcel.writeParcelable(writeParcelable7, i);
            }
        } else {
            parcel.writeInt(0);
        }
        List<DmcDisclaimerLabel> list11 = this.f9017H0;
        if (list11 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list11.size());
            for (DmcDisclaimerLabel writeToParcel4 : list11) {
                writeToParcel4.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Long l2 = this.f9018I0;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        List<DmcTag> list12 = this.f9019J0;
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
        return this.f9029r0;
    }

    /* renamed from: z */
    public final List<Participant> mo12986z() {
        return this.f9037z0;
    }

    public DmcMovie(String str, DmcAssetType dmcAssetType, Long l, String str2, DmcVideoMeta dmcVideoMeta, List<TextEntry> list, List<Image> list2, List<PlaybackUrl> list3, @C11724g(name = "mediaMetadata") DmcMediaMetadata dmcMediaMetadata, List<Language> list4, List<GenreMeta> list5, List<Rating> list6, List<Milestone> list7, MediaRights mediaRights, Availability availability, String str3, String str4, List<Participant> list8, List<Release> list9, List<String> list10, String str5, String str6, String str7, long j, List<? extends C3680n> list11, List<DmcDisclaimerLabel> list12, Long l2, List<DmcTag> list13) {
        DmcMediaMetadata dmcMediaMetadata2 = dmcMediaMetadata;
        List<Rating> list14 = list6;
        List<Milestone> list15 = list7;
        List<Participant> list16 = list8;
        List<Release> list17 = list9;
        List<DmcDisclaimerLabel> list18 = list12;
        super(list, list2, list16, list17, list14, dmcMediaMetadata2, list3, list15, list5, dmcVideoMeta, mediaRights, list18, str6, list10, list11, list13);
        this.f9020i0 = str;
        this.f9021j0 = dmcAssetType;
        this.f9022k0 = l;
        this.f9023l0 = str2;
        this.f9024m0 = dmcVideoMeta;
        this.f9025n0 = list;
        this.f9026o0 = list2;
        this.f9027p0 = list3;
        this.f9028q0 = dmcMediaMetadata;
        this.f9029r0 = list4;
        this.f9030s0 = list5;
        this.f9031t0 = list6;
        this.f9032u0 = list7;
        this.f9033v0 = mediaRights;
        this.f9034w0 = availability;
        this.f9035x0 = str3;
        this.f9036y0 = str4;
        this.f9037z0 = list8;
        this.f9010A0 = list9;
        this.f9011B0 = list10;
        this.f9012C0 = str5;
        this.f9013D0 = str6;
        this.f9014E0 = str7;
        this.f9015F0 = j;
        this.f9016G0 = list11;
        this.f9017H0 = list12;
        this.f9018I0 = l2;
        this.f9019J0 = list13;
    }

    /* renamed from: a */
    public C3692n mo12976a(long j) {
        return m12181a(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, Long.valueOf(j), null, 201326591, null);
    }
}
