package com.bamtechmedia.dominguez.core.design.widgets.p213e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import com.bamtechmedia.dominguez.core.p088i.C3835e;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3842l;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5842k0;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C10335c;
import com.google.android.material.tabs.TabLayout.C10336d;
import com.google.android.material.tabs.TabLayout.C10341g;
import java.util.Iterator;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002JS\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J0\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J7\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\"\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\bH\u0007J\u0014\u0010\"\u001a\u00020\u0004*\u00020\u00062\u0006\u0010#\u001a\u00020\u001cH\u0002J5\u0010$\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010%¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/tablayout/TabLayoutHelper;", "", "()V", "bindTabLayout", "", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "selectedPosition", "", "unselectedTextAppearanceOverride", "selectedTextAppearanceOverride", "display", "Landroid/view/Display;", "onTabSelectedAction", "Lkotlin/Function1;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "(Lcom/google/android/material/tabs/TabLayout;ILjava/lang/Integer;Ljava/lang/Integer;Landroid/view/Display;Lkotlin/jvm/functions/Function1;)V", "setFocusHelperTags", "setMarginsForChildItem", "view", "Landroid/view/View;", "viewPosition", "externalMargin", "internalMargin", "childCount", "setTabViewTextAppearance", "tab", "selected", "", "setTabViewTextAppearance$lib_release", "(Lcom/google/android/material/tabs/TabLayout$Tab;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "setupFocusabilityTabLayout", "wrapTabIndicatorToTitle", "tabSpacing", "blockFocusability", "block", "calculateTabWidth", "(Landroid/view/Display;ILjava/lang/Integer;Ljava/lang/Integer;Lcom/google/android/material/tabs/TabLayout;)V", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a */
/* compiled from: TabLayoutHelper.kt */
public final class C5681a {

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$a */
    /* compiled from: TabLayoutHelper.kt */
    public static final class C5682a implements C10336d {

        /* renamed from: a */
        final /* synthetic */ C5681a f13334a;

        /* renamed from: b */
        final /* synthetic */ Function1 f13335b;

        /* renamed from: c */
        final /* synthetic */ Integer f13336c;

        /* renamed from: d */
        final /* synthetic */ Integer f13337d;

        C5682a(C5681a aVar, Function1 function1, Integer num, Integer num2) {
            this.f13334a = aVar;
            this.f13335b = function1;
            this.f13336c = num;
            this.f13337d = num2;
        }

        /* renamed from: a */
        public void mo17519a(C10341g gVar) {
        }

        /* renamed from: b */
        public void mo17520b(C10341g gVar) {
            this.f13335b.invoke(gVar);
            this.f13334a.mo17516a(gVar, true, this.f13336c, this.f13337d);
        }

        /* renamed from: c */
        public void mo17521c(C10341g gVar) {
            this.f13334a.mo17516a(gVar, false, this.f13336c, this.f13337d);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$b */
    /* compiled from: TabLayoutHelper.kt */
    static final class C5683b extends C12881k implements C12853n<TabLayout, Boolean, Function2<? super Integer, ? super C10341g, ? extends C13145v>, C13145v> {

        /* renamed from: U */
        final /* synthetic */ int f13338U;

        /* renamed from: V */
        final /* synthetic */ Integer f13339V;

        /* renamed from: W */
        final /* synthetic */ Integer f13340W;

        /* renamed from: c */
        final /* synthetic */ C5681a f13341c;

        C5683b(C5681a aVar, int i, Integer num, Integer num2) {
            this.f13341c = aVar;
            this.f13338U = i;
            this.f13339V = num;
            this.f13340W = num2;
            super(3);
        }

        /* renamed from: a */
        public static /* synthetic */ void m18564a(C5683b bVar, TabLayout tabLayout, boolean z, Function2 function2, int i, Object obj) {
            if ((i & 2) != 0) {
                function2 = null;
            }
            bVar.mo17522a(tabLayout, z, function2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo17522a((TabLayout) obj, ((Boolean) obj2).booleanValue(), (Function2) obj3);
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final void mo17522a(TabLayout tabLayout, boolean z, Function2<? super Integer, ? super C10341g, C13145v> function2) {
            Iterator it = new C12757d(0, tabLayout.getTabCount()).iterator();
            while (it.hasNext()) {
                int b = ((C13162e0) it).mo31079b();
                C10341g b2 = tabLayout.mo26895b(b);
                if (b2 != null) {
                    String str = "tab";
                    if (function2 != null) {
                        Integer valueOf = Integer.valueOf(b);
                        Intrinsics.checkReturnedValueIsNotNull((Object) b2, str);
                        C13145v vVar = (C13145v) function2.invoke(valueOf, b2);
                    }
                    C5681a aVar = this.f13341c;
                    Intrinsics.checkReturnedValueIsNotNull((Object) b2, str);
                    aVar.mo17516a(b2, z || b == this.f13338U, this.f13339V, this.f13340W);
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$c */
    /* compiled from: TabLayoutHelper.kt */
    static final class C5684c extends C12881k implements C12853n<View, Integer, Integer, C13145v> {

        /* renamed from: c */
        final /* synthetic */ Point f13342c;

        C5684c(Point point) {
            this.f13342c = point;
            super(3);
        }

        /* renamed from: a */
        public final void mo17523a(View view, int i, int i2) {
            Point point = this.f13342c;
            view.measure(point.x, point.y);
            view.setMinimumWidth(view.getMeasuredWidth());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo17523a((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$d */
    /* compiled from: TabLayoutHelper.kt */
    static final class C5685d extends C12881k implements Function2<Integer, C10341g, C13145v> {

        /* renamed from: c */
        final /* synthetic */ int f13343c;

        C5685d(int i) {
            this.f13343c = i;
            super(2);
        }

        /* renamed from: a */
        public final void mo17524a(int i, C10341g gVar) {
            if (i == this.f13343c) {
                gVar.mo26970h();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo17524a(((Number) obj).intValue(), (C10341g) obj2);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$e */
    /* compiled from: TabLayoutHelper.kt */
    static final class C5686e extends C12881k implements C12853n<View, Integer, Integer, C13145v> {

        /* renamed from: c */
        public static final C5686e f13344c = new C5686e();

        C5686e() {
            super(3);
        }

        /* renamed from: a */
        public final void mo17525a(View view, int i, int i2) {
            int i3 = C3838h.focusHelperHorizontalFocusSearchWithinParent;
            Boolean valueOf = Boolean.valueOf(true);
            view.setTag(i3, valueOf);
            view.setTag(C3838h.focusHelperTabView, valueOf);
            int i4 = C3838h.focusHelperExpandNavOnFocusSearchLeft;
            if (i != 0) {
                valueOf = null;
            }
            view.setTag(i4, valueOf);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo17525a((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$f */
    /* compiled from: TabLayoutHelper.kt */
    static final class C5687f implements OnFocusChangeListener {

        /* renamed from: U */
        final /* synthetic */ TabLayout f13345U;

        /* renamed from: V */
        final /* synthetic */ int f13346V;

        /* renamed from: c */
        final /* synthetic */ C5681a f13347c;

        C5687f(C5681a aVar, TabLayout tabLayout, int i) {
            this.f13347c = aVar;
            this.f13345U = tabLayout;
            this.f13346V = i;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f13347c.m18557a(this.f13345U, false);
                View a = C5842k0.m18857a(this.f13345U, this.f13346V);
                if (a != null) {
                    a.requestFocus();
                }
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "", "tabView", "Landroid/view/View;", "index", "", "<anonymous parameter 2>", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$g */
    /* compiled from: TabLayoutHelper.kt */
    static final class C5688g extends C12881k implements C12853n<View, Integer, Integer, C13145v> {

        /* renamed from: U */
        final /* synthetic */ TabLayout f13348U;

        /* renamed from: c */
        final /* synthetic */ C5681a f13349c;

        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$g$a */
        /* compiled from: TabLayoutHelper.kt */
        static final class C5689a implements OnFocusChangeListener {

            /* renamed from: U */
            final /* synthetic */ int f13350U;

            /* renamed from: c */
            final /* synthetic */ C5688g f13351c;

            C5689a(C5688g gVar, int i) {
                this.f13351c = gVar;
                this.f13350U = i;
            }

            public final void onFocusChange(View view, boolean z) {
                C5688g gVar = this.f13351c;
                gVar.f13349c.m18557a(gVar.f13348U, !z);
                if (z) {
                    C10341g b = this.f13351c.f13348U.mo26895b(this.f13350U);
                    if (b != null && !b.mo26968f()) {
                        b.mo26970h();
                    }
                }
            }
        }

        C5688g(C5681a aVar, TabLayout tabLayout) {
            this.f13349c = aVar;
            this.f13348U = tabLayout;
            super(3);
        }

        /* renamed from: a */
        public final void mo17527a(View view, int i, int i2) {
            view.setOnFocusChangeListener(new C5689a(this, i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo17527a((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.e.a$h */
    /* compiled from: TabLayoutHelper.kt */
    static final class C5690h extends C12881k implements C12853n<View, Integer, Integer, C13145v> {

        /* renamed from: U */
        final /* synthetic */ int f13352U;

        /* renamed from: V */
        final /* synthetic */ int f13353V;

        /* renamed from: c */
        final /* synthetic */ C5681a f13354c;

        C5690h(C5681a aVar, int i, int i2) {
            this.f13354c = aVar;
            this.f13352U = i;
            this.f13353V = i2;
            super(3);
        }

        /* renamed from: a */
        public final void mo17529a(View view, int i, int i2) {
            this.f13354c.m18550a(view, i, this.f13352U, this.f13353V / 2, i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo17529a((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m18553a(C5681a aVar, TabLayout tabLayout, int i, Integer num, Integer num2, Display display, Function1 function1, int i2, Object obj) {
        aVar.mo17518a(tabLayout, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : display, function1);
    }

    /* renamed from: a */
    public final void mo17518a(TabLayout tabLayout, int i, Integer num, Integer num2, Display display, Function1<? super C10341g, C13145v> function1) {
        Context context = tabLayout.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "tabLayout.context");
        if (C5837i.m18843e(context)) {
            m18556a(tabLayout, i);
        }
        m18552a(this, tabLayout, tabLayout.getResources().getDimensionPixelSize(C3835e.details_tab_spacing), 0, 4, (Object) null);
        tabLayout.mo26879a();
        tabLayout.mo26884a((C10335c) new C5682a(this, function1, num, num2));
        m18555a(tabLayout);
        if (display != null) {
            m18549a(display, i, num, num2, tabLayout);
            return;
        }
        C10341g b = tabLayout.mo26895b(i);
        if (b != null) {
            b.mo26970h();
            Intrinsics.checkReturnedValueIsNotNull((Object) b, "tab");
            mo17516a(b, true, num, num2);
        }
    }

    /* renamed from: a */
    private final void m18549a(Display display, int i, Integer num, Integer num2, TabLayout tabLayout) {
        C5683b bVar = new C5683b(this, i, num, num2);
        C5683b.m18564a(bVar, tabLayout, true, null, 2, null);
        Point point = new Point();
        display.getSize(point);
        C5842k0.m18859a(tabLayout, (C12853n<? super View, ? super Integer, ? super Integer, C13145v>) new C5684c<Object,Object,Object,C13145v>(point));
        bVar.mo17522a(tabLayout, false, new C5685d(i));
    }

    /* renamed from: a */
    private final void m18556a(TabLayout tabLayout, int i) {
        m18557a(tabLayout, !tabLayout.hasFocus());
        tabLayout.setOnFocusChangeListener(new C5687f(this, tabLayout, i));
        C5842k0.m18859a(tabLayout, (C12853n<? super View, ? super Integer, ? super Integer, C13145v>) new C5688g<Object,Object,Object,C13145v>(this, tabLayout));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18557a(TabLayout tabLayout, boolean z) {
        tabLayout.setDescendantFocusability(z ? 393216 : DateUtils.FORMAT_NUMERIC_DATE);
    }

    /* renamed from: a */
    public final void mo17516a(C10341g gVar, boolean z, Integer num, Integer num2) {
        int i;
        View a = gVar.mo26956a();
        if (!(a instanceof TextView)) {
            a = null;
        }
        TextView textView = (TextView) a;
        if (textView != null) {
            ColorStateList textColors = textView.getTextColors();
            Context context = textView.getContext();
            boolean e = context != null ? C5837i.m18843e(context) : false;
            if (z && num2 != null) {
                i = num2.intValue();
            } else if (!z && num != null) {
                i = num.intValue();
            } else if (e && z) {
                i = C3842l.Disney_TextAppearance_ButtonFocused;
            } else if (e) {
                i = C3842l.Disney_TextAppearance_ButtonUnfocused;
            } else if (z) {
                i = C3842l.Disney_TextAppearance_ButtonFocused;
            } else {
                i = C3842l.Disney_TextAppearance_ButtonUnfocused;
            }
            C0513i.m2778d(textView, i);
            textView.setTextColor(textColors);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m18552a(C5681a aVar, TabLayout tabLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        aVar.mo17517a(tabLayout, i, i2);
    }

    /* renamed from: a */
    public final void mo17517a(TabLayout tabLayout, int i, int i2) {
        C5842k0.m18859a(tabLayout, (C12853n<? super View, ? super Integer, ? super Integer, C13145v>) new C5690h<Object,Object,Object,C13145v>(this, i2, i));
        tabLayout.requestLayout();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18550a(View view, int i, int i2, int i3, int i4) {
        view.setMinimumWidth(0);
        view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (i == 0) {
                    int i5 = marginLayoutParams.topMargin;
                    int i6 = marginLayoutParams.bottomMargin;
                    marginLayoutParams.setMarginStart(i2);
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.setMarginEnd(i3);
                    marginLayoutParams.bottomMargin = i6;
                } else if (i == i4 - 1) {
                    int i7 = marginLayoutParams.topMargin;
                    int i8 = marginLayoutParams.bottomMargin;
                    marginLayoutParams.setMarginStart(i3);
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.setMarginEnd(i2);
                    marginLayoutParams.bottomMargin = i8;
                } else {
                    int i9 = marginLayoutParams.topMargin;
                    int i10 = marginLayoutParams.bottomMargin;
                    marginLayoutParams.setMarginStart(i3);
                    marginLayoutParams.topMargin = i9;
                    marginLayoutParams.setMarginEnd(i3);
                    marginLayoutParams.bottomMargin = i10;
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: a */
    private final void m18555a(TabLayout tabLayout) {
        C5842k0.m18859a(tabLayout, (C12853n<? super View, ? super Integer, ? super Integer, C13145v>) C5686e.f13344c);
    }
}
