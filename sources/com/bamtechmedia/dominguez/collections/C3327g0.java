package com.bamtechmedia.dominguez.collections;

import androidx.constraintlayout.motion.widget.C0412y;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/MotionLayoutViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "", "()V", "value", "motionLayoutProgress", "setMotionLayoutProgress", "(F)V", "playAnimation", "", "getPlayAnimation", "()Z", "setPlayAnimation", "(Z)V", "setMotionLayout", "", "motionLayout", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.g0 */
/* compiled from: MotionLayoutViewModel.kt */
public final class C3327g0 extends C5741g<Float> {

    /* renamed from: a */
    private boolean f8383a = true;

    /* renamed from: com.bamtechmedia.dominguez.collections.g0$a */
    /* compiled from: MotionLayoutViewModel.kt */
    static final class C3328a extends C12881k implements Function1<Float, Float> {

        /* renamed from: c */
        final /* synthetic */ float f8384c;

        C3328a(float f) {
            this.f8384c = f;
            super(1);
        }

        /* renamed from: a */
        public final float mo12385a(float f) {
            return this.f8384c;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Float.valueOf(mo12385a(((Number) obj).floatValue()));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.g0$b */
    /* compiled from: MotionLayoutViewModel.kt */
    public static final class C3329b extends C0412y {

        /* renamed from: a */
        final /* synthetic */ C3327g0 f8385a;

        C3329b(C3327g0 g0Var) {
            this.f8385a = g0Var;
        }

        /* renamed from: a */
        public void mo2189a(MotionLayout motionLayout, int i, int i2, float f) {
            this.f8385a.m11450a(f);
        }
    }

    public C3327g0() {
        super(null, 1, null);
        createState(Float.valueOf(0.0f));
    }

    /* renamed from: d */
    public final void mo12383d(boolean z) {
        this.f8383a = z;
    }

    /* renamed from: y */
    public final boolean mo12384y() {
        return this.f8383a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11450a(float f) {
        updateState(new C3328a(f));
    }

    /* renamed from: a */
    public final void mo12382a(MotionLayout motionLayout) {
        motionLayout.setTransitionListener(new C3329b(this));
    }
}
