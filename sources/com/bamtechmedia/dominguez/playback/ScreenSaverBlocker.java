package com.bamtechmedia.dominguez.playback;

import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0722m;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5280i;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.C11945a;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/ScreenSaverBlocker;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "activity", "Landroidx/fragment/app/FragmentActivity;", "player", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroidx/fragment/app/FragmentActivity;Lcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "onPlaybackChanged", "", "playing", "", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ScreenSaverBlocker.kt */
public final class ScreenSaverBlocker implements C0710d {

    /* renamed from: W */
    public static final C6262a f14302W = new C6262a(null);

    /* renamed from: U */
    private final C5326w f14303U;

    /* renamed from: V */
    private final C5300m f14304V;

    /* renamed from: c */
    private final C0532d f14305c;

    /* renamed from: com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$a */
    /* compiled from: ScreenSaverBlocker.kt */
    public static final class C6262a {
        private C6262a() {
        }

        /* renamed from: a */
        public final void mo18846a(C0532d dVar, C5280i iVar) {
            C0715i lifecycle = dVar.getLifecycle();
            C5326w d = iVar.mo7539d();
            Intrinsics.checkReturnedValueIsNotNull((Object) d, "engine.videoPlayer");
            C5300m b = iVar.mo7537b();
            Intrinsics.checkReturnedValueIsNotNull((Object) b, "engine.events");
            lifecycle.mo4134a(new ScreenSaverBlocker(dVar, d, b));
        }

        public /* synthetic */ C6262a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$b */
    /* compiled from: ScreenSaverBlocker.kt */
    static final class C6263b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ ScreenSaverBlocker f14306a;

        C6263b(ScreenSaverBlocker screenSaverBlocker) {
            this.f14306a = screenSaverBlocker;
        }

        public final void run() {
            this.f14306a.m19743a(false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$c */
    /* compiled from: ScreenSaverBlocker.kt */
    static final /* synthetic */ class C6264c extends C12879i implements Function1<Boolean, C13145v> {
        C6264c(ScreenSaverBlocker screenSaverBlocker) {
            super(1, screenSaverBlocker);
        }

        /* renamed from: a */
        public final void mo18847a(boolean z) {
            ((ScreenSaverBlocker) this.receiver).m19743a(z);
        }

        public final String getName() {
            return "onPlaybackChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(ScreenSaverBlocker.class);
        }

        public final String getSignature() {
            return "onPlaybackChanged(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18847a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$d */
    /* compiled from: ScreenSaverBlocker.kt */
    static final /* synthetic */ class C6265d extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6265d f14307c = new C6265d();

        C6265d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18848a(Throwable th) {
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
            mo18848a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public ScreenSaverBlocker(C0532d dVar, C5326w wVar, C5300m mVar) {
        this.f14305c = dVar;
        this.f14303U = wVar;
        this.f14304V = mVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$d, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.k] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4131f(androidx.lifecycle.C0722m r4) {
        /*
            r3 = this;
            g.d.b.m r0 = r3.f14304V
            io.reactivex.Observable r0 = r0.mo17014b0()
            g.d.b.w r1 = r3.f14303U
            boolean r1 = r1.mo7609a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            io.reactivex.Observable r0 = r0.mo30154a(r1)
            io.reactivex.Observable r0 = r0.mo30164b()
            com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$b r1 = new com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$b
            r1.<init>(r3)
            io.reactivex.Observable r0 = r0.mo30180c(r1)
            java.lang.String r1 = "events.onPlaybackChanged…nPlaybackChanged(false) }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_STOP
            com.uber.autodispose.android.lifecycle.b r4 = com.uber.autodispose.android.lifecycle.C10541b.m33255a(r4, r1)
            java.lang.String r1 = "AndroidLifecycleScopePro…om(\n    this, untilEvent)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r1)
            g.n.a.h r4 = p163g.p503n.p504a.C11793e.m37930a(r4)
            java.lang.Object r4 = r0.mo30161a(r4)
            java.lang.String r0 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r0)
            g.n.a.a0 r4 = (p163g.p503n.p504a.C11786a0) r4
            com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$c r0 = new com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$c
            r0.<init>(r3)
            com.bamtechmedia.dominguez.playback.k r1 = new com.bamtechmedia.dominguez.playback.k
            r1.<init>(r0)
            com.bamtechmedia.dominguez.playback.ScreenSaverBlocker$d r0 = com.bamtechmedia.dominguez.playback.ScreenSaverBlocker.C6265d.f14307c
            if (r0 == 0) goto L_0x0054
            com.bamtechmedia.dominguez.playback.k r2 = new com.bamtechmedia.dominguez.playback.k
            r2.<init>(r0)
            r0 = r2
        L_0x0054:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r4.mo29915a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.ScreenSaverBlocker.mo4131f(androidx.lifecycle.m):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19743a(boolean z) {
        if (z) {
            this.f14305c.getWindow().addFlags(128);
        } else {
            this.f14305c.getWindow().clearFlags(128);
        }
    }
}
