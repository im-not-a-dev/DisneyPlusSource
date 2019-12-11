package p163g.p201e.p203b.p305n;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.C3280a;
import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.collections.p080o0.C3433a;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.p215k.C5759b;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5807b;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.google.common.base.Optional;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p096e.p121h.p135s.C4127b0;
import p096e.p121h.p135s.C4187x;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p201e.p202a.C5365h;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p201e.p203b.p299m.C7540c;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u001a\u0010-\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0002J\u0018\u00102\u001a\u00020*2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0016\u00107\u001a\u0002042\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0016J\b\u0010;\u001a\u00020*H\u0016J\u001c\u0010<\u001a\u00020*2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020BH\u0016J\u001a\u0010C\u001a\u00020*2\u0006\u00103\u001a\u00020>2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020*2\u0006\u00105\u001a\u000206H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006H"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/editorial/EditorialPageFragment;", "Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "()V", "deepLinkDialog", "Lcom/bamtechmedia/dominguez/dialogs/DeepLinkDialog;", "getDeepLinkDialog", "()Lcom/bamtechmedia/dominguez/dialogs/DeepLinkDialog;", "setDeepLinkDialog", "(Lcom/bamtechmedia/dominguez/dialogs/DeepLinkDialog;)V", "editorialImageLoader", "Lcom/bamtechmedia/dominguez/editorial/EditorialImageLoader;", "getEditorialImageLoader", "()Lcom/bamtechmedia/dominguez/editorial/EditorialImageLoader;", "setEditorialImageLoader", "(Lcom/bamtechmedia/dominguez/editorial/EditorialImageLoader;)V", "focusFinder", "Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;", "getFocusFinder", "()Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;", "setFocusFinder", "(Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;)V", "imageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "getImageLoader", "()Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "setImageLoader", "(Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;)V", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "getSlug", "()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "slug$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "transitionHelper", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/editorial/EditorialPageTvTransitionHelper;", "getTransitionHelper", "()Lcom/google/common/base/Optional;", "setTransitionHelper", "(Lcom/google/common/base/Optional;)V", "deepLinkFailureNavigateBack", "", "isOffline", "", "loadImage", "imageView", "Landroid/widget/ImageView;", "image", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "onCollectionStateChanged", "view", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "state", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "onCreateCollectionView", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "onDestroyView", "onGlobalFocusChanged", "oldFocus", "Landroid/view/View;", "newFocus", "onKeyDown", "keyCode", "", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "pickImageOrText", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.n.b */
/* compiled from: EditorialPageFragment.kt */
public final class C7588b extends C3280a implements OnGlobalFocusChangeListener {

    /* renamed from: n0 */
    static final /* synthetic */ KProperty[] f16601n0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7588b.class), "slug", "getSlug()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;"))};

    /* renamed from: o0 */
    public static final C7589a f16602o0 = new C7589a(null);

    /* renamed from: g0 */
    public C7540c f16603g0;

    /* renamed from: h0 */
    public C7159g f16604h0;

    /* renamed from: i0 */
    public Optional<C7603j> f16605i0;

    /* renamed from: j0 */
    public C5759b f16606j0;

    /* renamed from: k0 */
    public C7587a f16607k0;

    /* renamed from: l0 */
    private final C5883w f16608l0 = C5839j.m18852a("slug", (Function0) null, 2, (Object) null);

    /* renamed from: m0 */
    private HashMap f16609m0;

    /* renamed from: g.e.b.n.b$a */
    /* compiled from: EditorialPageFragment.kt */
    public static final class C7589a {
        private C7589a() {
        }

        /* renamed from: a */
        public final C7588b mo20528a(C3676k kVar) {
            C7588b bVar = new C7588b();
            bVar.setArguments(C5833g.m18829a(C12907r.m40244a("slug", kVar)));
            return bVar;
        }

        public /* synthetic */ C7589a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.n.b$b */
    /* compiled from: EditorialPageFragment.kt */
    static final class C7590b extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        public static final C7590b f16610c = new C7590b();

        C7590b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20529a(C7162c cVar) {
            cVar.mo19998f(Integer.valueOf(293));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20529a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.n.b$c */
    /* compiled from: EditorialPageFragment.kt */
    static final class C7591c extends C12881k implements Function2<C3658a, C3433a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7588b f16611c;

        C7591c(C7588b bVar) {
            this.f16611c = bVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo20530a(C3658a aVar, C3433a aVar2) {
            this.f16611c.mo12237v().mo20524a(aVar, aVar2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo20530a((C3658a) obj, (C3433a) obj2);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.n.b$d */
    /* compiled from: View.kt */
    public static final class C7592d implements OnLayoutChangeListener {

        /* renamed from: c */
        final /* synthetic */ C7588b f16612c;

        public C7592d(C7588b bVar, View view) {
            this.f16612c = bVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            C7603j jVar = (C7603j) this.f16612c.mo20527x().mo27107c();
            if (jVar != null) {
                jVar.mo20533a();
            }
        }
    }

    /* renamed from: g.e.b.n.b$e */
    /* compiled from: EditorialPageFragment.kt */
    static final class C7593e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7588b f16613c;

        C7593e(C7588b bVar) {
            this.f16613c = bVar;
        }

        public final void onClick(View view) {
            this.f16613c.requireActivity().onBackPressed();
        }
    }

    public C7588b() {
        super(C5364g.fragment_editorial_page);
    }

    /* renamed from: b */
    private final void m22551b(boolean z) {
        requireActivity().onBackPressed();
        C7540c cVar = this.f16603g0;
        if (cVar != null) {
            cVar.mo20439a(Integer.valueOf(z ? C5365h.network_error_message : C5365h.error_collection_unavailable), Integer.valueOf(C5365h.btn_action1_collection_unavailable));
        } else {
            C12880j.m40227c("deepLinkDialog");
            throw null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16609m0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16609m0 == null) {
            this.f16609m0 = new HashMap();
        }
        View view = (View) this.f16609m0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16609m0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public C3503a mo12229a(C11848c<C11863k> cVar) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.editorialRecyclerView);
        C12880j.m40222a((Object) recyclerView, "editorialRecyclerView");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5363f.editorialProgressBar);
        C12880j.m40222a((Object) progressBar, "editorialProgressBar");
        C3503a aVar = new C3503a(cVar, recyclerView, progressBar, (NoConnectionView) _$_findCachedViewById(C5363f.editorialNoConnectionView), null, null, 48, null);
        return aVar;
    }

    public void onDestroyView() {
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "this.requireContext()");
        if (C5837i.m18843e(requireContext)) {
            View view = getView();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!isRemoving() && view2 != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.editorialRecyclerView);
            C12880j.m40222a((Object) recyclerView, "editorialRecyclerView");
            if (C5852n0.m18889b(view2, (View) recyclerView)) {
                Optional<C7603j> optional = this.f16605i0;
                if (optional != null) {
                    C7603j jVar = (C7603j) optional.mo27107c();
                    if (jVar != null) {
                        jVar.mo20534a(view2);
                        return;
                    }
                    return;
                }
                C12880j.m40227c("transitionHelper");
                throw null;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C5363f.editorialBackLayout);
        View findViewById2 = view.findViewById(C5363f.backButton);
        if (findViewById != null) {
            C5852n0.m18884a(findViewById, false, false, null, 7, null);
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C7593e(this));
        }
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "this.requireContext()");
        if (C5837i.m18843e(requireContext)) {
            RecyclerViewSnapScrollHelper r = mo12327r();
            C0722m viewLifecycleOwner = getViewLifecycleOwner();
            C12880j.m40222a((Object) viewLifecycleOwner, "viewLifecycleOwner");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(C5363f.editorialRecyclerView);
            String str = "view.editorialRecyclerView";
            C12880j.m40222a((Object) recyclerView, str);
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(C5363f.editorialRecyclerView);
            C12880j.m40222a((Object) recyclerView2, str);
            int paddingTop = recyclerView2.getPaddingTop();
            RecyclerView recyclerView3 = (RecyclerView) view.findViewById(C5363f.editorialRecyclerView);
            C12880j.m40222a((Object) recyclerView3, str);
            r.mo17710a(viewLifecycleOwner, recyclerView, (C5805c) new C5807b(paddingTop, recyclerView3.getPaddingBottom()));
            if (!C4187x.m14340E(view) || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new C7592d(this, view));
            } else {
                C7603j jVar = (C7603j) mo20527x().mo27107c();
                if (jVar != null) {
                    jVar.mo20533a();
                }
            }
            view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        }
    }

    /* renamed from: v */
    public final C7587a mo12237v() {
        C7587a aVar = this.f16607k0;
        if (aVar != null) {
            return aVar;
        }
        C12880j.m40227c("editorialImageLoader");
        throw null;
    }

    /* renamed from: w */
    public final C3676k mo12238w() {
        return (C3676k) this.f16608l0.mo17776a(this, f16601n0[0]);
    }

    /* renamed from: x */
    public final Optional<C7603j> mo20527x() {
        Optional<C7603j> optional = this.f16605i0;
        if (optional != null) {
            return optional;
        }
        C12880j.m40227c("transitionHelper");
        throw null;
    }

    /* renamed from: a */
    public boolean mo12232a(int i) {
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "requireContext()");
        boolean z = false;
        if (C5837i.m18843e(requireContext)) {
            View view = getView();
            if (view != null) {
                View findFocus = view.findFocus();
                if (findFocus != null) {
                    boolean z2 = i == 20 || i == 21 || i == 22;
                    if (!C12880j.m40224a((Object) findFocus, (Object) (RecyclerView) _$_findCachedViewById(C5363f.editorialRecyclerView)) || !z2) {
                        z = mo12323a(i, findFocus, false);
                    } else {
                        C5759b bVar = this.f16606j0;
                        if (bVar != null) {
                            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.editorialRecyclerView);
                            C12880j.m40222a((Object) recyclerView, "editorialRecyclerView");
                            View a = bVar.mo17645a(recyclerView);
                            if (a != null) {
                                z = a.requestFocus();
                            }
                            return z;
                        }
                        C12880j.m40227c("focusFinder");
                        throw null;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo12231a(C3503a aVar, C3456b bVar) {
        if (bVar.mo12656d() != null && bVar.mo12655c()) {
            m22551b(bVar.mo12660g());
        }
        C5884x.m18949a(bVar.mo12653a(), bVar.mo12654b(), new C7591c(this));
        m22550a(bVar);
        Throwable d = bVar.mo12656d();
        if (d != null) {
            Context requireContext = requireContext();
            C12880j.m40222a((Object) requireContext, "requireContext()");
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            sb.append(d.getMessage());
            sb.append('.');
            Toast makeText = Toast.makeText(requireContext.getApplicationContext(), sb.toString(), 0);
            makeText.show();
            C12880j.m40222a((Object) makeText, "Toast.makeText(applicati…uration).apply { show() }");
        }
    }

    /* renamed from: a */
    private final void m22550a(C3456b bVar) {
        C3658a a = bVar.mo12653a();
        String str = null;
        Image a2 = a != null ? a.mo12845a(C3688j.LOGO, C3623a.f9125b0.mo13250b()) : null;
        ImageView imageView = (ImageView) _$_findCachedViewById(C5363f.editorialLogoImageView);
        C12880j.m40222a((Object) imageView, "editorialLogoImageView");
        boolean z = true;
        imageView.setVisibility(a2 != null ? 0 : 8);
        ImageView imageView2 = (ImageView) _$_findCachedViewById(C5363f.editorialTopLogoImageView);
        if (imageView2 != null) {
            if (a2 == null) {
                z = false;
            }
            C4127b0.m14131b(imageView2, z);
        }
        String str2 = "editorialLogoTextView";
        if (a2 != null) {
            m22549a((ImageView) _$_findCachedViewById(C5363f.editorialLogoImageView), a2);
            m22549a((ImageView) _$_findCachedViewById(C5363f.editorialTopLogoImageView), a2);
            TextView textView = (TextView) _$_findCachedViewById(C5363f.editorialLogoTextView);
            C12880j.m40222a((Object) textView, str2);
            textView.setText(null);
            TextView textView2 = (TextView) _$_findCachedViewById(C5363f.editorialTopLogoTextView);
            if (textView2 != null) {
                textView2.setText(null);
                return;
            }
            return;
        }
        C3658a a3 = bVar.mo12653a();
        if (a3 != null) {
            str = a3.getTitle();
        }
        TextView textView3 = (TextView) _$_findCachedViewById(C5363f.editorialLogoTextView);
        C12880j.m40222a((Object) textView3, str2);
        textView3.setText(str);
        TextView textView4 = (TextView) _$_findCachedViewById(C5363f.editorialTopLogoTextView);
        if (textView4 != null) {
            textView4.setText(str);
        }
    }

    /* renamed from: a */
    private final void m22549a(ImageView imageView, Image image) {
        if (imageView != null) {
            C7159g gVar = this.f16604h0;
            if (gVar != null) {
                gVar.mo19957a(imageView, image.mo13085U(), C7590b.f16610c);
            } else {
                C12880j.m40227c("imageLoader");
                throw null;
            }
        }
    }
}
