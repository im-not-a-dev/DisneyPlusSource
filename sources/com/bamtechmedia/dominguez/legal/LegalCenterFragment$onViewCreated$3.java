package com.bamtechmedia.dominguez.legal;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;
import kotlin.Metadata;
import p096e.p121h.p122j.C4025a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterFragment.kt */
final class LegalCenterFragment$onViewCreated$3 implements OnFocusChangeListener {
    final /* synthetic */ LegalCenterFragment this$0;

    LegalCenterFragment$onViewCreated$3(LegalCenterFragment legalCenterFragment) {
        this.this$0 = legalCenterFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C6117R.C6119id.legal_content_title);
        if (textView != null) {
            textView.setTextColor(C4025a.m13788a(this.this$0.requireContext(), z ? C6117R.color.vader_white : C6117R.color.vader_grey8));
        }
        TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C6117R.C6119id.legal_content_text_view);
        if (textView2 != null) {
            textView2.setTextColor(C4025a.m13788a(this.this$0.requireContext(), z ? C6117R.color.vader_white : C6117R.color.vader_grey8));
        }
    }
}
