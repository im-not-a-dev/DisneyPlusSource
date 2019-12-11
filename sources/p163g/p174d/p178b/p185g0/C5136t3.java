package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p185g0.p187w5.C5186a;
import p163g.p174d.p178b.p185g0.p187w5.C5187b;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0003J\b\u0010\u0016\u001a\u00020\u0014H\u0003R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/player/delegates/BackBehaviorDelegate;", "Lcom/bamtech/player/delegates/ClickableDelegate;", "homeAsUpView", "Landroid/view/View;", "enableLandscapeToPortraitBackBehavior", "", "orientationSensorListener", "Lcom/bamtech/player/delegates/orientation/OrientationSensorListener;", "activity", "Landroid/app/Activity;", "events", "Lcom/bamtech/player/PlayerEvents;", "(Landroid/view/View;ZLcom/bamtech/player/delegates/orientation/OrientationSensorListener;Landroid/app/Activity;Lcom/bamtech/player/PlayerEvents;)V", "getActivity", "()Landroid/app/Activity;", "getEnableLandscapeToPortraitBackBehavior", "()Z", "getOrientationSensorListener", "()Lcom/bamtech/player/delegates/orientation/OrientationSensorListener;", "doBackBehavior", "", "listenForHardwareBackClicks", "listenForHomeAsUpViewClicks", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.t3 */
/* compiled from: BackBehaviorDelegate.kt */
public final class C5136t3 extends C5170v3 {

    /* renamed from: X */
    private final boolean f12451X;

    /* renamed from: Y */
    private final C5186a f12452Y;

    /* renamed from: Z */
    private final Activity f12453Z;

    /* renamed from: g.d.b.g0.t3$a */
    /* compiled from: BackBehaviorDelegate.kt */
    static final class C5137a<T> implements C11952h<Integer> {

        /* renamed from: c */
        public static final C5137a f12454c = new C5137a();

        C5137a() {
        }

        /* renamed from: a */
        public final boolean test(Integer num) {
            return num.intValue() == 4;
        }
    }

    /* renamed from: g.d.b.g0.t3$b */
    /* compiled from: BackBehaviorDelegate.kt */
    static final class C5138b<T> implements Consumer<Integer> {

        /* renamed from: c */
        final /* synthetic */ C5136t3 f12455c;

        C5138b(C5136t3 t3Var) {
            this.f12455c = t3Var;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            this.f12455c.mo16626b();
        }
    }

    /* renamed from: g.d.b.g0.t3$c */
    /* compiled from: BackBehaviorDelegate.kt */
    static final class C5139c<T> implements Consumer<Object> {

        /* renamed from: c */
        final /* synthetic */ C5136t3 f12456c;

        C5139c(C5136t3 t3Var) {
            this.f12456c = t3Var;
        }

        public final void accept(Object obj) {
            this.f12456c.mo16626b();
        }
    }

    public C5136t3(View view, boolean z, C5186a aVar, Activity activity, C5300m mVar) {
        super(view, mVar);
        this.f12451X = z;
        this.f12452Y = aVar;
        this.f12453Z = activity;
        if (view != null && this.f12451X) {
            m17440d();
        }
        if (this.f12451X) {
            m17439c();
        }
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: c */
    private final void m17439c() {
        this.f12487U.mo16951J().mo30150a((C11952h<? super T>) C5137a.f12454c).mo30192f((Consumer<? super T>) new C5138b<Object>(this));
        this.f12487U.mo17000a(4);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: d */
    private final void m17440d() {
        this.f12488V.mo30192f((Consumer<? super T>) new C5139c<Object>(this));
        this.f12487U.mo17030f().mo16890a(this.f12488V);
    }

    /* renamed from: b */
    public final void mo16626b() {
        if (C5187b.m17511a(this.f12453Z)) {
            Activity activity = this.f12453Z;
            C5300m mVar = this.f12487U;
            Intrinsics.checkReturnedValueIsNotNull((Object) mVar, "events");
            C5187b.m17510a(activity, mVar, this.f12451X, this.f12452Y);
            return;
        }
        this.f12453Z.finish();
    }
}
