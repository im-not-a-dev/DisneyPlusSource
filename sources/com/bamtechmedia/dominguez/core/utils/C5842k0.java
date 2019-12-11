package com.bamtechmedia.dominguez.core.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C10341g;
import kotlin.C13145v;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.utils.k0 */
/* compiled from: TabLayoutExt.kt */
public final class C5842k0 {
    /* renamed from: a */
    public static final void m18859a(TabLayout tabLayout, C12853n<? super View, ? super Integer, ? super Integer, C13145v> nVar) {
        View childAt = tabLayout.getChildAt(0);
        if (childAt instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) childAt;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt2 = viewGroup.getChildAt(i);
                C12880j.m40222a((Object) childAt2, "tabView");
                nVar.invoke(childAt2, Integer.valueOf(i), Integer.valueOf(childCount));
            }
        }
    }

    /* renamed from: a */
    public static final View m18857a(TabLayout tabLayout, int i) {
        View childAt = tabLayout.getChildAt(0);
        if (childAt instanceof ViewGroup) {
            return ((ViewGroup) childAt).getChildAt(i);
        }
        return null;
    }

    /* renamed from: a */
    public static final C10341g m18858a(TabLayout tabLayout, int i, String str) {
        C10341g c = tabLayout.mo26899c();
        c.mo26957a(i);
        View a = c.mo26956a();
        if (!(a instanceof TextView)) {
            a = null;
        }
        TextView textView = (TextView) a;
        if (textView != null) {
            textView.setText(str);
        }
        C12880j.m40222a((Object) c, "newTab().apply {\n       …View)?.text = label\n    }");
        return c;
    }
}
