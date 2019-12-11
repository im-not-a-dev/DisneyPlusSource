package com.bamtech.player.exo.p046n;

import android.util.Pair;
import com.bamtech.player.exo.p043k.C1726a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C9295d;
import com.google.android.exoplayer2.trackselection.C9295d.C9299d;
import com.google.android.exoplayer2.trackselection.C9295d.C9301e;
import com.google.android.exoplayer2.trackselection.C9306f.C9307a;
import com.google.android.exoplayer2.trackselection.C9311j.C9312a;
import com.google.android.exoplayer2.trackselection.C9311j.C9313b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.p590y.C13162e0;
import net.danlew.android.joda.DateUtils;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p193j0.C5288c;
import p163g.p174d.p178b.p193j0.C5288c.C5289a;
import p163g.p174d.p178b.p193j0.C5290d;
import p163g.p174d.p178b.p193j0.C5291e;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001f\u0010=\u001a\u00020>2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020>0@¢\u0006\u0002\bBJ3\u0010C\u001a\f\u0012\u0006\b\u0001\u0012\u00020D\u0018\u00010\u00112\b\u0010E\u001a\u0004\u0018\u00010F2\u0010\u0010G\u001a\f\u0012\u0006\b\u0001\u0012\u00020D\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010HJE\u0010I\u001a\u0004\u0018\u00010\u00122\b\u0010E\u001a\u0004\u0018\u00010F2\u0010\u0010G\u001a\f\u0012\u0006\b\u0001\u0012\u00020D\u0018\u00010\u00112\b\u0010J\u001a\u0004\u0018\u00010(2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0007¢\u0006\u0002\u0010LJ\u001e\u0010M\u001a\u0004\u0018\u00010\u00122\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010J\u001a\u0004\u0018\u00010(H\u0007J\"\u0010N\u001a\u00020\u00052\b\u0010O\u001a\u0004\u0018\u00010(2\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0007J\u000e\u0010Q\u001a\u00020>2\u0006\u0010\t\u001a\u00020\u0005J\f\u0010R\u001a\b\u0012\u0004\u0012\u00020S0'J\b\u0010T\u001a\u0004\u0018\u00010(J\b\u0010U\u001a\u0004\u0018\u00010(J\u0012\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010\u0012J\u0014\u0010Y\u001a\u0004\u0018\u00010(2\b\u0010Z\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010[\u001a\u0004\u0018\u00010(2\u0006\u0010\\\u001a\u00020\u001eJ\u0010\u0010]\u001a\u0004\u0018\u00010W2\u0006\u0010\\\u001a\u00020\u001eJ\u0010\u0010^\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010W\u0018\u00010'J(\u0010_\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u001e2\u0016\u0010a\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fH\u0007J\u0018\u0010b\u001a\u00020\u00052\u0006\u0010c\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020\u001eH\u0007J\u0010\u0010e\u001a\u00020\u00052\u0006\u0010f\u001a\u00020WH\u0002J\u0006\u0010g\u001a\u00020\u0005J\u0006\u0010h\u001a\u00020\u0005J\u000e\u0010i\u001a\u00020\u00052\u0006\u0010f\u001a\u00020WJ\u000e\u0010j\u001a\u00020\u00052\u0006\u0010k\u001a\u00020SJ\u0006\u0010l\u001a\u00020\u0005J\u0006\u0010m\u001a\u00020\u0005J\u0006\u0010n\u001a\u00020\u0005J\u001d\u0010o\u001a\u00020>2\u0010\u0010p\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0017J\b\u0010q\u001a\u00020>H\u0007JK\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010s\u001a\u0004\u0018\u00010t2\u0016\u0010u\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020D0\u0011\u0018\u00010\u00112\b\u0010v\u001a\u0004\u0018\u00010D2\b\u0010w\u001a\u0004\u0018\u00010xH\u0014¢\u0006\u0002\u0010yJQ\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020|\u0018\u00010{2\b\u0010E\u001a\u0004\u0018\u00010F2\u0010\u0010G\u001a\f\u0012\u0006\b\u0001\u0012\u00020D\u0018\u00010\u00112\u0006\u0010}\u001a\u00020\u001e2\b\u0010w\u001a\u0004\u0018\u00010x2\u0006\u0010~\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010J4\u0010\u0001\u001a\u00020\u00122\b\u0010E\u001a\u0004\u0018\u00010F2\u0010\u0010G\u001a\f\u0012\u0006\b\u0001\u0012\u00020D\u0018\u00010\u00112\u0007\u0010\u0001\u001a\u00020\u0012H\u0007¢\u0006\u0003\u0010\u0001JP\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0005\u0012\u00030\u0001\u0018\u00010{2\b\u0010E\u001a\u0004\u0018\u00010F2\u0011\u0010\u0001\u001a\f\u0012\u0006\b\u0001\u0012\u00020D\u0018\u00010\u00112\b\u0010w\u001a\u0004\u0018\u00010x2\t\u0010\u0001\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0003\u0010\u0001J:\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0005\u0012\u00030\u0001\u0018\u00010{2\b\u0010E\u001a\u0004\u0018\u00010F2\u0016\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0005\u0012\u00030\u0001\u0018\u00010{H\u0005JG\u0010\u0001\u001a\u0004\u0018\u00010\u00122\b\u0010E\u001a\u0004\u0018\u00010F2\u0010\u0010G\u001a\f\u0012\u0006\b\u0001\u0012\u00020D\u0018\u00010\u00112\u0006\u0010}\u001a\u00020\u001e2\b\u0010w\u001a\u0004\u0018\u00010x2\u0006\u0010~\u001a\u00020\u0005H\u0014¢\u0006\u0003\u0010\u0001J\u0010\u0010\u0001\u001a\u00020>2\u0007\u0010\u0001\u001a\u00020\u0005J\u0012\u0010\u0001\u001a\u00020>2\t\u0010\u0001\u001a\u0004\u0018\u00010(J*\u0010\u0001\u001a\u00020>2\u0007\u0010\u0001\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020\u001e2\t\u0010\u0001\u001a\u0004\u0018\u00010\u001e¢\u0006\u0003\u0010\u0001J\u0010\u0010\u0001\u001a\u00020>2\u0007\u0010\u0001\u001a\u00020\u0005J\u0012\u0010\u0001\u001a\u00020>2\t\u0010\u0001\u001a\u0004\u0018\u00010(J\u0006\u00106\u001a\u00020>J*\u0010\u0001\u001a\u00020>2\u0007\u0010\u0001\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020\u001e2\t\u0010\u0001\u001a\u0004\u0018\u00010\u001e¢\u0006\u0003\u0010\u0001J*\u0010\u0001\u001a\u00020>2\u0007\u0010\u0001\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020\u001e2\t\u0010\u0001\u001a\u0004\u0018\u00010\u001e¢\u0006\u0003\u0010\u0001JG\u0010\u0001\u001a\u00020\u00052\t\u0010\u0001\u001a\u0004\u0018\u00010(2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\t\u0010\u0001\u001a\u0004\u0018\u00010W2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fH\u0005J\u0012\u0010\u0001\u001a\u00020\u00052\t\u0010\u0001\u001a\u0004\u0018\u00010WR$\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0016\n\u0002\u0010\u0018\u0012\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\"R,\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\"R,\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u00020/8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u000b\u001a\u0004\b1\u00102R$\u00103\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR&\u00107\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006\u0001"}, mo31007d2 = {"Lcom/bamtech/player/exo/trackselector/BamTrackSelector;", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;", "trackSelectionFactory", "Lcom/google/android/exoplayer2/trackselection/TrackSelection$Factory;", "forcedAtmosEnabled", "", "playerEvents", "Lcom/bamtech/player/PlayerEvents;", "(Lcom/google/android/exoplayer2/trackselection/TrackSelection$Factory;ZLcom/bamtech/player/PlayerEvents;)V", "captionsEnabled", "captionsEnabled$annotations", "()V", "getCaptionsEnabled", "()Z", "setCaptionsEnabled", "(Z)V", "currentTracks", "", "Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;", "currentTracks$annotations", "getCurrentTracks", "()[Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;", "setCurrentTracks", "([Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;)V", "[Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;", "getForcedAtmosEnabled", "getPlayerEvents", "()Lcom/bamtech/player/PlayerEvents;", "requiredAudioRoleFlags", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "requiredAudioRoleFlags$annotations", "getRequiredAudioRoleFlags", "()Ljava/util/HashSet;", "requiredSubtitleRoleFlags", "requiredSubtitleRoleFlags$annotations", "getRequiredSubtitleRoleFlags", "selectedVideoTrackAudioGroupIds", "", "", "selectedVideoTrackAudioGroupIds$annotations", "getSelectedVideoTrackAudioGroupIds", "()Ljava/util/List;", "setSelectedVideoTrackAudioGroupIds", "(Ljava/util/List;)V", "trackFactory", "Lcom/bamtech/player/exo/features/TrackFactory;", "trackFactory$annotations", "getTrackFactory", "()Lcom/bamtech/player/exo/features/TrackFactory;", "videoQualityAuto", "videoQualityAuto$annotations", "getVideoQualityAuto", "setVideoQualityAuto", "videoTrackSelection", "videoTrackSelection$annotations", "getVideoTrackSelection", "()Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;", "setVideoTrackSelection", "(Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;)V", "changeParameters", "", "paramLambda", "Lkotlin/Function1;", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$ParametersBuilder;", "Lkotlin/ExtensionFunctionType;", "configureFormatSupportForAtmos", "", "groups", "Lcom/google/android/exoplayer2/source/TrackGroupArray;", "formatSupports", "(Lcom/google/android/exoplayer2/source/TrackGroupArray;[[I)[[I", "createAudioSelectionWithGroup", "desiredLanguage", "desiredGroupIds", "(Lcom/google/android/exoplayer2/source/TrackGroupArray;[[ILjava/lang/String;Ljava/util/List;)Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;", "createTextSelectionWithRoles", "doesAudioTrackGroupMatchVideoTrackGroup", "audioGroupId", "videoGroupIds", "enableCaptions", "getAvailableTracks", "Lcom/bamtech/player/tracks/Track;", "getCurrentAudioLanguage", "getCurrentSubtitleLanguage", "getFormatFromSelection", "Lcom/google/android/exoplayer2/Format;", "trackSelection", "getGroupId", "formatSelection", "getLanguageForTrackType", "trackType", "getSelectedFormatOfType", "getSelectedTracks", "hasDesiredRoleFlags", "roleFlags", "desiredRoleFlags", "hasRoleFlag", "formatRoleFlags", "wantedRoleFlag", "hasSubtitlesMimeType", "format", "hasTextTrack", "hasTextTrackSelected", "isAtmos", "isSelected", "track", "isSelectedAudioDescriptive", "isSelectedSubtitleSDH", "isVideoQualityAuto", "postNewTrackList", "selections", "reselectTracks", "selectAllTracks", "mappedTrackInfo", "Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;", "rendererFormatSupports", "rendererMixedMimeTypeAdaptationSupports", "params", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;", "(Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;[[[I[ILcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;)[Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;", "selectAudioTrack", "Landroid/util/Pair;", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$AudioTrackScore;", "mixedMimeTypeAdaptationSupports", "enableAdaptiveTrackSelection", "(Lcom/google/android/exoplayer2/source/TrackGroupArray;[[IILcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;Z)Landroid/util/Pair;", "selectAudioTrack_internal", "audioSelection", "(Lcom/google/android/exoplayer2/source/TrackGroupArray;[[ILcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;)Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;", "selectTextTrack", "Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$TextTrackScore;", "formatSupport", "selectedAudioLanguage", "(Lcom/google/android/exoplayer2/source/TrackGroupArray;[[ILcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;Ljava/lang/String;)Landroid/util/Pair;", "selectTextTrack_internal", "superSelection", "selectVideoTrack", "(Lcom/google/android/exoplayer2/source/TrackGroupArray;[[IILcom/google/android/exoplayer2/trackselection/DefaultTrackSelector$Parameters;Z)Lcom/google/android/exoplayer2/trackselection/TrackSelection$Definition;", "setAudioDescriptiveFlag", "sdhEnabled", "setAudioLanguage", "languageCode", "setMaxVideoResolution", "width", "height", "bitrate", "(IILjava/lang/Integer;)V", "setSubtitleSDHFlag", "setTextLanguage", "setVideoResolution", "setVideoSizeAndBitrate", "shouldCreateNewAudioTrackSelection", "audioTrackGroupId", "audioFormat", "shouldDisableCaptions", "selectedFormat", "bamplayer-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.player.exo.n.a */
/* compiled from: BamTrackSelector.kt */
public class C1739a extends C9295d {

    /* renamed from: h */
    private C9312a[] f6025h;

    /* renamed from: i */
    private boolean f6026i = true;

    /* renamed from: j */
    private boolean f6027j;

    /* renamed from: k */
    private C9312a f6028k;

    /* renamed from: l */
    private List<String> f6029l;

    /* renamed from: m */
    private final C1726a f6030m = new C1726a(null, 1, null);

    /* renamed from: n */
    private final HashSet<Integer> f6031n = new HashSet<>();

    /* renamed from: o */
    private final HashSet<Integer> f6032o = new HashSet<>();

    /* renamed from: p */
    private final boolean f6033p;

    /* renamed from: q */
    private final C5300m f6034q;

    /* renamed from: com.bamtech.player.exo.n.a$a */
    /* compiled from: BamTrackSelector.kt */
    static final class C1740a extends C12881k implements Function1<C9301e, C13145v> {

        /* renamed from: c */
        final /* synthetic */ boolean f6035c;

        C1740a(boolean z) {
            this.f6035c = z;
            super(1);
        }

        /* renamed from: a */
        public final void mo7796a(C9301e eVar) {
            eVar.mo24108a(this.f6035c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7796a((C9301e) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtech.player.exo.n.a$b */
    /* compiled from: BamTrackSelector.kt */
    static final class C1741b extends C12881k implements Function1<C9301e, C13145v> {

        /* renamed from: c */
        final /* synthetic */ String f6036c;

        C1741b(String str) {
            this.f6036c = str;
            super(1);
        }

        /* renamed from: a */
        public final void mo7797a(C9301e eVar) {
            eVar.mo24107a(this.f6036c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7797a((C9301e) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtech.player.exo.n.a$c */
    /* compiled from: BamTrackSelector.kt */
    static final class C1742c extends C12881k implements Function1<C9301e, C13145v> {

        /* renamed from: c */
        final /* synthetic */ String f6037c;

        C1742c(String str) {
            this.f6037c = str;
            super(1);
        }

        /* renamed from: a */
        public final void mo7798a(C9301e eVar) {
            eVar.mo24110b(this.f6037c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7798a((C9301e) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtech.player.exo.n.a$d */
    /* compiled from: BamTrackSelector.kt */
    static final class C1743d extends C12881k implements Function1<C9301e, C13145v> {

        /* renamed from: U */
        final /* synthetic */ int f6038U;

        /* renamed from: V */
        final /* synthetic */ Integer f6039V;

        /* renamed from: c */
        final /* synthetic */ int f6040c;

        C1743d(int i, int i2, Integer num) {
            this.f6040c = i;
            this.f6038U = i2;
            this.f6039V = num;
            super(1);
        }

        /* renamed from: a */
        public final void mo7799a(C9301e eVar) {
            eVar.mo24111b(false);
            eVar.mo24104a(this.f6040c, this.f6038U);
            Integer num = this.f6039V;
            eVar.mo24109b(num != null ? num.intValue() : Integer.MAX_VALUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7799a((C9301e) obj);
            return C13145v.f29587a;
        }
    }

    public C1739a(C9313b bVar, boolean z, C5300m mVar) {
        super(bVar);
        this.f6033p = z;
        this.f6034q = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9312a[] mo7774a(C9307a aVar, int[][][] iArr, int[] iArr2, C9299d dVar) {
        C9312a[] a = super.mo7774a(aVar, iArr, iArr2, dVar);
        this.f6025h = a;
        mo7768a(a);
        C12880j.m40222a((Object) a, "selections");
        return a;
    }

    /* renamed from: c */
    public final void mo7784c(boolean z) {
        Integer valueOf = Integer.valueOf(1024);
        if (z) {
            this.f6032o.add(valueOf);
        } else {
            this.f6032o.remove(valueOf);
        }
        mo7794n();
    }

    /* renamed from: c */
    public final boolean mo7785c(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: f */
    public final List<C5290d> mo7786f() {
        ArrayList arrayList = new ArrayList();
        C9307a c = mo24122c();
        if (c != null) {
            int a = c.mo24123a();
            for (int i = 0; i < a; i++) {
                TrackGroupArray b = c.mo24130b(i);
                C12880j.m40222a((Object) b, "this.getTrackGroups(trackGroupIndex)");
                int i2 = b.f20170c;
                for (int i3 = 0; i3 < i2; i3++) {
                    C9199j0 a2 = b.mo23531a(i3);
                    C12880j.m40222a((Object) a2, "this.get(trackGroupIndex)");
                    int i4 = a2.f20833c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        Format a3 = a2.mo23902a(i5);
                        C12880j.m40222a((Object) a3, "this.getFormat(formatIndex)");
                        arrayList.add(this.f6030m.mo7711a(a3));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final String mo7787g() {
        return mo7764a(1);
    }

    /* renamed from: h */
    public final String mo7788h() {
        return mo7764a(3);
    }

    /* renamed from: i */
    public final boolean mo7789i() {
        C9307a c = mo24122c();
        if (c != null) {
            int a = c.mo24123a();
            for (int i = 0; i < a; i++) {
                TrackGroupArray b = c.mo24130b(i);
                C12880j.m40222a((Object) b, "this.getTrackGroups(trackGroupIndex)");
                int i2 = b.f20170c;
                for (int i3 = 0; i3 < i2; i3++) {
                    C9199j0 a2 = b.mo23531a(i3);
                    C12880j.m40222a((Object) a2, "this.get(trackGroupIndex)");
                    int i4 = a2.f20833c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        Format a3 = a2.mo23902a(i5);
                        C12880j.m40222a((Object) a3, "this.getFormat(formatIndex)");
                        if (m8047c(a3)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo7790j() {
        C9312a[] aVarArr = this.f6025h;
        if (aVarArr != null) {
            for (C9312a a : aVarArr) {
                Format a2 = mo7760a(a);
                if (a2 != null && m8047c(a2)) {
                    return !C1744b.m8094d(a2);
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo7791k() {
        boolean z = true;
        Format b = mo7776b(1);
        if (b == null) {
            return false;
        }
        if ((b.f18344W & DateUtils.FORMAT_NO_NOON) == 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo7792l() {
        Format b = mo7776b(3);
        return (b == null || (b.f18344W & 1024) == 0) ? false : true;
    }

    /* renamed from: m */
    public final boolean mo7793m() {
        return this.f6026i;
    }

    /* renamed from: n */
    public final void mo7794n() {
        mo24048b();
    }

    /* renamed from: o */
    public final void mo7795o() {
        this.f6026i = true;
        mo7794n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9312a mo7777b(TrackGroupArray trackGroupArray, int[][] iArr, int i, C9299d dVar, boolean z) {
        this.f6028k = super.mo7777b(trackGroupArray, iArr, i, dVar, this.f6026i);
        Format a = mo7760a(this.f6028k);
        this.f6029l = a != null ? C1744b.m8091a(a) : null;
        return this.f6028k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<C9312a, C9298c> mo7758a(TrackGroupArray trackGroupArray, int[][] iArr, int i, C9299d dVar, boolean z) {
        mo7775a(trackGroupArray, iArr);
        Pair a = super.mo7758a(trackGroupArray, iArr, i, dVar, z);
        if (a == null) {
            return null;
        }
        Object obj = a.first;
        C12880j.m40222a(obj, "audioSelection.first");
        return new Pair<>(mo7762a(trackGroupArray, iArr, (C9312a) obj), a.second);
    }

    /* renamed from: b */
    public final String mo7778b(C9312a aVar) {
        Format a = mo7760a(aVar);
        if (a != null) {
            return C1744b.m8092b(a);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo7783c(String str) {
        if (!C12880j.m40224a((Object) mo24087e().f21300U, (Object) str)) {
            mo7766a((Function1<? super C9301e, C13145v>) new C1742c<Object,C13145v>(str));
            mo7794n();
        }
    }

    /* renamed from: b */
    public final void mo7781b(boolean z) {
        Integer valueOf = Integer.valueOf(DateUtils.FORMAT_NO_NOON);
        if (z) {
            this.f6031n.add(valueOf);
        } else {
            this.f6031n.remove(valueOf);
        }
        mo7794n();
    }

    /* renamed from: c */
    private final boolean m8047c(Format format) {
        C5289a aVar = C5288c.f12654h;
        String str = format.f18349b0;
        if (str == null) {
            str = "";
        }
        return aVar.mo16866b(str);
    }

    /* renamed from: a */
    public final int[][] mo7775a(TrackGroupArray trackGroupArray, int[][] iArr) {
        if (this.f6033p && trackGroupArray != null) {
            int i = trackGroupArray.f20170c;
            for (int i2 = 0; i2 < i; i2++) {
                C9199j0 a = trackGroupArray.mo23531a(i2);
                C12880j.m40222a((Object) a, "this.get(trackGroupIndex)");
                int i3 = a.f20833c;
                for (int i4 = 0; i4 < i3; i4++) {
                    Format a2 = a.mo23902a(i4);
                    C12880j.m40222a((Object) a2, "this.getFormat(formatIndex)");
                    if (mo7770a(a2) && iArr != null) {
                        int[] iArr2 = iArr[i2];
                        if (iArr2 != null) {
                            iArr2[i4] = 12;
                        }
                    }
                }
            }
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if ((r1.length() == 0) == false) goto L_0x0028;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7782b(com.google.android.exoplayer2.Format r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0008
            boolean r4 = com.bamtech.player.exo.p046n.C1744b.m8094d(r4)
            goto L_0x0009
        L_0x0008:
            r4 = 0
        L_0x0009:
            com.google.android.exoplayer2.trackselection.d$d r1 = r3.mo24087e()
            java.lang.String r1 = r1.f21300U
            r2 = 1
            if (r1 != 0) goto L_0x0028
            com.google.android.exoplayer2.trackselection.d$d r1 = r3.mo24087e()
            java.lang.String r1 = r1.f21300U
            if (r1 == 0) goto L_0x0026
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0022
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            if (r1 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = 0
            goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            if (r4 != 0) goto L_0x0032
            if (r1 != 0) goto L_0x0032
            boolean r4 = r3.f6027j
            if (r4 != 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.player.exo.p046n.C1739a.mo7782b(com.google.android.exoplayer2.Format):boolean");
    }

    /* renamed from: b */
    public final void mo7780b(String str) {
        if (!C12880j.m40224a((Object) mo24087e().f21304c, (Object) str)) {
            mo7766a((Function1<? super C9301e, C13145v>) new C1741b<Object,C13145v>(str));
            mo7794n();
        }
    }

    /* renamed from: a */
    public final C9312a mo7762a(TrackGroupArray trackGroupArray, int[][] iArr, C9312a aVar) {
        String b = mo7778b(aVar);
        Format a = mo7760a(aVar);
        String str = a != null ? a.f18368t0 : null;
        if (!mo7773a(b, this.f6029l, mo7760a(aVar), this.f6031n)) {
            return aVar;
        }
        C9312a a2 = mo7763a(trackGroupArray, iArr, str, this.f6029l);
        if (a2 == null) {
            a2 = aVar;
        }
        return a2;
    }

    /* renamed from: b */
    public final void mo7779b(int i, int i2, Integer num) {
        mo7766a((Function1<? super C9301e, C13145v>) new C1743d<Object,C13145v>(i, i2, num));
        mo7794n();
    }

    /* renamed from: b */
    public final Format mo7776b(int i) {
        C9307a c = mo24122c();
        C9312a aVar = null;
        if (c != null) {
            C12880j.m40222a((Object) c, "mappedInfo");
            Iterator it = C12762h.m39920d(0, c.mo24123a()).iterator();
            while (it.hasNext()) {
                int b = ((C13162e0) it).mo31079b();
                if (c.mo24124a(b) == i) {
                    C9312a[] aVarArr = this.f6025h;
                    if (aVarArr != null) {
                        aVar = aVarArr[b];
                    }
                    return mo7760a(aVar);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7773a(String str, List<String> list, Format format, HashSet<Integer> hashSet) {
        int i = format != null ? format.f18344W : 0;
        if (!mo7772a(str, list) || !mo7769a(i, hashSet)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<C9312a, C9304g> mo7759a(TrackGroupArray trackGroupArray, int[][] iArr, C9299d dVar, String str) {
        return mo7757a(trackGroupArray, super.mo7759a(trackGroupArray, iArr, dVar, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Pair<C9312a, C9304g> mo7757a(TrackGroupArray trackGroupArray, Pair<C9312a, C9304g> pair) {
        if (pair == null) {
            return null;
        }
        Format a = mo7760a((C9312a) pair.first);
        if (a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Format from selection was null");
            sb.append(String.valueOf(trackGroupArray));
            C14100a.m44526b(sb.toString(), new Object[0]);
            return null;
        } else if (mo7782b(a)) {
            return null;
        } else {
            if (!mo7769a(a.f18344W, this.f6032o)) {
                C9312a a2 = mo7761a(trackGroupArray, a.f18368t0);
                if (a2 != null) {
                    return new Pair<>(a2, pair.second);
                }
            }
            return pair;
        }
    }

    /* renamed from: a */
    public final boolean mo7772a(String str, List<String> list) {
        return (str == null || list == null || !list.contains(str)) ? false : true;
    }

    /* renamed from: a */
    public final void mo7765a(int i, int i2, Integer num) {
        this.f6026i = true;
        mo7779b(i, i2, num);
    }

    /* renamed from: a */
    public final boolean mo7771a(C5290d dVar) {
        C9312a[] aVarArr = this.f6025h;
        if (aVarArr != null) {
            for (C9312a aVar : aVarArr) {
                if (aVar != null) {
                    C9199j0 j0Var = aVar.f21295a;
                    if (j0Var != null) {
                        Format a = j0Var.mo23902a(aVar.f21296b[0]);
                        if (a != null && a.equals(dVar.mo16870c())) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Format mo7760a(C9312a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.f21295a.mo23902a(aVar.f21296b[0]);
    }

    /* renamed from: a */
    public final void mo7767a(boolean z) {
        this.f6027j = z;
        mo7766a((Function1<? super C9301e, C13145v>) new C1740a<Object,C13145v>(z));
        mo7794n();
    }

    /* renamed from: a */
    public final void mo7766a(Function1<? super C9301e, C13145v> function1) {
        C9301e d = mo24086d();
        C12880j.m40222a((Object) d, "paramBuilder");
        function1.invoke(d);
        mo24085a(d);
    }

    /* renamed from: a */
    public final String mo7764a(int i) {
        Format b = mo7776b(i);
        if (b != null) {
            return b.f18368t0;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo7770a(Format format) {
        return format.f18363o0 == 16;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.trackselection.C9311j.C9312a mo7763a(com.google.android.exoplayer2.source.TrackGroupArray r10, int[][] r11, java.lang.String r12, java.util.List<java.lang.String> r13) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0062
            int r0 = r10.f20170c
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0062
            com.google.android.exoplayer2.source.j0 r3 = r10.mo23531a(r2)
            java.lang.String r4 = "this.get(trackGroupIndex)"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            int r4 = r3.f20833c
            r5 = 0
        L_0x0014:
            if (r5 >= r4) goto L_0x005f
            com.google.android.exoplayer2.Format r6 = r3.mo23902a(r5)
            java.lang.String r7 = "this.getFormat(formatIndex)"
            kotlin.jvm.internal.C12880j.m40222a(r6, r7)
            java.lang.String r7 = com.bamtech.player.exo.p046n.C1744b.m8092b(r6)
            java.lang.String r8 = r6.f18368t0
            boolean r8 = kotlin.jvm.internal.C12880j.m40224a(r8, r12)
            if (r8 == 0) goto L_0x005c
            if (r13 == 0) goto L_0x0033
            boolean r7 = kotlin.p590y.C13199w.m40564a(r13, r7)
            if (r7 == 0) goto L_0x005c
        L_0x0033:
            int r6 = r6.f18344W
            java.util.HashSet<java.lang.Integer> r7 = r9.f6031n
            boolean r6 = r9.mo7769a(r6, r7)
            if (r6 == 0) goto L_0x005c
            if (r11 == 0) goto L_0x0046
            r6 = r11[r2]
            if (r6 == 0) goto L_0x0046
            r6 = r6[r5]
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            r7 = 1
            boolean r6 = com.google.android.exoplayer2.trackselection.C9295d.m28231a(r6, r7)
            if (r6 == 0) goto L_0x005c
            com.google.android.exoplayer2.trackselection.j$a r11 = new com.google.android.exoplayer2.trackselection.j$a
            com.google.android.exoplayer2.source.j0 r10 = r10.mo23531a(r2)
            int[] r12 = new int[r7]
            r12[r1] = r5
            r11.<init>(r10, r12)
            return r11
        L_0x005c:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0062:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.player.exo.p046n.C1739a.mo7763a(com.google.android.exoplayer2.source.TrackGroupArray, int[][], java.lang.String, java.util.List):com.google.android.exoplayer2.trackselection.j$a");
    }

    /* renamed from: a */
    public final C9312a mo7761a(TrackGroupArray trackGroupArray, String str) {
        if (trackGroupArray != null) {
            int i = trackGroupArray.f20170c;
            for (int i2 = 0; i2 < i; i2++) {
                C9199j0 a = trackGroupArray.mo23531a(i2);
                C12880j.m40222a((Object) a, "this.get(trackGroupIndex)");
                int i3 = a.f20833c;
                int i4 = 0;
                while (i4 < i3) {
                    Format a2 = a.mo23902a(i4);
                    C12880j.m40222a((Object) a2, "this.getFormat(formatIndex)");
                    if (!C12880j.m40224a((Object) a2.f18368t0, (Object) str) || !mo7769a(a2.f18344W, this.f6032o) || C1744b.m8094d(a2)) {
                        i4++;
                    } else {
                        return new C9312a(trackGroupArray.mo23531a(i2), i4);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo7769a(int i, HashSet<Integer> hashSet) {
        for (Number intValue : hashSet) {
            if (!mo7785c(i, intValue.intValue())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7768a(C9312a[] aVarArr) {
        ArrayList arrayList;
        if (aVarArr != null) {
            ArrayList<Format> arrayList2 = new ArrayList<>();
            for (C9312a a : aVarArr) {
                Format a2 = mo7760a(a);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            arrayList = new ArrayList(C13187p.m40525a((Iterable) arrayList2, 10));
            for (Format a3 : arrayList2) {
                arrayList.add(this.f6030m.mo7711a(a3));
            }
        } else {
            arrayList = null;
        }
        C5300m mVar = this.f6034q;
        if (mVar != null) {
            mVar.mo16992a(new C5291e(arrayList));
        }
    }
}
