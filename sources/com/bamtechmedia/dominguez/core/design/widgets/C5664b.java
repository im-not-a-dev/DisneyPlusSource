package com.bamtechmedia.dominguez.core.design.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J*\u0010\u000b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J*\u0010\u0011\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/CustomTextWatcher;", "Landroid/text/TextWatcher;", "actionOnText", "Lkotlin/Function1;", "", "", "otherAction", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "afterTextChanged", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.b */
/* compiled from: CustomTextWatcher.kt */
public final class C5664b implements TextWatcher {

    /* renamed from: U */
    private final Function1<String, C13145v> f13297U;

    /* renamed from: c */
    private final Function1<String, C13145v> f13298c;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.b$a */
    /* compiled from: CustomTextWatcher.kt */
    static final class C5665a extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        public static final C5665a f13299c = new C5665a();

        C5665a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
        }
    }

    public C5664b(Function1<? super String, C13145v> function1, Function1<? super String, C13145v> function12) {
        this.f13298c = function1;
        this.f13297U = function12;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f13298c.invoke(String.valueOf(charSequence));
        this.f13297U.invoke(String.valueOf(charSequence));
    }

    public /* synthetic */ C5664b(Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            function12 = C5665a.f13299c;
        }
        this(function1, function12);
    }
}
