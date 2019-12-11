package com.bamtechmedia.dominguez.core.utils;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.C13142s;

/* renamed from: com.bamtechmedia.dominguez.core.utils.l */
/* compiled from: KeyboardUtils.kt */
public final class C5843l {

    /* renamed from: a */
    public static final C5843l f13627a = new C5843l();

    private C5843l() {
    }

    /* renamed from: a */
    public final void mo17743a(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: b */
    public final void mo17744b(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).showSoftInput(view, 1);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
