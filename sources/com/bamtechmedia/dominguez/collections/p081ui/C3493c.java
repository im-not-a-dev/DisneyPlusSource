package com.bamtechmedia.dominguez.collections.p081ui;

import android.view.View;
import com.bamtechmedia.dominguez.collections.p078m0.C3423b;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j.C3445a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J>\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0002JB\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;", "", "foregroundDrawableHelper", "Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemForegroundDrawableHelper;", "(Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemForegroundDrawableHelper;)V", "resetScalingItemDecorationValues", "", "focusableRootView", "Landroid/view/View;", "viewToTransform", "alphaFocusEffectEnabled", "", "setFocusChangeListener", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "actionOnFocusChange", "Lkotlin/Function1;", "setup", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.ui.c */
/* compiled from: ShelfListItemScaleHelper.kt */
public final class C3493c {

    /* renamed from: a */
    private final C3490a f8769a;

    /* renamed from: com.bamtechmedia.dominguez.collections.ui.c$a */
    /* compiled from: ShelfListItemScaleHelper.kt */
    public static final class C3494a extends C3496e {

        /* renamed from: a0 */
        final /* synthetic */ Function1 f8770a0;

        C3494a(C3493c cVar, Function1 function1, View view, View view2, int i, boolean z, boolean z2, C3444j jVar, C3490a aVar, View view3, View view4, int i2, boolean z3, boolean z4, float f) {
            this.f8770a0 = function1;
            super(aVar, view3, view4, i2, z3, z4, f);
        }

        public void onFocusChange(View view, boolean z) {
            super.onFocusChange(view, z);
            Function1 function1 = this.f8770a0;
            if (function1 != null) {
                C13145v vVar = (C13145v) function1.invoke(Boolean.valueOf(z));
            }
        }
    }

    public C3493c(C3490a aVar) {
        this.f8769a = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m11865a(C3493c cVar, View view, View view2, C3444j jVar, boolean z, Function1 function1, int i, Object obj) {
        View view3 = (i & 2) != 0 ? view : view2;
        boolean z2 = (i & 8) != 0 ? false : z;
        if ((i & 16) != 0) {
            function1 = null;
        }
        cVar.mo12698a(view, view3, jVar, z2, function1);
    }

    /* renamed from: b */
    private final void m11866b(View view, View view2, C3444j jVar, boolean z, Function1<? super Boolean, C13145v> function1) {
        View view3 = view;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(C3423b.default_container_focus_padding);
        if (dimensionPixelSize > 0) {
            boolean z2 = jVar.mo12627g() != C3445a.HERO_SNAP && (Intrinsics.areEqual((Object) jVar.mo12623d(), (Object) "brand") ^ true);
            C3494a aVar = r0;
            C3494a aVar2 = new C3494a(this, function1, view, view2, dimensionPixelSize, z, z2, jVar, this.f8769a, view, view2, dimensionPixelSize, z, z2, jVar.mo12633l());
            view.setOnFocusChangeListener(aVar);
            return;
        }
        view3.setOnFocusChangeListener(null);
    }

    /* renamed from: a */
    public final void mo12698a(View view, View view2, C3444j jVar, boolean z, Function1<? super Boolean, C13145v> function1) {
        m11864a(view, view2, z);
        m11866b(view, view2, jVar, z, function1);
    }

    /* renamed from: a */
    private final void m11864a(View view, View view2, boolean z) {
        this.f8769a.mo12696a(view, view2);
        if (!view.hasFocus()) {
            float f = 1.0f;
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            if (z) {
                f = 0.7f;
            }
            view2.setAlpha(f);
            view2.setTranslationX(0.0f);
        }
    }
}
