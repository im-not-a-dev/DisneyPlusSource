package com.bamtechmedia.dominguez.core.framework;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import com.uber.autodispose.android.lifecycle.C10541b;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.C11969r;
import p520io.reactivex.Observable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/framework/ReactivePresenter;", "ModelState", "", "ViewState", "Landroidx/lifecycle/DefaultLifecycleObserver;", "viewModel", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "view", "Lcom/bamtechmedia/dominguez/core/framework/PresenterView;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;Lcom/bamtechmedia/dominguez/core/framework/PresenterView;Lio/reactivex/Scheduler;)V", "mapToViewState", "newState", "(Ljava/lang/Object;)Ljava/lang/Object;", "onNewModelState", "", "(Ljava/lang/Object;)V", "onNewViewState", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReactivePresenter.kt */
public abstract class ReactivePresenter<ModelState, ViewState> implements C0710d {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C5738d<ViewState> f13492U;

    /* renamed from: V */
    private final C11969r f13493V;

    /* renamed from: c */
    private final C5741g<ModelState> f13494c;

    /* renamed from: com.bamtechmedia.dominguez.core.framework.ReactivePresenter$a */
    /* compiled from: ReactivePresenter.kt */
    static final /* synthetic */ class C5728a extends C12879i implements Function1<ModelState, C13145v> {
        C5728a(ReactivePresenter reactivePresenter) {
            super(1, reactivePresenter);
        }

        public final String getName() {
            return "onNewModelState";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(ReactivePresenter.class);
        }

        public final String getSignature() {
            return "onNewModelState(Ljava/lang/Object;)V";
        }

        public final void invoke(ModelState modelstate) {
            ((ReactivePresenter) this.receiver).mo17608b(modelstate);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.framework.ReactivePresenter$b */
    /* compiled from: ReactivePresenter.kt */
    static final /* synthetic */ class C5729b extends C12879i implements Function1<ModelState, ViewState> {
        C5729b(ReactivePresenter reactivePresenter) {
            super(1, reactivePresenter);
        }

        public final String getName() {
            return "mapToViewState";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(ReactivePresenter.class);
        }

        public final String getSignature() {
            return "mapToViewState(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final ViewState invoke(ModelState modelstate) {
            return ((ReactivePresenter) this.receiver).mo17607a(modelstate);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.framework.ReactivePresenter$c */
    /* compiled from: ReactivePresenter.kt */
    static final /* synthetic */ class C5730c extends C12879i implements Function1<ViewState, C13145v> {
        C5730c(ReactivePresenter reactivePresenter) {
            super(1, reactivePresenter);
        }

        public final String getName() {
            return "onNewViewState";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(ReactivePresenter.class);
        }

        public final String getSignature() {
            return "onNewViewState(Ljava/lang/Object;)V";
        }

        public final void invoke(ViewState viewstate) {
            ((ReactivePresenter) this.receiver).mo17609c(viewstate);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.framework.ReactivePresenter$d */
    /* compiled from: ReactivePresenter.kt */
    static final class C5731d<T> implements Consumer<ViewState> {

        /* renamed from: c */
        final /* synthetic */ ReactivePresenter f13495c;

        C5731d(ReactivePresenter reactivePresenter) {
            this.f13495c = reactivePresenter;
        }

        public final void accept(ViewState viewstate) {
            this.f13495c.f13492U.mo17615a(viewstate);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.framework.ReactivePresenter$e */
    /* compiled from: ReactivePresenter.kt */
    static final class C5732e<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ ReactivePresenter f13496c;

        C5732e(ReactivePresenter reactivePresenter) {
            this.f13496c = reactivePresenter;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error in ");
            sb.append(this.f13496c.getClass().getSimpleName());
            sb.append(" state stream)");
            C14100a.m44528b(th, sb.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract ViewState mo17607a(ModelState modelstate);

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: b */
    public void mo17608b(ModelState modelstate) {
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: c */
    public void mo17609c(ViewState viewstate) {
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        Observable d = this.f13494c.getState().mo30151a(this.f13493V).mo30184d((Consumer<? super T>) new C5739e<Object>(new C5728a(this))).mo30193g(new C5740f(new C5729b(this))).mo30184d((Consumer<? super T>) new C5739e<Object>(new C5730c(this)));
        C12880j.m40222a((Object) d, "viewModel.state\n        …oOnNext(::onNewViewState)");
        C10541b a = C10541b.m33255a(mVar, C0716a.ON_STOP);
        C12880j.m40222a((Object) a, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a2 = d.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a2).mo29915a(new C5731d(this), new C5732e(this));
    }
}
