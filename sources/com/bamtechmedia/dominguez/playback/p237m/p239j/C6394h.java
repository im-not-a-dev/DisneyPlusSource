package com.bamtechmedia.dominguez.playback.p237m.p239j;

import android.annotation.SuppressLint;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.core.content.C3693o;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.p182d0.C4946g;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/analytics/PlayerAnalytics;", "", "analytics", "Lcom/bamtechmedia/dominguez/playback/common/analytics/PlaybackAnalytics;", "(Lcom/bamtechmedia/dominguez/playback/common/analytics/PlaybackAnalytics;)V", "initAnalytics", "", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "trackClicks", "trackContentViewingStatusAndStartVideo", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "trackJumpForward", "trackPageLoad", "trackRebuffering", "trackScrubberClickDirections", "trackVideoTime", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"CheckResult", "RxLeakedSubscription"})
/* renamed from: com.bamtechmedia.dominguez.playback.m.j.h */
/* compiled from: PlayerAnalytics.kt */
public final class C6394h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6391e f14520a;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$a */
    /* compiled from: PlayerAnalytics.kt */
    static final class C6395a<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6394h f14521c;

        C6395a(C6394h hVar) {
            this.f14521c = hVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C6391e a = this.f14521c.f14520a;
            Intrinsics.checkReturnedValueIsNotNull((Object) bool, "it");
            a.mo19039a(bool.booleanValue());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$b */
    /* compiled from: PlayerAnalytics.kt */
    static final /* synthetic */ class C6396b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6396b f14522c = new C6396b();

        C6396b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19048a(Throwable th) {
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
            mo19048a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$c */
    /* compiled from: PlayerAnalytics.kt */
    static final class C6397c<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C6394h f14523c;

        C6397c(C6394h hVar) {
            this.f14523c = hVar;
        }

        public final void accept(Object obj) {
            this.f14523c.f14520a.mo19041b(true);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$d */
    /* compiled from: PlayerAnalytics.kt */
    static final /* synthetic */ class C6398d extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6398d f14524c = new C6398d();

        C6398d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19049a(Throwable th) {
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
            mo19049a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$e */
    /* compiled from: PlayerAnalytics.kt */
    static final class C6399e<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C6394h f14525c;

        C6399e(C6394h hVar) {
            this.f14525c = hVar;
        }

        public final void accept(Object obj) {
            this.f14525c.f14520a.mo19041b(false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$f */
    /* compiled from: PlayerAnalytics.kt */
    static final /* synthetic */ class C6400f extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6400f f14526c = new C6400f();

        C6400f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19050a(Throwable th) {
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
            mo19050a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$g */
    /* compiled from: PlayerAnalytics.kt */
    static final class C6401g<T> implements Consumer<C4946g<Object>> {

        /* renamed from: c */
        final /* synthetic */ C6394h f14527c;

        C6401g(C6394h hVar) {
            this.f14527c = hVar;
        }

        /* renamed from: a */
        public final void accept(C4946g<Object> gVar) {
            this.f14527c.f14520a.mo19043d();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$h */
    /* compiled from: PlayerAnalytics.kt */
    static final /* synthetic */ class C6402h extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6402h f14528c = new C6402h();

        C6402h() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19052a(Throwable th) {
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
            mo19052a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$i */
    /* compiled from: PlayerAnalytics.kt */
    static final class C6403i<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C6394h f14529c;

        C6403i(C6394h hVar) {
            this.f14529c = hVar;
        }

        public final void accept(Object obj) {
            this.f14529c.f14520a.mo19038a("Forward");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$j */
    /* compiled from: PlayerAnalytics.kt */
    static final /* synthetic */ class C6404j extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6404j f14530c = new C6404j();

        C6404j() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19053a(Throwable th) {
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
            mo19053a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$k */
    /* compiled from: PlayerAnalytics.kt */
    static final class C6405k<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C6394h f14531c;

        C6405k(C6394h hVar) {
            this.f14531c = hVar;
        }

        public final void accept(Object obj) {
            this.f14531c.f14520a.mo19038a("Rewind");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$l */
    /* compiled from: PlayerAnalytics.kt */
    static final /* synthetic */ class C6406l extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6406l f14532c = new C6406l();

        C6406l() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19054a(Throwable th) {
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
            mo19054a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$m */
    /* compiled from: PlayerAnalytics.kt */
    static final class C6407m<T> implements Consumer<Integer> {

        /* renamed from: c */
        final /* synthetic */ C6394h f14533c;

        C6407m(C6394h hVar) {
            this.f14533c = hVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            C6391e a = this.f14533c.f14520a;
            Intrinsics.checkReturnedValueIsNotNull((Object) num, "it");
            a.mo19035a(num.intValue());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.j.h$n */
    /* compiled from: PlayerAnalytics.kt */
    static final /* synthetic */ class C6408n extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6408n f14534c = new C6408n();

        C6408n() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19056a(Throwable th) {
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
            mo19056a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C6394h(C6391e eVar) {
        this.f14520a = eVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bamtechmedia.dominguez.playback.m.j.h$b, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.j.g] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20041b(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r4) {
        /*
            r3 = this;
            g.d.b.m r4 = r4.mo7537b()
            g.d.b.l r4 = r4.mo17030f()
            io.reactivex.Observable r4 = r4.mo16904h()
            com.bamtechmedia.dominguez.playback.m.j.h$a r0 = new com.bamtechmedia.dominguez.playback.m.j.h$a
            r0.<init>(r3)
            com.bamtechmedia.dominguez.playback.m.j.h$b r1 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.C6396b.f14522c
            if (r1 == 0) goto L_0x001b
            com.bamtechmedia.dominguez.playback.m.j.g r2 = new com.bamtechmedia.dominguez.playback.m.j.g
            r2.<init>(r1)
            r1 = r2
        L_0x001b:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r4.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.m20041b(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.playback.m.j.h$d] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.playback.m.j.h$f] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.bamtechmedia.dominguez.playback.m.j.g] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.playback.m.j.g] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20042c(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r5) {
        /*
            r4 = this;
            g.d.b.m r0 = r5.mo7537b()
            io.reactivex.Observable r0 = r0.mo16949I()
            com.bamtechmedia.dominguez.playback.m.j.h$c r1 = new com.bamtechmedia.dominguez.playback.m.j.h$c
            r1.<init>(r4)
            com.bamtechmedia.dominguez.playback.m.j.h$d r2 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.C6398d.f14524c
            if (r2 == 0) goto L_0x0017
            com.bamtechmedia.dominguez.playback.m.j.g r3 = new com.bamtechmedia.dominguez.playback.m.j.g
            r3.<init>(r2)
            r2 = r3
        L_0x0017:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo30157a(r1, r2)
            g.d.b.m r5 = r5.mo7537b()
            io.reactivex.Observable r5 = r5.mo16947H()
            com.bamtechmedia.dominguez.playback.m.j.h$e r0 = new com.bamtechmedia.dominguez.playback.m.j.h$e
            r0.<init>(r4)
            com.bamtechmedia.dominguez.playback.m.j.h$f r1 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.C6400f.f14526c
            if (r1 == 0) goto L_0x0033
            com.bamtechmedia.dominguez.playback.m.j.g r2 = new com.bamtechmedia.dominguez.playback.m.j.g
            r2.<init>(r1)
            r1 = r2
        L_0x0033:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r5.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.m20042c(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bamtechmedia.dominguez.playback.m.j.h$h, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.j.g] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20043d(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r4) {
        /*
            r3 = this;
            g.d.b.m r4 = r4.mo7537b()
            io.reactivex.Observable r4 = r4.mo17034f0()
            com.bamtechmedia.dominguez.playback.m.j.h$g r0 = new com.bamtechmedia.dominguez.playback.m.j.h$g
            r0.<init>(r3)
            com.bamtechmedia.dominguez.playback.m.j.h$h r1 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.C6402h.f14528c
            if (r1 == 0) goto L_0x0017
            com.bamtechmedia.dominguez.playback.m.j.g r2 = new com.bamtechmedia.dominguez.playback.m.j.g
            r2.<init>(r1)
            r1 = r2
        L_0x0017:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r4.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.m20043d(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.j.h$j, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bamtechmedia.dominguez.playback.m.j.h$l, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.bamtechmedia.dominguez.playback.m.j.g] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.playback.m.j.g] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20044e(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r5) {
        /*
            r4 = this;
            g.d.b.m r0 = r5.mo7537b()
            io.reactivex.Observable r0 = r0.mo17063q0()
            com.bamtechmedia.dominguez.playback.m.j.h$i r1 = new com.bamtechmedia.dominguez.playback.m.j.h$i
            r1.<init>(r4)
            com.bamtechmedia.dominguez.playback.m.j.h$j r2 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.C6404j.f14530c
            if (r2 == 0) goto L_0x0017
            com.bamtechmedia.dominguez.playback.m.j.g r3 = new com.bamtechmedia.dominguez.playback.m.j.g
            r3.<init>(r2)
            r2 = r3
        L_0x0017:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo30157a(r1, r2)
            g.d.b.m r5 = r5.mo7537b()
            io.reactivex.Observable r5 = r5.mo17061p0()
            com.bamtechmedia.dominguez.playback.m.j.h$k r0 = new com.bamtechmedia.dominguez.playback.m.j.h$k
            r0.<init>(r4)
            com.bamtechmedia.dominguez.playback.m.j.h$l r1 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.C6406l.f14532c
            if (r1 == 0) goto L_0x0033
            com.bamtechmedia.dominguez.playback.m.j.g r2 = new com.bamtechmedia.dominguez.playback.m.j.g
            r2.<init>(r1)
            r1 = r2
        L_0x0033:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r5.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.m20044e(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bamtechmedia.dominguez.playback.m.j.h$n, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.j.g] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20045f(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r4) {
        /*
            r3 = this;
            g.d.b.m r4 = r4.mo7537b()
            io.reactivex.Observable r4 = r4.mo16980Z()
            com.bamtechmedia.dominguez.playback.m.j.h$m r0 = new com.bamtechmedia.dominguez.playback.m.j.h$m
            r0.<init>(r3)
            com.bamtechmedia.dominguez.playback.m.j.h$n r1 = com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.C6408n.f14534c
            if (r1 == 0) goto L_0x0017
            com.bamtechmedia.dominguez.playback.m.j.g r2 = new com.bamtechmedia.dominguez.playback.m.j.g
            r2.<init>(r1)
            r1 = r2
        L_0x0017:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r4.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h.m20045f(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }

    /* renamed from: a */
    public final void mo19045a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine) {
        m20041b(sDK4ExoPlaybackEngine);
        m20044e(sDK4ExoPlaybackEngine);
        m20042c(sDK4ExoPlaybackEngine);
        m20043d(sDK4ExoPlaybackEngine);
        m20045f(sDK4ExoPlaybackEngine);
        this.f14520a.mo19040b();
    }

    /* renamed from: a */
    public final void mo19044a() {
        this.f14520a.mo19042c();
    }

    /* renamed from: a */
    public final void mo19046a(C3693o oVar) {
        this.f14520a.mo19037a(oVar, "Online");
    }
}
