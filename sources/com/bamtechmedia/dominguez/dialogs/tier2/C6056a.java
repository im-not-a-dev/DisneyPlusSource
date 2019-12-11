package com.bamtechmedia.dominguez.dialogs.tier2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.analytics.C2334a;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.core.p218n.C5783b;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import java.util.HashMap;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p299m.C7539b;
import p163g.p201e.p203b.p299m.C7542e;
import p163g.p201e.p203b.p299m.C7543f;
import p163g.p201e.p203b.p299m.C7546g;
import p163g.p201e.p203b.p299m.C7562t;
import p163g.p201e.p203b.p299m.C7564v;
import p163g.p201e.p203b.p299m.C7565w;
import p512h.p513c.p514k.C11885d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\f\u0010'\u001a\u00020\u0016*\u00020\u001dH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialogs/tier2/Tier2DialogTvFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "()V", "activePageOverride", "Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;", "getActivePageOverride", "()Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;", "setActivePageOverride", "(Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;)V", "dialogAnalytics", "Lcom/bamtechmedia/dominguez/dialogs/DialogAnalytics;", "getDialogAnalytics", "()Lcom/bamtechmedia/dominguez/dialogs/DialogAnalytics;", "setDialogAnalytics", "(Lcom/bamtechmedia/dominguez/dialogs/DialogAnalytics;)V", "dialogArguments", "Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;", "getDialogArguments", "()Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;", "dialogArguments$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "onClick", "", "which", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "setAccessibilityDelegate", "Companion", "dialogs_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.dialogs.tier2.a */
/* compiled from: Tier2DialogTvFragment.kt */
public final class C6056a extends C11885d {

    /* renamed from: Y */
    static final /* synthetic */ KProperty[] f13949Y = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6056a.class), "dialogArguments", "getDialogArguments()Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;"))};

    /* renamed from: Z */
    public static final C6057a f13950Z = new C6057a(null);

    /* renamed from: U */
    public C2334a f13951U;

    /* renamed from: V */
    public C7542e f13952V;

    /* renamed from: W */
    private final C5883w f13953W = C5839j.m18852a("dialogArguments", (Function0) null, 2, (Object) null);

    /* renamed from: X */
    private HashMap f13954X;

    /* renamed from: com.bamtechmedia.dominguez.dialogs.tier2.a$a */
    /* compiled from: Tier2DialogTvFragment.kt */
    public static final class C6057a implements C6062c {
        private C6057a() {
        }

        /* renamed from: a */
        public void mo18314a(C5783b bVar, C7543f fVar) {
            C6056a aVar = new C6056a();
            aVar.setArguments(C5833g.m18829a(C12907r.m40244a("dialogArguments", fVar)));
            bVar.mo17668a(aVar, "Tier2DialogTvFragment");
        }

        public /* synthetic */ C6057a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dialogs.tier2.a$b */
    /* compiled from: Tier2DialogTvFragment.kt */
    static final class C6058b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6056a f13955c;

        C6058b(C6056a aVar) {
            this.f13955c = aVar;
        }

        public final void onClick(View view) {
            this.f13955c.m19417b(-1);
            this.f13955c.dismissAllowingStateLoss();
            String Y = this.f13955c.m19418p().mo20442Y();
            if (Y != null) {
                this.f13955c.mo18313o().mo20440a(Y);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dialogs.tier2.a$c */
    /* compiled from: Tier2DialogTvFragment.kt */
    static final class C6059c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6056a f13956c;

        C6059c(C6056a aVar) {
            this.f13956c = aVar;
        }

        public final void onClick(View view) {
            this.f13956c.m19417b(-2);
            String X = this.f13956c.m19418p().mo20441X();
            if (X != null) {
                this.f13956c.mo18313o().mo20440a(X);
            }
            this.f13956c.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dialogs.tier2.a$d */
    /* compiled from: Tier2DialogTvFragment.kt */
    public static final class C6060d extends AccessibilityDelegate {

        /* renamed from: a */
        final /* synthetic */ C6056a f13957a;

        C6060d(C6056a aVar) {
            this.f13957a = aVar;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (accessibilityNodeInfo != null) {
                Integer i0 = this.f13957a.m19418p().mo20455i0();
                accessibilityNodeInfo.setText(i0 != null ? C5880u.m18936a(i0.intValue()) : null);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent != null) {
                List text = accessibilityEvent.getText();
                if (text != null) {
                    text.clear();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m19417b(int i) {
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        C7539b.m22448a(requireActivity, m19418p().mo20459m0(), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final C7543f m19418p() {
        return (C7543f) this.f13953W.mo17776a(this, f13949Y[0]);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f13954X;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f13954X == null) {
            this.f13954X = new HashMap();
        }
        View view = (View) this.f13954X.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13954X.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: o */
    public final C7542e mo18313o() {
        C7542e eVar = this.f13952V;
        if (eVar != null) {
            return eVar;
        }
        C12880j.m40227c("dialogAnalytics");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        setStyle(2, C7565w.AppTheme_NoActionBar_Main);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7564v.fragment_tier2_message_tv, viewGroup, false);
        C12880j.m40222a((Object) inflate, "inflater.inflate(R.layou…age_tv, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        C7539b.m22447a(requireActivity);
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView = (TextView) _$_findCachedViewById(C7562t.tier2DialogTitle);
        C12880j.m40222a((Object) textView, "tier2DialogTitle");
        textView.setText(C7546g.m22500f(m19418p()));
        TextView textView2 = (TextView) _$_findCachedViewById(C7562t.tier2DialogSubtitle);
        C12880j.m40222a((Object) textView2, "tier2DialogSubtitle");
        textView2.setText(C7546g.m22494a(m19418p()));
        String h0 = m19418p().mo20453h0();
        if (h0 != null) {
            C2334a aVar = this.f13951U;
            if (aVar != null) {
                C2378m mVar = new C2378m(h0, null, null, null, 12, null);
                aVar.mo11443a(mVar);
            } else {
                C12880j.m40227c("activePageOverride");
                throw null;
            }
        }
        AppCompatButton appCompatButton = (AppCompatButton) _$_findCachedViewById(C7562t.tier2DialogFirstButton);
        appCompatButton.setText(C7546g.m22499e(m19418p()));
        m19415a((View) appCompatButton);
        appCompatButton.setOnClickListener(new C6058b(this));
        Integer j0 = m19418p().mo20456j0();
        if (j0 != null) {
            appCompatButton.setBackgroundResource(j0.intValue());
        }
        AppCompatButton appCompatButton2 = (AppCompatButton) _$_findCachedViewById(C7562t.tier2DialogSecondButton);
        int i = 0;
        if (C7546g.m22496b(m19418p()) == null) {
            i = 4;
        }
        appCompatButton2.setVisibility(i);
        appCompatButton2.setText(C7546g.m22496b(m19418p()));
        appCompatButton2.setContentDescription(C7546g.m22497c(m19418p()));
        appCompatButton2.setOnClickListener(new C6059c(this));
    }

    /* renamed from: a */
    private final void m19415a(View view) {
        view.setAccessibilityDelegate(new C6060d(this));
    }
}
