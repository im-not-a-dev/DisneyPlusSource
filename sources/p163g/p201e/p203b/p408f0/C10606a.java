package p163g.p201e.p203b.p408f0;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J6\u0010\u000f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/web/CustomURLSpanTransformationMethod;", "Landroid/text/method/TransformationMethod;", "onClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "", "(Lkotlin/jvm/functions/Function1;)V", "getTransformation", "", "source", "view", "Landroid/view/View;", "onFocusChanged", "sourceText", "focused", "", "direction", "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "replaceSpan", "spannable", "Landroid/text/Spannable;", "oldSpan", "Landroid/text/style/URLSpan;", "web_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.f0.a */
/* compiled from: CustomURLSpanTransformationMethod.kt */
public class C10606a implements TransformationMethod {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function1<String, C13145v> f25047c;

    /* renamed from: g.e.b.f0.a$a */
    /* compiled from: CustomURLSpanTransformationMethod.kt */
    public static final class C10607a extends URLSpan {

        /* renamed from: U */
        final /* synthetic */ String f25048U;

        /* renamed from: c */
        final /* synthetic */ C10606a f25049c;

        C10607a(C10606a aVar, String str, String str2) {
            this.f25049c = aVar;
            this.f25048U = str;
            super(str2);
        }

        public void onClick(View view) {
            Function1 a = this.f25049c.f25047c;
            String str = this.f25048U;
            C12880j.m40222a((Object) str, "url");
            a.invoke(str);
        }
    }

    public C10606a(Function1<? super String, C13145v> function1) {
        this.f25047c = function1;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (!(text instanceof Spannable)) {
                text = null;
            }
            Spannable spannable = (Spannable) text;
            if (spannable != null) {
                Object[] spans = spannable.getSpans(0, spannable.length(), URLSpan.class);
                C12880j.m40222a((Object) spans, "getSpans(start, end, T::class.java)");
                for (URLSpan a : C13174k.m40409i(spans)) {
                    m33332a(spannable, a);
                }
            }
            return charSequence;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    /* renamed from: a */
    private final void m33332a(Spannable spannable, URLSpan uRLSpan) {
        int spanStart = spannable.getSpanStart(uRLSpan);
        int spanEnd = spannable.getSpanEnd(uRLSpan);
        spannable.removeSpan(uRLSpan);
        String url = uRLSpan.getURL();
        spannable.setSpan(new C10607a(this, url, url), spanStart, spanEnd, 33);
    }
}
