package com.bamtechmedia.dominguez.legal;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.core.design.widgets.vadergrid.VaderTextView;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5875t;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import com.bamtechmedia.dominguez.legal.LegalDocumentFinder.LegalItem;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p096e.p121h.p122j.C4025a;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11888g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020&H\u0016J\u001a\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00063"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterFragment;", "Ldagger/android/support/DaggerDialogFragment;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "initialOpenDocumentCode", "", "getInitialOpenDocumentCode", "()Ljava/lang/String;", "initialOpenDocumentCode$delegate", "Lcom/bamtechmedia/dominguez/core/utils/OptionalStringFragmentArgumentDelegate;", "itemsFactory", "Lcom/bamtechmedia/dominguez/legal/LegalCenterItemsFactory;", "getItemsFactory", "()Lcom/bamtechmedia/dominguez/legal/LegalCenterItemsFactory;", "setItemsFactory", "(Lcom/bamtechmedia/dominguez/legal/LegalCenterItemsFactory;)V", "legalItem", "Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder$LegalItem;", "getLegalItem", "()Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder$LegalItem;", "preloadedDocuments", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "getPreloadedDocuments", "()Ljava/util/List;", "viewModel", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "Companion", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterFragment.kt */
public final class LegalCenterFragment extends C11888g {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(LegalCenterFragment.class), "initialOpenDocumentCode", "getInitialOpenDocumentCode()Ljava/lang/String;"))};
    public static final Companion Companion = new Companion(null);
    public static final String DOCUMENTS = "DOCUMENTS";
    public static final String DOCUMENT_ID = "DOCUMENT_ID";
    public static final String LEGAL_ITEM = "LEGAL_ITEM";
    private HashMap _$_findViewCache;
    public C11848c<C11863k> adapter;
    private final C5875t initialOpenDocumentCode$delegate = C5839j.m18850a(DOCUMENT_ID, null, null, 6, null);
    public LegalCenterItemsFactory itemsFactory;
    public LegalCenterViewModel viewModel;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\"\u0010\u000b\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterFragment$Companion;", "Lcom/bamtechmedia/dominguez/legal/LegalFragmentFactory;", "()V", "DOCUMENTS", "", "DOCUMENT_ID", "LEGAL_ITEM", "newInstanceFromDeepLink", "Lcom/bamtechmedia/dominguez/legal/LegalCenterFragment;", "legalItem", "Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder$LegalItem;", "newLegalCenterFragment", "documents", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "documentId", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: LegalCenterFragment.kt */
    public static final class Companion implements LegalFragmentFactory {
        private Companion() {
        }

        public static /* synthetic */ LegalCenterFragment newInstanceFromDeepLink$default(Companion companion, LegalItem legalItem, int i, Object obj) {
            if ((i & 1) != 0) {
                legalItem = null;
            }
            return companion.newInstanceFromDeepLink(legalItem);
        }

        public final LegalCenterFragment newInstanceFromDeepLink(LegalItem legalItem) {
            LegalCenterFragment legalCenterFragment = new LegalCenterFragment();
            Pair[] pairArr = {C12907r.m40244a(LegalCenterFragment.LEGAL_ITEM, legalItem)};
            legalCenterFragment.setArguments(C5833g.m18829a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return legalCenterFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public LegalCenterFragment newLegalCenterFragment(List<LegalDocument> list, String str) {
            LegalCenterFragment legalCenterFragment = new LegalCenterFragment();
            Pair[] pairArr = {C12907r.m40244a(LegalCenterFragment.DOCUMENT_ID, str), C12907r.m40244a(LegalCenterFragment.DOCUMENTS, list)};
            legalCenterFragment.setArguments(C5833g.m18829a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return legalCenterFragment;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final C11848c<C11863k> getAdapter() {
        C11848c<C11863k> cVar = this.adapter;
        if (cVar != null) {
            return cVar;
        }
        C12880j.m40227c("adapter");
        throw null;
    }

    public final String getInitialOpenDocumentCode() {
        return this.initialOpenDocumentCode$delegate.mo17770a(this, $$delegatedProperties[0]);
    }

    public final LegalCenterItemsFactory getItemsFactory() {
        LegalCenterItemsFactory legalCenterItemsFactory = this.itemsFactory;
        if (legalCenterItemsFactory != null) {
            return legalCenterItemsFactory;
        }
        C12880j.m40227c("itemsFactory");
        throw null;
    }

    public final LegalItem getLegalItem() {
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get(LEGAL_ITEM) : null;
        if (!(obj instanceof LegalItem)) {
            obj = null;
        }
        return (LegalItem) obj;
    }

    public final List<LegalDocument> getPreloadedDocuments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getParcelableArrayList(DOCUMENTS);
        }
        return null;
    }

    public final LegalCenterViewModel getViewModel() {
        LegalCenterViewModel legalCenterViewModel = this.viewModel;
        if (legalCenterViewModel != null) {
            return legalCenterViewModel;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C6117R.style.FullscreenDialog_WithAppBackground);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C6117R.layout.legal_center_fragment, viewGroup, false, 4, null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        LegalCenterViewModel legalCenterViewModel = this.viewModel;
        String str = "viewModel";
        String str2 = null;
        if (legalCenterViewModel != null) {
            C5755i.m18679a(this, legalCenterViewModel, null, null, new LegalCenterFragment$onStart$1(this), 6, null);
            LegalCenterViewModel legalCenterViewModel2 = this.viewModel;
            if (legalCenterViewModel2 != null) {
                State state = (State) legalCenterViewModel2.getCurrentState();
                if (state != null) {
                    str2 = state.getOpenDocumentCode();
                }
                if (str2 == null) {
                    View view = getView();
                    if (view != null) {
                        Context requireContext = requireContext();
                        C12880j.m40222a((Object) requireContext, "requireContext()");
                        view.postDelayed(new LegalCenterFragment$onStart$$inlined$postDelayed$1(this), C5837i.m18843e(requireContext) ? 0 : 200);
                        return;
                    }
                    return;
                }
                return;
            }
            C12880j.m40227c(str);
            throw null;
        }
        C12880j.m40227c(str);
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C6117R.C6119id.backLayout);
        if (findViewById != null) {
            C5852n0.m18884a(findViewById, false, false, null, 7, null);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                Context context = view.getContext();
                String str = "view.context";
                C12880j.m40222a((Object) context, str);
                window.setBackgroundDrawableResource(C5837i.m18839b(context, C6117R.attr.themeBackgroundColor, null, false, 6, null));
                Context context2 = view.getContext();
                C12880j.m40222a((Object) context2, str);
                window.setNavigationBarColor(C5837i.m18835a(context2, C6117R.attr.navBarBackground, null, false, 6, null));
            }
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C6117R.C6119id.recycler_view);
        C12880j.m40222a((Object) recyclerView, "recycler_view");
        C11848c<C11863k> cVar = this.adapter;
        if (cVar != null) {
            RecyclerViewExtKt.m18800a(this, recyclerView, cVar);
            View findViewById2 = view.findViewById(C6117R.C6119id.backButton);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new LegalCenterFragment$onViewCreated$2(this));
            }
            Context requireContext = requireContext();
            C12880j.m40222a((Object) requireContext, "requireContext()");
            if (C5837i.m18843e(requireContext)) {
                ScrollView scrollView = (ScrollView) _$_findCachedViewById(C6117R.C6119id.legalScrollView);
                if (scrollView != null) {
                    scrollView.setOnFocusChangeListener(new LegalCenterFragment$onViewCreated$3(this));
                    return;
                }
                return;
            }
            VaderTextView vaderTextView = (VaderTextView) _$_findCachedViewById(C6117R.C6119id.legal_content);
            if (vaderTextView != null) {
                vaderTextView.setMovementMethod(ScrollingMovementMethod.getInstance());
            }
            TextView textView = (TextView) _$_findCachedViewById(C6117R.C6119id.legal_content_text_view);
            if (textView != null) {
                textView.setTextColor(C4025a.m13788a(requireContext(), C6117R.color.vader_white));
                return;
            }
            return;
        }
        C12880j.m40227c("adapter");
        throw null;
    }

    public final void setAdapter(C11848c<C11863k> cVar) {
        this.adapter = cVar;
    }

    public final void setItemsFactory(LegalCenterItemsFactory legalCenterItemsFactory) {
        this.itemsFactory = legalCenterItemsFactory;
    }

    public final void setViewModel(LegalCenterViewModel legalCenterViewModel) {
        this.viewModel = legalCenterViewModel;
    }
}
