package com.bamtechmedia.dominguez.core.p218n;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.C0530c;
import androidx.fragment.app.Fragment;
import com.disney.dominguez.navigation.core.C8436a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p437h.p438a.p439a.p440a.C10896d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u001f\u0010\u0007\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\u000bJ\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/navigation/FragmentNavigation;", "Lcom/bamtechmedia/dominguez/core/navigation/DialogFragmentHost;", "navEventHandler", "Lcom/disney/dominguez/navigation/core/NavEventHandler;", "(Lcom/disney/dominguez/navigation/core/NavEventHandler;)V", "goBack", "", "navigateOnFragment", "runOnFragment", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "Lkotlin/ExtensionFunctionType;", "showDialogFragment", "fragment", "Landroidx/fragment/app/DialogFragment;", "tag", "", "startActivity", "requestCode", "", "createIntent", "Landroid/content/Context;", "Landroid/content/Intent;", "Companion", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.n.d */
/* compiled from: FragmentNavigation.kt */
public class C5786d implements C5783b {

    /* renamed from: a */
    private final C8436a f13555a;

    /* renamed from: com.bamtechmedia.dominguez.core.n.d$a */
    /* compiled from: FragmentNavigation.kt */
    public static final class C5787a {
        private C5787a() {
        }

        public /* synthetic */ C5787a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.d$b */
    /* compiled from: FragmentNavigation.kt */
    static final class C5788b extends C12881k implements Function1<Fragment, C13145v> {

        /* renamed from: c */
        public static final C5788b f13556c = new C5788b();

        C5788b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17685a(Fragment fragment) {
            fragment.requireActivity().onBackPressed();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17685a((Fragment) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.d$c */
    /* compiled from: FragmentNavigation.kt */
    static final class C5789c extends C12881k implements Function1<Fragment, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C0530c f13557U;

        /* renamed from: c */
        final /* synthetic */ String f13558c;

        C5789c(String str, C0530c cVar) {
            this.f13558c = str;
            this.f13557U = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17686a(Fragment fragment) {
            if (this.f13558c == null || fragment.getChildFragmentManager().mo3146a(this.f13558c) == null) {
                this.f13557U.show(fragment.getChildFragmentManager(), this.f13558c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17686a((Fragment) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.d$d */
    /* compiled from: FragmentNavigation.kt */
    static final class C5790d extends C12881k implements Function1<Fragment, C13145v> {

        /* renamed from: U */
        final /* synthetic */ Function1 f13559U;

        /* renamed from: c */
        final /* synthetic */ int f13560c;

        C5790d(int i, Function1 function1) {
            this.f13560c = i;
            this.f13559U = function1;
            super(1);
        }

        /* renamed from: a */
        public final void mo17687a(Fragment fragment) {
            String str = "requireContext()";
            if (this.f13560c == 0) {
                Function1 function1 = this.f13559U;
                Context requireContext = fragment.requireContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, str);
                fragment.startActivity((Intent) function1.invoke(requireContext));
                return;
            }
            Function1 function12 = this.f13559U;
            Context requireContext2 = fragment.requireContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireContext2, str);
            fragment.startActivityForResult((Intent) function12.invoke(requireContext2), this.f13560c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17687a((Fragment) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C5787a(null);
    }

    public C5786d(C8436a aVar) {
        this.f13555a = aVar;
    }

    /* renamed from: a */
    public final void mo17684a(Function1<? super Fragment, C13145v> function1) {
        this.f13555a.mo21645a(new C10896d(function1));
    }

    /* renamed from: a */
    public final void mo17683a(int i, Function1<? super Context, ? extends Intent> function1) {
        mo17684a(new C5790d(i, function1));
    }

    /* renamed from: a */
    public void mo17668a(C0530c cVar, String str) {
        mo17684a(new C5789c(str, cVar));
    }

    /* renamed from: a */
    public final void mo17682a() {
        mo17684a(C5788b.f13556c);
    }
}
