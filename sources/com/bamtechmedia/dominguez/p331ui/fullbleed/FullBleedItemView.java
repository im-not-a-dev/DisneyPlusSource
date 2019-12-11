package com.bamtechmedia.dominguez.p331ui.fullbleed;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.collections.C3319e0;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.C8092b.C8093a;
import com.bamtechmedia.dominguez.p331ui.pagingbehaviour.pageindicator.PageIndicatorView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J&\u0010%\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\b\u0010-\u001a\u00020\u001dH\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0002R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00020\u00178\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/FullBleedAutoPagingBehaviour$Listener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "carouselPositionIndicator", "Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/pageindicator/PageIndicatorView;", "getCarouselPositionIndicator", "()Lcom/bamtechmedia/dominguez/ui/pagingbehaviour/pageindicator/PageIndicatorView;", "detailsButton", "Landroid/widget/Button;", "getDetailsButton", "()Landroid/widget/Button;", "fullBleedLogo", "Lcom/bamtechmedia/dominguez/core/design/widgets/AspectRatioImageView;", "getFullBleedLogo", "()Lcom/bamtechmedia/dominguez/core/design/widgets/AspectRatioImageView;", "helper", "Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemViewHelper;", "helper$annotations", "()V", "getHelper$core_release", "()Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemViewHelper;", "onFocusChanged", "", "gainFocus", "", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "selectNextItem", "selectPreviousItem", "setAssets", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "aspectRatio", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "backgroundViewProvider", "Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemView$BackgroundViewProvider;", "setViewTreeObserver", "togglePageIndicatorView", "targetView", "Landroid/view/View;", "BackgroundViewProvider", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.FullBleedItemView */
/* compiled from: FullBleedItemView.kt */
public final class FullBleedItemView extends ConstraintLayout implements C8093a {

    /* renamed from: r0 */
    private final C8079a f17292r0;

    /* renamed from: s0 */
    private HashMap f17293s0;

    /* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.FullBleedItemView$a */
    /* compiled from: FullBleedItemView.kt */
    public interface C8077a {
        /* renamed from: g */
        AspectRatioImageView mo18366g();
    }

    /* renamed from: com.bamtechmedia.dominguez.ui.fullbleed.FullBleedItemView$b */
    /* compiled from: FullBleedItemView.kt */
    static final class C8078b implements OnGlobalLayoutListener {

        /* renamed from: c */
        final /* synthetic */ FullBleedItemView f17294c;

        C8078b(FullBleedItemView fullBleedItemView) {
            this.f17294c = fullBleedItemView;
        }

        public final void onGlobalLayout() {
            View detailsButton = this.f17294c.getDetailsButton();
            if (!(detailsButton instanceof View)) {
                detailsButton = null;
            }
            if (detailsButton == null) {
                detailsButton = this.f17294c.getFullBleedLogo();
            }
            this.f17294c.m23428b(detailsButton);
            this.f17294c.requestLayout();
        }
    }

    public FullBleedItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FullBleedItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FullBleedItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
    public final void m23428b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Resources resources = getResources();
        C12880j.m40222a((Object) resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        boolean intersects = rect.intersects(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        if (!isShown() || !intersects) {
            PageIndicatorView carouselPositionIndicator = getCarouselPositionIndicator();
            if (carouselPositionIndicator != null) {
                carouselPositionIndicator.setVisibility(4);
            }
        } else if (intersects) {
            PageIndicatorView carouselPositionIndicator2 = getCarouselPositionIndicator();
            if (carouselPositionIndicator2 != null) {
                carouselPositionIndicator2.setVisibility(0);
            }
        } else {
            PageIndicatorView carouselPositionIndicator3 = getCarouselPositionIndicator();
            if (carouselPositionIndicator3 != null) {
                carouselPositionIndicator3.setVisibility(4);
            }
        }
    }

    /* renamed from: c */
    private final void m23429c() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C8078b(this));
    }

    /* renamed from: c */
    public View mo2145c(int i) {
        if (this.f17293s0 == null) {
            this.f17293s0 = new HashMap();
        }
        View view = (View) this.f17293s0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f17293s0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final PageIndicatorView getCarouselPositionIndicator() {
        return (PageIndicatorView) mo2145c(C5363f.full_bleed_indicator_view);
    }

    public final Button getDetailsButton() {
        Button button = (Button) mo2145c(C5363f.btn_see_details);
        C12880j.m40222a((Object) button, "btn_see_details");
        return button;
    }

    public final AspectRatioImageView getFullBleedLogo() {
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) mo2145c(C5363f.logo);
        C12880j.m40222a((Object) aspectRatioImageView, "logo");
        return aspectRatioImageView;
    }

    public final C8079a getHelper$core_release() {
        return this.f17292r0;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2 = i == 33 || i == 130;
        if (z && z2) {
            setTag(C5363f.focusHelperFocusChangeInfoVertical, new C3319e0(rect, i));
        }
        super.onFocusChanged(z, i, rect);
        this.f17292r0.mo21076a(z);
    }

    public FullBleedItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17292r0 = new C8079a(this);
        View.inflate(context, C5364g.full_bleed_item_view, this);
        m23429c();
    }

    /* renamed from: a */
    public final void mo21066a(C3700c<? extends C3626b> cVar, C3623a aVar, C8077a aVar2) {
        this.f17292r0.mo21075a(cVar, aVar, aVar2);
    }

    /* renamed from: a */
    public void mo21065a() {
        this.f17292r0.mo21065a();
    }

    /* renamed from: b */
    public void mo21067b() {
        this.f17292r0.mo21067b();
    }
}
