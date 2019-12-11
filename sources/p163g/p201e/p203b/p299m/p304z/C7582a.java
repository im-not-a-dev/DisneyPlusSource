package p163g.p201e.p203b.p299m.p304z;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import com.bamtechmedia.dominguez.core.p218n.C5783b;
import com.bamtechmedia.dominguez.core.p218n.C5785c;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5844l0;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p299m.C7539b;
import p163g.p201e.p203b.p299m.C7543f;
import p163g.p201e.p203b.p299m.C7546g;
import p163g.p201e.p203b.p299m.C7558p;
import p163g.p201e.p203b.p299m.C7562t;
import p163g.p201e.p203b.p299m.C7564v;
import p163g.p201e.p203b.p299m.C7565w;
import p163g.p201e.p203b.p312q.C7717x;
import p512h.p513c.p514k.C11885d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000bH\u0014J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialogs/tier3/FullscreenDialogFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "()V", "dialogArguments", "Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;", "getDialogArguments", "()Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;", "dialogArguments$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "getTheme", "", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "onClick", "which", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "dialogs_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.m.z.a */
/* compiled from: FullscreenDialogFragment.kt */
public class C7582a extends C11885d implements C7717x {

    /* renamed from: W */
    static final /* synthetic */ KProperty[] f16593W = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7582a.class), "dialogArguments", "getDialogArguments()Lcom/bamtechmedia/dominguez/dialogs/DialogArguments;"))};

    /* renamed from: X */
    public static final C7583a f16594X = new C7583a(null);

    /* renamed from: U */
    private final C5883w f16595U = C5839j.m18852a("dialogArguments", (Function0) null, 2, (Object) null);

    /* renamed from: V */
    private HashMap f16596V;

    /* renamed from: g.e.b.m.z.a$a */
    /* compiled from: FullscreenDialogFragment.kt */
    public static final class C7583a implements C7558p {
        private C7583a() {
        }

        public /* synthetic */ C7583a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo20519a(C5783b bVar, C7543f fVar) {
            C5785c.m18744a(mo20493a(fVar), bVar, "FullscreenDialogFragment");
        }

        /* renamed from: a */
        public C7582a m22545a(C7543f fVar) {
            C7582a aVar = new C7582a();
            aVar.setArguments(C5833g.m18829a(C12907r.m40244a("dialogArguments", fVar)));
            return aVar;
        }
    }

    /* renamed from: g.e.b.m.z.a$b */
    /* compiled from: FullscreenDialogFragment.kt */
    static final class C7584b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7582a f16597c;

        C7584b(C7582a aVar) {
            this.f16597c = aVar;
        }

        public final void onClick(View view) {
            C7582a aVar = this.f16597c;
            aVar.mo20518a(aVar.m22542o(), -1);
        }
    }

    /* renamed from: g.e.b.m.z.a$c */
    /* compiled from: FullscreenDialogFragment.kt */
    static final class C7585c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7582a f16598c;

        C7585c(C7582a aVar) {
            this.f16598c = aVar;
        }

        public final void onClick(View view) {
            C7582a aVar = this.f16598c;
            aVar.mo20518a(aVar.m22542o(), -3);
        }
    }

    /* renamed from: g.e.b.m.z.a$d */
    /* compiled from: FullscreenDialogFragment.kt */
    static final class C7586d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7582a f16599c;

        C7586d(C7582a aVar) {
            this.f16599c = aVar;
        }

        public final void onClick(View view) {
            C7582a aVar = this.f16599c;
            aVar.mo20518a(aVar.m22542o(), -2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final C7543f m22542o() {
        return (C7543f) this.f16595U.mo17776a(this, f16593W[0]);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16596V;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16596V == null) {
            this.f16596V = new HashMap();
        }
        View view = (View) this.f16596V.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16596V.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public int getTheme() {
        Integer n0 = m22542o().mo20460n0();
        return n0 != null ? n0.intValue() : C7565w.FullScreenDialogOverlay;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C0532d requireActivity = requireActivity();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
        C7539b.m22448a(requireActivity, m22542o().mo20459m0(), 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7564v.fullscreen_dialog_fragment, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) _$_findCachedViewById(C7562t.content_title);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "content_title");
        C5844l0.m18865a(textView, (CharSequence) C7546g.m22500f(m22542o()), false, 2, (Object) null);
        TextView textView2 = (TextView) _$_findCachedViewById(C7562t.content_text);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "content_text");
        C5844l0.m18865a(textView2, (CharSequence) C7546g.m22494a(m22542o()), false, 2, (Object) null);
        Button button = (Button) _$_findCachedViewById(C7562t.positive_button);
        Intrinsics.checkReturnedValueIsNotNull((Object) button, "positive_button");
        C5844l0.m18865a((TextView) button, (CharSequence) C7546g.m22499e(m22542o()), false, 2, (Object) null);
        ((Button) _$_findCachedViewById(C7562t.positive_button)).setOnClickListener(new C7584b(this));
        Button button2 = (Button) _$_findCachedViewById(C7562t.neutral_button);
        Intrinsics.checkReturnedValueIsNotNull((Object) button2, "neutral_button");
        C5844l0.m18865a((TextView) button2, (CharSequence) C7546g.m22498d(m22542o()), false, 2, (Object) null);
        ((Button) _$_findCachedViewById(C7562t.neutral_button)).setOnClickListener(new C7585c(this));
        Button button3 = (Button) _$_findCachedViewById(C7562t.negative_button);
        Intrinsics.checkReturnedValueIsNotNull((Object) button3, "negative_button");
        C5844l0.m18865a((TextView) button3, (CharSequence) C7546g.m22496b(m22542o()), false, 2, (Object) null);
        ((Button) _$_findCachedViewById(C7562t.negative_button)).setOnClickListener(new C7586d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20518a(C7543f fVar, int i) {
        C0538i fragmentManager = getFragmentManager();
        if (Intrinsics.areEqual((Object) fragmentManager != null ? fragmentManager.mo3160f() : null, (Object) this)) {
            C0538i fragmentManager2 = getFragmentManager();
            if (fragmentManager2 != null) {
                fragmentManager2.mo3161g();
                return;
            }
            return;
        }
        C0532d requireActivity = requireActivity();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
        C7539b.m22448a(requireActivity, fVar.mo20459m0(), i);
        dismissAllowingStateLoss();
    }
}
