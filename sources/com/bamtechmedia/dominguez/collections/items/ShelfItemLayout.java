package com.bamtechmedia.dominguez.collections.items;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import androidx.cardview.widget.CardView;
import com.bamtechmedia.dominguez.collections.C3319e0;
import com.bamtechmedia.dominguez.collections.p078m0.C3422a;
import com.bamtechmedia.dominguez.collections.p078m0.C3423b;
import com.bamtechmedia.dominguez.collections.p078m0.C3424c;
import com.bamtechmedia.dominguez.collections.p078m0.C3427f;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j.C3445a;
import com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView;
import com.bamtechmedia.dominguez.core.content.sets.C3788m;
import com.bamtechmedia.dominguez.core.p088i.p090o.C3846a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p112d.C3925e;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u00011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\b\u0010 \u001a\u00020\u001aH\u0016J\"\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0018\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J(\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0014J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\u001fH\u0014R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfItemLayout;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "config", "getConfig", "()Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "setConfig", "(Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;)V", "<set-?>", "Lcom/bamtechmedia/dominguez/collections/FocusChangeInfo;", "focusChangeInfo", "getFocusChangeInfo", "()Lcom/bamtechmedia/dominguez/collections/FocusChangeInfo;", "foregroundDrawableCompat", "Lcom/bamtechmedia/dominguez/core/design/compat/ForegroundDrawableCompat;", "itemWidthCalculator", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItemLayout$ItemWidthCalculator;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawableStateChanged", "getForegroundDrawable", "Landroid/graphics/drawable/Drawable;", "jumpDrawablesToCurrentState", "onFocusChanged", "gainFocus", "", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "verifyDrawable", "who", "ItemWidthCalculator", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ShelfItemLayout.kt */
public final class ShelfItemLayout extends CardView {

    /* renamed from: f0 */
    private final C3338a f8397f0;

    /* renamed from: g0 */
    private final C3846a f8398g0;

    /* renamed from: h0 */
    private C3319e0 f8399h0;

    /* renamed from: i0 */
    private C3444j f8400i0;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.ShelfItemLayout$a */
    /* compiled from: ShelfItemLayout.kt */
    public static final class C3338a {

        /* renamed from: a */
        private final Context f8401a;

        public C3338a(Context context) {
            this.f8401a = context;
        }

        /* renamed from: b */
        private final int m11484b(int i, C3444j jVar) {
            return i - (jVar.mo12630i() * m11483a(jVar));
        }

        /* renamed from: a */
        public final int mo12410a(int i, C3444j jVar) {
            return jVar == null ? i : m11484b(i, jVar) / jVar.mo12637p();
        }

        /* renamed from: a */
        private final int m11483a(C3444j jVar) {
            boolean b = m11485b(jVar);
            int p = jVar.mo12637p();
            return b ? p - 1 : p;
        }

        /* renamed from: b */
        private final boolean m11485b(C3444j jVar) {
            if (!C5837i.m18842d(this.f8401a) && !C5837i.m18843e(this.f8401a) && !jVar.mo12620a(C3788m.MATCH_WIDTH_VADER_GRID) && jVar.mo12627g() != C3445a.HERO_SNAP && !jVar.mo12626f()) {
                return false;
            }
            return true;
        }
    }

    public ShelfItemLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public ShelfItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ShelfItemLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f8398g0.mo13758a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8398g0.mo13756a();
    }

    public final C3444j getConfig() {
        return this.f8400i0;
    }

    public final C3319e0 getFocusChangeInfo() {
        return this.f8399h0;
    }

    public final Drawable getForegroundDrawable() {
        return this.f8398g0.mo13760b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f8398g0.mo13762c();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            this.f8399h0 = new C3319e0(rect, i);
            if (i == 33 || i == 130) {
                ViewParent parent = getParent();
                if (!(parent instanceof ShelfItemRecyclerView)) {
                    parent = null;
                }
                ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) parent;
                if (shelfItemRecyclerView != null) {
                    shelfItemRecyclerView.setTag(C3424c.focusHelperFocusChangeInfoVertical, this.f8399h0);
                }
            }
        }
        super.onFocusChanged(z, i, rect);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int a = this.f8397f0.mo12410a(MeasureSpec.getSize(i), this.f8400i0);
        super.onMeasure(MeasureSpec.makeMeasureSpec(a, 1073741824), i2);
        this.f8398g0.mo13757a(a, getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8398g0.mo13757a(i, i2);
    }

    public final void setConfig(C3444j jVar) {
        if (jVar != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                int i = jVar.mo12630i() / 2;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i);
            } else {
                marginLayoutParams = null;
            }
            setLayoutParams(marginLayoutParams);
        }
        this.f8400i0 = jVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f8398g0.mo13761b(drawable);
    }

    public ShelfItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8397f0 = new C3338a(context);
        this.f8398g0 = new C3846a(this);
        setCardBackgroundColor((ColorStateList) null);
        int[] iArr = C3427f.ShelfItemLayout;
        C12880j.m40222a((Object) iArr, "R.styleable.ShelfItemLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f8398g0.mo13759a(obtainStyledAttributes.getDrawable(C3427f.ShelfItemLayout_foreground));
        obtainStyledAttributes.recycle();
        int[] iArr2 = C3925e.CardView;
        C12880j.m40222a((Object) iArr2, "androidx.cardview.R.styleable.CardView");
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
        setCardElevation(obtainStyledAttributes2.getDimension(C3427f.CardView_cardElevation, C5837i.m18843e(context) ? context.getResources().getDimension(C3423b.grid_padding_shadow) : 0.0f));
        setRadius(obtainStyledAttributes2.getDimension(C3427f.CardView_cardCornerRadius, C5837i.m18837b(context, C3422a.assetCornerRadius)));
        obtainStyledAttributes2.recycle();
    }
}
