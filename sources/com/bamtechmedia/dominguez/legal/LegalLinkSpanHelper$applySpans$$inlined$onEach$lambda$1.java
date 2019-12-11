package com.bamtechmedia.dominguez.legal;

import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bamtechmedia.dominguez.legal.api.LegalLink;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo31007d2 = {"com/bamtechmedia/dominguez/legal/LegalLinkSpanHelper$applySpans$1$urlSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalLinkSpanHelper.kt */
public final class LegalLinkSpanHelper$applySpans$$inlined$onEach$lambda$1 extends ClickableSpan {
    final /* synthetic */ LegalLink $link;
    final /* synthetic */ Function1 $onNonUrlClicked$inlined;
    final /* synthetic */ SpannableString $spannableString$inlined;

    LegalLinkSpanHelper$applySpans$$inlined$onEach$lambda$1(LegalLink legalLink, Function1 function1, SpannableString spannableString) {
        this.$link = legalLink;
        this.$onNonUrlClicked$inlined = function1;
        this.$spannableString$inlined = spannableString;
    }

    public void onClick(View view) {
        this.$onNonUrlClicked$inlined.invoke(this.$link);
    }
}
