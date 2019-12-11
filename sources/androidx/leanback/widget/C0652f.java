package androidx.leanback.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.leanback.widget.C0644a0.C0645a;
import androidx.leanback.widget.C0649e.C0650a;
import androidx.leanback.widget.C0649e.C0651b;
import androidx.leanback.widget.C0668j.C0669a;
import androidx.recyclerview.widget.C0888m;
import androidx.recyclerview.widget.C0892p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0797g;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0811c;
import androidx.recyclerview.widget.RecyclerView.C0813p;
import androidx.recyclerview.widget.RecyclerView.C0820v;
import androidx.recyclerview.widget.RecyclerView.C0825z;
import androidx.recyclerview.widget.RecyclerView.C0825z.C0826a;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p096e.p113e.C3931d;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4154d.C4155a;
import p096e.p121h.p135s.p136i0.C4154d.C4156b;
import p096e.p121h.p135s.p136i0.C4154d.C4157c;

/* renamed from: androidx.leanback.widget.f */
/* compiled from: GridLayoutManager */
final class C0652f extends C0808o {

    /* renamed from: l0 */
    private static final Rect f2803l0 = new Rect();

    /* renamed from: m0 */
    static int[] f2804m0 = new int[2];

    /* renamed from: A */
    int[] f2805A;

    /* renamed from: B */
    C0820v f2806B;

    /* renamed from: C */
    int f2807C = 221696;

    /* renamed from: D */
    private C0673n f2808D = null;

    /* renamed from: E */
    private ArrayList<C0674o> f2809E = null;

    /* renamed from: F */
    C0672m f2810F = null;

    /* renamed from: G */
    int f2811G = -1;

    /* renamed from: H */
    int f2812H = 0;

    /* renamed from: I */
    C0656d f2813I;

    /* renamed from: J */
    C0659g f2814J;

    /* renamed from: K */
    private int f2815K = 0;

    /* renamed from: L */
    private int f2816L;

    /* renamed from: M */
    int f2817M;

    /* renamed from: N */
    int f2818N;

    /* renamed from: O */
    private int f2819O;

    /* renamed from: P */
    private int f2820P;

    /* renamed from: Q */
    private int[] f2821Q;

    /* renamed from: R */
    private int f2822R;

    /* renamed from: S */
    private int f2823S;

    /* renamed from: T */
    private int f2824T;

    /* renamed from: U */
    private int f2825U;

    /* renamed from: V */
    private int f2826V;

    /* renamed from: W */
    private int f2827W = 8388659;

    /* renamed from: X */
    int f2828X;

    /* renamed from: Y */
    private int f2829Y = 1;

    /* renamed from: Z */
    C0649e f2830Z;

    /* renamed from: a0 */
    private int f2831a0 = 0;

    /* renamed from: b0 */
    final C0644a0 f2832b0 = new C0644a0();

    /* renamed from: c0 */
    private final C0666i f2833c0 = new C0666i();

    /* renamed from: d0 */
    private int f2834d0;

    /* renamed from: e0 */
    private int f2835e0;

    /* renamed from: f0 */
    private int[] f2836f0 = new int[2];

    /* renamed from: g0 */
    final C0698z f2837g0 = new C0698z();

    /* renamed from: h0 */
    private C0647c f2838h0;

    /* renamed from: i0 */
    private final Runnable f2839i0 = new C0653a();

    /* renamed from: j0 */
    private C0651b f2840j0 = new C0654b();

    /* renamed from: k0 */
    C0658f f2841k0;

    /* renamed from: s */
    int f2842s = 10;

    /* renamed from: t */
    final C0638a f2843t;

    /* renamed from: u */
    int f2844u = 0;

    /* renamed from: v */
    private C0892p f2845v = C0892p.m4932a((C0808o) this);

    /* renamed from: w */
    C0788a0 f2846w;

    /* renamed from: x */
    int f2847x;

    /* renamed from: y */
    int f2848y;

    /* renamed from: z */
    final SparseIntArray f2849z = new SparseIntArray();

    /* renamed from: androidx.leanback.widget.f$a */
    /* compiled from: GridLayoutManager */
    class C0653a implements Runnable {
        C0653a() {
        }

        public void run() {
            C0652f.this.mo4685A();
        }
    }

    /* renamed from: androidx.leanback.widget.f$b */
    /* compiled from: GridLayoutManager */
    class C0654b implements C0651b {
        C0654b() {
        }

        /* renamed from: a */
        public int mo3801a() {
            return C0652f.this.f2847x;
        }

        /* renamed from: b */
        public int mo3805b(int i) {
            C0652f fVar = C0652f.this;
            View c = fVar.mo4337c(i - fVar.f2847x);
            C0652f fVar2 = C0652f.this;
            return (fVar2.f2807C & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? fVar2.mo3921u(c) : fVar2.mo3923v(c);
        }

        public int getCount() {
            return C0652f.this.f2846w.mo4531b() + C0652f.this.f2847x;
        }

        public void removeItem(int i) {
            C0652f fVar = C0652f.this;
            View c = fVar.mo4337c(i - fVar.f2847x);
            C0652f fVar2 = C0652f.this;
            if ((fVar2.f2807C & 3) == 1) {
                fVar2.mo4696a(c, fVar2.f2806B);
            } else {
                fVar2.mo4718b(c, fVar2.f2806B);
            }
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object[]] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object[], code=null, for r8v0, types: [java.lang.Object[]] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3803a(int r6, boolean r7, java.lang.Object[] r8, boolean r9) {
            /*
                r5 = this;
                androidx.leanback.widget.f r0 = androidx.leanback.widget.C0652f.this
                int r1 = r0.f2847x
                int r1 = r6 - r1
                android.view.View r0 = r0.mo3906k(r1)
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                androidx.leanback.widget.f$e r1 = (androidx.leanback.widget.C0652f.C0657e) r1
                androidx.leanback.widget.f r2 = androidx.leanback.widget.C0652f.this
                androidx.leanback.widget.a r2 = r2.f2843t
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r2.mo4439g(r0)
                androidx.leanback.widget.f r3 = androidx.leanback.widget.C0652f.this
                java.lang.Class<androidx.leanback.widget.j> r4 = androidx.leanback.widget.C0668j.class
                java.lang.Object r2 = r3.mo3839a(r2, r4)
                androidx.leanback.widget.j r2 = (androidx.leanback.widget.C0668j) r2
                r1.mo3942a(r2)
                boolean r1 = r1.mo4774d()
                r2 = 0
                if (r1 != 0) goto L_0x00b9
                if (r9 == 0) goto L_0x003c
                if (r7 == 0) goto L_0x0036
                androidx.leanback.widget.f r7 = androidx.leanback.widget.C0652f.this
                r7.mo4690a(r0)
                goto L_0x0049
            L_0x0036:
                androidx.leanback.widget.f r7 = androidx.leanback.widget.C0652f.this
                r7.mo4691a(r0, r2)
                goto L_0x0049
            L_0x003c:
                if (r7 == 0) goto L_0x0044
                androidx.leanback.widget.f r7 = androidx.leanback.widget.C0652f.this
                r7.mo4716b(r0)
                goto L_0x0049
            L_0x0044:
                androidx.leanback.widget.f r7 = androidx.leanback.widget.C0652f.this
                r7.mo4717b(r0, r2)
            L_0x0049:
                androidx.leanback.widget.f r7 = androidx.leanback.widget.C0652f.this
                int r7 = r7.f2817M
                r9 = -1
                if (r7 == r9) goto L_0x0053
                r0.setVisibility(r7)
            L_0x0053:
                androidx.leanback.widget.f r7 = androidx.leanback.widget.C0652f.this
                androidx.leanback.widget.f$g r7 = r7.f2814J
                if (r7 == 0) goto L_0x005c
                r7.mo3958m()
            L_0x005c:
                androidx.leanback.widget.f r7 = androidx.leanback.widget.C0652f.this
                android.view.View r9 = r0.findFocus()
                int r7 = r7.mo3834a(r0, r9)
                androidx.leanback.widget.f r9 = androidx.leanback.widget.C0652f.this
                int r1 = r9.f2807C
                r3 = r1 & 3
                r4 = 1
                if (r3 == r4) goto L_0x007f
                int r1 = r9.f2811G
                if (r6 != r1) goto L_0x00b4
                int r6 = r9.f2812H
                if (r7 != r6) goto L_0x00b4
                androidx.leanback.widget.f$g r6 = r9.f2814J
                if (r6 != 0) goto L_0x00b4
                r9.mo3812F()
                goto L_0x00b4
            L_0x007f:
                r3 = r1 & 4
                if (r3 != 0) goto L_0x00b4
                r1 = r1 & 16
                if (r1 != 0) goto L_0x0093
                int r1 = r9.f2811G
                if (r6 != r1) goto L_0x0093
                int r1 = r9.f2812H
                if (r7 != r1) goto L_0x0093
                r9.mo3812F()
                goto L_0x00b4
            L_0x0093:
                androidx.leanback.widget.f r9 = androidx.leanback.widget.C0652f.this
                int r1 = r9.f2807C
                r1 = r1 & 16
                if (r1 == 0) goto L_0x00b4
                int r9 = r9.f2811G
                if (r6 < r9) goto L_0x00b4
                boolean r9 = r0.hasFocusable()
                if (r9 == 0) goto L_0x00b4
                androidx.leanback.widget.f r9 = androidx.leanback.widget.C0652f.this
                r9.f2811G = r6
                r9.f2812H = r7
                int r6 = r9.f2807C
                r6 = r6 & -17
                r9.f2807C = r6
                r9.mo3812F()
            L_0x00b4:
                androidx.leanback.widget.f r6 = androidx.leanback.widget.C0652f.this
                r6.mo3928x(r0)
            L_0x00b9:
                r8[r2] = r0
                androidx.leanback.widget.f r6 = androidx.leanback.widget.C0652f.this
                int r7 = r6.f2844u
                if (r7 != 0) goto L_0x00c6
                int r6 = r6.mo3915r(r0)
                goto L_0x00ca
            L_0x00c6:
                int r6 = r6.mo3913q(r0)
            L_0x00ca:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.C0654b.mo3803a(int, boolean, java.lang.Object[], boolean):int");
        }

        /* renamed from: a */
        public void mo3804a(Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            long j;
            View view = (View) obj;
            if (i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE) {
                if (!C0652f.this.f2830Z.mo3794f()) {
                    i4 = C0652f.this.f2832b0.mo3734a().mo3755f();
                } else {
                    i4 = C0652f.this.f2832b0.mo3734a().mo3756g() - C0652f.this.f2832b0.mo3734a().mo3754e();
                }
            }
            if (!C0652f.this.f2830Z.mo3794f()) {
                i5 = i2 + i4;
                i6 = i4;
            } else {
                i6 = i4 - i2;
                i5 = i4;
            }
            int j2 = C0652f.this.mo3904j(i3) + C0652f.this.f2832b0.mo3737c().mo3755f();
            C0652f fVar = C0652f.this;
            int i7 = j2 - fVar.f2818N;
            fVar.f2837g0.mo4082a(view, i);
            C0652f.this.mo3843a(i3, view, i6, i5, i7);
            if (!C0652f.this.f2846w.mo4536g()) {
                C0652f.this.mo3900f0();
            }
            C0652f fVar2 = C0652f.this;
            if ((fVar2.f2807C & 3) != 1) {
                C0659g gVar = fVar2.f2814J;
                if (gVar != null) {
                    gVar.mo3957l();
                }
            }
            C0652f fVar3 = C0652f.this;
            if (fVar3.f2810F != null) {
                C0794d0 g = fVar3.f2843t.mo4439g(view);
                C0652f fVar4 = C0652f.this;
                C0672m mVar = fVar4.f2810F;
                C0638a aVar = fVar4.f2843t;
                if (g == null) {
                    j = -1;
                } else {
                    j = g.getItemId();
                }
                mVar.mo3987a(aVar, view, i, j);
            }
        }

        /* renamed from: a */
        public int mo3802a(int i) {
            C0652f fVar = C0652f.this;
            return fVar.mo3925w(fVar.mo4337c(i - fVar.f2847x));
        }
    }

    /* renamed from: androidx.leanback.widget.f$c */
    /* compiled from: GridLayoutManager */
    class C0655c extends C0656d {
        C0655c() {
            super();
        }

        /* renamed from: a */
        public PointF mo3933a(int i) {
            if (mo4836a() == 0) {
                return null;
            }
            C0652f fVar = C0652f.this;
            boolean z = false;
            int l = fVar.mo4749l(fVar.mo4729d(0));
            int i2 = 1;
            if ((C0652f.this.f2807C & DateUtils.FORMAT_ABBREV_RELATIVE) == 0 ? i < l : i > l) {
                z = true;
            }
            if (z) {
                i2 = -1;
            }
            if (C0652f.this.f2844u == 0) {
                return new PointF((float) i2, 0.0f);
            }
            return new PointF(0.0f, (float) i2);
        }
    }

    /* renamed from: androidx.leanback.widget.f$d */
    /* compiled from: GridLayoutManager */
    abstract class C0656d extends C0888m {

        /* renamed from: o */
        boolean f2853o;

        C0656d() {
            super(C0652f.this.f2843t.getContext());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3934a(View view, C0788a0 a0Var, C0826a aVar) {
            int i;
            int i2;
            if (C0652f.this.mo3863a(view, (View) null, C0652f.f2804m0)) {
                if (C0652f.this.f2844u == 0) {
                    int[] iArr = C0652f.f2804m0;
                    i = iArr[0];
                    i2 = iArr[1];
                } else {
                    int[] iArr2 = C0652f.f2804m0;
                    int i3 = iArr2[1];
                    i2 = iArr2[0];
                    i = i3;
                }
                aVar.mo4852a(i, i2, mo5103d((int) Math.sqrt((double) ((i * i) + (i2 * i2)))), this.f3619j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo3935e(int i) {
            int e = super.mo3935e(i);
            if (C0652f.this.f2832b0.mo3734a().mo3756g() <= 0) {
                return e;
            }
            float g = (30.0f / ((float) C0652f.this.f2832b0.mo3734a().mo3756g())) * ((float) i);
            return ((float) e) < g ? (int) g : e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo3936g() {
            super.mo3936g();
            if (!this.f2853o) {
                mo3937k();
            }
            C0652f fVar = C0652f.this;
            if (fVar.f2813I == this) {
                fVar.f2813I = null;
            }
            C0652f fVar2 = C0652f.this;
            if (fVar2.f2814J == this) {
                fVar2.f2814J = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo3937k() {
            View b = mo4842b(mo4845c());
            if (b == null) {
                if (mo4845c() >= 0) {
                    C0652f.this.mo3842a(mo4845c(), 0, false, 0);
                }
                return;
            }
            if (C0652f.this.f2811G != mo4845c()) {
                C0652f.this.f2811G = mo4845c();
            }
            if (C0652f.this.mo4761u()) {
                C0652f.this.f2807C |= 32;
                b.requestFocus();
                C0652f.this.f2807C &= -33;
            }
            C0652f.this.mo3812F();
            C0652f.this.mo3813G();
        }
    }

    /* renamed from: androidx.leanback.widget.f$e */
    /* compiled from: GridLayoutManager */
    static final class C0657e extends C0813p {

        /* renamed from: e */
        int f2855e;

        /* renamed from: f */
        int f2856f;

        /* renamed from: g */
        int f2857g;

        /* renamed from: h */
        int f2858h;

        /* renamed from: i */
        private int f2859i;

        /* renamed from: j */
        private int f2860j;

        /* renamed from: k */
        private int[] f2861k;

        /* renamed from: l */
        private C0668j f2862l;

        public C0657e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3938a(View view) {
            return (view.getHeight() - this.f2856f) - this.f2858h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3943b(View view) {
            return view.getLeft() + this.f2855e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo3945c(View view) {
            return view.getRight() - this.f2857g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo3946d(View view) {
            return view.getTop() + this.f2856f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo3947e(View view) {
            return (view.getWidth() - this.f2855e) - this.f2857g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public int[] mo3948g() {
            return this.f2861k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public int mo3949h() {
            return this.f2859i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public int mo3950i() {
            return this.f2860j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public C0668j mo3951j() {
            return this.f2862l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public int mo3952k() {
            return this.f2855e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public int mo3953l() {
            return this.f2857g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public int mo3954m() {
            return this.f2856f;
        }

        public C0657e(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3939a(int i) {
            this.f2859i = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3944b(int i) {
            this.f2860j = i;
        }

        public C0657e(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3942a(C0668j jVar) {
            this.f2862l = jVar;
        }

        public C0657e(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3941a(int i, View view) {
            C0669a[] a = this.f2862l.mo3970a();
            int[] iArr = this.f2861k;
            if (iArr == null || iArr.length != a.length) {
                this.f2861k = new int[a.length];
            }
            for (int i2 = 0; i2 < a.length; i2++) {
                this.f2861k[i2] = C0670k.m3579a(view, a[i2], i);
            }
            if (i == 0) {
                this.f2859i = this.f2861k[0];
            } else {
                this.f2860j = this.f2861k[0];
            }
        }

        public C0657e(C0813p pVar) {
            super(pVar);
        }

        public C0657e(C0657e eVar) {
            super((C0813p) eVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3940a(int i, int i2, int i3, int i4) {
            this.f2855e = i;
            this.f2856f = i2;
            this.f2857g = i3;
            this.f2858h = i4;
        }
    }

    /* renamed from: androidx.leanback.widget.f$f */
    /* compiled from: GridLayoutManager */
    public static class C0658f {
        /* renamed from: a */
        public void mo3955a(C0788a0 a0Var) {
            throw null;
        }
    }

    /* renamed from: androidx.leanback.widget.f$g */
    /* compiled from: GridLayoutManager */
    final class C0659g extends C0656d {

        /* renamed from: q */
        private final boolean f2863q;

        /* renamed from: r */
        private int f2864r;

        C0659g(int i, boolean z) {
            super();
            this.f2864r = i;
            this.f2863q = z;
            mo4846c(-2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3956a(C0826a aVar) {
            if (this.f2864r != 0) {
                super.mo3956a(aVar);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo3937k() {
            super.mo3937k();
            this.f2864r = 0;
            View b = mo4842b(mo4845c());
            if (b != null) {
                C0652f.this.mo3846a(b, true);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo3957l() {
            if (this.f2863q) {
                int i = this.f2864r;
                if (i != 0) {
                    this.f2864r = C0652f.this.mo3836a(true, i);
                }
            }
            int i2 = this.f2864r;
            if (i2 == 0 || ((i2 > 0 && C0652f.this.mo3830X()) || (this.f2864r < 0 && C0652f.this.mo3829W()))) {
                mo4846c(C0652f.this.f2811G);
                mo4850h();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3958m() {
            /*
                r4 = this;
                boolean r0 = r4.f2863q
                if (r0 != 0) goto L_0x006f
                int r0 = r4.f2864r
                if (r0 != 0) goto L_0x0009
                goto L_0x006f
            L_0x0009:
                r1 = 0
                if (r0 <= 0) goto L_0x0014
                androidx.leanback.widget.f r0 = androidx.leanback.widget.C0652f.this
                int r2 = r0.f2811G
                int r0 = r0.f2828X
            L_0x0012:
                int r2 = r2 + r0
                goto L_0x001b
            L_0x0014:
                androidx.leanback.widget.f r0 = androidx.leanback.widget.C0652f.this
                int r2 = r0.f2811G
                int r0 = r0.f2828X
            L_0x001a:
                int r2 = r2 - r0
            L_0x001b:
                int r0 = r4.f2864r
                if (r0 == 0) goto L_0x0052
                android.view.View r0 = r4.mo4842b(r2)
                if (r0 != 0) goto L_0x0026
                goto L_0x0052
            L_0x0026:
                androidx.leanback.widget.f r3 = androidx.leanback.widget.C0652f.this
                boolean r3 = r3.mo3912p(r0)
                if (r3 != 0) goto L_0x002f
                goto L_0x0044
            L_0x002f:
                androidx.leanback.widget.f r1 = androidx.leanback.widget.C0652f.this
                r1.f2811G = r2
                r3 = 0
                r1.f2812H = r3
                int r1 = r4.f2864r
                if (r1 <= 0) goto L_0x003f
                int r1 = r1 + -1
                r4.f2864r = r1
                goto L_0x0043
            L_0x003f:
                int r1 = r1 + 1
                r4.f2864r = r1
            L_0x0043:
                r1 = r0
            L_0x0044:
                int r0 = r4.f2864r
                if (r0 <= 0) goto L_0x004d
                androidx.leanback.widget.f r0 = androidx.leanback.widget.C0652f.this
                int r0 = r0.f2828X
                goto L_0x0012
            L_0x004d:
                androidx.leanback.widget.f r0 = androidx.leanback.widget.C0652f.this
                int r0 = r0.f2828X
                goto L_0x001a
            L_0x0052:
                if (r1 == 0) goto L_0x006f
                androidx.leanback.widget.f r0 = androidx.leanback.widget.C0652f.this
                boolean r0 = r0.mo4761u()
                if (r0 == 0) goto L_0x006f
                androidx.leanback.widget.f r0 = androidx.leanback.widget.C0652f.this
                int r2 = r0.f2807C
                r2 = r2 | 32
                r0.f2807C = r2
                r1.requestFocus()
                androidx.leanback.widget.f r0 = androidx.leanback.widget.C0652f.this
                int r1 = r0.f2807C
                r1 = r1 & -33
                r0.f2807C = r1
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.C0659g.mo3958m():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo3959n() {
            int i = this.f2864r;
            if (i > (-C0652f.this.f2842s)) {
                this.f2864r = i - 1;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo3960o() {
            int i = this.f2864r;
            if (i < C0652f.this.f2842s) {
                this.f2864r = i + 1;
            }
        }

        /* renamed from: a */
        public PointF mo3933a(int i) {
            int i2 = this.f2864r;
            if (i2 == 0) {
                return null;
            }
            int i3 = ((C0652f.this.f2807C & DateUtils.FORMAT_ABBREV_RELATIVE) == 0 ? i2 >= 0 : i2 <= 0) ? 1 : -1;
            if (C0652f.this.f2844u == 0) {
                return new PointF((float) i3, 0.0f);
            }
            return new PointF(0.0f, (float) i3);
        }
    }

    /* renamed from: androidx.leanback.widget.f$h */
    /* compiled from: GridLayoutManager */
    static final class C0660h implements Parcelable {
        public static final Creator<C0660h> CREATOR = new C0661a();

        /* renamed from: U */
        Bundle f2866U = Bundle.EMPTY;

        /* renamed from: c */
        int f2867c;

        /* renamed from: androidx.leanback.widget.f$h$a */
        /* compiled from: GridLayoutManager */
        static class C0661a implements Creator<C0660h> {
            C0661a() {
            }

            public C0660h createFromParcel(Parcel parcel) {
                return new C0660h(parcel);
            }

            public C0660h[] newArray(int i) {
                return new C0660h[i];
            }
        }

        C0660h(Parcel parcel) {
            this.f2867c = parcel.readInt();
            this.f2866U = parcel.readBundle(C0652f.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2867c);
            parcel.writeBundle(this.f2866U);
        }

        C0660h() {
        }
    }

    public C0652f(C0638a aVar) {
        this.f2843t = aVar;
        this.f2817M = -1;
        mo4705a(false);
    }

    /* renamed from: C */
    private int m3361C(View view) {
        return this.f2844u == 0 ? m3365E(view) : m3367F(view);
    }

    /* renamed from: D */
    private int m3362D(int i) {
        return m3404z(mo4729d(i));
    }

    /* renamed from: E */
    private int m3365E(View view) {
        C0657e eVar = (C0657e) view.getLayoutParams();
        return eVar.mo3943b(view) + eVar.mo3949h();
    }

    /* renamed from: g0 */
    private boolean m3385g0() {
        return this.f2830Z.mo3777a();
    }

    /* renamed from: h */
    private boolean m3386h(boolean z) {
        C3931d dVar;
        int i;
        int i2;
        int i3;
        if (this.f2820P != 0 || this.f2821Q == null) {
            return false;
        }
        C0649e eVar = this.f2830Z;
        C3931d[] c = eVar == null ? null : eVar.mo3788c();
        boolean z2 = false;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f2828X; i5++) {
            if (c == null) {
                dVar = null;
            } else {
                dVar = c[i5];
            }
            if (dVar == null) {
                i = 0;
            } else {
                i = dVar.mo14056d();
            }
            int i6 = -1;
            for (int i7 = 0; i7 < i; i7 += 2) {
                int b = dVar.mo14054b(i7 + 1);
                for (int b2 = dVar.mo14054b(i7); b2 <= b; b2++) {
                    View c2 = mo4337c(b2 - this.f2847x);
                    if (c2 != null) {
                        if (z) {
                            mo3928x(c2);
                        }
                        if (this.f2844u == 0) {
                            i3 = mo3913q(c2);
                        } else {
                            i3 = mo3915r(c2);
                        }
                        if (i3 > i6) {
                            i6 = i3;
                        }
                    }
                }
            }
            int b3 = this.f2846w.mo4531b();
            if (!this.f2843t.mo4471j() && z && i6 < 0 && b3 > 0) {
                if (i4 < 0) {
                    int i8 = this.f2811G;
                    if (i8 < 0) {
                        i8 = 0;
                    } else if (i8 >= b3) {
                        i8 = b3 - 1;
                    }
                    if (mo4732e() > 0) {
                        int layoutPosition = this.f2843t.mo4439g(mo4729d(0)).getLayoutPosition();
                        int layoutPosition2 = this.f2843t.mo4439g(mo4729d(mo4732e() - 1)).getLayoutPosition();
                        if (i2 >= layoutPosition && i2 <= layoutPosition2) {
                            i2 = i2 - layoutPosition <= layoutPosition2 - i2 ? layoutPosition - 1 : layoutPosition2 + 1;
                            if (i2 < 0 && layoutPosition2 < b3 - 1) {
                                i2 = layoutPosition2 + 1;
                            } else if (i2 >= b3 && layoutPosition > 0) {
                                i2 = layoutPosition - 1;
                            }
                        }
                    }
                    if (i2 >= 0 && i2 < b3) {
                        m3374a(i2, MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0), this.f2836f0);
                        i4 = this.f2844u == 0 ? this.f2836f0[1] : this.f2836f0[0];
                    }
                }
                if (i4 >= 0) {
                    i6 = i4;
                }
            }
            if (i6 < 0) {
                i6 = 0;
            }
            int[] iArr = this.f2821Q;
            if (iArr[i5] != i6) {
                iArr[i5] = i6;
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: h0 */
    private void m3387h0() {
        this.f2830Z.mo3772a((this.f2807C & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? (-this.f2835e0) - this.f2848y : this.f2834d0 + this.f2835e0 + this.f2848y);
    }

    /* renamed from: i0 */
    private void m3388i0() {
        this.f2830Z = null;
        this.f2821Q = null;
        this.f2807C &= -1025;
    }

    /* renamed from: j0 */
    private void m3389j0() {
        int i;
        int e = mo4732e();
        int b = this.f2830Z.mo3780b();
        this.f2807C &= -9;
        boolean z = false;
        int i2 = b;
        int i3 = 0;
        while (true) {
            if (i3 >= e) {
                break;
            }
            View d = mo4729d(i3);
            if (i2 != m3404z(d)) {
                break;
            }
            C0650a d2 = this.f2830Z.mo3790d(i2);
            if (d2 == null) {
                break;
            }
            int j = (mo3904j(d2.f2802a) + this.f2832b0.mo3737c().mo3755f()) - this.f2818N;
            int v = mo3923v(d);
            int w = mo3925w(d);
            if (((C0657e) d.getLayoutParams()).mo4776f()) {
                this.f2807C |= 8;
                mo4696a(d, this.f2806B);
                d = mo3906k(i2);
                mo4717b(d, i3);
            }
            View view = d;
            mo3928x(view);
            if (this.f2844u == 0) {
                i = mo3915r(view);
            } else {
                i = mo3913q(view);
            }
            mo3843a(d2.f2802a, view, v, v + i, j);
            if (w != i) {
                break;
            }
            i3++;
            i2++;
        }
        z = true;
        if (z) {
            int d3 = this.f2830Z.mo3789d();
            for (int i4 = e - 1; i4 >= i3; i4--) {
                mo4696a(mo4729d(i4), this.f2806B);
            }
            this.f2830Z.mo3793f(i2);
            if ((this.f2807C & DateUtils.FORMAT_ABBREV_MONTH) == 0) {
                while (this.f2830Z.mo3777a()) {
                    if (this.f2830Z.mo3789d() >= d3) {
                        break;
                    }
                }
            } else {
                m3387h0();
                int i5 = this.f2811G;
                if (i5 >= 0 && i5 <= d3) {
                    while (this.f2830Z.mo3789d() < this.f2811G) {
                        this.f2830Z.mo3777a();
                    }
                }
            }
        }
        mo3900f0();
        m3402w0();
    }

    /* renamed from: k0 */
    private void m3390k0() {
        C4187x.m14363a((View) this.f2843t, this.f2839i0);
    }

    /* renamed from: l0 */
    private int m3391l0() {
        int i = (this.f2807C & DateUtils.FORMAT_ABBREV_ALL) != 0 ? 0 : this.f2828X - 1;
        return mo3904j(i) + m3366F(i);
    }

    /* renamed from: m0 */
    private void m3392m0() {
        this.f2832b0.mo3736b();
        this.f2832b0.f2778c.mo3746b(mo4758r());
        this.f2832b0.f2777b.mo3746b(mo4741h());
        this.f2832b0.f2778c.mo3747b(mo4754o(), mo4756p());
        this.f2832b0.f2777b.mo3747b(mo4757q(), mo4752n());
        this.f2834d0 = this.f2832b0.mo3734a().mo3756g();
        this.f2818N = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (((r5.f2807C & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_RELATIVE) != 0) != r5.f2830Z.mo3794f()) goto L_0x0076;
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3393n0() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r5.f2846w
            int r0 = r0.mo4531b()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0010
            r5.f2811G = r1
            r5.f2812H = r3
            goto L_0x0022
        L_0x0010:
            int r4 = r5.f2811G
            if (r4 < r0) goto L_0x001a
            int r0 = r0 - r2
            r5.f2811G = r0
            r5.f2812H = r3
            goto L_0x0022
        L_0x001a:
            if (r4 != r1) goto L_0x0022
            if (r0 <= 0) goto L_0x0022
            r5.f2811G = r3
            r5.f2812H = r3
        L_0x0022:
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r5.f2846w
            boolean r0 = r0.mo4530a()
            if (r0 != 0) goto L_0x0052
            androidx.leanback.widget.e r0 = r5.f2830Z
            if (r0 == 0) goto L_0x0052
            int r0 = r0.mo3780b()
            if (r0 < 0) goto L_0x0052
            int r0 = r5.f2807C
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0052
            androidx.leanback.widget.e r0 = r5.f2830Z
            int r0 = r0.mo3791e()
            int r1 = r5.f2828X
            if (r0 != r1) goto L_0x0052
            r5.m3401v0()
            r5.m3402w0()
            androidx.leanback.widget.e r0 = r5.f2830Z
            int r1 = r5.f2825U
            r0.mo3799i(r1)
            return r2
        L_0x0052:
            int r0 = r5.f2807C
            r0 = r0 & -257(0xfffffffffffffeff, float:NaN)
            r5.f2807C = r0
            androidx.leanback.widget.e r0 = r5.f2830Z
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == 0) goto L_0x0076
            int r4 = r5.f2828X
            int r0 = r0.mo3791e()
            if (r4 != r0) goto L_0x0076
            int r0 = r5.f2807C
            r0 = r0 & r1
            if (r0 == 0) goto L_0x006d
            r0 = 1
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            androidx.leanback.widget.e r4 = r5.f2830Z
            boolean r4 = r4.mo3794f()
            if (r0 == r4) goto L_0x0091
        L_0x0076:
            int r0 = r5.f2828X
            androidx.leanback.widget.e r0 = androidx.leanback.widget.C0649e.m3322k(r0)
            r5.f2830Z = r0
            androidx.leanback.widget.e r0 = r5.f2830Z
            androidx.leanback.widget.e$b r4 = r5.f2840j0
            r0.mo3774a(r4)
            androidx.leanback.widget.e r0 = r5.f2830Z
            int r4 = r5.f2807C
            r1 = r1 & r4
            if (r1 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            r0.mo3775a(r2)
        L_0x0091:
            r5.m3392m0()
            r5.m3402w0()
            androidx.leanback.widget.e r0 = r5.f2830Z
            int r1 = r5.f2825U
            r0.mo3799i(r1)
            androidx.recyclerview.widget.RecyclerView$v r0 = r5.f2806B
            r5.mo4699a(r0)
            androidx.leanback.widget.e r0 = r5.f2830Z
            r0.mo3797h()
            androidx.leanback.widget.a0 r0 = r5.f2832b0
            androidx.leanback.widget.a0$a r0 = r0.mo3734a()
            r0.mo3761l()
            androidx.leanback.widget.a0 r0 = r5.f2832b0
            androidx.leanback.widget.a0$a r0 = r0.mo3734a()
            r0.mo3760k()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.m3393n0():boolean");
    }

    /* renamed from: o0 */
    private void m3394o0() {
        this.f2806B = null;
        this.f2846w = null;
        this.f2847x = 0;
        this.f2848y = 0;
    }

    /* renamed from: p0 */
    private boolean m3395p0() {
        return this.f2830Z.mo3796g();
    }

    /* renamed from: q0 */
    private void m3396q0() {
        this.f2830Z.mo3795g((this.f2807C & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? this.f2834d0 + this.f2835e0 + this.f2848y : (-this.f2835e0) - this.f2848y);
    }

    /* renamed from: r0 */
    private void m3397r0() {
        int i = this.f2807C;
        if ((65600 & i) == 65536) {
            this.f2830Z.mo3783b(this.f2811G, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? -this.f2835e0 : this.f2834d0 + this.f2835e0);
        }
    }

    /* renamed from: s0 */
    private void m3398s0() {
        int i = this.f2807C;
        if ((65600 & i) == 65536) {
            this.f2830Z.mo3786c(this.f2811G, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? this.f2834d0 + this.f2835e0 : -this.f2835e0);
        }
    }

    /* renamed from: t0 */
    private void m3399t0() {
        int e = mo4732e();
        for (int i = 0; i < e; i++) {
            m3369G(mo4729d(i));
        }
    }

    /* renamed from: u0 */
    private void m3400u0() {
        int i = this.f2807C & -1025;
        int i2 = 0;
        if (m3386h(false)) {
            i2 = 1024;
        }
        this.f2807C = i | i2;
        if ((this.f2807C & 1024) != 0) {
            m3390k0();
        }
    }

    /* renamed from: v0 */
    private void m3401v0() {
        this.f2832b0.f2778c.mo3746b(mo4758r());
        this.f2832b0.f2777b.mo3746b(mo4741h());
        this.f2832b0.f2778c.mo3747b(mo4754o(), mo4756p());
        this.f2832b0.f2777b.mo3747b(mo4757q(), mo4752n());
        this.f2834d0 = this.f2832b0.mo3734a().mo3756g();
    }

    /* renamed from: w0 */
    private void m3402w0() {
        C0645a c = this.f2832b0.mo3737c();
        int f = c.mo3755f() - this.f2818N;
        int l0 = m3391l0() + f;
        c.mo3743a(f, l0, f, l0);
    }

    /* renamed from: A */
    public void mo3808A(int i) {
        this.f2832b0.mo3734a().mo3750c(i);
    }

    /* renamed from: B */
    public void mo3809B(int i) {
        this.f2832b0.mo3734a().mo3753d(i);
    }

    /* renamed from: E */
    public boolean mo3811E() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public void mo3812F() {
        long j;
        if (this.f2808D != null || mo3832Z()) {
            int i = this.f2811G;
            View c = i == -1 ? null : mo4337c(i);
            int i2 = 0;
            if (c != null) {
                C0794d0 g = this.f2843t.mo4439g(c);
                C0673n nVar = this.f2808D;
                if (nVar != null) {
                    C0638a aVar = this.f2843t;
                    int i3 = this.f2811G;
                    if (g == null) {
                        j = -1;
                    } else {
                        j = g.getItemId();
                    }
                    nVar.mo3988a(aVar, c, i3, j);
                }
                mo3859a((RecyclerView) this.f2843t, g, this.f2811G, this.f2812H);
            } else {
                C0673n nVar2 = this.f2808D;
                if (nVar2 != null) {
                    nVar2.mo3988a(this.f2843t, null, -1, -1);
                }
                mo3859a((RecyclerView) this.f2843t, (C0794d0) null, -1, 0);
            }
            if ((this.f2807C & 3) != 1 && !this.f2843t.isLayoutRequested()) {
                int e = mo4732e();
                while (true) {
                    if (i2 >= e) {
                        break;
                    } else if (mo4729d(i2).isLayoutRequested()) {
                        m3390k0();
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo3813G() {
        if (mo3832Z()) {
            int i = this.f2811G;
            View c = i == -1 ? null : mo4337c(i);
            if (c != null) {
                mo3879b((RecyclerView) this.f2843t, this.f2843t.mo4439g(c), this.f2811G, this.f2812H);
            } else {
                C0673n nVar = this.f2808D;
                if (nVar != null) {
                    nVar.mo3988a(this.f2843t, null, -1, -1);
                }
                mo3879b((RecyclerView) this.f2843t, (C0794d0) null, -1, 0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo3814H() {
        List f = this.f2806B.mo4825f();
        int size = f.size();
        if (size != 0) {
            int[] iArr = this.f2805A;
            if (iArr == null || size > iArr.length) {
                int[] iArr2 = this.f2805A;
                int length = iArr2 == null ? 16 : iArr2.length;
                while (length < size) {
                    length <<= 1;
                }
                this.f2805A = new int[length];
            }
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int adapterPosition = ((C0794d0) f.get(i2)).getAdapterPosition();
                if (adapterPosition >= 0) {
                    int i3 = i + 1;
                    this.f2805A[i] = adapterPosition;
                    i = i3;
                }
            }
            if (i > 0) {
                Arrays.sort(this.f2805A, 0, i);
                this.f2830Z.mo3776a(this.f2805A, i, this.f2849z);
            }
            this.f2849z.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public int mo3815I() {
        return this.f2835e0;
    }

    /* renamed from: J */
    public int mo3816J() {
        return this.f2831a0;
    }

    /* renamed from: K */
    public int mo3817K() {
        return this.f2823S;
    }

    /* renamed from: L */
    public int mo3818L() {
        return this.f2833c0.mo3967a().mo3975b();
    }

    /* renamed from: M */
    public float mo3819M() {
        return this.f2833c0.mo3967a().mo3977c();
    }

    /* renamed from: N */
    public int mo3820N() {
        return this.f2833c0.mo3967a().mo3978d();
    }

    /* renamed from: O */
    public int mo3821O() {
        return this.f2811G;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public int mo3822P() {
        int i;
        int i2;
        if (this.f2844u == 1) {
            i2 = -mo4741h();
            if (mo4732e() <= 0) {
                return i2;
            }
            i = mo4729d(0).getTop();
            if (i >= 0) {
                return i2;
            }
        } else if ((this.f2807C & DateUtils.FORMAT_ABBREV_RELATIVE) != 0) {
            int r = mo4758r();
            if (mo4732e() <= 0) {
                return r;
            }
            int right = mo4729d(0).getRight();
            if (right > r) {
                return right;
            }
            return r;
        } else {
            i2 = -mo4758r();
            if (mo4732e() <= 0) {
                return i2;
            }
            i = mo4729d(0).getLeft();
            if (i >= 0) {
                return i2;
            }
        }
        return i2 + i;
    }

    /* renamed from: Q */
    public int mo3823Q() {
        return this.f2812H;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public String mo3824R() {
        StringBuilder sb = new StringBuilder();
        sb.append("GridLayoutManager:");
        sb.append(this.f2843t.getId());
        return sb.toString();
    }

    /* renamed from: S */
    public int mo3825S() {
        return this.f2824T;
    }

    /* renamed from: T */
    public int mo3826T() {
        return this.f2832b0.mo3734a().mo3757h();
    }

    /* renamed from: U */
    public int mo3827U() {
        return this.f2832b0.mo3734a().mo3758i();
    }

    /* renamed from: V */
    public float mo3828V() {
        return this.f2832b0.mo3734a().mo3759j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W */
    public boolean mo3829W() {
        if (mo4745j() == 0 || this.f2843t.mo4408c(0) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public boolean mo3830X() {
        int j = mo4745j();
        if (j == 0 || this.f2843t.mo4408c(j - 1) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public boolean mo3831Y() {
        return this.f2830Z != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public boolean mo3832Z() {
        ArrayList<C0674o> arrayList = this.f2809E;
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: a */
    public void mo3840a(float f) {
        this.f2833c0.mo3967a().mo3972a(f);
        m3399t0();
    }

    /* renamed from: a */
    public boolean mo3866a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    /* renamed from: a0 */
    public boolean mo3869a0() {
        return (this.f2807C & DateUtils.FORMAT_NUMERIC_DATE) != 0;
    }

    /* renamed from: b */
    public void mo3872b(float f) {
        this.f2832b0.mo3734a().mo3742a(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b0 */
    public boolean mo3883b0() {
        return (this.f2807C & 64) != 0;
    }

    /* renamed from: c */
    public void mo3886c(boolean z) {
        this.f2833c0.mo3967a().mo3974a(z);
        m3399t0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c0 */
    public void mo3887c0() {
        C0656d dVar = this.f2813I;
        if (dVar != null) {
            dVar.f2853o = true;
        }
    }

    /* renamed from: d */
    public void mo3890d(RecyclerView recyclerView) {
        this.f2815K = 0;
        this.f2837g0.mo4083b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d0 */
    public void mo3892d0() {
        if (mo4732e() > 0) {
            this.f2847x = this.f2830Z.mo3780b() - ((C0657e) mo4729d(0).getLayoutParams()).mo4772b();
            return;
        }
        this.f2847x = 0;
    }

    /* renamed from: e */
    public int mo3893e(View view) {
        return super.mo3893e(view) - ((C0657e) view.getLayoutParams()).f2858h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e0 */
    public void mo3897e0() {
        this.f2849z.clear();
        int e = mo4732e();
        for (int i = 0; i < e; i++) {
            int oldPosition = this.f2843t.mo4439g(mo4729d(i)).getOldPosition();
            if (oldPosition >= 0) {
                C0650a d = this.f2830Z.mo3790d(oldPosition);
                if (d != null) {
                    this.f2849z.put(oldPosition, d.f2802a);
                }
            }
        }
    }

    /* renamed from: f */
    public int mo3898f(View view) {
        return super.mo3898f(view) + ((C0657e) view.getLayoutParams()).f2855e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f0 */
    public void mo3900f0() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f2846w.mo4531b() != 0) {
            if ((this.f2807C & DateUtils.FORMAT_ABBREV_RELATIVE) == 0) {
                i4 = this.f2830Z.mo3789d();
                i3 = this.f2846w.mo4531b() - 1;
                i2 = this.f2830Z.mo3780b();
                i = 0;
            } else {
                i4 = this.f2830Z.mo3780b();
                i2 = this.f2830Z.mo3789d();
                i = this.f2846w.mo4531b() - 1;
                i3 = 0;
            }
            if (i4 >= 0 && i2 >= 0) {
                boolean z = i4 == i3;
                boolean z2 = i2 == i;
                if (z || !this.f2832b0.mo3734a().mo3762m() || z2 || !this.f2832b0.mo3734a().mo3763n()) {
                    int i7 = Integer.MAX_VALUE;
                    if (z) {
                        i7 = this.f2830Z.mo3771a(true, f2804m0);
                        View c = mo4337c(f2804m0[1]);
                        i5 = m3361C(c);
                        int[] g = ((C0657e) c.getLayoutParams()).mo3948g();
                        if (g != null && g.length > 0) {
                            i5 += g[g.length - 1] - g[0];
                        }
                    } else {
                        i5 = Integer.MAX_VALUE;
                    }
                    int i8 = Integer.MIN_VALUE;
                    if (z2) {
                        i8 = this.f2830Z.mo3782b(false, f2804m0);
                        i6 = m3361C(mo4337c(f2804m0[1]));
                    } else {
                        i6 = Integer.MIN_VALUE;
                    }
                    this.f2832b0.mo3734a().mo3743a(i8, i7, i6, i5);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo3901g(C0788a0 a0Var) {
        C0658f fVar = this.f2841k0;
        if (fVar != null) {
            fVar.mo3955a(a0Var);
            throw null;
        }
    }

    /* renamed from: i */
    public int mo3902i(View view) {
        return super.mo3902i(view) - ((C0657e) view.getLayoutParams()).f2857g;
    }

    /* renamed from: j */
    public int mo3905j(View view) {
        return super.mo3905j(view) + ((C0657e) view.getLayoutParams()).f2856f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public View mo3906k(int i) {
        return this.f2806B.mo4820d(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo3907l(int i) {
        C0794d0 c = this.f2843t.mo4408c(i);
        boolean z = false;
        if (c == null) {
            return false;
        }
        if (c.itemView.getLeft() >= 0 && c.itemView.getRight() <= this.f2843t.getWidth() && c.itemView.getTop() >= 0 && c.itemView.getBottom() <= this.f2843t.getHeight()) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3908m(int r6) {
        /*
            r5 = this;
            int r0 = r5.f2844u
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            if (r6 != r2) goto L_0x000b
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0011
        L_0x000b:
            r0 = 0
            goto L_0x0011
        L_0x000d:
            if (r6 != r2) goto L_0x000b
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x0011:
            int r3 = r5.f2807C
            r4 = 786432(0xc0000, float:1.102026E-39)
            r4 = r4 & r3
            if (r4 != r0) goto L_0x0019
            return
        L_0x0019:
            r4 = -786433(0xfffffffffff3ffff, float:NaN)
            r3 = r3 & r4
            r0 = r0 | r3
            r5.f2807C = r0
            int r0 = r5.f2807C
            r0 = r0 | 256(0x100, float:3.59E-43)
            r5.f2807C = r0
            androidx.leanback.widget.a0 r0 = r5.f2832b0
            androidx.leanback.widget.a0$a r0 = r0.f2778c
            if (r6 != r2) goto L_0x002d
            r1 = 1
        L_0x002d:
            r0.mo3751c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.mo3908m(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo3909n(int i) {
        this.f2817M = i;
        if (this.f2817M != -1) {
            int e = mo4732e();
            for (int i2 = 0; i2 < e; i2++) {
                mo4729d(i2).setVisibility(this.f2817M);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo3910o(int i) {
        int i2 = this.f2835e0;
        if (i2 != i) {
            if (i2 >= 0) {
                this.f2835e0 = i;
                mo4685A();
                return;
            }
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
    }

    /* renamed from: p */
    public void mo3911p(int i) {
        this.f2831a0 = i;
    }

    /* renamed from: q */
    public void mo3914q(int i) {
        this.f2827W = i;
    }

    /* renamed from: r */
    public void mo3916r(int i) {
        if (this.f2844u == 0) {
            this.f2823S = i;
            this.f2825U = i;
            return;
        }
        this.f2823S = i;
        this.f2826V = i;
    }

    /* renamed from: s */
    public void mo3918s(int i) {
        this.f2833c0.mo3967a().mo3973a(i);
        m3399t0();
    }

    /* renamed from: t */
    public void mo3920t(int i) {
        this.f2833c0.mo3967a().mo3976b(i);
        m3399t0();
    }

    /* renamed from: u */
    public void mo3922u(int i) {
        this.f2823S = i;
        this.f2824T = i;
        this.f2826V = i;
        this.f2825U = i;
    }

    /* renamed from: v */
    public void mo3924v(int i) {
        if (i >= 0) {
            this.f2829Y = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w */
    public void mo3926w(int i) {
        if (i == 0 || i == 1) {
            this.f2844u = i;
            this.f2845v = C0892p.m4933a(this, this.f2844u);
            this.f2832b0.mo3735a(i);
            this.f2833c0.mo3968a(i);
            this.f2807C |= 256;
        }
    }

    /* renamed from: x */
    public void mo3927x(int i) {
        if (i >= 0 || i == -2) {
            this.f2819O = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid row height: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: y */
    public void mo3929y(int i) {
        mo3874b(i, 0, true, 0);
    }

    /* renamed from: z */
    public void mo3931z(int i) {
        if (this.f2844u == 1) {
            this.f2824T = i;
            this.f2825U = i;
            return;
        }
        this.f2824T = i;
        this.f2826V = i;
    }

    /* renamed from: A */
    private int m3359A(View view) {
        return this.f2832b0.mo3734a().mo3740a(m3361C(view));
    }

    /* renamed from: B */
    private int m3360B(View view) {
        return this.f2832b0.mo3737c().mo3740a(m3363D(view));
    }

    /* renamed from: D */
    private int m3363D(View view) {
        return this.f2844u == 0 ? m3367F(view) : m3365E(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r7 < r0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r7 > r0) goto L_0x0040;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m3371I(int r7) {
        /*
            r6 = this;
            int r0 = r6.f2807C
            r1 = r0 & 64
            r2 = 1
            if (r1 != 0) goto L_0x0041
            r0 = r0 & 3
            if (r0 == r2) goto L_0x0041
            if (r7 <= 0) goto L_0x0026
            androidx.leanback.widget.a0 r0 = r6.f2832b0
            androidx.leanback.widget.a0$a r0 = r0.mo3734a()
            boolean r0 = r0.mo3762m()
            if (r0 != 0) goto L_0x0041
            androidx.leanback.widget.a0 r0 = r6.f2832b0
            androidx.leanback.widget.a0$a r0 = r0.mo3734a()
            int r0 = r0.mo3749c()
            if (r7 <= r0) goto L_0x0041
            goto L_0x0040
        L_0x0026:
            if (r7 >= 0) goto L_0x0041
            androidx.leanback.widget.a0 r0 = r6.f2832b0
            androidx.leanback.widget.a0$a r0 = r0.mo3734a()
            boolean r0 = r0.mo3763n()
            if (r0 != 0) goto L_0x0041
            androidx.leanback.widget.a0 r0 = r6.f2832b0
            androidx.leanback.widget.a0$a r0 = r0.mo3734a()
            int r0 = r0.mo3752d()
            if (r7 >= r0) goto L_0x0041
        L_0x0040:
            r7 = r0
        L_0x0041:
            r0 = 0
            if (r7 != 0) goto L_0x0045
            return r0
        L_0x0045:
            int r1 = -r7
            r6.m3368G(r1)
            int r1 = r6.f2807C
            r1 = r1 & 3
            if (r1 != r2) goto L_0x0053
            r6.mo3900f0()
            return r7
        L_0x0053:
            int r1 = r6.mo4732e()
            int r3 = r6.f2807C
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0061
            if (r7 <= 0) goto L_0x0067
            goto L_0x0063
        L_0x0061:
            if (r7 >= 0) goto L_0x0067
        L_0x0063:
            r6.m3396q0()
            goto L_0x006a
        L_0x0067:
            r6.m3387h0()
        L_0x006a:
            int r3 = r6.mo4732e()
            if (r3 <= r1) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            int r3 = r6.mo4732e()
            int r5 = r6.f2807C
            r4 = r4 & r5
            if (r4 == 0) goto L_0x007f
            if (r7 <= 0) goto L_0x0085
            goto L_0x0081
        L_0x007f:
            if (r7 >= 0) goto L_0x0085
        L_0x0081:
            r6.m3397r0()
            goto L_0x0088
        L_0x0085:
            r6.m3398s0()
        L_0x0088:
            int r4 = r6.mo4732e()
            if (r4 >= r3) goto L_0x008f
            r0 = 1
        L_0x008f:
            r0 = r0 | r1
            if (r0 == 0) goto L_0x0095
            r6.m3400u0()
        L_0x0095:
            androidx.leanback.widget.a r0 = r6.f2843t
            r0.invalidate()
            r6.mo3900f0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.m3371I(int):int");
    }

    /* renamed from: J */
    private int m3372J(int i) {
        if (i == 0) {
            return 0;
        }
        m3370H(-i);
        this.f2818N += i;
        m3402w0();
        this.f2843t.invalidate();
        return i;
    }

    /* renamed from: f */
    private void m3383f(C0820v vVar, C0788a0 a0Var) {
        if (!(this.f2806B == null && this.f2846w == null)) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.f2806B = vVar;
        this.f2846w = a0Var;
        this.f2847x = 0;
        this.f2848y = 0;
    }

    /* renamed from: y */
    private int m3403y(View view) {
        C0638a aVar = this.f2843t;
        if (!(aVar == null || view == aVar)) {
            View c = mo4722c(view);
            if (c != null) {
                int e = mo4732e();
                for (int i = 0; i < e; i++) {
                    if (mo4729d(i) == c) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public int mo3810C(int i) {
        C0655c cVar = new C0655c();
        cVar.mo4846c(i);
        mo3877b((C0825z) cVar);
        return cVar.mo4845c();
    }

    /* renamed from: b */
    public void mo3881b(boolean z, boolean z2) {
        int i = 0;
        int i2 = (z ? ContentServiceClientExtras.URL_SIZE_LIMIT : 0) | (this.f2807C & -24577);
        if (z2) {
            i = DateUtils.FORMAT_ABBREV_TIME;
        }
        this.f2807C = i2 | i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo3904j(int i) {
        int i2 = 0;
        if ((this.f2807C & DateUtils.FORMAT_ABBREV_ALL) != 0) {
            for (int i3 = this.f2828X - 1; i3 > i; i3--) {
                i2 += m3366F(i3) + this.f2826V;
            }
            return i2;
        }
        int i4 = 0;
        while (i2 < i) {
            i4 += m3366F(i2) + this.f2826V;
            i2++;
        }
        return i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo3912p(View view) {
        return view.getVisibility() == 0 && (!mo4761u() || view.hasFocusable());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public int mo3913q(View view) {
        C0657e eVar = (C0657e) view.getLayoutParams();
        return mo4738g(view) + eVar.topMargin + eVar.bottomMargin;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r10 != 130) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if ((r9.f2807C & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_ALL) == 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if ((r9.f2807C & net.danlew.android.joda.DateUtils.FORMAT_ABBREV_ALL) == 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r10 != 130) goto L_0x0046;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m3364E(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2844u
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 17
            r8 = 1
            if (r0 != 0) goto L_0x002b
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r7) goto L_0x0025
            if (r10 == r3) goto L_0x0023
            if (r10 == r2) goto L_0x001d
            if (r10 == r1) goto L_0x001b
            goto L_0x0046
        L_0x001b:
            r4 = 3
            goto L_0x0048
        L_0x001d:
            int r10 = r9.f2807C
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0048
            goto L_0x0038
        L_0x0023:
            r4 = 2
            goto L_0x0048
        L_0x0025:
            int r10 = r9.f2807C
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0038
            goto L_0x0048
        L_0x002b:
            if (r0 != r8) goto L_0x0046
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r7) goto L_0x0040
            if (r10 == r3) goto L_0x0048
            if (r10 == r2) goto L_0x003a
            if (r10 == r1) goto L_0x0038
            goto L_0x0046
        L_0x0038:
            r4 = 1
            goto L_0x0048
        L_0x003a:
            int r10 = r9.f2807C
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0023
            goto L_0x001b
        L_0x0040:
            int r10 = r9.f2807C
            r10 = r10 & r0
            if (r10 != 0) goto L_0x001b
            goto L_0x0023
        L_0x0046:
            r4 = 17
        L_0x0048:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.m3364E(int):int");
    }

    /* renamed from: g */
    private void m3384g(boolean z) {
        if (!z ? !mo3829W() : !mo3830X()) {
            C0659g gVar = this.f2814J;
            if (gVar == null) {
                this.f2843t.mo4526y();
                boolean z2 = true;
                int i = z ? 1 : -1;
                if (this.f2828X <= 1) {
                    z2 = false;
                }
                C0659g gVar2 = new C0659g(i, z2);
                this.f2815K = 0;
                mo3877b((C0825z) gVar2);
            } else if (z) {
                gVar.mo3960o();
            } else {
                gVar.mo3959n();
            }
        }
    }

    /* renamed from: a */
    public void mo3861a(boolean z, boolean z2) {
        int i = 0;
        int i2 = (z ? DateUtils.FORMAT_NO_MIDNIGHT : 0) | (this.f2807C & -6145);
        if (z2) {
            i = 4096;
        }
        this.f2807C = i2 | i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3879b(RecyclerView recyclerView, C0794d0 d0Var, int i, int i2) {
        ArrayList<C0674o> arrayList = this.f2809E;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C0674o) this.f2809E.get(size)).mo3990b(recyclerView, d0Var, i, i2);
            }
        }
    }

    /* renamed from: c */
    public C0813p mo3884c() {
        return new C0657e(-2, -2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00cb  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3889d(android.view.View r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.f2807C
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0009
            return r8
        L_0x0009:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r9 == r3) goto L_0x001d
            if (r9 != r4) goto L_0x0016
            goto L_0x001d
        L_0x0016:
            androidx.leanback.widget.a r1 = r7.f2843t
            android.view.View r0 = r0.findNextFocus(r1, r8, r9)
            goto L_0x0054
        L_0x001d:
            boolean r5 = r7.mo3882b()
            if (r5 == 0) goto L_0x0030
            if (r9 != r3) goto L_0x0028
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x002a
        L_0x0028:
            r1 = 33
        L_0x002a:
            androidx.leanback.widget.a r5 = r7.f2843t
            android.view.View r1 = r0.findNextFocus(r5, r8, r1)
        L_0x0030:
            boolean r5 = r7.mo3862a()
            if (r5 == 0) goto L_0x0053
            int r1 = r7.mo4746k()
            if (r1 != r4) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r9 != r3) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x004a
            r1 = 66
            goto L_0x004c
        L_0x004a:
            r1 = 17
        L_0x004c:
            androidx.leanback.widget.a r5 = r7.f2843t
            android.view.View r0 = r0.findNextFocus(r5, r8, r1)
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            if (r0 == 0) goto L_0x0057
            return r0
        L_0x0057:
            androidx.leanback.widget.a r1 = r7.f2843t
            int r1 = r1.getDescendantFocusability()
            r5 = 393216(0x60000, float:5.51013E-40)
            if (r1 != r5) goto L_0x006c
            androidx.leanback.widget.a r0 = r7.f2843t
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r8 = r0.focusSearch(r8, r9)
            return r8
        L_0x006c:
            int r1 = r7.m3364E(r9)
            androidx.leanback.widget.a r5 = r7.f2843t
            int r5 = r5.getScrollState()
            if (r5 == 0) goto L_0x007a
            r5 = 1
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r4) goto L_0x0097
            if (r5 != 0) goto L_0x0087
            int r1 = r7.f2807C
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L_0x0088
        L_0x0087:
            r0 = r8
        L_0x0088:
            int r1 = r7.f2807C
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r7.mo3830X()
            if (r1 != 0) goto L_0x00c8
            r7.m3384g(r4)
            goto L_0x00c7
        L_0x0097:
            if (r1 != 0) goto L_0x00b1
            if (r5 != 0) goto L_0x00a1
            int r1 = r7.f2807C
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = r8
        L_0x00a2:
            int r1 = r7.f2807C
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r7.mo3829W()
            if (r1 != 0) goto L_0x00c8
            r7.m3384g(r2)
            goto L_0x00c7
        L_0x00b1:
            r2 = 3
            if (r1 != r2) goto L_0x00bd
            if (r5 != 0) goto L_0x00c7
            int r1 = r7.f2807C
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x00c8
            goto L_0x00c7
        L_0x00bd:
            if (r1 != r3) goto L_0x00c8
            if (r5 != 0) goto L_0x00c7
            int r1 = r7.f2807C
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x00c8
        L_0x00c7:
            r0 = r8
        L_0x00c8:
            if (r0 == 0) goto L_0x00cb
            return r0
        L_0x00cb:
            androidx.leanback.widget.a r0 = r7.f2843t
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r9 = r0.focusSearch(r8, r9)
            if (r9 == 0) goto L_0x00d8
            return r9
        L_0x00d8:
            if (r8 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            androidx.leanback.widget.a r8 = r7.f2843t
        L_0x00dd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.mo3889d(android.view.View, int):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0168, code lost:
        if (r2 >= r6) goto L_0x016d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f8  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3895e(androidx.recyclerview.widget.RecyclerView.C0820v r13, androidx.recyclerview.widget.RecyclerView.C0788a0 r14) {
        /*
            r12 = this;
            int r0 = r12.f2828X
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r14.mo4531b()
            if (r0 >= 0) goto L_0x000c
            return
        L_0x000c:
            int r0 = r12.f2807C
            r0 = r0 & 64
            if (r0 == 0) goto L_0x001f
            int r0 = r12.mo4732e()
            if (r0 <= 0) goto L_0x001f
            int r13 = r12.f2807C
            r13 = r13 | 128(0x80, float:1.794E-43)
            r12.f2807C = r13
            return
        L_0x001f:
            int r0 = r12.f2807C
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 != 0) goto L_0x002c
            r12.m3388i0()
            r12.mo3876b(r13)
            return
        L_0x002c:
            r0 = r0 & -4
            r1 = 1
            r0 = r0 | r1
            r12.f2807C = r0
            r12.m3383f(r13, r14)
            boolean r13 = r14.mo4536g()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            if (r13 == 0) goto L_0x00d8
            r12.mo3892d0()
            int r13 = r12.mo4732e()
            androidx.leanback.widget.e r14 = r12.f2830Z
            if (r14 == 0) goto L_0x00ce
            if (r13 <= 0) goto L_0x00ce
            r14 = 2147483647(0x7fffffff, float:NaN)
            androidx.leanback.widget.a r1 = r12.f2843t
            android.view.View r3 = r12.mo4729d(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r1 = r1.mo4439g(r3)
            int r1 = r1.getOldPosition()
            androidx.leanback.widget.a r3 = r12.f2843t
            int r4 = r13 + -1
            android.view.View r4 = r12.mo4729d(r4)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = r3.mo4439g(r4)
            int r3 = r3.getOldPosition()
        L_0x006c:
            if (r2 >= r13) goto L_0x00c3
            android.view.View r4 = r12.mo4729d(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.leanback.widget.f$e r5 = (androidx.leanback.widget.C0652f.C0657e) r5
            androidx.leanback.widget.a r6 = r12.f2843t
            int r6 = r6.mo4430e(r4)
            boolean r7 = r5.mo4773c()
            if (r7 != 0) goto L_0x00b0
            boolean r7 = r5.mo4774d()
            if (r7 != 0) goto L_0x00b0
            boolean r7 = r4.isLayoutRequested()
            if (r7 != 0) goto L_0x00b0
            boolean r7 = r4.hasFocus()
            if (r7 != 0) goto L_0x009e
            int r7 = r12.f2811G
            int r8 = r5.mo4771a()
            if (r7 == r8) goto L_0x00b0
        L_0x009e:
            boolean r7 = r4.hasFocus()
            if (r7 == 0) goto L_0x00ac
            int r7 = r12.f2811G
            int r5 = r5.mo4771a()
            if (r7 != r5) goto L_0x00b0
        L_0x00ac:
            if (r6 < r1) goto L_0x00b0
            if (r6 <= r3) goto L_0x00c0
        L_0x00b0:
            int r5 = r12.mo3923v(r4)
            int r14 = java.lang.Math.min(r14, r5)
            int r4 = r12.mo3921u(r4)
            int r0 = java.lang.Math.max(r0, r4)
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x006c
        L_0x00c3:
            if (r0 <= r14) goto L_0x00c8
            int r0 = r0 - r14
            r12.f2848y = r0
        L_0x00c8:
            r12.m3387h0()
            r12.m3396q0()
        L_0x00ce:
            int r13 = r12.f2807C
            r13 = r13 & -4
            r12.f2807C = r13
            r12.m3394o0()
            return
        L_0x00d8:
            boolean r13 = r14.mo4537h()
            if (r13 == 0) goto L_0x00e1
            r12.mo3897e0()
        L_0x00e1:
            boolean r13 = r12.mo4764y()
            if (r13 != 0) goto L_0x00ec
            int r13 = r12.f2831a0
            if (r13 != 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r1 = 0
        L_0x00ed:
            int r13 = r12.f2811G
            r3 = -1
            if (r13 == r3) goto L_0x00fb
            int r4 = r12.f2815K
            if (r4 == r0) goto L_0x00fb
            int r13 = r13 + r4
            r12.f2811G = r13
            r12.f2812H = r2
        L_0x00fb:
            r12.f2815K = r2
            int r13 = r12.f2811G
            android.view.View r13 = r12.mo4337c(r13)
            int r0 = r12.f2811G
            int r4 = r12.f2812H
            androidx.leanback.widget.a r5 = r12.f2843t
            boolean r5 = r5.hasFocus()
            androidx.leanback.widget.e r6 = r12.f2830Z
            if (r6 == 0) goto L_0x0116
            int r6 = r6.mo3780b()
            goto L_0x0117
        L_0x0116:
            r6 = -1
        L_0x0117:
            androidx.leanback.widget.e r7 = r12.f2830Z
            if (r7 == 0) goto L_0x0120
            int r7 = r7.mo3789d()
            goto L_0x0121
        L_0x0120:
            r7 = -1
        L_0x0121:
            int r8 = r12.f2844u
            if (r8 != 0) goto L_0x012e
            int r8 = r14.mo4532c()
            int r9 = r14.mo4533d()
            goto L_0x0136
        L_0x012e:
            int r9 = r14.mo4532c()
            int r8 = r14.mo4533d()
        L_0x0136:
            boolean r10 = r12.m3393n0()
            r11 = 16
            if (r10 == 0) goto L_0x014f
            int r2 = r12.f2807C
            r2 = r2 | 4
            r12.f2807C = r2
            androidx.leanback.widget.e r2 = r12.f2830Z
            int r3 = r12.f2811G
            r2.mo3800j(r3)
            r12.m3389j0()
            goto L_0x0181
        L_0x014f:
            int r10 = r12.f2807C
            r10 = r10 & -5
            r12.f2807C = r10
            int r10 = r12.f2807C
            r10 = r10 & -17
            if (r5 == 0) goto L_0x015d
            r2 = 16
        L_0x015d:
            r2 = r2 | r10
            r12.f2807C = r2
            if (r1 == 0) goto L_0x016d
            if (r6 < 0) goto L_0x016a
            int r2 = r12.f2811G
            if (r2 > r7) goto L_0x016a
            if (r2 >= r6) goto L_0x016d
        L_0x016a:
            int r6 = r12.f2811G
            r7 = r6
        L_0x016d:
            androidx.leanback.widget.e r2 = r12.f2830Z
            r2.mo3800j(r6)
            if (r7 == r3) goto L_0x0181
        L_0x0174:
            boolean r2 = r12.m3385g0()
            if (r2 == 0) goto L_0x0181
            android.view.View r2 = r12.mo4337c(r7)
            if (r2 != 0) goto L_0x0181
            goto L_0x0174
        L_0x0181:
            r12.mo3900f0()
            androidx.leanback.widget.e r2 = r12.f2830Z
            int r2 = r2.mo3780b()
            androidx.leanback.widget.e r3 = r12.f2830Z
            int r3 = r3.mo3789d()
            int r6 = -r8
            int r7 = -r9
            r12.m3378a(r5, r1, r6, r7)
            r12.m3387h0()
            r12.m3396q0()
            androidx.leanback.widget.e r6 = r12.f2830Z
            int r6 = r6.mo3780b()
            if (r6 != r2) goto L_0x0181
            androidx.leanback.widget.e r2 = r12.f2830Z
            int r2 = r2.mo3789d()
            if (r2 != r3) goto L_0x0181
            r12.m3398s0()
            r12.m3397r0()
            boolean r14 = r14.mo4537h()
            if (r14 == 0) goto L_0x01ba
            r12.mo3814H()
        L_0x01ba:
            int r14 = r12.f2807C
            r1 = r14 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x01c5
            r14 = r14 & -1025(0xfffffffffffffbff, float:NaN)
            r12.f2807C = r14
            goto L_0x01c8
        L_0x01c5:
            r12.m3400u0()
        L_0x01c8:
            int r14 = r12.f2807C
            r14 = r14 & 4
            if (r14 == 0) goto L_0x01e6
            int r14 = r12.f2811G
            if (r14 != r0) goto L_0x01e2
            int r0 = r12.f2812H
            if (r0 != r4) goto L_0x01e2
            android.view.View r14 = r12.mo4337c(r14)
            if (r14 != r13) goto L_0x01e2
            int r13 = r12.f2807C
            r13 = r13 & 8
            if (r13 == 0) goto L_0x01e6
        L_0x01e2:
            r12.mo3812F()
            goto L_0x01ef
        L_0x01e6:
            int r13 = r12.f2807C
            r13 = r13 & 20
            if (r13 != r11) goto L_0x01ef
            r12.mo3812F()
        L_0x01ef:
            r12.mo3813G()
            int r13 = r12.f2807C
            r13 = r13 & 64
            if (r13 == 0) goto L_0x01ff
            int r13 = r12.mo3822P()
            r12.m3371I(r13)
        L_0x01ff:
            int r13 = r12.f2807C
            r13 = r13 & -4
            r12.f2807C = r13
            r12.m3394o0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.mo3895e(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: i */
    public void mo3903i(int i) {
        mo3874b(i, 0, false, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final int mo3917s(View view) {
        return ((C0657e) view.getLayoutParams()).mo3943b(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final int mo3919t(View view) {
        return ((C0657e) view.getLayoutParams()).mo3945c(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public int mo3921u(View view) {
        return this.f2845v.mo5110a(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public int mo3923v(View view) {
        return this.f2845v.mo5117d(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo3928x(View view) {
        int i;
        int i2;
        int i3;
        C0657e eVar = (C0657e) view.getLayoutParams();
        mo4695a(view, f2803l0);
        int i4 = eVar.leftMargin + eVar.rightMargin;
        Rect rect = f2803l0;
        int i5 = i4 + rect.left + rect.right;
        int i6 = eVar.topMargin + eVar.bottomMargin + rect.top + rect.bottom;
        if (this.f2819O == -2) {
            i = MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            i = MeasureSpec.makeMeasureSpec(this.f2820P, 1073741824);
        }
        if (this.f2844u == 0) {
            i2 = ViewGroup.getChildMeasureSpec(MeasureSpec.makeMeasureSpec(0, 0), i5, eVar.width);
            i3 = ViewGroup.getChildMeasureSpec(i, i6, eVar.height);
        } else {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(MeasureSpec.makeMeasureSpec(0, 0), i6, eVar.height);
            i2 = ViewGroup.getChildMeasureSpec(i, i5, eVar.width);
            i3 = childMeasureSpec;
        }
        view.measure(i2, i3);
    }

    /* renamed from: z */
    private int m3404z(View view) {
        if (view == null) {
            return -1;
        }
        C0657e eVar = (C0657e) view.getLayoutParams();
        if (eVar == null || eVar.mo4774d()) {
            return -1;
        }
        return eVar.mo4771a();
    }

    /* renamed from: a */
    public void mo3849a(C0673n nVar) {
        this.f2808D = nVar;
    }

    /* renamed from: c */
    public void mo3885c(RecyclerView recyclerView, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            this.f2837g0.mo4080a(i);
            i++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public int mo3915r(View view) {
        C0657e eVar = (C0657e) view.getLayoutParams();
        return mo4742h(view) + eVar.leftMargin + eVar.rightMargin;
    }

    /* renamed from: c */
    private boolean m3382c(RecyclerView recyclerView, int i, Rect rect) {
        int i2;
        int i3;
        int e = mo4732e();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = e;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = e - 1;
            i3 = -1;
        }
        int f = this.f2832b0.mo3734a().mo3755f();
        int b = this.f2832b0.mo3734a().mo3745b() + f;
        while (i2 != i4) {
            View d = mo4729d(i2);
            if (d.getVisibility() == 0 && mo3923v(d) >= f && mo3921u(d) <= b && d.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* renamed from: a */
    public void mo3850a(C0674o oVar) {
        if (oVar == null) {
            this.f2809E = null;
            return;
        }
        ArrayList<C0674o> arrayList = this.f2809E;
        if (arrayList == null) {
            this.f2809E = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        this.f2809E.add(oVar);
    }

    /* renamed from: b */
    public boolean mo3882b() {
        return this.f2844u == 1 || this.f2828X > 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public int mo3925w(View view) {
        mo3875b(view, f2803l0);
        return this.f2844u == 0 ? f2803l0.width() : f2803l0.height();
    }

    /* renamed from: b */
    public void mo3875b(View view, Rect rect) {
        super.mo3875b(view, rect);
        C0657e eVar = (C0657e) view.getLayoutParams();
        rect.left += eVar.f2855e;
        rect.top += eVar.f2856f;
        rect.right -= eVar.f2857g;
        rect.bottom -= eVar.f2858h;
    }

    /* renamed from: z */
    public Parcelable mo3930z() {
        C0660h hVar = new C0660h();
        hVar.f2867c = mo3821O();
        Bundle e = this.f2837g0.mo4090e();
        int e2 = mo4732e();
        for (int i = 0; i < e2; i++) {
            View d = mo4729d(i);
            int z = m3404z(d);
            if (z != -1) {
                e = this.f2837g0.mo4078a(e, d, z);
            }
        }
        hVar.f2866U = e;
        return hVar;
    }

    /* renamed from: G */
    private void m3369G(View view) {
        C0657e eVar = (C0657e) view.getLayoutParams();
        if (eVar.mo3951j() == null) {
            eVar.mo3939a(this.f2833c0.f2870c.mo3969a(view));
            eVar.mo3944b(this.f2833c0.f2869b.mo3969a(view));
            return;
        }
        eVar.mo3941a(this.f2844u, view);
        if (this.f2844u == 0) {
            eVar.mo3944b(this.f2833c0.f2869b.mo3969a(view));
        } else {
            eVar.mo3939a(this.f2833c0.f2870c.mo3969a(view));
        }
    }

    /* renamed from: f */
    public void mo3899f(boolean z) {
        int i = 0;
        if (((this.f2807C & DateUtils.FORMAT_NUMERIC_DATE) != 0) != z) {
            int i2 = this.f2807C & -131073;
            if (z) {
                i = DateUtils.FORMAT_NUMERIC_DATE;
            }
            this.f2807C = i2 | i;
            if ((this.f2807C & DateUtils.FORMAT_NUMERIC_DATE) != 0 && this.f2831a0 == 0) {
                int i3 = this.f2811G;
                if (i3 != -1) {
                    mo3842a(i3, this.f2812H, true, this.f2816L);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3859a(RecyclerView recyclerView, C0794d0 d0Var, int i, int i2) {
        ArrayList<C0674o> arrayList = this.f2809E;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C0674o) this.f2809E.get(size)).mo3989a(recyclerView, d0Var, i, i2);
            }
        }
    }

    /* renamed from: H */
    private void m3370H(int i) {
        int e = mo4732e();
        int i2 = 0;
        if (this.f2844u == 0) {
            while (i2 < e) {
                mo4729d(i2).offsetTopAndBottom(i);
                i2++;
            }
            return;
        }
        while (i2 < e) {
            mo4729d(i2).offsetLeftAndRight(i);
            i2++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3848a(C0672m mVar) {
        this.f2810F = mVar;
    }

    /* renamed from: b */
    public void mo3876b(C0820v vVar) {
        for (int e = mo4732e() - 1; e >= 0; e--) {
            mo4689a(e, vVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3834a(View view, View view2) {
        if (!(view == null || view2 == null)) {
            C0668j j = ((C0657e) view.getLayoutParams()).mo3951j();
            if (j != null) {
                C0669a[] a = j.mo3970a();
                if (a.length > 1) {
                    while (view2 != view) {
                        int id = view2.getId();
                        if (id != -1) {
                            for (int i = 1; i < a.length; i++) {
                                if (a[i].mo3971a() == id) {
                                    return i;
                                }
                            }
                            continue;
                        }
                        view2 = (View) view2.getParent();
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public int mo3870b(int i, C0820v vVar, C0788a0 a0Var) {
        int i2;
        if ((this.f2807C & DateUtils.FORMAT_NO_NOON) == 0 || !mo3831Y()) {
            return 0;
        }
        this.f2807C = (this.f2807C & -4) | 2;
        m3383f(vVar, a0Var);
        if (this.f2844u == 1) {
            i2 = m3371I(i);
        } else {
            i2 = m3372J(i);
        }
        m3394o0();
        this.f2807C &= -4;
        return i2;
    }

    /* renamed from: F */
    private int m3367F(View view) {
        C0657e eVar = (C0657e) view.getLayoutParams();
        return eVar.mo3946d(view) + eVar.mo3950i();
    }

    /* renamed from: G */
    private void m3368G(int i) {
        int e = mo4732e();
        int i2 = 0;
        if (this.f2844u == 1) {
            while (i2 < e) {
                mo4729d(i2).offsetTopAndBottom(i);
                i2++;
            }
            return;
        }
        while (i2 < e) {
            mo4729d(i2).offsetLeftAndRight(i);
            i2++;
        }
    }

    /* renamed from: F */
    private int m3366F(int i) {
        int i2 = this.f2820P;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.f2821Q;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* renamed from: a */
    public boolean mo3862a() {
        return this.f2844u == 0 || this.f2828X > 1;
    }

    /* renamed from: a */
    public C0813p mo3837a(Context context, AttributeSet attributeSet) {
        return new C0657e(context, attributeSet);
    }

    /* renamed from: b */
    public void mo3873b(int i, int i2, int i3) {
        mo3874b(i, i2, false, i3);
    }

    /* renamed from: a */
    public C0813p mo3838a(LayoutParams layoutParams) {
        if (layoutParams instanceof C0657e) {
            return new C0657e((C0657e) layoutParams);
        }
        if (layoutParams instanceof C0813p) {
            return new C0657e((C0813p) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0657e((MarginLayoutParams) layoutParams);
        }
        return new C0657e(layoutParams);
    }

    /* renamed from: b */
    public void mo3874b(int i, int i2, boolean z, int i3) {
        if ((this.f2811G != i && i != -1) || i2 != this.f2812H || i3 != this.f2816L) {
            mo3842a(i, i2, z, i3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo3888d(RecyclerView recyclerView, int i, int i2) {
        View c = mo4337c(this.f2811G);
        if (c == null) {
            return i2;
        }
        int indexOfChild = recyclerView.indexOfChild(c);
        if (i2 < indexOfChild) {
            return i2;
        }
        if (i2 < i - 1) {
            indexOfChild = ((indexOfChild + i) - 1) - i2;
        }
        return indexOfChild;
    }

    /* renamed from: b */
    public void mo3877b(C0825z zVar) {
        mo3887c0();
        super.mo3877b(zVar);
        if (!zVar.mo4848e() || !(zVar instanceof C0656d)) {
            this.f2813I = null;
            this.f2814J = null;
            return;
        }
        this.f2813I = (C0656d) zVar;
        C0656d dVar = this.f2813I;
        if (dVar instanceof C0659g) {
            this.f2814J = (C0659g) dVar;
        } else {
            this.f2814J = null;
        }
    }

    /* renamed from: d */
    public void mo3891d(boolean z) {
        int i = this.f2807C;
        int i2 = DateUtils.FORMAT_NO_NOON;
        if (((i & DateUtils.FORMAT_NO_NOON) != 0) != z) {
            int i3 = this.f2807C & -513;
            if (!z) {
                i2 = 0;
            }
            this.f2807C = i3 | i2;
            mo4685A();
        }
    }

    /* renamed from: a */
    private void m3374a(int i, int i2, int i3, int[] iArr) {
        View d = this.f2806B.mo4820d(i);
        if (d != null) {
            C0657e eVar = (C0657e) d.getLayoutParams();
            mo4695a(d, f2803l0);
            int i4 = eVar.leftMargin + eVar.rightMargin;
            Rect rect = f2803l0;
            d.measure(ViewGroup.getChildMeasureSpec(i2, mo4754o() + mo4756p() + i4 + rect.left + rect.right, eVar.width), ViewGroup.getChildMeasureSpec(i3, mo4757q() + mo4752n() + eVar.topMargin + eVar.bottomMargin + rect.top + rect.bottom, eVar.height));
            iArr[0] = mo3915r(d);
            iArr[1] = mo3913q(d);
            this.f2806B.mo4813b(d);
        }
    }

    /* renamed from: b */
    public void mo3878b(RecyclerView recyclerView, int i, int i2) {
        if (this.f2811G != -1) {
            C0649e eVar = this.f2830Z;
            if (eVar != null && eVar.mo3780b() >= 0) {
                int i3 = this.f2815K;
                if (i3 != Integer.MIN_VALUE) {
                    int i4 = this.f2811G;
                    int i5 = i4 + i3;
                    if (i <= i5) {
                        if (i + i2 > i5) {
                            this.f2815K = i3 + (i - i5);
                            this.f2811G = i4 + this.f2815K;
                            this.f2815K = Integer.MIN_VALUE;
                        } else {
                            this.f2815K = i3 - i2;
                        }
                    }
                }
            }
        }
        this.f2837g0.mo4083b();
    }

    /* renamed from: b */
    private boolean m3380b(View view, View view2, int[] iArr) {
        int A = m3359A(view);
        if (view2 != null) {
            A = m3373a(A, view, view2);
        }
        int B = m3360B(view);
        int i = A + this.f2816L;
        if (i == 0 && B == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = i;
        iArr[1] = B;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3853a(androidx.recyclerview.widget.RecyclerView.C0820v r7, androidx.recyclerview.widget.RecyclerView.C0788a0 r8, int r9, int r10) {
        /*
            r6 = this;
            r6.m3383f(r7, r8)
            int r7 = r6.f2844u
            if (r7 != 0) goto L_0x001c
            int r7 = android.view.View.MeasureSpec.getSize(r9)
            int r8 = android.view.View.MeasureSpec.getSize(r10)
            int r9 = android.view.View.MeasureSpec.getMode(r10)
            int r10 = r6.mo4757q()
            int r0 = r6.mo4752n()
            goto L_0x0030
        L_0x001c:
            int r8 = android.view.View.MeasureSpec.getSize(r9)
            int r7 = android.view.View.MeasureSpec.getSize(r10)
            int r9 = android.view.View.MeasureSpec.getMode(r9)
            int r10 = r6.mo4754o()
            int r0 = r6.mo4756p()
        L_0x0030:
            int r10 = r10 + r0
            r6.f2822R = r8
            int r0 = r6.f2819O
            r1 = -2
            java.lang.String r2 = "wrong spec"
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            if (r0 != r1) goto L_0x0088
            int r8 = r6.f2829Y
            if (r8 != 0) goto L_0x0044
            r8 = 1
        L_0x0044:
            r6.f2828X = r8
            r8 = 0
            r6.f2820P = r8
            int[] r8 = r6.f2821Q
            if (r8 == 0) goto L_0x0052
            int r8 = r8.length
            int r0 = r6.f2828X
            if (r8 == r0) goto L_0x0058
        L_0x0052:
            int r8 = r6.f2828X
            int[] r8 = new int[r8]
            r6.f2821Q = r8
        L_0x0058:
            androidx.recyclerview.widget.RecyclerView$a0 r8 = r6.f2846w
            boolean r8 = r8.mo4536g()
            if (r8 == 0) goto L_0x0063
            r6.mo3892d0()
        L_0x0063:
            r6.m3386h(r5)
            if (r9 == r4) goto L_0x007b
            if (r9 == 0) goto L_0x0076
            if (r9 != r3) goto L_0x0070
            int r8 = r6.f2822R
            goto L_0x00fb
        L_0x0070:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L_0x0076:
            int r8 = r6.m3391l0()
            goto L_0x00ae
        L_0x007b:
            int r8 = r6.m3391l0()
            int r8 = r8 + r10
            int r9 = r6.f2822R
            int r8 = java.lang.Math.min(r8, r9)
            goto L_0x00fb
        L_0x0088:
            if (r9 == r4) goto L_0x00b0
            if (r9 == 0) goto L_0x0095
            if (r9 != r3) goto L_0x008f
            goto L_0x00b0
        L_0x008f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L_0x0095:
            if (r0 != 0) goto L_0x0099
            int r0 = r8 - r10
        L_0x0099:
            r6.f2820P = r0
            int r8 = r6.f2829Y
            if (r8 != 0) goto L_0x00a0
            r8 = 1
        L_0x00a0:
            r6.f2828X = r8
            int r8 = r6.f2820P
            int r9 = r6.f2828X
            int r8 = r8 * r9
            int r0 = r6.f2826V
            int r9 = r9 - r5
            int r0 = r0 * r9
            int r8 = r8 + r0
        L_0x00ae:
            int r8 = r8 + r10
            goto L_0x00fb
        L_0x00b0:
            int r0 = r6.f2829Y
            if (r0 != 0) goto L_0x00bf
            int r0 = r6.f2819O
            if (r0 != 0) goto L_0x00bf
            r6.f2828X = r5
            int r0 = r8 - r10
            r6.f2820P = r0
            goto L_0x00e9
        L_0x00bf:
            int r0 = r6.f2829Y
            if (r0 != 0) goto L_0x00d0
            int r0 = r6.f2819O
            r6.f2820P = r0
            int r1 = r6.f2826V
            int r2 = r8 + r1
            int r0 = r0 + r1
            int r2 = r2 / r0
            r6.f2828X = r2
            goto L_0x00e9
        L_0x00d0:
            int r1 = r6.f2819O
            if (r1 != 0) goto L_0x00e5
            r6.f2828X = r0
            int r0 = r8 - r10
            int r1 = r6.f2826V
            int r2 = r6.f2828X
            int r3 = r2 + -1
            int r1 = r1 * r3
            int r0 = r0 - r1
            int r0 = r0 / r2
            r6.f2820P = r0
            goto L_0x00e9
        L_0x00e5:
            r6.f2828X = r0
            r6.f2820P = r1
        L_0x00e9:
            if (r9 != r4) goto L_0x00fb
            int r9 = r6.f2820P
            int r0 = r6.f2828X
            int r9 = r9 * r0
            int r1 = r6.f2826V
            int r0 = r0 - r5
            int r1 = r1 * r0
            int r9 = r9 + r1
            int r9 = r9 + r10
            if (r9 >= r8) goto L_0x00fb
            r8 = r9
        L_0x00fb:
            int r9 = r6.f2844u
            if (r9 != 0) goto L_0x0103
            r6.mo4723c(r7, r8)
            goto L_0x0106
        L_0x0103:
            r6.mo4723c(r8, r7)
        L_0x0106:
            r6.m3394o0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.mo3853a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3880b(boolean z) {
        this.f2807C = (z ? DateUtils.FORMAT_ABBREV_WEEKDAY : 0) | (this.f2807C & -32769);
    }

    /* renamed from: b */
    private boolean m3381b(RecyclerView recyclerView, int i, Rect rect) {
        View c = mo4337c(this.f2811G);
        if (c != null) {
            return c.requestFocus(i, rect);
        }
        return false;
    }

    /* renamed from: b */
    public int mo3871b(C0820v vVar, C0788a0 a0Var) {
        if (this.f2844u == 0) {
            C0649e eVar = this.f2830Z;
            if (eVar != null) {
                return eVar.mo3791e();
            }
        }
        return super.mo3871b(vVar, a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <E> E mo3839a(C0794d0 d0Var, Class<? extends E> cls) {
        E a = d0Var instanceof C0646b ? ((C0646b) d0Var).mo3768a(cls) : null;
        if (a != null) {
            return a;
        }
        C0647c cVar = this.f2838h0;
        if (cVar == null) {
            return a;
        }
        C0646b a2 = cVar.mo3769a(d0Var.getItemViewType());
        return a2 != null ? a2.mo3768a(cls) : a;
    }

    /* renamed from: e */
    public void mo3894e(int i, int i2) {
        mo3874b(i, 0, false, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3843a(int i, View view, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f2844u == 0) {
            i5 = mo3913q(view);
        } else {
            i5 = mo3915r(view);
        }
        int i8 = this.f2820P;
        if (i8 > 0) {
            i5 = Math.min(i5, i8);
        }
        int i9 = this.f2827W;
        int i10 = i9 & 112;
        int absoluteGravity = (this.f2807C & 786432) != 0 ? Gravity.getAbsoluteGravity(i9 & 8388615, 1) : i9 & 7;
        if (!((this.f2844u == 0 && i10 == 48) || (this.f2844u == 1 && absoluteGravity == 3))) {
            if ((this.f2844u == 0 && i10 == 80) || (this.f2844u == 1 && absoluteGravity == 5)) {
                i7 = m3366F(i) - i5;
            } else if ((this.f2844u == 0 && i10 == 16) || (this.f2844u == 1 && absoluteGravity == 1)) {
                i7 = (m3366F(i) - i5) / 2;
            }
            i4 += i7;
        }
        if (this.f2844u == 0) {
            int i11 = i3;
            i3 = i4 + i5;
            i6 = i11;
        } else {
            i6 = i4 + i5;
            int i12 = i4;
            i4 = i2;
            i2 = i12;
        }
        C0657e eVar = (C0657e) view.getLayoutParams();
        mo4693a(view, i2, i4, i6, i3);
        super.mo3875b(view, f2803l0);
        Rect rect = f2803l0;
        eVar.mo3940a(i2 - rect.left, i4 - rect.top, rect.right - i6, rect.bottom - i3);
        m3369G(view);
    }

    /* renamed from: e */
    public void mo3896e(boolean z) {
        int i = this.f2807C;
        int i2 = DateUtils.FORMAT_ABBREV_MONTH;
        if (((i & DateUtils.FORMAT_ABBREV_MONTH) != 0) != z) {
            int i3 = this.f2807C & -65537;
            if (!z) {
                i2 = 0;
            }
            this.f2807C = i3 | i2;
            if (z) {
                mo4685A();
            }
        }
    }

    /* renamed from: a */
    private void m3378a(boolean z, boolean z2, int i, int i2) {
        View view;
        View c = mo4337c(this.f2811G);
        if (c != null && z2) {
            mo3847a(c, false, i, i2);
        }
        if (c != null && z && !c.hasFocus()) {
            c.requestFocus();
        } else if (!z && !this.f2843t.hasFocus()) {
            if (c == null || !c.hasFocusable()) {
                int e = mo4732e();
                view = c;
                int i3 = 0;
                while (true) {
                    if (i3 >= e) {
                        break;
                    }
                    view = mo4729d(i3);
                    if (view != null && view.hasFocusable()) {
                        this.f2843t.focusableViewAvailable(view);
                        break;
                    }
                    i3++;
                }
            } else {
                this.f2843t.focusableViewAvailable(c);
                view = c;
            }
            if (z2 && view != null && view.hasFocus()) {
                mo3847a(view, false, i, i2);
            }
        }
    }

    /* renamed from: a */
    public int mo3833a(int i, C0820v vVar, C0788a0 a0Var) {
        int i2;
        if ((this.f2807C & DateUtils.FORMAT_NO_NOON) == 0 || !mo3831Y()) {
            return 0;
        }
        m3383f(vVar, a0Var);
        this.f2807C = (this.f2807C & -4) | 2;
        if (this.f2844u == 0) {
            i2 = m3371I(i);
        } else {
            i2 = m3372J(i);
        }
        m3394o0();
        this.f2807C &= -4;
        return i2;
    }

    /* renamed from: a */
    public void mo3841a(int i, int i2, C0788a0 a0Var, C0811c cVar) {
        try {
            m3383f(null, a0Var);
            if (this.f2844u != 0) {
                i = i2;
            }
            if (mo4732e() != 0) {
                if (i != 0) {
                    this.f2830Z.mo3773a(i < 0 ? -this.f2835e0 : this.f2834d0 + this.f2835e0, i, cVar);
                    m3394o0();
                }
            }
        } finally {
            m3394o0();
        }
    }

    /* renamed from: a */
    public void mo3844a(int i, C0811c cVar) {
        int i2 = this.f2843t.f2774L1;
        if (i != 0 && i2 != 0) {
            int max = Math.max(0, Math.min(this.f2811G - ((i2 - 1) / 2), i - i2));
            int i3 = max;
            while (i3 < i && i3 < max + i2) {
                cVar.mo4770a(i3, 0);
                i3++;
            }
        }
    }

    /* renamed from: a */
    public void mo3858a(RecyclerView recyclerView, C0788a0 a0Var, int i) {
        mo3874b(i, 0, true, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3842a(int i, int i2, boolean z, int i3) {
        this.f2816L = i3;
        View c = mo4337c(i);
        boolean z2 = !mo4764y();
        if (!z2 || this.f2843t.isLayoutRequested() || c == null || m3404z(c) != i) {
            int i4 = this.f2807C;
            if ((i4 & DateUtils.FORMAT_NO_NOON) == 0 || (i4 & 64) != 0) {
                this.f2811G = i;
                this.f2812H = i2;
                this.f2815K = Integer.MIN_VALUE;
            } else if (!z || this.f2843t.isLayoutRequested()) {
                if (!z2) {
                    mo3887c0();
                    this.f2843t.mo4526y();
                }
                if (this.f2843t.isLayoutRequested() || c == null || m3404z(c) != i) {
                    this.f2811G = i;
                    this.f2812H = i2;
                    this.f2815K = Integer.MIN_VALUE;
                    this.f2807C |= 256;
                    mo4685A();
                } else {
                    this.f2807C |= 32;
                    mo3846a(c, z);
                    this.f2807C &= -33;
                }
            } else {
                this.f2811G = i;
                this.f2812H = i2;
                this.f2815K = Integer.MIN_VALUE;
                if (!mo3831Y()) {
                    Log.w(mo3824R(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                int C = mo3810C(i);
                if (C != this.f2811G) {
                    this.f2811G = C;
                    this.f2812H = 0;
                }
            }
        } else {
            this.f2807C |= 32;
            mo3846a(c, z);
            this.f2807C &= -33;
        }
    }

    /* renamed from: a */
    public void mo3856a(RecyclerView recyclerView, int i, int i2) {
        if (this.f2811G != -1) {
            C0649e eVar = this.f2830Z;
            if (eVar != null && eVar.mo3780b() >= 0) {
                int i3 = this.f2815K;
                if (i3 != Integer.MIN_VALUE && i <= this.f2811G + i3) {
                    this.f2815K = i3 + i2;
                }
            }
        }
        this.f2837g0.mo4083b();
    }

    /* renamed from: a */
    public void mo3857a(RecyclerView recyclerView, int i, int i2, int i3) {
        int i4 = this.f2811G;
        if (i4 != -1) {
            int i5 = this.f2815K;
            if (i5 != Integer.MIN_VALUE) {
                int i6 = i4 + i5;
                if (i <= i6 && i6 < i + i3) {
                    this.f2815K = i5 + (i2 - i);
                } else if (i < i6 && i2 > i6 - i3) {
                    this.f2815K -= i3;
                } else if (i > i6 && i2 < i6) {
                    this.f2815K += i3;
                }
            }
        }
        this.f2837g0.mo4083b();
    }

    /* renamed from: a */
    public boolean mo3867a(RecyclerView recyclerView, View view, View view2) {
        if ((this.f2807C & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0 && m3404z(view) != -1 && (this.f2807C & 35) == 0) {
            m3376a(view, view2, true);
        }
        return true;
    }

    /* renamed from: a */
    private int m3373a(int i, View view, View view2) {
        int a = mo3834a(view, view2);
        if (a == 0) {
            return i;
        }
        C0657e eVar = (C0657e) view.getLayoutParams();
        return i + (eVar.mo3948g()[a] - eVar.mo3948g()[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3846a(View view, boolean z) {
        m3376a(view, view == null ? null : view.findFocus(), z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3847a(View view, boolean z, int i, int i2) {
        m3377a(view, view == null ? null : view.findFocus(), z, i, i2);
    }

    /* renamed from: a */
    private void m3376a(View view, View view2, boolean z) {
        m3377a(view, view2, z, 0, 0);
    }

    /* renamed from: a */
    private void m3377a(View view, View view2, boolean z, int i, int i2) {
        if ((this.f2807C & 64) == 0) {
            int z2 = m3404z(view);
            int a = mo3834a(view, view2);
            if (!(z2 == this.f2811G && a == this.f2812H)) {
                this.f2811G = z2;
                this.f2812H = a;
                this.f2815K = 0;
                if ((this.f2807C & 3) != 1) {
                    mo3812F();
                }
                if (this.f2843t.mo3728z()) {
                    this.f2843t.invalidate();
                }
            }
            if (view != null) {
                if (!view.hasFocus() && this.f2843t.hasFocus()) {
                    view.requestFocus();
                }
                if ((this.f2807C & DateUtils.FORMAT_NUMERIC_DATE) != 0 || !z) {
                    if (!(!mo3863a(view, view2, f2804m0) && i == 0 && i2 == 0)) {
                        int[] iArr = f2804m0;
                        m3375a(iArr[0] + i, iArr[1] + i2, z);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3863a(View view, View view2, int[] iArr) {
        int i = this.f2831a0;
        if (i == 1 || i == 2) {
            return m3379a(view, iArr);
        }
        return m3380b(view, view2, iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009f, code lost:
        if (r2 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3379a(android.view.View r13, int[] r14) {
        /*
            r12 = this;
            int r0 = r12.m3404z(r13)
            int r1 = r12.mo3923v(r13)
            int r2 = r12.mo3921u(r13)
            androidx.leanback.widget.a0 r3 = r12.f2832b0
            androidx.leanback.widget.a0$a r3 = r3.mo3734a()
            int r3 = r3.mo3755f()
            androidx.leanback.widget.a0 r4 = r12.f2832b0
            androidx.leanback.widget.a0$a r4 = r4.mo3734a()
            int r4 = r4.mo3745b()
            androidx.leanback.widget.e r5 = r12.f2830Z
            int r5 = r5.mo3792e(r0)
            r6 = 1
            r7 = 0
            r8 = 2
            r9 = 0
            if (r1 >= r3) goto L_0x006f
            int r1 = r12.f2831a0
            if (r1 != r8) goto L_0x006c
            r1 = r13
        L_0x0031:
            boolean r10 = r12.m3395p0()
            if (r10 == 0) goto L_0x0069
            androidx.leanback.widget.e r1 = r12.f2830Z
            int r10 = r1.mo3780b()
            e.e.d[] r1 = r1.mo3779a(r10, r0)
            r1 = r1[r5]
            int r10 = r1.mo14054b(r7)
            android.view.View r10 = r12.mo4337c(r10)
            int r11 = r12.mo3923v(r10)
            int r11 = r2 - r11
            if (r11 <= r4) goto L_0x0067
            int r0 = r1.mo14056d()
            if (r0 <= r8) goto L_0x0064
            int r0 = r1.mo14054b(r8)
            android.view.View r0 = r12.mo4337c(r0)
            r2 = r9
            r9 = r0
            goto L_0x00a5
        L_0x0064:
            r2 = r9
            r9 = r10
            goto L_0x00a5
        L_0x0067:
            r1 = r10
            goto L_0x0031
        L_0x0069:
            r2 = r9
            r9 = r1
            goto L_0x00a5
        L_0x006c:
            r2 = r9
        L_0x006d:
            r9 = r13
            goto L_0x00a5
        L_0x006f:
            int r10 = r4 + r3
            if (r2 <= r10) goto L_0x00a4
            int r2 = r12.f2831a0
            if (r2 != r8) goto L_0x00a2
        L_0x0077:
            androidx.leanback.widget.e r2 = r12.f2830Z
            int r8 = r2.mo3789d()
            e.e.d[] r2 = r2.mo3779a(r0, r8)
            r2 = r2[r5]
            int r8 = r2.mo14056d()
            int r8 = r8 - r6
            int r2 = r2.mo14054b(r8)
            android.view.View r2 = r12.mo4337c(r2)
            int r8 = r12.mo3921u(r2)
            int r8 = r8 - r1
            if (r8 <= r4) goto L_0x0099
            r2 = r9
            goto L_0x009f
        L_0x0099:
            boolean r8 = r12.m3385g0()
            if (r8 != 0) goto L_0x0077
        L_0x009f:
            if (r2 == 0) goto L_0x006d
            goto L_0x00a5
        L_0x00a2:
            r2 = r13
            goto L_0x00a5
        L_0x00a4:
            r2 = r9
        L_0x00a5:
            if (r9 == 0) goto L_0x00ad
            int r0 = r12.mo3923v(r9)
        L_0x00ab:
            int r0 = r0 - r3
            goto L_0x00b6
        L_0x00ad:
            if (r2 == 0) goto L_0x00b5
            int r0 = r12.mo3921u(r2)
            int r3 = r3 + r4
            goto L_0x00ab
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            if (r9 == 0) goto L_0x00ba
            r13 = r9
            goto L_0x00bd
        L_0x00ba:
            if (r2 == 0) goto L_0x00bd
            r13 = r2
        L_0x00bd:
            int r13 = r12.m3360B(r13)
            if (r0 != 0) goto L_0x00c7
            if (r13 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            return r7
        L_0x00c7:
            r14[r7] = r0
            r14[r6] = r13
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.m3379a(android.view.View, int[]):boolean");
    }

    /* renamed from: a */
    private void m3375a(int i, int i2, boolean z) {
        if ((this.f2807C & 3) == 1) {
            m3371I(i);
            m3372J(i2);
            return;
        }
        if (this.f2844u != 0) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        if (z) {
            this.f2843t.mo4467i(i, i2);
            return;
        }
        this.f2843t.scrollBy(i, i2);
        mo3813G();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3860a(boolean z, int i, Rect rect) {
        if (z) {
            int i2 = this.f2811G;
            while (true) {
                View c = mo4337c(i2);
                if (c != null) {
                    if (c.getVisibility() != 0 || !c.hasFocusable()) {
                        i2++;
                    } else {
                        c.requestFocus();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo3868a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
        View view;
        ArrayList<View> arrayList2 = arrayList;
        int i3 = i;
        int i4 = i2;
        if ((this.f2807C & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0) {
            return true;
        }
        if (!recyclerView.hasFocus()) {
            int size = arrayList.size();
            if (this.f2831a0 != 0) {
                int f = this.f2832b0.mo3734a().mo3755f();
                int b = this.f2832b0.mo3734a().mo3745b() + f;
                int e = mo4732e();
                for (int i5 = 0; i5 < e; i5++) {
                    View d = mo4729d(i5);
                    if (d.getVisibility() == 0 && mo3923v(d) >= f && mo3921u(d) <= b) {
                        d.addFocusables(arrayList2, i3, i4);
                    }
                }
                if (arrayList.size() == size) {
                    int e2 = mo4732e();
                    for (int i6 = 0; i6 < e2; i6++) {
                        View d2 = mo4729d(i6);
                        if (d2.getVisibility() == 0) {
                            d2.addFocusables(arrayList2, i3, i4);
                        }
                    }
                }
            } else {
                View c = mo4337c(this.f2811G);
                if (c != null) {
                    c.addFocusables(arrayList2, i3, i4);
                }
            }
            if (arrayList.size() == size && recyclerView.isFocusable()) {
                arrayList2.add(recyclerView);
            }
        } else if (this.f2814J != null) {
            return true;
        } else {
            int E = m3364E(i3);
            int y = m3403y(recyclerView.findFocus());
            int D = m3362D(y);
            if (D == -1) {
                view = null;
            } else {
                view = mo4337c(D);
            }
            if (view != null) {
                view.addFocusables(arrayList2, i3, i4);
            }
            if (this.f2830Z == null || mo4732e() == 0) {
                return true;
            }
            if ((E == 3 || E == 2) && this.f2830Z.mo3791e() <= 1) {
                return true;
            }
            C0649e eVar = this.f2830Z;
            int i7 = (eVar == null || view == null) ? -1 : eVar.mo3790d(D).f2802a;
            int size2 = arrayList.size();
            int i8 = (E == 1 || E == 3) ? 1 : -1;
            int e3 = i8 > 0 ? mo4732e() - 1 : 0;
            int i9 = y == -1 ? i8 > 0 ? 0 : mo4732e() - 1 : y + i8;
            int i10 = i9;
            while (true) {
                if (i8 <= 0) {
                    if (i10 < e3) {
                        break;
                    }
                } else if (i10 > e3) {
                    break;
                }
                View d3 = mo4729d(i10);
                if (d3.getVisibility() == 0 && d3.hasFocusable()) {
                    if (view == null) {
                        d3.addFocusables(arrayList2, i3, i4);
                        if (arrayList.size() > size2) {
                            break;
                        }
                    } else {
                        int D2 = m3362D(i10);
                        C0650a d4 = this.f2830Z.mo3790d(D2);
                        if (d4 != null) {
                            if (E == 1) {
                                if (d4.f2802a == i7 && D2 > D) {
                                    d3.addFocusables(arrayList2, i3, i4);
                                    if (arrayList.size() > size2) {
                                        break;
                                    }
                                }
                            } else if (E == 0) {
                                if (d4.f2802a == i7 && D2 < D) {
                                    d3.addFocusables(arrayList2, i3, i4);
                                    if (arrayList.size() > size2) {
                                        break;
                                    }
                                }
                            } else if (E == 3) {
                                int i11 = d4.f2802a;
                                if (i11 != i7) {
                                    if (i11 < i7) {
                                        break;
                                    }
                                    d3.addFocusables(arrayList2, i3, i4);
                                }
                            } else if (E == 2) {
                                int i12 = d4.f2802a;
                                if (i12 == i7) {
                                    continue;
                                } else if (i12 > i7) {
                                    break;
                                } else {
                                    d3.addFocusables(arrayList2, i3, i4);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i10 += i8;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3865a(RecyclerView recyclerView, int i, Rect rect) {
        int i2 = this.f2831a0;
        if (i2 == 1 || i2 == 2) {
            return m3382c(recyclerView, i, rect);
        }
        return m3381b(recyclerView, i, rect);
    }

    /* renamed from: a */
    public void mo3852a(C0797g gVar, C0797g gVar2) {
        if (gVar != null) {
            m3388i0();
            this.f2811G = -1;
            this.f2815K = 0;
            this.f2837g0.mo4083b();
        }
        if (gVar2 instanceof C0647c) {
            this.f2838h0 = (C0647c) gVar2;
        } else {
            this.f2838h0 = null;
        }
        super.mo3852a(gVar, gVar2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3851a(C0794d0 d0Var) {
        int adapterPosition = d0Var.getAdapterPosition();
        if (adapterPosition != -1) {
            this.f2837g0.mo4085b(d0Var.itemView, adapterPosition);
        }
    }

    /* renamed from: a */
    public void mo3845a(Parcelable parcelable) {
        if (parcelable instanceof C0660h) {
            C0660h hVar = (C0660h) parcelable;
            this.f2811G = hVar.f2867c;
            this.f2815K = 0;
            this.f2837g0.mo4081a(hVar.f2866U);
            this.f2807C |= 256;
            mo4685A();
        }
    }

    /* renamed from: a */
    public int mo3835a(C0820v vVar, C0788a0 a0Var) {
        if (this.f2844u == 1) {
            C0649e eVar = this.f2830Z;
            if (eVar != null) {
                return eVar.mo3791e();
            }
        }
        return super.mo3835a(vVar, a0Var);
    }

    /* renamed from: a */
    public void mo3854a(C0820v vVar, C0788a0 a0Var, View view, C4154d dVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (this.f2830Z != null && (layoutParams instanceof C0657e)) {
            int a = ((C0657e) layoutParams).mo4771a();
            int e = a >= 0 ? this.f2830Z.mo3792e(a) : -1;
            if (e >= 0) {
                int e2 = a / this.f2830Z.mo3791e();
                if (this.f2844u == 0) {
                    dVar.mo14748b((Object) C4157c.m14287a(e, 1, e2, 1, false, false));
                } else {
                    dVar.mo14748b((Object) C4157c.m14287a(e2, 1, e, 1, false, false));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r5 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r7 == p096e.p121h.p135s.p136i0.C4154d.C4155a.f10459g.mo14792a()) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3864a(androidx.recyclerview.widget.RecyclerView.C0820v r5, androidx.recyclerview.widget.RecyclerView.C0788a0 r6, int r7, android.os.Bundle r8) {
        /*
            r4 = this;
            boolean r8 = r4.mo3869a0()
            r0 = 1
            if (r8 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r4.m3383f(r5, r6)
            int r5 = r4.f2807C
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            r6 = 0
            if (r5 == 0) goto L_0x0015
            r5 = 1
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r8 < r1) goto L_0x0051
            int r8 = r4.f2844u
            if (r8 != 0) goto L_0x003f
            e.h.s.i0.d$a r8 = p096e.p121h.p135s.p136i0.C4154d.C4155a.f10458f
            int r8 = r8.mo14792a()
            if (r7 != r8) goto L_0x0034
            if (r5 == 0) goto L_0x0031
        L_0x002e:
            r7 = 4096(0x1000, float:5.74E-42)
            goto L_0x0051
        L_0x0031:
            r7 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0051
        L_0x0034:
            e.h.s.i0.d$a r8 = p096e.p121h.p135s.p136i0.C4154d.C4155a.f10460h
            int r8 = r8.mo14792a()
            if (r7 != r8) goto L_0x0051
            if (r5 == 0) goto L_0x002e
            goto L_0x0031
        L_0x003f:
            e.h.s.i0.d$a r5 = p096e.p121h.p135s.p136i0.C4154d.C4155a.f10457e
            int r5 = r5.mo14792a()
            if (r7 != r5) goto L_0x0048
            goto L_0x0031
        L_0x0048:
            e.h.s.i0.d$a r5 = p096e.p121h.p135s.p136i0.C4154d.C4155a.f10459g
            int r5 = r5.mo14792a()
            if (r7 != r5) goto L_0x0051
            goto L_0x002e
        L_0x0051:
            if (r7 == r3) goto L_0x005e
            if (r7 == r2) goto L_0x0056
            goto L_0x0064
        L_0x0056:
            r4.m3384g(r6)
            r5 = -1
            r4.mo3836a(r6, r5)
            goto L_0x0064
        L_0x005e:
            r4.m3384g(r0)
            r4.mo3836a(r6, r0)
        L_0x0064:
            r4.m3394o0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0652f.mo3864a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3836a(boolean z, int i) {
        C0649e eVar = this.f2830Z;
        if (eVar == null) {
            return i;
        }
        int i2 = this.f2811G;
        int e = i2 != -1 ? eVar.mo3792e(i2) : -1;
        View view = null;
        int e2 = mo4732e();
        int i3 = e;
        int i4 = i;
        int i5 = 0;
        while (i5 < e2 && i4 != 0) {
            int i6 = i4 > 0 ? i5 : (e2 - 1) - i5;
            View d = mo4729d(i6);
            if (mo3912p(d)) {
                int D = m3362D(i6);
                int e3 = this.f2830Z.mo3792e(D);
                if (i3 == -1) {
                    i2 = D;
                    view = d;
                    i3 = e3;
                } else if (e3 == i3 && ((i4 > 0 && D > i2) || (i4 < 0 && D < i2))) {
                    i4 = i4 > 0 ? i4 - 1 : i4 + 1;
                    i2 = D;
                    view = d;
                }
            }
            i5++;
        }
        if (view != null) {
            if (z) {
                if (mo4761u()) {
                    this.f2807C |= 32;
                    view.requestFocus();
                    this.f2807C &= -33;
                }
                this.f2811G = i2;
                this.f2812H = 0;
            } else {
                mo3846a(view, true);
            }
        }
        return i4;
    }

    /* renamed from: a */
    public void mo3855a(C0820v vVar, C0788a0 a0Var, C4154d dVar) {
        m3383f(vVar, a0Var);
        int b = a0Var.mo4531b();
        boolean z = (this.f2807C & DateUtils.FORMAT_ABBREV_RELATIVE) != 0;
        if (b > 1 && !mo3907l(0)) {
            if (VERSION.SDK_INT < 23) {
                dVar.mo14734a((int) ContentServiceClientExtras.URL_SIZE_LIMIT);
            } else if (this.f2844u == 0) {
                dVar.mo14738a(z ? C4155a.f10460h : C4155a.f10458f);
            } else {
                dVar.mo14738a(C4155a.f10457e);
            }
            dVar.mo14774j(true);
        }
        if (b > 1 && !mo3907l(b - 1)) {
            if (VERSION.SDK_INT < 23) {
                dVar.mo14734a(4096);
            } else if (this.f2844u == 0) {
                dVar.mo14738a(z ? C4155a.f10458f : C4155a.f10460h);
            } else {
                dVar.mo14738a(C4155a.f10459g);
            }
            dVar.mo14774j(true);
        }
        dVar.mo14741a((Object) C4156b.m14286a(mo3871b(vVar, a0Var), mo3835a(vVar, a0Var), mo4731d(vVar, a0Var), mo4721c(vVar, a0Var)));
        m3394o0();
    }
}
