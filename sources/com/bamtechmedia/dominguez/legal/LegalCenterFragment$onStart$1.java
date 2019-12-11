package com.bamtechmedia.dominguez.legal;

import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import java.util.Collection;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4127b0;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "state", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterFragment.kt */
final class LegalCenterFragment$onStart$1 extends C12881k implements Function1<State, C13145v> {
    final /* synthetic */ LegalCenterFragment this$0;

    LegalCenterFragment$onStart$1(LegalCenterFragment legalCenterFragment) {
        this.this$0 = legalCenterFragment;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((State) obj);
        return C13145v.f29587a;
    }

    public final void invoke(State state) {
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C6117R.C6119id.legalSpinner);
        if (progressBar != null) {
            C4127b0.m14131b(progressBar, state.getLoading());
        }
        this.this$0.getAdapter().mo29963a((Collection<? extends C11847b>) this.this$0.getItemsFactory().create(state));
        NoConnectionView noConnectionView = (NoConnectionView) this.this$0._$_findCachedViewById(C6117R.C6119id.legalNoConnection);
        if (noConnectionView != null) {
            C4127b0.m14131b(noConnectionView, state.isOffline());
        }
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C6117R.C6119id.legal_content_title);
        if (textView != null) {
            LegalDocument openDocument = state.getOpenDocument();
            textView.setText(openDocument != null ? openDocument.getTitle() : null);
        }
        TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C6117R.C6119id.legal_content_text_view);
        if (textView2 != null) {
            textView2.setText(state.getOpenDocumentSpanned());
        }
        ScrollView scrollView = (ScrollView) this.this$0._$_findCachedViewById(C6117R.C6119id.legalScrollView);
        if (scrollView != null) {
            scrollView.post(new Runnable(this) {
                final /* synthetic */ LegalCenterFragment$onStart$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    ScrollView scrollView = (ScrollView) this.this$0.this$0._$_findCachedViewById(C6117R.C6119id.legalScrollView);
                    if (scrollView != null) {
                        scrollView.smoothScrollTo(0, 0);
                    }
                }
            });
        }
    }
}
