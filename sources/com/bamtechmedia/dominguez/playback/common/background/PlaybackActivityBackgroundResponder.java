package com.bamtechmedia.dominguez.playback.common.background;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0722m;
import com.bamtech.player.exo.p041i.C1713d;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.core.background.BackgroundResponder;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.playback.p236l.C6333a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5273h;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\r\u0010\u001f\u001a\u00020\u0018H\u0001¢\u0006\u0002\b R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/background/PlaybackActivityBackgroundResponder;", "Lcom/bamtechmedia/dominguez/core/background/BackgroundResponder;", "activity", "Landroidx/fragment/app/FragmentActivity;", "appPresence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "mainActivityIntentFactory", "Lcom/bamtechmedia/dominguez/playback/api/MainActivityIntentFactory;", "playerView", "Lcom/bamtech/player/AbstractPlayerView;", "convivaSetup", "Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaSetup;", "(Landroidx/fragment/app/FragmentActivity;Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;Lcom/bamtechmedia/dominguez/playback/api/MainActivityIntentFactory;Lcom/bamtech/player/AbstractPlayerView;Lcom/bamtechmedia/dominguez/playback/common/analytics/ConvivaSetup;)V", "getAppPresence", "()Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "bufferingDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "getEngine", "()Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "setEngine", "(Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;)V", "onDestroy", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "processPresence", "presence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi$AppPresenceResponse;", "routeToTargetOriginPage", "showControlsWhenBufferingIsComplete", "showControlsWhenBufferingIsComplete$playback_release", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackActivityBackgroundResponder.kt */
public final class PlaybackActivityBackgroundResponder extends BackgroundResponder {

    /* renamed from: U */
    public SDK4ExoPlaybackEngine f14328U;

    /* renamed from: V */
    private final CompositeDisposable f14329V = new CompositeDisposable();

    /* renamed from: W */
    private final C0532d f14330W;

    /* renamed from: X */
    private final C5765a f14331X;

    /* renamed from: Y */
    private final C6333a f14332Y;

    /* renamed from: Z */
    private final C5273h f14333Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C6384c f14334a0;

    /* renamed from: com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder$a */
    /* compiled from: PlaybackActivityBackgroundResponder.kt */
    static final class C6275a<T> implements C11952h<Boolean> {

        /* renamed from: c */
        public static final C6275a f14335c = new C6275a();

        C6275a() {
        }

        /* renamed from: a */
        public final boolean test(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder$b */
    /* compiled from: PlaybackActivityBackgroundResponder.kt */
    static final class C6276b<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ PlaybackActivityBackgroundResponder f14336c;

        C6276b(PlaybackActivityBackgroundResponder playbackActivityBackgroundResponder) {
            this.f14336c = playbackActivityBackgroundResponder;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C1713d a = this.f14336c.f14334a0.mo19027a();
            if (a != null) {
                a.mo7668k(true);
            }
            C1713d a2 = this.f14336c.f14334a0.mo19027a();
            if (a2 != null) {
                a2.mo7668k(false);
            }
            this.f14336c.mo18874d();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder$c */
    /* compiled from: PlaybackActivityBackgroundResponder.kt */
    static final /* synthetic */ class C6277c extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6277c f14337c = new C6277c();

        C6277c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18877a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18877a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public PlaybackActivityBackgroundResponder(C0532d dVar, C5765a aVar, C6333a aVar2, C5273h hVar, C6384c cVar) {
        this.f14330W = dVar;
        this.f14331X = aVar;
        this.f14332Y = aVar2;
        this.f14333Z = hVar;
        this.f14334a0 = cVar;
    }

    /* renamed from: e */
    private final void m19793e() {
        this.f14330W.startActivity(this.f14332Y.mo18747a(this.f14330W, "restart"));
    }

    /* renamed from: b */
    public C5765a mo11410b() {
        return this.f14331X;
    }

    /* renamed from: d */
    public final void mo18874d() {
        View d = this.f14333Z.mo16809d();
        Context context = d != null ? d.getContext() : null;
        if (context != null && !C5837i.m18843e(context)) {
            SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine = this.f14328U;
            if (sDK4ExoPlaybackEngine != null) {
                sDK4ExoPlaybackEngine.mo7537b().mo16972T0();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("engine");
                throw null;
            }
        }
        if (d != null) {
            d.requestFocus();
        }
    }

    /* renamed from: a */
    public final void mo18873a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine) {
        this.f14328U = sDK4ExoPlaybackEngine;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder$c, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.playback.common.background.a] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11409a(com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5768b
            r1 = 0
            java.lang.String r2 = "engine"
            if (r0 == 0) goto L_0x0042
            io.reactivex.disposables.CompositeDisposable r5 = r4.f14329V
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r0 = r4.f14328U
            if (r0 == 0) goto L_0x003e
            g.d.b.m r0 = r0.mo7537b()
            io.reactivex.Observable r0 = r0.mo17014b0()
            r1 = 1
            io.reactivex.Observable r0 = r0.mo30175c(r1)
            com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder$a r1 = com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder.C6275a.f14335c
            io.reactivex.Observable r0 = r0.mo30150a(r1)
            io.reactivex.Single r0 = r0.mo30186d()
            com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder$b r1 = new com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder$b
            r1.<init>(r4)
            com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder$c r2 = com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder.C6277c.f14337c
            if (r2 == 0) goto L_0x0034
            com.bamtechmedia.dominguez.playback.common.background.a r3 = new com.bamtechmedia.dominguez.playback.common.background.a
            r3.<init>(r2)
            r2 = r3
        L_0x0034:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            io.reactivex.disposables.Disposable r0 = r0.mo30214a(r1, r2)
            r5.mo30250b(r0)
            goto L_0x0082
        L_0x003e:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            throw r1
        L_0x0042:
            boolean r0 = r5 instanceof com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5767a
            if (r0 == 0) goto L_0x007b
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r5 = r4.f14328U
            if (r5 == 0) goto L_0x0077
            com.bamtech.sdk4.media.PlaybackSession r5 = r5.mo7814i()
            if (r5 == 0) goto L_0x0053
            r5.collectStreamSample()
        L_0x0053:
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r5 = r4.f14328U
            if (r5 == 0) goto L_0x0073
            g.d.b.w r5 = r5.mo7539d()
            r5.mo7611b()
            com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r5 = r4.f14328U
            if (r5 == 0) goto L_0x006f
            g.d.b.m r5 = r5.mo7537b()
            r5.mo16970S0()
            io.reactivex.disposables.CompositeDisposable r5 = r4.f14329V
            r5.mo30247a()
            goto L_0x0082
        L_0x006f:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            throw r1
        L_0x0073:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            throw r1
        L_0x0077:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            throw r1
        L_0x007b:
            boolean r5 = r5 instanceof com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5769c
            if (r5 == 0) goto L_0x0082
            r4.m19793e()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.background.PlaybackActivityBackgroundResponder.mo11409a(com.bamtechmedia.dominguez.core.lifecycle.a$a):void");
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        super.mo4130e(mVar);
        this.f14329V.mo30247a();
    }
}
