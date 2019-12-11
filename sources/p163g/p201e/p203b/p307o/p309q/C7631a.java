package p163g.p201e.p203b.p307o.p309q;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.config.C3575s0;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5838i0;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p307o.C7621k;
import p163g.p201e.p203b.p307o.C7622l;
import p163g.p201e.p203b.p307o.C7623m;
import p163g.p201e.p203b.p307o.p309q.C7636c.C7637a;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/error/contactus/ContactCustomerServiceFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "appDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "getAppDictionary", "()Lcom/bamtechmedia/dominguez/config/StringDictionary;", "setAppDictionary", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "viewModel", "Lcom/bamtechmedia/dominguez/error/contactus/ContactCustomerServiceViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/error/contactus/ContactCustomerServiceViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/error/contactus/ContactCustomerServiceViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "setupCallButton", "countryCode", "", "updateViews", "error_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.o.q.a */
/* compiled from: ContactCustomerServiceFragment.kt */
public final class C7631a extends C11890i {

    /* renamed from: U */
    public C3572r0 f16643U;

    /* renamed from: V */
    public C7636c f16644V;

    /* renamed from: W */
    private HashMap f16645W;

    /* renamed from: g.e.b.o.q.a$a */
    /* compiled from: ContactCustomerServiceFragment.kt */
    static final class C7632a extends C12881k implements Function1<C7637a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7631a f16646c;

        C7632a(C7631a aVar) {
            this.f16646c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20554a(C7637a aVar) {
            this.f16646c.m22620f(aVar.mo20558a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20554a((C7637a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.o.q.a$b */
    /* compiled from: ContactCustomerServiceFragment.kt */
    static final class C7633b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7631a f16647c;

        C7633b(C7631a aVar) {
            this.f16647c = aVar;
        }

        public final void onClick(View view) {
            this.f16647c.requireFragmentManager().mo3161g();
        }
    }

    /* renamed from: g.e.b.o.q.a$c */
    /* compiled from: ContactCustomerServiceFragment.kt */
    static final class C7634c implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ String f16648U;

        /* renamed from: c */
        final /* synthetic */ C7631a f16649c;

        C7634c(C7631a aVar, String str) {
            this.f16649c = aVar;
            this.f16648U = str;
        }

        public final void onClick(View view) {
            C7631a aVar = this.f16649c;
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(this.f16648U);
            aVar.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(sb.toString())));
        }
    }

    /* renamed from: e */
    private final void m22619e(String str) {
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        if (C5837i.m18840b(requireContext)) {
            C3572r0 r0Var = this.f16643U;
            if (r0Var != null) {
                String string = requireContext().getString(C7623m.contact_csr_phone);
                Intrinsics.checkReturnedValueIsNotNull((Object) string, "requireContext().getStri…string.contact_csr_phone)");
                String a = C3575s0.m12040a(r0Var, string, C5838i0.m18844a(str), null, 4, null);
                Button button = (Button) _$_findCachedViewById(C7621k.callButton);
                if (button != null) {
                    button.setText(C5880u.m18936a(C7623m.btn_call_customer_service));
                }
                Button button2 = (Button) _$_findCachedViewById(C7621k.callButton);
                if (button2 != null) {
                    button2.setOnClickListener(new C7634c(this, a));
                    return;
                }
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("appDictionary");
            throw null;
        }
        Button button3 = (Button) _$_findCachedViewById(C7621k.callButton);
        if (button3 != null) {
            C4127b0.m14131b(button3, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m22620f(String str) {
        TextView textView = (TextView) _$_findCachedViewById(C7621k.title);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "title");
        C3572r0 r0Var = this.f16643U;
        String str2 = "appDictionary";
        if (r0Var != null) {
            textView.setText(C3573a.m12035a(r0Var, C7623m.contact_csr_title, (Map) null, 2, (Object) null));
            TextView textView2 = (TextView) _$_findCachedViewById(C7621k.subtitle);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "subtitle");
            C3572r0 r0Var2 = this.f16643U;
            if (r0Var2 != null) {
                String string = requireContext().getString(C7623m.contact_csr_subtitle);
                Intrinsics.checkReturnedValueIsNotNull((Object) string, "requireContext().getStri…ing.contact_csr_subtitle)");
                textView2.setText(C3575s0.m12040a(r0Var2, string, C5838i0.m18844a(str), null, 4, null));
                Context requireContext = requireContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
                String str3 = "dismissButton";
                if (C5837i.m18843e(requireContext)) {
                    Button button = (Button) _$_findCachedViewById(C7621k.dismissButton);
                    Intrinsics.checkReturnedValueIsNotNull((Object) button, str3);
                    button.setText(C5880u.m18936a(C7623m.btn_ok));
                    return;
                }
                Button button2 = (Button) _$_findCachedViewById(C7621k.dismissButton);
                Intrinsics.checkReturnedValueIsNotNull((Object) button2, str3);
                button2.setText(C5880u.m18936a(C7623m.btn_dismiss));
                m22619e(str);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str2);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(str2);
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16645W;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16645W == null) {
            this.f16645W = new HashMap();
        }
        View view = (View) this.f16645W.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16645W.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7622l.fragment_contact_cust_service, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C7636c cVar = this.f16644V;
        if (cVar != null) {
            C5755i.m18679a(this, cVar, null, null, new C7632a(this), 6, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C5852n0.m18884a(view, false, false, null, 7, null);
        ((Button) _$_findCachedViewById(C7621k.dismissButton)).setOnClickListener(new C7633b(this));
    }
}
