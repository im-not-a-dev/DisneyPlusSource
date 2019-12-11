package com.bamtechmedia.dominguez.collections.p081ui;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.bamtechmedia.dominguez.collections.items.ShelfItemLayout;
import com.bamtechmedia.dominguez.collections.p078m0.C3424c;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0004H\u0002¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemForegroundDrawableHelper;", "", "()V", "getForegroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "view", "Landroid/view/View;", "resetDrawable", "", "focusableRootView", "viewToTransform", "transformDrawable", "fraction", "", "getBorderLayer", "Landroid/graphics/drawable/Drawable;", "getOverlayLayer", "Companion", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.ui.a */
/* compiled from: ShelfListItemForegroundDrawableHelper.kt */
public final class C3490a {

    /* renamed from: com.bamtechmedia.dominguez.collections.ui.a$a */
    /* compiled from: ShelfListItemForegroundDrawableHelper.kt */
    public static final class C3491a {
        private C3491a() {
        }

        public /* synthetic */ C3491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3491a(null);
    }

    /* renamed from: b */
    private final Drawable m11860b(LayerDrawable layerDrawable) {
        return layerDrawable.findDrawableByLayerId(C3424c.drawable_overlay_layer);
    }

    /* renamed from: a */
    public final void mo12696a(View view, View view2) {
        mo12697a(view, view2, 1.0f);
    }

    /* renamed from: a */
    public final void mo12697a(View view, View view2, float f) {
        LayerDrawable a = m11859a(view2);
        if (a != null) {
            int i = (int) (f * ((float) 255));
            int i2 = 255 - i;
            Drawable a2 = m11858a(a);
            if (a2 != null) {
                a2.setAlpha(view.hasFocus() ? i : i2);
            }
            Drawable b = m11860b(a);
            if (b != null) {
                if (view.hasFocus()) {
                    i = i2;
                }
                b.setAlpha(i);
            }
        }
    }

    /* renamed from: a */
    private final LayerDrawable m11859a(View view) {
        if (view instanceof ShelfItemLayout) {
            Drawable foregroundDrawable = ((ShelfItemLayout) view).getForegroundDrawable();
            if (!(foregroundDrawable instanceof LayerDrawable)) {
                foregroundDrawable = null;
            }
            return (LayerDrawable) foregroundDrawable;
        } else if (!(view instanceof AspectRatioImageView)) {
            return null;
        } else {
            Drawable foregroundDrawable2 = ((AspectRatioImageView) view).getForegroundDrawable();
            if (!(foregroundDrawable2 instanceof LayerDrawable)) {
                foregroundDrawable2 = null;
            }
            return (LayerDrawable) foregroundDrawable2;
        }
    }

    /* renamed from: a */
    private final Drawable m11858a(LayerDrawable layerDrawable) {
        return layerDrawable.findDrawableByLayerId(C3424c.drawable_border_layer);
    }
}
