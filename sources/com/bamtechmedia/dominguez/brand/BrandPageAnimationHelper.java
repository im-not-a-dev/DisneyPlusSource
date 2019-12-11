package com.bamtechmedia.dominguez.brand;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.core.p084g.p086d.C3822a;
import com.bamtechmedia.dominguez.core.utils.C5846m0;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5363f;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020\u001fJ\u0006\u0010%\u001a\u00020\u001fJ\u0014\u0010&\u001a\u00020\u001f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0(R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/brand/BrandPageAnimationHelper;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "fragment", "Lcom/bamtechmedia/dominguez/brand/BrandPageFragment;", "(Lcom/bamtechmedia/dominguez/brand/BrandPageFragment;)V", "backgroundView", "Landroid/view/View;", "getBackgroundView", "()Landroid/view/View;", "enterAnimatorSet", "Landroid/animation/AnimatorSet;", "enterAnimatorSet$annotations", "()V", "getEnterAnimatorSet$core_release", "()Landroid/animation/AnimatorSet;", "setEnterAnimatorSet$core_release", "(Landroid/animation/AnimatorSet;)V", "logoFadeInAnimator", "Landroid/animation/ValueAnimator;", "logoFadeInAnimator$annotations", "getLogoFadeInAnimator$core_release", "()Landroid/animation/ValueAnimator;", "setLogoFadeInAnimator$core_release", "(Landroid/animation/ValueAnimator;)V", "logoView", "getLogoView", "tilesView", "Landroidx/recyclerview/widget/RecyclerView;", "getTilesView", "()Landroidx/recyclerview/widget/RecyclerView;", "cancelLogoFadeInAnimatorAndRemoveListeners", "", "cancelLogoFadeInAnimatorAndRemoveListeners$core_release", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "prepareEnterAnimation", "startBrandLogoFadeOutAnimation", "startEnterAnimation", "animationEndAction", "Lkotlin/Function0;", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BrandPageAnimationHelper.kt */
public final class BrandPageAnimationHelper implements C0710d {

    /* renamed from: U */
    private AnimatorSet f8117U;

    /* renamed from: V */
    private final C3176e f8118V;

    /* renamed from: c */
    private ValueAnimator f8119c;

    /* renamed from: com.bamtechmedia.dominguez.brand.BrandPageAnimationHelper$a */
    /* compiled from: BrandPageAnimationHelper.kt */
    public static final class C3168a {
        private C3168a() {
        }

        public /* synthetic */ C3168a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.BrandPageAnimationHelper$b */
    /* compiled from: Animator.kt */
    public static final class C3169b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BrandPageAnimationHelper f8120a;

        public C3169b(BrandPageAnimationHelper brandPageAnimationHelper) {
            this.f8120a = brandPageAnimationHelper;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f8120a.m11074g().setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.BrandPageAnimationHelper$c */
    /* compiled from: Animator.kt */
    public static final class C3170c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f8121a;

        public C3170c(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3, ValueAnimator valueAnimator4, ValueAnimator valueAnimator5, Function0 function0) {
            this.f8121a = function0;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f8121a.invoke();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    static {
        new C3168a(null);
    }

    public BrandPageAnimationHelper(C3176e eVar) {
        this.f8118V = eVar;
    }

    /* renamed from: f */
    private final View m11073f() {
        View _$_findCachedViewById = this.f8118V._$_findCachedViewById(C5363f.brandBackgroundImageView);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "fragment.brandBackgroundImageView");
        return _$_findCachedViewById;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final View m11074g() {
        ImageView imageView = (ImageView) this.f8118V._$_findCachedViewById(C5363f.brandLogoImageView);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "fragment.brandLogoImageView");
        return imageView;
    }

    /* renamed from: h */
    private final RecyclerView m11075h() {
        RecyclerView recyclerView = (RecyclerView) this.f8118V._$_findCachedViewById(C5363f.brandRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "fragment.brandRecyclerView");
        return recyclerView;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public final void mo12215b() {
        AnimatorSet animatorSet = this.f8117U;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        ValueAnimator valueAnimator = this.f8119c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f8119c = null;
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public final void mo12216d() {
        m11073f().setAlpha(0.0f);
        m11075h().setAlpha(0.0f);
        m11074g().setAlpha(0.0f);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public final void mo12217e() {
        mo12215b();
        ValueAnimator b = C5846m0.m18872b(m11074g(), 150, 0, 0.0f, null, 14, null);
        b.addListener(new C3169b(this));
        b.start();
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: a */
    public final void mo12214a(Function0<C13145v> function0) {
        float f;
        ValueAnimator a = C5846m0.m18870a(m11075h(), 1000, 1000, 0.0f, null, 12, null);
        ValueAnimator a2 = C5846m0.m18870a(m11073f(), 1200, 0, 0.0f, null, 14, null);
        Context context = m11075h().getContext();
        if (context != null) {
            Resources resources = context.getResources();
            Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
            f = TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
        } else {
            f = 0.0f;
        }
        ValueAnimator a3 = C5846m0.m18867a(m11075h(), 0.0f, 1200, 1000, f, C3822a.f9509k.mo13750e());
        ValueAnimator a4 = C5846m0.m18867a(m11074g(), 0.0f, 1350, 1350, f, C3822a.f9509k.mo13750e());
        ValueAnimator b = C5846m0.m18872b(m11074g(), 150, 3400, 1.0f, null, 8, null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a2, a, a3, a4, b});
        C3170c cVar = new C3170c(a2, a, a3, a4, b, function0);
        animatorSet.addListener(cVar);
        animatorSet.start();
        this.f8117U = animatorSet;
        ValueAnimator a5 = C5846m0.m18870a(m11074g(), 1000, 1400, 0.0f, null, 12, null);
        a5.start();
        this.f8119c = a5;
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        ValueAnimator valueAnimator = this.f8119c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f8119c = null;
        AnimatorSet animatorSet = this.f8117U;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f8117U;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f8117U = null;
    }
}
