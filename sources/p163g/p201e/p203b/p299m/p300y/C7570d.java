package p163g.p201e.p203b.p299m.p300y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0564o;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p096e.p121h.p122j.p124d.C4039f;
import p163g.p201e.p203b.p299m.C7561s;
import p163g.p201e.p203b.p299m.C7563u;
import p163g.p201e.p203b.p299m.C7564v;
import p163g.p201e.p203b.p299m.C7566x;
import p163g.p201e.p203b.p299m.p300y.p302i.C7579a;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.subjects.C11978b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\r\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u001a\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u00061"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialogs/tier0/Tier0DialogFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bamtechmedia/dominguez/dialogs/TierDialogMarker;", "()V", "dismissDisposable", "Lio/reactivex/disposables/Disposable;", "dismissDisposable$annotations", "getDismissDisposable$dialogs_release", "()Lio/reactivex/disposables/Disposable;", "setDismissDisposable$dialogs_release", "(Lio/reactivex/disposables/Disposable;)V", "dismissSubject", "Lio/reactivex/subjects/CompletableSubject;", "dismissSubject$annotations", "getDismissSubject$dialogs_release", "()Lio/reactivex/subjects/CompletableSubject;", "setDismissSubject$dialogs_release", "(Lio/reactivex/subjects/CompletableSubject;)V", "textSizeCalculator", "Lcom/bamtechmedia/dominguez/dialogs/tier0/textsize/Tier0TextSizeCalculator;", "getTextSizeCalculator", "()Lcom/bamtechmedia/dominguez/dialogs/tier0/textsize/Tier0TextSizeCalculator;", "setTextSizeCalculator", "(Lcom/bamtechmedia/dominguez/dialogs/tier0/textsize/Tier0TextSizeCalculator;)V", "createCustomPaint", "Landroid/graphics/Paint;", "context", "Landroid/content/Context;", "dismissFragment", "", "dismissFragment$dialogs_release", "getTitleFromArgs", "", "launchTier0Message", "tier0MessageView", "Lcom/bamtechmedia/dominguez/dialogs/tier0/Tier0Launcher;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "dialogs_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.m.y.d */
/* compiled from: Tier0DialogFragment.kt */
public final class C7570d extends Fragment implements C7566x {

    /* renamed from: X */
    public static final C7571a f16570X = new C7571a(null);

    /* renamed from: U */
    private C11978b f16571U;

    /* renamed from: V */
    private Disposable f16572V;

    /* renamed from: W */
    private HashMap f16573W;

    /* renamed from: c */
    public C7579a f16574c;

    /* renamed from: g.e.b.m.y.d$a */
    /* compiled from: Tier0DialogFragment.kt */
    public static final class C7571a {
        private C7571a() {
        }

        /* renamed from: a */
        public final C7570d mo20510a(String str, C7576g gVar) {
            C7570d dVar = new C7570d();
            dVar.setArguments(C5833g.m18829a(C12907r.m40244a("message_title", str), C12907r.m40244a("message_icon", gVar)));
            return dVar;
        }

        public /* synthetic */ C7571a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7570d mo20509a(int i, C7576g gVar) {
            C7570d dVar = new C7570d();
            dVar.setArguments(C5833g.m18829a(C12907r.m40244a("message_title_id", Integer.valueOf(i)), C12907r.m40244a("message_icon", gVar)));
            return dVar;
        }
    }

    /* renamed from: g.e.b.m.y.d$b */
    /* compiled from: Tier0DialogFragment.kt */
    static final class C7572b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7570d f16575a;

        C7572b(C7570d dVar) {
            this.f16575a = dVar;
        }

        public final void run() {
            this.f16575a.mo20508o();
        }
    }

    /* renamed from: g.e.b.m.y.d$c */
    /* compiled from: Tier0DialogFragment.kt */
    static final /* synthetic */ class C7573c extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7573c f16576c = new C7573c();

        C7573c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20511a(Throwable th) {
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
            mo20511a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: a */
    private final Paint m22526a(Context context) {
        Paint paint = new Paint();
        paint.setTypeface(Typeface.create(C4039f.m13847a(context, C7561s.avenir85_heavy), 0));
        paint.setStyle(Style.FILL);
        return paint;
    }

    /* renamed from: p */
    private final String m22528p() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("message_title") : null;
        if (string != null) {
            return string;
        }
        Bundle arguments2 = getArguments();
        return C5880u.m18940a((Fragment) this, arguments2 != null ? arguments2.getInt("message_title_id") : 0);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16573W;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16573W == null) {
            this.f16573W = new HashMap();
        }
        View view = (View) this.f16573W.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16573W.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: o */
    public final void mo20508o() {
        C0538i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C0564o a = fragmentManager.mo3147a();
            if (a != null) {
                a.mo3045c(this);
                if (a != null) {
                    a.mo3040b();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        Resources resources = requireContext.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float integer = (float) requireContext.getResources().getInteger(C7563u.max_permitted_text_length);
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "this");
        Intrinsics.checkReturnedValueIsNotNull((Object) displayMetrics, "displayMetrics");
        this.f16574c = new C7579a(requireContext, displayMetrics, m22526a(requireContext), integer);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7564v.fragment_tier0_message, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f16572V;
        if (disposable != null && !disposable.isDisposed()) {
            Disposable disposable2 = this.f16572V;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            mo20508o();
        }
        _$_clearFindViewByIdCache();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, g.e.b.m.y.d$c] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r1v0, types: [g.e.b.m.y.e] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            super.onViewCreated(r3, r4)
            io.reactivex.subjects.b r3 = p520io.reactivex.subjects.C11978b.m38573j()
            g.e.b.m.y.d$b r4 = new g.e.b.m.y.d$b
            r4.<init>(r2)
            g.e.b.m.y.d$c r0 = p163g.p201e.p203b.p299m.p300y.C7570d.C7573c.f16576c
            if (r0 == 0) goto L_0x0016
            g.e.b.m.y.e r1 = new g.e.b.m.y.e
            r1.<init>(r0)
            r0 = r1
        L_0x0016:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            io.reactivex.disposables.Disposable r4 = r3.mo30047a(r4, r0)
            r2.f16572V = r4
            r2.f16571U = r3
            int r3 = p163g.p201e.p203b.p299m.C7562t.tier0MessageView
            android.view.View r3 = r2._$_findCachedViewById(r3)
            if (r3 == 0) goto L_0x002e
            g.e.b.m.y.f r3 = (p163g.p201e.p203b.p299m.p300y.C7575f) r3
            r2.m22527a(r3)
            return
        L_0x002e:
            kotlin.s r3 = new kotlin.s
            java.lang.String r4 = "null cannot be cast to non-null type com.bamtechmedia.dominguez.dialogs.tier0.Tier0Launcher"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p299m.p300y.C7570d.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: a */
    private final void m22527a(C7575f fVar) {
        String p = m22528p();
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("message_icon") : null;
        if (serializable != null) {
            C7576g gVar = (C7576g) serializable;
            C7579a aVar = this.f16574c;
            if (aVar != null) {
                fVar.mo20512a(gVar, p, C7579a.m22537a(aVar, p, null, 2, null), this.f16571U);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("textSizeCalculator");
                throw null;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.dialogs.tier0.Tier0MessageIcon");
        }
    }
}
