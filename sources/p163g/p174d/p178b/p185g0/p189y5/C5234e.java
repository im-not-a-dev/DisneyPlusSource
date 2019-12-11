package p163g.p174d.p178b.p185g0.p189y5;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.MotionEvent;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5294k;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p185g0.C5184w4;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 X2\u00020\u0001:\u0001XB)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0005J\u0010\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0002J\b\u0010B\u001a\u00020>H\u0007J\u0012\u0010B\u001a\u00020>2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010E\u001a\u00020,H\u0016J\u0010\u0010F\u001a\u00020>2\u0006\u0010C\u001a\u00020DH\u0002J\u0012\u0010G\u001a\u00020>2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u000e\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020,J\u000e\u0010J\u001a\u00020>2\u0006\u0010C\u001a\u00020DJ\u000e\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00020\fJ\u000e\u0010M\u001a\u00020>2\u0006\u0010N\u001a\u00020\fJ\u0010\u0010O\u001a\u00020>2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u00020>2\u0006\u0010C\u001a\u00020DH\u0002J\u0012\u0010S\u001a\u00020>2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0010\u0010T\u001a\u00020>2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010U\u001a\u00020>2\u0006\u0010+\u001a\u00020,J\u000e\u0010V\u001a\u00020>2\u0006\u00102\u001a\u00020\fJ\b\u0010W\u001a\u00020>H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R&\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010'\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R$\u0010+\u001a\u00020,8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b-\u0010\u000e\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b3\u0010\u000e\u001a\u0004\b4\u0010\u0010\"\u0004\b5\u0010\u0012R$\u00106\u001a\u0002078\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b8\u0010\u000e\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, mo31007d2 = {"Lcom/bamtech/player/delegates/trickplay/TrickPlayFastForwardOrRewindDelegate;", "Lcom/bamtech/player/delegates/PlayerSpeedConrollerDelegate;", "rates", "Lcom/bamtech/player/PlaybackRates;", "alwaysUseTrickPlay", "", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Lcom/bamtech/player/PlaybackRates;ZLcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "endTimeOffsetMs", "", "endTimeOffsetMs$annotations", "()V", "getEndTimeOffsetMs$bamplayer_core_release", "()J", "setEndTimeOffsetMs$bamplayer_core_release", "(J)V", "isAdPlaying", "isAdPlaying$annotations", "isAdPlaying$bamplayer_core_release", "()Z", "setAdPlaying$bamplayer_core_release", "(Z)V", "isPlaying", "isPlaying$annotations", "setPlaying", "maxTimeMs", "maxTimeMs$annotations", "getMaxTimeMs", "setMaxTimeMs", "millisecondsTimeChangedDisposable", "Lio/reactivex/disposables/Disposable;", "millisecondsTimeChangedDisposable$annotations", "getMillisecondsTimeChangedDisposable", "()Lio/reactivex/disposables/Disposable;", "setMillisecondsTimeChangedDisposable", "(Lio/reactivex/disposables/Disposable;)V", "seekTimeMilliseconds", "seekTimeMilliseconds$annotations", "getSeekTimeMilliseconds", "setSeekTimeMilliseconds", "speed", "", "speed$annotations", "getSpeed", "()I", "setSpeed", "(I)V", "startTimeOffsetMs", "startTimeOffsetMs$annotations", "getStartTimeOffsetMs$bamplayer_core_release", "setStartTimeOffsetMs$bamplayer_core_release", "stopWatch", "Lcom/bamtech/player/delegates/trickplay/StopWatch;", "stopWatch$annotations", "getStopWatch", "()Lcom/bamtech/player/delegates/trickplay/StopWatch;", "setStopWatch", "(Lcom/bamtech/player/delegates/trickplay/StopWatch;)V", "changePlaybackRate", "", "increase", "clampToBeginningOrEndOfStream", "seekPosition", "endSeek", "_void", "", "getSeekSpeedCount", "onEndAd", "onFastForward", "onKeyDown", "keyCode", "onLifecycleStop", "onMaxTimeChanged", "timeInMs", "onMsTimeChanged", "timeMs", "onNewMedia", "uri", "Landroid/net/Uri;", "onPlayAd", "onRewind", "setEndTimeOffsetMs", "setSeekSpeed", "setStartTimeOffsetMs", "startSeek", "Companion", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.y5.e */
/* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
public final class C5234e extends C5184w4 {

    /* renamed from: h0 */
    private static final int f12586h0 = 10;

    /* renamed from: i0 */
    private static final int f12587i0 = 1;

    /* renamed from: V */
    private long f12588V;

    /* renamed from: W */
    private long f12589W;

    /* renamed from: X */
    private int f12590X = 1;

    /* renamed from: Y */
    private boolean f12591Y;

    /* renamed from: Z */
    private Disposable f12592Z;

    /* renamed from: a0 */
    private C5225a f12593a0 = new C5225a();

    /* renamed from: b0 */
    private long f12594b0;

    /* renamed from: c0 */
    private boolean f12595c0;

    /* renamed from: d0 */
    private final C5294k f12596d0;

    /* renamed from: e0 */
    private final boolean f12597e0;

    /* renamed from: f0 */
    private final C5326w f12598f0;

    /* renamed from: g0 */
    private final C5300m f12599g0;

    /* renamed from: g.d.b.g0.y5.e$a */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5235a extends C12879i implements Function1<Long, C13145v> {
        C5235a(C5234e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo16755a(long j) {
            ((C5234e) this.receiver).m17590e(j);
        }

        public final String getName() {
            return "setEndTimeOffsetMs";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "setEndTimeOffsetMs(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16755a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.e$b */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5236b extends C12879i implements Function1<Long, C13145v> {
        C5236b(C5234e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo16756a(long j) {
            ((C5234e) this.receiver).mo16748a(j);
        }

        public final String getName() {
            return "onMaxTimeChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onMaxTimeChanged(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16756a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.e$c */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5237c extends C12879i implements Function1<Object, C13145v> {
        C5237c(C5234e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "onPlayAd";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onPlayAd(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5234e) this.receiver).m17592f(obj);
        }
    }

    /* renamed from: g.d.b.g0.y5.e$d */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5238d extends C12879i implements Function1<Object, C13145v> {
        C5238d(C5234e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "onEndAd";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onEndAd(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5234e) this.receiver).m17591e(obj);
        }
    }

    /* renamed from: g.d.b.g0.y5.e$e */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5239e extends C12879i implements Function1<Object, C13145v> {
        C5239e(C5234e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "onLifecycleStop";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onLifecycleStop(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5234e) this.receiver).mo16754d(obj);
        }
    }

    /* renamed from: g.d.b.g0.y5.e$f */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5240f extends C12879i implements Function1<Object, C13145v> {
        C5240f(C5234e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "endSeek";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "endSeek(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5234e) this.receiver).mo16482a(obj);
        }
    }

    /* renamed from: g.d.b.g0.y5.e$g */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5241g extends C12879i implements Function1<Object, C13145v> {
        C5241g(C5234e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "endSeek";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "endSeek(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5234e) this.receiver).mo16482a(obj);
        }
    }

    /* renamed from: g.d.b.g0.y5.e$h */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5242h extends C12879i implements Function1<Object, C13145v> {
        C5242h(C5234e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "endSeek";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "endSeek(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5234e) this.receiver).mo16482a(obj);
        }
    }

    /* renamed from: g.d.b.g0.y5.e$i */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5243i extends C12879i implements Function1<Object, C13145v> {
        C5243i(C5234e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "onFastForward";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onFastForward(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5234e) this.receiver).mo16487b(obj);
        }
    }

    /* renamed from: g.d.b.g0.y5.e$j */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5244j extends C12879i implements Function1<Object, C13145v> {
        C5244j(C5234e eVar) {
            super(1, eVar);
        }

        public final String getName() {
            return "onRewind";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onRewind(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5234e) this.receiver).mo16490c(obj);
        }
    }

    /* renamed from: g.d.b.g0.y5.e$k */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5245k extends C12879i implements Function1<MotionEvent, C13145v> {
        C5245k(C5234e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo16757a(MotionEvent motionEvent) {
            ((C5234e) this.receiver).mo16683a(motionEvent);
        }

        public final String getName() {
            return "onMotionEvent";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onMotionEvent(Landroid/view/MotionEvent;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16757a((MotionEvent) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.e$l */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5246l extends C12879i implements Function1<Integer, C13145v> {
        C5246l(C5234e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo16758a(int i) {
            ((C5234e) this.receiver).mo16747a(i);
        }

        public final String getName() {
            return "onKeyDown";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onKeyDown(I)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16758a(((Number) obj).intValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.e$m */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5247m extends C12879i implements Function1<Uri, C13145v> {
        C5247m(C5234e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo16759a(Uri uri) {
            ((C5234e) this.receiver).m17584a(uri);
        }

        public final String getName() {
            return "onNewMedia";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onNewMedia(Landroid/net/Uri;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16759a((Uri) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.e$n */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5248n extends C12879i implements Function1<Long, C13145v> {
        C5248n(C5234e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo16760a(long j) {
            ((C5234e) this.receiver).mo16753c(j);
        }

        public final String getName() {
            return "setStartTimeOffsetMs";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "setStartTimeOffsetMs(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16760a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.y5.e$o */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    public static final class C5249o {
        private C5249o() {
        }

        public /* synthetic */ C5249o(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.d.b.g0.y5.e$p */
    /* compiled from: TrickPlayFastForwardOrRewindDelegate.kt */
    static final /* synthetic */ class C5250p extends C12879i implements Function1<Long, C13145v> {
        C5250p(C5234e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo16761a(long j) {
            ((C5234e) this.receiver).mo16752b(j);
        }

        public final String getName() {
            return "onMsTimeChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5234e.class);
        }

        public final String getSignature() {
            return "onMsTimeChanged(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16761a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    static {
        new C5249o(null);
    }

    @SuppressLint({"CheckResult"})
    public C5234e(C5294k kVar, boolean z, C5326w wVar, C5300m mVar) {
        this.f12596d0 = kVar;
        this.f12597e0 = z;
        this.f12598f0 = wVar;
        this.f12599g0 = mVar;
        if (this.f12596d0 != null && this.f12597e0) {
            this.f12599g0.mo17019c0().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5240f(this)));
            this.f12599g0.mo17030f().mo16898e().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5241g(this)));
            this.f12599g0.mo17030f().mo16904h().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5242h(this)));
            this.f12599g0.mo16941E().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5243i(this)));
            this.f12599g0.mo17057n0().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5244j(this)));
            this.f12599g0.mo17000a(90, 89, 104, 105);
            this.f12599g0.mo16965Q().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5245k(this)));
            this.f12599g0.mo16951J().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5246l(this)));
            this.f12599g0.mo16973U().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5247m(this)));
            this.f12599g0.mo17081z0().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5248n(this)));
            this.f12599g0.mo16935B().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5235a(this)));
            this.f12599g0.mo16963P().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5236b(this)));
            this.f12599g0.mo16981a().mo17101d().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5237c(this)));
            this.f12599g0.mo16981a().mo17098a().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5238d(this)));
            this.f12599g0.mo16957M().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5239e(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m17590e(long j) {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m17591e(Object obj) {
        this.f12591Y = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m17592f(Object obj) {
        this.f12591Y = true;
        mo16482a((Object) null);
    }

    /* renamed from: c */
    public void mo16490c(Object obj) {
        mo16749a(false);
    }

    /* renamed from: d */
    public final void mo16754d(Object obj) {
        this.f12599g0.mo17009b(this.f12592Z);
        this.f12592Z = null;
        this.f12599g0.mo17038g(false);
    }

    /* renamed from: b */
    public void mo16487b(Object obj) {
        mo16749a(true);
    }

    /* renamed from: c */
    public final void mo16753c(long j) {
        this.f12588V = j;
    }

    /* renamed from: b */
    public final void mo16751b(int i) {
        if (!this.f12591Y) {
            if (i == f12587i0) {
                if (this.f12592Z != null) {
                    mo16746a();
                }
            } else if (this.f12592Z == null) {
                mo16750b();
            }
            this.f12590X = i;
            this.f12599g0.mo17041h(i);
        }
    }

    /* renamed from: d */
    private final long m17589d(long j) {
        return Math.max(this.f12588V, Math.min(j, this.f12589W));
    }

    /* renamed from: a */
    public void mo16482a(Object obj) {
        mo16751b(f12587i0);
    }

    /* renamed from: a */
    public final void mo16747a(int i) {
        if (i != 89) {
            if (i == 90 || i == 104) {
                mo16487b((Object) null);
                return;
            } else if (i != 105) {
                return;
            }
        }
        mo16490c((Object) null);
    }

    /* renamed from: a */
    public final void mo16749a(boolean z) {
        C5294k kVar = this.f12596d0;
        if (kVar != null) {
            mo16751b(kVar.mo16887a(this.f12590X, z));
        } else {
            C12880j.m40220a();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17584a(Uri uri) {
        mo16751b(f12587i0);
    }

    /* renamed from: a */
    public final void mo16748a(long j) {
        this.f12589W = j;
    }

    /* renamed from: b */
    public final void mo16750b() {
        this.f12592Z = this.f12599g0.mo16967R().mo30192f((Consumer<? super T>) new C5251f<Object>(new C5250p(this)));
        this.f12599g0.mo17038g(true);
        this.f12595c0 = this.f12598f0.mo7609a();
        this.f12598f0.mo7611b();
        this.f12593a0.mo16735b();
        this.f12594b0 = this.f12598f0.getCurrentPosition();
    }

    /* renamed from: a */
    public final void mo16746a() {
        this.f12599g0.mo17009b(this.f12592Z);
        this.f12592Z = null;
        this.f12599g0.mo17038g(false);
        this.f12598f0.mo7602a(this.f12594b0);
        if (this.f12595c0) {
            this.f12598f0.mo7628i();
        }
    }

    /* renamed from: b */
    public final void mo16752b(long j) {
        this.f12594b0 += ((long) this.f12590X) * ((long) f12586h0) * this.f12593a0.mo16737d();
        this.f12594b0 = m17589d(this.f12594b0);
        this.f12599g0.mo17048j(this.f12594b0);
        long j2 = this.f12594b0;
        if (j2 >= this.f12589W || j2 <= 0) {
            mo16751b(f12587i0);
        }
    }
}
