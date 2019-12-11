package com.bamtechmedia.dominguez.collections;

import android.content.Context;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.AssetStaticImageHandler.C3254b;
import com.bamtechmedia.dominguez.collections.AssetTransitionHandler.C3271b;
import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5641a;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p210g.C5588o;
import p163g.p201e.p203b.p210g.C5597p;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0016J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/CollectionFragmentHelper;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "offlineViewModel", "Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;", "viewModel", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "presenter", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter;", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "fragment", "Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;", "(Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter;Lcom/xwray/groupie/GroupAdapter;Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;)V", "collectionView", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "getCollectionView", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "setCollectionView", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;)V", "onDestroy", "", "onGlobalFocusChanged", "oldFocus", "Landroid/view/View;", "newFocus", "onOfflineStateChanged", "timerState", "Lcom/bamtechmedia/dominguez/connectivity/TimerState;", "(Lcom/bamtechmedia/dominguez/connectivity/TimerState;)Lkotlin/Unit;", "onRetryClicked", "isOffline", "", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "onViewCreated", "Setup", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.j */
/* compiled from: CollectionFragmentHelper.kt */
public final class C3408j implements C5641a, OnGlobalFocusChangeListener {

    /* renamed from: U */
    private final C5588o f8621U;

    /* renamed from: V */
    private final C3454q f8622V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C3502x f8623W;

    /* renamed from: X */
    private final C11848c<C11863k> f8624X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C3280a f8625Y;

    /* renamed from: c */
    private C3503a f8626c;

    /* renamed from: com.bamtechmedia.dominguez.collections.j$a */
    /* compiled from: CollectionFragmentHelper.kt */
    public static final class C3409a {

        /* renamed from: a */
        private final C3454q f8627a;

        /* renamed from: b */
        private final C3502x f8628b;

        /* renamed from: c */
        private final C5588o f8629c;

        /* renamed from: d */
        private final C11848c<C11863k> f8630d;

        public C3409a(C3454q qVar, C3502x xVar, C5588o oVar, C11848c<C11863k> cVar) {
            this.f8627a = qVar;
            this.f8628b = xVar;
            this.f8629c = oVar;
            this.f8630d = cVar;
        }

        /* renamed from: a */
        public final C3408j mo12576a(C3280a aVar) {
            C3408j jVar = new C3408j(this.f8629c, this.f8627a, this.f8628b, this.f8630d, aVar);
            return jVar;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.collections.j$b */
    /* compiled from: CollectionFragmentHelper.kt */
    static final class C3410b extends C12881k implements Function1<C3456b, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3408j f8631c;

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
        /* renamed from: com.bamtechmedia.dominguez.collections.j$b$a */
        /* compiled from: CollectionFragmentHelper.kt */
        static final class C3411a extends C12881k implements Function0<C13145v> {

            /* renamed from: U */
            final /* synthetic */ C3503a f8632U;

            /* renamed from: V */
            final /* synthetic */ C3456b f8633V;

            /* renamed from: c */
            final /* synthetic */ C3410b f8634c;

            /* renamed from: com.bamtechmedia.dominguez.collections.j$b$a$a */
            /* compiled from: View.kt */
            public static final class C3412a implements OnLayoutChangeListener {

                /* renamed from: c */
                final /* synthetic */ C3411a f8635c;

                public C3412a(C3411a aVar) {
                    this.f8635c = aVar;
                }

                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    this.f8635c.f8634c.f8631c.f8625Y.mo12330u();
                }
            }

            C3411a(C3410b bVar, C3503a aVar, C3456b bVar2) {
                this.f8634c = bVar;
                this.f8632U = aVar;
                this.f8633V = bVar2;
                super(0);
            }

            public final void invoke() {
                this.f8634c.f8631c.f8623W.mo12703a(this.f8632U, this.f8633V);
                this.f8634c.f8631c.f8625Y.mo12231a(this.f8632U, this.f8633V);
                View view = this.f8634c.f8631c.f8625Y.getView();
                if (view != null) {
                    view.addOnLayoutChangeListener(new C3412a(this));
                }
            }
        }

        C3410b(C3408j jVar) {
            this.f8631c = jVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12577a(C3456b bVar) {
            C3503a a = this.f8631c.mo12569a();
            if (a != null) {
                this.f8631c.f8625Y.mo12230a((View) a.mo12710f(), bVar, (Function0<C13145v>) new C3411a<C13145v>(this, a, bVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12577a((C3456b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.j$c */
    /* compiled from: CollectionFragmentHelper.kt */
    static final class C3413c extends C12881k implements Function1<C5597p, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3408j f8636c;

        C3413c(C3408j jVar) {
            this.f8636c = jVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12579a(C5597p pVar) {
            this.f8636c.m11675a(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12579a((C5597p) obj);
            return C13145v.f29587a;
        }
    }

    public C3408j(C5588o oVar, C3454q qVar, C3502x xVar, C11848c<C11863k> cVar, C3280a aVar) {
        this.f8621U = oVar;
        this.f8622V = qVar;
        this.f8623W = xVar;
        this.f8624X = cVar;
        this.f8625Y = aVar;
    }

    /* renamed from: c */
    public final void mo12573c() {
        C3503a aVar = this.f8626c;
        if (aVar != null) {
            RecyclerView f = aVar.mo12710f();
            if (f != null) {
                ViewTreeObserver viewTreeObserver = f.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!this.f8625Y.isRemoving() && view2 != null) {
            this.f8625Y.mo12327r().mo17709a(view2);
        }
    }

    public void onRetryClicked(boolean z) {
        this.f8622V.mo12650d();
        if (z) {
            this.f8621U.mo17342y();
        }
    }

    /* renamed from: b */
    public final void mo12572b(C0722m mVar) {
        C3503a a = this.f8625Y.mo12229a(this.f8624X);
        a.mo12710f().setAdapter(this.f8624X);
        a.mo12710f().setHasFixedSize(true);
        NoConnectionView c = a.mo12706c();
        if (c != null) {
            c.setRetryListener(this);
        }
        this.f8626c = a;
        C3317e eVar = (C3317e) this.f8625Y.mo12326q().mo27107c();
        if (eVar != null) {
            mVar.getLifecycle().mo4134a(eVar);
        }
        AssetTransitionHandler assetTransitionHandler = (AssetTransitionHandler) this.f8625Y.mo12325p().mo27107c();
        if (assetTransitionHandler != null) {
            mVar.getLifecycle().mo4134a(assetTransitionHandler);
            C3280a aVar = this.f8625Y;
            if (aVar instanceof C3271b) {
                assetTransitionHandler.mo12315a((C3271b) aVar);
            }
        }
        AssetStaticImageHandler assetStaticImageHandler = (AssetStaticImageHandler) this.f8625Y.mo12324o().mo27107c();
        if (assetStaticImageHandler != null) {
            mVar.getLifecycle().mo4134a(assetStaticImageHandler);
            C3280a aVar2 = this.f8625Y;
            if (aVar2 instanceof C3254b) {
                assetStaticImageHandler.mo12297a((C3254b) aVar2);
            }
        }
    }

    /* renamed from: a */
    public final C3503a mo12569a() {
        return this.f8626c;
    }

    /* renamed from: a */
    public final void mo12570a(C0722m mVar) {
        this.f8622V.mo12646a(mVar, new C3410b(this));
        C5755i.m18679a(this.f8625Y, this.f8621U, null, null, new C3413c(this), 6, null);
        Context requireContext = this.f8625Y.requireContext();
        String str = "fragment.requireContext()";
        C12880j.m40222a((Object) requireContext, str);
        if (C5837i.m18836a(requireContext)) {
            Context requireContext2 = this.f8625Y.requireContext();
            C12880j.m40222a((Object) requireContext2, str);
            if (C5837i.m18843e(requireContext2)) {
                C3503a aVar = this.f8626c;
                if (aVar != null) {
                    RecyclerView f = aVar.mo12710f();
                    if (f != null) {
                        ViewTreeObserver viewTreeObserver = f.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.addOnGlobalFocusChangeListener(this);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C13145v m11675a(C5597p pVar) {
        if (C3415k.$EnumSwitchMapping$0[pVar.ordinal()] != 1) {
            C3503a aVar = this.f8626c;
            if (aVar == null) {
                return null;
            }
            NoConnectionView c = aVar.mo12706c();
            if (c == null) {
                return null;
            }
            c.mo17433b(false);
            return C13145v.f29587a;
        }
        C3503a aVar2 = this.f8626c;
        if (aVar2 == null) {
            return null;
        }
        NoConnectionView c2 = aVar2.mo12706c();
        if (c2 == null) {
            return null;
        }
        c2.mo17433b(true);
        return C13145v.f29587a;
    }

    /* renamed from: b */
    public final void mo12571b() {
        C3503a aVar = this.f8626c;
        if (aVar != null) {
            RecyclerView f = aVar.mo12710f();
            if (f != null) {
                f.setAdapter(null);
            }
        }
        C3503a aVar2 = this.f8626c;
        if (aVar2 != null) {
            NoConnectionView c = aVar2.mo12706c();
            if (c != null) {
                c.setRetryListener(null);
            }
        }
        this.f8626c = null;
    }
}
