package com.bamtechmedia.dominguez.collections.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bamtechmedia.dominguez.collections.p078m0.C3427f;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j.C3445a;
import com.bamtechmedia.dominguez.core.content.sets.C3788m;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001!B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfItemLayoutWrapper;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "config", "getConfig", "()Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "setConfig", "(Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;)V", "itemView", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItemLayout;", "getItemView", "()Lcom/bamtechmedia/dominguez/collections/items/ShelfItemLayout;", "itemViewId", "Ljava/lang/Integer;", "itemWidthCalculator", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItemLayoutWrapper$ItemWidthCalculator;", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleViewId", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "ItemWidthCalculator", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ShelfItemLayoutWrapper.kt */
public final class ShelfItemLayoutWrapper extends LinearLayout {

    /* renamed from: U */
    private C3444j f8402U;

    /* renamed from: V */
    private Integer f8403V;

    /* renamed from: W */
    private Integer f8404W;

    /* renamed from: c */
    private final C3339a f8405c;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.ShelfItemLayoutWrapper$a */
    /* compiled from: ShelfItemLayoutWrapper.kt */
    public static final class C3339a {

        /* renamed from: a */
        private final Context f8406a;

        public C3339a(Context context) {
            this.f8406a = context;
        }

        /* renamed from: b */
        private final int m11488b(int i, C3444j jVar) {
            return i - (jVar.mo12630i() * m11487a(jVar));
        }

        /* renamed from: a */
        public final int mo12414a(int i, C3444j jVar) {
            return jVar == null ? i : m11488b(i, jVar) / jVar.mo12637p();
        }

        /* renamed from: a */
        private final int m11487a(C3444j jVar) {
            boolean b = m11489b(jVar);
            int p = jVar.mo12637p();
            return b ? p - 1 : p;
        }

        /* renamed from: b */
        private final boolean m11489b(C3444j jVar) {
            if (!C5837i.m18842d(this.f8406a) && !C5837i.m18843e(this.f8406a) && !jVar.mo12620a(C3788m.MATCH_WIDTH_VADER_GRID) && jVar.mo12627g() != C3445a.HERO_SNAP && !jVar.mo12626f()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.ShelfItemLayoutWrapper$b */
    /* compiled from: ShelfItemLayoutWrapper.kt */
    static final class C3340b extends C12881k implements C12853n<C3444j, ShelfItemLayout, TextView, C13145v> {

        /* renamed from: c */
        public static final C3340b f8407c = new C3340b();

        C3340b() {
            super(3);
        }

        /* renamed from: a */
        public final void mo12415a(C3444j jVar, ShelfItemLayout shelfItemLayout, TextView textView) {
            int i = jVar.mo12630i() / 2;
            LayoutParams layoutParams = shelfItemLayout.getLayoutParams();
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(i, 0, i, i);
            } else {
                marginLayoutParams = null;
            }
            shelfItemLayout.setLayoutParams(marginLayoutParams);
            LayoutParams layoutParams2 = textView.getLayoutParams();
            if (!(layoutParams2 instanceof MarginLayoutParams)) {
                layoutParams2 = null;
            }
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMarginStart(i);
                marginLayoutParams2.setMarginEnd(i);
            } else {
                marginLayoutParams2 = null;
            }
            textView.setLayoutParams(marginLayoutParams2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo12415a((C3444j) obj, (ShelfItemLayout) obj2, (TextView) obj3);
            return C13145v.f29587a;
        }
    }

    public ShelfItemLayoutWrapper(Context context) {
        this(context, null, 0, 6, null);
    }

    public ShelfItemLayoutWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ShelfItemLayoutWrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final ShelfItemLayout getItemView() {
        Integer num = this.f8403V;
        if (num == null) {
            return null;
        }
        View findViewById = findViewById(num.intValue());
        if (!(findViewById instanceof ShelfItemLayout)) {
            findViewById = null;
        }
        return (ShelfItemLayout) findViewById;
    }

    private final TextView getTitleView() {
        Integer num = this.f8404W;
        if (num == null) {
            return null;
        }
        View findViewById = findViewById(num.intValue());
        if (!(findViewById instanceof TextView)) {
            findViewById = null;
        }
        return (TextView) findViewById;
    }

    public final C3444j getConfig() {
        return this.f8402U;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = MeasureSpec.getSize(i);
        Context context = getContext();
        C12880j.m40222a((Object) context, "context");
        if (C5837i.m18843e(context)) {
            C3444j jVar = this.f8402U;
            i3 = size / (jVar != null ? jVar.mo12637p() : 1);
        } else {
            i3 = this.f8405c.mo12414a(size, this.f8402U);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public final void setConfig(C3444j jVar) {
        C5884x.m18948a(jVar, getItemView(), getTitleView(), (C12853n<? super T1, ? super T2, ? super T3, ? extends R>) C3340b.f8407c);
        this.f8402U = jVar;
        requestLayout();
    }

    public ShelfItemLayoutWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8405c = new C3339a(context);
        int[] iArr = C3427f.ShelfItemLayoutWrapper;
        C12880j.m40222a((Object) iArr, "R.styleable.ShelfItemLayoutWrapper");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f8403V = Integer.valueOf(obtainStyledAttributes.getResourceId(C3427f.ShelfItemLayoutWrapper_shelfItemLayoutViewId, -1));
        this.f8404W = Integer.valueOf(obtainStyledAttributes.getResourceId(C3427f.ShelfItemLayoutWrapper_shelfTitleViewId, -1));
        obtainStyledAttributes.recycle();
    }
}
