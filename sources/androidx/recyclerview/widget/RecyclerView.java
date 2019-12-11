package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.p130o.C4070g;
import p096e.p121h.p134r.C4117i;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.C4171j;
import p096e.p121h.p135s.C4174k;
import p096e.p121h.p135s.C4177n;
import p096e.p121h.p135s.C4185v;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.C4196y;
import p096e.p121h.p135s.p136i0.C4150b;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4154d.C4156b;
import p096e.p121h.p135s.p136i0.C4154d.C4157c;
import p096e.p140j.p141a.C4204a;
import p096e.p153o.C4258a;
import p096e.p153o.C4260c;

public class RecyclerView extends ViewGroup implements C4185v, C4174k {

    /* renamed from: A1 */
    private static final Class<?>[] f3170A1;

    /* renamed from: B1 */
    static final Interpolator f3171B1 = new C0791c();

    /* renamed from: s1 */
    private static final int[] f3172s1 = {16843830};

    /* renamed from: t1 */
    private static final int[] f3173t1 = {16842987};

    /* renamed from: u1 */
    static final boolean f3174u1;

    /* renamed from: v1 */
    static final boolean f3175v1 = (VERSION.SDK_INT >= 23);

    /* renamed from: w1 */
    static final boolean f3176w1 = (VERSION.SDK_INT >= 16);

    /* renamed from: x1 */
    static final boolean f3177x1 = (VERSION.SDK_INT >= 21);

    /* renamed from: y1 */
    private static final boolean f3178y1 = (VERSION.SDK_INT <= 15);

    /* renamed from: z1 */
    private static final boolean f3179z1 = (VERSION.SDK_INT <= 15);

    /* renamed from: A0 */
    boolean f3180A0;

    /* renamed from: B0 */
    private int f3181B0;

    /* renamed from: C0 */
    private int f3182C0;

    /* renamed from: D0 */
    private C0801k f3183D0;

    /* renamed from: E0 */
    private EdgeEffect f3184E0;

    /* renamed from: F0 */
    private EdgeEffect f3185F0;

    /* renamed from: G0 */
    private EdgeEffect f3186G0;

    /* renamed from: H0 */
    private EdgeEffect f3187H0;

    /* renamed from: I0 */
    C0802l f3188I0;

    /* renamed from: J0 */
    private int f3189J0;

    /* renamed from: K0 */
    private int f3190K0;

    /* renamed from: L0 */
    private VelocityTracker f3191L0;

    /* renamed from: M0 */
    private int f3192M0;

    /* renamed from: N0 */
    private int f3193N0;

    /* renamed from: O0 */
    private int f3194O0;

    /* renamed from: P0 */
    private int f3195P0;

    /* renamed from: Q0 */
    private int f3196Q0;

    /* renamed from: R0 */
    private C0815r f3197R0;

    /* renamed from: S0 */
    private final int f3198S0;

    /* renamed from: T0 */
    private final int f3199T0;

    /* renamed from: U */
    final C0820v f3200U;

    /* renamed from: U0 */
    private float f3201U0;

    /* renamed from: V */
    private C0823y f3202V;

    /* renamed from: V0 */
    private float f3203V0;

    /* renamed from: W */
    C0837a f3204W;

    /* renamed from: W0 */
    private boolean f3205W0;

    /* renamed from: X0 */
    final C0792c0 f3206X0;

    /* renamed from: Y0 */
    C0868h f3207Y0;

    /* renamed from: Z0 */
    C0870b f3208Z0;

    /* renamed from: a0 */
    C0842d f3209a0;

    /* renamed from: a1 */
    final C0788a0 f3210a1;

    /* renamed from: b0 */
    final C0906w f3211b0;

    /* renamed from: b1 */
    private C0817t f3212b1;

    /* renamed from: c */
    private final C0822x f3213c;

    /* renamed from: c0 */
    boolean f3214c0;

    /* renamed from: c1 */
    private List<C0817t> f3215c1;

    /* renamed from: d0 */
    final Runnable f3216d0;

    /* renamed from: d1 */
    boolean f3217d1;

    /* renamed from: e0 */
    final Rect f3218e0;

    /* renamed from: e1 */
    boolean f3219e1;

    /* renamed from: f0 */
    private final Rect f3220f0;

    /* renamed from: f1 */
    private C0804b f3221f1;

    /* renamed from: g0 */
    final RectF f3222g0;

    /* renamed from: g1 */
    boolean f3223g1;

    /* renamed from: h0 */
    C0797g f3224h0;

    /* renamed from: h1 */
    C0897r f3225h1;

    /* renamed from: i0 */
    C0808o f3226i0;

    /* renamed from: i1 */
    private C0800j f3227i1;

    /* renamed from: j0 */
    C0821w f3228j0;

    /* renamed from: j1 */
    private final int[] f3229j1;

    /* renamed from: k0 */
    final ArrayList<C0807n> f3230k0;

    /* renamed from: k1 */
    private C4177n f3231k1;

    /* renamed from: l0 */
    private final ArrayList<C0816s> f3232l0;

    /* renamed from: l1 */
    private final int[] f3233l1;

    /* renamed from: m0 */
    private C0816s f3234m0;

    /* renamed from: m1 */
    final int[] f3235m1;

    /* renamed from: n0 */
    boolean f3236n0;

    /* renamed from: n1 */
    private final int[] f3237n1;

    /* renamed from: o0 */
    boolean f3238o0;

    /* renamed from: o1 */
    final int[] f3239o1;

    /* renamed from: p0 */
    boolean f3240p0;

    /* renamed from: p1 */
    final List<C0794d0> f3241p1;

    /* renamed from: q0 */
    boolean f3242q0;

    /* renamed from: q1 */
    private Runnable f3243q1;

    /* renamed from: r0 */
    private int f3244r0;

    /* renamed from: r1 */
    private final C0908b f3245r1;

    /* renamed from: s0 */
    boolean f3246s0;

    /* renamed from: t0 */
    boolean f3247t0;

    /* renamed from: u0 */
    private boolean f3248u0;

    /* renamed from: v0 */
    private int f3249v0;

    /* renamed from: w0 */
    boolean f3250w0;

    /* renamed from: x0 */
    private final AccessibilityManager f3251x0;

    /* renamed from: y0 */
    private List<C0814q> f3252y0;

    /* renamed from: z0 */
    boolean f3253z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C0787a implements Runnable {
        C0787a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3242q0 && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f3236n0) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f3247t0) {
                    recyclerView2.f3246s0 = true;
                } else {
                    recyclerView2.mo4396b();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0788a0 {

        /* renamed from: a */
        int f3255a = -1;

        /* renamed from: b */
        private SparseArray<Object> f3256b;

        /* renamed from: c */
        int f3257c = 0;

        /* renamed from: d */
        int f3258d = 0;

        /* renamed from: e */
        int f3259e = 1;

        /* renamed from: f */
        int f3260f = 0;

        /* renamed from: g */
        boolean f3261g = false;

        /* renamed from: h */
        boolean f3262h = false;

        /* renamed from: i */
        boolean f3263i = false;

        /* renamed from: j */
        boolean f3264j = false;

        /* renamed from: k */
        boolean f3265k = false;

        /* renamed from: l */
        boolean f3266l = false;

        /* renamed from: m */
        int f3267m;

        /* renamed from: n */
        long f3268n;

        /* renamed from: o */
        int f3269o;

        /* renamed from: p */
        int f3270p;

        /* renamed from: q */
        int f3271q;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4528a(int i) {
            if ((this.f3259e & i) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f3259e));
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: b */
        public int mo4531b() {
            return this.f3262h ? this.f3257c - this.f3258d : this.f3260f;
        }

        /* renamed from: c */
        public int mo4532c() {
            return this.f3270p;
        }

        /* renamed from: d */
        public int mo4533d() {
            return this.f3271q;
        }

        /* renamed from: e */
        public int mo4534e() {
            return this.f3255a;
        }

        /* renamed from: f */
        public boolean mo4535f() {
            return this.f3255a != -1;
        }

        /* renamed from: g */
        public boolean mo4536g() {
            return this.f3262h;
        }

        /* renamed from: h */
        public boolean mo4537h() {
            return this.f3266l;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.f3255a);
            sb.append(", mData=");
            sb.append(this.f3256b);
            sb.append(", mItemCount=");
            sb.append(this.f3260f);
            sb.append(", mIsMeasuring=");
            sb.append(this.f3264j);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f3257c);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f3258d);
            sb.append(", mStructureChanged=");
            sb.append(this.f3261g);
            sb.append(", mInPreLayout=");
            sb.append(this.f3262h);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f3265k);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f3266l);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4529a(C0797g gVar) {
            this.f3259e = 1;
            this.f3260f = gVar.getItemCount();
            this.f3262h = false;
            this.f3263i = false;
            this.f3264j = false;
        }

        /* renamed from: a */
        public boolean mo4530a() {
            return this.f3261g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C0789b implements Runnable {
        C0789b() {
        }

        public void run() {
            C0802l lVar = RecyclerView.this.f3188I0;
            if (lVar != null) {
                lVar.mo4674i();
            }
            RecyclerView.this.f3223g1 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C0790b0 {
        /* renamed from: a */
        public abstract View mo4540a(C0820v vVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C0791c implements Interpolator {
        C0791c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C0792c0 implements Runnable {

        /* renamed from: U */
        private int f3273U;

        /* renamed from: V */
        OverScroller f3274V;

        /* renamed from: W */
        Interpolator f3275W = RecyclerView.f3171B1;

        /* renamed from: X */
        private boolean f3276X = false;

        /* renamed from: Y */
        private boolean f3277Y = false;

        /* renamed from: c */
        private int f3279c;

        C0792c0() {
            this.f3274V = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f3171B1);
        }

        /* renamed from: c */
        private void m4224c() {
            this.f3277Y = false;
            this.f3276X = true;
        }

        /* renamed from: d */
        private void m4225d() {
            this.f3276X = false;
            if (this.f3277Y) {
                mo4542a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4542a() {
            if (this.f3276X) {
                this.f3277Y = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C4187x.m14363a((View) RecyclerView.this, (Runnable) this);
        }

        /* renamed from: b */
        public void mo4549b(int i, int i2) {
            mo4545a(i, i2, 0, 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
            if (r8 > 0) goto L_0x00ef;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r0 = r22
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$o r1 = r1.f3226i0
                if (r1 != 0) goto L_0x000c
                r22.mo4548b()
                return
            L_0x000c:
                r22.m4224c()
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo4396b()
                android.widget.OverScroller r1 = r0.f3274V
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$o r2 = r2.f3226i0
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f3298g
                boolean r3 = r1.computeScrollOffset()
                r4 = 0
                if (r3 == 0) goto L_0x018b
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                int[] r3 = r3.f3235m1
                int r11 = r1.getCurrX()
                int r12 = r1.getCurrY()
                int r5 = r0.f3279c
                int r13 = r11 - r5
                int r5 = r0.f3273U
                int r14 = r12 - r5
                r0.f3279c = r11
                r0.f3273U = r12
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                r9 = 0
                r10 = 1
                r6 = r13
                r7 = r14
                r8 = r3
                boolean r5 = r5.mo4390a(r6, r7, r8, r9, r10)
                r6 = 1
                if (r5 == 0) goto L_0x004f
                r5 = r3[r4]
                int r13 = r13 - r5
                r3 = r3[r6]
                int r14 = r14 - r3
            L_0x004f:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r3.f3224h0
                if (r5 == 0) goto L_0x009c
                int[] r5 = r3.f3239o1
                r3.mo4374a(r13, r14, r5)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                int[] r3 = r3.f3239o1
                r5 = r3[r4]
                r3 = r3[r6]
                int r7 = r13 - r5
                int r8 = r14 - r3
                if (r2 == 0) goto L_0x00a0
                boolean r9 = r2.mo4847d()
                if (r9 != 0) goto L_0x00a0
                boolean r9 = r2.mo4848e()
                if (r9 == 0) goto L_0x00a0
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r9 = r9.f3210a1
                int r9 = r9.mo4531b()
                if (r9 != 0) goto L_0x0082
                r2.mo4850h()
                goto L_0x00a0
            L_0x0082:
                int r10 = r2.mo4845c()
                if (r10 < r9) goto L_0x0094
                int r9 = r9 - r6
                r2.mo4846c(r9)
                int r9 = r13 - r7
                int r10 = r14 - r8
                r2.mo4838a(r9, r10)
                goto L_0x00a0
            L_0x0094:
                int r9 = r13 - r7
                int r10 = r14 - r8
                r2.mo4838a(r9, r10)
                goto L_0x00a0
            L_0x009c:
                r3 = 0
                r5 = 0
                r7 = 0
                r8 = 0
            L_0x00a0:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$n> r9 = r9.f3230k0
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00af
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                r9.invalidate()
            L_0x00af:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00bd
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                r9.mo4398b(r13, r14)
            L_0x00bd:
                androidx.recyclerview.widget.RecyclerView r15 = androidx.recyclerview.widget.RecyclerView.this
                r20 = 0
                r21 = 1
                r16 = r5
                r17 = r3
                r18 = r7
                r19 = r8
                boolean r9 = r15.mo4388a(r16, r17, r18, r19, r20, r21)
                if (r9 != 0) goto L_0x0113
                if (r7 != 0) goto L_0x00d5
                if (r8 == 0) goto L_0x0113
            L_0x00d5:
                float r9 = r1.getCurrVelocity()
                int r9 = (int) r9
                if (r7 == r11) goto L_0x00e4
                if (r7 >= 0) goto L_0x00e0
                int r15 = -r9
                goto L_0x00e5
            L_0x00e0:
                if (r7 <= 0) goto L_0x00e4
                r15 = r9
                goto L_0x00e5
            L_0x00e4:
                r15 = 0
            L_0x00e5:
                if (r8 == r12) goto L_0x00ee
                if (r8 >= 0) goto L_0x00eb
                int r9 = -r9
                goto L_0x00ef
            L_0x00eb:
                if (r8 <= 0) goto L_0x00ee
                goto L_0x00ef
            L_0x00ee:
                r9 = 0
            L_0x00ef:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                int r4 = r4.getOverScrollMode()
                if (r4 == r10) goto L_0x00fc
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.mo4370a(r15, r9)
            L_0x00fc:
                if (r15 != 0) goto L_0x0106
                if (r7 == r11) goto L_0x0106
                int r4 = r1.getFinalX()
                if (r4 != 0) goto L_0x0113
            L_0x0106:
                if (r9 != 0) goto L_0x0110
                if (r8 == r12) goto L_0x0110
                int r4 = r1.getFinalY()
                if (r4 != 0) goto L_0x0113
            L_0x0110:
                r1.abortAnimation()
            L_0x0113:
                if (r5 != 0) goto L_0x0117
                if (r3 == 0) goto L_0x011c
            L_0x0117:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.mo4421d(r5, r3)
            L_0x011c:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                boolean r4 = r4.awakenScrollBars()
                if (r4 != 0) goto L_0x0129
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.invalidate()
            L_0x0129:
                if (r14 == 0) goto L_0x0139
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$o r4 = r4.f3226i0
                boolean r4 = r4.mo3882b()
                if (r4 == 0) goto L_0x0139
                if (r3 != r14) goto L_0x0139
                r3 = 1
                goto L_0x013a
            L_0x0139:
                r3 = 0
            L_0x013a:
                if (r13 == 0) goto L_0x014a
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$o r4 = r4.f3226i0
                boolean r4 = r4.mo3862a()
                if (r4 == 0) goto L_0x014a
                if (r5 != r13) goto L_0x014a
                r4 = 1
                goto L_0x014b
            L_0x014a:
                r4 = 0
            L_0x014b:
                if (r13 != 0) goto L_0x014f
                if (r14 == 0) goto L_0x0156
            L_0x014f:
                if (r4 != 0) goto L_0x0156
                if (r3 == 0) goto L_0x0154
                goto L_0x0156
            L_0x0154:
                r3 = 0
                goto L_0x0157
            L_0x0156:
                r3 = 1
            L_0x0157:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x0175
                if (r3 != 0) goto L_0x0168
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                boolean r1 = r1.mo4422d(r6)
                if (r1 != 0) goto L_0x0168
                goto L_0x0175
            L_0x0168:
                r22.mo4542a()
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.h r3 = r1.f3207Y0
                if (r3 == 0) goto L_0x018b
                r3.mo5028a(r1, r13, r14)
                goto L_0x018b
            L_0x0175:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f3177x1
                if (r1 == 0) goto L_0x0186
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.h$b r1 = r1.f3208Z0
                r1.mo5033a()
            L_0x0186:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo2753a(r6)
            L_0x018b:
                if (r2 == 0) goto L_0x019e
                boolean r1 = r2.mo4847d()
                if (r1 == 0) goto L_0x0197
                r1 = 0
                r2.mo4838a(r1, r1)
            L_0x0197:
                boolean r1 = r0.f3277Y
                if (r1 != 0) goto L_0x019e
                r2.mo4850h()
            L_0x019e:
                r22.m4225d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0792c0.run():void");
        }

        /* renamed from: b */
        private int m4223b(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m4222a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: a */
        public void mo4543a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3273U = 0;
            this.f3279c = 0;
            this.f3274V.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4542a();
        }

        /* renamed from: a */
        public void mo4545a(int i, int i2, int i3, int i4) {
            mo4544a(i, i2, m4223b(i, i2, i3, i4));
        }

        /* renamed from: a */
        private float m4222a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: a */
        public void mo4544a(int i, int i2, int i3) {
            mo4546a(i, i2, i3, RecyclerView.f3171B1);
        }

        /* renamed from: a */
        public void mo4547a(int i, int i2, Interpolator interpolator) {
            int b = m4223b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f3171B1;
            }
            mo4546a(i, i2, b, interpolator);
        }

        /* renamed from: b */
        public void mo4548b() {
            RecyclerView.this.removeCallbacks(this);
            this.f3274V.abortAnimation();
        }

        /* renamed from: a */
        public void mo4546a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f3275W != interpolator) {
                this.f3275W = interpolator;
                this.f3274V = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f3273U = 0;
            this.f3279c = 0;
            this.f3274V.startScroll(0, 0, i, i2, i3);
            if (VERSION.SDK_INT < 23) {
                this.f3274V.computeScrollOffset();
            }
            mo4542a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0793d implements C0908b {
        C0793d() {
        }

        /* renamed from: a */
        public void mo4552a(C0794d0 d0Var, C0805c cVar, C0805c cVar2) {
            RecyclerView.this.mo4379a(d0Var, cVar, cVar2);
        }

        /* renamed from: b */
        public void mo4553b(C0794d0 d0Var, C0805c cVar, C0805c cVar2) {
            RecyclerView.this.f3200U.mo4819c(d0Var);
            RecyclerView.this.mo4400b(d0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo4554c(C0794d0 d0Var, C0805c cVar, C0805c cVar2) {
            d0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3253z0) {
                if (recyclerView.f3188I0.mo4657a(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.mo4521t();
                }
            } else if (recyclerView.f3188I0.mo4667c(d0Var, cVar, cVar2)) {
                RecyclerView.this.mo4521t();
            }
        }

        /* renamed from: a */
        public void mo4551a(C0794d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3226i0.mo4718b(d0Var.itemView, recyclerView.f3200U);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C0794d0 {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C0820v mScrapContainer = null;
        C0794d0 mShadowedHolder = null;
        C0794d0 mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C0794d0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: 0000 */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: 0000 */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: 0000 */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: 0000 */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: 0000 */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: 0000 */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C4187x.m14337B(this.itemView);
        }

        /* access modifiers changed from: 0000 */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo4395b(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        /* access modifiers changed from: 0000 */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: 0000 */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & DateUtils.FORMAT_NO_NOON) != 0 || isInvalid();
        }

        /* access modifiers changed from: 0000 */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C4187x.m14337B(this.itemView);
        }

        /* access modifiers changed from: 0000 */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: 0000 */
        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C0813p) this.itemView.getLayoutParams()).f3318c = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C4187x.m14397l(this.itemView);
            }
            recyclerView.mo4393a(this, 4);
        }

        /* access modifiers changed from: 0000 */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo4393a(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: 0000 */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m4115e(this);
        }

        /* access modifiers changed from: 0000 */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            this.mIsRecyclableCount = z ? i - 1 : i + 1;
            int i2 = this.mIsRecyclableCount;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setScrapContainer(C0820v vVar, boolean z) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewHolder{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        public void unScrap() {
            this.mScrapContainer.mo4819c(this);
        }

        /* access modifiers changed from: 0000 */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C0795e implements C0844b {
        C0795e() {
        }

        /* renamed from: a */
        public int mo4592a() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: b */
        public int mo4597b(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: c */
        public void mo4601c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo4399b(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: d */
        public void mo4602d(View view) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (m != null) {
                m.onLeftHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: a */
        public void mo4595a(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo4376a(view);
        }

        /* renamed from: b */
        public void mo4598b() {
            int a = mo4592a();
            for (int i = 0; i < a; i++) {
                View a2 = mo4593a(i);
                RecyclerView.this.mo4399b(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: a */
        public View mo4593a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: a */
        public void mo4596a(View view, int i, LayoutParams layoutParams) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (m != null) {
                if (m.isTmpDetached() || m.shouldIgnore()) {
                    m.clearTmpDetachFlag();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(m);
                    sb.append(RecyclerView.this.mo4466i());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: c */
        public C0794d0 mo4600c(View view) {
            return RecyclerView.m4118m(view);
        }

        /* renamed from: b */
        public void mo4599b(int i) {
            View a = mo4593a(i);
            if (a != null) {
                C0794d0 m = RecyclerView.m4118m(a);
                if (m != null) {
                    if (!m.isTmpDetached() || m.shouldIgnore()) {
                        m.addFlags(256);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("called detach on an already detached child ");
                        sb.append(m);
                        sb.append(RecyclerView.this.mo4466i());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: a */
        public void mo4594a(View view) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (m != null) {
                m.onEnteredHiddenState(RecyclerView.this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C0796f implements C0838a {
        C0796f() {
        }

        /* renamed from: a */
        public C0794d0 mo4603a(int i) {
            C0794d0 a = RecyclerView.this.mo4367a(i, true);
            if (a != null && !RecyclerView.this.f3209a0.mo4965c(a.itemView)) {
                return a;
            }
            return null;
        }

        /* renamed from: b */
        public void mo4607b(int i, int i2) {
            RecyclerView.this.mo4373a(i, i2, false);
            RecyclerView.this.f3217d1 = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4610c(C0839b bVar) {
            int i = bVar.f3416a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3226i0.mo3856a(recyclerView, bVar.f3417b, bVar.f3419d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3226i0.mo3878b(recyclerView2, bVar.f3417b, bVar.f3419d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3226i0.mo4302a(recyclerView3, bVar.f3417b, bVar.f3419d, bVar.f3418c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3226i0.mo3857a(recyclerView4, bVar.f3417b, bVar.f3419d, 1);
            }
        }

        /* renamed from: d */
        public void mo4611d(int i, int i2) {
            RecyclerView.this.mo4373a(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3217d1 = true;
            recyclerView.f3210a1.f3258d += i2;
        }

        /* renamed from: a */
        public void mo4605a(int i, int i2, Object obj) {
            RecyclerView.this.mo4372a(i, i2, obj);
            RecyclerView.this.f3219e1 = true;
        }

        /* renamed from: b */
        public void mo4608b(C0839b bVar) {
            mo4610c(bVar);
        }

        /* renamed from: a */
        public void mo4606a(C0839b bVar) {
            mo4610c(bVar);
        }

        /* renamed from: a */
        public void mo4604a(int i, int i2) {
            RecyclerView.this.mo4442g(i, i2);
            RecyclerView.this.f3217d1 = true;
        }

        /* renamed from: c */
        public void mo4609c(int i, int i2) {
            RecyclerView.this.mo4437f(i, i2);
            RecyclerView.this.f3217d1 = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C0797g<VH extends C0794d0> {
        private boolean mHasStableIds = false;
        private final C0798h mObservable = new C0798h();

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            C4070g.m13983a("RV OnBindView");
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof C0813p) {
                ((C0813p) layoutParams).f3318c = true;
            }
            C4070g.m13982a();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C4070g.m13983a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C4070g.m13982a();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo4638a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo4639b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo4640b(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo4636a(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo4640b(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo4641c(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo4642d(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo4642d(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C0799i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void unregisterAdapterDataObserver(C0799i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo4637a(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo4637a(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C0798h extends Observable<C0799i> {
        C0798h() {
        }

        /* renamed from: a */
        public boolean mo4638a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo4639b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0799i) this.mObservers.get(size)).mo4643a();
            }
        }

        /* renamed from: c */
        public void mo4641c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0799i) this.mObservers.get(size)).mo4647b(i, i2);
            }
        }

        /* renamed from: d */
        public void mo4642d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0799i) this.mObservers.get(size)).mo4648c(i, i2);
            }
        }

        /* renamed from: a */
        public void mo4637a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0799i) this.mObservers.get(size)).mo4646a(i, i2, obj);
            }
        }

        /* renamed from: b */
        public void mo4640b(int i, int i2) {
            mo4637a(i, i2, null);
        }

        /* renamed from: a */
        public void mo4636a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0799i) this.mObservers.get(size)).mo4645a(i, i2, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0799i {
        /* renamed from: a */
        public void mo4643a() {
        }

        /* renamed from: a */
        public void mo4644a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4645a(int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo4646a(int i, int i2, Object obj) {
            mo4644a(i, i2);
        }

        /* renamed from: b */
        public void mo4647b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo4648c(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C0800j {
        /* renamed from: a */
        int mo4649a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0801k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4650a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0802l {

        /* renamed from: a */
        private C0804b f3283a = null;

        /* renamed from: b */
        private ArrayList<C0803a> f3284b = new ArrayList<>();

        /* renamed from: c */
        private long f3285c = 120;

        /* renamed from: d */
        private long f3286d = 120;

        /* renamed from: e */
        private long f3287e = 250;

        /* renamed from: f */
        private long f3288f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C0803a {
            /* renamed from: a */
            void mo4675a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface C0804b {
            /* renamed from: a */
            void mo4676a(C0794d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C0805c {

            /* renamed from: a */
            public int f3289a;

            /* renamed from: b */
            public int f3290b;

            /* renamed from: a */
            public C0805c mo4677a(C0794d0 d0Var) {
                mo4678a(d0Var, 0);
                return this;
            }

            /* renamed from: a */
            public C0805c mo4678a(C0794d0 d0Var, int i) {
                View view = d0Var.itemView;
                this.f3289a = view.getLeft();
                this.f3290b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: a */
        public void mo4654a(long j) {
            this.f3285c = j;
        }

        /* renamed from: a */
        public abstract boolean mo4656a(C0794d0 d0Var);

        /* renamed from: a */
        public abstract boolean mo4657a(C0794d0 d0Var, C0794d0 d0Var2, C0805c cVar, C0805c cVar2);

        /* renamed from: a */
        public abstract boolean mo4658a(C0794d0 d0Var, C0805c cVar, C0805c cVar2);

        /* renamed from: b */
        public abstract void mo4661b();

        /* renamed from: b */
        public void mo4662b(long j) {
            this.f3286d = j;
        }

        /* renamed from: b */
        public abstract boolean mo4664b(C0794d0 d0Var, C0805c cVar, C0805c cVar2);

        /* renamed from: c */
        public long mo4665c() {
            return this.f3285c;
        }

        /* renamed from: c */
        public abstract void mo4666c(C0794d0 d0Var);

        /* renamed from: c */
        public abstract boolean mo4667c(C0794d0 d0Var, C0805c cVar, C0805c cVar2);

        /* renamed from: d */
        public long mo4668d() {
            return this.f3288f;
        }

        /* renamed from: d */
        public void mo4669d(C0794d0 d0Var) {
        }

        /* renamed from: e */
        public long mo4670e() {
            return this.f3287e;
        }

        /* renamed from: f */
        public long mo4671f() {
            return this.f3286d;
        }

        /* renamed from: g */
        public abstract boolean mo4672g();

        /* renamed from: h */
        public C0805c mo4673h() {
            return new C0805c();
        }

        /* renamed from: i */
        public abstract void mo4674i();

        /* renamed from: e */
        static int m4273e(C0794d0 d0Var) {
            int i = d0Var.mFlags & 14;
            if (d0Var.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = d0Var.getOldPosition();
                int adapterPosition = d0Var.getAdapterPosition();
                if (!(oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition)) {
                    i |= DateUtils.FORMAT_NO_MIDNIGHT;
                }
            }
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4655a(C0804b bVar) {
            this.f3283a = bVar;
        }

        /* renamed from: b */
        public final void mo4663b(C0794d0 d0Var) {
            mo4669d(d0Var);
            C0804b bVar = this.f3283a;
            if (bVar != null) {
                bVar.mo4676a(d0Var);
            }
        }

        /* renamed from: a */
        public C0805c mo4652a(C0788a0 a0Var, C0794d0 d0Var, int i, List<Object> list) {
            C0805c h = mo4673h();
            h.mo4677a(d0Var);
            return h;
        }

        /* renamed from: a */
        public C0805c mo4651a(C0788a0 a0Var, C0794d0 d0Var) {
            C0805c h = mo4673h();
            h.mo4677a(d0Var);
            return h;
        }

        /* renamed from: a */
        public final boolean mo4660a(C0803a aVar) {
            boolean g = mo4672g();
            if (aVar != null) {
                if (!g) {
                    aVar.mo4675a();
                } else {
                    this.f3284b.add(aVar);
                }
            }
            return g;
        }

        /* renamed from: a */
        public boolean mo4659a(C0794d0 d0Var, List<Object> list) {
            return mo4656a(d0Var);
        }

        /* renamed from: a */
        public final void mo4653a() {
            int size = this.f3284b.size();
            for (int i = 0; i < size; i++) {
                ((C0803a) this.f3284b.get(i)).mo4675a();
            }
            this.f3284b.clear();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C0806m implements C0804b {
        C0806m() {
        }

        /* renamed from: a */
        public void mo4676a(C0794d0 d0Var) {
            d0Var.setIsRecyclable(true);
            if (d0Var.mShadowedHolder != null && d0Var.mShadowingHolder == null) {
                d0Var.mShadowedHolder = null;
            }
            d0Var.mShadowingHolder = null;
            if (!d0Var.shouldBeKeptAsChild() && !RecyclerView.this.mo4474k(d0Var.itemView) && d0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(d0Var.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0807n {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C0788a0 a0Var) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0788a0 a0Var) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0788a0 a0Var) {
            getItemOffsets(rect, ((C0813p) view.getLayoutParams()).mo4772b(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0808o {

        /* renamed from: a */
        C0842d f3292a;

        /* renamed from: b */
        RecyclerView f3293b;

        /* renamed from: c */
        private final C0905b f3294c = new C0809a();

        /* renamed from: d */
        private final C0905b f3295d = new C0810b();

        /* renamed from: e */
        C0903v f3296e = new C0903v(this.f3294c);

        /* renamed from: f */
        C0903v f3297f = new C0903v(this.f3295d);

        /* renamed from: g */
        C0825z f3298g;

        /* renamed from: h */
        boolean f3299h = false;

        /* renamed from: i */
        boolean f3300i = false;

        /* renamed from: j */
        boolean f3301j = false;

        /* renamed from: k */
        private boolean f3302k = true;

        /* renamed from: l */
        private boolean f3303l = true;

        /* renamed from: m */
        int f3304m;

        /* renamed from: n */
        boolean f3305n;

        /* renamed from: o */
        private int f3306o;

        /* renamed from: p */
        private int f3307p;

        /* renamed from: q */
        private int f3308q;

        /* renamed from: r */
        private int f3309r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C0809a implements C0905b {
            C0809a() {
            }

            /* renamed from: a */
            public View mo4767a(int i) {
                return C0808o.this.mo4729d(i);
            }

            /* renamed from: b */
            public int mo4768b() {
                return C0808o.this.mo4758r() - C0808o.this.mo4756p();
            }

            /* renamed from: a */
            public int mo4765a() {
                return C0808o.this.mo4754o();
            }

            /* renamed from: b */
            public int mo4769b(View view) {
                return C0808o.this.mo3902i(view) + ((C0813p) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: a */
            public int mo4766a(View view) {
                return C0808o.this.mo3898f(view) - ((C0813p) view.getLayoutParams()).leftMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C0810b implements C0905b {
            C0810b() {
            }

            /* renamed from: a */
            public View mo4767a(int i) {
                return C0808o.this.mo4729d(i);
            }

            /* renamed from: b */
            public int mo4768b() {
                return C0808o.this.mo4741h() - C0808o.this.mo4752n();
            }

            /* renamed from: a */
            public int mo4765a() {
                return C0808o.this.mo4757q();
            }

            /* renamed from: a */
            public int mo4766a(View view) {
                return C0808o.this.mo3905j(view) - ((C0813p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public int mo4769b(View view) {
                return C0808o.this.mo3893e(view) + ((C0813p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C0811c {
            /* renamed from: a */
            void mo4770a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C0812d {

            /* renamed from: a */
            public int f3312a;

            /* renamed from: b */
            public int f3313b;

            /* renamed from: c */
            public boolean f3314c;

            /* renamed from: d */
            public boolean f3315d;
        }

        /* renamed from: A */
        public void mo4685A() {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: B */
        public void mo4686B() {
            this.f3299h = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: C */
        public boolean mo4315C() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: D */
        public void mo4687D() {
            C0825z zVar = this.f3298g;
            if (zVar != null) {
                zVar.mo4850h();
            }
        }

        /* renamed from: E */
        public boolean mo3811E() {
            return false;
        }

        /* renamed from: a */
        public int mo3833a(int i, C0820v vVar, C0788a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo4325a(C0788a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public View mo4295a(View view, int i, C0820v vVar, C0788a0 a0Var) {
            return null;
        }

        /* renamed from: a */
        public void mo3841a(int i, int i2, C0788a0 a0Var, C0811c cVar) {
        }

        /* renamed from: a */
        public void mo3844a(int i, C0811c cVar) {
        }

        /* renamed from: a */
        public void mo4297a(Rect rect, int i, int i2) {
            mo4723c(m4303a(i, rect.width() + mo4754o() + mo4756p(), mo4750m()), m4303a(i2, rect.height() + mo4757q() + mo4752n(), mo4748l()));
        }

        /* renamed from: a */
        public void mo3845a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo3852a(C0797g gVar, C0797g gVar2) {
        }

        /* renamed from: a */
        public void mo3856a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo3857a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public boolean mo3862a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4303a(C0813p pVar) {
            return pVar != null;
        }

        /* renamed from: a */
        public boolean mo4710a(C0820v vVar, C0788a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3868a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: b */
        public int mo3870b(int i, C0820v vVar, C0788a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo4332b(C0788a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4715b(int i, int i2) {
            this.f3308q = MeasureSpec.getSize(i);
            this.f3306o = MeasureSpec.getMode(i);
            if (this.f3306o == 0 && !RecyclerView.f3175v1) {
                this.f3308q = 0;
            }
            this.f3309r = MeasureSpec.getSize(i2);
            this.f3307p = MeasureSpec.getMode(i2);
            if (this.f3307p == 0 && !RecyclerView.f3175v1) {
                this.f3309r = 0;
            }
        }

        /* renamed from: b */
        public void mo4719b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo3878b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo3882b() {
            return false;
        }

        /* renamed from: c */
        public int mo4336c(C0788a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public int mo4721c(C0820v vVar, C0788a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public View mo4722c(View view) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView == null) {
                return null;
            }
            View c = recyclerView.mo4407c(view);
            if (c != null && !this.f3292a.mo4965c(c)) {
                return c;
            }
            return null;
        }

        /* renamed from: c */
        public abstract C0813p mo3884c();

        @Deprecated
        /* renamed from: c */
        public void mo4726c(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void mo3885c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int mo4727d() {
            return -1;
        }

        /* renamed from: d */
        public int mo4338d(C0788a0 a0Var) {
            return 0;
        }

        /* renamed from: d */
        public View mo3889d(View view, int i) {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4730d(int i, int i2) {
            int e = mo4732e();
            if (e == 0) {
                this.f3293b.mo4410c(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < e; i7++) {
                View d = mo4729d(i7);
                Rect rect = this.f3293b.f3218e0;
                mo3875b(d, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f3293b.f3218e0.set(i3, i4, i5, i6);
            mo4297a(this.f3293b.f3218e0, i, i2);
        }

        /* renamed from: d */
        public void mo3890d(RecyclerView recyclerView) {
        }

        /* renamed from: d */
        public boolean mo4731d(C0820v vVar, C0788a0 a0Var) {
            return false;
        }

        /* renamed from: e */
        public int mo4339e(C0788a0 a0Var) {
            return 0;
        }

        /* renamed from: e */
        public void mo3895e(C0820v vVar, C0788a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: f */
        public int mo4341f(C0788a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo4736f(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f3293b = null;
                this.f3292a = null;
                this.f3308q = 0;
                this.f3309r = 0;
            } else {
                this.f3293b = recyclerView;
                this.f3292a = recyclerView.f3209a0;
                this.f3308q = recyclerView.getWidth();
                this.f3309r = recyclerView.getHeight();
            }
            this.f3306o = 1073741824;
            this.f3307p = 1073741824;
        }

        /* renamed from: g */
        public View mo4739g() {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView == null) {
                return null;
            }
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.f3292a.mo4965c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g */
        public void mo4740g(int i) {
        }

        /* renamed from: g */
        public void mo3901g(C0788a0 a0Var) {
        }

        /* renamed from: h */
        public void mo4743h(int i) {
            if (mo4729d(i) != null) {
                this.f3292a.mo4968e(i);
            }
        }

        /* renamed from: i */
        public int mo4744i() {
            return this.f3307p;
        }

        /* renamed from: i */
        public void mo3903i(int i) {
        }

        /* renamed from: j */
        public int mo4745j() {
            RecyclerView recyclerView = this.f3293b;
            C0797g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: k */
        public int mo4746k() {
            return C4187x.m14399n(this.f3293b);
        }

        /* renamed from: l */
        public int mo4749l(View view) {
            return ((C0813p) view.getLayoutParams()).mo4772b();
        }

        /* renamed from: m */
        public int mo4751m(View view) {
            return ((C0813p) view.getLayoutParams()).f3317b.right;
        }

        /* renamed from: n */
        public int mo4752n() {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: o */
        public void mo4755o(View view) {
            this.f3292a.mo4967d(view);
        }

        /* renamed from: p */
        public int mo4756p() {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: q */
        public int mo4757q() {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: r */
        public int mo4758r() {
            return this.f3308q;
        }

        /* renamed from: s */
        public int mo4759s() {
            return this.f3306o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public boolean mo4760t() {
            int e = mo4732e();
            for (int i = 0; i < e; i++) {
                LayoutParams layoutParams = mo4729d(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: u */
        public boolean mo4761u() {
            RecyclerView recyclerView = this.f3293b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        /* renamed from: v */
        public boolean mo4762v() {
            return this.f3300i;
        }

        /* renamed from: w */
        public boolean mo4347w() {
            return this.f3301j;
        }

        /* renamed from: x */
        public final boolean mo4763x() {
            return this.f3303l;
        }

        /* renamed from: y */
        public boolean mo4764y() {
            C0825z zVar = this.f3298g;
            return zVar != null && zVar.mo4848e();
        }

        /* renamed from: z */
        public Parcelable mo3930z() {
            return null;
        }

        /* renamed from: e */
        public int mo4732e() {
            C0842d dVar = this.f3292a;
            if (dVar != null) {
                return dVar.mo4954a();
            }
            return 0;
        }

        /* renamed from: i */
        public int mo3902i(View view) {
            return view.getRight() + mo4751m(view);
        }

        /* renamed from: k */
        public int mo4747k(View view) {
            return ((C0813p) view.getLayoutParams()).f3317b.left;
        }

        /* renamed from: l */
        public int mo4748l() {
            return C4187x.m14400o(this.f3293b);
        }

        /* renamed from: m */
        public int mo4750m() {
            return C4187x.m14401p(this.f3293b);
        }

        /* renamed from: n */
        public int mo4753n(View view) {
            return ((C0813p) view.getLayoutParams()).f3317b.top;
        }

        /* renamed from: o */
        public int mo4754o() {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e */
        public void mo4733e(int i) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                recyclerView.mo4436f(i);
            }
        }

        /* renamed from: h */
        public int mo4741h() {
            return this.f3309r;
        }

        /* renamed from: j */
        public int mo3905j(View view) {
            return view.getTop() - mo4753n(view);
        }

        /* renamed from: c */
        public View mo4337c(int i) {
            int e = mo4732e();
            for (int i2 = 0; i2 < e; i2++) {
                View d = mo4729d(i2);
                C0794d0 m = RecyclerView.m4118m(d);
                if (m != null && m.getLayoutPosition() == i && !m.shouldIgnore() && (this.f3293b.f3210a1.mo4536g() || !m.isRemoved())) {
                    return d;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int mo4738g(View view) {
            Rect rect = ((C0813p) view.getLayoutParams()).f3317b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: h */
        public int mo4742h(View view) {
            Rect rect = ((C0813p) view.getLayoutParams()).f3317b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: e */
        public int mo3893e(View view) {
            return view.getBottom() + mo4728d(view);
        }

        /* renamed from: a */
        public static int m4303a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                size = Math.max(i2, i3);
            }
            return size;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4734e(RecyclerView recyclerView) {
            mo4715b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: b */
        public void mo4333b(RecyclerView recyclerView, C0820v vVar) {
            mo4726c(recyclerView);
        }

        /* renamed from: c */
        public void mo4724c(View view, int i) {
            mo4694a(view, i, (C0813p) view.getLayoutParams());
        }

        /* renamed from: a */
        public void mo4331a(String str) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                recyclerView.mo4386a(str);
            }
        }

        /* renamed from: b */
        public void mo3877b(C0825z zVar) {
            C0825z zVar2 = this.f3298g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo4848e())) {
                this.f3298g.mo4850h();
            }
            this.f3298g = zVar;
            this.f3298g.mo4841a(this.f3293b, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4725c(C0820v vVar) {
            int e = vVar.mo4823e();
            for (int i = e - 1; i >= 0; i--) {
                View c = vVar.mo4815c(i);
                C0794d0 m = RecyclerView.m4118m(c);
                if (!m.shouldIgnore()) {
                    m.setIsRecyclable(false);
                    if (m.isTmpDetached()) {
                        this.f3293b.removeDetachedView(c, false);
                    }
                    C0802l lVar = this.f3293b.f3188I0;
                    if (lVar != null) {
                        lVar.mo4666c(m);
                    }
                    m.setIsRecyclable(true);
                    vVar.mo4803a(c);
                }
            }
            vVar.mo4816c();
            if (e > 0) {
                this.f3293b.invalidate();
            }
        }

        /* renamed from: f */
        public boolean mo4737f() {
            RecyclerView recyclerView = this.f3293b;
            return recyclerView != null && recyclerView.f3214c0;
        }

        /* renamed from: a */
        public final void mo4705a(boolean z) {
            if (z != this.f3303l) {
                this.f3303l = z;
                this.f3304m = 0;
                RecyclerView recyclerView = this.f3293b;
                if (recyclerView != null) {
                    recyclerView.f3200U.mo4830j();
                }
            }
        }

        /* renamed from: d */
        public View mo4729d(int i) {
            C0842d dVar = this.f3292a;
            if (dVar != null) {
                return dVar.mo4963c(i);
            }
            return null;
        }

        /* renamed from: f */
        public void mo4735f(int i) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                recyclerView.mo4441g(i);
            }
        }

        /* renamed from: d */
        public int mo4728d(View view) {
            return ((C0813p) view.getLayoutParams()).f3317b.bottom;
        }

        /* renamed from: d */
        private boolean mo3888d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o = mo4754o();
            int q = mo4757q();
            int r = mo4758r() - mo4756p();
            int h = mo4741h() - mo4752n();
            Rect rect = this.f3293b.f3218e0;
            mo3875b(focusedChild, rect);
            if (rect.left - i >= r || rect.right - i <= o || rect.top - i2 >= h || rect.bottom - i2 <= q) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public int mo3898f(View view) {
            return view.getLeft() - mo4747k(view);
        }

        /* renamed from: b */
        public void mo4716b(View view) {
            mo4717b(view, -1);
        }

        /* renamed from: b */
        public void mo4717b(View view, int i) {
            m4307a(view, i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4702a(RecyclerView recyclerView) {
            this.f3300i = true;
            mo4719b(recyclerView);
        }

        /* renamed from: b */
        public void mo4714b(int i) {
            m4306a(i, mo4729d(i));
        }

        /* renamed from: b */
        public void mo4718b(View view, C0820v vVar) {
            mo4755o(view);
            vVar.mo4813b(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4703a(RecyclerView recyclerView, C0820v vVar) {
            this.f3300i = false;
            mo4333b(recyclerView, vVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4720b(View view, int i, int i2, C0813p pVar) {
            return !this.f3302k || !mo3873b(view.getMeasuredWidth(), i, pVar.width) || !mo3873b(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: a */
        public boolean mo4713a(Runnable runnable) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        private static boolean mo3873b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i) {
                    z = true;
                }
                return z;
            }
        }

        /* renamed from: a */
        public C0813p mo3838a(LayoutParams layoutParams) {
            if (layoutParams instanceof C0813p) {
                return new C0813p((C0813p) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new C0813p((MarginLayoutParams) layoutParams);
            }
            return new C0813p(layoutParams);
        }

        /* renamed from: c */
        public void mo4723c(int i, int i2) {
            this.f3293b.setMeasuredDimension(i, i2);
        }

        /* renamed from: b */
        public void mo3875b(View view, Rect rect) {
            RecyclerView.m4101a(view, rect);
        }

        /* renamed from: b */
        private int[] m4310b(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int o = mo4754o();
            int q = mo4757q();
            int r = mo4758r() - mo4756p();
            int h = mo4741h() - mo4752n();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - o;
            int min = Math.min(0, i);
            int i2 = top - q;
            int min2 = Math.min(0, i2);
            int i3 = width - r;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - h);
            if (mo4746k() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: a */
        public C0813p mo3837a(Context context, AttributeSet attributeSet) {
            return new C0813p(context, attributeSet);
        }

        /* renamed from: a */
        public void mo3858a(RecyclerView recyclerView, C0788a0 a0Var, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: a */
        public void mo4690a(View view) {
            mo4691a(view, -1);
        }

        /* renamed from: a */
        public void mo4691a(View view, int i) {
            m4307a(view, i, true);
        }

        /* renamed from: a */
        private void m4307a(View view, int i, boolean z) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (z || m.isRemoved()) {
                this.f3293b.f3211b0.mo5161a(m);
            } else {
                this.f3293b.f3211b0.mo5172g(m);
            }
            C0813p pVar = (C0813p) view.getLayoutParams();
            if (m.wasReturnedFromScrap() || m.isScrap()) {
                if (m.isScrap()) {
                    m.unScrap();
                } else {
                    m.clearReturnedFromScrapFlag();
                }
                this.f3292a.mo4957a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3293b) {
                int b = this.f3292a.mo4961b(view);
                if (i == -1) {
                    i = this.f3292a.mo4954a();
                }
                if (b == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f3293b.indexOfChild(view));
                    sb.append(this.f3293b.mo4466i());
                    throw new IllegalStateException(sb.toString());
                } else if (b != i) {
                    this.f3293b.f3226i0.mo4688a(b, i);
                }
            } else {
                this.f3292a.mo4958a(view, i, false);
                pVar.f3318c = true;
                C0825z zVar = this.f3298g;
                if (zVar != null && zVar.mo4848e()) {
                    this.f3298g.mo4844b(view);
                }
            }
            if (pVar.f3319d) {
                m.itemView.invalidate();
                pVar.f3319d = false;
            }
        }

        /* renamed from: b */
        public void mo3876b(C0820v vVar) {
            for (int e = mo4732e() - 1; e >= 0; e--) {
                if (!RecyclerView.m4118m(mo4729d(e)).shouldIgnore()) {
                    mo4689a(e, vVar);
                }
            }
        }

        /* renamed from: b */
        public int mo3871b(C0820v vVar, C0788a0 a0Var) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView == null || recyclerView.f3224h0 == null || !mo3882b()) {
                return 1;
            }
            return this.f3293b.f3224h0.getItemCount();
        }

        /* renamed from: a */
        private void m4306a(int i, View view) {
            this.f3292a.mo4955a(i);
        }

        /* renamed from: a */
        public void mo4694a(View view, int i, C0813p pVar) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (m.isRemoved()) {
                this.f3293b.f3211b0.mo5161a(m);
            } else {
                this.f3293b.f3211b0.mo5172g(m);
            }
            this.f3292a.mo4957a(view, i, pVar, m.isRemoved());
        }

        /* renamed from: a */
        public void mo4688a(int i, int i2) {
            View d = mo4729d(i);
            if (d != null) {
                mo4714b(i);
                mo4724c(d, i2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f3293b.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public void mo4696a(View view, C0820v vVar) {
            m4308a(vVar, this.f3292a.mo4961b(view), view);
        }

        /* renamed from: a */
        public void mo4689a(int i, C0820v vVar) {
            View d = mo4729d(i);
            mo4743h(i);
            vVar.mo4813b(d);
        }

        /* renamed from: a */
        public void mo4699a(C0820v vVar) {
            for (int e = mo4732e() - 1; e >= 0; e--) {
                m4308a(vVar, e, mo4729d(e));
            }
        }

        /* renamed from: a */
        private void m4308a(C0820v vVar, int i, View view) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (!m.shouldIgnore()) {
                if (!m.isInvalid() || m.isRemoved() || this.f3293b.f3224h0.hasStableIds()) {
                    mo4714b(i);
                    vVar.mo4818c(view);
                    this.f3293b.f3211b0.mo5169d(m);
                } else {
                    mo4743h(i);
                    vVar.mo4814b(m);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4707a(View view, int i, int i2, C0813p pVar) {
            return view.isLayoutRequested() || !this.f3302k || !mo3873b(view.getWidth(), i, pVar.width) || !mo3873b(view.getHeight(), i2, pVar.height);
        }

        /* renamed from: a */
        public void mo4692a(View view, int i, int i2) {
            C0813p pVar = (C0813p) view.getLayoutParams();
            Rect h = this.f3293b.mo4461h(view);
            int i3 = i2 + h.top + h.bottom;
            int a = m4304a(mo4758r(), mo4759s(), mo4754o() + mo4756p() + pVar.leftMargin + pVar.rightMargin + i + h.left + h.right, pVar.width, mo3862a());
            int a2 = m4304a(mo4741h(), mo4744i(), mo4757q() + mo4752n() + pVar.topMargin + pVar.bottomMargin + i3, pVar.height, mo3882b());
            if (mo4707a(view, a, a2, pVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public static int m4304a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                        return MeasureSpec.makeMeasureSpec(max, i7);
                    }
                    max = 0;
                    return MeasureSpec.makeMeasureSpec(max, i7);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i7 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i7 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return MeasureSpec.makeMeasureSpec(max, i7);
            }
            max = i4;
            i7 = 1073741824;
            return MeasureSpec.makeMeasureSpec(max, i7);
        }

        /* renamed from: a */
        public void mo4693a(View view, int i, int i2, int i3, int i4) {
            C0813p pVar = (C0813p) view.getLayoutParams();
            Rect rect = pVar.f3317b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* renamed from: a */
        public void mo4698a(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((C0813p) view.getLayoutParams()).f3317b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3293b != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f3293b.f3222g0;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo4695a(View view, Rect rect) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo4461h(view));
            }
        }

        /* renamed from: a */
        public boolean mo3866a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo4711a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo4711a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] b = m4310b(recyclerView, view, rect, z);
            int i = b[0];
            int i2 = b[1];
            if ((z2 && !mo3888d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4467i(i, i2);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo4709a(View view, boolean z, boolean z2) {
            boolean z3 = this.f3296e.mo5152a(view, 24579) && this.f3297f.mo5152a(view, 24579);
            return z ? z3 : !z3;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo3867a(RecyclerView recyclerView, View view, View view2) {
            return mo4764y() || recyclerView.mo4478o();
        }

        /* renamed from: a */
        public boolean mo4712a(RecyclerView recyclerView, C0788a0 a0Var, View view, View view2) {
            return mo3867a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public void mo4302a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo3885c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo3853a(C0820v vVar, C0788a0 a0Var, int i, int i2) {
            this.f3293b.mo4410c(i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4701a(C0825z zVar) {
            if (this.f3298g == zVar) {
                this.f3298g = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4704a(C4154d dVar) {
            RecyclerView recyclerView = this.f3293b;
            mo3855a(recyclerView.f3200U, recyclerView.f3210a1, dVar);
        }

        /* renamed from: a */
        public void mo3855a(C0820v vVar, C0788a0 a0Var, C4154d dVar) {
            if (this.f3293b.canScrollVertically(-1) || this.f3293b.canScrollHorizontally(-1)) {
                dVar.mo14734a((int) ContentServiceClientExtras.URL_SIZE_LIMIT);
                dVar.mo14774j(true);
            }
            if (this.f3293b.canScrollVertically(1) || this.f3293b.canScrollHorizontally(1)) {
                dVar.mo14734a(4096);
                dVar.mo14774j(true);
            }
            dVar.mo14741a((Object) C4156b.m14286a(mo3871b(vVar, a0Var), mo3835a(vVar, a0Var), mo4731d(vVar, a0Var), mo4721c(vVar, a0Var)));
        }

        /* renamed from: a */
        public void mo4330a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3293b;
            mo4700a(recyclerView.f3200U, recyclerView.f3210a1, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo4700a(C0820v vVar, C0788a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3293b.canScrollVertically(-1) && !this.f3293b.canScrollHorizontally(-1) && !this.f3293b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0797g gVar = this.f3293b.f3224h0;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.getItemCount());
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4697a(View view, C4154d dVar) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (m != null && !m.isRemoved() && !this.f3292a.mo4965c(m.itemView)) {
                RecyclerView recyclerView = this.f3293b;
                mo3854a(recyclerView.f3200U, recyclerView.f3210a1, view, dVar);
            }
        }

        /* renamed from: a */
        public void mo3854a(C0820v vVar, C0788a0 a0Var, View view, C4154d dVar) {
            dVar.mo14748b((Object) C4157c.m14287a(mo3882b() ? mo4749l(view) : 0, 1, mo3862a() ? mo4749l(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public int mo3835a(C0820v vVar, C0788a0 a0Var) {
            RecyclerView recyclerView = this.f3293b;
            if (recyclerView == null || recyclerView.f3224h0 == null || !mo3862a()) {
                return 1;
            }
            return this.f3293b.f3224h0.getItemCount();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4706a(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3293b;
            return mo3864a(recyclerView.f3200U, recyclerView.f3210a1, i, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3864a(androidx.recyclerview.widget.RecyclerView.C0820v r2, androidx.recyclerview.widget.RecyclerView.C0788a0 r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f3293b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.mo4741h()
                int r5 = r1.mo4757q()
                int r2 = r2 - r5
                int r5 = r1.mo4752n()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f3293b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.mo4758r()
                int r5 = r1.mo4754o()
                int r4 = r4 - r5
                int r5 = r1.mo4756p()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.mo4741h()
                int r4 = r1.mo4757q()
                int r2 = r2 - r4
                int r4 = r1.mo4752n()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f3293b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.mo4758r()
                int r5 = r1.mo4754o()
                int r4 = r4 - r5
                int r5 = r1.mo4756p()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f3293b
                r3.mo4467i(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0808o.mo3864a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4708a(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3293b;
            return mo4710a(recyclerView.f3200U, recyclerView.f3210a1, view, i, bundle);
        }

        /* renamed from: a */
        public static C0812d m4305a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0812d dVar = new C0812d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4260c.RecyclerView, i, i2);
            dVar.f3312a = obtainStyledAttributes.getInt(C4260c.RecyclerView_android_orientation, 1);
            dVar.f3313b = obtainStyledAttributes.getInt(C4260c.RecyclerView_spanCount, 1);
            dVar.f3314c = obtainStyledAttributes.getBoolean(C4260c.RecyclerView_reverseLayout, false);
            dVar.f3315d = obtainStyledAttributes.getBoolean(C4260c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0813p extends MarginLayoutParams {

        /* renamed from: a */
        C0794d0 f3316a;

        /* renamed from: b */
        final Rect f3317b = new Rect();

        /* renamed from: c */
        boolean f3318c = true;

        /* renamed from: d */
        boolean f3319d = false;

        public C0813p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo4771a() {
            return this.f3316a.getAdapterPosition();
        }

        /* renamed from: b */
        public int mo4772b() {
            return this.f3316a.getLayoutPosition();
        }

        /* renamed from: c */
        public boolean mo4773c() {
            return this.f3316a.isUpdated();
        }

        /* renamed from: d */
        public boolean mo4774d() {
            return this.f3316a.isRemoved();
        }

        /* renamed from: e */
        public boolean mo4775e() {
            return this.f3316a.isInvalid();
        }

        /* renamed from: f */
        public boolean mo4776f() {
            return this.f3316a.needsUpdate();
        }

        public C0813p(int i, int i2) {
            super(i, i2);
        }

        public C0813p(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0813p(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0813p(C0813p pVar) {
            super(pVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0814q {
        /* renamed from: a */
        void mo4777a(View view);

        /* renamed from: b */
        void mo4778b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0815r {
        /* renamed from: a */
        public abstract boolean mo4779a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0816s {
        /* renamed from: a */
        void mo4780a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: a */
        void mo4781a(boolean z);

        /* renamed from: b */
        boolean mo4782b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0817t {
        /* renamed from: a */
        public void mo4783a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo4784a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0818u {

        /* renamed from: a */
        SparseArray<C0819a> f3320a = new SparseArray<>();

        /* renamed from: b */
        private int f3321b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C0819a {

            /* renamed from: a */
            final ArrayList<C0794d0> f3322a = new ArrayList<>();

            /* renamed from: b */
            int f3323b = 5;

            /* renamed from: c */
            long f3324c = 0;

            /* renamed from: d */
            long f3325d = 0;

            C0819a() {
            }
        }

        /* renamed from: a */
        public C0794d0 mo4786a(int i) {
            C0819a aVar = (C0819a) this.f3320a.get(i);
            if (aVar == null || aVar.f3322a.isEmpty()) {
                return null;
            }
            ArrayList<C0794d0> arrayList = aVar.f3322a;
            return (C0794d0) arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: b */
        public void mo4792b() {
            for (int i = 0; i < this.f3320a.size(); i++) {
                ((C0819a) this.f3320a.valueAt(i)).f3322a.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4795c() {
            this.f3321b--;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4793b(int i, long j) {
            C0819a b = m4472b(i);
            b.f3324c = mo4785a(b.f3324c, j);
        }

        /* renamed from: a */
        public void mo4789a(C0794d0 d0Var) {
            int itemViewType = d0Var.getItemViewType();
            ArrayList<C0794d0> arrayList = m4472b(itemViewType).f3322a;
            if (((C0819a) this.f3320a.get(itemViewType)).f3323b > arrayList.size()) {
                d0Var.resetInternal();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4794b(int i, long j, long j2) {
            long j3 = m4472b(i).f3324c;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: b */
        private C0819a m4472b(int i) {
            C0819a aVar = (C0819a) this.f3320a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0819a aVar2 = new C0819a();
            this.f3320a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo4785a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4788a(int i, long j) {
            C0819a b = m4472b(i);
            b.f3325d = mo4785a(b.f3325d, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4791a(int i, long j, long j2) {
            long j3 = m4472b(i).f3325d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4787a() {
            this.f3321b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4790a(C0797g gVar, C0797g gVar2, boolean z) {
            if (gVar != null) {
                mo4795c();
            }
            if (!z && this.f3321b == 0) {
                mo4792b();
            }
            if (gVar2 != null) {
                mo4787a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0820v {

        /* renamed from: a */
        final ArrayList<C0794d0> f3326a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0794d0> f3327b = null;

        /* renamed from: c */
        final ArrayList<C0794d0> f3328c = new ArrayList<>();

        /* renamed from: d */
        private final List<C0794d0> f3329d = Collections.unmodifiableList(this.f3326a);

        /* renamed from: e */
        private int f3330e = 2;

        /* renamed from: f */
        int f3331f = 2;

        /* renamed from: g */
        C0818u f3332g;

        /* renamed from: h */
        private C0790b0 f3333h;

        public C0820v() {
        }

        /* renamed from: e */
        private void m4486e(C0794d0 d0Var) {
            if (RecyclerView.this.mo4477n()) {
                View view = d0Var.itemView;
                if (C4187x.m14397l(view) == 0) {
                    C4187x.m14390g(view, 1);
                }
                if (!C4187x.m14410y(view)) {
                    d0Var.addFlags(DateUtils.FORMAT_ABBREV_TIME);
                    C4187x.m14359a(view, RecyclerView.this.f3225h1.mo5129b());
                }
            }
        }

        /* renamed from: a */
        public void mo4800a() {
            this.f3326a.clear();
            mo4829i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public View mo4809b(int i, boolean z) {
            return mo4798a(i, z, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4818c(View view) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (!m.hasAnyOfTheFlags(12) && m.isUpdated() && !RecyclerView.this.mo4392a(m)) {
                if (this.f3327b == null) {
                    this.f3327b = new ArrayList<>();
                }
                m.setScrapContainer(this, true);
                this.f3327b.add(m);
            } else if (!m.isInvalid() || m.isRemoved() || RecyclerView.this.f3224h0.hasStableIds()) {
                m.setScrapContainer(this, false);
                this.f3326a.add(m);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.mo4466i());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo4822d(C0794d0 d0Var) {
            if (d0Var.isRemoved()) {
                return RecyclerView.this.f3210a1.mo4536g();
            }
            int i = d0Var.mPosition;
            if (i < 0 || i >= RecyclerView.this.f3224h0.getItemCount()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(d0Var);
                sb.append(RecyclerView.this.mo4466i());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z = false;
            if (!RecyclerView.this.f3210a1.mo4536g() && RecyclerView.this.f3224h0.getItemViewType(d0Var.mPosition) != d0Var.getItemViewType()) {
                return false;
            }
            if (!RecyclerView.this.f3224h0.hasStableIds()) {
                return true;
            }
            if (d0Var.getItemId() == RecyclerView.this.f3224h0.getItemId(d0Var.mPosition)) {
                z = true;
            }
            return z;
        }

        /* renamed from: f */
        public void mo4826f(int i) {
            this.f3330e = i;
            mo4830j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo4827g() {
            int size = this.f3328c.size();
            for (int i = 0; i < size; i++) {
                C0813p pVar = (C0813p) ((C0794d0) this.f3328c.get(i)).itemView.getLayoutParams();
                if (pVar != null) {
                    pVar.f3318c = true;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo4828h() {
            int size = this.f3328c.size();
            for (int i = 0; i < size; i++) {
                C0794d0 d0Var = (C0794d0) this.f3328c.get(i);
                if (d0Var != null) {
                    d0Var.addFlags(6);
                    d0Var.addChangePayload(null);
                }
            }
            C0797g gVar = RecyclerView.this.f3224h0;
            if (gVar == null || !gVar.hasStableIds()) {
                mo4829i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo4829i() {
            for (int size = this.f3328c.size() - 1; size >= 0; size--) {
                mo4824e(size);
            }
            this.f3328c.clear();
            if (RecyclerView.f3177x1) {
                RecyclerView.this.f3208Z0.mo5033a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo4830j() {
            C0808o oVar = RecyclerView.this.f3226i0;
            this.f3331f = this.f3330e + (oVar != null ? oVar.f3304m : 0);
            for (int size = this.f3328c.size() - 1; size >= 0 && this.f3328c.size() > this.f3331f; size--) {
                mo4824e(size);
            }
        }

        /* renamed from: b */
        public void mo4813b(View view) {
            C0794d0 m = RecyclerView.m4118m(view);
            if (m.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m.isScrap()) {
                m.unScrap();
            } else if (m.wasReturnedFromScrap()) {
                m.clearReturnedFromScrapFlag();
            }
            mo4814b(m);
        }

        /* renamed from: a */
        private boolean m4485a(C0794d0 d0Var, int i, int i2, long j) {
            d0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = d0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3332g.mo4791a(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f3224h0.bindViewHolder(d0Var, i);
            this.f3332g.mo4788a(d0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m4486e(d0Var);
            if (RecyclerView.this.f3210a1.mo4536g()) {
                d0Var.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* renamed from: f */
        public List<C0794d0> mo4825f() {
            return this.f3329d;
        }

        /* renamed from: f */
        private void m4487f(C0794d0 d0Var) {
            View view = d0Var.itemView;
            if (view instanceof ViewGroup) {
                m4484a((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4814b(C0794d0 d0Var) {
            boolean z;
            boolean z2 = false;
            if (d0Var.isScrap() || d0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.isScrap());
                sb.append(" isAttached:");
                if (d0Var.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo4466i());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(d0Var);
                sb2.append(RecyclerView.this.mo4466i());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!d0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = d0Var.doesTransientStatePreventRecycling();
                C0797g gVar = RecyclerView.this.f3224h0;
                if ((gVar != null && doesTransientStatePreventRecycling && gVar.onFailedToRecycleView(d0Var)) || d0Var.isRecyclable()) {
                    if (this.f3331f <= 0 || d0Var.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f3328c.size();
                        if (size >= this.f3331f && size > 0) {
                            mo4824e(0);
                            size--;
                        }
                        if (RecyclerView.f3177x1 && size > 0 && !RecyclerView.this.f3208Z0.mo5035a(d0Var.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f3208Z0.mo5035a(((C0794d0) this.f3328c.get(i)).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3328c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo4806a(d0Var, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.f3211b0.mo5173h(d0Var);
                if (!z && !z2 && doesTransientStatePreventRecycling) {
                    d0Var.mOwnerRecyclerView = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.mo4466i());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4824e(int i) {
            mo4806a((C0794d0) this.f3328c.get(i), true);
            this.f3328c.remove(i);
        }

        /* renamed from: d */
        public View mo4820d(int i) {
            return mo4809b(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C0818u mo4821d() {
            if (this.f3332g == null) {
                this.f3332g = new C0818u();
            }
            return this.f3332g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4819c(C0794d0 d0Var) {
            if (d0Var.mInChangeScrap) {
                this.f3327b.remove(d0Var);
            } else {
                this.f3326a.remove(d0Var);
            }
            d0Var.mScrapContainer = null;
            d0Var.mInChangeScrap = false;
            d0Var.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo4823e() {
            return this.f3326a.size();
        }

        /* renamed from: a */
        public int mo4796a(int i) {
            if (i < 0 || i >= RecyclerView.this.f3210a1.mo4531b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State ");
                sb.append("item count is ");
                sb.append(RecyclerView.this.f3210a1.mo4531b());
                sb.append(RecyclerView.this.mo4466i());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.f3210a1.mo4536g()) {
                return i;
            } else {
                return RecyclerView.this.f3204W.mo4936b(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0202  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0210  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0794d0 mo4798a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0233
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3210a1
                int r1 = r1.mo4531b()
                if (r3 >= r1) goto L_0x0233
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3210a1
                boolean r1 = r1.mo4536g()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo4810b(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo4797a(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo4822d(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.mo4814b(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0185
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f3204W
                int r5 = r5.mo4936b(r3)
                if (r5 < 0) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f3224h0
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f3224h0
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.f3224h0
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.f3224h0
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo4799a(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r6.f3333h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo4540a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r1.mo4439g(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.shouldIgnore()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4466i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4466i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0101
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo4821d()
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r0.mo4786a(r9)
                if (r1 == 0) goto L_0x0101
                r1.resetInternal()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.f3174u1
                if (r0 == 0) goto L_0x0101
                r6.m4487f(r1)
            L_0x0101:
                if (r1 != 0) goto L_0x0185
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x011f
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f3332g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4794b(r11, r12, r14)
                if (r5 != 0) goto L_0x011f
                return r2
            L_0x011f:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.f3224h0
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f3177x1
                if (r5 == 0) goto L_0x013a
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m4117l(r5)
                if (r5 == 0) goto L_0x013a
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x013a:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f3332g
                long r10 = r10 - r0
                r5.mo4793b(r9, r10)
                r10 = r2
                goto L_0x0186
            L_0x0148:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f3210a1
                int r2 = r2.mo4531b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4466i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0185:
                r10 = r1
            L_0x0186:
                r9 = r4
                if (r9 == 0) goto L_0x01bf
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3210a1
                boolean r0 = r0.mo4536g()
                if (r0 != 0) goto L_0x01bf
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01bf
                r10.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3210a1
                boolean r0 = r0.f3265k
                if (r0 == 0) goto L_0x01bf
                int r0 = androidx.recyclerview.widget.RecyclerView.C0802l.m4273e(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.f3188I0
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f3210a1
                java.util.List r4 = r10.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.mo4652a(r1, r10, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo4378a(r10, r0)
            L_0x01bf:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f3210a1
                boolean r0 = r0.mo4536g()
                if (r0 == 0) goto L_0x01d2
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01d2
                r10.mPreLayoutPosition = r3
                goto L_0x01e5
            L_0x01d2:
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01e7
                boolean r0 = r10.needsUpdate()
                if (r0 != 0) goto L_0x01e7
                boolean r0 = r10.isInvalid()
                if (r0 == 0) goto L_0x01e5
                goto L_0x01e7
            L_0x01e5:
                r0 = 0
                goto L_0x01fa
            L_0x01e7:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f3204W
                int r2 = r0.mo4936b(r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m4485a(r1, r2, r3, r4)
            L_0x01fa:
                android.view.View r1 = r10.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0210
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0813p) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x0228
            L_0x0210:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0226
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0813p) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x0228
            L_0x0226:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0813p) r1
            L_0x0228:
                r1.f3316a = r10
                if (r9 == 0) goto L_0x022f
                if (r0 == 0) goto L_0x022f
                goto L_0x0230
            L_0x022f:
                r7 = 0
            L_0x0230:
                r1.f3319d = r7
                return r10
            L_0x0233:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f3210a1
                int r2 = r2.mo4531b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4466i()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0820v.mo4798a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public View mo4815c(int i) {
            return ((C0794d0) this.f3326a.get(i)).itemView;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4816c() {
            this.f3326a.clear();
            ArrayList<C0794d0> arrayList = this.f3327b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4817c(int i, int i2) {
            int i3 = i2 + i;
            for (int size = this.f3328c.size() - 1; size >= 0; size--) {
                C0794d0 d0Var = (C0794d0) this.f3328c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.mPosition;
                    if (i4 >= i && i4 < i3) {
                        d0Var.addFlags(2);
                        mo4824e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0794d0 mo4810b(int i) {
            ArrayList<C0794d0> arrayList = this.f3327b;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C0794d0 d0Var = (C0794d0) this.f3327b.get(i3);
                        if (d0Var.wasReturnedFromScrap() || d0Var.getLayoutPosition() != i) {
                            i3++;
                        } else {
                            d0Var.addFlags(32);
                            return d0Var;
                        }
                    }
                    if (RecyclerView.this.f3224h0.hasStableIds()) {
                        int b = RecyclerView.this.f3204W.mo4936b(i);
                        if (b > 0 && b < RecyclerView.this.f3224h0.getItemCount()) {
                            long itemId = RecyclerView.this.f3224h0.getItemId(b);
                            while (i2 < size) {
                                C0794d0 d0Var2 = (C0794d0) this.f3327b.get(i2);
                                if (d0Var2.wasReturnedFromScrap() || d0Var2.getItemId() != itemId) {
                                    i2++;
                                } else {
                                    d0Var2.addFlags(32);
                                    return d0Var2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4812b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f3328c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0794d0 d0Var = (C0794d0) this.f3328c.get(i6);
                if (d0Var != null) {
                    int i7 = d0Var.mPosition;
                    if (i7 >= i5 && i7 <= i4) {
                        if (i7 == i) {
                            d0Var.offsetPosition(i2 - i, false);
                        } else {
                            d0Var.offsetPosition(i3, false);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4811b() {
            int size = this.f3328c.size();
            for (int i = 0; i < size; i++) {
                ((C0794d0) this.f3328c.get(i)).clearOldPosition();
            }
            int size2 = this.f3326a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C0794d0) this.f3326a.get(i2)).clearOldPosition();
            }
            ArrayList<C0794d0> arrayList = this.f3327b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C0794d0) this.f3327b.get(i3)).clearOldPosition();
                }
            }
        }

        /* renamed from: a */
        private void m4484a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4484a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4806a(C0794d0 d0Var, boolean z) {
            RecyclerView.m4115e(d0Var);
            if (d0Var.hasAnyOfTheFlags(DateUtils.FORMAT_ABBREV_TIME)) {
                d0Var.setFlags(0, DateUtils.FORMAT_ABBREV_TIME);
                C4187x.m14359a(d0Var.itemView, (C4119a) null);
            }
            if (z) {
                mo4805a(d0Var);
            }
            d0Var.mOwnerRecyclerView = null;
            mo4821d().mo4789a(d0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4803a(View view) {
            C0794d0 m = RecyclerView.m4118m(view);
            m.mScrapContainer = null;
            m.mInChangeScrap = false;
            m.clearReturnedFromScrapFlag();
            mo4814b(m);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0794d0 mo4797a(int i, boolean z) {
            int size = this.f3326a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0794d0 d0Var = (C0794d0) this.f3326a.get(i3);
                if (d0Var.wasReturnedFromScrap() || d0Var.getLayoutPosition() != i || d0Var.isInvalid() || (!RecyclerView.this.f3210a1.f3262h && d0Var.isRemoved())) {
                    i3++;
                } else {
                    d0Var.addFlags(32);
                    return d0Var;
                }
            }
            if (!z) {
                View b = RecyclerView.this.f3209a0.mo4962b(i);
                if (b != null) {
                    C0794d0 m = RecyclerView.m4118m(b);
                    RecyclerView.this.f3209a0.mo4970f(b);
                    int b2 = RecyclerView.this.f3209a0.mo4961b(b);
                    if (b2 != -1) {
                        RecyclerView.this.f3209a0.mo4955a(b2);
                        mo4818c(b);
                        m.addFlags(8224);
                        return m;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("layout index should not be -1 after unhiding a view:");
                    sb.append(m);
                    sb.append(RecyclerView.this.mo4466i());
                    throw new IllegalStateException(sb.toString());
                }
            }
            int size2 = this.f3328c.size();
            while (i2 < size2) {
                C0794d0 d0Var2 = (C0794d0) this.f3328c.get(i2);
                if (d0Var2.isInvalid() || d0Var2.getLayoutPosition() != i) {
                    i2++;
                } else {
                    if (!z) {
                        this.f3328c.remove(i2);
                    }
                    return d0Var2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0794d0 mo4799a(long j, int i, boolean z) {
            for (int size = this.f3326a.size() - 1; size >= 0; size--) {
                C0794d0 d0Var = (C0794d0) this.f3326a.get(size);
                if (d0Var.getItemId() == j && !d0Var.wasReturnedFromScrap()) {
                    if (i == d0Var.getItemViewType()) {
                        d0Var.addFlags(32);
                        if (d0Var.isRemoved() && !RecyclerView.this.f3210a1.mo4536g()) {
                            d0Var.setFlags(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f3326a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.itemView, false);
                        mo4803a(d0Var.itemView);
                    }
                }
            }
            int size2 = this.f3328c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0794d0 d0Var2 = (C0794d0) this.f3328c.get(size2);
                if (d0Var2.getItemId() == j) {
                    if (i == d0Var2.getItemViewType()) {
                        if (!z) {
                            this.f3328c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo4824e(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4805a(C0794d0 d0Var) {
            C0821w wVar = RecyclerView.this.f3228j0;
            if (wVar != null) {
                wVar.mo3729a(d0Var);
            }
            C0797g gVar = RecyclerView.this.f3224h0;
            if (gVar != null) {
                gVar.onViewRecycled(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3210a1 != null) {
                recyclerView.f3211b0.mo5173h(d0Var);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4807a(C0797g gVar, C0797g gVar2, boolean z) {
            mo4800a();
            mo4821d().mo4790a(gVar, gVar2, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4801a(int i, int i2) {
            int size = this.f3328c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0794d0 d0Var = (C0794d0) this.f3328c.get(i3);
                if (d0Var != null && d0Var.mPosition >= i) {
                    d0Var.offsetPosition(i2, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4802a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3328c.size() - 1; size >= 0; size--) {
                C0794d0 d0Var = (C0794d0) this.f3328c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.mPosition;
                    if (i4 >= i3) {
                        d0Var.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.addFlags(8);
                        mo4824e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4804a(C0790b0 b0Var) {
            this.f3333h = b0Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4808a(C0818u uVar) {
            C0818u uVar2 = this.f3332g;
            if (uVar2 != null) {
                uVar2.mo4795c();
            }
            this.f3332g = uVar;
            if (this.f3332g != null && RecyclerView.this.getAdapter() != null) {
                this.f3332g.mo4787a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C0821w {
        /* renamed from: a */
        void mo3729a(C0794d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C0822x extends C0799i {
        C0822x() {
        }

        /* renamed from: a */
        public void mo4643a() {
            RecyclerView.this.mo4386a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3210a1.f3261g = true;
            recyclerView.mo4405b(true);
            if (!RecyclerView.this.f3204W.mo4939c()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: b */
        public void mo4647b(int i, int i2) {
            RecyclerView.this.mo4386a((String) null);
            if (RecyclerView.this.f3204W.mo4938b(i, i2)) {
                mo4831b();
            }
        }

        /* renamed from: c */
        public void mo4648c(int i, int i2) {
            RecyclerView.this.mo4386a((String) null);
            if (RecyclerView.this.f3204W.mo4941c(i, i2)) {
                mo4831b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4831b() {
            if (RecyclerView.f3176w1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f3238o0 && recyclerView.f3236n0) {
                    C4187x.m14363a((View) recyclerView, recyclerView.f3216d0);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f3250w0 = true;
            recyclerView2.requestLayout();
        }

        /* renamed from: a */
        public void mo4646a(int i, int i2, Object obj) {
            RecyclerView.this.mo4386a((String) null);
            if (RecyclerView.this.f3204W.mo4935a(i, i2, obj)) {
                mo4831b();
            }
        }

        /* renamed from: a */
        public void mo4645a(int i, int i2, int i3) {
            RecyclerView.this.mo4386a((String) null);
            if (RecyclerView.this.f3204W.mo4934a(i, i2, i3)) {
                mo4831b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0823y extends C4204a {
        public static final Creator<C0823y> CREATOR = new C0824a();

        /* renamed from: V */
        Parcelable f3336V;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C0824a implements ClassLoaderCreator<C0823y> {
            C0824a() {
            }

            public C0823y[] newArray(int i) {
                return new C0823y[i];
            }

            public C0823y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0823y(parcel, classLoader);
            }

            public C0823y createFromParcel(Parcel parcel) {
                return new C0823y(parcel, null);
            }
        }

        C0823y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0808o.class.getClassLoader();
            }
            this.f3336V = parcel.readParcelable(classLoader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4832a(C0823y yVar) {
            this.f3336V = yVar.f3336V;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3336V, 0);
        }

        C0823y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0825z {

        /* renamed from: a */
        private int f3337a = -1;

        /* renamed from: b */
        private RecyclerView f3338b;

        /* renamed from: c */
        private C0808o f3339c;

        /* renamed from: d */
        private boolean f3340d;

        /* renamed from: e */
        private boolean f3341e;

        /* renamed from: f */
        private View f3342f;

        /* renamed from: g */
        private final C0826a f3343g = new C0826a(0, 0);

        /* renamed from: h */
        private boolean f3344h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C0826a {

            /* renamed from: a */
            private int f3345a;

            /* renamed from: b */
            private int f3346b;

            /* renamed from: c */
            private int f3347c;

            /* renamed from: d */
            private int f3348d;

            /* renamed from: e */
            private Interpolator f3349e;

            /* renamed from: f */
            private boolean f3350f;

            /* renamed from: g */
            private int f3351g;

            public C0826a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: b */
            private void m4549b() {
                if (this.f3349e != null && this.f3347c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3347c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void mo4851a(int i) {
                this.f3348d = i;
            }

            public C0826a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3348d = -1;
                this.f3350f = false;
                this.f3351g = 0;
                this.f3345a = i;
                this.f3346b = i2;
                this.f3347c = i3;
                this.f3349e = interpolator;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo4854a() {
                return this.f3348d >= 0;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo4853a(RecyclerView recyclerView) {
                int i = this.f3348d;
                if (i >= 0) {
                    this.f3348d = -1;
                    recyclerView.mo4432e(i);
                    this.f3350f = false;
                    return;
                }
                if (this.f3350f) {
                    m4549b();
                    Interpolator interpolator = this.f3349e;
                    if (interpolator == null) {
                        int i2 = this.f3347c;
                        if (i2 == Integer.MIN_VALUE) {
                            recyclerView.f3206X0.mo4549b(this.f3345a, this.f3346b);
                        } else {
                            recyclerView.f3206X0.mo4544a(this.f3345a, this.f3346b, i2);
                        }
                    } else {
                        recyclerView.f3206X0.mo4546a(this.f3345a, this.f3346b, this.f3347c, interpolator);
                    }
                    this.f3351g++;
                    if (this.f3351g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3350f = false;
                } else {
                    this.f3351g = 0;
                }
            }

            /* renamed from: a */
            public void mo4852a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3345a = i;
                this.f3346b = i2;
                this.f3347c = i3;
                this.f3349e = interpolator;
                this.f3350f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C0827b {
            /* renamed from: a */
            PointF mo4327a(int i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4839a(int i, int i2, C0788a0 a0Var, C0826a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo3934a(View view, C0788a0 a0Var, C0826a aVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4841a(RecyclerView recyclerView, C0808o oVar) {
            if (this.f3344h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started ");
                sb.append("more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" ");
                sb.append("is intended to only be used once. You should create a new instance for ");
                sb.append("each use.");
                Log.w("RecyclerView", sb.toString());
            }
            this.f3338b = recyclerView;
            this.f3339c = oVar;
            int i = this.f3337a;
            if (i != -1) {
                this.f3338b.f3210a1.f3255a = i;
                this.f3341e = true;
                this.f3340d = true;
                this.f3342f = mo4842b(mo4845c());
                mo4849f();
                this.f3338b.f3206X0.mo4542a();
                this.f3344h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: b */
        public C0808o mo4843b() {
            return this.f3339c;
        }

        /* renamed from: c */
        public void mo4846c(int i) {
            this.f3337a = i;
        }

        /* renamed from: d */
        public boolean mo4847d() {
            return this.f3340d;
        }

        /* renamed from: e */
        public boolean mo4848e() {
            return this.f3341e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo4849f();

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract void mo3936g();

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo4850h() {
            if (this.f3341e) {
                this.f3341e = false;
                mo3936g();
                this.f3338b.f3210a1.f3255a = -1;
                this.f3342f = null;
                this.f3337a = -1;
                this.f3340d = false;
                this.f3339c.mo4701a(this);
                this.f3339c = null;
                this.f3338b = null;
            }
        }

        /* renamed from: b */
        public View mo4842b(int i) {
            return this.f3338b.f3226i0.mo4337c(i);
        }

        /* renamed from: c */
        public int mo4845c() {
            return this.f3337a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4844b(View view) {
            if (mo4837a(view) == mo4845c()) {
                this.f3342f = view;
            }
        }

        /* renamed from: a */
        public PointF mo3933a(int i) {
            C0808o b = mo4843b();
            if (b instanceof C0827b) {
                return ((C0827b) b).mo4327a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(C0827b.class.getCanonicalName());
            Log.w("RecyclerView", sb.toString());
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4838a(int i, int i2) {
            RecyclerView recyclerView = this.f3338b;
            if (!this.f3341e || this.f3337a == -1 || recyclerView == null) {
                mo4850h();
            }
            if (this.f3340d && this.f3342f == null && this.f3339c != null) {
                PointF a = mo3933a(this.f3337a);
                if (!(a == null || (a.x == 0.0f && a.y == 0.0f))) {
                    recyclerView.mo4374a((int) Math.signum(a.x), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f3340d = false;
            View view = this.f3342f;
            if (view != null) {
                if (mo4837a(view) == this.f3337a) {
                    mo3934a(this.f3342f, recyclerView.f3210a1, this.f3343g);
                    this.f3343g.mo4853a(recyclerView);
                    mo4850h();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3342f = null;
                }
            }
            if (this.f3341e) {
                mo4839a(i, i2, recyclerView.f3210a1, this.f3343g);
                boolean a2 = this.f3343g.mo4854a();
                this.f3343g.mo4853a(recyclerView);
                if (!a2) {
                    return;
                }
                if (this.f3341e) {
                    this.f3340d = true;
                    recyclerView.f3206X0.mo4542a();
                    return;
                }
                mo4850h();
            }
        }

        /* renamed from: a */
        public int mo4837a(View view) {
            return this.f3338b.mo4434f(view);
        }

        /* renamed from: a */
        public int mo4836a() {
            return this.f3338b.f3226i0.mo4732e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4840a(PointF pointF) {
            float f = pointF.x;
            float f2 = f * f;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) (f2 + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }
    }

    static {
        int i = VERSION.SDK_INT;
        f3174u1 = i == 18 || i == 19 || i == 20;
        Class cls = Integer.TYPE;
        f3170A1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m4081A() {
        int i = this.f3249v0;
        this.f3249v0 = 0;
        if (i != 0 && mo4477n()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(DateUtils.FORMAT_NO_MIDNIGHT);
            C4150b.m14209a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: B */
    private void m4082B() {
        boolean z = true;
        this.f3210a1.mo4528a(1);
        mo4377a(this.f3210a1);
        this.f3210a1.f3264j = false;
        mo4525x();
        this.f3211b0.mo5159a();
        mo4492r();
        m4090J();
        m4095O();
        C0788a0 a0Var = this.f3210a1;
        if (!a0Var.f3265k || !this.f3219e1) {
            z = false;
        }
        a0Var.f3263i = z;
        this.f3219e1 = false;
        this.f3217d1 = false;
        C0788a0 a0Var2 = this.f3210a1;
        a0Var2.f3262h = a0Var2.f3266l;
        a0Var2.f3260f = this.f3224h0.getItemCount();
        m4108a(this.f3229j1);
        if (this.f3210a1.f3265k) {
            int a = this.f3209a0.mo4954a();
            for (int i = 0; i < a; i++) {
                C0794d0 m = m4118m(this.f3209a0.mo4963c(i));
                if (!m.shouldIgnore() && (!m.isInvalid() || this.f3224h0.hasStableIds())) {
                    this.f3211b0.mo5167c(m, this.f3188I0.mo4652a(this.f3210a1, m, C0802l.m4273e(m), m.getUnmodifiedPayloads()));
                    if (this.f3210a1.f3263i && m.isUpdated() && !m.isRemoved() && !m.shouldIgnore() && !m.isInvalid()) {
                        this.f3211b0.mo5160a(mo4406c(m), m);
                    }
                }
            }
        }
        if (this.f3210a1.f3266l) {
            mo4524w();
            C0788a0 a0Var3 = this.f3210a1;
            boolean z2 = a0Var3.f3261g;
            a0Var3.f3261g = false;
            this.f3226i0.mo3895e(this.f3200U, a0Var3);
            this.f3210a1.f3261g = z2;
            for (int i2 = 0; i2 < this.f3209a0.mo4954a(); i2++) {
                C0794d0 m2 = m4118m(this.f3209a0.mo4963c(i2));
                if (!m2.shouldIgnore() && !this.f3211b0.mo5168c(m2)) {
                    int e = C0802l.m4273e(m2);
                    boolean hasAnyOfTheFlags = m2.hasAnyOfTheFlags(ContentServiceClientExtras.URL_SIZE_LIMIT);
                    if (!hasAnyOfTheFlags) {
                        e |= 4096;
                    }
                    C0805c a2 = this.f3188I0.mo4652a(this.f3210a1, m2, e, m2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo4378a(m2, a2);
                    } else {
                        this.f3211b0.mo5162a(m2, a2);
                    }
                }
            }
            mo4369a();
        } else {
            mo4369a();
        }
        mo4498s();
        mo4411c(false);
        this.f3210a1.f3259e = 2;
    }

    /* renamed from: C */
    private void m4083C() {
        mo4525x();
        mo4492r();
        this.f3210a1.mo4528a(6);
        this.f3204W.mo4937b();
        this.f3210a1.f3260f = this.f3224h0.getItemCount();
        C0788a0 a0Var = this.f3210a1;
        a0Var.f3258d = 0;
        a0Var.f3262h = false;
        this.f3226i0.mo3895e(this.f3200U, a0Var);
        C0788a0 a0Var2 = this.f3210a1;
        a0Var2.f3261g = false;
        this.f3202V = null;
        a0Var2.f3265k = a0Var2.f3265k && this.f3188I0 != null;
        this.f3210a1.f3259e = 4;
        mo4498s();
        mo4411c(false);
    }

    /* renamed from: D */
    private void m4084D() {
        this.f3210a1.mo4528a(4);
        mo4525x();
        mo4492r();
        C0788a0 a0Var = this.f3210a1;
        a0Var.f3259e = 1;
        if (a0Var.f3265k) {
            for (int a = this.f3209a0.mo4954a() - 1; a >= 0; a--) {
                C0794d0 m = m4118m(this.f3209a0.mo4963c(a));
                if (!m.shouldIgnore()) {
                    long c = mo4406c(m);
                    C0805c a2 = this.f3188I0.mo4651a(this.f3210a1, m);
                    C0794d0 a3 = this.f3211b0.mo5158a(c);
                    if (a3 == null || a3.shouldIgnore()) {
                        this.f3211b0.mo5165b(m, a2);
                    } else {
                        boolean b = this.f3211b0.mo5166b(a3);
                        boolean b2 = this.f3211b0.mo5166b(m);
                        if (!b || a3 != m) {
                            C0805c f = this.f3211b0.mo5171f(a3);
                            this.f3211b0.mo5165b(m, a2);
                            C0805c e = this.f3211b0.mo5170e(m);
                            if (f == null) {
                                m4099a(c, m, a3);
                            } else {
                                m4103a(a3, m, f, e, b, b2);
                            }
                        } else {
                            this.f3211b0.mo5165b(m, a2);
                        }
                    }
                }
            }
            this.f3211b0.mo5163a(this.f3245r1);
        }
        this.f3226i0.mo4725c(this.f3200U);
        C0788a0 a0Var2 = this.f3210a1;
        a0Var2.f3257c = a0Var2.f3260f;
        this.f3253z0 = false;
        this.f3180A0 = false;
        a0Var2.f3265k = false;
        a0Var2.f3266l = false;
        this.f3226i0.f3299h = false;
        ArrayList<C0794d0> arrayList = this.f3200U.f3327b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0808o oVar = this.f3226i0;
        if (oVar.f3305n) {
            oVar.f3304m = 0;
            oVar.f3305n = false;
            this.f3200U.mo4830j();
        }
        this.f3226i0.mo3901g(this.f3210a1);
        mo4498s();
        mo4411c(false);
        this.f3211b0.mo5159a();
        int[] iArr = this.f3229j1;
        if (mo12695k(iArr[0], iArr[1])) {
            mo4421d(0, 0);
        }
        m4091K();
        m4093M();
    }

    /* renamed from: E */
    private View m4085E() {
        int i = this.f3210a1.f3267m;
        if (i == -1) {
            i = 0;
        }
        int b = this.f3210a1.mo4531b();
        int i2 = i;
        while (i2 < b) {
            C0794d0 c = mo4408c(i2);
            if (c == null) {
                break;
            } else if (c.itemView.hasFocusable()) {
                return c.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C0794d0 c2 = mo4408c(min);
            if (c2 == null) {
                return null;
            }
            if (c2.itemView.hasFocusable()) {
                return c2.itemView;
            }
        }
    }

    /* renamed from: F */
    private boolean m4086F() {
        int a = this.f3209a0.mo4954a();
        for (int i = 0; i < a; i++) {
            C0794d0 m = m4118m(this.f3209a0.mo4963c(i));
            if (m != null && !m.shouldIgnore() && m.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: G */
    private void m4087G() {
        if (C4187x.m14398m(this) == 0) {
            C4187x.m14392h(this, 8);
        }
    }

    /* renamed from: H */
    private void m4088H() {
        this.f3209a0 = new C0842d(new C0795e());
    }

    /* renamed from: I */
    private boolean m4089I() {
        return this.f3188I0 != null && this.f3226i0.mo3811E();
    }

    /* renamed from: J */
    private void m4090J() {
        if (this.f3253z0) {
            this.f3204W.mo4944f();
            if (this.f3180A0) {
                this.f3226i0.mo3890d(this);
            }
        }
        if (m4089I()) {
            this.f3204W.mo4943e();
        } else {
            this.f3204W.mo4937b();
        }
        boolean z = false;
        boolean z2 = this.f3217d1 || this.f3219e1;
        this.f3210a1.f3265k = this.f3242q0 && this.f3188I0 != null && (this.f3253z0 || z2 || this.f3226i0.f3299h) && (!this.f3253z0 || this.f3224h0.hasStableIds());
        C0788a0 a0Var = this.f3210a1;
        if (a0Var.f3265k && z2 && !this.f3253z0 && m4089I()) {
            z = true;
        }
        a0Var.f3266l = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        if (r0.isFocusable() != false) goto L_0x00af;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4091K() {
        /*
            r7 = this;
            boolean r0 = r7.f3205W0
            if (r0 == 0) goto L_0x00b2
            androidx.recyclerview.widget.RecyclerView$g r0 = r7.f3224h0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r7.hasFocus()
            if (r0 == 0) goto L_0x00b2
            int r0 = r7.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x00b2
            int r0 = r7.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x00b2
        L_0x0026:
            boolean r0 = r7.isFocused()
            if (r0 != 0) goto L_0x0055
            android.view.View r0 = r7.getFocusedChild()
            boolean r1 = f3179z1
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            androidx.recyclerview.widget.d r0 = r7.f3209a0
            int r0 = r0.mo4954a()
            if (r0 != 0) goto L_0x0055
            r7.requestFocus()
            return
        L_0x004c:
            androidx.recyclerview.widget.d r1 = r7.f3209a0
            boolean r0 = r1.mo4965c(r0)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r7.f3210a1
            long r0 = r0.f3268n
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$g r0 = r7.f3224h0
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r7.f3210a1
            long r0 = r0.f3268n
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r7.mo4368a(r0)
            goto L_0x0072
        L_0x0071:
            r0 = r4
        L_0x0072:
            if (r0 == 0) goto L_0x008a
            androidx.recyclerview.widget.d r1 = r7.f3209a0
            android.view.View r5 = r0.itemView
            boolean r1 = r1.mo4965c(r5)
            if (r1 != 0) goto L_0x008a
            android.view.View r1 = r0.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            android.view.View r4 = r0.itemView
            goto L_0x0096
        L_0x008a:
            androidx.recyclerview.widget.d r0 = r7.f3209a0
            int r0 = r0.mo4954a()
            if (r0 <= 0) goto L_0x0096
            android.view.View r4 = r7.m4085E()
        L_0x0096:
            if (r4 == 0) goto L_0x00b2
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r7.f3210a1
            int r0 = r0.f3269o
            long r5 = (long) r0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00ae
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x00ae
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r0 = r4
        L_0x00af:
            r0.requestFocus()
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4091K():void");
    }

    /* renamed from: L */
    private void m4092L() {
        boolean z;
        EdgeEffect edgeEffect = this.f3184E0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3184E0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3185F0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3185F0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3186G0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3186G0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3187H0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3187H0.isFinished();
        }
        if (z) {
            C4187x.m14344I(this);
        }
    }

    /* renamed from: M */
    private void m4093M() {
        C0788a0 a0Var = this.f3210a1;
        a0Var.f3268n = -1;
        a0Var.f3267m = -1;
        a0Var.f3269o = -1;
    }

    /* renamed from: N */
    private void m4094N() {
        VelocityTracker velocityTracker = this.f3191L0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo2753a(0);
        m4092L();
    }

    /* renamed from: O */
    private void m4095O() {
        int i;
        C0794d0 d0Var = null;
        View focusedChild = (!this.f3205W0 || !hasFocus() || this.f3224h0 == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = mo4419d(focusedChild);
        }
        if (d0Var == null) {
            m4093M();
            return;
        }
        this.f3210a1.f3268n = this.f3224h0.hasStableIds() ? d0Var.getItemId() : -1;
        C0788a0 a0Var = this.f3210a1;
        if (this.f3253z0) {
            i = -1;
        } else if (d0Var.isRemoved()) {
            i = d0Var.mOldPosition;
        } else {
            i = d0Var.getAdapterPosition();
        }
        a0Var.f3267m = i;
        this.f3210a1.f3269o = m4119n(d0Var.itemView);
    }

    /* renamed from: P */
    private void m4096P() {
        this.f3206X0.mo4548b();
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            oVar.mo4687D();
        }
    }

    /* renamed from: d */
    private void m4114d(C0794d0 d0Var) {
        View view = d0Var.itemView;
        boolean z = view.getParent() == this;
        this.f3200U.mo4819c(mo4439g(view));
        if (d0Var.isTmpDetached()) {
            this.f3209a0.mo4957a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f3209a0.mo4959a(view, true);
        } else {
            this.f3209a0.mo4956a(view);
        }
    }

    private C4177n getScrollingChildHelper() {
        if (this.f3231k1 == null) {
            this.f3231k1 = new C4177n(this);
        }
        return this.f3231k1;
    }

    /* renamed from: z */
    private void mo3728z() {
        m4094N();
        setScrollState(0);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0808o oVar = this.f3226i0;
        if (oVar == null || !oVar.mo3868a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public void mo4402b(C0814q qVar) {
        List<C0814q> list = this.f3252y0;
        if (list != null) {
            list.remove(qVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4411c(boolean z) {
        if (this.f3244r0 < 1) {
            this.f3244r0 = 1;
        }
        if (!z && !this.f3247t0) {
            this.f3246s0 = false;
        }
        if (this.f3244r0 == 1) {
            if (z && this.f3246s0 && !this.f3247t0 && this.f3226i0 != null && this.f3224h0 != null) {
                mo4409c();
            }
            if (!this.f3247t0) {
                this.f3246s0 = false;
            }
        }
        this.f3244r0--;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0813p) && this.f3226i0.mo4303a((C0813p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0808o oVar = this.f3226i0;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3862a()) {
            i = this.f3226i0.mo4325a(this.f3210a1);
        }
        return i;
    }

    public int computeHorizontalScrollOffset() {
        C0808o oVar = this.f3226i0;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3862a()) {
            i = this.f3226i0.mo4332b(this.f3210a1);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        C0808o oVar = this.f3226i0;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3862a()) {
            i = this.f3226i0.mo4336c(this.f3210a1);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        C0808o oVar = this.f3226i0;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3882b()) {
            i = this.f3226i0.mo4338d(this.f3210a1);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        C0808o oVar = this.f3226i0;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3882b()) {
            i = this.f3226i0.mo4339e(this.f3210a1);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        C0808o oVar = this.f3226i0;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3882b()) {
            i = this.f3226i0.mo4341f(this.f3210a1);
        }
        return i;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo14811a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo14810a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo14816a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo14814a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.f3230k0.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((C0807n) this.f3230k0.get(i)).onDrawOver(canvas, this, this.f3210a1);
        }
        EdgeEffect edgeEffect = this.f3184E0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3214c0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3184E0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3185F0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3214c0) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3185F0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3186G0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3214c0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f3186G0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3187H0;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3214c0) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f3187H0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f3188I0 != null && this.f3230k0.size() > 0 && this.f3188I0.mo4672g()) {
            z2 = true;
        }
        if (z2) {
            C4187x.m14344I(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4432e(int i) {
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            oVar.mo3903i(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4435f() {
        if (this.f3184E0 == null) {
            this.f3184E0 = this.f3183D0.mo4650a(this, 0);
            if (this.f3214c0) {
                this.f3184E0.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f3184E0.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.f3226i0.mo3889d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.f3224h0 != null && this.f3226i0 != null && !mo4478o() && !this.f3247t0;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                mo4396b();
                if (mo4407c(view) == null) {
                    return null;
                }
                mo4525x();
                view2 = this.f3226i0.mo4295a(view, i, this.f3200U, this.f3210a1);
                mo4411c(false);
            }
        } else {
            if (this.f3226i0.mo3882b()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3178y1) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3226i0.mo3862a()) {
                int i3 = (this.f3226i0.mo4746k() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (f3178y1) {
                    i = i3;
                }
            }
            if (z) {
                mo4396b();
                if (mo4407c(view) == null) {
                    return null;
                }
                mo4525x();
                this.f3226i0.mo4295a(view, i, this.f3200U, this.f3210a1);
                mo4411c(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!m4110a(view, view2, i)) {
                view2 = super.focusSearch(view, i);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m4102a(view2, (View) null);
            return view;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4440g() {
        if (this.f3186G0 == null) {
            this.f3186G0 = this.f3183D0.mo4650a(this, 2);
            if (this.f3214c0) {
                this.f3186G0.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f3186G0.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            return oVar.mo3884c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo4466i());
        throw new IllegalStateException(sb.toString());
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            return oVar.mo3837a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo4466i());
        throw new IllegalStateException(sb.toString());
    }

    public C0797g getAdapter() {
        return this.f3224h0;
    }

    public int getBaseline() {
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            return oVar.mo4727d();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0800j jVar = this.f3227i1;
        if (jVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return jVar.mo4649a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f3214c0;
    }

    public C0897r getCompatAccessibilityDelegate() {
        return this.f3225h1;
    }

    public C0801k getEdgeEffectFactory() {
        return this.f3183D0;
    }

    public C0802l getItemAnimator() {
        return this.f3188I0;
    }

    public int getItemDecorationCount() {
        return this.f3230k0.size();
    }

    public C0808o getLayoutManager() {
        return this.f3226i0;
    }

    public int getMaxFlingVelocity() {
        return this.f3199T0;
    }

    public int getMinFlingVelocity() {
        return this.f3198S0;
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (f3177x1) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0815r getOnFlingListener() {
        return this.f3197R0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3205W0;
    }

    public C0818u getRecycledViewPool() {
        return this.f3200U.mo4821d();
    }

    public int getScrollState() {
        return this.f3189J0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4462h() {
        if (this.f3185F0 == null) {
            this.f3185F0 = this.f3183D0.mo4650a(this, 1);
            if (this.f3214c0) {
                this.f3185F0.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f3185F0.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: h */
    public void mo4463h(int i) {
    }

    /* renamed from: h */
    public void mo4464h(int i, int i2) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo14809a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public String mo4466i() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.f3224h0);
        sb.append(", layout:");
        sb.append(this.f3226i0);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* renamed from: i */
    public void mo4468i(View view) {
    }

    public boolean isAttachedToWindow() {
        return this.f3236n0;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo14818b();
    }

    /* renamed from: j */
    public void mo4470j(View view) {
    }

    /* renamed from: j */
    public boolean mo4471j() {
        return this.f3238o0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo4474k(View view) {
        mo4525x();
        boolean e = this.f3209a0.mo4969e(view);
        if (e) {
            C0794d0 m = m4118m(view);
            this.f3200U.mo4819c(m);
            this.f3200U.mo4814b(m);
        }
        mo4411c(!e);
        return e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4475l() {
        this.f3204W = new C0837a(new C0796f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo4476m() {
        this.f3187H0 = null;
        this.f3185F0 = null;
        this.f3186G0 = null;
        this.f3184E0 = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo4477n() {
        AccessibilityManager accessibilityManager = this.f3251x0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: o */
    public boolean mo4478o() {
        return this.f3181B0 > 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f3181B0 = r0
            r1 = 1
            r4.f3236n0 = r1
            boolean r2 = r4.f3242q0
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f3242q0 = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r4.f3226i0
            if (r1 == 0) goto L_0x001e
            r1.mo4702a(r4)
        L_0x001e:
            r4.f3223g1 = r0
            boolean r0 = f3177x1
            if (r0 == 0) goto L_0x0067
            java.lang.ThreadLocal<androidx.recyclerview.widget.h> r0 = androidx.recyclerview.widget.C0868h.f3538X
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.h r0 = (androidx.recyclerview.widget.C0868h) r0
            r4.f3207Y0 = r0
            androidx.recyclerview.widget.h r0 = r4.f3207Y0
            if (r0 != 0) goto L_0x0062
            androidx.recyclerview.widget.h r0 = new androidx.recyclerview.widget.h
            r0.<init>()
            r4.f3207Y0 = r0
            android.view.Display r0 = p096e.p121h.p135s.C4187x.m14393i(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            androidx.recyclerview.widget.h r1 = r4.f3207Y0
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f3541V = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.h> r0 = androidx.recyclerview.widget.C0868h.f3538X
            r0.set(r1)
        L_0x0062:
            androidx.recyclerview.widget.h r0 = r4.f3207Y0
            r0.mo5027a(r4)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0802l lVar = this.f3188I0;
        if (lVar != null) {
            lVar.mo4661b();
        }
        mo4526y();
        this.f3236n0 = false;
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            oVar.mo4703a(this, this.f3200U);
        }
        this.f3241p1.clear();
        removeCallbacks(this.f3243q1);
        this.f3211b0.mo5164b();
        if (f3177x1) {
            C0868h hVar = this.f3207Y0;
            if (hVar != null) {
                hVar.mo5029b(this);
                this.f3207Y0 = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3230k0.size();
        for (int i = 0; i < size; i++) {
            ((C0807n) this.f3230k0.get(i)).onDraw(canvas, this, this.f3210a1);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3226i0 != null && !this.f3247t0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f3226i0.mo3882b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3226i0.mo3862a()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo4389a((int) (f * this.f3201U0), (int) (f2 * this.f3203V0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3226i0.mo3882b()) {
                        f2 = -axisValue;
                    } else if (this.f3226i0.mo3862a()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo4389a((int) (f * this.f3201U0), (int) (f2 * this.f3203V0), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            mo4389a((int) (f * this.f3201U0), (int) (f2 * this.f3203V0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.f3247t0) {
            return false;
        }
        if (m4112b(motionEvent)) {
            mo3728z();
            return true;
        }
        C0808o oVar = this.f3226i0;
        if (oVar == null) {
            return false;
        }
        boolean a = oVar.mo3862a();
        boolean b = this.f3226i0.mo3882b();
        if (this.f3191L0 == null) {
            this.f3191L0 = VelocityTracker.obtain();
        }
        this.f3191L0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3248u0) {
                this.f3248u0 = false;
            }
            this.f3190K0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f3194O0 = x;
            this.f3192M0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f3195P0 = y;
            this.f3193N0 = y;
            if (this.f3189J0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f3237n1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = a ? 1 : 0;
            if (b) {
                i |= 2;
            }
            mo4472j(i, 0);
        } else if (actionMasked == 1) {
            this.f3191L0.clear();
            mo2753a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3190K0);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.f3190K0);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3189J0 != 1) {
                int i2 = x2 - this.f3192M0;
                int i3 = y2 - this.f3193N0;
                if (!a || Math.abs(i2) <= this.f3196Q0) {
                    z = false;
                } else {
                    this.f3194O0 = x2;
                    z = true;
                }
                if (b && Math.abs(i3) > this.f3196Q0) {
                    this.f3195P0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            mo3728z();
        } else if (actionMasked == 5) {
            this.f3190K0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3194O0 = x3;
            this.f3192M0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3195P0 = y3;
            this.f3193N0 = y3;
        } else if (actionMasked == 6) {
            m4113c(motionEvent);
        }
        if (this.f3189J0 == 1) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C4070g.m13983a("RV OnLayout");
        mo4409c();
        C4070g.m13982a();
        this.f3242q0 = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0808o oVar = this.f3226i0;
        if (oVar == null) {
            mo4410c(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo4347w()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f3226i0.mo3853a(this.f3200U, this.f3210a1, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f3224h0 != null) {
                if (this.f3210a1.f3259e == 1) {
                    m4082B();
                }
                this.f3226i0.mo4715b(i, i2);
                this.f3210a1.f3264j = true;
                m4083C();
                this.f3226i0.mo4730d(i, i2);
                if (this.f3226i0.mo4315C()) {
                    this.f3226i0.mo4715b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3210a1.f3264j = true;
                    m4083C();
                    this.f3226i0.mo4730d(i, i2);
                }
            }
        } else if (this.f3238o0) {
            this.f3226i0.mo3853a(this.f3200U, this.f3210a1, i, i2);
        } else {
            if (this.f3250w0) {
                mo4525x();
                mo4492r();
                m4090J();
                mo4498s();
                C0788a0 a0Var = this.f3210a1;
                if (a0Var.f3266l) {
                    a0Var.f3262h = true;
                } else {
                    this.f3204W.mo4937b();
                    this.f3210a1.f3262h = false;
                }
                this.f3250w0 = false;
                mo4411c(false);
            } else if (this.f3210a1.f3266l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0797g gVar = this.f3224h0;
            if (gVar != null) {
                this.f3210a1.f3260f = gVar.getItemCount();
            } else {
                this.f3210a1.f3260f = 0;
            }
            mo4525x();
            this.f3226i0.mo3853a(this.f3200U, this.f3210a1, i, i2);
            mo4411c(false);
            this.f3210a1.f3262h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4478o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0823y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f3202V = (C0823y) parcelable;
        super.onRestoreInstanceState(this.f3202V.mo14857X());
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            Parcelable parcelable2 = this.f3202V.f3336V;
            if (parcelable2 != null) {
                oVar.mo3845a(parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0823y yVar = new C0823y(super.onSaveInstanceState());
        C0823y yVar2 = this.f3202V;
        if (yVar2 != null) {
            yVar.mo4832a(yVar2);
        } else {
            C0808o oVar = this.f3226i0;
            if (oVar != null) {
                yVar.f3336V = oVar.mo3930z();
            } else {
                yVar.f3336V = null;
            }
        }
        return yVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo4476m();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            boolean r0 = r14.f3247t0
            r1 = 0
            if (r0 != 0) goto L_0x01c7
            boolean r0 = r14.f3248u0
            if (r0 == 0) goto L_0x000b
            goto L_0x01c7
        L_0x000b:
            boolean r0 = r14.m4109a(r15)
            r2 = 1
            if (r0 == 0) goto L_0x0016
            r14.mo3728z()
            return r2
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView$o r0 = r14.f3226i0
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            boolean r0 = r0.mo3862a()
            androidx.recyclerview.widget.RecyclerView$o r3 = r14.f3226i0
            boolean r3 = r3.mo3882b()
            android.view.VelocityTracker r4 = r14.f3191L0
            if (r4 != 0) goto L_0x002f
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r14.f3191L0 = r4
        L_0x002f:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r15)
            int r5 = r15.getActionMasked()
            int r6 = r15.getActionIndex()
            if (r5 != 0) goto L_0x0043
            int[] r7 = r14.f3237n1
            r7[r2] = r1
            r7[r1] = r1
        L_0x0043:
            int[] r7 = r14.f3237n1
            r8 = r7[r1]
            float r8 = (float) r8
            r7 = r7[r2]
            float r7 = (float) r7
            r4.offsetLocation(r8, r7)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r5 == 0) goto L_0x0196
            if (r5 == r2) goto L_0x0154
            r8 = 2
            if (r5 == r8) goto L_0x0088
            r0 = 3
            if (r5 == r0) goto L_0x0083
            r0 = 5
            if (r5 == r0) goto L_0x0067
            r0 = 6
            if (r5 == r0) goto L_0x0062
            goto L_0x01bc
        L_0x0062:
            r14.m4113c(r15)
            goto L_0x01bc
        L_0x0067:
            int r0 = r15.getPointerId(r6)
            r14.f3190K0 = r0
            float r0 = r15.getX(r6)
            float r0 = r0 + r7
            int r0 = (int) r0
            r14.f3194O0 = r0
            r14.f3192M0 = r0
            float r15 = r15.getY(r6)
            float r15 = r15 + r7
            int r15 = (int) r15
            r14.f3195P0 = r15
            r14.f3193N0 = r15
            goto L_0x01bc
        L_0x0083:
            r14.mo3728z()
            goto L_0x01bc
        L_0x0088:
            int r5 = r14.f3190K0
            int r5 = r15.findPointerIndex(r5)
            if (r5 >= 0) goto L_0x00ae
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r15.append(r0)
            int r0 = r14.f3190K0
            r15.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r15)
            return r1
        L_0x00ae:
            float r6 = r15.getX(r5)
            float r6 = r6 + r7
            int r6 = (int) r6
            float r15 = r15.getY(r5)
            float r15 = r15 + r7
            int r15 = (int) r15
            int r5 = r14.f3194O0
            int r5 = r5 - r6
            int r7 = r14.f3195P0
            int r13 = r7 - r15
            int[] r10 = r14.f3235m1
            int[] r11 = r14.f3233l1
            r12 = 0
            r7 = r14
            r8 = r5
            r9 = r13
            boolean r7 = r7.mo4390a(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x00f4
            int[] r7 = r14.f3235m1
            r8 = r7[r1]
            int r5 = r5 - r8
            r7 = r7[r2]
            int r13 = r13 - r7
            int[] r7 = r14.f3233l1
            r8 = r7[r1]
            float r8 = (float) r8
            r7 = r7[r2]
            float r7 = (float) r7
            r4.offsetLocation(r8, r7)
            int[] r7 = r14.f3237n1
            r8 = r7[r1]
            int[] r9 = r14.f3233l1
            r10 = r9[r1]
            int r8 = r8 + r10
            r7[r1] = r8
            r8 = r7[r2]
            r9 = r9[r2]
            int r8 = r8 + r9
            r7[r2] = r8
        L_0x00f4:
            int r7 = r14.f3189J0
            if (r7 == r2) goto L_0x011f
            if (r0 == 0) goto L_0x0109
            int r7 = java.lang.Math.abs(r5)
            int r8 = r14.f3196Q0
            if (r7 <= r8) goto L_0x0109
            if (r5 <= 0) goto L_0x0106
            int r5 = r5 - r8
            goto L_0x0107
        L_0x0106:
            int r5 = r5 + r8
        L_0x0107:
            r7 = 1
            goto L_0x010a
        L_0x0109:
            r7 = 0
        L_0x010a:
            if (r3 == 0) goto L_0x011a
            int r8 = java.lang.Math.abs(r13)
            int r9 = r14.f3196Q0
            if (r8 <= r9) goto L_0x011a
            if (r13 <= 0) goto L_0x0118
            int r13 = r13 - r9
            goto L_0x0119
        L_0x0118:
            int r13 = r13 + r9
        L_0x0119:
            r7 = 1
        L_0x011a:
            if (r7 == 0) goto L_0x011f
            r14.setScrollState(r2)
        L_0x011f:
            int r7 = r14.f3189J0
            if (r7 != r2) goto L_0x01bc
            int[] r7 = r14.f3233l1
            r8 = r7[r1]
            int r6 = r6 - r8
            r14.f3194O0 = r6
            r6 = r7[r2]
            int r15 = r15 - r6
            r14.f3195P0 = r15
            if (r0 == 0) goto L_0x0133
            r15 = r5
            goto L_0x0134
        L_0x0133:
            r15 = 0
        L_0x0134:
            if (r3 == 0) goto L_0x0138
            r0 = r13
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            boolean r15 = r14.mo4389a(r15, r0, r4)
            if (r15 == 0) goto L_0x0146
            android.view.ViewParent r15 = r14.getParent()
            r15.requestDisallowInterceptTouchEvent(r2)
        L_0x0146:
            androidx.recyclerview.widget.h r15 = r14.f3207Y0
            if (r15 == 0) goto L_0x01bc
            if (r5 != 0) goto L_0x014e
            if (r13 == 0) goto L_0x01bc
        L_0x014e:
            androidx.recyclerview.widget.h r15 = r14.f3207Y0
            r15.mo5028a(r14, r5, r13)
            goto L_0x01bc
        L_0x0154:
            android.view.VelocityTracker r15 = r14.f3191L0
            r15.addMovement(r4)
            android.view.VelocityTracker r15 = r14.f3191L0
            r5 = 1000(0x3e8, float:1.401E-42)
            int r6 = r14.f3199T0
            float r6 = (float) r6
            r15.computeCurrentVelocity(r5, r6)
            r15 = 0
            if (r0 == 0) goto L_0x0170
            android.view.VelocityTracker r0 = r14.f3191L0
            int r5 = r14.f3190K0
            float r0 = r0.getXVelocity(r5)
            float r0 = -r0
            goto L_0x0171
        L_0x0170:
            r0 = 0
        L_0x0171:
            if (r3 == 0) goto L_0x017d
            android.view.VelocityTracker r3 = r14.f3191L0
            int r5 = r14.f3190K0
            float r3 = r3.getYVelocity(r5)
            float r3 = -r3
            goto L_0x017e
        L_0x017d:
            r3 = 0
        L_0x017e:
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0186
            int r15 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x018e
        L_0x0186:
            int r15 = (int) r0
            int r0 = (int) r3
            boolean r15 = r14.mo4433e(r15, r0)
            if (r15 != 0) goto L_0x0191
        L_0x018e:
            r14.setScrollState(r1)
        L_0x0191:
            r14.m4094N()
            r1 = 1
            goto L_0x01bc
        L_0x0196:
            int r5 = r15.getPointerId(r1)
            r14.f3190K0 = r5
            float r5 = r15.getX()
            float r5 = r5 + r7
            int r5 = (int) r5
            r14.f3194O0 = r5
            r14.f3192M0 = r5
            float r15 = r15.getY()
            float r15 = r15 + r7
            int r15 = (int) r15
            r14.f3195P0 = r15
            r14.f3193N0 = r15
            if (r0 == 0) goto L_0x01b4
            r15 = 1
            goto L_0x01b5
        L_0x01b4:
            r15 = 0
        L_0x01b5:
            if (r3 == 0) goto L_0x01b9
            r15 = r15 | 2
        L_0x01b9:
            r14.mo4472j(r15, r1)
        L_0x01bc:
            if (r1 != 0) goto L_0x01c3
            android.view.VelocityTracker r15 = r14.f3191L0
            r15.addMovement(r4)
        L_0x01c3:
            r4.recycle()
            return r2
        L_0x01c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo4490p() {
        int b = this.f3209a0.mo4960b();
        for (int i = 0; i < b; i++) {
            ((C0813p) this.f3209a0.mo4966d(i).getLayoutParams()).f3318c = true;
        }
        this.f3200U.mo4827g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo4491q() {
        int b = this.f3209a0.mo4960b();
        for (int i = 0; i < b; i++) {
            C0794d0 m = m4118m(this.f3209a0.mo4966d(i));
            if (m != null && !m.shouldIgnore()) {
                m.addFlags(6);
            }
        }
        mo4490p();
        this.f3200U.mo4828h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo4492r() {
        this.f3181B0++;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0794d0 m = m4118m(view);
        if (m != null) {
            if (m.isTmpDetached()) {
                m.clearTmpDetachFlag();
            } else if (!m.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(m);
                sb.append(mo4466i());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        mo4399b(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3226i0.mo4712a(this, this.f3210a1, view, view2) && view2 != null) {
            m4102a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3226i0.mo3866a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3232l0.size();
        for (int i = 0; i < size; i++) {
            ((C0816s) this.f3232l0.get(i)).mo4781a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f3244r0 != 0 || this.f3247t0) {
            this.f3246s0 = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo4498s() {
        mo4387a(true);
    }

    public void scrollBy(int i, int i2) {
        C0808o oVar = this.f3226i0;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3247t0) {
            boolean a = oVar.mo3862a();
            boolean b = this.f3226i0.mo3882b();
            if (a || b) {
                if (!a) {
                    i = 0;
                }
                if (!b) {
                    i2 = 0;
                }
                mo4389a(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo4391a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0897r rVar) {
        this.f3225h1 = rVar;
        C4187x.m14359a((View) this, (C4119a) this.f3225h1);
    }

    public void setAdapter(C0797g gVar) {
        setLayoutFrozen(false);
        m4104a(gVar, false, true);
        mo4405b(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0800j jVar) {
        if (jVar != this.f3227i1) {
            this.f3227i1 = jVar;
            setChildrenDrawingOrderEnabled(this.f3227i1 != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f3214c0) {
            mo4476m();
        }
        this.f3214c0 = z;
        super.setClipToPadding(z);
        if (this.f3242q0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0801k kVar) {
        C4117i.m14095a(kVar);
        this.f3183D0 = kVar;
        mo4476m();
    }

    public void setHasFixedSize(boolean z) {
        this.f3238o0 = z;
    }

    public void setItemAnimator(C0802l lVar) {
        C0802l lVar2 = this.f3188I0;
        if (lVar2 != null) {
            lVar2.mo4661b();
            this.f3188I0.mo4655a((C0804b) null);
        }
        this.f3188I0 = lVar;
        C0802l lVar3 = this.f3188I0;
        if (lVar3 != null) {
            lVar3.mo4655a(this.f3221f1);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f3200U.mo4826f(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f3247t0) {
            mo4386a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f3247t0 = false;
                if (!(!this.f3246s0 || this.f3226i0 == null || this.f3224h0 == null)) {
                    requestLayout();
                }
                this.f3246s0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3247t0 = true;
            this.f3248u0 = true;
            mo4526y();
        }
    }

    public void setLayoutManager(C0808o oVar) {
        if (oVar != this.f3226i0) {
            mo4526y();
            if (this.f3226i0 != null) {
                C0802l lVar = this.f3188I0;
                if (lVar != null) {
                    lVar.mo4661b();
                }
                this.f3226i0.mo3876b(this.f3200U);
                this.f3226i0.mo4725c(this.f3200U);
                this.f3200U.mo4800a();
                if (this.f3236n0) {
                    this.f3226i0.mo4703a(this, this.f3200U);
                }
                this.f3226i0.mo4736f((RecyclerView) null);
                this.f3226i0 = null;
            } else {
                this.f3200U.mo4800a();
            }
            this.f3209a0.mo4964c();
            this.f3226i0 = oVar;
            if (oVar != null) {
                if (oVar.f3293b == null) {
                    this.f3226i0.mo4736f(this);
                    if (this.f3236n0) {
                        this.f3226i0.mo4702a(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(oVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(oVar.f3293b.mo4466i());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f3200U.mo4830j();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo14808a(z);
    }

    public void setOnFlingListener(C0815r rVar) {
        this.f3197R0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C0817t tVar) {
        this.f3212b1 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3205W0 = z;
    }

    public void setRecycledViewPool(C0818u uVar) {
        this.f3200U.mo4808a(uVar);
    }

    public void setRecyclerListener(C0821w wVar) {
        this.f3228j0 = wVar;
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.f3189J0) {
            this.f3189J0 = i;
            if (i != 2) {
                m4096P();
            }
            mo4397b(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.f3196Q0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f3196Q0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C0790b0 b0Var) {
        this.f3200U.mo4804a(b0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo14819b(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo14820c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo4521t() {
        if (!this.f3223g1 && this.f3236n0) {
            C4187x.m14363a((View) this, this.f3243q1);
            this.f3223g1 = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo4522u() {
        C0802l lVar = this.f3188I0;
        if (lVar != null) {
            lVar.mo4661b();
        }
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            oVar.mo3876b(this.f3200U);
            this.f3226i0.mo4725c(this.f3200U);
        }
        this.f3200U.mo4800a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo4523v() {
        int a = this.f3209a0.mo4954a();
        for (int i = 0; i < a; i++) {
            View c = this.f3209a0.mo4963c(i);
            C0794d0 g = mo4439g(c);
            if (g != null) {
                C0794d0 d0Var = g.mShadowingHolder;
                if (d0Var != null) {
                    View view = d0Var.itemView;
                    int left = c.getLeft();
                    int top = c.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo4524w() {
        int b = this.f3209a0.mo4960b();
        for (int i = 0; i < b; i++) {
            C0794d0 m = m4118m(this.f3209a0.mo4966d(i));
            if (!m.shouldIgnore()) {
                m.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo4525x() {
        this.f3244r0++;
        if (this.f3244r0 == 1 && !this.f3247t0) {
            this.f3246s0 = false;
        }
    }

    /* renamed from: y */
    public void mo4526y() {
        setScrollState(0);
        m4096P();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: l */
    static RecyclerView m4117l(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView l = m4117l(viewGroup.getChildAt(i));
            if (l != null) {
                return l;
            }
        }
        return null;
    }

    /* renamed from: m */
    static C0794d0 m4118m(View view) {
        if (view == null) {
            return null;
        }
        return ((C0813p) view.getLayoutParams()).f3316a;
    }

    /* renamed from: n */
    private int m4119n(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: j */
    public void mo3685j(int i) {
        if (!this.f3247t0) {
            C0808o oVar = this.f3226i0;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo3858a(this, this.f3210a1, i);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3213c = new C0822x();
        this.f3200U = new C0820v();
        this.f3211b0 = new C0906w();
        this.f3216d0 = new C0787a();
        this.f3218e0 = new Rect();
        this.f3220f0 = new Rect();
        this.f3222g0 = new RectF();
        this.f3230k0 = new ArrayList<>();
        this.f3232l0 = new ArrayList<>();
        this.f3244r0 = 0;
        this.f3253z0 = false;
        this.f3180A0 = false;
        this.f3181B0 = 0;
        this.f3182C0 = 0;
        this.f3183D0 = new C0801k();
        this.f3188I0 = new C0845e();
        this.f3189J0 = 0;
        this.f3190K0 = -1;
        this.f3201U0 = Float.MIN_VALUE;
        this.f3203V0 = Float.MIN_VALUE;
        boolean z = true;
        this.f3205W0 = true;
        this.f3206X0 = new C0792c0();
        this.f3208Z0 = f3177x1 ? new C0870b() : null;
        this.f3210a1 = new C0788a0();
        this.f3217d1 = false;
        this.f3219e1 = false;
        this.f3221f1 = new C0806m();
        this.f3223g1 = false;
        this.f3229j1 = new int[2];
        this.f3233l1 = new int[2];
        this.f3235m1 = new int[2];
        this.f3237n1 = new int[2];
        this.f3239o1 = new int[2];
        this.f3241p1 = new ArrayList();
        this.f3243q1 = new C0789b();
        this.f3245r1 = new C0793d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3173t1, i, 0);
            this.f3214c0 = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f3214c0 = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3196Q0 = viewConfiguration.getScaledTouchSlop();
        this.f3201U0 = C4196y.m14434b(viewConfiguration, context);
        this.f3203V0 = C4196y.m14435c(viewConfiguration, context);
        this.f3198S0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3199T0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3188I0.mo4655a(this.f3221f1);
        mo4475l();
        m4088H();
        m4087G();
        if (C4187x.m14397l(this) == 0) {
            C4187x.m14390g(this, 1);
        }
        this.f3251x0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0897r(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C4260c.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C4260c.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C4260c.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
            }
            this.f3240p0 = obtainStyledAttributes2.getBoolean(C4260c.RecyclerView_fastScrollEnabled, false);
            if (this.f3240p0) {
                mo4375a((StateListDrawable) obtainStyledAttributes2.getDrawable(C4260c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C4260c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C4260c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C4260c.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            m4100a(context, string, attributeSet, i, 0);
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f3172s1, i, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            }
        } else {
            setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: b */
    public void mo4401b(C0807n nVar) {
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            oVar.mo4331a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3230k0.remove(nVar);
        if (this.f3230k0.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo4490p();
        requestLayout();
    }

    /* renamed from: i */
    public void mo3684i(int i) {
        if (!this.f3247t0) {
            mo4526y();
            C0808o oVar = this.f3226i0;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo3903i(i);
            awakenScrollBars();
        }
    }

    /* renamed from: e */
    public boolean mo4433e(int i, int i2) {
        C0808o oVar = this.f3226i0;
        int i3 = 0;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3247t0) {
            return false;
        } else {
            boolean a = oVar.mo3862a();
            boolean b = this.f3226i0.mo3882b();
            if (!a || Math.abs(i) < this.f3198S0) {
                i = 0;
            }
            if (!b || Math.abs(i2) < this.f3198S0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = a || b;
                dispatchNestedFling(f, f2, z);
                C0815r rVar = this.f3197R0;
                if (rVar != null && rVar.mo4779a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (a) {
                        i3 = 1;
                    }
                    if (b) {
                        i3 |= 2;
                    }
                    mo4472j(i3, 1);
                    int i4 = this.f3199T0;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f3199T0;
                    this.f3206X0.mo4543a(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            return oVar.mo3838a(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(mo4466i());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private void m4100a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        String str2 = ": Could not instantiate the LayoutManager: ";
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a = m4097a(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = classLoader.loadClass(a).asSubclass(C0808o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3170A1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0808o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(str2);
                    sb3.append(a);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(str2);
                    sb4.append(a);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(a);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(a);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    /* renamed from: j */
    public boolean mo4472j(int i, int i2) {
        return getScrollingChildHelper().mo14813a(i, i2);
    }

    /* renamed from: k */
    private boolean mo12695k(int i, int i2) {
        m4108a(this.f3229j1);
        int[] iArr = this.f3229j1;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: d */
    public C0794d0 mo4419d(View view) {
        View c = mo4407c(view);
        if (c == null) {
            return null;
        }
        return mo4439g(c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4437f(int i, int i2) {
        int b = this.f3209a0.mo4960b();
        for (int i3 = 0; i3 < b; i3++) {
            C0794d0 m = m4118m(this.f3209a0.mo4966d(i3));
            if (m != null && !m.shouldIgnore() && m.mPosition >= i) {
                m.offsetPosition(i2, false);
                this.f3210a1.f3261g = true;
            }
        }
        this.f3200U.mo4801a(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4442g(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int b = this.f3209a0.mo4960b();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i6 = 0; i6 < b; i6++) {
            C0794d0 m = m4118m(this.f3209a0.mo4966d(i6));
            if (m != null) {
                int i7 = m.mPosition;
                if (i7 >= i5 && i7 <= i4) {
                    if (i7 == i) {
                        m.offsetPosition(i2 - i, false);
                    } else {
                        m.offsetPosition(i3, false);
                    }
                    this.f3210a1.f3261g = true;
                }
            }
        }
        this.f3200U.mo4812b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Rect mo4461h(View view) {
        C0813p pVar = (C0813p) view.getLayoutParams();
        if (!pVar.f3318c) {
            return pVar.f3317b;
        }
        if (this.f3210a1.mo4536g() && (pVar.mo4773c() || pVar.mo4775e())) {
            return pVar.f3317b;
        }
        Rect rect = pVar.f3317b;
        rect.set(0, 0, 0, 0);
        int size = this.f3230k0.size();
        for (int i = 0; i < size; i++) {
            this.f3218e0.set(0, 0, 0, 0);
            ((C0807n) this.f3230k0.get(i)).getItemOffsets(this.f3218e0, view, this, this.f3210a1);
            int i2 = rect.left;
            Rect rect2 = this.f3218e0;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3318c = false;
        return rect;
    }

    /* renamed from: i */
    public void mo4467i(int i, int i2) {
        mo4371a(i, i2, (Interpolator) null);
    }

    /* renamed from: k */
    public boolean mo4473k() {
        return !this.f3242q0 || this.f3253z0 || this.f3204W.mo4939c();
    }

    /* renamed from: b */
    public void mo4404b(C0817t tVar) {
        List<C0817t> list = this.f3215c1;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4421d(int i, int i2) {
        this.f3182C0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        mo4464h(i, i2);
        C0817t tVar = this.f3212b1;
        if (tVar != null) {
            tVar.mo4784a(this, i, i2);
        }
        List<C0817t> list = this.f3215c1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0817t) this.f3215c1.get(size)).mo4784a(this, i, i2);
            }
        }
        this.f3182C0--;
    }

    /* renamed from: c */
    private void m4113c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3190K0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3190K0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3194O0 = x;
            this.f3192M0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3195P0 = y;
            this.f3193N0 = y;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4396b() {
        String str = "RV FullInvalidate";
        if (!this.f3242q0 || this.f3253z0) {
            C4070g.m13983a(str);
            mo4409c();
            C4070g.m13982a();
        } else if (this.f3204W.mo4939c()) {
            if (this.f3204W.mo4940c(4) && !this.f3204W.mo4940c(11)) {
                C4070g.m13983a("RV PartialInvalidate");
                mo4525x();
                mo4492r();
                this.f3204W.mo4943e();
                if (!this.f3246s0) {
                    if (m4086F()) {
                        mo4409c();
                    } else {
                        this.f3204W.mo4930a();
                    }
                }
                mo4411c(true);
                mo4498s();
                C4070g.m13982a();
            } else if (this.f3204W.mo4939c()) {
                C4070g.m13983a(str);
                mo4409c();
                C4070g.m13982a();
            }
        }
    }

    /* renamed from: f */
    public int mo4434f(View view) {
        C0794d0 m = m4118m(view);
        if (m != null) {
            return m.getLayoutPosition();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4410c(int i, int i2) {
        setMeasuredDimension(C0808o.m4303a(i, getPaddingLeft() + getPaddingRight(), C4187x.m14401p(this)), C0808o.m4303a(i2, getPaddingTop() + getPaddingBottom(), C4187x.m14400o(this)));
    }

    /* renamed from: g */
    public C0794d0 mo4439g(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4118m(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public void mo4436f(int i) {
        int a = this.f3209a0.mo4954a();
        for (int i2 = 0; i2 < a; i2++) {
            this.f3209a0.mo4963c(i2).offsetLeftAndRight(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4431e() {
        if (this.f3187H0 == null) {
            this.f3187H0 = this.f3183D0.mo4650a(this, 3);
            if (this.f3214c0) {
                this.f3187H0.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f3187H0.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: g */
    public void mo4441g(int i) {
        int a = this.f3209a0.mo4954a();
        for (int i2 = 0; i2 < a; i2++) {
            this.f3209a0.mo4963c(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4420d() {
        for (int size = this.f3241p1.size() - 1; size >= 0; size--) {
            C0794d0 d0Var = (C0794d0) this.f3241p1.get(size);
            if (d0Var.itemView.getParent() == this && !d0Var.shouldIgnore()) {
                int i = d0Var.mPendingAccessibilityState;
                if (i != -1) {
                    C4187x.m14390g(d0Var.itemView, i);
                    d0Var.mPendingAccessibilityState = -1;
                }
            }
        }
        this.f3241p1.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4409c() {
        String str = "RecyclerView";
        if (this.f3224h0 == null) {
            Log.e(str, "No adapter attached; skipping layout");
        } else if (this.f3226i0 == null) {
            Log.e(str, "No layout manager attached; skipping layout");
        } else {
            C0788a0 a0Var = this.f3210a1;
            a0Var.f3264j = false;
            if (a0Var.f3259e == 1) {
                m4082B();
                this.f3226i0.mo4734e(this);
                m4083C();
            } else if (!this.f3204W.mo4942d() && this.f3226i0.mo4758r() == getWidth() && this.f3226i0.mo4741h() == getHeight()) {
                this.f3226i0.mo4734e(this);
            } else {
                this.f3226i0.mo4734e(this);
                m4083C();
            }
            m4084D();
        }
    }

    /* renamed from: a */
    private String m4097a(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* renamed from: e */
    public int mo4430e(View view) {
        C0794d0 m = m4118m(view);
        if (m != null) {
            return m.getAdapterPosition();
        }
        return -1;
    }

    /* renamed from: e */
    static void m4115e(C0794d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d0Var.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.mNestedRecyclerView = null;
        }
    }

    /* renamed from: d */
    public boolean mo4422d(int i) {
        return getScrollingChildHelper().mo14812a(i);
    }

    /* renamed from: a */
    public void mo4380a(C0797g gVar, boolean z) {
        setLayoutFrozen(false);
        m4104a(gVar, true, z);
        mo4405b(true);
        requestLayout();
    }

    /* renamed from: a */
    private void m4104a(C0797g gVar, boolean z, boolean z2) {
        C0797g gVar2 = this.f3224h0;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.f3213c);
            this.f3224h0.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            mo4522u();
        }
        this.f3204W.mo4944f();
        C0797g gVar3 = this.f3224h0;
        this.f3224h0 = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.f3213c);
            gVar.onAttachedToRecyclerView(this);
        }
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            oVar.mo3852a(gVar3, this.f3224h0);
        }
        this.f3200U.mo4807a(gVar3, this.f3224h0, z);
        this.f3210a1.f3261g = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4398b(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3184E0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3184E0.onRelease();
            z = this.f3184E0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3186G0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3186G0.onRelease();
            z |= this.f3186G0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3185F0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3185F0.onRelease();
            z |= this.f3185F0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3187H0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3187H0.onRelease();
            z |= this.f3187H0.isFinished();
        }
        if (z) {
            C4187x.m14344I(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo4406c(C0794d0 d0Var) {
        return this.f3224h0.hasStableIds() ? d0Var.getItemId() : (long) d0Var.mPosition;
    }

    /* renamed from: c */
    public View mo4407c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: c */
    public C0794d0 mo4408c(int i) {
        C0794d0 d0Var = null;
        if (this.f3253z0) {
            return null;
        }
        int b = this.f3209a0.mo4960b();
        for (int i2 = 0; i2 < b; i2++) {
            C0794d0 m = m4118m(this.f3209a0.mo4966d(i2));
            if (m != null && !m.isRemoved() && mo4395b(m) == i) {
                if (!this.f3209a0.mo4965c(m.itemView)) {
                    return m;
                }
                d0Var = m;
            }
        }
        return d0Var;
    }

    /* renamed from: a */
    public void mo4383a(C0814q qVar) {
        if (this.f3252y0 == null) {
            this.f3252y0 = new ArrayList();
        }
        this.f3252y0.add(qVar);
    }

    /* renamed from: b */
    public void mo4403b(C0816s sVar) {
        this.f3232l0.remove(sVar);
        if (this.f3234m0 == sVar) {
            this.f3234m0 = null;
        }
    }

    /* renamed from: a */
    public void mo4382a(C0807n nVar, int i) {
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            oVar.mo4331a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3230k0.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3230k0.add(nVar);
        } else {
            this.f3230k0.add(i, nVar);
        }
        mo4490p();
        requestLayout();
    }

    /* renamed from: b */
    private boolean m4112b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f3234m0 = null;
        }
        int size = this.f3232l0.size();
        int i = 0;
        while (i < size) {
            C0816s sVar = (C0816s) this.f3232l0.get(i);
            if (!sVar.mo4782b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f3234m0 = sVar;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4400b(C0794d0 d0Var, C0805c cVar, C0805c cVar2) {
        m4114d(d0Var);
        d0Var.setIsRecyclable(false);
        if (this.f3188I0.mo4664b(d0Var, cVar, cVar2)) {
            mo4521t();
        }
    }

    /* renamed from: a */
    public void mo4381a(C0807n nVar) {
        mo4382a(nVar, -1);
    }

    /* renamed from: a */
    public void mo4385a(C0817t tVar) {
        if (this.f3215c1 == null) {
            this.f3215c1 = new ArrayList();
        }
        this.f3215c1.add(tVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4405b(boolean z) {
        this.f3180A0 = z | this.f3180A0;
        this.f3253z0 = true;
        mo4491q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4374a(int i, int i2, int[] iArr) {
        mo4525x();
        mo4492r();
        C4070g.m13983a("RV Scroll");
        mo4377a(this.f3210a1);
        int a = i != 0 ? this.f3226i0.mo3833a(i, this.f3200U, this.f3210a1) : 0;
        int b = i2 != 0 ? this.f3226i0.mo3870b(i2, this.f3200U, this.f3210a1) : 0;
        C4070g.m13982a();
        mo4523v();
        mo4498s();
        mo4411c(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4397b(int i) {
        C0808o oVar = this.f3226i0;
        if (oVar != null) {
            oVar.mo4740g(i);
        }
        mo4463h(i);
        C0817t tVar = this.f3212b1;
        if (tVar != null) {
            tVar.mo4783a(this, i);
        }
        List<C0817t> list = this.f3215c1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0817t) this.f3215c1.get(size)).mo4783a(this, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4399b(View view) {
        C0794d0 m = m4118m(view);
        mo4470j(view);
        C0797g gVar = this.f3224h0;
        if (!(gVar == null || m == null)) {
            gVar.onViewDetachedFromWindow(m);
        }
        List<C0814q> list = this.f3252y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0814q) this.f3252y0.get(size)).mo4777a(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4389a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo4396b();
        if (this.f3224h0 != null) {
            mo4374a(i7, i8, this.f3239o1);
            int[] iArr = this.f3239o1;
            int i9 = iArr[0];
            int i10 = iArr[1];
            i6 = i10;
            i3 = i9;
            i5 = i7 - i9;
            i4 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f3230k0.isEmpty()) {
            invalidate();
        }
        int i11 = i6;
        if (mo4388a(i3, i6, i5, i4, this.f3233l1, 0)) {
            int i12 = this.f3194O0;
            int[] iArr2 = this.f3233l1;
            this.f3194O0 = i12 - iArr2[0];
            this.f3195P0 -= iArr2[1];
            if (motionEvent2 != null) {
                motionEvent2.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            }
            int[] iArr3 = this.f3237n1;
            int i13 = iArr3[0];
            int[] iArr4 = this.f3233l1;
            iArr3[0] = i13 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C4171j.m14298a(motionEvent2, 8194)) {
                m4098a(motionEvent.getX(), (float) i5, motionEvent.getY(), (float) i4);
            }
            mo4398b(i, i2);
        }
        int i14 = i11;
        if (!(i3 == 0 && i14 == 0)) {
            mo4421d(i3, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i3 == 0 && i14 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4395b(C0794d0 d0Var) {
        if (d0Var.hasAnyOfTheFlags(524) || !d0Var.isBound()) {
            return -1;
        }
        return this.f3204W.mo4927a(d0Var.mPosition);
    }

    /* renamed from: a */
    public void mo4371a(int i, int i2, Interpolator interpolator) {
        C0808o oVar = this.f3226i0;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3247t0) {
            if (!oVar.mo3862a()) {
                i = 0;
            }
            if (!this.f3226i0.mo3882b()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                this.f3206X0.mo4547a(i, i2, interpolator);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4098a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo4435f()
            android.widget.EdgeEffect r3 = r6.f3184E0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C0508d.m2749a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.mo4440g()
            android.widget.EdgeEffect r3 = r6.f3186G0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0508d.m2749a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.mo4462h()
            android.widget.EdgeEffect r9 = r6.f3185F0
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0508d.m2749a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.mo4431e()
            android.widget.EdgeEffect r9 = r6.f3187H0
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0508d.m2749a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            p096e.p121h.p135s.C4187x.m14344I(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4098a(float, float, float, float):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4370a(int i, int i2) {
        if (i < 0) {
            mo4435f();
            this.f3184E0.onAbsorb(-i);
        } else if (i > 0) {
            mo4440g();
            this.f3186G0.onAbsorb(i);
        }
        if (i2 < 0) {
            mo4462h();
            this.f3185F0.onAbsorb(-i2);
        } else if (i2 > 0) {
            mo4431e();
            this.f3187H0.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C4187x.m14344I(this);
        }
    }

    /* renamed from: a */
    private boolean m4110a(View view, View view2, int i) {
        int i2;
        boolean z = false;
        if (!(view2 == null || view2 == this)) {
            if (mo4407c(view2) == null) {
                return false;
            }
            if (view == null || mo4407c(view) == null) {
                return true;
            }
            this.f3218e0.set(0, 0, view.getWidth(), view.getHeight());
            this.f3220f0.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.f3218e0);
            offsetDescendantRectToMyCoords(view2, this.f3220f0);
            char c = 65535;
            int i3 = this.f3226i0.mo4746k() == 1 ? -1 : 1;
            Rect rect = this.f3218e0;
            int i4 = rect.left;
            int i5 = this.f3220f0.left;
            if ((i4 < i5 || rect.right <= i5) && this.f3218e0.right < this.f3220f0.right) {
                i2 = 1;
            } else {
                Rect rect2 = this.f3218e0;
                int i6 = rect2.right;
                int i7 = this.f3220f0.right;
                i2 = ((i6 > i7 || rect2.left >= i7) && this.f3218e0.left > this.f3220f0.left) ? -1 : 0;
            }
            Rect rect3 = this.f3218e0;
            int i8 = rect3.top;
            int i9 = this.f3220f0.top;
            if ((i8 < i9 || rect3.bottom <= i9) && this.f3218e0.bottom < this.f3220f0.bottom) {
                c = 1;
            } else {
                Rect rect4 = this.f3218e0;
                int i10 = rect4.bottom;
                int i11 = this.f3220f0.bottom;
                if ((i10 <= i11 && rect4.top < i11) || this.f3218e0.top <= this.f3220f0.top) {
                    c = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                        z = true;
                    }
                    return z;
                } else if (i == 17) {
                    if (i2 < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 33) {
                    if (c < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 66) {
                    if (i2 > 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 130) {
                    if (c > 0) {
                        z = true;
                    }
                    return z;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid direction: ");
                    sb.append(i);
                    sb.append(mo4466i());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m4102a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3218e0.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0813p) {
            C0813p pVar = (C0813p) layoutParams;
            if (!pVar.f3318c) {
                Rect rect = pVar.f3317b;
                Rect rect2 = this.f3218e0;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3218e0);
            offsetRectIntoDescendantCoords(view, this.f3218e0);
        }
        this.f3226i0.mo4711a(this, view, this.f3218e0, !this.f3242q0, view2 == null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4386a(String str) {
        if (mo4478o()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(mo4466i());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.f3182C0 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(mo4466i());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    /* renamed from: a */
    public void mo4384a(C0816s sVar) {
        this.f3232l0.add(sVar);
    }

    /* renamed from: a */
    private boolean m4109a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        C0816s sVar = this.f3234m0;
        if (sVar != null) {
            if (action == 0) {
                this.f3234m0 = null;
            } else {
                sVar.mo4780a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f3234m0 = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f3232l0.size();
            for (int i = 0; i < size; i++) {
                C0816s sVar2 = (C0816s) this.f3232l0.get(i);
                if (sVar2.mo4782b(this, motionEvent)) {
                    this.f3234m0 = sVar2;
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4387a(boolean z) {
        this.f3181B0--;
        if (this.f3181B0 < 1) {
            this.f3181B0 = 0;
            if (z) {
                m4081A();
                mo4420d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4391a(AccessibilityEvent accessibilityEvent) {
        if (!mo4478o()) {
            return false;
        }
        int a = accessibilityEvent != null ? C4150b.m14208a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.f3249v0 = a | this.f3249v0;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4377a(C0788a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3206X0.f3274V;
            a0Var.f3270p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3271q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f3270p = 0;
        a0Var.f3271q = 0;
    }

    /* renamed from: a */
    private void m4099a(long j, C0794d0 d0Var, C0794d0 d0Var2) {
        int a = this.f3209a0.mo4954a();
        for (int i = 0; i < a; i++) {
            C0794d0 m = m4118m(this.f3209a0.mo4963c(i));
            if (m != d0Var && mo4406c(m) == j) {
                C0797g gVar = this.f3224h0;
                String str = " \n View Holder 2:";
                if (gVar == null || !gVar.hasStableIds()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(m);
                    sb.append(str);
                    sb.append(d0Var);
                    sb.append(mo4466i());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(m);
                sb2.append(str);
                sb2.append(d0Var);
                sb2.append(mo4466i());
                throw new IllegalStateException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(d0Var2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(d0Var);
        sb3.append(mo4466i());
        Log.e("RecyclerView", sb3.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4378a(C0794d0 d0Var, C0805c cVar) {
        d0Var.setFlags(0, ContentServiceClientExtras.URL_SIZE_LIMIT);
        if (this.f3210a1.f3263i && d0Var.isUpdated() && !d0Var.isRemoved() && !d0Var.shouldIgnore()) {
            this.f3211b0.mo5160a(mo4406c(d0Var), d0Var);
        }
        this.f3211b0.mo5167c(d0Var, cVar);
    }

    /* renamed from: a */
    private void m4108a(int[] iArr) {
        int a = this.f3209a0.mo4954a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < a; i3++) {
            C0794d0 m = m4118m(this.f3209a0.mo4963c(i3));
            if (!m.shouldIgnore()) {
                int layoutPosition = m.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4379a(C0794d0 d0Var, C0805c cVar, C0805c cVar2) {
        d0Var.setIsRecyclable(false);
        if (this.f3188I0.mo4658a(d0Var, cVar, cVar2)) {
            mo4521t();
        }
    }

    /* renamed from: a */
    private void m4103a(C0794d0 d0Var, C0794d0 d0Var2, C0805c cVar, C0805c cVar2, boolean z, boolean z2) {
        d0Var.setIsRecyclable(false);
        if (z) {
            m4114d(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                m4114d(d0Var2);
            }
            d0Var.mShadowedHolder = d0Var2;
            m4114d(d0Var);
            this.f3200U.mo4819c(d0Var);
            d0Var2.setIsRecyclable(false);
            d0Var2.mShadowingHolder = d0Var;
        }
        if (this.f3188I0.mo4657a(d0Var, d0Var2, cVar, cVar2)) {
            mo4521t();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4369a() {
        int b = this.f3209a0.mo4960b();
        for (int i = 0; i < b; i++) {
            C0794d0 m = m4118m(this.f3209a0.mo4966d(i));
            if (!m.shouldIgnore()) {
                m.clearOldPosition();
            }
        }
        this.f3200U.mo4811b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4373a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.f3209a0.mo4960b();
        for (int i4 = 0; i4 < b; i4++) {
            C0794d0 m = m4118m(this.f3209a0.mo4966d(i4));
            if (m != null && !m.shouldIgnore()) {
                int i5 = m.mPosition;
                if (i5 >= i3) {
                    m.offsetPosition(-i2, z);
                    this.f3210a1.f3261g = true;
                } else if (i5 >= i) {
                    m.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f3210a1.f3261g = true;
                }
            }
        }
        this.f3200U.mo4802a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4372a(int i, int i2, Object obj) {
        int b = this.f3209a0.mo4960b();
        int i3 = i + i2;
        for (int i4 = 0; i4 < b; i4++) {
            View d = this.f3209a0.mo4966d(i4);
            C0794d0 m = m4118m(d);
            if (m != null && !m.shouldIgnore()) {
                int i5 = m.mPosition;
                if (i5 >= i && i5 < i3) {
                    m.addFlags(2);
                    m.addChangePayload(obj);
                    ((C0813p) d.getLayoutParams()).f3318c = true;
                }
            }
        }
        this.f3200U.mo4817c(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4392a(C0794d0 d0Var) {
        C0802l lVar = this.f3188I0;
        return lVar == null || lVar.mo4659a(d0Var, d0Var.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0794d0 mo4367a(int i, boolean z) {
        int b = this.f3209a0.mo4960b();
        C0794d0 d0Var = null;
        for (int i2 = 0; i2 < b; i2++) {
            C0794d0 m = m4118m(this.f3209a0.mo4966d(i2));
            if (m != null && !m.isRemoved()) {
                if (z) {
                    if (m.mPosition != i) {
                        continue;
                    }
                } else if (m.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f3209a0.mo4965c(m.itemView)) {
                    return m;
                }
                d0Var = m;
            }
        }
        return d0Var;
    }

    /* renamed from: a */
    public C0794d0 mo4368a(long j) {
        C0797g gVar = this.f3224h0;
        C0794d0 d0Var = null;
        if (gVar != null && gVar.hasStableIds()) {
            int b = this.f3209a0.mo4960b();
            for (int i = 0; i < b; i++) {
                C0794d0 m = m4118m(this.f3209a0.mo4966d(i));
                if (m != null && !m.isRemoved() && m.getItemId() == j) {
                    if (!this.f3209a0.mo4965c(m.itemView)) {
                        return m;
                    }
                    d0Var = m;
                }
            }
        }
        return d0Var;
    }

    /* renamed from: a */
    public View mo4366a(float f, float f2) {
        for (int a = this.f3209a0.mo4954a() - 1; a >= 0; a--) {
            View c = this.f3209a0.mo4963c(a);
            float translationX = c.getTranslationX();
            float translationY = c.getTranslationY();
            if (f >= ((float) c.getLeft()) + translationX && f <= ((float) c.getRight()) + translationX && f2 >= ((float) c.getTop()) + translationY && f2 <= ((float) c.getBottom()) + translationY) {
                return c;
            }
        }
        return null;
    }

    /* renamed from: a */
    static void m4101a(View view, Rect rect) {
        C0813p pVar = (C0813p) view.getLayoutParams();
        Rect rect2 = pVar.f3317b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4376a(View view) {
        C0794d0 m = m4118m(view);
        mo4468i(view);
        C0797g gVar = this.f3224h0;
        if (!(gVar == null || m == null)) {
            gVar.onViewAttachedToWindow(m);
        }
        List<C0814q> list = this.f3252y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0814q) this.f3252y0.get(size)).mo4778b(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4393a(C0794d0 d0Var, int i) {
        if (mo4478o()) {
            d0Var.mPendingAccessibilityState = i;
            this.f3241p1.add(d0Var);
            return false;
        }
        C4187x.m14390g(d0Var.itemView, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4375a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set fast scroller without both required drawables.");
            sb.append(mo4466i());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C0863g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C4258a.fastscroll_default_thickness), resources.getDimensionPixelSize(C4258a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C4258a.fastscroll_margin));
    }

    /* renamed from: a */
    public void mo2753a(int i) {
        getScrollingChildHelper().mo14821c(i);
    }

    /* renamed from: a */
    public boolean mo4388a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo14815a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean mo4390a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo14817a(i, i2, iArr, iArr2, i3);
    }
}
