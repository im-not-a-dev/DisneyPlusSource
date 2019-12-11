package com.bamtechmedia.dominguez.detail.common.p230g0;

import android.content.Context;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.design.widgets.focus.C5691a;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptMotionLayout;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5842k0;
import com.google.android.material.tabs.TabLayout;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.DateUtils;
import p163g.p201e.p203b.p287k.C7310d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ2\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailAccessibilityHelper;", "", "isTelevision", "", "(Z)V", "initHeaderExpandedFocusWorkaround", "", "view", "Landroid/view/View;", "requestHeaderFocusAction", "Lkotlin/Function0;", "initTabsWorkaround", "Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptMotionLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "animate", "Lkotlin/Function2;", "", "toggleAccessibilityFocusable", "enabled", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.a */
/* compiled from: ContentDetailAccessibilityHelper.kt */
public final class C5944a {

    /* renamed from: a */
    private final boolean f13750a;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.a$a */
    /* compiled from: ContentDetailAccessibilityHelper.kt */
    static final class C5945a implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ Function0 f13751c;

        C5945a(Function0 function0) {
            this.f13751c = function0;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f13751c.invoke();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.a$b */
    /* compiled from: ContentDetailAccessibilityHelper.kt */
    public static final class C5946b implements C5691a {

        /* renamed from: a */
        final /* synthetic */ Function2 f13752a;

        /* renamed from: b */
        final /* synthetic */ TabLayout f13753b;

        C5946b(Function2 function2, TabLayout tabLayout) {
            this.f13752a = function2;
            this.f13753b = tabLayout;
        }

        /* renamed from: a */
        public View mo17542a(View view, int i, View view2) {
            this.f13752a.invoke(Integer.valueOf(i), view);
            if (!C12880j.m40224a((Object) view2, (Object) this.f13753b)) {
                return null;
            }
            this.f13753b.setDescendantFocusability(DateUtils.FORMAT_NUMERIC_DATE);
            TabLayout tabLayout = this.f13753b;
            return C5842k0.m18857a(tabLayout, tabLayout.getSelectedTabPosition());
        }
    }

    public C5944a(boolean z) {
        this.f13750a = z;
    }

    /* renamed from: a */
    public final void mo17872a(View view, Function0<C13145v> function0) {
        Context context = view.getContext();
        C12880j.m40222a((Object) context, "view.context");
        boolean a = C5837i.m18836a(context);
        view.setVisibility(a ? 0 : 8);
        if (a) {
            view.setTag(C7310d.focusHelperExpandContentDetailHeaderOnFocus, Boolean.valueOf(true));
            view.setOnFocusChangeListener(new C5945a(function0));
        }
    }

    /* renamed from: a */
    public final void mo17873a(FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout, TabLayout tabLayout, Function2<? super Integer, ? super View, C13145v> function2) {
        Context context = focusSearchInterceptMotionLayout.getContext();
        C12880j.m40222a((Object) context, "view.context");
        boolean a = C5837i.m18836a(context);
        TextView textView = (TextView) focusSearchInterceptMotionLayout.findViewById(C7310d.metaData);
        C12880j.m40222a((Object) textView, "view.metaData");
        m19074a((View) textView, a);
        TextView textView2 = (TextView) focusSearchInterceptMotionLayout.findViewById(C7310d.formatAvailability);
        C12880j.m40222a((Object) textView2, "view.formatAvailability");
        m19074a((View) textView2, a);
        TextView textView3 = (TextView) focusSearchInterceptMotionLayout.findViewById(C7310d.featuredEpisodeTitle);
        C12880j.m40222a((Object) textView3, "view.featuredEpisodeTitle");
        m19074a((View) textView3, a);
        TextView textView4 = (TextView) focusSearchInterceptMotionLayout.findViewById(C7310d.videoDetailDescription);
        C12880j.m40222a((Object) textView4, "view.videoDetailDescription");
        m19074a((View) textView4, a);
        if (a && this.f13750a) {
            focusSearchInterceptMotionLayout.setFocusSearchInterceptor(new C5946b(function2, tabLayout));
        }
    }

    /* renamed from: a */
    private final void m19074a(View view, boolean z) {
        view.setFocusable(z);
        view.setTag(C7310d.focusHelperExpandContentDetailHeaderOnFocus, Boolean.valueOf(z));
    }
}
