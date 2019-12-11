package com.bamtechmedia.dominguez.detail.common.offline;

import android.view.View;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5641a;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p210g.C5588o;
import p163g.p201e.p203b.p210g.C5597p;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\u0017H\u0002R\u0014\u0010\f\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateMonitor;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "offlineViewModel", "Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "viewProvider", "Lcom/bamtechmedia/dominguez/detail/common/offline/OfflineViewProvider;", "offlineStateObserver", "Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateObserver;", "(Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;Lcom/bamtechmedia/dominguez/core/OfflineState;Lcom/bamtechmedia/dominguez/detail/common/offline/OfflineViewProvider;Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateObserver;)V", "mainView", "Landroid/view/View;", "getMainView", "()Landroid/view/View;", "noConnectionView", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView;", "getNoConnectionView", "()Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView;", "whenOnlineDisposable", "Lio/reactivex/disposables/Disposable;", "checkOfflineState", "", "clearDisposable", "isOnline", "", "onOfflineStateChanged", "timerState", "Lcom/bamtechmedia/dominguez/connectivity/TimerState;", "onRetryClicked", "isOffline", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "subscribeToWhenOnline", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DetailOfflineStateMonitor.kt */
public final class DetailOfflineStateMonitor implements C0710d, C5641a {

    /* renamed from: U */
    private final C5588o f13828U;

    /* renamed from: V */
    private final C3796d f13829V;

    /* renamed from: W */
    private final C5995c f13830W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C5994b f13831X;

    /* renamed from: c */
    private Disposable f13832c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.offline.DetailOfflineStateMonitor$a */
    /* compiled from: DetailOfflineStateMonitor.kt */
    static final class C5990a extends C12881k implements Function1<C5597p, C13145v> {

        /* renamed from: c */
        final /* synthetic */ DetailOfflineStateMonitor f13833c;

        C5990a(DetailOfflineStateMonitor detailOfflineStateMonitor) {
            this.f13833c = detailOfflineStateMonitor;
            super(1);
        }

        /* renamed from: a */
        public final void mo18034a(C5597p pVar) {
            this.f13833c.m19190a(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18034a((C5597p) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.offline.DetailOfflineStateMonitor$b */
    /* compiled from: DetailOfflineStateMonitor.kt */
    static final class C5991b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ DetailOfflineStateMonitor f13834a;

        C5991b(DetailOfflineStateMonitor detailOfflineStateMonitor) {
            this.f13834a = detailOfflineStateMonitor;
        }

        public final void run() {
            this.f13834a.f13831X.mo18036m();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.offline.DetailOfflineStateMonitor$c */
    /* compiled from: DetailOfflineStateMonitor.kt */
    static final class C5992c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C5992c f13835c = new C5992c();

        C5992c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44523a(th);
        }
    }

    public DetailOfflineStateMonitor(C5588o oVar, C3796d dVar, C5995c cVar, C5994b bVar) {
        this.f13828U = oVar;
        this.f13829V = dVar;
        this.f13830W = cVar;
        this.f13831X = bVar;
    }

    /* renamed from: e */
    private final void m19191e() {
        Disposable disposable = this.f13832c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f13832c = null;
    }

    /* renamed from: f */
    private final View m19192f() {
        return this.f13830W.mo18037a();
    }

    /* renamed from: g */
    private final NoConnectionView m19193g() {
        return this.f13830W.mo18038b();
    }

    /* renamed from: h */
    private final void m19194h() {
        if (this.f13832c == null) {
            this.f13832c = this.f13829V.mo13697n().mo30047a(new C5991b(this), C5992c.f13835c);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public final void mo18032b() {
        boolean d = mo18033d();
        int i = 0;
        if (d) {
            C5852n0.m18887b(m19193g());
            m19191e();
        } else {
            m19193g().mo17432a(false);
            m19194h();
        }
        View f = m19192f();
        if (!d) {
            i = 8;
        }
        f.setVisibility(i);
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
    public final boolean mo18033d() {
        return this.f13829V.mo13695j();
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    public void onRetryClicked(boolean z) {
        if (z) {
            this.f13828U.mo17342y();
        }
    }

    /* renamed from: d */
    public void mo4129d(C0722m mVar) {
        m19193g().setRetryListener(null);
        m19191e();
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        m19193g().setRetryListener(this);
        C5755i.m18679a(this.f13830W, this.f13828U, null, null, new C5990a(this), 6, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19190a(C5597p pVar) {
        if (C5993a.$EnumSwitchMapping$0[pVar.ordinal()] != 1) {
            m19193g().mo17433b(false);
        } else {
            m19193g().mo17433b(true);
        }
    }
}
