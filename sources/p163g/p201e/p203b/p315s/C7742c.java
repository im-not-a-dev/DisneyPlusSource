package p163g.p201e.p203b.p315s;

import android.content.Context;
import android.view.View;
import com.bamtechmedia.dominguez.core.design.widgets.focus.C5691a;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptConstraintLayout;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5842k0;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/landing/LandingPageAccessibilityHelper;", "", "isTelevision", "", "(Z)V", "initTabsWorkaround", "", "root", "Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptConstraintLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.s.c */
/* compiled from: LandingPageAccessibilityHelper.kt */
public final class C7742c {

    /* renamed from: a */
    private final boolean f16809a;

    /* renamed from: g.e.b.s.c$a */
    /* compiled from: LandingPageAccessibilityHelper.kt */
    public static final class C7743a implements C5691a {

        /* renamed from: a */
        final /* synthetic */ TabLayout f16810a;

        C7743a(TabLayout tabLayout) {
            this.f16810a = tabLayout;
        }

        /* renamed from: a */
        public View mo17542a(View view, int i, View view2) {
            boolean z = true;
            if (!Intrinsics.areEqual((Object) view2, (Object) this.f16810a) && (view2 == null || !C5852n0.m18889b(view2, (View) this.f16810a))) {
                z = false;
            }
            if (!z) {
                return null;
            }
            this.f16810a.setDescendantFocusability(DateUtils.FORMAT_NUMERIC_DATE);
            TabLayout tabLayout = this.f16810a;
            return C5842k0.m18857a(tabLayout, tabLayout.getSelectedTabPosition());
        }
    }

    public C7742c(boolean z) {
        this.f16809a = z;
    }

    /* renamed from: a */
    public final void mo20653a(FocusSearchInterceptConstraintLayout focusSearchInterceptConstraintLayout, TabLayout tabLayout) {
        Context context = focusSearchInterceptConstraintLayout.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "root.context");
        if (C5837i.m18836a(context) && this.f16809a) {
            focusSearchInterceptConstraintLayout.setFocusSearchInterceptor(new C7743a(tabLayout));
        }
    }
}
