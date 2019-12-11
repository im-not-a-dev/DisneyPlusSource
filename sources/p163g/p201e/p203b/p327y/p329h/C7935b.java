package p163g.p201e.p203b.p327y.p329h;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2747a;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2747a.C2748a;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.HashMap;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p327y.C7926c;
import p163g.p201e.p203b.p327y.C7927d;
import p163g.p201e.p203b.p327y.C7928e;
import p163g.p201e.p203b.p327y.C7929f;
import p163g.p201e.p203b.p327y.p328g.C7931b;
import p163g.p201e.p203b.p327y.p328g.C7932c;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0002J\u001a\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/portability/serviceunavailable/ServiceUnavailableFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "logOutHelper", "Lcom/bamtechmedia/dominguez/auth/api/helper/LogOutHelper;", "getLogOutHelper", "()Lcom/bamtechmedia/dominguez/auth/api/helper/LogOutHelper;", "setLogOutHelper", "(Lcom/bamtechmedia/dominguez/auth/api/helper/LogOutHelper;)V", "router", "Lcom/bamtechmedia/dominguez/portability/api/ServiceUnavailableRouter;", "getRouter", "()Lcom/bamtechmedia/dominguez/portability/api/ServiceUnavailableRouter;", "setRouter", "(Lcom/bamtechmedia/dominguez/portability/api/ServiceUnavailableRouter;)V", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "getStringDictionary", "()Lcom/bamtechmedia/dominguez/config/StringDictionary;", "setStringDictionary", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "bindLoginButton", "", "bindLogoutButton", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onServiceAvailabilityClicked", "onViewCreated", "view", "Companion", "portability_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.y.h.b */
/* compiled from: ServiceUnavailableFragment.kt */
public final class C7935b extends C11890i {

    /* renamed from: Y */
    public static final C7936a f17068Y = new C7936a(null);

    /* renamed from: U */
    public C7932c f17069U;

    /* renamed from: V */
    public C3572r0 f17070V;

    /* renamed from: W */
    public C2747a f17071W;

    /* renamed from: X */
    private HashMap f17072X;

    /* renamed from: g.e.b.y.h.b$a */
    /* compiled from: ServiceUnavailableFragment.kt */
    public static final class C7936a implements C7931b {
        private C7936a() {
        }

        public /* synthetic */ C7936a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public C7935b m23161a(boolean z) {
            C7935b bVar = new C7935b();
            bVar.setArguments(C5833g.m18829a(C12907r.m40244a("loggedIn", Boolean.valueOf(z))));
            return bVar;
        }
    }

    /* renamed from: g.e.b.y.h.b$b */
    /* compiled from: ServiceUnavailableFragment.kt */
    static final class C7937b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7935b f17073c;

        C7937b(C7935b bVar) {
            this.f17073c = bVar;
        }

        public final void onClick(View view) {
            this.f17073c.mo20843p().mo20838a();
        }
    }

    /* renamed from: g.e.b.y.h.b$c */
    /* compiled from: ServiceUnavailableFragment.kt */
    static final class C7938c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7935b f17074c;

        C7938c(C7935b bVar) {
            this.f17074c = bVar;
        }

        public final void onClick(View view) {
            C2747a o = this.f17074c.mo20842o();
            C10541b a = C10541b.m33254a((C0722m) this.f17074c);
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "AndroidLifecycleScopeProvider.from(\n    this)");
            C2748a.m10387a(o, a, false, 2, null);
        }
    }

    /* renamed from: g.e.b.y.h.b$d */
    /* compiled from: ServiceUnavailableFragment.kt */
    static final class C7939d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7935b f17075c;

        C7939d(C7935b bVar) {
            this.f17075c = bVar;
        }

        public final void onClick(View view) {
            this.f17075c.m23157s();
        }
    }

    /* renamed from: q */
    private final void m23155q() {
        View _$_findCachedViewById = _$_findCachedViewById(C7927d.serviceUnavailableLoginButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "serviceUnavailableLoginButton");
        Bundle arguments = getArguments();
        int i = 0;
        if (!(arguments != null && !arguments.getBoolean("loggedIn"))) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        _$_findCachedViewById(C7927d.serviceUnavailableLoginButton).setOnClickListener(new C7937b(this));
        _$_findCachedViewById(C7927d.serviceUnavailableLoginButton).requestFocus();
    }

    /* renamed from: r */
    private final void m23156r() {
        View _$_findCachedViewById = _$_findCachedViewById(C7927d.serviceUnavailableLogoutButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "serviceUnavailableLogoutButton");
        Bundle arguments = getArguments();
        int i = 0;
        boolean z = true;
        if (arguments == null || !arguments.getBoolean("loggedIn")) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        _$_findCachedViewById(C7927d.serviceUnavailableLogoutButton).setOnClickListener(new C7938c(this));
        _$_findCachedViewById(C7927d.serviceUnavailableLogoutButton).requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m23157s() {
        C3572r0 r0Var = this.f17070V;
        if (r0Var != null) {
            String a = C3573a.m12035a(r0Var, C7929f.service_availability_url, (Map) null, 2, (Object) null);
            C7932c cVar = this.f17069U;
            if (cVar != null) {
                cVar.mo20839a(a);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("router");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("stringDictionary");
            throw null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f17072X;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f17072X == null) {
            this.f17072X = new HashMap();
        }
        View view = (View) this.f17072X.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f17072X.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: o */
    public final C2747a mo20842o() {
        C2747a aVar = this.f17071W;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logOutHelper");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7928e.fragment_service_unavailable, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0532d activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                Context context = view.getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context, "view.context");
                window.setNavigationBarColor(C5837i.m18835a(context, C7926c.navBarBackground, null, false, 6, null));
            }
        }
        TextView textView = (TextView) _$_findCachedViewById(C7927d.serviceUnavailableAvailabilityButton);
        if (textView != null) {
            textView.setOnClickListener(new C7939d(this));
        }
        m23155q();
        m23156r();
    }

    /* renamed from: p */
    public final C7932c mo20843p() {
        C7932c cVar = this.f17069U;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("router");
        throw null;
    }
}
