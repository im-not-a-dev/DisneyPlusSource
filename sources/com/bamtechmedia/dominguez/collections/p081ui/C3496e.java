package com.bamtechmedia.dominguez.collections.p081ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.p084g.p086d.C3822a;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemTransformOnFocusListener;", "Landroid/view/View$OnFocusChangeListener;", "foregroundDrawableHelper", "Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemForegroundDrawableHelper;", "focusableRootView", "Landroid/view/View;", "viewToTransform", "scaleSize", "", "alphaFocusEffectEnabled", "", "scaleFocusEffectEnabled", "scaleOnFocus", "", "(Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemForegroundDrawableHelper;Landroid/view/View;Landroid/view/View;IZZF)V", "onFocusChange", "", "v", "hasFocus", "Companion", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.ui.e */
/* compiled from: ShelfListItemTransformOnFocusListener.kt */
public class C3496e implements OnFocusChangeListener {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final View f8772U;

    /* renamed from: V */
    private final View f8773V;

    /* renamed from: W */
    private final int f8774W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final boolean f8775X;

    /* renamed from: Y */
    private final boolean f8776Y;

    /* renamed from: Z */
    private final float f8777Z;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3490a f8778c;

    /* renamed from: com.bamtechmedia.dominguez.collections.ui.e$a */
    /* compiled from: ShelfListItemTransformOnFocusListener.kt */
    public static final class C3497a {
        private C3497a() {
        }

        public /* synthetic */ C3497a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo31007d2 = {"<anonymous>", "", "run", "com/bamtechmedia/dominguez/collections/ui/ShelfListItemTransformOnFocusListener$onFocusChange$1$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.collections.ui.e$b */
    /* compiled from: ShelfListItemTransformOnFocusListener.kt */
    static final class C3498b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ float f8779U;

        /* renamed from: V */
        final /* synthetic */ float f8780V;

        /* renamed from: W */
        final /* synthetic */ C3496e f8781W;

        /* renamed from: X */
        final /* synthetic */ boolean f8782X;

        /* renamed from: c */
        final /* synthetic */ View f8783c;

        /* renamed from: com.bamtechmedia.dominguez.collections.ui.e$b$a */
        /* compiled from: ShelfListItemTransformOnFocusListener.kt */
        static final class C3499a extends C12881k implements Function1<ValueAnimator, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C3498b f8784c;

            C3499a(C3498b bVar) {
                this.f8784c = bVar;
                super(1);
            }

            /* renamed from: a */
            public final void mo12701a(ValueAnimator valueAnimator) {
                this.f8784c.f8781W.f8778c.mo12697a(this.f8784c.f8781W.f8772U, this.f8784c.f8783c, valueAnimator.getAnimatedFraction());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12701a((ValueAnimator) obj);
                return C13145v.f29587a;
            }
        }

        C3498b(View view, float f, float f2, C3496e eVar, boolean z) {
            this.f8783c = view;
            this.f8779U = f;
            this.f8780V = f2;
            this.f8781W = eVar;
            this.f8782X = z;
        }

        public final void run() {
            View view = this.f8783c;
            float f = (this.f8782X || !this.f8781W.f8775X) ? 1.0f : 0.7f;
            float f2 = this.f8779U;
            float f3 = this.f8780V;
            TimeInterpolator a = this.f8782X ? C3822a.f9509k.mo13746a() : C3822a.f9509k.mo13747b();
            long j = this.f8782X ? 150 : 250;
            C3499a aVar = r2;
            C3499a aVar2 = new C3499a(this);
            C3800a.m12829a(view, 0.0f, f, f2, f3, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, j, 0, a, null, null, aVar, 110577, null);
        }
    }

    static {
        new C3497a(null);
    }

    public C3496e(C3490a aVar, View view, View view2, int i, boolean z, boolean z2, float f) {
        this.f8778c = aVar;
        this.f8772U = view;
        this.f8773V = view2;
        this.f8774W = i;
        this.f8775X = z;
        this.f8776Y = z2;
        this.f8777Z = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r1 != 1.0f) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFocusChange(android.view.View r8, boolean r9) {
        /*
            r7 = this;
            android.view.View r8 = r7.f8773V
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x0016
            boolean r1 = r7.f8776Y
            if (r1 == 0) goto L_0x0016
            int r1 = r7.f8774W
            float r1 = (float) r1
            int r2 = r8.getMeasuredHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r1 = r1 + r0
        L_0x0014:
            r3 = r1
            goto L_0x0021
        L_0x0016:
            if (r9 == 0) goto L_0x001f
            float r1 = r7.f8777Z
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0021:
            float r2 = r8.getScaleX()
            com.bamtechmedia.dominguez.collections.ui.e$b r6 = new com.bamtechmedia.dominguez.collections.ui.e$b
            r0 = r6
            r1 = r8
            r4 = r7
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8.post(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.p081ui.C3496e.onFocusChange(android.view.View, boolean):void");
    }
}
