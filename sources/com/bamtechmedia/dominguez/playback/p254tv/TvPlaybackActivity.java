package com.bamtechmedia.dominguez.playback.p254tv;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C0538i;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0722m;
import com.bamtech.player.exo.ExoSurfaceView;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.framework.C5735b;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3850c;
import com.bamtechmedia.dominguez.playback.C6325d;
import com.bamtechmedia.dominguez.playback.C6326e;
import com.bamtechmedia.dominguez.playback.C6327f;
import com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6286a;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6288c;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6290e;
import com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter;
import com.bamtechmedia.dominguez.playback.common.contentrating.ContentRatingPresenter.C6280b;
import com.bamtechmedia.dominguez.playback.common.receiver.HdmiBroadcastReceiver.C6296b;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f.C6322b;
import com.bamtechmedia.dominguez.playback.mobile.LocalBookmarksMarker;
import com.bamtechmedia.dominguez.playback.p236l.C6334b;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6337b;
import com.bamtechmedia.dominguez.playback.p237m.C6342f;
import com.bamtechmedia.dominguez.playback.p237m.p238i.C6374a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6391e;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6410j;
import com.bamtechmedia.dominguez.playback.p237m.p240k.C6414a;
import com.bamtechmedia.dominguez.playback.p237m.p240k.C6414a.C6415a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6421a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6434a;
import com.bamtechmedia.dominguez.playback.p237m.p245n.C6448b;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6493a;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6495c;
import com.bamtechmedia.dominguez.playback.p237m.p251p.C6497e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6503b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6506e;
import com.bamtechmedia.dominguez.playback.p254tv.p257e.C6561b;
import com.bamtechmedia.dominguez.playback.p254tv.upnext.TvUpNextComponent;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4121a0;
import p096e.p154p.C4265b;
import p096e.p154p.C4309m;
import p096e.p154p.C4309m.C4315f;
import p096e.p154p.C4317o;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ±\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002±\u0001B\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010
\u0001\u001a\u00030\u0001H\u0002J\u0015\u0010\u0001\u001a\u00020>2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0016\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020>H\u0007J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u001a\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0001¢\u0006\u0003\b\u0001J\u001d\u0010\u0001\u001a\u00020>2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u0016\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010 \u0001H\u0014J\u0016\u0010¡\u0001\u001a\u00030\u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016J\u0015\u0010¤\u0001\u001a\u00020>2\n\u0010\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016J\u0016\u0010¦\u0001\u001a\u00030\u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016J\n\u0010§\u0001\u001a\u00030\u0001H\u0014J\n\u0010¨\u0001\u001a\u00030\u0001H\u0014J\n\u0010©\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010ª\u0001\u001a\u00030\u00012\b\u0010«\u0001\u001a\u00030¬\u0001H\u0007J\n\u0010­\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010®\u0001\u001a\u00030\u00012\b\u0010¯\u0001\u001a\u00030°\u0001H\u0007R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020>X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020X8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010]\u001a\u00020^8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010c\u001a\u00020d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001e\u0010i\u001a\u00020j8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001e\u0010o\u001a\u00020p8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u000e\u0010u\u001a\u00020vX.¢\u0006\u0002\n\u0000R\u001e\u0010w\u001a\u00020x8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R!\u0010}\u001a\u00020~8\u0006@\u0006X.¢\u0006\u0011\n\u0000\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001¨\u0006²\u0001"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/TvPlaybackActivity;", "Lcom/bamtechmedia/dominguez/core/framework/BaseActivity;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnShowListener;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "()V", "backgroundResponder", "Lcom/bamtechmedia/dominguez/playback/common/background/PlaybackActivityBackgroundResponder;", "getBackgroundResponder", "()Lcom/bamtechmedia/dominguez/playback/common/background/PlaybackActivityBackgroundResponder;", "setBackgroundResponder", "(Lcom/bamtechmedia/dominguez/playback/common/background/PlaybackActivityBackgroundResponder;)V", "contentRatingListeners", "Lcom/bamtechmedia/dominguez/playback/common/listeners/ContentRatingListeners;", "getContentRatingListeners", "()Lcom/bamtechmedia/dominguez/playback/common/listeners/ContentRatingListeners;", "setContentRatingListeners", "(Lcom/bamtechmedia/dominguez/playback/common/listeners/ContentRatingListeners;)V", "contentRatingPresenter", "Lcom/bamtechmedia/dominguez/playback/common/contentrating/ContentRatingPresenter;", "getContentRatingPresenter", "()Lcom/bamtechmedia/dominguez/playback/common/contentrating/ContentRatingPresenter;", "setContentRatingPresenter", "(Lcom/bamtechmedia/dominguez/playback/common/contentrating/ContentRatingPresenter;)V", "convivaSetup", "Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaSetup;", "getConvivaSetup", "()Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaSetup;", "setConvivaSetup", "(Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaSetup;)V", "currentContentUpdates", "Lcom/bamtechmedia/dominguez/playback/common/controls/TopBarPresenter;", "getCurrentContentUpdates", "()Lcom/bamtechmedia/dominguez/playback/common/controls/TopBarPresenter;", "setCurrentContentUpdates", "(Lcom/bamtechmedia/dominguez/playback/common/controls/TopBarPresenter;)V", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "getEngine", "()Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "setEngine", "(Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;)V", "engineFactory", "Lcom/bamtechmedia/dominguez/playback/common/engine/PlaybackEngineFactory;", "getEngineFactory", "()Lcom/bamtechmedia/dominguez/playback/common/engine/PlaybackEngineFactory;", "setEngineFactory", "(Lcom/bamtechmedia/dominguez/playback/common/engine/PlaybackEngineFactory;)V", "errorHandler", "Lcom/bamtechmedia/dominguez/playback/common/error/PlaybackErrorHandler;", "getErrorHandler", "()Lcom/bamtechmedia/dominguez/playback/common/error/PlaybackErrorHandler;", "setErrorHandler", "(Lcom/bamtechmedia/dominguez/playback/common/error/PlaybackErrorHandler;)V", "focusHandler", "Lcom/bamtechmedia/dominguez/playback/tv/VideoPlaybackFocusHandler;", "getFocusHandler", "()Lcom/bamtechmedia/dominguez/playback/tv/VideoPlaybackFocusHandler;", "setFocusHandler", "(Lcom/bamtechmedia/dominguez/playback/tv/VideoPlaybackFocusHandler;)V", "isAnimating", "", "localBookmarksMarker", "Lcom/bamtechmedia/dominguez/playback/mobile/LocalBookmarksMarker;", "getLocalBookmarksMarker", "()Lcom/bamtechmedia/dominguez/playback/mobile/LocalBookmarksMarker;", "setLocalBookmarksMarker", "(Lcom/bamtechmedia/dominguez/playback/mobile/LocalBookmarksMarker;)V", "playPauseAccessibility", "Lcom/bamtechmedia/dominguez/playback/common/accessibility/PlayPauseAccessibility;", "getPlayPauseAccessibility", "()Lcom/bamtechmedia/dominguez/playback/common/accessibility/PlayPauseAccessibility;", "setPlayPauseAccessibility", "(Lcom/bamtechmedia/dominguez/playback/common/accessibility/PlayPauseAccessibility;)V", "playbackAnalytics", "Lcom/bamtechmedia/dominguez/playback/common/analytics/PlaybackAnalytics;", "getPlaybackAnalytics", "()Lcom/bamtechmedia/dominguez/playback/common/analytics/PlaybackAnalytics;", "setPlaybackAnalytics", "(Lcom/bamtechmedia/dominguez/playback/common/analytics/PlaybackAnalytics;)V", "ratingFormatter", "Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "getRatingFormatter", "()Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "setRatingFormatter", "(Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;)V", "sentryCapabilitiesReporter", "Lcom/bamtechmedia/dominguez/playback/common/engine/session/SentryCapabilitiesReporter;", "getSentryCapabilitiesReporter", "()Lcom/bamtechmedia/dominguez/playback/common/engine/session/SentryCapabilitiesReporter;", "setSentryCapabilitiesReporter", "(Lcom/bamtechmedia/dominguez/playback/common/engine/session/SentryCapabilitiesReporter;)V", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "getStringDictionary", "()Lcom/bamtechmedia/dominguez/config/StringDictionary;", "setStringDictionary", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "titleTreatment", "Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;", "getTitleTreatment", "()Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;", "setTitleTreatment", "(Lcom/bamtechmedia/dominguez/core/design/helper/TitleTreatment;)V", "trackListeners", "Lcom/bamtechmedia/dominguez/playback/common/listeners/TrackListeners;", "getTrackListeners", "()Lcom/bamtechmedia/dominguez/playback/common/listeners/TrackListeners;", "setTrackListeners", "(Lcom/bamtechmedia/dominguez/playback/common/listeners/TrackListeners;)V", "upNextAnalytics", "Lcom/bamtechmedia/dominguez/playback/common/analytics/UpNextAnalytics;", "getUpNextAnalytics", "()Lcom/bamtechmedia/dominguez/playback/common/analytics/UpNextAnalytics;", "setUpNextAnalytics", "(Lcom/bamtechmedia/dominguez/playback/common/analytics/UpNextAnalytics;)V", "upNextComponent", "Lcom/bamtechmedia/dominguez/playback/tv/upnext/TvUpNextComponent;", "upNextListeners", "Lcom/bamtechmedia/dominguez/playback/common/listeners/UpNextListeners;", "getUpNextListeners", "()Lcom/bamtechmedia/dominguez/playback/common/listeners/UpNextListeners;", "setUpNextListeners", "(Lcom/bamtechmedia/dominguez/playback/common/listeners/UpNextListeners;)V", "viewModel", "Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;)V", "animateViewToNormal", "", "animateViewToUpNext", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "finishAndCheckForRoute", "routeAfterPlayback", "Lcom/bamtechmedia/dominguez/playback/common/RouteAfterPlayback;", "finishWithResult", "resultCode", "", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "hideContentRating", "isTemporary", "initializeUIComponents", "container", "Landroid/view/ViewGroup;", "mapPlaybackStateToAction", "state", "Lcom/bamtechmedia/dominguez/playback/common/PlaybackState;", "mapPlaybackStateToAction$playback_release", "onAlertDialogAction", "requestId", "which", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onGenericMotionEvent", "Landroid/view/MotionEvent;", "onShow", "onStart", "onUserLeaveHint", "showAudioAndSubtitlesFragment", "showContentRating", "contentRatingAction", "Lcom/bamtechmedia/dominguez/playback/common/contentrating/ContentRatingAction;", "showDeeplinkContentError", "updateTitles", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity */
/* compiled from: TvPlaybackActivity.kt */
public final class TvPlaybackActivity extends C5735b implements C2413n, OnDismissListener, OnShowListener, C7536a {

    /* renamed from: v0 */
    public static final C6522a f14748v0 = new C6522a(null);

    /* renamed from: Y */
    public C6342f f14749Y;

    /* renamed from: Z */
    public C6421a f14750Z;

    /* renamed from: a0 */
    public C6531b f14751a0;

    /* renamed from: b0 */
    public C6414a f14752b0;

    /* renamed from: c0 */
    public ContentRatingPresenter f14753c0;

    /* renamed from: d0 */
    public C6493a f14754d0;

    /* renamed from: e0 */
    public PlaybackActivityBackgroundResponder f14755e0;

    /* renamed from: f0 */
    public C3572r0 f14756f0;

    /* renamed from: g0 */
    public C6497e f14757g0;

    /* renamed from: h0 */
    public C6410j f14758h0;

    /* renamed from: i0 */
    public C3716q f14759i0;

    /* renamed from: j0 */
    public C3850c f14760j0;

    /* renamed from: k0 */
    public C6495c f14761k0;

    /* renamed from: l0 */
    public C6391e f14762l0;

    /* renamed from: m0 */
    public LocalBookmarksMarker f14763m0;

    /* renamed from: n0 */
    public C6448b f14764n0;

    /* renamed from: o0 */
    public C6434a f14765o0;

    /* renamed from: p0 */
    public C6374a f14766p0;

    /* renamed from: q0 */
    public C6384c f14767q0;

    /* renamed from: r0 */
    private TvUpNextComponent f14768r0;

    /* renamed from: s0 */
    public SDK4ExoPlaybackEngine f14769s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public boolean f14770t0;

    /* renamed from: u0 */
    private HashMap f14771u0;

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$a */
    /* compiled from: TvPlaybackActivity.kt */
    public static final class C6522a implements C6334b {
        private C6522a() {
        }

        /* renamed from: a */
        public Intent mo18948a(Context context, String str) {
            Intent putExtra = new Intent(context, TvPlaybackActivity.class).putExtra("contentId", str);
            Intrinsics.checkReturnedValueIsNotNull((Object) putExtra, "Intent(context, TvPlayba…ra(CONTENT_ID, contentId)");
            return putExtra;
        }

        public /* synthetic */ C6522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public Intent mo18947a(Context context, C3693o oVar) {
            Intent putExtra = new Intent(context, TvPlaybackActivity.class).putExtra("playable", oVar);
            Intrinsics.checkReturnedValueIsNotNull((Object) putExtra, "Intent(context, TvPlayba…a(PLAYABLE_KEY, playable)");
            return putExtra;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$b */
    /* compiled from: TvPlaybackActivity.kt */
    public static final class C6523b implements C4315f {

        /* renamed from: a */
        final /* synthetic */ TvPlaybackActivity f14772a;

        C6523b(TvPlaybackActivity tvPlaybackActivity) {
            this.f14772a = tvPlaybackActivity;
        }

        /* renamed from: a */
        public void mo15054a(C4309m mVar) {
            this.f14772a.f14770t0 = true;
        }

        /* renamed from: b */
        public void mo15037b(C4309m mVar) {
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
            this.f14772a.f14770t0 = false;
        }

        /* renamed from: d */
        public void mo15039d(C4309m mVar) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$c */
    /* compiled from: TvPlaybackActivity.kt */
    public static final class C6524c implements C4315f {

        /* renamed from: a */
        final /* synthetic */ TvPlaybackActivity f14773a;

        C6524c(TvPlaybackActivity tvPlaybackActivity) {
            this.f14773a = tvPlaybackActivity;
        }

        /* renamed from: a */
        public void mo15054a(C4309m mVar) {
            this.f14773a.f14770t0 = true;
        }

        /* renamed from: b */
        public void mo15037b(C4309m mVar) {
        }

        /* renamed from: c */
        public void mo15038c(C4309m mVar) {
            this.f14773a.f14770t0 = false;
        }

        /* renamed from: d */
        public void mo15039d(C4309m mVar) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$d */
    /* compiled from: TvPlaybackActivity.kt */
    static final class C6525d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ TvPlaybackActivity f14774c;

        C6525d(TvPlaybackActivity tvPlaybackActivity) {
            this.f14774c = tvPlaybackActivity;
        }

        public final void onClick(View view) {
            this.f14774c.mo19195n().mo19157b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$e */
    /* compiled from: TvPlaybackActivity.kt */
    static final class C6526e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ TvPlaybackActivity f14775c;

        C6526e(TvPlaybackActivity tvPlaybackActivity) {
            this.f14775c = tvPlaybackActivity;
            super(0);
        }

        public final void invoke() {
            Group group = (Group) this.f14775c.mo19190d(C6327f.playerControls);
            Intrinsics.checkReturnedValueIsNotNull((Object) group, "playerControls");
            group.setVisibility(8);
            this.f14775c.mo19192k().mo7537b().mo16970S0();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$f */
    /* compiled from: TvPlaybackActivity.kt */
    public static final class C6527f implements C6296b {

        /* renamed from: a */
        final /* synthetic */ TvPlaybackActivity f14776a;

        C6527f(TvPlaybackActivity tvPlaybackActivity) {
            this.f14776a = tvPlaybackActivity;
        }

        /* renamed from: a */
        public void mo18911a() {
            this.f14776a.mo19191j().mo19030b();
            this.f14776a.finish();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$g */
    /* compiled from: TvPlaybackActivity.kt */
    static final class C6528g implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ TvPlaybackActivity f14777c;

        C6528g(TvPlaybackActivity tvPlaybackActivity) {
            this.f14777c = tvPlaybackActivity;
        }

        public final void onClick(View view) {
            this.f14777c.mo19194m().mo19152b();
            this.f14777c.mo19193l().mo19034a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$h */
    /* compiled from: TvPlaybackActivity.kt */
    static final class C6529h extends C12881k implements Function1<C6336a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ TvPlaybackActivity f14778c;

        C6529h(TvPlaybackActivity tvPlaybackActivity) {
            this.f14778c = tvPlaybackActivity;
            super(1);
        }

        /* renamed from: a */
        public final void mo19202a(C6336a aVar) {
            this.f14778c.mo19188a(aVar);
            TvPlaybackActivity.m20297a(this.f14778c).mo19220a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19202a((C6336a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TvUpNextComponent m20297a(TvPlaybackActivity tvPlaybackActivity) {
        TvUpNextComponent tvUpNextComponent = tvPlaybackActivity.f14768r0;
        if (tvUpNextComponent != null) {
            return tvUpNextComponent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("upNextComponent");
        throw null;
    }

    /* renamed from: o */
    private final void m20302o() {
        C4265b bVar = new C4265b();
        bVar.mo15085a((C4315f) new C6523b(this));
        C4317o.m14847a((ConstraintLayout) mo19190d(C6327f.rootView), bVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo19190d(C6327f.rootView);
        Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "rootView");
        View a = C4121a0.m14116a(constraintLayout, 0);
        C0425d dVar = new C0425d();
        dVar.mo2430c((ConstraintLayout) mo19190d(C6327f.rootView));
        ExoSurfaceView exoSurfaceView = (ExoSurfaceView) mo19190d(C6327f.videoView);
        String str = "videoView";
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView, str);
        dVar.mo2412a(exoSurfaceView.getId(), 7, 0);
        ExoSurfaceView exoSurfaceView2 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView2, str);
        dVar.mo2412a(exoSurfaceView2.getId(), 4, 0);
        ExoSurfaceView exoSurfaceView3 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView3, str);
        dVar.mo2429c(exoSurfaceView3.getId(), 0);
        ExoSurfaceView exoSurfaceView4 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView4, str);
        dVar.mo2425b(exoSurfaceView4.getId(), 0);
        ExoSurfaceView exoSurfaceView5 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView5, str);
        dVar.mo2413a(exoSurfaceView5.getId(), 6, 0, 6);
        ExoSurfaceView exoSurfaceView6 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView6, str);
        dVar.mo2413a(exoSurfaceView6.getId(), 3, 0, 3);
        dVar.mo2432d(a.getId(), 8);
        dVar.mo2427b((ConstraintLayout) mo19190d(C6327f.rootView));
        ExoSurfaceView exoSurfaceView7 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView7, str);
        exoSurfaceView7.setForeground(null);
        ExoSurfaceView exoSurfaceView8 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView8, str);
        exoSurfaceView8.setFocusable(false);
        ((ExoSurfaceView) mo19190d(C6327f.videoView)).setOnClickListener(null);
    }

    /* renamed from: p */
    private final void m20303p() {
        C4265b bVar = new C4265b();
        bVar.mo15085a((C4315f) new C6524c(this));
        C4317o.m14847a((ConstraintLayout) mo19190d(C6327f.rootView), bVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo19190d(C6327f.rootView);
        Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "rootView");
        View a = C4121a0.m14116a(constraintLayout, 0);
        C0425d dVar = new C0425d();
        dVar.mo2430c((ConstraintLayout) mo19190d(C6327f.rootView));
        ExoSurfaceView exoSurfaceView = (ExoSurfaceView) mo19190d(C6327f.videoView);
        String str = "videoView";
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView, str);
        dVar.mo2411a(exoSurfaceView.getId(), 6);
        ExoSurfaceView exoSurfaceView2 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView2, str);
        dVar.mo2411a(exoSurfaceView2.getId(), 3);
        ExoSurfaceView exoSurfaceView3 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView3, str);
        dVar.mo2412a(exoSurfaceView3.getId(), 7, (int) getResources().getDimension(C6325d.up_next_video_view_end_margin_post_play));
        ExoSurfaceView exoSurfaceView4 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView4, str);
        dVar.mo2412a(exoSurfaceView4.getId(), 4, (int) getResources().getDimension(C6325d.up_next_video_view_bottom_margin_post_play));
        ExoSurfaceView exoSurfaceView5 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView5, str);
        dVar.mo2429c(exoSurfaceView5.getId(), (int) getResources().getDimension(C6325d.up_next_video_view_width));
        ExoSurfaceView exoSurfaceView6 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView6, str);
        dVar.mo2425b(exoSurfaceView6.getId(), (int) getResources().getDimension(C6325d.up_next_video_view_height));
        dVar.mo2432d(a.getId(), 0);
        dVar.mo2427b((ConstraintLayout) mo19190d(C6327f.rootView));
        ExoSurfaceView exoSurfaceView7 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView7, str);
        exoSurfaceView7.setForeground(getDrawable(C6326e.up_next_focusable_border));
        ExoSurfaceView exoSurfaceView8 = (ExoSurfaceView) mo19190d(C6327f.videoView);
        Intrinsics.checkReturnedValueIsNotNull((Object) exoSurfaceView8, str);
        exoSurfaceView8.setFocusable(true);
        ((ExoSurfaceView) mo19190d(C6327f.videoView)).setOnClickListener(new C6525d(this));
    }

    /* renamed from: q */
    private final void m20304q() {
        SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14769s0;
        if (sDK4ExoPlaybackEngine != null) {
            sDK4ExoPlaybackEngine.mo7537b().mo16970S0();
            C6561b bVar = new C6561b();
            C0538i supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkReturnedValueIsNotNull((Object) supportFragmentManager, "supportFragmentManager");
            bVar.show(supportFragmentManager, "audio & subtitles fragment");
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("engine");
        throw null;
    }

    /* renamed from: r */
    private final void m20305r() {
        if (getIntent().getBooleanExtra("maturityRank", false)) {
            m20301e(7001);
        } else {
            m20301e(7002);
        }
    }

    /* renamed from: d */
    public View mo19190d(int i) {
        if (this.f14771u0 == null) {
            this.f14771u0 = new HashMap();
        }
        View view = (View) this.f14771u0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14771u0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C6531b bVar = this.f14751a0;
        if (bVar != null) {
            SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14769s0;
            if (sDK4ExoPlaybackEngine != null) {
                bVar.mo19205a(sDK4ExoPlaybackEngine, keyEvent);
                return super.dispatchKeyEvent(keyEvent);
            }
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusHandler");
        throw null;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        C2378m mVar = new C2378m("Video Player", "Video Player", null, null, 12, null);
        return mVar;
    }

    /* renamed from: j */
    public final C6384c mo19191j() {
        C6384c cVar = this.f14767q0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("convivaSetup");
        throw null;
    }

    /* renamed from: k */
    public final SDK4ExoPlaybackEngine mo19192k() {
        SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14769s0;
        if (sDK4ExoPlaybackEngine != null) {
            return sDK4ExoPlaybackEngine;
        }
        Intrinsics.throwUninitializedPropertyAccessException("engine");
        throw null;
    }

    /* renamed from: l */
    public final C6391e mo19193l() {
        C6391e eVar = this.f14762l0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playbackAnalytics");
        throw null;
    }

    /* renamed from: m */
    public final C6495c mo19194m() {
        C6495c cVar = this.f14761k0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trackListeners");
        throw null;
    }

    /* renamed from: n */
    public final C6497e mo19195n() {
        C6497e eVar = this.f14757g0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("upNextListeners");
        throw null;
    }

    public void onBackPressed() {
        SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14769s0;
        if (sDK4ExoPlaybackEngine != null) {
            sDK4ExoPlaybackEngine.mo7543h();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r11 != null) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            android.view.Window r11 = r10.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r11.setFlags(r0, r0)
            int r11 = com.bamtechmedia.dominguez.playback.C6329h.activity_tv_video_playback
            r10.setContentView(r11)
            com.bamtechmedia.dominguez.playback.m.m.a r11 = r10.f14750Z
            r0 = 0
            if (r11 == 0) goto L_0x0133
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r11 = r11.mo19071a()
            r10.f14769s0 = r11
            com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder r11 = r10.f14755e0
            java.lang.String r1 = "backgroundResponder"
            if (r11 == 0) goto L_0x012f
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r2 = r10.f14769s0
            java.lang.String r3 = "engine"
            if (r2 == 0) goto L_0x012b
            r11.mo18873a(r2)
            com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$a r11 = com.bamtechmedia.dominguez.playback.ScreenSaverBlocker.f14302W
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r2 = r10.f14769s0
            if (r2 == 0) goto L_0x0127
            r11.mo18846a(r10, r2)
            com.bamtechmedia.dominguez.playback.common.receiver.HdmiBroadcastReceiver$a r11 = com.bamtechmedia.dominguez.playback.common.receiver.HdmiBroadcastReceiver.f14366V
            com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$f r2 = new com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$f
            r2.<init>(r10)
            r11.mo18910a(r10, r2)
            androidx.lifecycle.i r11 = r10.getLifecycle()
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r2 = r10.f14769s0
            if (r2 == 0) goto L_0x0123
            r11.mo4134a(r2)
            com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder r2 = r10.f14755e0
            if (r2 == 0) goto L_0x011f
            r11.mo4134a(r2)
            com.bamtechmedia.dominguez.playback.mobile.LocalBookmarksMarker r1 = r10.f14763m0
            if (r1 == 0) goto L_0x0119
            r11.mo4134a(r1)
            com.bamtechmedia.dominguez.playback.m.m.f.a r11 = r10.f14765o0
            if (r11 == 0) goto L_0x0113
            androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_DESTROY
            com.uber.autodispose.android.lifecycle.b r1 = com.uber.autodispose.android.lifecycle.C10541b.m33255a(r10, r1)
            java.lang.String r2 = "AndroidLifecycleScopePro…om(\n    this, untilEvent)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            r11.mo19086a(r1)
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r1 = "playable"
            android.os.Parcelable r11 = r11.getParcelableExtra(r1)
            r6 = r11
            com.bamtechmedia.dominguez.core.content.o r6 = (com.bamtechmedia.dominguez.core.content.C3693o) r6
            if (r6 == 0) goto L_0x007f
            java.lang.String r11 = r6.mo12903f()
            if (r11 == 0) goto L_0x007f
            goto L_0x0089
        L_0x007f:
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r1 = "contentId"
            java.lang.String r11 = r11.getStringExtra(r1)
        L_0x0089:
            java.lang.String r1 = "Neither Playable nor contentId provided"
            com.bamtechmedia.dominguez.core.utils.C5884x.m18950a(r11, r1)
            r7 = r11
            java.lang.String r7 = (java.lang.String) r7
            com.bamtechmedia.dominguez.playback.m.f r4 = r10.f14749Y
            if (r4 == 0) goto L_0x010d
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r5 = r10.f14769s0
            if (r5 == 0) goto L_0x0109
            if (r6 != 0) goto L_0x009e
            r11 = 1
            r8 = 1
            goto L_0x00a0
        L_0x009e:
            r11 = 0
            r8 = 0
        L_0x00a0:
            r9 = 0
            r4.mo18987a(r5, r6, r7, r8, r9)
            int r11 = com.bamtechmedia.dominguez.playback.C6327f.subTitleIconImage
            android.view.View r11 = r10.mo19190d(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$g r1 = new com.bamtechmedia.dominguez.playback.tv.TvPlaybackActivity$g
            r1.<init>(r10)
            r11.setOnClickListener(r1)
            int r11 = com.bamtechmedia.dominguez.playback.C6327f.rootView
            android.view.View r11 = r10.mo19190d(r11)
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            java.lang.String r1 = "rootView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r11, r1)
            r10.m20298a(r11)
            com.bamtechmedia.dominguez.playback.m.i.a r11 = r10.f14766p0
            if (r11 == 0) goto L_0x0103
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r1 = r10.f14769s0
            if (r1 == 0) goto L_0x00ff
            int r4 = com.bamtechmedia.dominguez.playback.C6327f.playPauseButton
            android.view.View r4 = r10.mo19190d(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r11.mo19017a(r1, r4)
            com.bamtechmedia.dominguez.playback.m.n.b r11 = r10.f14764n0
            if (r11 == 0) goto L_0x00f9
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r1 = r10.f14769s0
            if (r1 == 0) goto L_0x00f5
            g.d.b.m r0 = r1.mo7537b()
            java.lang.String r1 = "engine.events"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_DESTROY
            com.uber.autodispose.android.lifecycle.b r1 = com.uber.autodispose.android.lifecycle.C10541b.m33255a(r10, r1)
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            r11.mo19102a(r0, r1)
            return
        L_0x00f5:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            throw r0
        L_0x00f9:
            java.lang.String r11 = "errorHandler"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            throw r0
        L_0x00ff:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            throw r0
        L_0x0103:
            java.lang.String r11 = "playPauseAccessibility"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            throw r0
        L_0x0109:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            throw r0
        L_0x010d:
            java.lang.String r11 = "viewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            throw r0
        L_0x0113:
            java.lang.String r11 = "sentryCapabilitiesReporter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            throw r0
        L_0x0119:
            java.lang.String r11 = "localBookmarksMarker"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            throw r0
        L_0x011f:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r0
        L_0x0123:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            throw r0
        L_0x0127:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            throw r0
        L_0x012b:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            throw r0
        L_0x012f:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r0
        L_0x0133:
            java.lang.String r11 = "engineFactory"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p254tv.TvPlaybackActivity.onCreate(android.os.Bundle):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C6495c cVar = this.f14761k0;
        if (cVar != null) {
            cVar.mo19153c();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("trackListeners");
            throw null;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14769s0;
        if (sDK4ExoPlaybackEngine != null) {
            sDK4ExoPlaybackEngine.mo7536a(motionEvent);
            return super.onGenericMotionEvent(motionEvent);
        }
        Intrinsics.throwUninitializedPropertyAccessException("engine");
        throw null;
    }

    public void onShow(DialogInterface dialogInterface) {
        C6495c cVar = this.f14761k0;
        if (cVar != null) {
            cVar.mo19151a();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("trackListeners");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C6531b bVar = this.f14751a0;
        if (bVar != null) {
            C6342f fVar = this.f14749Y;
            String str = "viewModel";
            if (fVar != null) {
                bVar.mo19203a(fVar, (C0722m) this);
                C6342f fVar2 = this.f14749Y;
                if (fVar2 != null) {
                    C5755i.m18679a(this, fVar2, null, null, new C6529h(this), 6, null);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusHandler");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14769s0;
        if (sDK4ExoPlaybackEngine != null) {
            sDK4ExoPlaybackEngine.mo7539d().mo7611b();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("engine");
            throw null;
        }
    }

    /* renamed from: e */
    private final void m20301e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("unable to play content: resultCode = ");
        sb.append(i);
        Timber.m44526b(sb.toString(), new Object[0]);
        setResult(i);
        finish();
    }

    /* renamed from: a */
    private final void m20298a(ViewGroup viewGroup) {
        C6497e eVar = this.f14757g0;
        if (eVar != null) {
            C6410j jVar = this.f14758h0;
            if (jVar != null) {
                C3572r0 r0Var = this.f14756f0;
                if (r0Var != null) {
                    C3716q qVar = this.f14759i0;
                    if (qVar != null) {
                        C3850c cVar = this.f14760j0;
                        if (cVar != null) {
                            TvUpNextComponent tvUpNextComponent = new TvUpNextComponent(viewGroup, eVar, jVar, r0Var, qVar, cVar, new C6526e(this));
                            this.f14768r0 = tvUpNextComponent;
                            C0715i lifecycle = getLifecycle();
                            TvUpNextComponent tvUpNextComponent2 = this.f14768r0;
                            if (tvUpNextComponent2 != null) {
                                lifecycle.mo4134a(tvUpNextComponent2);
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("upNextComponent");
                                throw null;
                            }
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("titleTreatment");
                            throw null;
                        }
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("ratingFormatter");
                        throw null;
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("stringDictionary");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("upNextAnalytics");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("upNextListeners");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo19188a(C6336a aVar) {
        if (aVar.mo18954c() == null) {
            C6342f fVar = this.f14749Y;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                throw null;
            } else if (fVar.mo18989z()) {
                m20305r();
                return;
            }
        }
        if (aVar.mo18956e() != null) {
            C6448b bVar = this.f14764n0;
            if (bVar != null) {
                bVar.mo19103a(aVar.mo18956e());
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("errorHandler");
                throw null;
            }
        } else if (aVar.mo18952a()) {
            m20299a(aVar.mo18960h());
        } else if (aVar.mo18954c() == null) {
            finish();
        } else {
            String str = "focusHandler";
            if (aVar.mo18963j() instanceof C6506e) {
                C6531b bVar2 = this.f14751a0;
                if (bVar2 != null) {
                    bVar2.mo19204a();
                    if (!this.f14770t0) {
                        m20303p();
                        return;
                    }
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            } else if (aVar.mo18963j() instanceof C6503b) {
                if (!this.f14770t0) {
                    m20302o();
                }
                C6531b bVar3 = this.f14751a0;
                if (bVar3 != null) {
                    bVar3.mo19206b();
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            } else if (aVar.mo18962i() instanceof C6322b) {
                m20304q();
            } else if (aVar.mo18953b() instanceof C6290e) {
                mo19187a(aVar.mo18953b());
            } else if (aVar.mo18953b() instanceof C6286a) {
                mo19189a(false);
            } else if (aVar.mo18953b() instanceof C6288c) {
                mo19189a(true);
            } else {
                mo19186a(aVar.mo18954c());
            }
        }
    }

    /* renamed from: a */
    public final void mo19186a(C3693o oVar) {
        C6414a aVar = this.f14752b0;
        if (aVar != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo19190d(C6327f.topBarContainer);
            Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "topBarContainer");
            TextView textView = (TextView) mo19190d(C6327f.parentTitle);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "parentTitle");
            TextView textView2 = (TextView) mo19190d(C6327f.seriesTitle);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "seriesTitle");
            C6415a aVar2 = new C6415a(constraintLayout, textView, textView2, null, null, 24, null);
            aVar.mo19061a(oVar, aVar2);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currentContentUpdates");
        throw null;
    }

    /* renamed from: a */
    public final void mo19187a(C6285b bVar) {
        C6290e eVar = (C6290e) bVar;
        if (eVar.mo18893b().mo13265g() != null) {
            ContentRatingPresenter contentRatingPresenter = this.f14753c0;
            if (contentRatingPresenter != null) {
                C3693o b = eVar.mo18893b();
                TextView textView = (TextView) mo19190d(C6327f.ratingId);
                Intrinsics.checkReturnedValueIsNotNull((Object) textView, "ratingId");
                TextView textView2 = (TextView) mo19190d(C6327f.ratingAdvisory);
                Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "ratingAdvisory");
                LinearLayout linearLayout = (LinearLayout) mo19190d(C6327f.disclaimerContainer);
                Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, "disclaimerContainer");
                ConstraintLayout constraintLayout = (ConstraintLayout) mo19190d(C6327f.contentRatingParent);
                Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "contentRatingParent");
                C6280b bVar2 = new C6280b(textView, textView2, linearLayout, constraintLayout);
                int a = eVar.mo18892a().mo18891a();
                C6493a aVar = this.f14754d0;
                if (aVar != null) {
                    contentRatingPresenter.mo18879a(b, bVar2, a, aVar);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("contentRatingListeners");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("contentRatingPresenter");
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo19189a(boolean z) {
        ContentRatingPresenter contentRatingPresenter = this.f14753c0;
        String str = "contentRatingPresenter";
        if (contentRatingPresenter != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo19190d(C6327f.contentRatingParent);
            Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "contentRatingParent");
            contentRatingPresenter.mo18878a(constraintLayout);
            if (z) {
                ContentRatingPresenter contentRatingPresenter2 = this.f14753c0;
                if (contentRatingPresenter2 != null) {
                    contentRatingPresenter2.mo18880b();
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            } else {
                C6493a aVar = this.f14754d0;
                if (aVar != null) {
                    aVar.mo19148a();
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("contentRatingListeners");
                    throw null;
                }
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        if (i != C6327f.playback_error_dialog) {
            return false;
        }
        finish();
        return true;
    }

    /* renamed from: a */
    private final void m20299a(C6337b bVar) {
        if ((bVar != null ? bVar.mo18968b() : null) != null) {
            Intent intent = new Intent();
            intent.putExtra("key_playable", bVar.mo18968b());
            intent.putExtra("key_tab", bVar.mo18967a());
            setResult(-1, intent);
        }
        finish();
    }
}
