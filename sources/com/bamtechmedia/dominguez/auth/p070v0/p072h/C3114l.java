package com.bamtechmedia.dominguez.auth.p070v0.p072h;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.C2718i0;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p070v0.C3034c;
import com.bamtechmedia.dominguez.auth.p070v0.C3039e;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3126n.C3127a;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5704a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.FieldInputLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.legal.api.ActivityLegalRouter;
import com.bamtechmedia.dominguez.legal.api.LegalRouter;
import com.bamtechmedia.dominguez.legal.api.LegalRouter.DefaultImpls;
import com.bamtechmedia.dominguez.legal.api.MarketingInput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p163g.p201e.p203b.p307o.p308p.C7630d;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010-\u001a\u00020.H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0002J\b\u00102\u001a\u000203H\u0002J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u000203H\u0016J\b\u0010=\u001a\u000203H\u0016J\b\u0010>\u001a\u000203H\u0016J\u001a\u0010?\u001a\u0002032\u0006\u0010@\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u0002032\u0006\u0010E\u001a\u00020CH\u0002J\u0010\u0010F\u001a\u0002032\u0006\u0010G\u001a\u00020\u0013H\u0002J\u0010\u0010H\u001a\u0002032\u0006\u0010I\u001a\u00020\u0013H\u0002J\u0016\u0010J\u001a\u0002032\f\u0010K\u001a\b\u0012\u0004\u0012\u00020L00H\u0002R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006M"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/error/api/ReloadListener;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "analytics", "Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;)V", "isOnline", "", "()Z", "legalRouter", "Lcom/bamtechmedia/dominguez/legal/api/LegalRouter;", "getLegalRouter", "()Lcom/bamtechmedia/dominguez/legal/api/LegalRouter;", "setLegalRouter", "(Lcom/bamtechmedia/dominguez/legal/api/LegalRouter;)V", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "getOfflineRouter", "()Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "setOfflineRouter", "(Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;)V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "viewModel", "Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailViewModel;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "getMarketingOptIns", "", "Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "initializeViews", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onReloadRequested", "onStart", "onStop", "onViewCreated", "view", "renderViewState", "viewState", "Lcom/bamtechmedia/dominguez/auth/validation/signup/SignupEmailViewModel$ViewState;", "showError", "newState", "showInitialLoading", "isInitialLoading", "showLoading", "isLoading", "showMarketingAndLegalItems", "viewItems", "Lcom/xwray/groupie/Group;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l */
/* compiled from: SignupEmailFragment.kt */
public final class C3114l extends C11890i implements C2413n, C7630d {

    /* renamed from: U */
    public C3126n f8014U;

    /* renamed from: V */
    public C11848c<C11863k> f8015V;

    /* renamed from: W */
    public C3105e f8016W;

    /* renamed from: X */
    public C7629c f8017X;
    @ActivityLegalRouter

    /* renamed from: Y */
    public LegalRouter f8018Y;

    /* renamed from: Z */
    public C3796d f8019Z;

    /* renamed from: a0 */
    private HashMap f8020a0;

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$a */
    /* compiled from: SignupEmailFragment.kt */
    static final class C3115a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3114l f8021c;

        C3115a(C3114l lVar) {
            this.f8021c = lVar;
            super(0);
        }

        public final void invoke() {
            TextView textView = (TextView) this.f8021c._$_findCachedViewById(C2716h0.signUpTitle);
            if (textView != null) {
                C5880u.m18941a(textView, C2721j0.sign_up_title);
            }
            TextView textView2 = (TextView) this.f8021c._$_findCachedViewById(C2716h0.signUpSubtitle);
            if (textView2 != null) {
                C5880u.m18941a(textView2, C2721j0.btn_signup);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupEmailInput", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$b */
    /* compiled from: SignupEmailFragment.kt */
    static final class C3116b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3114l f8022c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$b$a */
        /* compiled from: SignupEmailFragment.kt */
        static final class C3117a extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C3116b f8023c;

            C3117a(C3116b bVar) {
                this.f8023c = bVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f8023c.f8022c.getViewModel().mo12155a(str, this.f8023c.f8022c.m10955q());
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$b$b */
        /* compiled from: SignupEmailFragment.kt */
        static final class C3118b extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C3116b f8024c;

            C3118b(C3116b bVar) {
                this.f8024c = bVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f8024c.f8022c.getViewModel().mo12156b(str);
            }
        }

        C3116b(C3114l lVar) {
            this.f8022c = lVar;
            super(0);
        }

        public final void invoke() {
            FieldInputLayout fieldInputLayout = (FieldInputLayout) this.f8022c._$_findCachedViewById(C2716h0.signUpEmailInputLayout);
            if (fieldInputLayout != null) {
                fieldInputLayout.setInputTextValue(this.f8022c.getViewModel().mo12158z());
            }
            FieldInputLayout fieldInputLayout2 = (FieldInputLayout) this.f8022c._$_findCachedViewById(C2716h0.signUpEmailInputLayout);
            if (fieldInputLayout2 != null) {
                C5704a.m18600a(fieldInputLayout2, new C3117a(this), new C3118b(this), C13185o.m40520c((ConstraintLayout) this.f8022c._$_findCachedViewById(C2716h0.signUpEmailContainer), (ConstraintLayout) this.f8022c._$_findCachedViewById(C2716h0.signUpEmailLayout)), false, 8, null);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupContinueButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$c */
    /* compiled from: SignupEmailFragment.kt */
    static final class C3119c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3114l f8025c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$c$a */
        /* compiled from: SignupEmailFragment.kt */
        static final class C3120a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C3119c f8026c;

            C3120a(C3119c cVar) {
                this.f8026c = cVar;
            }

            public final void onClick(View view) {
                Intrinsics.checkReturnedValueIsNotNull((Object) view, "it");
                view.setEnabled(false);
                this.f8026c.f8025c.mo12148o().mo12140a();
                FieldInputLayout fieldInputLayout = (FieldInputLayout) this.f8026c.f8025c._$_findCachedViewById(C2716h0.signUpEmailInputLayout);
                this.f8026c.f8025c.getViewModel().mo12155a(fieldInputLayout != null ? fieldInputLayout.getInputTextValue() : null, this.f8026c.f8025c.m10955q());
            }
        }

        C3119c(C3114l lVar) {
            this.f8025c = lVar;
            super(0);
        }

        public final void invoke() {
            LoadingButton loadingButton = (LoadingButton) this.f8025c._$_findCachedViewById(C2716h0.continueLoadingButton);
            if (loadingButton != null) {
                loadingButton.setText(C2721j0.btn_agree_continue);
            }
            LoadingButton loadingButton2 = (LoadingButton) this.f8025c._$_findCachedViewById(C2716h0.continueLoadingButton);
            if (loadingButton2 != null) {
                loadingButton2.setOnClickListener(new C3120a(this));
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupTermsButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$d */
    /* compiled from: SignupEmailFragment.kt */
    static final class C3121d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3114l f8027c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$d$a */
        /* compiled from: SignupEmailFragment.kt */
        static final class C3122a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C3121d f8028c;

            C3122a(C3121d dVar) {
                this.f8028c = dVar;
            }

            public final void onClick(View view) {
                this.f8028c.f8027c.mo12148o().mo12143c();
                DefaultImpls.showLegalDocument$default(this.f8028c.f8027c.mo12149p(), null, null, 3, null);
            }
        }

        C3121d(C3114l lVar) {
            this.f8027c = lVar;
            super(0);
        }

        public final void invoke() {
            Button button = (Button) this.f8027c._$_findCachedViewById(C2716h0.termsButton);
            if (button != null) {
                button.setOnClickListener(new C3122a(this));
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$e */
    /* compiled from: SignupEmailFragment.kt */
    static final class C3123e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3114l f8029c;

        C3123e(C3114l lVar) {
            this.f8029c = lVar;
            super(0);
        }

        public final void invoke() {
            this.f8029c.mo12148o().mo12142b();
            NestedScrollView nestedScrollView = (NestedScrollView) this.f8029c._$_findCachedViewById(C2716h0.signUpEmailScrollView);
            if (nestedScrollView != null) {
                C5843l.f13627a.mo17743a(nestedScrollView);
            }
            this.f8029c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.h.l$f */
    /* compiled from: SignupEmailFragment.kt */
    static final class C3124f extends C12881k implements Function1<C3127a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3114l f8030c;

        C3124f(C3114l lVar) {
            this.f8030c = lVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12154a(C3127a aVar) {
            this.f8030c.m10950a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12154a((C3127a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: b */
    private final void m10953b(boolean z) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C2716h0.legalese);
        if (recyclerView != null) {
            C4127b0.m14131b(recyclerView, !z);
        }
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(C2716h0.continueLoadingButton);
        if (loadingButton != null) {
            C4127b0.m14131b(loadingButton, !z);
        }
        Button button = (Button) _$_findCachedViewById(C2716h0.termsButton);
        if (button != null) {
            C4127b0.m14131b(button, !z);
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C2716h0.loadingSpinner);
        if (progressBar != null) {
            C4127b0.m14131b(progressBar, z);
        }
    }

    /* renamed from: c */
    private final void m10954c(List<? extends C11847b> list) {
        if (!list.isEmpty()) {
            int i = 0;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((C11847b) it.next()) instanceof C3034c) {
                    break;
                } else {
                    i++;
                }
            }
            Object d = C13199w.m40578d((List) list, i);
            if (!(d instanceof C3034c)) {
                d = null;
            }
            C3034c cVar = (C3034c) d;
            if (cVar != null) {
                cVar.mo12042a(true);
            }
            C11848c<C11863k> cVar2 = this.f8015V;
            if (cVar2 != null) {
                cVar2.mo29963a((Collection<? extends C11847b>) list);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final List<MarketingInput> m10955q() {
        ArrayList arrayList = new ArrayList();
        C11848c<C11863k> cVar = this.f8015V;
        String str = "adapter";
        if (cVar != null) {
            int itemCount = cVar.getItemCount();
            int i = 0;
            while (i < itemCount) {
                C11848c<C11863k> cVar2 = this.f8015V;
                if (cVar2 != null) {
                    C11853e a = cVar2.mo13700a(i);
                    Intrinsics.checkReturnedValueIsNotNull((Object) a, "adapter.getItem(i)");
                    if (((C3039e) (!(a instanceof C3039e) ? null : a)) != null) {
                        C3039e eVar = (C3039e) a;
                        arrayList.add(new MarketingInput(eVar.mo12049a(), eVar.mo12051b()));
                    }
                    i++;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            }
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException(str);
        throw null;
    }

    /* renamed from: r */
    private final void m10956r() {
        C3115a aVar = new C3115a(this);
        C3116b bVar = new C3116b(this);
        C3119c cVar = new C3119c(this);
        C3121d dVar = new C3121d(this);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C2716h0.legalese);
        if (recyclerView != null) {
            C11848c<C11863k> cVar2 = this.f8015V;
            if (cVar2 != null) {
                RecyclerViewExtKt.m18800a(this, recyclerView, cVar2);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                throw null;
            }
        }
        aVar.invoke();
        bVar.invoke();
        cVar.invoke();
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        if (C5837i.m18843e(requireContext)) {
            dVar.invoke();
        }
    }

    /* renamed from: s */
    private final boolean m10957s() {
        C3796d dVar = this.f8019Z;
        if (dVar != null) {
            return dVar.mo13695j();
        }
        Intrinsics.throwUninitializedPropertyAccessException("offlineState");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f8020a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f8020a0 == null) {
            this.f8020a0 = new HashMap();
        }
        View view = (View) this.f8020a0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f8020a0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ONBOARDING_EMAIL, (String) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public void mo11889f() {
        C3126n nVar = this.f8014U;
        if (nVar != null) {
            nVar.mo12157y();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    public final C3126n getViewModel() {
        C3126n nVar = this.f8014U;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C3105e mo12148o() {
        C3105e eVar = this.f8016W;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2718i0.fragment_signup_email, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.signUpEmailOnboardingToolbar);
        if (onboardingToolbar != null) {
            C0532d requireActivity = requireActivity();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
            onboardingToolbar.mo17459a(requireActivity, getView(), (NestedScrollView) _$_findCachedViewById(C2716h0.signUpEmailScrollView), (ConstraintLayout) _$_findCachedViewById(C2716h0.signUpEmailLayout), false, new C3123e(this));
        }
        C3126n nVar = this.f8014U;
        if (nVar != null) {
            C5755i.m18679a(this, nVar, null, null, new C3124f(this), 6, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onStop() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.signUpEmailOnboardingToolbar);
        if (onboardingToolbar != null) {
            onboardingToolbar.setToolbarSet(false);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m10956r();
        if (!m10957s()) {
            C7629c cVar = this.f8017X;
            if (cVar != null) {
                int i = C2716h0.signUpEmailContainer;
                C0538i childFragmentManager = getChildFragmentManager();
                Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
                cVar.mo20550a(i, childFragmentManager);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("offlineRouter");
            throw null;
        }
    }

    /* renamed from: p */
    public final LegalRouter mo12149p() {
        LegalRouter legalRouter = this.f8018Y;
        if (legalRouter != null) {
            return legalRouter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("legalRouter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10950a(C3127a aVar) {
        m10953b(aVar.mo12164e());
        m10951a(aVar.mo12166f());
        m10954c(aVar.mo12163d());
        m10952b(aVar);
    }

    /* renamed from: b */
    private final void m10952b(C3127a aVar) {
        FieldInputLayout fieldInputLayout = (FieldInputLayout) _$_findCachedViewById(C2716h0.signUpEmailInputLayout);
        if (fieldInputLayout != null) {
            fieldInputLayout.mo2144c();
        }
        if (!aVar.mo12162c()) {
            return;
        }
        if (aVar.mo12160a() != null) {
            FieldInputLayout fieldInputLayout2 = (FieldInputLayout) _$_findCachedViewById(C2716h0.signUpEmailInputLayout);
            if (fieldInputLayout2 != null) {
                fieldInputLayout2.mo17574a(aVar.mo12160a());
            }
        } else if (aVar.mo12161b() != null) {
            FieldInputLayout fieldInputLayout3 = (FieldInputLayout) _$_findCachedViewById(C2716h0.signUpEmailInputLayout);
            if (fieldInputLayout3 != null) {
                fieldInputLayout3.mo17574a(C5880u.m18936a(aVar.mo12161b().intValue()));
            }
        }
    }

    /* renamed from: a */
    private final void m10951a(boolean z) {
        if (z) {
            C0532d activity = getActivity();
            if (!(activity instanceof Activity)) {
                activity = null;
            }
            if (activity != null) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    C5843l.f13627a.mo17743a(currentFocus);
                }
            }
        }
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(C2716h0.continueLoadingButton);
        if (z) {
            if (loadingButton != null) {
                loadingButton.mo17425a();
            }
        } else if (loadingButton != null) {
            loadingButton.mo17426b();
        }
        FieldInputLayout fieldInputLayout = (FieldInputLayout) _$_findCachedViewById(C2716h0.signUpEmailInputLayout);
        if (fieldInputLayout != null) {
            fieldInputLayout.mo17570a(!z);
        }
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.signUpEmailOnboardingToolbar);
        if (onboardingToolbar != null) {
            DisneyTitleToolbar disneyToolbar = onboardingToolbar.getDisneyToolbar();
            if (disneyToolbar != null) {
                disneyToolbar.mo17379b(!z);
            }
        }
    }
}
