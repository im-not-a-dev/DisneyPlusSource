package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/player/delegates/PauseWhileSeekingDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "pauseWhileSeeking", "", "player", "Lcom/bamtech/player/VideoPlayer;", "events", "Lcom/bamtech/player/PlayerEvents;", "(ZLcom/bamtech/player/VideoPlayer;Lcom/bamtech/player/PlayerEvents;)V", "shouldResume", "shouldResume$annotations", "()V", "getShouldResume", "()Z", "setShouldResume", "(Z)V", "onSeekBarTouched", "", "touched", "onStopBuffering", "void", "", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"CheckResult"})
/* renamed from: g.d.b.g0.q4 */
/* compiled from: PauseWhileSeekingDelegate.kt */
public final class C5103q4 implements C5271z3 {

    /* renamed from: U */
    private final C5326w f12412U;

    /* renamed from: c */
    private boolean f12413c;

    /* renamed from: g.d.b.g0.q4$a */
    /* compiled from: PauseWhileSeekingDelegate.kt */
    static final /* synthetic */ class C5104a extends C12879i implements Function1<Boolean, C13145v> {
        C5104a(C5103q4 q4Var) {
            super(1, q4Var);
        }

        /* renamed from: a */
        public final void mo16592a(boolean z) {
            ((C5103q4) this.receiver).mo16591a(z);
        }

        public final String getName() {
            return "onSeekBarTouched";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5103q4.class);
        }

        public final String getSignature() {
            return "onSeekBarTouched(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16592a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q4$b */
    /* compiled from: PauseWhileSeekingDelegate.kt */
    static final /* synthetic */ class C5105b extends C12879i implements Function1<Object, C13145v> {
        C5105b(C5103q4 q4Var) {
            super(1, q4Var);
        }

        public final String getName() {
            return "onStopBuffering";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5103q4.class);
        }

        public final String getSignature() {
            return "onStopBuffering(Ljava/lang/Object;)V";
        }

        public final void invoke(Object obj) {
            ((C5103q4) this.receiver).mo16590a(obj);
        }
    }

    public C5103q4(boolean z, C5326w wVar, C5300m mVar) {
        this.f12412U = wVar;
        if (z) {
            mVar.mo17067s0().mo30192f((Consumer<? super T>) new C5122r4<Object>(new C5104a(this)));
            mVar.mo17051k0().mo30192f((Consumer<? super T>) new C5122r4<Object>(new C5105b(this)));
        }
    }

    /* renamed from: a */
    public final void mo16591a(boolean z) {
        if (z && this.f12412U.mo7609a()) {
            this.f12412U.mo7611b();
            this.f12413c = true;
        }
    }

    /* renamed from: a */
    public final void mo16590a(Object obj) {
        if (!this.f12412U.mo7609a() && this.f12413c) {
            this.f12412U.mo7628i();
            this.f12413c = false;
        }
    }
}
