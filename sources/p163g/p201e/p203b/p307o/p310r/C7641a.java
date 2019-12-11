package p163g.p201e.p203b.p307o.p310r;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0564o;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5641a;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p210g.C5588o;
import p163g.p201e.p203b.p210g.C5597p;
import p163g.p201e.p203b.p307o.C7621k;
import p163g.p201e.p203b.p307o.C7622l;
import p163g.p201e.p203b.p307o.p308p.C7630d;
import p512h.p513c.p514k.C11890i;
import p520io.reactivex.functions.C11945a;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u001fH\u0016J\u001a\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/error/tier3/NoConnectionFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "()V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "offlineViewModel", "Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;", "getOfflineViewModel", "()Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;", "setOfflineViewModel", "(Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;)V", "reloadListener", "Lcom/bamtechmedia/dominguez/error/api/ReloadListener;", "getReloadListener", "()Lcom/bamtechmedia/dominguez/error/api/ReloadListener;", "setReloadListener", "(Lcom/bamtechmedia/dominguez/error/api/ReloadListener;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOfflineStateUpdate", "", "timerState", "Lcom/bamtechmedia/dominguez/connectivity/TimerState;", "onRetryClicked", "isOffline", "", "onStart", "onStop", "onViewCreated", "view", "Companion", "error_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.o.r.a */
/* compiled from: NoConnectionFragment.kt */
public final class C7641a extends C11890i implements C5641a {

    /* renamed from: U */
    public C5588o f16655U;

    /* renamed from: V */
    public C3796d f16656V;

    /* renamed from: W */
    public C7630d f16657W;

    /* renamed from: X */
    private HashMap f16658X;

    /* renamed from: g.e.b.o.r.a$a */
    /* compiled from: NoConnectionFragment.kt */
    public static final class C7642a {
        private C7642a() {
        }

        public /* synthetic */ C7642a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.o.r.a$b */
    /* compiled from: NoConnectionFragment.kt */
    static final class C7643b extends C12881k implements Function1<C5597p, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7641a f16659c;

        C7643b(C7641a aVar) {
            this.f16659c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20568a(C5597p pVar) {
            this.f16659c.m22632a(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20568a((C5597p) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.o.r.a$c */
    /* compiled from: NoConnectionFragment.kt */
    static final class C7644c implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7641a f16660a;

        C7644c(C7641a aVar) {
            this.f16660a = aVar;
        }

        public final void run() {
            Fragment parentFragment = this.f16660a.getParentFragment();
            if (parentFragment != null) {
                C0538i childFragmentManager = parentFragment.getChildFragmentManager();
                if (childFragmentManager != null) {
                    C0564o a = childFragmentManager.mo3147a();
                    if (a != null) {
                        a.mo3045c(this.f16660a);
                        if (a != null) {
                            a.mo3049d();
                        }
                    }
                }
            }
            this.f16660a.mo20567o().mo11889f();
        }
    }

    /* renamed from: g.e.b.o.r.a$d */
    /* compiled from: NoConnectionFragment.kt */
    static final /* synthetic */ class C7645d extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7645d f16661c = new C7645d();

        C7645d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20569a(Throwable th) {
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
            mo20569a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C7642a(null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16658X;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16658X == null) {
            this.f16658X = new HashMap();
        }
        View view = (View) this.f16658X.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16658X.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: o */
    public final C7630d mo20567o() {
        C7630d dVar = this.f16657W;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reloadListener");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7622l.fragment_no_connection, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onRetryClicked(boolean z) {
        if (z) {
            C5588o oVar = this.f16655U;
            if (oVar != null) {
                oVar.mo17342y();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("offlineViewModel");
                throw null;
            }
        }
        C7630d dVar = this.f16657W;
        if (dVar != null) {
            dVar.mo11889f();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("reloadListener");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        C5588o oVar = this.f16655U;
        if (oVar != null) {
            C5755i.m18679a(this, oVar, null, null, new C7643b(this), 6, null);
            ((NoConnectionView) _$_findCachedViewById(C7621k.noConnection)).setRetryListener(this);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("offlineViewModel");
        throw null;
    }

    public void onStop() {
        super.onStop();
        ((NoConnectionView) _$_findCachedViewById(C7621k.noConnection)).mo2144c();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [g.e.b.o.r.a$d, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r1v1, types: [g.e.b.o.r.c] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            super.onViewCreated(r3, r4)
            com.bamtechmedia.dominguez.core.utils.o r3 = com.bamtechmedia.dominguez.core.utils.C5855o.f13640a
            int r3 = p163g.p201e.p203b.p307o.C7621k.noConnection
            android.view.View r3 = r2._$_findCachedViewById(r3)
            com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView r3 = (com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView) r3
            com.bamtechmedia.dominguez.core.d r4 = r2.f16656V
            r0 = 0
            java.lang.String r1 = "offlineState"
            if (r4 == 0) goto L_0x0065
            boolean r4 = r4.mo13695j()
            r3.mo17432a(r4)
            com.bamtechmedia.dominguez.core.d r3 = r2.f16656V
            if (r3 == 0) goto L_0x0061
            boolean r3 = r3.mo13695j()
            if (r3 != 0) goto L_0x0060
            com.bamtechmedia.dominguez.core.d r3 = r2.f16656V
            if (r3 == 0) goto L_0x005c
            io.reactivex.Completable r3 = r3.mo13697n()
            androidx.lifecycle.i$a r4 = androidx.lifecycle.C0715i.C0716a.ON_STOP
            com.uber.autodispose.android.lifecycle.b r4 = com.uber.autodispose.android.lifecycle.C10541b.m33255a(r2, r4)
            java.lang.String r0 = "AndroidLifecycleScopePro…om(\n    this, untilEvent)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r0)
            g.n.a.h r4 = p163g.p503n.p504a.C11793e.m37930a(r4)
            java.lang.Object r3 = r3.mo30048a(r4)
            java.lang.String r4 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            g.n.a.v r3 = (p163g.p503n.p504a.C11839v) r3
            g.e.b.o.r.a$c r4 = new g.e.b.o.r.a$c
            r4.<init>(r2)
            g.e.b.o.r.a$d r0 = p163g.p201e.p203b.p307o.p310r.C7641a.C7645d.f16661c
            if (r0 == 0) goto L_0x0056
            g.e.b.o.r.c r1 = new g.e.b.o.r.c
            r1.<init>(r0)
            r0 = r1
        L_0x0056:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r3.mo29926a(r4, r0)
            goto L_0x0060
        L_0x005c:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r0
        L_0x0060:
            return
        L_0x0061:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r0
        L_0x0065:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p307o.p310r.C7641a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22632a(C5597p pVar) {
        if (C7646b.$EnumSwitchMapping$0[pVar.ordinal()] != 1) {
            ((NoConnectionView) _$_findCachedViewById(C7621k.noConnection)).mo17433b(false);
        } else {
            ((NoConnectionView) _$_findCachedViewById(C7621k.noConnection)).mo17433b(true);
        }
    }
}
