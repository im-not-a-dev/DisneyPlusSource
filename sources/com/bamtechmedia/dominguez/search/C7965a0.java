package com.bamtechmedia.dominguez.search;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import com.bamtechmedia.dominguez.collections.items.ShelfItemLayout;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5846m0;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002/0B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JG\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0000¢\u0006\u0002\b\u0014J>\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0002J4\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002J<\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u001e\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017J\b\u0010'\u001a\u00020\u001bH\u0002J\u0016\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0017H\u0002J\u0016\u0010*\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017J\u0018\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J,\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper;", "", "fragment", "Lcom/bamtechmedia/dominguez/search/SearchTvFragment;", "(Lcom/bamtechmedia/dominguez/search/SearchTvFragment;)V", "transitionState", "Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper$TransitionState;", "animateTopMarginTo", "", "topMarginId", "", "resources", "Landroid/content/res/Resources;", "searchRootView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "searchLayout", "Landroid/widget/LinearLayout;", "keyboard", "endAction", "Lkotlin/Function0;", "animateTopMarginTo$search_release", "animateViews", "showExploreLabel", "", "showSearchLayout", "showKeyboard", "recyclerViewY", "", "searchLayoutY", "searchDurations", "Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper$SearchAnimationDurations;", "applyInstantViewUpdates", "generateAnimatorSet", "Landroid/animation/AnimatorSet;", "onCollectionTileFocusChange", "newFocus", "Landroid/view/View;", "isExploreCollection", "topMarginIsInitial", "recyclerViewTranslationY", "restoreState", "searchLayoutOffset", "setExploreCollection", "topKeyboardMargin", "transitionToState", "state", "force", "SearchAnimationDurations", "TransitionState", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.a0 */
/* compiled from: SearchTvTransitionHelper.kt */
public final class C7965a0 {

    /* renamed from: a */
    private C7967b f17128a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8068y f17129b;

    /* renamed from: com.bamtechmedia.dominguez.search.a0$a */
    /* compiled from: SearchTvTransitionHelper.kt */
    private static final class C7966a {

        /* renamed from: a */
        private final long f17130a;

        /* renamed from: b */
        private final long f17131b;

        /* renamed from: c */
        private final long f17132c;

        public C7966a() {
            this(0, 0, 0, 7, null);
        }

        public C7966a(long j, long j2, long j3) {
            this.f17130a = j;
            this.f17131b = j2;
            this.f17132c = j3;
        }

        /* renamed from: a */
        public final long mo20936a() {
            return this.f17131b;
        }

        /* renamed from: b */
        public final long mo20937b() {
            return this.f17132c;
        }

        /* renamed from: c */
        public final long mo20938c() {
            return this.f17130a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7966a) {
                    C7966a aVar = (C7966a) obj;
                    if (this.f17130a == aVar.f17130a) {
                        if (this.f17131b == aVar.f17131b) {
                            if (this.f17132c == aVar.f17132c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.f17130a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f17131b;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f17132c;
            return i2 + ((int) (j3 ^ (j3 >>> 32)));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchAnimationDurations(translationDurationInMs=");
            sb.append(this.f17130a);
            sb.append(", fadeDurationInMs=");
            sb.append(this.f17131b);
            sb.append(", fadeInStartDelayInMs=");
            sb.append(this.f17132c);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7966a(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                j = 300;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = 200;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = 100;
            }
            this(j4, j5, j3);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper$TransitionState;", "", "()V", "Default", "Step1", "Step2", "Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper$TransitionState$Default;", "Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper$TransitionState$Step1;", "Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper$TransitionState$Step2;", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.search.a0$b */
    /* compiled from: SearchTvTransitionHelper.kt */
    public static abstract class C7967b {

        /* renamed from: com.bamtechmedia.dominguez.search.a0$b$a */
        /* compiled from: SearchTvTransitionHelper.kt */
        public static final class C7968a extends C7967b {

            /* renamed from: a */
            private final boolean f17133a;

            public C7968a(boolean z) {
                super(null);
                this.f17133a = z;
            }

            /* renamed from: a */
            public final boolean mo20942a() {
                return this.f17133a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C7968a) {
                        if (this.f17133a == ((C7968a) obj).f17133a) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                boolean z = this.f17133a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Default(exploreCollection=");
                sb.append(this.f17133a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.search.a0$b$b */
        /* compiled from: SearchTvTransitionHelper.kt */
        public static final class C7969b extends C7967b {

            /* renamed from: a */
            public static final C7969b f17134a = new C7969b();

            private C7969b() {
                super(null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.search.a0$b$c */
        /* compiled from: SearchTvTransitionHelper.kt */
        public static final class C7970c extends C7967b {

            /* renamed from: a */
            public static final C7970c f17135a = new C7970c();

            private C7970c() {
                super(null);
            }
        }

        private C7967b() {
        }

        public /* synthetic */ C7967b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.a0$c */
    /* compiled from: Transition.kt */
    public static final class C7971c implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f17136a;

        public C7971c(Function0 function0) {
            this.f17136a = function0;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f17136a.invoke();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.a0$d */
    /* compiled from: SearchTvTransitionHelper.kt */
    static final class C7972d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C7965a0 f17137a;

        C7972d(C7965a0 a0Var, long j) {
            this.f17137a = a0Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            RecyclerView recyclerView = (RecyclerView) this.f17137a.f17129b._$_findCachedViewById(C8048n.recyclerView);
            if (recyclerView != null) {
                C12880j.m40222a((Object) valueAnimator, "animator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    recyclerView.setTranslationY(((Float) animatedValue).floatValue());
                    return;
                }
                throw new C13142s("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.a0$e */
    /* compiled from: SearchTvTransitionHelper.kt */
    static final class C7973e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C7965a0 f17138a;

        C7973e(C7965a0 a0Var, long j) {
            this.f17138a = a0Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LinearLayout linearLayout = (LinearLayout) this.f17138a.f17129b._$_findCachedViewById(C8048n.searchLayout);
            String str = "null cannot be cast to non-null type kotlin.Float";
            String str2 = "animator";
            if (linearLayout != null) {
                C12880j.m40222a((Object) valueAnimator, str2);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    linearLayout.setTranslationY(((Float) animatedValue).floatValue());
                } else {
                    throw new C13142s(str);
                }
            }
            ImageView imageView = (ImageView) this.f17138a.f17129b._$_findCachedViewById(C8048n.microphoneImageView);
            if (imageView != null) {
                C12880j.m40222a((Object) valueAnimator, str2);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    imageView.setTranslationY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new C13142s(str);
            }
        }
    }

    public C7965a0(C8068y yVar) {
        this.f17129b = yVar;
    }

    /* renamed from: b */
    public final void mo20935b(boolean z, boolean z2) {
        C7967b bVar = this.f17128a;
        if (!(bVar instanceof C7968a)) {
            return;
        }
        if (bVar == null) {
            throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.search.SearchTvTransitionHelper.TransitionState.Default");
        } else if (((C7968a) bVar).mo20942a() != z) {
            m23226a(this, new C7968a(z), z2, null, false, 12, null);
        }
    }

    /* renamed from: a */
    public final void mo20934a(boolean z, boolean z2) {
        C7966a aVar = new C7966a(0, 0, 0);
        C7967b bVar = this.f17128a;
        if (bVar != null) {
            m23225a(bVar, z2, aVar, true);
            return;
        }
        m23226a(this, new C7968a(z), z2, aVar, false, 8, null);
    }

    /* renamed from: b */
    private final AnimatorSet m23229b(boolean z, boolean z2, boolean z3, float f, float f2, C7966a aVar) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        long j;
        String str;
        ValueAnimator valueAnimator3;
        ValueAnimator valueAnimator4;
        long a = aVar.mo20936a();
        long b = aVar.mo20937b();
        long c = aVar.mo20938c();
        String str2 = "fragment.exploreLabel";
        if (z) {
            TextView textView = (TextView) this.f17129b._$_findCachedViewById(C8048n.exploreLabel);
            C12880j.m40222a((Object) textView, str2);
            valueAnimator = C5846m0.m18870a(textView, a, b, 0.0f, null, 12, null);
        } else {
            TextView textView2 = (TextView) this.f17129b._$_findCachedViewById(C8048n.exploreLabel);
            C12880j.m40222a((Object) textView2, str2);
            valueAnimator = C5846m0.m18872b(textView2, a, 0, 0.0f, null, 14, null);
        }
        Animator animator = valueAnimator;
        String str3 = "fragment.keyboard";
        if (z3) {
            LinearLayout linearLayout = (LinearLayout) this.f17129b._$_findCachedViewById(C8048n.keyboard);
            C12880j.m40222a((Object) linearLayout, str3);
            valueAnimator2 = C5846m0.m18870a(linearLayout, a, b, 0.0f, null, 12, null);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) this.f17129b._$_findCachedViewById(C8048n.keyboard);
            C12880j.m40222a((Object) linearLayout2, str3);
            valueAnimator2 = C5846m0.m18872b(linearLayout2, a, 0, 0.0f, null, 14, null);
        }
        Animator animator2 = valueAnimator2;
        String str4 = "fragment.searchLayout";
        if (z2) {
            LinearLayout linearLayout3 = (LinearLayout) this.f17129b._$_findCachedViewById(C8048n.searchLayout);
            C12880j.m40222a((Object) linearLayout3, str4);
            j = c;
            str = str4;
            valueAnimator3 = C5846m0.m18870a(linearLayout3, a, b, 0.0f, null, 12, null);
        } else {
            j = c;
            str = str4;
            LinearLayout linearLayout4 = (LinearLayout) this.f17129b._$_findCachedViewById(C8048n.searchLayout);
            C12880j.m40222a((Object) linearLayout4, str);
            valueAnimator3 = C5846m0.m18872b(linearLayout4, a, 0, 0.0f, null, 14, null);
        }
        Animator animator3 = valueAnimator3;
        String str5 = "fragment.microphoneImageView";
        if (z2) {
            ImageView imageView = (ImageView) this.f17129b._$_findCachedViewById(C8048n.microphoneImageView);
            C12880j.m40222a((Object) imageView, str5);
            valueAnimator4 = C5846m0.m18870a(imageView, a, b, 0.0f, null, 12, null);
        } else {
            ImageView imageView2 = (ImageView) this.f17129b._$_findCachedViewById(C8048n.microphoneImageView);
            C12880j.m40222a((Object) imageView2, str5);
            valueAnimator4 = C5846m0.m18872b(imageView2, a, 0, 0.0f, null, 14, null);
        }
        RecyclerView recyclerView = (RecyclerView) this.f17129b._$_findCachedViewById(C8048n.recyclerView);
        C12880j.m40222a((Object) recyclerView, "fragment.recyclerView");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{recyclerView.getTranslationY(), f});
        String str6 = "it";
        C12880j.m40222a((Object) ofFloat, str6);
        long j2 = j;
        ofFloat.setDuration(j2);
        ofFloat.addUpdateListener(new C7972d(this, j2));
        LinearLayout linearLayout5 = (LinearLayout) this.f17129b._$_findCachedViewById(C8048n.searchLayout);
        C12880j.m40222a((Object) linearLayout5, str);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{linearLayout5.getTranslationY(), f2});
        C12880j.m40222a((Object) ofFloat2, str6);
        ofFloat2.setDuration(j2);
        ofFloat2.addUpdateListener(new C7973e(this, j2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2, animator3, valueAnimator4, ofFloat, ofFloat2});
        return animatorSet;
    }

    /* renamed from: a */
    public final void mo20933a(View view, boolean z, boolean z2) {
        C7967b bVar;
        C0794d0 d = ((RecyclerView) this.f17129b._$_findCachedViewById(C8048n.recyclerView)).mo4419d(view);
        if (view instanceof ShelfItemLayout) {
            Integer valueOf = d != null ? Integer.valueOf(d.getAdapterPosition()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                bVar = new C7968a(z);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                bVar = C7969b.f17134a;
            } else {
                bVar = C7970c.f17135a;
            }
        } else {
            bVar = new C7968a(z);
        }
        m23226a(this, bVar, z2, null, false, 12, null);
    }

    /* renamed from: a */
    static /* synthetic */ void m23226a(C7965a0 a0Var, C7967b bVar, boolean z, C7966a aVar, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = new C7966a(0, 0, 0, 7, null);
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        a0Var.m23225a(bVar, z, aVar, z2);
    }

    /* renamed from: a */
    private final void m23225a(C7967b bVar, boolean z, C7966a aVar, boolean z2) {
        float f;
        if (!C12880j.m40224a((Object) this.f17128a, (Object) bVar) || z2) {
            this.f17128a = bVar;
            Context requireContext = this.f17129b.requireContext();
            C12880j.m40222a((Object) requireContext, "fragment.requireContext()");
            float a = C5837i.m18833a(requireContext, C8046l.padding_extra_large);
            if (bVar instanceof C7968a) {
                C7968a aVar2 = (C7968a) bVar;
                boolean a2 = aVar2.mo20942a();
                if (aVar2.mo20942a()) {
                    TextView textView = (TextView) this.f17129b._$_findCachedViewById(C8048n.exploreLabel);
                    C12880j.m40222a((Object) textView, "fragment.exploreLabel");
                    f = (float) textView.getBottom();
                } else {
                    LinearLayout linearLayout = (LinearLayout) this.f17129b._$_findCachedViewById(C8048n.keyboard);
                    C12880j.m40222a((Object) linearLayout, "fragment.keyboard");
                    f = ((float) linearLayout.getBottom()) + a;
                }
                m23228a(a2, true, true, f, 0.0f, aVar);
            } else if (bVar instanceof C7969b) {
                m23228a(false, true, false, m23221a(), -m23222a(z), aVar);
            } else if (bVar instanceof C7970c) {
                m23228a(false, false, false, 0.0f, -m23222a(z), aVar);
            }
        }
    }

    /* renamed from: a */
    private final float m23221a() {
        Context requireContext = this.f17129b.requireContext();
        String str = "fragment.requireContext()";
        C12880j.m40222a((Object) requireContext, str);
        float a = C5837i.m18833a(requireContext, C8046l.step_1_tiles_top_margin);
        Context requireContext2 = this.f17129b.requireContext();
        C12880j.m40222a((Object) requireContext2, str);
        return a - C5837i.m18833a(requireContext2, C8046l.recyclerview_padding_top);
    }

    /* renamed from: a */
    private final float m23222a(boolean z) {
        if (!z) {
            return 0.0f;
        }
        Context requireContext = this.f17129b.requireContext();
        C12880j.m40222a((Object) requireContext, "fragment.requireContext()");
        return C5837i.m18833a(requireContext, C8046l.search_layout_margin_top_w_suggestions);
    }

    /* renamed from: a */
    private final void m23228a(boolean z, boolean z2, boolean z3, float f, float f2, C7966a aVar) {
        if (aVar.mo20938c() > 0) {
            m23229b(z, z2, z3, f, f2, aVar).start();
        } else {
            m23227a(z, z2, z3, f, f2);
        }
    }

    /* renamed from: a */
    private final void m23227a(boolean z, boolean z2, boolean z3, float f, float f2) {
        C8068y yVar = this.f17129b;
        TextView textView = (TextView) yVar._$_findCachedViewById(C8048n.exploreLabel);
        C12880j.m40222a((Object) textView, "exploreLabel");
        float f3 = 1.0f;
        textView.setAlpha(z ? 1.0f : 0.0f);
        LinearLayout linearLayout = (LinearLayout) yVar._$_findCachedViewById(C8048n.searchLayout);
        String str = "searchLayout";
        C12880j.m40222a((Object) linearLayout, str);
        linearLayout.setAlpha(z2 ? 1.0f : 0.0f);
        LinearLayout linearLayout2 = (LinearLayout) yVar._$_findCachedViewById(C8048n.searchLayout);
        C12880j.m40222a((Object) linearLayout2, str);
        linearLayout2.setTranslationY(f2);
        ImageView imageView = (ImageView) yVar._$_findCachedViewById(C8048n.microphoneImageView);
        String str2 = "microphoneImageView";
        C12880j.m40222a((Object) imageView, str2);
        imageView.setAlpha(z2 ? 1.0f : 0.0f);
        ImageView imageView2 = (ImageView) yVar._$_findCachedViewById(C8048n.microphoneImageView);
        C12880j.m40222a((Object) imageView2, str2);
        imageView2.setTranslationY(f2);
        LinearLayout linearLayout3 = (LinearLayout) yVar._$_findCachedViewById(C8048n.keyboard);
        C12880j.m40222a((Object) linearLayout3, "keyboard");
        if (!z3) {
            f3 = 0.0f;
        }
        linearLayout3.setAlpha(f3);
        RecyclerView recyclerView = (RecyclerView) yVar._$_findCachedViewById(C8048n.recyclerView);
        C12880j.m40222a((Object) recyclerView, "recyclerView");
        recyclerView.setTranslationY(f);
    }

    /* renamed from: a */
    public final void mo20932a(int i, Resources resources, ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, Function0<C13145v> function0) {
        C0425d dVar = new C0425d();
        dVar.mo2430c(constraintLayout);
        dVar.mo2412a(linearLayout.getId(), 3, (int) resources.getDimension(i));
        dVar.mo2412a(linearLayout2.getId(), 3, m23223a(i, resources));
        dVar.mo2427b(constraintLayout);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(new DecelerateInterpolator());
        changeBounds.setDuration((long) resources.getInteger(C8049o.duration2));
        changeBounds.addListener(new C7971c(function0));
        TransitionManager.beginDelayedTransition(constraintLayout, changeBounds);
    }

    /* renamed from: a */
    private final int m23223a(int i, Resources resources) {
        if (i == C8046l.search_layout_margin_top_w_suggestions) {
            return (int) resources.getDimension(C8046l.keyboard_layout_margin_top);
        }
        return 0;
    }
}
