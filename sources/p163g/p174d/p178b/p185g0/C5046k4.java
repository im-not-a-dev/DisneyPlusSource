package p163g.p174d.p178b.p185g0;

import kotlin.Metadata;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0013H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, mo31007d2 = {"Lcom/bamtech/player/delegates/JumpDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Lcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "getEvents", "()Lcom/bamtech/player/PlayerEvents;", "pinnedToLive", "", "getPinnedToLive", "()Z", "setPinnedToLive", "(Z)V", "seekable", "getSeekable", "setSeekable", "startTimeOffset", "", "getStartTimeOffset", "()J", "setStartTimeOffset", "(J)V", "getVideoPlayer", "()Lcom/bamtech/player/VideoPlayer;", "doJump", "", "seekAmountInSeconds", "", "onJump", "shouldNotSeek", "timeBeforeStartTimeOffset", "seekAmountInMilliseconds", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.k4 */
/* compiled from: JumpDelegate.kt */
public final class C5046k4 implements C5271z3 {

    /* renamed from: U */
    private boolean f12317U = true;

    /* renamed from: V */
    private long f12318V;

    /* renamed from: W */
    private final C5326w f12319W;

    /* renamed from: X */
    private final C5300m f12320X;

    /* renamed from: c */
    private boolean f12321c;

    /* renamed from: g.d.b.g0.k4$a */
    /* compiled from: JumpDelegate.kt */
    static final class C5047a<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5046k4 f12322c;

        C5047a(C5046k4 k4Var) {
            this.f12322c = k4Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f12322c.mo16524b(bool.booleanValue());
        }
    }

    /* renamed from: g.d.b.g0.k4$b */
    /* compiled from: JumpDelegate.kt */
    static final class C5048b<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ C5046k4 f12323c;

        C5048b(C5046k4 k4Var) {
            this.f12323c = k4Var;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f12323c.mo16522a(l.longValue());
        }
    }

    /* renamed from: g.d.b.g0.k4$c */
    /* compiled from: JumpDelegate.kt */
    static final class C5049c<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C5046k4 f12324c;

        C5049c(C5046k4 k4Var) {
            this.f12324c = k4Var;
        }

        public final void accept(Object obj) {
            this.f12324c.mo16523a(false);
        }
    }

    /* renamed from: g.d.b.g0.k4$d */
    /* compiled from: JumpDelegate.kt */
    static final class C5050d<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C5046k4 f12325c;

        C5050d(C5046k4 k4Var) {
            this.f12325c = k4Var;
        }

        public final void accept(Object obj) {
            this.f12325c.mo16523a(true);
        }
    }

    /* renamed from: g.d.b.g0.k4$e */
    /* compiled from: JumpDelegate.kt */
    static final class C5051e<T> implements Consumer<Integer> {

        /* renamed from: c */
        final /* synthetic */ C5046k4 f12326c;

        C5051e(C5046k4 k4Var) {
            this.f12326c = k4Var;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            this.f12326c.mo16521a(num.intValue());
        }
    }

    public C5046k4(C5326w wVar, C5300m mVar) {
        this.f12319W = wVar;
        this.f12320X = mVar;
        C5300m mVar2 = this.f12320X;
        mVar2.mo17069t0().mo30192f((Consumer<? super T>) new C5047a<Object>(this));
        mVar2.mo17081z0().mo30192f((Consumer<? super T>) new C5048b<Object>(this));
        mVar2.mo16939D().mo30192f((Consumer<? super T>) new C5049c<Object>(this));
        mVar2.mo17030f().mo16908j().mo30192f((Consumer<? super T>) new C5050d<Object>(this));
        mVar2.mo16945G().mo30192f((Consumer<? super T>) new C5051e<Object>(this));
    }

    /* renamed from: c */
    private final boolean m17315c(int i) {
        return !this.f12317U || (this.f12321c && i > 0);
    }

    /* renamed from: a */
    public final void mo16523a(boolean z) {
        this.f12321c = z;
    }

    /* renamed from: b */
    public final void mo16524b(boolean z) {
        this.f12317U = z;
    }

    /* renamed from: b */
    private final void m17313b(int i) {
        long j = ((long) i) * 1000;
        if (m17314b(j)) {
            this.f12319W.mo7602a(this.f12318V);
        } else {
            this.f12319W.mo7615c(j);
        }
    }

    /* renamed from: a */
    public final void mo16522a(long j) {
        this.f12318V = j;
    }

    /* renamed from: a */
    public final void mo16521a(int i) {
        if (!m17315c(i)) {
            m17313b(i);
            if (i > 0) {
                this.f12320X.mo17052l();
            } else {
                this.f12320X.mo17050k();
            }
        }
    }

    /* renamed from: b */
    private final boolean m17314b(long j) {
        return this.f12319W.getCurrentPosition() + j < this.f12318V;
    }
}
