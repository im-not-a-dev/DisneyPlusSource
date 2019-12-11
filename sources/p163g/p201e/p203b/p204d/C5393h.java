package p163g.p201e.p203b.p204d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.subscription.Subscription;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5641a;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p204d.C5419r.C5420a;
import p163g.p201e.p203b.p204d.p206w0.C5490a;
import p163g.p201e.p203b.p204d.p207x0.C5512b;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010-\u001a\u00020.H\u0016J\u001e\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0016J$\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010C\u001a\u0002002\u0006\u0010D\u001a\u000207H\u0016J\b\u0010E\u001a\u000200H\u0016J\b\u0010F\u001a\u000200H\u0016J\u001a\u0010G\u001a\u0002002\u0006\u0010H\u001a\u00020<2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020KH\u0002R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006L"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/AccountSettingsFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "analytics", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAnalytics;)V", "checker", "Lcom/bamtechmedia/dominguez/account/AccountSettingsViewedChecker;", "getChecker", "()Lcom/bamtechmedia/dominguez/account/AccountSettingsViewedChecker;", "setChecker", "(Lcom/bamtechmedia/dominguez/account/AccountSettingsViewedChecker;)V", "email", "", "itemsFactory", "Lcom/bamtechmedia/dominguez/account/item/AccountSettingsItemsFactory;", "getItemsFactory", "()Lcom/bamtechmedia/dominguez/account/item/AccountSettingsItemsFactory;", "setItemsFactory", "(Lcom/bamtechmedia/dominguez/account/item/AccountSettingsItemsFactory;)V", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "getOtpRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "setOtpRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;)V", "viewModel", "Lcom/bamtechmedia/dominguez/account/AccountSettingsViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/account/AccountSettingsViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/account/AccountSettingsViewModel;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "onAccountUpdate", "", "account", "Lcom/bamtech/sdk4/account/DefaultAccount;", "subscriptions", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "onAlertDialogAction", "", "requestId", "", "which", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRetryClicked", "isOffline", "onStart", "onStop", "onViewCreated", "view", "updateViewState", "newState", "Lcom/bamtechmedia/dominguez/account/AccountSettingsViewModel$State;", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.h */
/* compiled from: AccountSettingsFragment.kt */
public final class C5393h extends C11890i implements C2413n, C7536a, C5641a {

    /* renamed from: U */
    public C5419r f12899U;

    /* renamed from: V */
    public C11848c<C11863k> f12900V;

    /* renamed from: W */
    public C5512b f12901W;

    /* renamed from: X */
    public C2755d f12902X;

    /* renamed from: Y */
    public C5490a f12903Y;

    /* renamed from: Z */
    public C5434u f12904Z;

    /* renamed from: a0 */
    private String f12905a0;

    /* renamed from: b0 */
    private HashMap f12906b0;

    /* renamed from: g.e.b.d.h$a */
    /* compiled from: AccountSettingsFragment.kt */
    static final class C5394a extends C12881k implements Function1<C5420a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5393h f12907c;

        C5394a(C5393h hVar) {
            this.f12907c = hVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17141a(C5420a aVar) {
            this.f12907c.m18138a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17141a((C5420a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.d.h$b */
    /* compiled from: AccountSettingsFragment.kt */
    static final class C5395b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5393h f12908c;

        C5395b(C5393h hVar) {
            this.f12908c = hVar;
            super(0);
        }

        public final void invoke() {
            this.f12908c.requireActivity().onBackPressed();
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f12906b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f12906b0 == null) {
            this.f12906b0 = new HashMap();
        }
        View view = (View) this.f12906b0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f12906b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5413o0.fragment_account_settings, viewGroup, false);
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "inflater.inflate(R.layou…ttings, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onRetryClicked(boolean z) {
        C5419r rVar = this.f12899U;
        if (rVar != null) {
            rVar.mo17150y();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        C5419r rVar = this.f12899U;
        String str = "viewModel";
        if (rVar != null) {
            C5755i.m18679a(this, rVar, null, null, new C5394a(this), 6, null);
            C5419r rVar2 = this.f12899U;
            if (rVar2 != null) {
                rVar2.mo17150y();
                C5434u uVar = this.f12904Z;
                if (uVar != null) {
                    uVar.mo17167a(true);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("checker");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }

    public void onStop() {
        ((NoConnectionView) _$_findCachedViewById(C5411n0.accountNoConnection)).mo2144c();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C5411n0.recyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) findViewById, "view.findViewById(R.id.recyclerView)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C5411n0.disneyToolbar);
        if (disneyTitleToolbar != null) {
            DisneyTitleToolbar.m18445a(disneyTitleToolbar, recyclerView, null, null, null, null, 0, new C5395b(this), 62, null);
        }
        C11848c<C11863k> cVar = this.f12900V;
        if (cVar != null) {
            RecyclerViewExtKt.m18800a(this, recyclerView, cVar);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18138a(C5420a aVar) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5411n0.progressBar);
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "progressBar");
        int i = 0;
        progressBar.setVisibility(aVar.mo17155d() && !aVar.mo17153b() ? 0 : 8);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5411n0.advisories);
        if (linearLayout != null) {
            C4127b0.m14131b(linearLayout, !aVar.mo17153b());
        }
        TextView textView = (TextView) _$_findCachedViewById(C5411n0.accountTitle);
        if (textView != null) {
            C4127b0.m14131b(textView, !aVar.mo17153b());
        }
        View _$_findCachedViewById = _$_findCachedViewById(C5411n0.recyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "recyclerView");
        if (!(!aVar.mo17153b())) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        if (aVar.mo17153b()) {
            ((NoConnectionView) _$_findCachedViewById(C5411n0.accountNoConnection)).mo17432a(aVar.mo17156e());
            NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C5411n0.accountNoConnection);
            if (noConnectionView != null) {
                noConnectionView.setRetryListener(this);
            }
        } else if (!(aVar.mo17151a() == null || aVar.mo17154c() == null)) {
            NoConnectionView noConnectionView2 = (NoConnectionView) _$_findCachedViewById(C5411n0.accountNoConnection);
            Intrinsics.checkReturnedValueIsNotNull((Object) noConnectionView2, "accountNoConnection");
            noConnectionView2.setVisibility(8);
            m18136a(aVar.mo17151a(), aVar.mo17154c());
        }
        if (!aVar.mo17155d()) {
            _$_findCachedViewById(C5411n0.recyclerView).requestFocus();
        }
    }

    /* renamed from: a */
    private final void m18136a(DefaultAccount defaultAccount, List<Subscription> list) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5411n0.progressBar);
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "progressBar");
        C5852n0.m18887b(progressBar);
        Object obj = defaultAccount.getAttributes().get("email");
        if (!(obj instanceof String)) {
            obj = null;
        }
        this.f12905a0 = (String) obj;
        C11848c<C11863k> cVar = this.f12900V;
        if (cVar != null) {
            C5490a aVar = this.f12903Y;
            if (aVar != null) {
                cVar.mo29963a((Collection<? extends C11847b>) aVar.mo17239a(defaultAccount, list));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("itemsFactory");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        String str = "analytics";
        if (i2 == -2) {
            C5512b bVar = this.f12901W;
            if (bVar != null) {
                bVar.mo17271a();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else if (i2 == -1) {
            C5512b bVar2 = this.f12901W;
            if (bVar2 != null) {
                bVar2.mo17275e();
                String str2 = this.f12905a0;
                if (str2 != null) {
                    C2755d dVar = this.f12902X;
                    if (dVar != null) {
                        dVar.mo11770a(str2, false);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("otpRouter");
                        throw null;
                    }
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        }
        return true;
    }
}
