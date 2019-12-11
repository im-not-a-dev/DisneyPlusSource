package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.core.p088i.C3835e;
import com.bamtechmedia.dominguez.core.p088i.C3838h;
import com.bamtechmedia.dominguez.core.p088i.C3840j;
import com.bamtechmedia.dominguez.core.utils.C5816a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p174d.p178b.p185g0.p187w5.C5187b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J \u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002JD\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140'R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006)"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/OnboardingToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disneyToolbar", "Lcom/bamtechmedia/dominguez/core/design/widgets/DisneyTitleToolbar;", "getDisneyToolbar", "()Lcom/bamtechmedia/dominguez/core/design/widgets/DisneyTitleToolbar;", "isToolbarSet", "", "()Z", "setToolbarSet", "(Z)V", "animateLogo", "Lkotlin/Function1;", "", "topMargin", "insetTop", "delay", "calculateNewTopMargin", "hasLogo", "activity", "Landroidx/fragment/app/FragmentActivity;", "calculateTopMargin", "inset", "Landroid/view/WindowInsets;", "setToolbar", "view", "Landroid/view/View;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "layout", "Landroid/view/ViewGroup;", "backAction", "Lkotlin/Function0;", "Companion", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OnboardingToolbar.kt */
public final class OnboardingToolbar extends ConstraintLayout {

    /* renamed from: r0 */
    private final DisneyTitleToolbar f13263r0;

    /* renamed from: s0 */
    private boolean f13264s0;

    /* renamed from: t0 */
    private HashMap f13265t0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar$a */
    /* compiled from: OnboardingToolbar.kt */
    public static final class C5651a {
        private C5651a() {
        }

        public /* synthetic */ C5651a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar$b */
    /* compiled from: OnboardingToolbar.kt */
    static final class C5652b extends C12881k implements Function1<Integer, C13145v> {

        /* renamed from: U */
        final /* synthetic */ int f13266U;

        /* renamed from: V */
        final /* synthetic */ int f13267V;

        /* renamed from: W */
        final /* synthetic */ float f13268W;

        /* renamed from: c */
        final /* synthetic */ OnboardingToolbar f13269c;

        C5652b(OnboardingToolbar onboardingToolbar, int i, int i2, float f) {
            this.f13269c = onboardingToolbar;
            this.f13266U = i;
            this.f13267V = i2;
            this.f13268W = f;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return C13145v.f29587a;
        }

        public final void invoke(int i) {
            float a = C12762h.m39912a(((float) (i + this.f13266U)) / ((float) this.f13267V), 1.0f);
            int i2 = (int) (((float) this.f13267V) - (this.f13268W * a));
            float a2 = C12762h.m39912a(((0.6f * a) + 1.0f) - a, 1.0f);
            View c = this.f13269c.mo2145c(C3838h.onboardingDisneyLogo);
            String str = "onboardingDisneyLogo";
            Intrinsics.checkReturnedValueIsNotNull((Object) c, str);
            c.setScaleX(a2);
            View c2 = this.f13269c.mo2145c(C3838h.onboardingDisneyLogo);
            Intrinsics.checkReturnedValueIsNotNull((Object) c2, str);
            c2.setScaleY(a2);
            FrameLayout frameLayout = (FrameLayout) this.f13269c.mo2145c(C3838h.onboardingDisneyLogoLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) frameLayout, "onboardingDisneyLogoLayout");
            frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), i2, frameLayout.getPaddingEnd(), frameLayout.getPaddingBottom());
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "inset", "Landroid/view/WindowInsets;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar$c */
    /* compiled from: OnboardingToolbar.kt */
    static final class C5653c extends C12881k implements Function1<WindowInsets, C13145v> {

        /* renamed from: U */
        final /* synthetic */ NestedScrollView f13270U;

        /* renamed from: V */
        final /* synthetic */ ViewGroup f13271V;

        /* renamed from: W */
        final /* synthetic */ boolean f13272W;

        /* renamed from: X */
        final /* synthetic */ C0532d f13273X;

        /* renamed from: Y */
        final /* synthetic */ Function0 f13274Y;

        /* renamed from: c */
        final /* synthetic */ OnboardingToolbar f13275c;

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "scrollView", "Landroidx/core/widget/NestedScrollView;", "content", "Landroid/view/ViewGroup;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
        /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar$c$a */
        /* compiled from: OnboardingToolbar.kt */
        static final class C5654a extends C12881k implements Function2<NestedScrollView, ViewGroup, C13145v> {

            /* renamed from: U */
            final /* synthetic */ WindowInsets f13276U;

            /* renamed from: c */
            final /* synthetic */ C5653c f13277c;

            /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar$c$a$a */
            /* compiled from: OnboardingToolbar.kt */
            static final class C5655a extends C12881k implements Function1<Integer, C13145v> {

                /* renamed from: c */
                public static final C5655a f13278c = new C5655a();

                C5655a() {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return C13145v.f29587a;
                }

                public final void invoke(int i) {
                }
            }

            C5654a(C5653c cVar, WindowInsets windowInsets) {
                this.f13277c = cVar;
                this.f13276U = windowInsets;
                super(2);
            }

            /* renamed from: a */
            public final void mo17464a(NestedScrollView nestedScrollView, ViewGroup viewGroup) {
                C5653c cVar = this.f13277c;
                int a = cVar.f13275c.m18498a(cVar.f13272W, cVar.f13273X, this.f13276U);
                C5653c cVar2 = this.f13277c;
                viewGroup.setPaddingRelative(viewGroup.getPaddingStart(), cVar2.f13275c.m18497a(cVar2.f13272W, a, cVar2.f13273X), viewGroup.getPaddingEnd(), viewGroup.getPaddingBottom());
                FrameLayout frameLayout = (FrameLayout) this.f13277c.f13275c.mo2145c(C3838h.onboardingDisneyLogoLayout);
                Intrinsics.checkReturnedValueIsNotNull((Object) frameLayout, "onboardingDisneyLogoLayout");
                int i = 0;
                frameLayout.setVisibility(this.f13277c.f13272W ? 0 : 8);
                Context context = this.f13277c.f13275c.getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
                if (C5837i.m18842d(context) && this.f13277c.f13272W) {
                    i = a;
                }
                DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) this.f13277c.f13275c.mo2145c(C3838h.onboardingDisneyToolbar);
                C5653c cVar3 = this.f13277c;
                disneyTitleToolbar.mo17373a(nestedScrollView, cVar3.f13272W ? cVar3.f13275c.m18501b(a, this.f13276U.getSystemWindowInsetTop(), i) : C5655a.f13278c, i, this.f13277c.f13274Y);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo17464a((NestedScrollView) obj, (ViewGroup) obj2);
                return C13145v.f29587a;
            }
        }

        C5653c(OnboardingToolbar onboardingToolbar, NestedScrollView nestedScrollView, ViewGroup viewGroup, boolean z, C0532d dVar, Function0 function0) {
            this.f13275c = onboardingToolbar;
            this.f13270U = nestedScrollView;
            this.f13271V = viewGroup;
            this.f13272W = z;
            this.f13273X = dVar;
            this.f13274Y = function0;
            super(1);
        }

        /* renamed from: a */
        public final void mo17463a(WindowInsets windowInsets) {
            if (!this.f13275c.mo2144c()) {
                C5884x.m18949a(this.f13270U, this.f13271V, new C5654a(this, windowInsets));
                this.f13275c.setToolbarSet(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17463a((WindowInsets) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C5651a(null);
    }

    public OnboardingToolbar(Context context) {
        this(context, null, 0, 6, null);
    }

    public OnboardingToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OnboardingToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Function1<Integer, C13145v> m18501b(int i, int i2, int i3) {
        float f;
        Context context = getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
        if (C5837i.m18842d(context)) {
            f = (float) i;
        } else {
            f = ((float) (i - i2)) + getResources().getDimension(C3835e.padding_small);
        }
        return new C5652b(this, i3, i, f);
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f13265t0 == null) {
            this.f13265t0 = new HashMap();
        }
        View view = (View) this.f13265t0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13265t0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final boolean mo2144c() {
        return this.f13264s0;
    }

    public final DisneyTitleToolbar getDisneyToolbar() {
        return this.f13263r0;
    }

    public final void setToolbarSet(boolean z) {
        this.f13264s0 = z;
    }

    public OnboardingToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, C3840j.include_onboarding_toolbar, this);
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) mo2145c(C3838h.onboardingDisneyToolbar);
        Intrinsics.checkReturnedValueIsNotNull((Object) disneyTitleToolbar, "onboardingDisneyToolbar");
        this.f13263r0 = disneyTitleToolbar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m18500a(OnboardingToolbar onboardingToolbar, C0532d dVar, View view, NestedScrollView nestedScrollView, ViewGroup viewGroup, boolean z, Function0 function0, int i, Object obj) {
        onboardingToolbar.mo17459a(dVar, view, nestedScrollView, viewGroup, (i & 16) != 0 ? true : z, function0);
    }

    /* renamed from: a */
    public final void mo17459a(C0532d dVar, View view, NestedScrollView nestedScrollView, ViewGroup viewGroup, boolean z, Function0<C13145v> function0) {
        C5816a.m18809b(dVar);
        if (view != null) {
            C5653c cVar = new C5653c(this, nestedScrollView, viewGroup, z, dVar, function0);
            C5852n0.m18884a(view, false, false, cVar, 2, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m18497a(boolean z, int i, C0532d dVar) {
        int i2;
        if (z) {
            FrameLayout frameLayout = (FrameLayout) mo2145c(C3838h.onboardingDisneyLogoLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) frameLayout, "onboardingDisneyLogoLayout");
            frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), i, frameLayout.getPaddingEnd(), frameLayout.getPaddingBottom());
            Point point = new Point();
            WindowManager windowManager = dVar.getWindowManager();
            Intrinsics.checkReturnedValueIsNotNull((Object) windowManager, "activity.windowManager");
            windowManager.getDefaultDisplay().getSize(point);
            mo2145c(C3838h.onboardingDisneyLogo).measure(point.x, point.y);
            View c = mo2145c(C3838h.onboardingDisneyLogo);
            Intrinsics.checkReturnedValueIsNotNull((Object) c, "onboardingDisneyLogo");
            i2 = c.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        return i + i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m18498a(boolean z, C0532d dVar, WindowInsets windowInsets) {
        int i;
        int i2;
        Context context = getContext();
        String str = "context";
        Intrinsics.checkReturnedValueIsNotNull((Object) context, str);
        String str2 = "resources";
        if (!C5837i.m18842d(context) || !C5187b.m17511a(getContext())) {
            Context context2 = getContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) context2, str);
            if (C5837i.m18842d(context2)) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                WindowManager windowManager = dVar.getWindowManager();
                Intrinsics.checkReturnedValueIsNotNull((Object) windowManager, "activity.windowManager");
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                return (int) (((double) displayMetrics.heightPixels) * 0.1875d);
            }
            if (z) {
                Context context3 = getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context3, str);
                Resources resources = context3.getResources();
                Intrinsics.checkReturnedValueIsNotNull((Object) resources, str2);
                i2 = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
                i = windowInsets.getSystemWindowInsetTop();
            } else {
                Context context4 = getContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) context4, str);
                Resources resources2 = context4.getResources();
                Intrinsics.checkReturnedValueIsNotNull((Object) resources2, str2);
                i2 = (int) TypedValue.applyDimension(1, 64.0f, resources2.getDisplayMetrics());
                i = windowInsets.getSystemWindowInsetTop();
            }
            return i2 + i;
        }
        Context context5 = getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context5, str);
        Resources resources3 = context5.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources3, str2);
        return (int) TypedValue.applyDimension(1, 96.0f, resources3.getDisplayMetrics());
    }
}
