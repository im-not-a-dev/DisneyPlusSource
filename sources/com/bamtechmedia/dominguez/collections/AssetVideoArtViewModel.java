package com.bamtechmedia.dominguez.collections;

import android.app.Application;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.lifecycle.C0702a;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.collections.C3317e.C3318a;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.google.android.exoplayer2.C8729j0;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.C9612x;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p391ui.PlayerView;
import com.google.android.exoplayer2.source.C9259w;
import com.google.android.exoplayer2.source.C9259w.C9262c;
import com.google.android.exoplayer2.source.C9266z;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.C9515r;
import com.google.android.exoplayer2.upstream.cache.C9465e;
import com.google.android.exoplayer2.upstream.cache.C9483r;
import com.google.android.exoplayer2.upstream.cache.C9484s;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.File;
import kotlin.C13145v;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p096e.p121h.p135s.C4127b0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J(\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016J@\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016J\b\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0002J\u001e\u0010(\u001a\u00020\u00122\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010*\u001a\u00020\u0012H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/AssetVideoArtViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/bamtechmedia/dominguez/collections/AssetVideoArtHandler;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "currentView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "hasHeroCollectionStarted", "", "mediaSourceFactory", "Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;", "getMediaSourceFactory", "()Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;", "mediaSourceFactory$delegate", "Lkotlin/Lazy;", "playbackEndAction", "Lkotlin/Function0;", "", "playbackStartAction", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "storedPosition", "", "uri", "Landroid/net/Uri;", "attachHeroCollection", "view", "videoArt", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "attachVideoArt", "loop", "createPlayer", "onPause", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onResume", "onStart", "onStop", "releasePlayer", "startPlayback", "playerView", "stopPlayback", "Companion", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AssetVideoArtViewModel.kt */
public final class AssetVideoArtViewModel extends C0702a implements C3317e {

    /* renamed from: c0 */
    static final /* synthetic */ KProperty[] f8301c0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(AssetVideoArtViewModel.class), "mediaSourceFactory", "getMediaSourceFactory()Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;"))};
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static Cache f8302d0;

    /* renamed from: U */
    private final Lazy f8303U;

    /* renamed from: V */
    private SimpleExoPlayer f8304V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public PlayerView f8305W;

    /* renamed from: X */
    private Uri f8306X;

    /* renamed from: Y */
    private long f8307Y;

    /* renamed from: Z */
    private boolean f8308Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Function0<C13145v> f8309a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public Function0<C13145v> f8310b0;

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetVideoArtViewModel$a */
    /* compiled from: AssetVideoArtViewModel.kt */
    public static final class C3277a {
        private C3277a() {
        }

        public /* synthetic */ C3277a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetVideoArtViewModel$b */
    /* compiled from: AssetVideoArtViewModel.kt */
    public static final class C3278b implements EventListener {

        /* renamed from: c */
        final /* synthetic */ AssetVideoArtViewModel f8311c;

        C3278b(AssetVideoArtViewModel assetVideoArtViewModel) {
            this.f8311c = assetVideoArtViewModel;
        }

        /* renamed from: a */
        public /* synthetic */ void mo7578a(boolean z) {
            C8729j0.m25320a((EventListener) this, z);
        }

        public /* synthetic */ void onLoadingChanged(boolean z) {
            C8729j0.m25323b((EventListener) this, z);
        }

        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C8729j0.m25317a((EventListener) this, playbackParameters);
        }

        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C8729j0.m25316a((EventListener) this, exoPlaybackException);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            if (i == 3) {
                Function0 c = this.f8311c.f8310b0;
                if (c != null) {
                    C13145v vVar = (C13145v) c.invoke();
                }
                PlayerView a = this.f8311c.f8305W;
                if (a != null && a.getVisibility() == 4) {
                    PlayerView a2 = this.f8311c.f8305W;
                    if (a2 != null) {
                        C4127b0.m14131b(a2, true);
                    }
                }
            } else if (i == 4) {
                Function0 b = this.f8311c.f8309a0;
                if (b != null) {
                    C13145v vVar2 = (C13145v) b.invoke();
                }
            }
        }

        public /* synthetic */ void onPositionDiscontinuity(int i) {
            C8729j0.m25315a((EventListener) this, i);
        }

        public /* synthetic */ void onRepeatModeChanged(int i) {
            C8729j0.m25322b((EventListener) this, i);
        }

        public /* synthetic */ void onSeekProcessed() {
            C8729j0.m25314a(this);
        }

        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            C8729j0.m25324c(this, z);
        }

        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C8729j0.m25318a(this, timeline, obj, i);
        }

        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C8729j0.m25319a((EventListener) this, trackGroupArray, trackSelectionArray);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetVideoArtViewModel$c */
    /* compiled from: AssetVideoArtViewModel.kt */
    static final class C3279c extends C12881k implements Function0<C9262c> {

        /* renamed from: U */
        final /* synthetic */ Application f8312U;

        /* renamed from: c */
        final /* synthetic */ AssetVideoArtViewModel f8313c;

        C3279c(AssetVideoArtViewModel assetVideoArtViewModel, Application application) {
            this.f8313c = assetVideoArtViewModel;
            this.f8312U = application;
            super(0);
        }

        public final C9262c invoke() {
            if (AssetVideoArtViewModel.f8302d0 == null) {
                AssetVideoArtViewModel.f8302d0 = new C9484s(new File(this.f8312U.getCacheDir(), "animationCache"), new C9483r());
            }
            return new C9262c(new C9465e(AssetVideoArtViewModel.f8302d0, new C9515r(this.f8313c.mo4111y(), "brandtiles")));
        }
    }

    static {
        new C3277a(null);
    }

    public AssetVideoArtViewModel(Application application) {
        super(application);
        this.f8303U = C12763i.m39921a(new C3279c(this, application));
    }

    /* renamed from: A */
    private final SimpleExoPlayer m11307A() {
        SimpleExoPlayer b = C9612x.m29761b(mo4111y());
        b.addListener(new C3278b(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "ExoPlayerFactory.newSimp…       }\n        })\n    }");
        return b;
    }

    /* renamed from: B */
    private final C9262c m11308B() {
        Lazy lazy = this.f8303U;
        KProperty kProperty = f8301c0[0];
        return (C9262c) lazy.getValue();
    }

    /* renamed from: C */
    private final void m11309C() {
        this.f8305W = null;
        SimpleExoPlayer o0Var = this.f8304V;
        this.f8307Y = o0Var != null ? o0Var.getCurrentPosition() : 0;
        SimpleExoPlayer o0Var2 = this.f8304V;
        if (o0Var2 != null) {
            o0Var2.mo7651k();
        }
        this.f8304V = null;
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: d */
    public void mo4129d(C0722m mVar) {
        if (VERSION.SDK_INT > 23) {
            PlayerView playerView = this.f8305W;
            if (playerView != null) {
                playerView.mo24272b();
            }
            m11309C();
        }
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        if (VERSION.SDK_INT > 23) {
            m11311a(this, (PlayerView) null, false, 3, (Object) null);
            PlayerView playerView = this.f8305W;
            if (playerView != null) {
                playerView.mo24273c();
            }
        }
    }

    /* renamed from: c */
    public void mo12322c() {
        SimpleExoPlayer o0Var = this.f8304V;
        if (o0Var != null) {
            o0Var.stop(true);
        }
    }

    /* renamed from: a */
    public void mo12321a(PlayerView playerView, C3680n nVar, boolean z, Function0<C13145v> function0, Function0<C13145v> function02) {
        this.f8310b0 = function0;
        this.f8309a0 = function02;
        this.f8306X = Uri.parse(nVar.getUrl());
        this.f8307Y = 0;
        m11312a(playerView, z);
    }

    /* renamed from: c */
    public void mo4128c(C0722m mVar) {
        if (VERSION.SDK_INT <= 23) {
            PlayerView playerView = this.f8305W;
            if (playerView != null) {
                playerView.mo24272b();
            }
            m11309C();
        }
    }

    /* renamed from: a */
    public void mo12320a(PlayerView playerView, C3680n nVar, Function0<C13145v> function0) {
        if (!this.f8308Z) {
            this.f8308Z = true;
            C3318a.m11423a(this, playerView, nVar, false, null, function0, 12, null);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11311a(AssetVideoArtViewModel assetVideoArtViewModel, PlayerView playerView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            playerView = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        assetVideoArtViewModel.m11312a(playerView, z);
    }

    /* renamed from: a */
    private final void m11312a(PlayerView playerView, boolean z) {
        Uri uri = this.f8306X;
        if (uri != null) {
            if (playerView == null) {
                playerView = this.f8305W;
            }
            if (playerView != null) {
                SimpleExoPlayer o0Var = this.f8304V;
                if (o0Var == null) {
                    o0Var = m11307A();
                    this.f8304V = o0Var;
                }
                PlayerView.m28731a((Player) o0Var, this.f8305W, playerView);
                this.f8305W = playerView;
                C9259w a = m11308B().mo24004a(uri);
                if (z) {
                    o0Var.prepare(new C9266z(a));
                } else {
                    o0Var.prepare(a);
                }
                o0Var.setPlayWhenReady(true);
                o0Var.mo23043a(this.f8307Y);
                return;
            }
            m11309C();
            return;
        }
        m11309C();
    }

    /* renamed from: a */
    public void mo4126a(C0722m mVar) {
        if (VERSION.SDK_INT <= 23) {
            m11311a(this, (PlayerView) null, false, 3, (Object) null);
            PlayerView playerView = this.f8305W;
            if (playerView != null) {
                playerView.mo24273c();
            }
        }
    }
}
