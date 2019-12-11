package com.bamtechmedia.dominguez.auth.p070v0;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.bamtechmedia.dominguez.auth.C2711f0;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p122j.C4025a;

/* renamed from: com.bamtechmedia.dominguez.auth.v0.d */
/* compiled from: LinkTransformationMethod.kt */
public final class C3038d<T extends URLSpan> implements TransformationMethod {

    /* renamed from: U */
    private final int f7902U;

    /* renamed from: c */
    private final Function1<String, T> f7903c;

    public C3038d(Function1<? super String, ? extends T> function1, int i) {
        this.f7903c = function1;
        this.f7902U = i;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getText() != null && (textView.getText() instanceof Spannable)) {
                CharSequence text = textView.getText();
                if (text != null) {
                    Spannable spannable = (Spannable) text;
                    Object[] spans = spannable.getSpans(0, textView.length(), URLSpan.class);
                    Intrinsics.checkReturnedValueIsNotNull((Object) spans, "getSpans(0, view.length(), URLSpan::class.java)");
                    for (URLSpan uRLSpan : C13199w.m40601l((Iterable) C13174k.m40412l(spans))) {
                        int spanStart = spannable.getSpanStart(uRLSpan);
                        int spanEnd = spannable.getSpanEnd(uRLSpan);
                        spannable.removeSpan(uRLSpan);
                        Function1<String, T> function1 = this.f7903c;
                        Intrinsics.checkReturnedValueIsNotNull((Object) uRLSpan, "oldSpan");
                        String url = uRLSpan.getURL();
                        Intrinsics.checkReturnedValueIsNotNull((Object) url, "oldSpan.url");
                        spannable.setSpan(function1.invoke(url), spanStart, spanEnd, 33);
                        spannable.setSpan(new ForegroundColorSpan(C4025a.m13788a(textView.getContext(), this.f7902U)), spanStart, spanEnd, 33);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.text.Spannable");
                }
            }
        }
        return charSequence;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public /* synthetic */ C3038d(Function1 function1, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            i = C2711f0.vader_secondary;
        }
        this(function1, i);
    }
}
