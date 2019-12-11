package com.bamtechmedia.dominguez.p331ui.fullbleed;

import android.animation.AnimatorSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3689k;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3849b;
import com.bamtechmedia.dominguez.core.p216l.C5763b;
import com.bamtechmedia.dominguez.p331ui.fullbleed.FullBleedItemView.C8077a;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.C8092b.C8093a;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.pageindicator.C8097a;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.pageindicator.PageIndicatorView;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.functions.C12855p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p202a.C5362e;
import p163g.p201e.p202a.C5363f;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b,J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020!H\u0016J\b\u00101\u001a\u00020!H\u0016J\u000e\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020/J$\u00104\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020*H\u0016J\b\u0010;\u001a\u00020*H\u0016J&\u0010<\u001a\u00020*2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010>J \u0010?\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020/H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemViewHelper;", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/pageindicator/PagingIndicatorCallback;", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/FullBleedAutoPagingBehaviour$Listener;", "Landroid/view/View$OnKeyListener;", "view", "Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemView;", "(Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemView;)V", "animations", "Landroid/animation/AnimatorSet;", "aspectRatio", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "aspectRatio$annotations", "()V", "getAspectRatio$core_release", "()Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "setAspectRatio$core_release", "(Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;)V", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "assets$annotations", "getAssets$core_release", "()Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "setAssets$core_release", "(Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;)V", "fullBleedBackground", "Lcom/bamtechmedia/dominguez/core/design/widgets/AspectRatioImageView;", "fullBleedBackground$annotations", "getFullBleedBackground$core_release", "()Lcom/bamtechmedia/dominguez/core/design/widgets/AspectRatioImageView;", "setFullBleedBackground$core_release", "(Lcom/bamtechmedia/dominguez/core/design/widgets/AspectRatioImageView;)V", "position", "", "position$annotations", "getPosition$core_release", "()I", "setPosition$core_release", "(I)V", "positionCalculator", "Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemViewHelper$InfinitePositionCalculator;", "bindAssetImages", "", "asset", "bindAssetImages$core_release", "entranceAnimation", "toRight", "", "getCurrentPagePosition", "getPageCount", "onFocusChanged", "gainFocus", "onKey", "v", "Landroid/view/View;", "keyCode", "event", "Landroid/view/KeyEvent;", "selectNextItem", "selectPreviousItem", "setAssets", "backgroundViewProvider", "Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemView$BackgroundViewProvider;", "startTransition", "InfinitePositionCalculator", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.a */
/* compiled from: FullBleedItemViewHelper.kt */
public final class C8079a implements C8097a, C8093a, OnKeyListener {

    /* renamed from: U */
    private C3700c<? extends C3626b> f17295U;

    /* renamed from: V */
    private C3623a f17296V;

    /* renamed from: W */
    private int f17297W;

    /* renamed from: X */
    private AspectRatioImageView f17298X;

    /* renamed from: Y */
    private AnimatorSet f17299Y;

    /* renamed from: Z */
    private final FullBleedItemView f17300Z;

    /* renamed from: c */
    private final C8080a f17301c = new C8080a();

    /* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.a$a */
    /* compiled from: FullBleedItemViewHelper.kt */
    public static final class C8080a {
        /* renamed from: a */
        public final int mo21078a(int i, int i2) {
            return (i + 1) % i2;
        }

        /* renamed from: b */
        public final int mo21079b(int i, int i2) {
            return i <= 0 ? i2 - 1 : (i - 1) % i2;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.a$b */
    /* compiled from: FullBleedItemViewHelper.kt */
    static final class C8081b extends C12881k implements C12855p<View, Boolean, Float, Long, Long, Long, C13145v> {

        /* renamed from: c */
        public static final C8081b f17302c = new C8081b();

        C8081b() {
            super(6);
        }

        /* renamed from: a */
        public static /* synthetic */ void m23447a(C8081b bVar, View view, boolean z, float f, long j, long j2, long j3, int i, Object obj) {
            bVar.mo21080a(view, z, f, j, j2, (i & 16) != 0 ? 0 : j3);
        }

        /* renamed from: a */
        public final void mo21080a(View view, boolean z, float f, long j, long j2, long j3) {
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            if (!z) {
                f = -f;
            }
            view.setTranslationX(f);
            view.setAlpha(0.0f);
            ViewPropertyAnimator interpolator = view.animate().setDuration(j2).setStartDelay(j3).translationX(0.0f).setInterpolator(accelerateDecelerateInterpolator);
            ViewPropertyAnimator interpolator2 = view.animate().setDuration(j).setStartDelay(j3).alpha(1.0f).setInterpolator(accelerateDecelerateInterpolator);
            interpolator.start();
            interpolator2.start();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"oldExitAnimation", "", "Landroid/view/View;", "toRight", "", "withEndAnimation", "Lkotlin/Function0;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.a$c */
    /* compiled from: FullBleedItemViewHelper.kt */
    static final class C8082c extends C12881k implements C12853n<View, Boolean, Function0<? extends C13145v>, C13145v> {

        /* renamed from: c */
        public static final C8082c f17303c = new C8082c();

        /* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.a$c$a */
        /* compiled from: FullBleedItemViewHelper.kt */
        static final class C8083a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            public static final C8083a f17304c = new C8083a();

            C8083a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        C8082c() {
            super(3);
        }

        /* renamed from: a */
        public static /* synthetic */ void m23449a(C8082c cVar, View view, boolean z, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = C8083a.f17304c;
            }
            cVar.mo21081a(view, z, function0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo21081a((View) obj, ((Boolean) obj2).booleanValue(), (Function0) obj3);
            return C13145v.f29587a;
        }

        /* renamed from: a */
        public final void mo21081a(View view, boolean z, Function0<C13145v> function0) {
            float f = z ? -20.0f : 20.0f;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = r0;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator2 = new AccelerateDecelerateInterpolator();
            C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 150, 0, accelerateDecelerateInterpolator, null, function0, null, 175613, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.a$d */
    /* compiled from: FullBleedItemViewHelper.kt */
    static final class C8084d extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ C3626b f17305U;

        /* renamed from: V */
        final /* synthetic */ C3623a f17306V;

        /* renamed from: W */
        final /* synthetic */ boolean f17307W;

        /* renamed from: c */
        final /* synthetic */ C8079a f17308c;

        C8084d(C8079a aVar, C3626b bVar, C3623a aVar2, boolean z) {
            this.f17308c = aVar;
            this.f17305U = bVar;
            this.f17306V = aVar2;
            this.f17307W = z;
            super(0);
        }

        public final void invoke() {
            this.f17308c.mo21074a(this.f17305U, this.f17306V);
            this.f17308c.m23437b(this.f17307W);
        }
    }

    public C8079a(FullBleedItemView fullBleedItemView) {
        this.f17300Z = fullBleedItemView;
        this.f17300Z.setOnKeyListener(this);
        FullBleedItemView fullBleedItemView2 = this.f17300Z;
        int i = C5363f.focusHelperFullBleedItem;
        Boolean valueOf = Boolean.valueOf(true);
        fullBleedItemView2.setTag(i, valueOf);
        this.f17300Z.setTag(C5363f.focusHelperHideNavOnViewFocus, valueOf);
        this.f17300Z.setFocusable(true);
    }

    /* renamed from: b */
    public void mo21067b() {
        C3700c<? extends C3626b> cVar = this.f17295U;
        if (cVar != null) {
            this.f17297W = this.f17301c.mo21079b(this.f17297W, cVar.size());
            C3626b bVar = (C3626b) cVar.get(this.f17297W);
            C3623a aVar = this.f17296V;
            if (aVar != null) {
                m23435a(bVar, aVar, false);
                PageIndicatorView carouselPositionIndicator = this.f17300Z.getCarouselPositionIndicator();
                if (carouselPositionIndicator != null) {
                    carouselPositionIndicator.mo21104e(this.f17297W);
                    return;
                }
                return;
            }
            C12880j.m40220a();
            throw null;
        }
    }

    /* renamed from: c */
    public int mo12504c() {
        return this.f17297W;
    }

    /* renamed from: d */
    public int mo12505d() {
        C3700c<? extends C3626b> cVar = this.f17295U;
        if (cVar != null) {
            return cVar.size();
        }
        return 0;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 20) {
            AnimatorSet animatorSet = this.f17299Y;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.end();
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo21065a() {
        C3700c<? extends C3626b> cVar = this.f17295U;
        if (cVar != null) {
            this.f17297W = this.f17301c.mo21078a(this.f17297W, cVar.size());
            C3626b bVar = (C3626b) cVar.get(this.f17297W);
            C3623a aVar = this.f17296V;
            if (aVar != null) {
                m23435a(bVar, aVar, true);
                PageIndicatorView carouselPositionIndicator = this.f17300Z.getCarouselPositionIndicator();
                if (carouselPositionIndicator != null) {
                    carouselPositionIndicator.mo21104e(this.f17297W);
                    return;
                }
                return;
            }
            C12880j.m40220a();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23437b(boolean z) {
        C8081b bVar = C8081b.f17302c;
        C3800a.m12829a(this.f17300Z.getDetailsButton(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 300, 0, null, null, null, null, 255998, null);
        bVar.mo21080a(this.f17300Z.getFullBleedLogo(), z, 20.0f, 600, 910, 190);
        AspectRatioImageView aspectRatioImageView = this.f17298X;
        if (aspectRatioImageView != null) {
            C8081b.m23447a(bVar, aspectRatioImageView, z, 30.0f, 960, 1500, 0, 16, null);
        }
    }

    /* renamed from: a */
    public final void mo21075a(C3700c<? extends C3626b> cVar, C3623a aVar, C8077a aVar2) {
        this.f17295U = cVar;
        this.f17296V = aVar;
        this.f17298X = aVar2 != null ? aVar2.mo18366g() : null;
        this.f17300Z.getFullBleedLogo().setRatio(aVar);
        AspectRatioImageView aspectRatioImageView = this.f17298X;
        if (aspectRatioImageView != null) {
            aspectRatioImageView.setRatio(aVar);
        }
        PageIndicatorView carouselPositionIndicator = this.f17300Z.getCarouselPositionIndicator();
        if (carouselPositionIndicator != null) {
            carouselPositionIndicator.setPageIndicatorCallback(this);
        }
        mo21074a((C3626b) cVar.get(this.f17297W), aVar);
        m23437b(true);
    }

    /* renamed from: a */
    public final void mo21074a(C3626b bVar, C3623a aVar) {
        AspectRatioImageView aspectRatioImageView = this.f17298X;
        if (aspectRatioImageView != null) {
            C5763b.m18702a(aspectRatioImageView, bVar.mo12845a(C3688j.HERO_TILE, aVar), C3849b.f9526a.mo13767a(aVar.mo13242X(), C5362e.transparent_placeholder), Integer.valueOf(C5362e.transparent_placeholder), null, false, false, false, 120, null);
        }
        C3688j a = C3689k.m12544a(bVar);
        AspectRatioImageView fullBleedLogo = this.f17300Z.getFullBleedLogo();
        Image a2 = a != null ? bVar.mo12845a(a, aVar) : null;
        int i = C5362e.transparent_placeholder;
        C5763b.m18702a(fullBleedLogo, a2, i, Integer.valueOf(i), null, false, false, false, 120, null);
    }

    /* renamed from: a */
    public final void mo21076a(boolean z) {
        C3800a.m12829a(this.f17300Z.getDetailsButton(), 0.0f, 0.0f, z ? 0.92f : 1.0f, z ? 1.0f : 0.92f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, z ? 0.0f : 4.0f, z ? 4.0f : 0.0f, 0, 0, null, null, null, null, 259059, null);
    }

    /* renamed from: a */
    private final void m23435a(C3626b bVar, C3623a aVar, boolean z) {
        boolean z2 = z;
        C8082c cVar = C8082c.f17303c;
        C3800a.m12829a(this.f17300Z.getDetailsButton(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 150, 0, null, null, null, null, 258045, null);
        AspectRatioImageView aspectRatioImageView = this.f17298X;
        if (aspectRatioImageView != null) {
            C8082c.m23449a(cVar, aspectRatioImageView, z, null, 2, null);
        }
        cVar.mo21081a(this.f17300Z.getFullBleedLogo(), z2, new C8084d(this, bVar, aVar, z2));
    }
}
