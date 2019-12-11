package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.view.View;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p195l0.C5298a;
import p163g.p174d.p178b.p196m0.C5307e;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u0010\u00101\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0005H\u0002J\u0010\u00102\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0005H\u0002J\u000e\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\rJ\u000e\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:J\u000e\u0010;\u001a\u00020/2\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010<\u001a\u00020/2\u0006\u0010*\u001a\u00020\u0005J\b\u0010=\u001a\u00020/H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R$\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R$\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R$\u0010&\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u000f\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013R$\u0010*\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u000f\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, mo31007d2 = {"Lcom/bamtech/player/delegates/AbstractSkipViewDelegate;", "Lcom/bamtech/player/delegates/ClickableDelegate;", "view", "Landroid/view/View;", "controlAnimationHideDuration", "", "controlAnimationShowDuration", "videoPlayer", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/view/View;JJLcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "controlsVisible", "", "controlsVisible$annotations", "()V", "getControlsVisible", "()Z", "setControlsVisible", "(Z)V", "duration", "duration$annotations", "getDuration", "()J", "setDuration", "(J)V", "endTime", "endTime$annotations", "getEndTime", "setEndTime", "ignoreOnTimeChanged", "ignoreOnTimeChanged$annotations", "getIgnoreOnTimeChanged", "setIgnoreOnTimeChanged", "startTime", "startTime$annotations", "getStartTime", "setStartTime", "syncWithControls", "syncWithControls$annotations", "getSyncWithControls", "setSyncWithControls", "timeInMilliseconds", "timeInMilliseconds$annotations", "getTimeInMilliseconds", "setTimeInMilliseconds", "fadeIn", "", "fadeOut", "isBetweenIntroStartAndDuration", "isBetweenIntroStartAndEnd", "onClick", "o", "", "onControlsVisible", "visible", "onSchedule", "schedule", "Lcom/bamtech/player/upnext/Schedule;", "onTimeChanged", "onTimeUpdated", "showOrHideView", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.q3 */
/* compiled from: AbstractSkipViewDelegate.kt */
public abstract class C5094q3 extends C5170v3 {

    /* renamed from: X */
    private boolean f12399X;

    /* renamed from: Y */
    private boolean f12400Y;

    /* renamed from: Z */
    private long f12401Z;

    /* renamed from: a0 */
    private boolean f12402a0;

    /* renamed from: b0 */
    private long f12403b0;

    /* renamed from: c0 */
    private long f12404c0;

    /* renamed from: d0 */
    private long f12405d0;

    /* renamed from: e0 */
    private final long f12406e0;

    /* renamed from: f0 */
    private final long f12407f0;

    /* renamed from: g0 */
    private final C5326w f12408g0;

    /* renamed from: g.d.b.g0.q3$a */
    /* compiled from: AbstractSkipViewDelegate.kt */
    static final /* synthetic */ class C5095a extends C12879i implements Function1<Object, C13145v> {
        C5095a(C5094q3 q3Var) {
            super(1, q3Var);
        }

        public final String getName() {
            return "onClick";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5094q3.class);
        }

        public final String getSignature() {
            return "onClick(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5094q3) this.receiver).mo16579b(obj);
        }
    }

    /* renamed from: g.d.b.g0.q3$b */
    /* compiled from: AbstractSkipViewDelegate.kt */
    static final /* synthetic */ class C5096b extends C12879i implements Function1<Long, C13145v> {
        C5096b(C5094q3 q3Var) {
            super(1, q3Var);
        }

        /* renamed from: a */
        public final void mo16583a(long j) {
            ((C5094q3) this.receiver).mo16574a(j);
        }

        public final String getName() {
            return "onTimeChanged";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5094q3.class);
        }

        public final String getSignature() {
            return "onTimeChanged(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16583a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q3$c */
    /* compiled from: AbstractSkipViewDelegate.kt */
    static final /* synthetic */ class C5097c extends C12879i implements Function1<Boolean, C13145v> {
        C5097c(C5094q3 q3Var) {
            super(1, q3Var);
        }

        /* renamed from: a */
        public final void mo16584a(boolean z) {
            ((C5094q3) this.receiver).mo16576a(z);
        }

        public final String getName() {
            return "onControlsVisible";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5094q3.class);
        }

        public final String getSignature() {
            return "onControlsVisible(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16584a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q3$d */
    /* compiled from: AbstractSkipViewDelegate.kt */
    static final class C5098d<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5094q3 f12409c;

        C5098d(C5094q3 q3Var) {
            this.f12409c = q3Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f12409c.mo16580b(bool.booleanValue());
        }
    }

    /* renamed from: g.d.b.g0.q3$e */
    /* compiled from: AbstractSkipViewDelegate.kt */
    static final /* synthetic */ class C5099e extends C12879i implements Function1<Long, C13145v> {
        C5099e(C5094q3 q3Var) {
            super(1, q3Var);
        }

        /* renamed from: a */
        public final void mo16586a(long j) {
            ((C5094q3) this.receiver).mo16578b(j);
        }

        public final String getName() {
            return "onTimeUpdated";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5094q3.class);
        }

        public final String getSignature() {
            return "onTimeUpdated(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16586a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q3$f */
    /* compiled from: AbstractSkipViewDelegate.kt */
    static final class C5100f<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5094q3 f12410c;

        C5100f(C5094q3 q3Var) {
            this.f12410c = q3Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f12410c.mo16580b(bool.booleanValue());
        }
    }

    /* renamed from: g.d.b.g0.q3$g */
    /* compiled from: AbstractSkipViewDelegate.kt */
    static final /* synthetic */ class C5101g extends C12879i implements Function1<Long, C13145v> {
        C5101g(C5094q3 q3Var) {
            super(1, q3Var);
        }

        /* renamed from: a */
        public final void mo16588a(long j) {
            ((C5094q3) this.receiver).mo16578b(j);
        }

        public final String getName() {
            return "onTimeUpdated";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5094q3.class);
        }

        public final String getSignature() {
            return "onTimeUpdated(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16588a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q3$h */
    /* compiled from: AbstractSkipViewDelegate.kt */
    static final class C5102h extends C12881k implements Function1<View, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5094q3 f12411c;

        C5102h(C5094q3 q3Var) {
            this.f12411c = q3Var;
            super(1);
        }

        /* renamed from: a */
        public final void mo16589a(View view) {
            if (!this.f12411c.mo16582d()) {
                view.requestFocus();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16589a((View) obj);
            return C13145v.f29587a;
        }
    }

    @SuppressLint({"CheckResult"})
    public C5094q3(View view, long j, long j2, C5326w wVar, C5300m mVar) {
        super(view, mVar);
        this.f12406e0 = j;
        this.f12407f0 = j2;
        this.f12408g0 = wVar;
        if (view != null) {
            this.f12488V.mo30192f((Consumer<? super T>) new C5121r3<Object>(new C5095a(this)));
            mVar.mo16938C0().mo30192f((Consumer<? super T>) new C5121r3<Object>(new C5096b(this)));
            mVar.mo17076x().mo30192f((Consumer<? super T>) new C5121r3<Object>(new C5097c(this)));
            mVar.mo17067s0().mo30192f((Consumer<? super T>) new C5098d<Object>(this));
            mVar.mo17065r0().mo30192f((Consumer<? super T>) new C5121r3<Object>(new C5099e(this)));
            mVar.mo16942E0().mo30192f((Consumer<? super T>) new C5100f<Object>(this));
            mVar.mo16946G0().mo30192f((Consumer<? super T>) new C5121r3<Object>(new C5101g(this)));
        }
    }

    /* renamed from: c */
    private final boolean m17379c(long j) {
        return m17380d(j) && j <= this.f12403b0 + this.f12405d0;
    }

    /* renamed from: e */
    private final void m17381e() {
        if (this.f12400Y && m17380d(this.f12401Z)) {
            this.f12402a0 = true;
            mo16577b();
        } else if (!this.f12400Y && !this.f12402a0 && m17379c(this.f12401Z)) {
            mo16577b();
        } else if (!m17380d(this.f12401Z)) {
            this.f12402a0 = false;
            mo16581c();
        } else {
            mo16581c();
        }
    }

    /* renamed from: a */
    public final void mo16575a(C5298a aVar) {
        this.f12403b0 = aVar.mo16923d();
        this.f12404c0 = aVar.mo16921b();
        this.f12405d0 = aVar.mo16919a();
        this.f12402a0 = false;
    }

    /* renamed from: b */
    public final void mo16580b(boolean z) {
        this.f12399X = z;
    }

    /* renamed from: d */
    public final boolean mo16582d() {
        return this.f12400Y;
    }

    /* renamed from: d */
    private final boolean m17380d(long j) {
        long j2 = this.f12403b0;
        long j3 = this.f12404c0;
        return j2 != j3 && j2 <= j && j <= j3;
    }

    /* renamed from: b */
    public final void mo16579b(Object obj) {
        this.f12408g0.mo7602a(this.f12404c0 + 1);
    }

    /* renamed from: b */
    public final void mo16578b(long j) {
        this.f12401Z = j;
        m17381e();
    }

    /* renamed from: c */
    public final void mo16581c() {
        View view = this.f12489W;
        if (view != null) {
            C5307e.m17962a(view, this.f12406e0);
        }
    }

    /* renamed from: a */
    public final void mo16576a(boolean z) {
        this.f12400Y = z;
        m17381e();
    }

    /* renamed from: b */
    public final void mo16577b() {
        View view = this.f12489W;
        if (view != null) {
            C5307e.m17963a(view, this.f12407f0, new C5102h(this));
        }
    }

    /* renamed from: a */
    public final void mo16574a(long j) {
        if (!this.f12399X) {
            mo16578b(j);
        }
    }
}
