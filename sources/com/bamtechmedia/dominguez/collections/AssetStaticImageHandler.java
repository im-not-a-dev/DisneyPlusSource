package com.bamtechmedia.dominguez.collections;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.framework.C5733a;
import com.bamtechmedia.dominguez.core.p084g.p086d.C3822a;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.concurrent.TimeUnit;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p275a0.C7159g;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.Completable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p527w.p529c.C11992a;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002;<B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J!\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0$\"\u00020%H\u0002¢\u0006\u0002\u0010&J!\u0010'\u001a\u00020\"2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0$\"\u00020%H\u0002¢\u0006\u0002\u0010&J\u0006\u0010(\u001a\u00020\u0018J\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fJ\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016J;\u0010-\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0019\b\u0002\u00102\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001803¢\u0006\u0002\b5H\u0002J\u0010\u00106\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\"\u00107\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001803J\u0006\u00109\u001a\u00020\u0018J$\u0010:\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001803H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006="}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/AssetStaticImageHandler;", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "ripcutImageLoader", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "(Landroid/content/Context;Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader;Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "animatorSet", "Landroid/animation/AnimatorSet;", "delayDisposable", "Lio/reactivex/disposables/Disposable;", "focusedAsset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "screenWidth", "", "getScreenWidth", "()I", "selectedAsset", "viewProvider", "Lcom/bamtechmedia/dominguez/collections/AssetStaticImageHandler$ViewProvider;", "attachViewProvider", "", "bindAssetImages", "asset", "bindHero", "bindTitleTreatment", "createAnimatorSet", "heroImageView", "Landroid/widget/ImageView;", "logoImageView", "getFadeInAnimator", "Landroid/animation/ValueAnimator;", "views", "", "Landroid/view/View;", "([Landroid/view/View;)Landroid/animation/ValueAnimator;", "getFadeOutAnimator", "hideViewsForVideoArtPlayback", "onAssetSelected", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "prefetch", "purpose", "Lcom/bamtechmedia/dominguez/core/content/ImagePurpose;", "ratio", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "parametersBlock", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/ripcut/RipcutImageLoader$Parameters;", "Lkotlin/ExtensionFunctionType;", "prefetchAssetImages", "scheduleTransitionToAsset", "animationEndAction", "showViewsAfterVideoArtPlayback", "transitionToAsset", "Companion", "ViewProvider", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AssetStaticImageHandler.kt */
public final class AssetStaticImageHandler extends C5733a implements C0710d {

    /* renamed from: U */
    private AnimatorSet f8260U;

    /* renamed from: V */
    private Disposable f8261V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C3626b f8262W;

    /* renamed from: X */
    private C3626b f8263X;

    /* renamed from: Y */
    private final Context f8264Y;

    /* renamed from: Z */
    private final C7159g f8265Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C3848a f8266a0;

    /* renamed from: c */
    private C3254b f8267c;

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$a */
    /* compiled from: AssetStaticImageHandler.kt */
    public static final class C3253a {
        private C3253a() {
        }

        public /* synthetic */ C3253a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$b */
    /* compiled from: AssetStaticImageHandler.kt */
    public interface C3254b {
        /* renamed from: h */
        ImageView mo12233h();

        /* renamed from: i */
        ImageView mo12234i();
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$c */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3255c extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ AssetStaticImageHandler f8268c;

        C3255c(AssetStaticImageHandler assetStaticImageHandler) {
            this.f8268c = assetStaticImageHandler;
            super(1);
        }

        /* renamed from: a */
        public final void mo12302a(C7162c cVar) {
            cVar.mo19996e(Integer.valueOf(this.f8268c.m11254A()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12302a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$d */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3256d implements Runnable {

        /* renamed from: U */
        final /* synthetic */ ImageView f8269U;

        /* renamed from: c */
        final /* synthetic */ AssetStaticImageHandler f8270c;

        C3256d(AssetStaticImageHandler assetStaticImageHandler, ImageView imageView) {
            this.f8270c = assetStaticImageHandler;
            this.f8269U = imageView;
        }

        public final void run() {
            C3848a a = this.f8270c.f8266a0;
            ImageView imageView = this.f8269U;
            a.mo13765a(imageView, imageView.getMeasuredHeight());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$e */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3257e extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        public static final C3257e f8271c = new C3257e();

        C3257e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12304a(C7162c cVar) {
            cVar.mo19998f(Integer.valueOf(272));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12304a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$f */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3258f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f8272a;

        /* renamed from: b */
        final /* synthetic */ ImageView f8273b;

        C3258f(ImageView imageView, ImageView imageView2) {
            this.f8272a = imageView;
            this.f8273b = imageView2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f8272a;
            C12880j.m40222a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            String str = "null cannot be cast to non-null type kotlin.Float";
            if (animatedValue != null) {
                imageView.setTranslationX(((Float) animatedValue).floatValue());
                ImageView imageView2 = this.f8273b;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    imageView2.setTranslationX(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new C13142s(str);
            }
            throw new C13142s(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$g */
    /* compiled from: AssetStaticImageHandler.kt */
    public static final class C3259g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AssetStaticImageHandler f8274a;

        C3259g(AssetStaticImageHandler assetStaticImageHandler, ImageView imageView, ImageView imageView2) {
            this.f8274a = assetStaticImageHandler;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C3626b b = this.f8274a.f8262W;
            if (b != null) {
                this.f8274a.m11266e(b);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$h */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3260h implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View[] f8275a;

        C3260h(View[] viewArr) {
            this.f8275a = viewArr;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View[] viewArr = this.f8275a;
            int length = viewArr.length;
            int i = 0;
            while (i < length) {
                View view = viewArr[i];
                C12880j.m40222a((Object) valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    view.setAlpha(((Float) animatedValue).floatValue());
                    i++;
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlin.Float");
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$i */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3261i implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View[] f8276a;

        C3261i(View[] viewArr) {
            this.f8276a = viewArr;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View[] viewArr = this.f8276a;
            int length = viewArr.length;
            int i = 0;
            while (i < length) {
                View view = viewArr[i];
                C12880j.m40222a((Object) valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    view.setAlpha(((Float) animatedValue).floatValue());
                    i++;
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlin.Float");
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$j */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3262j implements C11945a {

        /* renamed from: a */
        final /* synthetic */ String f8277a;

        C3262j(String str) {
            this.f8277a = str;
        }

        public final void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Prefetched ");
            sb.append(this.f8277a);
            C14100a.m44531d(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$k */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3263k<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3263k f8278c = new C3263k();

        C3263k() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44526b("Prefetch failed", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$l */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3264l extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ AssetStaticImageHandler f8279c;

        C3264l(AssetStaticImageHandler assetStaticImageHandler) {
            this.f8279c = assetStaticImageHandler;
            super(1);
        }

        /* renamed from: a */
        public final void mo12310a(C7162c cVar) {
            cVar.mo19996e(Integer.valueOf(this.f8279c.m11254A()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12310a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$m */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3265m extends C12881k implements Function1<C7162c, C13145v> {

        /* renamed from: c */
        public static final C3265m f8280c = new C3265m();

        C3265m() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12311a(C7162c cVar) {
            cVar.mo19998f(Integer.valueOf(272));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12311a((C7162c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$n */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3266n implements C11945a {

        /* renamed from: a */
        final /* synthetic */ AssetStaticImageHandler f8281a;

        /* renamed from: b */
        final /* synthetic */ C3626b f8282b;

        /* renamed from: c */
        final /* synthetic */ Function1 f8283c;

        C3266n(AssetStaticImageHandler assetStaticImageHandler, C3626b bVar, Function1 function1) {
            this.f8281a = assetStaticImageHandler;
            this.f8282b = bVar;
            this.f8283c = function1;
        }

        public final void run() {
            this.f8281a.m11264b(this.f8282b, this.f8283c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$o */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3267o<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3267o f8284c = new C3267o();

        C3267o() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44523a(th);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Landroid/animation/AnimatorSet;", "heroView", "Landroid/widget/ImageView;", "logoView", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$p */
    /* compiled from: AssetStaticImageHandler.kt */
    static final class C3268p extends C12881k implements Function2<ImageView, ImageView, AnimatorSet> {

        /* renamed from: U */
        final /* synthetic */ Function1 f8285U;

        /* renamed from: V */
        final /* synthetic */ C3626b f8286V;

        /* renamed from: c */
        final /* synthetic */ AssetStaticImageHandler f8287c;

        /* renamed from: com.bamtechmedia.dominguez.collections.AssetStaticImageHandler$p$a */
        /* compiled from: AssetStaticImageHandler.kt */
        public static final class C3269a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C3268p f8288a;

            C3269a(C3268p pVar) {
                this.f8288a = pVar;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C14100a.m44521a("AssetTransitionHandler").mo35673d("Animation to static image end", new Object[0]);
                C3268p pVar = this.f8288a;
                pVar.f8285U.invoke(pVar.f8286V);
            }
        }

        C3268p(AssetStaticImageHandler assetStaticImageHandler, Function1 function1, C3626b bVar) {
            this.f8287c = assetStaticImageHandler;
            this.f8285U = function1;
            this.f8286V = bVar;
            super(2);
        }

        /* renamed from: a */
        public final AnimatorSet invoke(ImageView imageView, ImageView imageView2) {
            AnimatorSet a = this.f8287c.m11255a(imageView, imageView2);
            a.addListener(new C3269a(this));
            a.start();
            return a;
        }
    }

    static {
        new C3253a(null);
    }

    public AssetStaticImageHandler(Context context, C7159g gVar, C3848a aVar) {
        this.f8264Y = context;
        this.f8265Z = gVar;
        this.f8266a0 = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final int m11254A() {
        Resources resources = this.f8264Y.getResources();
        C12880j.m40222a((Object) resources, "context.resources");
        return resources.getDisplayMetrics().widthPixels;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m11266e(C3626b bVar) {
        m11267f(bVar);
        m11268g(bVar);
    }

    /* renamed from: f */
    private final void m11267f(C3626b bVar) {
        C3254b bVar2 = this.f8267c;
        if (bVar2 != null) {
            ImageView i = bVar2.mo12234i();
            if (i != null) {
                Image a = bVar.mo12845a(C3688j.HERO_COLLECTION, C3623a.f9125b0.mo13248a());
                String U = a != null ? a.mo13085U() : null;
                if (U != null) {
                    this.f8265Z.mo19957a(i, U, new C3255c(this));
                } else {
                    i.post(new C3256d(this, i));
                }
            }
        }
    }

    /* renamed from: g */
    private final void m11268g(C3626b bVar) {
        C3254b bVar2 = this.f8267c;
        if (bVar2 != null) {
            ImageView h = bVar2.mo12233h();
            if (h != null) {
                Image a = bVar.mo12845a(C3688j.TITLE_TREATMENT, C3623a.f9125b0.mo13248a());
                String U = a != null ? a.mo13085U() : null;
                if (U != null) {
                    this.f8265Z.mo19957a(h, U, C3257e.f8271c);
                } else {
                    h.setImageDrawable(null);
                }
            }
        }
    }

    /* renamed from: h */
    private final void m11269h(C3626b bVar) {
        m11261a(bVar, C3688j.HERO_COLLECTION, C3623a.f9125b0.mo13248a(), new C3264l(this));
        m11261a(bVar, C3688j.TITLE_TREATMENT, C3623a.f9125b0.mo13248a(), C3265m.f8280c);
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
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
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: y */
    public final void mo12300y() {
        C14100a.m44521a("AssetTransitionHandler").mo35673d("Hide hero view before VideoArt playback", new Object[0]);
        C3254b bVar = this.f8267c;
        if (bVar != null) {
            ImageView i = bVar.mo12234i();
            if (i != null) {
                m11262b(i).start();
            }
        }
    }

    /* renamed from: z */
    public final void mo12301z() {
        C14100a.m44521a("AssetTransitionHandler").mo35673d("Show hero view after VideoArt playback", new Object[0]);
        C3254b bVar = this.f8267c;
        if (bVar != null) {
            ImageView i = bVar.mo12234i();
            if (i != null) {
                m11257a(i).start();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11264b(C3626b bVar, Function1<? super C3626b, C13145v> function1) {
        if (!C12880j.m40224a((Object) this.f8262W, (Object) bVar)) {
            C14100a.m44521a("AssetTransitionHandler").mo35673d("Animation to static image start", new Object[0]);
            this.f8262W = bVar;
            AnimatorSet animatorSet = this.f8260U;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            C3254b bVar2 = this.f8267c;
            ImageView imageView = null;
            Object i = bVar2 != null ? bVar2.mo12234i() : null;
            C3254b bVar3 = this.f8267c;
            if (bVar3 != null) {
                imageView = bVar3.mo12233h();
            }
            this.f8260U = (AnimatorSet) C5884x.m18949a(i, imageView, new C3268p(this, function1, bVar));
        }
    }

    /* renamed from: c */
    public final void mo12299c(C3626b bVar) {
        this.f8263X = bVar;
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        this.f8267c = null;
        AnimatorSet animatorSet = this.f8260U;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f8260U = null;
    }

    /* renamed from: a */
    public final void mo12298a(C3626b bVar, Function1<? super C3626b, C13145v> function1) {
        C14100a.m44521a("AssetTransitionHandler").mo35673d("Schedule animation to static image", new Object[0]);
        m11269h(bVar);
        if (C12880j.m40224a((Object) bVar, (Object) this.f8263X)) {
            m11266e(bVar);
            this.f8263X = null;
        }
        Disposable disposable = this.f8261V;
        if (disposable != null) {
            disposable.dispose();
        }
        Completable a = Completable.m38158b(500, TimeUnit.MILLISECONDS, C11934b.m38498a()).mo30040a(C11992a.m38600a());
        C12880j.m40222a((Object) a, "Completable.timer(DURATI…dSchedulers.mainThread())");
        Object a2 = a.mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        this.f8261V = ((C11839v) a2).mo29926a(new C3266n(this, bVar, function1), C3267o.f8284c);
    }

    /* renamed from: b */
    private final ValueAnimator m11262b(View... viewArr) {
        View view = (View) C13174k.m40406f(viewArr);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{view != null ? view.getAlpha() : 1.0f, 0.0f});
        C12880j.m40222a((Object) ofFloat, "it");
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C3261i(viewArr));
        C12880j.m40222a((Object) ofFloat, "ValueAnimator.ofFloat(st…}\n            }\n        }");
        return ofFloat;
    }

    /* renamed from: a */
    private final void m11261a(C3626b bVar, C3688j jVar, C3623a aVar, Function1<? super C7162c, C13145v> function1) {
        Image a = bVar.mo12845a(jVar, aVar);
        if (a != null) {
            String U = a.mo13085U();
            if (U != null) {
                Object a2 = this.f8265Z.mo19959c(U, function1).mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
                C12880j.m40222a(a2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                ((C11839v) a2).mo29926a(new C3262j(U), C3263k.f8278c);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final AnimatorSet m11255a(ImageView imageView, ImageView imageView2) {
        ValueAnimator a = m11257a(imageView, imageView2);
        Context context = imageView.getContext();
        C12880j.m40222a((Object) context, "heroImageView.context");
        Resources resources = context.getResources();
        C12880j.m40222a((Object) resources, "resources");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), 0.0f});
        C12880j.m40222a((Object) ofFloat, "it");
        ofFloat.setInterpolator(C3822a.f9509k.mo13748c());
        ofFloat.setDuration(1500);
        ofFloat.addUpdateListener(new C3258f(imageView, imageView2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{m11262b(imageView), m11262b(imageView2)});
        animatorSet.addListener(new C3259g(this, imageView, imageView2));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{a, ofFloat});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{animatorSet, animatorSet2});
        return animatorSet3;
    }

    /* renamed from: a */
    private final ValueAnimator m11257a(View... viewArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C12880j.m40222a((Object) ofFloat, "it");
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(1200);
        ofFloat.addUpdateListener(new C3260h(viewArr));
        C12880j.m40222a((Object) ofFloat, "ValueAnimator.ofFloat(AL…}\n            }\n        }");
        return ofFloat;
    }

    /* renamed from: a */
    public final void mo12297a(C3254b bVar) {
        this.f8267c = bVar;
    }
}
