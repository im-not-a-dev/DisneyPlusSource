package com.bamtechmedia.dominguez.sdk.vpn;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.sdk.vpn.C7141a.C7142a;
import com.bamtechmedia.dominguez.sdk.vpn.C7141a.C7142a.C7143a;
import com.bamtechmedia.dominguez.sdk.vpn.C7141a.C7142a.C7144b;
import com.uber.autodispose.android.lifecycle.C10541b;
import kotlin.C12898l;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p277b0.C7231w;
import p163g.p201e.p203b.p277b0.C7232x;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11842x;
import p520io.reactivex.C11932e;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p527w.p529c.C11992a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/sdk/vpn/VpnDialogLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "vpnBlocking", "Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;Landroidx/fragment/app/FragmentActivity;)V", "errorContainer", "Landroid/view/View;", "getErrorContainer", "()Landroid/view/View;", "dismissDialog", "", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onVpnStatusChanged", "status", "Lcom/bamtechmedia/dominguez/sdk/vpn/VpnBlocking$VpnStatus;", "showDialog", "throwable", "", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: VpnDialogLifecycleObserver.kt */
public final class VpnDialogLifecycleObserver implements C0710d {

    /* renamed from: U */
    private final C7614e f15786U;

    /* renamed from: V */
    private final C0532d f15787V;

    /* renamed from: c */
    private final C7141a f15788c;

    /* renamed from: com.bamtechmedia.dominguez.sdk.vpn.VpnDialogLifecycleObserver$a */
    /* compiled from: VpnDialogLifecycleObserver.kt */
    static final class C7139a<T> implements Consumer<C7142a> {

        /* renamed from: c */
        final /* synthetic */ VpnDialogLifecycleObserver f15789c;

        C7139a(VpnDialogLifecycleObserver vpnDialogLifecycleObserver) {
            this.f15789c = vpnDialogLifecycleObserver;
        }

        /* renamed from: a */
        public final void accept(C7142a aVar) {
            VpnDialogLifecycleObserver vpnDialogLifecycleObserver = this.f15789c;
            C12880j.m40222a((Object) aVar, "it");
            vpnDialogLifecycleObserver.m21663a(aVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.sdk.vpn.VpnDialogLifecycleObserver$b */
    /* compiled from: VpnDialogLifecycleObserver.kt */
    static final class C7140b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7140b f15790c = new C7140b();

        C7140b() {
        }

        /* renamed from: a */
        public final void mo19963a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo19963a((Throwable) obj);
            throw null;
        }
    }

    public VpnDialogLifecycleObserver(C7141a aVar, C7614e eVar, C0532d dVar) {
        this.f15788c = aVar;
        this.f15786U = eVar;
        this.f15787V = dVar;
    }

    /* renamed from: d */
    private final View m21666d() {
        return (FrameLayout) this.f15787V.findViewById(C7231w.vpn_error_container);
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public void mo4127b(C0722m mVar) {
        Flowable a = this.f15788c.mo19964a().mo30071a(C11992a.m38600a());
        C12880j.m40222a((Object) a, "vpnBlocking.vpnStatusStr…dSchedulers.mainThread())");
        C10541b a2 = C10541b.m33255a(mVar, C0716a.ON_DESTROY);
        C12880j.m40222a((Object) a2, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a3 = a.mo30079a((C11932e<T, ? extends R>) C11793e.m37930a((C11790c0) a2));
        C12880j.m40222a(a3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11842x) a3).mo29927a(new C7139a(this), C7140b.f15790c);
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

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21663a(C7142a aVar) {
        if (aVar instanceof C7143a) {
            m21664a((Throwable) ((C7143a) aVar).mo19967a());
        } else if (C12880j.m40224a((Object) aVar, (Object) C7144b.f15794a)) {
            m21665b();
        } else {
            throw new C12898l();
        }
    }

    /* renamed from: a */
    private final void m21664a(Throwable th) {
        if (m21666d() == null) {
            View inflate = this.f15787V.getLayoutInflater().inflate(C7232x.vpn_blocked_view, (ViewGroup) this.f15787V.findViewById(16908290), true);
            C12880j.m40222a((Object) inflate, "view");
            TextView textView = (TextView) inflate.findViewById(C7231w.vpn_error_message);
            C12880j.m40222a((Object) textView, "view.vpn_error_message");
            textView.setText(this.f15786U.mo20537a(th));
        }
    }

    /* renamed from: b */
    private final void m21665b() {
        View d = m21666d();
        if (d != null) {
            ViewParent parent = d.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(d);
                return;
            }
            throw new C13142s("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }
}
