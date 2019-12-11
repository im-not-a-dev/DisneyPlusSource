package p163g.p201e.p203b.p278h.p281m;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0564o;
import com.bamtechmedia.dominguez.core.p218n.C5783b;
import com.bamtechmedia.dominguez.core.p218n.C5785c;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p278h.C7243h;
import p163g.p201e.p203b.p278h.C7245j;
import p512h.p513c.p514k.C11885d;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.subjects.C11978b;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ctvactivation/dialog/DeviceActivationInfoFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "()V", "deviceNameText", "", "dismissSubject", "Lio/reactivex/subjects/CompletableSubject;", "getDismissSubject$ctvActivation_release", "()Lio/reactivex/subjects/CompletableSubject;", "setDismissSubject$ctvActivation_release", "(Lio/reactivex/subjects/CompletableSubject;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "ctvActivation_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.h.m.a */
/* compiled from: DeviceActivationInfoFragment.kt */
public final class C7255a extends C11885d {

    /* renamed from: X */
    public static final C7256a f15980X = new C7256a(null);
    /* access modifiers changed from: private */

    /* renamed from: U */
    public String f15981U;

    /* renamed from: V */
    private C11978b f15982V;

    /* renamed from: W */
    private HashMap f15983W;

    /* renamed from: g.e.b.h.m.a$a */
    /* compiled from: DeviceActivationInfoFragment.kt */
    public static final class C7256a {
        private C7256a() {
        }

        /* renamed from: a */
        public final void mo20078a(C5783b bVar, String str, C11978b bVar2) {
            C7255a aVar = new C7255a();
            aVar.f15981U = str;
            aVar.mo20077a(bVar2);
            C5785c.m18744a(aVar, bVar, "DeviceActivationInfoFragment");
        }

        public /* synthetic */ C7256a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.h.m.a$b */
    /* compiled from: DeviceActivationInfoFragment.kt */
    static final class C7257b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7255a f15984a;

        C7257b(C7255a aVar) {
            this.f15984a = aVar;
        }

        public final void run() {
            C0538i fragmentManager = this.f15984a.getFragmentManager();
            if (fragmentManager != null) {
                C0564o a = fragmentManager.mo3147a();
                if (a != null) {
                    a.mo3045c(this.f15984a);
                    if (a != null) {
                        a.mo3040b();
                    }
                }
            }
        }
    }

    /* renamed from: g.e.b.h.m.a$c */
    /* compiled from: DeviceActivationInfoFragment.kt */
    static final /* synthetic */ class C7258c extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7258c f15985c = new C7258c();

        C7258c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20079a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20079a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15983W;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15983W == null) {
            this.f15983W = new HashMap();
        }
        View view = (View) this.f15983W.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15983W.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C7245j.FullScreenDialogOverlay);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7243h.device_activation_info_fragment, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, g.e.b.h.m.a$c] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r1v1, types: [g.e.b.h.m.b] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            super.onViewCreated(r3, r4)
            int r3 = p163g.p201e.p203b.p278h.C7242g.content_text
            android.view.View r3 = r2._$_findCachedViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = "content_text"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            int r4 = p163g.p201e.p203b.p278h.C7244i.ctv_activation
            java.lang.String r0 = r2.f15981U
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = "DEVICE_NAME"
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r1, r0)
            java.util.Map r0 = kotlin.p590y.C13170i0.m40332a(r0)
            java.lang.String r4 = com.bamtechmedia.dominguez.core.utils.C5880u.m18937a(r4, r0)
            r3.setText(r4)
            io.reactivex.subjects.b r3 = r2.f15982V
            if (r3 == 0) goto L_0x0064
            androidx.lifecycle.m r4 = r2.getViewLifecycleOwner()
            java.lang.String r0 = "viewLifecycleOwner"
            kotlin.jvm.internal.C12880j.m40222a(r4, r0)
            androidx.lifecycle.i$a r0 = androidx.lifecycle.C0715i.C0716a.ON_DESTROY
            com.uber.autodispose.android.lifecycle.b r4 = com.uber.autodispose.android.lifecycle.C10541b.m33255a(r4, r0)
            java.lang.String r0 = "AndroidLifecycleScopePro…om(\n    this, untilEvent)"
            kotlin.jvm.internal.C12880j.m40222a(r4, r0)
            g.n.a.h r4 = p163g.p503n.p504a.C11793e.m37930a(r4)
            java.lang.Object r3 = r3.mo30048a(r4)
            java.lang.String r4 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            g.n.a.v r3 = (p163g.p503n.p504a.C11839v) r3
            if (r3 == 0) goto L_0x0064
            g.e.b.h.m.a$b r4 = new g.e.b.h.m.a$b
            r4.<init>(r2)
            g.e.b.h.m.a$c r0 = p163g.p201e.p203b.p278h.p281m.C7255a.C7258c.f15985c
            if (r0 == 0) goto L_0x005f
            g.e.b.h.m.b r1 = new g.e.b.h.m.b
            r1.<init>(r0)
            r0 = r1
        L_0x005f:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r3.mo29926a(r4, r0)
        L_0x0064:
            return
        L_0x0065:
            java.lang.String r3 = "deviceNameText"
            kotlin.jvm.internal.C12880j.m40227c(r3)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p278h.p281m.C7255a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo20077a(C11978b bVar) {
        this.f15982V = bVar;
    }
}
