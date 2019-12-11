package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0813p;
import androidx.recyclerview.widget.RecyclerView.C0825z;
import androidx.recyclerview.widget.RecyclerView.C0825z.C0826a;

/* renamed from: androidx.recyclerview.widget.m */
/* compiled from: LinearSmoothScroller */
public class C0888m extends C0825z {

    /* renamed from: i */
    protected final LinearInterpolator f3618i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f3619j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f3620k;

    /* renamed from: l */
    private final float f3621l;

    /* renamed from: m */
    protected int f3622m = 0;

    /* renamed from: n */
    protected int f3623n = 0;

    public C0888m(Context context) {
        this.f3621l = mo5099a(context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    private int m4906b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3934a(View view, C0788a0 a0Var, C0826a aVar) {
        int a = mo5101a(view, mo5104i());
        int b = mo5102b(view, mo5105j());
        int d = mo5103d((int) Math.sqrt((double) ((a * a) + (b * b))));
        if (d > 0) {
            aVar.mo4852a(-a, -b, d, this.f3619j);
        }
    }

    /* renamed from: b */
    public int mo5102b(View view, int i) {
        C0808o b = mo4843b();
        if (b == null || !b.mo3882b()) {
            return 0;
        }
        C0813p pVar = (C0813p) view.getLayoutParams();
        return mo5100a(b.mo3905j(view) - pVar.topMargin, b.mo3893e(view) + pVar.bottomMargin, b.mo4757q(), b.mo4741h() - b.mo4752n(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo5103d(int i) {
        return (int) Math.ceil(((double) mo3935e(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo3935e(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f3621l));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo4849f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo3936g() {
        this.f3623n = 0;
        this.f3622m = 0;
        this.f3620k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo5104i() {
        PointF pointF = this.f3620k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo5105j() {
        PointF pointF = this.f3620k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4839a(int i, int i2, C0788a0 a0Var, C0826a aVar) {
        if (mo4836a() == 0) {
            mo4850h();
            return;
        }
        this.f3622m = m4906b(this.f3622m, i);
        this.f3623n = m4906b(this.f3623n, i2);
        if (this.f3622m == 0 && this.f3623n == 0) {
            mo3956a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo5099a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3956a(C0826a aVar) {
        PointF a = mo3933a(mo4845c());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo4851a(mo4845c());
            mo4850h();
            return;
        }
        mo4840a(a);
        this.f3620k = a;
        this.f3622m = (int) (a.x * 10000.0f);
        this.f3623n = (int) (a.y * 10000.0f);
        aVar.mo4852a((int) (((float) this.f3622m) * 1.2f), (int) (((float) this.f3623n) * 1.2f), (int) (((float) mo3935e(10000)) * 1.2f), this.f3618i);
    }

    /* renamed from: a */
    public int mo5100a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: a */
    public int mo5101a(View view, int i) {
        C0808o b = mo4843b();
        if (b == null || !b.mo3862a()) {
            return 0;
        }
        C0813p pVar = (C0813p) view.getLayoutParams();
        return mo5100a(b.mo3898f(view) - pVar.leftMargin, b.mo3902i(view) + pVar.rightMargin, b.mo4754o(), b.mo4758r() - b.mo4756p(), i);
    }
}
