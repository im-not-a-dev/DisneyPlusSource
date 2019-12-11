package com.bamtechmedia.dominguez.core.utils;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0007\u001a\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\u0004\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004\u001a\n\u0010\u000f\u001a\u00020\u0003*\u00020\u0004\u001a\u0012\u0010\u0010\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004\u001a\u0014\u0010\u0011\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\r\u001a\u0014\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\r\u001a\u0012\u0010\u0015\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\u0019\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\r\u001a4\u0010\u001b\u001a\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u001f\u001a\n\u0010!\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\"\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006#"}, mo31007d2 = {"SCALE_PIVOT", "", "animateScaleWithFocus", "", "Landroid/view/View;", "hasFocus", "", "fadeOutBeforeDismiss", "isEditMode", "dismiss", "Lkotlin/Function0;", "focusedScale", "getTopRelativeTo", "", "root", "hide", "isDirectOrNestedChildOf", "requestFocusWithAccessibility", "direction", "roundedTopCorner", "dimenRes", "scale", "scaleView", "startScale", "endScale", "setNextAccessibilityTraversal", "traversalToId", "setPaddingToSystemWindowOffsets", "top", "bottom", "insetsApplied", "Lkotlin/Function1;", "Landroid/view/WindowInsets;", "show", "unfocusedScale", "core-utils_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.utils.n0 */
/* compiled from: ViewExt.kt */
public final class C5852n0 {

    /* renamed from: com.bamtechmedia.dominguez.core.utils.n0$a */
    /* compiled from: ViewExt.kt */
    static final class C5853a extends C12881k implements Function1<WindowInsets, C13145v> {

        /* renamed from: c */
        public static final C5853a f13636c = new C5853a();

        C5853a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17759a(WindowInsets windowInsets) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17759a((WindowInsets) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.utils.n0$b */
    /* compiled from: ViewExt.kt */
    static final class C5854b implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ boolean f13637a;

        /* renamed from: b */
        final /* synthetic */ boolean f13638b;

        /* renamed from: c */
        final /* synthetic */ Function1 f13639c;

        C5854b(boolean z, boolean z2, Function1 function1) {
            this.f13637a = z;
            this.f13638b = z2;
            this.f13639c = function1;
        }

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            int i;
            Intrinsics.checkReturnedValueIsNotNull((Object) windowInsets, "insets");
            int i2 = 0;
            String str = "v";
            if (this.f13637a) {
                Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
                view.setPadding(view.getPaddingLeft(), windowInsets.getSystemWindowInsetTop(), view.getPaddingRight(), view.getPaddingBottom());
                i = 0;
            } else {
                i = windowInsets.getSystemWindowInsetTop();
            }
            if (this.f13638b) {
                Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
            } else {
                i2 = windowInsets.getSystemWindowInsetBottom();
            }
            WindowInsets replaceSystemWindowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), i, windowInsets.getSystemWindowInsetRight(), i2);
            Intrinsics.checkReturnedValueIsNotNull((Object) replaceSystemWindowInsets, "replaceSystemWindowInset…left, top, right, bottom)");
            this.f13639c.invoke(windowInsets);
            return replaceSystemWindowInsets;
        }
    }

    /* renamed from: a */
    public static final void m18877a(View view) {
        m18879a(view, view.getScaleX(), 1.1f);
    }

    /* renamed from: b */
    public static final boolean m18889b(View view, View view2) {
        if (Intrinsics.areEqual((Object) view.getParent(), (Object) view2)) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view3 = (View) parent;
        if (view3 != null) {
            return m18889b(view3, view2);
        }
        return false;
    }

    /* renamed from: c */
    public static final void m18890c(View view) {
        view.setVisibility(0);
    }

    /* renamed from: d */
    public static final void m18891d(View view) {
        m18879a(view, view.getScaleX(), 1.0f);
    }

    /* renamed from: a */
    public static final void m18880a(View view, boolean z) {
        if (z) {
            m18877a(view);
        } else {
            m18891d(view);
        }
    }

    /* renamed from: b */
    public static final void m18887b(View view) {
        view.setVisibility(8);
    }

    /* renamed from: a */
    private static final void m18879a(View view, float f, float f2) {
        C3800a.m12829a(view, 0.0f, 0.0f, f, f2, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 100, 0, null, null, null, null, 258035, null);
    }

    /* renamed from: b */
    public static final void m18888b(View view, int i) {
        if (VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(i);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m18884a(View view, boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            function1 = C5853a.f13636c;
        }
        m18883a(view, z, z2, function1);
    }

    /* renamed from: a */
    public static final void m18883a(View view, boolean z, boolean z2, Function1<? super WindowInsets, C13145v> function1) {
        view.setOnApplyWindowInsetsListener(new C5854b(z, z2, function1));
    }

    /* renamed from: a */
    public static final void m18878a(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
    }

    /* renamed from: a */
    public static final void m18881a(View view, boolean z, Function0<C13145v> function0) {
        C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, z ? 50 : 300, 0, null, null, function0, null, 192509, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18882a(View view, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        m18881a(view, z, function0);
    }

    /* renamed from: a */
    public static final int m18876a(View view, View view2) {
        if (Intrinsics.areEqual((Object) view.getParent(), (Object) view2)) {
            return view.getTop();
        }
        int top = view.getTop();
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view3 = (View) parent;
        return (view3 != null ? m18876a(view3, view2) : 0) + top;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m18886a(View view, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 130;
        }
        return m18885a(view, i);
    }

    /* renamed from: a */
    public static final boolean m18885a(View view, int i) {
        boolean requestFocus = view.requestFocus(i);
        if (requestFocus) {
            view.sendAccessibilityEvent(8);
        }
        return requestFocus;
    }
}
