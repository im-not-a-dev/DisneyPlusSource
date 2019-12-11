package com.bamtechmedia.dominguez.playback.p254tv;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6342f;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p174d.p178b.C5273h;
import p163g.p174d.p178b.C5313o;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11844z;
import p520io.reactivex.C11957k;
import p520io.reactivex.C11969r;
import p520io.reactivex.Maybe;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J%\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/VideoPlaybackFocusHandler;", "", "playerView", "Lcom/bamtech/player/AbstractPlayerView;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtech/player/AbstractPlayerView;Lio/reactivex/Scheduler;)V", "registeredKeyCodes", "", "", "shouldDispatchEvents", "", "adjustControlsFocus", "", "visible", "disableControls", "enableControls", "handleDPadCenterPress", "Lcom/bamtech/player/PlayerView;", "keyCode", "processDPadEvents", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "event", "Landroid/view/KeyEvent;", "setupControlsListeners", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "viewModel", "Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "setupControlsListeners$playback_release", "setupControlsVisibilityCallbacks", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.b */
/* compiled from: VideoPlaybackFocusHandler.kt */
public final class C6531b {

    /* renamed from: a */
    private boolean f14779a = true;

    /* renamed from: b */
    private final Set<Integer> f14780b = C13186o0.m40524a(Integer.valueOf(23));

    /* renamed from: c */
    private final C5273h f14781c;

    /* renamed from: d */
    private final C11969r f14782d;

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.b$a */
    /* compiled from: VideoPlaybackFocusHandler.kt */
    static final class C6532a<T> implements Consumer<C6336a> {

        /* renamed from: c */
        final /* synthetic */ C6531b f14783c;

        C6532a(C6531b bVar) {
            this.f14783c = bVar;
        }

        /* renamed from: a */
        public final void accept(C6336a aVar) {
            this.f14783c.m20350a(aVar.mo18955d());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.b$b */
    /* compiled from: VideoPlaybackFocusHandler.kt */
    static final class C6533b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6533b f14784c = new C6533b();

        C6533b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44523a(th);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.b$c */
    /* compiled from: VideoPlaybackFocusHandler.kt */
    static final class C6534c<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6531b f14785c;

        C6534c(C6531b bVar) {
            this.f14785c = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C6531b bVar = this.f14785c;
            Intrinsics.checkReturnedValueIsNotNull((Object) bool, "it");
            bVar.m20354a(bool.booleanValue());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.b$d */
    /* compiled from: VideoPlaybackFocusHandler.kt */
    static final class C6535d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6535d f14786c = new C6535d();

        C6535d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44523a(th);
        }
    }

    public C6531b(C5273h hVar, C11969r rVar) {
        this.f14781c = hVar;
        this.f14782d = rVar;
    }

    /* renamed from: b */
    public final void mo19206b() {
        this.f14779a = true;
    }

    /* renamed from: a */
    public final Disposable mo19203a(C6342f fVar, C0722m mVar) {
        Maybe c = fVar.getState().mo30174c();
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "viewModel.state\n            .firstElement()");
        C10541b a = C10541b.m33255a(mVar, C0716a.ON_STOP);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a2 = c.mo30112a((C11957k<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        return ((C11844z) a2).mo29929a(new C6532a(this), C6533b.f14784c);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"RxLeakedSubscription"})
    /* renamed from: a */
    public final void m20350a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine) {
        sDK4ExoPlaybackEngine.mo7537b().mo17076x().mo30151a(this.f14782d).mo30157a((Consumer<? super T>) new C6534c<Object>(this), (Consumer<? super Throwable>) C6535d.f14786c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20354a(boolean z) {
        if (z) {
            View i = this.f14781c.mo16814i();
            if (i != null && !i.hasFocus()) {
                View K = this.f14781c.mo16805K();
                if (K != null && !K.hasFocus()) {
                    View d = this.f14781c.mo16809d();
                    if (d != null) {
                        d.requestFocus();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        View d2 = this.f14781c.mo16809d();
        if (d2 != null) {
            d2.clearFocus();
        }
        View h = this.f14781c.mo16813h();
        if (h != null) {
            h.clearFocus();
        }
        View F = this.f14781c.mo16800F();
        if (F != null) {
            F.clearFocus();
        }
    }

    /* renamed from: a */
    public final void mo19205a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, KeyEvent keyEvent) {
        if (this.f14779a && keyEvent != null) {
            if (keyEvent.getAction() == 0 && this.f14780b.contains(Integer.valueOf(keyEvent.getKeyCode()))) {
                m20353a((C5313o) this.f14781c, keyEvent.getKeyCode());
            }
            sDK4ExoPlaybackEngine.mo7535a(keyEvent);
        }
    }

    /* renamed from: a */
    public final void mo19204a() {
        this.f14779a = false;
    }

    /* renamed from: a */
    private final void m20353a(C5313o oVar, int i) {
        if (i == 23) {
            View d = oVar.mo16809d();
            if (d != null && !d.hasFocus() && d.getVisibility() != 0) {
                d.performClick();
            }
        }
    }
}
