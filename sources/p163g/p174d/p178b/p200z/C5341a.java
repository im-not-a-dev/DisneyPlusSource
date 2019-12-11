package p163g.p174d.p178b.p200z;

import android.view.View;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;

/* renamed from: g.d.b.z.a */
/* compiled from: AnimationUtils.kt */
public final class C5341a {
    /* renamed from: a */
    public static /* synthetic */ void m18080a(View view, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        m18079a(view, i, function1);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18082b(View view, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        m18081b(view, i, function1);
    }

    /* renamed from: a */
    public static final void m18079a(View view, int i, Function1<? super View, C13145v> function1) {
        view.setVisibility(i);
        view.setEnabled(false);
        view.setClickable(false);
        if (function1 != null) {
            C13145v vVar = (C13145v) function1.invoke(view);
        }
    }

    /* renamed from: b */
    public static final void m18081b(View view, int i, Function1<? super View, C13145v> function1) {
        view.setVisibility(i);
        view.setEnabled(true);
        view.setClickable(true);
        if (function1 != null) {
            C13145v vVar = (C13145v) function1.invoke(view);
        }
    }
}
